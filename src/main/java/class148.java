import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class148 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lbv;")
    public static class567 field2255 = new class567("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public int field2254;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lgp;")
    public static class561 field2260;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 7)
    public static void method1070(byte arg0) {
        if (arg0 <= -82) {
            field2255 = null;
            field2260 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILfa;Lqa;ILgb;IILfm;)V", line = 24)
    public static final void method1071(int arg0, class482 arg1, class167 arg2, int arg3, class153 arg4, int arg5, int arg6, class192 arg7) {
        field2258++;
        if (arg3 != 31273) {
            field2255 = null;
        }
        int var8 = arg4.field2304 - (arg5 / 2) - 5;
        int var9 = arg0 + 2;
        if (arg7.field2749 != 0) {
            arg2.method1159(arg7.field2749, arg1.method2777() * arg6 + arg0 + 1 - var9, var9, var8, (byte) 114, arg5 + 10);
        }
        if (arg7.field2774 != 0) {
            arg2.method1156(true, var9, arg1.method2777() * arg6 + arg0 + 1 - var9, arg7.field2774, var8, arg5 + 10);
        }
        int var10 = arg7.field2760;
        if (arg4.field2301 && arg7.field2777 != -1) {
            var10 = arg7.field2777;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            String var12 = class609.field8658[var11];
            if ((arg6 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method2775(arg2, var12, arg4.field2304, arg0, var10, true);
            arg0 += arg1.method2777();
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lco;II)V", line = 66)
    private final void method1072(class268 arg0, int arg1, int arg2) {
        if (arg1 != 10) {
            return;
        }
        field2256++;
        if (arg2 == 1) {
            this.field2257 = arg0.method1745(32132);
            this.field2254 = arg0.method1738(255);
            this.field2253 = arg0.method1738(255);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILco;)V", line = 86)
    public final void method1073(int arg0, class268 arg1) {
        if (arg0 < 59) {
            return;
        }
        field2252++;
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                return;
            }
            this.method1072(arg1, 10, var3);
        }
    }
}
