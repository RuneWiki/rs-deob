import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class346 {

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public int field5145 = 443;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public int field5150 = 43594;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Z")
    public boolean field5146 = false;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "Ljp;")
    public static class55 field5148 = new class55(23, 7);

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "[I")
    public static int[] field5153 = new int[256];

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lpn;")
    public static class49 field5152 = new class49(6, -1);

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field5154 = 0;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Ljava/lang/String;")
    public String field5144;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
    public final int method2221(int arg0) {
        field5149++;
        if (arg0 == 1615737763) {
            return this.field5146 ? this.field5145 : this.field5150;
        } else {
            return -10;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lmu;B)Z")
    public final boolean method2222(class346 arg0, byte arg1) {
        int var3 = 116 % ((39 - arg1) / 56);
        field5147++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field5143 == arg0.field5143 && this.field5144.equals(arg0.field5144);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public static void method2223(int arg0) {
        field5153 = null;
        field5152 = null;
        field5148 = null;
        if (arg0 > -84) {
            method2223(-19);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static final void method2224(boolean arg0) {
        field5151++;
        if (arg0) {
            method2223(-83);
        }
        if (class36.method238(2, class460.field6813) || class242.method1638(class460.field6813, 1)) {
            class377.method2404(-61, class128.field1917 >> 10, 5000, class406.field5999 >> 10);
        } else {
            int var1 = class116.field1781.field7654[0] >> 3;
            int var2 = class116.field1781.field7653[0] >> 3;
            if (var1 >= 0 && (class338.field5076 >> 3) > var1 && var2 >= 0 && class250.field4077 >> 3 > var2) {
                class377.method2404(-41, var1, 5000, var2);
            } else {
                class377.method2404(-50, class338.field5076 >> 4, 0, class250.field4077 >> 4);
            }
        }
        class114.method872(-12500);
        class222.method1540((byte) 87);
        class162.method1160(34336);
        class32.method195(-1);
    }
}
