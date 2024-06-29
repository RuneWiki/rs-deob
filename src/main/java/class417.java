import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class417 extends class35 {

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field6033;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field6039;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lmn;")
    public static class78 field6046 = new class78(100);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[[[B")
    public static byte[][][] field6034;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I", line = 12)
    public final int method2605(int arg0) {
        if (arg0 == -23241) {
            field6042++;
            return this.field6033 >> 18 & 0x7;
        } else {
            return -22;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)Z", line = 25)
    public final boolean method2606(byte arg0) {
        if (arg0 > -6) {
            this.method2619((byte) -48);
        }
        field6036++;
        return (this.field6033 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z", line = 38)
    public final boolean method2607(boolean arg0) {
        field6044++;
        if (!arg0) {
            field6034 = null;
        }
        return ((this.field6033 & 0x658F50) >> 22) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z", line = 50)
    public final boolean method2608(byte arg0) {
        if (arg0 != -42) {
            field6034 = null;
        }
        field6038++;
        return (this.field6033 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I", line = 62)
    public final int method2609(byte arg0) {
        if (arg0 < 85) {
            this.method2608((byte) 7);
        }
        field6030++;
        return class397.method2531(102, this.field6033);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V", line = 74)
    public static final void method2610(int arg0, int arg1, int arg2, int arg3) {
        field6032++;
        class221 var4 = class447.method2795(9, (byte) -49, arg0);
        var4.method1692(0);
        if (arg1 == -8202) {
            var4.field3297 = arg3;
            var4.field3291 = arg2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V", line = 91)
    public static final void method2611(int arg0, int arg1) {
        class135 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class126 var4 = class311.field4527[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class436.field6353; var5++) {
                    for (int var6 = 0; var6 < class139.field2209; var6++) {
                        var2 = var4.method801(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class126 var10 = class311.field4527[var9];
                                if (var10 != null) {
                                    int var11 = var4.method794(var6, var5) - var10.method794(var6, var5);
                                    int var12 = var4.method794(var6 + 1, var5) - var10.method794(var6 + 1, var5);
                                    int var13 = var4.method794(var6 + 1, var5 + 1) - var10.method794(var6 + 1, var5 + 1);
                                    int var14 = var4.method794(var6, var5 + 1) - var10.method794(var6, var5 + 1);
                                    var10.method798(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V", line = 155)
    public static final void method2612(byte arg0) {
        class22.field343.method106((byte) -106);
        if (arg0 > -51) {
            method2614(-45, 81, -91, 120, 58);
        }
        field6035++;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z", line = 166)
    public final boolean method2613(int arg0) {
        field6043++;
        int var2 = 105 % ((-arg0 - 44) / 60);
        return (this.field6033 & 0x6AE55654) >> 30 != 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V", line = 180)
    public static final void method2614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 390087964) {
            field6034 = null;
        }
        if (arg4 <= arg3) {
            class47.method379(arg3, (byte) 99, arg1, class286.field4283[arg2], arg4);
        } else {
            class47.method379(arg4, (byte) 100, arg1, class286.field4283[arg2], arg3);
        }
        field6040++;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Z", line = 200)
    public final boolean method2615(boolean arg0) {
        if (arg0) {
            this.method2607(true);
        }
        field6041++;
        return ((this.field6033 & 0x2AA075) >> 21) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V", line = 211)
    public static final void method2616(int arg0, byte arg1, int arg2) {
        if (arg1 <= 10) {
            field6046 = null;
        }
        client.field3636 = new class18(arg2);
        field6045++;
        class30.field436 = new class18(arg0);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z", line = 229)
    public final boolean method2617(int arg0, int arg1) {
        int var3 = -126 % ((arg1 + 36) / 40);
        field6031++;
        return (this.field6033 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 240)
    public static void method2618(int arg0) {
        if (arg0 == 390087964) {
            field6046 = null;
            field6034 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)Z", line = 254)
    public final boolean method2619(byte arg0) {
        field6037++;
        if (arg0 > -79) {
            this.field6033 = -9;
        }
        return (this.field6033 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(II)V", line = 264)
    public class417(int arg0, int arg1) {
        this.field6033 = arg0;
        this.field6039 = arg1;
    }
}
