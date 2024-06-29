import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class764 extends class193 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[Lug;")
    public class588[] field10545;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lfja;")
    public static class783 field10546 = new class783(37, 2);

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "[I")
    public static int[] field10548 = new int[4096];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 6)
    public static void method4216(byte arg0) {
        field10546 = null;
        int var1 = 15 % ((63 - arg0) / 41);
        field10548 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([Lug;)V", line = 15)
    public class764(class588[] arg0) {
        this.field10545 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/lang/String;)I", line = 29)
    public static final int method4217(int arg0, int arg1, String arg2) {
        field10547++;
        if (arg1 != 4096) {
            method4216((byte) 44);
        }
        return class341.method2123(arg2, arg0, true, -9105);
    }
}
