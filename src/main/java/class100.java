import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class20 {

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[I")
    public static int[] field2299 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Lsc;")
    public static class128 field2309 = class129.method1017(false, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lsc;")
    public static class128 field2307 = class129.method1017(false, "Nehmen");

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "Lsc;")
    public static class128 field2313 = class129.method1017(false, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "Lsc;")
    public static class128 field2312 = class129.method1017(false, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "[I")
    public static int[] field2318 = new int[32];

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "[Lb;")
    public static class8[] field2319 = new class8[1000];

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "Lsc;")
    public static class128 field2316 = class129.method1017(false, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "[I")
    public int[] field2301;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "[I")
    public int[] field2311;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "[I")
    public int[] field2317;

    @OriginalMember(owner = "client!oc", name = "F", descriptor = "[Lie;")
    public class61[] field2302;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "[Lie;")
    public class61[] field2320;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "[[[B")
    public byte[][][] field2308;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZJ)V")
    public static final void method762(boolean arg0, long arg1) {
        field2314++;
        if (arg1 == 0L) {
            return;
        }
        if (class151.field3476 >= 100) {
            class126.method958(0, 1, class18.field323, class124.field2797);
            return;
        }
        class128 var3 = class129.method1018(arg1, 82).method987(84);
        for (int var4 = 0; var4 < class151.field3476; var4++) {
            if (class51.field1033[var4] == arg1) {
                class126.method958(0, 1, class18.field323, class51.method395(new class128[] { var3, class53.field1053 }, false));
                return;
            }
        }
        if (arg0) {
            field2307 = null;
        }
        for (int var5 = 0; var5 < class35.field675; var5++) {
            if (class54.field1106[var5] == arg1) {
                class126.method958(0, 1, class18.field323, class51.method395(new class128[] { class123.field2792, var3, class159.field3645 }, false));
                return;
            }
        }
        if (var3.method991(-1, class151.field3473.field1050)) {
            class126.method958(0, 1, class18.field323, client.field447);
            return;
        }
        class72.field1612++;
        class51.field1033[class151.field3476] = arg1;
        class148.field3415[class151.field3476++] = class129.method1018(arg1, 82);
        class75.field1648 = class135.field3186;
        class152.field3502.method507(99, 172);
        class152.field3502.method651(-1070186000, arg1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBII)I")
    public static final int method763(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -110) {
            field2313 = null;
        }
        field2303++;
        if ((class110.field2485[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class110.field2485[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
    public static void method764(byte arg0) {
        field2307 = null;
        field2318 = null;
        field2313 = null;
        if (arg0 > -64) {
            field2313 = null;
        }
        field2309 = null;
        field2312 = null;
        field2319 = null;
        field2299 = null;
        field2316 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsf;III)Z")
    public static final boolean method765(class131 arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 7) {
            return true;
        }
        field2300++;
        byte[] var4 = arg0.method1023(arg3, arg2, (byte) -35);
        if (var4 == null) {
            return false;
        } else {
            class146.method1177(var4, (byte) 26);
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILsa;)V")
    public static final void method766(int arg0, class126 arg1) {
        if (arg0 == 0) {
            field2315++;
            class147.field3403 = arg1;
        }
    }
}
