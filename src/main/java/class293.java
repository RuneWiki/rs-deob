import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class293 extends class263 {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
    public static int[] field3728 = new int[128];

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "F")
    public static float field3730;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public static int[] field3732;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lts;I)Ljava/lang/String;")
    public static final String method1769(class501 arg0, int arg1) {
        if (arg1 != -21589) {
            field3728 = null;
        }
        field3726++;
        return arg0.field6243 == null || arg0.field6243.length() <= 0 ? arg0.field6249 : arg0.field6249 + class671.field9146.method3726((byte) 63, class71.field912) + arg0.field6243;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Z")
    public static final boolean method1770(byte arg0) {
        int var1 = -35 / ((12 - arg0) / 63);
        field3731++;
        try {
            if (class76.field1000 == 2) {
                if (class669.field9071 == null) {
                    class669.field9071 = class551.method2947(class334.field4134, class618.field8381, class687.field9410);
                    if (class669.field9071 == null) {
                        return false;
                    }
                }
                if (class266.field3364 == null) {
                    class266.field3364 = new class131(class653.field8903, class563.field7034);
                }
                if (class367.field4751.method1993(22050, class266.field3364, class146.field1751, class669.field9071, false)) {
                    class367.field4751.method1990(1);
                    class367.field4751.method1984(-89, class60.field757);
                    class367.field4751.method1985(class669.field9071, class15.field150, (byte) -103);
                    class76.field1000 = 0;
                    class334.field4134 = null;
                    class266.field3364 = null;
                    class669.field9071 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class367.field4751.method1961(18234);
            class334.field4134 = null;
            class669.field9071 = null;
            class76.field1000 = 0;
            class266.field3364 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method1771(int arg0) {
        field3732 = null;
        field3728 = null;
        if (arg0 != 2199) {
            field3728 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static final void method1772(byte arg0) {
        field3725++;
        if (!class611.field8310.method2744(class628.field8526, 4) && class675.field9219 != class518.field6552) {
            class250.method1509(9840, false, 11, class677.field9229, class563.field7027);
            return;
        }
        if (arg0 <= 121) {
            method1770((byte) 57);
        }
        class331.method1896((byte) -98, class309.field3898);
        if (class675.field9219 != class422.field5354) {
            class89.method669((byte) -38);
        }
    }

    static {
        for (int var0 = 0; var0 < field3728.length; var0++) {
            field3728[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field3728[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field3728[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field3728[var3] = var3 + 52 - 48;
        }
        field3728[42] = field3728[43] = 62;
        field3728[45] = field3728[47] = 63;
    }
}
