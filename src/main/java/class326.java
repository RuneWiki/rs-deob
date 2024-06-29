import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class326 extends class445 {

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "[Ljq;")
    public class326[] field4340;

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "Z")
    public boolean field4358;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field4349 = -1;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Lmc;")
    public static class78 field4339 = new class78(81, 2);

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "[Lnb;")
    public static class181[] field4354 = new class181[14];

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "[Z")
    public static boolean[] field4353 = new boolean[8];

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "Lnc;")
    public class21 field4344;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Lvs;")
    public class385 field4343;

    static {
        new class206("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(IZI)[I", line = 4)
    public final int[] method1824(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4353 = null;
        }
        field4347++;
        return this.field4340[arg0].field4358 ? this.field4340[arg0].method30((byte) -44, arg2) : this.field4340[arg0].method48(arg2, (byte) -71)[0];
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V", line = 29)
    public static final void method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class143 var7 = new class143();
        var7.field2073 = arg1 >> class302.field4025;
        var7.field2062 = arg2 >> class302.field4025;
        var7.field2064 = arg3 >> class302.field4025;
        var7.field2067 = arg4 >> class302.field4025;
        var7.field2065 = arg0;
        var7.field2076 = arg1;
        var7.field2071 = arg2;
        var7.field2060 = arg3;
        var7.field2068 = arg4;
        var7.field2074 = arg5;
        var7.field2080 = arg6;
        class123.field1800[class398.field5490++] = var7;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V", line = 46)
    public void method115(int arg0, int arg1, byte arg2) {
        field4341++;
        int var4 = this.field4352 == 255 ? arg0 : this.field4352;
        if (arg2 >= -97) {
            this.method33(-89, (class32) null, -124);
        }
        if (this.field4358) {
            this.field4344 = new class21(var4, arg0, arg1);
        } else {
            this.field4343 = new class385(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I", line = 74)
    public static final int method1826(int arg0, int arg1) {
        return class246.field3284 == null ? 0 : (class246.field3284[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 79)
    public void method117(int arg0) {
        if (this.field4358) {
            this.field4344.method128((byte) -84);
            this.field4344 = null;
        } else {
            this.field4343.method2362((byte) 95);
            this.field4343 = null;
        }
        if (arg0 != 3) {
            this.method1788(-52);
        }
        field4348++;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I", line = 105)
    public int method1788(int arg0) {
        if (arg0 == -1) {
            field4342++;
            return -1;
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I", line = 120)
    public int[][] method48(int arg0, byte arg1) {
        field4351++;
        if (arg1 > -52) {
            this.field4343 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V", line = 140)
    public void method65(int arg0) {
        if (arg0 >= -100) {
            field4339 = null;
        }
        field4356++;
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)V", line = 153)
    public static void method1827(int arg0) {
        if (arg0 != -1) {
            field4354 = null;
        }
        field4353 = null;
        field4354 = null;
        field4339 = null;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I", line = 174)
    public int method116(boolean arg0) {
        field4338++;
        if (!arg0) {
            this.field4358 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I", line = 192)
    public final int[][] method1828(int arg0, boolean arg1, int arg2) {
        field4345++;
        if (!arg1) {
            field4349 = 0;
        }
        if (this.field4340[arg0].field4358) {
            int[] var4 = this.field4340[arg0].method30((byte) -9, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4340[arg0].method48(arg2, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILbt;I)V", line = 227)
    public void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 > -3) {
            field4353 = null;
        }
        field4350++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I", line = 237)
    public int[] method30(byte arg0, int arg1) {
        if (arg0 > -6) {
            return null;
        } else {
            field4355++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V", line = 247)
    public class326(int arg0, boolean arg1) {
        this.field4340 = new class326[arg0];
        this.field4358 = arg1;
    }
}
