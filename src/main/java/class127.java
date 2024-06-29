import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class127 {

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lrf;")
    public static class163 field2612 = class53.method392(56, "Freie Welt");

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lrf;")
    public static class163 field2613 = class53.method392(121, "Hidden)2use");

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lrf;")
    public static class163 field2615 = class53.method392(96, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[S")
    public static short[] field2608 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lne;")
    public static class126 field2614;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lu;")
    public static class184 field2617;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lu;")
    public static class184 field2618;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lea;")
    public static class42 field2611;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static final void method838(boolean arg0) {
        int var1 = class166.field3380 * 128 + 64;
        field2616++;
        int var2 = class17.field296 * 128 + 64;
        int var3 = class175.method1186(var1, class60.field1227, var2, 1) - class199.field3939;
        if (var3 > class33.field644) {
            class33.field644 += (var3 - class33.field644) * class117.field2482 / 1000 + class65.field1372;
            if (class33.field644 > var3) {
                class33.field644 = var3;
            }
        }
        if (!arg0) {
            method838(false);
        }
        if (class33.field644 > var3) {
            class33.field644 -= (class33.field644 - var3) * class117.field2482 / 1000 + class65.field1372;
            if (class33.field644 < var3) {
                class33.field644 = var3;
            }
        }
        if (var2 > class90.field1939) {
            class90.field1939 += (var2 - class90.field1939) * class117.field2482 / 1000 + class65.field1372;
            if (var2 < class90.field1939) {
                class90.field1939 = var2;
            }
        }
        if (var1 > class86.field1882) {
            class86.field1882 += (var1 - class86.field1882) * class117.field2482 / 1000 + class65.field1372;
            if (class86.field1882 > var1) {
                class86.field1882 = var1;
            }
        }
        if (var2 < class90.field1939) {
            class90.field1939 -= (class90.field1939 - var2) * class117.field2482 / 1000 + class65.field1372;
            if (var2 > class90.field1939) {
                class90.field1939 = var2;
            }
        }
        if (var1 < class86.field1882) {
            class86.field1882 -= (class86.field1882 - var1) * class117.field2482 / 1000 + class65.field1372;
            if (var1 > class86.field1882) {
                class86.field1882 = var1;
            }
        }
        int var4 = class181.field3637 * 128 + 64;
        int var5 = class202.field3992 * 128 + 64;
        int var6 = class175.method1186(var5, class60.field1227, var4, 1) - class44.field888;
        int var7 = var6 - class33.field644;
        int var8 = var4 - class90.field1939;
        int var9 = var5 - class86.field1882;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class64.field1354;
        if (var11 > class44.field894) {
            class44.field894 += class136.field2797 + (var11 - class44.field894) * class44.field896 / 1000;
            if (class44.field894 > var11) {
                class44.field894 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class44.field894) {
            class44.field894 -= (class44.field894 - var11) * class44.field896 / 1000 + class136.field2797;
            if (var11 > class44.field894) {
                class44.field894 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class64.field1354 += class44.field896 * var13 / 1000 + class136.field2797;
            class64.field1354 &= 0x7FF;
        }
        if (var13 < 0) {
            class64.field1354 -= class136.field2797 + -var13 * class44.field896 / 1000;
            class64.field1354 &= 0x7FF;
        }
        int var14 = var12 - class64.field1354;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class64.field1354 = var12;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method839(int arg0, int arg1, int arg2) {
        class101.field2116 = true;
        class163.field3303 = arg0;
        class113.field2393 = arg1;
        class194.field3821 = arg2;
        class97.field2056 = -1;
        class92.field2009 = -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method840(int arg0) {
        field2613 = null;
        field2615 = null;
        field2614 = null;
        field2617 = null;
        if (arg0 != 10487) {
            field2615 = null;
        }
        field2608 = null;
        field2611 = null;
        field2618 = null;
        field2612 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public static final void method841(boolean arg0) {
        field2609++;
        class172.field3490 = new class5();
        if (arg0) {
            method839(30, 12, -114);
        }
    }
}
