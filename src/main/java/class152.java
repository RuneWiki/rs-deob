import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 extends class124 {

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Lpe;")
    public static class109 field3345 = class141.method1120("sich mit einer anderen Welt zu verbinden)3", 0);

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Z")
    public static boolean field3344 = false;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "Lpe;")
    private static class109 field3348 = class141.method1120(" more options", 0);

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lpe;")
    public static class109 field3346 = field3348;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Lpe;")
    private static class109 field3338 = class141.method1120("Invalid loginserver requested)3", 0);

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lpe;")
    public static class109 field3352 = field3338;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "[I")
    public static int[] field3354 = new int[50];

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "[I")
    public static int[] field3356 = new int[32];

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Lbe;")
    public static class13 field3339 = new class13(new byte[5000]);

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "Lpe;")
    private static class109 field3357 = class141.method1120("glow1:", 0);

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "Lpe;")
    public static class109 field3359 = field3357;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lpe;")
    public static class109 field3358 = field3357;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "B")
    public byte field3340;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "B")
    public static byte field3355;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "Loc;")
    public static class100 field3341;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lre;")
    public class123 field3353;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "Lba;")
    public static class9 field3347;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "[I")
    public static int[] field3337;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "[I")
    public static int[] field3342;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method1176(boolean arg0, int arg1, Object arg2) {
        field3350++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class88.method732((byte) 58, var3) : var3;
        } else {
            if (arg1 != 50) {
                method1177((byte) 121);
            }
            if (!(arg2 instanceof class27)) {
                throw new IllegalArgumentException();
            }
            class27 var4 = (class27) arg2;
            return var4.method241(arg1 ^ 0xFFFFD9CF);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static void method1177(byte arg0) {
        field3346 = null;
        field3358 = null;
        field3347 = null;
        field3356 = null;
        field3345 = null;
        field3359 = null;
        if (arg0 < 59) {
            method1176(true, 19, null);
        }
        field3348 = null;
        field3338 = null;
        field3352 = null;
        field3341 = null;
        field3337 = null;
        field3354 = null;
        field3357 = null;
        field3342 = null;
        field3339 = null;
    }
}
