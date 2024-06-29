import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class406 {

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    private int field6129 = 0;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "Ljk;")
    private class446 field6132 = null;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    private int field6124 = 0;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    private int field6127 = 0;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lod;")
    private class349 field6123;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "Lqh;")
    private class48 field6134;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "[Lhr;")
    private class363[] field6130;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "Llk;")
    public class413 field6125;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
    public final void method2439(int arg0, int arg1, int arg2) {
        if (this.field6127 != 0 & (this.field6129 != arg0 | this.field6124 != arg1)) {
            this.field6130[Integer.MAX_VALUE & this.field6127].method128(arg0, -43, arg1);
            this.field6129 = arg0;
            this.field6124 = arg1;
        }
        field6128++;
        int var4 = -113 / ((27 - arg2) / 59);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZIIZ)V")
    public final void method2440(boolean arg0, int arg1, int arg2, boolean arg3) {
        boolean var5 = arg3 & this.field6123.method1107();
        field6131++;
        if (arg2 < 93) {
            return;
        }
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field6127 != arg1) {
            if (this.field6127 != 0) {
                this.field6130[this.field6127 & Integer.MAX_VALUE].method120(false);
            }
            if (arg1 != 0) {
                this.field6130[Integer.MAX_VALUE & arg1].method125(arg0, -104);
                this.field6130[arg1 & Integer.MAX_VALUE].method122(arg0, (byte) 52);
            }
            this.field6124 = Integer.MIN_VALUE;
            this.field6132 = null;
            this.field6127 = arg1;
            this.field6129 = Integer.MIN_VALUE;
        } else if (this.field6127 != 0) {
            this.field6130[Integer.MAX_VALUE & this.field6127].method122(arg0, (byte) 52);
            return;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)Z")
    public final boolean method2441(byte arg0, int arg1) {
        field6122++;
        return arg0 == -54 ? this.field6130[arg1].method126(-33) : true;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)I")
    public static final int method2442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 164) {
            return -90;
        }
        field6126++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg0;
        int var7 = var5 < 4 ? arg0 : (var5 == 12 || var5 == 14 ? arg1 : arg4);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lod;)V")
    public class406(class349 arg0) {
        this.field6123 = arg0;
        this.field6134 = new class48(arg0);
        this.field6130 = new class363[10];
        this.field6130[1] = new class186(arg0);
        this.field6130[2] = new class19(arg0, this.field6134);
        this.field6130[4] = new class497(arg0, this.field6134);
        this.field6130[5] = new class290(arg0, this.field6134);
        this.field6130[6] = new class109(arg0);
        this.field6130[7] = new class424(arg0);
        this.field6130[3] = this.field6125 = new class413(arg0);
        this.field6130[8] = new class397(arg0, this.field6134);
        this.field6130[9] = new class357(arg0, this.field6134);
        if (!this.field6130[8].method126(-55)) {
            this.field6130[8] = this.field6130[4];
        }
        if (!this.field6130[9].method126(121)) {
            this.field6130[9] = this.field6130[8];
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjk;B)Z")
    public final boolean method2443(int arg0, class446 arg1, byte arg2) {
        field6133++;
        if (this.field6127 == 0) {
            return false;
        }
        if (this.field6132 != arg1) {
            this.field6130[Integer.MAX_VALUE & this.field6127].method121(arg1, arg0, (byte) -97);
            this.field6132 = arg1;
        }
        int var4 = 53 / ((arg2 + 25) / 36);
        return true;
    }
}
