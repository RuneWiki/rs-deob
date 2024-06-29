import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class727 extends class230 {

    @OriginalMember(owner = "client!bq", name = "P", descriptor = "S")
    public short field10059;

    @OriginalMember(owner = "client!bq", name = "Q", descriptor = "I")
    public static int field10060 = 0;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "Lqk;")
    public static class1 field10053 = new class1(16, 0);

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field10058;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bq", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field10061;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4047(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;IILjava/lang/String;)V", line = 6)
    public static final void method4042(String arg0, String arg1, byte arg2, String arg3, int arg4, int arg5, String arg6) {
        ++field10057;
        int var7 = -110 / ((arg2 - -3) / 44);
        class99.method706(arg3, arg1, -1, arg0, arg6, (byte) -10, arg4, (String) null, arg5);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 17)
    public static final int method4043(String arg0, byte arg1) {
        ++field10055;
        int var2 = arg0.length();
        int var3 = 108 / ((arg1 - -20) / 45);
        int var4 = 0;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var4 = -var4 + ((var4 << 5) - -arg0.charAt(var5));
        }
        return var4;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)Z", line = 38)
    public static final boolean method4044(int arg0, byte arg1, int arg2) {
        ++field10056;
        if (arg1 < 98) {
            method4046(84);
        }
        return class329.method2072(arg2, arg0, (byte) 25) | ~(2048 & arg2) != -1 || class171.method1100(arg2, 353, arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "()V", line = 52)
    public static final void method4045() {
        for (int var0 = 0; var0 < class392.field5587; ++var0) {
            if (!class419.field5837[var0]) {
                class555 var1 = class205.field2880[var0];
                class251 var2 = var1.field7687;
                int var3 = var1.field7696;
                int var4 = var2.method1685(-82) - class760.field10442;
                int var5 = (var4 * 2 >> class732.field10110) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1683(10918) - var4 >> class732.field10110;
                int var9 = var2.method1686(false) - var4 >> class732.field10110;
                int var10 = var2.method1686(false) + var4 >> class732.field10110;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class704.field9799) {
                    var10 = class704.field9799 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field7695[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class414.field5796) {
                        var16 = class414.field5796 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class253 var19 = class485.method2882(var3, var17, var11, field10061 != null ? field10061 : (field10061 = method4047("aaa")));
                        if (var19 != null && var19.field3759 != 0) {
                            if (var19.field3759 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field7695[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field7695[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
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
                                    short var30 = var1.field7695[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field7695[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
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
                    ++var6;
                }
                class419.field5837[var0] = true;
                class661.field9303[var3].method1362(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)V", line = 225)
    public static void method4046(int arg0) {
        if (arg0 != 0) {
            method4044(34, (byte) -33, 87);
        }
        field10053 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lha;B)Z", line = 236)
    public final boolean method1525(class473 arg0, byte arg1) {
        ++field10052;
        if (arg1 != -127) {
            field10060 = 63;
        }
        return class322.method2044(super.field3470 >> class732.field10110, super.field3460 >> class732.field10110, super.field3469, 1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Lsca;)I", line = 248)
    public final int method1526(boolean arg0, class251[] arg1) {
        if (arg0) {
            field10060 = 39;
        }
        ++field10058;
        return this.method1527((byte) -32, arg1, super.field3460 >> class732.field10110, super.field3470 >> class732.field10110);
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)Z", line = 259)
    public final boolean method1534(int arg0) {
        if (arg0 != 382) {
            field10053 = null;
        }
        ++field10054;
        return class592.field8338[(super.field3470 >> class732.field10110) + -class591.field8336 + class270.field3904][(super.field3460 >> class732.field10110) - class112.field1363 + class270.field3904];
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIIII)V", line = 272)
    public class727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3464 = arg1;
        super.field3470 = arg0;
        super.field3469 = (byte) arg4;
        super.field3460 = arg2;
        this.field10059 = (short) arg5;
        super.field3467 = (byte) arg3;
    }
}
