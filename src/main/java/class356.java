import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class356 extends class539 {

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public volatile int field5096 = -1;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field5097;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[B")
    public static final byte[] method2110(int arg0, int arg1) {
        field5098++;
        class528 var2 = (class528) class579.field7774.method1267((byte) -122, (long) arg0);
        int var3 = -24 / ((-arg1 - 39) / 43);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class433.method2492((byte) 0, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var2 = new class528(var4);
            class579.field7774.method1265(false, (long) arg0, var2);
        }
        return var2.field7226;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class356(String arg0) {
        this.field5097 = arg0;
    }
}
