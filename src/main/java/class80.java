import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class80 {

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "[Lbl;")
    public static class425[] field1074 = new class425[29];

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Ls;")
    public static class169 field1073 = new class169(9, 17);

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1079 = "";

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Lmc;")
    public static class78 field1080 = new class78(66, 2);

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "[I")
    public static int[] field1078;

    @OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1070++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
    public static final int method523(byte arg0) {
        field1072++;
        if (arg0 > -98) {
            method524(21, (class464) null, 62, 27);
        }
        class364 var1 = class98.field1432;
        boolean var2 = false;
        if (class222.field2958 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class364.method2216(-68, 0, (class241) null, (class287) null, var3, 0);
        }
        long var4 = class440.method2583(25267);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1970(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class440.method2583(25267) - var4);
        var1.method2222(100, 0, 0, -16777216, 95, 100);
        if (var2) {
            var1.method2217(16384);
        }
        return var7;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILnk;II)V")
    public static final void method524(int arg0, class464 arg1, int arg2, int arg3) {
        class329.field4370 = arg0;
        field1071++;
        class433.field5892 = arg2;
        if (arg3 != 0) {
            field1079 = null;
        }
        class163.field2265 = arg1;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(II)V")
    public class80(int arg0, int arg1) {
        this.field1076 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZII)Lwe;")
    public static final class257 method525(boolean arg0, int arg1, int arg2) {
        field1077++;
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
        return arg1 == -7967 ? (class257) class138.field1994.method1528(var3, 113) : null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method526(int arg0) {
        field1074 = null;
        field1079 = null;
        field1078 = null;
        field1080 = null;
        if (arg0 == 15799) {
            field1073 = null;
        }
    }
}
