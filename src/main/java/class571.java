import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public abstract class class571 extends class720 {

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field7777 = new String[5];

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "Ljb;")
    public static class519 field7775 = null;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7780 = 0;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "F")
    public static float field7779;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Lpb;")
    public static class680 field7776;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kga", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field7784;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kga", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7785;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZIII)V")
    public static final void method3245(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class770.field10603 = arg4;
        class538.field7448 = arg0;
        field7781++;
        class96.field1380 = arg2;
        class127.field1745 = arg3;
        if (arg1) {
            field7780 = 6;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I")
    public static final int method3246(int arg0) {
        field7783++;
        int var1 = 0;
        Field[] var2 = (field7784 == null ? (field7784 = method3249("rd")) : field7784).getDeclaredFields();
        Field[] var3 = var2;
        int var4 = -118 / ((59 - arg0) / 44);
        for (int var5 = 0; var5 < var3.length; var5++) {
            Field var6 = var3[var5];
            if ((field7785 == null ? (field7785 = method3249("me")) : field7785).isAssignableFrom(var6.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public static void method3247(boolean arg0) {
        if (arg0) {
            method3247(false);
        }
        field7775 = null;
        field7776 = null;
        field7777 = null;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)Lfaa;")
    public abstract class165 method701(byte arg0);

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I")
    public static final int method3248(int arg0, int arg1) {
        field7782++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 <= 6) {
                field7777 = null;
            }
            return class81.method650((byte) -111, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3249(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
