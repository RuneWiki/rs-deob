import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Z")
    private boolean field37;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
    private boolean field39;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field38 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    public static final void method17(boolean arg0) {
        class755.field10539 = -1;
        if (arg0) {
            method18(-33, -20);
        }
        class33.field547 = 0;
        class26.field474 = -1;
        field34++;
        class366.field4727 = -1;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
    public static final void method18(int arg0, int arg1) {
        class185 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class282 var4 = class707.field9826[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class463.field6223; var5++) {
                    for (int var6 = 0; var6 < class289.field3784; var6++) {
                        var2 = var4.method1672(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class480.field6531;
                            int var8 = var5 << class480.field6531;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class282 var10 = class707.field9826[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1677(var5, (byte) 68, var6) - var10.method1677(var5, (byte) 18, var6);
                                    int var12 = var4.method1677(var5, (byte) 97, var6 + 1) - var10.method1677(var5, (byte) 7, var6 + 1);
                                    int var13 = var4.method1677(var5 + 1, (byte) 59, var6 + 1) - var10.method1677(var5 + 1, (byte) 56, var6 + 1);
                                    int var14 = var4.method1677(var5 + 1, (byte) 53, var6) - var10.method1677(var5 + 1, (byte) 21, var6);
                                    var10.method1684(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
    public final boolean method19(int arg0) {
        if (arg0 != -1) {
            this.field41 = -54;
        }
        field35++;
        return this.field37;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
    public static final void method20(boolean arg0, int arg1, String arg2, String arg3) {
        class721.field10041 = arg2;
        class310.field4085 = arg3;
        class744.field10374 = arg0;
        field44++;
        if (!class744.field10374 && class310.field4085.equals("") || class721.field10041.equals("")) {
            class526.method3044(-1, 3);
            return;
        }
        if (class468.field6275 != 1) {
            class81.field1110 = 0;
            class3.field27 = -1;
        }
        class459.field6127 = false;
        class526.method3044(-1, -3);
        class391.field4978 = arg1;
        class69.field973 = 0;
        class109.field1574 = 0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
    public static final void method21(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class501.method2938(var3.field277);
        class501.method2938(var3.field290);
        if (var3.field277 != null) {
            var3.field277 = null;
        }
        if (var3.field290 != null) {
            var3.field290 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
    public final int method22(byte arg0) {
        if (arg0 <= 115) {
            return -123;
        } else {
            field36++;
            return this.field43;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
    public final boolean method23(int arg0) {
        field45++;
        if (arg0 != 32) {
            method17(false);
        }
        return this.field39;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BII)Z")
    public static final boolean method24(byte arg0, int arg1, int arg2) {
        if (arg0 < 5) {
            return false;
        } else {
            field40++;
            return (arg2 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
    public final int method25(int arg0) {
        if (arg0 != 1) {
            this.method23(-4);
        }
        field42++;
        return this.field41;
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ZIIZ)V")
    public class4(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field41 = arg2;
        this.field43 = arg1;
        this.field37 = arg0;
        this.field39 = arg3;
    }
}
