import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class373 extends OutputStream {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5465 = null;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field5467 = new int[1];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ls;")
    public static class186 field5464 = new class186(22, 0);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field5468 = 0;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lmf;")
    public static class291 field5469 = new class291();

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lmf;")
    public static class291 field5471 = new class291();

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!de", name = "write", descriptor = "(I)V", line = 3)
    public final void write(int arg0) throws IOException {
        field5463++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILnn;)V", line = 12)
    public static final void method2288(int arg0, class289 arg1) {
        field5460++;
        if ((arg1.field4408.length - arg1.field4399) < 1) {
            return;
        }
        int var2 = arg1.method1858(-3256);
        if (var2 < 0 || var2 > 1 || (arg1.field4408.length - arg1.field4399) < 2) {
            return;
        }
        int var3 = arg1.method1841((byte) 77);
        if (arg1.field4408.length - arg1.field4399 < var3 * 6) {
            return;
        }
        for (int var4 = arg0; var4 < var3; var4++) {
            int var5 = arg1.method1841((byte) -117);
            int var6 = arg1.method1815((byte) -73);
            if (var5 < class81.field1675.length && class68.field1377[var5] && (class47.field975.method126(false, var5).field2033 != '1' || var6 >= -1 && var6 <= 1)) {
                class81.field1675[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IC)Z", line = 60)
    public static final boolean method2289(int arg0, char arg1) {
        field5461++;
        if (arg0 != 48) {
            method2292(false, -29, 60);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 77)
    public static void method2290(boolean arg0) {
        field5467 = null;
        if (!arg0) {
            method2292(true, -28, 123);
        }
        field5471 = null;
        field5469 = null;
        field5465 = null;
        field5464 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLph;)V", line = 91)
    public static final void method2291(byte arg0, class459 arg1) {
        class237.field3656 = arg1.method2735("titlebg", -114);
        int var2 = 88 / ((arg0 - 45) / 60);
        field5466++;
        class524.field7616 = arg1.method2735("logo", -67);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZII)I", line = 106)
    public static final int method2292(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return 72;
        } else {
            field5462++;
            return arg2 == 4 || arg2 == 5 ? class450.field6692[arg1 & 0x3] : 256;
        }
    }
}
