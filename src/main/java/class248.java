import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class248 extends class59 {

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "J")
    public long field3961;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "[[[I")
    public static int[][][] field3959 = new int[4][13][13];

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "Llk;")
    public static class189 field3960 = new class189();

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lvd;")
    public static class161 field3958;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Lmh;")
    public static class65 field3962;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Lce;", line = 11)
    public static final class198 method1763(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class198 var4 = var3.field5208;
            var3.field5208 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V", line = 29)
    public static void method1764(byte arg0) {
        field3962 = null;
        field3959 = (int[][][]) null;
        int var1 = -114 / ((arg0 - 83) / 43);
        field3960 = null;
        field3958 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 40)
    public class248() {
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(J)V", line = 42)
    public class248(long arg0) {
        this.field3961 = arg0;
    }
}
