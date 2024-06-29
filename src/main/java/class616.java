import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class616 {

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lkc;")
    public class115 field8960 = null;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lica;")
    private class579[] field8963 = null;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "[Lica;")
    public class579[] field8964 = null;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
    public boolean field8956;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field8962 = -1;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lig;")
    public static class206 field8957 = new class206(8, 6);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method3553(int arg0) {
        if (arg0 != 6) {
            method3553(111);
        }
        field8957 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static final void method3554(int arg0) {
        field8961++;
        int var1 = (int) ((double) class90.field1032 * 34.46D);
        int var2 = var1 << 2;
        if (class413.field6264.method341()) {
            var2 += 512;
        }
        class413.field6264.method393(200, var2);
        if (arg0 != 32768) {
            method3556((byte) 75, 47);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Z")
    public final boolean method3555(byte arg0) {
        if (arg0 != 62) {
            this.field8956 = false;
        }
        field8958++;
        if (this.field8956) {
            return this.field8960 != null;
        } else {
            return this.field8964 != null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I")
    public static final int method3556(byte arg0, int arg1) {
        if (arg0 != 62) {
            field8962 = -104;
        }
        field8955++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
    public static final void method3557(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8959++;
        class467 var5 = class541.method3144(arg3, (byte) -111, 10);
        int var6 = 38 / ((-arg0 - 75) / 46);
        var5.method2851(true);
        var5.field6930 = arg2;
        var5.field6925 = arg4;
        var5.field6926 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ltu;)V")
    public class616(class294 arg0) {
        this.field8956 = arg0.field4346;
        if (this.field8956 && !arg0.method1552(19950, class162.field1982, class256.field3653)) {
            this.field8956 = false;
        }
        if (this.field8956 || arg0.method1528(class162.field1982, (byte) 59, class256.field3653)) {
            class238.method1595(94);
            if (this.field8956) {
                byte[] var2 = class89.method574(false, (byte) 80, class65.field721);
                this.field8960 = arg0.method1557(128, class162.field1982, 128, 16, (byte) 22, var2);
                byte[] var3 = class89.method574(false, (byte) 44, class72.field777);
                arg0.method1557(128, class162.field1982, 128, 16, (byte) -121, var3);
            } else {
                this.field8964 = new class579[16];
                for (int var4 = 0; var4 < 16; var4++) {
                    byte[] var7 = class199.method1268(2, class65.field721, 32768, var4 * 16384 * 2);
                    this.field8964[var4] = arg0.method1948(class162.field1982, var7, 128, 128, true, true);
                }
                this.field8963 = new class579[16];
                for (int var5 = 0; var5 < 16; var5++) {
                    byte[] var6 = class199.method1268(2, class72.field777, 32768, var5 * 2 * 16384);
                    this.field8963[var5] = arg0.method1948(class162.field1982, var6, 128, 128, true, true);
                }
            }
        }
    }
}
