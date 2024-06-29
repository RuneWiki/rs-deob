import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class204 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lem;")
    private class434 field3106 = new class434();

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Lem;")
    private class434 field3120 = new class434();

    @OriginalMember(owner = "client!un", name = "r", descriptor = "Lem;")
    private class434 field3121 = new class434();

    @OriginalMember(owner = "client!un", name = "t", descriptor = "Lem;")
    private class434 field3123 = new class434();

    @OriginalMember(owner = "client!un", name = "y", descriptor = "Lhw;")
    private class208 field3128 = new class208(4);

    @OriginalMember(owner = "client!un", name = "E", descriptor = "B")
    private byte field3133 = 0;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public volatile int field3132 = 0;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public volatile int field3130 = 0;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Lhw;")
    private class208 field3131 = new class208(8);

    @OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
    public static int[] field3122;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    private int field3127;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "J")
    private long field3129;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Lhl;")
    private class247 field3126;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "Lgi;")
    public static class437 field3125;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "Ljn;")
    private class87 field3134;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)V")
    public final void method1389(boolean arg0, int arg1) {
        if (arg1 != 3) {
            this.method1393(34);
        }
        field3114++;
        if (this.field3126 == null) {
            return;
        }
        try {
            this.field3128.field3162 = 0;
            this.field3128.method1479((byte) -108, arg0 ? 2 : 3);
            this.field3128.method1418(0, true);
            this.field3126.method1707(-49, this.field3128.field3193, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3126.method1711((byte) 111);
            } catch (Exception var3) {
            }
            this.field3130 = -2;
            this.field3126 = null;
            this.field3132++;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
    private final int method1390(int arg0) {
        field3116++;
        if (arg0 != -28778) {
            this.field3106 = null;
        }
        return this.field3121.method2734(223) + this.field3123.method2734(223);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Z")
    public final boolean method1391(int arg0) {
        field3104++;
        if (this.field3126 != null) {
            long var2 = class246.method1705((byte) 28);
            int var4 = (int) (var2 - this.field3129);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3129 = var2;
            this.field3127 += var4;
            if (this.field3127 > 30000) {
                try {
                    this.field3126.method1711((byte) 122);
                } catch (Exception var27) {
                }
                this.field3126 = null;
            }
        }
        if (this.field3126 == null) {
            return this.method1400((byte) 103) == 0 && this.method1390(arg0 - 28786) == 0;
        }
        try {
            this.field3126.method1709(0);
            if (arg0 != 8) {
                return true;
            }
            for (class87 var5 = (class87) this.field3106.method2732(arg0 ^ 0x2A); var5 != null; var5 = (class87) this.field3106.method2729(60)) {
                this.field3128.field3162 = 0;
                this.field3128.method1479((byte) -108, 1);
                this.field3128.method1418((int) var5.field5226, true);
                this.field3126.method1707(-54, this.field3128.field3193, 4, 0);
                this.field3120.method2731(var5, (byte) 49);
            }
            for (class87 var6 = (class87) this.field3121.method2732(34); var6 != null; var6 = (class87) this.field3121.method2729(64)) {
                this.field3128.field3162 = 0;
                this.field3128.method1479((byte) -101, 0);
                this.field3128.method1418((int) var6.field5226, true);
                this.field3126.method1707(-124, this.field3128.field3193, 4, 0);
                this.field3123.method2731(var6, (byte) 49);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3126.method1712(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3127 = 0;
                byte var9 = 0;
                if (this.field3134 == null) {
                    var9 = 8;
                } else if (this.field3134.field1258 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3134.field1261.field3193.length - this.field3134.field1260;
                    int var11 = 512 - this.field3134.field1258;
                    if ((var10 - this.field3134.field1261.field3162) < var11) {
                        var11 = var10 - this.field3134.field1261.field3162;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3126.method1706(this.field3134.field1261.field3162, this.field3134.field1261.field3193, (byte) -108, var11);
                    if (this.field3133 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3134.field1261.field3193[this.field3134.field1261.field3162 + var12] = (byte) class229.method1643(this.field3134.field1261.field3193[this.field3134.field1261.field3162 + var12], this.field3133);
                        }
                    }
                    this.field3134.field1261.field3162 += var11;
                    this.field3134.field1258 += var11;
                    if (this.field3134.field1261.field3162 == var10) {
                        this.field3134.method2219(arg0 ^ 0x8);
                        this.field3134.field4368 = false;
                        this.field3134 = null;
                    } else if (this.field3134.field1258 == 512) {
                        this.field3134.field1258 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3131.field3162;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field3126.method1706(this.field3131.field3162, this.field3131.field3193, (byte) -126, var13);
                    if (this.field3133 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3131.field3193[this.field3131.field3162 + var14] = (byte) class229.method1643(this.field3131.field3193[this.field3131.field3162 + var14], this.field3133);
                        }
                    }
                    this.field3131.field3162 += var13;
                    if (var9 <= this.field3131.field3162) {
                        if (this.field3134 == null) {
                            this.field3131.field3162 = 0;
                            int var15 = this.field3131.method1445(20);
                            int var16 = this.field3131.method1455(arg0 ^ 0xFFFFF2CD);
                            int var17 = this.field3131.method1445(arg0 ^ 0x1B);
                            int var18 = this.field3131.method1436((byte) 94);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class87 var24;
                            if (var20) {
                                for (var24 = (class87) this.field3123.method2732(34); var24 != null && var24.field5226 != var21; var24 = (class87) this.field3123.method2729(68)) {
                                }
                            } else {
                                for (var24 = (class87) this.field3120.method2732(34); var24 != null && var24.field5226 != var21; var24 = (class87) this.field3120.method2729(arg0 ^ 0x46)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3134 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3134.field1261 = new class208(var18 + var25 + this.field3134.field1260);
                            this.field3134.field1261.method1479((byte) -113, var19);
                            this.field3134.field1261.method1477(65280, var18);
                            this.field3134.field1258 = 8;
                            this.field3131.field3162 = 0;
                        } else if (this.field3134.field1258 != 0) {
                            throw new IOException();
                        } else if (this.field3131.field3193[0] == -1) {
                            this.field3134.field1258 = 1;
                            this.field3131.field3162 = 0;
                        } else {
                            this.field3134 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3126.method1711((byte) 122);
            } catch (Exception var26) {
            }
            this.field3130 = -2;
            this.field3126 = null;
            this.field3132++;
            return this.method1400((byte) 127) == 0 && this.method1390(-28778) == 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    private final void method1392(byte arg0) {
        field3117++;
        if (this.field3126 == null) {
            return;
        }
        try {
            this.field3128.field3162 = 0;
            if (arg0 < -123) {
                this.field3128.method1479((byte) -117, 6);
                this.field3128.method1418(3, true);
                this.field3126.method1707(-54, this.field3128.field3193, 4, 0);
            }
        } catch (IOException var3) {
            try {
                this.field3126.method1711((byte) -95);
            } catch (Exception var2) {
            }
            this.field3126 = null;
            this.field3130 = -2;
            this.field3132++;
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
    public final void method1393(int arg0) {
        if (this.field3126 != null) {
            this.field3126.method1711((byte) 110);
        }
        if (arg0 == 6443) {
            field3107++;
        }
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
    public final void method1394(int arg0) {
        field3118++;
        if (arg0 > -48) {
            this.field3127 = 61;
        }
        if (this.field3126 != null) {
            this.field3126.method1708(5000);
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
    public final void method1395(int arg0) {
        field3110++;
        try {
            this.field3126.method1711((byte) 111);
        } catch (Exception var2) {
        }
        this.field3133 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3126 = null;
        this.field3132++;
        this.field3130 = -1;
        if (arg0 != -10887) {
            this.field3123 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)Z")
    public final boolean method1396(int arg0) {
        if (arg0 != 20) {
            this.method1394(32);
        }
        field3112++;
        return this.method1390(arg0 ^ 0xFFFF8F82) >= 20;
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)Z")
    public final boolean method1397(int arg0) {
        field3113++;
        if (arg0 != 27573) {
            method1402(-24);
        }
        return this.method1400((byte) 121) >= 20;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIB)Ljn;")
    public final class87 method1398(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3111++;
        if (arg1 >= -12) {
            field3125 = null;
        }
        long var6 = (long) ((arg2 << 16) + arg3);
        class87 var8 = new class87();
        var8.field1260 = arg4;
        var8.field5226 = var6;
        var8.field4369 = arg0;
        if (arg0) {
            if (this.method1400((byte) 103) >= 20) {
                throw new RuntimeException();
            }
            this.field3106.method2731(var8, (byte) 49);
        } else if (this.method1390(-28778) < 20) {
            this.field3121.method2731(var8, (byte) 49);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public final void method1399(boolean arg0) {
        field3109++;
        if (arg0) {
            this.method1391(104);
        }
        if (this.field3126 == null) {
            return;
        }
        try {
            this.field3128.field3162 = 0;
            this.field3128.method1479((byte) -101, 7);
            this.field3128.method1418(0, true);
            this.field3126.method1707(-120, this.field3128.field3193, 4, 0);
        } catch (IOException var3) {
            try {
                this.field3126.method1711((byte) 109);
            } catch (Exception var2) {
            }
            this.field3130 = -2;
            this.field3126 = null;
            this.field3132++;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)I")
    public final int method1400(byte arg0) {
        field3108++;
        if (arg0 <= 98) {
            this.method1390(-104);
        }
        return this.field3106.method2734(223) + this.field3120.method2734(223);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLhl;I)V")
    public final void method1401(boolean arg0, class247 arg1, int arg2) {
        field3105++;
        if (this.field3126 != null) {
            try {
                this.field3126.method1711((byte) 31);
            } catch (Exception var8) {
            }
            this.field3126 = null;
        }
        if (arg2 < 84) {
            return;
        }
        this.field3126 = arg1;
        this.method1392((byte) -126);
        this.method1389(arg0, 3);
        this.field3134 = null;
        this.field3131.field3162 = 0;
        while (true) {
            class87 var4 = (class87) this.field3120.method2735((byte) -114);
            if (var4 == null) {
                while (true) {
                    class87 var5 = (class87) this.field3123.method2735((byte) -114);
                    if (var5 == null) {
                        if (this.field3133 != 0) {
                            try {
                                this.field3128.field3162 = 0;
                                this.field3128.method1479((byte) -86, 4);
                                this.field3128.method1479((byte) -88, this.field3133);
                                this.field3128.method1437(0, 0);
                                this.field3126.method1707(-66, this.field3128.field3193, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3126.method1711((byte) -107);
                                } catch (Exception var6) {
                                }
                                this.field3126 = null;
                                this.field3132++;
                                this.field3130 = -2;
                            }
                        }
                        this.field3127 = 0;
                        this.field3129 = class246.method1705((byte) 28);
                        return;
                    }
                    this.field3121.method2731(var5, (byte) 49);
                }
            }
            this.field3106.method2731(var4, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
    public static void method1402(int arg0) {
        field3122 = null;
        field3125 = null;
        if (arg0 != 0) {
            method1402(34);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZIIILmn;I)V")
    public static final void method1403(int arg0, boolean arg1, int arg2, int arg3, int arg4, class162 arg5, int arg6) {
        class328.field5138 = arg1;
        class73.field1106 = arg5;
        field3115++;
        class503.field7532 = arg6;
        class170.field2489 = arg4;
        class174.field2565 = 1;
        class186.field2709 = arg3;
        class210.field3273 = class453.field7022.method401(126) / arg2;
        if (arg0 > class210.field3273) {
            class210.field3273 = 1;
        }
    }

    static {
        new class213("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field3122 = new int[100];
        field3124 = 0;
    }
}
