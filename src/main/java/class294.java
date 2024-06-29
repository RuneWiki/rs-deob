import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class294 {

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Lej;")
    public static class104 field4043 = new class104("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Ldv;")
    public static class566 field4048 = new class566(70, 2);

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "[I")
    public static int[] field4050 = new int[14];

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method1884(int arg0, String arg1, char arg2) {
        field4042++;
        int var3 = class456.method2672(arg2, 123, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg0 != 1) {
            field4043 = null;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Lvj;")
    public static final class374 method1885(int arg0) {
        field4041++;
        if (arg0 != 0) {
            return null;
        }
        class374 var1 = (class374) class282.field3899.method3141(29291);
        if (var1 == null) {
            return new class374();
        } else {
            class304.field4148--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
    public static void method1886(int arg0) {
        field4048 = null;
        field4050 = null;
        if (arg0 != 1) {
            method1886(40);
        }
        field4043 = null;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII)V")
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -21861) {
            method1887(10, -117, -50, -15, 95);
        }
        for (int var5 = 0; var5 < class628.field9187; var5++) {
            Rectangle var6 = class564.field7815[var5];
            if (arg1 < (var6.x + var6.width) && arg1 + arg2 > var6.x && (var6.y + var6.height) > arg0 && var6.y < (arg0 + arg3)) {
                class18.field226[var5] = true;
            }
        }
        field4049++;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lk;III[Z)V")
    public static final void method1888(class485 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (client.field3472 == class590.field8430) {
            return;
        }
        int var5 = class608.field8767[arg1].method1105(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class174 var7 = class608.field8767[var6];
                if (var7 != null) {
                    var7.method1102(arg0, arg2, var5 - var7.method1105(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }
}
