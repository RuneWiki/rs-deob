import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class648 extends class656 {

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    private int field8599;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "Z")
    private boolean field8611;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field8606;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    private int field8607;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    private int field8617;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    private int field8594;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    private int field8614;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    private int field8612;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    private int field8608;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Z")
    private boolean field8600;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    private int field8597;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    private int field8605;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field8595;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public int field8620;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field8613;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
    private String field8602;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Ljava/lang/String;")
    private String field8615;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Ljava/lang/String;")
    private String field8610;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Ljava/lang/String;")
    private String field8603;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Lhda;")
    public static class752 field8616 = new class752(92, 5);

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "[I")
    public static int[] field8618 = new int[3];

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field8619 = 2;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    private int field8593;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private int field8604;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(FI)F")
    public static final float method3542(float arg0, int arg1) {
        int var2 = -22 / ((8 - arg1) / 33);
        field8598++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lee;I)V")
    public final void method3543(class677 arg0, int arg1) {
        arg0.method3823(-50, 5);
        field8596++;
        arg0.method3823(-111, this.field8599);
        arg0.method3823(-127, this.field8611 ? 1 : 0);
        arg0.method3823(-98, this.field8606);
        arg0.method3823(-113, this.field8607);
        arg0.method3823(-38, this.field8617);
        arg0.method3823(-124, this.field8594);
        arg0.method3823(-73, this.field8608);
        arg0.method3823(-113, this.field8600 ? 1 : 0);
        arg0.method3831(1182, this.field8612);
        arg0.method3823(-118, this.field8614);
        arg0.method3797((byte) -56, this.field8620);
        arg0.method3831(1182, this.field8605);
        arg0.method3823(-61, this.field8595);
        arg0.method3823(-108, this.field8597);
        arg0.method3823(-55, this.field8613);
        arg0.method3832(true, this.field8602);
        arg0.method3832(true, this.field8603);
        arg0.method3832(true, this.field8615);
        arg0.method3832(true, this.field8610);
        arg0.method3823(-105, this.field8593);
        if (arg1 >= -46) {
            method3546(-32);
        }
        arg0.method3831(1182, this.field8604);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    private final void method3544(int arg0) {
        if (this.field8602.length() > 40) {
            this.field8602 = this.field8602.substring(0, 40);
        }
        field8609++;
        if (this.field8603.length() > 40) {
            this.field8603 = this.field8603.substring(0, 40);
        }
        if (this.field8615.length() > 10) {
            this.field8615 = this.field8615.substring(0, 10);
        }
        if (this.field8610.length() > 10) {
            this.field8610 = this.field8610.substring(0, 10);
        }
        if (arg0 != 0) {
            this.method3545(98);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
    public final int method3545(int arg0) {
        field8601++;
        byte var2 = 23;
        int var3 = var2 + class15.method111(2, this.field8602);
        if (arg0 < 71) {
            method3546(-118);
        }
        int var4 = var3 + class15.method111(2, this.field8603);
        int var5 = var4 + class15.method111(2, this.field8615);
        return var5 + class15.method111(2, this.field8610);
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public static void method3546(int arg0) {
        field8618 = null;
        if (arg0 != 3) {
            field8618 = null;
        }
        field8616 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class592.method3220((byte) 0, arg1);
        field8592++;
        int var7 = 0;
        int var8 = arg1 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg3 != 2) {
            return;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class380.field5289 <= arg2 && class431.field5944 >= arg2) {
            int[] var14 = class690.field9616[arg2];
            int var15 = class10.method99(class209.field3090, arg3 + 62, class261.field3632, arg5 - arg1);
            int var16 = class10.method99(class209.field3090, arg3 + 65, class261.field3632, arg5 + arg1);
            int var17 = class10.method99(class209.field3090, arg3 + 35, class261.field3632, arg5 - var8);
            int var18 = class10.method99(class209.field3090, arg3 ^ 0x5B, class261.field3632, arg5 + var8);
            class717.method4012(arg0, -123, var15, var14, var17);
            class717.method4012(arg6, -79, var17, var14, var18);
            class717.method4012(arg0, -60, var18, var14, var16);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class480.field6584[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class380.field5289 && class431.field5944 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class10.method99(class209.field3090, 20, class261.field3632, arg5 + var7);
                        int var23 = class10.method99(class209.field3090, arg3 ^ 0x64, class261.field3632, arg5 - var7);
                        if (class431.field5944 >= var21) {
                            class717.method4012(arg0, -83, var23, class690.field9616[var21], var22);
                        }
                        if (var20 >= class380.field5289) {
                            class717.method4012(arg0, arg3 - 86, var23, class690.field9616[var20], var22);
                        }
                    } else {
                        int var24 = class480.field6584[var9];
                        int var25 = class10.method99(class209.field3090, 78, class261.field3632, arg5 + var7);
                        int var26 = class10.method99(class209.field3090, 58, class261.field3632, arg5 - var7);
                        int var27 = class10.method99(class209.field3090, 64, class261.field3632, arg5 + var24);
                        int var28 = class10.method99(class209.field3090, 33, class261.field3632, arg5 - var24);
                        if (var21 <= class431.field5944) {
                            int[] var29 = class690.field9616[var21];
                            class717.method4012(arg0, arg3 - 53, var26, var29, var28);
                            class717.method4012(arg6, -56, var28, var29, var27);
                            class717.method4012(arg0, arg3 ^ 0xFFFFFFB5, var27, var29, var25);
                        }
                        if (var20 >= class380.field5289) {
                            int[] var30 = class690.field9616[var20];
                            class717.method4012(arg0, -110, var26, var30, var28);
                            class717.method4012(arg6, arg3 ^ 0xFFFFFF9F, var28, var30, var27);
                            class717.method4012(arg0, arg3 ^ 0xFFFFFFB8, var27, var30, var25);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class380.field5289 && class431.field5944 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (var33 >= class261.field3632 && class209.field3090 >= var34) {
                    int var35 = class10.method99(class209.field3090, arg3 ^ 0xF, class261.field3632, var33);
                    int var36 = class10.method99(class209.field3090, 111, class261.field3632, var34);
                    if (var8 <= var7) {
                        if (var32 <= class431.field5944) {
                            class717.method4012(arg0, -104, var36, class690.field9616[var32], var35);
                        }
                        if (var31 >= class380.field5289) {
                            class717.method4012(arg0, arg3 ^ 0xFFFFFFAE, var36, class690.field9616[var31], var35);
                        }
                    } else {
                        int var37 = var11 < var7 ? class480.field6584[var7] : var11;
                        int var38 = class10.method99(class209.field3090, arg3 + 12, class261.field3632, arg5 + var37);
                        int var39 = class10.method99(class209.field3090, arg3 + 8, class261.field3632, arg5 - var37);
                        if (var32 <= class431.field5944) {
                            int[] var40 = class690.field9616[var32];
                            class717.method4012(arg0, -64, var36, var40, var39);
                            class717.method4012(arg6, arg3 - 98, var39, var40, var38);
                            class717.method4012(arg0, -108, var38, var40, var35);
                        }
                        if (var31 >= class380.field5289) {
                            int[] var41 = class690.field9616[var31];
                            class717.method4012(arg0, -118, var36, var41, var39);
                            class717.method4012(arg6, -113, var39, var41, var38);
                            class717.method4012(arg0, -122, var38, var41, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class648() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ZLkk;)V")
    public class648(boolean arg0, class192 arg1) {
        if (arg0) {
            if (class192.field2897.startsWith("win")) {
                this.field8599 = 1;
            } else if (class192.field2897.startsWith("mac")) {
                this.field8599 = 2;
            } else if (class192.field2897.startsWith("linux")) {
                this.field8599 = 3;
            } else {
                this.field8599 = 4;
            }
            if (class192.field2881.startsWith("amd64") || class192.field2881.startsWith("x86_64")) {
                this.field8611 = true;
            } else {
                this.field8611 = false;
            }
            if (this.field8599 == 1) {
                if (class192.field2898.indexOf("4.0") != -1) {
                    this.field8606 = 1;
                } else if (class192.field2898.indexOf("4.1") != -1) {
                    this.field8606 = 2;
                } else if (class192.field2898.indexOf("4.9") != -1) {
                    this.field8606 = 3;
                } else if (class192.field2898.indexOf("5.0") != -1) {
                    this.field8606 = 4;
                } else if (class192.field2898.indexOf("5.1") != -1) {
                    this.field8606 = 5;
                } else if (class192.field2898.indexOf("6.0") != -1) {
                    this.field8606 = 6;
                } else if (class192.field2898.indexOf("6.1") != -1) {
                    this.field8606 = 7;
                }
            } else if (this.field8599 == 2) {
                if (class192.field2898.indexOf("10.4") != -1) {
                    this.field8606 = 20;
                } else if (class192.field2898.indexOf("10.5") != -1) {
                    this.field8606 = 21;
                } else if (class192.field2898.indexOf("10.6") != -1) {
                    this.field8606 = 22;
                }
            }
            if (class192.field2899.toLowerCase().indexOf("sun") != -1) {
                this.field8607 = 1;
            } else if (class192.field2899.toLowerCase().indexOf("microsoft") != -1) {
                this.field8607 = 2;
            } else if (class192.field2899.toLowerCase().indexOf("apple") == -1) {
                this.field8607 = 4;
            } else {
                this.field8607 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class192.field2879.length() > var3) {
                    char var5 = class192.field2879.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
            } catch (Exception var16) {
            }
            this.field8617 = var4;
            int var6 = class192.field2879.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class192.field2879.length() > var6) {
                    char var8 = class192.field2879.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + var8 - 48;
                }
            } catch (Exception var15) {
            }
            this.field8594 = var7;
            int var9 = 0;
            int var10 = class192.field2879.indexOf(95, 4) + 1;
            try {
                while (class192.field2879.length() > var10) {
                    char var11 = class192.field2879.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var14) {
            }
            if (this.field8617 > 3) {
                this.field8614 = class692.field9641;
            } else {
                this.field8614 = 0;
            }
            this.field8612 = class365.field5128;
            this.field8608 = var9;
            if (arg1.field2892) {
                this.field8600 = false;
            } else {
                this.field8600 = true;
            }
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field8597 = var12[4];
                    this.field8605 = var12[2];
                    this.field8595 = var12[3];
                    this.field8620 = var12[6];
                    this.field8613 = var12[5];
                }
            } catch (Throwable var13) {
                this.field8620 = 0;
            }
        }
        if (this.field8602 == null) {
            this.field8602 = "";
        }
        if (this.field8615 == null) {
            this.field8615 = "";
        }
        if (this.field8610 == null) {
            this.field8610 = "";
        }
        if (this.field8603 == null) {
            this.field8603 = "";
        }
        this.method3544(0);
    }
}
