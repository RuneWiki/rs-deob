import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class64 {

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "Lnf;")
    public class37 field867 = null;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "[Lgq;")
    public class305[] field864 = null;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "[Lgq;")
    private class305[] field863 = null;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Z")
    public boolean field869;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field868 = -1;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Z")
    public final boolean method370(byte arg0) {
        field865++;
        if (arg0 != -25) {
            this.method370((byte) -25);
        }
        if (this.field869) {
            return this.field867 != null;
        } else {
            return this.field864 != null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lre;)V")
    public class64(class582 arg0) {
        this.field869 = arg0.field8315;
        if (this.field869 && !arg0.method1170((byte) -105, class280.field3663, class250.field3134)) {
            this.field869 = false;
        }
        if (this.field869 || arg0.method1214(class280.field3663, class250.field3134, 13)) {
            class646.method3717(24556);
            if (this.field869) {
                byte[] var2 = class584.method3371(class530.field7406, false, 3);
                this.field867 = arg0.method1151(var2, (byte) 52, 16, 128, 128, class250.field3134);
                byte[] var3 = class584.method3371(class72.field1002, false, 3);
                arg0.method1151(var3, (byte) 52, 16, 128, 128, class250.field3134);
            } else {
                this.field864 = new class305[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class411.method2450(class530.field7406, var4 * 256 * 128, 3, 32768);
                    this.field864[var4] = arg0.method3350(class250.field3134, (byte) -68, var7, true, 128, 128);
                }
                this.field863 = new class305[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class411.method2450(class72.field1002, var5 * 128 * 2 * 128, 3, 32768);
                    this.field863[var5] = arg0.method3350(class250.field3134, (byte) -76, var6, true, 128, 128);
                }
            }
        }
    }
}
