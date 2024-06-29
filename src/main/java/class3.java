import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Lge;")
    private class325[] field34;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Ljava/lang/String;")
    public static String field37 = "Walk here";

    @OriginalMember(owner = "client!il", name = "d", descriptor = "F")
    public static float field36;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lmn;")
    public static class161 field40;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljd;Ljd;I)I", line = 6)
    public static final int method16(class95 arg0, class95 arg1, int arg2) {
        field39++;
        if (arg2 != -27834) {
            method21((byte) -52);
        }
        int var3 = 0;
        if (arg0.method707(class341.field5298, (byte) 103)) {
            var3++;
        }
        if (arg0.method707(class297.field4580, (byte) 124)) {
            var3++;
        }
        if (arg0.method707(class69.field990, (byte) 79)) {
            var3++;
        }
        if (arg1.method707(class341.field5298, (byte) 53)) {
            var3++;
        }
        if (arg1.method707(class297.field4580, (byte) 68)) {
            var3++;
        }
        if (arg1.method707(class69.field990, (byte) 88)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Ljava/lang/String;", line = 47)
    public static final String method17(int arg0, int arg1) {
        field41++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 >= 10000000) {
            if (arg0 <= 31) {
                method18(-21, 40);
            }
            return "<col=00ff80>" + arg1 / 1000000 + class209.field3193 + "</col>";
        } else {
            return "<col=ffffff>" + arg1 / 1000 + class220.field3361 + "</col>";
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V", line = 65)
    public static final void method18(int arg0, int arg1) {
        if (arg0 < 14) {
            method21((byte) 0);
        }
        field33++;
        class188 var2 = class147.method1111(-36, arg1, 9);
        var2.method1393((byte) -125);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIJ)Z", line = 79)
    public static final boolean method19(int arg0, int arg1, int arg2, long arg3) {
        class79 var5 = class213.field3262[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1161 != null && var5.field1161.field512 == arg3) {
            return true;
        } else if (var5.field1175 != null && var5.field1175.field2400 == arg3) {
            return true;
        } else if (var5.field1179 != null && var5.field1179.field5292 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1169; var6++) {
                if (var5.field1157[var6].field3482 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILvl;Lwm;I)V", line = 120)
    public static final void method20(int arg0, class6 arg1, class254 arg2, int arg3) {
        field38++;
        if (arg0 > -12) {
            return;
        }
        class111 var4 = new class111();
        var4.field1681 = arg2.method1774((byte) 99);
        var4.field1688 = arg2.method1741(-32769);
        var4.field1690 = new int[var4.field1681];
        var4.field1686 = new class208[var4.field1681];
        var4.field1669 = new class208[var4.field1681];
        var4.field1675 = new byte[var4.field1681][][];
        var4.field1674 = new int[var4.field1681];
        var4.field1678 = new int[var4.field1681];
        for (int var5 = 0; var5 < var4.field1681; var5++) {
            try {
                int var6 = arg2.method1774((byte) -119);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1778(1258);
                    String var8 = arg2.method1778(1258);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1741(-32769);
                    }
                    var4.field1678[var5] = var6;
                    var4.field1674[var5] = var9;
                    var4.field1669[var5] = arg1.method49(class257.method1805(3738, var7), var8, 116);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1778(1258);
                    String var11 = arg2.method1778(1258);
                    int var12 = arg2.method1774((byte) 59);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1778(1258);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1741(-32769);
                            var15[var16] = new byte[var17];
                            arg2.method1739(var15[var16], 0, -12687, var17);
                        }
                    }
                    var4.field1678[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class257.method1805(3738, var13[var19]);
                    }
                    var4.field1686[var5] = arg1.method53(class257.method1805(3738, var10), (byte) 54, var11, var18);
                    var4.field1675[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field1690[var5] = -1;
            } catch (SecurityException var26) {
                var4.field1690[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field1690[var5] = -3;
            } catch (Exception var28) {
                var4.field1690[var5] = -4;
            } catch (Throwable var29) {
                var4.field1690[var5] = -5;
            }
        }
        class61.field815.method1952(var4, -76);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 231)
    public static void method21(byte arg0) {
        if (arg0 != 50) {
            field36 = -1.7243788F;
        }
        field37 = null;
        field40 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V", line = 250)
    public class3(int arg0) {
        this.field34 = new class325[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class325 var3 = this.field34[var2] = new class325();
            var3.field5018 = var3;
            var3.field5017 = var3;
        }
    }
}
