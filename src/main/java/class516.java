import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public abstract class class516 extends class230 {

    @OriginalMember(owner = "client!kka", name = "I", descriptor = "Z")
    public static volatile boolean field7074 = true;

    @OriginalMember(owner = "client!kka", name = "N", descriptor = "I")
    public static int field7079 = -1;

    @OriginalMember(owner = "client!kka", name = "T", descriptor = "[I")
    public static int[] field7085 = new int[8];

    @OriginalMember(owner = "client!kka", name = "R", descriptor = "Ljn;")
    public static class134 field7083 = new class134(131, 0);

    @OriginalMember(owner = "client!kka", name = "J", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!kka", name = "K", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!kka", name = "L", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!kka", name = "M", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!kka", name = "O", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!kka", name = "Q", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!kka", name = "V", descriptor = "Lae;")
    public static class283 field7087;

    @OriginalMember(owner = "client!kka", name = "P", descriptor = "Leq;")
    public static class370 field7081;

    @OriginalMember(owner = "client!kka", name = "S", descriptor = "Llo;")
    public static class450 field7084;

    @OriginalMember(owner = "client!kka", name = "U", descriptor = "[[B")
    public static byte[][] field7086;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(B)V", line = 3)
    public static void method3070(byte arg0) {
        field7081 = null;
        field7083 = null;
        field7086 = null;
        int var1 = 22 % ((arg0 - 19) / 37);
        field7085 = null;
        field7087 = null;
        field7084 = null;
    }

    @OriginalMember(owner = "client!kka", name = "d", descriptor = "(Z)Z", line = 20)
    public final boolean method83(boolean arg0) {
        if (arg0) {
            field7086 = null;
        }
        ++field7082;
        return false;
    }

    @OriginalMember(owner = "client!kka", name = "g", descriptor = "(I)Z", line = 42)
    public final boolean method1534(int arg0) {
        if (arg0 != 382) {
            this.method81((byte) -82);
        }
        ++field7078;
        return class592.field8338[(super.field3470 >> class732.field10110) - -class270.field3904 + -class591.field8336][(super.field3460 >> class732.field10110) + -class112.field1363 + class270.field3904];
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z[Lsca;)I", line = 53)
    public final int method1526(boolean arg0, class251[] arg1) {
        ++field7076;
        if (arg0) {
            this.method83(true);
        }
        return this.method1527((byte) -32, arg1, super.field3460 >> class732.field10110, super.field3470 >> class732.field10110);
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Loq;IZILha;II)V", line = 68)
    public final void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6) {
        ++field7075;
        if (arg6 <= 96) {
            this.method1534(123);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IIIII)V", line = 78)
    public class516(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field3469 = (byte) arg4;
        super.field3470 = arg0;
        super.field3467 = (byte) arg3;
        super.field3464 = arg1;
        super.field3460 = arg2;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lr;III[Z)Z", line = 92)
    public static final boolean method3071(class113 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class661.field9303 != class594.field8355) {
            int var6 = class95.field1115[arg1].method2529(arg3, arg2, (byte) -128);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class418 var8 = class95.field1115[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2529(arg3, arg2, (byte) -128);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1365(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1370(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "(B)V", line = 127)
    public final void method81(byte arg0) {
        ++field7077;
        if (arg0 != 29) {
            field7087 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lha;B)Z", line = 139)
    public final boolean method1525(class473 arg0, byte arg1) {
        if (arg1 != -127) {
            return true;
        } else {
            ++field7080;
            class44 var3 = class450.method2720(super.field3467, super.field3470 >> class732.field10110, super.field3460 >> class732.field10110);
            return var3 != null && var3.field465.field3749 ? class438.method2631(super.field3467, var3.field465.method78((byte) -71) + this.method78((byte) -92), super.field3460 >> class732.field10110, (byte) 14, super.field3470 >> class732.field10110) : class322.method2044(super.field3470 >> class732.field10110, super.field3460 >> class732.field10110, super.field3467, 1);
        }
    }
}
