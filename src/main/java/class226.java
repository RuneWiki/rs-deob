import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class226 {

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[[B")
    public static byte[][] field3532 = new byte[250][];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3525 = "shake:";

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field3533 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[[[B")
    public static byte[][][] field3528;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static final void method1545(boolean arg0) {
        if (!arg0) {
            field3527 = -97;
        }
        class141.field2032 = null;
        class189.field2847 = null;
        class205.field3073 = null;
        field3531++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1546(String arg0, int arg1) {
        field3530++;
        int var2 = arg1;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = (var2 << 5) + class97.method729(true, arg0.charAt(var4)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method1547(byte arg0) {
        field3532 = null;
        if (arg0 != 59) {
            method1550(true, false, (String) null);
        }
        field3525 = null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILca;)Ljava/lang/String;")
    public static final String method1548(int arg0, class54 arg1) {
        if (arg0 <= 2) {
            method1545(false);
        }
        field3534++;
        return class195.method1311(32767, true, arg1);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method1549(int arg0) {
        field3529++;
        if (class88.field1339) {
            class88.field1339 = false;
            class190.field2876 = null;
            int var1 = 38 % ((arg0 + 81) / 34);
            class60.field979 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method1550(boolean arg0, boolean arg1, String arg2) {
        field3526++;
        if (arg1) {
            field3532 = null;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class269.field4186.method1290(arg2, 250);
        int var7 = class269.field4186.method1284(arg2, 250) * 13;
        class72.method576(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - -var3 + var3, 0);
        class72.method564(var4 - var3, -var3 + var5, var3 + var6 + var3, var7 - (-var3 - var3), 16777215);
        class269.field4186.method1286(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class210.method1386(var4 - var3, var5 - var3, var3 + var7 + var3, (byte) 89, var3 + var6 + var3);
        if (!arg0) {
            class10.method74(var5, var4, false, var7, var6);
            return;
        }
        try {
            Graphics var8 = class297.field4569.getGraphics();
            class148.field2148.method696(0, 0, var8, true);
        } catch (Exception var9) {
            class297.field4569.repaint();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I")
    public static int method1551(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
