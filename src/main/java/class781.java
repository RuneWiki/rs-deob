import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class781 extends class69 {

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Ljn;")
    public static class134 field10737 = new class134(81, 0);

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field10727;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public int field10735;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lae;")
    public static class283 field10731;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "[I")
    public int[] field10726;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[I")
    public int[] field10730;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    public int[] field10734;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[Lfe;")
    public class344[] field10728;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[Lfe;")
    public class344[] field10732;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[[[B")
    public byte[][][] field10733;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method4296(int arg0) {
        field10737 = null;
        field10731 = null;
        int var1 = -13 % (-arg0 / 58);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([II[ILkf;[I)V")
    public static final void method4297(int[] arg0, int arg1, int[] arg2, class359 arg3, int[] arg4) {
        field10736++;
        for (int var5 = arg1; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg3.field9164.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field9164[var9] = null;
                    } else {
                        class73 var10 = class571.field8029.method3695(var6, (byte) -117);
                        int var11 = var10.field818;
                        class695 var12 = arg3.field9164[var9];
                        if (var12 != null) {
                            if (var12.field9692 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field9164[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field9697 = 1;
                                    var12.field9689 = 0;
                                    var12.field9700 = 0;
                                    var12.field9694 = var8;
                                    var12.field9690 = 0;
                                    if (!arg3.field9136) {
                                        class538.method3196(arg3, 0, true, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field9700 = 0;
                                }
                            } else if (var10.field802 >= class571.field8029.method3695(var12.field9692, (byte) -110).field802) {
                                var12 = arg3.field9164[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class695 var13 = arg3.field9164[var9] = new class695();
                            var13.field9700 = 0;
                            var13.field9689 = 0;
                            var13.field9697 = 1;
                            var13.field9694 = var8;
                            var13.field9690 = 0;
                            var13.field9692 = var6;
                            if (!arg3.field9136) {
                                class538.method3196(arg3, 0, true, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;ZI)V")
    public static final void method4298(byte arg0, String arg1, String arg2, boolean arg3, int arg4) {
        if (arg0 >= -51) {
            field10737 = null;
        }
        class734.method4077(arg4, true, -1, arg2, arg1, (byte) 51, arg3);
        field10729++;
    }
}
