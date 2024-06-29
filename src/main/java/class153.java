import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class153 implements class169 {

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
    public static boolean field2547 = true;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)Lkq;", line = 4)
    public final class696 method726(int arg0) {
        field2544++;
        if (arg0 != -17) {
            this.field2545 = 50;
        }
        return class258.field3707;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(I)V", line = 18)
    public class153(int arg0) {
        this.field2545 = arg0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)[B", line = 26)
    public static final byte[] method1157(int arg0, int arg1) {
        field2546++;
        int var2 = -78 % ((arg0 + 19) / 63);
        class638 var3 = (class638) class227.field3379.method3823((long) arg1, -1);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg1);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class357.method2154(var5, var8, Integer.MIN_VALUE);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class638(var4);
            class227.field3379.method3824((long) arg1, -91, var3);
        }
        return var3.field9051;
    }
}
