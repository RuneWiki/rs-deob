import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class251 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lp;")
    public static class280 field4396 = class18.method140((byte) -117, " s(West connect-B)3");

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lal;")
    public static class227 field4398;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[[Lua;")
    public static class113[][] field4394;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1690(byte arg0) {
        field4394 = null;
        field4398 = null;
        field4396 = null;
        if (arg0 <= 61) {
            method1693(-45, -42);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)I")
    public static final int method1691(int arg0, boolean arg1) {
        field4395++;
        return arg1 ? arg0 >>> 8 : -63;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lt;")
    public static final class196 method1692(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class196 var4 = var3.field2843;
            var3.field2843 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lje;")
    public static final class182 method1693(int arg0, int arg1) {
        field4397++;
        class182 var2 = (class182) class109.field1794.method1699((long) arg1, 104);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class101.field1641.method1258(arg1, arg0, (byte) 92);
        if (var3 == null) {
            return null;
        }
        class182 var4 = new class182();
        class25 var5 = new class25(var3);
        var5.field481 = var5.field475.length - 2;
        int var6 = var5.method193((byte) 77);
        int var7 = var5.field475.length - var6 - 2 - 12;
        var5.field481 = var7;
        int var8 = var5.method199((byte) -85);
        var4.field3197 = var5.method193((byte) 77);
        var4.field3191 = var5.method193((byte) 77);
        var4.field3182 = var5.method193((byte) 77);
        var4.field3180 = var5.method193((byte) 77);
        int var9 = var5.method189((byte) -103);
        if (var9 > 0) {
            var4.field3179 = new class19[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method193((byte) 77);
                class19 var12 = new class19(class79.method585(var11, -805756542));
                var4.field3179[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method199((byte) -85);
                    int var14 = var5.method199((byte) -85);
                    var12.method148(arg0 - 1, new class190(var14), (long) var13);
                }
            }
        }
        var5.field481 = 0;
        var4.field3198 = var5.method194(arg0 ^ 0xFFFFE1E5);
        var4.field3193 = new int[var8];
        var4.field3186 = new class280[var8];
        var4.field3185 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field481) {
            int var16 = var5.method193((byte) 77);
            if (var16 == 3) {
                var4.field3186[var15] = var5.method198(false);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3193[var15] = var5.method189((byte) -103);
            } else {
                var4.field3193[var15] = var5.method199((byte) -85);
            }
            var4.field3185[var15++] = var16;
        }
        class109.field1794.method1703(var4, (byte) 111, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lq;B)Lq;")
    public abstract class125 method1674(class125 arg0, byte arg1);
}
