import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class296 implements class30 {

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Lwa;")
    private class661 field3702 = new class661(128);

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "[I")
    private int[] field3703 = new int[class624.field8826.field9297];

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "[I")
    public int[] field3693 = new int[class624.field8826.field9297];

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "Lcq;")
    public static class110 field3700 = new class110(31, 12);

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3706 = new CRC32();

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)V", line = 4)
    public final void method1726(int arg0, int arg1, int arg2) {
        field3689++;
        class531 var4 = class259.field3254.method3830(arg1, 6);
        int var5 = var4.field7477;
        int var6 = var4.field7471;
        int var7 = var4.field7474;
        int var8 = class202.field2391[var7 - var6];
        int var9 = 96 / ((62 - arg0) / 59);
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var10 = var8 << var6;
        this.method1737(var5, -40, this.field3703[var5] & ~var10 | arg2 << var6 & var10);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Lwo;", line = 30)
    public static final class448 method1727(int arg0) {
        field3692++;
        int var1 = -114 % ((arg0 - 23) / 46);
        try {
            return (class448) Class.forName("qk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(II)I", line = 47)
    public final int method160(int arg0, int arg1) {
        field3696++;
        class531 var3 = class259.field3254.method3830(arg1, 6);
        int var4 = var3.field7477;
        if (arg0 != -726) {
            this.field3693 = null;
        }
        int var5 = var3.field7471;
        int var6 = var3.field7474;
        int var7 = class202.field2391[var6 - var5];
        return this.field3693[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 69)
    public static final void method1728(byte arg0) {
        field3695++;
        if (arg0 == -28 && class579.field8191 == 6) {
            class579.field8191 = 7;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BII)V", line = 83)
    public final void method1729(byte arg0, int arg1, int arg2) {
        this.field3693[arg1] = arg2;
        field3698++;
        class346 var4 = (class346) this.field3702.method3669((long) arg1, -1);
        int var5 = 9 / ((arg0 + 30) / 34);
        if (var4 == null) {
            class346 var6 = new class346(class557.method3157(-87) + 500L);
            this.field3702.method3671(false, var6, (long) arg1);
        } else {
            var4.field4649 = class557.method3157(-54) + 500L;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)V", line = 106)
    public static void method1730(byte arg0) {
        if (arg0 > 109) {
            field3700 = null;
            field3706 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)I", line = 117)
    public final int method1731(boolean arg0, byte arg1) {
        field3705++;
        long var3 = class557.method3157(arg1 - 136);
        for (class346 var5 = arg0 ? (class346) this.field3702.method3674(127) : (class346) this.field3702.method3672(-1); var5 != null; var5 = (class346) this.field3702.method3672(-1)) {
            if (var3 > (var5.field4649 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field4649 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field4176;
                    this.field3693[var6] = this.field3703[var6];
                    var5.method1922(102);
                    return var6;
                }
                var5.method1922(78);
            }
        }
        if (arg1 != 13) {
            this.field3693 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(III)V", line = 157)
    public final void method1732(int arg0, int arg1, int arg2) {
        field3697++;
        class531 var4 = class259.field3254.method3830(arg2, 6);
        int var5 = var4.field7477;
        int var6 = var4.field7471;
        int var7 = var4.field7474;
        int var8 = class202.field2391[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1729((byte) -111, var5, var9 & arg1 << var6 | ~var9 & this.field3693[var5]);
        int var10 = 37 / ((29 - arg0) / 39);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)I", line = 184)
    public final int method159(int arg0, int arg1) {
        field3691++;
        if (arg1 != 14) {
            field3704 = 26;
        }
        return this.field3693[arg0];
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 198)
    public final void method1733(int arg0) {
        field3701++;
        for (int var2 = arg0; var2 < class624.field8826.field9297; var2++) {
            class400 var3 = class624.field8826.method3688(var2, (byte) -81);
            if (var3 != null && var3.field5384 == 0) {
                this.field3703[var2] = 0;
                this.field3693[var2] = 0;
            }
        }
        this.field3702 = new class661(128);
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(III)V", line = 225)
    public static final void method1734(int arg0, int arg1, int arg2) {
        field3688++;
        int var3 = -101 % ((arg1 - 28) / 63);
        class76 var4 = class3.method28(14, (byte) 42, arg2);
        var4.method403((byte) 39);
        var4.field785 = arg0;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 239)
    public static final void method1735(int arg0, String arg1, boolean arg2) {
        field3694++;
        class351.method2083(arg2);
        class588.method3317(-87);
        class681.method3785(-103);
        class309.method1771(17734, arg1, arg0);
        class486.method2800(arg2);
        class573.method3239(class701.field9813, false);
        class103.method558(class701.field9813, (byte) 55);
        class305.method1759(class408.field5441, class701.field9813, -15499);
        class479.method2757((byte) -118);
        class639.method3600(-124, class485.field6988);
        class64.method346(8);
        class114.method609(-87);
        if (class421.field5601 == 3) {
            class585.method3308(4, 22731);
        } else if (class421.field5601 == 7) {
            class585.method3308(8, 22731);
        } else if (class421.field5601 == 10) {
            class585.method3308(11, 22731);
        } else if (class421.field5601 == 1 || class421.field5601 == 2) {
            class505.method2896(1);
        }
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)V", line = 277)
    public static final void method1736(int arg0) {
        class472.field6808.method88(arg0 - 67);
        if (arg0 == 128) {
            field3699++;
        }
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(III)V", line = 293)
    public final void method1737(int arg0, int arg1, int arg2) {
        field3690++;
        this.field3703[arg0] = arg2;
        if (arg1 >= -18) {
            field3704 = -5;
        }
        class346 var4 = (class346) this.field3702.method3669((long) arg0, -1);
        if (var4 == null) {
            class346 var5 = new class346(4611686018427387905L);
            this.field3702.method3671(false, var5, (long) arg0);
        } else if (var4.field4649 != 4611686018427387905L) {
            var4.field4649 = class557.method3157(-111) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
