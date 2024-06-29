import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class175 extends class47 {

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lrc;")
    public static class108 field2657 = new class108(99, 7);

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "Lap;")
    public static class310 field2664 = new class310(71, 0);

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Lha;")
    public static class294 field2665 = new class294("WIP", 2);

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Lwk;")
    private class155 field2663;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Lpo;")
    public static class230 field2661;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILae;BILoj;II)V")
    public static final void method1263(int arg0, int arg1, int arg2, class172 arg3, byte arg4, int arg5, class405 arg6, int arg7, int arg8) {
        field2656++;
        int var9 = arg1 * arg1 + (arg5 * arg5);
        if (arg7 < var9) {
            return;
        }
        int var10 = Math.min(arg3.field2554 / 2, arg3.field2579 / 2);
        int var11 = 55 % ((24 - arg4) / 59);
        if ((var10 * var10) >= var9) {
            class110.method873((byte) 19, arg1, arg6, arg8, class94.field1318[arg0], arg5, arg2, arg3);
            return;
        }
        var10 -= 10;
        int var12;
        if (class390.field5393 == 4) {
            var12 = (int) class91.field1281 & 0x3FFF;
        } else {
            var12 = (int) class91.field1281 + class462.field6529 & 0x3FFF;
        }
        int var13 = class319.field4501[var12];
        int var14 = class319.field4504[var12];
        if (class390.field5393 != 4) {
            var14 = var14 * 256 / (class20.field216 + 256);
            var13 = var13 * 256 / (class20.field216 + 256);
        }
        int var15 = arg1 * var14 + arg5 * var13 >> 15;
        int var16 = arg5 * var14 - (arg1 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var10 * Math.sin(var17));
        int var20 = (int) (Math.cos(var17) * (double) var10);
        class76.field1128[arg0].method2492((float) arg3.field2554 / 2.0F + (float) arg2 + (float) var19, (float) arg3.field2579 / 2.0F + (float) arg8 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field2664 = null;
        field2657 = null;
        field2661 = null;
        field2665 = null;
        if (arg0 != -20626) {
            method1267(48, (class65) null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lkk;Z)V")
    public final void method1265(class161 arg0, boolean arg1) {
        field2660++;
        if (!arg1) {
            method1264(74);
        }
        while (true) {
            int var3 = arg0.method1172((byte) -10);
            if (var3 == 0) {
                return;
            }
            this.method1266(var3, arg0, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILkk;B)V")
    private final void method1266(int arg0, class161 arg1, byte arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method1172((byte) -127);
            if (this.field2663 == null) {
                int var5 = class169.method1230(0, var4);
                this.field2663 = new class155(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1172((byte) 7) == 1;
                int var8 = arg1.method1178((byte) 63);
                class449 var9;
                if (var7) {
                    var9 = new class69(arg1.method1186(-1));
                } else {
                    var9 = new class478(arg1.method1168(255));
                }
                this.field2663.method1100(var9, 42, (long) var8);
            }
        }
        if (arg2 <= -99) {
            field2659++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILis;)[Lvt;")
    public static final class473[] method1267(int arg0, class65 arg1) {
        field2655++;
        if (!arg1.method607(-10)) {
            return new class473[0];
        }
        class275 var2 = arg1.method615(arg0 ^ 0x1652);
        while (var2.field3979 == 0) {
            class89.method752(0, 10L);
        }
        if (var2.field3979 == arg0) {
            return new class473[0];
        }
        int[] var3 = (int[]) var2.field3984;
        class473[] var4 = new class473[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class473 var6 = new class473();
            var4[var5] = var6;
            var6.field6661 = var3[var5 << 2];
            var6.field6656 = var3[(var5 << 2) + 1];
            var6.field6654 = var3[(var5 << 2) + 2];
            var6.field6657 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1268(int arg0, int arg1, String arg2) {
        field2662++;
        if (this.field2663 == null) {
            return arg2;
        }
        if (arg0 != -15941) {
            this.method1265((class161) null, false);
        }
        class69 var4 = (class69) this.field2663.method1104(-128, (long) arg1);
        return var4 == null ? arg2 : var4.field1007;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)I")
    public final int method1269(byte arg0, int arg1, int arg2) {
        field2658++;
        if (arg0 != -97) {
            field2664 = null;
        }
        if (this.field2663 == null) {
            return arg2;
        } else {
            class478 var4 = (class478) this.field2663.method1104(-128, (long) arg1);
            return var4 == null ? arg2 : var4.field6789;
        }
    }
}
