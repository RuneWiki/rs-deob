import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class698 {

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    private int field9822 = 0;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    private int field9824 = 0;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    private int field9818 = 0;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lac;")
    private class541 field9820;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Ldja;")
    private class311 field9825;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "[Lkd;")
    private class283[] field9823;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lws;")
    public class361 field9815;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field9826 = 0;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9827 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Lea;")
    public static class547 field9817 = new class547(39, 17);

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field9828 = -2;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field9829 = 52;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "[Lofa;")
    public static class332[] field9830 = new class332[37];

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public static void method3947(boolean arg0) {
        field9830 = null;
        if (arg0) {
            method3947(false);
        }
        field9827 = null;
        field9817 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Z")
    public final boolean method3948(int arg0, int arg1) {
        if (arg1 == -6634) {
            field9816++;
            return this.field9823[arg0].method138(31565);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZZIIZI)V")
    public final void method3949(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        boolean var7 = arg1 & this.field9820.method346();
        if (!arg4) {
            return;
        }
        field9821++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg2 = arg3;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg0) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field9822 != arg5) {
            if (this.field9822 != 0) {
                this.field9823[this.field9822 & Integer.MAX_VALUE].method144((byte) 61);
            }
            if (arg5 != 0) {
                this.field9823[arg5 & Integer.MAX_VALUE].method141(!arg4, arg0);
                this.field9823[Integer.MAX_VALUE & arg5].method142(arg0, 255);
                this.field9823[Integer.MAX_VALUE & arg5].method137(arg3, arg2, -51);
            }
            this.field9818 = arg3;
            this.field9824 = arg2;
            this.field9822 = arg5;
        } else if (this.field9822 != 0) {
            this.field9823[Integer.MAX_VALUE & this.field9822].method142(arg0, 255);
            if (this.field9818 != arg3 || this.field9824 != arg2) {
                this.field9823[Integer.MAX_VALUE & this.field9822].method137(arg3, arg2, -57);
                this.field9824 = arg2;
                this.field9818 = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lcu;ZI)Z")
    public final boolean method3950(class221 arg0, boolean arg1, int arg2) {
        field9819++;
        if (this.field9822 == 0) {
            return false;
        } else {
            this.field9823[Integer.MAX_VALUE & this.field9822].method140(arg0, arg1, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lac;)V")
    public class698(class541 arg0) {
        this.field9820 = arg0;
        this.field9825 = new class311(arg0);
        this.field9823 = new class283[10];
        this.field9823[1] = new class578(arg0);
        this.field9823[2] = new class213(arg0, this.field9825);
        this.field9823[4] = new class102(arg0, this.field9825);
        this.field9823[5] = new class460(arg0, this.field9825);
        this.field9823[6] = new class31(arg0);
        this.field9823[7] = new class443(arg0);
        this.field9823[3] = this.field9815 = new class361(arg0);
        this.field9823[8] = new class415(arg0, this.field9825);
        this.field9823[9] = new class337(arg0, this.field9825);
        if (!this.field9823[8].method138(31565)) {
            this.field9823[8] = this.field9823[4];
        }
        if (!this.field9823[9].method138(31565)) {
            this.field9823[9] = this.field9823[8];
        }
    }
}
