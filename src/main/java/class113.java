import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class113 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
    public static int[] field1737 = new int[128];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lsb;")
    public static class124 field1738;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[[S")
    public static short[][] field1747;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method831(int arg0) {
        field1737 = null;
        field1738 = null;
        field1747 = null;
        if (arg0 != 7487) {
            method832((byte) -27);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method832(byte arg0) {
        int var1 = class143.field2360.method612(8, arg0 - 122);
        if (var1 < class144.field2386) {
            for (int var2 = var1; var2 < class144.field2386; var2++) {
                class6.field80[class38.field640++] = class279.field4431[var2];
            }
        }
        field1743++;
        if (var1 > class144.field2386) {
            throw new RuntimeException("gppov1");
        } else if (arg0 == 2) {
            class144.field2386 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class279.field4431[var3];
                class213 var5 = class191.field3129[var4];
                int var6 = class143.field2360.method612(1, -125);
                if (var6 == 0) {
                    class279.field4431[class144.field2386++] = var4;
                    var5.field2846 = class207.field3336;
                } else {
                    int var7 = class143.field2360.method612(2, -127);
                    if (var7 == 0) {
                        class279.field4431[class144.field2386++] = var4;
                        var5.field2846 = class207.field3336;
                        class200.field3251[class254.field4039++] = var4;
                    } else if (var7 == 1) {
                        class279.field4431[class144.field2386++] = var4;
                        var5.field2846 = class207.field3336;
                        int var8 = class143.field2360.method612(3, arg0 - 125);
                        var5.method1228(var8, false, 1);
                        int var9 = class143.field2360.method612(1, -119);
                        if (var9 == 1) {
                            class200.field3251[class254.field4039++] = var4;
                        }
                    } else if (var7 == 2) {
                        class279.field4431[class144.field2386++] = var4;
                        var5.field2846 = class207.field3336;
                        if (class143.field2360.method612(1, -119) == 1) {
                            int var10 = class143.field2360.method612(3, -126);
                            var5.method1228(var10, false, 2);
                            int var11 = class143.field2360.method612(3, -120);
                            var5.method1228(var11, false, 2);
                        } else {
                            int var12 = class143.field2360.method612(3, arg0 ^ 0xFFFFFF80);
                            var5.method1228(var12, false, 0);
                        }
                        int var13 = class143.field2360.method612(1, -123);
                        if (var13 == 1) {
                            class200.field3251[class254.field4039++] = var4;
                        }
                    } else if (var7 == 3) {
                        class6.field80[class38.field640++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public abstract void method412(int arg0, byte arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILsb;II)Z")
    public static final boolean method833(int arg0, class124 arg1, int arg2, int arg3) {
        byte[] var4 = arg1.method900(arg2, arg0, false);
        field1739++;
        int var5 = -100 % ((4 - arg3) / 43);
        if (var4 == null) {
            return false;
        } else {
            class237.method1569(var4, -16144);
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIB)I")
    public static final int method834(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 != 27) {
            field1741 = -104;
        }
        field1744++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lca;")
    public abstract class131 method398(byte arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILci;IJIIII)Z")
    public static final boolean method835(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class155.method1120(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[B")
    public abstract byte[] method409(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I")
    public abstract int method399(int arg0, int arg1);
}
