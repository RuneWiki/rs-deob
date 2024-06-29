import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RYXFUVWJ")
public class class48 {

    @OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "Z")
    private boolean field1337 = false;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "b", descriptor = "B")
    private byte field1338 = 2;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "d", descriptor = "Z")
    private boolean field1340 = false;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "g", descriptor = "LFFAASUKE;")
    private class13 field1343 = new class13();

    @OriginalMember(owner = "client!RYXFUVWJ", name = "k", descriptor = "LKHIOJPOB;")
    private class32 field1347 = new class32(field1339);

    @OriginalMember(owner = "client!RYXFUVWJ", name = "h", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "i", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "j", descriptor = "LVWNUVMOR;")
    private class60 field1346;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "c", descriptor = "B")
    private static byte field1339 = 8;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "e", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "f", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!RYXFUVWJ", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        this.field1344 = arg0;
        this.field1345 = arg0;
        if (arg1 >= 0) {
            this.field1340 = !this.field1340;
        }
        this.field1346 = new class60(1024, 26357);
    }

    @OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "(J)LFFAASUKE;")
    public class13 method495(long arg0) {
        class13 var3 = (class13) this.field1346.method527(arg0);
        if (var3 == null) {
            this.field1341++;
        } else {
            this.field1347.method331(var3);
            this.field1342++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "(ZLFFAASUKE;J)V")
    public void method496(boolean arg0, class13 arg1, long arg2) {
        if (this.field1345 == 0) {
            class13 var5 = this.field1347.method332();
            var5.method329();
            var5.method300();
            if (this.field1343 == var5) {
                class13 var6 = this.field1347.method332();
                var6.method329();
                var6.method300();
            }
        } else {
            this.field1345--;
        }
        this.field1346.method528(true, arg1, arg2);
        this.field1347.method331(arg1);
        if (!arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "client!RYXFUVWJ", name = "a", descriptor = "()V")
    public void method497() {
        while (true) {
            class13 var1 = this.field1347.method332();
            if (var1 == null) {
                this.field1345 = this.field1344;
                return;
            }
            var1.method329();
            var1.method300();
        }
    }
}
