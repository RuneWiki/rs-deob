import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class541 {

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[J")
    public static long[] field294 = new long[100];

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "Z")
    public static boolean field304 = true;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[[I")
    public static int[][] field306 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "F")
    private float field292;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "F")
    private float field309;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "Ljava/lang/String;")
    private String field301;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/String;")
    private String field302;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Ljava/lang/String;")
    private String field307;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 5)
    public class15(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)F", line = 11)
    public final float method105(byte arg0) {
        if (arg0 > -41) {
            return 0.36926714F;
        } else {
            ++field298;
            return this.field292;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V", line = 25)
    public static void method106(boolean arg0) {
        field294 = null;
        field306 = null;
        if (!arg0) {
            field299 = 39;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 36)
    public final void method58(byte arg0, OggPacket arg1) {
        ++field295;
        if (super.field7488 <= 0 || "SUB".equals(this.field302)) {
            if (arg0 != 61) {
                method106(false);
            }
            class461 var3 = new class461(arg1.getData());
            int var4 = var3.method2600((byte) -124);
            if (super.field7488 > 8) {
                if (~var4 == -1) {
                    long var5 = var3.method2610(arg0 + 47);
                    long var7 = var3.method2610(98);
                    long var9 = var3.method2610(arg0 + 65);
                    if (~var5 > -1L || ~var7 > -1L || var9 < 0L || ~var9 < ~var5) {
                        throw new IllegalStateException();
                    }
                    this.field309 = (float) ((var5 + var7) * (long) this.field300) / (float) this.field305;
                    this.field292 = (float) ((long) this.field300 * var5) / (float) this.field305;
                    int var11 = var3.method2575(94);
                    if (var11 < 0 || var3.field6180.length + -var3.field6193 < var11) {
                        throw new IllegalStateException();
                    }
                    this.field307 = class684.method3844(var11, var3.field6180, (byte) -85, var3.field6193);
                }
                if ((var4 | 128) != 0) {
                    return;
                }
            } else {
                if ((var4 | 128) == 0) {
                    throw new IllegalStateException();
                }
                if (super.field7488 != 0) {
                    return;
                }
                var3.field6193 += 23;
                this.field305 = var3.method2575(112);
                this.field300 = var3.method2575(arg0 ^ 87);
                if (this.field305 == 0 || ~this.field300 == -1) {
                    throw new IllegalStateException();
                }
                class461 var12 = new class461(16);
                var3.method2573(var12.field6180, (byte) -77, 16, 0);
                this.field301 = var12.method2574(-1);
                var12.field6193 = 0;
                var3.method2573(var12.field6180, (byte) -77, 16, 0);
                this.field302 = var12.method2574(arg0 + -62);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)F", line = 112)
    public final float method107(int arg0) {
        if (arg0 != 11114) {
            this.method58((byte) -62, (OggPacket) null);
        }
        ++field296;
        return this.field309;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 123)
    public final String method108(boolean arg0) {
        if (arg0) {
            this.method62(true);
        }
        ++field293;
        return this.field301;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Ljava/lang/String;", line = 142)
    public final String method109(byte arg0) {
        ++field308;
        int var2 = 96 % ((-17 - arg0) / 63);
        return this.field307;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I", line = 160)
    public static final int method110(int arg0) {
        if (arg0 != 0) {
            field306 = null;
        }
        ++field291;
        int var1 = class607.field8439.method1844(arg0 + 13);
        if (~(class400.field5095.length + -1) < ~var1) {
            class607.field8439 = class400.field5095[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 178)
    public final void method62(boolean arg0) {
        ++field297;
        if (arg0) {
            this.method108(false);
        }
    }
}
