import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class2 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[[B")
    public static byte[][] field32 = new byte[50][];

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
    public static long field33 = 0L;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[[I")
    public static int[][] field41 = new int[104][104];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lqa;")
    public static class105 field37 = new class105(50);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lvc;")
    public static class137 field43 = class45.method325("mapback", -46);

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lpb;")
    public static class100 field44 = new class100();

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field45 = 3353893;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    public static int[] field34;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)V")
    public static final void method14(int arg0, int arg1, int arg2, int arg3) {
        field38++;
        if (arg0 < 128 || arg3 < 128 || arg0 > 13056 || arg3 > 13056) {
            class49.field1090 = -1;
            class112.field2673 = -1;
            return;
        }
        int var4 = class32.method241(arg0, (byte) -120, class28.field627, arg3) - arg2;
        int var5 = var4 - class7.field142;
        int var6 = arg0 - class44.field947;
        int var7 = arg3 - class1.field3;
        int var8 = class97.field2258[class37.field812];
        int var9 = class97.field2257[class37.field812];
        int var10 = class97.field2258[class6.field123];
        if (arg1 != 25358) {
            field39 = 107;
        }
        int var11 = class97.field2257[class6.field123];
        int var12 = var6 * var11 + var7 * var10 >> 16;
        int var13 = var7 * var11 - var6 * var10 >> 16;
        int var15 = var5 * var9 - var8 * var13 >> 16;
        int var16 = var5 * var8 + var9 * var13 >> 16;
        if (var16 < 50) {
            class112.field2673 = -1;
            class49.field1090 = -1;
        } else {
            class112.field2673 = (var15 << 9) / var16 + 167;
            class49.field1090 = (var12 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I")
    public abstract int method15(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lnb;II)Lia;")
    public static final class57 method16(class88 arg0, int arg1, int arg2) {
        if (arg2 > -16) {
            method20((byte) 12);
        }
        field36++;
        return class1.method1(-21847, arg0, arg1) ? class106.method770(true) : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method17(Component arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method18(int arg0) {
        class100.field2328++;
        class72.field1527.method845(189, 100);
        field35++;
        if (class112.field2670 != -1) {
            class141.method1080(false, class112.field2670);
            class105.field2433 = -1;
            class21.field439 = true;
            class112.field2670 = -1;
            class34.field737 = true;
        }
        if (class73.field1543 != -1) {
            class141.method1080(false, class73.field1543);
            class80.field1825 = true;
            class105.field2433 = -1;
            class73.field1543 = -1;
        }
        if (class80.field1777 != -1) {
            class141.method1080(false, class80.field1777);
            class80.field1777 = -1;
            class33.method245(30, -101);
        }
        if (class89.field2138 != -1) {
            class141.method1080(false, class89.field2138);
            class89.field2138 = -1;
        }
        if (class56.field1201 != arg0) {
            class141.method1080(false, class56.field1201);
            class56.field1201 = -1;
            class105.field2433 = -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method19(Component arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method20(byte arg0) {
        field44 = null;
        field41 = null;
        field43 = null;
        field34 = null;
        field37 = null;
        field32 = null;
        if (arg0 <= 60) {
            field46 = 96;
        }
    }
}
