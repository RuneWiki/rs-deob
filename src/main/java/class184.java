import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class184 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B[I[[B[[BIII[I)I", line = 11)
    public static final int method1303(byte[] arg0, int[] arg1, byte[][] arg2, byte[][] arg3, int arg4, int arg5, int arg6, int[] arg7) {
        field2593++;
        int var8 = arg1[arg6];
        int var9 = arg7[arg6] + var8;
        int var10 = arg1[arg5];
        int var11 = var10 + arg7[arg5];
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg6] & 0xFF;
        if (var14 > (arg0[arg5] & 0xFF)) {
            var14 = arg0[arg5] & 0xFF;
        }
        byte[] var15 = arg2[arg6];
        byte[] var16 = arg3[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        if (arg4 > -69) {
            field2591 = 29;
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 70)
    public static final void method1304(int arg0) {
        field2592++;
        int var1 = class746.field10193 * 512 + 256;
        int var2 = class270.field3557 * 512 + 256;
        int var3 = class512.method2831(class309.field3877, (byte) -51, var1, var2) - class11.field116;
        if (class319.field3979 >= 100) {
            class97.field1309 = class746.field10193 * 512 + 256;
            class148.field1890 = class270.field3557 * 512 + 256;
            class439.field5770 = class512.method2831(class309.field3877, (byte) -38, class97.field1309, class148.field1890) - class11.field116;
        } else {
            if (class97.field1309 < var1) {
                class97.field1309 += (var1 - class97.field1309) * class319.field3979 / 1000 + class195.field2703;
                if (var1 < class97.field1309) {
                    class97.field1309 = var1;
                }
            }
            if (class439.field5770 < var3) {
                class439.field5770 += (var3 - class439.field5770) * class319.field3979 / 1000 + class195.field2703;
                if (class439.field5770 > var3) {
                    class439.field5770 = var3;
                }
            }
            if (class97.field1309 > var1) {
                class97.field1309 -= (class97.field1309 - var1) * class319.field3979 / 1000 + class195.field2703;
                if (class97.field1309 < var1) {
                    class97.field1309 = var1;
                }
            }
            if (class439.field5770 > var3) {
                class439.field5770 -= (class439.field5770 - var3) * class319.field3979 / 1000 + class195.field2703;
                if (var3 > class439.field5770) {
                    class439.field5770 = var3;
                }
            }
            if (class148.field1890 < var2) {
                class148.field1890 += (var2 - class148.field1890) * class319.field3979 / 1000 + class195.field2703;
                if (class148.field1890 > var2) {
                    class148.field1890 = var2;
                }
            }
            if (class148.field1890 > var2) {
                class148.field1890 -= (class148.field1890 - var2) * class319.field3979 / 1000 + class195.field2703;
                if (class148.field1890 < var2) {
                    class148.field1890 = var2;
                }
            }
        }
        int var4 = class285.field3668 * 512 + 256;
        int var5 = class650.field8287 * 512 + 256;
        int var6 = class512.method2831(class309.field3877, (byte) 59, var4, var5) - class240.field3277;
        int var7 = var4 - class97.field1309;
        int var8 = var6 - class439.field5770;
        int var9 = var5 - class148.field1890;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class463.field6022) {
            class463.field6022 += class29.field255 + ((var11 - class463.field6022 >> 3) * class552.field6974 / 1000) << 3;
            if (class463.field6022 > var11) {
                class463.field6022 = var11;
            }
        }
        if (arg0 != -3030) {
            field2591 = -15;
        }
        if (class463.field6022 > var11) {
            class463.field6022 -= (class463.field6022 - var11 >> 3) * class552.field6974 / 1000 + class29.field255 << 3;
            if (class463.field6022 < var11) {
                class463.field6022 = var11;
            }
        }
        int var13 = var12 - class232.field3122;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class232.field3122 += class552.field6974 * var14 / 1000 + class29.field255 << 3;
            class232.field3122 &= 0x3FFF;
        }
        if (var14 < 0) {
            class232.field3122 -= -var14 * class552.field6974 / 1000 + class29.field255 << 3;
            class232.field3122 &= 0x3FFF;
        }
        int var15 = var12 - class232.field3122;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class232.field3122 = var12;
        }
        class511.field6521 = 0;
    }
}
