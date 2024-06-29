import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class289 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field4933 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[S")
    public static short[] field4934 = new short[500];

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lcd;")
    private static class64 field4940 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4937 = 0;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
    public static int[] field4941 = new int[2000];

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "[S")
    public static short[] field4945 = new short[] { 31, 11, 13, 18, 9, 28, 23, 7 };

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4948 = 0;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Lcd;")
    public static class64 field4947 = class44.method335((byte) 71, "scrollen:");

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Lcd;")
    public static class64 field4949 = field4940;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BI)[B", line = 8)
    public static final byte[] method1992(byte[] arg0, int arg1) {
        field4939++;
        class13 var2 = new class13(arg0);
        int var3 = 49 % ((arg1 + 84) / 37);
        int var4 = var2.method152((byte) -83);
        int var5 = var2.method105((byte) 37);
        if (var5 < 0 || class113.field2084 != 0 && var5 > class113.field2084) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var6 = new byte[var5];
            var2.method148(var6, -2, 0, var5);
            return var6;
        } else {
            int var7 = var2.method105((byte) 52);
            if (var7 < 0 || class113.field2084 != 0 && var7 > class113.field2084) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var4 == 1) {
                class18.method182(var8, var7, arg0, var5, 9);
            } else {
                class53.field853.method1360(var2, var8, (byte) 79);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 63)
    public static final int method1993(int arg0, int arg1) {
        if (arg0 >= -31) {
            return -37;
        }
        field4942++;
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLwh;ZIBILwh;)I", line = 90)
    public static final int method1994(boolean arg0, class9 arg1, boolean arg2, int arg3, byte arg4, int arg5, class9 arg6) {
        int var7 = class27.method240(arg6, (byte) 101, arg1, arg2, arg3);
        field4936++;
        if (arg4 >= -116) {
            return -15;
        } else if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class27.method240(arg6, (byte) 101, arg1, arg0, arg5);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 133)
    public static void method1995(boolean arg0) {
        field4941 = null;
        field4940 = null;
        field4945 = null;
        field4934 = null;
        field4933 = null;
        field4949 = null;
        if (!arg0) {
            field4940 = (class64) null;
        }
        field4947 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V", line = 165)
    public static final void method1996(int arg0, int arg1) {
        int var2 = 29 % ((arg1 - 16) / 57);
        class233.field3944.method1197((byte) 111, arg0);
        field4946++;
        class56.field947.method1197((byte) 95, arg0);
        class280.field4824.method1197((byte) 61, arg0);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 181)
    public static final void method1997(byte arg0) {
        if (arg0 > -10) {
            field4934 = (short[]) null;
        }
        field4950++;
        class112.field2072.method1198(false);
    }
}
