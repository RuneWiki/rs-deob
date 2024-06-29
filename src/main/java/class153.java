import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class153 extends class131 {

    @OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    private int field2297;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2296 = "flash3:";

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "[I")
    public static int[] field2304 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!kn", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2309 = "Loaded title screen";

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "F")
    public static float field2298;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!kn", name = "C", descriptor = "[I")
    public static int[] field2308;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 4)
    public static void method1055(int arg0) {
        if (arg0 != 2) {
            method1056(69, -17, -116, (class220) null, -119);
        }
        field2308 = null;
        field2309 = null;
        field2296 = null;
        field2304 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIILtb;I)V", line = 19)
    public static final void method1056(int arg0, int arg1, int arg2, class220 arg3, int arg4) {
        field2299++;
        if (class94.field1516) {
            class167.method1187(arg4, arg0, arg4 + arg3.field3526, arg0 - -arg3.field3458);
        }
        if (class202.field3035 >= 3) {
            if (class94.field1516) {
                class270 var5 = arg3.method1551(arg1 ^ 0x5AB5, false);
                if (var5 != null) {
                    var5.method617(arg4, arg0);
                }
            } else {
                class109.method807(arg4, arg0, 0, arg3.field3486, arg3.field3420);
            }
        } else if (class94.field1516) {
            ((class86) class284.field4421).method618(arg4, arg0, arg3.field3526, arg3.field3458, class284.field4421.field4202 / 2, class284.field4421.field4207 / 2, (int) class259.field4063, 256, (class86) arg3.method1551(2, false));
        } else {
            ((class249) class284.field4421).method1721(arg4, arg0, arg3.field3526, arg3.field3458, class284.field4421.field4202 / 2, class284.field4421.field4207 / 2, (int) class259.field4063, 256, arg3.field3486, arg3.field3420);
        }
        if (arg1 != 23223) {
            field2304 = (int[]) null;
        }
        class240.field3831[arg2] = true;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V", line = 64)
    public final void method6(int arg0, int arg1, int arg2) {
        field2307++;
        if (arg0 != 1877660193) {
            field2305 = -125;
        }
        int var4 = this.field2300 * arg1 >> 12;
        int var5 = this.field2301 * arg2 >> 12;
        int var6 = this.field2297 * arg2 >> 12;
        int var7 = this.field2310 * arg1 >> 12;
        class152.method1050((byte) -108, var6, this.field2056, var7, var4, var5);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V", line = 86)
    public final void method4(int arg0, int arg1, int arg2) {
        int var4 = this.field2297 * arg0 >> 12;
        int var5 = this.field2310 * arg2 >> 12;
        field2306++;
        if (arg1 != 3) {
            method1056(125, -45, -82, (class220) null, 28);
        }
        int var6 = this.field2300 * arg2 >> 12;
        int var7 = this.field2301 * arg0 >> 12;
        class19.method147(var6, this.field2059, 2, var7, var4, this.field2046, this.field2056, var5);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)I", line = 102)
    public static final int method1057(int arg0) {
        field2303++;
        if (arg0 != 2) {
            method1057(73);
        }
        return 2;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IBI)V", line = 121)
    public final void method3(int arg0, byte arg1, int arg2) {
        if (arg1 <= 102) {
            method1057(-14);
        }
        field2302++;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIII)V", line = 143)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2310 = arg2;
        this.field2301 = arg3;
        this.field2297 = arg1;
        this.field2300 = arg0;
    }
}
