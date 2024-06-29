import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class223 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3524 = -1;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lna;")
    public static class26 field3527 = class69.method505("Lade Benutzeroberfl-=che )2 ", (byte) -117);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Lna;")
    public static class26 field3529 = class69.method505("<img=0>", (byte) -119);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Lna;")
    public static class26 field3530 = class69.method505("Utiliser", (byte) -124);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lwa;I)Lna;", line = 7)
    public static final class26 method1487(class82 arg0, int arg1) {
        if (arg1 != 29488) {
            field3524 = 22;
        }
        field3526++;
        return class141.method942(arg0, 1, 32767);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I", line = 24)
    public static final int method1488(int arg0, int arg1, int arg2) {
        int var3 = (class64.method481(4, arg2 + 45365, arg0 - -91923, 512) + (class64.method481(2, arg2 + 10294, arg0 + 37821, 512) - 128 >> 1) + (class64.method481(1, arg2, arg0, 512) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 < 110) {
            return 102;
        }
        field3525++;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 47)
    public static void method1489(int arg0) {
        field3527 = null;
        if (arg0 == 37821) {
            field3529 = null;
            field3530 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 62)
    public static final void method1490() {
        if (class103.field1653 != null) {
            for (int var0 = 0; var0 < class103.field1653.length; var0++) {
                for (int var1 = 0; var1 < class285.field4778; var1++) {
                    for (int var2 = 0; var2 < class303.field5221; var2++) {
                        class103.field1653[var0][var1][var2] = null;
                    }
                }
            }
        }
        client.field4125 = (class172[][]) null;
        if (class10.field124 != null) {
            for (int var3 = 0; var3 < class10.field124.length; var3++) {
                for (int var4 = 0; var4 < class285.field4778; var4++) {
                    for (int var5 = 0; var5 < class303.field5221; var5++) {
                        class10.field124[var3][var4][var5] = null;
                    }
                }
            }
        }
        class112.field1761 = (class172[][]) null;
        class69.field1067 = 0;
        if (class173.field2715 != null) {
            for (int var6 = 0; var6 < class69.field1067; var6++) {
                class173.field2715[var6] = null;
            }
        }
        if (class249.field4073 != null) {
            for (int var7 = 0; var7 < class310.field5328; var7++) {
                class249.field4073[var7] = null;
            }
            class310.field5328 = 0;
        }
        if (class304.field5240 != null) {
            for (int var8 = 0; var8 < class304.field5240.length; var8++) {
                class304.field5240[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 171)
    public static final void method1491(int arg0) {
        if (arg0 >= -35) {
            method1488(3, 100, -24);
        }
        class22 var1 = class320.field5503;
        synchronized (class320.field5503) {
            class33.field558 = class287.field4803;
            class315.field5399++;
            if (class283.field4737 >= 0) {
                while (class37.field602 != class283.field4737) {
                    int var3 = class203.field3167[class37.field602];
                    class37.field602 = class37.field602 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class78.field1183[var3] = true;
                    } else {
                        class78.field1183[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class78.field1183[var2] = false;
                }
                class283.field4737 = class37.field602;
            }
            class287.field4803 = class39.field646;
        }
        field3528++;
    }
}
