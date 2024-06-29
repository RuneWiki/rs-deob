import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field105 = -1;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "F")
    public static float field107;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lkl;")
    public static class68 field103;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIIZZIIILjc;)Loj;", line = 9)
    public static final class283 method53(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, class230 arg8) {
        field104++;
        class337 var9 = class95.method636(22111, arg6);
        if (arg7 > 1 && var9.field5216 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field5240[var11] <= arg7 && var9.field5240[var11] != 0) {
                    var10 = var9.field5216[var11];
                }
            }
            if (var10 != -1) {
                var9 = class95.method636(22111, var10);
            }
        }
        class20 var12 = var9.method2330((byte) -117, arg8);
        if (var12 == null) {
            return null;
        }
        class206 var13 = null;
        if (var9.field5226 != -1) {
            var13 = (class206) method53(true, 1, 113, false, true, 0, var9.field5201, 10, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field5233 != -1) {
            var13 = (class206) method53(false, arg1, 122, false, true, arg5, var9.field5214, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class270.field4170;
        int var15 = class270.field4172;
        int[] var16 = new int[4];
        int var17 = class270.field4169;
        if (arg2 <= 111) {
            method54(19);
        }
        class270.method1798(var16);
        class206 var18 = new class206(36, 32);
        class270.method1805(var18.field3353, 36, 32);
        class284.method1909();
        class284.method1922(16, 16);
        int var19 = var9.field5187;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class284.field4403 = false;
        int var20 = class284.field4398[var9.field5182] * var19 >> 16;
        int var21 = class284.field4395[var9.field5182] * var19 >> 16;
        var12.method150(0, var9.field5180, var9.field5224, var9.field5182, var9.field5207, var9.field5175 + var21 - (var12.method39() / 2), var20 - -var9.field5175, -1L);
        if (arg1 >= 1) {
            var18.method1391(1);
            if (arg1 >= 2) {
                var18.method1391(16777215);
            }
            class270.method1805(var18.field3353, 36, 32);
        }
        if (arg5 != 0) {
            var18.method1386(arg5);
        }
        if (var9.field5226 != -1) {
            var13.method901(0, 0);
        } else if (var9.field5233 != -1) {
            class270.method1805(var13.field3353, 36, 32);
            var18.method901(0, 0);
            var18 = var13;
        }
        if (arg3 && (var9.field5200 == 1 || arg7 != 1) && arg7 != -1) {
            class37.field723.method2120(class140.method914(arg7, (byte) -26), 0, 9, 16776960, 1);
        }
        class270.method1805(var14, var15, var17);
        class270.method1816(var16);
        class284.method1909();
        class284.field4403 = true;
        return class249.field3893 && !arg4 ? new class137(var18) : var18;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 138)
    public static void method54(int arg0) {
        field103 = null;
        if (arg0 >= -7) {
            field101 = -21;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 154)
    public static final void method55(int arg0, int arg1) {
        field111++;
        if (arg1 >= 86) {
            class2 var2 = class212.method1433(arg0, 7, -13802);
            var2.method16((byte) 87);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V", line = 168)
    public static final void method56(int arg0, int arg1, int arg2) {
        class23.field468[arg0] = arg1;
        field106++;
        if (arg2 != -1) {
            field103 = (class68) null;
        }
        class256 var3 = (class256) class123.field2125.method303((long) arg0, (byte) 107);
        if (var3 == null) {
            class256 var4 = new class256(4611686018427387905L);
            class123.field2125.method310((long) arg0, var4, 25357);
        } else if (var3.field3999 != 4611686018427387905L) {
            var3.field3999 = class338.method2339((byte) -120) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLbm;)V", line = 195)
    public static final void method57(byte arg0, class307 arg1) {
        if (arg0 > 91) {
            class292.field4475 = arg1;
            field110++;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 222)
    public static final void method58(byte arg0) {
        if (arg0 != -16) {
            return;
        }
        for (int var1 = 0; var1 < class248.field3865; var1++) {
            int var2 = class130.field2206[var1];
            class255 var3 = class8.field179[var2];
            int var4 = class190.field3082.method1317((byte) -105);
            if ((var4 & 0x80) != 0) {
                var4 += class190.field3082.method1317((byte) -126) << 8;
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field3991.method334(false)) {
                    class134.method877(var3, 6033);
                }
                var3.method1713((byte) -77, class19.method130(class190.field3082.method1323(arg0 + 13), arg0 ^ 0x16F7));
                var3.method697(var3.field3991.field882, -2424);
                var3.field1902 = var3.field3991.field889;
                var3.field1859 = var3.field3991.field839;
                if (var3.field3991.method334(false)) {
                    class142.method921(var3.field1871[0], (class31) null, var3, var3.field1899[0], (class278) null, 0, false, class289.field4438);
                }
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class190.field3082.method1323(arg0 + 13);
                if (var5 == 65535) {
                    var5 = -1;
                }
                boolean var6 = true;
                int var7 = class190.field3082.method1346(-116);
                if (var5 != -1 && var3.field1856 != -1 && class279.method1882(25397, class87.method609(var5, (byte) 47).field177).field4035 < class279.method1882(25397, class87.method609(var3.field1856, (byte) 57).field177).field4035) {
                    var6 = false;
                }
                if (var6) {
                    var3.field1862 = class25.field494 + (var7 & 0xFFFF);
                    var3.field1875 = 0;
                    var3.field1884 = 0;
                    var3.field1952 = 1;
                    var3.field1856 = var5;
                    if (class25.field494 < var3.field1862) {
                        var3.field1884 = -1;
                    }
                    var3.field1919 = var7 >> 16;
                    if (var3.field1856 != -1 && class25.field494 == var3.field1862) {
                        int var8 = class87.method609(var3.field1856, (byte) 113).field177;
                        if (var8 != -1) {
                            class260 var9 = class279.method1882(25397, var8);
                            if (var9 != null && var9.field4044 != null) {
                                class255.method1705(var3.field1872, var3.field1869, (byte) -70, var9, 0, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class190.field3082.method1317((byte) -103);
                int var11 = class190.field3082.method1305(arg0 + 105);
                var3.method702(class25.field494, var10, 0, var11);
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class190.field3082.method1325((byte) -51);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class190.field3082.method1322((byte) 98);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var15[var16] = var17;
                    var14[var16] = class190.field3082.method1305(62);
                    var13[var16] = class190.field3082.method1323(-3);
                }
                class40.method314(var3, var15, var13, true, var14);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1878 = class190.field3082.method1315(arg0 + 14305);
                if (var3.field1878 == 65535) {
                    var3.field1878 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class190.field3082.method1305(arg0 + 141);
                int var19 = class190.field3082.method1325((byte) -51);
                var3.method702(class25.field494, var18, 0, var19);
                var3.field1943 = class25.field494 + 300;
                var3.field1934 = class190.field3082.method1302((byte) -52);
            }
            if ((var4 & 0x200) != 0) {
                var3.field1900 = class190.field3082.method1315(14289);
                var3.field1887 = class190.field3082.method1315(14289);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1942 = class190.field3082.method1307((byte) 102);
                var3.field1890 = 100;
            }
            if ((var4 & 0x40) != 0) {
                int var20 = class190.field3082.method1322((byte) 98);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class190.field3082.method1317((byte) -109);
                class178.method1123(false, var20, var21, var3);
            }
        }
        field109++;
    }
}
