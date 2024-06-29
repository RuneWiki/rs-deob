import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class220 extends class393 {

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "Z")
    public boolean field3131;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "[Lak;")
    public class220[] field3139;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Z")
    public static volatile boolean field3134 = false;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
    public static int[] field3117 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Lwe;")
    public static class24 field3136 = new class24(64);

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3141 = " has logged out.";

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "Lga;")
    public class278 field3135;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lug;")
    public class325 field3125;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
    public int method1362(int arg0) {
        field3137++;
        return arg0 == -3 ? -1 : -51;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLil;)V")
    public void method2(int arg0, byte arg1, class265 arg2) {
        field3115++;
        if (arg1 != -49) {
            this.method43(-38, 16);
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
    public int method1363(byte arg0) {
        field3122++;
        return arg0 < 96 ? -75 : -1;
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
    public static final void method1364(byte arg0) {
        field3120++;
        if (class106.field1428 != null) {
            return;
        }
        int var1 = class367.field5459;
        int var2 = class7.field68;
        if (arg0 != 106) {
            field3141 = null;
        }
        int var3 = class100.field1338 - class345.field5120 - var1;
        int var4 = class384.field5739 - class274.field4034 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class238.field3346 == null) {
                var5 = class361.field5285.field29;
            } else {
                var5 = class238.field3346;
            }
            int var6 = 0;
            int var7 = 0;
            if (class238.field3346 == var5) {
                Insets var8 = class238.field3346.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class384.field5739);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class100.field1338, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class100.field1338 + var6 - var3, var7, var3, class384.field5739);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class384.field5739 + var7 - var4, class100.field1338, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
    public static final void method1365(int arg0, boolean arg1) {
        class174.field2272++;
        class232.field3279.method756(arg0, 91);
        field3138++;
        for (class158 var2 = (class158) class269.field3933.method953(0); var2 != null; var2 = (class158) class269.field3933.method951(0)) {
            if (!var2.method2571(true)) {
                var2 = (class158) class269.field3933.method953(arg0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2074 == 0) {
                class318.method1975(true, arg0 ^ 0x6461, var2, arg1);
            }
        }
        if (class371.field5518 != null) {
            class392.method2564(-89, class371.field5518);
            class371.field5518 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)[I")
    public final int[] method1366(int arg0, byte arg1, int arg2) {
        if (arg1 == -40) {
            field3130++;
            return this.field3139[arg0].field3131 ? this.field3139[arg0].method43(arg1 - 11503, arg2) : this.field3139[arg0].method1(arg2, 0)[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public void method1367(int arg0) {
        if (arg0 != 15) {
            method1374((class238) null, 112);
        }
        field3118++;
        if (this.field3131) {
            this.field3125.method2007((byte) -112);
            this.field3125 = null;
        } else {
            this.field3135.method1779(0);
            this.field3135 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
    public void method1368(int arg0, int arg1, int arg2) {
        field3126++;
        int var4 = -46 % ((-arg0 - 29) / 63);
        int var5 = this.field3128 == 255 ? arg1 : this.field3128;
        if (this.field3131) {
            this.field3125 = new class325(var5, arg1, arg2);
        } else {
            this.field3135 = new class278(var5, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)[[I")
    public int[][] method1(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3139 = null;
        }
        field3121++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IBI)[[I")
    public final int[][] method1369(int arg0, byte arg1, int arg2) {
        if (arg1 < 114) {
            field3141 = null;
        }
        field3140++;
        if (this.field3139[arg0].field3131) {
            int[] var4 = this.field3139[arg0].method43(-11543, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3139[arg0].method1(arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        field3117 = null;
        field3136 = null;
        field3141 = null;
        if (arg0 > -71) {
            field3134 = false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLro;)Lro;")
    public static final class249 method1371(byte arg0, class249 arg1) {
        int var2 = -39 / ((-arg0 - 68) / 52);
        field3123++;
        class249 var3 = client.method1556(arg1);
        if (var3 == null) {
            var3 = arg1.field3512;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)[I")
    public int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            field3117 = null;
        }
        field3129++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lnr;I)V")
    public static final void method1372(class437 arg0, int arg1) {
        field3116++;
        if (class10.field97 < 2 && class394.field5921 == 0 && !class95.field1307 || arg1 != -25084) {
            return;
        }
        String var2;
        if (class394.field5921 == 1 && class10.field97 < 2) {
            var2 = class238.field3341 + class306.field4377 + class66.field939 + " ->";
        } else if (class95.field1307 && class10.field97 < 2) {
            var2 = class191.field2667 + class306.field4377 + class333.field4927 + " ->";
        } else if (class91.field1254 && class1.field5[81] && class10.field97 > 2) {
            var2 = client.method1570(-47, (class259) class373.field5574.field6108.field5898.field5898);
        } else {
            class259 var3 = (class259) class373.field5574.field6108.field5898;
            var2 = client.method1570(arg1 + 24968, var3);
            int[] var4 = null;
            if (class425.method2728((byte) 111, var3.field3777)) {
                var4 = class166.method1031((int) var3.field3772, false).field2724;
            } else if (class60.method404((byte) 45, var3.field3777)) {
                class129 var5 = class23.field408[(int) var3.field3772];
                if (var5 != null) {
                    var4 = var5.field1714.field5616;
                }
            } else if (class433.method2747(var3.field3777, (byte) -104)) {
                if (var3.field3777 == 1009) {
                    var4 = class165.method1020((int) var3.field3772, 124).field6001;
                } else {
                    var4 = class165.method1020((int) (var3.field3772 >>> 32 & 0x7FFFFFFFL), 114).field6001;
                }
            }
            if (var4 != null) {
                var2 = var2 + class88.method544(arg1 ^ 0xFFFF9E73, var4);
            }
        }
        if (class10.field97 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class10.field97 - 2) + class319.field4566;
        }
        if (class168.field2209 != null) {
            class213 var7 = class168.field2209.method1548(false, arg0);
            if (var7 == null) {
                var7 = class232.field3275;
            }
            var7.method1320(class168.field2209.field3604, class168.field2209.field3464, class405.field6087, class168.field2209.field3578, var2, class261.field3792, class432.field6375, class228.field3227, 31, class168.field2209.field3479, class168.field2209.field3492, class320.field4576, class168.field2209.field3634, class42.field653, class417.field6208);
            class271.method1739(class228.field3227[0], class228.field3227[3], class228.field3227[1], class228.field3227[2], -93);
        } else if (class123.field1646 != null && class126.field1679 == 0) {
            int var6 = class232.field3275.method1329(class432.field6375, 16777215, true, class320.field4576, class300.field4315 + 4, class417.field6208, 0, class77.field1056 + 16, var2, class42.field653);
            class271.method1739(class300.field4315 + 4, 16, class77.field1056, class272.field3986.method1029((byte) 117, var2) + var6, -126);
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(IBI)I")
    public static final int method1373(int arg0, byte arg1, int arg2) {
        field3133++;
        if (arg1 != -80) {
            field3141 = null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqj;I)V")
    public static final void method1374(class238 arg0, int arg1) {
        class30.field513 = arg0;
        field3124++;
        class30.field513.method1476(35, (byte) -72);
        if (arg1 != 6193) {
            method1370((byte) -115);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    public static final void method1375(byte arg0, int arg1) {
        field3119++;
        class256 var2 = class363.method2385(7, arg1, (byte) 1);
        var2.method1611(-119);
        int var3 = -59 / ((arg0 - 32) / 54);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public void method440(int arg0) {
        if (arg0 != 0) {
            this.field3135 = null;
        }
        field3132++;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IZ)V")
    public class220(int arg0, boolean arg1) {
        this.field3131 = arg1;
        this.field3139 = new class220[arg0];
    }
}
