import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NVDACYAH")
public class class40 {

    @OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "I")
    private int field1241 = -872;

    @OriginalMember(owner = "client!NVDACYAH", name = "d", descriptor = "LOHSXMHUZ;")
    private class42 field1244 = new class42();

    @OriginalMember(owner = "client!NVDACYAH", name = "h", descriptor = "LISCMIAJK;")
    private class27 field1248 = new class27(true);

    @OriginalMember(owner = "client!NVDACYAH", name = "e", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!NVDACYAH", name = "f", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!NVDACYAH", name = "g", descriptor = "LEHIGZZMD;")
    private class11 field1247;

    @OriginalMember(owner = "client!NVDACYAH", name = "b", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client!NVDACYAH", name = "c", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!NVDACYAH", name = "<init>", descriptor = "(ZI)V")
    public class40(boolean arg0, int arg1) {
        this.field1245 = arg1;
        this.field1246 = arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1247 = new class11(0, 1024);
    }

    @OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "(J)LOHSXMHUZ;")
    public class42 method427(long arg0) {
        class42 var3 = (class42) this.field1247.method185(arg0);
        if (var3 == null) {
            this.field1242++;
        } else {
            this.field1248.method307(var3);
            this.field1243++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "(JBLOHSXMHUZ;)V")
    public void method428(long arg0, byte arg1, class42 arg2) {
        if (this.field1246 == 0) {
            class42 var5 = this.field1248.method308();
            var5.method14();
            var5.method432();
            if (this.field1244 == var5) {
                class42 var6 = this.field1248.method308();
                var6.method14();
                var6.method432();
            }
        } else {
            this.field1246--;
        }
        this.field1247.method186(arg0, arg2, -42535);
        if (arg1 != 81) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        this.field1248.method307(arg2);
    }

    @OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "()V")
    public void method429() {
        while (true) {
            class42 var1 = this.field1248.method308();
            if (var1 == null) {
                this.field1246 = this.field1245;
                return;
            }
            var1.method14();
            var1.method432();
        }
    }
}
