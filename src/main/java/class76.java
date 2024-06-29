import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class76 extends class154 {

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Loh;")
    public static class258 field1317 = class153.method1046("::wm2", 106);

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "[Lnb;")
    public static class149[] field1320 = new class149[4];

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field1326 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Loh;")
    public static class258 field1327 = class153.method1046("Versteckt", 95);

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "[Z")
    public static boolean[] field1323 = new boolean[8];

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Loh;")
    public static class258 field1328 = class153.method1046("compass", 107);

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lcl;")
    public static class145 field1322;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lmk;IIII)V", line = 6)
    public static final void method553(class151 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1319++;
        if (class69.field1195 >= 400) {
            return;
        }
        if (arg0.field2545 != null) {
            arg0 = arg0.method1035(-6941);
        }
        if (arg0 == null || !arg0.field2542) {
            return;
        }
        int var5 = 70 % ((40 - arg2) / 59);
        class258 var6 = arg0.field2543;
        if (arg0.field2550 != 0) {
            var6 = class100.method755(-6, new class258[] { var6, class246.method1683(class152.field2606.field3996, arg0.field2550, -53), class121.field2148, class279.field4782, class218.method1481(-63, arg0.field2550), class37.field487 });
        }
        if (class145.field2453 == 1) {
            class201.method1335(class218.field3770, class100.method755(-6, new class258[] { class64.field1135, class11.field127, var6 }), arg3, (byte) -123, (long) arg4, arg1, (short) 10);
            class71.field1234++;
        } else if (!class130.field2293) {
            class91.field1597++;
            class258[] var7 = arg0.field2547;
            if (class153.field2617) {
                var7 = class231.method1539(var7, (byte) 21);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class155.field2663 != 0 || !var7[var8].method1778(-11925, class55.field872))) {
                        class96.field1677++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 47;
                        }
                        if (var8 == 1) {
                            var9 = 46;
                        }
                        if (var8 == 2) {
                            var9 = 58;
                        }
                        if (var8 == 3) {
                            var9 = 33;
                        }
                        if (var8 == 4) {
                            var9 = 13;
                        }
                        class201.method1335(var7[var8], class100.method755(-6, new class258[] { class98.field1748, var6 }), arg3, (byte) -107, (long) arg4, arg1, var9);
                    }
                }
            }
            if (class155.field2663 == 0 && var7 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (var7[var10] != null && var7[var10].method1778(-11925, class55.field872)) {
                        class312.field5291++;
                        short var11 = 0;
                        if (arg0.field2550 > class152.field2606.field3996) {
                            var11 = 2000;
                        }
                        short var12 = 0;
                        if (var10 == 0) {
                            var12 = 47;
                        }
                        if (var10 == 1) {
                            var12 = 46;
                        }
                        if (var10 == 2) {
                            var12 = 58;
                        }
                        if (var10 == 3) {
                            var12 = 33;
                        }
                        if (var10 == 4) {
                            var12 = 13;
                        }
                        if (var12 != 0) {
                            var12 += var11;
                        }
                        class201.method1335(var7[var10], class100.method755(-6, new class258[] { class98.field1748, var6 }), arg3, (byte) -126, (long) arg4, arg1, var12);
                    }
                }
            }
            class201.method1335(class42.field587, class100.method755(-6, new class258[] { class98.field1748, var6 }), arg3, (byte) -113, (long) arg4, arg1, (short) 1007);
        } else if ((class42.field581 & 0x2) == 2) {
            class201.method1335(class109.field1924, class100.method755(-6, new class258[] { class96.field1684, class11.field127, var6 }), arg3, (byte) -115, (long) arg4, arg1, (short) 51);
            class125.field2238++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)Z", line = 156)
    public final boolean method554(int arg0, byte arg1, int arg2) {
        if (arg1 > -33) {
            return false;
        } else {
            field1324++;
            return arg2 >= this.field1330 && arg2 <= this.field1329 && arg0 >= this.field1321 && arg0 <= this.field1325;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lck;", line = 203)
    public static final class98 method555(int arg0) {
        field1331++;
        class43.field629 = 0;
        return arg0 >= -98 ? (class98) null : class38.method288(1905);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V", line = 215)
    public static void method556(boolean arg0) {
        field1317 = null;
        if (arg0) {
            field1328 = (class258) null;
        }
        field1323 = null;
        field1322 = null;
        field1327 = null;
        field1320 = null;
        field1328 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIII)V", line = 234)
    public class76(int arg0, int arg1, int arg2, int arg3) {
        this.field1330 = arg0;
        this.field1325 = arg3;
        this.field1321 = arg1;
        this.field1329 = arg2;
    }
}
