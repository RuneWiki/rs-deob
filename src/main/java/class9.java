import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class9 extends class34 {

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    private int field102 = 6;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field109;

    static {
        new class157("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        new class157("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field111 = 104;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 3)
    public static final void method63(int arg0, int arg1) {
        if (!class76.field1075.field3673) {
            arg0 = -1;
        }
        ++field105;
        if (class466.field6741 != arg0) {
            if (~arg0 != 0) {
                class505 var2 = class485.field6979.method2304(-17450, arg0);
                class396 var3 = var2.method2995(2607);
                if (var3 != null) {
                    class346.field4985.method1200(var3.method2349(), class415.field6025, var3.method2341(), true, var3.method2352(), new Point(var2.field7380, var2.field7386));
                    class466.field6741 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (arg1 == 11363) {
                if (~arg0 == 0 && ~class466.field6741 != 0) {
                    class346.field4985.method1200(-1, class415.field6025, -1, true, (int[]) null, new Point());
                    class466.field6741 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[I", line = 44)
    public final int[] method64(int arg0, byte arg1) {
        ++field108;
        int[] var3 = super.field537.method1780(arg0, (byte) 60);
        if (super.field537.field4191) {
            int[] var4 = this.method252(false, arg0, 0);
            int[] var5 = this.method252(false, arg0, 1);
            int var6 = this.field102;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (var6 != 5) {
                                if (~var6 != -7) {
                                    if (~var6 != -8) {
                                        if (~var6 != -9) {
                                            if (~var6 != -10) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class383.field5502; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 + var9 - (var8 * var9 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~class383.field5502 < ~var10; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = var11 > var12 ? var11 - var12 : var12 - var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class383.field5502; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var14 >= var15 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~class383.field5502 < ~var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = ~var18 > ~var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class383.field5502 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class383.field5502 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class383.field5502; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class383.field5502; ++var25) {
                                    var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class383.field5502 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class383.field5502 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class383.field5502; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class383.field5502; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        int var31 = -118 / (-arg1 / 50);
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILmk;I)V", line = 293)
    public static final void method65(int arg0, class382 arg1, int arg2) {
        ++field107;
        if (class416.field6037) {
            arg0 = 0;
            class416.field6037 = false;
        }
        if (arg2 == 28571) {
            if (class465.field6718 == null || !class465.field6718.method2269(-116, arg1)) {
                class465.field6718 = arg1;
                class166.field2545 = class254.method1522((byte) -51);
                class141.field2104 = arg0;
                class461.field6677 = arg0;
                if (~class461.field6677 != -1) {
                    class180.field2683 = class189.field2780;
                    class403.field5761 = class257.field3497;
                    class197.field2896 = class528.field7706;
                    class188.field2767 = class315.field4275;
                    class44.field635 = class419.field6072;
                    class350.field5081 = class270.field3642;
                    class237.field3283 = class391.field5641;
                    class167.field2549 = class136.field2060;
                    class497.field7278 = class193.field2813;
                    class457.field6659 = class42.field625;
                    return;
                }
                class457.method2672(arg2 ^ 28570);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[[I", line = 333)
    public final int[][] method66(byte arg0, int arg1) {
        ++field109;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            field111 = -109;
        }
        if (super.field536.field726) {
            int[][] var4 = this.method254(0, 0, arg1);
            int[][] var5 = this.method254(arg0 ^ -11, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field102;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class383.field5502; ++var16) {
                                                                int var17 = var12[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var14[var16];
                                                                int var20 = var13[var16];
                                                                int var21 = var10[var16];
                                                                int var22 = var9[var16];
                                                                var6[var16] = -(var17 * var22 >> 11) + var17 + var22;
                                                                var7[var16] = -(var20 * var21 >> 11) + var20 + var21;
                                                                var8[var16] = -(var18 * var19 >> 11) + var18 + var19;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class383.field5502; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var13[var23];
                                                            var6[var23] = ~var25 <= ~var28 ? -var28 + var25 : var28 - var25;
                                                            var7[var23] = var29 < var27 ? var27 - var29 : -var27 + var29;
                                                            var8[var23] = ~var26 >= ~var24 ? -var26 + var24 : -var24 + var26;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class383.field5502; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var11[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var32 < ~var36 ? var32 : var36;
                                                        var7[var30] = ~var34 >= ~var31 ? var31 : var34;
                                                        var8[var30] = ~var35 >= ~var33 ? var33 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class383.field5502 > var37; ++var37) {
                                                    int var38 = var9[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var11[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var10[var37];
                                                    var6[var37] = var38 >= var42 ? var42 : var38;
                                                    var7[var37] = var41 > var43 ? var43 : var41;
                                                    var8[var37] = var39 > var40 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class383.field5502; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = ~var46 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var46 : 0;
                                                var7[var44] = ~var47 == -1 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = ~var45 == -1 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class383.field5502; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = var49 == 4096 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var51 != 4096 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class383.field5502 < ~var52; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : 4096 - ((4096 - var9[var52]) * (-var55 + 4096) >> 11);
                                        var7[var52] = ~var54 <= -2049 ? -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var10[var52] * var54 >> 11;
                                        var8[var52] = ~var53 > -2049 ? var11[var52] * var53 >> 11 : -((-var11[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class383.field5502; ++var56) {
                                    var6[var56] = -((4096 - var12[var56]) * (-var9[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class383.field5502 < ~var57; ++var57) {
                                int var58 = var14[var57];
                                int var59 = var13[var57];
                                int var60 = var12[var57];
                                var6[var57] = ~var60 != -1 ? (var9[var57] << 12) / var60 : 4096;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var58 == 0 ? 4096 : (var11[var57] << 12) / var58;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class383.field5502; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class383.field5502; ++var62) {
                        var6[var62] = var9[var62] - var12[var62];
                        var7[var62] = var10[var62] - var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; var63 < class383.field5502; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 711)
    public class9() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lta;JIIIIIILat;)V", line = 658)
    public static final void method67(class336 arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class444 arg8) {
        if (arg5 == 21075) {
            ++field103;
            int var10 = arg2 * arg2 + arg4 * arg4;
            if (arg1 >= (long) var10) {
                int var11 = Math.min(arg8.field6470 / 2, arg8.field6453 / 2);
                if (~(var11 * var11) > ~var10) {
                    var11 -= 10;
                    int var12;
                    if (~class247.field3363 == -5) {
                        var12 = (int) class191.field2797 & 16383;
                    } else {
                        var12 = 16383 & (int) class191.field2797 + class457.field6666;
                    }
                    int var13 = class51.field743[var12];
                    int var14 = class51.field731[var12];
                    if (~class247.field3363 != -5) {
                        var13 = var13 * 256 / (class532.field7816 - -256);
                        var14 = var14 * 256 / (class532.field7816 + 256);
                    }
                    int var15 = arg2 * var13 + arg4 * var14 >> 15;
                    int var16 = arg2 * var14 + -(arg4 * var13) >> 15;
                    double var17 = Math.atan2((double) var15, (double) var16);
                    int var19 = (int) (Math.sin(var17) * (double) var11);
                    int var20 = (int) ((double) var11 * Math.cos(var17));
                    class83.field1226[arg7].method2146((float) arg8.field6470 / 2.0F + (float) arg6 + (float) var19, (float) arg8.field6453 / 2.0F + (float) arg3 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
                } else {
                    class419.method2475(arg0, (byte) -101, arg8, arg6, class515.field7542[arg7], arg4, arg2, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", line = 716)
    public static final void method68(String arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        ++field106;
        class365.method2184(arg1, arg4, (String) null, -94, arg2, arg3, arg0, arg5);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lsv;II)V", line = 728)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 >= 16) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    super.field533 = ~arg0.method1869(-92) == -2;
                }
            } else {
                this.field102 = arg0.method1869(-75);
            }
            ++field104;
        }
    }
}
