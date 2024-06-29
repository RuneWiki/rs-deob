import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class261 {

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Ldh;")
    private class159 field4527 = new class159();

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    private int field4526;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Loe;")
    private class120 field4525;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4521 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lmh;")
    public static class128 field4524 = class22.method156(127, "l");

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lmh;")
    public static class128 field4523 = null;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lmh;")
    public static class128 field4528 = class22.method156(124, "Lade Liste der Welten");

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field4532 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lek;")
    public static class174 field4519;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 6)
    public static void method1829(int arg0) {
        field4523 = null;
        field4519 = null;
        field4528 = null;
        int var1 = -73 % ((-arg0 - 38) / 35);
        field4524 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4529++;
        if (arg3 != -10177) {
            method1830(71, -89, 80, 31, 60);
        }
        if (arg2 >= arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class219.field3850[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class219.field3850[var6][arg4] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IJ)V", line = 57)
    public final void method1831(int arg0, long arg1) {
        field4534++;
        if (arg0 != 1) {
            field4523 = (class128) null;
        }
        class223 var4 = (class223) this.field4525.method728(false, arg1);
        if (var4 != null) {
            var4.method1978((byte) 87);
            var4.method1521(arg0 ^ 0xFFFFF11F);
            this.field4526++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 77)
    public final void method1832(byte arg0) {
        this.field4527.method1054((byte) -71);
        field4518++;
        if (arg0 > 28) {
            this.field4525.method733((byte) -31);
            this.field4526 = this.field4522;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V", line = 90)
    public final void method1833(int arg0, byte arg1) {
        if (class256.field4398 != null) {
            for (class223 var3 = (class223) this.field4527.method1053((byte) -44); var3 != null; var3 = (class223) this.field4527.method1051((byte) 90)) {
                if (var3.method1532((byte) -29)) {
                    if (var3.method1535(false) == null) {
                        var3.method1978((byte) 62);
                        var3.method1521(-3810);
                        this.field4526++;
                    }
                } else if (((long) arg0) < (++var3.field3876)) {
                    class223 var4 = class256.field4398.method336((byte) 58, var3);
                    this.field4525.method730(var4, var3.field4915, (byte) 119);
                    class242.method1642(var3, var4, 10);
                    var3.method1978((byte) -109);
                    var3.method1521(-3810);
                }
            }
        }
        field4535++;
        if (arg1 <= 57) {
            this.method1832((byte) 11);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 142)
    public final void method1834(int arg0) {
        if (arg0 != 17) {
            return;
        }
        for (class223 var2 = (class223) this.field4527.method1053((byte) -34); var2 != null; var2 = (class223) this.field4527.method1051((byte) 8)) {
            if (var2.method1532((byte) -88)) {
                var2.method1978((byte) -99);
                var2.method1521(arg0 - 3827);
                this.field4526++;
            }
        }
        field4530++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BJLjava/lang/Object;)V", line = 168)
    public final void method1835(byte arg0, long arg1, Object arg2) {
        this.method1831(1, arg1);
        if (this.field4526 == 0) {
            class223 var5 = (class223) this.field4527.method1047((byte) -85);
            var5.method1978((byte) -112);
            var5.method1521(-3810);
        } else {
            this.field4526--;
        }
        field4520++;
        class284 var6 = new class284(arg2);
        this.field4525.method730(var6, arg1, (byte) -17);
        this.field4527.method1046(arg0 ^ 0xFFFFFFAF, var6);
        if (arg0 != -81) {
            field4524 = (class128) null;
        }
        var6.field3876 = 0L;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V", line = 287)
    public class261(int arg0) {
        this.field4522 = arg0;
        int var2 = 1;
        this.field4526 = arg0;
        while ((var2 + var2) < arg0) {
            var2 += var2;
        }
        this.field4525 = new class120(var2);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 223)
    public final Object method1836(long arg0, int arg1) {
        field4531++;
        class223 var4 = (class223) this.field4525.method728(false, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1535(false);
        if (var5 == null) {
            var4.method1978((byte) -124);
            var4.method1521(-3810);
            this.field4526++;
            return null;
        } else if (arg1 == 0) {
            if (var4.method1532((byte) -53)) {
                class284 var6 = new class284(var5);
                this.field4525.method730(var6, var4.field4915, (byte) -2);
                this.field4527.method1046(0, var6);
                var6.field3876 = 0L;
                var4.method1978((byte) 66);
                var4.method1521(arg1 ^ 0xFFFFF11E);
            } else {
                this.field4527.method1046(0, var4);
                var4.field3876 = 0L;
            }
            return var5;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILdj;)V", line = 267)
    public static final void method1837(int arg0, class314 arg1) {
        int var2 = 49 % ((38 - arg0) / 36);
        field4533++;
        class180.field3155 = arg1;
    }
}
