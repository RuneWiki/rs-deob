import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class247 extends class1 {

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "[Ldl;")
    public class125[] field3695;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
    public static int field3689 = 0;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field3688 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public static final int method1551(int arg0, int arg1) {
        field3692++;
        return arg0 == 1 ? arg1 & 0xFF : 115;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public static final void method1552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3693++;
        class187 var5 = class120.method762((byte) -109, 10, arg0);
        var5.method1167(arg2 - 129);
        var5.field2837 = arg1;
        var5.field2844 = arg3;
        if (arg2 == 1) {
            var5.field2830 = arg4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Z")
    public final boolean method1553(int arg0, int arg1) {
        if (arg1 == 10) {
            field3686++;
            return this.field3695[arg0].field1889;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public static final void method1554(int arg0) {
        field3696++;
        class57.field902.method1782(0);
        class264.field3989.method1782(0);
        class149.field2159.method1782(0);
        if (arg0 < 33) {
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
    public static void method1555(int arg0) {
        field3688 = null;
        if (arg0 != 255) {
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
    public static final void method1556(int arg0, byte arg1, int arg2) {
        field3697++;
        if (arg1 >= 27) {
            class187 var3 = class120.method762((byte) 91, 1, arg0);
            var3.method1167(-126);
            var3.field2844 = arg2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Z")
    public final boolean method1557(int arg0, int arg1) {
        if (arg1 < 113) {
            method1558(123);
        }
        field3694++;
        return this.field3695[arg0].field1895;
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        field3687++;
        int var1 = class100.field1580.method1098(8, (byte) -10);
        if (var1 < class141.field2069) {
            for (int var2 = var1; var2 < class141.field2069; var2++) {
                class72.field1157[class204.field3070++] = class58.field918[var2];
            }
        }
        if (var1 > class141.field2069) {
            throw new RuntimeException("gppov1");
        } else if (arg0 <= -88) {
            class141.field2069 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class58.field918[var3];
                class107 var5 = class96.field1521[var4];
                int var6 = class100.field1580.method1098(1, (byte) 93);
                if (var6 == 0) {
                    class58.field918[class141.field2069++] = var4;
                    var5.field2278 = class270.field4058;
                } else {
                    int var7 = class100.field1580.method1098(2, (byte) 84);
                    if (var7 == 0) {
                        class58.field918[class141.field2069++] = var4;
                        var5.field2278 = class270.field4058;
                        class113.field1736[class118.field1781++] = var4;
                    } else if (var7 == 1) {
                        class58.field918[class141.field2069++] = var4;
                        var5.field2278 = class270.field4058;
                        int var8 = class100.field1580.method1098(3, (byte) 98);
                        var5.method926(var8, 1, -1);
                        int var9 = class100.field1580.method1098(1, (byte) -82);
                        if (var9 == 1) {
                            class113.field1736[class118.field1781++] = var4;
                        }
                    } else if (var7 == 2) {
                        class58.field918[class141.field2069++] = var4;
                        var5.field2278 = class270.field4058;
                        if (class100.field1580.method1098(1, (byte) -8) == 1) {
                            int var11 = class100.field1580.method1098(3, (byte) -118);
                            var5.method926(var11, 2, -1);
                            int var12 = class100.field1580.method1098(3, (byte) 122);
                            var5.method926(var12, 2, -1);
                        } else {
                            int var10 = class100.field1580.method1098(3, (byte) 108);
                            var5.method926(var10, 0, -1);
                        }
                        int var13 = class100.field1580.method1098(1, (byte) -10);
                        if (var13 == 1) {
                            class113.field1736[class118.field1781++] = var4;
                        }
                    } else if (var7 == 3) {
                        class72.field1157[class204.field3070++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lpf;Lpf;IZ)V")
    public class247(class294 arg0, class294 arg1, int arg2, boolean arg3) {
        class159 var5 = new class159();
        int var6 = arg0.method1976(1, arg2);
        this.field3695 = new class125[var6];
        int[] var7 = arg0.method1946(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1973(1, arg2, var7[var8]);
            class244 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class244 var12 = (class244) var5.method983(7); var12 != null; var12 = (class244) var5.method985((byte) -49)) {
                if (var12.field3651 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1974(0, true, var11);
                } else {
                    var13 = arg1.method1974(var11, true, 0);
                }
                var10 = new class244(var11, var13);
                var5.method987(var10, (byte) -121);
            }
            this.field3695[var7[var8]] = new class125(var9, var10);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1559(byte arg0, byte[] arg1) {
        if (arg0 != 117) {
            return false;
        }
        field3690++;
        class248 var2 = new class248(arg1);
        int var3 = var2.method1593((byte) 27);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1593((byte) 27) == 1;
        if (var4) {
            class215.method1374(var2, -14376);
        }
        class205.method1297(15, var2);
        return true;
    }
}
