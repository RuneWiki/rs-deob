import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class246 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Z")
    public static boolean field3677 = true;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3680 = 0;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "Lbd;")
    public static class44 field3679 = new class44("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1611(int arg0, int arg1) {
        class424 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class24 var4 = class393.field5594[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class337.field5000; var5++) {
                    for (int var6 = 0; var6 < class394.field5608; var6++) {
                        var2 = var4.method153(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class322.field4795;
                            int var8 = var5 << class322.field4795;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class24 var10 = class393.field5594[var9];
                                if (var10 != null) {
                                    int var11 = var4.method156(var6, var5) - var10.method156(var6, var5);
                                    int var12 = var4.method156(var6 + 1, var5) - var10.method156(var6 + 1, var5);
                                    int var13 = var4.method156(var6 + 1, var5 + 1) - var10.method156(var6 + 1, var5 + 1);
                                    int var14 = var4.method156(var6, var5 + 1) - var10.method156(var6, var5 + 1);
                                    var10.method150(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V", line = 74)
    public static void method1612(byte arg0) {
        if (arg0 < 33) {
            field3677 = false;
        }
        field3679 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZII)I", line = 87)
    public static final int method1613(int arg0, boolean arg1, int arg2, int arg3) {
        field3676++;
        if (arg0 == arg2) {
            return arg0;
        }
        if (arg1) {
            field3678 = 28;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg2 & 0x380) * arg3 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg2 & 0xFC00) * arg3 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)I", line = 110)
    public static final int method1614(int arg0, String arg1) {
        field3681++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = arg0; var2 < class290.field4314; var2++) {
            if (arg1.equalsIgnoreCase(class163.field2463[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
