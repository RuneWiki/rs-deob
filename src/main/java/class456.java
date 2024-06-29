import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class456 extends class96 {

    @OriginalMember(owner = "client!ht", name = "M", descriptor = "Z")
    private boolean field6361 = true;

    @OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
    private int field6362 = 4096;

    @OriginalMember(owner = "client!ht", name = "Q", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!ht", name = "S", descriptor = "Z")
    public static boolean field6367;

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ht", name = "P", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
    public static int field6366;

    static {
        new class169("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field6365 = 100;
        field6367 = false;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ldn;B)I", line = 10)
    public static final int method2701(class201 arg0, byte arg1) {
        if (arg1 > -49) {
            return -126;
        } else {
            ++field6360;
            int var2 = 0;
            if (arg0.method1294(class520.field7688, (byte) -116)) {
                ++var2;
            }
            if (arg0.method1294(class337.field4301, (byte) -127)) {
                ++var2;
            }
            if (arg0.method1294(class482.field7015, (byte) -119)) {
                ++var2;
            }
            if (arg0.method1294(class522.field7747, (byte) -114)) {
                ++var2;
            }
            if (arg0.method1294(class52.field707, (byte) -120)) {
                ++var2;
            }
            if (arg0.method1294(class152.field2040, (byte) -127)) {
                ++var2;
            }
            if (arg0.method1294(class188.field2457, (byte) -121)) {
                ++var2;
            }
            if (arg0.method1294(class355.field4555, (byte) -113)) {
                ++var2;
            }
            if (arg0.method1294(class486.field7059, (byte) -114)) {
                ++var2;
            }
            if (arg0.method1294(class169.field2201, (byte) -116)) {
                ++var2;
            }
            if (arg0.method1294(class322.field4144, (byte) -123)) {
                ++var2;
            }
            if (arg0.method1294(class120.field1667, (byte) -121)) {
                ++var2;
            }
            if (arg0.method1294(class197.field2547, (byte) -126)) {
                ++var2;
            }
            if (arg0.method1294(class481.field7002, (byte) -114)) {
                ++var2;
            }
            if (arg0.method1294(class288.field3689, (byte) -127)) {
                ++var2;
            }
            if (arg0.method1294(class447.field6216, (byte) -125)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[[I", line = 78)
    public final int[][] method36(int arg0, int arg1) {
        ++field6363;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[] var4 = this.method657(0, arg1 + -1 & class380.field4948, -1);
            int[] var5 = this.method657(0, arg1, -1);
            int[] var6 = this.method657(0, arg1 - -1 & class380.field4948, -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class269.field3403 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field6362;
                int var12 = (var5[class292.field3781 & var10 + 1] + -var5[var10 + -1 & class292.field3781]) * this.field6362;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 - -var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field6361) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return arg0 != 3 ? null : var3;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V", line = 176)
    public class456() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)I", line = 165)
    public static final int method2702(int arg0, int arg1) {
        if (arg0 >= -72) {
            method2703((class402) null, -65, 27, -12, (byte) -106);
        }
        ++field6366;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljt;IIIB)V", line = 182)
    public static final void method2703(class402 arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6359;
        class72 var5 = (class72) class315.field4060.method49(-102);
        if (arg4 > -74) {
            method2703((class402) null, 72, 92, -48, (byte) -108);
        }
        while (var5 != null) {
            if (var5.field892 == arg1 && arg3 << 7 == var5.field896 && arg2 << 7 == var5.field906 && ~var5.field895.field5377 == ~arg0.field5377) {
                if (var5.field886 != null) {
                    class18.field313.method1890(var5.field886);
                    var5.field886 = null;
                }
                if (var5.field893 != null) {
                    class18.field313.method1890(var5.field893);
                    var5.field893 = null;
                }
                var5.method3021(-94);
                return;
            }
            var5 = (class72) class315.field4060.method46((byte) 17);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILbt;)V", line = 230)
    public final void method31(int arg0, int arg1, class88 arg2) {
        ++field6364;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field6361 = arg2.method617(2) == 1;
            }
        } else {
            this.field6362 = arg2.method568((byte) 110);
        }
        if (arg1 != -1) {
            method2701((class201) null, (byte) 25);
        }
    }
}
