import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class45 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
    private int[] field629;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "[B")
    private byte[] field637;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
    private int[] field633;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
    public static volatile boolean field635 = true;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lnq;")
    public static class268 field638;

    static {
        new class442("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method398(int arg0, int arg1, int arg2) {
        field631++;
        if (!class271.field3762) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class143.field2057[var3] == null || class143.field2057[var3][var4] == null) {
            return false;
        }
        class453 var5 = class143.field2057[var3][var4];
        if (arg0 == arg2 && var5.field6356 == 0) {
            for (class87 var6 = (class87) class121.field1699.method646(48); var6 != null; var6 = (class87) class121.field1699.method641(false)) {
                if (var6.field1217 == 6 || var6.field1217 == 1002 || var6.field1217 == 9 || var6.field1217 == 47 || var6.field1217 == 2) {
                    for (class453 var7 = class442.method2767(var6.field1214, -1229996208); var7 != null; var7 = class304.method1961(var7, arg0 - 2115346127)) {
                        if (var5.field6314 == var7.field6314) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class87 var8 = (class87) class121.field1699.method646(arg0 + 49); var8 != null; var8 = (class87) class121.field1699.method641(false)) {
                if (var8.field1215 == arg2 && var5.field6314 == var8.field1214 && (var8.field1217 == 6 || var8.field1217 == 1002 || var8.field1217 == 9 || var8.field1217 == 47 || var8.field1217 == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Luo;B)V", line = 69)
    public static final void method399(class345 arg0, byte arg1) {
        field630++;
        if (!(class90.field1260 >= 2 || class327.field4511) || class432.field6109 != null) {
            return;
        }
        int var2 = -91 % ((arg1 - 29) / 57);
        String var3;
        if (class327.field4511 && class90.field1260 < 2) {
            var3 = class249.field3519 + class21.field387.method2763(-100, class210.field2935) + class416.field5913 + " ->";
        } else if (class18.field320 && class203.field2790.method1872(81, 4463) && class90.field1260 > 2) {
            var3 = class203.method1318(0, (class87) class121.field1699.field1267.field5601.field5601);
        } else {
            class87 var4 = (class87) class121.field1699.field1267.field5601;
            var3 = class203.method1318(0, var4);
            int[] var5 = null;
            if (class197.method1282((byte) 33, var4.field1217)) {
                var5 = class51.method433((byte) 87, (int) var4.field1216).field4950;
            } else if (class39.method370(var4.field1217, 1010)) {
                class198 var6 = class98.field1358[(int) var4.field1216];
                if (var6 != null) {
                    var5 = var6.field2737.field4505;
                }
            } else if (class228.method1577(var4.field1217, 44)) {
                if (var4.field1217 == 1003) {
                    var5 = class375.method2395((byte) 14, (int) var4.field1216).field920;
                } else {
                    var5 = class375.method2395((byte) 18, (int) (var4.field1216 >>> 32 & 0x7FFFFFFFL)).field920;
                }
            }
            if (var5 != null) {
                var3 = var3 + class387.method2453(var5, true);
            }
        }
        if (class90.field1260 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class90.field1260 - 2) + class150.field2129.method2763(81, class210.field2935);
        }
        if (class348.field4779 != null) {
            class357 var8 = class348.field4779.method2808(14310, arg0);
            if (var8 == null) {
                var8 = class279.field3915;
            }
            var8.method2290(class348.field4779.field6317, class311.field4261, class348.field4779.field6320, var3, 109, class288.field4050, class57.field776, class348.field4779.field6401, class348.field4779.field6447, class348.field4779.field6342, class305.field4210, class157.field2217, class189.field2608, class348.field4779.field6326, class326.field4461);
            class285.method1861(class189.field2608[3], 28659, class189.field2608[1], class189.field2608[0], class189.field2608[2]);
        } else if (class188.field2600 != null && class129.field1827 == 0) {
            int var7 = class279.field3915.method2291((byte) -127, 0, class326.field4461, 16777215, class305.field4210, class157.field2217, class338.field4647 + 4, class87.field1222 + 16, class311.field4261, var3);
            class285.method1861(16, 28659, class87.field1222, class338.field4647 + 4, class95.field1313.method2156(var3, 60) - -var7);
            return;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII[BI[B)I", line = 148)
    public final int method400(byte arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field634++;
        if (arg0 != 67) {
            this.method401(37, (byte[]) null, -13, (byte[]) null, -112, 64);
        }
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var11;
            if ((var11 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var12;
            if ((var12 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var13;
            if ((var13 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var14;
            if ((var14 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var15;
            if ((var15 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var16;
            if ((var16 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var17;
            if ((var17 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field633[var8];
            }
            int var18;
            if ((var18 = this.field633[var8]) < 0) {
                arg3[arg1++] = (byte) (~var18);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[BI[BII)I", line = 304)
    public final int method401(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field632++;
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg0 + arg2;
        while (arg0 < var9) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field629[var10];
            byte var12 = this.field637[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            var8 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class393.method2487(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return arg5 <= 46 ? 3 : (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 375)
    public static final void method402(int arg0) {
        field636++;
        if (class203.field2787 == 2) {
            return;
        }
        try {
            class262.method1715("tbrefresh", class133.field1914, (byte) -112);
        } catch (Throwable var1) {
        }
        if (arg0 != -6594) {
            method403((byte) 127);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([B)V", line = 401)
    public class45(byte[] arg0) {
        int var2 = arg0.length;
        this.field629 = new int[var2];
        this.field637 = arg0;
        int[] var3 = new int[33];
        this.field633 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field629[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class393.method2487(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field633[var14] == 0) {
                            this.field633[var14] = var4;
                        }
                        var14 = this.field633[var14];
                    }
                    if (this.field633.length <= var14) {
                        int[] var17 = new int[this.field633.length * 2];
                        for (int var18 = 0; var18 < this.field633.length; var18++) {
                            var17[var18] = this.field633[var18];
                        }
                        this.field633 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field633[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 529)
    public static void method403(byte arg0) {
        if (arg0 >= 104) {
            field638 = null;
        }
    }
}
