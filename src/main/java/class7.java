import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class205 {

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    private int field114 = 4096;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    private int field117 = 3216;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    private int field112 = 3216;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "[I")
    private int[] field116 = new int[3];

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lvd;")
    public static class222 field103 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lvd;")
    public static class222 field105 = class212.method1357("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 10731);

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Lvd;")
    public static class222 field108 = class212.method1357("Hidden)2use", 10731);

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "[I")
    public static int[] field109 = new int[128];

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "Lig;")
    public static class93 field115 = new class93(64);

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLvd;)Z")
    public static final boolean method58(byte arg0, class222 arg1) {
        if (arg0 != -100) {
            return true;
        } else {
            ++field111;
            if (arg1 == null) {
                return false;
            } else {
                for (int var2 = 0; var2 < class113.field2131; ++var2) {
                    if (arg1.method1452(class82.field1581[var2], (byte) -124)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field102;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int var4 = class98.field1853 * this.field114 >> 12;
                int[] var5 = this.method1322(class17.field433 & arg1 + -1, (byte) 98, 0);
                int[] var6 = this.method1322(arg1, (byte) 110, 0);
                int[] var7 = this.method1322(class17.field433 & arg1 - -1, (byte) 116, 0);
                for (int var8 = 0; class118.field2245 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class159.field3039 & var8 + -1] + -var6[var8 - -1 & class159.field3039]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class174.field3269[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = this.field116[0] * var15 >> 12;
                    int var17 = var9 * var13 >> 8;
                    int var18 = this.field116[2] * var14 >> 12;
                    int var19 = this.field116[1] * var17 >> 12;
                    var3[var8] = var16 - -var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
    public static final void method59(int arg0) {
        ++field113;
        int var1 = class21.field505.method1350(8, 7);
        if (var1 < class38.field859) {
            for (int var2 = var1; class38.field859 > var2; ++var2) {
                class42.field900[class179.field3327++] = class122.field2328[var2];
            }
        }
        if (arg0 == -1) {
            if (~class38.field859 > ~var1) {
                throw new RuntimeException("gppov1");
            } else {
                class38.field859 = 0;
                for (int var3 = 0; var1 > var3; ++var3) {
                    int var4 = class122.field2328[var3];
                    class38 var5 = class54.field1024[var4];
                    int var6 = class21.field505.method1350(1, arg0 ^ -8);
                    if (~var6 == -1) {
                        class122.field2328[class38.field859++] = var4;
                        var5.field1348 = class175.field3280;
                    } else {
                        int var7 = class21.field505.method1350(2, 7);
                        if (~var7 == -1) {
                            class122.field2328[class38.field859++] = var4;
                            var5.field1348 = class175.field3280;
                            class122.field2341[class162.field3088++] = var4;
                        } else if (~var7 == -2) {
                            class122.field2328[class38.field859++] = var4;
                            var5.field1348 = class175.field3280;
                            int var8 = class21.field505.method1350(3, 7);
                            var5.method476(false, var8, false);
                            int var9 = class21.field505.method1350(1, 7);
                            if (~var9 == -2) {
                                class122.field2341[class162.field3088++] = var4;
                            }
                        } else if (var7 == 2) {
                            class122.field2328[class38.field859++] = var4;
                            var5.field1348 = class175.field3280;
                            int var10 = class21.field505.method1350(3, 7);
                            var5.method476(true, var10, false);
                            int var11 = class21.field505.method1350(3, 7);
                            var5.method476(true, var11, false);
                            int var12 = class21.field505.method1350(1, arg0 + 8);
                            if (var12 == 1) {
                                class122.field2341[class162.field3088++] = var4;
                            }
                        } else if (var7 == 3) {
                            class42.field900[class179.field3327++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public static final int method60(int arg0, int arg1) {
        if (arg0 < 54) {
            return -42;
        } else {
            ++field118;
            return 255 & arg1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lge;I)V")
    public static final void method61(class70 arg0, int arg1) {
        ++field107;
        if (arg0.field1350 != 0) {
            if (arg1 > -70) {
                field108 = null;
            }
            if (arg0.field1330 != -1 && ~arg0.field1330 > -32769) {
                class193 var2 = class202.field3696[arg0.field1330];
                if (var2 != null) {
                    int var3 = arg0.field1353 - var2.field1353;
                    int var4 = -var2.field1360 + arg0.field1360;
                    if (~var3 != -1 || var4 != 0) {
                        arg0.field1325 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1330 >= 32768) {
                int var5 = arg0.field1330 + -32768;
                if (~class35.field773 == ~var5) {
                    var5 = 2047;
                }
                class38 var6 = class54.field1024[var5];
                if (var6 != null) {
                    int var7 = -var6.field1353 + arg0.field1353;
                    int var8 = -var6.field1360 + arg0.field1360;
                    if (~var7 != -1 || var8 != 0) {
                        arg0.field1325 = (int) (325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
                    }
                }
            }
            if ((arg0.field1336 != 0 || arg0.field1356 != 0) && (~arg0.field1326 == -1 || arg0.field1314 > 0)) {
                int var9 = -((arg0.field1356 - class151.field2931 - class151.field2931) * 64) + arg0.field1360;
                int var10 = -((-class110.field2064 + arg0.field1336 + -class110.field2064) * 64) + arg0.field1353;
                if (~var10 != -1 || ~var9 != -1) {
                    arg0.field1325 = (int) (Math.atan2((double) var10, (double) var9) * 325.949D) & 2047;
                }
                arg0.field1336 = 0;
                arg0.field1356 = 0;
            }
            int var11 = 2047 & -arg0.field1365 + arg0.field1325;
            if (var11 == 0) {
                arg0.field1334 = 0;
            } else {
                ++arg0.field1334;
                if (var11 > 1024) {
                    arg0.field1365 -= arg0.field1350;
                    boolean var12 = true;
                    if (~var11 > ~arg0.field1350 || ~(2048 - arg0.field1350) > ~var11) {
                        arg0.field1365 = arg0.field1325;
                        var12 = false;
                    }
                    if (~arg0.field1370 == ~arg0.field1322 && (~arg0.field1334 < -26 || var12)) {
                        if (~arg0.field1354 != 0) {
                            arg0.field1370 = arg0.field1354;
                        } else {
                            arg0.field1370 = arg0.field1364;
                        }
                    }
                } else {
                    boolean var13 = true;
                    arg0.field1365 += arg0.field1350;
                    if (~arg0.field1350 < ~var11 || 2048 - arg0.field1350 < var11) {
                        var13 = false;
                        arg0.field1365 = arg0.field1325;
                    }
                    if (~arg0.field1370 == ~arg0.field1322 && (arg0.field1334 > 25 || var13)) {
                        if (arg0.field1319 != -1) {
                            arg0.field1370 = arg0.field1319;
                        } else {
                            arg0.field1370 = arg0.field1364;
                        }
                    }
                }
                arg0.field1365 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    private final void method62(byte arg0) {
        ++field106;
        double var2 = Math.cos((double) ((float) this.field112 / 4096.0F));
        this.field116[0] = (int) (var2 * Math.sin((double) ((float) this.field117 / 4096.0F)) * 4096.0D);
        if (arg0 != -25) {
            method63(72);
        }
        this.field116[1] = (int) (4096.0D * Math.cos((double) ((float) this.field117 / 4096.0F)) * var2);
        this.field116[2] = (int) (4096.0D * Math.sin((double) ((float) this.field112 / 4096.0F)));
        int var4 = this.field116[0] * this.field116[0] >> 12;
        int var5 = this.field116[1] * this.field116[1] >> 12;
        int var6 = this.field116[2] * this.field116[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field116[0] = (this.field116[0] << 12) / var7;
            this.field116[2] = (this.field116[2] << 12) / var7;
            this.field116[1] = (this.field116[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
    public static void method63(int arg0) {
        field105 = null;
        field103 = null;
        field108 = null;
        field115 = null;
        if (arg0 != 19936) {
            field109 = null;
        }
        field109 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class7() {
        super(1, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field112 = arg0.method675(2);
                }
            } else {
                this.field117 = arg0.method675(2);
            }
        } else {
            this.field114 = arg0.method675(2);
        }
        ++field110;
        int var5 = 74 / ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (!arg0) {
            this.method62((byte) -25);
            ++field104;
        }
    }
}
