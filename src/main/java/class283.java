import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class283 extends class114 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    private int field3980 = -1;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3987 = new String[] { method2301(method2300("<2Fb)")), method2301(method2300("<2Fc)")), method2301(method2300("$-\u0004M")), method2301(method2300("<2Fe)")), method2301(method2300("1vF\u000f|")), method2301(method2300("<2F`)")) };

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lmv;")
    public static class125 field3978 = new class125(46, -1);

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    private int field3979;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    private int field3985;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    private int field3986;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILwfa;)V", line = 5)
    public final void method115(int arg0, class286 arg1) {
        try {
            field3981++;
            arg1.method2323(this.field3986, this.field3985, arg0 ^ 0xFFFFFFD1, this.field3979, this.field3980);
            if (arg0 != 95) {
                method2299((byte) 58);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3987[3] + arg0 + ',' + (arg1 == null ? field3987[2] : field3987[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZIII)V", line = 16)
    public static final void method2298(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            field3982++;
            if (class608.field8715 == null) {
                class236.field3418.method121(arg1, arg3, -63, arg5, -16777216, arg0);
            } else if (class203.field2988.field2969 >= 0 && class203.field2988.field2969 < class625.field8929 * 512 && class203.field2988.field2984 >= 0 && class203.field2988.field2984 < (class14.field187 * 512)) {
                class671.field9454++;
                if (class203.field2988 != null && class203.field2988.field2969 - ((class203.field2988.method1437((byte) -28) - 1) * 256) >> 9 == class477.field7028 && (class203.field2988.field2984 - ((class203.field2988.method1437((byte) -28) - 1) * 256) >> 9) == class346.field5032) {
                    class477.field7028 = -1;
                    class346.field5032 = -1;
                    class236.method1957(12936);
                }
                class574.method4272(3);
                if (!arg2) {
                    class714.method5179(512);
                }
                class312.method2492((byte) -91);
                class61.method659(arg5, arg1, (byte) -91, arg3, true, arg0);
                int var23 = class193.field2539;
                class194.field2686 = class194.field2682;
                int var21 = class321.field4381;
                int var24 = class785.field11340;
                int var22 = class797.field11580;
                if (class596.field8579 == 1) {
                    int var6 = (int) class607.field8706;
                    if ((class477.field7032 >> 8) > var6) {
                        var6 = class477.field7032 >> 8;
                    }
                    if (class318.field4350[4] && (class786.field11358[4] + 128) > var6) {
                        var6 = class786.field11358[4] + 128;
                    }
                    int var7 = (int) class349.field5057 + class113.field1461 & 0x3FFF;
                    class479.method3710(((var6 >> 3) * 3) + 600 << 2, class222.field3217, var7, var6, var24, class604.field8658, false, class100.method977(-1, class203.field2988.field2984, class693.field9689, class203.field2988.field2969) - 200);
                } else if (class596.field8579 == 4) {
                    int var8 = (int) class607.field8706;
                    if ((class477.field7032 >> 8) > var8) {
                        var8 = class477.field7032 >> 8;
                    }
                    if (class318.field4350[4] && var8 < (class786.field11358[4] + 128)) {
                        var8 = class786.field11358[4] + 128;
                    }
                    int var9 = (int) class349.field5057 & 0x3FFF;
                    class479.method3710(((var8 >> 3) * 3) + 600 << 2, class222.field3217, var9, var8, var24, class604.field8658, false, class100.method977(-1, class138.field1805, class693.field9689, class36.field439) - 200);
                } else if (class596.field8579 == 5) {
                    class190.method1591((byte) 78, var24);
                }
                int var10 = class670.field9442;
                int var11 = class525.field7650;
                int var12 = class688.field9635;
                if (arg4 != -17832) {
                    field3978 = null;
                }
                int var13 = class355.field5151;
                int var14 = class57.field802;
                for (int var15 = 0; var15 < 5; var15++) {
                    if (class318.field4350[var15]) {
                        int var16 = (int) ((double) (-class369.field5345[var15]) + (double) (class369.field5345[var15] * 2 + 1) * Math.random() + Math.sin((double) class387.field5645[var15] / 100.0D * (double) class312.field4290[var15]) * (double) class786.field11358[var15]);
                        if (var15 == 4) {
                            class355.field5151 += var16;
                            if (class355.field5151 < 1024) {
                                class355.field5151 = 1024;
                            } else if (class355.field5151 > 3072) {
                                class355.field5151 = 3072;
                            }
                        }
                        if (var15 == 2) {
                            class688.field9635 += var16 << 2;
                        }
                        if (var15 == 1) {
                            class525.field7650 += var16 << 2;
                        }
                        if (var15 == 0) {
                            class670.field9442 += var16 << 2;
                        }
                        if (var15 == 3) {
                            class57.field802 = class57.field802 + var16 & 0x3FFF;
                        }
                    }
                }
                if (class670.field9442 < 0) {
                    class670.field9442 = 0;
                }
                if (class688.field9635 < 0) {
                    class688.field9635 = 0;
                }
                if ((class508.field7455 << 9) - 1 < class670.field9442) {
                    class670.field9442 = (class508.field7455 << 9) - 1;
                }
                if (((class700.field9795 << 9) - 1) < class688.field9635) {
                    class688.field9635 = (class700.field9795 << 9) - 1;
                }
                class655.method4760(arg4 ^ 0xFFFFBA58);
                class236.field3418.method208(var23, var21, var23 + var22, var21 + var24);
                class198.method1710(1, true);
                int var17 = class376.field5494;
                class151.field1925.method722(class670.field9442, class525.field7650, class688.field9635, -class355.field5151 & 0x3FFF, -class57.field802 & 0x3FFF, -class282.field3974 & 0x3FFF);
                class236.field3418.method204(class151.field1925);
                class236.field3418.method233(var22 / 2 + var23, var24 / 2 + var21, class750.field10684 << 1, class750.field10684 << 1);
                if (class212.field3119) {
                    class526.method3998(arg4 + 17912, class376.field5494);
                    if (class423.field6047 != class194.field2686) {
                        class710.field9925 = true;
                    }
                    class423.field6047 = class194.field2686;
                    class236.field3418.method243(var17);
                    class236.field3418.method225();
                } else if (class320.field4367 == null) {
                    class236.field3418.method243(var17);
                    class236.field3418.method225();
                } else {
                    class236.field3418.method127(1.0F);
                    class236.field3418.method235(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                    class320.field4367.method5576(arg4 + 17956, var23, var24, class236.field3418, class57.field802, false, var22, var21, true, var17, class355.field5151, class682.field9575 << 3, class282.field3974);
                }
                class635.method4633(116);
                class543.method4096(class750.field10684 << 1, (byte) -1, class750.field10684 << 1, var23 + (var22 / 2), var21 - -(var24 / 2));
                class613.method4527(class688.field9635, -class282.field3974 & 0x3FFF, class525.field7650, -class57.field802 & 0x3FFF, class670.field9442, -class355.field5151 & 0x3FFF, (byte) -49);
                class162.method1383(-14816);
                byte var18 = class451.field6612.field9135.method4015(3) == 2 ? (byte) class671.field9454 : 1;
                if (class212.field3119) {
                    class299.method2395(-class57.field802 & 0x3FFF, (byte) 71, -class355.field5151 & 0x3FFF, -class282.field3974 & 0x3FFF);
                    class343.method2752(class670.field9442, class451.field6612.field9097.method3661(3) == 0, class194.field2686, class694.field9700, class250.field3575, class525.field7650, class774.field11044, var18, class742.field10546, arg4 + 17835, class203.field2988.field2984 >> 9, class688.field9635, class247.field3547, class203.field2988.field2969 >> 9, class203.field2988.field2981 + 1, true, class631.field8965, class99.field1344);
                } else {
                    class311.method2482(class694.field9700, class670.field9442, class525.field7650, class688.field9635, class247.field3547, class774.field11044, class631.field8965, class742.field10546, class250.field3575, class99.field1344, class203.field2988.field2981 + 1, var18, class203.field2988.field2969 >> 9, class203.field2988.field2984 >> 9, class451.field6612.field9097.method3661(3) == 0, true, class149.field1902 ? class194.field2686 : -1, 0, false);
                }
                class635.method4633(105);
                if (class559.field8139 == 11) {
                    class231.method1915(var22, 256, 93, var24, var21, var23, 256);
                    class159.method1344(1012161825, 256, var21, var24, var23, 256, var22);
                    class594.method4382(256, var21, 256, var24, var23, false, var22);
                    class751.method5439(var23, var22, var21, var24, true);
                }
                class449.method3478();
                class57.field802 = var14;
                class525.field7650 = var11;
                class670.field9442 = var10;
                class688.field9635 = var12;
                class355.field5151 = var13;
                if (class319.field4362 && class45.field646.method5027(-12237) == 0) {
                    class319.field4362 = false;
                }
                if (class319.field4362) {
                    class236.field3418.method121(var22, var23, -115, var24, -16777216, var21);
                    class649.method4730(2, class84.field1185, class537.field7842.method4068((byte) -106, class405.field5883), class23.field279, class236.field3418, false);
                }
                class198.method1710(1, false);
            } else {
                class236.field3418.method121(arg1, arg3, 107, arg5, -16777216, arg0);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field3987[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 245)
    public static void method2299(byte arg0) {
        try {
            if (arg0 != 67) {
                method2299((byte) -16);
            }
            field3978 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3987[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljc;I)V", line = 269)
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg1 == -27800) {
                field3984++;
                this.field3980 = arg0.method5116((byte) -122);
                this.field3985 = arg0.method5113(18443);
                this.field3986 = arg0.method5128(0);
                this.field3979 = arg0.method5128(arg1 + 27800);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3987[5] + (arg0 == null ? field3987[2] : field3987[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2300(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2301(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
