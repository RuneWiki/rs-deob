import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class191 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lkn;")
    public static class530 field2724 = new class530("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lam;")
    public static class455 field2730 = new class455();

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public static final void method1215(int arg0, int arg1, int arg2) {
        if (arg0 <= 56) {
            return;
        }
        field2727++;
        if (class71.field886 == class246.field3594) {
            if (!class110.method754(-2, 1, false, 0, 0, arg1, 1, 118, arg2)) {
                class110.method754(-3, 1, false, 0, 0, arg1, 1, 98, arg2);
            }
        } else if (!class110.method754(-3, 1, false, 0, 0, arg1, 1, 91, arg2)) {
            class110.method754(-2, 1, false, 0, 0, arg1, 1, 76, arg2);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1216(byte arg0) {
        field2724 = null;
        int var1 = -76 % ((21 - arg0) / 33);
        field2730 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static final void method1217(byte arg0) {
        field2728++;
        if (arg0 < 61) {
            return;
        }
        class302 var1 = null;
        try {
            class370 var2 = class268.field3914.method950(true, "2", 0);
            while (var2.field5277 == 0) {
                class52.method411(1L, (byte) 116);
            }
            if (var2.field5277 == 1) {
                var1 = (class302) var2.field5274;
                byte[] var3 = new byte[(int) var1.method1843(117)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1842(var4, (byte) 39, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class538.method3162(new class403(var3), 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1844((byte) 105);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lir;Z)V")
    public static final void method1218(class22 arg0, boolean arg1) {
        field2726++;
        class136 var2 = (class136) class542.field7922.method2405((long) arg0.field3289, -94);
        if (var2 != null) {
            if (var2.field1780 != null) {
                class138.field1810.method2312(var2.field1780);
                var2.field1780 = null;
            }
            var2.method2891(44);
        }
        if (arg1) {
            method1215(-68, -66, -117);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BII)Z")
    public static final boolean method1219(byte arg0, int arg1, int arg2) {
        field2725++;
        int var3 = 58 / ((-arg0 - 64) / 37);
        return class290.method1800(arg1, arg2, 4016) & class77.method595(0, arg2, arg1);
    }
}
