import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class106 {

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    private int field1480 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lvu;")
    public class223[] field1466;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[[I")
    public static int[][] field1467 = new int[128][128];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lgk;")
    public static class331 field1471 = new class331("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "F")
    public static float field1483 = 1.0F;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "J")
    private long field1476;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lvu;")
    private class223 field1475;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lvu;")
    private class223 field1481;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)I", line = 3)
    public static final int method871(int arg0, boolean arg1) {
        field1473++;
        if (arg1) {
            field1471 = null;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lvu;", line = 32)
    public final class223 method872(int arg0) {
        field1464++;
        if (this.field1475 == null) {
            return null;
        }
        class223 var2 = this.field1466[(int) ((long) (this.field1463 + arg0) & this.field1476)];
        while (this.field1475 != var2) {
            if (this.field1475.field3271 == this.field1476) {
                class223 var3 = this.field1475;
                this.field1475 = this.field1475.field3275;
                return var3;
            }
            this.field1475 = this.field1475.field3275;
        }
        this.field1475 = null;
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I", line = 64)
    public final int method873(int arg0) {
        field1469++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1463; var3++) {
            class223 var4 = this.field1466[var3];
            class223 var5 = var4.field3275;
            while (var4 != var5) {
                var5 = var5.field3275;
                var2++;
            }
        }
        if (arg0 != -5) {
            this.field1480 = 112;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 97)
    public final void method874(int arg0) {
        for (int var2 = arg0; var2 < this.field1463; var2++) {
            class223 var3 = this.field1466[var2];
            while (true) {
                class223 var4 = var3.field3275;
                if (var3 == var4) {
                    break;
                }
                var4.method1525((byte) 107);
            }
        }
        field1477++;
        this.field1475 = null;
        this.field1481 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)Lvu;", line = 127)
    public final class223 method875(long arg0, int arg1) {
        field1465++;
        this.field1476 = arg0;
        class223 var4 = this.field1466[(int) (arg0 & (long) (this.field1463 - 1))];
        for (this.field1475 = var4.field3275; this.field1475 != var4; this.field1475 = this.field1475.field3275) {
            if (this.field1475.field3271 == arg0) {
                class223 var5 = this.field1475;
                this.field1475 = this.field1475.field3275;
                return var5;
            }
        }
        this.field1475 = null;
        return arg1 <= 122 ? null : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 160)
    public static final void method876(byte arg0) {
        if (class305.field4338 != null) {
            class305.field4338.method1652(0);
        }
        if (arg0 != -109) {
            method876((byte) 17);
        }
        field1479++;
        if (class440.field6544 != null) {
            class440.field6544.method1652(0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lcw;IB)V", line = 181)
    public static final void method877(class120 arg0, int arg1, byte arg2) {
        field1470++;
        boolean var3 = arg0.method952(-51, 1) == 1;
        if (var3) {
            class8.field92[class293.field4221++] = arg1;
        }
        int var4 = arg0.method952(-91, 2);
        class364 var5 = class384.field5647[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field5076 = false;
            } else if (class396.field5815 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class241 var6 = class133.field1940[arg1] = new class241();
                var6.field3568 = (var5.field1777[0] + class340.field4713 >> 6 << 14) + (var5.field6328 << 28) + (var5.field1778[0] + class476.field7013 >> 6);
                if (var5.field5067 == -1) {
                    var6.field3565 = var5.field1718.method1994(-108);
                } else {
                    var6.field3565 = var5.field5067;
                }
                var6.field3564 = var5.field1713;
                var6.field3563 = var5.field5063;
                if (var5.field5080 > 0) {
                    class2.method8(var5, (byte) 70);
                }
                class384.field5647[arg1] = null;
                if (arg0.method952(arg2 - 4, 1) != 0) {
                    class180.method1266(arg0, arg2 + 159, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method952(arg2 - 17, 3);
            int var8 = var5.field1777[0];
            int var9 = var5.field1778[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field5076 = true;
                var5.field5081 = var8;
                var5.field5056 = var9;
            } else {
                var5.method2169(class373.field5539[arg1], var9, var8, 1);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method952(-64, 4);
            int var11 = var5.field1777[0];
            int var12 = var5.field1778[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field5081 = var11;
                var5.field5076 = true;
                var5.field5056 = var12;
            } else {
                var5.method2169(class373.field5539[arg1], var12, var11, 1);
            }
        } else {
            int var13 = arg0.method952(-124, 1);
            if (var13 == 0) {
                int var14 = arg0.method952(arg2 - 40, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3EF) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1777[0] + var16;
                int var19 = var5.field1778[0] + var17;
                if (var3) {
                    var5.field5056 = var19;
                    var5.field5076 = true;
                    var5.field5081 = var18;
                } else {
                    var5.method2169(class373.field5539[arg1], var19, var18, arg2 + 65);
                }
                var5.field6328 = (byte) (var5.field6328 + var15 & 0x3);
                if (class396.field5815 == arg1) {
                    class525.field7714 = var5.field6328;
                }
            } else {
                int var20 = arg0.method952(-58, 30);
                if (arg2 != -64) {
                    field1483 = 1.8926141F;
                }
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFE2B4) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class340.field4713 + var22 + var5.field1777[0] & 0x3FFF) - class340.field4713;
                int var25 = (var5.field1778[0] + class476.field7013 + var23 & 0x3FFF) - class476.field7013;
                if (var3) {
                    var5.field5081 = var24;
                    var5.field5076 = true;
                    var5.field5056 = var25;
                } else {
                    var5.method2169(class373.field5539[arg1], var25, var24, 1);
                }
                var5.field6328 = (byte) (var5.field6328 + var21 & 0x3);
                if (class396.field5815 == arg1) {
                    class525.field7714 = var5.field6328;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JILvu;)V", line = 499)
    public final void method878(long arg0, int arg1, class223 arg2) {
        if (arg1 != -2301) {
            method882(-104);
        }
        if (arg2.field3269 != null) {
            arg2.method1525((byte) 87);
        }
        field1472++;
        class223 var5 = this.field1466[(int) (arg0 & (long) (this.field1463 - 1))];
        arg2.field3275 = var5;
        arg2.field3269 = var5.field3269;
        arg2.field3269.field3275 = arg2;
        arg2.field3271 = arg0;
        arg2.field3275.field3269 = arg2;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Lvu;", line = 520)
    public final class223 method879(byte arg0) {
        field1478++;
        if (arg0 != -20) {
            method882(64);
        }
        if (this.field1480 > 0 && this.field1466[this.field1480 - 1] != this.field1481) {
            class223 var2 = this.field1481;
            this.field1481 = var2.field3275;
            return var2;
        }
        while (this.field1480 < this.field1463) {
            class223 var3 = this.field1466[this.field1480++].field3275;
            if (this.field1466[this.field1480 - 1] != var3) {
                this.field1481 = var3.field3275;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)Lvu;", line = 554)
    public final class223 method880(byte arg0) {
        this.field1480 = 0;
        field1482++;
        if (arg0 != -23) {
            this.method874(21);
        }
        return this.method879((byte) -20);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V", line = 569)
    public class106(int arg0) {
        this.field1466 = new class223[arg0];
        this.field1463 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class223 var3 = this.field1466[var2] = new class223();
            var3.field3275 = var3;
            var3.field3269 = var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)I", line = 591)
    public final int method881(int arg0) {
        if (arg0 != -14891) {
            this.field1476 = -35L;
        }
        field1468++;
        return this.field1463;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 603)
    public static void method882(int arg0) {
        if (arg0 != 31) {
            method877(null, 8, (byte) -98);
        }
        field1471 = null;
        field1467 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[Lvu;)I", line = 624)
    public final int method883(int arg0, class223[] arg1) {
        field1474++;
        int var3 = 59 % ((arg0 - 57) / 52);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1463; var5++) {
            class223 var6 = this.field1466[var5];
            for (class223 var7 = var6.field3275; var7 != var6; var7 = var7.field3275) {
                arg1[var4++] = var7;
            }
        }
        return var4;
    }
}
