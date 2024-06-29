import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class34 {

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    private int field415 = 0;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    private int field418 = -1;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "Low;")
    private class665 field416 = new class665();

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Z")
    public boolean field425 = false;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "[Lkka;")
    private class518[] field421;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "[[[I")
    private int[][][] field424;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "J")
    public static long field414;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(III)V", line = 146)
    public class34(int arg0, int arg1, int arg2) {
        this.field413 = arg1;
        this.field412 = arg0;
        this.field421 = new class518[this.field413];
        this.field424 = new int[this.field412][3][arg2];
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)[[[I", line = 11)
    public final int[][][] method273(int arg0) {
        field419++;
        if (this.field413 != this.field412) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field412; var2++) {
            this.field421[var2] = class290.field4237;
        }
        return this.field424;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 35)
    public final void method274(int arg0) {
        if (arg0 < 123) {
            this.field421 = null;
        }
        for (int var2 = 0; var2 < this.field412; var2++) {
            this.field424[var2][0] = null;
            this.field424[var2][1] = null;
            this.field424[var2][2] = null;
            this.field424[var2] = null;
        }
        field420++;
        this.field421 = null;
        this.field424 = null;
        this.field416.method3735(-4676);
        this.field416 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)[[I", line = 66)
    public final int[][] method275(int arg0, int arg1) {
        if (arg0 != 26422) {
            this.field421 = null;
        }
        field417++;
        if (this.field413 == this.field412) {
            this.field425 = this.field421[arg1] == null;
            this.field421[arg1] = class290.field4237;
            return this.field424[arg1];
        } else if (this.field412 == 1) {
            this.field425 = this.field418 != arg1;
            this.field418 = arg1;
            return this.field424[0];
        } else {
            class518 var3 = this.field421[arg1];
            if (var3 == null) {
                this.field425 = true;
                if (this.field412 > this.field415) {
                    var3 = new class518(arg1, this.field415);
                    this.field415++;
                } else {
                    class518 var4 = (class518) this.field416.method3724((byte) -60);
                    var3 = new class518(arg1, var4.field7113);
                    this.field421[var4.field7112] = null;
                    var4.method4237(arg0 ^ 0xFFFF98C9);
                }
                this.field421[arg1] = var3;
            } else {
                this.field425 = false;
            }
            this.field416.method3725(var3, (byte) -59);
            return this.field424[var3.field7113];
        }
    }
}
