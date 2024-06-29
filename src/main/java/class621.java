import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class621 extends class212 {

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "[I")
    public static int[] field8457 = new int[128];

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!kia", name = "x", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "Laha;")
    public static class382 field8455;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "[[I")
    public static int[][] field8449;

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            this.method419(-15, 91);
        }
        ++field8453;
        return 0;
    }

    @OriginalMember(owner = "client!kia", name = "d", descriptor = "(I)I")
    public final int method3539(int arg0) {
        ++field8451;
        return arg0 != -32350 ? -65 : super.field3006;
    }

    @OriginalMember(owner = "client!kia", name = "e", descriptor = "(I)Z")
    public final boolean method3540(int arg0) {
        if (arg0 <= 85) {
            this.method3539(-113);
        }
        ++field8458;
        int var2 = super.field3004.method2064((byte) -93).method3097(-23688);
        return ~var2 <= -97;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field8452;
        int var2 = super.field3004.method2064((byte) -105).method3097(-23688);
        if (~var2 > -97) {
            super.field3006 = 0;
        }
        if (arg0) {
            field8455 = null;
        }
        if (super.field3006 > 1 && ~var2 > -129) {
            super.field3006 = 1;
        }
        if (super.field3006 > 2 && var2 < 192) {
            super.field3006 = 2;
        }
        if (super.field3006 < 0 || ~super.field3006 < -4) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field8454;
        int var3 = super.field3004.method2064((byte) -104).method3097(arg0 ^ -23685);
        if (var3 < 96) {
            return 3;
        } else if (~arg1 < -2 && var3 < 128) {
            return 3;
        } else {
            return arg1 > arg0 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = -32 / ((82 - arg0) / 35);
        ++field8456;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3541(String arg0, int arg1) {
        if (arg1 != -65) {
            method3541((String) null, 67);
        }
        ++field8450;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(ILdh;)V")
    public class621(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kia", name = "f", descriptor = "(I)V")
    public static void method3542(int arg0) {
        field8457 = null;
        if (arg0 != -15628) {
            field8455 = null;
        }
        field8455 = null;
        field8449 = null;
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Ldh;)V")
    public class621(class322 arg0) {
        super(arg0);
    }

    static {
        for (int var0 = 0; ~var0 > ~field8457.length; ++var0) {
            field8457[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; ++var1) {
            field8457[var1] = var1 + -65;
        }
        for (int var2 = 97; var2 <= 122; ++var2) {
            field8457[var2] = var2 - 97 + 26;
        }
        for (int var3 = 48; ~var3 >= -58; ++var3) {
            field8457[var3] = var3 + -48 - -52;
        }
        field8457[42] = field8457[43] = 62;
        field8457[45] = field8457[47] = 63;
    }
}
