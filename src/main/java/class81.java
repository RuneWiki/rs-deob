import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class81 extends class265 {

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    private int field1324 = -32768;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Z")
    public static boolean field1332 = true;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lsb;")
    public static class221 field1322 = new class221(64);

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Z")
    public static boolean field1333 = true;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "[Z")
    public static boolean[] field1336 = new boolean[8];

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Lp;")
    public static class280 field1334 = class18.method140((byte) -127, ":assist:");

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "[Ljk;")
    public static class249[] field1335 = new class249[4];

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Lak;")
    public static class137 field1337;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method591(int arg0) {
        field1334 = null;
        field1337 = null;
        field1335 = null;
        if (arg0 == -32768) {
            field1336 = null;
            field1322 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
    public final int method426() {
        field1323++;
        return this.field1324;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
        class256 var13 = class23.method177((byte) -107, this.field1326).method1476(0, 255, (class78) null, this.field1329);
        field1328++;
        if (var13 != null) {
            var13.method427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1324 = var13.method426();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1327++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILp;)I")
    public static final int method592(int arg0, class280 arg1) {
        field1321++;
        if (arg1 == null) {
            return -1;
        }
        if (arg0 != -1) {
            field1332 = true;
        }
        for (int var2 = 0; var2 < class208.field3590; var2++) {
            if (arg1.method1887((byte) 32, class129.field2236[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
