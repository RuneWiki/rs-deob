import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class42 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/lang/String;")
    private String field583 = "null";

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "[B")
    public static byte[] field594 = new byte[520];

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lfg;")
    public static class83 field593 = new class83("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!da", name = "d", descriptor = "C")
    public char field581;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "C")
    public char field590;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lbj;")
    private class159 field579;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lbj;")
    public class159 field580;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILlh;)V", line = 3)
    public final void method262(int arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                field586++;
                if (arg0 != -6) {
                    field594 = null;
                    return;
                }
                return;
            }
            this.method263(arg0 - 96, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILlh;)V", line = 25)
    private final void method263(int arg0, int arg1, class365 arg2) {
        if (arg1 == 1) {
            this.field581 = class376.method2168(arg2.method2081((byte) -33), (byte) -126);
        } else if (arg1 == 2) {
            this.field590 = class376.method2168(arg2.method2081((byte) 125), (byte) -127);
        } else if (arg1 == 3) {
            this.field583 = arg2.method2106(-1);
        } else if (arg1 == 4) {
            this.field584 = arg2.method2056((byte) 75);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method2062((byte) 14);
            this.field580 = new class159(class420.method2513(var4, 0));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2056((byte) 80);
                class499 var7;
                if (arg1 == 5) {
                    var7 = new class48(arg2.method2106(-1));
                } else {
                    var7 = new class330(arg2.method2056((byte) 92));
                }
                this.field580.method990((long) var6, (byte) 94, var7);
            }
        }
        if (arg0 >= -42) {
            this.field583 = null;
        }
        field578++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 86)
    private final void method264(int arg0) {
        this.field579 = new class159(this.field580.method988(-106));
        field592++;
        int var2 = 108 % ((arg0 + 10) / 36);
        for (class48 var3 = (class48) this.field580.method981(0); var3 != null; var3 = (class48) this.field580.method989(0)) {
            class269 var4 = new class269(var3.field659, (int) var3.field7342);
            this.field579.method990(class398.method2305(var3.field659, 4), (byte) 124, var4);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 112)
    private final void method265(int arg0) {
        field591++;
        this.field579 = new class159(this.field580.method988(-55));
        for (class330 var2 = (class330) this.field580.method981(arg0 ^ arg0); var2 != null; var2 = (class330) this.field580.method989(0)) {
            class330 var3 = new class330((int) var2.field7342);
            this.field579.method990((long) var2.field4495, (byte) 11, var3);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Ljava/lang/String;", line = 132)
    public final String method266(int arg0, int arg1) {
        field582++;
        if (this.field580 == null) {
            return this.field583;
        } else if (arg1 == -5) {
            class48 var3 = (class48) this.field580.method979((byte) 28, (long) arg0);
            return var3 == null ? this.field583 : var3.field659;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)I", line = 153)
    public final int method267(boolean arg0, int arg1) {
        field589++;
        if (this.field580 == null) {
            return this.field584;
        }
        class330 var3 = (class330) this.field580.method979((byte) 28, (long) arg1);
        if (!arg0) {
            this.field590 = (char) 65482;
        }
        return var3 == null ? this.field584 : var3.field4495;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 177)
    public final boolean method268(int arg0, String arg1) {
        field585++;
        if (this.field580 == null) {
            return false;
        }
        if (this.field579 == null) {
            this.method264(arg0 ^ 0x36);
        }
        for (class269 var3 = (class269) this.field579.method979((byte) 28, class398.method2305(arg1, 4)); var3 != null; var3 = (class269) this.field579.method991((byte) -126)) {
            if (var3.field3687.equals(arg1)) {
                return true;
            }
        }
        if (arg0 != -6) {
            this.method262(64, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)Z", line = 210)
    public final boolean method269(int arg0, byte arg1) {
        field588++;
        if (this.field580 == null) {
            return false;
        }
        if (this.field579 == null) {
            this.method265(15822);
        }
        class330 var3 = (class330) this.field579.method979((byte) 28, (long) arg0);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 < 109) {
                this.method267(false, -52);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 238)
    public static void method270(int arg0) {
        field594 = null;
        if (arg0 != 1) {
            method270(-15);
        }
        field593 = null;
    }
}
