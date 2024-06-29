import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class103 {

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field1397;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oda", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1398;

    // $FF: synthetic method
    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method794(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLpj;)V", line = 3)
    public static final void method790(byte arg0, class132 arg1) {
        class319.field4734 = arg1;
        if (arg0 < 97) {
            field1392 = 107;
        }
        field1395++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZIILpj;IZ)V", line = 19)
    public static final void method791(boolean arg0, int arg1, int arg2, class132 arg3, int arg4, boolean arg5) {
        class222.field3213 = arg0;
        class7.field68 = arg3;
        class457.field6471 = arg4;
        field1397++;
        class599.field8326 = 10000;
        class268.field3802 = 1;
        class674.field9486 = arg1;
        class630.field8791 = arg2;
        if (arg5) {
            method793();
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 41)
    public static final String method792(int arg0, int arg1, int arg2, String[] arg3) {
        field1393++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg2 > -1) {
                field1392 = 63;
            }
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "()V", line = 105)
    public static final void method793() {
        for (int var0 = 0; var0 < class68.field935; var0++) {
            if (!class250.field3526[var0]) {
                class517 var1 = class324.field4793[var0];
                class154 var2 = var1.field7053;
                int var3 = var1.field7057;
                int var4 = var2.method1072(2) - class634.field8905;
                int var5 = (var4 * 2 >> class627.field8753) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1079(-868177151) - var4 >> class627.field8753;
                int var9 = var2.method1074(0) - var4 >> class627.field8753;
                int var10 = var2.method1074(0) + var4 >> class627.field8753;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class22.field308) {
                    var10 = class22.field308 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field7063[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class137.field1931) {
                        var16 = class137.field1931 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class39 var19 = class410.method2344(var3, var17, var11, field1398 == null ? (field1398 = method794("bt")) : field1398);
                        if (var19 != null && var19.field510 != 0) {
                            if (var19.field510 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7063[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7063[var6 - 1];
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
                                    short var30 = var1.field7063[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7063[var6 + 1];
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
                class250.field3526[var0] = true;
                class144.field2149[var3].method282(var2, var7);
            }
        }
    }
}
