import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class467 {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lvd;")
    private class258 field6799;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "J")
    public long field6796;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Luv;")
    public static class2 field6798 = new class2(43, 12);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field6799.method1609(this.field6796, -15490);
        field6800++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V", line = 13)
    public static final void method2711() {
        class386.field5813 = 0;
        label212: for (int var0 = 0; var0 < class146.field2190; var0++) {
            class355 var1 = class426.field6353[var0];
            if (class314.field4854 != null) {
                for (int var2 = 0; var2 < class314.field4854.length; var2++) {
                    if (class314.field4854[var2] != -1000000 && (var1.field5460 <= class314.field4854[var2] || var1.field5439 <= class314.field4854[var2]) && (var1.field5442 <= class61.field831[var2] || var1.field5452 <= class61.field831[var2]) && (var1.field5442 >= class394.field5907[var2] || var1.field5452 >= class394.field5907[var2]) && (var1.field5449 <= class70.field933[var2] || var1.field5457 <= class70.field933[var2]) && (var1.field5449 >= class269.field3997[var2] || var1.field5457 >= class269.field3997[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field5453 == 1) {
                int var3 = var1.field5447 + class489.field7290 - class487.field7256;
                if (var3 >= 0 && var3 <= class489.field7290 + class489.field7290) {
                    int var4 = var1.field5456 + class489.field7290 - class301.field4475;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class489.field7290 + class489.field7290) {
                        continue;
                    }
                    int var5 = var1.field5438 + class489.field7290 - class301.field4475;
                    if (var5 > class489.field7290 + class489.field7290) {
                        var5 = class489.field7290 + class489.field7290;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class522.field7677[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class259.field3860 - var1.field5442;
                        if (var7 > class145.field2181) {
                            var1.field5450 = 1;
                        } else {
                            if (var7 >= -class145.field2181) {
                                continue;
                            }
                            var1.field5450 = 2;
                            var7 = -var7;
                        }
                        var1.field5448 = (var1.field5449 - class263.field3924 << 8) / var7;
                        var1.field5446 = (var1.field5457 - class263.field3924 << 8) / var7;
                        var1.field5444 = (var1.field5460 - class420.field6296 << 8) / var7;
                        var1.field5454 = (var1.field5439 - class420.field6296 << 8) / var7;
                        class95.field1476[class386.field5813++] = var1;
                    }
                }
            } else if (var1.field5453 == 2) {
                int var8 = var1.field5456 + class489.field7290 - class301.field4475;
                if (var8 >= 0 && var8 <= class489.field7290 + class489.field7290) {
                    int var9 = var1.field5447 + class489.field7290 - class487.field7256;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class489.field7290 + class489.field7290) {
                        continue;
                    }
                    int var10 = var1.field5441 + class489.field7290 - class487.field7256;
                    if (var10 > class489.field7290 + class489.field7290) {
                        var10 = class489.field7290 + class489.field7290;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class522.field7677[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class263.field3924 - var1.field5449;
                        if (var12 > class145.field2181) {
                            var1.field5450 = 3;
                        } else {
                            if (var12 >= -class145.field2181) {
                                continue;
                            }
                            var1.field5450 = 4;
                            var12 = -var12;
                        }
                        var1.field5443 = (var1.field5442 - class259.field3860 << 8) / var12;
                        var1.field5451 = (var1.field5452 - class259.field3860 << 8) / var12;
                        var1.field5444 = (var1.field5460 - class420.field6296 << 8) / var12;
                        var1.field5454 = (var1.field5439 - class420.field6296 << 8) / var12;
                        class95.field1476[class386.field5813++] = var1;
                    }
                }
            } else if (var1.field5453 == 4) {
                int var13 = var1.field5460 - class420.field6296;
                if (var13 > class342.field5254) {
                    int var14 = var1.field5456 + class489.field7290 - class301.field4475;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class489.field7290 + class489.field7290) {
                        continue;
                    }
                    int var15 = var1.field5438 + class489.field7290 - class301.field4475;
                    if (var15 > class489.field7290 + class489.field7290) {
                        var15 = class489.field7290 + class489.field7290;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field5447 + class489.field7290 - class487.field7256;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class489.field7290 + class489.field7290) {
                        continue;
                    }
                    int var17 = var1.field5441 + class489.field7290 - class487.field7256;
                    if (var17 > class489.field7290 + class489.field7290) {
                        var17 = class489.field7290 + class489.field7290;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class522.field7677[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field5450 = 5;
                        var1.field5443 = (var1.field5442 - class259.field3860 << 8) / var13;
                        var1.field5451 = (var1.field5452 - class259.field3860 << 8) / var13;
                        var1.field5448 = (var1.field5449 - class263.field3924 << 8) / var13;
                        var1.field5446 = (var1.field5457 - class263.field3924 << 8) / var13;
                        class95.field1476[class386.field5813++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 266)
    public static void method2712(int arg0) {
        if (arg0 <= 77) {
            field6798 = null;
        }
        field6798 = null;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lvd;J[Lrv;)V", line = 282)
    public class467(class258 arg0, long arg1, class224[] arg2) {
        this.field6799 = arg0;
        this.field6796 = arg1;
    }
}
