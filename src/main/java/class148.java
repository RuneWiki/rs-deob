import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class148 extends class182 {

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lkw;")
    private class174 field1913;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Lnj;")
    public static class487 field1919 = new class487("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lha;")
    public static class116 field1920;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Ldf;")
    private class547 field1910;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lej;Z)Z")
    public static final boolean method872(class438 arg0, boolean arg1) {
        field1908++;
        class158 var2 = class312.field4690.method2004(arg1, arg0.method173(57));
        if (var2.field2040 == -1) {
            return true;
        } else {
            class402 var3 = class402.field5766.method1711((byte) -96, var2.field2040);
            return var3.field5763 == -1 ? true : var3.method2412(0);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method873(byte arg0) {
        field1919 = null;
        if (arg0 > -94) {
            method872(null, false);
        }
        field1920 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)Ljava/lang/String;")
    public static final String method874(int arg0, int[] arg1) {
        field1907++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class85.field991;
        int var4 = 0;
        if (arg0 != 23965) {
            method872(null, true);
        }
        while (var4 < arg1.length) {
            class435 var5 = class247.field3618.method2891(arg1[var4], (byte) 97);
            if (var5.field6390 != -1) {
                class116 var6 = (class116) class605.field8916.method2025((long) var5.field6390, 2);
                if (var6 == null) {
                    class610 var7 = class610.method3555(class371.field5368, var5.field6390, 0);
                    if (var7 != null) {
                        var6 = class379.field5558.method961(var7, true);
                        class605.field8916.method2029(false, var6, (long) var5.field6390);
                    }
                }
                if (var6 != null) {
                    class465.field6720[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
    public static final boolean method875(int arg0, int arg1, int arg2) {
        field1915++;
        if (arg1 != -1) {
            method872(null, true);
        }
        return class3.method10(false, arg0, arg2) & class511.method3051(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Ldf;")
    public final class547 method876(boolean arg0) {
        field1916++;
        if (!arg0) {
            this.field1917 = -53;
        }
        if (this.field1910 == null) {
            class418.field6012[1] = this.field1909;
            class418.field6012[4] = this.field1912;
            class418.field6012[5] = this.field1917;
            class418.field6012[2] = this.field1914;
            class418.field6012[0] = this.field1911;
            class418.field6012[3] = this.field1918;
            class472 var2 = this.field1913.field2262;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1758((byte) 108, class418.field6012[var5])) {
                    return null;
                }
                class83 var7 = var2.method1762(class418.field6012[var5], (byte) 45);
                int var8 = var7.field964 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field959 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class213.field3133[var6] = var2.method1759(var4, var4, 1.0F, (byte) 116, class418.field6012[var6], false);
            }
            this.field1910 = this.field1913.method305(var4, var3, class213.field3133, 126);
        }
        return this.field1910;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lkw;IIIIII)V")
    public class148(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1918 = arg4;
        this.field1912 = arg5;
        this.field1913 = arg0;
        this.field1909 = arg2;
        this.field1917 = arg6;
        this.field1911 = arg1;
        this.field1914 = arg3;
    }
}
