import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GOHSICMY")
public class class18 extends class67 {

    @OriginalMember(owner = "client!GOHSICMY", name = "l", descriptor = "Z")
    public boolean field762 = false;

    @OriginalMember(owner = "client!GOHSICMY", name = "u", descriptor = "I")
    private int field771 = -52;

    @OriginalMember(owner = "client!GOHSICMY", name = "m", descriptor = "LMBSSGBHW;")
    private class34 field763;

    @OriginalMember(owner = "client!GOHSICMY", name = "n", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!GOHSICMY", name = "o", descriptor = "I")
    public int field765;

    @OriginalMember(owner = "client!GOHSICMY", name = "p", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!GOHSICMY", name = "q", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!GOHSICMY", name = "t", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!GOHSICMY", name = "r", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!GOHSICMY", name = "s", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!GOHSICMY", name = "a", descriptor = "(II)V")
    public final void method221(int arg0, int arg1) {
        if (arg0 >= 0) {
            return;
        }
        this.field769 += arg1;
        while (true) {
            do {
                do {
                    if (this.field769 <= this.field763.field1057.method308(6, this.field768)) {
                        return;
                    }
                    this.field769 -= this.field763.field1057.method308(6, this.field768) + 1;
                    this.field768++;
                } while (this.field768 < this.field763.field1057.field953);
            } while (this.field768 >= 0 && this.field768 < this.field763.field1057.field953);
            this.field768 = 0;
            this.field762 = true;
        }
    }

    @OriginalMember(owner = "client!GOHSICMY", name = "<init>", descriptor = "(IIIIIIII)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field763 = class34.field1053[arg1];
        this.field764 = arg0;
        this.field765 = arg5;
        this.field766 = arg3;
        this.field767 = arg7;
        this.field770 = arg2 + arg6;
        int var9 = 63 / arg4;
        this.field762 = false;
    }

    @OriginalMember(owner = "client!GOHSICMY", name = "a", descriptor = "(B)LPDVZPZLT;")
    public final class42 method3(byte arg0) {
        class42 var2 = this.field763.method343();
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field771 = 118;
        }
        if (var2 == null) {
            return null;
        }
        int var4 = this.field763.field1057.field954[this.field768];
        class42 var5 = new class42(var2, true, class71.method602(var4, true), 0, false);
        if (!this.field762) {
            var5.method421(0);
            var5.method422(0, var4);
            var5.field1328 = null;
            var5.field1327 = null;
        }
        if (this.field763.field1060 != 128 || this.field763.field1061 != 128) {
            var5.method430(this.field763.field1060, this.field763.field1061, this.field763.field1060, (byte) 6);
        }
        if (this.field763.field1062 != 0) {
            if (this.field763.field1062 == 90) {
                var5.method425(9);
            }
            if (this.field763.field1062 == 180) {
                var5.method425(9);
                var5.method425(9);
            }
            if (this.field763.field1062 == 270) {
                var5.method425(9);
                var5.method425(9);
                var5.method425(9);
            }
        }
        var5.method431(this.field763.field1063 + 64, this.field763.field1064 + 850, -30, -50, -30, true);
        return var5;
    }
}
