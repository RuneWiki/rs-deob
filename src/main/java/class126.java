import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class126 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Ljr;")
    private class112 field2133 = new class112(64);

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "Lin;")
    private class91 field2135;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lmu;")
    public static class303 field2134 = new class303(45, 8);

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lpv;")
    public final class71 method1061(int arg0, int arg1) {
        field2136++;
        class112 var3 = this.field2133;
        class71 var4;
        synchronized (this.field2133) {
            var4 = (class71) this.field2133.method992((long) arg1, -85);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2135;
        byte[] var6;
        synchronized (this.field2135) {
            var6 = this.field2135.method863(-1860, 5, arg1);
        }
        class71 var7 = new class71();
        if (arg0 < 78) {
            method1063();
        }
        if (var6 != null) {
            var7.method686((byte) 16, new class215(var6));
        }
        class112 var8 = this.field2133;
        synchronized (this.field2133) {
            this.field2133.method991(var7, (long) arg1, (byte) -93);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        field2134 = null;
        if (arg0 != 62) {
            method1063();
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
    public static final void method1063() {
        class545.field7511 = class545.field7513;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class126(class460 arg0, int arg1, class91 arg2) {
        this.field2135 = arg2;
        this.field2135.method860(0, 5);
    }
}
