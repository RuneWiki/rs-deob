import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class198 extends class71 {

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "Z")
    public static boolean field3536 = true;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Lud;")
    public static class279 field3539 = class130.method1024(",Mcran)2titre charg-B", 255);

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[Llj;")
    public static class50[] field3540;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 8)
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V", line = 13)
    public static final void method1471(int arg0) {
        field3543++;
        int var1 = class292.field5210.method411(class90.field1697);
        for (int var2 = 0; var2 < class194.field3488; var2++) {
            int var3 = class292.field5210.method411(class24.method213(var2, true));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class100.field1876 - (var1 / 2);
        if ((var4 + var1) > class221.field3899) {
            var4 = class221.field3899 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class194.field3488 * 15 + 21;
        int var6 = class200.field3573;
        if (class176.field3150 < var5 + var6) {
            var6 = class176.field3150 - var5;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (~class121.field2172 == arg0) {
            if (class132.field2412 == class100.field1876 && class200.field3573 == class163.field2941) {
                class324.field5660 = var6;
                class7.field149 = var1;
                class3.field108 = (class152.field2766 ? 26 : 22) + class194.field3488 * 15;
                class238.field4184 = true;
                class121.field2172 = 0;
                class155.field2803 = var4;
            }
        } else if (class232.field4074 == class100.field1876 && class64.field1307 == class200.field3573) {
            class121.field2172 = 0;
            class7.field149 = var1;
            class3.field108 = class194.field3488 * 15 + (class152.field2766 ? 26 : 22);
            class155.field2803 = var4;
            class324.field5660 = var6;
            class238.field4184 = true;
        } else {
            class121.field2172 = 1;
            class132.field2412 = class232.field4074;
            class163.field2941 = class64.field1307;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V", line = 107)
    private final void method1472(int arg0, int arg1, byte arg2) {
        int var4 = class133.field2424[arg0];
        field3544++;
        int var5 = class200.field3574[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class143.field2598 = arg1;
            class45.field944 = arg0;
        } else if (-1.5707963267948966D >= (double) var6 && -2.356194490192345D <= (double) var6) {
            class143.field2598 = arg0;
            class45.field944 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && -1.5707963267948966D <= (double) var6) {
            class143.field2598 = arg0;
            class45.field944 = class215.field3787 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class45.field944 = arg0;
            class143.field2598 = class324.field5667 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class143.field2598 = class324.field5667 - arg1;
            class45.field944 = class215.field3787 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class45.field944 = class215.field3787 - arg1;
            class143.field2598 = class324.field5667 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class45.field944 = arg1;
            class143.field2598 = class324.field5667 - arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class143.field2598 = arg1;
            class45.field944 = class215.field3787 - arg0;
        }
        class143.field2598 &= class262.field4688;
        class45.field944 &= class309.field5478;
        if (arg2 != 43) {
            this.method199(65, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLvh;)V", line = 184)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field3537++;
        if (arg0 == 0) {
            this.field1389 = arg2.method483(-121) == 1;
        }
        if (!arg1) {
            this.method199(6, (byte) 22);
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)[Lbn;", line = 207)
    public static final class66[] method1473(int arg0) {
        field3545++;
        class66[] var1 = new class66[class244.field4329];
        if (arg0 != 255) {
            field3536 = false;
        }
        for (int var2 = 0; var2 < class244.field4329; var2++) {
            int var3 = class115.field2097[var2] * class1.field92[var2];
            byte[] var4 = class113.field2080[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class217.field3839[class52.method442(var4[var6], 255)];
            }
            var1[var2] = new class66(class86.field1646, class111.field2045, class44.field915[var2], class216.field3811[var2], class1.field92[var2], class115.field2097[var2], var5);
        }
        class162.method1278(false);
        return var1;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V", line = 254)
    public static void method1474(byte arg0) {
        if (arg0 < -16) {
            field3540 = null;
            field3539 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I", line = 269)
    public final int[][] method86(int arg0, int arg1) {
        int[][] var3 = this.field1400.method1746((byte) -91, arg0);
        if (this.field1400.field4363) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class215.field3787; var7++) {
                this.method1472(var7, arg0, (byte) 43);
                int[][] var8 = this.method619(0, 2, class143.field2598);
                var5[var7] = var8[0][class45.field944];
                var4[var7] = var8[1][class45.field944];
                var6[var7] = var8[2][class45.field944];
            }
        }
        int var9 = 84 / ((arg1 + 70) / 54);
        field3542++;
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)[I", line = 320)
    public final int[] method199(int arg0, byte arg1) {
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            for (int var4 = 0; var4 < class215.field3787; var4++) {
                this.method1472(var4, arg0, (byte) 43);
                int[] var5 = this.method624(class143.field2598, -3, 0);
                var3[var4] = var5[class45.field944];
            }
        }
        field3538++;
        return arg1 >= -69 ? (int[]) null : var3;
    }
}
