import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class720 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "[B")
    private byte[] field10142 = new byte[32];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[J")
    private long[] field10139 = new long[8];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[J")
    private long[] field10140 = new long[8];

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[J")
    private long[] field10147 = new long[8];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    private int field10148 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    private int field10143 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[J")
    private long[] field10150 = new long[8];

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "[B")
    private byte[] field10152 = new byte[64];

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[J")
    private long[] field10145 = new long[8];

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    public static int[] field10149 = new int[3];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(J[BI)V", line = 7)
    public final void method3985(long arg0, byte[] arg1, int arg2) {
        field10138++;
        int var5 = 0;
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field10148 & 0x7;
        long var8 = arg0;
        if (arg2 != 255) {
            method3991((byte) -8);
        }
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field10142[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field10142[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg1[var5] << var6 & 0xFF | (arg1[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field10152[this.field10143] = (byte) class216.method1308(this.field10152[this.field10143], var15 >>> var7);
            this.field10143++;
            this.field10148 += 8 - var7;
            if (this.field10148 == 512) {
                this.method3988((byte) -106);
                this.field10148 = this.field10143 = 0;
            }
            this.field10152[this.field10143] = (byte) class272.method1629(255, var15 << 8 - var7);
            var5++;
            arg0 -= 8L;
            this.field10148 += var7;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg1[var5] << var6 & 0xFF;
            this.field10152[this.field10143] = (byte) class216.method1308(this.field10152[this.field10143], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field10148 = (int) ((long) this.field10148 + arg0);
            return;
        }
        long var13 = arg0 - (long) (8 - var7);
        this.field10143++;
        this.field10148 += 8 - var7;
        if (this.field10148 == 512) {
            this.method3988((byte) -106);
            this.field10148 = this.field10143 = 0;
        }
        this.field10152[this.field10143] = (byte) class272.method1629(var12 << 8 - var7, 255);
        this.field10148 += (int) var13;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[B)V", line = 94)
    public final void method3986(int arg0, int arg1, byte[] arg2) {
        field10144++;
        this.field10152[this.field10143] = (byte) class216.method1308(this.field10152[this.field10143], 0x80 >>> class272.method1629(7, this.field10148));
        this.field10143++;
        if (this.field10143 > 32) {
            while (true) {
                if (this.field10143 >= 64) {
                    this.method3988((byte) -106);
                    this.field10143 = 0;
                    break;
                }
                this.field10152[this.field10143++] = 0;
            }
        }
        while (this.field10143 < 32) {
            this.field10152[this.field10143++] = 0;
        }
        int var4 = 38 / ((-arg1 - 55) / 50);
        class617.method3389(this.field10142, 0, this.field10152, 32, 32);
        this.method3988((byte) -106);
        int var5 = 0;
        int var6 = arg0;
        while (var5 < 8) {
            long var7 = this.field10147[var5];
            arg2[var6] = (byte) ((int) (var7 >>> 56));
            arg2[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg2[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg2[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg2[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg2[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg2[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg2[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)I", line = 143)
    public static final int method3987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10141++;
        int var5 = arg3 & 0xF;
        int var6 = var5 < 8 ? arg0 : arg1;
        int var7 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg0 : arg2);
        if (arg4 >= -114) {
            field10149 = null;
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 165)
    private final void method3988(byte arg0) {
        if (arg0 != -106) {
            this.method3990(48);
        }
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field10150[var2] = class748.method4180(class349.method2046(255L, (long) this.field10152[var3 + 7]), class748.method4180(class748.method4180(class748.method4180(class748.method4180(class349.method2046(255L, (long) this.field10152[var3 + 3]) << 32, class748.method4180(class748.method4180(class349.method2046(255L, (long) this.field10152[var3 + 1]) << 48, (long) this.field10152[var3] << 56), class349.method2046((long) this.field10152[var3 + 2], 255L) << 40)), class349.method2046(255L, (long) this.field10152[var3 + 4]) << 24), class349.method2046((long) this.field10152[var3 + 5] << 16, 0xFFL << 16)), class349.method2046((long) this.field10152[var3 + 6] << 8, 0xFFL << 8)));
            var2++;
            var3 += 8;
        }
        field10146++;
        for (int var4 = 0; var4 < 8; var4++) {
            this.field10140[var4] = class748.method4180(this.field10150[var4], this.field10145[var4] = this.field10147[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field10139[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field10139[var7] = class748.method4180(this.field10139[var7], class572.field7986[var13][class272.method1629((int) (this.field10145[class272.method1629(7, var7 - var13)] >>> var14), 255)]);
                    var14 -= 8;
                    var13++;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field10145[var8] = this.field10139[var8];
            }
            this.field10145[0] = class748.method4180(this.field10145[0], class572.field7989[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field10139[var9] = this.field10145[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field10139[var9] = class748.method4180(this.field10139[var9], class572.field7986[var11][class272.method1629(255, (int) (this.field10140[class272.method1629(7, var9 - var11)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field10140[var10] = this.field10139[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field10147[var6] = class748.method4180(this.field10147[var6], class748.method4180(this.field10140[var6], this.field10150[var6]));
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lgba;", line = 272)
    public static final class499 method3989(int arg0) {
        field10151++;
        if (class341.field4421 == null || class325.field4143 == null) {
            return null;
        } else if (arg0 >= -36) {
            return null;
        } else {
            for (class499 var1 = (class499) class325.field4143.method2267((byte) 70); var1 != null; var1 = (class499) class325.field4143.method2267((byte) 70)) {
                class351 var2 = class341.field4406.method2765(36, var1.field7056);
                if (var2 != null && var2.field4582 && var2.method2065(true, class341.field4409)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 303)
    public final void method3990(int arg0) {
        field10153++;
        if (arg0 < 23) {
            this.method3990(91);
        }
        for (int var2 = 0; var2 < 32; var2++) {
            this.field10142[var2] = 0;
        }
        this.field10152[0] = 0;
        this.field10148 = this.field10143 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field10147[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 350)
    public static void method3991(byte arg0) {
        field10149 = null;
        if (arg0 != -9) {
            method3987(-22, -68, -24, 106, -72);
        }
    }
}
