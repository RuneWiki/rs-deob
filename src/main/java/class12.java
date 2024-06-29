import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FFLRYPKA")
public class class12 extends class35 {

    @OriginalMember(owner = "client!FFLRYPKA", name = "n", descriptor = "B")
    private byte field674 = -126;

    @OriginalMember(owner = "client!FFLRYPKA", name = "o", descriptor = "B")
    private byte field675 = 0;

    @OriginalMember(owner = "client!FFLRYPKA", name = "p", descriptor = "Z")
    private boolean field676 = false;

    @OriginalMember(owner = "client!FFLRYPKA", name = "r", descriptor = "Z")
    public boolean field678 = false;

    @OriginalMember(owner = "client!FFLRYPKA", name = "t", descriptor = "LFOXTQZWB;")
    private class13 field679;

    @OriginalMember(owner = "client!FFLRYPKA", name = "u", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!FFLRYPKA", name = "v", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!FFLRYPKA", name = "w", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!FFLRYPKA", name = "x", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!FFLRYPKA", name = "q", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!FFLRYPKA", name = "y", descriptor = "I")
    private int field684;

    @OriginalMember(owner = "client!FFLRYPKA", name = "z", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!FFLRYPKA", name = "a", descriptor = "(I)LNGYJLUVS;")
    public final class37 method206(int arg0) {
        class37 var2 = this.field679.method210();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field679.field692.field851[this.field684];
        class37 var4 = new class37(class49.method428((byte) 9, var3), true, true, var2, false);
        if (!this.field678) {
            var4.method298(false);
            var4.method299(var3, 0);
            var4.field1027 = null;
            var4.field1026 = null;
        }
        if (this.field679.field695 != 128 || this.field679.field696 != 128) {
            var4.method307(this.field679.field695, true, this.field679.field695, this.field679.field696);
        }
        if (this.field679.field697 != 0) {
            if (this.field679.field697 == 90) {
                var4.method302(-54);
            }
            if (this.field679.field697 == 180) {
                var4.method302(-54);
                var4.method302(-54);
            }
            if (this.field679.field697 == 270) {
                var4.method302(-54);
                var4.method302(-54);
                var4.method302(-54);
            }
        }
        var4.method308(this.field679.field698 + 64, this.field679.field699 + 850, -30, -50, -30, true);
        if (arg0 != -12617) {
            this.field676 = !this.field676;
        }
        return var4;
    }

    @OriginalMember(owner = "client!FFLRYPKA", name = "a", descriptor = "(IB)V")
    public final void method207(int arg0, byte arg1) {
        if (this.field675 == arg1) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field685 += arg0;
        while (true) {
            do {
                do {
                    if (this.field685 <= this.field679.field692.method240((byte) 0, this.field684)) {
                        return;
                    }
                    this.field685 -= this.field679.field692.method240((byte) 0, this.field684) + 1;
                    this.field684++;
                } while (this.field684 < this.field679.field692.field850);
            } while (this.field684 >= 0 && this.field684 < this.field679.field692.field850);
            this.field684 = 0;
            this.field678 = true;
        }
    }

    @OriginalMember(owner = "client!FFLRYPKA", name = "<init>", descriptor = "(IIIIIIIB)V")
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (this.field674 != arg7) {
            throw new NullPointerException();
        }
        this.field679 = class13.field688[arg1];
        this.field680 = arg5;
        this.field681 = arg6;
        this.field682 = arg3;
        this.field683 = arg2;
        this.field677 = arg0 + arg4;
        this.field678 = false;
    }
}
