import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class213 extends class26 {

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[S")
    public static short[] field3009 = new short[256];

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3010 = "Loaded config";

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[F")
    public static float[] field3008 = new float[4];

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "J")
    public long field3011;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Llh;")
    public class213 field3007;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Llh;")
    public class213 field3012;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)I", line = 11)
    public static final int method1555(byte[] arg0, int arg1, int arg2, int arg3) {
        field3005++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = class181.field2471[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        if (arg2 < 79) {
            field3008 = (float[]) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 33)
    public final void method1556(int arg0) {
        field3014++;
        if (this.field3007 == null) {
            return;
        }
        this.field3007.field3012 = this.field3012;
        if (arg0 != 255) {
            field3008 = (float[]) null;
        }
        this.field3012.field3007 = this.field3007;
        this.field3007 = null;
        this.field3012 = null;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 60)
    public static void method1557(int arg0) {
        int var1 = 16 % ((48 - arg0) / 34);
        field3009 = null;
        field3008 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z", line = 74)
    public final boolean method1558(byte arg0) {
        if (arg0 > -85) {
            this.method1556(-10);
        }
        field3006++;
        return this.field3007 != null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V", line = 96)
    public static final void method1559(int arg0, boolean arg1) {
        field3013++;
        if (arg1) {
            field3010 = (String) null;
        }
        class42 var2 = class166.method1242(2, arg0, -1249071392);
        var2.method306((byte) -104);
    }
}
