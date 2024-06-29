import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class738 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    private int field9983;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "[Lkh;")
    private class173[] field9994;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field9988 = 0;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field9985;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field9990;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "J")
    private long field9986;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lkh;")
    private class173 field9992;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "Lph;")
    public static class632 field9993;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "[I")
    public static int[] field9984;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public static void method4005(boolean arg0) {
        if (!arg0) {
            field9993 = null;
            field9984 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Luaa;")
    public static final class391 method4006(int arg0, int arg1) {
        field9989++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class647.field8259[var2] == null || class647.field8259[var2][var3] == null) {
            boolean var4 = class683.method3667(var2, -79);
            if (!var4) {
                return null;
            }
        }
        return arg0 <= 12 ? null : class647.field8259[var2][var3];
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BJ)Lkh;")
    public final class173 method4007(byte arg0, long arg1) {
        field9991++;
        this.field9986 = arg1;
        class173 var4 = this.field9994[(int) ((long) (this.field9983 - 1) & arg1)];
        for (this.field9992 = var4.field2279; this.field9992 != var4; this.field9992 = this.field9992.field2279) {
            if (this.field9992.field2278 == arg1) {
                class173 var6 = this.field9992;
                this.field9992 = this.field9992.field2279;
                return var6;
            }
        }
        int var5 = -102 / ((12 - arg0) / 33);
        this.field9992 = null;
        return null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(JLkh;I)V")
    public final void method4008(long arg0, class173 arg1, int arg2) {
        int var5 = -83 % ((9 - arg2) / 47);
        if (arg1.field2282 != null) {
            arg1.method1084((byte) 6);
        }
        field9987++;
        class173 var6 = this.field9994[(int) ((long) (this.field9983 - 1) & arg0)];
        arg1.field2279 = var6;
        arg1.field2282 = var6.field2282;
        arg1.field2282.field2279 = arg1;
        arg1.field2278 = arg0;
        arg1.field2279.field2282 = arg1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)Lkh;")
    public final class173 method4009(int arg0) {
        field9985++;
        if (arg0 < 13) {
            this.field9992 = null;
        }
        if (this.field9992 == null) {
            return null;
        }
        class173 var2 = this.field9994[(int) (this.field9986 & (long) (this.field9983 - 1))];
        while (this.field9992 != var2) {
            if (this.field9992.field2278 == this.field9986) {
                class173 var3 = this.field9992;
                this.field9992 = this.field9992.field2279;
                return var3;
            }
            this.field9992 = this.field9992.field2279;
        }
        this.field9992 = null;
        return null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
    public static final void method4010(int arg0, int arg1, int arg2) {
        class524.field6671 = arg2;
        int var3 = -79 % ((-arg1 - 29) / 43);
        class134.field1779 = arg0;
        field9990++;
        if (class596.field7567 == 0) {
            class669.field8694 = class230.field3093 * 2 + class134.field1779;
            class386.field4933 = class296.field3757 * 2 + class524.field6671;
        } else if (class596.field7567 == 1) {
            class66.field867 = class134.field1779 / class65.field852 + class618.field7834 + 2;
            class449.field5867 = class524.field6671 / class422.field5550 + class790.field10823 + 2;
            class386.field4933 = class449.field5867 * class422.field5550;
            class669.field8694 = class66.field867 * class65.field852;
            class296.field3757 = class386.field4933 - class524.field6671 >> 1;
            class230.field3093 = class669.field8694 - class134.field1779 >> 1;
            return;
        } else if (class596.field7567 == 2) {
            class386.field4933 = class524.field6671;
            class669.field8694 = class134.field1779;
            return;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V")
    public class738(int arg0) {
        this.field9983 = arg0;
        this.field9994 = new class173[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class173 var3 = this.field9994[var2] = new class173();
            var3.field2282 = var3;
            var3.field2279 = var3;
        }
    }
}
