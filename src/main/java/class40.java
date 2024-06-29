import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class40 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    public static int[] field771 = new int[2500];

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[I")
    public static int[] field780 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field775 = -2;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lbm;")
    public static class307 field783;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "[[S")
    public static short[][] field770;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 44)
    public static void method312(int arg0) {
        field770 = (short[][]) null;
        if (arg0 >= 84) {
            field780 = null;
            field783 = null;
            field771 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILbm;Lbm;)V", line = 62)
    public static final void method313(int arg0, class307 arg1, class307 arg2) {
        if (arg0 < -37) {
            class79.field1553 = arg2;
            class331.field5073 = arg1;
            field776++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lrg;[I[IZ[I)V", line = 83)
    public static final void method314(class255 arg0, int[] arg1, int[] arg2, boolean arg3, int[] arg4) {
        field774++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var6 != 0 && var9 < arg0.field1945.length) {
                if ((var6 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg0.field1945[var9] = null;
                    } else {
                        class260 var10 = class279.method1882(25397, var8);
                        class341 var11 = arg0.field1945[var9];
                        int var12 = var10.field4038;
                        if (var11 != null) {
                            if (var11.field5300 == var8) {
                                if (var12 == 0) {
                                    var11 = arg0.field1945[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field5294 = var7;
                                    var11.field5295 = 0;
                                    var11.field5287 = 1;
                                    var11.field5289 = 0;
                                    var11.field5292 = 0;
                                    class255.method1705(arg0.field1872, arg0.field1869, (byte) -66, var10, 0, false);
                                } else if (var12 == 2) {
                                    var11.field5292 = 0;
                                }
                            } else if (var10.field4035 >= class279.method1882(25397, var11.field5300).field4035) {
                                var11 = arg0.field1945[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class341 var13 = arg0.field1945[var9] = new class341();
                            var13.field5287 = 1;
                            var13.field5294 = var7;
                            var13.field5300 = var8;
                            var13.field5292 = 0;
                            var13.field5295 = 0;
                            var13.field5289 = 0;
                            class255.method1705(arg0.field1872, arg0.field1869, (byte) -116, var10, 0, false);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
        }
        if (!arg3) {
            field775 = -19;
        }
    }
}
