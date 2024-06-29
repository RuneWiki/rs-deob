import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class67 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field845 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Ljg;")
    public static class186 field846 = new class186(new byte[5000]);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Le;")
    public static class312 field847;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field848;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method428(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 3)
    public static final void method425(int arg0, int arg1) {
        if (!class150.field2338) {
            arg1 = -1;
        }
        field844++;
        if (arg0 != 4) {
            field847 = null;
        }
        if (class37.field471 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class290 var2 = class302.method2030(arg1, arg0 ^ 0x630F);
            class100 var3 = var2.method1954(arg0 + 113);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class63.field822.method1902(class86.field1073, var3.method762(), arg0 ^ 0x18, var3.method754(), var3.method760(), new Point(var2.field4637, var2.field4633));
                class37.field471 = arg1;
            }
        }
        if (arg1 == -1 && class37.field471 != -1) {
            class63.field822.method1902(class86.field1073, -1, 125, (int[]) null, -1, new Point());
            class37.field471 = -1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 43)
    public static void method426(byte arg0) {
        field846 = null;
        field847 = null;
        if (arg0 != -44) {
            method425(60, -106);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 60)
    public static final void method427() {
        for (int var0 = 0; var0 < class134.field2101; var0++) {
            if (!class427.field6297[var0]) {
                class369 var1 = class27.field317[var0];
                int var2 = var1.field5600;
                int var3 = var1.field810 - 64;
                int var4 = (var3 * 2 >> 7) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field812 - var3 >> 7;
                int var8 = var1.field809 - var3 >> 7;
                int var9 = var1.field809 + var3 >> 7;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class361.field5513) {
                    var9 = class361.field5513 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field5602[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class156.field2449) {
                        var15 = class156.field2449 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class57 var18 = class12.method117(var2, var16, var10, field848 == null ? (field848 = method428("jr")) : field848);
                        if (var18 != null && var18.field712 != 0) {
                            if (var18.field712 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field5602[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field5602[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field5602[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field5602[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class427.field6297[var0] = true;
                class275.field4396[var2].method772(var1, var6);
            }
        }
    }
}
