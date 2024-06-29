import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class380 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lbaa;")
    public static class593 field4798 = new class593(10, 2, 2, 0);

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field4801 = 64;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
    public static boolean field4803 = false;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4800;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLes;[B)V", line = 6)
    public final void method2059(byte arg0, class630 arg1, byte[] arg2) {
        field4802++;
        if (arg1.field8804[arg1.field8812] != 31 || arg1.field8804[arg1.field8812 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4800 == null) {
            this.field4800 = new Inflater(true);
        }
        try {
            this.field4800.setInput(arg1.field8804, arg1.field8812 + 10, -arg1.field8812 + -10 + -8 + arg1.field8804.length);
            this.field4800.inflate(arg2);
        } catch (Exception var4) {
            this.field4800.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4800.reset();
        if (arg0 < 118) {
            field4803 = true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)[B", line = 34)
    public final byte[] method2060(byte[] arg0, int arg1) {
        field4804++;
        class630 var3 = new class630(arg0);
        int var4 = 121 / ((-arg1 - 71) / 51);
        var3.field8812 = arg0.length - 4;
        int var5 = var3.method3490(-86);
        byte[] var6 = new byte[var5];
        var3.field8812 = 0;
        this.method2059((byte) 125, var3, var6);
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 55)
    public static void method2061(int arg0) {
        field4798 = null;
        if (arg0 <= 119) {
            field4803 = false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IJ)V", line = 66)
    public static final void method2062(int arg0, long arg1) {
        field4799++;
        int var3 = class183.field2335 + class376.field4748.field6461;
        int var4 = class413.field5170 + class376.field4748.field6464;
        if ((class263.field3256 - var3) < -2000 || (class263.field3256 - var3) > 2000 || class91.field1278 - var4 < -2000 || (class91.field1278 - var4) > 2000) {
            class91.field1278 = var4;
            class263.field3256 = var3;
        }
        if (class263.field3256 != var3) {
            int var5 = var3 - class263.field3256;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class263.field3256 += var6;
        }
        if (!class301.field3698.field6607) {
            class331.field4223 += (float) arg1 * class539.field7228 / 6.0F;
            class133.field1739 += (float) arg1 * class304.field3757 / 6.0F;
        }
        if (class91.field1278 != var4) {
            int var7 = var4 - class91.field1278;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class91.field1278 += var8;
        }
        if (arg0 != -2001) {
            field4801 = 98;
        }
        class285.method1600(5126);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 172)
    public class380() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(III)V", line = 178)
    private class380(int arg0, int arg1, int arg2) {
    }
}
