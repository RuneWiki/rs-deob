import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class449 {

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Z")
    public boolean field6226;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Z")
    public static boolean field6225 = false;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field6219 = 0;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field6222 = 0;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lwg;")
    public static class360 field6217;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "Liaa;")
    public class419 field6218;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Liaa;")
    public class419 field6220;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
    public boolean field6221;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IC)Z", line = 3)
    public static final boolean method2625(int arg0, char arg1) {
        if (arg0 < 18) {
            return false;
        } else {
            field6223++;
            return arg1 >= '0' && arg1 <= '9';
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z", line = 19)
    public final boolean method2626(int arg0) {
        int var2 = -101 % ((-arg0 - 68) / 43);
        field6215++;
        return this.field6221 && !this.field6226;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 33)
    public static void method2627(byte arg0) {
        field6217 = null;
        if (arg0 <= 70) {
            field6222 = -22;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Los;B)V", line = 46)
    public static final void method2628(class374 arg0, byte arg1) {
        if (arg1 != -47) {
            field6219 = 36;
        }
        field6224++;
        byte[] var2 = new byte[24];
        if (class228.field2801 != null) {
            try {
                class228.field2801.method1218(0L, arg1 ^ 0xFFFFFFD1);
                class228.field2801.method1215(true, var2);
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
        arg0.method2096(-89, 0, 24, var2);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 99)
    public final void method2629(byte arg0) {
        field6216++;
        if (arg0 != -2) {
            field6217 = null;
        }
        if (this.field6220 != null) {
            this.field6220.method443(23678);
        }
        this.field6221 = false;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Z)V", line = 116)
    public class449(boolean arg0) {
        this.field6226 = arg0;
    }
}
