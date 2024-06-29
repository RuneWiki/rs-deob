import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class422 {

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[B")
    private byte[] field6066;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
    private int[] field6058;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
    private int[] field6057;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Z")
    public static boolean field6053 = false;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6059 = " from your ignore list first.";

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lfi;")
    public static class331 field6060 = new class331(5);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
    public static int[] field6055;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III[BB[B)I")
    public final int method2614(int arg0, int arg1, int arg2, byte[] arg3, byte arg4, byte[] arg5) {
        field6064++;
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg2 << 3;
        if (arg4 > -97) {
            method2617(-114);
        }
        while (var8 > arg1) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field6058[var10];
            byte var12 = this.field6066[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class164.method1059(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg1++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([II[ILre;[I)V")
    public static final void method2615(int[] arg0, int arg1, int[] arg2, class358 arg3, int[] arg4) {
        field6061++;
        int var5 = 0;
        if (arg1 != 2) {
            return;
        }
        while (arg4.length > var5) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && arg3.field6269.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field6269[var9] = null;
                    } else {
                        class182 var10 = class437.method2717(var6, (byte) -103);
                        int var11 = var10.field2487;
                        class138 var12 = arg3.field6269[var9];
                        if (var12 != null) {
                            if (var12.field1963 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field6269[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1962 = var8;
                                    var12.field1959 = 0;
                                    var12.field1970 = 0;
                                    var12.field1967 = 1;
                                    var12.field1960 = 0;
                                    class424.method2628(0, arg3.field1304, var10, 0, arg3.field1311, false);
                                } else if (var11 == 2) {
                                    var12.field1960 = 0;
                                }
                            } else if (var10.field2489 >= class437.method2717(var12.field1963, (byte) -103).field2489) {
                                var12 = arg3.field6269[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class138 var13 = arg3.field6269[var9] = new class138();
                            var13.field1962 = var8;
                            var13.field1963 = var6;
                            var13.field1967 = 1;
                            var13.field1959 = 0;
                            var13.field1970 = 0;
                            var13.field1960 = 0;
                            class424.method2628(0, arg3.field1304, var10, 0, arg3.field1311, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method2616(byte arg0) {
        field6067++;
        if (class223.field3042 != null) {
            return;
        }
        if (arg0 != -85) {
            method2615((int[]) null, -37, (int[]) null, (class358) null, (int[]) null);
        }
        Container var1;
        if (class252.field3406 == null) {
            var1 = class323.field4554.field5559;
        } else {
            var1 = class252.field3406;
        }
        class356.field5219 = var1.getSize().width;
        class384.field5628 = var1.getSize().height;
        if (class252.field3406 == var1) {
            Insets var2 = class252.field3406.getInsets();
            class384.field5628 -= var2.top + var2.bottom;
            class356.field5219 -= var2.right + var2.left;
        }
        if (class23.method151((byte) -90) == 1) {
            class38.field389 = 765;
            class99.field1111 = (class356.field5219 - 765) / 2;
            class222.field3039 = 503;
            class375.field5479 = 0;
        } else if (class343.field5053 < 96 && class341.field5018 == 0) {
            int var3 = class356.field5219 > 1024 ? 1024 : class356.field5219;
            class38.field389 = var3;
            class99.field1111 = (class356.field5219 - var3) / 2;
            int var4 = class384.field5628 <= 768 ? class384.field5628 : 768;
            class375.field5479 = 0;
            class222.field3039 = var4;
        } else {
            class375.field5479 = 0;
            class38.field389 = class356.field5219;
            class222.field3039 = class384.field5628;
            class99.field1111 = 0;
        }
        if (class213.field2908 != 0) {
            boolean var10000;
            if (class38.field389 < 1024 && class222.field3039 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class348.field5096.setSize(class38.field389, class222.field3039);
        if (class218.field2991 != null) {
            class218.field2991.method1006();
        }
        if (class252.field3406 == var1) {
            Insets var5 = class252.field3406.getInsets();
            class348.field5096.setLocation(class99.field1111 + var5.left, class375.field5479 + var5.top);
        } else {
            class348.field5096.setLocation(class99.field1111, class375.field5479);
        }
        if (class424.field6086 != -1) {
            class151.method902(true, true);
        }
        class397.method2527((byte) 96);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method2617(int arg0) {
        field6059 = null;
        if (arg0 == 1) {
            field6055 = null;
            field6060 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILre;I)V")
    public static final void method2618(byte arg0, int arg1, class358 arg2, int arg3) {
        field6063++;
        if (arg2.field6312 == arg1 && arg1 != -1) {
            class182 var4 = class437.method2717(arg1, (byte) -103);
            int var5 = var4.field2487;
            if (var5 == 1) {
                arg2.field6250 = arg3;
                arg2.field6272 = 1;
                arg2.field6314 = 0;
                arg2.field6322 = 0;
                arg2.field6277 = 0;
                class424.method2628(arg2.field6277, arg2.field1304, var4, 0, arg2.field1311, false);
            }
            if (var5 == 2) {
                arg2.field6314 = 0;
            }
        } else if (arg1 == -1 || arg2.field6312 == -1 || class437.method2717(arg1, (byte) -103).field2489 >= class437.method2717(arg2.field6312, (byte) -103).field2489) {
            arg2.field6277 = 0;
            arg2.field6250 = arg3;
            arg2.field6312 = arg1;
            arg2.field6272 = 1;
            arg2.field6353 = arg2.field6345;
            arg2.field6322 = 0;
            arg2.field6314 = 0;
            if (arg2.field6312 != -1) {
                class424.method2628(arg2.field6277, arg2.field1304, class437.method2717(arg2.field6312, (byte) -103), 0, arg2.field1311, false);
            }
        }
        if (arg0 <= 76) {
            method2616((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)V")
    public static final void method2619(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -84) {
            return;
        }
        field6062++;
        class348 var4 = class385.method2464(9, 1302, arg1);
        var4.method2216((byte) 23);
        var4.field5093 = arg0;
        var4.field5091 = arg3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BII[BII)I")
    public final int method2620(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = 56 / ((-arg4 - 22) / 36);
        field6056++;
        if (arg2 == 0) {
            return 0;
        }
        int var8 = arg2 + arg5;
        int var9 = 0;
        int var10 = arg1;
        while (true) {
            byte var11 = arg3[var10];
            if (var11 < 0) {
                var9 = this.field6057[var9];
            } else {
                var9++;
            }
            int var12;
            if ((var12 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var13;
            if ((var13 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var14;
            if ((var14 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var15;
            if ((var15 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var16;
            if ((var16 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var17;
            if ((var17 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var18;
            if ((var18 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field6057[var9];
            }
            int var19;
            if ((var19 = this.field6057[var9]) < 0) {
                arg0[arg5++] = (byte) (~var19);
                if (var8 <= arg5) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg1;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6054++;
        if (arg6 != 7) {
            method2621(81, 115, 69, 19, 39, 120, -24);
        }
        if ((arg5 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 8 - arg3 - arg0;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg4;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([B)V")
    public class422(byte[] arg0) {
        int var2 = arg0.length;
        this.field6066 = arg0;
        this.field6058 = new int[var2];
        int[] var3 = new int[33];
        this.field6057 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6058[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class164.method1059(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field6057[var14] == 0) {
                            this.field6057[var14] = var4;
                        }
                        var14 = this.field6057[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field6057.length) {
                        int[] var18 = new int[this.field6057.length * 2];
                        for (int var19 = 0; var19 < this.field6057.length; var19++) {
                            var18[var19] = this.field6057[var19];
                        }
                        this.field6057 = var18;
                    }
                }
                this.field6057[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
