import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class248 extends class382 {

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "[[B")
    private byte[][] field2921 = new byte[10][];

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Les;")
    private class403 field2916 = new class403(null);

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Les;")
    private class403 field2926 = new class403(null);

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lbt;")
    private class48 field2924;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field2925 = 100;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    private int field2920;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "[I")
    private int[] field2923;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V", line = 7)
    public final void method1490(int arg0) {
        field2927++;
        if (arg0 != 10 || this.field2923 == null) {
            return;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if ((this.field2920 + var2) >= this.field2923.length) {
                return;
            }
            if (this.field2921[var2] == null && this.field2924.method443(0, this.field2923[this.field2920 + var2], true)) {
                this.field2921[var2] = this.field2924.method437(this.field2923[this.field2920 + var2], (byte) -42, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIZIZ)I", line = 41)
    public static final int method1491(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field2919++;
        class430 var5 = class105.method861(arg1, Integer.MIN_VALUE, arg2);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (!arg4) {
            field2925 = 18;
        }
        for (int var7 = 0; var7 < var5.field5670.length; var7++) {
            if (var5.field5670[var7] >= 0 && class121.field1555.field6786 > var5.field5670[var7]) {
                class340 var8 = class121.field1555.method2882(var5.field5670[var7], -22087);
                int var9 = var8.method2009((byte) -91, class113.field1426.method4366(true, arg3).field8244, arg3);
                if (arg0) {
                    var6 += var5.field5667[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILbt;I)V", line = 87)
    public class248(int arg0, class48 arg1, int arg2) {
        super(arg0);
        this.field2917 = arg2;
        this.field2924 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZII)V", line = 98)
    public static final void method1492(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            field2915 = -48;
        }
        if (arg0 >= arg3) {
            for (int var5 = arg3; var5 < arg0; var5++) {
                class4.field49[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg3; var6++) {
                class4.field49[var6][arg1] = arg4;
            }
        }
        field2918++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[B)I", line = 144)
    public final int method1493(byte arg0, byte[] arg1) throws IOException {
        field2922++;
        if (arg0 <= 83) {
            return -46;
        }
        if (this.field2923 == null) {
            if (!this.field2924.method443(0, this.field2917, true)) {
                return 0;
            }
            byte[] var3 = this.field2924.method437(this.field2917, (byte) 126, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field2926.field5262 = 0;
            this.field2926.field5275 = var3;
            int var4 = var3.length >> 1;
            this.field2923 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2923[var5] = this.field2926.method2390((byte) -106);
            }
        }
        if (this.field2920 >= this.field2923.length) {
            return -1;
        }
        this.method1490(10);
        this.field2926.field5262 = 0;
        this.field2926.field5275 = arg1;
        do {
            if (this.field2926.field5262 >= this.field2926.field5275.length) {
                this.field2926.field5275 = null;
                return arg1.length;
            }
            if (this.field2916.field5275 == null) {
                if (this.field2921[0] == null) {
                    this.field2926.field5275 = null;
                    return this.field2926.field5262;
                }
                this.field2916.field5275 = this.field2921[0];
            }
            int var6 = this.field2926.field5275.length - this.field2926.field5262;
            int var7 = this.field2916.field5275.length - this.field2916.field5262;
            if (var7 > var6) {
                this.field2916.method2401(65280, this.field2926.field5275, this.field2926.field5262, var6);
                this.field2926.field5275 = null;
                return arg1.length;
            }
            this.field2926.method2355(this.field2916.field5275, var7, (byte) 74, this.field2916.field5262);
            this.field2920++;
            this.field2916.field5262 = 0;
            this.field2916.field5275 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field2921[var8] = this.field2921[var8 + 1];
            }
            this.field2921[9] = null;
        } while (this.field2920 < this.field2923.length);
        this.field2926.field5275 = null;
        return this.field2926.field5262;
    }
}
