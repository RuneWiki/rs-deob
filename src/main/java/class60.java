import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class60 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
    public static int[] field907 = new int[2];

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Lvb;")
    public static class247 field917 = new class247();

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method430(int arg0) {
        field907 = null;
        if (arg0 == 3) {
            field917 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)[Ltg;")
    public static final class107[] method431(int arg0) {
        field916++;
        class107[] var1 = new class107[class33.field535];
        for (int var2 = 0; var2 < class33.field535; var2++) {
            int var3 = class196.field3425[var2] * class121.field1978[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class143.field2319[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class254.field4443[class5.method43(var5[var6], 255)];
            }
            var1[var2] = new class48(class219.field3777, class78.field1273, class220.field3782[var2], class23.field410[var2], class196.field3425[var2], class121.field1978[var2], var4);
        }
        if (arg0 != 255) {
            method434((byte) 51);
        }
        class143.method919(arg0 ^ 0xEF);
        return var1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lii;")
    public static final class261 method432(int arg0, int arg1) {
        class261 var2 = (class261) class69.field1103.method1794(-1, (long) arg1);
        field920++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field2206.method89(arg1, arg0, 107);
        class261 var4 = new class261();
        if (var3 != null) {
            var4.method1768(false, new class230(var3));
        }
        class69.field1103.method1795(arg0 + 14174, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
    public static final void method433(int arg0, boolean arg1) {
        class145.field2376 = arg1;
        class203.field3498 = -1;
        class97.field1575 = 1;
        class218.field3765 = null;
        class255.field4466 = 0;
        class263.field4577 = arg0;
        field921++;
        class43.field674 = -1;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method434(byte arg0) {
        field899++;
        if (class68.field1095[98]) {
            class1.field5 += (12 - class1.field5) / 2;
        } else if (class68.field1095[99]) {
            class1.field5 += (-class1.field5 - 12) / 2;
        } else {
            class1.field5 /= 2;
        }
        class113.field1845 += class1.field5 / 2;
        if (class68.field1095[96]) {
            class23.field409 += (-class23.field409 - 24) / 2;
        } else if (class68.field1095[97]) {
            class23.field409 += (24 - class23.field409) / 2;
        } else {
            class23.field409 /= 2;
        }
        class214.field3682 += class23.field409 / 2;
        int var1 = class258.field4507.field2681 + class171.field2872;
        int var2 = class222.field3832 + class258.field4507.field2654;
        if ((class16.field297 - var2) < -500 || class16.field297 - var2 > 500 || (class243.field4220 - var1) < -500 || class243.field4220 - var1 > 500) {
            class16.field297 = var2;
            class243.field4220 = var1;
        }
        if (class16.field297 != var2) {
            class16.field297 += (var2 - class16.field297) / 16;
        }
        if (arg0 >= 48) {
            if (class243.field4220 != var1) {
                class243.field4220 += (var1 - class243.field4220) / 16;
            }
            class236.method1616((byte) 57);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZIIII)V")
    public static final void method435(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field915++;
        if (arg1) {
            method430(-111);
        }
        int var6 = class144.method931(101, class125.field2056, class23.field408, arg4);
        int var7 = class144.method931(100, class125.field2056, class23.field408, arg2);
        int var8 = class144.method931(-65, class124.field2032, class11.field219, arg0);
        int var9 = class144.method931(113, class124.field2032, class11.field219, arg5);
        for (int var10 = var6; var10 <= var7; var10++) {
            class171.method1133(class149.field2507[var10], var8, arg3, var9, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method436(int arg0) {
        class145.field2362 = 0;
        int var1 = (class258.field4507.field2681 >> 7) + class222.field3844;
        field898++;
        int var2 = (class258.field4507.field2654 >> 7) + class253.field4420;
        if (arg0 != -28337) {
            field917 = null;
        }
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class145.field2362 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class145.field2362 = 1;
        }
        if (class145.field2362 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class145.field2362 = 0;
        }
    }
}
