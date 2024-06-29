import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class108 extends class50 {

    @OriginalMember(owner = "client!qha", name = "I", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "client!qha", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field1549 = new String[] { method1010(method1009("\u0014\u00180S.\f\u001e8\t,M")), method1010(method1009("\u0014\u00180SQM")), method1010(method1009("\u0014\u00180SVM")), method1010(method1009("\u0014\u00180SPM")), method1010(method1009("\u0014\u00180SUM")), method1010(method1009("\u0014\u00180SWM")), method1010(method1009("\u0014\u00180SSM")), method1010(method1009("\u000b\u0005=\u0011")), method1010(method1009("\u001e^\u007fSo")), method1010(method1009("\u0014\u00180STM")) };

    @OriginalMember(owner = "client!qha", name = "C", descriptor = "Lwc;")
    public static class71 field1547 = new class71();

    @OriginalMember(owner = "client!qha", name = "A", descriptor = "[I")
    public static int[] field1548 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!qha", name = "y", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!qha", name = "v", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!qha", name = "E", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!qha", name = "G", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client!qha", name = "w", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!qha", name = "B", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!qha", name = "x", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!qha", name = "H", descriptor = "[B")
    private byte[] field1544;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 5)
    public final void method511(int arg0) {
        try {
            if (arg0 == -1815138708) {
                this.field1541 = Math.abs(this.field1541);
                ++field1536;
                if (this.field1541 >= 4096) {
                    this.field1541 = 4095;
                }
                this.method1008((byte) (this.field1541 >> 4), 0, this.field1540++);
                this.field1541 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1549[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V", line = 23)
    public final void method513(byte arg0) {
        try {
            if (arg0 >= 95) {
                this.field1540 = 0;
                ++field1542;
                this.field1541 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1549[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(Z)V", line = 36)
    public static void method1005(boolean arg0) {
        try {
            field1548 = null;
            if (arg0) {
                field1538 = -29;
            }
            field1547 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1549[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(III)Z", line = 59)
    public static final boolean method1006(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 458752) {
                return false;
            } else {
                ++field1543;
                return class654.method4771(arg0, -109, arg2) | (458752 & arg0) != 0 || class735.method5336(20889, arg2, arg0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1549[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(IIIIIF)V", line = 73)
    public class108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field1537 = new int[super.field607];
            for (int var7 = 0; ~var7 > ~super.field607; ++var7) {
                this.field1537[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1549[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lgda;III)Lkc;", line = 90)
    public static final class141 method1007(class58 arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 <= 96) {
                field1548 = null;
            }
            ++field1546;
            byte[] var4 = arg0.method604((byte) -120, arg2, arg1);
            return var4 == null ? null : new class141(var4);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1549[6] + (arg0 != null ? field1549[8] : field1549[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(BII)V", line = 112)
    public void method1008(byte arg0, int arg1, int arg2) {
        try {
            this.field1544[this.field1540++] = (byte) ((class292.method2485(255, arg0) >> 1) + 127);
            ++field1545;
            if (arg1 != 0) {
                this.method520(-10, -9, (byte) 89);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1549[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIB)V", line = 128)
    public final void method520(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 >= 75) {
                this.field1541 += this.field1537[arg1] * arg0 >> 12;
                ++field1539;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1549[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1009(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1010(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
