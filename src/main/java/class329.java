import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class329 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Ljava/lang/String;")
    public String field4659;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4660++;
        int var7 = class130.method805(true, class219.field3080, arg2, class388.field5464);
        if (arg6 != -17462) {
            return;
        }
        int var8 = class130.method805(true, class219.field3080, arg0, class388.field5464);
        int var9 = class130.method805(true, class235.field3295, arg4, class81.field946);
        int var10 = class130.method805(true, class235.field3295, arg3, class81.field946);
        int var11 = class130.method805(true, class219.field3080, arg2 + arg1, class388.field5464);
        int var12 = class130.method805(true, class219.field3080, arg0 - arg1, class388.field5464);
        for (int var13 = var7; var13 < var11; var13++) {
            class296.method1954(arg5, var10, class291.field4067[var13], var9, -1);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class296.method1954(arg5, var10, class291.field4067[var14], var9, -1);
        }
        int var15 = class130.method805(true, class235.field3295, arg1 + arg4, class81.field946);
        int var16 = class130.method805(true, class235.field3295, arg3 - arg1, class81.field946);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class291.field4067[var17];
            class296.method1954(arg5, var15, var18, var9, -1);
            class296.method1954(arg5, var10, var18, var16, -1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public static final void method2126(byte arg0) {
        field4661++;
        class12.field160.method1618(0);
        if (arg0 < 120) {
            method2125(-104, -109, 96, 22, -104, -86, 14);
        }
    }
}
