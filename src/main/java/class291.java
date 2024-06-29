import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class291 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Ll;")
    public static class16 field4029;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Z")
    public abstract boolean method492(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lya;IZLij;III)V")
    public abstract void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static void method1727(int arg0) {
        if (arg0 >= 117) {
            field4029 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1728(byte arg0) {
        field4028++;
        class117.method830();
        int var1 = -97 % ((arg0 + 43) / 50);
        for (int var2 = 0; var2 < 4; var2++) {
            class82.field1229[var2].method945((byte) 66);
        }
        class214.method1327(5743);
        class142.method959(-21808);
        System.gc();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLdw;Z)V")
    public static final void method1729(boolean arg0, class502 arg1, boolean arg2) {
        field4027++;
        if (class274.field3764 >= 400) {
            return;
        }
        class79 var3 = arg1.field7387;
        if (var3.field1143 != null) {
            var3 = var3.method646(0, class421.field6166);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field1148) {
            return;
        }
        if (!arg0) {
            method1728((byte) 2);
        }
        String var4 = var3.field1176;
        if (var3.field1158 != 0) {
            String var5 = class323.field4400 == class11.field173 ? class490.field7166.method2731(62, class372.field5455) : class233.field3285.method2731(62, class372.field5455);
            var4 = var4 + class336.method1924(var3.field1158, class316.field4324.field6415, (byte) -125) + " (" + var5 + var3.field1158 + ")";
        }
        if (!class59.field720) {
            if (!arg2) {
                String[] var6 = var3.field1191;
                if (class143.field2050) {
                    var6 = class121.method849((byte) 106, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (class323.field4400 != class166.field2502 || !var6[var7].equalsIgnoreCase(class211.field2939.method2731(62, class372.field5455)))) {
                            byte var8 = 0;
                            int var9 = class380.field5557;
                            if (var7 == 0) {
                                var8 = 60;
                            }
                            if (var7 == 1) {
                                var8 = 46;
                            }
                            if (var7 == 2) {
                                var8 = 5;
                            }
                            if (var7 == 3) {
                                var8 = 11;
                            }
                            if (var7 == 4) {
                                var8 = 8;
                            }
                            if (var3.field1159 == var7) {
                                var9 = var3.field1206;
                            }
                            if (var3.field1213 == var7) {
                                var9 = var3.field1196;
                            }
                            class407.method2438(var8, var9, true, (long) arg1.field1035, var6[var7], 0, "<col=ffff00>" + var4, -1, 500, false, 0);
                            class118.field1760++;
                        }
                    }
                }
                if (class323.field4400 == class166.field2502 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class211.field2939.method2731(62, class372.field5455))) {
                            short var11 = 0;
                            if (var3.field1158 > class316.field4324.field6415) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 60;
                            }
                            if (var10 == 1) {
                                var12 = 46;
                            }
                            if (var10 == 2) {
                                var12 = 5;
                            }
                            if (var10 == 3) {
                                var12 = 11;
                            }
                            if (var10 == 4) {
                                var12 = 8;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class316.field4328++;
                            class407.method2438(var12, var3.field1190, true, (long) arg1.field1035, var6[var10], 0, "<col=ffff00>" + var4, -1, 500, false, 0);
                        }
                    }
                }
            }
            class37.field460++;
            class407.method2438(1012, class6.field111, true, (long) arg1.field1035, class70.field966.method2731(62, class372.field5455), 0, "<col=ffff00>" + var4, -1, 500, arg2, 0);
        } else if (!arg2) {
            class177 var13 = class292.field4043 == -1 ? null : class177.field2622.method2033((byte) 120, class292.field4043);
            if ((class13.field199 & 0x2) != 0) {
                if (var13 == null || var3.method638(class292.field4043, var13.field2615, 5) != var13.field2615) {
                    class407.method2438(50, class352.field5167, true, (long) arg1.field1035, class78.field1131, 0, class253.field3513 + " -> <col=ffff00>" + var4, -1, 500, false, 0);
                    class449.field6611++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZILya;I)Z")
    public abstract boolean method500(boolean arg0, int arg1, class38 arg2, int arg3);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lya;B)Lmf;")
    public abstract class289 method484(class38 arg0, byte arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lya;Lij;IIIII)V")
    public static final void method1730(class38 arg0, class291 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class253.field3523 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class206.field2881) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class371.field5427 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class486 var15 = class89.field1305[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class211.field2950[var12].method351(var13, var14) + class211.field2950[var12].method351(var13 + 1, var14) + class211.field2950[var12].method351(var13, var14 + 1) + class211.field2950[var12].method351(var13 + 1, var14 + 1)) / 4 - (class211.field2950[arg2].method351(arg3, arg4) + class211.field2950[arg2].method351(arg3 + 1, arg4) + class211.field2950[arg2].method351(arg3, arg4 + 1) + class211.field2950[arg2].method351(arg3 + 1, arg4 + 1)) / 4;
                                    class90 var17 = var15.field7114;
                                    class90 var18 = var15.field7118;
                                    if (var17 != null && var17.method492(-1)) {
                                        arg1.method498(arg0, (var13 - arg3) * class424.field6241 + (1 - arg5) * class131.field1925, var7, var17, (var14 - arg4) * class424.field6241 + (1 - arg6) * class131.field1925, var16, -1);
                                    }
                                    if (var18 != null && var18.method492(-1)) {
                                        arg1.method498(arg0, (var13 - arg3) * class424.field6241 + (1 - arg5) * class131.field1925, var7, var18, (var14 - arg4) * class424.field6241 + (1 - arg6) * class131.field1925, var16, -1);
                                    }
                                    for (class164 var19 = var15.field7115; var19 != null; var19 = var19.field2467) {
                                        class116 var20 = var19.field2468;
                                        if (var20 != null && var20.method492(-1) && (var20.field1729 == var13 || var8 == var13) && (var20.field1730 == var14 || var10 == var14)) {
                                            int var21 = var20.field1736 + 1 - var20.field1729;
                                            int var22 = var20.field1742 + 1 - var20.field1730;
                                            arg1.method498(arg0, (var20.field1729 - arg3) * class424.field6241 + (var21 - arg5) * class131.field1925, var7, var20, (var20.field1730 - arg4) * class424.field6241 + (var22 - arg6) * class131.field1925, var16, -1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(ILya;)V")
    public abstract void method493(int arg0, class38 arg1);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V")
    public abstract void method495(int arg0);
}
