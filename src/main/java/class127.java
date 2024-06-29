import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class127 extends InputStream {

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2072 = 0;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V", line = 12)
    public static final void method1110(int arg0, int arg1) {
        class54 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class37 var4 = class491.field7187[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class541.field7896; var5++) {
                    for (int var6 = 0; var6 < class43.field597; var6++) {
                        var2 = var4.method482(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class439.field6699;
                            int var8 = var5 << class439.field6699;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class37 var10 = class491.field7187[var9];
                                if (var10 != null) {
                                    int var11 = var4.method479(var5, var6, -114) - var10.method479(var5, var6, -112);
                                    int var12 = var4.method479(var5, var6 + 1, -112) - var10.method479(var5, var6 + 1, -98);
                                    int var13 = var4.method479(var5 + 1, var6 + 1, -99) - var10.method479(var5 + 1, var6 + 1, 73);
                                    int var14 = var4.method479(var5 + 1, var6, -113) - var10.method479(var5 + 1, var6, -101);
                                    var10.method480(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "read", descriptor = "()I", line = 79)
    public final int read() {
        class549.method3313(30000L, 125);
        field2070++;
        return -1;
    }
}
