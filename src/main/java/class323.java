import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class323 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public int field4384;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "[I")
    public static int[] field4380 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Lka;")
    public static class408 field4386 = new class408(64);

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
    public static int[] field4388 = new int[200];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lhc;")
    public static class368 field4387 = new class368("shake:", "", "", "");

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lhc;")
    public static class368 field4389 = new class368(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4390 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lij;")
    public static class316 field4391;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field4392;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Z", line = 10)
    public static final boolean method1966(byte arg0, int arg1) {
        field4379++;
        if (arg0 != 63) {
            method1966((byte) 83, -116);
        }
        if (arg1 == 49 || arg1 == 18 || arg1 == 10 || arg1 == 47 || arg1 == 4) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)Lqa;", line = 32)
    public static final class244 method1967(byte arg0, int arg1) {
        field4381++;
        if (arg0 <= 46) {
            method1968(114);
        }
        class244 var2 = (class244) class245.field3457.method2529(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1118.method1926(0, arg1, 31);
        class244 var4 = new class244();
        if (var3 != null) {
            var4.method1589(new class366(var3), 126, arg1);
        }
        class245.field3457.method2527(78, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 57)
    public static final void method1968(int arg0) {
        class88.field1232.field5048 = 0;
        field4383++;
        class75.field1068.field5048 = 0;
        class304.field4149 = -1;
        class451.field6496 = -1;
        class21.field272 = -1;
        class64.field884 = 0;
        class227.field3149 = -1;
        class369.field5116 = 0;
        class213.field2982 = 0;
        class302.method1835(0);
        class276.method1740(-12252);
        for (int var1 = 0; var1 < class87.field1227.length; var1++) {
            if (class87.field1227[var1] != null) {
                class87.field1227[var1].field2590 = -1;
            }
        }
        for (int var2 = 0; var2 < class428.field5951.length; var2++) {
            if (class428.field5951[var2] != null) {
                class428.field5951[var2].field2590 = -1;
            }
        }
        class253.method1623(true);
        int var3 = 79 / ((42 - arg0) / 61);
        class26.field337 = 1;
        class191.method1321(30, 40);
        for (int var4 = 0; var4 < 100; var4++) {
            class363.field4998[var4] = true;
        }
        class345.method2093(-83);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILrg;)Lag;", line = 117)
    public static final class303 method1969(int arg0, class366 arg1) {
        field4385++;
        return arg0 < 29 ? null : new class303(arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2257((byte) 110), arg1.method2263((byte) 10), arg1.method2263((byte) 10), arg1.method2306((byte) 78));
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V", line = 129)
    public static final void method1970() {
        if (class255.field3554 != null) {
            for (int var0 = 0; var0 < class255.field3554.length; var0++) {
                for (int var1 = 0; var1 < class284.field3862; var1++) {
                    for (int var2 = 0; var2 < class354.field4768; var2++) {
                        if (class255.field3554[var0][var1][var2] != null) {
                            class255.field3554[var0][var1][var2].method505((byte) -19);
                        }
                        class255.field3554[var0][var1][var2] = null;
                    }
                }
            }
        }
        class255.field3554 = null;
        class82.field1130 = null;
        if (class304.field4147 != null) {
            for (int var3 = 0; var3 < class304.field4147.length; var3++) {
                for (int var4 = 0; var4 < class284.field3862; var4++) {
                    for (int var5 = 0; var5 < class354.field4768; var5++) {
                        if (class304.field4147[var3][var4][var5] != null) {
                            class304.field4147[var3][var4][var5].method505((byte) -60);
                        }
                        class304.field4147[var3][var4][var5] = null;
                    }
                }
            }
        }
        class304.field4147 = null;
        class125.field1879 = null;
        class341.field4617 = null;
        class436.field6160 = null;
        class249.field3494 = 0;
        if (class150.field2178 != null) {
            for (int var6 = 0; var6 < class249.field3494; var6++) {
                class150.field2178[var6] = null;
            }
        }
        if (class419.field5818 != null) {
            for (int var7 = 0; var7 < class340.field4602; var7++) {
                class419.field5818[var7] = null;
            }
            class340.field4602 = 0;
        }
        if (class122.field1838 != null) {
            for (int var8 = 0; var8 < class406.field5615; var8++) {
                class122.field1838[var8] = null;
            }
            for (int var9 = 0; var9 < class409.field5706; var9++) {
                for (int var10 = 0; var10 < class284.field3862; var10++) {
                    for (int var11 = 0; var11 < class354.field4768; var11++) {
                        class296.field4069[var9][var10][var11] = 0;
                    }
                }
            }
            class406.field5615 = 0;
        }
        class134.field1997 = null;
        class450.method2810(-1);
        class345.field4667.method2476((byte) 0);
        class316.field4283 = null;
        class124.field1876 = null;
        class253.field3512 = null;
        class389.field5413 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 269)
    public static void method1971(boolean arg0) {
        field4389 = null;
        field4387 = null;
        field4391 = null;
        field4392 = null;
        field4388 = null;
        if (!arg0) {
            field4388 = null;
        }
        field4380 = null;
        field4386 = null;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V", line = 289)
    public class323(int arg0, int arg1) {
        this.field4382 = arg1;
        this.field4384 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)Lhl;", line = 298)
    public static final class60 method1972(int arg0, int arg1) {
        field4378++;
        class408 var2 = class120.field1820;
        class60 var3;
        synchronized (class120.field1820) {
            var3 = (class60) class120.field1820.method2529(0, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class349.field4708.method1926(0, arg1, 32);
        class60 var5 = new class60();
        if (var4 != null) {
            var5.method474(14, new class366(var4));
        }
        var5.method479(10314);
        if (arg0 <= 69) {
            method1971(false);
        }
        class408 var6 = class120.field1820;
        synchronized (class120.field1820) {
            class120.field1820.method2527(65, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
    public abstract void method335(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method338(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
    public abstract void method337(int arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
    public abstract int method331(int arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method333(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Llb;IIIIZ)V")
    public abstract void method324(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Llb;IIIIZ)Z")
    public abstract boolean method336(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)I")
    public abstract int method329(int arg0, int arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lbn;[I)V")
    public abstract void method328(class155 arg0, int[] arg1);

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILlb;)Llb;")
    public abstract class210 method341(int arg0, int arg1, class210 arg2);

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
    public abstract void method325();

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(Llb;IIIIZ)V")
    public abstract void method332(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
