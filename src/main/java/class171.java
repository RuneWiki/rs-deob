import java.awt.Canvas;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class171 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[I")
    public static int[] field2541 = new int[200];

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    public static int[] field2544 = new int[64];

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Lhj;")
    public static class29 field2547 = new class29(32);

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2551 = "Select";

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2550 = "glow1:";

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2548;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 15)
    public static void method1251(int arg0) {
        field2544 = null;
        field2548 = null;
        field2541 = null;
        field2547 = null;
        field2550 = null;
        field2551 = null;
        if (arg0 != 128) {
            field2551 = (String) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lna;ILjava/awt/Component;II)Lcn;", line = 31)
    public static final class267 method1252(class26 arg0, int arg1, Component arg2, int arg3, int arg4) {
        field2546++;
        if (class41.field607 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class267 var5 = (class267) Class.forName("rj").getDeclaredConstructor().newInstance();
                var5.field4012 = arg4;
                var5.field3996 = new int[(class196.field3112 ? 2 : 1) * 256];
                var5.method127(arg2);
                var5.field4025 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field4025 > 16384) {
                    var5.field4025 = 16384;
                }
                var5.method126(var5.field4025);
                if (class135.field2102 > 0 && class15.field176 == null) {
                    class15.field176 = new class265();
                    class15.field176.field3956 = arg0;
                    arg0.method163(class135.field2102, (byte) -83, class15.field176);
                }
                if (class15.field176 != null) {
                    if (class15.field176.field3965[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class15.field176.field3965[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    if (arg1 >= -1) {
                        return (class267) null;
                    }
                    class131 var7 = new class131(arg0, arg3);
                    var7.field3996 = new int[(class196.field3112 ? 2 : 1) * 256];
                    var7.field4012 = arg4;
                    var7.method127(arg2);
                    var7.field4025 = 16384;
                    var7.method126(var7.field4025);
                    if (class135.field2102 > 0 && class15.field176 == null) {
                        class15.field176 = new class265();
                        class15.field176.field3956 = arg0;
                        arg0.method163(class135.field2102, (byte) -64, class15.field176);
                    }
                    if (class15.field176 != null) {
                        if (class15.field176.field3965[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class15.field176.field3965[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class267();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 131)
    public static final void method1253(boolean arg0) {
        field2545++;
        int var1 = class51.field791 * 128 + 64;
        int var2 = class53.field802 * 128 + 64;
        int var3 = class294.method2080(899, var2, var1, class50.field775) - class177.field2642;
        if (class243.field3654 >= 100) {
            class311.field4845 = class53.field802 * 128 + 64;
            class220.field3455 = class51.field791 * 128 + 64;
            class294.field4628 = class294.method2080(899, class311.field4845, class220.field3455, class50.field775) - class177.field2642;
        } else {
            if (class220.field3455 < var1) {
                class220.field3455 += (var1 - class220.field3455) * class243.field3654 / 1000 + class98.field1451;
                if (class220.field3455 > var1) {
                    class220.field3455 = var1;
                }
            }
            if (var1 < class220.field3455) {
                class220.field3455 -= (class220.field3455 - var1) * class243.field3654 / 1000 + class98.field1451;
                if (class220.field3455 < var1) {
                    class220.field3455 = var1;
                }
            }
            if (class294.field4628 < var3) {
                class294.field4628 += class98.field1451 + ((var3 - class294.field4628) * class243.field3654 / 1000);
                if (class294.field4628 > var3) {
                    class294.field4628 = var3;
                }
            }
            if (var3 < class294.field4628) {
                class294.field4628 -= class98.field1451 + ((class294.field4628 - var3) * class243.field3654 / 1000);
                if (var3 > class294.field4628) {
                    class294.field4628 = var3;
                }
            }
            if (var2 > class311.field4845) {
                class311.field4845 += class98.field1451 + ((var2 - class311.field4845) * class243.field3654 / 1000);
                if (class311.field4845 > var2) {
                    class311.field4845 = var2;
                }
            }
            if (var2 < class311.field4845) {
                class311.field4845 -= (class311.field4845 - var2) * class243.field3654 / 1000 + class98.field1451;
                if (class311.field4845 < var2) {
                    class311.field4845 = var2;
                }
            }
        }
        int var4 = class110.field1745 * 128 + 64;
        int var5 = class329.field5086 * 128 + 64;
        int var6 = class294.method2080(899, var5, var4, class50.field775) - class41.field614;
        int var7 = var5 - class311.field4845;
        int var8 = var6 - class294.field4628;
        int var9 = var4 - class220.field3455;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var13 = var12 - class203.field3227;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class89.field1299 < var11) {
            class89.field1299 += (var11 - class89.field1299) * class222.field3473 / 1000 + class253.field3772;
            if (var11 < class89.field1299) {
                class89.field1299 = var11;
            }
        }
        if (var11 < class89.field1299) {
            class89.field1299 -= (class89.field1299 - var11) * class222.field3473 / 1000 + class253.field3772;
            if (class89.field1299 < var11) {
                class89.field1299 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class203.field3227 += class222.field3473 * var13 / 1000 + class253.field3772;
            class203.field3227 &= 0x7FF;
        }
        if (var13 < 0) {
            class203.field3227 -= -var13 * class222.field3473 / 1000 + class253.field3772;
            class203.field3227 &= 0x7FF;
        }
        if (!arg0) {
            return;
        }
        int var14 = var12 - class203.field3227;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class203.field3227 = var12;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V", line = 288)
    public static final void method1254(boolean arg0) {
        field2542++;
        class23 var1 = class252.field3767;
        synchronized (class252.field3767) {
            class318.field4959++;
            class31.field400 = class262.field3882;
            class273.field4129 = class47.field722;
            class295.field4646 = class113.field1776;
            class292.field4593 = class111.field1752;
            class97.field1446 = class255.field3815;
            class38.field573 = class206.field3259;
            class155.field2337 = class149.field2250;
            class111.field1752 = 0;
        }
        if (arg0) {
            method1254(false);
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V", line = 315)
    public static final void method1255(int arg0) {
        field2543++;
        if (class144.field2219 == -1 || class268.field4038 == -1) {
            return;
        }
        int var1 = ((class174.field2576 - class227.field3518) * class76.field1070 >> 16) + class227.field3518;
        class76.field1070 += var1;
        if (class76.field1070 < 65535) {
            class43.field676 = false;
            class170.field2540 = false;
        } else {
            class76.field1070 = 65535;
            if (class43.field676) {
                class170.field2540 = false;
            } else {
                class170.field2540 = true;
            }
            class43.field676 = true;
        }
        float var2 = (float) class76.field1070 / 65535.0F;
        int var3 = class314.field4863 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class14.field155[class144.field2219][var3 + 1][var5] * 3;
            int var7 = (class14.field155[class144.field2219][var3 + 2][var5] + class14.field155[class144.field2219][var3 + 2][var5] - class14.field155[class144.field2219][var3 + 3][var5]) * 3;
            int var8 = class14.field155[class144.field2219][var3][var5] * 3;
            int var9 = class14.field155[class144.field2219][var3][var5];
            int var10 = var6 - var8;
            int var11 = class14.field155[class144.field2219][var3 + 2][var5] + var6 - var9 - var7;
            int var12 = var8 + var7 - (var6 * 2);
            var4[var5] = (((float) var11 * var2 + (float) var12) * var2 + (float) var10) * var2 + (float) var9;
        }
        class294.field4628 = (int) var4[1] * -1;
        class220.field3455 = (int) var4[0] - (class302.field4735 * 128);
        class311.field4845 = (int) var4[2] - (class110.field1744 * 128);
        int var13 = class210.field3306 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class14.field155[class268.field4038][var13][var15] * 3;
            int var17 = class14.field155[class268.field4038][var13 + 1][var15] * 3;
            int var18 = (class14.field155[class268.field4038][var13 + 2][var15] + class14.field155[class268.field4038][var13 + 2][var15] - class14.field155[class268.field4038][var13 + 3][var15]) * 3;
            int var19 = class14.field155[class268.field4038][var13][var15];
            int var20 = var16 + var18 - var17 * 2;
            int var21 = class14.field155[class268.field4038][var13 + 2][var15] + var17 - var18 - var19;
            int var22 = var17 - var16;
            var14[var15] = (((float) var21 * var2 + (float) var20) * var2 + (float) var22) * var2 + (float) var19;
        }
        float var23 = var14[0] - var4[0];
        float var24 = (var14[1] - var4[1]) * -1.0F;
        if (arg0 < 70) {
            method1255(34);
        }
        float var25 = var14[2] - var4[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class268.field4039 = (float) Math.atan2((double) var24, var26);
        class37.field541 = -((float) Math.atan2((double) var23, (double) var25));
        class203.field3227 = (int) ((double) class37.field541 * 325.949D) & 0x7FF;
        class89.field1299 = (int) ((double) class268.field4039 * 325.949D) & 0x7FF;
    }
}
