import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class154 {

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public int field2496;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "F")
    public static float field2490;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1264(boolean arg0) {
        class29.field472 = false;
        field2491++;
        if (!arg0) {
            method1267(-90, 16, -9, true);
        }
        class252.field3888 = 0;
        class278.field4291 = 0;
        class151.field2462 = 0;
        class266.field4126 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1266(byte arg0) {
        field2495++;
        if (arg0 > -48) {
            method1267(-63, 92, 90, false);
        }
        class248.field3851 = null;
        class331.field5086 = -1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 43)
    public static final String method1267(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 != 10) {
            return (String) null;
        }
        field2494++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - arg1 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V", line = 98)
    public class154(int arg0, int arg1, int arg2) {
        this.field2498 = arg1;
        this.field2496 = arg0;
        this.field2497 = arg2;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
    public abstract void method1265(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public abstract void method1268(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IBI)V")
    public abstract void method1269(int arg0, byte arg1, int arg2);
}
