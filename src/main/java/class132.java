import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class132 extends class314 {

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field2412 = 0;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lhc;")
    public static class171 field2409 = new class171(64);

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "[I")
    public static int[] field2416 = new int[14];

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "B")
    public byte field2411;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lok;")
    public static class149 field2418;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lud;")
    public class279 field2407;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lud;")
    public class279 field2410;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2419;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 5 % ((56 - arg3) / 49);
        class268.field4810 = arg2;
        class143.field2601 = arg5;
        class170.field3077 = arg1;
        class101.field1891 = arg0;
        field2414++;
        class260.field4627 = arg4;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V", line = 21)
    public static void method1037(boolean arg0) {
        field2409 = null;
        if (arg0) {
            method1036(-88, 61, -1, -119, -61, -50);
        }
        field2418 = null;
        field2416 = null;
        field2419 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1038(int arg0) {
        class162.method1279(arg0 ^ arg0, 0, 0);
        field2406++;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1039(int arg0) {
        int var1 = class155.field2803;
        int var2 = class7.field149;
        int var3 = class324.field5660;
        int var4 = class3.field108;
        field2415++;
        if (class52.field1087 == null || class51.field1051 == null) {
            if (class266.field4799.method1186(class240.field4222, arg0 - 42725) && class266.field4799.method1186(class307.field5461, -22698)) {
                class52.field1087 = class216.method1583(arg0 - 20122, 0, class266.field4799, class240.field4222);
                class51.field1051 = class216.method1583(arg0 - 20063, 0, class266.field4799, class307.field5461);
                if (class97.field1824) {
                    if ((class52.field1087 instanceof class316)) {
                        class52.field1087 = new class227((class66) class52.field1087);
                    } else {
                        class52.field1087 = new class203((class66) class52.field1087);
                    }
                    if (class51.field1051 instanceof class316) {
                        class51.field1051 = new class227((class66) class51.field1051);
                    } else {
                        class51.field1051 = new class203((class66) class51.field1051);
                    }
                }
            } else if (class97.field1824) {
                class256.method1828(var1, var3, var2, 20, class279.field4947, 256 - field2417);
            } else {
                class146.method1126(var1, var3, var2, 20, class279.field4947, 256 - field2417);
            }
        }
        if (class52.field1087 != null && class51.field1051 != null) {
            int var5 = var2 / class52.field1087.field1377;
            for (int var6 = 0; var6 < var5; var6++) {
                class52.field1087.method584(var1 + (class52.field1087.field1377 * var6), var3);
            }
            class51.field1051.method584(var1, var3);
            class51.field1051.method573(var1 - (class51.field1051.field1377 - var2), var3);
        }
        class292.field5210.method419(class90.field1697, var1 + 3, var3 + 14, class212.field3715, -1);
        if (class97.field1824) {
            class256.method1828(var1, var3 + 20, var2, var4 - 20, class279.field4947, 256 - field2417);
        } else {
            class146.method1126(var1, var3 + 20, var2, var4 - 20, class279.field4947, 256 - field2417);
        }
        int var7 = class51.field1056;
        int var8 = class130.field2363;
        for (int var9 = 0; var9 < class194.field3488; var9++) {
            int var10 = ((class194.field3488 - var9 - 1) * 15) + var3 + 35;
            if (var8 > var1 && var8 < var1 + var2 && var7 > var10 - 13 && (var10 + 3) > var7) {
                if (class97.field1824) {
                    class256.method1828(var1, var10 - 13, var2, 16, class210.field3698, 256 - class266.field4797);
                } else {
                    class146.method1126(var1, var10 - 13, var2, 16, class210.field3698, 256 - class266.field4797);
                }
            }
        }
        if ((class306.field5436 == null || class306.field5434 == null || class179.field3241 == null) && class266.field4799.method1186(field2408, -22698) && class266.field4799.method1186(class237.field4123, -22698) && class266.field4799.method1186(class154.field2793, -22698)) {
            class306.field5436 = class216.method1583(arg0 - 20079, 0, class266.field4799, field2408);
            class306.field5434 = class216.method1583(arg0 ^ 0xFFFFB1B1, 0, class266.field4799, class237.field4123);
            class179.field3241 = class216.method1583(114, 0, class266.field4799, class154.field2793);
            if (class97.field1824) {
                if (class306.field5436 instanceof class316) {
                    class306.field5436 = new class227((class66) class306.field5436);
                } else {
                    class306.field5436 = new class203((class66) class306.field5436);
                }
                if ((class306.field5434 instanceof class316)) {
                    class306.field5434 = new class227((class66) class306.field5434);
                } else {
                    class306.field5434 = new class203((class66) class306.field5434);
                }
                if ((class179.field3241 instanceof class316)) {
                    class179.field3241 = new class227((class66) class179.field3241);
                } else {
                    class179.field3241 = new class203((class66) class179.field3241);
                }
            }
        }
        if (class306.field5436 != null && class306.field5434 != null && class179.field3241 != null) {
            int var11 = var2 / class306.field5436.field1377;
            for (int var12 = 0; var12 < var11; var12++) {
                class306.field5436.method584(var1 + (class306.field5436.field1377 * var12), -class306.field5436.field1375 + var4 + var3);
            }
            int var13 = (var4 - 20) / class306.field5434.field1375;
            for (int var14 = 0; var14 < var13; var14++) {
                class306.field5434.method584(var1, class306.field5434.field1375 * var14 + var3 + 20);
                class306.field5434.method573(var2 + var1 - class306.field5434.field1377, var3 + 20 - -(class306.field5434.field1375 * var14));
            }
            class179.field3241.method584(var1, var3 - (class179.field3241.field1375 - var4));
            class179.field3241.method573(var2 + var1 - class179.field3241.field1377, -class179.field3241.field1375 + var4 + var3);
        }
        int var15 = 0;
        if (arg0 != 20027) {
            method1036(-86, -78, -23, 70, -57, 110);
        }
        while (class194.field3488 > var15) {
            int var16 = (class194.field3488 - var15 - 1) * 15 + var3 + 35;
            int var17 = class212.field3715;
            if (var1 < var8 && var8 < var1 + var2 && (var16 - 13) < var7 && (var16 + 3) > var7) {
                var17 = class133.field2427;
            }
            class292.field5210.method419(class24.method213(var15, true), var1 + 3, var16, var17, 0);
            var15++;
        }
        class33.method298(class155.field2803, class324.field5660, (byte) 106, class7.field149, class3.field108);
    }
}
