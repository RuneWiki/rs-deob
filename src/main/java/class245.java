import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class245 {

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    private int field3411 = -1;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    private int field3413 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lwo;")
    private class522 field3407 = new class522();

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
    public boolean field3420 = false;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    private int field3416;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    private int field3410;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[Lks;")
    private class301[] field3408;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[[[I")
    private int[][][] field3418;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Luf;")
    public static class310 field3409 = new class310(80, 8);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field3419 = -1;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lel;")
    public static class383 field3415;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[[B")
    public static byte[][] field3417;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 4)
    public final void method1449(int arg0) {
        for (int var2 = 0; var2 < this.field3410; var2++) {
            this.field3418[var2][0] = null;
            this.field3418[var2][1] = null;
            this.field3418[var2][2] = null;
            this.field3418[var2] = null;
        }
        field3412++;
        this.field3418 = null;
        this.field3408 = null;
        this.field3407.method3076((byte) -89);
        if (arg0 == -21929) {
            this.field3407 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[[I", line = 35)
    public final int[][] method1450(int arg0, int arg1) {
        if (arg1 != -1) {
            field3415 = null;
        }
        field3414++;
        if (this.field3416 == this.field3410) {
            this.field3420 = this.field3408[arg0] == null;
            this.field3408[arg0] = class117.field1577;
            return this.field3418[arg0];
        } else if (this.field3410 == 1) {
            this.field3420 = this.field3411 != arg0;
            this.field3411 = arg0;
            return this.field3418[0];
        } else {
            class301 var3 = this.field3408[arg0];
            if (var3 == null) {
                this.field3420 = true;
                if (this.field3413 < this.field3410) {
                    var3 = new class301(arg0, this.field3413);
                    this.field3413++;
                } else {
                    class301 var4 = (class301) this.field3407.method3077((byte) -110);
                    var3 = new class301(arg0, var4.field4132);
                    this.field3408[var4.field4133] = null;
                    var4.method2946(-122);
                }
                this.field3408[arg0] = var3;
            } else {
                this.field3420 = false;
            }
            this.field3407.method3069(var3, 2);
            return this.field3418[var3.field4132];
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 103)
    public static void method1451(byte arg0) {
        field3409 = null;
        field3415 = null;
        field3417 = null;
        if (arg0 < 89) {
            method1451((byte) -60);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)[[[I", line = 116)
    public final int[][][] method1452(byte arg0) {
        field3406++;
        if (this.field3416 != this.field3410) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 54) {
            method1451((byte) -108);
        }
        while (this.field3410 > var2) {
            this.field3408[var2] = class117.field1577;
            var2++;
        }
        return this.field3418;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(III)V", line = 165)
    public class245(int arg0, int arg1, int arg2) {
        this.field3416 = arg1;
        this.field3410 = arg0;
        this.field3408 = new class301[this.field3416];
        this.field3418 = new int[this.field3410][3][arg2];
    }
}
