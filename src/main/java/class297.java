import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class297 extends class60 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Z")
    public boolean field4762;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lud;")
    public class297[] field4765;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4777 = new String[100];

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lok;")
    public static class160 field4775 = new class160(64);

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Luj;")
    public class151 field4767;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lga;")
    public class21 field4760;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I", line = 5)
    public int[][] method172(int arg0, byte arg1) {
        field4758++;
        if (arg1 == 63) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 17)
    public static void method2103(int arg0) {
        field4775 = null;
        if (arg0 != 2) {
            field4777 = (String[]) null;
        }
        field4777 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 29)
    public void method779(int arg0) {
        if (arg0 != -1) {
            this.field4762 = true;
        }
        field4761++;
        if (this.field4762) {
            this.field4760.method213((byte) 104);
            this.field4760 = null;
        } else {
            this.field4767.method1142(arg0 + 1);
            this.field4767 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 54)
    public void method247(byte arg0) {
        if (arg0 != 68) {
            field4775 = (class160) null;
        }
        field4766++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 65)
    public static final void method2104(int arg0) {
        field4772++;
        if (arg0 != 65408) {
            method2107(false, -53);
        }
        class332.field5182.method2283((byte) 77);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I", line = 78)
    public int method783(int arg0) {
        field4764++;
        return arg0 < 11 ? 5 : -1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILaj;)V", line = 95)
    public void method169(int arg0, int arg1, class1 arg2) {
        field4769++;
        if (arg1 != 255) {
            this.method2109(-70, (byte) -96, -116);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)[[I", line = 115)
    public final int[][] method2105(int arg0, int arg1, int arg2) {
        field4763++;
        if (arg1 != 2) {
            return (int[][]) ((int[][]) null);
        } else if (this.field4765[arg2].field4762) {
            int[] var4 = this.field4765[arg2].method173(arg0, true);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4765[arg2].method172(arg0, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V", line = 155)
    public final void method2106(byte arg0, int arg1, int arg2) {
        field4771++;
        int var4 = 21 / ((arg0 + 52) / 42);
        int var5 = this.field4774 == 255 ? arg2 : this.field4774;
        if (this.field4762) {
            this.field4760 = new class21(var5, arg2, arg1);
        } else {
            this.field4767 = new class151(var5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I", line = 183)
    public int method915(int arg0) {
        field4776++;
        if (arg0 != 0) {
            this.field4774 = 123;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)[I", line = 194)
    public int[] method173(int arg0, boolean arg1) {
        field4770++;
        if (arg1) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V", line = 206)
    public static final void method2107(boolean arg0, int arg1) {
        field4759++;
        if (class161.field2609 == arg0) {
            return;
        }
        class161.field2609 = arg0;
        class30.method276((byte) -123);
        if (arg1 >= -94) {
            field4775 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IZ)V", line = 220)
    public class297(int arg0, boolean arg1) {
        this.field4762 = arg1;
        this.field4765 = new class297[arg0];
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BII)I", line = 235)
    public static final int method2108(byte arg0, int arg1, int arg2) {
        field4773++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            int var4 = -123 % ((13 - arg0) / 59);
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)[I", line = 280)
    public final int[] method2109(int arg0, byte arg1, int arg2) {
        field4768++;
        if (arg1 <= 18) {
            this.field4767 = (class151) null;
        }
        return this.field4765[arg2].field4762 ? this.field4765[arg2].method173(arg0, true) : this.field4765[arg2].method172(arg0, (byte) 63)[0];
    }
}
