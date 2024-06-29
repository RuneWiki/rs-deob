import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class189 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field2847 = 127;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
    public static int[] field2849 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
    public static boolean field2844;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lpa;")
    public static class2[] field2848;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[[Z")
    public static boolean[][] field2843;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 12)
    public static final void method1294(int arg0, int arg1) {
        field2842++;
        if (~arg0 == arg1) {
            return;
        }
        if (arg0 == 1) {
            class164.method1176(arg1 + 6442);
        } else if (arg0 == 2) {
            class296.method2103((byte) -94);
        } else if (arg0 == 3) {
            class218.method1520((byte) 50);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 39)
    public static final void method1295(String arg0, boolean arg1, byte arg2) {
        field2845++;
        short[] var3 = new short[16];
        int var4 = 0;
        String var5 = arg0.toLowerCase();
        for (int var6 = 0; var6 < class332.field5314; var6++) {
            class309 var7 = class190.method1302(var6, (byte) -119);
            if ((!arg1 || var7.field4851) && var7.field4860 == -1 && var7.field4840 == -1 && var7.field4793 == 0 && var7.field4868.toLowerCase().indexOf(var5) != -1) {
                if (var4 >= 250) {
                    class181.field2733 = null;
                    class142.field2217 = -1;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var4++] = (short) var6;
            }
        }
        class279.field4387 = 0;
        class142.field2217 = var4;
        class181.field2733 = var3;
        String[] var10 = new String[class142.field2217];
        if (arg2 < 67) {
            method1295((String) null, true, (byte) 72);
        }
        for (int var11 = 0; var11 < class142.field2217; var11++) {
            var10[var11] = class190.method1302(var3[var11], (byte) -120).field4868;
        }
        class5.method33((byte) -114, class181.field2733, var10);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 112)
    public static final void method1296(int arg0) {
        field2841++;
        class119.field1664 = class113.method731(4, 8, 0.4F, 2048, 35, true, 8, 4891);
        if (arg0 != 2047) {
            method1294(18, 15);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V", line = 125)
    public static void method1297(int arg0) {
        if (arg0 <= 66) {
            method1294(35, -72);
        }
        field2843 = (boolean[][]) null;
        field2848 = null;
        field2849 = null;
    }
}
