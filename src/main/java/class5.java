import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BVBRKPZH")
public class class5 {

    @OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "B")
    private byte field118 = 0;

    @OriginalMember(owner = "client!BVBRKPZH", name = "b", descriptor = "I")
    private int field119 = 35268;

    @OriginalMember(owner = "client!BVBRKPZH", name = "g", descriptor = "LYPOWJZIQ;")
    private class64 field124 = new class64();

    @OriginalMember(owner = "client!BVBRKPZH", name = "k", descriptor = "LOZVXYFRH;")
    private class38 field128 = new class38(field120);

    @OriginalMember(owner = "client!BVBRKPZH", name = "h", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!BVBRKPZH", name = "i", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!BVBRKPZH", name = "d", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!BVBRKPZH", name = "j", descriptor = "LDIFURFJI;")
    private class10 field127;

    @OriginalMember(owner = "client!BVBRKPZH", name = "c", descriptor = "B")
    private static byte field120 = -98;

    @OriginalMember(owner = "client!BVBRKPZH", name = "e", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!BVBRKPZH", name = "f", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!BVBRKPZH", name = "<init>", descriptor = "(II)V")
    public class5(int arg0, int arg1) {
        this.field125 = arg1;
        this.field126 = arg1;
        if (arg0 != -21657) {
            this.field121 = 402;
        }
        this.field127 = new class10(this.field119, 1024);
    }

    @OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "(J)LYPOWJZIQ;")
    public class64 method25(long arg0) {
        class64 var3 = (class64) this.field127.method200(arg0);
        if (var3 == null) {
            this.field122++;
        } else {
            this.field128.method344(var3);
            this.field123++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "(BJLYPOWJZIQ;)V")
    public void method26(byte arg0, long arg1, class64 arg2) {
        if (this.field118 != arg0) {
            return;
        }
        boolean var5 = false;
        if (this.field126 == 0) {
            class64 var6 = this.field128.method345();
            var6.method338();
            var6.method499();
            if (this.field124 == var6) {
                class64 var7 = this.field128.method345();
                var7.method338();
                var7.method499();
            }
        } else {
            this.field126--;
        }
        this.field127.method201(arg1, arg2, true);
        this.field128.method344(arg2);
    }

    @OriginalMember(owner = "client!BVBRKPZH", name = "a", descriptor = "()V")
    public void method27() {
        while (true) {
            class64 var1 = this.field128.method345();
            if (var1 == null) {
                this.field126 = this.field125;
                return;
            }
            var1.method338();
            var1.method499();
        }
    }
}
