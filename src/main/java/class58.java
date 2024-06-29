import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class58 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field964 = 0;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lha;")
    public static class46 field966 = class271.method1828("Lade Titelbild )2 ", -46);

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lha;")
    private static class46 field970 = class271.method1828("Select", -46);

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Lha;")
    public static class46 field969 = field970;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Ldl;")
    public static class43 field967 = new class43(5000);

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Lej;")
    public static class188 field972 = new class188(64);

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
    public static boolean field973 = true;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lpi;Lpi;I)V")
    public static final void method398(class181 arg0, class181 arg1, int arg2) {
        field965++;
        class181.field3252 = arg0;
        class238.field4221 = arg1;
        if (arg2 != -9502) {
            field972 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method399(byte arg0) {
        if (arg0 <= 93) {
            field970 = null;
        }
        field972 = null;
        field969 = null;
        field970 = null;
        field967 = null;
        field966 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILmi;I)V")
    public static final void method400(int arg0, int arg1, class81 arg2, int arg3) {
        if ((arg1 & 0x20) != 0) {
            arg2.field2565 = class147.field2651.method567((byte) 127);
            arg2.field2560 = class147.field2651.method579(arg0 ^ 0xFFFFFFC4);
        }
        field968++;
        if ((arg1 & 0x8) != 0) {
            int var4 = class147.field2651.method567((byte) 127);
            int var5 = class147.field2651.method554((byte) 88);
            if (var4 == 65535) {
                var4 = -1;
            }
            class134.method1037(var4, arg2, 3118, var5);
        }
        if ((arg1 & 0x400) != 0) {
            arg2.field2534 = class147.field2651.method595(-16950);
            arg2.field2527 = class147.field2651.method566(arg0 + 255);
            arg2.field2513 = class147.field2651.method558(1);
            arg2.field2536 = class147.field2651.method566(255);
            arg2.field2576 = class147.field2651.method567((byte) 127) + class157.field2803;
            arg2.field2587 = class147.field2651.method545((byte) -89) + class157.field2803;
            arg2.field2514 = class147.field2651.method554((byte) 88);
            arg2.field2549 = 0;
            arg2.field2547 = 1;
        }
        if ((arg1 & 0x100) != 0) {
            int var6 = class147.field2651.method554((byte) 88);
            int var7 = class147.field2651.method595(arg0 ^ 0xFFFFBDCA);
            arg2.method1067(var6, var7, (byte) -14, class157.field2803);
        }
        if ((arg1 & 0x200) != 0) {
            arg2.field2543 = class147.field2651.method545((byte) 125);
            int var8 = class147.field2651.method562((byte) -71);
            arg2.field2544 = 0;
            if (arg2.field2543 == 65535) {
                arg2.field2543 = -1;
            }
            arg2.field2551 = 0;
            arg2.field2581 = var8 >> 16;
            arg2.field2532 = class157.field2803 + (var8 & 0xFFFF);
            if (class157.field2803 < arg2.field2532) {
                arg2.field2544 = -1;
            }
            if (arg2.field2543 != -1 && class157.field2803 == arg2.field2532) {
                int var9 = class138.method1054(-22225, arg2.field2543).field4745;
                if (var9 != -1) {
                    class170 var10 = class119.method951(arg0, var9);
                    if (var10 != null && var10.field3020 != null) {
                        class146.method1084(arg2.field2546, var10, arg0 ^ 0x4D, arg2.field2585, class277.field4824 == arg2, 0);
                    }
                }
            }
        }
        if ((arg1 & 0x40) != 0) {
            arg2.field2555 = class147.field2651.method545((byte) -115);
            if (arg2.field2555 == 65535) {
                arg2.field2555 = -1;
            }
        }
        if ((arg1 & 0x2) != 0) {
            int var11 = class147.field2651.method566(arg0 + 255);
            int var12 = class147.field2651.method566(arg0 + 255);
            arg2.method1067(var11, var12, (byte) -103, class157.field2803);
            arg2.field2515 = class157.field2803 + 300;
            arg2.field2580 = class147.field2651.method595(-16950);
        }
        if ((arg1 & 0x4) != arg0) {
            arg2.field2567 = class147.field2651.method577(arg0);
            if (arg2.field2567.method318(0, (byte) 112) == 126) {
                arg2.field2567 = arg2.field2567.method339(1, arg0 + 102);
                class155.method1136(125, arg2.method636(-1537), 2, arg2.field2567);
            } else if (class277.field4824 == arg2) {
                class155.method1136(arg0 ^ 0x5E, arg2.method636(-1537), 2, arg2.field2567);
            }
            arg2.field2566 = 0;
            arg2.field2564 = 150;
            arg2.field2573 = 0;
        }
        if ((arg1 & 0x80) != 0) {
            int var13 = class147.field2651.method579(-69);
            int var14 = class147.field2651.method566(arg0 + 255);
            int var15 = class147.field2651.method595(-16950);
            int var16 = class147.field2651.field1380;
            boolean var17 = (var13 & 0x8000) != 0;
            if (arg2.field1528 != null && arg2.field1527 != null) {
                long var18 = arg2.field1528.method349((byte) 59);
                boolean var20 = false;
                if (var14 <= 1) {
                    if (!var17 && (class248.field4383 == 1 || class78.field1497 == 1)) {
                        var20 = true;
                    } else {
                        for (int var21 = 0; var21 < class42.field714; var21++) {
                            if (class29.field562[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var20 && class180.field3211 == 0) {
                    int var22 = -1;
                    class162.field2853.field1380 = 0;
                    class147.field2651.method553(-1, var15, class162.field2853.field1368, 0);
                    class162.field2853.field1380 = 0;
                    class46 var24;
                    if (var17) {
                        var13 &= 0x7FFF;
                        class111 var23 = class119.method952((byte) 117, class162.field2853);
                        var22 = var23.field2108;
                        var24 = var23.field2096.method1357(true, class162.field2853);
                    } else {
                        var24 = class22.method137(class85.method665(-91, class162.field2853).method312(-9211));
                    }
                    arg2.field2567 = var24.method303(0);
                    arg2.field2564 = 150;
                    arg2.field2573 = var13 & 0xFF;
                    arg2.field2566 = var13 >> 8;
                    if (var14 == 2) {
                        class92.method720((byte) 79, class109.method855(0, new class46[] { class161.field2838, arg2.method636(arg0 ^ 0xFFFFF9FF) }), (class46) null, var17 ? 17 : 1, var22, var24);
                    } else if (var14 == 1) {
                        class92.method720((byte) 79, class109.method855(arg0, new class46[] { class126.field2317, arg2.method636(-1537) }), (class46) null, var17 ? 17 : 1, var22, var24);
                    } else {
                        class92.method720((byte) 79, arg2.method636(-1537), (class46) null, var17 ? 17 : 2, var22, var24);
                    }
                }
            }
            class147.field2651.field1380 = var15 + var16;
        }
        if ((arg1 & 0x10) == 0) {
            return;
        }
        int var25 = class147.field2651.method554((byte) 88);
        byte[] var26 = new byte[var25];
        class75 var27 = new class75(var26);
        class147.field2651.method553(-1, var25, var26, 0);
        class151.field2696[arg3] = var27;
        arg2.method647(var27, 13120);
    }
}
