import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class19 extends class109 {

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "[Lgj;")
    public static class240[] field276 = new class240[14];

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "Z")
    public static boolean field269 = false;

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
    public static int[] field275 = new int[14];

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "Ljava/lang/String;")
    public static String field277 = "flash3:";

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ff", name = "V", descriptor = "Lhc;")
    public static class235 field281;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lkb;")
    public class54 field278;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Ljava/lang/String;")
    public static String field273;

    @OriginalMember(owner = "client!ff", name = "T", descriptor = "[B")
    public byte[] field279;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
    public static int[] field268;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)[B")
    public final byte[] method142(int arg0) {
        ++field280;
        if (arg0 <= 49) {
            this.method142(-19);
        }
        if (super.field1519) {
            throw new RuntimeException();
        } else {
            return this.field279;
        }
    }

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)I")
    public final int method143(int arg0) {
        if (arg0 != 14) {
            method146(77, -82);
        }
        ++field272;
        return super.field1519 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "(I)V")
    public static final void method144(int arg0) {
        if (arg0 == 0) {
            ++field274;
            class228.field3461.method546(-90762264);
        }
    }

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "(I)V")
    public static void method145(int arg0) {
        field277 = null;
        field275 = null;
        field268 = null;
        field276 = null;
        field281 = null;
        field273 = null;
        int var1 = -76 / ((-20 - arg0) / 51);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
    public static final void method146(int arg0, int arg1) {
        ++field282;
        class280 var2 = class181.method1180(arg0, 0, arg1);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lhc;ZLhc;II)Lgk;")
    public static final class159 method147(class235 arg0, boolean arg1, class235 arg2, int arg3, int arg4) {
        int[] var5 = arg0.method1567((byte) 70, arg4);
        ++field270;
        boolean var6 = true;
        for (int var7 = 0; var5.length > var7; ++var7) {
            byte[] var8 = arg0.method1580(arg4, (byte) -126, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = 65280 & var8[0] << 8 | var8[1] & 255;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method1580(0, (byte) -127, var9);
                } else {
                    var10 = arg2.method1580(var9, (byte) -126, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        } else {
            try {
                if (arg3 != 65280) {
                    return null;
                } else {
                    return new class159(arg0, arg2, arg4, arg1);
                }
            } catch (Exception var11) {
                return null;
            }
        }
    }
}
