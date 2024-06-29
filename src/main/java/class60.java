import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UNPPHFRC")
public class class60 {

    @OriginalMember(owner = "client!UNPPHFRC", name = "c", descriptor = "LYCAZQYJA;")
    private class68 field1489 = new class68();

    @OriginalMember(owner = "client!UNPPHFRC", name = "g", descriptor = "LHRSVWDNF;")
    private class27 field1493 = new class27((byte) 77);

    @OriginalMember(owner = "client!UNPPHFRC", name = "d", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!UNPPHFRC", name = "e", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!UNPPHFRC", name = "f", descriptor = "LBEGVKNAP;")
    private class6 field1492;

    @OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!UNPPHFRC", name = "b", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!UNPPHFRC", name = "<init>", descriptor = "(ZI)V")
    public class60(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field1490 = arg1;
        this.field1491 = arg1;
        this.field1492 = new class6(45840, 1024);
    }

    @OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "(J)LYCAZQYJA;")
    public class68 method531(long arg0) {
        class68 var3 = (class68) this.field1492.method36(arg0);
        if (var3 == null) {
            this.field1487++;
        } else {
            this.field1493.method356(var3);
            this.field1488++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "(ZJLYCAZQYJA;)V")
    public void method532(boolean arg0, long arg1, class68 arg2) {
        if (this.field1491 == 0) {
            class68 var5 = this.field1493.method357();
            var5.method205();
            var5.method583();
            if (this.field1489 == var5) {
                class68 var6 = this.field1493.method357();
                var6.method205();
                var6.method583();
            }
        } else {
            this.field1491--;
        }
        this.field1492.method37((byte) -90, arg1, arg2);
        this.field1493.method356(arg2);
        if (arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        } else if (class13.field714) {
        }
    }

    @OriginalMember(owner = "client!UNPPHFRC", name = "a", descriptor = "()V")
    public void method533() {
        while (true) {
            class68 var1 = this.field1493.method357();
            if (var1 == null) {
                this.field1491 = this.field1490;
                return;
            }
            var1.method205();
            var1.method583();
        }
    }
}
