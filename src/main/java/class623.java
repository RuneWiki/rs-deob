import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class623 {

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public int field8978 = 0;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
    private boolean field8971 = false;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field8981 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field8969;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    private int field8973;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field8974;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public int field8975;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public int field8976;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public int field8982;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field8983;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field8985;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field8986;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "J")
    public long field8977;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Los;I)V")
    public final void method3568(class374 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2129(-126);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field8978 = 58;
                }
                field8984++;
                return;
            }
            this.method3569((byte) 123, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLos;I)V")
    private final void method3569(byte arg0, class374 arg1, int arg2) {
        int var4 = -7 % ((61 - arg0) / 34);
        if (arg2 == 1) {
            this.field8973 = arg1.method2136(false);
        } else if (arg2 == 2) {
            arg1.method2129(-89);
        } else if (arg2 == 3) {
            this.field8986 = arg1.method2123(false);
            this.field8974 = arg1.method2123(false);
            this.field8983 = arg1.method2123(false);
        } else if (arg2 == 4) {
            this.field8975 = arg1.method2129(-76);
            this.field8979 = arg1.method2123(false);
        } else if (arg2 == 6) {
            this.field8976 = arg1.method2129(-90);
        } else if (arg2 == 8) {
            this.field8981 = 1;
        } else if (arg2 == 9) {
            this.field8978 = 1;
        } else if (arg2 == 10) {
            this.field8971 = true;
        }
        field8970++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lpl;")
    public static final class555 method3570(int arg0) {
        if (arg0 < 105) {
            method3571(65);
        }
        field8980++;
        try {
            return (class555) Class.forName("df").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static final void method3571(int arg0) {
        if (class445.field6135 == null || class326.field4164 == null) {
            class326.field4164 = new int[256];
            class445.field6135 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class445.field6135[var1] = (int) (Math.sin(var2) * 4096.0D);
                class326.field4164[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 <= -49) {
            field8972++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method3572(byte arg0) {
        this.field8982 = class442.field6101[this.field8973 << 3];
        field8987++;
        this.field8969 = (int) Math.sqrt((double) (this.field8986 * this.field8986 + this.field8983 * this.field8983 + (this.field8974 * this.field8974)));
        if (this.field8979 == 0) {
            this.field8979 = 1;
        }
        if (this.field8975 == 0) {
            this.field8977 = 2147483647L;
        } else if (this.field8975 == 1) {
            this.field8977 = (this.field8969 * 8 / this.field8979);
            this.field8977 *= this.field8977;
        } else if (this.field8975 == 2) {
            this.field8977 = (this.field8969 * 8 / this.field8979);
        }
        if (this.field8971) {
            this.field8969 *= -1;
        }
        if (arg0 >= -53) {
            this.method3569((byte) -81, null, -13);
        }
    }
}
