import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class514 {

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "B")
    private byte field7147;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public int field7148;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public int field7149;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field7152;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public int field7146;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "F")
    public static float field7144 = 0.0F;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field7151 = -1;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
    public static int[] field7145 = new int[32];

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I", line = 3)
    public final int method3001(int arg0) {
        if (arg0 == 0) {
            field7154++;
            return (this.field7147 & 0x8) == 8 ? 1 : 0;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V", line = 20)
    public static void method3002(int arg0) {
        field7145 = null;
        if (arg0 != -4347) {
            method3004(-40);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I", line = 31)
    public final int method3003(boolean arg0) {
        if (arg0) {
            field7153++;
            return this.field7147 & 0x7;
        } else {
            return 67;
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 43)
    public static final void method3004(int arg0) {
        field7156++;
        class107.field1511.method885(5, false);
        class103.field1471.method3667(73, 5);
        class345.field4846.method1295(false, 5);
        class210.field2705.method1366(5, 64);
        class107.field1507.method3581(-11153, 5);
        class16.field156.method2123(-102, 5);
        class693.field9223.method2386(-56, 5);
        if (arg0 >= -41) {
            field7151 = -67;
        }
        class641.field8643.method917(5, -83);
        class547.field7563.method3721(26735, 5);
        class2.field14.method4320(16, 5);
        class285.field4087.method1796(5, -116);
        class175.field2314.method2634((byte) 109, 5);
        class323.field4586.method2070(1850939296, 5);
        class548.field7574.method3175(5, 34);
        class315.field4447.method3516(5, -22933);
        class222.field2875.method3211(-12837, 5);
        class629.field8517.method4130(5, 24814);
        class297.field4200.method2332(5, -1);
        class224.field2905.method4000(5, (byte) 121);
        class453.field6503.method1508(5, -1);
        class130.field1795.method3477(5, 256);
        class83.field1185.method2899((byte) -116, 5);
        class364.method2299(5, (byte) -95);
        class672.method3707(50, false);
        class199.method1298(12800, 50);
        class5.method29(37, 5);
        class304.method1960(5, -7266);
        class618.field8350.method3101(false, 5);
        class355.field5177.method3101(false, 5);
        class145.field1948.method3101(false, 5);
        class377.field5511.method3101(false, 5);
        class727.field9855.method3101(false, 5);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "([BZII)[B", line = 95)
    public static final byte[] method3005(byte[] arg0, boolean arg1, int arg2, int arg3) {
        field7155++;
        byte[] var4;
        if (arg3 > 0) {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg0[arg3 + var5];
            }
        } else {
            var4 = arg0;
        }
        class520 var6 = new class520();
        var6.method3022((byte) 103);
        var6.method3023(arg1, (long) (arg2 * 8), var4);
        byte[] var7 = new byte[64];
        var6.method3024(false, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 132)
    public class514() {
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ldt;)V", line = 135)
    public class514(class254 arg0) {
        this.field7147 = arg0.method1737(true);
        this.field7150 = arg0.method1728((byte) 118);
        this.field7148 = arg0.method1672(-16516);
        this.field7149 = arg0.method1672(-16516);
        this.field7152 = arg0.method1672(-16516);
        this.field7146 = arg0.method1672(-16516);
    }
}
