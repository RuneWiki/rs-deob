import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class174 {

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "J")
    public long field3184 = 0L;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3177 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    public static int[] field3174 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lsf;")
    public static class108 field3172 = class140.method973(255, "www");

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field3175;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lvc;")
    public static class193 field3186;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lma;")
    public class290 field3173;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lma;")
    public class290 field3183;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lik;B)V", line = 16)
    public static final void method1235(class262 arg0, byte arg1) {
        class203.field3664 = class122.method853(class239.field4166, 29772, arg0, 0);
        field3185++;
        class145.field2623 = new class257[class203.field3664.length];
        class51.field740 = new class257[class203.field3664.length];
        class73.field1109 = new class257[class203.field3664.length];
        for (int var2 = 0; var2 < class203.field3664.length; var2++) {
            class203.field3664[var2].method1834();
            class145.field2623[var2] = class203.field3664[var2].method1832();
            class203.field3664[var2].method1834();
            class51.field740[var2] = class203.field3664[var2].method1832();
            class203.field3664[var2].method1834();
            class73.field1109[var2] = class203.field3664[var2].method1832();
            class203.field3664[var2].method1834();
        }
        class147.field2640 = class75.method496(0, arg0, class266.field4683, (byte) 9);
        class270.field4732 = class83.method557(arg0, 0, class213.field3790, arg1);
        class298.field5188 = class83.method557(arg0, 0, class109.field1916, (byte) -68);
        class145.field2624 = class83.method557(arg0, 0, class96.field1539, (byte) -101);
        class291.field5089 = class83.method557(arg0, 0, class5.field65, (byte) -114);
        class86.field1362 = class20.method140(arg0, 0, true, class247.field4270);
        class104.field1813 = class20.method140(arg0, 0, true, class184.field3384);
        class10.field129 = class68.method455(0, false, arg0, class140.field2471);
        class223.field3948 = class20.method140(arg0, 0, true, class211.field3771);
        class130.field2226 = class20.method140(arg0, 0, true, class68.field1057);
        class209.field3743 = class83.method560(0, class291.field5085, -113, arg0);
        class157.field2831 = class83.method560(0, class144.field2544, -104, arg0);
        class223.field3953.method524(class157.field2831, (int[]) null);
        class158.field2850.method524(class157.field2831, (int[]) null);
        class256.field4525.method524(class157.field2831, (int[]) null);
        if (class231.field4051) {
            class238.field4160 = class122.method853(class240.field4174, 29772, arg0, 0);
            for (int var3 = 0; var3 < class238.field4160.length; var3++) {
                class238.field4160[var3].method1833();
            }
        }
        class12 var4 = class178.method1262(arg0, class242.field4197, (byte) -33, 0);
        var4.method77();
        if (class231.field4051) {
            class248.field4296 = new class49(var4);
        } else {
            class248.field4296 = var4;
        }
        class12[] var5 = class75.method496(0, arg0, class69.field1063, (byte) 9);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method77();
        }
        if (class231.field4051) {
            class284.field4971 = new class135[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class284.field4971[var7] = new class49(var5[var7]);
            }
        } else {
            class284.field4971 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class147.field2640.length; var12++) {
            class147.field2640[var12].method83(var8 + var10, var10 + var11, var9 + var10);
        }
        class203.field3664[0].method1826(var8 + var10, var10 + var11, var9 + var10);
        if (class231.field4051) {
            class178.field3230 = new class135[class147.field2640.length];
            for (int var13 = 0; var13 < class147.field2640.length; var13++) {
                class178.field3230[var13] = new class49(class147.field2640[var13]);
            }
        } else {
            class178.field3230 = class147.field2640;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I", line = 133)
    public static final int method1236(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -6219) {
            field3177 = 117;
        }
        field3179++;
        return arg0 > arg1 ? arg0 : (arg2 >= arg1 ? arg1 : arg2);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)I", line = 151)
    public static final int method1237(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1815) {
            method1239(false);
        }
        field3176++;
        if (arg0 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg3;
            int var5 = ((-16711936 & arg0) >>> 7) * arg3 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
            int var6 = (arg0 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00;
            return (var6 >> 7) + var5;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILqj;IIIBI)V", line = 172)
    public static final void method1238(int arg0, class256 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class129.method887(arg3, arg2, arg1.field4457, arg0, arg1.field4452, 118, arg6, arg4);
        if (arg5 != -19) {
            field3172 = (class108) null;
        }
        field3188++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 190)
    public static void method1239(boolean arg0) {
        field3172 = null;
        field3186 = null;
        if (!arg0) {
            field3186 = (class193) null;
        }
        field3174 = null;
    }
}
