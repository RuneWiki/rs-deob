import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 extends class70 {

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field986 = 0;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Llc;")
    public static class69 field984 = class69.method470((byte) -122, "huffman");

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lfe;")
    public static class36 field985 = new class36(64);

    @OriginalMember(owner = "client!he", name = "M", descriptor = "[I")
    public static int[] field987 = new int[256];

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Llc;")
    public static class69 field988 = class69.method470((byte) -118, "Bad session id)3");

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Llc;")
    public static class69 field989 = class69.method470((byte) -123, "@cr1@");

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "Llc;")
    public static class69 field990 = class69.method470((byte) -114, "To extend or cancel a subscription:*6n1(Y Logout and return to the frontpage of this website)3*6n2(YChoose the relevant option from the (Wmembership(W section)3*6n*6nNote: If you are a credit card subscriber a top)2up payment will*6nautomatically be taken when 3 days credit remain)3*6n(Xunless you cancel your subscription)1 which can be done at any time)3(Y");

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "Lcb;")
    public static class15 field981;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "Lfb;")
    public static class33 field982;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Llc;")
    public class69 field980;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method311(int arg0) {
        field990 = null;
        field985 = null;
        field984 = null;
        field989 = null;
        field988 = null;
        if (arg0 < 7) {
            method311(-32);
        }
        field982 = null;
        field987 = null;
        field981 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILib;)V")
    public static final void method312(int arg0, int arg1, class50 arg2) {
        if (arg2.field1058 < 128 || arg2.field1065 < 128 || arg2.field1058 >= 13184 || arg2.field1065 >= 13184) {
            arg2.field1070 = -1;
            arg2.field1085 = 0;
            arg2.field1075 = 0;
            arg2.field1043 = -1;
            arg2.field1058 = arg2.field1041[0] * 128 + arg2.field1042 * 64;
            arg2.field1065 = arg2.field1097[0] * 128 + arg2.field1042 * 64;
            arg2.method328((byte) -85);
        }
        field983++;
        if (class46.field974 == arg2 && (arg2.field1058 < 1536 || arg2.field1065 < 1536 || arg2.field1058 >= 11776 || arg2.field1065 >= 11776)) {
            arg2.field1043 = -1;
            arg2.field1075 = 0;
            arg2.field1070 = -1;
            arg2.field1085 = 0;
            arg2.field1058 = arg2.field1041[0] * 128 + arg2.field1042 * 64;
            arg2.field1065 = arg2.field1097[0] * 128 + arg2.field1042 * 64;
            arg2.method328((byte) -63);
        }
        if (arg2.field1075 > class62.field1282) {
            class43.method253(arg2, true);
        } else if (class62.field1282 <= arg2.field1085) {
            class36.method218(arg2, 1536);
        } else {
            class17.method97(0, arg2);
        }
        class90.method636(arg2, 2047);
        class10.method58(arg2, (byte) -117);
        if (arg0 != -19512) {
            field990 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljc;ILjc;I)V")
    public static final void method313(class57 arg0, int arg1, class57 arg2, int arg3) throws IOException {
        byte[] var4 = arg0.method355(arg1, (byte) -82);
        field977++;
        if (arg3 > -99 || var4 == null) {
            return;
        }
        int var5 = 0;
        byte[] var6 = new byte[1000];
        int var7 = var4.length - 2;
        GZIPInputStream var8 = new GZIPInputStream(new ByteArrayInputStream(var4));
        while (true) {
            int var9 = var8.read(var6, 0, var6.length);
            if (var9 == -1) {
                byte[] var10 = new byte[var4.length + 9];
                class48.method316(var4, 0, var10, 9, var4.length);
                class94 var11 = new class94(var10);
                var11.method675((byte) -26, 2);
                var11.method704(var7, (byte) 118);
                var11.method704(var5, (byte) 123);
                var11.field2061 = var10.length - 2;
                int var13 = var11.method665(8666);
                var11.field2061 = var10.length - 2;
                Object var14 = null;
                var11.method686(16711680, var13 - 1);
                arg2.method358(arg1, (byte) 25, var10, var10.length);
                return;
            }
            var5 += var9;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIBI)V")
    public static final void method314(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field979++;
        if (!class13.field264) {
            arg5 = 0;
        }
        if (class125.field2694 == arg1 && class90.field1955 == arg3 && class103.field2228 == arg5) {
            return;
        }
        class90.field1955 = arg3;
        class103.field2228 = arg5;
        class125.field2694 = arg1;
        class89.method626(25, (byte) 112);
        class72.method512(false, class50.field1092, null, true);
        int var6 = class60.field1234;
        int var7 = class33.field648;
        class33.field648 = arg1 * 8 - 48;
        class60.field1234 = arg3 * 8 - 48;
        int var8 = class33.field648 - var7;
        int var9 = class33.field648;
        int var10 = class60.field1234 - var6;
        int var11 = class60.field1234;
        for (int var12 = 0; var12 < 16384; var12++) {
            class72 var28 = class112.field2434[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1041[var29] -= var8;
                    var28.field1097[var29] -= var10;
                }
                var28.field1058 -= var8 * 128;
                var28.field1065 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class60 var26 = class123.field2682[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1041[var27] -= var8;
                    var26.field1097[var27] -= var10;
                }
                var26.field1065 -= var10 * 128;
                var26.field1058 -= var8 * 128;
            }
        }
        class71.field1588 = arg5;
        byte var14 = 104;
        byte var15 = 0;
        class46.field974.method335(false, true, arg0, arg2);
        byte var16 = 1;
        byte var17 = 104;
        byte var18 = 0;
        if (arg4 != -46) {
            field985 = null;
        }
        byte var19 = 1;
        if (var10 < 0) {
            var18 = 103;
            var19 = -1;
            var17 = -1;
        }
        if (var8 < 0) {
            var15 = 103;
            var16 = -1;
            var14 = -1;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var18; var22 != var17; var22 += var19) {
                int var23 = var20 + var8;
                int var24 = var10 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class92.field2014[var25][var20][var22] = class92.field2014[var25][var23][var24];
                    } else {
                        class92.field2014[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class13 var21 = (class13) class75.field1689.method580((byte) -115); var21 != null; var21 = (class13) class75.field1689.method576((byte) 124)) {
            var21.field242 -= var8;
            var21.field250 -= var10;
            if (var21.field242 < 0 || var21.field250 < 0 || var21.field242 >= 104 || var21.field250 >= 104) {
                var21.method502(0);
            }
        }
        class114.field2475 = false;
        class51.field1126 = -1;
        if (class101.field2196 != 0) {
            class10.field215 -= var10;
            class101.field2196 -= var8;
        }
        class68.field1484.method571((byte) -62);
        class16.field289.method571((byte) -62);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
    public static final void method315(int arg0) {
        class74.field1649.method220((byte) -121);
        class70.field1559.method220((byte) -123);
        field978++;
        if (arg0 != 103) {
            field981 = null;
        }
    }
}
