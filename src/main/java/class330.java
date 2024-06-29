import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class330 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5142 = new String[100];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    public static int[] field5134 = new int[14];

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Luv;")
    public static class2 field5138 = new class2(46, 4);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public int field5140;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILvi;II)V", line = 3)
    public static final void method2042(int arg0, class480 arg1, int arg2, int arg3) {
        field5139++;
        if (arg1.field5973 == arg2 && arg2 != -1) {
            class520 var4 = class510.field7490.method575(arg2, -113);
            int var5 = var4.field7618;
            if (var5 == 1) {
                arg1.field6011 = 1;
                arg1.field6009 = 0;
                arg1.field5992 = 0;
                arg1.field5977 = 0;
                arg1.field6002 = arg3;
                class283.method1761(var4, class410.field6198 == arg1, arg1.field7671, -56, arg1.field7686, arg1.field7681, arg1.field5992);
            }
            if (var5 == 2) {
                arg1.field6009 = 0;
            }
        } else if (arg2 == -1 || arg1.field5973 == -1 || class510.field7490.method575(arg2, -107).field7644 >= class510.field7490.method575(arg1.field5973, -75).field7644) {
            arg1.field6064 = arg1.field6066;
            arg1.field6002 = arg3;
            arg1.field5992 = 0;
            arg1.field6009 = 0;
            arg1.field6011 = 1;
            arg1.field5977 = 0;
            arg1.field5973 = arg2;
            if (arg1.field5973 != -1) {
                class283.method1761(class510.field7490.method575(arg1.field5973, -110), class410.field6198 == arg1, arg1.field7671, -81, arg1.field7686, arg1.field7681, arg1.field5992);
            }
        }
        int var6 = -72 / ((arg0 + 3) / 41);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)Z", line = 57)
    public static final boolean method2043(int arg0, boolean arg1, int arg2) {
        field5141++;
        if (!arg1) {
            field5142 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBZI)I", line = 68)
    public static final int method2044(int arg0, byte arg1, boolean arg2, int arg3) {
        field5135++;
        class411 var4 = class171.method1179(arg2, true, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field6201.length; var6++) {
                if (var4.field6200[var6] == arg3) {
                    var5 += var4.field6201[var6];
                }
            }
            if (arg1 == -38) {
                return var5;
            } else {
                return 90;
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V", line = 110)
    public static final void method2045() {
        class78.method567(1, class349.field5377);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 114)
    public static void method2046(int arg0) {
        field5142 = null;
        field5134 = null;
        int var1 = -57 / ((-arg0 - 76) / 48);
        field5138 = null;
    }
}
