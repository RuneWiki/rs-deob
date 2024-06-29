import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class217 {

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "Lak;")
    public static class234 field278 = new class234("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!uc", name = "Gb", descriptor = "Lkh;")
    public static class13 field282 = new class13(20);

    @OriginalMember(owner = "client!uc", name = "Ib", descriptor = "I")
    public static int field284 = -1;

    @OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Z")
    public static boolean field285 = false;

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!uc", name = "Fb", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!uc", name = "Hb", descriptor = "Ll;")
    public static class16 field283;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;", line = 3)
    public static final String[] method170(int arg0, char arg1, String arg2) {
        ++field281;
        if (arg0 != 16943) {
            field284 = 79;
        }
        int var3 = class324.method2061(arg1, (byte) -99, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; ++var7) {
            int var8;
            for (var8 = var6; ~arg2.charAt(var8) != ~arg1; ++var8) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(FB)V", line = 38)
    public final void method171(float arg0, byte arg1) {
        ++field280;
        int var3 = NativeStream.floatToRawIntBits(arg0);
        if (arg1 != 51) {
            this.method173(-1.2271239F, -120);
        }
        super.field3572[super.field3556++] = (byte) var3;
        super.field3572[super.field3556++] = (byte) (var3 >> 8);
        super.field3572[super.field3556++] = (byte) (var3 >> 16);
        super.field3572[super.field3556++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "(I)V", line = 54)
    public static void method172(int arg0) {
        int var1 = -119 % ((arg0 - -23) / 53);
        field278 = null;
        field282 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V", line = 75)
    public class23(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(FI)V", line = 78)
    public final void method173(float arg0, int arg1) {
        if (arg1 == 101127152) {
            ++field279;
            int var3 = NativeStream.floatToRawIntBits(arg0);
            super.field3572[super.field3556++] = (byte) (var3 >> 24);
            super.field3572[super.field3556++] = (byte) (var3 >> 16);
            super.field3572[super.field3556++] = (byte) (var3 >> 8);
            super.field3572[super.field3556++] = (byte) var3;
        }
    }
}
