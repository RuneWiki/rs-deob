import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class206 extends class346 {

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field2990;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field2993 = -2;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "Laa;")
    public static class76 field2994 = new class76(65, 4);

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "Lhf;")
    public static class474 field2995 = new class474(8);

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public final void method1346(int arg0) {
        this.field2990.method2851();
        field2989++;
        if (arg0 > -46) {
            field2993 = -73;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLya;)V")
    public static final void method1347(boolean arg0, class11 arg1) {
        field2992++;
        int var2 = class148.field2227;
        int var3 = class274.field4094;
        int var4 = class88.field1383;
        int var5 = class27.field396 - 3;
        byte var6 = 20;
        if (class41.field535 == null || class456.field6687 == null) {
            if (class142.field2146.method551(108, class193.field2848) && class142.field2146.method551(99, class338.field5221)) {
                class41.field535 = arg1.method98(class319.method1994(class142.field2146, class193.field2848, 0), true);
                class319 var7 = class319.method1994(class142.field2146, class338.field5221, 0);
                class456.field6687 = arg1.method98(var7, true);
                var7.method1996();
                class473.field6950 = arg1.method98(var7, true);
            } else {
                arg1.method162(var2, var3, var4, var6, 255 - class164.field2439 << 24 | class506.field7440, 1);
            }
        }
        if (class41.field535 != null && class456.field6687 != null) {
            int var8 = (var4 - (class456.field6687.method470() * 2)) / class41.field535.method470();
            for (int var9 = 0; var9 < var8; var9++) {
                class41.field535.method936(class456.field6687.method470() + (var2 + (var9 * class41.field535.method470())), var3);
            }
            class456.field6687.method936(var2, var3);
            class473.field6950.method936(var2 + var4 - class473.field6950.method470(), var3);
        }
        class345.field5325.method1918(-1, var3 + 14, class42.field551 | 0xFF000000, 120, class227.field3205.method2103(class30.field430, (byte) 34), var2 + 3);
        arg1.method162(var2, var3 + var6, var4, var5 - var6, class506.field7440 | 255 - class164.field2439 << 24, 1);
        if (arg0) {
            field2993 = 55;
        }
        int var10 = class45.field591.method44((byte) 118);
        int var11 = class45.field591.method54(28455);
        int var12 = 0;
        for (class477 var13 = (class477) class154.field2334.method2957(-90); var13 != null; var13 = (class477) class154.field2334.method2947(-82)) {
            int var30 = (class448.field6610 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var2 < var10 && var10 < var2 + var4 && var11 > (var30 - 13) && var11 < (var30 + 4) && var13.field7036) {
                arg1.method162(var2, var30 - 12, var4, 16, class480.field7072 | 255 - class12.field121 << 24, 1);
            }
        }
        if ((class78.field1087 == null || class230.field3235 == null || class297.field4431 == null) && class142.field2146.method551(99, class145.field2186) && class142.field2146.method551(111, class351.field5407) && class142.field2146.method551(-35, class23.field341)) {
            class319 var14 = class319.method1994(class142.field2146, class351.field5407, 0);
            class230.field3235 = arg1.method98(var14, true);
            var14.method1996();
            class73.field1011 = arg1.method98(var14, true);
            class78.field1087 = arg1.method98(class319.method1994(class142.field2146, class145.field2186, 0), true);
            class319 var15 = class319.method1994(class142.field2146, class23.field341, 0);
            class297.field4431 = arg1.method98(var15, true);
            var15.method1996();
            class225.field3177 = arg1.method98(var15, true);
        }
        int var16 = 0;
        if (class78.field1087 != null && class230.field3235 != null && class297.field4431 != null) {
            int var17 = (var4 - (class297.field4431.method470() * 2)) / class78.field1087.method470();
            for (int var18 = 0; var18 < var17; var18++) {
                class78.field1087.method936(var2 - (-class297.field4431.method470() - (class78.field1087.method470() * var18)), -class78.field1087.method465() + (var3 - -var5));
            }
            int var19 = (var5 - class297.field4431.method465() - var6) / class230.field3235.method465();
            for (int var20 = 0; var20 < var19; var20++) {
                class230.field3235.method936(var2, var3 + var6 + class230.field3235.method465() * var20);
                class73.field1011.method936(var2 + var4 - class73.field1011.method470(), class230.field3235.method465() * var20 + var3 + var6);
            }
            class297.field4431.method936(var2, var5 + var3 - class297.field4431.method465());
            class225.field3177.method936(var4 + (var2 - class297.field4431.method470()), -class297.field4431.method465() + var5 + var3);
        }
        for (class477 var21 = (class477) class154.field2334.method2957(-71); var21 != null; var21 = (class477) class154.field2334.method2947(51)) {
            int var22 = (class448.field6610 - var16 - 1) * 16 + var6 + var3 + 13;
            int var23 = class42.field551 | 0xFF000000;
            if (var10 > var2 && var10 < var2 + var4 && var22 - 13 < var11 && var22 + 4 > var11 && var21.field7036) {
                var23 = class292.field4380 | 0xFF000000;
            }
            int[] var24 = null;
            if (class219.method1383(var21.field7034, 72)) {
                var24 = class164.field2437.method1749((int) var21.field7030, -20230).field1147;
            } else if (var21.field7038 != -1) {
                var24 = class164.field2437.method1749(var21.field7038, -20230).field1147;
            } else if (class26.method255(var21.field7034, -127)) {
                class351 var25 = class88.field1375[(int) var21.field7030];
                if (var25 != null) {
                    class277 var26 = var25.field5409;
                    if (var26.field4148 != null) {
                        var26 = var26.method1734((byte) -124, class307.field4619);
                    }
                    if (var26 != null) {
                        var24 = var26.field4195;
                    }
                }
            } else if (class310.method1943(var21.field7034, 1)) {
                Object var27 = null;
                class486 var28;
                if (var21.field7034 == 1011) {
                    var28 = class119.field1824.method248((int) var21.field7030, 30);
                } else {
                    var28 = class119.field1824.method248((int) (var21.field7030 >>> 32 & 0x7FFFFFFFL), 30);
                }
                if (var28.field7219 != null) {
                    var28 = var28.method2909((byte) 92, class307.field4619);
                }
                if (var28 != null) {
                    var24 = var28.field7227;
                }
            }
            String var29 = class73.method513(0, var21);
            if (var24 != null) {
                var29 = var29 + class428.method2538(-1, var24);
            }
            class345.field5325.method1923(var2 + 3, class179.field2652, var23, -127, var22, class184.field2715, 0, var29);
            if (var21.field7027) {
                class283.field4279.method936(class342.field5252.method2599(var29, (byte) 107) + (var2 + 5), var22 + -12);
            }
            var16++;
        }
        class517.method3065(class27.field396, class88.field1383, class148.field2227, -3243, class274.field4094);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public static void method1348(boolean arg0) {
        field2994 = null;
        if (arg0) {
            field2995 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
    public static final void method1349(boolean arg0) {
        field2991++;
        if (arg0) {
            method1349(false);
        }
        if (class310.field4799 < 0) {
            return;
        }
        long var1 = class381.method2281((byte) -122);
        class310.field4799 = (int) ((long) class310.field4799 - (var1 - class21.field315));
        if (class310.field4799 <= 0) {
            class317.field4900 = class181.field2696.field1701;
            class167.field2476 = class181.field2696.field1712;
            class351.field5403 = class181.field2696.field1708;
            class480.field7086 = class181.field2696.field1716;
            class170.field2495 = class181.field2696.field1699;
            class503.field7412 = class181.field2696.field1702;
            class385.field5803 = class181.field2696.field1715;
            class378.field5692 = class181.field2696.field1706;
            class23.field333 = class181.field2696.field1698;
            class265.field3958 = class181.field2696.field1704;
            class310.field4799 = -1;
        } else {
            int var3 = (class310.field4799 << 8) / class471.field6897;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class480.field7086 = ((class458.field6697 & 0xFF00) * var3 + ((class181.field2696.field1716 & 0xFF00) * var4) & 0xFF0000) + ((class458.field6697 & 0xFF00FF) * var3 + (class181.field2696.field1716 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class351.field5403 = (class181.field2696.field1708 - class233.field3280) * var6 + class233.field3280;
            class23.field333 = (class181.field2696.field1698 - class492.field7332) * var6 + class492.field7332;
            class265.field3958 = (class181.field2696.field1704 - class180.field2665) * var6 + class180.field2665;
            class503.field7412 = (class181.field2696.field1702 - class281.field4242) * var6 + class281.field4242;
            class167.field2476 = class19.field289 * var3 + class181.field2696.field1712 * var4 >> 8;
            class317.field4900 = (class181.field2696.field1701 - class494.field7345) * var6 + class494.field7345;
            class385.field5803 = ((class68.field904 & 0xFF00FF) * var3 + ((class181.field2696.field1715 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class68.field904 & 0xFF00) * var3 + (class181.field2696.field1715 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class170.field2495 = (class181.field2696.field1699 - class489.field7289) * var6 + class489.field7289;
            if (class170.field2500 != class181.field2696.field1706) {
                class378.field5692 = class27.field395.method117(class170.field2500, class181.field2696.field1706, var6, class378.field5692);
            }
        }
        class21.field315 = var1;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(I)V")
    public class206(int arg0) {
        this.field2990 = new NativeHeap(arg0);
    }

    static {
        new class347("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
