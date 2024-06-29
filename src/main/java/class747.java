import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class747 {

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "Lkba;")
    private class105 field10447 = new class105();

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "Lqaa;")
    public static class27 field10445 = new class27(3, 7);

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
    public static int field10450;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field10454;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "Lkba;")
    private class105 field10456;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Lkr;")
    public static class743 field10449;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Lkba;")
    public final class105 method4151(int arg0) {
        field10444++;
        class105 var2 = this.field10456;
        if (this.field10447 == var2) {
            this.field10456 = null;
            return null;
        }
        if (arg0 != 7) {
            field10449 = null;
        }
        this.field10456 = var2.field1750;
        return var2;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lkba;I)V")
    public final void method4152(class105 arg0, int arg1) {
        if (arg1 != 0) {
            this.method4160((byte) -70);
        }
        field10452++;
        if (arg0.field1746 != null) {
            arg0.method909(3);
        }
        arg0.field1746 = this.field10447.field1746;
        arg0.field1750 = this.field10447;
        arg0.field1746.field1750 = arg0;
        arg0.field1750.field1746 = arg0;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public static final void method4153(byte arg0) {
        class555.field7774.method3048(false);
        field10448++;
        int var1 = -95 % ((-arg0 - 4) / 49);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)Z")
    public final boolean method4154(int arg0) {
        if (arg0 != 7) {
            this.method4157((byte) 82);
        }
        field10450++;
        return this.field10447.field1750 == this.field10447;
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)Lkba;")
    public final class105 method4155(int arg0) {
        field10443++;
        class105 var2 = this.field10447.field1746;
        if (this.field10447 == var2) {
            this.field10456 = null;
            return null;
        } else {
            this.field10456 = var2.field1746;
            return arg0 == 3 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)V")
    public static void method4156(int arg0) {
        field10445 = null;
        field10449 = null;
        int var1 = -6 / ((arg0 - 10) / 49);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)Lkba;")
    public final class105 method4157(byte arg0) {
        field10451++;
        class105 var2 = this.field10447.field1750;
        if (this.field10447 == var2) {
            return null;
        }
        var2.method909(-96);
        if (arg0 != 40) {
            this.field10447 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)I")
    public final int method4158(int arg0) {
        int var2 = -126 / ((-arg0 - 60) / 51);
        field10455++;
        int var3 = 0;
        class105 var4 = this.field10447.field1750;
        while (this.field10447 != var4) {
            var4 = var4.field1750;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "(I)Lkba;")
    public final class105 method4159(int arg0) {
        field10453++;
        if (arg0 != 0) {
            this.field10447 = null;
        }
        class105 var2 = this.field10447.field1750;
        if (this.field10447 == var2) {
            this.field10456 = null;
            return null;
        } else {
            this.field10456 = var2.field1750;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(B)V")
    public final void method4160(byte arg0) {
        if (arg0 != -77) {
            this.method4157((byte) 85);
        }
        field10454++;
        while (true) {
            class105 var2 = this.field10447.field1750;
            if (this.field10447 == var2) {
                this.field10456 = null;
                return;
            }
            var2.method909(-108);
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class747() {
        this.field10447.field1746 = this.field10447;
        this.field10447.field1750 = this.field10447;
    }
}
