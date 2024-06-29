import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class55 extends class64 {

    @OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "Lqf;")
    public static class150 field999 = null;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "Lsg;")
    private static class169 field1002 = class165.method1060("Loading)3)3)3", 1536);

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Lsg;")
    private static class169 field1001 = class165.method1060("and choose the (Wcreate account(W", 1536);

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field1006 = 10;

    @OriginalMember(owner = "client!fh", name = "mb", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!fh", name = "pb", descriptor = "Lsg;")
    public static class169 field1013 = field1001;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lsg;")
    public static class169 field1000 = field1002;

    @OriginalMember(owner = "client!fh", name = "qb", descriptor = "Lsg;")
    public static class169 field1014 = class165.method1060(" zuerst von Ihrer Freunde)2Liste(Q", 1536);

    @OriginalMember(owner = "client!fh", name = "ob", descriptor = "I")
    public static int field1012 = 2;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fh", name = "kb", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!fh", name = "nb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
    private class55(int arg0) {
        super(0, true);
        this.field1009 = 4096;
        this.field1009 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method346(byte arg0) {
        field1013 = null;
        field1014 = null;
        field999 = null;
        field1002 = null;
        int var1 = 55 / ((arg0 - -7) / 63);
        field1001 = null;
        field1000 = null;
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)V")
    public static final void method347(int arg0) {
        class192 var1 = (class192) class182.field3549.method145(arg0);
        ++field1008;
        while (var1 != null) {
            if (class61.field1132 == var1.field3792 && !var1.field3790) {
                if (class162.field3107 >= var1.field3784) {
                    var1.method1272(class149.field2756, 0);
                    if (!var1.field3790) {
                        class196.field3840.method910(var1.field3792, var1.field3782, var1.field3793, var1.field3794, 60, var1, 0, -1, false);
                    } else {
                        var1.method1213(9104);
                    }
                }
            } else {
                var1.method1213(9104);
            }
            var1 = (class192) class182.field3549.method152((byte) -127);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field1011;
        int var4 = -19 % ((-60 - arg0) / 36);
        if (~arg2 == -1) {
            this.field1009 = (arg1.method819((byte) 22) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)I")
    public static final int method348(int arg0, int arg1, int arg2) {
        ++field1007;
        if (arg0 != 9326) {
            return 13;
        } else if (~arg1 == 1) {
            return 12345678;
        } else if (~arg1 == 0) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (~arg2 < -127) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 127) * arg2 / 128;
            if (var3 >= 2) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg1 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class55() {
        this(4096);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        if (super.field1192.field75) {
            class97.method581(var3, 0, class147.field2715, this.field1009);
        }
        if (arg1 != 19) {
            return null;
        } else {
            ++field1003;
            return var3;
        }
    }
}
