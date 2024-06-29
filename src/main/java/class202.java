import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class202 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "J")
    public long field3247;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Lel;")
    public class202 field3245;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lel;")
    public class202 field3248;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    public static int[] field3244;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Lia;")
    public static final class226 method1387(int arg0) {
        field3241++;
        if (arg0 != -28724) {
            field3244 = null;
        }
        class243 var1 = new class243(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], class145.field2332[0], class194.field3113);
        class287.method1923(0);
        return var1;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method1388(int arg0) {
        field3249++;
        if (this.field3248 == null) {
            return;
        }
        int var2 = 39 % ((arg0 + 42) / 51);
        this.field3248.field3245 = this.field3245;
        this.field3245.field3248 = this.field3248;
        this.field3245 = null;
        this.field3248 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)Lea;")
    public static final class37 method1389(boolean arg0) {
        field3250++;
        int var1 = class236.field3847[0] * class148.field2385[0];
        byte[] var2 = class145.field2332[0];
        if (!arg0) {
            method1390(-90, 28, 100, -29, (byte) 117, -17);
        }
        class37 var6;
        if (class139.field2276[0]) {
            byte[] var3 = class211.field3447[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class220.method1495(class194.field3113[method1393(var2[var5], 255)], method1393(var3[var5], 255) << 24);
            }
            var6 = new class191(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class194.field3113[method1393(255, var2[var8])];
            }
            var6 = new class37(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], var7);
        }
        class287.method1923(0);
        return var6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class145.field2331 = arg1;
        class213.field3486 = arg2;
        if (arg4 != -90) {
            field3242 = 39;
        }
        class97.field1590 = arg5;
        class19.field327 = arg3;
        field3246++;
        class101.field1661 = arg0;
        if (class213.field3486 >= 100) {
            int var6 = class19.field327 * 128 + 64;
            int var7 = class97.field1590 * 128 + 64;
            int var8 = class225.method1583(var7, var6, class250.field3980, 0) - class145.field2331;
            int var9 = var8 - class17.field301;
            int var10 = var6 - class54.field925;
            int var11 = var7 - class99.field1625;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class200.field3187 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            field3242 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class200.field3187 < 128) {
                class200.field3187 = 128;
            }
            if (class200.field3187 > 383) {
                class200.field3187 = 383;
            }
        }
        class229.field3786 = 2;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public static void method1391(int arg0) {
        if (arg0 >= 25) {
            field3244 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)Z")
    public final boolean method1392(boolean arg0) {
        if (!arg0) {
            this.field3247 = -117L;
        }
        field3243++;
        return this.field3248 != null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
    public static int method1393(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
