import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class465 {

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public int field6784 = -1;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "Lqg;")
    public static class266 field6786 = new class266();

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Lcb;")
    public static class631 field6787 = new class631(53, 2);

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Lsw;")
    public class603 field6785;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "[I")
    public int[] field6780;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "[I")
    public static int[] field6788;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field6783;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2853(int arg0) {
        field6782++;
        if (arg0 != 256 || class55.field885 != null && class3.field18 != null) {
            return;
        }
        class55.field885 = new int[256];
        class3.field18 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class55.field885[var1] = (int) (Math.sin(var2) * 4096.0D);
            class3.field18[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Laia;", line = 45)
    public static final class257 method2854(int arg0, int arg1) {
        field6779++;
        class257[] var2 = class93.method779((byte) 30);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class257 var4 = var2[var3];
            if (var4.field4040 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 73)
    public static void method2855(int arg0) {
        field6787 = null;
        if (arg0 != 1) {
            field6786 = null;
        }
        field6788 = null;
        field6786 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZLjava/lang/String;BILjava/lang/String;)V", line = 85)
    public static final void method2856(boolean arg0, String arg1, byte arg2, int arg3, String arg4) {
        field6781++;
        class540 var5 = class91.method771(false);
        var5.field7707.method1926(class511.field7432.field1540, 65280);
        var5.field7707.method1939(0, 1134947720);
        int var6 = var5.field7707.field4534;
        var5.field7707.method1939(635, 1134947720);
        int[] var7 = class595.method3407(2, var5);
        if (arg2 != -112) {
            field6787 = null;
        }
        int var8 = var5.field7707.field4534;
        var5.field7707.method1931(124, arg1);
        var5.field7707.method1939(class459.field6658, arg2 ^ 0xBC5A1218);
        var5.field7707.method1931(118, arg4);
        var5.field7707.method1964(class183.field3094, (byte) 127);
        var5.field7707.method1926(class467.field6804, 65280);
        var5.field7707.method1926(class519.field7498.field4494, 65280);
        class247.method1705(var5.field7707, arg2 ^ 0xFFFFE63F);
        String var9 = class463.field6747;
        var5.field7707.method1926(var9 == null ? 0 : 1, 65280);
        if (var9 != null) {
            var5.field7707.method1931(122, var9);
        }
        var5.field7707.method1926(arg3, 65280);
        var5.field7707.method1926(arg0 ? 1 : 0, 65280);
        var5.field7707.field4534 += 7;
        var5.field7707.method1940(var5.field7707.field4534, var8, -32265, var7);
        var5.field7707.method1973(false, var5.field7707.field4534 - var6);
        class756.method4211(var5, 126);
        class594.field8336 = 1;
        class184.field3104 = 0;
        class751.field10468 = -3;
        class551.field7854 = 0;
        if (arg3 < 13) {
            class676.field9541 = true;
            class281.method1851((byte) -116);
        }
    }
}
