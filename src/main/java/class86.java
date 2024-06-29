import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class86 extends class766 implements class618 {

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "[I")
    public static int[] field1287 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "C")
    public char field1284;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "F")
    public static float field1285;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "J")
    public long field1278;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "Lde;")
    public static class418 field1289;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLha;)V")
    public static final void method761(int arg0, byte arg1, class475 arg2) {
        field1283++;
        if (!class83.field1263 || !class317.field4537) {
            class300.field4323 = 0;
            return;
        }
        if (class209.field3073) {
            class34.field414 = class205.field3010.method1454((byte) 63);
        }
        class107.field1535 = 0;
        class222.field3263 = 0;
        class469.field6392 = 0;
        int[] var3 = arg2.method459();
        class406.field5589 = (int) ((float) var3[3] / 3.0F);
        class227.field3309 = (int) ((float) var3[2] / 3.0F);
        arg2.method467(class265.field3736);
        if ((int) ((float) class265.field3736[0] / 3.0F) != class597.field8526 || (int) ((float) class265.field3736[1] / 3.0F) != class122.field2067) {
            class597.field8526 = (int) ((float) class265.field3736[0] / 3.0F);
            class122.field2067 = (int) ((float) class265.field3736[1] / 3.0F);
            class297.field4319 = class597.field8526 >> 1;
            class209.field3068 = class122.field2067 >> 1;
            class116.field1991 = new int[class597.field8526 * class122.field2067];
        }
        class705.field9884 = arg2.method489();
        class300.field4323 = 0;
        for (int var4 = 0; var4 < class258.field3667; var4++) {
            class330.method2009(arg0, arg1 + 17903, class547.field7575[var4], arg2);
        }
        if (arg1 != 63) {
            return;
        }
        for (int var5 = 0; var5 < class393.field5456; var5++) {
            class330.method2009(arg0, arg1 + 17903, class792.field10863[var5], arg2);
        }
        for (int var6 = 0; var6 < class260.field3684; var6++) {
            class330.method2009(arg0, arg1 ^ 0x4611, class289.field4221[var6], arg2);
        }
        class414.field5685 = 0;
        if (class300.field4323 > 0) {
            int var7 = class116.field1991.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
                class116.field1991[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class116.field1991[var9++] = Integer.MAX_VALUE;
            }
            class37.field443 = 1;
            for (int var10 = 0; var10 < class300.field4323; var10++) {
                class131 var11 = class717.field10013[var10];
                class460.method2688(var11.field2215[1], var11.field2217[1], true, var11.field2217[3], var11.field2206[3], var11.field2215[3], var11.field2217[0], var11.field2206[1], var11.field2215[0], var11.field2206[0]);
                class460.method2688(var11.field2215[2], var11.field2217[2], true, var11.field2217[3], var11.field2206[3], var11.field2215[3], var11.field2217[1], var11.field2206[2], var11.field2215[1], var11.field2206[1]);
            }
            class37.field443 = 2;
        }
        if (class209.field3073) {
            class438.field6081 = class205.field3010.method1454((byte) 46) - class34.field414;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)I")
    public final int method762(byte arg0) {
        field1279++;
        if (arg0 != -82) {
            field1289 = null;
        }
        return this.field1282;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)J")
    public final long method763(byte arg0) {
        if (arg0 != -89) {
            field1289 = null;
        }
        field1276++;
        return this.field1278;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)C")
    public final char method764(byte arg0) {
        field1277++;
        int var2 = -8 % ((39 - arg0) / 33);
        return this.field1284;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
    public final int method765(int arg0) {
        field1288++;
        int var2 = 61 / ((-arg0 - 23) / 49);
        return this.field1286;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
    public final int method766(int arg0) {
        field1281++;
        if (arg0 != 3036) {
            method767(false);
        }
        return this.field1275;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
    public static void method767(boolean arg0) {
        field1287 = null;
        if (!arg0) {
            field1289 = null;
        }
        field1289 = null;
    }
}
