import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class149 extends class448 {

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "F")
    private float field2321;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "F")
    public static float field2322;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "F")
    private float field2330;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    private int field2334;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "Ljava/lang/String;")
    private String field2327;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "Ljava/lang/String;")
    private String field2328;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Ljava/lang/String;")
    private String field2331;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class149(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)F")
    public final float method1128(byte arg0) {
        ++field2324;
        if (arg0 != 83) {
            method1135((byte) -62, -104);
        }
        return this.field2330;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILha;)V")
    public static final void method1129(int arg0, class544 arg1) {
        ++field2326;
        if (arg0 != 0) {
            field2322 = -0.9981413F;
        }
        if (!class207.field3468) {
            class632.method3579(true, arg1);
        } else {
            class652.method3666(arg1, 255);
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method1130(byte arg0) {
        ++field2320;
        if (arg0 != -57) {
            this.field2334 = 72;
        }
        return this.field2327;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)F")
    public final float method1131(int arg0) {
        ++field2325;
        return arg0 != 14615 ? 1.0217617F : this.field2321;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method1132(OggPacket arg0, byte arg1) {
        ++field2332;
        if (super.field6534 <= 0 || "SUB".equals(this.field2328)) {
            if (arg1 != -5) {
                this.field2321 = 0.24797426F;
            }
            class301 var3 = new class301(arg0.getData());
            int var4 = var3.method1987(-113);
            if (~super.field6534 >= -9) {
                if (~(128 | var4) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field6534 == 0) {
                    var3.field4534 += 23;
                    this.field2319 = var3.method1932(-27559);
                    this.field2334 = var3.method1932(arg1 + -27554);
                    if (~this.field2319 != -1 && ~this.field2334 != -1) {
                        class301 var5 = new class301(16);
                        var3.method1936(0, arg1 + 10051, 16, var5.field4543);
                        this.field2327 = var5.method1958(-3438);
                        var5.field4534 = 0;
                        var3.method1936(0, 10046, 16, var5.field4543);
                        this.field2328 = var5.method1958(arg1 ^ 3433);
                        return;
                    }
                    throw new IllegalStateException();
                }
            } else {
                if (var4 == 0) {
                    long var6 = var3.method1951((byte) -110);
                    long var8 = var3.method1951((byte) -107);
                    long var10 = var3.method1951((byte) -97);
                    if (~var6 > -1L || var8 < 0L || ~var10 > -1L || var6 < var10) {
                        throw new IllegalStateException();
                    }
                    this.field2330 = (float) ((long) this.field2334 * var6) / (float) this.field2319;
                    this.field2321 = (float) ((var6 + var8) * (long) this.field2334) / (float) this.field2319;
                    int var12 = var3.method1932(-27559);
                    if (~var12 > -1 || var12 > var3.field4543.length + -var3.field4534) {
                        throw new IllegalStateException();
                    }
                    this.field2331 = class502.method3037(var3.field4543, var3.field4534, var12, arg1 + -124);
                }
                if ((128 | var4) != 0) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method1133(int arg0) {
        if (arg0 != 0) {
            this.method1132((OggPacket) null, (byte) -97);
        }
        ++field2329;
        return this.field2331;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method1134(int arg0) {
        ++field2323;
        if (arg0 > -18) {
            this.method1133(-74);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Z")
    public static final boolean method1135(byte arg0, int arg1) {
        ++field2333;
        if (arg0 != 67) {
            method1129(-112, (class544) null);
        }
        return arg1 >= 12 && arg1 <= 17;
    }
}
