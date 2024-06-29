import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class38 extends class184 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[Lbe;")
    public class38[] field394;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Z")
    public boolean field388;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "Lwfa;")
    public class199 field397;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lsl;")
    public class460 field387;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)[I", line = 7)
    public final int[] method189(int arg0, int arg1, byte arg2) {
        field389++;
        if (arg2 != -92) {
            this.field394 = null;
        }
        return this.field394[arg1].field388 ? this.field394[arg1].method199((byte) -83, arg0) : this.field394[arg1].method196(arg2 ^ 0x477A, arg0)[0];
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILrg;)V", line = 30)
    public void method190(int arg0, int arg1, class645 arg2) {
        field396++;
        if (arg0 < 34) {
            method193(null, -58, 109);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 41)
    public void method191(byte arg0) {
        field384++;
        if (arg0 < 120) {
            this.method191((byte) 67);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)I", line = 51)
    public int method192(byte arg0) {
        field398++;
        if (arg0 != 113) {
            this.method196(52, 56);
        }
        return -1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([Lvs;II)V", line = 62)
    public static final void method193(class593[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class593 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field8425;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field8425 > (var7 & 0x1) + var6) {
                class593 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method193(arg0, arg1, var4 - 1);
        method193(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V", line = 100)
    public void method194(int arg0, int arg1, int arg2) {
        field391++;
        int var4 = this.field382 == arg1 ? arg2 : this.field382;
        if (this.field388) {
            this.field397 = new class199(var4, arg2, arg0);
        } else {
            this.field387 = new class460(var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)[[I", line = 123)
    public final int[][] method195(boolean arg0, int arg1, int arg2) {
        field395++;
        if (!arg0) {
            this.field388 = false;
        }
        if (this.field394[arg1].field388) {
            int[] var4 = this.field394[arg1].method199((byte) -120, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field394[arg1].method196(-18210, arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I", line = 173)
    public int[][] method196(int arg0, int arg1) {
        if (arg0 != -18210) {
            this.field397 = null;
        }
        field390++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IZ)V", line = 187)
    public class38(int arg0, boolean arg1) {
        this.field394 = new class38[arg0];
        this.field388 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I", line = 200)
    public int method197(byte arg0) {
        int var2 = 85 / ((arg0 + 26) / 62);
        field385++;
        return -1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 210)
    public void method198(int arg0) {
        if (arg0 != 1) {
            method193(null, 115, -104);
        }
        if (this.field388) {
            this.field397.method1373((byte) -49);
            this.field397 = null;
        } else {
            this.field387.method2807(-2);
            this.field387 = null;
        }
        field383++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[I", line = 237)
    public int[] method199(byte arg0, int arg1) {
        if (arg0 > -43) {
            return null;
        } else {
            field386++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }
}
