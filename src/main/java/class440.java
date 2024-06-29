import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class440 extends class218 {

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public int field6146 = (int) (class465.method2699((byte) 14) / 1000L);

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
    public String field6151;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "S")
    public short field6150;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field6149 = 1401;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "[I")
    public static int[] field6152;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field6148;

    static {
        new class530("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field6152 = new int[16];
        field6153 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V", line = 8)
    public static void method2577(byte arg0) {
        if (arg0 != 96) {
            method2579(null, true);
        }
        field6152 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILdh;)V", line = 23)
    public static final void method2578(int arg0, class214 arg1) {
        field6148++;
        if (class424.field5977) {
            return;
        }
        arg1.method2891(-3);
        class37.field408--;
        if (arg0 > -54) {
            field6153 = -81;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public class440(String arg0, int arg1) {
        this.field6151 = arg0;
        this.field6150 = (short) arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([IZ)Ljava/lang/String;", line = 54)
    public static final String method2579(int[] arg0, boolean arg1) {
        field6147++;
        StringBuffer var2 = new StringBuffer();
        if (arg1) {
            return null;
        }
        int var3 = class119.field1643;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class66 var5 = class373.field5309.method1626(arg0[var4], true);
            if (var5.field837 != -1) {
                class24 var6 = (class24) class92.field1178.method1088((long) var5.field837, (byte) 21);
                if (var6 == null) {
                    class506 var7 = class506.method3018(class61.field761, var5.field837, 0);
                    if (var7 != null) {
                        var6 = class385.field5414.method312(var7, true);
                        class92.field1178.method1097(19627, var6, (long) var5.field837);
                    }
                }
                if (var6 != null) {
                    class487.field6796[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }
}
