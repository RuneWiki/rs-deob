import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class293 extends class189 implements class93 {

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Z")
    private boolean field4559 = false;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    private int field4560 = 50;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "Lub;")
    private class92 field4562;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Lub;")
    private class92 field4555;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Lag;")
    private class192 field4546;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Lag;")
    private class192 field4556;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field4561 = 3353893;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "[I")
    public static int[] field4543 = new int[4096];

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(II)Lna;")
    private final class32 method1940(int arg0, int arg1) {
        field4548++;
        class32 var3 = (class32) this.field4546.method1361((byte) -95, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4555.method721((byte) -117, arg0, 0);
        if (var4 == null) {
            return null;
        }
        class32 var5 = new class32(new class31(var4));
        if (arg1 != -15170) {
            field4550 = 98;
        }
        this.field4546.method1365((long) arg0, (byte) 13, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(II)V")
    public static final void method1941(int arg0, int arg1) {
        if (arg1 != 255) {
            method1941(-106, 36);
        }
        class35.field606.method1166((byte) 23, arg0);
        class155.field2316.method1166((byte) 23, arg0);
        class108.field1681.method1166((byte) 23, arg0);
        field4552++;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)Z")
    public final boolean method734(int arg0, int arg1) {
        field4547++;
        if (arg1 == 64) {
            return this.field4559 || this.method1348(arg0, -32428).field2835;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lub;Lub;Lub;IZ)V")
    public class293(class92 arg0, class92 arg1, class92 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4559 = arg4;
        this.field4560 = arg3;
        this.field4562 = arg2;
        this.field4555 = arg0;
        this.field4546 = new class192(this.field4560);
        this.field4556 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)Z")
    public final boolean method730(int arg0, int arg1) {
        field4558++;
        return arg0 == 0 ? this.method1348(arg1, arg0 - 32428).field2832 : false;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)Lae;")
    public final class176 method1351(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4556 = null;
        }
        class32 var3 = this.method1940(arg0, -15170);
        field4557++;
        return var3 == null ? null : var3.field579;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)V")
    public final void method1942(int arg0, byte arg1) {
        field4551++;
        int var3 = -84 % ((arg1 + 74) / 40);
        for (class32 var4 = (class32) this.field4546.method1368((byte) -46); var4 != null; var4 = (class32) this.field4546.method1366(-251)) {
            if (var4.field580) {
                var4.method321(arg0);
                var4.field580 = false;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)I")
    public final int method732(boolean arg0, int arg1) {
        if (!arg0) {
            this.field4556 = null;
        }
        field4544++;
        return this.method1348(arg1, -32428).field2849 & 0xFFFF;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IFI)[I")
    public final int[] method731(int arg0, float arg1, int arg2) {
        field4554++;
        if (arg0 != 4096) {
            this.method730(-78, -104);
        }
        class32 var4 = this.method1940(arg2, -15170);
        if (var4 == null) {
            return null;
        } else {
            var4.field580 = true;
            return var4.method320(this, this.field4562, arg1, this.field4559 || this.method1348(arg2, -32428).field2835);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZFII)Lej;")
    public final class51 method733(int arg0, boolean arg1, float arg2, int arg3, int arg4) {
        field4553++;
        class32 var6 = this.method1940(arg4, -15170);
        if (var6 == null || !var6.method319(this, this.field4562)) {
            return null;
        } else if (arg0 <= 33) {
            return null;
        } else if (arg1) {
            return var6.field579.method1256(this, false, this.field4562, arg3, (double) arg2, false, arg3);
        } else {
            return var6.field579.method1258(arg3, (double) arg2, -111, arg3, this, this.field4562, false);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZ)V")
    public final void method1943(boolean arg0, boolean arg1) {
        field4542++;
        this.field4559 = arg1;
        if (!arg0) {
            this.field4546 = null;
        }
        this.method1945(128);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method1944(int arg0) {
        if (arg0 == 0) {
            field4543 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Z")
    public final boolean method729(int arg0, int arg1) {
        field4545++;
        if (arg0 != 0) {
            field4549 = -67;
        }
        return !this.method1348(arg1, arg0 - 32428).field2838;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public final void method1945(int arg0) {
        this.field4546.method1367(false);
        if (this.field4556 != null) {
            this.field4556.method1367(false);
        }
        field4541++;
        class32.field581 = null;
        if (arg0 != 128) {
            field4540 = -29;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4543[var0] = class58.method480(false, var0);
        }
    }
}
