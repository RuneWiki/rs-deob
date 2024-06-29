import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class76 extends class221 {

    @OriginalMember(owner = "client!ng", name = "Qb", descriptor = "I")
    public static int field1228 = 0;

    @OriginalMember(owner = "client!ng", name = "Rb", descriptor = "I")
    public static int field1229 = 0;

    @OriginalMember(owner = "client!ng", name = "Eb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ng", name = "Fb", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!ng", name = "Gb", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ng", name = "Hb", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ng", name = "Ib", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!ng", name = "Jb", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ng", name = "Kb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ng", name = "Lb", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ng", name = "Mb", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ng", name = "Nb", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ng", name = "Ob", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ng", name = "Sb", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ng", name = "Tb", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ng", name = "Vb", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ng", name = "Ub", descriptor = "Lrf;")
    private class282 field1232;

    @OriginalMember(owner = "client!ng", name = "Pb", descriptor = "[Ld;")
    public static class238[] field1227;

    @OriginalMember(owner = "client!ng", name = "Db", descriptor = "[[[Lwi;")
    public static class134[][][] field1215;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLqh;)V")
    public static final void method529(boolean arg0, class201 arg1) {
        if (arg0) {
            field1229 = 25;
        }
        class278.field4376 = arg1;
        ++field1222;
    }

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "(I)V")
    public final void method530(int arg0) {
        if (arg0 != 255) {
            this.method532((byte) -50, 102, (byte[]) null, -9);
        }
        this.field1217 = super.field3655 * 8;
        ++field1225;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class76(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "(I)V")
    public static void method531(int arg0) {
        field1215 = null;
        if (arg0 > -93) {
            method533(41, -18);
        }
        field1227 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI[BI)V")
    public final void method532(byte arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = -97 / ((6 - arg0) / 39);
        for (int var6 = 0; var6 < arg1; ++var6) {
            arg2[var6 - -arg3] = (byte) (super.field3653[super.field3655++] + -this.field1232.method1900((byte) 55));
        }
        ++field1218;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(II)I")
    public static final int method533(int arg0, int arg1) {
        if (arg1 != -29138) {
            field1229 = 92;
        }
        ++field1220;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(BI)V")
    public final void method534(byte arg0, int arg1) {
        ++field1216;
        int var3 = -36 / ((-56 - arg0) / 37);
        super.field3653[super.field3655++] = (byte) (arg1 + this.field1232.method1900((byte) 55));
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "([IB)V")
    public final void method535(int[] arg0, byte arg1) {
        ++field1221;
        this.field1232 = new class282(arg0);
        if (arg1 > -116) {
            this.field1217 = -112;
        }
    }

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "(I)V")
    public static final void method536(int arg0) {
        if (arg0 != 0) {
            method531(-26);
        }
        ++field1223;
        class29.field466.method472((byte) -63);
    }

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "(II)I")
    public final int method537(int arg0, int arg1) {
        if (arg0 != 8) {
            return -106;
        } else {
            ++field1219;
            return arg1 * 8 + -this.field1217;
        }
    }

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "(I)I")
    public final int method538(int arg0) {
        if (arg0 != 255) {
            field1215 = null;
        }
        ++field1230;
        return 255 & super.field3653[super.field3655++] - this.field1232.method1900((byte) 55);
    }

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "(I)V")
    public final void method539(int arg0) {
        ++field1231;
        super.field3655 = (this.field1217 + 7) / 8;
        int var2 = 54 % ((arg0 - -45) / 60);
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(II)I")
    public final int method540(int arg0, int arg1) {
        ++field1224;
        int var3 = this.field1217 >> 3;
        int var4 = -(7 & this.field1217) + 8;
        if (arg1 != 882786883) {
            field1227 = null;
        }
        int var5 = 0;
        this.field1217 += arg0;
        while (~var4 > ~arg0) {
            var5 += (class113.field1892[var4] & super.field3653[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field3653[var3] >> var4 - arg0 & class113.field1892[arg0]) + var5;
        } else {
            var6 = (class113.field1892[var4] & super.field3653[var3]) + var5;
        }
        return var6;
    }
}
