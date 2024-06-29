import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class183 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lmq;")
    private class358 field2615 = new class358();

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lmq;")
    private class358 field2630 = new class358();

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lmq;")
    private class358 field2632 = new class358();

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "Lmq;")
    private class358 field2633 = new class358();

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "Lwm;")
    private class403 field2635 = new class403(4);

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "B")
    private byte field2639 = 0;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public volatile int field2640 = 0;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public volatile int field2638 = 0;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lwm;")
    private class403 field2641 = new class403(8);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "J")
    private long field2636;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "Lwt;")
    private class207 field2642;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lqc;")
    private class532 field2637;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    private final int method1142(int arg0) {
        field2624++;
        if (arg0 != 0) {
            this.method1149((byte) 22, -123, (byte) 106, true, 121);
        }
        return this.field2632.method2117(7025) + this.field2633.method2117(7025);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public final void method1143(boolean arg0) {
        field2618++;
        if (this.field2637 == null) {
            return;
        }
        try {
            this.field2635.field5665 = 0;
            this.field2635.method2376((byte) 122, 7);
            this.field2635.method2330(-97, 0);
            if (!arg0) {
                method1150(true);
            }
            this.field2637.method3139(4, 0, this.field2635.field5663, 0);
        } catch (IOException var3) {
            try {
                this.field2637.method3138((byte) 118);
            } catch (Exception var2) {
            }
            this.field2638 = -2;
            this.field2637 = null;
            this.field2640++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Ljava/lang/Object;I[I)V")
    public static final void method1144(Object[] arg0, int arg1, int[] arg2) {
        class330.method1984(arg0, arg2, arg1, true, arg2.length - 1);
        field2621++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1145(String arg0, int arg1) {
        field2611++;
        if (arg0 == null) {
            return;
        }
        if (arg1 != 21120) {
            method1157((byte) 52, 106, -70, null);
        }
        if (!(class520.field7656 < 100 || class269.field3918) || class520.field7656 >= 200) {
            class486.method2802(class441.field6172.method3116(class149.field1979, (byte) 105), (byte) 42);
            return;
        }
        String var2 = class487.method2806(arg1 ^ 0xFFFFF037, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class520.field7656; var3++) {
            String var7 = class487.method2806(arg1 ^ 0xFFFFF037, class540.field7902[var3]);
            if (var7 != null && var7.equals(var2)) {
                class486.method2802(arg0 + class481.field6697.method3116(class149.field1979, (byte) 126), (byte) 45);
                return;
            }
            if (class474.field6600[var3] != null) {
                String var8 = class487.method2806(-23881, class474.field6600[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class486.method2802(arg0 + class481.field6697.method3116(class149.field1979, (byte) 116), (byte) 77);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class419.field5909; var4++) {
            String var5 = class487.method2806(-23881, class366.field5229[var4]);
            if (var5 != null && var5.equals(var2)) {
                class486.method2802(class539.field7876.method3116(class149.field1979, (byte) 98) + arg0 + class321.field4636.method3116(class149.field1979, (byte) 99), (byte) 89);
                return;
            }
            if (class213.field3081[var4] != null) {
                String var6 = class487.method2806(-23881, class213.field3081[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class486.method2802(class539.field7876.method3116(class149.field1979, (byte) 116) + arg0 + class321.field4636.method3116(class149.field1979, (byte) 120), (byte) 103);
                    return;
                }
            }
        }
        if (class487.method2806(arg1 - 45001, class246.field3587.field256).equals(var2)) {
            class486.method2802(class342.field4970.method3116(class149.field1979, (byte) 111), (byte) 90);
        } else {
            class291.field4255++;
            class61.method498(class12.field159, 1);
            class30.field357.method2376((byte) 122, class540.method3175(arg0, arg1 - 21119));
            class30.field357.method2377((byte) -53, arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public final void method1146(int arg0) {
        if (this.field2637 != null) {
            this.field2637.method3138((byte) 122);
        }
        if (arg0 == 25647) {
            field2628++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILhm;I)I")
    public static final int method1147(int arg0, class150 arg1, int arg2) {
        field2609++;
        if (arg2 != 3) {
            method1150(true);
        }
        if (!client.method1291(arg1).method2887(arg0, (byte) 116) && arg1.field2039 == null) {
            return -1;
        } else if (arg1.field2135 == null || arg1.field2135.length <= arg0) {
            return -1;
        } else {
            return arg1.field2135[arg0];
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1148(int arg0, int arg1) {
        field2629++;
        int var2 = -36 / ((arg1 + 31) / 43);
        if (class32.field370 == 1) {
            class87.field1087 = arg0;
        } else if (class32.field370 == 2 || class32.field370 == 3) {
            class53.field683 = arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIBZI)Lwt;")
    public final class207 method1149(byte arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 <= 126) {
            this.method1152(-76);
        }
        field2617++;
        long var6 = (long) ((arg4 << 16) + arg1);
        class207 var8 = new class207();
        var8.field5164 = var6;
        var8.field2494 = arg3;
        var8.field2996 = arg0;
        if (arg3) {
            if (this.method1159(20) >= 20) {
                throw new RuntimeException();
            }
            this.field2615.method2118(var8, true);
        } else if (this.method1142(0) < 20) {
            this.field2632.method2118(var8, true);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)V")
    public static final void method1150(boolean arg0) {
        if (arg0) {
            method1157((byte) 109, 84, 126, null);
        }
        class37.field408 = 0;
        field2614++;
        class363.field5190.method2656(64);
        class363.field5190.method2657(8492, class232.field3407);
        class37.field408++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZI)V")
    public static final void method1151(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2619++;
        if (class120.method807(-8810, arg4)) {
            class320.method1929(class494.field6988[arg4], arg1 ^ 0x21, arg1, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z")
    public final boolean method1152(int arg0) {
        if (arg0 == 20) {
            field2616++;
            return this.method1159(arg0) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
    public final boolean method1153(byte arg0) {
        field2627++;
        int var2 = 54 % ((43 - arg0) / 51);
        return this.method1142(0) >= 20;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Z")
    public final boolean method1154(byte arg0) {
        field2613++;
        if (this.field2637 != null) {
            long var2 = class465.method2699((byte) 14);
            int var4 = (int) (var2 - this.field2636);
            this.field2636 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2634 += var4;
            if (this.field2634 > 30000) {
                try {
                    this.field2637.method3138((byte) -100);
                } catch (Exception var28) {
                }
                this.field2637 = null;
            }
        }
        if (this.field2637 == null) {
            return this.method1159(20) == 0 && this.method1142(0) == 0;
        }
        try {
            this.field2637.method3136((byte) -20);
            for (class207 var5 = (class207) this.field2615.method2119(0); var5 != null; var5 = (class207) this.field2615.method2116((byte) 44)) {
                this.field2635.field5665 = 0;
                this.field2635.method2376((byte) 122, 1);
                this.field2635.method2330(-114, (int) var5.field5164);
                this.field2637.method3139(4, 0, this.field2635.field5663, 0);
                this.field2630.method2118(var5, true);
            }
            for (class207 var6 = (class207) this.field2632.method2119(0); var6 != null; var6 = (class207) this.field2632.method2116((byte) 44)) {
                this.field2635.field5665 = 0;
                this.field2635.method2376((byte) 122, 0);
                this.field2635.method2330(-101, (int) var6.field5164);
                this.field2637.method3139(4, 0, this.field2635.field5663, 0);
                this.field2633.method2118(var6, true);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2637.method3137(1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2634 = 0;
                byte var9 = 0;
                if (this.field2642 == null) {
                    var9 = 8;
                } else if (this.field2642.field2997 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2642.field2994.field5663.length - this.field2642.field2996;
                    int var11 = 512 - this.field2642.field2997;
                    if (var10 - this.field2642.field2994.field5665 < var11) {
                        var11 = var10 - this.field2642.field2994.field5665;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field2637.method3134(var11, this.field2642.field2994.field5663, this.field2642.field2994.field5665, (byte) -127);
                    if (this.field2639 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2642.field2994.field5663[this.field2642.field2994.field5665 + var12] = (byte) class509.method3039(this.field2642.field2994.field5663[this.field2642.field2994.field5665 + var12], this.field2639);
                        }
                    }
                    this.field2642.field2997 += var11;
                    this.field2642.field2994.field5665 += var11;
                    if (this.field2642.field2994.field5665 == var10) {
                        this.field2642.method2132(12);
                        this.field2642.field2496 = false;
                        this.field2642 = null;
                    } else if (this.field2642.field2997 == 512) {
                        this.field2642.field2997 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2641.field5665;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2637.method3134(var13, this.field2641.field5663, this.field2641.field5665, (byte) -98);
                    if (this.field2639 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2641.field5663[this.field2641.field5665 + var14] = (byte) class509.method3039(this.field2641.field5663[this.field2641.field5665 + var14], this.field2639);
                        }
                    }
                    this.field2641.field5665 += var13;
                    if (var9 <= this.field2641.field5665) {
                        if (this.field2642 == null) {
                            this.field2641.field5665 = 0;
                            int var15 = this.field2641.method2357((byte) 122);
                            int var16 = this.field2641.method2338(0);
                            int var17 = this.field2641.method2357((byte) 126);
                            int var18 = this.field2641.method2319((byte) 118);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class207 var24;
                            if (var20) {
                                for (var24 = (class207) this.field2633.method2119(0); var24 != null && var24.field5164 != var21; var24 = (class207) this.field2633.method2116((byte) 44)) {
                                }
                            } else {
                                for (var24 = (class207) this.field2630.method2119(0); var24 != null && var24.field5164 != var21; var24 = (class207) this.field2630.method2116((byte) 44)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field2642 = var24;
                            this.field2642.field2994 = new class403(var18 + var25 + this.field2642.field2996);
                            this.field2642.field2994.method2376((byte) 122, var19);
                            this.field2642.field2994.method2354(var18, false);
                            this.field2642.field2997 = 8;
                            this.field2641.field5665 = 0;
                        } else if (this.field2642.field2997 != 0) {
                            throw new IOException();
                        } else if (this.field2641.field5663[0] == -1) {
                            this.field2642.field2997 = 1;
                            this.field2641.field5665 = 0;
                        } else {
                            this.field2642 = null;
                        }
                    }
                }
            }
            int var26 = 3 % ((-arg0 - 4) / 53);
            return true;
        } catch (IOException var29) {
            try {
                this.field2637.method3138((byte) 126);
            } catch (Exception var27) {
            }
            this.field2638 = -2;
            this.field2637 = null;
            this.field2640++;
            return this.method1159(20) == 0 && this.method1142(0) == 0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public final void method1155(int arg0) {
        if (this.field2637 != null) {
            this.field2637.method3135(arg0 + 5002);
        }
        if (arg0 != -2) {
            this.field2633 = null;
        }
        field2620++;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    private final void method1156(byte arg0) {
        field2631++;
        if (this.field2637 == null) {
            return;
        }
        try {
            if (arg0 < 79) {
                this.field2637 = null;
            }
            this.field2635.field5665 = 0;
            this.field2635.method2376((byte) 122, 6);
            this.field2635.method2330(-128, 3);
            this.field2637.method3139(4, 0, this.field2635.field5663, 0);
        } catch (IOException var3) {
            try {
                this.field2637.method3138((byte) 8);
            } catch (Exception var2) {
            }
            this.field2638 = -2;
            this.field2637 = null;
            this.field2640++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIILjava/lang/Object;)[B")
    public static final byte[] method1157(byte arg0, int arg1, int arg2, Object arg3) {
        field2610++;
        if (arg0 <= 65) {
            return null;
        } else if (arg3 == null) {
            return null;
        } else if (arg3 instanceof byte[]) {
            byte[] var4 = (byte[]) arg3;
            return class294.method1813(arg1, var4, (byte) 74, arg2);
        } else if (arg3 instanceof class538) {
            class538 var5 = (class538) arg3;
            return var5.method1224(arg2, (byte) 70, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lqc;ZB)V")
    public final void method1158(class532 arg0, boolean arg1, byte arg2) {
        if (this.field2637 != null) {
            try {
                this.field2637.method3138((byte) 2);
            } catch (Exception var9) {
            }
            this.field2637 = null;
        }
        field2623++;
        int var4 = -1 % ((41 - arg2) / 37);
        this.field2637 = arg0;
        this.method1156((byte) 93);
        this.method1161((byte) -76, arg1);
        this.field2642 = null;
        this.field2641.field5665 = 0;
        while (true) {
            class207 var5 = (class207) this.field2630.method2115((byte) -103);
            if (var5 == null) {
                while (true) {
                    class207 var6 = (class207) this.field2633.method2115((byte) -103);
                    if (var6 == null) {
                        if (this.field2639 != 0) {
                            try {
                                this.field2635.field5665 = 0;
                                this.field2635.method2376((byte) 122, 4);
                                this.field2635.method2376((byte) 122, this.field2639);
                                this.field2635.method2372(0, -128);
                                this.field2637.method3139(4, 0, this.field2635.field5663, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field2637.method3138((byte) 21);
                                } catch (Exception var7) {
                                }
                                this.field2640++;
                                this.field2637 = null;
                                this.field2638 = -2;
                            }
                        }
                        this.field2634 = 0;
                        this.field2636 = class465.method2699((byte) 14);
                        return;
                    }
                    this.field2632.method2118(var6, true);
                }
            }
            this.field2615.method2118(var5, true);
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
    public final int method1159(int arg0) {
        field2612++;
        if (arg0 != 20) {
            this.method1154((byte) -54);
        }
        return this.field2615.method2117(7025) + this.field2630.method2117(arg0 ^ 0x1B65);
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public final void method1160(int arg0) {
        try {
            this.field2637.method3138((byte) -62);
        } catch (Exception var2) {
        }
        if (arg0 != 0) {
            return;
        }
        field2625++;
        this.field2638 = -1;
        this.field2637 = null;
        this.field2639 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2640++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
    public final void method1161(byte arg0, boolean arg1) {
        field2622++;
        if (this.field2637 == null) {
            return;
        }
        if (arg0 >= -15) {
            this.method1154((byte) 104);
        }
        try {
            this.field2635.field5665 = 0;
            this.field2635.method2376((byte) 122, arg1 ? 2 : 3);
            this.field2635.method2330(-110, 0);
            this.field2637.method3139(4, 0, this.field2635.field5663, 0);
        } catch (IOException var4) {
            try {
                this.field2637.method3138((byte) -109);
            } catch (Exception var3) {
            }
            this.field2640++;
            this.field2637 = null;
            this.field2638 = -2;
        }
    }
}
