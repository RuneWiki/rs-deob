import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class109 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lma;")
    private class271 field1879 = new class271();

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lwa;")
    private static class75 field1884 = class66.method560(" <col=ffffff>", false);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lcb;")
    public static class267 field1877;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lma;")
    private class271 field1882;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[[B")
    public static byte[][] field1876;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 6)
    public static void method852(int arg0) {
        field1877 = null;
        if (arg0 == -5346) {
            field1884 = null;
            field1876 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lma;", line = 21)
    public final class271 method853(byte arg0) {
        if (arg0 <= 40) {
            return (class271) null;
        }
        class271 var2 = this.field1879.field4683;
        field1881++;
        if (this.field1879 == var2) {
            return null;
        } else {
            var2.method1937(121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLma;)V", line = 43)
    public final void method854(boolean arg0, class271 arg1) {
        if (arg1.field4689 != null) {
            arg1.method1937(83);
        }
        arg1.field4683 = this.field1879;
        field1874++;
        arg1.field4689 = this.field1879.field4689;
        if (!arg0) {
            this.field1882 = (class271) null;
        }
        arg1.field4689.field4683 = arg1;
        arg1.field4683.field4689 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 63)
    public final void method855(int arg0) {
        int var2 = -63 % ((arg0 - 8) / 55);
        field1883++;
        while (true) {
            class271 var3 = this.field1879.field4683;
            if (this.field1879 == var3) {
                this.field1882 = null;
                return;
            }
            var3.method1937(53);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lwa;", line = 88)
    public static final class75 method856(int arg0, int arg1) {
        class75 var2 = class67.method565(77, arg0);
        field1880++;
        for (int var3 = var2.method640(1) - 3; var3 > 0; var3 -= 3) {
            var2 = class66.method562((byte) -91, new class75[] { var2.method661(85, 0, var3), class276.field4743, var2.method650(0, var3) });
        }
        if (var2.method640(1) > 9) {
            return class66.method562((byte) 126, new class75[] { class204.field3455, var2.method661(102, 0, var2.method640(1) - 8), class166.field2800, class13.field180, var2, class187.field3123 });
        } else if (var2.method640(1) <= 6) {
            if (arg1 < 52) {
                method852(69);
            }
            return class66.method562((byte) 126, new class75[] { class170.field2858, var2, class211.field3593 });
        } else {
            return class66.method562((byte) -71, new class75[] { field1884, var2.method661(109, 0, var2.method640(1) - 4), class8.field107, class13.field180, var2, class187.field3123 });
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Lma;", line = 118)
    public final class271 method857(byte arg0) {
        class271 var2 = this.field1879.field4683;
        field1875++;
        if (arg0 != -35) {
            this.method859(-1);
        }
        if (this.field1879 == var2) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var2.field4683;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)I", line = 140)
    public static final int method858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 9) {
            return 117;
        }
        field1878++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg1 : arg3);
        int var7 = var5 < 8 ? arg1 : arg0;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 196)
    public class109() {
        this.field1879.field4689 = this.field1879;
        this.field1879.field4683 = this.field1879;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lma;", line = 167)
    public final class271 method859(int arg0) {
        field1873++;
        if (arg0 != 27260) {
            this.field1879 = (class271) null;
        }
        class271 var2 = this.field1882;
        if (this.field1879 == var2) {
            this.field1882 = null;
            return null;
        } else {
            this.field1882 = var2.field4683;
            return var2;
        }
    }
}
