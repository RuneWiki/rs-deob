import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class81 extends class46 {

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
    public static int[] field1366 = new int[128];

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lmb;")
    public static class132 field1372 = class166.method1092(":clan:", 112);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field1371 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lmb;")
    public static class132 field1376 = class166.method1092("sich mit einer anderen Welt zu verbinden)3", 126);

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Lmb;")
    private static class132 field1375 = class166.method1092("RuneScape is loading )2 please wait)3)3)3", 122);

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lmb;")
    public static class132 field1368 = class166.method1092("zur-Uck auf die RuneScape)2Webseite gehen", 118);

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lmb;")
    public static class132 field1365 = field1375;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "J")
    public static long field1370;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lmf;")
    public class136 field1369;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static final void method496(int arg0) {
        field1374++;
        class36.field590.method1137(arg0 + 6905);
        if (arg0 != -3) {
            method496(84);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static void method497(int arg0) {
        field1368 = null;
        field1376 = null;
        field1375 = null;
        field1365 = null;
        if (arg0 != 11371) {
            field1368 = null;
        }
        field1366 = null;
        field1372 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIII)V")
    public static final void method498(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg2; var6++) {
            class23.method153(arg5, class61.field1033[var6], true, arg3, arg0);
        }
        if (arg1 <= 21) {
            field1371 = 31;
        }
        field1373++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method499(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1367++;
        if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
            if (class66.field1096 && class139.field2615 != arg2) {
                return;
            }
            int var8 = arg2;
            if (arg2 < 3 && (class148.field2722[1][arg6][arg0] & 0x2) == 2) {
                var8 = arg2 + 1;
            }
            class88.method547(arg6, arg2, 4096, arg0, class182.field3351[arg2], var8, arg7);
            if (arg5 >= 0) {
                class161.method1042(arg3, arg5, arg2, false, arg6, arg0, arg4, class182.field3351[arg2], (byte) 115, var8, false);
            }
        }
        if (arg1 != -16) {
            method496(31);
        }
    }
}
