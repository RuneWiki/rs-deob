import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class72 extends class582 {

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Lwba;")
    public class46 field1260 = new class46();

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "Lbfa;")
    public class335 field1263 = new class335();

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Lbh;")
    private class34 field1259;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "[Lbba;")
    public static class98[] field1269 = new class98[14];

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "[[S")
    public static short[][] field1265;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)V", line = 5)
    public final void method373(int[] arg0, int arg1, int arg2) {
        field1264++;
        this.field1263.method373(arg0, arg1, arg2);
        for (class676 var4 = (class676) this.field1260.method472((byte) -63); var4 != null; var4 = (class676) this.field1260.method482(9)) {
            if (!this.field1259.method380(var4, 0)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field9562 >= var6) {
                        this.method691(false, arg0, var5 + var6, var4, var6, var5);
                        var4.field9562 -= var6;
                        break;
                    }
                    this.method691(false, arg0, var5 + var6, var4, var4.field9562, var5);
                    var6 -= var4.field9562;
                    var5 += var4.field9562;
                } while (!this.field1259.method385(var6, var4, false, var5, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lbh;)V", line = 258)
    public class72(class34 arg0) {
        this.field1259 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "()Lpda;", line = 52)
    public final class582 method403() {
        field1271++;
        class676 var1;
        do {
            var1 = (class676) this.field1260.method482(125);
            if (var1 == null) {
                return null;
            }
        } while (var1.field9559 == null);
        return var1.field9559;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z[IILhb;II)V", line = 73)
    private final void method691(boolean arg0, int[] arg1, int arg2, class676 arg3, int arg4, int arg5) {
        if ((this.field1259.field543[arg3.field9553] & 0x4) != 0 && arg3.field9570 < 0) {
            int var7 = this.field1259.field578[arg3.field9553] / class465.field6683;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field9561) / var7;
                if (arg4 < var8) {
                    arg3.field9561 += arg4 * var7;
                    break;
                }
                arg3.field9559.method373(arg1, arg5, var8);
                arg3.field9561 += var7 * var8 - 1048576;
                arg5 += var8;
                arg4 -= var8;
                int var9 = class465.field6683 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class557 var11 = arg3.field9559;
                if (this.field1259.field567[arg3.field9553] == 0) {
                    arg3.field9559 = class557.method3156(arg3.field9575, var11.method3158(), var11.method3188(), var11.method3179());
                } else {
                    arg3.field9559 = class557.method3156(arg3.field9575, var11.method3158(), 0, var11.method3179());
                    this.field1259.method381(false, arg3, arg3.field9554.field5941[arg3.field9565] < 0);
                    arg3.field9559.method3180(var9, var11.method3188());
                }
                if (arg3.field9554.field5941[arg3.field9565] < 0) {
                    arg3.field9559.method3192(-1);
                }
                var11.method3155(var9);
                var11.method373(arg1, arg5, arg2 - arg5);
                if (var11.method3189()) {
                    this.field1263.method2107(var11);
                }
            }
        }
        field1262++;
        arg3.field9559.method373(arg1, arg5, arg4);
        if (arg0) {
            this.field1260 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILhb;I)V", line = 132)
    private final void method692(int arg0, class676 arg1, int arg2) {
        if ((this.field1259.field543[arg1.field9553] & 0x4) != 0 && arg1.field9570 < 0) {
            int var4 = this.field1259.field578[arg1.field9553] / class465.field6683;
            int var5 = (var4 + 1048575 - arg1.field9561) / var4;
            arg1.field9561 = arg2 * var4 + arg1.field9561 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field1259.field567[arg1.field9553] == 0) {
                    arg1.field9559 = class557.method3156(arg1.field9575, arg1.field9559.method3158(), arg1.field9559.method3188(), arg1.field9559.method3179());
                } else {
                    arg1.field9559 = class557.method3156(arg1.field9575, arg1.field9559.method3158(), 0, arg1.field9559.method3179());
                    this.field1259.method381(false, arg1, arg1.field9554.field5941[arg1.field9565] < 0);
                }
                if (arg1.field9554.field5941[arg1.field9565] < 0) {
                    arg1.field9559.method3192(-1);
                }
                arg2 = arg1.field9561 / var4;
            }
        }
        field1261++;
        if (arg0 != -22225) {
            this.field1259 = null;
        }
        arg1.field9559.method386(arg2);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "()I", line = 175)
    public final int method406() {
        field1266++;
        return 0;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 183)
    public final void method386(int arg0) {
        this.field1263.method386(arg0);
        field1270++;
        for (class676 var2 = (class676) this.field1260.method472((byte) -98); var2 != null; var2 = (class676) this.field1260.method482(-74)) {
            if (!this.field1259.method380(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field9562 >= var3) {
                        this.method692(-22225, var2, var3);
                        var2.field9562 -= var3;
                        break;
                    }
                    this.method692(-22225, var2, var2.field9562);
                    var3 -= var2.field9562;
                } while (!this.field1259.method385(var3, var2, false, 0, null));
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "()Lpda;", line = 218)
    public final class582 method397() {
        field1268++;
        class676 var1 = (class676) this.field1260.method472((byte) -55);
        if (var1 == null) {
            return null;
        } else if (var1.field9559 == null) {
            return this.method403();
        } else {
            return var1.field9559;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 240)
    public static void method693(byte arg0) {
        field1265 = null;
        if (arg0 != 74) {
            method693((byte) -99);
        }
        field1269 = null;
    }
}
