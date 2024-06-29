import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class655 {

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Lui;")
    private class251 field9292 = new class251(128);

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Llga;")
    private class47 field9291;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9297 = new String[] { method4763(method4762("kO\u007f*G")), method4763(method4762("kO\u007f-G")), method4763(method4762("kO\u007f/G")), method4763(method4762("kO\u007f&G")), method4763(method4762("WbkN")), method4763(method4762("kO\u007f)G")), method4763(method4762("kO\u007f+G")), method4763(method4762("kT=\u0002")), method4763(method4762("kO\u007fR\u0006kH%PG")), method4763(method4762("~\u000f\u007f@\u0012")), method4763(method4762("kO\u007f(G")), method4763(method4762("kO\u007f,G")) };

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field9287;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V", line = 6)
    public final void method4754(byte arg0) {
        try {
            field9295++;
            class251 var2 = this.field9292;
            synchronized (this.field9292) {
                this.field9292.method2047(11914);
            }
            if (arg0 != 69) {
                field9286 = -112;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9297[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)V", line = 19)
    public final void method4755(int arg0, byte arg1) {
        try {
            field9294++;
            class251 var3 = this.field9292;
            synchronized (this.field9292) {
                this.field9292.method2038(0, arg0);
                if (arg1 <= 85) {
                    this.method4761(true, -4);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9297[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I", line = 32)
    public static final int method4756(int arg0, int arg1, int arg2) {
        try {
            int var3 = -98 / ((-arg2 - 31) / 40);
            field9296++;
            int var4 = arg0 >>> 31;
            return (arg0 + var4) / arg1 - var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9297[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 46)
    public static final void method4757(byte arg0) {
        try {
            field9287++;
            if (class582.field8406 != null && arg0 == 26) {
                class582.field8406 = null;
                class376.method2982(class707.field9883, class435.field6411, class647.field9199, class238.field3444, 9532);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9297[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 63)
    public final void method4758(byte arg0) {
        try {
            if (arg0 != -36) {
                method4759(-11);
            }
            class251 var2 = this.field9292;
            synchronized (this.field9292) {
                this.field9292.method2043(false);
            }
            field9289++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9297[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 77)
    public static final void method4759(int arg0) {
        try {
            field9293++;
            if (arg0 != 19440) {
                field9286 = -90;
            }
            class682 var1 = (class682) class530.field7694.method3977((byte) -127);
            boolean var2 = class543.field7943 != null || class577.field8367 > 0;
            int var3 = var1.method1086((byte) 126);
            int var4 = var1.method1088(arg0 ^ 0xFFFFB40A);
            if (var2) {
                class350.field5075 = 1;
            }
            if (var2) {
                class209.field3044 = class44.field639;
            } else {
                class10.method67(class44.field639, var4, var3, -30292);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9297[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V", line = 105)
    public static final void method4760(int arg0) {
        try {
            field9290++;
            if (class451.field6612.field9135.method4015(3) == 2) {
                byte var1 = (byte) (class671.field9454 - 4 & 0xFF);
                int var2 = class671.field9454 % class625.field8929;
                for (int var3 = arg0; var3 < 4; var3++) {
                    for (int var4 = 0; var4 < class14.field187; var4++) {
                        class247.field3547[var3][var2][var4] = var1;
                    }
                }
                if (class693.field9689 != 3) {
                    for (int var5 = 0; var5 < 2; var5++) {
                        class774.field11044[var5] = -1000000;
                        class631.field8965[var5] = 1000000;
                        class742.field10546[var5] = 0;
                        class99.field1344[var5] = 1000000;
                        class250.field3575[var5] = 0;
                    }
                    int var6 = class203.field2988.field2969;
                    int var7 = class203.field2988.field2984;
                    if (class596.field8579 != 1 && class171.field2267 == -1) {
                        int var8 = class100.method977(-1, class688.field9635, class693.field9689, class670.field9442);
                        if (var8 - class525.field7650 < 3200 && (class76.field1089[class693.field9689][class670.field9442 >> 9][class688.field9635 >> 9] & 0x4) != 0) {
                            class434.method3378(class608.field8715, false, 1, class670.field9442 >> 9, class688.field9635 >> 9, 124);
                            return;
                        }
                    } else {
                        if (class596.field8579 != 1) {
                            var7 = class301.field4188;
                            var6 = class171.field2267;
                        }
                        if ((class76.field1089[class693.field9689][var6 >> 9][var7 >> 9] & 0x4) != 0) {
                            class434.method3378(class608.field8715, false, 0, var6 >> 9, var7 >> 9, 121);
                        }
                        if (class355.field5151 >= 2560) {
                            return;
                        }
                        int var9 = class670.field9442 >> 9;
                        int var10 = class688.field9635 >> 9;
                        int var11 = var6 >> 9;
                        int var12 = var7 >> 9;
                        int var13;
                        if (var11 <= var9) {
                            var13 = var9 - var11;
                        } else {
                            var13 = var11 - var9;
                        }
                        int var14;
                        if (var10 < var12) {
                            var14 = var12 - var10;
                        } else {
                            var14 = var10 - var12;
                        }
                        if (var13 == 0 && var14 == 0 || var13 <= (-class625.field8929) || var13 >= class625.field8929 || var14 <= (-class14.field187) || var14 >= class14.field187) {
                            class162.method1374(null, field9297[4] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class537.field7895 + "," + field9286, (byte) -93);
                            return;
                        }
                        if (var14 < var13) {
                            int var15 = var14 * 65536 / var13;
                            int var16 = 32768;
                            while (var9 != var11) {
                                if (var11 > var9) {
                                    var9++;
                                } else if (var11 < var9) {
                                    var9--;
                                }
                                if ((class76.field1089[class693.field9689][var9][var10] & 0x4) != 0) {
                                    class434.method3378(class608.field8715, false, 1, var9, var10, 118);
                                    return;
                                }
                                var16 += var15;
                                if (var16 >= 65536) {
                                    if (var10 < var12) {
                                        var10++;
                                    } else if (var12 < var10) {
                                        var10--;
                                    }
                                    var16 -= 65536;
                                    if ((class76.field1089[class693.field9689][var9][var10] & 0x4) != 0) {
                                        class434.method3378(class608.field8715, false, 1, var9, var10, arg0 ^ 0x5E);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var17 = var13 * 65536 / var14;
                        int var18 = 32768;
                        while (var10 != var12) {
                            if (var12 > var10) {
                                var10++;
                            } else if (var10 > var12) {
                                var10--;
                            }
                            if ((class76.field1089[class693.field9689][var9][var10] & 0x4) != 0) {
                                class434.method3378(class608.field8715, false, 1, var9, var10, 95);
                                return;
                            }
                            var18 += var17;
                            if (var18 >= 65536) {
                                if (var9 < var11) {
                                    var9++;
                                } else if (var9 > var11) {
                                    var9--;
                                }
                                var18 -= 65536;
                                if ((class76.field1089[class693.field9689][var9][var10] & 0x4) != 0) {
                                    class434.method3378(class608.field8715, false, 1, var9, var10, 89);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field9297[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)Lfn;", line = 308)
    public final class97 method4761(boolean arg0, int arg1) {
        try {
            field9288++;
            if (!arg0) {
                this.field9292 = null;
            }
            class251 var3 = this.field9292;
            class97 var4;
            synchronized (this.field9292) {
                var4 = (class97) this.field9292.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field9291;
            byte[] var6;
            synchronized (this.field9291) {
                var6 = this.field9291.method512(arg1, 1, (byte) -79);
            }
            class97 var7 = new class97();
            if (var6 != null) {
                var7.method957(new class711(var6), (byte) -98);
            }
            class251 var8 = this.field9292;
            synchronized (this.field9292) {
                this.field9292.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field9297[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 347)
    public class655(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field9291 = arg2;
            this.field9291.method509(true, 1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9297[8] + (arg0 == null ? field9297[7] : field9297[9]) + ',' + arg1 + ',' + (arg2 == null ? field9297[7] : field9297[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4762(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4763(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
