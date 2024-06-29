import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class514 implements class159 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field7607 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[I")
    public static int[] field7606 = new int[14];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field7610;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7611;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3072(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lkl;ZJ[I)Ljava/lang/String;", line = 5)
    public final String method1052(class55 arg0, boolean arg1, long arg2, int[] arg3) {
        field7610++;
        if (arg1) {
            field7606 = null;
        }
        if (class372.field5457 == arg0) {
            class223 var6 = class231.field3269.method1165(arg3[0], 27894);
            return var6.method1387(17489, (int) arg2);
        } else if (class303.field4153 == arg0 || class413.field6027 == arg0) {
            class508 var7 = class328.field4480.method3091(65, (int) arg2);
            return var7.field7506;
        } else if (class252.field3488 == arg0 || class24.field318 == arg0 || class525.field7764 == arg0) {
            return class231.field3269.method1165(arg3[0], 27894).method1387(17489, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 43)
    public static void method3070(boolean arg0) {
        field7606 = null;
        if (arg0) {
            method3070(false);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 62)
    public static final void method3071() {
        for (int var0 = 0; var0 < class510.field7569; var0++) {
            if (!class37.field466[var0]) {
                class525 var1 = class94.field1451[var0];
                class153 var2 = var1.field7770;
                int var3 = var1.field7772;
                int var4 = var2.method1029((byte) -120) - class131.field1925;
                int var5 = (var4 * 2 >> class523.field7736) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1026(true) - var4 >> class523.field7736;
                int var9 = var2.method1027(-601) - var4 >> class523.field7736;
                int var10 = var2.method1027(-601) + var4 >> class523.field7736;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class371.field5427) {
                    var10 = class371.field5427 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field7767[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class206.field2881) {
                        var16 = class206.field2881 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class116 var19 = class38.method295(var3, var17, var11, field7611 == null ? (field7611 = method3072("gg")) : field7611);
                        if (var19 != null && var19.field1733 != 0) {
                            if (var19.field1733 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7767[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7767[var6 - 1];
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
                                    short var30 = var1.field7767[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7767[var6 + 1];
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
                class37.field466[var0] = true;
                class211.field2950[var3].method364(var2, var7);
            }
        }
    }
}
