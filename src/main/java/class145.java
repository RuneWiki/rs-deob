import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class145 {

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lak;")
    public static class234 field2202 = new class234("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "F")
    public static float field2208;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "F")
    public static float field2209;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)Z", line = 16)
    public static final boolean method1028(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return false;
        }
        field2203++;
        if (!class307.field4631) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class200.field3326[var3] == null || class200.field3326[var3][var4] == null) {
            return false;
        }
        class114 var5 = class200.field3326[var3][var4];
        if (arg1 == -1 && var5.field1585 == 0) {
            for (class295 var6 = (class295) class456.field6644.method1004((byte) -68); var6 != null; var6 = (class295) class456.field6644.method996(1)) {
                if (var6.field4498 == 51 || var6.field4498 == 1007 || var6.field4498 == 3 || var6.field4498 == 22 || var6.field4498 == 2) {
                    for (class114 var7 = class475.method2864(true, var6.field4493); var7 != null; var7 = class277.method1822((byte) 89, var7)) {
                        if (var5.field1644 == var7.field1644) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class295 var8 = (class295) class456.field6644.method1004((byte) -67); var8 != null; var8 = (class295) class456.field6644.method996(1)) {
                if (var8.field4497 == arg1 && var5.field1644 == var8.field4493 && (var8.field4498 == 51 || var8.field4498 == 1007 || var8.field4498 == 3 || var8.field4498 == 22 || var8.field4498 == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 100)
    public static void method1029(byte arg0) {
        field2202 = null;
        int var1 = -38 / ((-arg0 - 40) / 54);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 110)
    public static final boolean method1030(int arg0, String arg1, int arg2) {
        field2204++;
        if (class352.field5196 != 3) {
            class283.field4310 = new class424();
            class283.field4310.field6311 = arg1;
            class283.field4310.field6307 = arg2;
            if (class310.field4662 != class125.field1855) {
                class283.field4310.field6310 = class283.field4310.field6307 + 40000;
                class283.field4310.field6312 = class283.field4310.field6307 + 50000;
            }
            return true;
        }
        String var3 = "";
        if (class310.field4662 != class125.field1855) {
            var3 = ":" + (arg2 + 7000);
        }
        String var4 = "";
        if (class6.field71 != null) {
            var4 = "/p=" + class6.field71;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class224.field3673 + "/a=" + class341.field5067 + var4 + "/j" + (class507.field7413 ? "1" : "0") + ",o" + (class48.field625 ? "1" : "0") + ",a2";
        try {
            class150.field2246.getAppletContext().showDocument(new URL(var5), "_self");
            if (arg0 != -1008) {
                method1029((byte) -6);
            }
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V", line = 155)
    public class145(int arg0, int arg1, int arg2) {
        this.field2211 = arg1;
        this.field2207 = arg0;
        while (arg2 > 1) {
            this.field2206++;
            arg2 >>= 0x1;
        }
        this.field2210 = 0x1 << this.field2206;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method403(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public abstract int method412(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public abstract boolean method399(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lba;IIIIZ)V")
    public abstract void method410(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lba;IIIIZ)V")
    public abstract void method413(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
    public abstract void method405(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
    public abstract void method407();

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILba;)Lba;")
    public abstract class265 method408(int arg0, int arg1, class265 arg2);

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
    public abstract int method411(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method404(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqp;[I)V")
    public abstract void method415(class470 arg0, int[] arg1);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public abstract void method401(int arg0, int arg1);
}
