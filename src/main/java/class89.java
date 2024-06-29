import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class89 extends class299 {

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public int field1556 = -1;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Z")
    public static boolean field1549 = false;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Ljava/lang/String;")
    public String field1550;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "Ljava/lang/String;")
    public String field1555;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "[I")
    public static int[] field1554;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[B")
    public static final byte[] method694(int arg0, int arg1) {
        if (arg1 != 512) {
            method698(-92, 35);
        }
        ++field1551;
        class99 var2 = (class99) class25.field552.method2289(126, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class455.method2714(var4, var7, -13848);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class99(var3);
            class25.field552.method2287((long) arg0, (byte) 86, var2);
        }
        return var2.field1639;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)[Lfi;")
    public static final class388[] method695(byte arg0) {
        ++field1548;
        return arg0 != 123 ? null : new class388[] { class43.field827, class407.field6108, class190.field2832 };
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public static void method696(int arg0) {
        if (arg0 != 512) {
            method698(-108, -64);
        }
        field1554 = null;
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)Lpd;")
    public final class168 method697(int arg0) {
        ++field1547;
        if (arg0 != -2277) {
            method698(-28, -51);
        }
        return class476.field7116[super.field4256];
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
    public static final void method698(int arg0, int arg1) {
        ++field1552;
        if (arg0 == 512) {
            class54 var2 = class442.method2651(arg1, 1, -13208);
            var2.method476((byte) -44);
        }
    }
}
