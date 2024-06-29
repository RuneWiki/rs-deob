import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class class335 extends class45 {

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "Z")
    public boolean field4537;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[Llm;")
    public class335[] field4521;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Leba;")
    public static class550 field4522 = new class550(87, -2);

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lie;")
    public class114 field4527;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lbba;")
    public class414 field4525;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Llfa;")
    public static class51 field4536;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)[[I", line = 11)
    public final int[][] method1968(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            this.method1278(-21);
        }
        field4538++;
        if (this.field4521[arg2].field4537) {
            int[] var4 = this.field4521[arg2].method3(true, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4521[arg2].method1(arg0, false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILio;I)V", line = 46)
    public void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 != -66) {
            this.field4527 = null;
        }
        field4526++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)[I", line = 58)
    public final int[] method1969(int arg0, int arg1, int arg2) {
        if (arg2 > -37) {
            return null;
        } else {
            field4533++;
            return this.field4521[arg0].field4537 ? this.field4521[arg0].method3(true, arg1) : this.field4521[arg0].method1(arg1, false)[0];
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)[[I", line = 80)
    public int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            this.field4527 = null;
        }
        field4524++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I", line = 91)
    public int method1278(int arg0) {
        field4531++;
        int var2 = 0 % ((arg0 + 7) / 47);
        return -1;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 110)
    public void method317(byte arg0) {
        int var2 = -8 / ((arg0 - 58) / 60);
        field4539++;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 120)
    public static void method1970(int arg0) {
        if (arg0 != 5442) {
            field4536 = null;
        }
        field4536 = null;
        field4522 = null;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)[Ltl;", line = 133)
    public static final class566[] method1971(int arg0) {
        if (arg0 != 2) {
            field4536 = null;
        }
        field4535++;
        return new class566[] { class122.field1593, class32.field446, class15.field192 };
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)[I", line = 147)
    public int[] method3(boolean arg0, int arg1) {
        if (arg0) {
            field4534++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IZ)V", line = 157)
    public class335(int arg0, boolean arg1) {
        this.field4537 = arg1;
        this.field4521 = new class335[arg0];
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I", line = 167)
    public int method1749(boolean arg0) {
        field4530++;
        if (!arg0) {
            field4523 = 106;
        }
        return -1;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 190)
    public void method1277(byte arg0) {
        field4529++;
        if (this.field4537) {
            this.field4525.method2343((byte) 118);
            this.field4525 = null;
        } else {
            this.field4527.method671(103);
            this.field4527 = null;
        }
        if (arg0 <= 78) {
            this.field4537 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)V", line = 215)
    public void method1276(int arg0, int arg1, int arg2) {
        field4528++;
        int var4 = this.field4532 == arg0 ? arg1 : this.field4532;
        if (this.field4537) {
            this.field4525 = new class414(var4, arg1, arg2);
        } else {
            this.field4527 = new class114(var4, arg1, arg2);
        }
    }
}
