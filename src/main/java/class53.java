import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TOFRUGLM")
public class class53 extends class17 {

    @OriginalMember(owner = "client!TOFRUGLM", name = "sb", descriptor = "Z")
    private boolean field1507 = false;

    @OriginalMember(owner = "client!TOFRUGLM", name = "rb", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!TOFRUGLM", name = "tb", descriptor = "LYSYPMZMO;")
    public class70 field1508;

    @OriginalMember(owner = "client!TOFRUGLM", name = "a", descriptor = "(I)Z")
    public final boolean method307(int arg0) {
        if (arg0 != 39489) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1508 != null;
    }

    @OriginalMember(owner = "client!TOFRUGLM", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        if (this.field1508 == null) {
            return null;
        } else {
            class47 var2 = this.method513(-291);
            if (arg0 == 3) {
                boolean var3 = false;
            } else {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field712 = var2.field1241;
                if (super.field728 != -1 && super.field729 != -1) {
                    class37 var5 = class37.field991[super.field728];
                    class47 var6 = var5.method367();
                    if (var6 != null) {
                        int var7 = var5.field995.field889[super.field729];
                        class47 var8 = new class47(var6, class67.method586(true, var7), true, false, true);
                        var8.method479(0, 0, -super.field732, -356);
                        var8.method473(8);
                        var8.method474(-770, var7);
                        var8.field1368 = null;
                        var8.field1367 = null;
                        if (var5.field998 != 128 || var5.field999 != 128) {
                            var8.method482(var5.field999, var5.field998, var5.field998, this.field1506);
                        }
                        var8.method483(var5.field1001 + 64, var5.field1002 + 850, -30, -50, -30, true);
                        class47[] var9 = new class47[] { var2, var8 };
                        var2 = new class47(2, true, 18217, var9);
                    }
                }
                if (this.field1508.field1718 == 1) {
                    var2.field1369 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!TOFRUGLM", name = "b", descriptor = "(I)LRMLAXPMV;")
    private final class47 method513(int arg0) {
        if (super.field698 >= 0 && super.field701 == 0) {
            int var2 = class29.field887[super.field698].field889[super.field699];
            int var3 = -1;
            if (super.field723 >= 0 && super.field723 != super.field696) {
                var3 = class29.field887[super.field723].field889[super.field724];
            }
            return this.field1508.method593(0, class29.field887[super.field698].field893, var2, var3);
        } else {
            int var4 = -1;
            while (arg0 >= 0) {
                this.field1507 = !this.field1507;
            }
            if (super.field723 >= 0) {
                var4 = class29.field887[super.field723].field889[super.field724];
            }
            return this.field1508.method593(0, (int[]) null, var4, -1);
        }
    }
}
