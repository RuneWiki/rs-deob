import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class484 extends class59 {

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lhn;")
    public static class509 field6961 = new class509(44, 3);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field6963 = 0;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lqd;")
    public static class315 field6962 = new class315("", 12);

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lhn;")
    public static class509 field6968 = new class509(69, 0);

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Z")
    public static boolean field6970 = true;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[I")
    public static int[] field6971 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field6965;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public int field6966;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public int field6969;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lor;")
    public class455 field6960;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[Lju;")
    public class83[] field6964;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lul;Lya;I)V", line = 3)
    public static final void method2897(class406 arg0, class38 arg1, int arg2) {
        field6959++;
        if (class363.field5369) {
            return;
        }
        arg1.method360(0);
        class23.field283 = arg1.method345(class84.method694(arg0, class227.field3701), true);
        if (arg2 < 67) {
            field6961 = null;
        }
        class23.field283.method132((class80.field1163 - class23.field283.method129()) / 2, (class76.field1105 - class23.field283.method139()) / 2);
        class177.field2680 = arg1.method345(class84.method694(arg0, class175.field2599), true);
        class177.field2680.method132((class80.field1163 - class177.field2680.method129()) / 2, 18);
        class363.field5369 = true;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 23)
    public static void method2898(int arg0) {
        if (arg0 != -15696) {
            method2898(79);
        }
        field6962 = null;
        field6971 = null;
        field6968 = null;
        field6961 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lya;BII)Z", line = 44)
    public final boolean method2899(class38 arg0, byte arg1, int arg2, int arg3) {
        field6958++;
        if (arg1 != 88) {
            return true;
        }
        if (this.field6964 != null) {
            for (int var5 = 0; var5 < this.field6964.length; var5++) {
                if (this.field6964[var5].method693(arg2, arg3) && this.field6960.method27((byte) -122, arg0, arg3, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
