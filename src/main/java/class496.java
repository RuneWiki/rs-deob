import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class496 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lgi;")
    private class583 field6932;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "J")
    public long field6934;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "[I")
    public static int[] field6936 = new int[32];

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Lan;")
    public static class21 field6938;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILss;)V")
    public static final void method2871(int arg0, int arg1, int arg2, int arg3, class364 arg4) {
        field6935++;
        int var5 = -26 / ((42 - arg0) / 33);
        for (class421 var6 = (class421) class41.field806.method456((byte) -88); var6 != null; var6 = (class421) class41.field806.method460((byte) 110)) {
            if (var6.field5909 == arg2 && (arg1 << 7) == var6.field5914 && (arg3 << 7) == var6.field5906 && var6.field5905.field4944 == arg4.field4944) {
                if (var6.field5904 != null) {
                    class204.field2869.method2731(var6.field5904);
                    var6.field5904 = null;
                }
                if (var6.field5903 != null) {
                    class204.field2869.method2731(var6.field5903);
                    var6.field5903 = null;
                }
                var6.method1117(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method2872(int arg0) {
        field6938 = null;
        if (arg0 == -1492023961) {
            field6936 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6931++;
        this.field6932.method3363(-99, this.field6934);
        super.finalize();
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lgi;J[Lsca;)V")
    public class496(class583 arg0, long arg1, class40[] arg2) {
        this.field6932 = arg0;
        this.field6934 = arg1;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lat;")
    public static final class316 method2873(Canvas arg0, byte arg1) {
        field6933++;
        try {
            Class var2 = Class.forName("vda");
            class316 var3 = (class316) var2.getDeclaredConstructor().newInstance();
            if (arg1 < 5) {
                return null;
            } else {
                var3.method1008(106, arg0);
                return var3;
            }
        } catch (Throwable var5) {
            class536 var4 = new class536();
            var4.method1008(116, arg0);
            return var4;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6936[var1] = var0 - 1;
            var0 += var0;
        }
        field6937 = 0;
    }
}
