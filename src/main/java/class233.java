import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class233 {

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lhk;")
    private class159 field3687;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Lra;")
    private class116 field3686;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lrj;")
    private class274 field3692;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lic;")
    public static class160 field3697 = new class160(64);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lbf;")
    public static class102 field3693;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Lsb;")
    public static class124 field3699;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lig;")
    private class136 field3683;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "[Lie;")
    private class47[] field3685;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
    public final boolean method1539(int arg0) {
        if (arg0 != -17095) {
            return false;
        }
        field3691++;
        if (this.field3683 != null) {
            return true;
        }
        if (this.field3692 == null) {
            if (this.field3687.method1142(true)) {
                return false;
            }
            this.field3692 = this.field3687.method1151((byte) 101, 255, true, 255, (byte) 0);
        }
        if (this.field3692.field3756) {
            return false;
        } else {
            this.field3683 = new class136(this.field3692.method733(true));
            this.field3685 = new class47[(this.field3683.field2263.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZLek;Lek;I)Lie;")
    private final class47 method1540(byte arg0, boolean arg1, class239 arg2, class239 arg3, int arg4) {
        field3694++;
        if (this.field3683 == null) {
            throw new RuntimeException();
        }
        this.field3683.field2231 = arg4 * 8 + 5;
        if (this.field3683.field2263.length <= this.field3683.field2231) {
            throw new RuntimeException();
        } else if (this.field3685[arg4] == null) {
            int var6 = this.field3683.method1022(-60);
            int var7 = this.field3683.method1022(127);
            class47 var8 = new class47(arg4, arg3, arg2, this.field3687, this.field3686, var6, var7, arg1);
            this.field3685[arg4] = var8;
            int var9 = 61 / ((arg0 - 57) / 61);
            return var8;
        } else {
            return this.field3685[arg4];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V")
    public static final void method1541(boolean arg0, int arg1) {
        field3698++;
        if (arg0 == class65.field1069) {
            return;
        }
        class65.field1069 = arg0;
        class131.method946(3468);
        if (arg1 != -796004472) {
            field3699 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final void method1542(int arg0) {
        field3684++;
        if (arg0 != -15638 || this.field3685 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3685.length; var2++) {
            if (this.field3685[var2] != null) {
                this.field3685[var2].method401(110);
            }
        }
        for (int var3 = 0; var3 < this.field3685.length; var3++) {
            if (this.field3685[var3] != null) {
                this.field3685[var3].method407((byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILek;ILek;)Lie;")
    public final class47 method1543(int arg0, class239 arg1, int arg2, class239 arg3) {
        if (arg0 >= -24) {
            this.field3687 = null;
        }
        field3695++;
        return this.method1540((byte) -103, true, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Lwf;")
    public static final class17 method1544(int arg0) {
        field3696++;
        byte[] var1 = class66.field1082[0];
        int var2 = class4.field56[0] * class19.field268[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class244.field3857[class64.method498(255, var1[var4])];
        }
        if (arg0 <= 111) {
            return null;
        } else {
            class17 var5 = new class17(class287.field4592, class20.field315, class193.field3155[0], class197.field3224[0], class4.field56[0], class19.field268[0], var3);
            class213.method1410(0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
    public static final void method1545(int arg0, int arg1) {
        field3701++;
        class29.field506.method1163(arg0, false);
        class136.field2259.method1163(arg0, false);
        if (arg1 != 1915) {
            field3699 = null;
        }
        class80.field1327.method1163(arg0, false);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lhk;Lra;)V")
    public class233(class159 arg0, class116 arg1) {
        this.field3687 = arg0;
        this.field3686 = arg1;
        if (!this.field3687.method1142(true)) {
            this.field3692 = this.field3687.method1151((byte) 121, 255, true, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static void method1546(byte arg0) {
        int var1 = 121 / ((arg0 - 74) / 52);
        field3693 = null;
        field3699 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1547(int arg0, byte arg1) {
        field3688++;
        if (arg1 != 63) {
            field3699 = null;
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF6575) >> 16) + "." + ((arg0 & 0xFF67) >> 8) + "." + (arg0 & 0xFF);
    }
}
