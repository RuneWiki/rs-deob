import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class88 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lqb;")
    public static class176 field1530 = new class176(30);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Ldc;")
    public static class37 field1535 = class185.method1233((byte) 86, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lbb;")
    public static class14 field1533 = new class14(64);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ldc;")
    private static class37 field1539 = class185.method1233((byte) 86, "Login server offline)3");

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Ldc;")
    public static class37 field1542 = field1539;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "S")
    public static short field1543 = 32767;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1541 = 4;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[[Llh;")
    public static class127[][] field1540 = new class127[field1541][500];

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
    public static int[] field1544 = new int[field1541];

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "[I")
    public static int[] field1545 = new int[128];

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lcj;")
    public static class33 field1538;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lia;IIIZ)V")
    public void method585(class88 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1537++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIILia;IJZ)Z")
    public static final boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, class88 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class92.method603(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lia;")
    public class88 method587(int arg0, int arg1, int arg2) {
        field1534++;
        return this;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method588(int arg0) {
        if (arg0 != 128) {
            method591(null, -64, 125, 47, 111, -57, -12);
        }
        field1545 = null;
        field1535 = null;
        field1544 = null;
        field1540 = null;
        field1542 = null;
        field1539 = null;
        field1533 = null;
        field1538 = null;
        field1530 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[Lqh;")
    public static final class182[] method589(byte arg0) {
        if (arg0 > -117) {
            return null;
        }
        class182[] var1 = new class182[class113.field2018];
        for (int var2 = 0; var2 < class113.field2018; var2++) {
            int var3 = class238.field4336[var2] * class174.field3308[var2];
            byte[] var4 = class217.field4040[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class5.field42[class58.method449(var4[var6], 255)];
            }
            var1[var2] = new class182(class67.field1207, class160.field3030, class166.field3162[var2], class7.field77[var2], class174.field3308[var2], class238.field4336[var2], var5);
        }
        field1531++;
        class97.method644(true);
        return var1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Z")
    public boolean method590() {
        field1532++;
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
    public abstract int method5();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(La;IIIIII)La;")
    public static final class1 method591(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1536++;
        long var7 = (long) arg5;
        class1 var9 = (class1) class10.field137.method1180(var7, (byte) 106);
        if (var9 == null) {
            class126 var10 = class126.method883(class149.field2821, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method887(64, 768, -50, -10, -50);
            class10.field137.method1179(arg4 ^ 0xFFFFFD8A, var7, var9);
        }
        int var11 = arg0.method1();
        int var12 = arg0.method11();
        int var13 = arg0.method15();
        int var14 = arg0.method17();
        class1 var15 = var9.method6(true, true);
        if (arg3 != 0) {
            var15.method4(arg3);
        }
        class42 var16 = (class42) var15;
        if (class145.method1008(class125.field2246, arg1 + var11, arg2 + var13, (byte) 120) != arg6 || arg6 != class145.method1008(class125.field2246, arg1 + var12, arg2 + var14, (byte) 119)) {
            for (int var17 = 0; var17 < var16.field866; var17++) {
                var16.field862[var17] += class145.method1008(class125.field2246, var16.field884[var17] + arg1, var16.field863[var17] + arg2, (byte) 99) - arg6;
            }
            var16.field875 = false;
        }
        if (arg4 != -630) {
            field1544 = null;
        }
        return var15;
    }
}
