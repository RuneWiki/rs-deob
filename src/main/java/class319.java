import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class319 {

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    private int field5391;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[Ljj;")
    private class29[] field5388;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Z")
    public static boolean field5389 = false;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field5393 = 0;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lph;")
    public static class229 field5397 = class266.method1858("<img=1>", 0);

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "J")
    private long field5387;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Ljj;")
    private class29 field5400;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Lsi;")
    public static class66 field5395;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)Ljj;", line = 5)
    public final class29 method2153(int arg0, long arg1) {
        field5392++;
        this.field5387 = arg1;
        if (arg0 != 3) {
            this.field5400 = (class29) null;
        }
        class29 var4 = this.field5388[(int) (arg1 & (long) (this.field5391 - 1))];
        for (this.field5400 = var4.field467; this.field5400 != var4; this.field5400 = this.field5400.field467) {
            if (this.field5400.field468 == arg1) {
                class29 var5 = this.field5400;
                this.field5400 = this.field5400.field467;
                return var5;
            }
        }
        this.field5400 = null;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBILri;)V", line = 38)
    public static final void method2154(int arg0, int arg1, byte arg2, int arg3, class301 arg4) {
        if (class99.field1675) {
            class212.method1502(arg0, arg1, arg4.field4923 + arg0, arg4.field4882 + arg1);
        }
        field5394++;
        int var5 = -64 % ((arg2 + 58) / 49);
        if (class7.field97 >= 3) {
            if (class99.field1675) {
                class293 var6 = arg4.method2032((byte) 5, false);
                if (var6 != null) {
                    var6.method653(arg0, arg1);
                }
            } else {
                class210.method1469(arg0, arg1, 0, arg4.field4886, arg4.field4974);
            }
        } else if (class99.field1675) {
            ((class87) class234.field3864).method643(arg0, arg1, arg4.field4923, arg4.field4882, class234.field3864.field4785 / 2, class234.field3864.field4786 / 2, class147.field2379, 256, (class87) arg4.method2032((byte) 5, false));
        } else {
            ((class327) class234.field3864).method1958(arg0, arg1, arg4.field4923, arg4.field4882, class234.field3864.field4785 / 2, class234.field3864.field4786 / 2, class147.field2379, 256, arg4.field4886, arg4.field4974);
        }
        class189.field3067[arg3] = true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILsi;)V", line = 77)
    public static final void method2155(int arg0, class66 arg1) {
        field5398++;
        if (arg0 != -924) {
            field5395 = (class66) null;
        }
        class88.field1500 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)I", line = 108)
    public static final int method2156(int arg0, byte arg1, int arg2) {
        class285 var3 = (class285) class243.field4004.method713(3365, (long) arg0);
        if (arg1 > -105) {
            return -96;
        }
        field5399++;
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field4696.length > arg2) {
            return var3.field4696[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 127)
    public static void method2157(int arg0) {
        field5397 = null;
        if (arg0 != 3) {
            field5395 = (class66) null;
        }
        field5395 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Ljj;", line = 163)
    public final class29 method2158(int arg0) {
        field5390++;
        if (this.field5400 == null) {
            return null;
        }
        class29 var2 = this.field5388[(int) ((long) (this.field5391 + arg0) & this.field5387)];
        while (this.field5400 != var2) {
            if (this.field5400.field468 == this.field5387) {
                class29 var3 = this.field5400;
                this.field5400 = this.field5400.field467;
                return var3;
            }
            this.field5400 = this.field5400.field467;
        }
        this.field5400 = null;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJLjj;)V", line = 194)
    public final void method2159(byte arg0, long arg1, class29 arg2) {
        field5396++;
        if (arg2.field473 != null) {
            arg2.method224(128);
        }
        class29 var5 = this.field5388[(int) (arg1 & (long) (this.field5391 - 1))];
        arg2.field467 = var5;
        arg2.field473 = var5.field473;
        arg2.field473.field467 = arg2;
        arg2.field467.field473 = arg2;
        int var6 = -44 / ((arg0 + 28) / 60);
        arg2.field468 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V", line = 211)
    public class319(int arg0) {
        this.field5391 = arg0;
        this.field5388 = new class29[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class29 var3 = this.field5388[var2] = new class29();
            var3.field467 = var3;
            var3.field473 = var3;
        }
    }
}
