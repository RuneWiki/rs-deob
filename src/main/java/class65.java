import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WUMSOEQS")
public class class65 {

    @OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "I")
    private int field1681 = 22419;

    @OriginalMember(owner = "client!WUMSOEQS", name = "d", descriptor = "LMUOTSYDS;")
    private class37 field1684 = new class37();

    @OriginalMember(owner = "client!WUMSOEQS", name = "h", descriptor = "LKZFVEUEL;")
    private class29 field1688 = new class29(9);

    @OriginalMember(owner = "client!WUMSOEQS", name = "e", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!WUMSOEQS", name = "f", descriptor = "I")
    private int field1686;

    @OriginalMember(owner = "client!WUMSOEQS", name = "g", descriptor = "LGRIRTYPY;")
    private class19 field1687;

    @OriginalMember(owner = "client!WUMSOEQS", name = "b", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!WUMSOEQS", name = "c", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!WUMSOEQS", name = "<init>", descriptor = "(BI)V")
    public class65(byte arg0, int arg1) {
        this.field1685 = arg1;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        this.field1686 = arg1;
        this.field1687 = new class19((byte) 2, 1024);
    }

    @OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "(J)LMUOTSYDS;")
    public class37 method586(long arg0) {
        class37 var3 = (class37) this.field1687.method222(arg0);
        if (var3 == null) {
            this.field1682++;
        } else {
            this.field1688.method310(var3);
            this.field1683++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "(IJLMUOTSYDS;)V")
    public void method587(int arg0, long arg1, class37 arg2) {
        if (this.field1686 == 0) {
            class37 var5 = this.field1688.method311();
            var5.method589();
            var5.method344();
            if (this.field1684 == var5) {
                class37 var6 = this.field1688.method311();
                var6.method589();
                var6.method344();
            }
        } else {
            this.field1686--;
        }
        this.field1687.method223(328, arg2, arg1);
        this.field1688.method310(arg2);
        if (arg0 != 0) {
            this.field1681 = 9;
        } else if (class66.field1692) {
        }
    }

    @OriginalMember(owner = "client!WUMSOEQS", name = "a", descriptor = "()V")
    public void method588() {
        while (true) {
            class37 var1 = this.field1688.method311();
            if (var1 == null) {
                this.field1686 = this.field1685;
                return;
            }
            var1.method589();
            var1.method344();
        }
    }
}
