import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class484 {

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "Ljava/lang/String;")
    public String field6548;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public int field6547;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field6543 = 1339;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "[J")
    public static long[] field6545 = new long[100];

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "F")
    public static float field6546;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field6551;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uea", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6552;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
    public static void method2698(int arg0) {
        if (arg0 < 19) {
            field6545 = null;
        }
        field6545 = null;
    }

    @OriginalMember(owner = "client!uea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6544++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "([BBILjava/lang/String;)I")
    public static final int method2699(byte[] arg0, byte arg1, int arg2, String arg3) {
        field6551++;
        int var4 = arg3.length();
        int var5 = arg2;
        int var6 = 0;
        if (arg1 <= 102) {
            return 123;
        }
        while (var4 > var6) {
            char var7 = arg3.charAt(var6);
            if (var7 <= '\u007F') {
                arg0[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg0[var5++] = (byte) class288.method1722(var7 >> 12, 224);
                arg0[var5++] = (byte) class288.method1722(class230.method1424(var7, 4093) >> 6, 128);
                arg0[var5++] = (byte) class288.method1722(128, class230.method1424(var7, 63));
            } else {
                arg0[var5++] = (byte) class288.method1722(var7 >> 6, 192);
                arg0[var5++] = (byte) class288.method1722(128, class230.method1424(var7, 63));
            }
            var6++;
        }
        return var5 - arg2;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2700(int arg0, int arg1, short[] arg2) {
        if (arg0 != 17064) {
            field6545 = null;
        }
        field6549++;
        short[] var3 = new short[arg1];
        class657.method3637(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "()V")
    public static final void method2701() {
        for (int var0 = 0; var0 < class334.field4895; var0++) {
            if (!class453.field6183[var0]) {
                class123 var1 = class660.field9370[var0];
                class329 var2 = var1.field1591;
                int var3 = var1.field1590;
                int var4 = var2.method2110(true) - class49.field656;
                int var5 = (var4 * 2 >> class428.field5949) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2112(0) - var4 >> class428.field5949;
                int var9 = var2.method2114((byte) -120) - var4 >> class428.field5949;
                int var10 = var2.method2114((byte) -103) + var4 >> class428.field5949;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class334.field4887) {
                    var10 = class334.field4887 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field1596[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class149.field1872) {
                        var16 = class149.field1872 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class293 var19 = class609.method3354(var3, var17, var11, field6552 == null ? (field6552 = method2702("hc")) : field6552);
                        if (var19 != null && var19.field3926 != 0) {
                            if (var19.field3926 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field1596[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field1596[var6 - 1];
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
                                    short var30 = var1.field1596[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field1596[var6 + 1];
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
                class453.field6183[var0] = true;
                class397.field5666[var3].method160(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class484(String arg0, int arg1) {
        this.field6548 = arg0;
        this.field6547 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2702(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
