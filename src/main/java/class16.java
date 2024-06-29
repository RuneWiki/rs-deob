import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class16 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lbc;")
    public static class225 field225 = new class225("", 11);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lmc;")
    public static class78 field226 = new class78(16, -1);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lnk;")
    public static class464 field231 = null;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "F")
    public static float field227;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIB)I", line = 5)
    public static final int method101(int arg0, boolean arg1, int arg2, byte arg3) {
        field224++;
        class257 var4 = class80.method525(arg1, -7967, arg0);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 95 % ((arg3 + 6) / 37);
            for (int var7 = 0; var7 < var4.field3415.length; var7++) {
                if (var4.field3418[var7] == arg2) {
                    var5 += var4.field3415[var7];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 40)
    public static void method102(byte arg0) {
        field226 = null;
        int var1 = -101 / ((arg0 + 80) / 36);
        field225 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 52)
    public static final void method103(int arg0) {
        int var1 = 2 % ((-arg0 - 63) / 40);
        field229++;
        class487.field6743.method495(-120);
    }
}
