import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class642 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field9234 = -2;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqh;I)V")
    public static final void method3659(class61 arg0, int arg1) {
        field9233++;
        byte[] var2 = new byte[24];
        if (class109.field1916 != null) {
            try {
                class109.field1916.method2260((byte) -107, 0L);
                class109.field1916.method2262(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
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
        arg0.method698(-95, 24, arg1, var2);
    }
}
