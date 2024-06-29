import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class274 {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4060 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!il", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4057++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static final void method1869(byte arg0) {
        field4061++;
        if (class10.field129 != null) {
            return;
        }
        class10.field129 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        if (arg0 != -21) {
            field4060 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var9 = var8;
                    var10 = var18;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var9 = var16;
                    var10 = var17;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var11 = var17;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class10.field129[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V")
    public static void method1870(byte arg0) {
        field4060 = null;
        if (arg0 != -21) {
            field4060 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1871(int arg0) {
        field4059++;
        for (int var1 = 0; var1 < class32.field447; var1++) {
            int var10002 = class146.field1979[var1]--;
            if (class146.field1979[var1] >= -10) {
                class360 var3 = class411.field5901[var1];
                if (var3 == null) {
                    var3 = class360.method2290(class288.field4221, class78.field985[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class146.field1979[var1] += var3.method2287();
                    class411.field5901[var1] = var3;
                }
                if (class146.field1979[var1] < 0) {
                    int var4;
                    if (class226.field3389[var1] == 0) {
                        var4 = class301.field4391[var1] * class372.field5437 >> 8;
                    } else {
                        int var5 = class226.field3389[var1] >> 24 & 0x3;
                        if (class187.field2619.field4960 == var5) {
                            int var6 = (class226.field3389[var1] & 0xFF) * 128;
                            int var7 = (class226.field3389[var1] & 0xFF47ED) >> 16;
                            int var8 = var7 * 128 + 64 - class187.field2619.field4954;
                            if (var8 < 0) {
                                var8 = -var8;
                            }
                            int var9 = class226.field3389[var1] >> 8 & 0xFF;
                            int var10 = var9 * 128 + 64 - class187.field2619.field4951;
                            if (var10 < 0) {
                                var10 = -var10;
                            }
                            int var11 = var8 + var10 - 128;
                            if (var11 > var6) {
                                class146.field1979[var1] = -100;
                                continue;
                            }
                            if (var11 < 0) {
                                var11 = 0;
                            }
                            var4 = (var6 - var11) * class301.field4391[var1] * class178.field2539 / var6 >> 8;
                        } else {
                            var4 = 0;
                        }
                    }
                    if (var4 > 0) {
                        class179 var12 = var3.method2288().method1246(class189.field2637);
                        class190 var13 = class190.method1329(var12, 100, var4);
                        var13.method1333(class265.field3933[var1] - 1);
                        class452.field6671.method276(var13);
                    }
                    class146.field1979[var1] = -100;
                }
            } else {
                class32.field447--;
                for (int var2 = var1; var2 < class32.field447; var2++) {
                    class78.field985[var2] = class78.field985[var2 + 1];
                    class411.field5901[var2] = class411.field5901[var2 + 1];
                    class265.field3933[var2] = class265.field3933[var2 + 1];
                    class146.field1979[var2] = class146.field1979[var2 + 1];
                    class226.field3389[var2] = class226.field3389[var2 + 1];
                    class301.field4391[var2] = class301.field4391[var2 + 1];
                }
                var1--;
            }
        }
        if (class29.field408 && !class236.method1593((byte) 81)) {
            if (class450.field6629 != 0 && class343.field5048 != -1) {
                class339.method2190(0, arg0 ^ 0x92A32F08, false, class450.field6629, class454.field6706, class343.field5048);
            }
            class29.field408 = false;
        } else if (class450.field6629 != 0 && class343.field5048 != -1 && !class236.method1593((byte) 76)) {
            class257.method1773((byte) -10, class454.field6697);
            class393.field5715++;
            class159.field2132.method1721(25153, class343.field5048);
            class343.field5048 = -1;
        }
        if (arg0 != -1834799352) {
            field4060 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(II)V")
    public class274(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1872(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field4060 = null;
        }
        field4058++;
        return (class131.field1790[1][arg2][arg1] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
    public static final void method1873(byte arg0) {
        field4056++;
        class57.field702++;
        class257.method1773((byte) -10, class148.field2013);
        class159.field2132.method1750((byte) 0, class458.field6776);
        if (arg0 < 55) {
            field4060 = null;
        }
    }
}
