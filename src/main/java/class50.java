import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QQBOAQZB")
public class class50 {

    @OriginalMember(owner = "QQBOAQZB", name = "a", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "QQBOAQZB", name = "b", descriptor = "I")
    private int field1330 = -26495;

    @OriginalMember(owner = "QQBOAQZB", name = "e", descriptor = "LMOVYLKVL;")
    private class41 field1333 = new class41();

    @OriginalMember(owner = "QQBOAQZB", name = "i", descriptor = "LKMFVYEKJ;")
    private class37 field1337 = new class37(0);

    @OriginalMember(owner = "QQBOAQZB", name = "f", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "QQBOAQZB", name = "g", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "QQBOAQZB", name = "h", descriptor = "LYCPCXCIN;")
    private class68 field1336;

    @OriginalMember(owner = "QQBOAQZB", name = "c", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "QQBOAQZB", name = "d", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "QQBOAQZB", name = "<init>", descriptor = "(II)V")
    public class50(int arg0, int arg1) {
        this.field1334 = arg1;
        if (arg0 != 3) {
            this.field1329 = !this.field1329;
        }
        this.field1335 = arg1;
        this.field1336 = new class68(1024, -32236);
    }

    @OriginalMember(owner = "QQBOAQZB", name = "a", descriptor = "(J)LMOVYLKVL;")
    public class41 method421(long arg0) {
        class41 var3 = (class41) this.field1336.method578(arg0);
        if (var3 == null) {
            this.field1331++;
        } else {
            this.field1337.method371(var3);
            this.field1332++;
        }
        return var3;
    }

    @OriginalMember(owner = "QQBOAQZB", name = "a", descriptor = "(ZLMOVYLKVL;J)V")
    public void method422(boolean arg0, class41 arg1, long arg2) {
        if (this.field1335 == 0) {
            class41 var5 = this.field1337.method372();
            var5.method234();
            var5.method379();
            if (this.field1333 == var5) {
                class41 var6 = this.field1337.method372();
                var6.method234();
                var6.method379();
            }
        } else {
            this.field1335--;
        }
        this.field1336.method579(arg1, arg2, (byte) 5);
        this.field1337.method371(arg1);
        if (!arg0) {
            this.field1329 = !this.field1329;
        } else if (class13.field723) {
        }
    }

    @OriginalMember(owner = "QQBOAQZB", name = "a", descriptor = "()V")
    public void method423() {
        while (true) {
            class41 var1 = this.field1337.method372();
            if (var1 == null) {
                this.field1335 = this.field1334;
                return;
            }
            var1.method234();
            var1.method379();
        }
    }
}
