import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DXQCGOAI")
public class class7 extends class6 {

    @OriginalMember(owner = "DXQCGOAI", name = "n", descriptor = "Z")
    public boolean field643 = false;

    @OriginalMember(owner = "DXQCGOAI", name = "s", descriptor = "Z")
    private boolean field648 = false;

    @OriginalMember(owner = "DXQCGOAI", name = "t", descriptor = "I")
    private int field649 = -7552;

    @OriginalMember(owner = "DXQCGOAI", name = "w", descriptor = "I")
    private int field652 = 8;

    @OriginalMember(owner = "DXQCGOAI", name = "m", descriptor = "LIDBAHLFM;")
    private class22 field642;

    @OriginalMember(owner = "DXQCGOAI", name = "o", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "DXQCGOAI", name = "p", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "DXQCGOAI", name = "q", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "DXQCGOAI", name = "r", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "DXQCGOAI", name = "l", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "DXQCGOAI", name = "u", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "DXQCGOAI", name = "v", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "DXQCGOAI", name = "<init>", descriptor = "(IIIIIIII)V")
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field642 = class22.field913[arg6];
        if (arg4 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field644 = arg3;
        this.field645 = arg1;
        this.field646 = arg0;
        this.field647 = arg7;
        this.field641 = arg2 + arg5;
        this.field643 = false;
    }

    @OriginalMember(owner = "DXQCGOAI", name = "a", descriptor = "(II)V")
    public final void method222(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field648 = !this.field648;
        }
        this.field651 += arg1;
        while (true) {
            do {
                do {
                    if (this.field651 <= this.field642.field917.method241(true, this.field650)) {
                        return;
                    }
                    this.field651 -= this.field642.field917.method241(true, this.field650) + 1;
                    this.field650++;
                } while (this.field650 < this.field642.field917.field683);
            } while (this.field650 >= 0 && this.field650 < this.field642.field917.field683);
            this.field650 = 0;
            this.field643 = true;
        }
    }

    @OriginalMember(owner = "DXQCGOAI", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        class17 var2 = this.field642.method323();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field642.field917.field684[this.field650];
        if (arg0 != -43) {
            this.field649 = -184;
        }
        class17 var4 = new class17((byte) -59, class48.method504(var3, 3), var2, false, true);
        if (!this.field643) {
            var4.method292(-20376);
            var4.method293((byte) 1, var3);
            var4.field844 = null;
            var4.field843 = null;
        }
        if (this.field642.field920 != 128 || this.field642.field921 != 128) {
            var4.method301(this.field642.field921, this.field642.field920, (byte) 9, this.field642.field920);
        }
        if (this.field642.field922 != 0) {
            if (this.field642.field922 == 90) {
                var4.method296(this.field652);
            }
            if (this.field642.field922 == 180) {
                var4.method296(this.field652);
                var4.method296(this.field652);
            }
            if (this.field642.field922 == 270) {
                var4.method296(this.field652);
                var4.method296(this.field652);
                var4.method296(this.field652);
            }
        }
        var4.method302(this.field642.field923 + 64, this.field642.field924 + 850, -30, -50, -30, true);
        return var4;
    }
}
