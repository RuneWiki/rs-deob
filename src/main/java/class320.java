import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class320 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Lug;")
    private class395 field4059;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "J")
    public long field4058;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field4062 = -2;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Ldq;")
    public static class493 field4061 = new class493(104, 12);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field4064;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field4066;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[Ll;")
    public static class16[] field4065;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
    public static final void method1882() {
        for (int var0 = 0; var0 < class180.field2382; var0++) {
            if (!class119.field1615[var0]) {
                class177 var1 = class187.field2441[var0];
                class256 var2 = var1.field2337;
                int var3 = var1.field2343;
                int var4 = var2.method1534((byte) 25) - class59.field772;
                int var5 = (var4 * 2 >> class94.field1144) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1539((byte) 86) - var4 >> class94.field1144;
                int var9 = var2.method1537(-409134460) - var4 >> class94.field1144;
                int var10 = var2.method1537(-409134460) + var4 >> class94.field1144;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class105.field1336) {
                    var10 = class105.field1336 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field2345[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class470.field6825) {
                        var16 = class470.field6825 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class205 var19 = class212.method1314(var3, var17, var11, field4066 == null ? (field4066 = method1885("vn")) : field4066);
                        if (var19 != null && var19.field2668 != 0) {
                            if (var19.field2668 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2345[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2345[var6 - 1];
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
                                    short var30 = var1.field2345[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2345[var6 + 1];
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
                class119.field1615[var0] = true;
                class520.field7520[var3].method385(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method1883(int arg0) {
        int var1 = 121 / ((-arg0 - 32) / 34);
        field4061 = null;
        field4065 = null;
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4057++;
        this.field4059.method2320(this.field4058, (byte) -61);
        super.finalize();
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lug;JI)V")
    public class320(class395 arg0, long arg1, int arg2) {
        this.field4059 = arg0;
        this.field4058 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
    public static final void method1884(byte arg0, int arg1) {
        if (class36.field485 == null || arg1 > class36.field485.length) {
            class36.field485 = new int[arg1];
        }
        field4060++;
        if (arg0 != 98) {
            field4063 = -113;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1885(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
