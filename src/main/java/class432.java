import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class432 {

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Lvf;")
    private class166 field6247;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field6249 = -1;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field6253 = 0;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field6257 = 2;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
    public static int[] field6251 = new int[4096];

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "Lpt;")
    private class147 field6256;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "Let;")
    public static class274 field6245;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6251[var0] = class2.method5((byte) -105, var0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2581(boolean arg0) {
        if (!arg0) {
            field6255 = 91;
        }
        field6245 = null;
        field6251 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Lpt;", line = 17)
    public final class147 method2582(byte arg0) {
        field6246++;
        class147 var2 = this.field6256;
        if (this.field6247.field1985 == var2) {
            this.field6256 = null;
            return null;
        }
        this.field6256 = var2.field1779;
        if (arg0 >= -126) {
            field6249 = 64;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Lpt;", line = 39)
    public final class147 method2583(int arg0) {
        if (arg0 != 0) {
            field6253 = 75;
        }
        field6248++;
        class147 var2 = this.field6247.field1985.field1779;
        if (this.field6247.field1985 == var2) {
            this.field6256 = null;
            return null;
        } else {
            this.field6256 = var2.field1779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLvf;)V", line = 64)
    public final void method2584(byte arg0, class166 arg1) {
        field6254++;
        this.field6247 = arg1;
        if (arg0 != -25) {
            this.method2584((byte) 24, (class166) null);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V", line = 80)
    public static final void method2585(int arg0, int arg1, int arg2, int arg3) {
        field6258++;
        if (arg1 != -1516) {
            field6249 = -79;
        }
        class230.field3185.method897(arg0, arg1 ^ 0x587);
        class230.field3185.method878(true, arg3);
        class230.field3185.method898(arg2, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 96)
    public static final void method2586(int arg0, int arg1) {
        field6250++;
        if (arg1 != 25354) {
            method2586(-80, -71);
        }
        class89 var2 = class146.method695(16, arg0, (byte) -119);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z", line = 116)
    public static final boolean method2587(int arg0, byte arg1) {
        field6252++;
        if (arg0 == 2 || arg0 == 57 || arg0 == 10 || arg0 == 45 || arg0 == 1002) {
            return true;
        } else {
            if (arg1 > -19) {
                method2587(14, (byte) -59);
            }
            return arg0 == 51 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 136)
    public class432() {
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lvf;)V", line = 150)
    public class432(class166 arg0) {
        this.field6247 = arg0;
    }
}
