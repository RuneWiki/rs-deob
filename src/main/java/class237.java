import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class237 extends class196 {

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    private int field4125 = 2000;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    private int field4134 = 0;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    private int field4123 = 16;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    private int field4132 = 4096;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    private int field4131 = 0;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "[I")
    public static int[] field4124 = new int[100];

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "Ldf;")
    public static class51 field4129 = class46.method233("headicons_pk", 100);

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Ldf;")
    private static class51 field4137 = class46.method233("Take", 100);

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Ldf;")
    public static class51 field4133 = field4137;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "Llb;")
    public static class121 field4139;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)V")
    public static final void method1639(byte arg0) {
        ++field4122;
        int var1 = class242.field4196;
        int var2 = class218.field3808;
        int var3 = -var1 + class27.field397 - class95.field1578;
        int var4 = -class76.field1230 + class140.field2352 - var2;
        if (arg0 > -104) {
            field4137 = null;
        }
        if (var1 > 0 || ~var3 < -1 || var2 > 0 || ~var4 < -1) {
            try {
                Container var5;
                if (class195.field3265 != null) {
                    var5 = class195.field3265;
                } else if (class131.field2193 == null) {
                    var5 = class25.field376.field3999;
                } else {
                    var5 = class131.field2193;
                }
                int var6 = 0;
                int var7 = 0;
                if (class131.field2193 == var5) {
                    Insets var8 = class131.field2193.getInsets();
                    var7 = var8.left;
                    var6 = var8.top;
                }
                Graphics var9 = var5.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var7, var6, var1, class140.field2352);
                }
                if (var2 > 0) {
                    var9.fillRect(var7, var6, class27.field397, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(class27.field397 + var7 + -var3, var6, var3, class140.field2352);
                }
                if (var4 > 0) {
                    var9.fillRect(var7, var6 - -class140.field2352 - var4, class27.field397, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field4127;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field4132 = arg1.method876(false);
                        }
                    } else {
                        this.field4134 = arg1.method876(false);
                    }
                } else {
                    this.field4123 = arg1.method897(arg2 ^ 59);
                }
            } else {
                this.field4125 = arg1.method876(false);
            }
        } else {
            this.field4131 = arg1.method897(-96);
        }
        if (arg2 != 82) {
            this.field4134 = -64;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    public static final void method1640(int arg0) {
        ++field4130;
        if (arg0 != -26948) {
            method1640(-121);
        }
        for (class13 var1 = (class13) class27.field391.method1720(true); var1 != null; var1 = (class13) class27.field391.method1712((byte) 112)) {
            class20 var2 = var1.field196;
            if (class257.field4496 == var2.field287 && !var2.field290) {
                if (~class179.field2960 <= ~var2.field289) {
                    var2.method100(-65, class225.field3945);
                    if (var2.field290) {
                        var1.method764((byte) -79);
                    } else {
                        class78.method552(var2.field287, var2.field296, var2.field276, var2.field278, 60, var2, 0, -1L, false);
                    }
                }
            } else {
                var1.method764((byte) -48);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
    public static void method1641(int arg0) {
        if (arg0 != 18175) {
            field4139 = null;
        }
        field4139 = null;
        field4129 = null;
        field4137 = null;
        field4124 = null;
        field4133 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILdf;Llb;)I")
    public static final int method1642(int arg0, class51 arg1, class121 arg2) {
        if (arg0 != 151) {
            field4129 = null;
        }
        ++field4136;
        int var3 = arg2.field2026;
        arg2.method913(arg1.field855, (byte) 36);
        arg2.field2026 += class33.field476.method1435(arg0 + -91, arg2.field2026, arg1.field855, arg2.field2014, 0, arg1.field813);
        return -var3 + arg2.field2026;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLug;)V")
    public static final void method1643(byte arg0, class187 arg1) {
        if (arg0 != 20) {
            field4129 = null;
        }
        ++field4128;
        arg1.method1333(class55.field936, class95.field1578 / 2, class76.field1230 / 2 - 26, 16777215, -1);
        int var2 = class76.field1230 / 2 + -18;
        class59.method375(class95.field1578 / 2 - 152, var2, 304, 34, 9179409);
        class59.method375(class95.field1578 / 2 - 151, var2 + 1, 302, 32, 0);
        class59.method393(class95.field1578 / 2 - 150, var2 - -2, class198.field3298 * 3, 30, 9179409);
        class59.method393(class95.field1578 / 2 + class198.field3298 * 3 + -150, var2 + 2, -(class198.field3298 * 3) + 300, 30, 0);
        arg1.method1333(class162.field2652, class95.field1578 / 2, class76.field1230 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        class124.method930((byte) -88);
        ++field4126;
        int var2 = -50 / ((43 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field4138;
        if (arg1 != 10565) {
            method1641(22);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int var4 = this.field4132 >> 1;
            int[][] var5 = super.field3274.method1481(false);
            Random var6 = new Random((long) this.field4131);
            for (int var7 = 0; var7 < this.field4125; ++var7) {
                int var8 = ~this.field4132 < -1 ? this.field4134 - -class193.method1373(-1634280864, this.field4132, var6) - var4 : this.field4134;
                int var9 = (4088 & var8) >> 4;
                int var10 = class193.method1373(arg1 ^ -1634274523, class49.field767, var6);
                int var11 = class193.method1373(-1634280864, class234.field4079, var6);
                int var12 = (class118.field1975[var9] * this.field4123 >> 12) + var10;
                int var13 = var11 - -(class115.field1952[var9] * this.field4123 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
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
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var11 + var13;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var10;
                    int var24 = 2048 / var23;
                    int var25 = -var23 / 2;
                    int var26 = 1024 - (class193.method1373(-1634280864, 4096, var6) >> 2);
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var25 += var22;
                        int var29 = class135.field2245 & var28;
                        int var30 = var21 & class214.field3717;
                        if (~var25 < -1) {
                            var25 += -var23;
                            var21 -= -var27;
                        }
                        int var31 = var26 - -((-var10 + var28) * var24) + 1024;
                        if (!var16) {
                            var5[var29][var30] = var31;
                        } else {
                            var5[var30][var29] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
