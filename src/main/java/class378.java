import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class378 {

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "J")
    private long field5265;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    private int field5263;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "Z")
    public static boolean field5266 = false;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "D")
    public static double field5260;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Lwu;")
    public static class557 field5267;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Ljm;")
    public static class6 field5264;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "[I")
    public static int[] field5269;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I", line = 5)
    public final int method2285(boolean arg0) {
        if (!arg0) {
            this.field5265 = 125L;
        }
        field5261++;
        return this.field5263;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lwu;III)Loq;", line = 16)
    public static final class742 method2286(class557 arg0, int arg1, int arg2, int arg3) {
        field5262++;
        byte[] var4 = arg0.method3322(arg3, arg2, (byte) 97);
        if (var4 == null) {
            return null;
        } else {
            int var5 = -22 % ((29 - arg1) / 48);
            return new class742(var4);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Llba;", line = 35)
    public final class91 method2287(int arg0, int arg1) {
        if (arg0 == -22176) {
            field5268++;
            return class91.method550(this.method2289(-66, arg1), arg0 ^ 0xFFFFA963);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLlba;)V", line = 46)
    private final void method2288(byte arg0, class91 arg1) {
        this.field5265 |= (arg1.field1222 << this.field5263++ * class91.field1235);
        if (arg0 != -56) {
            this.field5265 = -58L;
        }
        field5270++;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Llba;)V", line = 56)
    public class378(class91 arg0) {
        this.field5265 = arg0.field1222;
        this.field5263 = 1;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)I", line = 65)
    private final int method2289(int arg0, int arg1) {
        field5271++;
        int var3 = -40 / ((61 - arg0) / 51);
        return (int) (this.field5265 >> class91.field1235 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V", line = 78)
    public static void method2290(byte arg0) {
        field5269 = null;
        if (arg0 != 34) {
            method2290((byte) -20);
        }
        field5267 = null;
        field5264 = null;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "([Llba;)V", line = 92)
    public class378(class91[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2288((byte) -56, arg0[var2]);
        }
    }
}
