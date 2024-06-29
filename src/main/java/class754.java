import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class754 extends class549 {

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public int field10382;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[Lhca;")
    public static class244[] field10383 = new class244[5];

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "J")
    public static long field10379;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Luv;")
    public static class755 field10385;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method4181(byte arg0) {
        field10383 = null;
        if (arg0 != 6) {
            method4182(-15, 72, 46);
        }
        field10385 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lww;")
    public final class288 method1206(boolean arg0) {
        if (arg0) {
            field10383 = null;
        }
        field10380++;
        return class687.field9560;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Z")
    public static final boolean method4182(int arg0, int arg1, int arg2) {
        field10384++;
        if (arg2 != 458752) {
            field10383 = null;
        }
        return class452.method2764(arg0, arg1, (byte) -60) | (arg0 & 0x70000) != 0 || class622.method3508(arg0, arg1, -128);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILrg;Lal;III)V")
    public class754(int arg0, class557 arg1, class125 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field10382 = arg5;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
    public static final boolean method4183(int arg0, int arg1) {
        if (arg0 >= -68) {
            return false;
        } else {
            field10381++;
            return arg1 == 2 || arg1 == 3;
        }
    }

    static {
        for (int var0 = 0; var0 < field10383.length; var0++) {
            field10383[var0] = new class244();
        }
    }
}
