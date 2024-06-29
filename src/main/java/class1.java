import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lvd;")
    private class5 field2 = null;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    private int field1 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field3 = 0;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lic;")
    private class246 field4;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lja;")
    private class97 field5;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[Lio;")
    private class309[] field6;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z", line = 6)
    public final boolean method1(int arg0, int arg1) {
        if (arg1 != Integer.MAX_VALUE) {
            this.field3 = 74;
        }
        return this.field6[arg0].method56();
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZZIZ)V", line = 16)
    public final void method2(boolean arg0, boolean arg1, int arg2, boolean arg3) {
        boolean var5 = arg0 & this.field4.method1400();
        if (!var5 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (arg3) {
            return;
        }
        if (this.field3 != arg2) {
            if (this.field3 != 0) {
                this.field6[Integer.MAX_VALUE & this.field3].method54();
            }
            if (arg2 != 0) {
                this.field6[arg2 & Integer.MAX_VALUE].method55(arg1);
                this.field6[Integer.MAX_VALUE & arg2].method57(arg1);
            }
            this.field1 = Integer.MIN_VALUE;
            this.field2 = null;
            this.field3 = arg2;
        } else if (this.field3 != 0) {
            this.field6[this.field3 & Integer.MAX_VALUE].method57(arg1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V", line = 56)
    public final void method3(int arg0, int arg1, boolean arg2) {
        if (this.field3 != 0 & (arg2 | this.field1 != arg1)) {
            this.field6[Integer.MAX_VALUE & this.field3].method53(arg1);
            this.field1 = arg1;
        }
        if (arg0 != 21626) {
            this.field3 = -85;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lic;)V", line = 101)
    public class1(class246 arg0) {
        this.field4 = arg0;
        this.field5 = new class97(arg0);
        this.field6 = new class309[9];
        this.field6[1] = new class30(arg0);
        this.field6[2] = new class194(arg0, this.field5);
        this.field6[4] = new class8(arg0, this.field5);
        this.field6[5] = new class466(arg0, this.field5);
        this.field6[6] = new class441(arg0);
        this.field6[7] = new class277(arg0);
        this.field6[3] = new class222(arg0);
        this.field6[8] = this.field6[4];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLvd;)Z", line = 81)
    public final boolean method4(byte arg0, class5 arg1) {
        if (arg0 <= 52) {
            this.field1 = 113;
        }
        if (this.field3 == 0) {
            return false;
        }
        if (this.field2 != arg1) {
            this.field6[Integer.MAX_VALUE & this.field3].method51(arg1);
            this.field2 = arg1;
        }
        return true;
    }
}
