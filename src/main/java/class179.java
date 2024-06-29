import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class179 {

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    private int field2663 = 32;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "J")
    private long field2651 = class231.method1594(-20375);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[Lcm;")
    private class319[] field2669 = new class319[8];

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    private int field2672 = 0;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    private int field2674 = 0;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Z")
    private boolean field2676 = true;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "J")
    private long field2670 = 0L;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "J")
    private long field2671 = 0L;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    private int field2675 = 0;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    private int field2680 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "[Lcm;")
    private class319[] field2681 = new class319[8];

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Z")
    public static boolean field2656 = false;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Z")
    public static boolean field2652 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[[[B")
    public static byte[][][] field2645 = new byte[4][104][104];

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2657 = "M";

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Laj;")
    public static class129 field2649;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lcm;")
    private class319 field2647;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[I")
    public int[] field2659;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 5)
    public void method239(int arg0) throws Exception {
        field2668++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class109.method759(arg5, false);
        int var7 = arg0;
        int var8 = arg5 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg5;
        int var10 = arg5;
        field2665++;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg6 - var8;
        int[] var16 = class40.field488[arg4];
        class315.method2160(var16, arg1, var15, arg6 - arg5, arg0 ^ 0x7);
        int var17 = arg6 + var8;
        class315.method2160(var16, arg2, var17, var15, 7);
        class315.method2160(var16, arg1, arg5 + arg6, var17, 7);
        while (var10 > var7) {
            var14 += 2;
            var13 += 2;
            var9 += var14;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class278.field4227[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var8 <= var10) {
                    int[] var18 = class40.field488[arg4 + var10];
                    int[] var19 = class40.field488[arg4 - var10];
                    int var20 = arg6 + var7;
                    int var21 = arg6 - var7;
                    class315.method2160(var18, arg1, var20, var21, 7);
                    class315.method2160(var19, arg1, var20, var21, 7);
                } else {
                    int[] var22 = class40.field488[arg4 + var10];
                    int var23 = arg6 + var7;
                    int[] var24 = class40.field488[arg4 - var10];
                    int var25 = class278.field4227[var10];
                    int var26 = arg6 - var7;
                    int var27 = arg6 + var25;
                    int var28 = arg6 - var25;
                    class315.method2160(var22, arg1, var28, var26, 7);
                    class315.method2160(var22, arg2, var27, var28, arg0 ^ 0x7);
                    class315.method2160(var22, arg1, var23, var27, 7);
                    class315.method2160(var24, arg1, var28, var26, 7);
                    class315.method2160(var24, arg2, var27, var28, arg0 + 7);
                    class315.method2160(var24, arg1, var23, var27, 7);
                }
            }
            int[] var29 = class40.field488[arg4 + var7];
            int[] var30 = class40.field488[arg4 - var7];
            int var31 = arg6 + var10;
            int var32 = arg6 - var10;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class278.field4227[var7];
                int var34 = arg6 + var33;
                int var35 = arg6 - var33;
                class315.method2160(var29, arg1, var35, var32, 7);
                class315.method2160(var29, arg2, var34, var35, 7);
                class315.method2160(var29, arg1, var31, var34, 7);
                class315.method2160(var30, arg1, var35, var32, 7);
                class315.method2160(var30, arg2, var34, var35, arg0 ^ 0x7);
                class315.method2160(var30, arg1, var31, var34, arg0 ^ 0x7);
            } else {
                class315.method2160(var29, arg1, var31, var32, 7);
                class315.method2160(var30, arg1, var31, var32, 7);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lbn;", line = 145)
    public static final class187 method1235(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null || var3.field3364 == null ? null : var3.field3364;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 156)
    public void method245(Component arg0) throws Exception {
        field2664++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([II)V", line = 164)
    private final void method1236(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class242.field3627) {
            var3 = arg1 << 1;
        }
        class85.method588(arg0, 0, var3);
        this.field2675 -= arg1;
        if (this.field2647 != null && this.field2675 <= 0) {
            this.field2675 += class248.field3696 >> 4;
            class311.method2150(this.field2647, (byte) 96);
            this.method1242(this.field2647, this.field2647.method1504(), 116);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class319 var10 = null;
                        class319 var11 = this.field2681[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class62 var12 = var11.field4810;
                                if (var12 == null || var12.field826 <= var8) {
                                    var11.field4809 = true;
                                    int var13 = var11.method1540();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field826 += var13;
                                    }
                                    if (var4 >= this.field2663) {
                                        break label105;
                                    }
                                    class319 var14 = var11.method1521();
                                    if (var14 != null) {
                                        int var15 = var11.field4812;
                                        while (var14 != null) {
                                            this.method1242(var14, var15 * var14.method1504() >> 8, 119);
                                            var14 = var11.method1543();
                                        }
                                    }
                                    class319 var16 = var11.field4811;
                                    var11.field4811 = null;
                                    if (var10 == null) {
                                        this.field2681[var7] = var16;
                                    } else {
                                        var10.field4811 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2669[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4811;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class319 var18 = this.field2681[var17];
                this.field2681[var17] = this.field2669[var17] = null;
                while (var18 != null) {
                    class319 var19 = var18.field4811;
                    var18.field4811 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2675 < 0) {
            this.field2675 = 0;
        }
        if (this.field2647 != null) {
            this.field2647.method1502(arg0, 0, arg1);
        }
        this.field2651 = class231.method1594(-20375);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 327)
    public void method241() throws Exception {
        field2666++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)J", line = 334)
    public static final long method1237(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null || var3.field3370 == null ? 0L : var3.field3370.field2448;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 345)
    public final synchronized void method1238(int arg0) {
        if (class307.field4685 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class307.field4685.field3713[var3] == this) {
                    class307.field4685.field3713[var3] = null;
                }
                if (class307.field4685.field3713[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class307.field4685.field3717 = true;
                while (class307.field4685.field3716) {
                    class93.method662(-553, 50L);
                }
                class307.field4685 = null;
            }
        }
        this.method243();
        if (arg0 != 2) {
            this.method1241((byte) -122);
        }
        this.field2659 = null;
        field2654++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lhc;", line = 394)
    public static final class56 method1239(int arg0, int arg1) {
        field2655++;
        class56 var2 = (class56) class316.field4772.method2180((long) arg1, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class164.field2484.method1441(arg1, (byte) -44, arg0);
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method372(new class263(var3), 64);
        }
        class316.field4772.method2175((long) arg1, var4, -80);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 416)
    public final synchronized void method1240(boolean arg0) {
        field2662++;
        if (this.field2659 == null) {
            return;
        }
        long var2 = class231.method1594(-20375);
        try {
            if (this.field2671 != 0L) {
                if (var2 < this.field2671) {
                    return;
                }
                this.method239(this.field2677);
                this.field2671 = 0L;
                this.field2676 = true;
            }
            int var4 = this.method242();
            if ((this.field2680 - var4) > this.field2674) {
                this.field2674 = this.field2680 - var4;
            }
            int var5 = this.field2679 + this.field2678;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2677) {
                var4 = 0;
                this.field2677 += 1024;
                if (this.field2677 > 16384) {
                    this.field2677 = 16384;
                }
                this.method243();
                this.method239(this.field2677);
                this.field2676 = true;
                if (var5 + 256 > this.field2677) {
                    var5 = this.field2677 - 256;
                    this.field2679 = var5 - this.field2678;
                }
            }
            while (var5 > var4) {
                this.method1236(this.field2659, 256);
                var4 += 256;
                this.method244();
            }
            if (var2 > this.field2670) {
                if (this.field2676) {
                    this.field2676 = false;
                } else if (this.field2674 == 0 && this.field2672 == 0) {
                    this.method243();
                    this.field2671 = var2 + 2000L;
                    return;
                } else {
                    this.field2679 = Math.min(this.field2672, this.field2674);
                    this.field2672 = this.field2674;
                }
                this.field2674 = 0;
                this.field2670 = var2 + 2000L;
            }
            this.field2680 = var4;
            if (!arg0) {
                this.field2651 = 107L;
            }
        } catch (Exception var9) {
            this.method243();
            this.field2671 = var2 + 2000L;
        }
        try {
            if (this.field2651 + 500000L < var2) {
                var2 = this.field2651;
            }
            while (this.field2651 + 5000L < var2) {
                this.method1246(256, 114);
                this.field2651 += (long) (256000 / class248.field3696);
            }
        } catch (Exception var8) {
            this.field2651 = var2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 532)
    public final void method1241(byte arg0) {
        if (arg0 > -82) {
            this.field2669 = (class319[]) null;
        }
        this.field2676 = true;
        field2648++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lcm;II)V", line = 546)
    private final void method1242(class319 arg0, int arg1, int arg2) {
        int var4 = arg1 >> 5;
        class319 var5 = this.field2669[var4];
        field2650++;
        if (arg2 <= 96) {
            return;
        }
        if (var5 == null) {
            this.field2681[var4] = arg0;
        } else {
            var5.field4811 = arg0;
        }
        this.field2669[var4] = arg0;
        arg0.field4812 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 570)
    public void method243() {
        field2660++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I", line = 579)
    public int method242() throws Exception {
        field2646++;
        return this.field2677;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 591)
    public static void method1243(byte arg0) {
        field2649 = null;
        if (arg0 < 117) {
            method1234(110, 17, 84, 94, 117, -85, 16);
        }
        field2645 = (byte[][][]) null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()V", line = 603)
    public void method244() throws Exception {
        field2673++;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 611)
    public final synchronized void method1244(int arg0) {
        this.field2676 = true;
        field2667++;
        try {
            if (arg0 != -3155) {
                this.field2647 = (class319) null;
            }
            this.method241();
        } catch (Exception var3) {
            this.method243();
            this.field2671 = class231.method1594(arg0 - 17220) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lcm;I)V", line = 637)
    public final synchronized void method1245(class319 arg0, int arg1) {
        field2653++;
        if (arg1 != -6683) {
            this.method243();
        }
        this.field2647 = arg0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V", line = 658)
    private final void method1246(int arg0, int arg1) {
        field2658++;
        this.field2675 -= arg0;
        if (this.field2675 < 0) {
            this.field2675 = 0;
        }
        if (arg1 < 75) {
            this.field2679 = -90;
        }
        if (this.field2647 != null) {
            this.field2647.method1532(arg0);
        }
    }
}
