import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DMOAMUBS")
public class class14 {

    @OriginalMember(owner = "DMOAMUBS", name = "a", descriptor = "I")
    private int field672 = 1;

    @OriginalMember(owner = "DMOAMUBS", name = "b", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "DMOAMUBS", name = "f", descriptor = "LIZSDUVJF;")
    private class27 field677 = new class27();

    @OriginalMember(owner = "DMOAMUBS", name = "j", descriptor = "LTOAGRHDF;")
    private class59 field681 = new class59(field674);

    @OriginalMember(owner = "DMOAMUBS", name = "g", descriptor = "I")
    private int field678;

    @OriginalMember(owner = "DMOAMUBS", name = "h", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "DMOAMUBS", name = "i", descriptor = "LMCCUMEPE;")
    private class42 field680;

    @OriginalMember(owner = "DMOAMUBS", name = "c", descriptor = "I")
    private static int field674 = -34;

    @OriginalMember(owner = "DMOAMUBS", name = "d", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "DMOAMUBS", name = "e", descriptor = "I")
    private int field676;

    @OriginalMember(owner = "DMOAMUBS", name = "<init>", descriptor = "(IZ)V")
    public class14(int arg0, boolean arg1) {
        this.field678 = arg0;
        if (!arg1) {
            this.field672 = -195;
        }
        this.field679 = arg0;
        this.field680 = new class42(1024, 170);
    }

    @OriginalMember(owner = "DMOAMUBS", name = "a", descriptor = "(J)LIZSDUVJF;")
    public class27 method193(long arg0) {
        class27 var3 = (class27) this.field680.method314(arg0);
        if (var3 == null) {
            this.field675++;
        } else {
            this.field681.method353(var3);
            this.field676++;
        }
        return var3;
    }

    @OriginalMember(owner = "DMOAMUBS", name = "a", descriptor = "(JBLIZSDUVJF;)V")
    public void method194(long arg0, byte arg1, class27 arg2) {
        if (this.field679 == 0) {
            class27 var5 = this.field681.method354();
            var5.method334();
            var5.method256();
            if (this.field677 == var5) {
                class27 var6 = this.field681.method354();
                var6.method334();
                var6.method256();
            }
        } else {
            this.field679--;
        }
        this.field680.method315((byte) 87, arg2, arg0);
        if (arg1 != -80) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field681.method353(arg2);
    }

    @OriginalMember(owner = "DMOAMUBS", name = "a", descriptor = "()V")
    public void method195() {
        while (true) {
            class27 var1 = this.field681.method354();
            if (var1 == null) {
                this.field679 = this.field678;
                return;
            }
            var1.method334();
            var1.method256();
        }
    }
}
