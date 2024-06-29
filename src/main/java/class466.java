import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class466 {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public int field6468;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Ltm;")
    public static class412 field6467 = new class412();

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "J")
    public static long field6470;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Laj;")
    public static class333 field6466;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 7)
    public static void method2753(int arg0) {
        if (arg0 <= 7) {
            field6466 = null;
        }
        field6467 = null;
        field6466 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ldr;I)Ldr;", line = 18)
    public static final class751 method2754(class751 arg0, int arg1) {
        field6462++;
        class751 var2 = arg0 == null ? new class751() : new class751(arg0);
        if (arg1 >= -123) {
            method2753(-33);
        }
        var2.method4164(128, (byte) -90, 9);
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)Z", line = 37)
    public static final boolean method2755(int arg0, int arg1, byte arg2) {
        field6465++;
        if (arg1 >= 1000 && arg0 < 1000) {
            return true;
        }
        if (arg2 != 119) {
            method2755(-62, 112, (byte) 55);
        }
        if (arg1 >= 1000 || arg0 >= 1000) {
            return arg1 >= 1000 && arg0 >= 1000;
        } else if (class306.method1940(2, arg0)) {
            return true;
        } else {
            return !class306.method1940(2, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)Ljc;", line = 68)
    public final class466 method2756(int arg0, boolean arg1) {
        field6463++;
        if (arg1) {
            this.method2756(-57, false);
        }
        return new class466(this.field6468, arg0, this.field6469, this.field6461);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class466(int arg0, int arg1, int arg2, int arg3) {
        this.field6468 = arg0;
        this.field6461 = arg3;
        this.field6469 = arg2;
        this.field6464 = arg1;
    }
}
