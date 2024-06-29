import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class237 extends class288 {

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
    public static int[] field3413;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BILbc;Lbc;I)Lse;")
    public static final class89 method1545(byte arg0, int arg1, class282 arg2, class282 arg3, int arg4) {
        field3412++;
        if (class282.method1875(arg3, arg1, 0, arg4)) {
            if (arg0 >= -37) {
                field3413 = null;
            }
            return class213.method1342(arg2.method1861(arg4, arg1, 1), (byte) -89);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field3413 = null;
        if (arg0 < 125) {
            field3413 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lqi;I)V")
    public static final void method1547(class216 arg0, int arg1) {
        field3409++;
        byte[] var2 = new byte[24];
        if (class259.field3779 != null) {
            try {
                class259.field3779.method605(false, 0L);
                int var3 = 0;
                class259.field3779.method606(-64, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 == -30275) {
            arg0.method1405(24, (byte) -65, 0, var2);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V")
    public class237(int arg0, int arg1) {
        this.field3410 = arg1;
        this.field3411 = arg0;
    }
}
