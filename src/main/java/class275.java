import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class275 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4158 = new String[] { method2275(method2274("G0\u0018_9")), method2275(method2274("Q|\u00180l")), method2275(method2274("YhZl")), method2275(method2274("D'Zr")), method2275(method2274("G0\u0018\\9")), method2275(method2274("G0\u0018Z9")) };

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field4154 = 0;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4152 = new Hashtable();

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[[[I")
    public static int[][][] field4155 = new int[2][][];

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lla;")
    public static class476 field4157;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([Ldf;II)V", line = 4)
    public static final void method2270(class420[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class420 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field6208;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field6208 > (var7 & 0x1) + var6) {
                class420 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2270(arg0, arg1, var4 - 1);
        method2270(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 41)
    public static final int method2271(byte arg0, String arg1) {
        try {
            if (arg0 != -31) {
                field4157 = null;
            }
            field4151++;
            for (int var2 = 0; var2 < class754.field10978.length; var2++) {
                if (class754.field10978[var2].equalsIgnoreCase(arg1)) {
                    return var2;
                }
            }
            return -1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4158[5] + arg0 + ',' + (arg1 == null ? field4158[3] : field4158[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 65)
    public static void method2272(byte arg0) {
        try {
            field4152 = null;
            field4157 = null;
            field4155 = null;
            if (arg0 < 100) {
                method2270(null, -96, 103);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4158[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILub;I)V", line = 77)
    public static final void method2273(int arg0, class22 arg1, int arg2) {
        try {
            field4153++;
            boolean var3 = arg1.method156(-10160, 1) == 1;
            if (var3) {
                class732.field10622[class426.field6270++] = arg2;
            }
            int var4 = arg1.method156(-10160, 2);
            class726 var5 = class197.field2685[arg2];
            if (var4 == 0) {
                if (var3) {
                    var5.field10516 = false;
                } else if (class722.field10458 == arg2) {
                    throw new RuntimeException(field4158[2]);
                } else {
                    class133 var6 = class176.field2458[arg2] = new class133();
                    var6.field1557 = (var5.field6200 << 28) - (-(var5.field3859[0] + class494.field7101 >> 6 << 14) - (var5.field3863[0] + class281.field4219 >> 6));
                    if (var5.field10502 == -1) {
                        var6.field1554 = var5.field3839.method1785(arg0 - 38);
                    } else {
                        var6.field1554 = var5.field10502;
                    }
                    var6.field1553 = var5.field10512;
                    var6.field1555 = var5.field3842;
                    var6.field1552 = var5.field10494;
                    if (var5.field10488 > 0) {
                        class39.method263(114, var5);
                    }
                    class197.field2685[arg2] = null;
                    if (arg1.method156(-10160, 1) != 0) {
                        class423.method3266(arg2, (byte) -59, arg1);
                    }
                }
            } else if (var4 == 1) {
                int var7 = arg1.method156(-10160, 3);
                int var8 = var5.field3859[0];
                int var9 = var5.field3863[0];
                if (var7 == 0) {
                    var9--;
                    var8--;
                } else if (var7 == 1) {
                    var9--;
                } else if (var7 == 2) {
                    var9--;
                    var8++;
                } else if (var7 == 3) {
                    var8--;
                } else if (var7 == 4) {
                    var8++;
                } else if (var7 == 5) {
                    var9++;
                    var8--;
                } else if (var7 == 6) {
                    var9++;
                } else if (var7 == 7) {
                    var9++;
                    var8++;
                }
                if (var3) {
                    var5.field10485 = var8;
                    var5.field10516 = true;
                    var5.field10523 = var9;
                } else {
                    var5.method5291(class459.field6686[arg2], var9, (byte) 28, var8);
                }
            } else if (var4 == 2) {
                int var10 = arg1.method156(-10160, 4);
                int var11 = var5.field3859[0];
                int var12 = var5.field3863[0];
                if (var10 == 0) {
                    var12 -= 2;
                    var11 -= 2;
                } else if (var10 == 1) {
                    var12 -= 2;
                    var11--;
                } else if (var10 == 2) {
                    var12 -= 2;
                } else if (var10 == 3) {
                    var11++;
                    var12 -= 2;
                } else if (var10 == 4) {
                    var11 += 2;
                    var12 -= 2;
                } else if (var10 == 5) {
                    var12--;
                    var11 -= 2;
                } else if (var10 == 6) {
                    var12--;
                    var11 += 2;
                } else if (var10 == 7) {
                    var11 -= 2;
                } else if (var10 == 8) {
                    var11 += 2;
                } else if (var10 == 9) {
                    var12++;
                    var11 -= 2;
                } else if (var10 == 10) {
                    var12++;
                    var11 += 2;
                } else if (var10 == 11) {
                    var11 -= 2;
                    var12 += 2;
                } else if (var10 == 12) {
                    var12 += 2;
                    var11--;
                } else if (var10 == 13) {
                    var12 += 2;
                } else if (var10 == 14) {
                    var12 += 2;
                    var11++;
                } else if (var10 == 15) {
                    var12 += 2;
                    var11 += 2;
                }
                if (var3) {
                    var5.field10516 = true;
                    var5.field10485 = var11;
                    var5.field10523 = var12;
                } else {
                    var5.method5291(class459.field6686[arg2], var12, (byte) 28, var11);
                }
            } else {
                int var13 = arg1.method156(-10160, 1);
                if (var13 == 0) {
                    int var14 = arg1.method156(-10160, 12);
                    int var15 = var14 >> 10;
                    int var16 = var14 >> 5 & 0x1F;
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = var14 & 0x1F;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field3859[0] + var16;
                    int var19 = var5.field3863[0] + var17;
                    if (var3) {
                        var5.field10516 = true;
                        var5.field10485 = var18;
                        var5.field10523 = var19;
                    } else {
                        var5.method5291(class459.field6686[arg2], var19, (byte) 28, var18);
                    }
                    var5.field6200 = var5.field6205 = (byte) (var5.field6200 + var15 & 0x3);
                    if (class231.method1980(1, var19, var18)) {
                        var5.field6205++;
                    }
                    if (class722.field10458 == arg2) {
                        if (class520.field7618 != var5.field6200) {
                            class222.field3412 = true;
                        }
                        class520.field7618 = var5.field6200;
                    }
                } else {
                    int var20 = arg1.method156(-10160, 30);
                    int var21 = var20 >> 28;
                    int var22 = var20 >> 14 & 0x3FFF;
                    if (arg0 != 43) {
                        field4152 = null;
                    }
                    int var23 = var20 & 0x3FFF;
                    int var24 = (var5.field3859[0] + class494.field7101 + var22 & 0x3FFF) - class494.field7101;
                    int var25 = (var5.field3863[0] + class281.field4219 + var23 & 0x3FFF) - class281.field4219;
                    if (var3) {
                        var5.field10523 = var25;
                        var5.field10516 = true;
                        var5.field10485 = var24;
                    } else {
                        var5.method5291(class459.field6686[arg2], var25, (byte) 28, var24);
                    }
                    var5.field6200 = var5.field6205 = (byte) (var5.field6200 + var21 & 0x3);
                    if (class231.method1980(1, var25, var24)) {
                        var5.field6205++;
                    }
                    if (class722.field10458 == arg2) {
                        class520.field7618 = var5.field6200;
                    }
                }
            }
        } catch (RuntimeException var27) {
            throw class759.method5498(var27, field4158[0] + arg0 + ',' + (arg1 == null ? field4158[3] : field4158[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2274(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2275(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
