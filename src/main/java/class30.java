import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class30 extends class17 {

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "[J")
    private long[] field417 = new long[10];

    @OriginalMember(owner = "mapview!q", name = "o", descriptor = "I")
    public static int field420 = 50;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "Ll;")
    public static class22 field415 = class33.method229("Hunter Store", -79);

    @OriginalMember(owner = "mapview!q", name = "v", descriptor = "Ll;")
    public static class22 field427 = class33.method229(" map", -74);

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "mapview!q", name = "r", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "mapview!q", name = "s", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "mapview!q", name = "u", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "J")
    private long field419;

    @OriginalMember(owner = "mapview!q", name = "q", descriptor = "J")
    public static long field422;

    @OriginalMember(owner = "mapview!q", name = "p", descriptor = "Lb;")
    public static class3 field421;

    @OriginalMember(owner = "mapview!q", name = "t", descriptor = "[[B")
    public static byte[][] field425;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)B", line = 19)
    public static final byte method207(int arg0) {
        if (arg0 != -6726) {
            field421 = null;
        }
        return class3.field22 == null ? 0 : class3.field22[class35.field471];
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(III)I", line = 41)
    public final int method96(int arg0, int arg1, int arg2) {
        if (arg0 != 13306) {
            method209(-40, null, -10, -62);
        }
        int var4 = this.field424;
        this.field424 = 300;
        int var5 = this.field416;
        this.field416 = 1;
        this.field419 = class28.method202((byte) -60);
        if (this.field417[this.field426] == 0L) {
            this.field424 = var4;
            this.field416 = var5;
        } else if (this.field417[this.field426] < this.field419) {
            this.field424 = (int) ((long) (arg1 * 2560) / (this.field419 - this.field417[this.field426]));
        }
        if (this.field424 < 25) {
            this.field424 = 25;
        }
        if (this.field424 > 256) {
            this.field424 = 256;
            this.field416 = (int) ((long) arg1 - (this.field419 - this.field417[this.field426]) / 10L);
        }
        if (this.field416 > arg1) {
            this.field416 = arg1;
        }
        this.field417[this.field426] = this.field419;
        this.field426 = (this.field426 + 1) % 10;
        if (this.field416 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field417[var6] != 0L) {
                    this.field417[var6] -= -((long) this.field416);
                }
            }
        }
        if (arg2 > this.field416) {
            this.field416 = arg2;
        }
        class5.method26((byte) 105, (long) this.field416);
        int var7 = 0;
        while (this.field418 < 256) {
            this.field418 += this.field424;
            var7++;
        }
        this.field418 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)I", line = 118)
    public static final int method208(int arg0) {
        if (arg0 == 0) {
            return class38.field508 == null ? 0 : class38.field508[class35.field471];
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 242)
    public class30() {
        this.method97((byte) -128);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 171)
    public final void method97(byte arg0) {
        this.field424 = 256;
        this.field418 = 0;
        this.field416 = 1;
        this.field419 = class28.method202((byte) 34);
        if (arg0 > -126) {
            method210(-116);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field417[var2] = this.field419;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I[BII)Ll;", line = 199)
    public static final class22 method209(int arg0, byte[] arg1, int arg2, int arg3) {
        class22 var4 = new class22();
        var4.field213 = 0;
        var4.field215 = new byte[arg3];
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field215[var4.field213++] = arg1[var5];
            }
        }
        if (arg0 != 10) {
            method209(-115, null, -80, 110);
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "(I)V", line = 228)
    public static void method210(int arg0) {
        field415 = null;
        if (arg0 != 10) {
            method207(55);
        }
        field425 = null;
        field421 = null;
        field427 = null;
    }
}
