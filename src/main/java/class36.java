import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[Lsa;")
    public static class260[] field538 = new class260[28];

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lid;")
    public static class149 field541 = class60.method382("<col=ff9040>", (byte) 95);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lcl;")
    public static class194 field533 = new class194();

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Ldj;")
    public static class187 field542;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lal;")
    public static class230 field537;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public static int[] field532;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)I")
    public static final int method208(byte arg0, int arg1, int arg2) {
        if (arg0 != -97) {
            field533 = null;
        }
        int var3 = arg1 >>> 31;
        field540++;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method209(byte arg0) {
        field542 = null;
        field541 = null;
        field537 = null;
        int var1 = 125 % ((arg0 - 2) / 59);
        field538 = null;
        field532 = null;
        field533 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public static final int method210(int arg0, int arg1) {
        if (arg1 != 127) {
            method211(-103);
        }
        field535++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static final void method211(int arg0) {
        if (arg0 > -98) {
            field541 = null;
        }
        class27.field406.method1291(0);
        field536++;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method212(int arg0) {
        int var1 = class173.field3180.method1161(class198.field3603);
        field539++;
        if (arg0 > -13) {
            return;
        }
        for (int var2 = 0; var2 < class60.field1092; var2++) {
            int var6 = class173.field3180.method1161(class59.method365(var2, (byte) 124));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class2.field32;
        int var4 = class189.field3383 - (var1 / 2);
        int var5 = class60.field1092 * 15 + 21;
        if (class218.field3851 < (var1 + var4)) {
            var4 = class218.field3851 - var1;
        }
        if (var3 + var5 > class240.field4197) {
            var3 = class240.field4197 - var5;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        if (class100.field1771 != 1) {
            if (class260.field4582 != class189.field3383 || class2.field32 != class159.field2921) {
                class214.field3797 = class159.field2921;
                class100.field1771 = 1;
                class276.field4937 = class260.field4582;
                return;
            }
            client.field2845 = (class23.field324 ? 26 : 22) + class60.field1092 * 15;
            class82.field1499 = var1;
            class228.field3996 = var3;
            class240.field4194 = var4;
            class32.field481 = true;
            class100.field1771 = 0;
        } else if (class276.field4937 == class189.field3383 && class214.field3797 == class2.field32) {
            class240.field4194 = var4;
            class228.field3996 = var3;
            class82.field1499 = var1;
            class100.field1771 = 0;
            client.field2845 = class60.field1092 * 15 + (class23.field324 ? 26 : 22);
            class32.field481 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static final void method213(boolean arg0) {
        class249.field4358.method1290((byte) -127);
        field534++;
        if (arg0) {
            class231.field4066.method1290((byte) 126);
            class148.field2666.method1290((byte) 35);
        }
    }
}
