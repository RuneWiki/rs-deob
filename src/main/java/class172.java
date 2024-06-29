import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class172 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[[B")
    public static byte[][] field2464 = new byte[250][];

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[C")
    public static char[] field2466 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[Lvd;")
    public static class117[] field2463;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)V")
    public static final void method1133(int arg0, boolean arg1, int arg2) {
        field2465++;
        class237 var3 = class10.method91(2, arg0);
        int var4 = var3.field3576;
        int var5 = var3.field3570;
        int var6 = var3.field3572;
        if (arg1) {
            field2464 = null;
        }
        int var7 = class290.field4577[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class146.method978((byte) -55, var4, class20.field276[var4] & ~var8 | var8 & arg2 << var5);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)Lee;")
    public static final class246 method1134(boolean arg0, int arg1) {
        field2468++;
        class246 var2 = (class246) class181.field2595.method263((byte) 116, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class246 var3 = class141.method939(class284.field4531, arg0, (byte) -96, class45.field636, arg1);
        if (var3 != null) {
            class181.field2595.method255((long) arg1, var3, (byte) -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1135(byte arg0) {
        field2466 = null;
        field2463 = null;
        field2464 = null;
        if (arg0 != -39) {
            method1135((byte) 26);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V")
    public static final void method1136(boolean arg0, int arg1) {
        field2467++;
        class39.field582.method258(arg1, (byte) 58);
        class166.field2421.method258(arg1, (byte) 108);
        if (arg0) {
            method1136(false, 108);
        }
    }
}
