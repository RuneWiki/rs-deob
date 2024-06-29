import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class179 extends class255 {

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    private int field2568;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    private int field2575;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    private int field2577;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    private int field2578;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field2563 = 1;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Z")
    public static boolean field2562 = false;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "Lde;")
    public static class195 field2576;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(III)V", line = 7)
    public final void method703(int arg0, int arg1, int arg2) {
        if (arg2 != 27159) {
            this.field2575 = 82;
        }
        field2569++;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 26)
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2572 = arg7;
        this.field2568 = arg1;
        this.field2575 = arg3;
        this.field2577 = arg4;
        this.field2566 = arg6;
        this.field2565 = arg2;
        this.field2571 = arg5;
        this.field2578 = arg0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V", line = 44)
    public final void method699(int arg0, int arg1, int arg2) {
        if (arg0 != 16900) {
            method1245(70);
        }
        field2574++;
        int var4 = this.field2568 * arg1 >> 12;
        int var5 = this.field2565 * arg2 >> 12;
        int var6 = this.field2575 * arg1 >> 12;
        int var7 = this.field2578 * arg2 >> 12;
        int var8 = this.field2577 * arg2 >> 12;
        int var9 = this.field2566 * arg2 >> 12;
        int var10 = this.field2572 * arg1 >> 12;
        int var11 = this.field2571 * arg1 >> 12;
        class58.method466(-8181, var5, var8, var7, var10, var6, this.field3809, var9, var4, var11);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZZLjava/lang/String;IIILjava/lang/String;JZ)V", line = 74)
    public static final void method1244(int arg0, int arg1, boolean arg2, boolean arg3, String arg4, int arg5, int arg6, int arg7, String arg8, long arg9, boolean arg10) {
        field2573++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class190 var14 = new class190(128);
        var14.method1355((byte) -108, 10);
        var14.method1361((arg2 ? 2 : 0) | (arg3 ? 1 : 0) | (arg10 ? 4 : 0), (byte) 126);
        var14.method1327(arg9, (byte) 7);
        var14.method1354(var12[0], (byte) 121);
        var14.method1343(arg4, 0);
        var14.method1354(var12[1], (byte) 102);
        var14.method1361(class177.field2543, (byte) 127);
        var14.method1355((byte) -113, arg0);
        var14.method1355((byte) -127, arg5);
        var14.method1354(var12[2], (byte) 115);
        var14.method1361(arg6, (byte) 126);
        var14.method1361(arg7, (byte) 123);
        var14.method1354(var12[3], (byte) -9);
        var14.method1324(-105, class167.field2388, class343.field5308);
        class190 var15 = new class190(350);
        var15.method1343(arg8, 0);
        int var16 = 8 - (class225.method1646(-110, arg8) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1355((byte) -124, (int) (Math.random() * 255.0D));
        }
        if (arg1 < 23) {
            return;
        }
        var15.method1337(-124, var12);
        class107.field1533.field2776 = 0;
        class107.field1533.method1355((byte) -111, 22);
        class107.field1533.method1361(var15.field2776 + var14.field2776 + 2, (byte) 125);
        class107.field1533.method1361(552, (byte) 123);
        class107.field1533.method1349(0, 3009, var14.field2776, var14.field2718);
        class107.field1533.method1349(0, 3009, var15.field2776, var15.field2718);
        class121.field1710 = -3;
        class108.field1566 = 0;
        class9.field156 = 1;
        class54.field795 = 0;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V", line = 133)
    public static void method1245(int arg0) {
        if (arg0 != 0) {
            method1246(-42);
        }
        field2576 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)V", line = 146)
    public final void method701(int arg0, int arg1, byte arg2) {
        int var4 = 32 % ((1 - arg2) / 57);
        field2570++;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V", line = 158)
    public static final void method1246(int arg0) {
        field2567++;
        class213.method1536((byte) 124, false);
        System.gc();
        class250.method1837(25, 40);
        if (arg0 != 25593) {
            method1245(19);
        }
    }
}
