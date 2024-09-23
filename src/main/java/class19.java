import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GCMSALIP")
public class class19 extends class30 {

    @OriginalMember(owner = "GCMSALIP", name = "q", descriptor = "B")
    private byte field789 = 3;

    @OriginalMember(owner = "GCMSALIP", name = "r", descriptor = "Z")
    public boolean field790 = false;

    @OriginalMember(owner = "GCMSALIP", name = "v", descriptor = "B")
    private byte field794 = 23;

    @OriginalMember(owner = "GCMSALIP", name = "p", descriptor = "LBKJQHSVH;")
    private class6 field788;

    @OriginalMember(owner = "GCMSALIP", name = "l", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "GCMSALIP", name = "m", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "GCMSALIP", name = "n", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "GCMSALIP", name = "o", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "GCMSALIP", name = "s", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "GCMSALIP", name = "t", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "GCMSALIP", name = "u", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "GCMSALIP", name = "a", descriptor = "(II)V")
    public final void method212(int arg0, int arg1) {
        this.field793 += arg1;
        if (arg0 <= 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field793 <= this.field788.field65.method319(this.field792, this.field789)) {
                        return;
                    }
                    this.field793 -= this.field788.field65.method319(this.field792, this.field789) + 1;
                    this.field792++;
                } while (this.field792 < this.field788.field65.field1188);
            } while (this.field792 >= 0 && this.field792 < this.field788.field65.field1188);
            this.field792 = 0;
            this.field790 = true;
        }
    }

    @OriginalMember(owner = "GCMSALIP", name = "<init>", descriptor = "(IIIIIIII)V")
    public class19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field788 = class6.field61[arg7];
        this.field784 = arg0;
        this.field785 = arg4;
        this.field786 = arg2;
        this.field787 = arg6;
        this.field791 = arg3 + arg5;
        this.field790 = false;
        int var9 = 90 / arg1;
    }

    @OriginalMember(owner = "GCMSALIP", name = "a", descriptor = "(I)LVYUQHOMO;")
    public final class66 method13(int arg0) {
        class66 var2 = this.field788.method16();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field788.field65.field1189[this.field792];
        class66 var4 = new class66(true, class2.method11((byte) 85, var3), var2, this.field794, false);
        if (!this.field790) {
            var4.method414((byte) 56);
            var4.method415(var3, 3);
            var4.field1511 = null;
            var4.field1510 = null;
        }
        if (this.field788.field68 != 128 || this.field788.field69 != 128) {
            var4.method423(this.field788.field68, this.field788.field69, this.field788.field68, 0);
        }
        if (this.field788.field70 != 0) {
            if (this.field788.field70 == 90) {
                var4.method418((byte) 2);
            }
            if (this.field788.field70 == 180) {
                var4.method418((byte) 2);
                var4.method418((byte) 2);
            }
            if (this.field788.field70 == 270) {
                var4.method418((byte) 2);
                var4.method418((byte) 2);
                var4.method418((byte) 2);
            }
        }
        var4.method424(this.field788.field71 + 64, this.field788.field72 + 850, -30, -50, -30, true);
        if (arg0 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        return var4;
    }
}
