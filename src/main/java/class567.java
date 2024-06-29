import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class567 extends class66 {

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public volatile int field8137 = -1;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field8135;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Lhga;")
    public static class158 field8136 = new class158(82, 12);

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "[I")
    public static int[] field8138 = new int[16384];

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "[I")
    public static int[] field8139 = new int[16384];

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Lvg;")
    public static class49 field8140;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "Lpba;")
    public static class304 field8141;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ji", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field8142;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3358(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8139[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field8138[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field8140 = new class49(260);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V", line = 6)
    public static final void method3356() {
        for (int var0 = 0; var0 < class343.field5536; var0++) {
            if (!class251.field4009[var0]) {
                class263 var1 = class529.field7714[var0];
                class674 var2 = var1.field4300;
                int var3 = var1.field4302;
                int var4 = var2.method3860((byte) -125) - class459.field6867;
                int var5 = (var4 * 2 >> class439.field6699) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3857((byte) -35) - var4 >> class439.field6699;
                int var9 = var2.method3859((byte) 117) - var4 >> class439.field6699;
                int var10 = var2.method3859((byte) 117) + var4 >> class439.field6699;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class541.field7896) {
                    var10 = class541.field7896 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4294[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class43.field597) {
                        var16 = class43.field597 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class459 var19 = class618.method3589(var3, var17, var11, field8142 == null ? (field8142 = method3358("iaa")) : field8142);
                        if (var19 != null && var19.field6874 != 0) {
                            if (var19.field6874 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4294[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4294[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4294[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4294[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class251.field4009[var0] = true;
                class587.field8346[var3].method487(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 181)
    public static void method3357(int arg0) {
        field8138 = null;
        field8141 = null;
        field8140 = null;
        if (arg0 <= 55) {
            method3356();
        }
        field8136 = null;
        field8139 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 202)
    public class567(String arg0) {
        this.field8135 = arg0;
    }
}
