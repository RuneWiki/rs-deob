import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class301 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field4484 = 328;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4485 = "";

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field4488 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lfc;")
    public static class239 field4487;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILvg;)V")
    public static final void method1875(int arg0, int arg1, class51 arg2) {
        field4486++;
        boolean var3 = arg2.method369((byte) 126, 1) == 1;
        if (var3) {
            class392.field5789[class270.field3998++] = arg0;
        }
        int var4 = arg2.method369((byte) 126, 2);
        class257 var5 = class40.field565[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field3828 = -1;
            } else if (class263.field3910 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class492.field6923[arg0] = (var5.field4674[0] + class468.field6588 >> 6) + (var5.field4675[0] + class68.field922 >> 6 << 14) + (var5.field4545 << 28);
                if (var5.field3806 == -1) {
                    class236.field3440[arg0] = var5.field4611.method2743(true);
                } else {
                    class236.field3440[arg0] = var5.field3806;
                }
                class69.field942[arg0] = var5.field4635;
                if (var5.field3808 > 0) {
                    class204.method1390(var5, (byte) 1);
                }
                class40.field565[arg0] = null;
                if (arg2.method369((byte) 126, 1) != 0) {
                    class335.method2054(5, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg2.method369((byte) 126, 3);
            int var7 = var5.field4675[0];
            int var8 = var5.field4674[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var8--;
                var7++;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var8++;
                var7--;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field3828 = var7;
                var5.field3847 = var8;
            } else {
                var5.field3828 = -1;
                var5.method1695(class317.field4765[arg0], var7, (byte) 31, var8);
            }
        } else if (var4 == 2) {
            int var9 = arg2.method369((byte) 126, 4);
            int var10 = var5.field4675[0];
            int var11 = var5.field4674[0];
            if (var9 == 0) {
                var11 -= 2;
                var10 -= 2;
            } else if (var9 == 1) {
                var11 -= 2;
                var10--;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var11 -= 2;
                var10++;
            } else if (var9 == 4) {
                var11 -= 2;
                var10 += 2;
            } else if (var9 == 5) {
                var11--;
                var10 -= 2;
            } else if (var9 == 6) {
                var10 += 2;
                var11--;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var10 -= 2;
                var11++;
            } else if (var9 == 10) {
                var10 += 2;
                var11++;
            } else if (var9 == 11) {
                var10 -= 2;
                var11 += 2;
            } else if (var9 == 12) {
                var10--;
                var11 += 2;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var11 += 2;
                var10++;
            } else if (var9 == 15) {
                var10 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field3828 = var10;
                var5.field3847 = var11;
            } else {
                var5.field3828 = -1;
                var5.method1695(class317.field4765[arg0], var10, (byte) 31, var11);
            }
        } else {
            int var12 = arg2.method369((byte) 126, 1);
            if (var12 == 0) {
                int var13 = arg2.method369((byte) 126, 12);
                int var14 = var13 >> 10;
                int var15 = var13 >> 5 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field4675[0] + var15;
                int var18 = var5.field4674[0] + var16;
                if (var3) {
                    var5.field3847 = var18;
                    var5.field3828 = var17;
                } else {
                    var5.field3828 = -1;
                    var5.method1695(class317.field4765[arg0], var17, (byte) 31, var18);
                }
                var5.field4545 = (byte) (var5.field4545 + var14 & 0x3);
                if (class263.field3910 == arg0) {
                    class486.field6836 = var5.field4545;
                }
            } else {
                int var19 = arg2.method369((byte) 126, 30);
                int var20 = var19 >> 28;
                int var21 = var19 >> 14 & 0x3FFF;
                int var22 = var19 & 0x3FFF;
                if (arg1 != -30827) {
                    field4484 = 55;
                }
                int var23 = (var5.field4675[0] + class68.field922 + var21 & 0x3FFF) - class68.field922;
                int var24 = (var5.field4674[0] + var22 + class468.field6588 & 0x3FFF) - class468.field6588;
                if (var3) {
                    var5.field3847 = var24;
                    var5.field3828 = var23;
                } else {
                    var5.field3828 = -1;
                    var5.method1695(class317.field4765[arg0], var23, (byte) 31, var24);
                }
                var5.field4545 = (byte) (var5.field4545 + var20 & 0x3);
                if (class263.field3910 == arg0) {
                    class486.field6836 = var5.field4545;
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1876(byte arg0) {
        if (arg0 < 73) {
            method1876((byte) 49);
        }
        field4487 = null;
        field4485 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BII)V")
    public static final void method1877(byte arg0, int arg1, int arg2) {
        field4483++;
        int var3 = 89 % ((arg0 - 49) / 53);
        class186 var4 = class275.method1789(arg2, (byte) 123, 12);
        var4.method1285(0);
        var4.field2829 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)V")
    public static final void method1878(byte arg0, int arg1) {
        if (arg0 < 112) {
            return;
        }
        field4482++;
        if (class428.field6110 == 0) {
            class245.field3510.method1144(true, arg1);
        } else {
            class372.field5600 = arg1;
        }
    }
}
