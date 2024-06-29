import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class517 implements class201 {

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Llaa;")
    private class384 field7223;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[Lvd;")
    private class37[] field7225;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
    public static int[] field7219 = new int[8];

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "F")
    public static float field7222;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lha;")
    private class548 field7218;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
    private boolean field7226;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZB)V")
    public final void method1221(boolean arg0, byte arg1) {
        field7215++;
        boolean var3 = true;
        class37[] var4 = this.field7225;
        if (arg1 != 27) {
            this.method1221(false, (byte) -35);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class37 var6 = var4[var5];
            if (var6 != null) {
                var6.method201((byte) -125, var3 || this.field7226);
            }
        }
        this.field7226 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method1224(int arg0) {
        field7216++;
        if (class129.field1802 != this.field7218) {
            this.field7218 = class129.field1802;
            this.field7226 = true;
        }
        if (arg0 != -19040) {
            this.method1222(-8L, -16);
        }
        this.field7218.method273(0);
        class37[] var2 = this.field7225;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class37 var4 = var2[var3];
            if (var4 != null) {
                var4.method200(100);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
    public final int method1226(int arg0) {
        field7214++;
        int var2 = 0;
        class37[] var3 = this.field7225;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class37 var5 = var3[var4];
            if (var5 == null || var5.method202((byte) -54)) {
                var2++;
            }
        }
        if (arg0 >= -118) {
            field7222 = -0.1428358F;
        }
        return var2 * 100 / this.field7225.length;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
    public final int method1223(boolean arg0) {
        if (arg0) {
            method3092(17);
        }
        field7224++;
        return this.field7223.field5507;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)Z")
    public final boolean method1222(long arg0, int arg1) {
        if (arg1 == -30471) {
            field7213++;
            return class97.method664((byte) -50) >= (arg0 + ((long) this.field7223.field5510));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public static void method3092(int arg0) {
        field7219 = null;
        if (arg0 != 1426) {
            method3092(9);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method1225(int arg0) {
        if (arg0 == 13941) {
            field7220++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Llaa;Ltda;)V")
    public class517(class384 arg0, class340 arg1) {
        this.field7223 = arg0;
        this.field7225 = new class37[this.field7223.field5512.length];
        for (int var3 = 0; var3 < this.field7225.length; var3++) {
            this.field7225[var3] = arg1.method2166(this.field7223.field5512[var3], 14032);
        }
    }
}
