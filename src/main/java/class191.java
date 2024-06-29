import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class191 extends class259 {

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Lmd;")
    private final class221 field3460;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lpk;")
    public final class99 field3464;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lcc;")
    public static class209 field3452 = class95.method669(89, ")1o");

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lcc;")
    public static class209 field3459 = class95.method669(120, "overlay");

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "[I")
    public static int[] field3457 = new int[2];

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Lcc;")
    public static class209 field3462 = class95.method669(87, "; Expires=");

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Lcc;")
    public static class209 field3468 = class95.method669(102, "null");

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "Lsj;")
    public static class49 field3458;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "[I")
    public static int[] field3474;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "[Ljb;")
    public static class269[] field3467;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "[[[B")
    public static byte[][][] field3461;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIB)V")
    public final void method1311(int arg0, int arg1, int arg2, byte arg3) {
        field3469++;
        this.field3475 = arg0;
        this.field3476 = arg1;
        this.field3471 = arg2;
        if (arg3 <= 8) {
            this.method1311(-128, -100, -89, (byte) 15);
        }
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        field3466++;
        class74.field1396 = 0;
        class244.field4423 = 0;
        class200.method1372(-2860);
        class159.method1101((byte) 89);
        class134.method940((byte) 119);
        class132.method932((byte) -51);
        for (int var1 = 0; var1 < class74.field1396; var1++) {
            int var3 = class110.field2229[var1];
            if (class163.field2968 != class103.field1993[var3].field1512) {
                if (class103.field1993[var3].field2150 > 0) {
                    class161.method1109(11172, class103.field1993[var3]);
                }
                class103.field1993[var3] = null;
            }
        }
        if (arg0 != 3121) {
            field3462 = null;
        }
        if (class112.field2253 != client.field2818.field2085) {
            throw new RuntimeException("gpp1 pos:" + client.field2818.field2085 + " psize:" + class112.field2253);
        }
        for (int var2 = 0; var2 < class250.field4502; var2++) {
            if (class103.field1993[class82.field1653[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class250.field4502);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
    public static void method1313(int arg0) {
        field3467 = null;
        field3468 = null;
        field3457 = null;
        field3474 = null;
        field3461 = null;
        field3459 = null;
        field3462 = null;
        field3458 = null;
        if (arg0 == 25659) {
            field3452 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
    public static final void method1314(int arg0, int arg1, int arg2) {
        class84.field1677.method287((byte) 119, arg2);
        class84.field1677.method754(false, arg0);
        class84.field1677.method732(arg2 + 93, arg1);
        class166.field2997++;
        field3473++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZIII)V")
    public static final void method1315(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3455++;
        if (class161.method1111((byte) 92, arg2) && arg0 == -50) {
            class85.method612(arg4, (byte) 76, arg1, -1, class50.field984[arg2], arg3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lpk;Lmd;)V")
    public class191(class99 arg0, class221 arg1) {
        this.field3460 = arg1;
        this.field3464 = arg0;
    }
}
