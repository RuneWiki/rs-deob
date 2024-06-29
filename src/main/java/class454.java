import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class454 extends class379 {

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "[B")
    public byte[] field6395;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[[I")
    public static int[][] field6400 = new int[6][];

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "Lde;")
    public static class558 field6402 = new class558("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Lsj;")
    public static class485 field6403;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "[Lgda;")
    public static class61[] field6399;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public static void method2750(int arg0) {
        field6400 = null;
        field6399 = null;
        if (arg0 != 20462) {
            method2751((byte) -6, null);
        }
        field6402 = null;
        field6403 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2751(byte arg0, String arg1) {
        field6401++;
        return arg0 == -44 ? class664.field9124.containsKey(arg1) : false;
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "([B)V")
    public class454(byte[] arg0) {
        this.field6395 = arg0;
    }
}
