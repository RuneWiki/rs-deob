import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class345 extends class97 {

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
    public static boolean field5157 = true;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "Lnn;")
    public static class151 field5152 = new class151("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!it", name = "t", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "[I")
    public int[] field5150;

    @OriginalMember(owner = "client!it", name = "s", descriptor = "[I")
    public int[] field5153;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "[I")
    public int[] field5159;

    @OriginalMember(owner = "client!it", name = "u", descriptor = "[Lbl;")
    public class211[] field5155;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "[Lbl;")
    public class211[] field5160;

    @OriginalMember(owner = "client!it", name = "A", descriptor = "[[[B")
    public byte[][][] field5161;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
    public static final boolean method2100(int arg0, int arg1) {
        field5158++;
        if (class360.field5321[arg1]) {
            return true;
        } else if (class163.field2257.method813(arg1, (byte) 110)) {
            int var2 = class163.field2257.method812(arg1, (byte) -41);
            if (~var2 == arg0) {
                class360.field5321[arg1] = true;
                return true;
            }
            if (class130.field1650[arg1] == null) {
                class130.field1650[arg1] = new class170[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class130.field1650[arg1][var3] == null) {
                    byte[] var4 = class163.field2257.method823(arg1, -20334, var3);
                    if (var4 != null) {
                        class170 var5 = class130.field1650[arg1][var3] = new class170();
                        var5.field2525 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1048(new class385(var4), 1031);
                    }
                }
            }
            class360.field5321[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
    public static final void method2101(int arg0, byte arg1, int arg2) {
        field5154++;
        class353 var3 = class450.method2772((byte) -107, arg2);
        int var4 = var3.field5218;
        int var5 = var3.field5216;
        int var6 = -119 % ((arg1 + 65) / 48);
        int var7 = var3.field5217;
        int var8 = class363.field5349[var7 - var5];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var5;
        class318.method1943(~var9 & class306.field4631[var4] | arg0 << var5 & var9, var4, -88);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V")
    public static void method2102(boolean arg0) {
        if (!arg0) {
            field5152 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
    public static final void method2103(int arg0, int arg1, int arg2) {
        int var3 = 126 / ((arg1 - 21) / 55);
        field5148++;
        class32 var4 = class136.method854(15, (byte) 84, 0);
        var4.method194(false);
        var4.field412 = arg2;
        var4.field404 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
    public static final void method2104(int arg0) {
        field5156++;
        for (class275 var1 = (class275) class301.field4541.method2514((byte) 61); var1 != null; var1 = (class275) class301.field4541.method2511(124)) {
            class74 var2 = var1.field4201;
            if (class143.field1911 != var2.field1902 || class26.field332 > var2.field1010) {
                var1.method625((byte) -50);
                var2.method487(-1);
            } else if (class26.field332 >= var2.field989) {
                if (var2.field992 > 0) {
                    class155 var3 = class170.field2626[var2.field992 - 1];
                    if (var3 != null && var3.field1900 >= 0 && var3.field1900 < class115.field1522 * 128 && var3.field1892 >= 0 && class198.field3004 * 128 > var3.field1892) {
                        var2.method485(var3.field1892, class437.method2686(var2.field1902, 0, var3.field1892, var3.field1900) - var2.field976, var3.field1900, (byte) 84, class26.field332);
                    }
                }
                if (var2.field992 < 0) {
                    int var4 = -var2.field992 - 1;
                    class169 var5;
                    if (class386.field5703 == var4) {
                        var5 = class113.field1500;
                    } else {
                        var5 = class140.field1883[var4];
                    }
                    if (var5 != null && var5.field1900 >= 0 && (class115.field1522 * 128) > var5.field1900 && var5.field1892 >= 0 && var5.field1892 < (class198.field3004 * 128)) {
                        var2.method485(var5.field1892, class437.method2686(var2.field1902, 0, var5.field1892, var5.field1900) - var2.field976, var5.field1900, (byte) 84, class26.field332);
                    }
                }
                var2.method493(class342.field5118, 0);
                class50.method287(var2, true);
            }
        }
        if (arg0 >= -119) {
            method2102(true);
        }
    }
}
