import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class341 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "[Lpm;")
    private class134[] field4300 = null;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lpm;")
    public class134[] field4311 = null;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Ln;")
    public class514 field4313 = null;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Ln;")
    public class514 field4314 = null;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lmj;")
    private class344 field4310;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Z")
    public boolean field4308;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public static int[] field4303 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lcq;")
    public static class110 field4304 = new class110(59, -1);

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1968(int arg0) {
        field4305++;
        if (class231.field2854) {
            return;
        }
        if (class639.field9075.field6762) {
            class654.field9173 = ((int) class654.field9173 + 47 & 0xFFFFFFF0);
        } else {
            class381.field5158 += (12.0F - class381.field5158) / 2.0F;
        }
        class119.field1336 = true;
        class231.field2854 = true;
        int var1 = -81 / ((60 - arg0) / 33);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLce;)I", line = 29)
    public static final int method1969(boolean arg0, class445 arg1) {
        if (!arg0) {
            field4304 = null;
        }
        field4312++;
        int var2 = arg1.method2574(296813219, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2574(296813219, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2574(296813219, 8);
        } else {
            var3 = arg1.method2574(296813219, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lpi;B)[Lsda;", line = 56)
    public static final class7[] method1970(class464 arg0, byte arg1) {
        field4307++;
        if (!arg0.method2671(0)) {
            return new class7[0];
        }
        class88 var2 = arg0.method2675(10000);
        while (var2.field884 == 0) {
            class452.method2602(10L, (byte) -97);
        }
        if (var2.field884 == 2) {
            return new class7[0];
        }
        int[] var3 = (int[]) var2.field886;
        int var4 = -87 / ((44 - arg1) / 48);
        class7[] var5 = new class7[var3.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class7 var7 = new class7();
            var5[var6] = var7;
            var7.field82 = var3[var6 << 2];
            var7.field80 = var3[(var6 << 2) + 1];
            var7.field78 = var3[(var6 << 2) + 2];
            var7.field77 = var3[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I", line = 98)
    public static final int method1971(int arg0, int arg1) {
        field4302++;
        if (arg0 != 22826) {
            method1969(true, null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)Lkba;", line = 109)
    public static final class575 method1972(byte arg0, int arg1) {
        field4306++;
        if (arg0 != -126) {
            field4304 = null;
        }
        return new class575(arg1, false);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lmj;)V", line = 252)
    public class341(class344 arg0) {
        this.field4310 = arg0;
        this.field4308 = this.field4310.field4520;
        if (this.field4308 && !this.field4310.method1287(class179.field2008, class363.field4868, (byte) 126)) {
            this.field4308 = false;
        }
        if (this.field4308 || this.field4310.method1334(1, class179.field2008, class363.field4868)) {
            class616.method3431((byte) 43);
            if (this.field4308) {
                byte[] var2 = class684.method3787(false, class541.field7599, 116);
                this.field4314 = this.field4310.method1290(128, (byte) 127, 128, var2, 16, class363.field4868);
                byte[] var3 = class684.method3787(false, class371.field5065, 83);
                this.field4310.method1290(128, (byte) 122, 128, var3, 16, class363.field4868);
            } else {
                this.field4311 = new class134[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class667.method3696(32768, var4 * 32768, 74, class541.field7599);
                    this.field4311[var4] = this.field4310.method2046(128, var7, (byte) 79, 128, class363.field4868, true);
                }
                this.field4300 = new class134[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class667.method3696(32768, var5 * 128 * 128 * 2, 95, class371.field5065);
                    this.field4300[var5] = this.field4310.method2046(128, var6, (byte) 46, 128, class363.field4868, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 143)
    public static void method1973(int arg0) {
        field4303 = null;
        if (arg0 >= 50) {
            field4304 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Z", line = 155)
    public final boolean method1974(int arg0) {
        field4301++;
        if (arg0 != -15210) {
            method1972((byte) -101, -40);
        }
        if (this.field4308) {
            return this.field4314 != null;
        } else {
            return this.field4311 != null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)Z", line = 173)
    public final boolean method1975(boolean arg0) {
        if (!arg0) {
            return true;
        }
        if (this.field4313 == null) {
            if (class533.field7495 == null) {
                byte[] var2 = class124.method713(128, 4.0F, 8, new class124(419684), 1341, 4.0F, 16.0F, 128, 16, 0.6F, 0.5F);
                class533.field7495 = class489.method2836(var2, false, true);
            }
            byte[] var3 = class684.method3787(false, class533.field7495, 89);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 16384;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[var10 + (var13 - 1 & 0x7F)] & 0xFF) - (var3[var10 + (var13 + 1 & 0x7F)] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field4313 = this.field4310.method1290(128, (byte) 124, 128, var4, 16, class412.field5529);
        }
        field4309++;
        return this.field4313 != null;
    }
}
