import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class116 {

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2672 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
    public static boolean field2674 = false;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lja;")
    public static class62 field2670 = class30.method243(43, "title)3jpg");

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lja;")
    private static class62 field2677 = class30.method243(43, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lja;")
    public static class62 field2675 = field2677;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)I")
    public static final int method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg3;
            arg3 = var7;
        }
        int var8 = arg6 & 0x3;
        field2668++;
        if (~var8 == arg0) {
            return arg4;
        } else if (var8 == 1) {
            return 8 - arg1 - arg2;
        } else if (var8 == 2) {
            return 7 + 1 - arg4 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method324(Component arg0, int arg1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2675 = null;
        field2677 = null;
        field2670 = null;
        if (arg0 != 32) {
            method941(108);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public static final void method942(int arg0) {
        while (true) {
            if (class38.field879.method804(arg0 + 23014, class115.field2651) >= 27) {
                int var1 = class38.field879.method811(7, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class136.field3127[var1] == null) {
                        class136.field3127[var1] = new class130();
                        var2 = true;
                    }
                    class130 var3 = class136.field3127[var1];
                    class36.field871[class83.field2001++] = var1;
                    var3.field180 = class86.field2060;
                    int var4 = class38.field879.method811(7, 1);
                    if (var4 == 1) {
                        class38.field894[class34.field814++] = var1;
                    }
                    int var5 = class153.field3562[class38.field879.method811(7, 3)];
                    if (var2) {
                        var3.field137 = var3.field168 = var5;
                    }
                    int var6 = class38.field879.method811(arg0 ^ 0xFFFFA61D, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class38.field879.method811(7, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field2966 = class105.method848(class38.field879.method811(arg0 + 23021, 14), (byte) 21);
                    int var8 = class38.field879.method811(7, 1);
                    var3.field152 = var3.field2966.field3173;
                    var3.field154 = var3.field2966.field3190;
                    var3.field153 = var3.field2966.field3188;
                    var3.field149 = var3.field2966.field3178;
                    var3.field151 = var3.field2966.field3181;
                    var3.field190 = var3.field2966.field3214;
                    var3.field163 = var3.field2966.field3213;
                    if (var3.field154 == 0) {
                        var3.field168 = 0;
                    }
                    var3.field178 = var3.field2966.field3186;
                    var3.field167 = var3.field2966.field3207;
                    var3.method64(class40.field936.field193[0] + var7, (byte) -24, class40.field936.field144[0] + var6, var8 == 1);
                    continue;
                }
            }
            if (arg0 != -23014) {
                field2676 = -61;
            }
            class38.field879.method802(-7);
            field2669++;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method943(int arg0) {
        client.method163(class150.field3540, -124);
        class146.field3435++;
        int var1 = -8 % ((arg0 - 24) / 32);
        field2667++;
        if (class32.field785 && class70.field1786) {
            int var2 = class84.field2032;
            int var3 = class103.field2398;
            int var4 = var3 - class67.field1666;
            int var5 = var2 - class93.field2175;
            if (class1.field1 > var5) {
                var5 = class1.field1;
            }
            if (var4 < class137.field3166) {
                var4 = class137.field3166;
            }
            if (class150.field3540.field1316 + var4 > class137.field3166 + class86.field2059.field1316) {
                var4 = class86.field2059.field1316 + class137.field3166 - class150.field3540.field1316;
            }
            if (class1.field1 + class86.field2059.field1345 < class150.field3540.field1345 + var5) {
                var5 = class1.field1 + class86.field2059.field1345 - class150.field3540.field1345;
            }
            int var6 = var4 - class88.field2081;
            int var7 = var5 - class46.field1054;
            int var8 = var4 + class86.field2059.field1303 - class137.field3166;
            int var9 = class86.field2059.field1262 + var5 - class1.field1;
            int var10 = class150.field3540.field1264;
            if (class146.field3435 > class150.field3540.field1353 && (var6 > var10 || -var10 > var6 || var10 < var7 || -var10 > var7)) {
                class15.field339 = true;
            }
            if (class150.field3540.field1298 != null && class15.field339) {
                class113 var11 = new class113();
                var11.field2607 = var9;
                var11.field2601 = class150.field3540.field1298;
                var11.field2608 = var8;
                var11.field2610 = class150.field3540;
                class124.method976(var11, -109);
            }
            if (class70.field1797 == 0) {
                if (class15.field339) {
                    if (class150.field3540.field1256 != null) {
                        class113 var12 = new class113();
                        var12.field2608 = var8;
                        var12.field2601 = class150.field3540.field1256;
                        var12.field2606 = class1.field5;
                        var12.field2607 = var9;
                        var12.field2610 = class150.field3540;
                        class124.method976(var12, -103);
                    }
                    if (class1.field5 != null && class90.method703((byte) -37, class150.field3540) != null) {
                        class135.field3121++;
                        class136.field3140.method810(-2, 228);
                        class136.field3140.method1024(252, class1.field5.field1257);
                        class136.field3140.method1002(class1.field5.field1291, -4094);
                        class136.field3140.method992(-13292, class150.field3540.field1257);
                        class136.field3140.method1005(-87, class150.field3540.field1291);
                    }
                } else if ((class1.field15 == 1 || class83.method648(-126, class128.field2889 - 1)) && class128.field2889 > 2) {
                    class103.method830((byte) 50);
                } else if (class128.field2889 > 0) {
                    class77.method622(2, class128.field2889 - 1);
                }
                class150.field3540 = null;
            }
        } else if (class146.field3435 > 1) {
            class150.field3540 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method322(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
    public abstract int method323(int arg0);
}
