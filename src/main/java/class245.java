import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class245 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Ljf;")
    public static class229 field4356 = class212.method1457((byte) 112, "leuchten1:");

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Ljg;")
    public static class303 field4355 = new class303();

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[Lpa;")
    public static class2[] field4359 = new class2[50];

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Ljf;")
    public static class229 field4363 = class212.method1457((byte) 67, ")4j");

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[I")
    public static int[] field4361;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[Lnf;)V", line = 9)
    public static final void method1776(boolean arg0, int arg1, class67[] arg2) {
        field4358++;
        if (!arg0) {
            method1778(-120, (byte) 105);
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class67 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1267 == 0) {
                    if (var4.field1243 != null) {
                        method1776(true, arg1, var4.field1243);
                    }
                    class321 var5 = (class321) class151.field2618.method1890((long) var4.field1247, -93);
                    if (var5 != null) {
                        class22.method206(28699, var5.field5432, arg1);
                    }
                }
                if (arg1 == 0 && var4.field1148 != null) {
                    class192 var6 = new class192();
                    var6.field3324 = var4.field1148;
                    var6.field3327 = var4;
                    class215.method1477(-19319, var6);
                }
                if (arg1 == 1 && var4.field1175 != null) {
                    if (var4.field1193 >= 0) {
                        class67 var7 = class96.method662(var4.field1247, arg0);
                        if (var7 == null || var7.field1243 == null || var7.field1243.length <= var4.field1193 || var7.field1243[var4.field1193] != var4) {
                            continue;
                        }
                    }
                    class192 var8 = new class192();
                    var8.field3324 = var4.field1175;
                    var8.field3327 = var4;
                    class215.method1477(-19319, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 90)
    public static void method1777(int arg0) {
        field4356 = null;
        field4359 = null;
        if (arg0 != 16218) {
            field4363 = (class229) null;
        }
        field4355 = null;
        field4361 = null;
        field4363 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Z", line = 118)
    public static final boolean method1778(int arg0, byte arg1) {
        field4357++;
        if (arg1 > -13) {
            return true;
        } else {
            return (arg0 >> 29 & 0x1) != 0;
        }
    }
}
