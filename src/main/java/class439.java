import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class439 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lvi;")
    private class481 field6321 = new class481();

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
    public static int[] field6325 = new int[4];

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lrb;")
    public static class283 field6323 = new class283(34, 3);

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "Lwg;")
    public static class41 field6332;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lvi;")
    private class481 field6326;

    static {
        new class157("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2593(boolean arg0) {
        field6324++;
        while (true) {
            class481 var2 = this.field6321.field6951;
            if (this.field6321 == var2) {
                if (arg0) {
                    this.field6326 = null;
                }
                this.field6326 = null;
                return;
            }
            var2.method2861((byte) 47);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z", line = 29)
    public static final boolean method2594(int arg0, int arg1, int arg2) {
        if (arg2 != 34) {
            field6325 = null;
        }
        field6331++;
        return class356.method2127(arg0, arg1, false) | (arg1 & 0x60000) != 0 || class391.method2317(true, arg1, arg0) || class20.method133(arg0, true, arg1);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lvi;", line = 45)
    public final class481 method2595(int arg0) {
        field6328++;
        if (arg0 != 0) {
            this.method2602((byte) -118);
        }
        class481 var2 = this.field6321.field6950;
        if (this.field6321 == var2) {
            this.field6326 = null;
            return null;
        } else {
            this.field6326 = var2.field6950;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)Lvi;", line = 66)
    public final class481 method2596(boolean arg0) {
        field6329++;
        if (!arg0) {
            return null;
        }
        class481 var2 = this.field6321.field6951;
        if (this.field6321 == var2) {
            return null;
        } else {
            var2.method2861((byte) 47);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 85)
    public static void method2597(byte arg0) {
        if (arg0 == -55) {
            field6325 = null;
            field6332 = null;
            field6323 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V", line = 210)
    public class439() {
        this.field6321.field6951 = this.field6321;
        this.field6321.field6950 = this.field6321;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)Z", line = 110)
    public final boolean method2598(int arg0) {
        field6319++;
        if (arg0 == -20475) {
            return this.field6321.field6951 == this.field6321;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILvi;)V", line = 121)
    public final void method2599(int arg0, class481 arg1) {
        if (arg1.field6950 != null) {
            arg1.method2861((byte) 47);
        }
        field6327++;
        arg1.field6950 = this.field6321.field6950;
        arg1.field6951 = this.field6321;
        arg1.field6950.field6951 = arg1;
        arg1.field6951.field6950 = arg1;
        if (arg0 != 1256) {
            this.field6326 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)Lvi;", line = 141)
    public final class481 method2600(byte arg0) {
        field6322++;
        class481 var2 = this.field6321.field6951;
        if (this.field6321 == var2) {
            this.field6326 = null;
            return null;
        } else {
            int var3 = -28 / ((arg0 - 63) / 39);
            this.field6326 = var2.field6951;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Lvi;", line = 160)
    public final class481 method2601(int arg0) {
        field6320++;
        class481 var2 = this.field6326;
        if (arg0 <= 108) {
            method2594(121, -7, -12);
        }
        if (this.field6321 == var2) {
            this.field6326 = null;
            return null;
        } else {
            this.field6326 = var2.field6951;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)I", line = 182)
    public final int method2602(byte arg0) {
        field6330++;
        int var2 = 0;
        class481 var3 = this.field6321.field6951;
        if (arg0 != -31) {
            this.field6321 = null;
        }
        while (this.field6321 != var3) {
            var3 = var3.field6951;
            var2++;
        }
        return var2;
    }
}
