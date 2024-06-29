import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class245 {

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Lwc;")
    private class46 field3264 = new class46();

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "Lwc;")
    private class46 field3267 = new class46();

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Lwc;")
    private class46 field3270 = new class46();

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Lwc;")
    private class46 field3271 = new class46();

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "Lbt;")
    private class32 field3276 = new class32(4);

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
    private byte field3279 = 0;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public volatile int field3280 = 0;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public volatile int field3278 = 0;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "Lbt;")
    private class32 field3277 = new class32(8);

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Lld;")
    public static class105 field3272;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
    private long field3275;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lci;")
    public static class287 field3257;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "Liu;")
    private class375 field3273;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "Ljj;")
    private class67 field3281;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "[I")
    public static int[] field3268;

    static {
        new class206("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field3272 = new class105();
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLnk;I)I", line = 5)
    public static final int method1362(boolean arg0, class464 arg1, int arg2) {
        field3256++;
        if (!client.method1046(arg1).method1258(arg2, -22114) && arg1.field6395 == null) {
            return -1;
        } else {
            if (arg0) {
                field3268 = null;
            }
            return arg1.field6390 == null || arg1.field6390.length <= arg2 ? -1 : arg1.field6390[arg2];
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 20)
    private final void method1363(byte arg0) {
        field3254++;
        if (this.field3273 == null) {
            return;
        }
        try {
            this.field3276.field456 = 0;
            this.field3276.method228(6, arg0 ^ 0xFFFFFFFB);
            if (arg0 == -37) {
                this.field3276.method232(arg0 + 162, 3);
                this.field3273.method2308(false, 0, 4, this.field3276.field472);
            }
        } catch (IOException var3) {
            try {
                this.field3273.method2310(-100);
            } catch (Exception var2) {
            }
            this.field3278 = -2;
            this.field3280++;
            this.field3273 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 51)
    public final void method1364(int arg0) {
        field3265++;
        if (arg0 != -2065) {
            this.field3264 = null;
        }
        if (this.field3273 != null) {
            this.field3273.method2312(5000);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 66)
    public static void method1365(byte arg0) {
        field3268 = null;
        if (arg0 == 127) {
            field3272 = null;
            field3257 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 78)
    public final void method1366(int arg0) {
        field3266++;
        if (this.field3273 == null) {
            return;
        }
        try {
            this.field3276.field456 = 0;
            this.field3276.method228(7, arg0 + 32);
            this.field3276.method232(45, 0);
            this.field3273.method2308(false, arg0, 4, this.field3276.field472);
        } catch (IOException var3) {
            try {
                this.field3273.method2310(-106);
            } catch (Exception var2) {
            }
            this.field3278 = -2;
            this.field3273 = null;
            this.field3280++;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z", line = 105)
    public final boolean method1367(boolean arg0) {
        field3252++;
        if (arg0) {
            this.method1376(-93);
        }
        return this.method1377(false) >= 20;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I", line = 116)
    public final int method1368(int arg0) {
        field3255++;
        if (arg0 != 0) {
            this.method1377(true);
        }
        return this.field3264.method333(arg0) + this.field3267.method333(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILkk;)Z", line = 129)
    public static final boolean method1369(int arg0, class114 arg1) {
        field3261++;
        if (arg0 == 20672) {
            return class84.field1101 == arg1 || class231.field3073 == arg1 || client.field2455 == arg1 || class300.field4010 == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Liu;ZI)V", line = 140)
    public final void method1370(class375 arg0, boolean arg1, int arg2) {
        field3263++;
        if (this.field3273 != null) {
            try {
                this.field3273.method2310(arg2 - 103);
            } catch (Exception var8) {
            }
            this.field3273 = null;
        }
        this.field3273 = arg0;
        this.method1363((byte) -37);
        this.method1378(arg1, 5797);
        this.field3277.field456 = 0;
        this.field3281 = null;
        while (true) {
            class67 var4 = (class67) this.field3267.method334(arg2 + 27830);
            if (var4 == null) {
                while (true) {
                    class67 var5 = (class67) this.field3271.method334(27830);
                    if (var5 == null) {
                        if (this.field3279 != arg2) {
                            try {
                                this.field3276.field456 = 0;
                                this.field3276.method228(4, 32);
                                this.field3276.method228(this.field3279, 32);
                                this.field3276.method229(0, 1309449544);
                                this.field3273.method2308(false, 0, 4, this.field3276.field472);
                            } catch (IOException var7) {
                                try {
                                    this.field3273.method2310(arg2 ^ 0xFFFFFF82);
                                } catch (Exception var6) {
                                }
                                this.field3273 = null;
                                this.field3278 = -2;
                                this.field3280++;
                            }
                        }
                        this.field3274 = 0;
                        this.field3275 = class440.method2583(25267);
                        return;
                    }
                    this.field3270.method336(87, var5);
                }
            }
            this.field3264.method336(-116, var4);
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z", line = 206)
    public final boolean method1371(boolean arg0) {
        field3251++;
        if (this.field3273 != null) {
            long var2 = class440.method2583(25267);
            int var4 = (int) (var2 - this.field3275);
            this.field3275 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3274 += var4;
            if (this.field3274 > 30000) {
                try {
                    this.field3273.method2310(-96);
                } catch (Exception var27) {
                }
                this.field3273 = null;
            }
        }
        if (this.field3273 == null) {
            return this.method1368(0) == 0 && this.method1377(false) == 0;
        }
        try {
            this.field3273.method2303((byte) 117);
            class67 var5 = (class67) this.field3264.method332(17948);
            if (arg0) {
                this.field3280 = 125;
            }
            while (var5 != null) {
                this.field3276.field456 = 0;
                this.field3276.method228(1, 32);
                this.field3276.method232(126, (int) var5.field5532);
                this.field3273.method2308(false, 0, 4, this.field3276.field472);
                this.field3267.method336(56, var5);
                var5 = (class67) this.field3264.method331((byte) 123);
            }
            for (class67 var6 = (class67) this.field3270.method332(17948); var6 != null; var6 = (class67) this.field3270.method331((byte) 102)) {
                this.field3276.field456 = 0;
                this.field3276.method228(0, 32);
                this.field3276.method232(71, (int) var6.field5532);
                this.field3273.method2308(false, 0, 4, this.field3276.field472);
                this.field3271.method336(-14, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3273.method2306(1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3274 = 0;
                byte var9 = 0;
                if (this.field3281 == null) {
                    var9 = 8;
                } else if (this.field3281.field903 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3277.field456;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field3273.method2304(this.field3277.field472, var10, 1, this.field3277.field456);
                    if (this.field3279 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3277.field472[this.field3277.field456 + var11] = (byte) class71.method462(this.field3277.field472[this.field3277.field456 + var11], this.field3279);
                        }
                    }
                    this.field3277.field456 += var10;
                    if (this.field3277.field456 >= var9) {
                        if (this.field3281 == null) {
                            this.field3277.field456 = 0;
                            int var12 = this.field3277.method201((byte) -112);
                            int var13 = this.field3277.method215((byte) 117);
                            int var14 = this.field3277.method201((byte) -118);
                            int var15 = this.field3277.method222(1024);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class67 var21;
                            if (var17) {
                                for (var21 = (class67) this.field3271.method332(17948); var21 != null && var21.field5532 != var18; var21 = (class67) this.field3271.method331((byte) 94)) {
                                }
                            } else {
                                for (var21 = (class67) this.field3267.method332(17948); var21 != null && var21.field5532 != var18; var21 = (class67) this.field3267.method331((byte) 104)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3281 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3281.field908 = new class32(var15 + var22 + this.field3281.field905);
                            this.field3281.field908.method228(var16, 32);
                            this.field3281.field908.method199((byte) -117, var15);
                            this.field3281.field903 = 8;
                            this.field3277.field456 = 0;
                        } else if (this.field3281.field903 != 0) {
                            throw new IOException();
                        } else if (this.field3277.field472[0] == -1) {
                            this.field3281.field903 = 1;
                            this.field3277.field456 = 0;
                        } else {
                            this.field3281 = null;
                        }
                    }
                } else {
                    int var23 = this.field3281.field908.field472.length - this.field3281.field905;
                    int var24 = 512 - this.field3281.field903;
                    if ((var23 - this.field3281.field908.field456) < var24) {
                        var24 = var23 - this.field3281.field908.field456;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field3273.method2304(this.field3281.field908.field472, var24, 1, this.field3281.field908.field456);
                    if (this.field3279 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3281.field908.field472[this.field3281.field908.field456 + var25] = (byte) class71.method462(this.field3281.field908.field472[this.field3281.field908.field456 + var25], this.field3279);
                        }
                    }
                    this.field3281.field908.field456 += var24;
                    this.field3281.field903 += var24;
                    if (this.field3281.field908.field456 == var23) {
                        this.field3281.method2441((byte) -115);
                        this.field3281.field973 = false;
                        this.field3281 = null;
                    } else if (this.field3281.field903 == 512) {
                        this.field3281.field903 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3273.method2310(-79);
            } catch (Exception var26) {
            }
            this.field3273 = null;
            this.field3280++;
            this.field3278 = -2;
            return this.method1368(0) == 0 && this.method1377(false) == 0;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I", line = 485)
    public static final int method1372(int arg0, int arg1) {
        if (arg1 <= 59) {
            field3268 = null;
        }
        field3260++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Ljj;", line = 502)
    public final class67 method1373(boolean arg0, int arg1, byte arg2, byte arg3, int arg4) {
        if (arg2 != 24) {
            return null;
        }
        field3250++;
        long var6 = (long) ((arg1 << 16) + arg4);
        class67 var8 = new class67();
        var8.field976 = arg0;
        var8.field5532 = var6;
        var8.field905 = arg3;
        if (arg0) {
            if (this.method1368(0) >= 20) {
                throw new RuntimeException();
            }
            this.field3264.method336(-125, var8);
        } else if (this.method1377(false) < 20) {
            this.field3270.method336(-28, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V", line = 543)
    public final void method1374(byte arg0) {
        field3259++;
        try {
            this.field3273.method2310(-119);
        } catch (Exception var3) {
        }
        int var2 = 66 % ((arg0 + 7) / 46);
        this.field3278 = -1;
        this.field3273 = null;
        this.field3280++;
        this.field3279 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z", line = 560)
    public final boolean method1375(int arg0) {
        if (arg0 != 20) {
            this.field3281 = null;
        }
        field3269++;
        return this.method1368(0) >= 20;
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V", line = 571)
    public final void method1376(int arg0) {
        if (arg0 != 4) {
            this.field3277 = null;
        }
        if (this.field3273 != null) {
            this.field3273.method2310(-114);
        }
        field3253++;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I", line = 587)
    private final int method1377(boolean arg0) {
        field3262++;
        if (arg0) {
            this.field3264 = null;
        }
        return this.field3270.method333(0) + this.field3271.method333(0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V", line = 608)
    public final void method1378(boolean arg0, int arg1) {
        field3258++;
        if (this.field3273 == null) {
            return;
        }
        try {
            this.field3276.field456 = 0;
            this.field3276.method228(arg0 ? 2 : 3, 32);
            this.field3276.method232(100, 0);
            this.field3273.method2308(false, 0, 4, this.field3276.field472);
            if (arg1 != 5797) {
                field3268 = null;
            }
        } catch (IOException var4) {
            try {
                this.field3273.method2310(arg1 ^ 0xFFFFE914);
            } catch (Exception var3) {
            }
            this.field3278 = -2;
            this.field3280++;
            this.field3273 = null;
        }
    }
}
