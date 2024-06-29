import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!THJKANXW")
public class class54 {

    @OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "Z")
    private boolean field1438 = true;

    @OriginalMember(owner = "client!THJKANXW", name = "e", descriptor = "LKIFEZIQJ;")
    private class29 field1442 = new class29();

    @OriginalMember(owner = "client!THJKANXW", name = "i", descriptor = "LYAKFHRTY;")
    private class62 field1446 = new class62(field1439);

    @OriginalMember(owner = "client!THJKANXW", name = "f", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!THJKANXW", name = "g", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!THJKANXW", name = "h", descriptor = "LYDNMMDSW;")
    private class63 field1445;

    @OriginalMember(owner = "client!THJKANXW", name = "b", descriptor = "I")
    private static int field1439;

    @OriginalMember(owner = "client!THJKANXW", name = "c", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!THJKANXW", name = "d", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client!THJKANXW", name = "<init>", descriptor = "(IZ)V")
    public class54(int arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        }
        this.field1443 = arg0;
        this.field1444 = arg0;
        this.field1445 = new class63(153, 1024);
    }

    @OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "(J)LKIFEZIQJ;")
    public class29 method529(long arg0) {
        class29 var3 = (class29) this.field1445.method567(arg0);
        if (var3 == null) {
            this.field1440++;
        } else {
            this.field1446.method562(var3);
            this.field1441++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "(JZLKIFEZIQJ;)V")
    public void method530(long arg0, boolean arg1, class29 arg2) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1444 == 0) {
            class29 var6 = this.field1446.method563();
            var6.method464();
            var6.method352();
            if (this.field1442 == var6) {
                class29 var7 = this.field1446.method563();
                var7.method464();
                var7.method352();
            }
        } else {
            this.field1444--;
        }
        this.field1445.method568(arg0, arg2, true);
        this.field1446.method562(arg2);
        if (class45.field1317) {
        }
    }

    @OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "()V")
    public void method531() {
        while (true) {
            class29 var1 = this.field1446.method563();
            if (var1 == null) {
                this.field1444 = this.field1443;
                return;
            }
            var1.method464();
            var1.method352();
        }
    }
}
