import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class297 extends class533 {

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
    public static boolean field3663 = false;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Lrga;")
    public static class280 field3662 = new class280(78, -1);

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
    public static int[] field3665 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZB)V")
    public static final void method1653(boolean arg0, byte arg1) {
        class281.field3526 = 0;
        field3664++;
        class201.field2542 = 0;
        class50.method318(arg1 - 32291);
        class594.method3266(arg1 ^ 0xFFFFFFE0, arg0);
        class590.method3247((byte) -78);
        boolean var2 = false;
        for (int var3 = 0; var3 < class201.field2542; var3++) {
            int var5 = class664.field9376[var3];
            class206 var6 = (class206) class180.field2318.method399(-32748, (long) var5);
            class307 var7 = var6.field2618;
            if (class84.field1188 && class602.method3301(var5, (byte) -99)) {
                class670.method3764(-8234);
            }
            if (class133.field1735 != var7.field9659) {
                if (var7.field3902.method3230((byte) -44)) {
                    class361.method1986(var7, (byte) -122);
                }
                var7.method1781(null, 0);
                var2 = true;
                var6.method1871(arg1 + 32);
            }
        }
        if (arg1 != -125) {
            method1653(false, (byte) 98);
        }
        if (var2) {
            class441.field5585 = class180.field2318.method404((byte) -26);
            class180.field2318.method400(class518.field7076, (byte) -93);
        }
        if (class8.field162 != class298.field3671.field8812) {
            throw new RuntimeException("gnp1 pos:" + class298.field3671.field8812 + " psize:" + class8.field162);
        }
        for (int var4 = 0; var4 < class470.field5974; var4++) {
            if (class180.field2318.method399(arg1 - 32623, (long) class153.field1958[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class470.field5974);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lwaa;")
    public abstract class33 method266(byte arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field3662 = null;
        if (arg0 == -23124) {
            field3665 = null;
        }
    }
}
