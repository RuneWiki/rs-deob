import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class633 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lan;")
    private class21 field9248;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field9251;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lej;")
    public static class104 field9249 = new class104("Profiling", "Profiling", "Profilage", "Profiling");

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field9257 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lan;")
    public static class21 field9253;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field9252;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method3676(boolean arg0, int arg1, int arg2) {
        field9250++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else {
            if (!arg0) {
                field9253 = null;
            }
            if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
    public static final int method3677(byte arg0) {
        field9254++;
        if (arg0 > -61) {
            method3680(true);
        }
        return class265.field3701;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method3678(int arg0) {
        if (arg0 != 10535) {
            field9252 = null;
        }
        field9253 = null;
        field9252 = null;
        field9249 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public static final void method3679(byte arg0) {
        if (arg0 >= -77) {
            method3680(true);
        }
        for (int var1 = 0; var1 < class188.field2666; var1++) {
            int var2 = class615.field8829[var1];
            class109 var3 = ((class576) class278.field3837.method1242(0, (long) var2)).field7929;
            int var4 = class343.field4627.method110((byte) 109);
            if ((var4 & 0x20) != 0) {
                var4 += class343.field4627.method110((byte) 53) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class343.field4627.method112(-8838);
                int var6 = class343.field4627.method110((byte) 114);
                var3.method350(class405.field5763, -1, var5, var6);
            }
            if ((var4 & 0x1) != 0) {
                var3.field608 = class343.field4627.method100((byte) 81);
                var3.field574 = 100;
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class343.field4627.method92(1);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class343.field4627.method107(255);
                int var9 = class343.field4627.method78(-8388608);
                var3.method335(false, var9, var7, var8, -30412);
            }
            if ((var4 & 0x400) != 0) {
                int var10 = class343.field4627.method92(1);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class343.field4627.method120((byte) 99);
                int var12 = class343.field4627.method71((byte) -123);
                var3.method335(true, var12, var10, var11, -30412);
            }
            if ((var4 & 0x100) != 0) {
                int var13 = class343.field4627.method96(false);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class343.field4627.method104(82);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class343.field4627.method71((byte) -128);
                    var16[var17] = class343.field4627.method104(-128);
                }
                class342.method2076(var16, var15, var14, var3, 0);
            }
            if ((var4 & 0x80) != 0) {
                int var19 = class343.field4627.method93((byte) 127);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class343.field4627.method96(false);
                class182.method1140(var3, 3698, var19, var20);
            }
            if ((var4 & 0x2) != 0) {
                int var21 = class343.field4627.method112(-8838);
                int var22 = class343.field4627.method71((byte) -54);
                var3.method350(class405.field5763, -1, var21, var22);
                var3.field541 = class405.field5763 + 300;
                var3.field568 = class343.field4627.method96(false);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field1669.method3509((byte) -85)) {
                    class175.method1115(var3, -13);
                }
                var3.method770(class516.field7253.method3263(class343.field4627.method98(25356), (byte) -103), true);
                var3.method346(var3.field1669.field8597, (byte) 15);
                var3.field610 = var3.field1669.field8547 << 3;
                if (var3.field1669.method3509((byte) -111)) {
                    class434.method2578(null, var3.field616[0], 0, var3, var3.field6035, var3.field618[0], 279765095, null);
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field547 = class343.field4627.method103((byte) -107);
                var3.field565 = class343.field4627.method62((byte) -82);
                var3.field586 = class343.field4627.method103((byte) -12);
                var3.field563 = class343.field4627.method103((byte) -103);
                var3.field538 = class343.field4627.method104(-82) + class405.field5763;
                var3.field546 = class343.field4627.method104(-118) + class405.field5763;
                var3.field577 = class343.field4627.method71((byte) -120);
                var3.field617 = 1;
                var3.field586 += var3.field616[0];
                var3.field621 = 0;
                var3.field565 += var3.field618[0];
                var3.field563 += var3.field618[0];
                var3.field547 += var3.field616[0];
            }
            if ((var4 & 0x800) != 0) {
                var3.field604 = class343.field4627.method67(65280);
                var3.field599 = class343.field4627.method103((byte) -91);
                var3.field580 = class343.field4627.method116((byte) -128);
                var3.field572 = (byte) class343.field4627.method110((byte) 84);
                var3.field536 = class405.field5763 + class343.field4627.method92(1);
                var3.field609 = class405.field5763 + class343.field4627.method104(-93);
            }
            if ((var4 & 0x8) != 0) {
                var3.field532 = class343.field4627.method104(-51);
                if (var3.field532 == 65535) {
                    var3.field532 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1685 = class343.field4627.method98(25356);
                var3.field1673 = class343.field4627.method93((byte) 80);
            }
            if ((var4 & 0x200) != 0) {
                int var23 = class343.field4627.method93((byte) 99);
                var3.field530 = class343.field4627.method71((byte) -111);
                var3.field525 = class343.field4627.method110((byte) 77);
                var3.field593 = (var23 & 0x8000) != 0;
                var3.field526 = var23 & 0x7FFF;
                var3.field534 = class405.field5763 + var3.field526 + var3.field530;
            }
        }
        field9255++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method3680(boolean arg0) {
        if (arg0) {
            field9252 = null;
        }
        class222.method1422(18320);
        field9256++;
        class431.method2564(class491.field6875.field3364, 22050, -1, 2);
        class209.field2952 = class57.method516(class500.field6968, 0, 22050, (byte) 113, class166.field2390);
        class209.field2952.method2242((byte) -120, class297.field4070);
        class170.field2459 = class57.method516(class500.field6968, 1, 2048, (byte) 99, class166.field2390);
        class170.field2459.method2242((byte) -125, class204.field2869);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class633(class111 arg0, int arg1, class21 arg2) {
        new class571(64);
        this.field9248 = arg2;
        this.field9251 = this.field9248.method231(15, -120);
    }
}
