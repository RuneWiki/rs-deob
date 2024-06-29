import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class73 {

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Z")
    public boolean field1057 = false;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field1051 = -1;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
    public static int[] field1055 = new int[32];

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1059 = "red:";

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lek;")
    public static class184 field1047;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method600(int arg0, int arg1, int arg2) {
        int var3 = class267.field4023[arg0][arg1][arg2];
        if (-class63.field949 == var3) {
            return false;
        } else if (class63.field949 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class225.method1604(var4 + 1, class41.field612[arg0][arg1][arg2], var5 + 1) && class225.method1604(var4 + 128 - 1, class41.field612[arg0][arg1 + 1][arg2], var5 + 1) && class225.method1604(var4 + 128 - 1, class41.field612[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class225.method1604(var4 + 1, class41.field612[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class267.field4023[arg0][arg1][arg2] = class63.field949;
                return true;
            } else {
                class267.field4023[arg0][arg1][arg2] = -class63.field949;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lhb;II)V", line = 33)
    public final void method601(class35 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method273(65280);
            if (var4 == 0) {
                int var5 = -108 / ((arg2 - 23) / 60);
                field1052++;
                return;
            }
            this.method603(arg0, var4, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 51)
    public static final void method602(byte arg0) {
        int var1 = -40 % ((arg0 + 78) / 39);
        class126.field1997.method1428(10935);
        class31.field397.method1428(10935);
        field1050++;
        class290.field4561.method1428(10935);
        class170.field2534.method1428(10935);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lhb;III)V", line = 64)
    private final void method603(class35 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            return;
        }
        if (arg1 == 1) {
            this.field1056 = arg0.method300(-1394191632);
        } else if (arg1 == 2) {
            this.field1049 = arg0.method269(false);
        } else if (arg1 == 3) {
            this.field1057 = true;
        } else if (arg1 == 4) {
            this.field1056 = -1;
        }
        field1058++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 102)
    public static void method604(int arg0) {
        field1059 = null;
        field1047 = null;
        if (arg0 == 16915) {
            field1055 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIILgd;IZJ)Z", line = 122)
    public static final boolean method605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class310 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class41.field612 == class308.field4797;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class39.field589 || var16 >= class210.field3312) {
                    return false;
                }
                class99 var17 = class250.field3746[arg0][var15][var16];
                if (var17 != null && var17.field1488 >= 5) {
                    return false;
                }
            }
        }
        class91 var18 = new class91();
        var18.field1327 = arg11;
        var18.field1331 = arg0;
        var18.field1324 = arg5;
        var18.field1322 = arg6;
        var18.field1328 = arg7;
        var18.field1326 = arg8;
        var18.field1316 = arg9;
        var18.field1329 = arg1;
        var18.field1323 = arg2;
        var18.field1317 = arg1 + arg3 - 1;
        var18.field1319 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class250.field3746[var22][var19][var20] == null) {
                        class250.field3746[var22][var19][var20] = new class99(var22, var19, var20);
                    }
                }
                class99 var23 = class250.field3746[arg0][var19][var20];
                var23.field1471[var23.field1488] = var18;
                var23.field1477[var23.field1488] = var21;
                var23.field1483 |= var21;
                var23.field1488++;
                if (var13 && class118.field1871[var19][var20] != 0) {
                    var14 = class118.field1871[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class118.field1871[var24][var25] == 0) {
                        class118.field1871[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class249.field3739[class39.field593++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILlb;)V", line = 247)
    public static final void method606(int arg0, class211 arg1) {
        if (arg0 >= -70) {
            field1047 = (class184) null;
        }
        field1053++;
        class16.field185 = arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lom;", line = 269)
    public final class70 method607(int arg0, int arg1) {
        field1054++;
        class70 var3 = (class70) class322.field5010.method1432((byte) 125, (long) (arg0 << 16 | this.field1056));
        if (var3 != null) {
            return var3;
        }
        class191.field3053.method1531(111, this.field1056);
        class70 var4 = class227.method1617(arg1 ^ arg1, class191.field3053, 0, this.field1056);
        if (var4 != null) {
            var4.method591(class71.field1035, class34.field420, class33.field414);
            var4.field4578 = var4.field4595;
            var4.field4582 = var4.field4579;
            for (int var5 = 0; var5 < arg0; var5++) {
                var4.method586();
            }
            class322.field5010.method1436(false, var4, (long) (this.field1056 | arg0 << 16));
        }
        return var4;
    }
}
