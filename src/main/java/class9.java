import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class9 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[Z")
    public static boolean[] field185 = new boolean[100];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "J")
    public static long field183 = 0L;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Ljava/lang/String;")
    public static String field189 = "Select";

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lui;")
    public static class234 field190;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lqd;")
    public static class3 field191;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
    public static int[] field194;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lhl;")
    public static final class40 method101(int arg0, int arg1) {
        if (arg0 >= -63) {
            method108(-37, -50);
        }
        class40 var2 = (class40) class263.field4110.method1780((long) arg1, (byte) -125);
        field184++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class230.field3591.method1163(arg1, 0, 48);
        class40 var4 = new class40(var3);
        var4.method33(class111.field1746, (int[]) null);
        class263.field4110.method1784(var4, false, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
    public static final void method102(int arg0, byte arg1) {
        field188++;
        if (class103.method784(-1, arg0)) {
            if (arg1 <= 8) {
                field191 = null;
            }
            class272.method1835(-1, class261.field4006[arg0], false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method103(int arg0) {
        field191 = null;
        field190 = null;
        field189 = null;
        if (arg0 > 73) {
            field194 = null;
            field185 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field187++;
        class151.method1021(arg4, (byte) -48);
        int var7 = arg4 - arg2;
        int var8 = arg4;
        if (arg3 < ~var7) {
            var7 = 0;
        }
        int var9 = 0;
        int var10 = var7;
        int var11 = -arg4;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var7;
        if (arg0 >= class271.field4289 && class113.field1779 >= arg0) {
            int[] var15 = class156.field2379[arg0];
            int var16 = class68.method533(class75.field1265, class261.field4025, arg1 - arg4, (byte) 43);
            int var17 = class68.method533(class75.field1265, class261.field4025, arg1 + arg4, (byte) 24);
            int var18 = class68.method533(class75.field1265, class261.field4025, arg1 - var7, (byte) 26);
            int var19 = class68.method533(class75.field1265, class261.field4025, arg1 + var7, (byte) 120);
            class263.method1788(var16, -18732, arg5, var15, var18);
            class263.method1788(var18, arg3 ^ 0x492B, arg6, var15, var19);
            class263.method1788(var19, arg3 ^ 0x492B, arg5, var15, var17);
        }
        while (var8 > var9) {
            var12 += 2;
            var11 += var12;
            var13 += 2;
            var14 += var13;
            if (var14 >= 0 && var10 >= 1) {
                var10--;
                var14 -= var10 << 1;
                class189.field3018[var10] = var9;
            }
            var9++;
            if (var11 >= 0) {
                var8--;
                var11 -= var8 << 1;
                int var20 = arg0 - var8;
                int var21 = arg0 + var8;
                if (var21 >= class271.field4289 && class113.field1779 >= var20) {
                    if (var8 < var7) {
                        int var22 = class189.field3018[var8];
                        int var23 = class68.method533(class75.field1265, class261.field4025, arg1 + var9, (byte) 62);
                        int var24 = class68.method533(class75.field1265, class261.field4025, arg1 - var9, (byte) 106);
                        int var25 = class68.method533(class75.field1265, class261.field4025, arg1 + var22, (byte) 97);
                        int var26 = class68.method533(class75.field1265, class261.field4025, arg1 - var22, (byte) 25);
                        if (var21 <= class113.field1779) {
                            int[] var27 = class156.field2379[var21];
                            class263.method1788(var24, -18732, arg5, var27, var26);
                            class263.method1788(var26, -18732, arg6, var27, var25);
                            class263.method1788(var25, -18732, arg5, var27, var23);
                        }
                        if (var20 >= class271.field4289) {
                            int[] var28 = class156.field2379[var20];
                            class263.method1788(var24, -18732, arg5, var28, var26);
                            class263.method1788(var26, -18732, arg6, var28, var25);
                            class263.method1788(var25, arg3 - 18731, arg5, var28, var23);
                        }
                    } else {
                        int var29 = class68.method533(class75.field1265, class261.field4025, arg1 + var9, (byte) 57);
                        int var30 = class68.method533(class75.field1265, class261.field4025, arg1 - var9, (byte) 53);
                        if (class113.field1779 >= var21) {
                            class263.method1788(var30, -18732, arg5, class156.field2379[var21], var29);
                        }
                        if (class271.field4289 <= var20) {
                            class263.method1788(var30, -18732, arg5, class156.field2379[var20], var29);
                        }
                    }
                }
            }
            int var31 = arg0 - var9;
            int var32 = arg0 + var9;
            if (var32 >= class271.field4289 && var31 <= class113.field1779) {
                int var33 = arg1 + var8;
                int var34 = arg1 - var8;
                if (var33 >= class75.field1265 && var34 <= class261.field4025) {
                    int var35 = class68.method533(class75.field1265, class261.field4025, var33, (byte) 49);
                    int var36 = class68.method533(class75.field1265, class261.field4025, var34, (byte) 84);
                    if (var9 >= var7) {
                        if (class113.field1779 >= var32) {
                            class263.method1788(var36, -18732, arg5, class156.field2379[var32], var35);
                        }
                        if (var31 >= class271.field4289) {
                            class263.method1788(var36, arg3 ^ 0x492B, arg5, class156.field2379[var31], var35);
                        }
                    } else {
                        int var37 = var9 <= var10 ? var10 : class189.field3018[var9];
                        int var38 = class68.method533(class75.field1265, class261.field4025, arg1 + var37, (byte) 126);
                        int var39 = class68.method533(class75.field1265, class261.field4025, arg1 - var37, (byte) 110);
                        if (class113.field1779 >= var32) {
                            int[] var40 = class156.field2379[var32];
                            class263.method1788(var36, -18732, arg5, var40, var39);
                            class263.method1788(var39, -18732, arg6, var40, var38);
                            class263.method1788(var38, -18732, arg5, var40, var35);
                        }
                        if (var31 >= class271.field4289) {
                            int[] var41 = class156.field2379[var31];
                            class263.method1788(var36, -18732, arg5, var41, var39);
                            class263.method1788(var39, -18732, arg6, var41, var38);
                            class263.method1788(var38, arg3 ^ 0x492B, arg5, var41, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIZZB)V")
    public static final void method105(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        field192++;
        if (arg4 == 81) {
            class226.method1507(0, class121.field1868.length - 1, arg0, arg1, arg2, arg3, -1368319650);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IJ)V")
    public static final void method106(int arg0, long arg1) {
        field193++;
        if (arg1 == 0L) {
            return;
        }
        class292.field4607.method1251(184, (byte) -48);
        class98.field1565++;
        class292.field4607.method337(2103219728, arg1);
        if (arg0 != -1) {
            method101(20, -98);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z[B)V")
    public abstract void method107(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)I")
    public static final int method108(int arg0, int arg1) {
        field186++;
        if (arg0 < 0) {
            return 0;
        }
        class127 var2 = (class127) class251.field3858.method1414(true, (long) arg0);
        if (var2 == null) {
            return class263.method1790((byte) 84, arg0).field2110;
        }
        int var3 = -64 / ((arg1 + 4) / 34);
        int var4 = 0;
        for (int var5 = 0; var5 < var2.field1998.length; var5++) {
            if (var2.field1998[var5] == -1) {
                var4++;
            }
        }
        return var4 + class263.method1790((byte) 116, arg0).field2110 - var2.field1998.length;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)[B")
    public abstract byte[] method109(int arg0);
}
