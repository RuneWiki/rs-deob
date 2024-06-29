import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class643 {

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field9355;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field9348;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Ltf;")
    public class643 field9350;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lm;")
    public class105 field9344;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field9345;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field9347;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field9353;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Li;")
    public final class251 method3704(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field9349++;
            return class362.method2189(this.field9348, true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
    public static final boolean method3705(int arg0) {
        field9352++;
        if (class61.field852) {
            try {
                class630.method3564(class270.field3976.field549, "showVideoAd", (byte) -91);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 >= -6) {
            method3706(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
    public static final void method3706(boolean arg0) {
        field9354++;
        if (arg0) {
            return;
        }
        class7 var1 = (class7) class360.field5112.method427(true);
        boolean var2 = class311.field4557 != null || class551.field7807 > 0;
        if (var2) {
            class359.field5100 = 1;
        }
        if (class99.field1724 && class404.field6022.method2183(81, false) && class480.field6825 > 2) {
            if (var2) {
                class361.field5125 = (class587) class432.field6356.field659.field1800.field1800;
            } else {
                class127.method1001(82, (class587) class432.field6356.field659.field1800.field1800, var1.method26(true), var1.method27(arg0));
            }
        } else if (var2) {
            class361.field5125 = (class587) class432.field6356.field659.field1800;
        } else {
            class127.method1001(82, (class587) class432.field6356.field659.field1800, var1.method26(true), var1.method27(false));
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)Ltf;")
    public final class643 method3707(byte arg0, int arg1) {
        int var3 = 73 % ((arg0 + 43) / 57);
        field9351++;
        return new class643(this.field9348, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
    public class643(int arg0, int arg1) {
        this.field9355 = arg1;
        this.field9348 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z[FI)[F")
    public static final float[] method3708(boolean arg0, float[] arg1, int arg2) {
        field9346++;
        float[] var3 = new float[arg2];
        if (!arg0) {
            method3705(-112);
        }
        class164.method1150(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ltf;I)V")
    public class643(class643 arg0, int arg1) {
        this.field9350 = arg0;
        this.field9355 = this.field9350.field9355 + arg1;
        this.field9344 = this.field9350.field9344;
        this.field9348 = this.field9350.field9348;
    }
}
