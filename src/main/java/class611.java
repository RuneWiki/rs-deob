import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class611 {

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Z")
    public boolean field8633;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public int field8632;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public int field8634;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "S")
    public short field8626;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field8625;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "S")
    public short field8624;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "B")
    public byte field8629;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field8631;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "S")
    public short field8628;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field8630 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lcb;")
    public static class544 field8623;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field8636;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Z")
    public static boolean field8622;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V")
    public static final void method3521() {
        for (int var0 = 0; var0 < class540.field7582; var0++) {
            if (!class431.field6149[var0]) {
                class698 var1 = class238.field3437[var0];
                class578 var2 = var1.field9855;
                int var3 = var1.field9869;
                int var4 = var2.method3360(-31770) - class503.field7200;
                int var5 = (var4 * 2 >> class310.field4616) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3358((byte) 22) - var4 >> class310.field4616;
                int var9 = var2.method3363(-1) - var4 >> class310.field4616;
                int var10 = var2.method3363(-1) + var4 >> class310.field4616;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class12.field249) {
                    var10 = class12.field249 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field9867[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class151.field2074) {
                        var16 = class151.field2074 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class778 var19 = class195.method1415(var3, var17, var11, field8636 == null ? (field8636 = method3523("wga")) : field8636);
                        if (var19 != null && var19.field10737 != 0) {
                            if (var19.field10737 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field9867[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field9867[var6 - 1];
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
                                    short var30 = var1.field9867[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field9867[var6 + 1];
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
                class431.field6149[var0] = true;
                class622.field8777[var3].method1248(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public static void method3522(boolean arg0) {
        if (!arg0) {
            field8623 = null;
        }
        field8623 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8633 = arg10;
        this.field8632 = arg2;
        this.field8634 = arg1;
        this.field8626 = (short) arg5;
        this.field8625 = arg3;
        this.field8624 = (short) arg6;
        this.field8629 = (byte) arg8;
        this.field8631 = arg11;
        this.field8628 = (short) arg4;
        this.field8635 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3523(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
