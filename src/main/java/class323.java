import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class323 {

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Z")
    public boolean field4795;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    public boolean field4785;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[S")
    public short[] field4800;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    private int field4788;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4798 = null;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lqp;")
    public static class586 field4801;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    private int field4784;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    private int field4787;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    private int field4792;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    private int field4797;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lat;")
    public class535 field4799;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI)V")
    public final void method2017(int arg0, boolean arg1, int arg2) {
        field4794++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field4788 + (this.field4787 * arg0 / 50) & 0x7FF;
            int var6 = this.field4792;
            if (var6 == 1) {
                var4 = (class14.field129[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class233.field3437[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field4799.method94(-80, (float) (this.field4797 + (this.field4784 * var4 >> 11)) / 2048.0F);
        if (arg2 >= -97) {
            this.field4799 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method2018(int arg0) {
        field4789++;
        class497 var1 = (class497) class281.field4170.method2496((byte) -97);
        int var2 = 50 % ((arg0 - 9) / 56);
        boolean var3 = class106.field1333 != null || class89.field1140 > 0;
        if (var3) {
            class580.field8539 = 1;
        }
        if (class154.field1979 && class542.field8105.method1259(true, 81) && class487.field7385 > 2) {
            if (var3) {
                class468.field6924 = (class548) class272.field4014.field6029.field7466.field7466;
            } else {
                class34.method168(var1.method34(-3797), (class548) class272.field4014.field6029.field7466.field7466, (byte) -111, var1.method31(2));
            }
        } else if (var3) {
            class468.field6924 = (class548) class272.field4014.field6029.field7466;
        } else {
            class34.method168(var1.method34(-3797), (class548) class272.field4014.field6029.field7466, (byte) -91, var1.method31(118));
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    private final void method2019(int arg0) {
        if (arg0 != 6) {
            this.field4790 = 20;
        }
        int var2 = this.field4790;
        if (var2 == 2) {
            this.field4784 = 2048;
            this.field4797 = 0;
            this.field4787 = 2048;
            this.field4792 = 1;
        } else if (var2 == 3) {
            this.field4787 = 4096;
            this.field4797 = 0;
            this.field4792 = 1;
            this.field4784 = 2048;
        } else if (var2 == 4) {
            this.field4797 = 0;
            this.field4787 = 2048;
            this.field4792 = 4;
            this.field4784 = 2048;
        } else if (var2 == 5) {
            this.field4797 = 0;
            this.field4792 = 4;
            this.field4784 = 2048;
            this.field4787 = 8192;
        } else if (var2 == 12) {
            this.field4797 = 0;
            this.field4784 = 2048;
            this.field4787 = 2048;
            this.field4792 = 2;
        } else if (var2 == 13) {
            this.field4797 = 0;
            this.field4784 = 2048;
            this.field4787 = 8192;
            this.field4792 = 2;
        } else if (var2 == 10) {
            this.field4797 = 1536;
            this.field4787 = 2048;
            this.field4792 = 3;
            this.field4784 = 512;
        } else if (var2 == 11) {
            this.field4787 = 4096;
            this.field4792 = 3;
            this.field4784 = 512;
            this.field4797 = 1536;
        } else if (var2 == 6) {
            this.field4797 = 1280;
            this.field4792 = 3;
            this.field4784 = 768;
            this.field4787 = 2048;
        } else if (var2 == 7) {
            this.field4787 = 4096;
            this.field4792 = 3;
            this.field4784 = 768;
            this.field4797 = 1280;
        } else if (var2 == 8) {
            this.field4787 = 2048;
            this.field4784 = 1024;
            this.field4792 = 3;
            this.field4797 = 1024;
        } else if (var2 == 9) {
            this.field4797 = 1024;
            this.field4787 = 4096;
            this.field4792 = 3;
            this.field4784 = 1024;
        } else if (var2 == 14) {
            this.field4792 = 1;
            this.field4787 = 2048;
            this.field4784 = 768;
            this.field4797 = 1280;
        } else if (var2 == 15) {
            this.field4792 = 1;
            this.field4797 = 1536;
            this.field4787 = 4096;
            this.field4784 = 512;
        } else if (var2 == 16) {
            this.field4787 = 8192;
            this.field4792 = 1;
            this.field4784 = 256;
            this.field4797 = 1792;
        } else {
            this.field4787 = 2048;
            this.field4784 = 2048;
            this.field4797 = 0;
            this.field4792 = 0;
        }
        field4786++;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method2020(int arg0) {
        field4801 = null;
        if (arg0 != 1947154859) {
            method2020(-27);
        }
        field4798 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILqa;IB)V")
    private final void method2021(int arg0, int arg1, int arg2, int arg3, class167 arg4, int arg5, byte arg6) {
        field4783++;
        if (arg6 > -26) {
            method2018(-88);
        }
        this.field4799 = arg4.method995(arg0, arg5, arg2, arg1, arg3, 1.0F);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhca;ZI)V")
    public static final void method2022(class179 arg0, boolean arg1, int arg2) {
        field4796++;
        if (class487.field7385 >= 400) {
            return;
        }
        if (class239.field3493 != arg0) {
            if (arg2 <= 85) {
                method2022(null, true, -125);
            }
            String var9;
            if (arg0.field2735 == 0) {
                boolean var3 = true;
                if (class239.field3493.field2743 != -1 && arg0.field2743 != -1) {
                    int var4 = arg0.field2717 < class239.field3493.field2717 ? class239.field3493.field2717 : arg0.field2717;
                    int var5 = arg0.field2743 <= class239.field3493.field2743 ? arg0.field2743 : class239.field3493.field2743;
                    int var6 = (var4 * 10 / 100) + var5 + 5;
                    int var7 = class239.field3493.field2717 - arg0.field2717;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var7 > var6) {
                        var3 = false;
                    }
                }
                String var8 = class461.field6666 == class181.field2783 ? class349.field5060.method2953(3181, class77.field889) : class55.field680.method2953(3181, class77.field889);
                if (arg0.field2746 <= arg0.field2717) {
                    var9 = arg0.method1196(true, true) + (var3 ? class528.method3121(true, arg0.field2717, class239.field3493.field2717) : "<col=ffffff>") + " (" + var8 + arg0.field2717 + ")";
                } else {
                    var9 = arg0.method1196(true, true) + (var3 ? class528.method3121(true, arg0.field2717, class239.field3493.field2717) : "<col=ffffff>") + " (" + var8 + arg0.field2717 + "+" + (arg0.field2746 - arg0.field2717) + ")";
                }
            } else {
                var9 = arg0.method1196(true, true) + " (" + class574.field8468.method2953(3181, class77.field889) + arg0.field2735 + ")";
            }
            if (class369.field5337) {
                if (!arg1 && (class270.field4003 & 0x8) != 0) {
                    class436.method2670((long) arg0.field1053, -1, 58, 0, true, (byte) -5, class479.field7270, 0, field4798 + " -> <col=ffffff>" + var9, class425.field6074, false);
                    class646.field9374++;
                }
            } else if (arg1) {
                class436.method2670(0L, 0, -1, 0, false, (byte) -5, "<col=cccccc>" + var9, 0, "", -1, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class88.field1129[var10] != null) {
                        short var12 = 0;
                        if (class490.field7415 == class461.field6666 && class88.field1129[var10].equalsIgnoreCase(class63.field738.method2953(3181, class77.field889))) {
                            if (arg0.field2717 > class239.field3493.field2717) {
                                var12 = 2000;
                            }
                            if (class239.field3493.field2725 != 0 && arg0.field2725 != 0) {
                                if (class239.field3493.field2725 == arg0.field2725) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class535.field7921[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class259.field3797[var10] + var12);
                        int var14 = class383.field5600[var10] == -1 ? class417.field5998 : class383.field5600[var10];
                        class482.field7312++;
                        class436.method2670((long) arg0.field1053, -1, var13, 0, true, (byte) -5, class88.field1129[var10], 0, "<col=ffffff>" + var9, var14, false);
                    }
                }
            }
            if (!arg1) {
                for (class548 var11 = (class548) class272.field4014.method2496((byte) 52); var11 != null; var11 = (class548) class272.field4014.method2494(27)) {
                    if (var11.field8163 == 19) {
                        var11.field8162 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class369.field5337 && (class270.field4003 & 0x10) != 0) {
            class436.method2670(0L, -1, 30, 0, true, (byte) -5, class479.field7270, 0, field4798 + " -> <col=ffffff>" + class178.field2702.method2953(3181, class77.field889), class425.field6074, false);
            class271.field4006++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    protected class323() {
        if (class233.field3437 == null) {
            class587.method3426(69);
        }
        this.method2019(6);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -60 / ((arg1 + 14) / 60);
        this.field4784 = arg2;
        this.field4787 = arg4;
        field4793++;
        this.field4792 = arg3;
        this.field4797 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lqa;Lps;I)V")
    public class323(class167 arg0, class428 arg1, int arg2) {
        if (class233.field3437 == null) {
            class587.method3426(101);
        }
        this.field4791 = arg1.method2561((byte) 121);
        this.field4795 = (this.field4791 & 0x8) != 0;
        this.field4785 = (this.field4791 & 0x10) != 0;
        this.field4791 &= 0x7;
        int var4 = arg1.method2620(50) << arg2;
        int var5 = arg1.method2620(113) << arg2;
        int var6 = arg1.method2620(36) << arg2;
        int var7 = arg1.method2561((byte) 123);
        int var8 = var7 * 2 + 1;
        this.field4800 = new short[var8];
        for (int var9 = 0; var9 < this.field4800.length; var9++) {
            short var13 = (short) arg1.method2620(32);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field4800[var9] = (short) class313.method1926(var14 << 8, var15);
        }
        int var10 = (var7 << class179.field2726) + class605.field8913;
        int var11 = class620.field9045 == null ? class150.field1929[class627.method3660(arg1.method2620(105), false) & 0xFFFF] : class620.field9045[arg1.method2620(85)];
        int var12 = arg1.method2561((byte) -105);
        this.field4788 = (var12 & 0xE0) << 3;
        this.field4790 = var12 & 0x1F;
        if (this.field4790 != 31) {
            this.method2019(6);
        }
        this.method2021(var4, var10, var5, var11, arg0, var6, (byte) -31);
    }

    static {
        new class487("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field4801 = new class586(14, 8);
    }
}
