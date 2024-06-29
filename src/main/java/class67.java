import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YITKGHWB")
public class class67 {

    @OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "Z")
    private boolean field1714 = true;

    @OriginalMember(owner = "client!YITKGHWB", name = "d", descriptor = "LYBEHHNFF;")
    private class65 field1717 = new class65();

    @OriginalMember(owner = "client!YITKGHWB", name = "h", descriptor = "LTSCGUBKV;")
    private class50 field1721 = new class50(-433);

    @OriginalMember(owner = "client!YITKGHWB", name = "e", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!YITKGHWB", name = "f", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!YITKGHWB", name = "g", descriptor = "LZZGAIEMG;")
    private class72 field1720;

    @OriginalMember(owner = "client!YITKGHWB", name = "b", descriptor = "I")
    private int field1715;

    @OriginalMember(owner = "client!YITKGHWB", name = "c", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!YITKGHWB", name = "<init>", descriptor = "(IB)V")
    public class67(int arg0, byte arg1) {
        this.field1718 = arg0;
        this.field1719 = arg0;
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1720 = new class72(1024, 492);
    }

    @OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "(J)LYBEHHNFF;")
    public class65 method572(long arg0) {
        class65 var3 = (class65) this.field1720.method601(arg0);
        if (var3 == null) {
            this.field1715++;
        } else {
            this.field1721.method459(var3);
            this.field1716++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "(ZLYBEHHNFF;J)V")
    public void method573(boolean arg0, class65 arg1, long arg2) {
        if (this.field1719 == 0) {
            class65 var5 = this.field1721.method460();
            var5.method163();
            var5.method567();
            if (this.field1717 == var5) {
                class65 var6 = this.field1721.method460();
                var6.method163();
                var6.method567();
            }
        } else {
            this.field1719--;
        }
        this.field1720.method602(0, arg2, arg1);
        this.field1721.method459(arg1);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "()V")
    public void method574() {
        while (true) {
            class65 var1 = this.field1721.method460();
            if (var1 == null) {
                this.field1719 = this.field1718;
                return;
            }
            var1.method163();
            var1.method567();
        }
    }
}
