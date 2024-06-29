import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class178 {

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    private int field4 = -32768;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Z")
    public boolean field10 = false;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    private int field17 = -1;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    private int field20;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lpi;")
    private class141 field13;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6 = "";

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field8 = 0;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "D")
    public static double field18 = -1.0D;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lbj;")
    private class157 field3;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "[Lak;")
    public static class140[] field16;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        field19++;
        class22 var13 = this.method9(-1);
        if (var13 != null) {
            var13.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3);
            this.field4 = var13.method3();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()I")
    public final int method3() {
        field7++;
        return this.field4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field11++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)I")
    public static final int method5(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg0;
        int var5 = arg0 - 1 & arg3;
        field2++;
        int var6 = arg1 / arg0;
        int var7 = arg1 & arg0 - 1;
        int var8 = 71 % ((arg2 - 16) / 52);
        int var9 = class168.method1236(true, var6, var4);
        int var10 = class168.method1236(true, var6, var4 + 1);
        int var11 = class168.method1236(true, var6 + 1, var4);
        int var12 = class168.method1236(true, var6 + 1, var4 + 1);
        int var13 = class216.method1555(var9, var5, (byte) -113, var10, arg0);
        int var14 = class216.method1555(var11, var5, (byte) -98, var12, arg0);
        return class216.method1555(var13, var7, (byte) -96, var14, arg0);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static void method6(int arg0) {
        field6 = null;
        if (arg0 != 0) {
            method7(94, 112L);
        }
        field16 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method7(int arg0, long arg1) {
        field24++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class193.field3111[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILlc;)Lmk;")
    public static final class105 method8(int arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            method8(-90, -45, (class86) null);
        }
        field9++;
        byte[] var3 = arg2.method645(-93, arg0);
        return var3 == null ? null : new class105(var3);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lpc;")
    private final class22 method9(int arg0) {
        class55 var2 = class187.method1387((byte) 121, this.field20);
        if (arg0 != -1) {
            this.method9(-59);
        }
        field5++;
        class22 var3;
        if (this.field10) {
            var3 = var2.method412(-1, 0, -16861, -1);
        } else {
            var3 = var2.method412(this.field22, this.field1, -16861, this.field17);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
    public final void method10(byte arg0, int arg1) {
        field25++;
        if (this.field10) {
            return;
        }
        this.field1 += arg1;
        while (this.field1 > this.field13.field2263[this.field22]) {
            this.field1 -= this.field13.field2263[this.field22];
            this.field22++;
            if (this.field22 >= this.field13.field2252.length) {
                this.field10 = true;
                break;
            }
        }
        int var3 = 68 / ((-arg0 - 55) / 57);
        if (!this.field10) {
            class263.method1845(this.field22, this.field27, false, this.field23, (byte) -108, this.field13);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIII)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field27 = arg3;
        this.field20 = arg0;
        this.field26 = arg6 + arg5;
        this.field23 = arg2;
        this.field12 = arg1;
        this.field14 = arg4;
        int var8 = class187.method1387((byte) 21, this.field20).field794;
        if (var8 == -1) {
            this.field10 = true;
        } else {
            this.field10 = false;
            this.field13 = class285.method1939(var8, 112);
        }
        if (this.field26 == arg6) {
            class263.method1845(this.field22, this.field27, false, this.field23, (byte) -47, this.field13);
        }
    }
}
