import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class63 extends class152 {

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "[Lpj;")
    public class101[] field1068;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Loj;")
    public static class17 field1065 = new class17(64);

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Lhh;")
    public static class163 field1073 = class137.method1065("Untersuchen", 17);

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "Lhh;")
    private static class163 field1071 = class137.method1065("Location", 17);

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "Lhh;")
    public static class163 field1075 = field1071;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Lpa;")
    public static class123 field1069;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "Lv;")
    public static class22 field1074;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Lhk;")
    public static final class105 method443(int arg0) {
        field1067++;
        int var1 = class257.field4505[0] * class256.field4478[0];
        int var2 = 99 % ((-arg0 - 40) / 44);
        byte[] var3 = class223.field4070[0];
        class105 var7;
        if (class81.field1574[0]) {
            byte[] var4 = class35.field568[0];
            int[] var5 = new int[var1];
            for (int var6 = 0; var6 < var1; var6++) {
                var5[var6] = class3.method27(class7.method50(255, var4[var6]) << 24, class111.field2097[class7.method50(var3[var6], 255)]);
            }
            var7 = new class15(class107.field2043, class2.field36, class65.field1107[0], class180.field3267[0], class256.field4478[0], class257.field4505[0], var5);
        } else {
            int[] var8 = new int[var1];
            for (int var9 = 0; var9 < var1; var9++) {
                var8[var9] = class111.field2097[class7.method50(var3[var9], 255)];
            }
            var7 = new class105(class107.field2043, class2.field36, class65.field1107[0], class180.field3267[0], class256.field4478[0], class257.field4505[0], var8);
        }
        class67.method463(118);
        return var7;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Z")
    public static final boolean method444(int arg0, int arg1, int arg2, int arg3) {
        if (class52.method366(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class234.method1620(var4 + 1, class228.field4107[arg0][arg1][arg2] + arg3, var5 + 1) && class234.method1620(var4 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class234.method1620(var4 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class234.method1620(var4 + 1, class228.field4107[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method445(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1075 = null;
        field1065 = null;
        field1073 = null;
        field1071 = null;
        field1074 = null;
        field1069 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z")
    public final boolean method446(int arg0, int arg1) {
        field1066++;
        return arg1 == 29255 ? this.field1068[arg0].field1945 : true;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lpa;Lpa;IZ)V")
    public class63(class123 arg0, class123 arg1, int arg2, boolean arg3) {
        class128 var5 = new class128();
        int var6 = arg0.method971(arg2, 0);
        this.field1068 = new class101[var6];
        int[] var7 = arg0.method958((byte) 71, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method973(arg2, true, var7[var8]);
            class16 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class16 var12 = (class16) var5.method1017(102); var12 != null; var12 = (class16) var5.method1016((byte) -31)) {
                if (var12.field231 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method975(var11, 0, -97);
                } else {
                    var13 = arg1.method975(0, var11, -87);
                }
                var10 = new class16(var11, var13);
                var5.method1018((byte) 114, var10);
            }
            this.field1068[var7[var8]] = new class101(var9, var10);
        }
    }
}
