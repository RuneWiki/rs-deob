import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class275 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[Lds;")
    private class225[] field3982;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Z")
    public static boolean field3987 = false;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
    public static boolean field3984 = true;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "J")
    private long field3983;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lds;")
    private class225 field3988;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lh;")
    public static class427 field3980;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ltj;")
    public static class429 field3979;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lds;JI)V", line = 4)
    public final void method1895(class225 arg0, long arg1, int arg2) {
        if (arg0.field2958 != null) {
            arg0.method1302(true);
        }
        field3986++;
        class225 var5 = this.field3982[(int) ((long) (this.field3977 - 1) & arg1)];
        if (arg2 != -11387) {
            this.field3988 = null;
        }
        arg0.field2958 = var5.field2958;
        arg0.field2961 = var5;
        arg0.field2958.field2961 = arg0;
        arg0.field2961.field2958 = arg0;
        arg0.field2962 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1896(int arg0) {
        class404.method2604(0, (long) class28.field418, class61.field807);
        field3981++;
        if (class329.field4790 != -1) {
            class388.method2499(1, class329.field4790);
        }
        int var1 = 0;
        if (arg0 >= -41) {
            field3989 = 105;
        }
        while (var1 < class1.field13) {
            if (class270.field3927[var1]) {
                class57.field775[var1] = true;
            }
            class140.field1920[var1] = class270.field3927[var1];
            class270.field3927[var1] = false;
            var1++;
        }
        class124.field1747 = class28.field418;
        if (class61.field807.method1720()) {
            class28.field410 = true;
        }
        class146.field2002 = null;
        if (class329.field4790 != -1) {
            class1.field13 = 0;
            class23.method156(3);
        }
        class61.field807.method1652();
        class78.method567(-1, class139.field1909);
        class379.field5514 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 80)
    public static void method1897(byte arg0) {
        field3980 = null;
        if (arg0 != -123) {
            field3987 = true;
        }
        field3979 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lds;", line = 101)
    public final class225 method1898(boolean arg0) {
        field3978++;
        if (this.field3988 == null) {
            return null;
        }
        if (arg0) {
            this.method1899(-60, -5L);
        }
        class225 var2 = this.field3982[(int) ((long) (this.field3977 - 1) & this.field3983)];
        while (this.field3988 != var2) {
            if (this.field3988.field2962 == this.field3983) {
                class225 var3 = this.field3988;
                this.field3988 = this.field3988.field2961;
                return var3;
            }
            this.field3988 = this.field3988.field2961;
        }
        this.field3988 = null;
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 140)
    public class275(int arg0) {
        this.field3977 = arg0;
        this.field3982 = new class225[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class225 var3 = this.field3982[var2] = new class225();
            var3.field2958 = var3;
            var3.field2961 = var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)Lds;", line = 171)
    public final class225 method1899(int arg0, long arg1) {
        field3985++;
        this.field3983 = arg1;
        int var4 = 94 / ((arg0 - 55) / 47);
        class225 var5 = this.field3982[(int) (arg1 & (long) (this.field3977 - 1))];
        for (this.field3988 = var5.field2961; this.field3988 != var5; this.field3988 = this.field3988.field2961) {
            if (this.field3988.field2962 == arg1) {
                class225 var6 = this.field3988;
                this.field3988 = this.field3988.field2961;
                return var6;
            }
        }
        this.field3988 = null;
        return null;
    }
}
