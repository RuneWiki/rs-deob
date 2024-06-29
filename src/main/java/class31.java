import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field331 = 1407;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[S")
    public static short[] field332 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lri;")
    public static class73 field334 = new class73(59, -1);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lri;")
    public static class73 field340 = new class73(21, 3);

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
    public static boolean field341 = false;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Ldm;")
    public class37 field337;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[Lna;")
    public static class35[] field335;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILdh;)V")
    private final void method179(int arg0, int arg1, class209 arg2) {
        if (arg1 <= 60) {
            this.method185(null, -14);
        }
        field336++;
        if (arg0 == 1) {
            this.field333 = arg2.method1450((byte) 89);
        } else if (arg0 == 2) {
            this.field329 = arg2.method1428(32122);
            this.field325 = arg2.method1428(32122);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Z")
    public static final boolean method180(boolean arg0) {
        if (arg0) {
            method180(false);
        }
        field326++;
        return class18.field197;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V")
    public static void method181(boolean arg0) {
        field332 = null;
        field334 = null;
        field340 = null;
        if (arg0) {
            method180(true);
        }
        field335 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)Lgu;")
    public final synchronized class408 method182(int arg0) {
        field328++;
        class408 var2 = (class408) this.field337.field391.method1536((long) this.field333, 0);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 80) {
            this.field337 = null;
        }
        class408 var3 = class408.method2459(this.field337.field385, this.field333, 0);
        if (var3 != null) {
            this.field337.field391.method1542(var3, (byte) 112, (long) this.field333);
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldh;B)Lul;")
    public static final class402 method183(class209 arg0, byte arg1) {
        if (arg1 == 39) {
            field338++;
            return new class402(arg0.method1447(29480), arg0.method1447(29480), arg0.method1447(arg1 ^ 0x730F), arg0.method1447(29480), arg0.method1447(29480), arg0.method1447(arg1 + 29441), arg0.method1447(29480), arg0.method1447(29480), arg0.method1458((byte) -10), arg0.method1428(arg1 ^ 0x7D5D));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)V")
    public static final void method184(int arg0, int arg1, byte arg2) {
        field330++;
        class338 var3 = class230.method1580(13, -1332166328, arg1);
        var3.method2053(-87);
        var3.field4756 = arg0;
        if (arg2 != 79) {
            method184(-69, -90, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldh;I)V")
    public final void method185(class209 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                field327++;
                int var4 = -95 / ((arg1 + 51) / 55);
                return;
            }
            this.method179(var3, 94, arg0);
        }
    }
}
