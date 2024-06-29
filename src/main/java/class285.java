import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class285 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Luf;")
    public static class168 field4827 = class148.method1019(-1720, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Luf;")
    private static class168 field4826 = class148.method1019(-1720, "Drop");

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Luf;")
    public static class168 field4829 = field4826;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lej;")
    public static class204 field4821 = new class204(50);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public static boolean field4825;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1966(boolean arg0) {
        if (arg0) {
            class227.field3686 = class118.field1835;
            class92.field1424 = class79.field1130;
            class216.field3514 = class156.field2471;
        } else {
            class227.field3686 = class172.field2804;
            class92.field1424 = class273.field4594;
            class216.field3514 = class46.field562;
        }
        class300.field5087 = class92.field1424.length;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILtb;I)V", line = 25)
    public static final void method1968(int arg0, class189 arg1, int arg2) {
        if (arg1.field3036 > class203.field3335) {
            class130.method911(arg0 ^ 0x2E80, arg1);
        } else if (arg1.field2990 >= class203.field3335) {
            class148.method1017((byte) 119, arg1);
        } else {
            class156.method1107(112, arg1);
        }
        field4830++;
        if (arg1.field3027 < 128 || arg1.field3021 < 128 || arg1.field3027 >= 13184 || arg1.field3021 >= 13184) {
            arg1.field3021 = arg1.field3033[0] * 128 + arg1.field3012 * 64;
            arg1.field2990 = 0;
            arg1.field3026 = -1;
            arg1.field3036 = 0;
            arg1.field3044 = -1;
            arg1.field3027 = arg1.field3020[0] * 128 + arg1.field3012 * 64;
            arg1.method1332(-23860);
        }
        if (class266.field4489 == arg1 && (arg1.field3027 < 1536 || arg1.field3021 < 1536 || arg1.field3027 >= 11776 || arg1.field3021 >= 11776)) {
            arg1.field3027 = arg1.field3020[0] * 128 + arg1.field3012 * 64;
            arg1.field3044 = -1;
            arg1.field3026 = -1;
            arg1.field3036 = 0;
            arg1.field3021 = arg1.field3033[0] * 128 + arg1.field3012 * 64;
            arg1.field2990 = 0;
            arg1.method1332(-23860);
        }
        class221.method1525(-1, arg1);
        class266.method1852((byte) 126, arg1);
        if (arg0 != 11776) {
            field4829 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 92)
    protected class285() {
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BZIIIIB[Lcg;)V", line = 103)
    public static final void method1970(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class253[] arg7) {
        field4822++;
        byte var8;
        if (arg1) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = -52 % ((28 - arg6) / 41);
        if (!arg1) {
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (arg3 + var11 > 0 && (arg3 + var11) < 103 && (arg2 + var12) > 0 && (arg2 + var12) < 103) {
                            arg7[var10].field4317[arg3 + var11][arg2 + var12] = class159.method1119(arg7[var10].field4317[arg3 + var11][arg2 + var12], -16777217);
                        }
                    }
                }
            }
        }
        class153 var13 = new class153(arg0);
        for (int var14 = 0; var14 < var8; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    class19.method89(arg2 + var16, arg1, 0, arg3 + var15, var14, arg5, arg4, -65536, var13);
                }
            }
        }
        if (arg1) {
            return;
        }
        class148 var17 = null;
        label113: while (true) {
            int var19;
            label106: do {
                while (var13.field2367 < var13.field2359.length) {
                    int var18 = var13.method1042((byte) 104);
                    if (var18 != 0) {
                        if (var18 != 1) {
                            throw new IllegalStateException();
                        }
                        var19 = var13.method1042((byte) 117);
                        continue label106;
                    }
                    var17 = new class148(var13);
                }
                if (var17 == null) {
                    var17 = new class148();
                }
                for (int var24 = 0; var24 < 8; var24++) {
                    for (int var25 = 0; var25 < 8; var25++) {
                        int var26 = (arg3 >> 3) + var24;
                        int var27 = (arg2 >> 3) + var25;
                        if (var26 >= 0 && var26 < 13 && var27 >= 0 && var27 < 13) {
                            class271.field4559[var26][var27] = var17;
                        }
                    }
                }
                break label113;
            } while (var19 <= 0);
            for (int var20 = 0; var20 < var19; var20++) {
                class291 var21 = new class291(var13);
                var21.field4905 += arg3 << 7;
                int var22 = var21.field4905 >> 7;
                var21.field4909 += arg2 << 7;
                int var23 = var21.field4909 >> 7;
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    var21.field4902 = class227.field3686[var21.field4889][var22][var23] - var21.field4902;
                    class257.method1757(var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z", line = 260)
    public static final boolean method1971(byte arg0) {
        if (arg0 <= 13) {
            method1971((byte) 33);
        }
        field4824++;
        return class83.field1261 == 0 ? class92.field1414.method526(1) : true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 283)
    public static void method1972(int arg0) {
        field4827 = null;
        int var1 = 65 / ((61 - arg0) / 39);
        field4829 = null;
        field4826 = null;
        field4821 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public abstract void method1967(boolean arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public abstract void method1969(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5);
}
