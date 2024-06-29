import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class261 extends class208 {

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "Z")
    public boolean field4434;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[Lbh;")
    public class261[] field4417;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
    public static boolean field4424 = false;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field4427 = 0;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lve;")
    public static class255 field4432 = class87.method607(110, " weitere Optionen");

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lcf;")
    public class122 field4425;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lgk;")
    public class6 field4418;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 13)
    public void method832(boolean arg0) {
        field4423++;
        if (!arg0) {
            return;
        }
        if (this.field4434) {
            this.field4425.method907(-1);
            this.field4425 = null;
        } else {
            this.field4418.method34((byte) 69);
            this.field4418 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)I", line = 41)
    public int method833(byte arg0) {
        if (arg0 < 53) {
            this.field4418 = (class6) null;
        }
        field4422++;
        return -1;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V", line = 54)
    public static final void method1817(byte arg0) {
        class145.field2475 = 0;
        class284.field4886 = -3;
        class23.field350 = false;
        class251.field4228 = 0;
        field4419++;
        client.field4040 = -1;
        class285.field4896 = 0;
        class160.field2702 = 1;
        if (arg0 != 30) {
            field4424 = true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB)V", line = 82)
    public final void method1818(int arg0, int arg1, byte arg2) {
        field4431++;
        if (arg2 != 26) {
            return;
        }
        int var4 = this.field4435 == 255 ? arg0 : this.field4435;
        if (this.field4434) {
            this.field4425 = new class122(var4, arg0, arg1);
        } else {
            this.field4418 = new class6(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)[[I", line = 104)
    public final int[][] method1819(int arg0, int arg1, int arg2) {
        int var4 = 29 / ((arg0 - 21) / 37);
        field4436++;
        if (!this.field4417[arg1].field4434) {
            return this.field4417[arg1].method13(true, arg2);
        }
        int[][] var5 = new int[3][];
        int[] var6 = this.field4417[arg1].method21((byte) -89, arg2);
        var5[1] = var6;
        var5[2] = var6;
        var5[0] = var6;
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(B)I", line = 136)
    public static final int method1820(byte arg0) {
        field4421++;
        if (class307.field5221 != null) {
            return 3;
        } else if (arg0 <= 26) {
            return 127;
        } else if (class281.field4827 && class79.field1289) {
            return 2;
        } else if (class281.field4827 && !class79.field1289) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[[I", line = 162)
    public int[][] method13(boolean arg0, int arg1) {
        field4437++;
        if (!arg0) {
            field4432 = (class255) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V", line = 178)
    public static void method1821(byte arg0) {
        field4432 = null;
        if (arg0 >= -71) {
            field4430 = -121;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpb;BI)V", line = 194)
    public void method20(class70 arg0, byte arg1, int arg2) {
        field4426++;
        if (arg1 >= -115) {
            this.method1818(81, 126, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)[I", line = 204)
    public final int[] method1822(int arg0, int arg1, int arg2) {
        field4429++;
        if (arg1 < 2) {
            this.method1822(97, 74, 61);
        }
        return this.field4417[arg0].field4434 ? this.field4417[arg0].method21((byte) 80, arg2) : this.field4417[arg0].method13(true, arg2)[0];
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(B)V", line = 228)
    public void method111(byte arg0) {
        if (arg0 != -57) {
            this.method21((byte) -2, -60);
        }
        field4420++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)I", line = 244)
    public int method1823(boolean arg0) {
        field4433++;
        if (arg0) {
            this.field4418 = (class6) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)[I", line = 255)
    public int[] method21(byte arg0, int arg1) {
        field4428++;
        int var3 = 113 / ((arg0 + 49) / 33);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IZ)V", line = 263)
    public class261(int arg0, boolean arg1) {
        this.field4434 = arg1;
        this.field4417 = new class261[arg0];
    }
}
