import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class199 {

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    private int field2998 = -1;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "I")
    private int field3004 = 0;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Lada;")
    private class164 field2991 = new class164();

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "Z")
    public boolean field3005 = false;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "[[I")
    private int[][] field2999;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "[Ldea;")
    private class248[] field2996;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lqg;")
    public static class464 field2993 = null;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2994 = 0;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lqe;")
    public static class469 field2992 = new class469(30, -1);

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V", line = 7)
    public final void method1373(byte arg0) {
        for (int var2 = 0; var2 < this.field3000; var2++) {
            this.field2999[var2] = null;
        }
        if (arg0 != -49) {
            this.method1373((byte) 7);
        }
        field3003++;
        this.field2999 = null;
        this.field2996 = null;
        this.field2991.method1200(81);
        this.field2991 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIII)V", line = 34)
    public static final void method1374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2995++;
        int var6 = arg1;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg1 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (arg1 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        class238.method1577(arg5, class664.field9322[arg2], arg0 + arg4, -arg4 + arg0, (byte) 122);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg2 - var7;
            int var22 = arg2 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class238.method1577(arg5, class664.field9322[var21], var23, var24, (byte) 11);
            class238.method1577(arg5, class664.field9322[var22], var23, var24, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)[[I", line = 115)
    public final int[][] method1375(byte arg0) {
        field3001++;
        if (arg0 < 62) {
            method1377(-4);
        }
        if (this.field3002 != this.field3000) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3000; var2++) {
            this.field2996[var2] = class221.field3235;
        }
        return this.field2999;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IB)[I", line = 144)
    public final int[] method1376(int arg0, byte arg1) {
        field2997++;
        int var3 = -37 % ((arg1 - 72) / 36);
        if (this.field3002 == this.field3000) {
            this.field3005 = this.field2996[arg0] == null;
            this.field2996[arg0] = class221.field3235;
            return this.field2999[arg0];
        } else if (this.field3000 == 1) {
            this.field3005 = this.field2998 != arg0;
            this.field2998 = arg0;
            return this.field2999[0];
        } else {
            class248 var4 = this.field2996[arg0];
            if (var4 == null) {
                this.field3005 = true;
                if (this.field3004 >= this.field3000) {
                    class248 var5 = (class248) this.field2991.method1205(false);
                    var4 = new class248(arg0, var5.field3604);
                    this.field2996[var5.field3603] = null;
                    var5.method1304((byte) 7);
                } else {
                    var4 = new class248(arg0, this.field3004);
                    this.field3004++;
                }
                this.field2996[arg0] = var4;
            } else {
                this.field3005 = false;
            }
            this.field2991.method1192(var4, (byte) -119);
            return this.field2999[var4.field3604];
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 212)
    public static void method1377(int arg0) {
        if (arg0 < -98) {
            field2993 = null;
            field2992 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(III)V", line = 241)
    public class199(int arg0, int arg1, int arg2) {
        this.field3000 = arg0;
        this.field3002 = arg1;
        this.field2999 = new int[this.field3000][arg2];
        this.field2996 = new class248[this.field3002];
    }
}
