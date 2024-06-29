import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class62 {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
    public static int[] field1156 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ldj;")
    public static class44 field1155 = class89.method650(255, "VOLL");

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Ldj;")
    public static class44 field1167 = class89.method650(255, ":clan:");

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[I")
    public static int[] field1160 = new int[1000];

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field1158 = 0;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field1168 = 128;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lnf;")
    public static class147 field1159;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lod;")
    public static class155 field1166;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[[I")
    public static int[][] field1161;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLma;)V")
    public static final void method465(boolean arg0, class132 arg1) {
        field1164++;
        if (arg0) {
            method468(null, true, 46);
        }
        long var2 = 0L;
        if (arg1.field2357 == 0) {
            var2 = class221.method1426(arg1.field2367, arg1.field2363, arg1.field2371);
        }
        if (arg1.field2357 == 1) {
            var2 = class120.method827(arg1.field2367, arg1.field2363, arg1.field2371);
        }
        if (arg1.field2357 == 2) {
            var2 = class86.method640(arg1.field2367, arg1.field2363, arg1.field2371);
        }
        if (arg1.field2357 == 3) {
            var2 = class239.method1552(arg1.field2367, arg1.field2363, arg1.field2371);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 0x3;
            var4 = (int) var2 >> 14 & 0x1F;
            var6 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field2372 = var6;
        arg1.field2358 = var4;
        arg1.field2359 = var5;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method466(int arg0) {
        field1159 = null;
        field1156 = null;
        field1166 = null;
        if (arg0 == 0) {
            field1155 = null;
            field1160 = null;
            field1167 = null;
            field1161 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
    public static final void method467(int arg0, byte arg1) {
        field1163++;
        if (class183.field3191 == arg0) {
            return;
        }
        if (class183.field3191 == 0) {
            class178.method1124(72);
        }
        if (arg1 != 57) {
            field1168 = -4;
        }
        if (arg0 == 20 || arg0 == 40) {
            class152.field2650 = 0;
            class228.field4285 = 0;
            class39.field748 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class29.field524 != null) {
            class29.field524.method778((byte) -25);
            class29.field524 = null;
        }
        if (class183.field3191 == 25) {
            class116.field2079 = 0;
            class63.field1172 = 0;
            class194.field3408 = 1;
            class145.field2560 = 0;
            class87.field1670 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class33.method224((byte) 127, class112.field2021, class48.field902, class8.field172);
        } else {
            class103.method756(true);
        }
        class183.field3191 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method468(byte[] arg0, boolean arg1, int arg2) {
        field1157++;
        if (arg2 != 28544) {
            method468(null, true, 63);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class64.field1189) {
            try {
                class178 var3 = (class178) Class.forName("ng").getDeclaredConstructor().newInstance();
                var3.method967((byte) 114, arg0);
                return var3;
            } catch (Throwable var4) {
                class64.field1189 = true;
            }
        }
        return arg1 ? class8.method82(true, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BI)V")
    public static final void method469(byte[] arg0, int arg1) {
        class66 var2 = new class66(arg0);
        int var3 = var2.method500(61);
        field1165++;
        int var4 = 6 % ((arg1 + 26) / 37);
        for (int var5 = 0; var5 < var3; var5++) {
            class35 var6 = new class35();
            class44 var7 = var2.method496(true);
            var6.field632 = var2.method500(52);
            var6.field622 = var2.method500(68);
            var6.field621 = var2.method506(255);
            var6.field626 = var7.method328(32, 47, false);
            var6.field618 = var7.method303(4423, 47);
            class186.field3217.method1185(var6, (byte) -110);
        }
    }
}
