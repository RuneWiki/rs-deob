import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class214 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Z")
    public static boolean field3311 = false;

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Loe;")
    public static class127 field3314 = new class127(8, 3);

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1312(boolean arg0, String arg1, byte arg2) {
        int var3 = -82 % ((arg2 - 53) / 37);
        field3312++;
        String var4 = arg1.toLowerCase();
        short[] var5 = new short[16];
        int var6 = 0;
        int var7 = arg0 ? 32768 : 0;
        int var8 = var7 + (arg0 ? class47.field721.field2620 : class47.field721.field2632);
        for (int var9 = var7; var9 < var8; var9++) {
            class472 var12 = class47.field721.method1063(0, var9);
            if (var12.field7218 && var12.method2839((byte) 110).toLowerCase().indexOf(var4) != -1) {
                if (var6 >= 50) {
                    class507.field7657 = -1;
                    class78.field1390 = null;
                    return;
                }
                if (var6 >= var5.length) {
                    short[] var13 = new short[var5.length * 2];
                    for (int var14 = 0; var14 < var6; var14++) {
                        var13[var14] = var5[var14];
                    }
                    var5 = var13;
                }
                var5[var6++] = (short) var9;
            }
        }
        class310.field4676 = 0;
        class507.field7657 = var6;
        class78.field1390 = var5;
        String[] var10 = new String[class507.field7657];
        for (int var11 = 0; var11 < class507.field7657; var11++) {
            var10[var11] = class47.field721.method1063(0, var5[var11]).method2839((byte) 110);
        }
        class205.method1261(-30299, class78.field1390, var10);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(CI)Z")
    public static final boolean method1313(char arg0, int arg1) {
        if (arg1 != -30321) {
            field3311 = true;
        }
        field3313++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static void method1314(int arg0) {
        if (arg0 == 0) {
            field3314 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Lqi;")
    public static final class382 method1315(int arg0, int arg1) {
        field3315++;
        class382[] var2 = class72.method539(127);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class382 var4 = var2[var3];
            if (var4.field5558 == arg1) {
                return var4;
            }
        }
        return null;
    }
}
