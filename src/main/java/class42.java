import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class42 extends class107 {

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Z")
    public boolean field667 = false;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "Lmg;")
    public static class244 field664 = new class244();

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Lqh;")
    public static class189 field674 = new class189(200);

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "Ldf;")
    public static class51 field680 = class46.method233("Clientscript error in: ", 100);

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "[Z")
    public static boolean[] field681 = new boolean[100];

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field678 = -1;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Ldf;")
    public static class51 field684 = class46.method233("null", 100);

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "Ldf;")
    private static class51 field682 = class46.method233("Walk here", 100);

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "Ldf;")
    public static class51 field677 = class46.method233("Suche nach Updates )2 ", 100);

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Ldf;")
    public static class51 field679 = field682;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "[I")
    public static int[] field683;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public static final void method215(int arg0) {
        for (class93 var1 = (class93) class209.field3485.method1720(true); var1 != null; var1 = (class93) class209.field3485.method1712((byte) 112)) {
            if (var1.field1556) {
                var1.method701((byte) 89);
            }
        }
        for (class93 var2 = (class93) class179.field2958.method1720(true); var2 != null; var2 = (class93) class179.field2958.method1712((byte) 112)) {
            if (var2.field1556) {
                var2.method701((byte) 89);
            }
        }
        if (arg0 != -25687) {
            method215(-61);
        }
        field670++;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public static final void method216(int arg0) {
        field665++;
        if (class204.field3415 != null) {
            class204.field3415.method838(-125);
            class204.field3415 = null;
        }
        class75.method540((byte) 109);
        class174.method1221();
        for (int var1 = 0; var1 < 4; var1++) {
            class159.field2605[var1].method1192(16777215);
        }
        class160.method1137((byte) 40);
        System.gc();
        class55.method353(2, (byte) 108);
        if (arg0 != 104) {
            method217(31, 16, -65, -97, 15, 43, 113);
        }
        class153.field2556 = -1;
        class236.field4117 = false;
        class189.method1355(arg0 + 20198, true);
        class241.field4179 = 0;
        class100.field1657 = false;
        class11.field160 = 0;
        for (int var2 = 0; var2 < class135.field2250.length; var2++) {
            class135.field2250[var2] = null;
        }
        class86.field1444 = 0;
        class218.field3788 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class66.field1055[var3] = null;
            class70.field1136[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class34.field512[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class90.field1493[var5][var6][var7] = null;
                }
            }
        }
        class223.method1540(115);
        class12.method71(302);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class28.field408 <= arg3 - arg2 && class115.field1954 >= (arg2 + arg3) && class36.field542 <= (arg1 - arg2) && (arg1 + arg2) <= class175.field2867) {
            class252.method1717(arg6, arg2, (byte) -66, arg3, arg4, arg5, arg1);
        } else {
            class159.method1134(arg2, arg3, arg5, arg6, arg4, arg1, (byte) 94);
        }
        field673++;
        if (arg0 != -1) {
            field664 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
    public static void method218(int arg0) {
        field664 = null;
        field681 = null;
        field683 = null;
        if (arg0 != 2) {
            method215(87);
        }
        field682 = null;
        field674 = null;
        field677 = null;
        field679 = null;
        field684 = null;
        field680 = null;
    }
}
