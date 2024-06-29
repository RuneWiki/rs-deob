import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class640 {

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    private int field9213;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[Lcm;")
    private class678[] field9208;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "F")
    public static float field9205;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "J")
    private long field9211;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "Lar;")
    public static class636 field9214;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "Lcm;")
    private class678 field9209;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BJ)Lcm;")
    public final class678 method3641(byte arg0, long arg1) {
        if (arg0 <= 43) {
            return null;
        }
        field9210++;
        this.field9211 = arg1;
        class678 var4 = this.field9208[(int) ((long) (this.field9213 - 1) & arg1)];
        for (this.field9209 = var4.field9624; this.field9209 != var4; this.field9209 = this.field9209.field9624) {
            if (this.field9209.field9628 == arg1) {
                class678 var5 = this.field9209;
                this.field9209 = this.field9209.field9624;
                return var5;
            }
        }
        this.field9209 = null;
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static final void method3642(boolean arg0) {
        field9215++;
        if (!class527.field7429.method2824(-1, class90.field1654) && class432.field6242 != class37.field1046) {
            class138.method1133(11, (byte) -16, false, class287.field4278, class32.field961);
            return;
        }
        class496.method2966(class623.field9017, -32672);
        if (class525.field7400 != class37.field1046) {
            class265.method1735(91);
        }
        if (!arg0) {
            field9205 = -0.055943117F;
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class640(int arg0) {
        this.field9213 = arg0;
        this.field9208 = new class678[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class678 var3 = this.field9208[var2] = new class678();
            var3.field9625 = var3;
            var3.field9624 = var3;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static void method3643(int arg0) {
        field9214 = null;
        if (arg0 != 12197) {
            field9214 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lcm;")
    public final class678 method3644(byte arg0) {
        field9212++;
        if (arg0 >= -50) {
            this.field9211 = -59L;
        }
        if (this.field9209 == null) {
            return null;
        }
        class678 var2 = this.field9208[(int) ((long) (this.field9213 - 1) & this.field9211)];
        while (this.field9209 != var2) {
            if (this.field9209.field9628 == this.field9211) {
                class678 var3 = this.field9209;
                this.field9209 = this.field9209.field9624;
                return var3;
            }
            this.field9209 = this.field9209.field9624;
        }
        this.field9209 = null;
        return null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
    public static final void method3645(boolean arg0) {
        if (arg0) {
            method3642(true);
        }
        field9207++;
        client.method1808(-114);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IJLcm;)V")
    public final void method3646(int arg0, long arg1, class678 arg2) {
        if (arg0 > -96) {
            method3642(true);
        }
        if (arg2.field9625 != null) {
            arg2.method3813(111);
        }
        field9216++;
        class678 var5 = this.field9208[(int) ((long) (this.field9213 - 1) & arg1)];
        arg2.field9624 = var5;
        arg2.field9625 = var5.field9625;
        arg2.field9625.field9624 = arg2;
        arg2.field9624.field9625 = arg2;
        arg2.field9628 = arg1;
    }
}
