import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class588 extends class211 {

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "[Ljava/lang/String;")
    private static final String[] field8660 = new String[] { method4384(method4383("uk_g\t")), method4384(method4383("kk\u001dO")), method4384(method4383("~0_\r\\")), method4384(method4383("uk_`\t")), method4384(method4383("uk_\u001fHkw\u0005\u001d\t")), method4384(method4383("uk_b\t")), method4384(method4383("uk_j\t")) };

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public static int field8654 = 0;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
    public static int field8652 = 0;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public static int field8657 = 0;

    @OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    private int field8649;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    private int field8653;

    @OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
    private int field8658;

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!pu", name = "G", descriptor = "J")
    public static long field8651;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BILib;)V", line = 4)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 == 0) {
                this.method4381(arg2.method1436((byte) 88), (byte) -103);
            }
            if (arg0 < 67) {
                method4382((float[]) null, 30, true);
            }
            ++field8659;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8660[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8660[2] : field8660[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)V", line = 34)
    private final void method4381(int arg0, byte arg1) {
        try {
            this.field8653 = (16711680 & arg0) >> 12;
            ++field8650;
            if (arg1 == -103) {
                this.field8658 = (arg0 & 65280) >> 4;
                this.field8649 = (arg0 & 255) << 4;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8660[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I", line = 49)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field8647;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class343.field5332 > var7; ++var7) {
                    var4[var7] = this.field8653;
                    var5[var7] = this.field8658;
                    var6[var7] = this.field8649;
                }
            }
            if (arg1 >= -38) {
                this.field8658 = 37;
            }
            return var3;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8660[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "([FIZ)[F", line = 92)
    public static final float[] method4382(float[] arg0, int arg1, boolean arg2) {
        try {
            if (arg2) {
                field8651 = -97L;
            }
            ++field8648;
            float[] var3 = new float[arg1];
            class467.method3550(arg0, 0, var3, 0, arg1);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8660[0] + (arg0 != null ? field8660[2] : field8660[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V", line = 109)
    public class588() {
        this(0);
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(I)V", line = 122)
    private class588(int arg0) {
        super(0, false);
        try {
            this.method4381(arg0, (byte) -103);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8660[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4383(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4384(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
