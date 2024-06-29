import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class178 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2832 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    public static int[] field2834 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Lgn;")
    public static class321[] field2831;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILvl;III)Ljava/awt/Frame;", line = 9)
    public static final Frame method1333(int arg0, int arg1, class6 arg2, int arg3, int arg4, int arg5) {
        field2830++;
        if (!arg2.method61((byte) -121)) {
            return null;
        }
        if (arg3 == 0) {
            class134[] var6 = class90.method655(arg2, (byte) -119);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2035 == arg0 && var6[var8].field2043 == arg1 && (arg4 == 0 || var6[var8].field2037 == arg4) && (!var7 || var6[var8].field2040 > arg3)) {
                    arg3 = var6[var8].field2040;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class208 var9 = arg2.method62(arg1, arg0, arg3, arg4, 1347532688);
        while (var9.field3185 == 0) {
            class324.method2252(-24861, 10L);
        }
        Frame var10 = (Frame) var9.field3186;
        if (var10 == null) {
            return null;
        } else if (~var9.field3185 == arg5) {
            class1.method10(var10, (byte) 5, arg2);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 80)
    public static void method1334(int arg0) {
        field2831 = null;
        if (arg0 != 7) {
            method1334(24);
        }
        field2834 = null;
        field2832 = null;
    }
}
