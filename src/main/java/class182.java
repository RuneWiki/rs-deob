import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class182 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lag;")
    public class469 field2540;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public static int[] field2539 = new int[1];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lwo;")
    public static class445 field2542 = new class445();

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ltt;")
    public static class338 field2543 = new class338(50, 2);

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZ)V")
    public abstract void method84(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILqv;)V")
    public static final void method1213(int arg0, int arg1, int arg2, int arg3, class98 arg4) {
        class207 var5 = class549.method3077(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field398 = (arg1 << class62.field762) + class332.field4443;
        arg4.field388 = arg3;
        arg4.field397 = (arg2 << class62.field762) + class332.field4443;
        if (var5.field2765 != null) {
            arg4.field388 -= var5.field2765.field3534;
        }
        var5.field2769 = arg4;
        int var6 = class446.field5914 == class246.field3214 ? 1 : 0;
        if (arg4.method161(28602)) {
            if (arg4.method168(20071)) {
                class648.field8957[var6][class629.field8709[var6]++] = arg4;
                return;
            }
            class150.field2058[var6][class57.field730[var6]++] = arg4;
            return;
        }
        class100.field1206[var6][class189.field2627[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIB)Z")
    public static final boolean method1214(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2541++;
        int var6 = arg1;
        if (arg5 > -122) {
            return true;
        }
        while (arg3 >= var6) {
            for (int var7 = arg2; var7 <= arg0; var7++) {
                if (class59.field744[var6][var7] == arg4 && class8.field68[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
    public abstract void method79(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field2542 = null;
        field2539 = null;
        field2543 = null;
        if (arg0 <= 67) {
            method1214(-49, -91, 6, 16, 3, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILvfa;B)V")
    public abstract void method83(int arg0, class262 arg1, byte arg2);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public abstract void method81(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lag;)V")
    public class182(class469 arg0) {
        this.field2540 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Z")
    public abstract boolean method77(byte arg0);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public abstract void method82(int arg0);
}
