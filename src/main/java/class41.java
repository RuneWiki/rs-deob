import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LXKBDSHJ")
public class class41 {

    @OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "I")
    private int field1226 = 252;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "b", descriptor = "B")
    private byte field1227 = 0;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "e", descriptor = "LKGLULAMW;")
    private class33 field1230 = new class33();

    @OriginalMember(owner = "client!LXKBDSHJ", name = "i", descriptor = "LLXCATFEF;")
    private class40 field1234 = new class40(512);

    @OriginalMember(owner = "client!LXKBDSHJ", name = "f", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "g", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "h", descriptor = "LWGMBOAQO;")
    private class65 field1233;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "c", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "d", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client!LXKBDSHJ", name = "<init>", descriptor = "(BI)V")
    public class41(byte arg0, int arg1) {
        this.field1231 = arg1;
        if (this.field1227 == arg0) {
            boolean var3 = false;
        } else {
            this.field1226 = -340;
        }
        this.field1232 = arg1;
        this.field1233 = new class65((byte) 45, 1024);
    }

    @OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "(J)LKGLULAMW;")
    public class33 method413(long arg0) {
        class33 var3 = (class33) this.field1233.method586(arg0);
        if (var3 == null) {
            this.field1228++;
        } else {
            this.field1234.method408(var3);
            this.field1229++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "(ILKGLULAMW;J)V")
    public void method414(int arg0, class33 arg1, long arg2) {
        if (this.field1232 == 0) {
            class33 var5 = this.field1234.method409();
            var5.method588();
            var5.method373();
            if (this.field1230 == var5) {
                class33 var6 = this.field1234.method409();
                var6.method588();
                var6.method373();
            }
        } else {
            this.field1232--;
        }
        this.field1233.method587(arg2, (byte) 3, arg1);
        this.field1234.method408(arg1);
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        if (class67.field1688) {
        }
    }

    @OriginalMember(owner = "client!LXKBDSHJ", name = "a", descriptor = "()V")
    public void method415() {
        while (true) {
            class33 var1 = this.field1234.method409();
            if (var1 == null) {
                this.field1232 = this.field1231;
                return;
            }
            var1.method588();
            var1.method373();
        }
    }
}
