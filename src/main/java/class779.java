import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class779 {

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "[I")
    public static int[] field10751 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "[I")
    public static int[] field10749 = new int[1];

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "Llja;")
    public static class744 field10753 = new class744(0, -1);

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "I")
    public static int field10750;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field10752;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILbt;I)Lbq;", line = 14)
    public static final class307 method4323(int arg0, class48 arg1, int arg2) {
        field10752++;
        if (arg0 != -1) {
            field10749 = null;
        }
        byte[] var3 = arg1.method453(arg2, 11040);
        return var3 == null ? null : new class307(var3);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILbn;B)Z", line = 31)
    public static final boolean method4324(int arg0, class468 arg1, byte arg2) {
        field10750++;
        int var3 = arg1.method2802(2, arg2 - 20379);
        if (var3 == 0) {
            if (arg1.method2802(1, arg2 - 20379) != 0) {
                method4324(arg0, arg1, (byte) -89);
            }
            int var4 = arg1.method2802(6, arg2 - 20379);
            int var5 = arg1.method2802(6, -20468);
            boolean var6 = arg1.method2802(1, arg2 - 20379) == 1;
            if (var6) {
                class432.field5707[class666.field9157++] = arg0;
            }
            if (class61.field825[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class643 var7 = class320.field3971[arg0];
            class521 var8 = class61.field825[arg0] = new class521();
            var8.field3393 = arg0;
            if (class323.field4015[arg0] != null) {
                var8.method3128((byte) 104, class323.field4015[arg0]);
            }
            var8.method1677(var7.field8770, true, arg2 + 155);
            var8.field3377 = var7.field8768;
            int var9 = var7.field8769;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class632.field8626;
            int var14 = (var12 << 6) + var5 - class620.field8435;
            var8.field7356 = var7.field8771;
            var8.field7353 = var7.field8767;
            var8.field3459[0] = class63.field866[arg0];
            var8.field808 = var8.field811 = (byte) var10;
            if (class77.method708(var13, arg2 ^ 0xB061B4B, var14)) {
                var8.field811++;
            }
            var8.method3125(var13, -128, var14);
            var8.field7348 = false;
            class320.field3971[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg1.method2802(2, -20468);
            int var16 = class320.field3971[arg0].field8769;
            class320.field3971[arg0].field8769 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg1.method2802(5, -20468);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class320.field3971[arg0].field8769;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class320.field3971[arg0].field8769 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg1.method2802(18, arg2 - 20379);
            if (arg2 != -89) {
                field10749 = null;
            }
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class320.field3971[arg0].field8769;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class320.field3971[arg0].field8769 = (var30 << 14) + ((var29 << 28) + var31);
            return false;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V", line = 196)
    public static void method4325(boolean arg0) {
        field10749 = null;
        field10753 = null;
        if (!arg0) {
            field10751 = null;
        }
    }
}
