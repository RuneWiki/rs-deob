import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class239 {

    @OriginalMember(owner = "client!w", name = "l", descriptor = "J")
    public long field4326 = 0L;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lkh;")
    public static class117 field4318 = class224.method1450((byte) -84, "<col=00ff80>");

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lge;")
    public static class71 field4323 = new class71(64);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lkh;")
    public static class117 field4324 = class224.method1450((byte) -38, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lkh;")
    public static class117 field4327 = class224.method1450((byte) -90, "Sprites geladen)3");

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    public static int[] field4330 = new int[200];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[I")
    public static int[] field4329 = new int[128];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ldd;")
    public class38 field4320;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Ldd;")
    public class38 field4331;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field4327 = null;
        field4329 = null;
        if (arg0 == 200) {
            field4330 = null;
            field4323 = null;
            field4324 = null;
            field4318 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILkh;Lai;Lkh;)[Lo;")
    public static final class153[] method1520(int arg0, class117 arg1, class10 arg2, class117 arg3) {
        field4317++;
        if (arg0 < 74) {
            return null;
        } else {
            int var4 = arg2.method84(arg3, 1491);
            int var5 = arg2.method102(false, arg1, var4);
            return class167.method1185(arg2, -1, var5, var4);
        }
    }
}
