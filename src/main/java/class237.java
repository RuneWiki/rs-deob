import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class237 extends class212 {

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public int field4043 = 5;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public int field4044 = 2;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public int field4045 = -1;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public int field4060 = -1;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public int field4059 = -1;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "Z")
    private boolean field4057 = false;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public int field4064 = -1;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public int field4050 = 99;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "Z")
    public boolean field4061 = false;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public int field4063 = -1;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "[I")
    public static int[] field4056 = new int[50];

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Lqe;")
    private static class168 field4066 = class66.method448(" ", -109);

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Lqe;")
    public static class168 field4052 = field4066;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4048 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "[I")
    private int[] field4047;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "[I")
    private int[] field4055;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "[I")
    public int[] field4065;

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "[I")
    public int[] field4069;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "[[I")
    public int[][] field4054;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLnh;)V")
    public final void method1537(boolean arg0, class112 arg1) {
        field4068++;
        while (true) {
            int var3 = arg1.method758(arg0);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    this.method1541(null, -88, 12);
                    return;
                }
            }
            this.method1538(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILnh;Z)V")
    private final void method1538(int arg0, class112 arg1, boolean arg2) {
        if (arg2) {
            this.field4044 = 12;
        }
        if (arg0 == 1) {
            int var4 = arg1.method731(false);
            this.field4069 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4069[var5] = arg1.method731(false);
            }
            this.field4065 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4065[var6] = arg1.method731(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4065[var7] += arg1.method731(false) << 16;
            }
        } else if (arg0 == 2) {
            this.field4060 = arg1.method731(arg2);
        } else if (arg0 == 3) {
            int var15 = arg1.method758(true);
            this.field4055 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field4055[var16] = arg1.method758(true);
            }
            this.field4055[var15] = 9999999;
        } else if (arg0 == 4) {
            this.field4061 = true;
        } else if (arg0 == 5) {
            this.field4043 = arg1.method758(!arg2);
        } else if (arg0 == 6) {
            this.field4059 = arg1.method731(false);
        } else if (arg0 == 7) {
            this.field4064 = arg1.method731(false);
        } else if (arg0 == 8) {
            this.field4050 = arg1.method758(true);
        } else if (arg0 == 9) {
            this.field4063 = arg1.method758(true);
        } else if (arg0 == 10) {
            this.field4045 = arg1.method758(true);
        } else if (arg0 == 11) {
            this.field4044 = arg1.method758(true);
        } else if (arg0 == 12) {
            int var8 = arg1.method758(!arg2);
            this.field4047 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4047[var9] = arg1.method731(false);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4047[var10] = (arg1.method731(false) << 16) + this.field4047[var10];
            }
        } else if (arg0 == 13) {
            int var11 = arg1.method731(false);
            this.field4054 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg1.method758(true);
                if (var13 > 0) {
                    this.field4054[var12] = new int[var13];
                    this.field4054[var12][0] = arg1.method727(-27619);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field4054[var12][var14] = arg1.method731(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4057 = true;
        }
        field4071++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lqc;BI)Lqc;")
    public final class188 method1539(class188 arg0, byte arg1, int arg2) {
        field4072++;
        int var4 = this.field4065[arg2];
        class79 var5 = class60.method410((byte) -32, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method253(true, true);
        }
        class188 var7 = arg0.method253(!var5.method526(var6, (byte) -54), !this.field4057);
        var7.method254(var5, var6, this.field4057);
        if (arg1 >= -18) {
            this.method1540(null, 38, -107, 25, null);
        }
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lqc;IIILc;)Lqc;")
    public final class188 method1540(class188 arg0, int arg1, int arg2, int arg3, class237 arg4) {
        field4049++;
        int var6 = this.field4065[arg2];
        class79 var7 = class60.method410((byte) -110, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1539(arg0, (byte) -104, arg1);
        }
        int var9 = arg4.field4065[arg1];
        class79 var10 = class60.method410((byte) -101, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class188 var12 = arg0.method253(!var7.method526(var8, (byte) -71), !this.field4057);
            var12.method254(var7, var8, this.field4057);
            return var12;
        } else {
            class188 var13 = arg0.method253(!var7.method526(var8, (byte) -55) & !var10.method526(var11, (byte) -79), !this.field4057 & !arg4.field4057);
            var13.method238(var7, var8, var10, var11, this.field4055, this.field4057 | arg4.field4057);
            return arg3 == -1 ? var13 : null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lqc;II)Lqc;")
    public final class188 method1541(class188 arg0, int arg1, int arg2) {
        int var4 = this.field4065[arg1];
        class79 var5 = class60.method410((byte) -91, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field4042++;
        if (var5 == null) {
            return arg0.method253(true, true);
        }
        if (arg2 != -28226) {
            field4056 = null;
        }
        int var7 = 0;
        class79 var8 = null;
        if (this.field4047 != null && arg1 < this.field4047.length) {
            int var9 = this.field4047[arg1];
            var8 = class60.method410((byte) -99, var9 >> 16);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class188 var11 = arg0.method253(!var5.method526(var6, (byte) -26), !this.field4057);
            var11.method254(var5, var6, this.field4057);
            return var11;
        } else {
            class188 var10 = arg0.method253(!var5.method526(var6, (byte) -115) & !var8.method526(var7, (byte) -60), !this.field4057);
            var10.method254(var5, var6, this.field4057);
            var10.method254(var8, var7, this.field4057);
            return var10;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)Z")
    public static final boolean method1542(byte arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        field4062++;
        if (arg0 == 122) {
            class70 var3 = class190.method1232(arg2, 13090);
            return var3.method481(true, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1543(int arg0, Component arg1) {
        arg1.removeMouseListener(class62.field845);
        if (arg0 != 8) {
            field4056 = null;
        }
        field4070++;
        arg1.removeMouseMotionListener(class62.field845);
        arg1.removeFocusListener(class62.field845);
        class145.field2535 = 0;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        field4056 = null;
        if (arg0 != 42) {
            field4048 = null;
        }
        field4052 = null;
        field4048 = null;
        field4066 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILqc;I)Lqc;")
    public final class188 method1545(int arg0, class188 arg1, int arg2) {
        field4067++;
        int var4 = this.field4065[arg2];
        class79 var5 = class60.method410((byte) -47, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method251(true, true);
        }
        class188 var7 = arg1.method251(!var5.method526(var6, (byte) -118), !this.field4057);
        var7.method254(var5, var6, this.field4057);
        if (arg0 != -633) {
            this.field4061 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILqc;II)Lqc;")
    public final class188 method1546(int arg0, class188 arg1, int arg2, int arg3) {
        field4051++;
        int var5 = this.field4065[arg2];
        if (arg0 != -10) {
            return null;
        }
        class79 var6 = class60.method410((byte) -34, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method253(true, true);
        }
        int var8 = arg3 & 0x3;
        class188 var9 = arg1.method253(!var6.method526(var7, (byte) -105), !this.field4057);
        if (var8 == 1) {
            var9.method229();
        } else if (var8 == 2) {
            var9.method241();
        } else if (var8 == 3) {
            var9.method235();
        }
        var9.method254(var6, var7, this.field4057);
        if (var8 == 1) {
            var9.method235();
        } else if (var8 == 2) {
            var9.method241();
        } else if (var8 == 3) {
            var9.method229();
        }
        return var9;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
    public final void method1547(boolean arg0) {
        if (this.field4063 == -1) {
            if (this.field4055 == null) {
                this.field4063 = 0;
            } else {
                this.field4063 = 2;
            }
        }
        if (arg0) {
            this.field4060 = 66;
        }
        if (this.field4045 == -1) {
            if (this.field4055 == null) {
                this.field4045 = 0;
            } else {
                this.field4045 = 2;
            }
        }
        field4058++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILqc;BIII)Lqc;")
    public static final class188 method1548(int arg0, int arg1, class188 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4046++;
        long var7 = (long) arg5;
        class188 var9 = (class188) class116.field1892.method10(-22553, var7);
        if (var9 == null) {
            class218 var10 = class218.method1446(class166.field2827, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1434(64, 768, -50, -10, -50);
            class116.field1892.method11(var9, var7, 25);
        }
        int var11 = arg2.method230();
        if (arg3 <= 11) {
            return null;
        }
        int var12 = arg2.method244();
        int var13 = arg2.method255();
        int var14 = arg2.method225();
        class188 var15 = var9.method251(true, true);
        if (arg6 != 0) {
            var15.method228(arg6);
        }
        class37 var16 = (class37) var15;
        if (class236.method1535(arg1 + var11, class196.field3401, arg0 + var13, 0) != arg4 || class236.method1535(arg1 + var12, class196.field3401, arg0 + var14, 0) != arg4) {
            for (int var17 = 0; var17 < var16.field470; var17++) {
                var16.field479[var17] += class236.method1535(var16.field491[var17] + arg1, class196.field3401, var16.field488[var17] + arg0, 0) - arg4;
            }
            var16.field469 = false;
        }
        return var15;
    }
}
