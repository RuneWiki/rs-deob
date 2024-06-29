import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class194 implements class686 {

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "[F")
    public float[] field2868;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lin;")
    public static class91 field2863;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1384(byte arg0) {
        field2865++;
        if (class184.field2784 == -1) {
            return;
        }
        int var1 = class284.field3963.method574(true);
        int var2 = class284.field3963.method571((byte) 72);
        class19 var3 = (class19) class494.field6832.method1269(4);
        if (var3 != null) {
            var1 = var3.method143((byte) -128);
            var2 = var3.method146(58);
        }
        int var4 = 0;
        if (arg0 != -73) {
            field2864 = 105;
        }
        int var5 = 0;
        if (class241.field3529) {
            var4 = class146.method1163((byte) -128);
            var5 = class313.method2035(false);
        }
        class117.method1027(class184.field2784, var4, var4, class467.field6559 + var4, var2, var1, -1391, var1 + var4, class582.field7968 + var5, var5, var2 + var5, var5);
        if (class445.field6321 != null) {
            class559.method3212(0, var2 + var5, var1 + var4);
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V", line = 53)
    public static void method1385(byte arg0) {
        if (arg0 != -64) {
            method1385((byte) -48);
        }
        field2863 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(II)V", line = 62)
    public class194(int arg0, int arg1) {
        this.field2866 = arg1;
        this.field2862 = arg0;
        this.field2868 = new float[arg0 * arg1];
    }
}
