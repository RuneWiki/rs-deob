import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class255 extends class139 {

    @OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!ns", name = "P", descriptor = "[I")
    public static int[] field3737 = new int[13];

    @OriginalMember(owner = "client!ns", name = "K", descriptor = "Ldk;")
    public static class326 field3732 = new class326(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!ns", name = "H", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ns", name = "I", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ns", name = "O", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ns", name = "Q", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ns", name = "R", descriptor = "I")
    public static int field3739;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ns", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3741;

    @OriginalMember(owner = "client!ns", name = "S", descriptor = "[I")
    public static int[] field3740;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        if (arg1 != 27782) {
            return null;
        } else {
            ++field3735;
            int[] var3 = super.field1844.method2176(arg0, 0);
            if (super.field1844.field5045) {
                class415.method2446(var3, 0, class356.field5147, this.field3731);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
    public class255(int arg0) {
        super(0, true);
        this.field3731 = 4096;
        this.field3731 = arg0;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class255() {
        this(4096);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(Z)V")
    public static void method1584(boolean arg0) {
        field3737 = null;
        field3732 = null;
        if (arg0) {
            field3740 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(Z)V")
    public static final void method1585(boolean arg0) {
        class113 var1 = (class113) class447.field6192.method2843(1123227612);
        if (!arg0) {
            method1586(90, -86);
        }
        while (var1 != null) {
            if (class330.field4786 == null) {
                var1.method1510((byte) -13);
            } else if (var1.field1431 <= class353.field5090) {
                int var2 = class339.field4951[var1.field1425];
                if (var2 != 0) {
                    if (~var2 != -2) {
                        if (var2 == 2) {
                            class304 var3 = class231.method1470(var1.field1435, var1.field1436, var1.field1434, field3741 != null ? field3741 : (field3741 = method1587("gg")));
                            if (var3 instanceof class222) {
                                class350.method2189(var1.field1435, var1.field1436, var1.field1434, field3741 != null ? field3741 : (field3741 = method1587("gg")));
                                class222 var4 = (class222) var3;
                                if (var4.field3370 != null) {
                                    class271.method1659(var4.field3370, false);
                                }
                            }
                        } else if (var2 == 3) {
                            class405 var5 = class149.method941(var1.field1435, var1.field1436, var1.field1434);
                            if (var5 instanceof class111) {
                                class411.method2431(var1.field1435, var1.field1436, var1.field1434);
                                class111 var6 = (class111) var5;
                                if (var6.field1403 != null) {
                                    class216.method1382(var1.field1435, var1.field1436, var1.field1434, var6.field1403);
                                }
                            }
                        }
                    } else {
                        class364 var7 = class271.method1658(var1.field1435, var1.field1436, var1.field1434);
                        if (var7 instanceof class320) {
                            class1.method5(var1.field1435, var1.field1436, var1.field1434);
                            class320 var8 = (class320) var7;
                            if (var8.field4641 != null) {
                                class306.method1895(var1.field1435, var1.field1436, var1.field1434, var8.field4641, (class364) null);
                            }
                        }
                    }
                } else {
                    class237 var9 = class50.method320(var1.field1435, var1.field1436, var1.field1434);
                    if (var9 instanceof class114) {
                        class467.method2750(var1.field1435, var1.field1436, var1.field1434);
                        class114 var10 = (class114) var9;
                        if (var10.field1466 != null) {
                            class451.method2629(var1.field1435, var1.field1436, var1.field1434, var10.field1466, (class237) null);
                        }
                    }
                }
                var1.method1510((byte) -13);
            } else if (~class353.field5090 == ~var1.field1428) {
                int var11 = class339.field4951[var1.field1425];
                if (~var11 == -1) {
                    class237 var12 = class50.method320(var1.field1435, var1.field1436, var1.field1434);
                    if (var12 instanceof class114) {
                        var1.method1510((byte) -13);
                    } else if (class143.method896(var1.field1435, var1.field1436, var1.field1434) != null) {
                        var1.method1510((byte) -13);
                    } else {
                        class114 var13 = new class114(var1.field1425, var1.field1444, var1.field1433, var1.field1441, var1.field1427, var12);
                        class451.method2629(var1.field1435, var1.field1436, var1.field1434, var13, (class237) null);
                    }
                } else if (~var11 == -2) {
                    class364 var21 = class271.method1658(var1.field1435, var1.field1436, var1.field1434);
                    if (var21 instanceof class320) {
                        var1.method1510((byte) -13);
                    } else if (class307.method1899(var1.field1435, var1.field1436, var1.field1434) != null) {
                        var1.method1510((byte) -13);
                    } else {
                        class320 var22 = new class320(var1.field1425, var1.field1444, var1.field1433, var1.field1441, var1.field1427, var21);
                        class306.method1895(var1.field1435, var1.field1436, var1.field1434, var22, (class364) null);
                    }
                } else if (var11 == 2) {
                    class304 var14 = class231.method1470(var1.field1435, var1.field1436, var1.field1434, field3741 != null ? field3741 : (field3741 = method1587("gg")));
                    if (var14 instanceof class222) {
                        var1.method1510((byte) -13);
                    } else {
                        class350.method2189(var1.field1435, var1.field1436, var1.field1434, field3741 != null ? field3741 : (field3741 = method1587("gg")));
                        class453 var15 = class156.field2325.method808(var1.field1442, 0);
                        int var16;
                        int var17;
                        if (~var1.field1444 != -2 && ~var1.field1444 != -4) {
                            var16 = var15.field6385;
                            var17 = var15.field6325;
                        } else {
                            var17 = var15.field6385;
                            var16 = var15.field6325;
                        }
                        class222 var18 = new class222(var1.field1425, var1.field1444, var1.field1435, var1.field1433, var1.field1441, var1.field1427, var1.field1436, var1.field1436 - -var17 + -1, var1.field1434, var16 + -1 + var1.field1434, var14);
                        class271.method1659(var18, false);
                    }
                } else if (var11 == 3) {
                    class405 var19 = class149.method941(var1.field1435, var1.field1436, var1.field1434);
                    if (var19 instanceof class111) {
                        var1.method1510((byte) -13);
                    } else {
                        class111 var20 = new class111(var1.field1433, var1.field1441, var1.field1427, var19);
                        class216.method1382(var1.field1435, var1.field1436, var1.field1434, var20);
                    }
                }
            }
            var1 = (class113) class447.field6192.method2842(1673506446);
        }
        ++field3733;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field3736;
        if (~arg2 == -1) {
            this.field3731 = (arg0.method1701(-23121) << 12) / 255;
        }
        if (arg1 != -45) {
            field3739 = 82;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)V")
    public static final void method1586(int arg0, int arg1) {
        if (arg0 <= 21) {
            method1585(true);
        }
        class210.field3193 = 1000 / arg1;
        ++field3734;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1587(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
