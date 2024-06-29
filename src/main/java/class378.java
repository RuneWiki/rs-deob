import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class378 {

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public int field5008 = 0;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field5011 = 0;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Luf;")
    private class380 field5003 = new class380(64);

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lhn;")
    private class88 field5012 = null;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "Lga;")
    private class332 field5004;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lga;")
    private class332 field5007;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Lwo;")
    public static class445 field5002 = new class445();

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Ltt;")
    public static class338 field5009 = new class338(44, 8);

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[IJLlg;)Ljava/lang/String;", line = 5)
    public final String method2160(boolean arg0, int[] arg1, long arg2, class32 arg3) {
        field5006++;
        if (arg0) {
            this.method2160(true, null, -94L, null);
        }
        if (this.field5012 != null) {
            String var6 = this.field5012.method480(arg2, arg3, arg1, (byte) -128);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V", line = 26)
    public static void method2161(int arg0) {
        field5002 = null;
        field5009 = null;
        if (arg0 <= 115) {
            field5005 = -27;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)Lbca;", line = 48)
    public final class307 method2162(byte arg0, int arg1) {
        field5010++;
        class307 var3 = (class307) this.field5003.method2176(-125, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field5007.method1938(arg1 & 0x7FFF, 1, -17);
        } else {
            var4 = this.field5004.method1938(arg1, 1, -17);
        }
        class307 var5 = new class307();
        var5.field4103 = this;
        if (arg0 != 102) {
            this.field5012 = null;
        }
        if (var4 != null) {
            var5.method1803(28, new class157(var4));
        }
        if (arg1 >= 32768) {
            var5.method1802(true);
        }
        this.field5003.method2174(var5, (long) arg1, (byte) -123);
        return var5;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[[BIB)V", line = 87)
    public static final void method2163(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class53.field697 = 0;
        class108.field1277 = 0;
        class132.field1841++;
        for (int var5 = 0; var5 < class57.field730[var4]; var5++) {
            if (!class421.method2376(class150.field2058[var4][var5], arg0, arg1, arg2, arg3)) {
                class432.method2434(class150.field2058[var4][var5]);
                if (class150.field2058[var4][var5].field383 != -1) {
                    class692.field9757[class53.field697++] = class150.field2058[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class629.field8709[var4]; var6++) {
            if (!class421.method2376(class648.field8957[var4][var6], arg0, arg1, arg2, arg3)) {
                class432.method2434(class648.field8957[var4][var6]);
                if (class648.field8957[var4][var6].field383 != -1) {
                    class351.field4681[class108.field1277++] = class648.field8957[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class189.field2627[var4]; var7++) {
            if (!class421.method2376(class100.field1206[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class100.field1206[var4][var7].method168(20071)) {
                    class432.method2434(class100.field1206[var4][var7]);
                    if (class100.field1206[var4][var7].field383 != -1) {
                        class351.field4681[class108.field1277++] = class100.field1206[var4][var7];
                    }
                } else {
                    class432.method2434(class100.field1206[var4][var7]);
                    if (class100.field1206[var4][var7].field383 != -1) {
                        class692.field9757[class53.field697++] = class100.field1206[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class392.field5241; var8++) {
                if (!class421.method2376(class420.field5512[var8], arg0, arg1, arg2, arg3)) {
                    class432.method2434(class420.field5512[var8]);
                    if (class420.field5512[var8].field383 != -1) {
                        if (class420.field5512[var8].method168(20071)) {
                            class351.field4681[class108.field1277++] = class420.field5512[var8];
                        } else {
                            class692.field9757[class53.field697++] = class420.field5512[var8];
                        }
                    }
                }
            }
        }
        if (class53.field697 > 0) {
            class289.method1712(class692.field9757, 0, class53.field697 - 1);
            for (int var9 = 0; var9 < class53.field697; var9++) {
                class308.method1813(class692.field9757[var9], true);
            }
        }
        if (class237.field3133) {
            class377.field4985.method1111(0, null);
        }
        for (int var10 = class266.field3479; var10 < class171.field2428; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class165.field2371.length;
                if (class165.field2371.length + class153.field2165 > class329.field4421) {
                    var21 -= class165.field2371.length + class153.field2165 - class329.field4421;
                }
                int var22 = class165.field2371[0].length;
                if (class165.field2371[0].length + class151.field2067 > class641.field8846) {
                    var22 -= class165.field2371[0].length + class151.field2067 - class641.field8846;
                }
                boolean[][] var23 = class595.field8207;
                if (class505.field6963) {
                    if (class115.field1477) {
                        var23 = class591.field8150[var10];
                    }
                    for (int var24 = class542.field7424; var24 < var21; var24++) {
                        int var25 = class153.field2165 + var24 - class542.field7424;
                        for (int var26 = class208.field2784; var26 < var22; var26++) {
                            if (class165.field2371[var24][var26] && !class454.method2559(var25, var10, 1, class151.field2067 + var26 - class208.field2784)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class115.field1477) {
                    class246.field3214[var10].method1362(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class143.field1940; var27++) {
                        class99.field1197[var27].method3349(false, new class151(var10 + 1));
                    }
                } else if (class574.field7840) {
                    class246.field3214[var10].method1363(class501.field6888, class377.field4997, class312.field4204, class595.field8207, true, class329.field4419);
                } else {
                    class246.field3214[var10].method1362(class501.field6888, class377.field4997, class312.field4204, class595.field8207, true);
                }
            } else {
                int var12 = class165.field2371.length;
                if (class165.field2371.length + class153.field2165 > class329.field4421) {
                    var12 -= class165.field2371.length + class153.field2165 - class329.field4421;
                }
                int var13 = class165.field2371[0].length;
                if (class165.field2371[0].length + class151.field2067 > class641.field8846) {
                    var13 -= class165.field2371[0].length + class151.field2067 - class641.field8846;
                }
                boolean[][] var14 = class595.field8207;
                if (class505.field6963) {
                    if (class115.field1477) {
                        var14 = class591.field8150[var10];
                    }
                    for (int var15 = class542.field7424; var15 < var12; var15++) {
                        int var16 = class153.field2165 + var15 - class542.field7424;
                        for (int var17 = class208.field2784; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class165.field2371[var15][var17]) {
                                int var18 = class151.field2067 + var17 - class208.field2784;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class153.field2168[var19][var16][var18] != null && class153.field2168[var19][var16][var18].field2776 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class454.method2559(var16, var10, 1, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class115.field1477) {
                    class246.field3214[var10].method1362(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class143.field1940; var20++) {
                        class99.field1197[var20].method3349(false, new class151(var10 + 1));
                    }
                } else if (class574.field7840) {
                    class246.field3214[var10].method1363(class501.field6888, class377.field4997, class312.field4204, class595.field8207, false, class329.field4419);
                } else {
                    class246.field3214[var10].method1362(class501.field6888, class377.field4997, class312.field4204, class595.field8207, false);
                }
            }
        }
        if (class108.field1277 > 0) {
            class613.method3392(class351.field4681, 0, class108.field1277 - 1);
            for (int var11 = 0; var11 < class108.field1277; var11++) {
                class308.method1813(class351.field4681[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(ILga;Lga;Lhn;)V", line = 384)
    public class378(int arg0, class332 arg1, class332 arg2, class88 arg3) {
        this.field5004 = arg1;
        this.field5007 = arg2;
        this.field5012 = arg3;
        if (this.field5004 != null) {
            this.field5008 = this.field5004.method1939(0, 1);
        }
        if (this.field5007 != null) {
            this.field5011 = this.field5007.method1939(0, 1);
        }
    }
}
