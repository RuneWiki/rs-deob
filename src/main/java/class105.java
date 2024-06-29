import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class105 extends class118 {

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    private int field1406 = 585;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field1410 = 3;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "Lpf;")
    public static class425 field1404 = new class425(57, 7);

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)Z")
    public static final boolean method656(boolean arg0) {
        for (int var1 = class382.field5579; var1 < class56.field750; ++var1) {
            class13[][] var2 = class277.field4216[var1];
            for (int var3 = -class246.field3690; var3 <= 0; ++var3) {
                int var4 = class319.field4825 + var3;
                int var5 = class319.field4825 - var3;
                if (var4 >= class452.field6686 || var5 < class44.field553) {
                    for (int var6 = -class246.field3690; var6 <= 0; ++var6) {
                        int var7 = class426.field6265 + var6;
                        int var8 = class426.field6265 - var6;
                        if (var4 >= class452.field6686) {
                            if (var7 >= class337.field5008) {
                                class13 var9 = var2[var4][var7];
                                if (var9 != null && var9.field162) {
                                    class302.field4565 = arg0;
                                    class426.field6271.method1465(var9, 5);
                                    class426.field6271.method1475(true);
                                }
                            }
                            if (var8 < class196.field2958) {
                                class13 var10 = var2[var4][var8];
                                if (var10 != null && var10.field162) {
                                    class302.field4565 = arg0;
                                    class426.field6271.method1465(var10, 5);
                                    class426.field6271.method1475(true);
                                }
                            }
                        }
                        if (var5 < class44.field553) {
                            if (var7 >= class337.field5008) {
                                class13 var11 = var2[var5][var7];
                                if (var11 != null && var11.field162) {
                                    class302.field4565 = arg0;
                                    class426.field6271.method1465(var11, 5);
                                    class426.field6271.method1475(true);
                                }
                            }
                            if (var8 < class196.field2958) {
                                class13 var12 = var2[var5][var8];
                                if (var12 != null && var12.field162) {
                                    class302.field4565 = arg0;
                                    class426.field6271.method1465(var12, 5);
                                    class426.field6271.method1475(true);
                                }
                            }
                        }
                        if (class165.field2299 == 0) {
                            if (class385.field5626) {
                                class426.field6271.method1469(24, (byte) 14);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field1407;
            int[] var3 = super.field1537.method2395(30963, arg1);
            if (super.field1537.field5756) {
                int var4 = class160.field2210[arg1];
                for (int var5 = 0; ~class440.field6474 < ~var5; ++var5) {
                    int var6 = class6.field73[var5];
                    if (this.field1406 < var6 && 4096 - this.field1406 > var6 && -this.field1406 + 2048 < var4 && ~var4 > ~(this.field1406 + 2048)) {
                        int var7 = 2048 - var6;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field1406);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > -this.field1406 + 2048 && ~(this.field1406 + 2048) < ~var6) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field1406;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field1406 + 2048);
                    } else if (~this.field1406 >= ~var4 && -this.field1406 + 4096 >= var4) {
                        if (~var6 <= ~this.field1406 && ~(-this.field1406 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = 2048 - var4;
                            int var16 = var15 >= 0 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field1406 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field1406;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field1406 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
    public static void method657(int arg0) {
        if (arg0 >= -62) {
            method656(true);
        }
        field1404 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 == 1) {
            if (~arg0 == -1) {
                this.field1406 = arg2.method2323(-74);
            }
            ++field1408;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method658(String arg0, int arg1, int arg2) {
        ++field1405;
        class32 var3 = class136.method854(2, (byte) 93, arg2);
        var3.method194(false);
        var3.field408 = arg0;
        if (arg1 > -26) {
            field1404 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
    public static final void method659(int arg0) {
        class375.method2250();
        ++field1409;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class449.field6599[var1].method2257(9116);
        }
        class314.method1922(0);
        if (arg0 >= 30) {
            class196.method1170(89);
            System.gc();
        }
    }
}
