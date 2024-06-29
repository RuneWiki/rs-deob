import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class177 extends class104 {

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Z")
    public volatile boolean field2578 = true;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field2568 = 0;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lcc;")
    public static class263 field2575 = null;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Z")
    public static boolean field2567 = true;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "[[B")
    public static byte[][] field2577 = new byte[250][];

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Llc;")
    public static class175 field2579;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Z")
    public static boolean field2566;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Z")
    public boolean field2572;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "Z")
    public boolean field2573;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)Z", line = 7)
    public static final boolean method1212(int arg0) {
        field2576++;
        try {
            if (class281.field4357 == 2) {
                if (class76.field971 == null) {
                    class76.field971 = class39.method231(class283.field4440, class96.field1252, class259.field3933);
                    if (class76.field971 == null) {
                        return false;
                    }
                }
                if (class10.field132 == null) {
                    class10.field132 = new class166(class205.field2874, class240.field3611);
                }
                if (class195.field2802.method1584(class10.field132, 114, class76.field971, class237.field3475, 22050)) {
                    class195.field2802.method1589(-82);
                    class195.field2802.method1570(class267.field4212, -12088);
                    class195.field2802.method1575(class224.field3177, -1, class76.field971);
                    class76.field971 = null;
                    class281.field4357 = 0;
                    class10.field132 = null;
                    class283.field4440 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class195.field2802.method1609((byte) -127);
            class76.field971 = null;
            class281.field4357 = 0;
            class283.field4440 = null;
            class10.field132 = null;
        }
        return arg0 >= -110;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B)Lwh;", line = 57)
    public static final class11 method1213(int arg0, byte[] arg1) {
        field2574++;
        if (arg1 == null) {
            return null;
        }
        class11 var2;
        if (class250.field3787) {
            var2 = new class278(arg1, class120.field1681, class223.field3150, class54.field664, class264.field4159, class153.field2105);
        } else {
            var2 = new class82(arg1, class120.field1681, class223.field3150, class54.field664, class264.field4159, class153.field2105);
        }
        class321.method2238(105);
        if (arg0 > -63) {
            method1215(118, (class265) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I", line = 83)
    public static final int method1214(int arg0, int arg1) {
        field2570++;
        if (arg0 > -101) {
            field2580 = -25;
        }
        return (arg1 & 0x3FF7B) >> 11;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILtk;)[Ljd;", line = 94)
    public static final class149[] method1215(int arg0, class265 arg1) {
        field2571++;
        if (!arg1.method1914(26960)) {
            return new class149[0];
        }
        class18 var2 = arg1.method1907(true);
        if (arg0 != 21134) {
            return (class149[]) null;
        }
        while (var2.field238 == 0) {
            class81.method485(10L, 1);
        }
        if (var2.field238 == 2) {
            return new class149[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field241);
        class149[] var4 = new class149[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class149 var6 = new class149();
            var4[var5] = var6;
            var6.field2077 = var3[var5 << 2];
            var6.field2067 = var3[(var5 << 2) + 1];
            var6.field2069 = var3[(var5 << 2) + 2];
            var6.field2071 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V", line = 146)
    public static final void method1216(int arg0, int arg1) {
        field2581++;
        if (arg1 <= -102) {
            class27.field347.method1236(-495037017, arg0);
            class256.field3897.method1236(-495037017, arg0);
            class134.field1851.method1236(-495037017, arg0);
            client.field4227.method1236(-495037017, arg0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V", line = 168)
    public static void method1217(int arg0) {
        if (arg0 != -29921) {
            method1215(12, (class265) null);
        }
        field2577 = (byte[][]) null;
        field2575 = null;
        field2579 = null;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
    public abstract int method41(int arg0);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)[B")
    public abstract byte[] method45(int arg0);
}
