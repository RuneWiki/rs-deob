import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class389 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lnj;")
    private class162 field5659 = new class162(64);

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "Lmg;")
    private class101 field5666;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Ldi;")
    public static class83 field5661 = new class83(67, 3);

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[I")
    public static int[] field5667 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Ldi;")
    public static class83 field5669 = new class83(6, 18);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "F")
    public static float field5665;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method2291(int arg0) {
        field5667 = null;
        if (arg0 != 67108863) {
            method2292(-123);
        }
        field5669 = null;
        field5661 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)Z")
    public static final boolean method2292(int arg0) {
        field5668++;
        try {
            return arg0 < 112 ? true : class441.method2631(36);
        } catch (IOException var4) {
            class467.method2737(77);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class469.field6850 == null ? -1 : class469.field6850.method1615((byte) 51)) + "," + (class455.field6681 == null ? -1 : class455.field6681.method1615((byte) 51)) + "," + (class521.field7731 == null ? -1 : class521.field7731.method1615((byte) 51)) + " - " + class422.field6187 + "," + (class316.field4324.field1127[0] + class510.field7566) + "," + (class316.field4324.field1117[0] + class14.field204) + " - ";
            for (int var3 = 0; var3 < class422.field6187 && var3 < 50; var3++) {
                var2 = var2 + class179.field2631.field5678[var3] + ",";
            }
            class320.method1861(var5, (byte) -86, var2);
            class285.method1701(-24827);
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)Lwi;")
    public final class326 method2293(int arg0, byte arg1) {
        field5664++;
        class162 var3 = this.field5659;
        class326 var4;
        synchronized (this.field5659) {
            var4 = (class326) this.field5659.method1073((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5666.method727(arg0, 35, arg1 + 127);
        class326 var6 = new class326();
        if (var5 != null) {
            var6.method1890(0, new class391(var5));
        }
        if (arg1 != -18) {
            method2291(96);
        }
        var6.method1891(124);
        class162 var7 = this.field5659;
        synchronized (this.field5659) {
            this.field5659.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public final void method2294(int arg0) {
        class162 var2 = this.field5659;
        synchronized (this.field5659) {
            this.field5659.method1066(4080);
        }
        field5663++;
        if (arg0 > -20) {
            method2296((byte) 34);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final void method2295(boolean arg0) {
        class162 var2 = this.field5659;
        synchronized (this.field5659) {
            this.field5659.method1068(0);
        }
        field5662++;
        if (arg0) {
            method2296((byte) 70);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method2296(byte arg0) {
        field5660++;
        int var1 = class179.field2631.method2305(-108);
        class403.field5918 = class179.field2631.method2352((byte) 8);
        int var2 = class179.field2631.method2313(255);
        int var3 = class179.field2631.method2346((byte) 43);
        boolean var4 = class179.field2631.method2352((byte) 8) == 1;
        class162.method1062((byte) -68, var1);
        class179.field2631.method1278(0);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class527.field7799 >> 3); var20++) {
                for (int var21 = 0; var21 < class422.field6182 >> 3; var21++) {
                    int var22 = class179.field2631.method1282(-26364, 1);
                    if (var22 == 1) {
                        class18.field237[var5][var20][var21] = class179.field2631.method1282(-26364, 26);
                    } else {
                        class18.field237[var5][var20][var21] = -1;
                    }
                }
            }
        }
        if (arg0 <= 69) {
            return;
        }
        class179.field2631.method1276(102);
        int var6 = (class422.field6187 - class179.field2631.field5719) / 16;
        class110.field1649 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class110.field1649[var7][var19] = class179.field2631.method2361((byte) -56);
            }
        }
        class487.field7130 = new int[var6];
        class411.field6007 = null;
        class250.field3463 = new int[var6];
        class310.field4218 = new int[var6];
        class117.field1750 = new int[var6];
        class322.field4391 = new byte[var6][];
        class80.field1224 = new byte[var6][];
        class11.field165 = new byte[var6][];
        class526.field7779 = new byte[var6][];
        class110.field1657 = new int[var6];
        class318.field4372 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class527.field7799 >> 3); var10++) {
                for (int var11 = 0; var11 < (class422.field6182 >> 3); var11++) {
                    int var12 = class18.field237[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFD6B) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class310.field4218[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class310.field4218[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class117.field1750[var8] = class297.field4079.method735(-96, "m" + var17 + "_" + var18);
                            class487.field7130[var8] = class297.field4079.method735(-89, "l" + var17 + "_" + var18);
                            class250.field3463[var8] = class297.field4079.method735(35, "um" + var17 + "_" + var18);
                            class110.field1657[var8] = class297.field4079.method735(-110, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class484.method2848(false, var3, var2, (byte) 104, var4);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)V")
    public final void method2297(int arg0, byte arg1) {
        class162 var3 = this.field5659;
        synchronized (this.field5659) {
            this.field5659.method1065((byte) -95, arg0);
            if (arg1 > -83) {
                this.method2293(-1, (byte) 116);
            }
        }
        field5658++;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class389(class66 arg0, int arg1, class101 arg2) {
        this.field5666 = arg2;
        if (this.field5666 != null) {
            this.field5666.method753(35, -119);
        }
    }
}
