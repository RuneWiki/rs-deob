import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class304 {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field5229 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field5236 = 0;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lsk;")
    public static class199 field5228 = new class199(200);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field5238 = -1;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lmh;")
    public static class62 field5240 = class201.method1405(true, "Stufe)2");

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lmh;")
    public static class62 field5241 = class201.method1405(true, ":chalreq:");

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Z")
    public static boolean field5239 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field5226;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field5233;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field5234;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lsg;")
    public static class191 field5237;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lka;")
    public static class274 field5235;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)V", line = 6)
    public static final void method2082(int arg0, byte arg1, int arg2) {
        field5225++;
        if (arg1 > -3) {
            method2085(-30);
        }
        int var3 = arg2--;
        int var4 = class182.field2900[arg2];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class92.field1468[arg2];
        if (arg0 == 0) {
            class105.field1721++;
            class170.field2772.method1693(213, false);
            class170.field2772.method717(1, var3 + var3 + 3);
        }
        if (arg0 == 1) {
            class170.field2772.method1693(24, false);
            class170.field2772.method717(1, var3 + var3 + 17);
            class103.field1699++;
        }
        if (arg0 == 2) {
            class78.field1316++;
            class170.field2772.method1693(23, false);
            class170.field2772.method717(1, var3 + var3 + 3);
        }
        class170.field2772.method730(class291.field4939[82] ? 1 : 0, 119);
        class170.field2772.method747((byte) 77, class290.field4936 + var4);
        class170.field2772.method747((byte) 101, class120.field2006 + var5);
        class236.field4062 = class182.field2900[0];
        class152.field2398 = class92.field1468[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class170.field2772.method730(class92.field1468[arg2] - var5, 127);
            class170.field2772.method722(true, class182.field2900[arg2] - var4);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I", line = 71)
    public static final int method2083(int arg0, int arg1, int arg2) {
        field5230++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return arg1 < 14 ? 36 : var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBII)V", line = 94)
    public static final void method2084(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field5231++;
        class272 var5 = (class272) class222.field3829.method311((byte) 114, (long) arg1);
        if (arg2 > -41) {
            field5241 = (class62) null;
        }
        if (var5 == null) {
            var5 = new class272();
            class222.field3829.method309(var5, (long) arg1, 1);
        }
        if (var5.field4627.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field4627.length; var8++) {
                var6[var8] = var5.field4627[var8];
                var7[var8] = var5.field4625[var8];
            }
            for (int var9 = var5.field4627.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4627 = var6;
            var5.field4625 = var7;
        }
        var5.field4627[arg3] = arg4;
        var5.field4625[arg3] = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 156)
    public static void method2085(int arg0) {
        if (arg0 != 1) {
            field5236 = 100;
        }
        field5237 = null;
        field5241 = null;
        field5228 = null;
        field5235 = null;
        field5240 = null;
    }
}
