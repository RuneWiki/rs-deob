import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VNWSQIXW")
public class class54 {

    @OriginalMember(owner = "VNWSQIXW", name = "a", descriptor = "I")
    private int field1520 = 859;

    @OriginalMember(owner = "VNWSQIXW", name = "b", descriptor = "B")
    private byte field1521 = 52;

    @OriginalMember(owner = "VNWSQIXW", name = "e", descriptor = "LOGGHOMII;")
    private class33 field1524 = new class33();

    @OriginalMember(owner = "VNWSQIXW", name = "i", descriptor = "LPNEYGONI;")
    private class37 field1528 = new class37((byte) 33);

    @OriginalMember(owner = "VNWSQIXW", name = "f", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "VNWSQIXW", name = "g", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "VNWSQIXW", name = "h", descriptor = "LBELQMOFW;")
    private class2 field1527;

    @OriginalMember(owner = "VNWSQIXW", name = "c", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "VNWSQIXW", name = "d", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "VNWSQIXW", name = "<init>", descriptor = "(IB)V")
    public class54(int arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1525 = arg0;
        this.field1526 = arg0;
        this.field1527 = new class2(this.field1521, 1024);
    }

    @OriginalMember(owner = "VNWSQIXW", name = "a", descriptor = "(J)LOGGHOMII;")
    public class33 method507(long arg0) {
        class33 var3 = (class33) this.field1527.method14(arg0);
        if (var3 == null) {
            this.field1522++;
        } else {
            this.field1528.method438(var3);
            this.field1523++;
        }
        return var3;
    }

    @OriginalMember(owner = "VNWSQIXW", name = "a", descriptor = "(IJLOGGHOMII;)V")
    public void method508(int arg0, long arg1, class33 arg2) {
        if (this.field1526 == 0) {
            class33 var5 = this.field1528.method439();
            var5.method19();
            var5.method384();
            if (this.field1524 == var5) {
                class33 var6 = this.field1528.method439();
                var6.method19();
                var6.method384();
            }
        } else {
            this.field1526--;
        }
        this.field1527.method15(arg1, arg2, (byte) -18);
        if (arg0 == 7) {
            this.field1528.method438(arg2);
        }
    }

    @OriginalMember(owner = "VNWSQIXW", name = "a", descriptor = "()V")
    public void method509() {
        while (true) {
            class33 var1 = this.field1528.method439();
            if (var1 == null) {
                this.field1526 = this.field1525;
                return;
            }
            var1.method19();
            var1.method384();
        }
    }
}
