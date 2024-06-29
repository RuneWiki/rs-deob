import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CABSPGMS")
public class class6 {

    @OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "Z")
    private boolean field69 = false;

    @OriginalMember(owner = "client!CABSPGMS", name = "b", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!CABSPGMS", name = "c", descriptor = "[LZMCAQRHG;")
    private class71[] field71;

    @OriginalMember(owner = "client!CABSPGMS", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field70 = arg0;
        this.field71 = new class71[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            class71 var4 = this.field71[var3] = new class71();
            var4.field1727 = var4;
            var4.field1728 = var4;
        }
    }

    @OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "(J)LZMCAQRHG;")
    public class71 method45(long arg0) {
        class71 var3 = this.field71[(int) (arg0 & (long) (this.field70 - 1))];
        for (class71 var4 = var3.field1727; var4 != var3; var4 = var4.field1727) {
            if (var4.field1726 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!CABSPGMS", name = "a", descriptor = "(LZMCAQRHG;JI)V")
    public void method46(class71 arg0, long arg1, int arg2) {
        if (arg0.field1728 != null) {
            arg0.method602();
        }
        class71 var5 = this.field71[(int) (arg1 & (long) (this.field70 - 1))];
        arg0.field1728 = var5.field1728;
        if (arg2 == 0) {
            arg0.field1727 = var5;
            arg0.field1728.field1727 = arg0;
            arg0.field1727.field1728 = arg0;
            arg0.field1726 = arg1;
        }
    }
}
