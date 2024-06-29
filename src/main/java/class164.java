import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class164 extends class259 {

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lbc;")
    public class174 field2977;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Lcc;")
    public static class209 field2972 = class95.method669(122, "::breakcon");

    @OriginalMember(owner = "client!j", name = "H", descriptor = "[I")
    public static int[] field2973 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2975 = 0;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZBLcc;)V")
    public static final void method1133(boolean arg0, byte arg1, class209 arg2) {
        if (arg1 < 45) {
            field2973 = null;
        }
        byte var3 = 4;
        field2971++;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class256.field4623.method1286(arg2, 250);
        int var7 = class256.field4623.method1299(arg2, 250) * 13;
        class4.method39(var4 - var3, var5 - var3, var3 + var6 + var3, var7 - (-var3 + -var3), 0);
        class4.method41(var4 - var3, var5 - var3, var6 + var3 + var3, var3 - -var3 + var7, 16777215);
        class256.field4623.method1282(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class21.method185(var5 - var3, var3 + var3 + var6, 0, var4 - var3, var7 - -var3 - -var3);
        if (!arg0) {
            class193.method1321(var4, 11053, var7, var5, var6);
            return;
        }
        try {
            Graphics var8 = class122.field2411.getGraphics();
            class187.field3374.method67(0, (byte) 127, var8, 0);
        } catch (Exception var9) {
            class122.field2411.repaint();
        }
    }

    @OriginalMember(owner = "client!j", name = "h", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        field2974++;
        class108.field2184.method664(-109);
        if (arg0 != 250) {
            field2972 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILcc;)V")
    public static final void method1135(int arg0, class209 arg1) {
        field2976++;
        int var2 = class116.method822(arg0 ^ arg0, arg1);
        if (var2 != -1) {
            class154.method1069(class134.field2548.field3031[var2], (byte) 125, class134.field2548.field3035[var2]);
        }
    }

    @OriginalMember(owner = "client!j", name = "i", descriptor = "(I)V")
    public static void method1136(int arg0) {
        field2973 = null;
        field2972 = null;
        if (arg0 != 0) {
            method1136(-75);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V")
    public static final void method1137(byte arg0, int arg1) {
        class238.field4308.method662(32768, arg1);
        int var2 = 110 % ((arg0 + 1) / 63);
        field2970++;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lbc;)V")
    public class164(class174 arg0) {
        this.field2977 = arg0;
    }
}
