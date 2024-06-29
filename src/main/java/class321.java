import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class321 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "B")
    private byte field4129;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lpi;")
    public static class340 field4134 = new class340(20, 3);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lpi;")
    public static class340 field4138 = new class340(81, 8);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method1917(boolean arg0, int arg1) {
        field4135++;
        if (arg1 != 8) {
            method1917(true, 16);
        }
        for (class72 var2 = (class72) class315.field4060.method49(arg1 ^ 0x4F); var2 != null; var2 = (class72) class315.field4060.method46((byte) 57)) {
            if (var2.field886 != null) {
                class18.field313.method1890(var2.field886);
                var2.field886 = null;
            }
            if (var2.field893 != null) {
                class18.field313.method1890(var2.field893);
                var2.field893 = null;
            }
            var2.method3021(-106);
        }
        if (!arg0) {
            return;
        }
        for (class72 var3 = (class72) class368.field4741.method49(-111); var3 != null; var3 = (class72) class368.field4741.method46((byte) 46)) {
            if (var3.field886 != null) {
                class18.field313.method1890(var3.field886);
                var3.field886 = null;
            }
            var3.method3021(arg1 ^ 0x5F);
        }
        for (class72 var4 = (class72) class157.field2072.method2087(arg1 - 8); var4 != null; var4 = (class72) class157.field2072.method2091(arg1 ^ 0xFFFFFF88)) {
            if (var4.field886 != null) {
                class18.field313.method1890(var4.field886);
                var4.field886 = null;
            }
            var4.method3021(41);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I", line = 70)
    public final int method1918(byte arg0) {
        field4127++;
        return arg0 == 48 ? this.field4129 & 0x7 : -97;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I", line = 88)
    public final int method1919(int arg0) {
        field4131++;
        if (arg0 != -14119) {
            this.field4136 = -69;
        }
        return (this.field4129 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 108)
    public static void method1920(int arg0) {
        field4134 = null;
        field4138 = null;
        if (arg0 > -112) {
            method1917(false, -14);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 120)
    public class321() {
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lbt;)V", line = 125)
    public class321(class88 arg0) {
        this.field4129 = arg0.method575(-59);
        this.field4137 = arg0.method568((byte) 110);
        this.field4128 = arg0.method578(97);
        this.field4133 = arg0.method578(112);
        this.field4136 = arg0.method578(99);
        this.field4132 = arg0.method578(99);
    }
}
