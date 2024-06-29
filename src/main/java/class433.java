import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class433 extends class464 {

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Lega;")
    public static class473 field5672 = new class473("runescape", 0);

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field5674 = 0;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "F")
    private float field5671;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "F")
    private float field5682;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    private int field5680;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Ljava/lang/String;")
    private String field5670;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "Ljava/lang/String;")
    private String field5676;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Ljava/lang/String;")
    private String field5685;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final void method508(int arg0) {
        if (arg0 <= 27) {
            this.method2488((byte) 48);
        }
        ++field5686;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
    public static final boolean method2484(int arg0, int arg1, int arg2) {
        ++field5683;
        if (~arg2 <= -1 && arg0 >= 0 && ~class410.field5439[1].length < ~arg2 && ~class410.field5439[1][arg2].length < ~arg0) {
            if (arg1 != 0) {
                method2484(-115, -29, -45);
            }
            return ~(2 & class410.field5439[1][arg2][arg0]) != -1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([SI)[S")
    public static final short[] method2485(short[] arg0, int arg1) {
        ++field5675;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            if (arg1 <= 18) {
                return null;
            } else {
                class642.method3473(arg0, 0, var2, 0, arg0.length);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method510(OggPacket arg0, boolean arg1) {
        ++field5673;
        if (super.field6024 <= 0 || "SUB".equals(this.field5685)) {
            class234 var3 = new class234(arg0.getData());
            int var4 = var3.method1509(arg1);
            if (super.field6024 <= 8) {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field6024 != 0) {
                    return;
                }
                var3.field3133 += 23;
                this.field5680 = var3.method1550(1);
                this.field5679 = var3.method1550(1);
                if (~this.field5680 == -1 || ~this.field5679 == -1) {
                    throw new IllegalStateException();
                }
                class234 var12 = new class234(16);
                var3.method1495(16, 0, (byte) -126, var12.field3193);
                this.field5676 = var12.method1540((byte) -101);
                var12.field3133 = 0;
                var3.method1495(16, 0, (byte) -125, var12.field3193);
                this.field5685 = var12.method1540((byte) -110);
            } else {
                if (var4 == 0) {
                    long var5 = var3.method1518(-58);
                    long var7 = var3.method1518(-58);
                    long var9 = var3.method1518(-58);
                    if (~var5 > -1L || var7 < 0L || ~var9 > -1L || ~var9 < ~var5) {
                        throw new IllegalStateException();
                    }
                    this.field5682 = (float) ((var5 + var7) * (long) this.field5679) / (float) this.field5680;
                    this.field5671 = (float) ((long) this.field5679 * var5) / (float) this.field5680;
                    int var11 = var3.method1550(1);
                    if (var11 < 0 || var3.field3193.length + -var3.field3133 < var11) {
                        throw new IllegalStateException();
                    }
                    this.field5670 = class98.method568(117, var11, var3.field3133, var3.field3193);
                }
                if ((var4 | 128) != 0) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)F")
    public final float method2486(int arg0) {
        if (arg0 != -1) {
            this.field5679 = -50;
        }
        ++field5678;
        return this.field5671;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Low;)V")
    public static final void method2487(class780 arg0) {
        class108.field1468 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)F")
    public final float method2488(byte arg0) {
        if (arg0 < 8) {
            this.field5685 = null;
        }
        ++field5681;
        return this.field5682;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public static void method2489(int arg0) {
        field5672 = null;
        if (arg0 != 0) {
            field5674 = -65;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method2490(byte arg0) {
        if (arg0 != -109) {
            this.field5671 = -1.8358148F;
        }
        ++field5684;
        return this.field5676;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class433(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method2491(int arg0) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field5677;
            return this.field5670;
        }
    }
}
