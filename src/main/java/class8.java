import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class8 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Le;")
    public static class191 field71 = class54.method368("Hierhin gehen", 2047);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Le;")
    public static class191 field73 = class54.method368(")2", 2047);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lwe;")
    public static class147 field76 = new class147(30);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Le;")
    public static class191 field78 = class54.method368("(Y<)4col>", 2047);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Le;")
    private static class191 field81 = class54.method368("Select", 2047);

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Le;")
    public static class191 field80 = field81;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "F")
    public static float field79;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lng;")
    public static class121 field77;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[Le;")
    public static class191[] field83;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method59(int arg0) {
        field80 = null;
        field83 = null;
        field71 = null;
        field77 = null;
        field73 = null;
        if (arg0 < -55) {
            field76 = null;
            field81 = null;
            field78 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lcj;")
    public static final class257 method60(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 == null || var3.field3556 == null ? null : var3.field3556;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
    public static final void method61(int arg0, int arg1) {
        field70++;
        class241 var2 = class14.method97(4, arg0, -121);
        int var3 = -103 / ((24 - arg1) / 47);
        var2.method1691(0);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)Lub;")
    public static final class9 method62(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3541;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLng;)V")
    public static final void method63(byte arg0, class121 arg1) {
        class193.field3464 = class121.method827((byte) -121, class141.field2361, arg1);
        class99.field1583 = new int[256];
        field75++;
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class27.field393[var2] & 0xFF0000) >> 16);
            int var5 = (class27.field393[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class27.field393[var2] & 0xFF00) >> 8);
            int var8 = (class27.field393[var2 + 1] & 0xFF00) >> 8;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class27.field393[var2] & 0xFF);
            int var11 = class27.field393[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class99.field1583[var2 * 64 + var13] = class217.method1476((int) var10, class217.method1476((int) var4 << 16, (int) var7 << 8));
                var4 += var6;
                var7 += var9;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class99.field1583[var3] = class27.field393[3];
        }
        if (arg0 > -115) {
            method65((byte) 41, (class121) null);
        }
        class46.field818 = new int[32768];
        class86.field1413 = new int[32768];
        class176.method1186((class60) null, (byte) -115);
        class257.field4561 = new int[32768];
        class76.field1294 = new int[32768];
        class38.field687 = new class155(128, 254);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLji;)V")
    public static final void method64(byte arg0, class225 arg1) {
        field72++;
        if (arg0 <= 45) {
            field78 = null;
        }
        byte[] var2 = new byte[24];
        if (class51.field923 != null) {
            try {
                int var3 = 0;
                class51.field923.method1132(0L, (byte) 115);
                class51.field923.method1129(119, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1566(var2, 3, 24, 0);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(BLng;)V")
    public static final void method65(byte arg0, class121 arg1) {
        if (arg0 != -29) {
            field78 = null;
        }
        field74++;
        class63.field1119 = arg1;
        class256.field4534 = class63.field1119.method805((byte) 86, 16);
    }
}
