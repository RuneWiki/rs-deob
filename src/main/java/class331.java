import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class331 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "S")
    public static short field4876 = 1;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Z")
    public static boolean field4878 = true;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4879 = " is already on your ignore list.";

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lm;")
    public static class242 field4873 = new class242();

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field4881 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
    public static boolean field4880;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method2166(byte arg0) {
        class229.field3152.method366(31);
        field4875++;
        class136.field1768.method366(-79);
        if (arg0 <= 103) {
            method2167((byte) -19);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method2167(byte arg0) {
        field4874++;
        if (arg0 < 77) {
            return;
        }
        class149.method1030(false, true);
        if (class345.field5136 >= 0 && class345.field5136 != 0) {
            class169.method1127((byte) -59, class345.field5136);
            class345.field5136 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method2168(int arg0) {
        int var1 = -1;
        if (arg0 >= -37) {
            return;
        }
        while (class402.field5869 > var1) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class117.field1528[var1];
            }
            class317 var6 = class176.field2382[var5];
            if (var6 != null && var6.field2128 > 0) {
                var6.field2128--;
                if (var6.field2128 == 0) {
                    var6.field2104 = null;
                }
            }
            var1++;
        }
        field4883++;
        for (int var2 = 0; var2 < class93.field1274; var2++) {
            int var3 = class62.field943[var2];
            class163 var4 = class388.field5670[var3];
            if (var4 != null && var4.field2128 > 0) {
                var4.field2128--;
                if (var4.field2128 == 0) {
                    var4.field2104 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static void method2169(int arg0) {
        field4879 = null;
        field4873 = null;
        if (arg0 != 1) {
            field4878 = true;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBIILrk;)V")
    public static final void method2170(int arg0, byte arg1, int arg2, int arg3, class223 arg4) {
        field4877++;
        long var5 = (long) (arg0 | arg2 << 14 | arg3 << 28);
        class171 var7 = (class171) class267.field3962.method2826(false, var5);
        if (var7 == null) {
            class171 var8 = new class171();
            class267.field3962.method2815(-1, var5, var8);
            var8.field2345.method1560(-109, arg4);
            return;
        }
        class159 var9 = class129.method915(126, arg4.field3072);
        int var10 = var9.field2037;
        if (var9.field2000 == 1) {
            var10 = (arg4.field3069 + 1) * var10;
        }
        if (arg1 < 31) {
            method2167((byte) 13);
        }
        for (class223 var11 = (class223) var7.field2345.method1575(0); var11 != null; var11 = (class223) var7.field2345.method1573((byte) -128)) {
            class159 var12 = class129.method915(126, var11.field3072);
            int var13 = var12.field2037;
            if (var12.field2000 == 1) {
                var13 = (var11.field3069 + 1) * var13;
            }
            if (var10 > var13) {
                class329.method2158(true, var11, arg4);
                return;
            }
        }
        var7.field2345.method1560(-110, arg4);
    }
}
