import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class263 {

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lfc;")
    private class174 field3872 = new class174(64);

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Loi;")
    private class53 field3870;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Leh;")
    public static class246 field3869 = new class246(62, 10);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field3873;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "[I")
    public static int[] field3871;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1675(boolean arg0) {
        field3873 = null;
        if (arg0) {
            field3871 = null;
            field3869 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lde;", line = 27)
    public final class376 method1676(int arg0, int arg1) {
        if (arg1 != 3312) {
            method1675(true);
        }
        field3868++;
        class174 var3 = this.field3872;
        class376 var4;
        synchronized (this.field3872) {
            var4 = (class376) this.field3872.method1088((long) arg0, (byte) 118);
        }
        if (var4 != null) {
            return var4;
        }
        class53 var5 = this.field3870;
        byte[] var6;
        synchronized (this.field3870) {
            var6 = this.field3870.method426(5, (byte) 9, arg0);
        }
        class376 var7 = new class376();
        if (var6 != null) {
            var7.method2193(new class403(var6), (byte) -14);
        }
        class174 var8 = this.field3872;
        synchronized (this.field3872) {
            this.field3872.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lle;ILoi;)V", line = 64)
    public class263(class205 arg0, int arg1, class53 arg2) {
        this.field3870 = arg2;
        this.field3870.method435(5, 0);
    }
}
