import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class31 extends class1 {

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "[J")
    private long[] field417 = new long[10];

    @OriginalMember(owner = "mapview!q", name = "p", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "mapview!q", name = "s", descriptor = "Lh;")
    public static class15 field423 = class26.method190(true, "Quest Start");

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "Lh;")
    public static class15 field418 = class26.method190(true, "Hair Dressers");

    @OriginalMember(owner = "mapview!q", name = "w", descriptor = "Lh;")
    public static class15 field427 = class26.method190(true, "u_pass");

    @OriginalMember(owner = "mapview!q", name = "t", descriptor = "Lh;")
    public static class15 field424 = class26.method190(true, "Shield Shop");

    @OriginalMember(owner = "mapview!q", name = "y", descriptor = "Lh;")
    public static class15 field429 = class26.method190(true, " map");

    @OriginalMember(owner = "mapview!q", name = "q", descriptor = "I")
    public static int field421 = 0;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "mapview!q", name = "o", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "mapview!q", name = "r", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "mapview!q", name = "v", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "mapview!q", name = "x", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "mapview!q", name = "u", descriptor = "J")
    private long field425;

    @OriginalMember(owner = "mapview!q", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field430;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILaa;II)Z", line = 31)
    public static final boolean method226(int arg0, class2 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method40(arg3, arg0, -128);
        if (arg2 != 0) {
            field416 = 47;
        }
        if (var4 == null) {
            return false;
        } else {
            class15.method121((byte) 91, var4);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 124)
    public class31() {
        this.method25(188);
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "(I)V", line = 50)
    public static void method227(int arg0) {
        field424 = null;
        field430 = null;
        if (arg0 != 0) {
            method226(-98, null, -69, 117);
        }
        field423 = null;
        field427 = null;
        field429 = null;
        field418 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 87)
    public final void method25(int arg0) {
        this.field419 = 0;
        this.field415 = 1;
        this.field428 = 256;
        this.field425 = System.currentTimeMillis();
        if (arg0 == 188) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field417[var2] = this.field425;
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IBI)I", line = 142)
    public final int method30(int arg0, byte arg1, int arg2) {
        int var4 = this.field428;
        this.field428 = 300;
        int var5 = this.field415;
        this.field415 = 1;
        this.field425 = System.currentTimeMillis();
        if (this.field417[this.field426] == 0L) {
            this.field428 = var4;
            this.field415 = var5;
        } else if (this.field417[this.field426] < this.field425) {
            this.field428 = (int) ((long) (arg0 * 2560) / (this.field425 - this.field417[this.field426]));
        }
        if (this.field428 < 25) {
            this.field428 = 25;
        }
        if (this.field428 > 256) {
            this.field428 = 256;
            this.field415 = (int) ((long) arg0 - (this.field425 - this.field417[this.field426]) / 10L);
        }
        if (arg0 < this.field415) {
            this.field415 = arg0;
        }
        this.field417[this.field426] = this.field425;
        this.field426 = (this.field426 + 1) % 10;
        if (this.field415 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field417[var6] != 0L) {
                    this.field417[var6] += this.field415;
                }
            }
        }
        if (arg2 > this.field415) {
            this.field415 = arg2;
        }
        class36.method239(-110, (long) this.field415);
        int var7 = 0;
        while (this.field419 < 256) {
            this.field419 += this.field428;
            var7++;
        }
        if (arg1 <= 35) {
            method227(48);
        }
        this.field419 &= 0xFF;
        return var7;
    }
}
