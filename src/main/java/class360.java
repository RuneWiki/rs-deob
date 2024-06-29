import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class360 {

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Lek;")
    private class295 field5143 = new class295();

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Lek;")
    private class295 field5149 = new class295();

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Lek;")
    private class295 field5150 = new class295();

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Lek;")
    private class295 field5152 = new class295();

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "Ldg;")
    private class236 field5154 = new class236(4);

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public volatile int field5157 = 0;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public volatile int field5159 = 0;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "B")
    private byte field5160 = 0;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "Ldg;")
    private class236 field5158 = new class236(8);

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "[Ltm;")
    public static class219[] field5138 = new class219[8];

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field5145 = -1;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Z")
    public static boolean field5136 = true;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "I")
    private int field5156;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "J")
    private long field5153;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "Lqb;")
    private class121 field5161;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "Lrr;")
    private class202 field5155;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
    public final void method2312(boolean arg0) {
        field5151++;
        if (arg0 && this.field5155 != null) {
            this.field5155.method1341(16639);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILon;BI)V")
    public static final void method2313(int arg0, class184 arg1, byte arg2, int arg3) {
        field5144++;
        if (arg2 != -22) {
            method2321(93);
        }
        class433 var4 = arg1.method1240(class151.field1873, 50);
        if (var4 == null) {
            return;
        }
        class151.field1873.method660(arg3, arg0, arg1.field2618 + arg3, arg1.field2516 + arg0);
        if (class39.field447 < 3) {
            class406.field5864.method2449((float) arg1.field2618 / 2.0F + (float) arg3, (float) arg1.field2516 / 2.0F + (float) arg0, 4096, ((int) (-class441.field6333) & 0x3FFF) << 2, var4, arg3, arg0);
        } else {
            class151.field1873.method597(-16777216, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)Z")
    public final boolean method2314(int arg0) {
        if (this.field5155 != null) {
            long var2 = class175.method1195(46);
            int var4 = (int) (var2 - this.field5153);
            this.field5153 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5156 += var4;
            if (this.field5156 > 30000) {
                try {
                    this.field5155.method1343((byte) -48);
                } catch (Exception var27) {
                }
                this.field5155 = null;
            }
        }
        field5135++;
        if (this.field5155 == null) {
            return this.method2324(arg0 - 5300) == 0 && this.method2318((byte) 31) == 0;
        }
        try {
            this.field5155.method1338(0);
            for (class121 var5 = (class121) this.field5143.method1949(true); var5 != null; var5 = (class121) this.field5143.method1945((byte) -6)) {
                this.field5154.field3320 = 0;
                this.field5154.method1583(1, (byte) -108);
                this.field5154.method1598((int) var5.field4685, (byte) 56);
                this.field5155.method1337(4, (byte) -1, 0, this.field5154.field3364);
                this.field5149.method1950(arg0 ^ 0x1511, var5);
            }
            if (arg0 != 5390) {
                this.method2327(true);
            }
            for (class121 var6 = (class121) this.field5150.method1949(true); var6 != null; var6 = (class121) this.field5150.method1945((byte) -86)) {
                this.field5154.field3320 = 0;
                this.field5154.method1583(0, (byte) -49);
                this.field5154.method1598((int) var6.field4685, (byte) 56);
                this.field5155.method1337(4, (byte) -82, 0, this.field5154.field3364);
                this.field5152.method1950(-104, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5155.method1340(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5156 = 0;
                byte var9 = 0;
                if (this.field5161 == null) {
                    var9 = 8;
                } else if (this.field5161.field1485 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field5161.field1493.field3364.length - this.field5161.field1494;
                    int var11 = 512 - this.field5161.field1485;
                    if (var10 - this.field5161.field1493.field3320 < var11) {
                        var11 = var10 - this.field5161.field1493.field3320;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field5155.method1336((byte) 125, this.field5161.field1493.field3364, this.field5161.field1493.field3320, var11);
                    if (this.field5160 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field5161.field1493.field3364[this.field5161.field1493.field3320 + var12] = (byte) class2.method10(this.field5161.field1493.field3364[this.field5161.field1493.field3320 + var12], this.field5160);
                        }
                    }
                    this.field5161.field1493.field3320 += var11;
                    this.field5161.field1485 += var11;
                    if (this.field5161.field1493.field3320 == var10) {
                        this.field5161.method2133(-31493);
                        this.field5161.field4971 = false;
                        this.field5161 = null;
                    } else if (this.field5161.field1485 == 512) {
                        this.field5161.field1485 = 0;
                    }
                } else {
                    int var13 = var9 - this.field5158.field3320;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field5155.method1336((byte) 125, this.field5158.field3364, this.field5158.field3320, var13);
                    if (this.field5160 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field5158.field3364[this.field5158.field3320 + var14] = (byte) class2.method10(this.field5158.field3364[this.field5158.field3320 + var14], this.field5160);
                        }
                    }
                    this.field5158.field3320 += var13;
                    if (var9 <= this.field5158.field3320) {
                        if (this.field5161 == null) {
                            this.field5158.field3320 = 0;
                            int var15 = this.field5158.method1574(arg0 ^ 0xFFFFEAA1);
                            int var16 = this.field5158.method1617((byte) 48);
                            int var17 = this.field5158.method1574(-119);
                            int var18 = this.field5158.method1597(3641);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class121 var24;
                            if (var20) {
                                for (var24 = (class121) this.field5152.method1949(true); var24 != null && var24.field4685 != var21; var24 = (class121) this.field5152.method1945((byte) -109)) {
                                }
                            } else {
                                for (var24 = (class121) this.field5149.method1949(true); var24 != null && var24.field4685 != var21; var24 = (class121) this.field5149.method1945((byte) 102)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field5161 = var24;
                            this.field5161.field1493 = new class236(var18 + var25 + this.field5161.field1494);
                            this.field5161.field1493.method1583(var19, (byte) -122);
                            this.field5161.field1493.method1603(var18, arg0 - 4519);
                            this.field5161.field1485 = 8;
                            this.field5158.field3320 = 0;
                        } else if (this.field5161.field1485 != 0) {
                            throw new IOException();
                        } else if (this.field5158.field3364[0] == -1) {
                            this.field5158.field3320 = 0;
                            this.field5161.field1485 = 1;
                        } else {
                            this.field5161 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5155.method1343((byte) -56);
            } catch (Exception var26) {
            }
            this.field5157++;
            this.field5159 = -2;
            this.field5155 = null;
            return this.method2324(arg0 - 5307) == 0 && this.method2318((byte) 87) == 0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Z")
    public final boolean method2315(byte arg0) {
        if (arg0 <= 83) {
            method2317((class376) null, (byte) 99);
        }
        field5129++;
        return this.method2318((byte) 76) >= 20;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILrr;Z)V")
    public final void method2316(int arg0, class202 arg1, boolean arg2) {
        field5141++;
        if (this.field5155 != null) {
            try {
                this.field5155.method1343((byte) -101);
            } catch (Exception var8) {
            }
            this.field5155 = null;
        }
        if (arg0 != 17889) {
            this.field5160 = 40;
        }
        this.field5155 = arg1;
        this.method2319(false);
        this.method2322(arg2, -4733);
        this.field5161 = null;
        this.field5158.field3320 = 0;
        while (true) {
            class121 var4 = (class121) this.field5149.method1946(4);
            if (var4 == null) {
                while (true) {
                    class121 var5 = (class121) this.field5152.method1946(arg0 - 17885);
                    if (var5 == null) {
                        if (this.field5160 != 0) {
                            try {
                                this.field5154.field3320 = 0;
                                this.field5154.method1583(4, (byte) -76);
                                this.field5154.method1583(this.field5160, (byte) -73);
                                this.field5154.method1605(0, false);
                                this.field5155.method1337(4, (byte) -13, 0, this.field5154.field3364);
                            } catch (IOException var7) {
                                try {
                                    this.field5155.method1343((byte) 103);
                                } catch (Exception var6) {
                                }
                                this.field5157++;
                                this.field5159 = -2;
                                this.field5155 = null;
                            }
                        }
                        this.field5156 = 0;
                        this.field5153 = class175.method1195(79);
                        return;
                    }
                    this.field5150.method1950(-128, var5);
                }
            }
            this.field5143.method1950(48, var4);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ltq;B)V")
    public static final void method2317(class376 arg0, byte arg1) {
        class450.field6445 = arg0;
        field5147++;
        if (arg1 <= 105) {
            field5138 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I")
    private final int method2318(byte arg0) {
        field5148++;
        return arg0 <= 19 ? 50 : this.field5150.method1947(0) + this.field5152.method1947(0);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V")
    private final void method2319(boolean arg0) {
        field5131++;
        if (arg0) {
            field5145 = -69;
        }
        if (this.field5155 == null) {
            return;
        }
        try {
            this.field5154.field3320 = 0;
            this.field5154.method1583(6, (byte) -98);
            this.field5154.method1598(3, (byte) 56);
            this.field5155.method1337(4, (byte) -65, 0, this.field5154.field3364);
        } catch (IOException var3) {
            try {
                this.field5155.method1343((byte) -62);
            } catch (Exception var2) {
            }
            this.field5157++;
            this.field5155 = null;
            this.field5159 = -2;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public final void method2320(int arg0) {
        if (this.field5155 != null) {
            this.field5155.method1343((byte) 97);
        }
        field5146++;
        if (arg0 != 0) {
            this.method2324(-29);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
    public static final void method2321(int arg0) {
        field5130++;
        class237 var1 = class337.field4789;
        synchronized (class337.field4789) {
            class337.field4789.method1626((byte) 106);
        }
        class237 var2 = class420.field6007;
        synchronized (class420.field6007) {
            class420.field6007.method1626((byte) 106);
        }
        if (arg0 < 122) {
            method2321(-101);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V")
    public final void method2322(boolean arg0, int arg1) {
        field5132++;
        if (this.field5155 == null) {
            return;
        }
        if (arg1 != -4733) {
            this.method2318((byte) -93);
        }
        try {
            this.field5154.field3320 = 0;
            this.field5154.method1583(arg0 ? 2 : 3, (byte) -108);
            this.field5154.method1598(0, (byte) 56);
            this.field5155.method1337(4, (byte) -54, 0, this.field5154.field3364);
        } catch (IOException var4) {
            try {
                this.field5155.method1343((byte) -50);
            } catch (Exception var3) {
            }
            this.field5159 = -2;
            this.field5155 = null;
            this.field5157++;
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public final void method2323(int arg0) {
        field5140++;
        if (this.field5155 == null) {
            return;
        }
        try {
            this.field5154.field3320 = 0;
            this.field5154.method1583(7, (byte) -93);
            if (arg0 != 339) {
                this.method2322(true, 12);
            }
            this.field5154.method1598(0, (byte) 56);
            this.field5155.method1337(4, (byte) 124, 0, this.field5154.field3364);
        } catch (IOException var3) {
            try {
                this.field5155.method1343((byte) -29);
            } catch (Exception var2) {
            }
            this.field5157++;
            this.field5155 = null;
            this.field5159 = -2;
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)I")
    public final int method2324(int arg0) {
        if (arg0 < 44) {
            return -26;
        } else {
            field5137++;
            return this.field5143.method1947(0) + this.field5149.method1947(0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
    public static void method2325(byte arg0) {
        int var1 = 19 / ((arg0 - 18) / 54);
        field5138 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBZZI)Lqb;")
    public final class121 method2326(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg2) {
            method2321(16);
        }
        field5139++;
        long var6 = (long) ((arg0 << 16) + arg4);
        class121 var8 = new class121();
        var8.field1494 = arg1;
        var8.field4685 = var6;
        var8.field4974 = arg3;
        if (arg3) {
            if (this.method2324(107) >= 20) {
                throw new RuntimeException();
            }
            this.field5143.method1950(-121, var8);
        } else if (this.method2318((byte) 85) < 20) {
            this.field5150.method1950(60, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)Z")
    public final boolean method2327(boolean arg0) {
        if (!arg0) {
            method2313(19, (class184) null, (byte) 109, -99);
        }
        field5133++;
        return this.method2324(76) >= 20;
    }

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
    public final void method2328(int arg0) {
        field5142++;
        try {
            this.field5155.method1343((byte) -50);
        } catch (Exception var2) {
        }
        this.field5157++;
        this.field5160 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5159 = arg0;
        this.field5155 = null;
    }
}
