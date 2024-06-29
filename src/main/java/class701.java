import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class701 implements class48 {

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/String;")
    private String field9881;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "Lpia;")
    public static class94 field9882 = new class94(55, 12);

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Ldh;")
    public static class320 field9887 = new class320(53, 0);

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field9892 = 0;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field9893 = -1;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "F")
    public static float field9883;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "Z")
    private boolean field9886;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIB)Z", line = 5)
    public static final boolean method3937(int arg0, int arg1, byte arg2) {
        int var3 = -47 % ((arg2 - 33) / 62);
        field9889++;
        return (arg1 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)Lvca;", line = 15)
    public final class279 method279(byte arg0) {
        if (arg0 == -127) {
            field9891++;
            return class279.field3425;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 27)
    public static void method3938(int arg0) {
        field9882 = null;
        field9887 = null;
        if (arg0 <= 69) {
            method3937(15, 28, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "([[BBLfca;)V", line = 42)
    public static final void method3939(byte[][] arg0, byte arg1, class84 arg2) {
        if (arg1 > -9) {
            return;
        }
        field9884++;
        int var3 = class602.field8566.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class74.field773[var4] >> 8) * 64 - class464.field6624;
                int var7 = (class74.field773[var4] & 0xFF) * 64 - class181.field2144;
                class381.method2343(false);
                arg2.method585(var6, class275.field3370, -61, class205.field2430, var5, var7);
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)I", line = 79)
    public final int method278(boolean arg0) {
        field9885++;
        int var2 = class123.method791(100, this.field9881);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field9886 = arg0;
            return 100;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)Z", line = 94)
    public final boolean method3940(int arg0) {
        field9888++;
        if (arg0 != 12) {
            method3938(102);
        }
        return this.field9886;
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 104)
    public class701(String arg0) {
        this.field9881 = arg0;
    }
}
