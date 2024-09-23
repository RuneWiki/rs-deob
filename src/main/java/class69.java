import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YVZOKMUV")
public class class69 extends class1 {

    @OriginalMember(owner = "YVZOKMUV", name = "n", descriptor = "Z")
    private boolean field1549 = false;

    @OriginalMember(owner = "YVZOKMUV", name = "p", descriptor = "I")
    private int field1551 = -723;

    @OriginalMember(owner = "YVZOKMUV", name = "s", descriptor = "Z")
    public boolean field1554 = false;

    @OriginalMember(owner = "YVZOKMUV", name = "r", descriptor = "LOQOGSGFM;")
    private class37 field1553;

    @OriginalMember(owner = "YVZOKMUV", name = "t", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "YVZOKMUV", name = "u", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "YVZOKMUV", name = "v", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "YVZOKMUV", name = "w", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "YVZOKMUV", name = "m", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "YVZOKMUV", name = "k", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "YVZOKMUV", name = "l", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "YVZOKMUV", name = "o", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "YVZOKMUV", name = "q", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "YVZOKMUV", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        class70 var2 = this.field1553.method366();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1553.field974.field763[this.field1546];
        if (!arg0) {
            this.field1549 = !this.field1549;
        }
        class70 var4 = new class70(false, var2, (byte) -15, true, class60.method513(3, var3));
        if (!this.field1554) {
            var4.method558(895);
            var4.method559(var3, -682);
            var4.field1603 = null;
            var4.field1602 = null;
        }
        if (this.field1553.field977 != 128 || this.field1553.field978 != 128) {
            var4.method567(this.field1552, this.field1553.field978, this.field1553.field977, this.field1553.field977);
        }
        if (this.field1553.field979 != 0) {
            if (this.field1553.field979 == 90) {
                var4.method562(false);
            }
            if (this.field1553.field979 == 180) {
                var4.method562(false);
                var4.method562(false);
            }
            if (this.field1553.field979 == 270) {
                var4.method562(false);
                var4.method562(false);
                var4.method562(false);
            }
        }
        var4.method568(this.field1553.field980 + 64, this.field1553.field981 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "YVZOKMUV", name = "<init>", descriptor = "(IIIIIIII)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1553 = class37.field970[arg3];
        this.field1555 = arg5;
        this.field1556 = arg7;
        this.field1557 = arg2;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field1558 = arg4;
        this.field1548 = arg0 + arg6;
        this.field1554 = false;
    }

    @OriginalMember(owner = "YVZOKMUV", name = "a", descriptor = "(IZ)V")
    public final void method546(int arg0, boolean arg1) {
        this.field1547 += arg0;
        if (arg1) {
            this.field1550 = -107;
        }
        while (true) {
            do {
                do {
                    if (this.field1547 <= this.field1553.field974.method251(this.field1551, this.field1546)) {
                        return;
                    }
                    this.field1547 -= this.field1553.field974.method251(this.field1551, this.field1546) + 1;
                    this.field1546++;
                } while (this.field1546 < this.field1553.field974.field762);
            } while (this.field1546 >= 0 && this.field1546 < this.field1553.field974.field762);
            this.field1546 = 0;
            this.field1554 = true;
        }
    }
}
