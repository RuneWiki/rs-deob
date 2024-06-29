import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class102 extends class263 implements class521 {

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "[I")
    public static int[] field1311 = new int[2];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "C")
    public char field1303;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "J")
    public long field1302;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)C", line = 4)
    public final char method730(int arg0) {
        field1300++;
        if (arg0 != 13610) {
            field1311 = null;
        }
        return this.field1303;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I", line = 18)
    public final int method731(byte arg0) {
        field1310++;
        return arg0 > -67 ? -81 : this.field1299;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)J", line = 34)
    public final long method732(byte arg0) {
        if (arg0 == 57) {
            field1307++;
            return this.field1302;
        } else {
            return -81L;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 47)
    public final int method733(int arg0) {
        field1308++;
        return arg0 > -112 ? 102 : this.field1305;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)I", line = 64)
    public final int method734(byte arg0) {
        field1304++;
        if (arg0 <= 86) {
            field1298 = -88;
        }
        return this.field1306;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIIIII)V", line = 76)
    public static final void method735(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= class292.field3700 && class337.field4186 >= arg5 && arg7 >= class125.field1524 && arg3 <= class377.field4848) {
            class569.method3013(arg2, (byte) -52, arg6, arg4, arg3, arg0, arg5, arg7);
        } else {
            class211.method1240(-92, arg6, arg7, arg2, arg3, arg0, arg4, arg5);
        }
        if (arg1 < -119) {
            field1301++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 94)
    public static void method736(int arg0) {
        if (arg0 != -15352) {
            method735(65, (byte) 65, 28, 115, 27, -18, -101, -117);
        }
        field1311 = null;
    }
}
