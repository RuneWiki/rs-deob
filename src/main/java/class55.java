import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TKXONZKI")
public class class55 extends class61 {

    @OriginalMember(owner = "TKXONZKI", name = "qb", descriptor = "Z")
    private boolean field1394 = false;

    @OriginalMember(owner = "TKXONZKI", name = "rb", descriptor = "I")
    private int field1395 = 1;

    @OriginalMember(owner = "TKXONZKI", name = "sb", descriptor = "Z")
    private boolean field1396 = false;

    @OriginalMember(owner = "TKXONZKI", name = "tb", descriptor = "I")
    private int field1397 = -130;

    @OriginalMember(owner = "TKXONZKI", name = "ub", descriptor = "LBXXPAJNW;")
    public class4 field1398;

    @OriginalMember(owner = "TKXONZKI", name = "a", descriptor = "(I)LGFYXEFQY;")
    public final class21 method294(int arg0) {
        if (this.field1398 == null) {
            return null;
        } else {
            class21 var2 = this.method501(-130);
            if (var2 == null) {
                return null;
            } else {
                super.field1569 = var2.field848;
                if (arg0 <= 0) {
                    this.field1396 = !this.field1396;
                }
                if (super.field1536 != -1 && super.field1537 != -1) {
                    class63 var3 = class63.field1588[super.field1536];
                    class21 var4 = var3.method564();
                    if (var4 != null) {
                        int var5 = var3.field1592.field1197[super.field1537];
                        class21 var6 = new class21((byte) 72, class14.method282(var5, false), var4, true, false);
                        var6.method354(29182, 0, -super.field1540, 0);
                        var6.method348(false);
                        var6.method349(90, var5);
                        var6.field917 = null;
                        var6.field916 = null;
                        if (var3.field1595 != 128 || var3.field1596 != 128) {
                            var6.method357((byte) -10, var3.field1595, var3.field1595, var3.field1596);
                        }
                        var6.method358(var3.field1598 + 64, var3.field1599 + 850, -30, -50, -30, true);
                        class21[] var7 = new class21[] { var2, var6 };
                        var2 = new class21(true, 2, var7, this.field1395);
                    }
                }
                if (this.field1398.field90 == 1) {
                    var2.field918 = true;
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "TKXONZKI", name = "b", descriptor = "(I)Z")
    public final boolean method368(int arg0) {
        if (arg0 != -32976) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1398 != null;
    }

    @OriginalMember(owner = "TKXONZKI", name = "d", descriptor = "(I)LGFYXEFQY;")
    private final class21 method501(int arg0) {
        while (arg0 >= 0) {
            this.field1394 = !this.field1394;
        }
        if (super.field1542 >= 0 && super.field1545 == 0) {
            int var2 = class39.field1195[super.field1542].field1197[super.field1543];
            int var3 = -1;
            if (super.field1573 >= 0 && super.field1573 != super.field1525) {
                var3 = class39.field1195[super.field1573].field1197[super.field1574];
            }
            return this.field1398.method26((byte) 5, var2, var3, class39.field1195[super.field1542].field1201);
        } else {
            int var4 = -1;
            if (super.field1573 >= 0) {
                var4 = class39.field1195[super.field1573].field1197[super.field1574];
            }
            return this.field1398.method26((byte) 5, var4, -1, (int[]) null);
        }
    }
}
