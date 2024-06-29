import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZVYASFEK")
public class class72 extends class68 {

    @OriginalMember(owner = "client!ZVYASFEK", name = "p", descriptor = "Z")
    public boolean field1747 = false;

    @OriginalMember(owner = "client!ZVYASFEK", name = "q", descriptor = "LJXKRPXFX;")
    private class24 field1748;

    @OriginalMember(owner = "client!ZVYASFEK", name = "l", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!ZVYASFEK", name = "m", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!ZVYASFEK", name = "n", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!ZVYASFEK", name = "o", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!ZVYASFEK", name = "t", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ZVYASFEK", name = "r", descriptor = "I")
    private int field1749;

    @OriginalMember(owner = "client!ZVYASFEK", name = "s", descriptor = "I")
    private int field1750;

    @OriginalMember(owner = "client!ZVYASFEK", name = "<init>", descriptor = "(IIIIIBII)V")
    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        this.field1748 = class24.field759[arg6];
        this.field1743 = arg3;
        this.field1744 = arg0;
        this.field1745 = arg7;
        this.field1746 = arg4;
        this.field1751 = arg1 + arg2;
        if (arg5 != 31) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field1747 = false;
    }

    @OriginalMember(owner = "client!ZVYASFEK", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        class28 var2 = this.field1748.method308();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1748.field763.field1115[this.field1749];
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        class28 var4 = new class28(var2, false, true, class53.method455(true, var3), 584);
        if (!this.field1747) {
            var4.method337(4);
            var4.method338(false, var3);
            var4.field849 = null;
            var4.field848 = null;
        }
        if (this.field1748.field766 != 128 || this.field1748.field767 != 128) {
            var4.method346(this.field1748.field766, this.field1748.field766, -480, this.field1748.field767);
        }
        if (this.field1748.field768 != 0) {
            if (this.field1748.field768 == 90) {
                var4.method341(-186);
            }
            if (this.field1748.field768 == 180) {
                var4.method341(-186);
                var4.method341(-186);
            }
            if (this.field1748.field768 == 270) {
                var4.method341(-186);
                var4.method341(-186);
                var4.method341(-186);
            }
        }
        var4.method347(this.field1748.field769 + 64, this.field1748.field770 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!ZVYASFEK", name = "a", descriptor = "(IB)V")
    public final void method605(int arg0, byte arg1) {
        if (arg1 != 9) {
            return;
        }
        boolean var3 = false;
        this.field1750 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1750 <= this.field1748.field763.method405(-251, this.field1749)) {
                        return;
                    }
                    this.field1750 -= this.field1748.field763.method405(-251, this.field1749);
                    this.field1749++;
                } while (this.field1749 < this.field1748.field763.field1114);
            } while (this.field1749 >= 0 && this.field1749 < this.field1748.field763.field1114);
            this.field1749 = 0;
            this.field1747 = true;
        }
    }
}
