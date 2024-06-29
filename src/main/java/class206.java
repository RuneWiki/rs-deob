import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class206 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field3412 = -1;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lij;")
    public static class50 field3417 = class78.method578(124, "<col=ffff00>");

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lij;")
    private static class50 field3421 = class78.method578(124, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lnativeadvert/browsercontrol;")
    public static browsercontrol field3414 = null;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lce;")
    public static class10 field3413 = null;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[I")
    public static int[] field3423 = new int[500];

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[I")
    public static int[] field3424 = new int[256];

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lij;")
    public static class50 field3425 = field3421;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lv;")
    public static class143 field3422;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lve;")
    public class31 field3418;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
    public int[] field3419;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "[Lij;")
    public class50[] field3420;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "[[[I")
    public static int[][][] field3416;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)[Ljd;")
    public static final class85[] method1388(int arg0) {
        field3411++;
        class85[] var1 = new class85[class190.field3151];
        for (int var2 = 0; var2 < class190.field3151; var2++) {
            byte[] var4 = class31.field628[var2];
            int var5 = class46.field836[var2] * class164.field2805[var2];
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var6[var7] = class114.field1996[class51.method413(255, var4[var7])];
            }
            var1[var2] = new class169(class89.field1707, class116.field2024, class20.field421[var2], class2.field27[var2], class46.field836[var2], class164.field2805[var2], var6);
        }
        class261.method1759(true);
        int var3 = -45 / ((75 - arg0) / 50);
        return var1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Z")
    public static final boolean method1389(int arg0, int arg1) {
        if (arg0 == -1) {
            field3415++;
            return ((arg1 & 0x1AFE90B8) >> 28) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public static void method1390(int arg0) {
        field3425 = null;
        field3417 = null;
        field3424 = null;
        field3422 = null;
        if (arg0 != -1) {
            method1390(-17);
        }
        field3421 = null;
        field3414 = null;
        field3423 = null;
        field3416 = null;
        field3413 = null;
    }
}
