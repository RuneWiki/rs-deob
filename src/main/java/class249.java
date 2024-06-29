import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class249 extends class33 {

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[Z")
    public static boolean[] field3947 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3948 = new String[500];

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Z")
    public static boolean field3950 = false;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Lag;")
    public static class211 field3949;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[I")
    public static int[] field3946;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
    public static final void method1657(short[] arg0, String[] arg1, int arg2) {
        field3945++;
        int var3 = 115 / ((arg2 - 60) / 35);
        class288.method1915(0, arg0, (byte) -128, arg1, arg1.length - 1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1658(String arg0, byte arg1) {
        field3952++;
        if (arg1 < 0) {
            field3949 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static void method1659(int arg0) {
        field3947 = null;
        if (arg0 == 6) {
            field3948 = null;
            field3946 = null;
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method1660(String arg0, boolean arg1, boolean arg2) {
        field3951++;
        if (arg1) {
            method1660((String) null, true, false);
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class88.field1443.method629(arg0, 250);
        int var7 = class88.field1443.method637(arg0, 250) * 13;
        class127.method886(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class127.method898(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class88.field1443.method625(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class236.method1603(var5 - var3, var3 + var7 + var3, var4 - var3, var6 - -var3 + var3, 0);
        if (!arg2) {
            class6.method33(var5, 0, var7, var4, var6);
            return;
        }
        try {
            Graphics var8 = class131.field2064.getGraphics();
            class112.field1757.method38(0, 0, 0, var8);
        } catch (Exception var9) {
            class131.field2064.repaint();
        }
    }
}
