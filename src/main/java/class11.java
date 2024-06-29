import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class11 extends class288 {

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Ljava/lang/String;")
    public static String field152 = "Discard";

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "S")
    public static short field144 = 205;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lwe;")
    public class82 field145;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "Lwe;")
    public class82 field153;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lse;")
    public static class89 field141;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Ljava/lang/String;")
    public String field150;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Z")
    public boolean field151;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[Ljava/lang/Object;")
    public Object[] field143;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static final void method75(int arg0) {
        if (arg0 != 1) {
            field152 = null;
        }
        field148++;
        int var1 = class41.field500.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class41.field500[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class284.field4347; var4++) {
                    if (class271.field3956[var4] == class190.field2739[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class271.field3956[class284.field4347] = class190.field2739[var2];
                    var3 = class284.field4347++;
                }
                class216 var5 = new class216(class41.field500[var2]);
                int var6 = 0;
                while (class41.field500[var2].length > var5.field3021 && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1380(true);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class190.field2739[var2] >> 8) * 64 - (class110.field1473 - var10);
                    int var13 = (class190.field2739[var2] & 0xFF) * 64 + var9 - class166.field2383;
                    class267 var14 = class165.method1084(-116, var5.method1380(true));
                    if (class20.field244[var7] == null && (var14.field3872 & 0x1) > 0 && class251.field3626 == var11 && var12 >= 0 && (var14.field3858 + var12) < 104 && var13 >= 0 && (var14.field3858 + var13) < 104) {
                        class20.field244[var7] = new class54();
                        class54 var15 = class20.field244[var7];
                        class14.field176[class294.field4642++] = var7;
                        var15.field4546 = class198.field2819;
                        var15.method322(var14, arg0 ^ 0x75);
                        var15.method1939(var15.field636.field3858, -123);
                        var15.field4534 = var15.field4512 = class228.field3220[var15.field636.field3876];
                        var15.field4505 = var15.field636.field3845;
                        var15.field4588 = var15.field636.field3860;
                        if (var15.field4505 == 0) {
                            var15.field4512 = 0;
                        }
                        var15.method1942(arg0 ^ 0xFFFFFF86, var13, var15.method1556(3888), true, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public static void method76(int arg0) {
        field152 = null;
        if (arg0 == -1) {
            field141 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII)Lfg;")
    public static final class71 method77(byte arg0, int arg1, int arg2) {
        field139++;
        int var3 = -8 / ((arg0 + 28) / 54);
        for (class71 var4 = (class71) class28.field342.method1890((byte) 80); var4 != null; var4 = (class71) class28.field342.method1889(false)) {
            if (var4.field843 && var4.method430(1, arg2, arg1)) {
                return var4;
            }
        }
        return null;
    }
}
