import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class253 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3624 = "M";

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[I")
    public static int[] field3630 = new int[8];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3627 = new String[1000];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1727(int arg0) {
        field3628++;
        class157.field2165.method2240(8);
        int var1 = class157.field2165.method2242(8, -14970);
        if (var1 < class338.field5084) {
            for (int var2 = var1; var2 < class338.field5084; var2++) {
                class290.field4323[class259.field3812++] = class257.field3807[var2];
            }
        }
        if (var1 > class338.field5084) {
            throw new RuntimeException("gnpov1");
        }
        class338.field5084 = 0;
        if (arg0 <= 55) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class257.field3807[var3];
            class329 var5 = class42.field484[var4];
            int var6 = class157.field2165.method2242(1, -14970);
            if (var6 == 0) {
                class257.field3807[class338.field5084++] = var4;
                var5.field3697 = class329.field4966;
            } else {
                int var7 = class157.field2165.method2242(2, -14970);
                if (var7 == 0) {
                    class257.field3807[class338.field5084++] = var4;
                    var5.field3697 = class329.field4966;
                    class270.field4027[class252.field3614++] = var4;
                } else if (var7 == 1) {
                    class257.field3807[class338.field5084++] = var4;
                    var5.field3697 = class329.field4966;
                    int var8 = class157.field2165.method2242(3, -14970);
                    var5.method1758(var8, 1, 114);
                    int var9 = class157.field2165.method2242(1, -14970);
                    if (var9 == 1) {
                        class270.field4027[class252.field3614++] = var4;
                    }
                } else if (var7 == 2) {
                    class257.field3807[class338.field5084++] = var4;
                    var5.field3697 = class329.field4966;
                    if (class157.field2165.method2242(1, -14970) == 1) {
                        int var10 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var10, 2, 106);
                        int var11 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var11, 2, 108);
                    } else {
                        int var12 = class157.field2165.method2242(3, -14970);
                        var5.method1758(var12, 0, 105);
                    }
                    int var13 = class157.field2165.method2242(1, -14970);
                    if (var13 == 1) {
                        class270.field4027[class252.field3614++] = var4;
                    }
                } else if (var7 == 3) {
                    class290.field4323[class259.field3812++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBII)V", line = 122)
    public static final void method1728(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3626++;
        int var5 = -62 % ((5 - arg2) / 38);
        for (int var6 = 0; var6 < class231.field3266; var6++) {
            if (class66.field868[var6] + class333.field5009[var6] > arg4 && class333.field5009[var6] < arg0 + arg4 && class262.field3852[var6] + class234.field3318[var6] > arg3 && class262.field3852[var6] < arg1 + arg3) {
                class121.field1644[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 143)
    public static final void method1729(int arg0) {
        field3623++;
        int var1 = 0;
        if (arg0 < 68) {
            return;
        }
        while (class48.field591 > var1) {
            int var10002 = class125.field1699[var1]--;
            if (class125.field1699[var1] >= -10) {
                label93: {
                    class215 var3 = class290.field4339[var1];
                    if (var3 == null) {
                        var3 = class215.method1490(class259.field3811, class309.field4660[var1], 0);
                        if (var3 == null) {
                            break label93;
                        }
                        class125.field1699[var1] += var3.method1493();
                        class290.field4339[var1] = var3;
                    }
                    if (class125.field1699[var1] < 0) {
                        label96: {
                            int var10;
                            if (class211.field3058[var1] == 0) {
                                var10 = class185.field2547[var1] * class45.field553 >> 8;
                            } else {
                                int var4 = (class211.field3058[var1] & 0xFF) * 128;
                                int var5 = (class211.field3058[var1] & 0xFFC9D6) >> 16;
                                int var6 = var5 * 128 + 64 - class173.field2356.field3745;
                                int var7 = class211.field3058[var1] >> 8 & 0xFF;
                                if (var6 < 0) {
                                    var6 = -var6;
                                }
                                int var8 = var7 * 128 + 64 - class173.field2356.field3679;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var6 + var8 - 128;
                                if (var9 > var4) {
                                    class125.field1699[var1] = -100;
                                    break label96;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class185.field2547[var1] * class224.field3233 / var4 >> 8;
                            }
                            if (var10 > 0) {
                                class87 var11 = var3.method1491().method680(class135.field1862);
                                class220 var12 = class220.method1537(var11, 100, var10);
                                var12.method1556(class316.field4764[var1] - 1);
                                class160.field2196.method1126(var12);
                            }
                            class125.field1699[var1] = -100;
                        }
                    }
                }
            } else {
                class48.field591--;
                for (int var2 = var1; var2 < class48.field591; var2++) {
                    class309.field4660[var2] = class309.field4660[var2 + 1];
                    class290.field4339[var2] = class290.field4339[var2 + 1];
                    class316.field4764[var2] = class316.field4764[var2 + 1];
                    class125.field1699[var2] = class125.field1699[var2 + 1];
                    class211.field3058[var2] = class211.field3058[var2 + 1];
                    class185.field2547[var2] = class185.field2547[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        if (class31.field384 && !class33.method188(-128)) {
            if (class83.field1199 != 0 && class231.field3272 != -1) {
                class131.method936(false, false, class173.field2349, class231.field3272, 0, class83.field1199);
            }
            class31.field384 = false;
        } else if (class83.field1199 != 0 && class231.field3272 != -1 && !class33.method188(-128)) {
            class208.field2997++;
            class90.field1264.method2238(122, (byte) -128);
            class90.field1264.method2188(255, class231.field3272);
            class231.field3272 = -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 274)
    public static void method1730(int arg0) {
        field3624 = null;
        if (arg0 <= 46) {
            method1729(-74);
        }
        field3627 = null;
        field3630 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lid;", line = 286)
    public static final class269 method1731(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class269 var4 = var3.field2879;
            var3.field2879 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)I", line = 308)
    public static final int method1732(int arg0, byte arg1) {
        field3631++;
        if (arg1 != -71) {
            method1731(114, -7, -73);
        }
        return arg0 == 16711935 ? -1 : class109.method798(true, arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)I", line = 322)
    public static final int method1733(boolean arg0, int arg1) {
        if (arg0) {
            method1729(-14);
        }
        field3629++;
        return arg1 >>> 8;
    }
}
