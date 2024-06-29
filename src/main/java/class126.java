import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class class126 extends class215 {

    @OriginalMember(owner = "client!fea", name = "v", descriptor = "S")
    public short field1880;

    @OriginalMember(owner = "client!fea", name = "C", descriptor = "S")
    public short field1887;

    @OriginalMember(owner = "client!fea", name = "w", descriptor = "I")
    public static int field1881 = 0;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!fea", name = "t", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!fea", name = "u", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!fea", name = "x", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!fea", name = "y", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!fea", name = "A", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!fea", name = "B", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)V")
    public final void method947(int arg0) {
        ++field1886;
        int var2 = -110 % ((arg0 - -44) / 42);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(Z)Z")
    public final boolean method948(boolean arg0) {
        ++field1878;
        if (!arg0) {
            this.method953(-13, true, (class166) null, (class215) null, -56, -93, false);
        }
        return class260.field3949[(super.field3024 >> class310.field4593) + -class435.field6354 + class196.field2802][(super.field3029 >> class310.field4593) + class196.field2802 + -class612.field8575];
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IBI[B)Ljava/lang/String;")
    public static final String method949(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 >= -14) {
            return null;
        } else {
            ++field1876;
            char[] var4 = new char[arg2];
            int var5 = 0;
            for (int var6 = 0; ~arg2 < ~var6; ++var6) {
                int var7 = arg3[arg0 - -var6] & 255;
                if (var7 != 0) {
                    if (~var7 <= -129 && var7 < 160) {
                        char var8 = class497.field7043[var7 - 128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[Lrc;)I")
    public final int method950(int arg0, class498[] arg1) {
        ++field1882;
        return arg0 != 65535 ? 20 : this.method1427(super.field3024 >> class310.field4593, arg1, -128, super.field3029 >> class310.field4593);
    }

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "(I)Z")
    public final boolean method951(int arg0) {
        if (arg0 > -26) {
            field1881 = -126;
        }
        ++field1883;
        return false;
    }

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "(I)Z")
    public final boolean method952(int arg0) {
        if (arg0 > -10) {
            this.field1887 = 28;
        }
        ++field1879;
        return class70.method680(31530, super.field3029 >> class310.field4593, super.field3023, super.field3024 >> class310.field4593, this.method1182(-32768));
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLr;Lrga;IIZ)V")
    public final void method953(int arg0, boolean arg1, class166 arg2, class215 arg3, int arg4, int arg5, boolean arg6) {
        ++field1877;
        if (!arg6) {
            this.field1880 = -13;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IIIIIII)V")
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field3024 = arg0;
        super.field3018 = arg1;
        super.field3019 = (byte) arg3;
        this.field1880 = (short) arg6;
        this.field1887 = (short) arg5;
        super.field3023 = (byte) arg4;
        super.field3029 = arg2;
    }
}
