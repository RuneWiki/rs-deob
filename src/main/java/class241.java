import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class241 extends class261 {

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    private int field4017 = 4096;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Lve;")
    private static class255 field4013 = class87.method607(64, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "Lve;")
    public static class255 field4016 = class87.method607(55, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[J")
    public static long[] field4018 = new long[256];

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lve;")
    public static class255 field4009 = field4013;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lpb;BI)V", line = 4)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            method1662(-106);
        }
        if (arg2 == 0) {
            this.field4017 = arg0.method423(255);
        }
        field4010++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 20)
    public class241() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I", line = 27)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = -49 / ((-arg0 - 49) / 33);
        field4014++;
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int[] var5 = this.method1822(0, 44, class250.field4205 & arg1 - 1);
            int[] var6 = this.method1822(0, 61, arg1);
            int[] var7 = this.method1822(0, 25, arg1 + 1 & class250.field4205);
            for (int var8 = 0; var8 < class92.field1576; var8++) {
                int var9 = (var7[var8] - var5[var8]) * this.field4017;
                int var10 = (var6[var8 + 1 & class77.field1260] - var6[class77.field1260 & var8 - 1]) * this.field4017;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var12 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V", line = 77)
    public static final void method1660(int arg0, boolean arg1) {
        field4015++;
        byte[][] var2;
        byte var3;
        if (class281.field4827 && arg1) {
            var2 = class222.field3737;
            var3 = 1;
        } else {
            var2 = class149.field2511;
            var3 = 4;
        }
        int var4 = 0;
        if (arg0 < 24) {
            return;
        }
        while (var4 < var3) {
            class118.method885(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class248.field4152[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x37A895D) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0xFFF3DC) >> 14;
                            int var10 = (var7 & 0x3FFB) >> 3;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            int var12 = (var7 & 0x6) >> 1;
                            for (int var13 = 0; var13 < class116.field1976.length; var13++) {
                                if (class116.field1976[var13] == var11 && var2[var13] != null) {
                                    class196.method1400(var6 * 8, var12, (var9 & 0x7) * 8, arg1, 17627, class310.field5292, (var10 & 0x7) * 8, var5 * 8, var4, var2[var13], var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 162)
    public static final void method1661(int arg0) {
        field4011++;
        if (arg0 != 8094) {
            method1663(108L, false, 7, -13);
        }
        for (int var1 = -1; var1 < class309.field5269; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class259.field4398[var1];
            }
            class242 var3 = class151.field2555[var2];
            if (var3 != null) {
                class127.method942(arg0 - 8092, var3, var3.method1680(-110));
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 200)
    public static void method1662(int arg0) {
        field4016 = null;
        field4009 = null;
        field4013 = null;
        field4018 = null;
        if (arg0 != -11773) {
            method1663(-69L, true, -120, 28);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JZII)Lve;", line = 215)
    public static final class255 method1663(long arg0, boolean arg1, int arg2, int arg3) {
        field4012++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        for (long var6 = arg0 / (long) arg2; var6 != 0L; var6 /= (long) arg2) {
            var5++;
        }
        int var8 = var5;
        if (arg0 < 0L || arg1) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg0 % (long) arg2);
            if (var11 < 0) {
                var11 = -var11;
            }
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
            arg0 /= (long) arg2;
        }
        class255 var12 = new class255();
        var12.field4343 = var8;
        if (arg3 != -1) {
            method1660(11, false);
        }
        var12.field4297 = var9;
        return var12;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4018[var0] = var1;
        }
        field4021 = 0;
    }
}
