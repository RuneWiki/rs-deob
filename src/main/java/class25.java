import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class25 extends class17 {

    @OriginalMember(owner = "client!ln", name = "eb", descriptor = "I")
    private int field378 = 2000;

    @OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
    private int field383 = 0;

    @OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
    private int field380 = 0;

    @OriginalMember(owner = "client!ln", name = "pb", descriptor = "I")
    private int field389 = 4096;

    @OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
    private int field392 = 16;

    @OriginalMember(owner = "client!ln", name = "kb", descriptor = "Lsf;")
    public static class108 field384 = class140.method973(255, "details");

    @OriginalMember(owner = "client!ln", name = "ob", descriptor = "Lsf;")
    private static class108 field388 = class140.method973(255, "glow1:");

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "Lsf;")
    public static class108 field376 = field388;

    @OriginalMember(owner = "client!ln", name = "hb", descriptor = "Lsf;")
    private static class108 field381 = class140.method973(255, "Loaded textures");

    @OriginalMember(owner = "client!ln", name = "qb", descriptor = "Lsf;")
    public static class108 field390 = field388;

    @OriginalMember(owner = "client!ln", name = "ub", descriptor = "Lsf;")
    public static class108 field394 = field381;

    @OriginalMember(owner = "client!ln", name = "vb", descriptor = "Lsf;")
    public static class108 field395 = class140.method973(255, "Textures charg-Bes");

    @OriginalMember(owner = "client!ln", name = "tb", descriptor = "Lsf;")
    public static class108 field393 = class140.method973(255, "Hierhin gehen");

    @OriginalMember(owner = "client!ln", name = "ib", descriptor = "I")
    public static int field382 = -1;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ln", name = "fb", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ln", name = "lb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ln", name = "mb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ln", name = "nb", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!ln", name = "rb", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(I)V", line = 6)
    public static void method166(int arg0) {
        field393 = null;
        field395 = null;
        field390 = null;
        field388 = null;
        field384 = null;
        if (arg0 != -28449) {
            method166(65);
        }
        field394 = null;
        field376 = null;
        field381 = null;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(II)[I", line = 30)
    public final int[] method120(int arg0, int arg1) {
        field379++;
        if (arg0 >= -95) {
            this.method116(false);
        }
        int[] var3 = this.field217.method1698(115, arg1);
        if (this.field217.field4295) {
            int var4 = this.field389 >> 1;
            int[][] var5 = this.field217.method1695(0);
            Random var6 = new Random((long) this.field380);
            for (int var7 = 0; var7 < this.field378; var7++) {
                int var8 = this.field389 <= 0 ? this.field383 : this.field383 + class109.method792(-11163, var6, this.field389) - var4;
                int var9 = (var8 & 0xFF2) >> 4;
                int var10 = class109.method792(-11163, var6, class116.field2008);
                int var11 = class109.method792(-11163, var6, class289.field5059);
                int var12 = (class256.field4505[var9] * this.field392 >> 12) + var10;
                int var13 = var11 + (class246.field4264[var9] * this.field392 >> 12);
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var11;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                        var11 = var13;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = var13 - var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var10;
                    int var24 = 1024 - (class109.method792(-11163, var6, 4096) >> 2);
                    int var25 = 2048 / var23;
                    int var26 = -var23 / 2;
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var26 += var22;
                        int var29 = var24 - (-(var28 - var10) * var25 - 1024);
                        int var30 = var28 & class249.field4327;
                        int var31 = class219.field3899 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var26 > 0) {
                            var26 -= var23;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 162)
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILik;I)Lt;", line = 166)
    public static final class257 method167(int arg0, int arg1, class262 arg2, int arg3) {
        field391++;
        if (class167.method1166(arg2, arg3, (byte) 100, arg1)) {
            return arg0 == 3 ? class13.method84((byte) 125) : (class257) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V", line = 193)
    public final void method116(boolean arg0) {
        if (!arg0) {
            this.field380 = -69;
        }
        class271.method1959(1);
        field385++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILik;I)Z", line = 210)
    public static final boolean method168(int arg0, class262 arg1, int arg2) {
        if (arg0 != -12) {
            method167(117, 111, (class262) null, -6);
        }
        field374++;
        byte[] var3 = arg1.method1866((byte) -105, arg2);
        if (var3 == null) {
            return false;
        } else {
            class52.method366(var3, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLrm;I)V", line = 258)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field375++;
        if (arg0 != -114) {
            return;
        }
        if (arg2 == 0) {
            this.field380 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field378 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field392 = arg1.method1731(true);
        } else if (arg2 == 3) {
            this.field383 = arg1.method1712(-1);
        } else if (arg2 == 4) {
            this.field389 = arg1.method1712(-1);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLrm;)Lql;", line = 317)
    public static final class17 method169(byte arg0, class249 arg1) {
        field377++;
        arg1.method1731(true);
        int var2 = arg1.method1731(true);
        class17 var3 = class282.method2030(27674, var2);
        var3.field218 = arg1.method1731(true);
        int var4 = arg1.method1731(true);
        if (arg0 != 68) {
            method168(21, (class262) null, -6);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1731(true);
            var3.method114((byte) -114, arg1, var6);
        }
        var3.method116(true);
        return var3;
    }
}
