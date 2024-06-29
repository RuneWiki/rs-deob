import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class560 extends class629 {

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "Lbg;")
    private class464 field7853 = new class464();

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    private int field7861 = 0;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    private int field7858 = 256;

    @OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
    private int field7868 = 256;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    private int field7851;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "Lgda;")
    public static class53 field7865 = new class53(12, 8);

    @OriginalMember(owner = "client!tv", name = "J", descriptor = "Lqfa;")
    public static class98 field7871 = new class98(102, 6);

    @OriginalMember(owner = "client!tv", name = "M", descriptor = "Lgda;")
    public static class53 field7874 = new class53(16, 1);

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    private int field7864;

    @OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!tv", name = "I", descriptor = "Z")
    private boolean field7870;

    @OriginalMember(owner = "client!tv", name = "K", descriptor = "Z")
    private boolean field7872;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V", line = 3)
    public final void method3222(int arg0, int arg1) {
        this.field7858 = arg1;
        field7862++;
        this.field7868 = arg1;
        if (arg0 != 0) {
            this.method3222(22, -36);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 18)
    public final synchronized void method1401(int arg0) {
        field7863++;
        if (this.field7872) {
            return;
        }
        while (true) {
            class713 var2 = this.method3230((byte) -120);
            if (var2 == null) {
                if (this.field7870) {
                    this.method1185(-42);
                    class150.field2130.method3606(63);
                }
                return;
            }
            if ((var2.field9912[0].length - this.field7864) > arg0) {
                this.field7864 += arg0;
                return;
            }
            arg0 -= var2.field9912[0].length - this.field7864;
            this.method3227(13964);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILnea;)V", line = 61)
    public final synchronized void method3223(int arg0, class713 arg1) {
        if (arg0 != -101) {
            this.field7853 = null;
        }
        field7869++;
        while (this.field7861 >= 100) {
            this.field7853.method2762((byte) -16);
            this.field7861--;
        }
        this.field7853.method2770((byte) -13, arg1);
        this.field7861++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "([III)V", line = 80)
    public final synchronized void method1378(int[] arg0, int arg1, int arg2) {
        field7855++;
        if (this.field7872) {
            return;
        }
        if (this.method3230((byte) -119) != null) {
            int var4 = arg1 + arg2;
            if (class673.field9127) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field7851 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class713 var7 = this.method3230((byte) -118);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field9912;
                while (arg1 < var4 && this.field7864 < var8[0].length) {
                    if (class673.field9127) {
                        arg0[arg1++] = var8[var5][this.field7864] * this.field7868;
                        arg0[arg1++] = var8[var6][this.field7864] * this.field7858;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field7864] * this.field7868 + var8[var6][this.field7864] * this.field7858;
                    }
                    this.field7864++;
                }
                if (var8[0].length <= this.field7864) {
                    this.method3227(13964);
                }
            }
        } else if (this.field7870) {
            this.method1185(-91);
            class150.field2130.method3606(63);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)D", line = 149)
    public final synchronized double method3224(int arg0) {
        field7866++;
        if (this.field7861 < 1) {
            return -1.0D;
        }
        class713 var2 = (class713) this.field7853.method2765(-12261);
        if (var2 == null) {
            return -1.0D;
        } else {
            if (arg0 != 0) {
                this.field7870 = true;
            }
            return var2.field9909 - (double) ((float) var2.field9912[0].length / (float) class68.field831);
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(I)V", line = 321)
    public class560(int arg0) {
        this.field7851 = arg0;
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)I", line = 172)
    public final synchronized int method3225(byte arg0) {
        if (arg0 == 98) {
            field7852++;
            return this.field7861;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V", line = 185)
    public static void method3226(int arg0) {
        field7871 = null;
        field7865 = null;
        if (arg0 == -28855) {
            field7874 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V", line = 201)
    private final synchronized void method3227(int arg0) {
        field7859++;
        class713 var2 = this.method3230((byte) -110);
        if (var2 == null) {
            return;
        }
        var2.method1185(-45);
        this.field7861--;
        this.field7864 = 0;
        class150.field2130.method3611(var2, (byte) 36, var2.method4012((byte) -6));
        if (arg0 != 13964) {
            this.method3228(15, (byte) -94, -0.4526220619112119D);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBD)Lnea;", line = 220)
    public final class713 method3228(int arg0, byte arg1, double arg2) {
        field7860++;
        long var5 = (long) (arg0 | this.field7851 << 0);
        class713 var7 = (class713) class150.field2130.method3612(-115, var5);
        if (var7 == null) {
            var7 = new class713(new short[this.field7851][arg0], arg2);
        } else {
            var7.field9909 = arg2;
            class150.field2130.method3609(var5, (byte) 127);
        }
        if (arg1 != 26) {
            this.method3224(45);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BZ)V", line = 251)
    public final synchronized void method3229(byte arg0, boolean arg1) {
        field7849++;
        this.field7872 = arg1;
        if (arg0 != -123) {
            this.method3223(-33, null);
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "()Lpda;", line = 262)
    public final class629 method1361() {
        field7856++;
        return null;
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)Lnea;", line = 272)
    private final synchronized class713 method3230(byte arg0) {
        if (arg0 >= -97) {
            return null;
        } else {
            field7854++;
            return (class713) this.field7853.method2765(-12261);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "()Lpda;", line = 287)
    public final class629 method1400() {
        field7867++;
        return null;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "()I", line = 298)
    public final int method1382() {
        field7850++;
        return 1;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V", line = 312)
    public final synchronized void method3231(boolean arg0) {
        field7857++;
        this.field7870 = arg0;
    }
}
