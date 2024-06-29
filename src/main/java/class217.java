import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class217 extends class80 {

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public int field3729 = 0;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Lr;")
    public static class66 field3725 = class93.method641(43, "Nehmen");

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lr;")
    public static class66 field3734 = class93.method641(43, ")2");

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lr;")
    public static class66 field3730 = class93.method641(43, "M");

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Z")
    public static boolean field3740 = false;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field3728 = 0;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Lr;")
    public static class66 field3745 = class93.method641(43, "Wordpack geladen)3");

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Lub;")
    public class231 field3727;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lrb;")
    public class258 field3722;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Lrb;")
    public class258 field3731;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Leh;")
    public class37 field3742;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Lfa;")
    public class45 field3732;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Z")
    public boolean field3743;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "[I")
    public int[] field3735;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static void method1396(int arg0) {
        field3734 = null;
        if (arg0 != 0) {
            method1399(-119);
        }
        field3745 = null;
        field3725 = null;
        field3730 = null;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public final void method1397(int arg0) {
        if (arg0 != 31506) {
            return;
        }
        int var2 = this.field3724;
        if (this.field3727 != null) {
            class231 var5 = this.field3727.method1515(arg0 ^ 0xFFFF84ED);
            if (var5 == null) {
                this.field3735 = null;
                this.field3739 = 0;
                this.field3741 = 0;
                this.field3724 = -1;
                this.field3726 = 0;
            } else {
                this.field3735 = var5.field4028;
                this.field3726 = var5.field3997;
                this.field3724 = var5.field4015;
                this.field3739 = var5.field4008 * 128;
                this.field3741 = var5.field4033;
            }
        } else if (this.field3742 != null) {
            int var3 = class145.method995(this.field3742, false);
            if (var2 != var3) {
                this.field3724 = var3;
                class206 var4 = this.field3742.field548;
                if (var4.field3541 != null) {
                    var4 = var4.method1339(-94);
                }
                if (var4 == null) {
                    this.field3739 = 0;
                } else {
                    this.field3739 = var4.field3573 * 128;
                }
            }
        } else if (this.field3732 != null) {
            this.field3724 = class40.method255(this.field3732, arg0 ^ 0xFFFF9EC8);
            this.field3739 = this.field3732.field828 * 128;
        }
        field3738++;
        if (this.field3724 != var2 && this.field3722 != null) {
            class206.field3528.method1031(this.field3722);
            this.field3722 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZZI[Lha;)V")
    public static final void method1398(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, class63[] arg5) {
        if (arg3) {
            field3730 = null;
        }
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class63 var7 = arg5[var6];
            if (var7 != null && var7.field1122 == arg0) {
                class184.method1225(arg2, 19, arg1, arg4, var7);
                class156.method1059(arg1, var7, arg4, -1198502738);
                if (var7.field1141 > (var7.field1117 - var7.field1196)) {
                    var7.field1141 = var7.field1117 - var7.field1196;
                }
                if (var7.field1141 < 0) {
                    var7.field1141 = 0;
                }
                if (var7.field1211 - var7.field1215 < var7.field1170) {
                    var7.field1170 = var7.field1211 - var7.field1215;
                }
                if (var7.field1170 < 0) {
                    var7.field1170 = 0;
                }
                if (var7.field1219 == 0) {
                    class69.method503(-1, arg2, var7);
                }
            }
        }
        field3723++;
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static final void method1399(int arg0) {
        field3737++;
        for (int var1 = 0; var1 < class160.field2869; var1++) {
            int var2 = class49.field877[var1];
            class37 var3 = class178.field3112[var2];
            if (var3 != null) {
                class222.method1414(var3, 128, var3.field548.field3561);
            }
        }
        if (arg0 != 16986) {
            method1399(107);
        }
    }
}
