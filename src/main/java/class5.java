import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class5 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljava/lang/String;")
    public static String field121 = "skill: ";

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field126 = new int[1000];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    public static int[] field123 = new int[200];

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/lang/String;")
    public static String field127 = "Loading - please wait.";

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field122 = 1;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lmm;")
    public static class216 field128;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Li;")
    public static class74 field130;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field125;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZZZ)Laj;")
    public static final class151 method38(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field131++;
        class27 var5 = null;
        if (class146.field2397 != null) {
            var5 = new class27(arg0, class146.field2397, class293.field4805[arg0], 1000000);
        }
        if (arg1 >= -110) {
            return null;
        }
        class312.field5024[arg0] = class187.field2995.method1111(-5, arg0, var5, class58.field1017);
        if (arg3) {
            class312.field5024[arg0].method1364((byte) -105);
        }
        return new class151(class312.field5024[arg0], arg4, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method39(byte arg0) {
        field121 = null;
        field123 = null;
        if (arg0 != -37) {
            return;
        }
        field128 = null;
        field126 = null;
        field127 = null;
        field125 = null;
        field130 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public static final void method40(byte arg0) {
        int var1 = -114 / ((33 - arg0) / 33);
        class136.field2239.method635(-31777);
        field124++;
        int var2 = class136.field2239.method641(false, 8);
        if (class303.field4932 > var2) {
            for (int var3 = var2; var3 < class303.field4932; var3++) {
                class185.field2968[class268.field4456++] = class186.field2972[var3];
            }
        }
        if (class303.field4932 < var2) {
            throw new RuntimeException("gnpov1");
        }
        class303.field4932 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class186.field2972[var4];
            class307 var6 = class57.field1002[var5];
            int var7 = class136.field2239.method641(false, 1);
            if (var7 == 0) {
                class186.field2972[class303.field4932++] = var5;
                var6.field749 = class275.field4598;
            } else {
                int var8 = class136.field2239.method641(false, 2);
                if (var8 == 0) {
                    class186.field2972[class303.field4932++] = var5;
                    var6.field749 = class275.field4598;
                    class41.field619[class289.field4761++] = var5;
                } else if (var8 == 1) {
                    class186.field2972[class303.field4932++] = var5;
                    var6.field749 = class275.field4598;
                    int var9 = class136.field2239.method641(false, 3);
                    var6.method285(var9, (byte) -93, 1);
                    int var10 = class136.field2239.method641(false, 1);
                    if (var10 == 1) {
                        class41.field619[class289.field4761++] = var5;
                    }
                } else if (var8 == 2) {
                    class186.field2972[class303.field4932++] = var5;
                    var6.field749 = class275.field4598;
                    if (class136.field2239.method641(false, 1) == 1) {
                        int var11 = class136.field2239.method641(false, 3);
                        var6.method285(var11, (byte) -87, 2);
                        int var12 = class136.field2239.method641(false, 3);
                        var6.method285(var12, (byte) -88, 2);
                    } else {
                        int var13 = class136.field2239.method641(false, 3);
                        var6.method285(var13, (byte) -92, 0);
                    }
                    int var14 = class136.field2239.method641(false, 1);
                    if (var14 == 1) {
                        class41.field619[class289.field4761++] = var5;
                    }
                } else if (var8 == 3) {
                    class185.field2968[class268.field4456++] = var5;
                }
            }
        }
    }
}
