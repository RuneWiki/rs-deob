import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class67 {

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "[I")
    public static int[] field861 = new int[8];

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "Z")
    public static boolean field860 = false;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 4)
    public static void method710(int arg0) {
        if (arg0 > 21) {
            field861 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 14)
    public static final void method711(int arg0) {
        class199.field3246.method1562((byte) 106);
        if (arg0 != 8) {
            field860 = true;
        }
        field859++;
        class160.field2729.method2010(-101);
        class266.field4321.method2010(arg0 ^ 0x5D);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILpca;)Ljava/lang/String;", line = 33)
    public static final String method712(int arg0, class665 arg1) {
        field862++;
        if (arg0 <= 89) {
            method712(15, null);
        }
        if (client.method1955(arg1).method740(-25706) == 0) {
            return null;
        } else if (arg1.field9303 == null || arg1.field9303.trim().length() == 0) {
            return class518.field7505 ? "Hidden-use" : null;
        } else {
            return arg1.field9303;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 56)
    public static final String[] method713(String[] arg0, int arg1) {
        field863++;
        String[] var2 = new String[5];
        for (int var3 = arg1; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }
}
