import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class14 extends class279 {

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Leh;")
    public static class94 field190 = new class94(512);

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Z")
    public static boolean field199 = false;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Ltl;")
    public static class59 field200 = class85.method639("k", 9588);

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "Lem;")
    public static class248 field196;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "Lma;")
    public static class263 field202;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 6)
    public class14() {
        this(0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)I", line = 20)
    public static final int method93(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -94;
        } else {
            field186++;
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)Lgg;", line = 34)
    public static final class47 method94(boolean arg0) {
        field184++;
        if (!arg0) {
            field196 = (class248) null;
        }
        byte[] var1 = class53.field794[0];
        int var2 = class41.field615[0] * class236.field3925[0];
        class47 var5;
        if (class190.field3184[0]) {
            int[] var6 = new int[var2];
            byte[] var7 = class132.field2193[0];
            for (int var8 = 0; var8 < var2; var8++) {
                var6[var8] = class239.method1677(class93.method680(var7[var8], 255) << 24, class284.field4879[class93.method680(255, var1[var8])]);
            }
            var5 = new class217(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], var6);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class284.field4879[class93.method680(var1[var4], 255)];
            }
            var5 = new class47(class300.field5123, class165.field2680, class243.field4061[0], class311.field5274[0], class41.field615[0], class236.field3925[0], var3);
        }
        class133.method974((byte) -116);
        return var5;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V", line = 82)
    private final void method95(int arg0, int arg1) {
        field194++;
        this.field193 = arg1 >> 12 & 0xFF0;
        this.field189 = arg1 >> 4 & 0xFF0;
        this.field191 = (arg1 & 0xFF) << 4;
        if (arg0 != -3882) {
            method93(-78, false, -106);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIB)V", line = 95)
    public static final void method96(int arg0, int arg1, byte arg2) {
        field187++;
        if (arg2 != -95) {
            method98(-94, false, -120, -66, -11, -54, -84, -22);
        }
        class123 var3 = class139.method1013(arg1, -5829);
        int var4 = var3.field2031;
        int var5 = var3.field2037;
        int var6 = var3.field2034;
        int var7 = class288.field4951[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class7.method55(var4, class308.field5244[var4] & ~var8 | var8 & arg0 << var5, (byte) -120);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 127)
    public static final void method97(int arg0, int arg1, int arg2, int arg3) {
        if (class228.field3686 != 0 && arg2 != 0 && class140.field2310 < 50 && arg1 != -1) {
            class216.field3530[class140.field2310] = arg1;
            class219.field3568[class140.field2310] = arg2;
            class232.field3817[class140.field2310] = arg0;
            class239.field3992[class140.field2310] = null;
            class34.field503[class140.field2310] = 0;
            class140.field2310++;
        }
        if (arg3 == -27648) {
            field195++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)[[I", line = 149)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            field200 = (class59) null;
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        field192++;
        if (this.field4786.field3297) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class56.field835; var7++) {
                var4[var7] = this.field193;
                var5[var7] = this.field189;
                var6[var7] = this.field191;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILs;)V", line = 187)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field185++;
        if (arg0 >= -125) {
            field202 = (class263) null;
        }
        if (arg1 == 0) {
            this.method95(-3882, arg2.method1208((byte) -87));
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIIIII)V", line = 213)
    public static final void method98(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field197++;
        if (arg1) {
            method99((byte) -8);
        }
        if (arg6 < 1 || arg2 < 1 || arg6 > 102 || arg2 > 102) {
            return;
        }
        if (!class125.method922((byte) 73) && (class308.field5219[0][arg6][arg2] & 0x2) == 0) {
            int var8 = arg0;
            if ((class308.field5219[arg0][arg6][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class291.field4986 != var8) {
                return;
            }
        }
        int var9 = arg0;
        if (arg0 < 3 && (class308.field5219[1][arg6][arg2] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        class163.method1159(var9, 123, arg6, arg2, arg5, class41.field612[arg0], arg0);
        if (arg4 >= 0) {
            boolean var10 = class198.field3288;
            class198.field3288 = true;
            class85.method635(class41.field612[arg0], arg7, arg3, arg2, arg6, (byte) 58, arg4, arg0, false, false, var9);
            class198.field3288 = var10;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 267)
    public static void method99(byte arg0) {
        field200 = null;
        field196 = null;
        field190 = null;
        int var1 = -108 / ((41 - arg0) / 56);
        field202 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V", line = 286)
    private class14(int arg0) {
        super(0, false);
        this.method95(-3882, arg0);
    }
}
