import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class406 extends class43 {

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    private int field5618;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    private int field5621;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    private int field5628;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public int field5630;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public int field5634;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field5616;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    private int field5631;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field5620 = -2;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Lcq;")
    public static class72 field5629 = new class72("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "Lcq;")
    public static class72 field5633 = new class72("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
    public static void method2526(byte arg0) {
        field5633 = null;
        field5629 = null;
        int var1 = 42 % ((arg0 + 28) / 48);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILpi;)I")
    public static final int method2527(int arg0, class298 arg1) {
        field5625++;
        int var2 = -84 / ((arg0 + 22) / 52);
        class307 var3 = arg1.field3971;
        if (var3.field4113 != null) {
            var3 = var3.method1946((byte) -104);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field4150;
        class437 var5 = arg1.method1250(33);
        if (arg1.field2423) {
            var4 = var3.field4135;
        } else if (arg1.field2394 == var5.field6005 || arg1.field2394 == var5.field5987 || arg1.field2394 == var5.field5983 || arg1.field2394 == var5.field6002) {
            var4 = var3.field4117;
        } else if (arg1.field2394 == var5.field5997 || arg1.field2394 == var5.field5971 || arg1.field2394 == var5.field5966 || arg1.field2394 == var5.field5986) {
            var4 = var3.field4170;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBI)Z")
    public final boolean method2528(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -46) {
            field5627++;
            return this.field5631 == arg1 && arg3 >= this.field5614 && this.field5628 >= arg3 && arg0 >= this.field5618 && arg0 <= this.field5621;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[II)V")
    public final void method2529(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[0] = 0;
        field5619++;
        arg2[1] = this.field5634 + arg1 - this.field5614;
        arg2[2] = this.field5624 + arg3 - this.field5618;
        if (arg0 <= 4) {
            this.method2528(-27, -106, (byte) -32, 107);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[III)V")
    public final void method2530(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[arg3] = this.field5614 + arg2 - this.field5634;
        field5626++;
        arg1[2] = arg0 + this.field5618 - this.field5624;
        arg1[0] = this.field5631;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLwo;Lgd;)V")
    public static final void method2531(byte arg0, class285 arg1, class172 arg2) {
        class157.field1834 = arg2;
        if (arg0 <= 25) {
            method2527(86, (class298) null);
        }
        field5622++;
        class75.field909 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)Z")
    public final boolean method2532(int arg0, int arg1, byte arg2) {
        if (arg2 == -45) {
            field5632++;
            return arg1 >= this.field5614 && this.field5628 >= arg1 && this.field5618 <= arg0 && arg0 <= this.field5621;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZI)Z")
    public final boolean method2533(int arg0, boolean arg1, int arg2) {
        field5617++;
        if (!arg1) {
            this.field5618 = -105;
        }
        return arg2 >= this.field5634 && this.field5616 >= arg2 && arg0 >= this.field5624 && this.field5630 >= arg0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJ)V")
    public static final void method2534(int arg0, long arg1) {
        field5623++;
        if (class347.field4722 != null) {
            if (class320.field4294 == 1 || class320.field4294 == 5) {
                class287.method1832(arg1, -111);
            } else if (class320.field4294 == 4) {
                class75.method442(arg1, 32466);
            }
        }
        class246.method1612((long) class106.field1273, true, class267.field3454);
        if (class366.field4983 != -1) {
            class320.method1999(class366.field4983, (byte) 107);
        }
        for (int var3 = 0; var3 < class319.field4291; var3++) {
            if (class65.field786[var3]) {
                class326.field4346[var3] = true;
            }
            class287.field3778[var3] = class65.field786[var3];
            class65.field786[var3] = false;
        }
        class293.field3859 = class106.field1273;
        if (class267.field3454.method726()) {
            class374.field5061 = true;
        }
        if (class366.field4983 != -1) {
            class319.field4291 = 0;
            class421.method2579(false);
        }
        class267.field3454.method732();
        class229.method1410(class267.field3454, (byte) 77);
        int var4 = class136.method879(arg0 ^ 0xF0);
        if (~var4 == arg0) {
            var4 = class72.field891;
        }
        class396.method2451(var4, -1);
        class370.method2330(class143.field1684.field1514, (byte) -123, class43.field513, class439.field6032, class143.field1684.field1516);
        class439.field6032 = 0;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5618 = arg2;
        this.field5624 = arg6;
        this.field5621 = arg4;
        this.field5628 = arg3;
        this.field5614 = arg1;
        this.field5630 = arg8;
        this.field5634 = arg5;
        this.field5616 = arg7;
        this.field5631 = arg0;
    }
}
