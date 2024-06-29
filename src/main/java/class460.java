import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class460 extends class5 {

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public int field6885;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "Lps;")
    public static class63 field6887 = new class63();

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[Liq;")
    public static class438[] field6890;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lub;I[I[I[I)V")
    public static final void method2784(class17 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field6886++;
        for (int var5 = arg1; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field3901.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3901[var9] = null;
                    } else {
                        class91 var10 = class201.field2707.method489(101, var6);
                        int var11 = var10.field1340;
                        class389 var12 = arg0.field3901[var9];
                        if (var12 != null) {
                            if (var12.field5937 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3901[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5946 = 0;
                                    var12.field5941 = 1;
                                    var12.field5938 = var8;
                                    var12.field5939 = 0;
                                    var12.field5940 = 0;
                                    class441.method2669(false, var10, arg0.field1866, 0, arg0.field1867, arg0.field1862, false);
                                } else if (var11 == 2) {
                                    var12.field5939 = 0;
                                }
                            } else if (var10.field1332 >= class201.field2707.method489(arg1 + 37, var12.field5937).field1332) {
                                var12 = arg0.field3901[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class389 var13 = arg0.field3901[var9] = new class389();
                            var13.field5939 = 0;
                            var13.field5940 = 0;
                            var13.field5941 = 1;
                            var13.field5938 = var8;
                            var13.field5937 = var6;
                            var13.field5946 = 0;
                            class441.method2669(false, var10, arg0.field1866, 0, arg0.field1867, arg0.field1862, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        field6887 = null;
        field6890 = null;
        if (arg0 != -34) {
            method2784(null, 104, null, null, null);
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(II)V")
    public class460(int arg0, int arg1) {
        this.field6885 = arg0;
        this.field6888 = arg1;
    }

    static {
        new class446("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field6890 = new class438[75];
        field6889 = -2;
    }
}
