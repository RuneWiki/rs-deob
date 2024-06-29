import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class204 extends class290 {

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Loh;")
    public static class258 field3531 = class153.method1046("::", 88);

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Loh;")
    public static class258 field3535 = class153.method1046(" zuerst von Ihrer Freunde)2Liste(Q", 99);

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "S")
    public static short field3532 = 205;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[[[B")
    public static byte[][][] field3540;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 15)
    public static final void method1354(boolean arg0) {
        field3536++;
        if (!class130.field2293) {
            return;
        }
        class171 var1 = class10.method65(class23.field286, arg0, class247.field4280);
        if (var1 != null && var1.field2945 != null) {
            class42 var2 = new class42();
            var2.field598 = var1;
            var2.field600 = var1.field2945;
            class193.method1303(200000, var2);
        }
        class130.field2293 = arg0;
        class165.method1099((byte) 125, var1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIILi;I)Li;", line = 38)
    public static final class305 method1355(int arg0, int arg1, int arg2, int arg3, int arg4, class305 arg5, int arg6) {
        field3538++;
        long var7 = (long) arg0;
        class305 var9 = (class305) class253.field4350.method1159((byte) 124, var7);
        if (var9 == null) {
            class97 var10 = class97.method738(class282.field4840, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method713(64, 768, -50, -10, -50);
            class253.field4350.method1163(var9, -1, var7);
        }
        int var11 = arg5.method644();
        int var12 = arg5.method647();
        int var13 = arg5.method651();
        if (arg1 < 100) {
            return (class305) null;
        }
        int var14 = arg5.method658();
        class305 var15 = var9.method648(true, true);
        if (arg2 != 0) {
            var15.method640(arg2);
        }
        if (class257.field4390) {
            class175 var18 = (class175) var15;
            if (class228.method1525(true, class272.field4704, arg3 + var13, arg6 + var11) != arg4 || arg4 != class228.method1525(true, class272.field4704, arg3 + var14, arg6 - -var12)) {
                for (int var19 = 0; var19 < var18.field3133; var19++) {
                    var18.field3138[var19] += class228.method1525(true, class272.field4704, var18.field3123[var19] + arg3, var18.field3120[var19] + arg6) - arg4;
                }
                var18.field3140.field2087 = false;
                var18.field3128.field3270 = false;
            }
        } else {
            class89 var16 = (class89) var15;
            if (arg4 != class228.method1525(true, class272.field4704, arg3 + var13, arg6 + var11) || arg4 != class228.method1525(true, class272.field4704, arg3 + var14, arg6 + var12)) {
                for (int var17 = 0; var17 < var16.field1513; var17++) {
                    var16.field1517[var17] += class228.method1525(true, class272.field4704, var16.field1527[var17] + arg3, var16.field1555[var17] + arg6) - arg4;
                }
                var16.field1537 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 133)
    public static void method1356(byte arg0) {
        field3531 = null;
        int var1 = 101 % ((76 - arg0) / 43);
        field3540 = (byte[][][]) null;
        field3535 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lkh;Lkh;I)V", line = 153)
    public static final void method1357(class154 arg0, class154 arg1, int arg2) {
        field3539++;
        if (arg2 != -14783) {
            field3531 = (class258) null;
        }
        if (arg1.field2635 != null) {
            arg1.method1054((byte) 95);
        }
        arg1.field2635 = arg0.field2635;
        arg1.field2636 = arg0;
        arg1.field2635.field2636 = arg1;
        arg1.field2636.field2635 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 175)
    public static final int method1358(int arg0, int arg1) {
        if (arg1 != 7097) {
            method1355(99, 98, -28, -16, -61, (class305) null, -105);
        }
        field3537++;
        return arg0 >>> 8;
    }
}
