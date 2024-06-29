import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class298 extends class285 {

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lih;")
    public class30 field5093;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "Z")
    public static boolean field5096 = true;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "Z")
    public static boolean field5094 = true;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "[I")
    public static int[] field5098;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "[Ljl;")
    public static class253[] field5099;

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lih;)V", line = 3)
    public class298(class30 arg0) {
        this.field5093 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V", line = 22)
    public static void method2093(byte arg0) {
        field5099 = null;
        field5098 = null;
        if (arg0 <= 18) {
            field5099 = (class253[]) null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V", line = 38)
    public static final void method2094(byte arg0, int arg1, int arg2) {
        field5097++;
        if (arg0 >= -102) {
            field5095 = -102;
        }
        class203 var3 = class16.field230[client.field4039][arg2][arg1];
        if (var3 == null) {
            class291.method2055(client.field4039, arg2, arg1);
            return;
        }
        class159 var4 = null;
        class159 var5 = (class159) var3.method1471((byte) -105);
        int var6 = -99999999;
        while (var5 != null) {
            class192 var7 = class132.method990((byte) -119, var5.field2690.field2859);
            int var8 = var7.field3122;
            if (var7.field3066 == 1) {
                var8 = (var5.field2690.field2853 + 1) * var8;
            }
            if (var8 > var6) {
                var4 = var5;
                var6 = var8;
            }
            var5 = (class159) var3.method1475((byte) 83);
        }
        if (var4 == null) {
            class291.method2055(client.field4039, arg2, arg1);
            return;
        }
        class173 var9 = null;
        class173 var10 = null;
        var3.method1469(82, var4);
        for (class159 var11 = (class159) var3.method1471((byte) -81); var11 != null; var11 = (class159) var3.method1475((byte) 83)) {
            class173 var12 = var11.field2690;
            if (var4.field2690.field2859 != var12.field2859) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field2859 != var12.field2859 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        long var13 = (long) (arg2 + (arg1 << 7) + 1610612736);
        class218.method1545(client.field4039, arg2, arg1, class113.method861((byte) -82, arg2 * 128 + 64, arg1 * 128 + 64, client.field4039), var4.field2690, var13, var9, var10);
    }
}
