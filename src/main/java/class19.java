import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 {

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public int field334 = -1;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "J")
    public static long field329 = -1L;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field331 = 1405;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field326 = -1;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Ljr;")
    public static class357 field328 = new class357(8);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Lpl;")
    public class457 field330;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "[I")
    public int[] field332;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field327;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public static void method125(int arg0) {
        if (arg0 != 8) {
            method125(-46);
        }
        field328 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method126(String arg0, byte arg1) {
        int var2 = 95 % ((-arg1 - 15) / 37);
        field333++;
        return class99.method676(true, arg0, 10, (byte) -50);
    }
}
