import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class227 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lm;")
    public static class242 field3126 = new class242();

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[[I")
    public static int[][] field3129 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field3128 = 127;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field3130 = 0;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lir;I)V", line = 3)
    public static final void method1476(class185 arg0, int arg1) {
        class129.field1685 = arg0;
        if (arg1 != 4) {
            field3126 = null;
        }
        field3125++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 15)
    public static final void method1477(int arg0, int arg1) {
        class281.field4133 = arg1;
        field3123++;
        class51 var2 = class379.field5550;
        synchronized (class379.field5550) {
            class379.field5550.method372(123);
            if (arg0 != 1) {
                field3128 = 81;
            }
        }
        class51 var3 = class289.field4328;
        synchronized (class289.field4328) {
            class289.field4328.method372(120);
        }
        class51 var4 = class192.field2677;
        synchronized (class192.field2677) {
            class192.field2677.method372(arg0 ^ 0x75);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BIIIII)V", line = 39)
    public static final void method1478(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3127++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (arg0 != 87) {
            field3126 = null;
        }
        class351.method2317(false, arg2 + arg4, class444.field6416[arg1], arg4 - arg2, arg3);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var7--;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class351.method2317(false, var23, class444.field6416[var21], var24, arg3);
            class351.method2317(false, var23, class444.field6416[var22], var24, arg3);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lkb;", line = 124)
    public static final class351 method1479(int arg0) {
        field3124++;
        if (arg0 != 7) {
            field3126 = null;
        }
        try {
            return (class351) Class.forName("gf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 143)
    public static void method1480(byte arg0) {
        if (arg0 <= 20) {
            method1477(18, 118);
        }
        field3126 = null;
        field3129 = null;
    }
}
