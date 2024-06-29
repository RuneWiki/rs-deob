import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class49 extends class264 {

    @OriginalMember(owner = "client!kc", name = "lb", descriptor = "I")
    private int field765 = 4096;

    @OriginalMember(owner = "client!kc", name = "kb", descriptor = "I")
    private int field764 = 409;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "I")
    private int field761 = 4096;

    @OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
    private int field772 = 4096;

    @OriginalMember(owner = "client!kc", name = "ub", descriptor = "[I")
    private int[] field774 = new int[3];

    @OriginalMember(owner = "client!kc", name = "nb", descriptor = "Lma;")
    public static class5 field767 = class12.method119(":allyreq:", (byte) 97);

    @OriginalMember(owner = "client!kc", name = "rb", descriptor = "[I")
    public static int[] field771 = new int[200];

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!kc", name = "ob", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!kc", name = "qb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!kc", name = "mb", descriptor = "Lq;")
    public static class169 field766;

    @OriginalMember(owner = "client!kc", name = "pb", descriptor = "[Lla;")
    public static class178[] field769;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIII)V", line = 12)
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field760++;
        if (arg0 < 104) {
            return;
        }
        if (arg3 - arg2 >= class57.field899 && (arg2 + arg3) <= class301.field5073 && class294.field4956 <= (arg4 - arg2) && class101.field1505 >= (arg2 + arg4)) {
            class194.method1273(arg1, arg2, arg6, arg3, arg5, arg4, -74);
        } else {
            class50.method366(arg4, arg1, arg6, -13589, arg3, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V", line = 32)
    public static final void method363(byte arg0) {
        field770++;
        int var1 = class200.field3184.method1387(true, 8);
        if (var1 < class175.field2675) {
            for (int var2 = var1; var2 < class175.field2675; var2++) {
                class249.field4128[class168.field2554++] = class118.field1785[var2];
            }
        }
        if (class175.field2675 < var1) {
            throw new RuntimeException("gppov1");
        }
        class175.field2675 = 0;
        int var3 = 0;
        int var4 = 93 % ((35 - arg0) / 44);
        while (var1 > var3) {
            int var5 = class118.field1785[var3];
            class91 var6 = class267.field4593[var5];
            int var7 = class200.field3184.method1387(true, 1);
            if (var7 == 0) {
                class118.field1785[class175.field2675++] = var5;
                var6.field217 = class50.field784;
            } else {
                int var8 = class200.field3184.method1387(true, 2);
                if (var8 == 0) {
                    class118.field1785[class175.field2675++] = var5;
                    var6.field217 = class50.field784;
                    class156.field2320[class287.field4838++] = var5;
                } else if (var8 == 1) {
                    class118.field1785[class175.field2675++] = var5;
                    var6.field217 = class50.field784;
                    int var12 = class200.field3184.method1387(true, 3);
                    var6.method120(-1, false, var12);
                    int var13 = class200.field3184.method1387(true, 1);
                    if (var13 == 1) {
                        class156.field2320[class287.field4838++] = var5;
                    }
                } else if (var8 == 2) {
                    class118.field1785[class175.field2675++] = var5;
                    var6.field217 = class50.field784;
                    int var9 = class200.field3184.method1387(true, 3);
                    var6.method120(-1, true, var9);
                    int var10 = class200.field3184.method1387(true, 3);
                    var6.method120(-1, true, var10);
                    int var11 = class200.field3184.method1387(true, 1);
                    if (var11 == 1) {
                        class156.field2320[class287.field4838++] = var5;
                    }
                } else if (var8 == 3) {
                    class249.field4128[class168.field2554++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 138)
    public class49() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)[[I", line = 142)
    public final int[][] method138(byte arg0, int arg1) {
        field759++;
        int var3 = 88 % ((arg0 + 43) / 55);
        int[][] var4 = this.field4524.method1462(-15077, arg1);
        if (this.field4524.field3506) {
            int[][] var5 = this.method1817(-123, 0, arg1);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var4[0];
            for (int var12 = 0; var12 < class226.field3716; var12++) {
                int var13 = var6[var12];
                int var14 = var13 - this.field774[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 <= this.field764) {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field774[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (var16 > this.field764) {
                        var11[var12] = var13;
                        var9[var12] = var15;
                        var10[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = var17 - this.field774[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (this.field764 < var18) {
                            var11[var12] = var13;
                            var9[var12] = var15;
                            var10[var12] = var17;
                        } else {
                            var11[var12] = this.field761 * var13 >> 12;
                            var9[var12] = this.field765 * var15 >> 12;
                            var10[var12] = this.field772 * var17 >> 12;
                        }
                    }
                } else {
                    var11[var12] = var13;
                    var9[var12] = var7[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILii;)V", line = 250)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 >= -27) {
            field766 = (class169) null;
        }
        if (arg0 == 0) {
            this.field764 = arg2.method1524((byte) 110);
        } else if (arg0 == 1) {
            this.field772 = arg2.method1524((byte) 39);
        } else if (arg0 == 2) {
            this.field765 = arg2.method1524((byte) 37);
        } else if (arg0 == 3) {
            this.field761 = arg2.method1524((byte) 44);
        } else if (arg0 == 4) {
            int var5 = arg2.method1497(3610);
            this.field774[1] = class204.method1354(65280, var5) >> 4;
            this.field774[2] = class204.method1354(var5, 255) >> 12;
            this.field774[0] = class204.method1354(267386880, var5 << 4);
        }
        field768++;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(III)Lwf;", line = 313)
    public static final class51 method364(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class51 var4 = var3.field3158;
            var3.field3158 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V", line = 334)
    public static void method365(byte arg0) {
        field767 = null;
        field769 = null;
        field771 = null;
        field766 = null;
        if (arg0 < 70) {
            field773 = -75;
        }
    }
}
