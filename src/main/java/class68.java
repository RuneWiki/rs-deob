import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class68 extends class281 {

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[Lok;")
    public static class94[] field857 = new class94[50];

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "[I")
    public static int[] field858 = new int[50];

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field856 = 0;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field860 = "Checking for updates - ";

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method387(int arg0) {
        field858 = null;
        if (arg0 != 0) {
            field856 = 120;
        }
        field857 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public static final void method388(byte arg0) {
        int var1 = -49 % ((arg0 - 19) / 54);
        class15.field196.method1701((byte) 74);
        field859++;
    }
}
