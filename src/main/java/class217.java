import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class217 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lcc;")
    public static class327 field3062 = new class327(64);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "[Lgb;")
    public static class196[] field3063 = new class196[0];

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3070 = 0;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3064 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "Lwl;")
    public static class13 field3071;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lic;")
    public static class329 field3072;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[[[Lnh;")
    public static class119[][][] field3069;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1574(int arg0) {
        field3066++;
        if (class318.field4685) {
            return;
        }
        class311.field4573 = true;
        if (class48.field638) {
            class302.field4426 = (float) ((int) class302.field4426 + 47 & 0xFFFFFFF0);
        } else {
            class33.field408 += (12.0F - class33.field408) / 2.0F;
        }
        class318.field4685 = true;
        if (arg0 != -16) {
            method1574(-93);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLwf;I)V", line = 29)
    public static final void method1575(int arg0, boolean arg1, class333 arg2, int arg3) {
        field3061++;
        if (arg1 || class66.field853 < 2 && class339.field5304 == 0 && !class276.field3954) {
            return;
        }
        String var4 = class61.method449(!arg1);
        if (arg2 == null) {
            int var5 = class186.field2554.method1904(var4, arg0 + 4, arg3 - -15, 16777215, 0, class193.field2670, class229.field3289);
            class90.method648(var5 + class186.field2554.method1894(var4), 0, 15, arg0 + 4, arg3);
            return;
        }
        class281 var6 = arg2.method2330((byte) 54, class357.field5584);
        if (var6 == null) {
            var6 = class186.field2554;
        }
        var6.method1909(var4, arg0, arg3, arg2.field5056, arg2.field5172, arg2.field5138, arg2.field5139, arg2.field5123, arg2.field5121, class193.field2670, class229.field3289, class56.field725);
        class90.method648(class56.field725[2], 0, class56.field725[3], class56.field725[0], class56.field725[1]);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method1576(boolean arg0, int arg1) {
        field3065++;
        byte var2;
        byte[][] var3;
        if (class47.field623 && arg0) {
            var2 = 1;
            var3 = class305.field4461;
        } else {
            var2 = 4;
            var3 = class101.field1316;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            int var7 = class305.field4457[var5] >> 8;
            byte[] var8 = var3[var5];
            int var9 = class305.field4457[var5] & 0xFF;
            int var10 = var7 * 64 - class331.field4867;
            int var11 = var9 * 64 - class355.field5556;
            if (var8 != null) {
                class323.method2235(false);
                var6 = class45.method319(arg0, class231.field3312, -24017, class355.field5556, var11, var10, class331.field4867, var8);
            }
            if (!arg0 && (class253.field3699 / 8) == var7 && class289.field4179 / 8 == var9) {
                if (var6 == null) {
                    class238.field3437 = -1;
                } else {
                    class238.field3437 = var6[0];
                    class104.field1358 = var6[3];
                    class138.field1907 = var6[2];
                    class199.field2799 = var6[1];
                    class72.field966 = var6[4];
                }
            }
        }
        if (arg1 != 1) {
            field3072 = (class329) null;
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class305.field4457[var12] & 0xFF) * 64 - class355.field5556;
            int var14 = (class305.field4457[var12] >> 8) * 64 - class331.field4867;
            byte[] var15 = var3[var12];
            if (var15 == null && class289.field4179 < 800) {
                class323.method2235(false);
                for (int var16 = 0; var16 < var2; var16++) {
                    class137.method1034(var14, var16, 64, var13, 64, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 161)
    public static final void method1577(int arg0, int arg1) {
        field3060++;
        if (arg0 != 255) {
            method1576(false, 126);
        }
        class223 var2 = (class223) class240.field3489.method2279((long) arg1, -124);
        if (var2 != null) {
            var2.method179((byte) 51);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfh;)V", line = 183)
    public static final void method1578(int arg0, class140 arg1) {
        class326.field4767 = arg1;
        field3068++;
        if (arg0 >= -19) {
            method1575(-46, true, (class333) null, -81);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 200)
    public static void method1579(boolean arg0) {
        field3069 = (class119[][][]) null;
        field3063 = null;
        field3062 = null;
        if (arg0) {
            method1579(false);
        }
        field3072 = null;
        field3071 = null;
    }
}
