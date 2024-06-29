import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 extends class116 {

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    public int[] field3256 = new int[1];

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
    public int[] field3261 = new int[] { -1 };

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
    public static int[] field3254 = new int[100];

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "Lic;")
    public static class59 field3257 = class59.method433(0, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3258 = -1;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Luf;")
    public static class145 field3255 = new class145();

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Lic;")
    private static class59 field3263 = class59.method433(0, " from your ignore list first)3");

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lic;")
    public static class59 field3264 = field3263;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "Lja;")
    public static class63 field3262 = new class63();

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3268 = 5063219;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3267 = -1;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "Lic;")
    public static class59 field3269 = class59.method433(0, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Lic;")
    private static class59 field3270 = class59.method433(0, "Too many connections from your address)3");

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "Lic;")
    public static class59 field3271 = field3270;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lje;")
    public static class67 field3266;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwd;IIIIIBI)V")
    public static final void method1105(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg5 >= 0 && arg5 < 104 && arg2 >= 0 && arg2 < 104) {
            class121.field2785[arg1][arg5][arg2] = 0;
            while (true) {
                int var8 = arg0.method1194(false);
                if (var8 == 0) {
                    if (arg1 == 0) {
                        class26.field695[0][arg5][arg2] = -class137.method1045(arg5 + arg3 + 932731, arg4 + 556238 + arg2, (byte) 112) * 8;
                    } else {
                        class26.field695[arg1][arg5][arg2] = class26.field695[arg1 - 1][arg5][arg2] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method1194(false);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg1 == 0) {
                        class26.field695[0][arg5][arg2] = -var9 * 8;
                    } else {
                        class26.field695[arg1][arg5][arg2] = class26.field695[arg1 - 1][arg5][arg2] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class63.field1628[arg1][arg5][arg2] = arg0.method1169((byte) -119);
                    class56.field1382[arg1][arg5][arg2] = (byte) ((var8 - 2) / 4);
                    class134.field2986[arg1][arg5][arg2] = (byte) class24.method156(var8 + arg7 - 2, 3);
                } else if (var8 <= 81) {
                    class121.field2785[arg1][arg5][arg2] = (byte) (var8 - 49);
                } else {
                    class6.field124[arg1][arg5][arg2] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method1194(false);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method1194(false);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method1194(false);
                }
            }
        }
        field3260++;
        int var11 = -5 % ((arg6 - 54) / 43);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -15412) {
            method1106(-85, 13, 115, 118, 30);
        }
        for (int var5 = 0; var5 < class158.field3502; var5++) {
            if (class2.field49[var5] + field3254[var5] > arg4 && field3254[var5] < arg4 + arg2 && class6.field125[var5] + class40.field1014[var5] > arg3 && arg1 + arg3 > class40.field1014[var5]) {
                class25.field628[var5] = true;
            }
        }
        field3259++;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static void method1107(int arg0) {
        field3271 = null;
        field3266 = null;
        field3270 = null;
        field3257 = null;
        field3264 = null;
        field3255 = null;
        field3269 = null;
        field3263 = null;
        field3254 = null;
        if (arg0 == 4) {
            field3262 = null;
        }
    }
}
