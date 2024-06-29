import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class94 extends class471 implements class381 {

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lhb;")
    public class471 field1393;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
    public static boolean field1388 = true;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lmc;")
    public static class78 field1394;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lld;")
    public static class105 field1395;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "Lmc;")
    public static class78 field1397;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Lbe;")
    public static class28 field1387;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field1398;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "[Lkh;")
    public static class13[] field1399;

    static {
        new class206("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field1394 = new class78(67, 4);
        field1395 = new class105();
        field1397 = new class78(37, 6);
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 6)
    public final void method8(int arg0) {
        field1376++;
        if (arg0 >= -74) {
            field1388 = true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I", line = 16)
    public final int method13(int arg0) {
        field1372++;
        return arg0 <= 51 ? 83 : 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLwm;)V", line = 27)
    public final void method12(byte arg0, class364 arg1) {
        if (arg0 <= 27) {
            field1387 = null;
        }
        field1377++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V", line = 37)
    public static void method592(byte arg0) {
        field1398 = null;
        field1397 = null;
        field1399 = null;
        field1395 = null;
        if (arg0 != -80) {
            field1397 = null;
        }
        field1394 = null;
        field1387 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Z", line = 53)
    public final boolean method7(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field1373++;
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)I", line = 64)
    public final int method6(int arg0) {
        field1378++;
        return arg0 == 0 ? 0 : -49;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILwm;I)Lgn;", line = 80)
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            field1398 = null;
        }
        field1389++;
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V", line = 91)
    public static final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class102.field1472[var5][arg4] = arg3;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class102.field1472[var6][arg4] = arg3;
            }
        }
        if (arg2 == 1891003047) {
            field1380++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 127)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        field1382++;
        if (!arg6) {
            this.method4(-112);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I", line = 137)
    public final int method9(int arg0) {
        field1391++;
        if (arg0 != -769) {
            field1394 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lwm;B)Lnf;", line = 150)
    public final class374 method3(class364 arg0, byte arg1) {
        if (arg1 <= 99) {
            field1388 = true;
        }
        field1371++;
        return null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIIIIIILhb;)V", line = 161)
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class471 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class165.method963(arg1, (byte) -18, arg0));
        this.field1393 = arg10;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 169)
    public final void method1(int arg0) {
        if (arg0 >= -105) {
            field1388 = false;
        }
        field1383++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lwm;I)V", line = 186)
    public final void method16(class364 arg0, int arg1) {
        if (arg1 != 31591) {
            this.method12((byte) -126, (class364) null);
        }
        field1374++;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)Z", line = 196)
    public final boolean method17(int arg0) {
        field1385++;
        return arg0 != 7;
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V", line = 208)
    public static final void method594(int arg0) {
        field1381++;
        if (class488.field6789.method2412((byte) 31, class222.field2958) != 2) {
            return;
        }
        byte var1 = (byte) (class67.field911 - 4 & 0xFF);
        int var2 = class67.field911 % class295.field3947;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class39.field567; var16++) {
                class191.field2589[var3][var2][var16] = var1;
            }
        }
        if (class373.field5104 == 3) {
            return;
        }
        int var4 = 0;
        if (arg0 <= 9) {
            return;
        }
        while (var4 < 2) {
            class138.field2006[var4] = -1000000;
            class97.field1420[var4] = 1000000;
            class121.field1774[var4] = 0;
            class127.field1866[var4] = 1000000;
            class108.field1612[var4] = 0;
            var4++;
        }
        if (class56.field772 != 1) {
            int var5 = class247.method1385(6, class197.field2680, class412.field5637, class373.field5104);
            if ((var5 - class195.field2638) < 800 && (class1.field26[class373.field5104][class197.field2680 >> 7][class412.field5637 >> 7] & 0x4) != 0) {
                class354.method2181(class289.field3897, false, 14818, class197.field2680 >> 7, class412.field5637 >> 7, 1);
                return;
            }
            return;
        }
        if ((class1.field26[class373.field5104][class233.field3103.field6501 >> 7][class233.field3103.field6507 >> 7] & 0x4) != 0) {
            class354.method2181(class289.field3897, false, 14818, class233.field3103.field6501 >> 7, class233.field3103.field6507 >> 7, 0);
        }
        if (class155.field2171 >= 2560) {
            return;
        }
        int var6 = class197.field2680 >> 7;
        int var7 = class412.field5637 >> 7;
        int var8 = class233.field3103.field6501 >> 7;
        int var9 = class233.field3103.field6507 >> 7;
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (var10 == 0 && var11 == 0 || var10 <= -class295.field3947 || class295.field3947 <= var10 || var11 <= (-class39.field567) || var11 >= class39.field567) {
            class228.method1278((Throwable) null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class162.field2260 + "," + class266.field3511, -30116);
            return;
        }
        if (var11 >= var10) {
            int var12 = var10 * 65536 / var11;
            int var13 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class1.field26[class373.field5104][var6][var7] & 0x4) != 0) {
                    class354.method2181(class289.field3897, false, 14818, var6, var7, 1);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class1.field26[class373.field5104][var6][var7] & 0x4) != 0) {
                        class354.method2181(class289.field3897, false, 14818, var6, var7, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var11 * 65536 / var10;
        int var15 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class1.field26[class373.field5104][var6][var7] & 0x4) != 0) {
                class354.method2181(class289.field3897, false, 14818, var6, var7, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class1.field26[class373.field5104][var6][var7] & 0x4) != 0) {
                    class354.method2181(class289.field3897, false, 14818, var6, var7, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lwm;B)V", line = 404)
    public final void method10(class364 arg0, byte arg1) {
        if (arg1 < -48) {
            field1384++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIBLwm;)Z", line = 416)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 > -107) {
            this.method14(87, 82, (byte) -18, (class364) null);
        }
        field1392++;
        return false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I", line = 435)
    public final int method4(int arg0) {
        field1386++;
        return arg0 == -10666 ? 0 : 29;
    }
}
