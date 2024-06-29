import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class18 extends class116 {

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lic;")
    private static class59 field345 = class59.method433(0, "Feb");

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Lic;")
    private static class59 field354 = class59.method433(0, "Mar");

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "Lic;")
    private static class59 field350 = class59.method433(0, "May");

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lic;")
    private static class59 field352 = class59.method433(0, "Username: ");

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Lic;")
    public static class59 field359 = class59.method433(0, "<col=ff3000>");

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lic;")
    private static class59 field347 = class59.method433(0, "Jan");

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Lic;")
    private static class59 field355 = class59.method433(0, "Dec");

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "Lic;")
    private static class59 field358 = class59.method433(0, "Sep");

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Lic;")
    private static class59 field365 = class59.method433(0, "Oct");

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lic;")
    private static class59 field356 = class59.method433(0, "Jul");

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "Lic;")
    public static class59 field360 = class59.method433(0, "(U2");

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "Lic;")
    private static class59 field366 = class59.method433(0, "Apr");

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lic;")
    public static class59 field348 = field352;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lic;")
    private static class59 field357 = class59.method433(0, "Nov");

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lic;")
    private static class59 field361 = class59.method433(0, "Jun");

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Z")
    public static boolean field367 = false;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Lic;")
    private static class59 field369 = class59.method433(0, "Aug");

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "[Lic;")
    public static class59[] field349 = new class59[] { field347, field345, field354, field366, field350, field361, field356, field369, field358, field365, field357, field355 };

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Lfb;")
    public static class38 field353 = new class38();

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Lic;")
    private static class59 field371 = class59.method433(0, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "Lic;")
    public static class59 field370 = field371;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Lic;")
    public static class59 field372 = class59.method433(0, "Benutzen");

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILic;ZLic;Ldd;B)V")
    public static final void method92(int arg0, class59 arg1, boolean arg2, class59 arg3, class26 arg4, byte arg5) {
        field362++;
        int var6 = arg4.method201(arg3, -1);
        int var7 = arg4.method196(6, var6, arg1);
        int var8 = 65 % ((arg5 - 26) / 36);
        class94.method781(var7, arg0, arg2, -20, arg4, var6);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public static void method93(byte arg0) {
        field365 = null;
        field353 = null;
        field347 = null;
        field354 = null;
        field366 = null;
        field360 = null;
        field370 = null;
        field356 = null;
        field371 = null;
        if (arg0 > -83) {
            return;
        }
        field358 = null;
        field355 = null;
        field372 = null;
        field349 = null;
        field348 = null;
        field352 = null;
        field357 = null;
        field369 = null;
        field350 = null;
        field345 = null;
        field359 = null;
        field361 = null;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)[Lt;")
    public static final class132[] method94(byte arg0) {
        if (arg0 < 3) {
            return null;
        }
        field363++;
        class132[] var1 = new class132[class61.field1565];
        for (int var2 = 0; var2 < class61.field1565; var2++) {
            class132 var3 = new class132();
            var3.field2956 = class5.field105;
            var3.field2954 = class100.field2478;
            var3.field2955 = class100.field2471[var2];
            var3.field2958 = class15.field298[var2];
            var3.field2957 = class44.field1120[var2];
            var3.field2952 = client.field488[var2];
            int var4 = var3.field2957 * var3.field2952;
            byte[] var5 = class136.field3037[var2];
            var3.field2953 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field2953[var6] = class34.field918[class24.method156(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class2.method10(-6);
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        field368++;
        for (class86 var1 = (class86) class61.field1561.method682(arg0 + 56); var1 != null; var1 = (class86) class61.field1561.method684((byte) -65)) {
            if (var1.field2146 != null) {
                class120.field2766.method1081(var1.field2146);
                var1.field2146 = null;
            }
            if (var1.field2157 != null) {
                class120.field2766.method1081(var1.field2157);
                var1.field2157 = null;
            }
        }
        class61.field1561.method680(73);
        if (arg0 != -56) {
            method95((byte) -49);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class18() {
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        this.field351 = arg0;
    }
}
