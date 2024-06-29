import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class114 implements class409 {

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Lfc;")
    public class269 field1443;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Lcb;")
    private class544 field1439;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "Lcb;")
    public class544 field1438;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "J")
    private long field1446;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "Lda;")
    private class67 field1437;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V", line = 10)
    public void method811(boolean arg0) {
        field1442++;
        class263 var2 = class96.method677(this.field1439, this.field1443.field3775, (byte) -125);
        this.field1437 = class638.field8979.method403(var2, class625.method3581(this.field1438, this.field1443.field3775), true);
        if (arg0) {
            this.method814((byte) 56);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZB)V", line = 30)
    public final void method374(boolean arg0, byte arg1) {
        field1441++;
        if (arg1 != -105) {
            this.field1438 = null;
        }
        int var3 = this.field1443.field3774.method2164(class785.field10790, arg1 ^ 0xFFFFFF97, this.field1443.field3769) + this.field1443.field3777;
        int var4 = this.field1443.field3784.method1378((byte) 28, class264.field3734, this.field1443.field3773) + this.field1443.field3783;
        this.method812(1026, arg0, var3, var4);
        this.method810(var4, var3, (byte) 105, arg0);
        String var5 = class203.field2976.method623((byte) -104);
        if (class109.method731(39) - this.field1446 > 10000L) {
            var5 = var5 + " (" + class203.field2976.method619(0).method2901(123) + ")";
        }
        this.field1437.method523(this.field1443.field3776, this.field1443.field3769 / 2 + var3, var5, this.field1443.field3773 / 2 + var4 + this.field1443.field3781 + 4, true, -1);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)I", line = 61)
    public final int method813(int arg0) {
        field1444++;
        int var2 = class203.field2976.method617(16777215);
        int var3 = arg0 * var2;
        if (this.field1435 == var2 && var2 != 0) {
            int var4 = class203.field2976.method622(arg0 - 100);
            if (var2 < var4) {
                long var5 = this.field1446 - class203.field2976.method624((byte) 119);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class109.method731(arg0 + 24) - this.field1446) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field1435 = var2;
            this.field1446 = class109.method731(100);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lcb;Lcb;Lfc;)V", line = 107)
    public class114(class544 arg0, class544 arg1, class269 arg2) {
        this.field1443 = arg2;
        this.field1439 = arg1;
        this.field1438 = arg0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Z", line = 118)
    public boolean method814(byte arg0) {
        field1440++;
        boolean var2 = true;
        int var3 = -20 / ((arg0 + 65) / 37);
        if (!this.field1438.method3131(104, this.field1443.field3775)) {
            var2 = false;
        }
        if (!this.field1439.method3131(-39, this.field1443.field3775)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBZ)V")
    public abstract void method810(int arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZII)V")
    public abstract void method812(int arg0, boolean arg1, int arg2, int arg3);
}
