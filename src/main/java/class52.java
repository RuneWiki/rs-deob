import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class52 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public static int[] field838 = new int[] { 0, -2, 0, 0, 0, 0, 4, 0, 0, 0, 0, 4, 0, 8, 0, 3, 6, 1, 0, 0, 0, 0, -2, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 2, 0, 6, -2, -1, 0, 0, 0, 0, 0, 4, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 10, 6, 0, 0, 0, 0, 0, -1, 6, 0, 0, -2, 0, 0, 5, 0, 5, 6, 0, 5, 0, -1, 7, 0, 0, 0, 0, 0, 0, 15, -2, 0, 0, 4, 6, 4, -2, 5, 0, -2, 3, 0, 0, 14, 0, 1, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 5, -1, 0, 0, 1, 2, -2, 1, 0, -2, 0, 0, 9, 0, 0, 10, 0, 7, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 5, 0, 6, 8, 2, 0, 0, 4, 0, 6, 0, 0, 0, 0, 6, -2, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 8, 0, 1, 0, 0, 3, 0, 0, 0, 0, 24, 3, 0, 0, 0, 0, 0, -1, 0, -1, 15, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -2, 4, -2, 0, 0, 0, 2, 0, 6, 7, 0, 0, 4, 8, 0, 0, 0, 12, 0, 0, 0, 20, 2, 0, -1, 0, 0, 10, 0, 0, 0, 0, 0, -1, 0, 0, -1, 6, 7, 0, 0, 0, 0, 0, 0, -1, 6, 8, 0, 0, 0 };

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lsb;")
    public static class98 field845 = class47.method368(")3runescape)3com)4l=", 0);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lsb;")
    public static class98 field846 = class47.method368("settings", 0);

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
    public static boolean field844 = true;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[I")
    public static int[] field840;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI)I")
    public static final int method391(int arg0, byte arg1, int arg2) {
        field842++;
        int var3 = class218.method1502(arg2 - 1, 15731, arg0 - 1) + class218.method1502(arg2 - 1, 15731, arg0 + 1) + (class218.method1502(arg2 + 1, 15731, arg0 + -1) - -class218.method1502(arg2 + 1, 15731, arg0 + 1));
        if (arg1 > -77) {
            field838 = null;
        }
        int var4 = class218.method1502(arg2, 15731, arg0 - 1) + class218.method1502(arg2, 15731, arg0 + 1) + class218.method1502(arg2 + -1, 15731, arg0) + class218.method1502(arg2 + 1, 15731, arg0);
        int var5 = class218.method1502(arg2, 15731, arg0);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
    public static final int method392(int arg0, int arg1, int arg2) {
        field843++;
        class56 var3 = (class56) class211.field3609.method1511((byte) -127, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (~arg0 == arg1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field889.length; var5++) {
                if (var3.field893[var5] == arg0) {
                    var4 += var3.field889[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLkh;Z)V")
    public static final void method393(byte arg0, class5 arg1, boolean arg2) {
        field841++;
        if (arg0 <= 36) {
            return;
        }
        if (arg2) {
            class120.field2172 = 3;
            class191.method1317((byte) 123, false);
            class91.field1593 = false;
            class265.field4644 = 0;
            class37.field627 = 127;
            class120.field2184 = 0;
            class68.field1082 = false;
            class177.field3069 = 0;
            class90.field1585 = 127;
            class115.field2062 = false;
            class45.field749 = false;
            class229.field3932 = false;
            class223.field3854 = 0;
            class85.field1497 = false;
            class45.field747 = false;
            class199.field3423 = false;
            class158.field2873 = false;
            class167.field2978 = 255;
            class104.field1848 = false;
            class41.field679 = false;
            class12.field238 = false;
            class115.method863((byte) 35, arg1);
            return;
        }
        class120.field2172 = 3;
        class168 var3 = null;
        class191.method1317((byte) 126, true);
        class41.field679 = true;
        class104.field1848 = true;
        class115.field2062 = true;
        class68.field1082 = true;
        class85.field1497 = true;
        class229.field3932 = true;
        class90.field1585 = 127;
        class45.field747 = true;
        class37.field627 = 127;
        class265.field4644 = 0;
        class45.field749 = true;
        class177.field3069 = 2;
        class91.field1593 = true;
        class199.field3423 = true;
        class223.field3854 = 0;
        class158.field2873 = true;
        class12.field238 = true;
        class120.field2184 = 0;
        class167.field2978 = 255;
        try {
            class22 var4 = arg1.method26("runescape", false);
            while (var4.field445 == 0) {
                class234.method1603(1L, -111);
            }
            if (var4.field445 == 1) {
                var3 = (class168) var4.field447;
                byte[] var5 = new byte[(int) var3.method1200((byte) 93)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1197(var6, 0, var5, var5.length - var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class243.method1673(112, new class216(var5));
            }
        } catch (Exception var9) {
        }
        try {
            if (var3 != null) {
                var3.method1199((byte) 73);
                return;
            }
        } catch (Exception var8) {
            return;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        if (arg0 != 0) {
            method393((byte) 40, (class5) null, false);
        }
        field840 = null;
        field846 = null;
        field845 = null;
        field838 = null;
    }
}
