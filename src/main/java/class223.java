import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class223 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    public static int[] field3437 = new int[3];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field3439 = 0;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static volatile int field3441 = -1;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3440 = "yellow:";

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lpn;")
    public static class358 field3448 = new class358(0, 0);

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lmi;")
    public static class227 field3454 = new class227(64);

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "F")
    public static float field3447;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field3452;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Lah;")
    public static class176 field3436;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lqh;")
    public static class35 field3449;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[[[I")
    public static int[][][] field3444;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 4)
    public static void method1521(int arg0) {
        field3436 = null;
        field3449 = null;
        if (arg0 != 0) {
            field3447 = -0.08548796F;
        }
        field3444 = (int[][][]) null;
        field3437 = null;
        field3448 = null;
        field3440 = null;
        field3454 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 21)
    public static final void method1522(int arg0, int arg1) {
        class58.field885 = null;
        class259.field4104 = arg0;
        class294.field4893 = false;
        class4.field56 = 0;
        field3442++;
        class196.field3016 = -1;
        class56.field863 = -1;
        class77.field1147 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V", line = 49)
    public static final void method1523(int arg0, boolean arg1) {
        field3446++;
        byte[][] var2;
        byte var3;
        if (class245.field3886 && arg1) {
            var2 = class23.field352;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class202.field3107;
        }
        if (arg0 < 80) {
            field3439 = -26;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var2[var5];
            int var8 = class150.field2404[var5] >> 8;
            int var9 = class150.field2404[var5] & 0xFF;
            int var10 = var9 * 64 - class150.field2420;
            int var11 = var8 * 64 - class215.field3313;
            if (var7 != null) {
                class190.method1316(-127);
                var6 = class23.method205(class124.field1860, var10, class150.field2420, var11, class215.field3313, 102, arg1, var7);
            }
            if (!arg1 && class50.field749 / 8 == var8 && class328.field5362 / 8 == var9) {
                if (var6 == null) {
                    class238.field3763 = -1;
                } else {
                    class238.field3763 = var6[0];
                    class51.field762 = var6[4];
                    class13.field171 = var6[1];
                    class198.field3041 = var6[2];
                    class70.field1080 = var6[3];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class150.field2404[var12] >> 8) * 64 - class215.field3313;
            int var14 = (class150.field2404[var12] & 0xFF) * 64 - class150.field2420;
            byte[] var15 = var2[var12];
            if (var15 == null && class328.field5362 < 800) {
                class190.method1316(-128);
                for (int var16 = 0; var16 < var3; var16++) {
                    class52.method377(var13, 64, 64, true, var14, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lnm;Z)V", line = 142)
    public static final void method1524(class221 arg0, boolean arg1) {
        class76.field1145 = arg0;
        field3453++;
        class71.field1098 = class76.field1145.method1486(4, -27734);
        if (!arg1) {
            field3448 = (class358) null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ZILnm;)Lho;", line = 174)
    public static final class68 method1525(String arg0, boolean arg1, int arg2, class221 arg3) {
        field3443++;
        int var4 = arg3.method1510(arg0, 0);
        if (arg2 == var4) {
            return new class68(0);
        }
        int[] var5 = arg3.method1515((byte) -62, var4);
        class68 var6 = new class68(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field1060 > var7) {
                class313 var9 = new class313(arg3.method1504(var5[var8++], true, var4));
                int var10 = var9.method2231((byte) -128);
                int var11 = var9.method2250(-1613178296);
                int var12 = var9.method2224(-124);
                if (!arg1 && var12 == 1) {
                    var6.field1060--;
                } else {
                    var6.field1055[var7] = var10;
                    var6.field1052[var7] = new class148();
                    var6.field1052[var7].field2378 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }
}
