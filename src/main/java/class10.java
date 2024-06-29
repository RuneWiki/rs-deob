import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DIFURFJI")
public class class10 {

    @OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "I")
    private int field667 = 3;

    @OriginalMember(owner = "client!DIFURFJI", name = "b", descriptor = "Z")
    private boolean field668 = true;

    @OriginalMember(owner = "client!DIFURFJI", name = "c", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!DIFURFJI", name = "d", descriptor = "[LOJTWJXEY;")
    private class34[] field670;

    @OriginalMember(owner = "client!DIFURFJI", name = "<init>", descriptor = "(II)V")
    public class10(int arg0, int arg1) {
        this.field669 = arg1;
        if (arg0 != 35268) {
            this.field668 = !this.field668;
        }
        this.field670 = new class34[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class34 var4 = this.field670[var3] = new class34();
            var4.field1025 = var4;
            var4.field1026 = var4;
        }
    }

    @OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "(J)LOJTWJXEY;")
    public class34 method200(long arg0) {
        class34 var3 = this.field670[(int) (arg0 & (long) (this.field669 - 1))];
        for (class34 var4 = var3.field1025; var4 != var3; var4 = var4.field1025) {
            if (var4.field1024 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!DIFURFJI", name = "a", descriptor = "(JLOJTWJXEY;Z)V")
    public void method201(long arg0, class34 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (arg1.field1026 != null) {
            arg1.method338();
        }
        class34 var5 = this.field670[(int) (arg0 & (long) (this.field669 - 1))];
        arg1.field1026 = var5.field1026;
        arg1.field1025 = var5;
        arg1.field1026.field1025 = arg1;
        arg1.field1025.field1026 = arg1;
        arg1.field1024 = arg0;
    }
}
