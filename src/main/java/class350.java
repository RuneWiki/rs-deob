import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class350 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "B")
    public byte field5213;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "S")
    public short field5225;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "S")
    public short field5217;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Z")
    public boolean field5214;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "B")
    public byte field5220;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "S")
    public short field5221;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "Ld;")
    public static class242 field5216 = new class242(64);

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field5219 = -2;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lvg;")
    public static class56 field5223 = new class56(16);

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "[I")
    public static int[] field5226 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lsl;")
    public static class460 field5227;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZ)I", line = 8)
    public static final int method2247(int arg0, int arg1, int arg2, boolean arg3) {
        field5224++;
        class100 var4 = class48.method323(arg2 + Integer.MIN_VALUE, arg3, arg1);
        if (arg2 != 0) {
            field5226 = null;
        }
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && var4.field1534.length > arg0) {
            return var4.field1534[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III[B)[B", line = 38)
    public static final byte[] method2248(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 16) {
            field5219 = 59;
        }
        field5215++;
        byte[] var4 = new byte[arg1];
        class325.method2131(arg3, arg2, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 59)
    public static void method2249(int arg0) {
        field5216 = null;
        field5227 = null;
        if (arg0 != 0) {
            field5223 = null;
        }
        field5226 = null;
        field5223 = null;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 85)
    public class350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5213 = (byte) arg8;
        this.field5222 = arg0;
        this.field5225 = (short) arg6;
        this.field5217 = (short) arg4;
        this.field5214 = arg9;
        this.field5220 = (byte) arg7;
        this.field5221 = (short) arg5;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIII)Ldp;", line = 105)
    public final class350 method2250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 128) {
            method2249(64);
        }
        field5218++;
        return new class350(arg2, arg0, arg4, arg3, this.field5217, this.field5221, this.field5225, this.field5220, this.field5213, this.field5214);
    }
}
