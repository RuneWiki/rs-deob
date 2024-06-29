import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class273 extends class146 {

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Z")
    public boolean field4358;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "[Lgl;")
    public class273[] field4355;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lic;")
    public static class160 field4354 = new class160(500);

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "[J")
    public static long[] field4371 = new long[32];

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "Lra;")
    public static class116 field4368;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "Llc;")
    public class290 field4357;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Lrf;")
    public class45 field4359;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "[[[B")
    public static byte[][][] field4356;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1849(int arg0, byte[] arg1) {
        class136 var2 = new class136(arg1);
        field4362++;
        int var3 = var2.method1012(4);
        if (arg0 >= -9) {
            field4356 = null;
        }
        int var4 = var2.method1022(100);
        if (var4 < 0 || class233.field3690 != 0 && class233.field3690 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1018(var5, 0, var4, true);
            return var5;
        } else {
            int var6 = var2.method1022(-90);
            if (var6 < 0 || !(class233.field3690 == 0 || var6 <= class233.field3690)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class175.method1260(var7, var6, arg1, var4, 9);
            } else {
                class191.field3132.method1037(18484, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIB)[I")
    public final int[] method1850(int arg0, int arg1, byte arg2) {
        int var4 = 95 % ((arg2 + 85) / 36);
        field4372++;
        return this.field4355[arg1].field4358 ? this.field4355[arg1].method4(false, arg0) : this.field4355[arg1].method3(125, arg0)[0];
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public final void method1851(int arg0, int arg1, int arg2) {
        field4353++;
        if (arg0 != 0) {
            field4354 = null;
        }
        int var4 = this.field4363 == 255 ? arg1 : this.field4363;
        if (this.field4358) {
            this.field4359 = new class45(var4, arg1, arg2);
        } else {
            this.field4357 = new class290(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public void method108(int arg0) {
        field4361++;
        if (arg0 > -94) {
            this.field4359 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
    public void method168(byte arg0) {
        field4364++;
        if (this.field4358) {
            this.field4359.method389(-85);
            this.field4359 = null;
        } else {
            this.field4357.method1948(0);
            this.field4357 = null;
        }
        int var2 = 49 / ((arg0 - 39) / 47);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
    public int method165(int arg0) {
        if (arg0 != 1) {
            this.field4359 = null;
        }
        field4360++;
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[[I")
    public int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            field4368 = null;
        }
        field4369++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lig;II)V")
    public void method2(class136 arg0, int arg1, int arg2) {
        field4365++;
        if (arg2 != 5) {
            field4371 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
    public int method1620(int arg0) {
        field4352++;
        if (arg0 < 123) {
            this.method1850(15, 35, (byte) -71);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[I")
    public int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            method1849(79, (byte[]) null);
        }
        field4366++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public static void method1852(int arg0) {
        field4371 = null;
        field4368 = null;
        field4354 = null;
        if (arg0 < 89) {
            method1849(-99, (byte[]) null);
        }
        field4356 = null;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IZ)V")
    public class273(int arg0, boolean arg1) {
        this.field4358 = arg1;
        this.field4355 = new class273[arg0];
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIB)[[I")
    public final int[][] method1853(int arg0, int arg1, byte arg2) {
        field4370++;
        if (arg2 != 8) {
            this.method2((class136) null, 59, 78);
        }
        if (this.field4355[arg0].field4358) {
            int[] var4 = this.field4355[arg0].method4(false, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4355[arg0].method3(arg2 ^ 0x73, arg1);
        }
    }
}
