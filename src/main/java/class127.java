import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class127 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Leia;")
    public class243 field1682 = new class243();

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Z")
    public boolean field1686 = false;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Z")
    public static boolean field1684 = true;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lwl;")
    public static class410 field1688 = new class410();

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLc;)V", line = 4)
    public final void method889(byte arg0, class187 arg1) {
        field1680++;
        class593 var3 = arg1.field2848;
        boolean var4 = true;
        class102[] var5 = arg1.field2851;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field1430) {
                var4 = false;
                break;
            }
        }
        if (arg0 != 52) {
            field1688 = null;
        }
        if (var4) {
            return;
        }
        if (this.field1686) {
            for (class187 var7 = (class187) this.field1682.method1615((byte) 54); var7 != null; var7 = (class187) this.field1682.method1625(-102)) {
                if (var7.field2848 == var3) {
                    var7.method385((byte) -21);
                    class387.method2494(2780, var7);
                }
            }
        }
        for (class187 var8 = (class187) this.field1682.method1615((byte) 75); var8 != null; var8 = (class187) this.field1682.method1625(arg0 ^ 0xFFFFFF89)) {
            if (var8.field2848.field8425 <= var3.field8425) {
                class455.method2789(var8, (byte) 72, arg1);
                return;
            }
        }
        this.field1682.method1616(22437, arg1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IJBI)V", line = 74)
    public static final void method890(int arg0, long arg1, byte arg2, int arg3) {
        field1689++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = (int) arg1 >> 20 & 0x3;
        if (arg2 < 83) {
            method891(125, null);
        }
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class461.method2815(var6, true, 0, var5, arg0, 0, arg3, 126, 0);
            return;
        }
        class211 var8 = class239.field3470.method388(var7, 100);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field3164;
            var10 = var8.field3152;
        } else {
            var9 = var8.field3152;
            var10 = var8.field3164;
        }
        int var11 = var8.field3095;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class461.method2815(0, true, var11, 0, arg0, var9, arg3, 115, var10);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)I", line = 122)
    public static final int method891(int arg0, String arg1) {
        field1687++;
        if (!class457.field6741.field10019) {
            return -1;
        } else if (class445.field6614.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class602.method3498(false, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class614.field8662 + var2;
            if (!class95.field1351.method212("", 6559, var3)) {
                return -1;
            } else if (class95.field1351.method204(var3, 43)) {
                byte[] var4 = class95.field1351.method233(-102, var3, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class5.method33(var2, 7375);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (arg0 <= 112) {
                    field1684 = true;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class4.method30(var6, -127);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class457.field6741.method4042((byte) -124, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class635.method3657(arg1, -108, var6);
                return 100;
            } else {
                return class95.field1351.method225(-125, var3);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Z)V", line = 602)
    public class127(boolean arg0) {
        this.field1686 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLvt;)V", line = 216)
    public static final void method892(int arg0, byte arg1, class304 arg2) {
        field1685++;
        boolean var3 = arg2.method1914(11356, 1) == 1;
        if (var3) {
            class570.field8068[class153.field2421++] = arg0;
        }
        int var4 = arg2.method1914(11356, 2);
        if (arg1 != -20) {
            return;
        }
        class689 var5 = class314.field4456[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field9528 = false;
            } else if (class701.field9775 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class448 var6 = class581.field8256[arg0] = new class448();
                var6.field6627 = (var5.field8429 << 28) + (class361.field5224 + var5.field6133[0] >> 6 << 14) + (var5.field6139[0] + class582.field8288 >> 6);
                if (var5.field9535 == -1) {
                    var6.field6628 = var5.field6110.method752((byte) 83);
                } else {
                    var6.field6628 = var5.field9535;
                }
                var6.field6622 = var5.field9497;
                var6.field6626 = var5.field6125;
                if (var5.field9527 > 0) {
                    class455.method2782(var5, 121);
                }
                class314.field4456[arg0] = null;
                if (arg2.method1914(11356, 1) != 0) {
                    class133.method939(arg2, arg0, 13706);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1914(11356, 3);
            int var8 = var5.field6133[0];
            int var9 = var5.field6139[0];
            if (var7 == 0) {
                var9--;
                var8--;
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
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field9519 = var9;
                var5.field9528 = true;
                var5.field9515 = var8;
            } else {
                var5.method3912(class661.field9247[arg0], var8, var9, -1);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1914(11356, 4);
            int var11 = var5.field6133[0];
            int var12 = var5.field6139[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
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
                var5.field9528 = true;
                var5.field9515 = var11;
                var5.field9519 = var12;
            } else {
                var5.method3912(class661.field9247[arg0], var11, var12, -1);
            }
        } else {
            int var13 = arg2.method1914(11356, 1);
            if (var13 == 0) {
                int var14 = arg2.method1914(11356, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field6133[0] + var16;
                int var19 = var5.field6139[0] + var17;
                if (var3) {
                    var5.field9528 = true;
                    var5.field9515 = var18;
                    var5.field9519 = var19;
                } else {
                    var5.method3912(class661.field9247[arg0], var18, var19, -1);
                }
                var5.field8429 = var5.field8417 = (byte) (var5.field8429 + var15 & 0x3);
                if (class286.method1827(var18, var19, (byte) -27)) {
                    var5.field8417++;
                }
                if (class701.field9775 == arg0) {
                    if (class341.field4946 != var5.field8429) {
                        class226.field3323 = true;
                    }
                    class341.field4946 = var5.field8429;
                }
            } else {
                int var20 = arg2.method1914(11356, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field6133[0] + class361.field5224 + var22 & 0x3FFF) - class361.field5224;
                int var25 = (var5.field6139[0] + class582.field8288 + var23 & 0x3FFF) - class582.field8288;
                if (var3) {
                    var5.field9515 = var24;
                    var5.field9528 = true;
                    var5.field9519 = var25;
                } else {
                    var5.method3912(class661.field9247[arg0], var24, var25, -1);
                }
                var5.field8429 = var5.field8417 = (byte) (var5.field8429 + var21 & 0x3);
                if (class286.method1827(var24, var25, (byte) -42)) {
                    var5.field8417++;
                }
                if (class701.field9775 == arg0) {
                    class341.field4946 = var5.field8429;
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 543)
    public final void method893(byte arg0) {
        field1681++;
        while (true) {
            class187 var2 = (class187) this.field1682.method1624(57);
            if (var2 == null) {
                if (arg0 >= -31) {
                    method890(-26, -122L, (byte) 35, -57);
                    return;
                } else {
                    return;
                }
            }
            var2.method385((byte) -120);
            class387.method2494(2780, var2);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V", line = 570)
    public static final void method894(int arg0, int arg1, int arg2) {
        field1683++;
        if (class245.method1632(816183856, arg0) && arg2 == 8558) {
            class555.method3239(class86.field1229[arg0], -88, arg1);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V", line = 590)
    public static void method895(byte arg0) {
        if (arg0 == -14) {
            field1688 = null;
        }
    }
}
