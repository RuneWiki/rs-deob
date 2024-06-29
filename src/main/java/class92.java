import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class92 {

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "Lfba;")
    public static class27 field1037 = new class27(26, 2);

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    public int field1031;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BZ)V", line = 3)
    public static final void method681(byte arg0, boolean arg1) {
        if (arg1 && class117.field1791 != null) {
            class184.field2831 = class117.field1791.field10442;
        } else {
            class184.field2831 = -1;
        }
        field1036++;
        class197.field3016 = 0;
        class117.field1791 = null;
        class120.field1850 = null;
        class776.field10670 = null;
        class117.method887();
        class117.field1801.method1729((byte) 47);
        class67.field823 = -1;
        class138.field2063 = -1;
        class109.field1610 = null;
        class145.field2117 = null;
        class117.field1798 = null;
        class276.field4019 = null;
        if (arg0 >= -80) {
            field1035 = 23;
        }
        class139.field2068 = null;
        class695.field9708 = null;
        class244.field3627 = null;
        class193.field2977 = null;
        class375.field5183 = null;
        class704.field9814 = null;
        if (class117.field1786 != null) {
            class117.field1786.method1234(true);
            class117.field1786.method1237(128, 0, 64);
        }
        if (class117.field1788 != null) {
            class117.field1788.method4321(1, 64, 64);
        }
        if (class117.field1785 != null) {
            class117.field1785.method3918(64, (byte) 101);
        }
        class95.field1084.method1421(1, 64);
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)[I", line = 53)
    public static final int[] method682(boolean arg0) {
        field1034++;
        return arg0 ? null : new int[] { class523.field7389, class502.field7113, class220.field3416 };
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 70)
    public static void method683(int arg0) {
        field1037 = null;
        if (arg0 != 64) {
            method682(true);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILso;)Ltv;", line = 80)
    public static final class585 method684(int arg0, class494 arg1) {
        field1029++;
        int var2 = -20 % ((2 - arg0) / 58);
        arg1.method2964((byte) 79);
        int var3 = arg1.method2964((byte) 67);
        class585 var4 = class779.method4283(var3, (byte) 84);
        var4.field8260 = arg1.method2964((byte) 57);
        int var5 = arg1.method2964((byte) 67);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.method2964((byte) 79);
            var4.method54(arg1, 1, var7);
        }
        var4.method52(-4096);
        return var4;
    }
}
