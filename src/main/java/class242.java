import java.util.Random;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class242 {

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "Ljava/lang/String;")
    public String field3144;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3143 = new CRC32();

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "D")
    public static double field3147;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!rga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3145++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)V")
    public static void method1452(boolean arg0) {
        if (!arg0) {
            method1452(true);
        }
        field3143 = null;
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class242(String arg0, int arg1) {
        this.field3144 = arg0;
        this.field3141 = arg1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lgda;Lgda;B)V")
    public static final void method1453(class55 arg0, class55 arg1, byte arg2) {
        field3140++;
        if (arg1.field557 != null) {
            arg1.method315(arg2 ^ 0x71);
        }
        if (arg2 != 24) {
            field3146 = 4;
        }
        arg1.field557 = arg0.field557;
        arg1.field564 = arg0;
        arg1.field557.field564 = arg1;
        arg1.field564.field557 = arg1;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)[B")
    public static final byte[] method1454(int arg0, int arg1) {
        field3139++;
        class517 var2 = (class517) class143.field1849.method566((byte) 117, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class676.method3842(-28737, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class517(var3);
            class143.field1849.method567(26404, var2, (long) arg0);
        }
        if (arg1 != 512) {
            method1453(null, null, (byte) 75);
        }
        return var2.field6969;
    }
}
