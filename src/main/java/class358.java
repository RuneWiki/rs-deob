import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class358 extends class648 {

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "Z")
    public static boolean field5202 = false;

    @OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
    public static int field5197 = -1;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "Lda;")
    public static class61 field5201;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(BII)V")
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 < 33) {
            field5197 = -116;
        }
        ++field5203;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lbca;II)V")
    public final void method1455(class663 arg0, int arg1, int arg2) {
        ++field5194;
        super.field9139.method2294(arg0, -2);
        if (arg1 != 12885) {
            field5202 = true;
        }
        super.field9139.method2353((byte) -96, arg2);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I[BILjava/lang/String;)I")
    public static final int method2236(int arg0, byte[] arg1, int arg2, String arg3) {
        ++field5198;
        int var4 = arg2;
        int var5 = arg3.length();
        for (int var6 = 0; var5 > var6; var6 += 4) {
            int var7 = class253.method1669(-1, arg3.charAt(var6));
            int var8 = ~(var6 + 1) <= ~var5 ? -1 : class253.method1669(arg0 ^ 1437765435, arg3.charAt(var6 + 1));
            int var9 = ~(var6 + 2) > ~var5 ? class253.method1669(arg0 ^ 1437765435, arg3.charAt(var6 - -2)) : -1;
            int var10 = ~var5 < ~(var6 - -3) ? class253.method1669(-1, arg3.charAt(var6 - -3)) : -1;
            arg1[arg2++] = (byte) class625.method3600(var7 << 2, var8 >>> 4);
            if (~var9 == 0) {
                break;
            }
            arg1[arg2++] = (byte) class625.method3600(class493.method2943(var8 << 4, 240), var9 >>> 2);
            if (~var10 == 0) {
                break;
            }
            arg1[arg2++] = (byte) class625.method3600(var10, class493.method2943(3, var9) << 6);
        }
        if (arg0 != -1437765436) {
            method2237((byte) -59);
        }
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
    public final void method1450(int arg0) {
        ++field5200;
        super.field9139.method2308(false, -1);
        if (arg0 >= -67) {
            this.method1450(-73);
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            field5202 = true;
        }
        ++field5204;
        return true;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lwu;)V")
    public class358(class373 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZZ)V")
    public final void method1451(boolean arg0, boolean arg1) {
        ++field5195;
        if (!arg0) {
            super.field9139.method2308(true, -1);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V")
    public final void method1448(boolean arg0, int arg1) {
        ++field5199;
        if (arg1 != 0) {
            field5196 = 124;
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(B)V")
    public static void method2237(byte arg0) {
        if (arg0 != 123) {
            method2237((byte) -22);
        }
        field5201 = null;
    }
}
