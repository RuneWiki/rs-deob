import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class381 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field5320 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Z")
    private boolean field5322 = false;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field5333 = 0;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lim;")
    public static class353 field5332 = new class353(24, 8);

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljq;")
    public static class447 field5334 = null;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Lvk;")
    public static class414 field5335 = new class414("WIP", 2);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    private int field5321;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field5336;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "J")
    public long field5328;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)I")
    public static final int method2317(int arg0, byte[] arg1, int arg2) {
        if (arg0 <= 111) {
            method2319((byte) -36);
        }
        field5337++;
        return class134.method705(arg2, arg1, 0, -25491000);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILge;)V")
    private final void method2318(byte arg0, int arg1, class551 arg2) {
        field5323++;
        if (arg1 == 1) {
            this.field5321 = arg2.method3090(-100);
        } else if (arg1 == 2) {
            arg2.method3045(arg0 ^ 0xFFFFFFC2);
        } else if (arg1 == 3) {
            this.field5336 = arg2.method3048(arg0 - 68);
            this.field5326 = arg2.method3048(-4);
            this.field5319 = arg2.method3048(-4);
        } else if (arg1 == 4) {
            this.field5327 = arg2.method3045(-126);
            this.field5317 = arg2.method3048(arg0 - 68);
        } else if (arg1 == 6) {
            this.field5331 = arg2.method3045(arg0 - 192);
        } else if (arg1 == 8) {
            this.field5333 = 1;
        } else if (arg1 == 9) {
            this.field5320 = 1;
        } else if (arg1 == 10) {
            this.field5322 = true;
        }
        if (arg0 != 64) {
            method2317(64, null, -113);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method2319(byte arg0) {
        int var1 = -71 / ((arg0 + 53) / 50);
        field5335 = null;
        field5332 = null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILge;)V")
    public final void method2320(int arg0, class551 arg1) {
        while (true) {
            int var3 = arg1.method3045(arg0 - 128);
            if (var3 == 0) {
                field5325++;
                if (arg0 != 2) {
                    this.field5330 = -121;
                    return;
                }
                return;
            }
            this.method2318((byte) 64, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method2321(byte arg0) {
        field5329++;
        this.field5318 = class310.field3965[this.field5321 << 3];
        if (arg0 <= 104) {
            return;
        }
        this.field5324 = (int) Math.sqrt((double) (this.field5319 * this.field5319 + this.field5336 * this.field5336 + this.field5326 * this.field5326));
        if (this.field5317 == 0) {
            this.field5317 = 1;
        }
        if (this.field5327 == 0) {
            this.field5328 = 2147483647L;
        } else if (this.field5327 == 1) {
            this.field5328 = (this.field5324 * 8 / this.field5317);
            this.field5328 *= this.field5328;
        } else if (this.field5327 == 2) {
            this.field5328 = (this.field5324 * 8 / this.field5317);
        }
        if (this.field5322) {
            this.field5324 *= -1;
        }
    }
}
