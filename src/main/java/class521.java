import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class521 {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "[[I")
    private static int[][] field7673 = new int[5][5000];

    @OriginalMember(owner = "client!io", name = "g", descriptor = "[I")
    private static int[] field7675 = new int[1000];

    @OriginalMember(owner = "client!io", name = "c", descriptor = "[Leu;")
    private static class130[] field7671 = new class130[50];

    @OriginalMember(owner = "client!io", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field7684 = new String[1000];

    @OriginalMember(owner = "client!io", name = "r", descriptor = "[I")
    private static int[] field7686 = new int[5];

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    private static int field7691 = 0;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    private static int field7680 = 0;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    private static int field7690 = 0;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7676 = Calendar.getInstance();

    @OriginalMember(owner = "client!io", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field7694 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!io", name = "B", descriptor = "[I")
    private static int[] field7696 = new int[3];

    @OriginalMember(owner = "client!io", name = "y", descriptor = "Lfr;")
    public static class231 field7693 = new class231(4);

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    private static int field7697 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "Lpm;")
    private static class416 field7681;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Lec;")
    private static class68 field7677;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "Lec;")
    private static class68 field7685;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "[I")
    private static int[] field7687;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "[Ljava/lang/String;")
    private static String[] field7678;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()V", line = 6)
    public static final void method3070() {
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 18)
    public static final void method3071(int arg0) {
        if (arg0 == -1 || !class468.method2782(arg0, -24955)) {
            return;
        }
        class68[] var1 = class508.field7389[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class68 var3 = var1[var2];
            if (var3.field1106 != null) {
                class483 var4 = new class483();
                var4.field7100 = var3;
                var4.field7101 = var3.field1106;
                method3083(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lgn;I)V", line = 49)
    private static final void method3072(class405 arg0, int arg1) {
        field7691 = 0;
        field7690 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6147;
        int[] var4 = arg0.field6148;
        byte var5 = -1;
        field7680 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method3080(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3078(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7675[field7691++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7675[field7691++] = class327.field5160.field4822[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class327.field5160.method1931((byte) 87, field7675[--field7691], var8);
                } else if (var43 == 3) {
                    field7684[field7690++] = arg0.field6153[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7691 -= 2;
                    if (field7675[field7691 + 1] != field7675[field7691]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7691 -= 2;
                    if (field7675[field7691 + 1] == field7675[field7691]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7691 -= 2;
                    if (field7675[field7691] < field7675[field7691 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7691 -= 2;
                    if (field7675[field7691] > field7675[field7691 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7680 == 0) {
                        return;
                    }
                    class130 var9 = field7671[--field7680];
                    arg0 = var9.field2227;
                    var3 = arg0.field6147;
                    var4 = arg0.field6148;
                    var2 = var9.field2235;
                    field7687 = var9.field2237;
                    field7678 = var9.field2230;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7675[field7691++] = class327.field5160.method1886(var10, (byte) -107);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class327.field5160.method1924(field7675[--field7691], (byte) 22, var11);
                } else if (var43 == 31) {
                    field7691 -= 2;
                    if (field7675[field7691] <= field7675[field7691 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7691 -= 2;
                    if (field7675[field7691] >= field7675[field7691 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7675[field7691++] = field7687[var4[var2]];
                } else if (var43 == 34) {
                    field7687[var4[var2]] = field7675[--field7691];
                } else if (var43 == 35) {
                    field7684[field7690++] = field7678[var4[var2]];
                } else if (var43 == 36) {
                    field7678[var4[var2]] = field7684[--field7690];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7690 -= var12;
                    String var13 = class16.method82(field7690, field7684, 111, var12);
                    field7684[field7690++] = var13;
                } else if (var43 == 38) {
                    field7691--;
                } else if (var43 == 39) {
                    field7690--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class405 var15 = class351.method2253(var14, 1);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6145];
                    String[] var17 = new String[var15.field6143];
                    for (int var18 = 0; var18 < var15.field6149; var18++) {
                        var16[var18] = field7675[field7691 + var18 - var15.field6149];
                    }
                    for (int var19 = 0; var19 < var15.field6150; var19++) {
                        var17[var19] = field7684[field7690 + var19 - var15.field6150];
                    }
                    field7691 -= var15.field6149;
                    field7690 -= var15.field6150;
                    class130 var20 = new class130();
                    var20.field2227 = arg0;
                    var20.field2235 = var2;
                    var20.field2237 = field7687;
                    var20.field2230 = field7678;
                    if (field7680 >= field7671.length) {
                        throw new RuntimeException();
                    }
                    field7671[field7680++] = var20;
                    arg0 = var15;
                    var3 = var15.field6147;
                    var4 = var15.field6148;
                    var2 = -1;
                    field7687 = var16;
                    field7678 = var17;
                } else if (var43 == 42) {
                    field7675[field7691++] = class77.field1320[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class77.field1320[var21] = field7675[--field7691];
                    class526.method3120(var21, 1);
                    class361.field5604 |= class328.field5178[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7675[--field7691];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7686[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7673[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7675[--field7691];
                    if (var28 < 0 || var28 >= field7686[var27]) {
                        throw new RuntimeException();
                    }
                    field7675[field7691++] = field7673[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7691 -= 2;
                    int var30 = field7675[field7691];
                    if (var30 < 0 || var30 >= field7686[var29]) {
                        throw new RuntimeException();
                    }
                    field7673[var29][var30] = field7675[field7691 + 1];
                } else if (var43 == 47) {
                    String var31 = class366.field5698[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7684[field7690++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class366.field5698[var32] = field7684[--field7690];
                    class477.method2815(0, var32);
                } else if (var43 == 51) {
                    class407 var33 = arg0.field6146[var4[var2]];
                    class22 var34 = (class22) var33.method2516((long) field7675[--field7691], -1);
                    if (var34 != null) {
                        var2 += var34.field238;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6144 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4542).append(" ");
                for (int var41 = field7680 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7671[var41].field2227.field4542).append(" ");
                }
                var40.append("op: ").append(var5);
                class502.method2968(var40.toString(), (byte) -118, var42);
            } else {
                class467.method2774("Clientscript error in: " + arg0.field6144, (byte) 103);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6144).append("\n");
                for (int var38 = field7680 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7671[var38].field2227.field6144).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class502.method2968(var37.toString(), (byte) -109, var42);
                class333.method2097(111, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lci;)V", line = 477)
    public static final void method3073(class483 arg0) {
        method3083(arg0, 200000);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Ljava/lang/String;", line = 482)
    private static final String method3074(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7676.setTime(new Date(var1));
        int var3 = field7676.get(5);
        int var4 = field7676.get(2);
        int var5 = field7676.get(1);
        return var3 + "-" + field7694[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 500)
    private static final void method3075(int arg0) {
        class68 var1 = class22.method115(7521, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class68[] var3 = class251.field4291[var2];
        if (var3 == null) {
            class68[] var4 = class508.field7389[var2];
            int var5 = var4.length;
            var3 = class251.field4291[var2] = new class68[var5];
            class85.method611(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class85.method611(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V", line = 536)
    public static final void method3076(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ldw;II)V", line = 543)
    public static final void method3077(class403 arg0, int arg1, int arg2) {
        class405 var3 = class484.method2837(arg1, -2068975664, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field7687 = new int[var3.field6145];
        field7678 = new String[var3.field6143];
        if (class447.field6676 == var3.field6151 || class82.field1442 == var3.field6151 || class326.field5139 == var3.field6151) {
            int var4 = 0;
            int var5 = 0;
            if (class3.field27 != null) {
                var4 = class3.field27.field1118;
                var5 = class3.field27.field1127;
            }
            field7687[0] = class333.field5233.method1660(2766) - var4;
            field7687[1] = class333.field5233.method1655(-99) - var5;
        }
        method3072(var3, 200000);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IZ)V", line = 586)
    private static final void method3078(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7675[field7691++] = class470.field6968;
                return;
            }
            if (arg0 == 5001) {
                field7691 -= 3;
                class470.field6968 = field7675[field7691];
                class158.field2551 = class222.method1533(false, field7675[field7691 + 1]);
                if (class158.field2551 == null) {
                    class158.field2551 = class41.field678;
                }
                class272.field4514 = field7675[field7691 + 2];
                field7679++;
                class265.method1775(-2, class26.field400);
                class261.field4357.method163(class470.field6968, (byte) 49);
                class261.field4357.method163(class158.field2551.field1962, (byte) 49);
                class261.field4357.method163(class272.field4514, (byte) 49);
                return;
            }
            if (arg0 == 5002) {
                field7690 -= 2;
                String var2 = field7684[field7690];
                String var3 = field7684[field7690 + 1];
                field7691 -= 2;
                int var4 = field7675[field7691];
                int var5 = field7675[field7691 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field7683++;
                class265.method1775(-2, class487.field7141);
                class261.field4357.method163(class323.method2037(var2, -1) + class323.method2037(var3, -1) + 2, (byte) 49);
                class261.field4357.method145(var2, (byte) 0);
                class261.field4357.method163(var4 - 1, (byte) 49);
                class261.field4357.method163(var5, (byte) 49);
                class261.field4357.method145(var3, (byte) 0);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field7675[--field7691];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class188.field2943[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field7684[field7690++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field7675[--field7691];
                int var9 = -1;
                if (var8 < 100 && class188.field2943[var8] != null) {
                    var9 = class151.field2422[var8];
                }
                field7675[field7691++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class158.field2551 == null) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = class158.field2551.field1962;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field7684[--field7690];
                method3081(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7690 -= 2;
                String var11 = field7684[field7690];
                String var12 = field7684[field7690 + 1];
                if (class407.field6189 != 0 || (!class447.field6678 || class14.field161) && !class303.field4857) {
                    field7669++;
                    class265.method1775(-2, class484.field7109);
                    class261.field4357.method163(0, (byte) 49);
                    int var13 = class261.field4357.field301;
                    class261.field4357.method145(var11, (byte) 0);
                    class286.method1861(var12, (byte) 53, class261.field4357);
                    class261.field4357.method140(class261.field4357.field301 - var13, true);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field7675[--field7691];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class481.field7084[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field7684[field7690++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field7675[--field7691];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class200.field3181[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field7684[field7690++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field7675[--field7691];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class253.field4305[var18];
                }
                field7675[field7691++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class302.field4850 == null || class302.field4850.field2632 == null) {
                    var20 = class68.field1058;
                } else {
                    var20 = class302.field4850.method1138(true, -81);
                }
                field7684[field7690++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field7675[field7691++] = class272.field4514;
                return;
            }
            if (arg0 == 5017) {
                field7675[field7691++] = class468.field6951;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field7675[--field7691];
                int var22 = 0;
                if (var21 < 100 && class188.field2943[var21] != null) {
                    var22 = class400.field6105[var21];
                }
                field7675[field7691++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field7675[--field7691];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class140.field2328[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field7684[field7690++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class302.field4850 == null || class302.field4850.field2632 == null) {
                    var25 = class68.field1058;
                } else {
                    var25 = class302.field4850.method1144((byte) 0, false);
                }
                field7684[field7690++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field7675[--field7691];
                field7684[field7690++] = class163.field2587.method2971(5000, var26).field2125;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field7675[--field7691];
                class121 var28 = class163.field2587.method2971(5000, var27);
                if (var28.field2129 == null) {
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = var28.field2129.length;
                return;
            }
            if (arg0 == 5052) {
                field7691 -= 2;
                int var29 = field7675[field7691];
                int var30 = field7675[field7691 + 1];
                class121 var31 = class163.field2587.method2971(5000, var29);
                int var32 = var31.field2129[var30];
                field7675[field7691++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field7675[--field7691];
                class121 var34 = class163.field2587.method2971(5000, var33);
                if (var34.field2123 == null) {
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = var34.field2123.length;
                return;
            }
            if (arg0 == 5054) {
                field7691 -= 2;
                int var35 = field7675[field7691];
                int var36 = field7675[field7691 + 1];
                field7675[field7691++] = class163.field2587.method2971(5000, var35).field2123[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field7675[--field7691];
                field7684[field7690++] = class313.field4936.method2586(var37, false).method507((byte) 95);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field7675[--field7691];
                class71 var39 = class313.field4936.method2586(var38, false);
                if (var39.field1227 == null) {
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = var39.field1227.length;
                return;
            }
            if (arg0 == 5057) {
                field7691 -= 2;
                int var40 = field7675[field7691];
                int var41 = field7675[field7691 + 1];
                field7675[field7691++] = class313.field4936.method2586(var40, false).field1227[var41];
                return;
            }
            if (arg0 == 5058) {
                field7681 = new class416();
                field7681.field6310 = field7675[--field7691];
                field7681.field6307 = class313.field4936.method2586(field7681.field6310, false);
                field7681.field6311 = new int[field7681.field6307.method499((byte) -24)];
                return;
            }
            if (arg0 == 5059) {
                field7672++;
                class265.method1775(-2, class505.field7359);
                class261.field4357.method163(0, (byte) 49);
                int var42 = class261.field4357.field301;
                class261.field4357.method163(0, (byte) 49);
                class261.field4357.method182(field7681.field6310, -119);
                field7681.field6307.method510(class261.field4357, (byte) -113, field7681.field6311);
                class261.field4357.method140(class261.field4357.field301 - var42, true);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field7684[--field7690];
                field7674++;
                class265.method1775(-2, class137.field2315);
                class261.field4357.method163(0, (byte) 49);
                int var44 = class261.field4357.field301;
                class261.field4357.method145(var43, (byte) 0);
                class261.field4357.method182(field7681.field6310, -128);
                field7681.field6307.method510(class261.field4357, (byte) 16, field7681.field6311);
                class261.field4357.method140(class261.field4357.field301 - var44, true);
                return;
            }
            if (arg0 == 5061) {
                field7672++;
                class265.method1775(-2, class505.field7359);
                class261.field4357.method163(0, (byte) 49);
                int var45 = class261.field4357.field301;
                class261.field4357.method163(1, (byte) 49);
                class261.field4357.method182(field7681.field6310, -117);
                field7681.field6307.method510(class261.field4357, (byte) 44, field7681.field6311);
                class261.field4357.method140(class261.field4357.field301 - var45, true);
                return;
            }
            if (arg0 == 5062) {
                field7691 -= 2;
                int var46 = field7675[field7691];
                int var47 = field7675[field7691 + 1];
                field7675[field7691++] = class163.field2587.method2971(5000, var46).field2131[var47];
                return;
            }
            if (arg0 == 5063) {
                field7691 -= 2;
                int var48 = field7675[field7691];
                int var49 = field7675[field7691 + 1];
                field7675[field7691++] = class163.field2587.method2971(5000, var48).field2121[var49];
                return;
            }
            if (arg0 == 5064) {
                field7691 -= 2;
                int var50 = field7675[field7691];
                int var51 = field7675[field7691 + 1];
                if (var51 == -1) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = class163.field2587.method2971(5000, var50).method958(-1, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field7691 -= 2;
                int var52 = field7675[field7691];
                int var53 = field7675[field7691 + 1];
                if (var53 == -1) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = class163.field2587.method2971(5000, var52).method957((char) var53, 63);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field7675[--field7691];
                field7675[field7691++] = class313.field4936.method2586(var54, false).method499((byte) -24);
                return;
            }
            if (arg0 == 5067) {
                field7691 -= 2;
                int var55 = field7675[field7691];
                int var56 = field7675[field7691 + 1];
                int var57 = class313.field4936.method2586(var55, false).method500(var56, 0).field4586;
                field7675[field7691++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field7691 -= 2;
                int var58 = field7675[field7691];
                int var59 = field7675[field7691 + 1];
                field7681.field6311[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field7691 -= 2;
                int var60 = field7675[field7691];
                int var61 = field7675[field7691 + 1];
                field7681.field6311[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field7691 -= 3;
                int var62 = field7675[field7691];
                int var63 = field7675[field7691 + 1];
                int var64 = field7675[field7691 + 2];
                class71 var65 = class313.field4936.method2586(var62, false);
                if (var65.method500(var63, 0).field4586 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7675[field7691++] = var65.method501(var64, var63, false);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field7684[--field7690];
                boolean var67 = field7675[--field7691] == 1;
                class60.method399((byte) -103, var67, var66);
                field7675[field7691++] = class71.field1233;
                return;
            }
            if (arg0 == 5072) {
                if (class255.field4323 != null && class142.field2342 < class71.field1233) {
                    field7675[field7691++] = class255.field4323[class142.field2342++] & 0xFFFF;
                    return;
                }
                field7675[field7691++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class142.field2342 = 0;
                return;
            }
            if (arg0 == 5074) {
                field7672++;
                class265.method1775(-2, class505.field7359);
                class261.field4357.method163(0, (byte) 49);
                int var68 = class261.field4357.field301;
                class261.field4357.method163(2, (byte) 49);
                class261.field4357.method182(field7681.field6310, 23);
                field7681.field6307.method510(class261.field4357, (byte) -98, field7681.field6311);
                class261.field4357.method140(class261.field4357.field301 - var68, true);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class468.field6955.method1369(86, 26)) {
                    field7675[field7691++] = 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class468.field6955.method1369(82, 26)) {
                    field7675[field7691++] = 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class468.field6955.method1369(81, 26)) {
                    field7675[field7691++] = 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class502.method2966(true, field7675[--field7691]);
                return;
            }
            if (arg0 == 5201) {
                field7675[field7691++] = class134.method1016(-30326);
                return;
            }
            if (arg0 == 5205) {
                class386.method2424(field7675[--field7691], -1, (byte) 117, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field7675[--field7691];
                class346 var70 = class210.method1377(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = var70.field5444;
                return;
            }
            if (arg0 == 5207) {
                class346 var71 = class210.method1375(field7675[--field7691]);
                if (var71 != null && var71.field5434 != null) {
                    field7684[field7690++] = var71.field5434;
                    return;
                }
                field7684[field7690++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7675[field7691++] = class156.field2537;
                field7675[field7691++] = class14.field158;
                return;
            }
            if (arg0 == 5209) {
                field7675[field7691++] = class494.field7217 + class210.field3357;
                field7675[field7691++] = class471.field6970 + class210.field3340;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field7675[--field7691];
                class346 var73 = class210.method1375(var72);
                if (var73 == null) {
                    field7675[field7691++] = 0;
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = var73.field5443 >> 14 & 0x3FFF;
                field7675[field7691++] = var73.field5443 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field7675[--field7691];
                class346 var75 = class210.method1375(var74);
                if (var75 == null) {
                    field7675[field7691++] = 0;
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = var75.field5432 - var75.field5429;
                field7675[field7691++] = var75.field5439 - var75.field5435;
                return;
            }
            if (arg0 == 5212) {
                class366 var76 = class490.method2856(30);
                if (var76 == null) {
                    field7675[field7691++] = -1;
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = var76.field5694;
                int var77 = var76.field5691 << 28 | class210.field3357 + var76.field5692 << 14 | class210.field3340 + var76.field5690;
                field7675[field7691++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class366 var78 = class334.method2105(-5894);
                if (var78 == null) {
                    field7675[field7691++] = -1;
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = var78.field5694;
                int var79 = var78.field5691 << 28 | class210.field3357 + var78.field5692 << 14 | class210.field3340 + var78.field5690;
                field7675[field7691++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field7675[--field7691];
                class346 var81 = class16.method79(false);
                if (var81 != null) {
                    boolean var82 = var81.method2232(var80 >> 28 & 0x3, (byte) 58, field7696, var80 >> 14 & 0x3FFF, var80 & 0x3FFF);
                    if (var82) {
                        class4.method15(field7696[2], field7696[1], (byte) 23);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7691 -= 2;
                int var83 = field7675[field7691];
                int var84 = field7675[field7691 + 1];
                class516 var85 = class210.method1386(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class346 var87 = (class346) var85.method3056(125); var87 != null; var87 = (class346) var85.method3053(-100)) {
                    if (var87.field5444 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field7675[field7691++] = 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field7675[--field7691];
                class346 var89 = class210.method1375(var88);
                if (var89 == null) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = var89.field5437;
                return;
            }
            if (arg0 == 5220) {
                field7675[field7691++] = class57.field900 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field7675[--field7691];
                class4.method15(var90 & 0x3FFF, var90 >> 14 & 0x3FFF, (byte) 23);
                return;
            }
            if (arg0 == 5222) {
                class346 var91 = class16.method79(false);
                if (var91 != null) {
                    boolean var92 = var91.method2230(class471.field6970 + class210.field3340, true, class494.field7217 + class210.field3357, field7696);
                    if (var92) {
                        field7675[field7691++] = field7696[1];
                        field7675[field7691++] = field7696[2];
                        return;
                    }
                    field7675[field7691++] = -1;
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = -1;
                field7675[field7691++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7691 -= 2;
                int var93 = field7675[field7691];
                int var94 = field7675[field7691 + 1];
                class386.method2424(var93, var94 >> 14 & 0x3FFF, (byte) 122, var94 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field7675[--field7691];
                class346 var96 = class16.method79(false);
                if (var96 != null) {
                    boolean var97 = var96.method2232(var95 >> 28 & 0x3, (byte) 58, field7696, var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                    if (var97) {
                        field7675[field7691++] = field7696[1];
                        field7675[field7691++] = field7696[2];
                        return;
                    }
                    field7675[field7691++] = -1;
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = -1;
                field7675[field7691++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field7675[--field7691];
                class346 var99 = class16.method79(false);
                if (var99 != null) {
                    boolean var100 = var99.method2230(var98 & 0x3FFF, true, var98 >> 14 & 0x3FFF, field7696);
                    if (var100) {
                        field7675[field7691++] = field7696[1];
                        field7675[field7691++] = field7696[2];
                        return;
                    }
                    field7675[field7691++] = -1;
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = -1;
                field7675[field7691++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class361.method2311((byte) 70, field7675[--field7691]);
                return;
            }
            if (arg0 == 5227) {
                field7691 -= 2;
                int var101 = field7675[field7691];
                int var102 = field7675[field7691 + 1];
                class386.method2424(var101, var102 >> 14 & 0x3FFF, (byte) 126, var102 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class106.field1902 = field7675[--field7691] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7675[field7691++] = class106.field1902 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field7675[--field7691];
                class100.method693(0, var103);
                return;
            }
            if (arg0 == 5231) {
                field7691 -= 2;
                int var104 = field7675[field7691];
                boolean var105 = field7675[field7691 + 1] == 1;
                if (client.field1183 != null) {
                    class276 var106 = client.field1183.method2516((long) var104, -1);
                    if (var106 != null && !var105) {
                        var106.method1821((byte) -87);
                        return;
                    }
                    if (var106 == null && var105) {
                        class276 var107 = new class276();
                        client.field1183.method2517(var107, (long) var104, (byte) -122);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field7675[--field7691];
                if (client.field1183 != null) {
                    class276 var109 = client.field1183.method2516((long) var108, -1);
                    field7675[field7691++] = var109 == null ? 0 : 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7691 -= 2;
                int var110 = field7675[field7691];
                boolean var111 = field7675[field7691 + 1] == 1;
                if (class262.field4366 != null) {
                    class276 var112 = class262.field4366.method2516((long) var110, -1);
                    if (var112 != null && !var111) {
                        var112.method1821((byte) -110);
                        return;
                    }
                    if (var112 == null && var111) {
                        class276 var113 = new class276();
                        class262.field4366.method2517(var113, (long) var110, (byte) 40);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field7675[--field7691];
                if (class262.field4366 != null) {
                    class276 var115 = class262.field4366.method2516((long) var114, -1);
                    field7675[field7691++] = var115 == null ? 0 : 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7675[field7691++] = class210.field3321 == null ? -1 : class210.field3321.field5444;
                return;
            }
            if (arg0 == 5236) {
                field7691 -= 2;
                int var116 = field7675[field7691];
                int var117 = field7675[field7691 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class252.method1720((byte) 126, var116, var118, var119);
                if (var120 < 0) {
                    field7675[field7691++] = -1;
                    return;
                }
                field7675[field7691++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class473.method2800(true);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7691 -= 2;
                int var121 = field7675[field7691];
                int var122 = field7675[field7691 + 1];
                class142.method1049(var122, 3, false, (byte) -121, var121);
                field7675[field7691++] = class422.field6374 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class422.field6374 != null) {
                    class142.method1049(-1, class510.field7403.field5120, false, (byte) -109, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class502[] var123 = class26.method192((byte) -98);
                field7675[field7691++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field7675[--field7691];
                class502[] var125 = class26.method192((byte) -17);
                field7675[field7691++] = var125[var124].field7332;
                field7675[field7691++] = var125[var124].field7330;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class510.field7403.field5089;
                int var127 = class510.field7403.field5099;
                int var128 = -1;
                class502[] var129 = class26.method192((byte) -116);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class502 var131 = var129[var130];
                    if (var131.field7332 == var126 && var131.field7330 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field7675[field7691++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field7675[field7691++] = class287.method1865((byte) 100);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field7675[--field7691];
                if (var132 >= 1 && var132 <= 2) {
                    class142.method1049(-1, var132, false, (byte) -120, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7675[field7691++] = class510.field7403.field5120;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field7675[--field7691];
                if (var133 >= 1 && var133 <= 2) {
                    class510.field7403.field5120 = var133;
                    class510.field7403.method1190(class419.field6342, false);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7690 -= 2;
                String var134 = field7684[field7690];
                String var135 = field7684[field7690 + 1];
                int var136 = field7675[--field7691];
                field7688++;
                class265.method1775(-2, class526.field7755);
                class261.field4357.method163(class323.method2037(var134, -1) + class323.method2037(var135, -1) + 1, (byte) 49);
                class261.field4357.method145(var134, (byte) 0);
                class261.field4357.method145(var135, (byte) 0);
                class261.field4357.method163(var136, (byte) 49);
                return;
            }
            if (arg0 == 5401) {
                field7691 -= 2;
                class243.field4172[field7675[field7691]] = (short) class125.method981(-218, field7675[field7691 + 1]);
                class20.field218.method2217((byte) -127);
                class20.field218.method2212((byte) 112);
                class22.field239.method1088((byte) -104);
                class408.method2530(17234);
                return;
            }
            if (arg0 == 5405) {
                field7691 -= 2;
                int var137 = field7675[field7691];
                int var138 = field7675[field7691 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class12.field142[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7691 -= 7;
                int var139 = field7675[field7691];
                int var140 = field7675[field7691 + 1] << 1;
                int var141 = field7675[field7691 + 2];
                int var142 = field7675[field7691 + 3];
                int var143 = field7675[field7691 + 4];
                int var144 = field7675[field7691 + 5];
                int var145 = field7675[field7691 + 6];
                if (var139 >= 0 && var139 < 2 && class12.field142[var139] != null && var140 >= 0 && var140 < class12.field142[var139].length) {
                    class12.field142[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class12.field142[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class12.field142[field7675[--field7691]].length >> 1;
                field7675[field7691++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class422.field6374 != null) {
                    class142.method1049(-1, class510.field7403.field5120, false, (byte) -127, -1);
                }
                if (class346.field5450 != null) {
                    class249.method1687(false);
                    System.exit(0);
                    return;
                }
                String var147 = class252.field4300 == null ? class339.method2145((byte) 125) : class252.field4300;
                class317.method2014((byte) -120, class511.field7485 == 1, var147, class419.field6342, false);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class357.field5561 != null) {
                    if (class357.field5561.field2695 == null) {
                        var148 = class364.method2325(class357.field5561.field2696, true);
                    } else {
                        var148 = (String) class357.field5561.field2695;
                    }
                }
                field7684[field7690++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field7675[field7691++] = class493.field7198 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class422.field6374 != null) {
                    class142.method1049(-1, class510.field7403.field5120, false, (byte) -120, -1);
                }
                String var149 = field7684[--field7690];
                boolean var150 = field7675[--field7691] == 1;
                String var151 = class339.method2145((byte) 125) + var149;
                class317.method2014((byte) -90, class511.field7485 == 1, var151, class419.field6342, var150);
                return;
            }
            if (arg0 == 5422) {
                field7690 -= 2;
                String var152 = field7684[field7690];
                String var153 = field7684[field7690 + 1];
                int var154 = field7675[--field7691];
                if (var152.length() > 0) {
                    if (class362.field5642 == null) {
                        class362.field5642 = new String[class331.field5209[class271.field4501.field7866]];
                    }
                    class362.field5642[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class481.field7082 == null) {
                        class481.field7082 = new String[class331.field5209[class271.field4501.field7866]];
                    }
                    class481.field7082[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7684[--field7690]);
                return;
            }
            if (arg0 == 5424) {
                field7691 -= 11;
                class4.field40 = field7675[field7691];
                class402.field6115 = field7675[field7691 + 1];
                class203.field3211 = field7675[field7691 + 2];
                class533.field7841 = field7675[field7691 + 3];
                class448.field6683 = field7675[field7691 + 4];
                class137.field2312 = field7675[field7691 + 5];
                class533.field7843 = field7675[field7691 + 6];
                class137.field2307 = field7675[field7691 + 7];
                class101.field1680 = field7675[field7691 + 8];
                class94.field1589 = field7675[field7691 + 9];
                class53.field860 = field7675[field7691 + 10];
                class536.field7881.method2929(class448.field6683, -67);
                class536.field7881.method2929(class137.field2312, -105);
                class536.field7881.method2929(class533.field7843, -112);
                class536.field7881.method2929(class137.field2307, -57);
                class536.field7881.method2929(class101.field1680, -93);
                class534.field7849 = null;
                class15.field167 = null;
                class2.field12 = null;
                class497.field7295 = null;
                class178.field2825 = null;
                class61.field925 = null;
                class317.field4981 = null;
                class299.field4800 = null;
                class331.field5216 = true;
                return;
            }
            if (arg0 == 5425) {
                class481.method2830(-99);
                class331.field5216 = false;
                return;
            }
            if (arg0 == 5426) {
                field7691 -= 2;
                class106.field1900 = field7675[field7691];
                class21.field229 = field7675[field7691 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7691 -= 2;
                class124.field2168 = field7675[field7691 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7691 -= 2;
                int var155 = field7675[field7691];
                int var156 = field7675[field7691 + 1];
                field7675[field7691++] = class408.method2527(-25286, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class320.method2029(field7684[--field7690], false, (byte) 106, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class456.method2735(-27001, "accountcreated", class419.field6342.field7203);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7691 -= 4;
                int var157 = field7675[field7691];
                int var158 = field7675[field7691 + 1];
                int var159 = field7675[field7691 + 2];
                int var160 = field7675[field7691 + 3];
                class191.method1287(var159, (var157 & 0x3FFF) - class455.field6794, var158, false, (var157 >> 14 & 0x3FFF) - class16.field181, var160, 128);
                return;
            }
            if (arg0 == 5501) {
                field7691 -= 4;
                int var161 = field7675[field7691];
                int var162 = field7675[field7691 + 1];
                int var163 = field7675[field7691 + 2];
                int var164 = field7675[field7691 + 3];
                class517.method3065(var164, var163, -123, var162, (var161 >> 14 & 0x3FFF) - class16.field181, (var161 & 0x3FFF) - class455.field6794);
                return;
            }
            if (arg0 == 5502) {
                field7691 -= 6;
                int var165 = field7675[field7691];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class328.field5176 = var165;
                int var166 = field7675[field7691 + 1];
                if (var166 + 1 >= class12.field142[class328.field5176].length >> 1) {
                    throw new RuntimeException();
                }
                class67.field991 = var166;
                class439.field6560 = 0;
                class282.field4616 = field7675[field7691 + 2];
                class530.field7786 = field7675[field7691 + 3];
                int var167 = field7675[field7691 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class112.field1977 = var167;
                int var168 = field7675[field7691 + 5];
                if (var168 + 1 >= class12.field142[class112.field1977].length >> 1) {
                    throw new RuntimeException();
                }
                class272.field4510 = var168;
                class190.field2963 = 3;
                return;
            }
            if (arg0 == 5503) {
                class100.method692((byte) 29);
                return;
            }
            if (arg0 == 5504) {
                field7691 -= 2;
                class244.method1666(0, 3, field7675[field7691], field7675[field7691 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field7675[field7691++] = (int) class509.field7395 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7675[field7691++] = (int) class88.field1483 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class338.method2139((byte) -111);
                return;
            }
            if (arg0 == 5508) {
                class170.method1155(58);
                return;
            }
            if (arg0 == 5509) {
                class167.method1153((byte) 113);
                return;
            }
            if (arg0 == 5510) {
                class228.method1583(106);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field7675[--field7691];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class16.field181;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class217.field3775) {
                    var172 = class217.field3775;
                }
                int var173 = var171 - class455.field6794;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class277.field4548) {
                    var173 = class277.field4548;
                }
                class296.field4782 = (var172 << 7) + 64;
                class535.field7865 = (var173 << 7) + 64;
                class190.field2963 = 4;
                return;
            }
            if (arg0 == 5512) {
                client.method478(-19775);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7690 -= 2;
                String var174 = field7684[field7690];
                String var175 = field7684[field7690 + 1];
                int var176 = field7675[--field7691];
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    class68.field1058 = var174;
                    class533.field7837 = var175;
                    class111.field1965 = var176;
                    class75.method540(-7, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class53.method368((byte) -20);
                return;
            }
            if (arg0 == 5602) {
                if (class350.field5480 == 0) {
                    class296.field4781 = -2;
                    class23.field300 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7691 -= 4;
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    class165.method1129(field7675[field7691], field7675[field7691 + 2], field7675[field7691 + 3], field7675[field7691 + 1], (byte) -69);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7690--;
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    class17.method86(class509.method2991(field7684[field7690], (byte) 105), true);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7690 -= 2;
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    class285.method1857(class509.method2991(field7684[field7690], (byte) 63), -19084, field7684[field7690 + 1], false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class266.field4460 == 0) {
                    class23.field311 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7675[field7691++] = class23.field300;
                return;
            }
            if (arg0 == 5608) {
                field7675[field7691++] = class461.field6857;
                return;
            }
            if (arg0 == 5609) {
                field7675[field7691++] = class23.field311;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field7684[field7690++] = class40.field669.length > var177 ? class516.method3057(86, class40.field669[var177]) : "";
                }
                class40.field669 = null;
                return;
            }
            if (arg0 == 5611) {
                field7675[field7691++] = class140.field2330;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field7675[--field7691];
                if (class32.field515 != 6) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    if (class463.field6886 != null) {
                        class463.field6886.method2804(true);
                        class463.field6886 = null;
                    }
                    class111.field1965 = var178;
                    class75.method540(-7, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7675[field7691++] = class23.field300;
                return;
            }
            if (arg0 == 5615) {
                field7690 -= 2;
                String var179 = field7684[field7690];
                String var180 = field7684[field7690 + 1];
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    if (class463.field6886 != null) {
                        class463.field6886.method2804(true);
                        class463.field6886 = null;
                    }
                    class68.field1058 = var179;
                    class533.field7837 = var180;
                    class75.method540(-7, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class165.method1132(false, false);
                return;
            }
            if (arg0 == 5617) {
                field7675[field7691++] = class296.field4781;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field7675[--field7691];
                class525.method3103(-1, false, var181);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field7675[--field7691];
                class525.method3103(-1, true, var182);
                return;
            }
            if (arg0 == 5620) {
                class49.method351(109);
                if (class139.field2321 != "" && class139.field2321 != "") {
                    field7675[field7691++] = 1;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7690 -= 2;
                if (class32.field515 != 2) {
                    return;
                }
                if (class350.field5480 == 0 && class266.field4460 == 0) {
                    class285.method1857(class509.method2991(field7684[field7690], (byte) 80), -19084, field7684[field7690 + 1], true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class169 var183 = class419.field6342.method2890(false, "3", false);
                while (var183.field2692 == 0) {
                    class444.method2667(-28210, 1L);
                }
                if (var183.field2692 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class62 var184 = (class62) var183.field2695;
                if (var184.method413(-1).exists()) {
                    class23 var185 = new class23(50);
                    try {
                        var184.method408(0, 50, 0, var185.field302);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method410((byte) 47);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field7675[--field7691];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class510.field7403.field5108 = var186;
                class67.method434(-115);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6002) {
                class510.field7403.method1194(field7675[--field7691] == 1, -127);
                class67.method434(-69);
                class160.method1113(0);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6003) {
                class510.field7403.field5123 = field7675[--field7691] == 1;
                class160.method1113(0);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6005) {
                class510.field7403.field5118 = field7675[--field7691] == 1;
                class67.method434(-78);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6006) {
                class510.field7403.field5103 = field7675[--field7691] == 1;
                class305.field4873.method900(!class510.field7403.field5103);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6007) {
                class510.field7403.field5106 = field7675[--field7691];
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6008) {
                class510.field7403.field5122 = field7675[--field7691] == 1;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6009) {
                class510.field7403.field5096 = field7675[--field7691] == 1;
                class67.method434(-81);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6010) {
                class510.field7403.field5112 = field7675[--field7691] == 1;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field7675[--field7691];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class510.field7403.method2040(true, var187, class511.field7485);
                class67.method434(-106);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6012) {
                class510.field7403.method2043(true, field7675[--field7691] == 1, class511.field7485);
                class494.method2906(-5419);
                class171.method1160(-19854);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6014) {
                class510.field7403.field5111 = field7675[--field7691] == 1;
                class67.method434(-59);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6015) {
                class510.field7403.field5101 = field7675[--field7691] == 1;
                class67.method434(-74);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field7675[--field7691];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class510.field7403.field5093 = var188;
                class86.method616(class511.field7485, 1);
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6017) {
                class510.field7403.field5094 = field7675[--field7691] == 1;
                class137.method1028(true);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field7675[--field7691];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class510.field7403.field5119 = var189;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field7675[--field7691];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class510.field7403.field5087 != var190) {
                    if (class510.field7403.field5087 == 0 && class282.field4615 != -1) {
                        class264.method1763(1, class29.field472, false, var190, class282.field4615, 0);
                        class151.field2419 = false;
                    } else if (var190 == 0) {
                        class424.method2599(10619);
                        class151.field2419 = false;
                    } else {
                        class382.method2411(var190, (byte) -56);
                    }
                    class510.field7403.field5087 = var190;
                }
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field7675[--field7691];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class510.field7403.field5121 = var191;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6021) {
                class510.field7403.field2787 = field7675[--field7691] == 1;
                class160.method1113(0);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field7675[--field7691];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class101.field1668 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class442.method2664(var192, 0);
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                field7675[field7691++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field7675[--field7691];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class510.field7403.field5124 = var194;
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field7675[--field7691];
                if (var195 < 0 || var195 > class455.method2731((byte) -97, class101.field1668)) {
                    var195 = 0;
                }
                class510.field7403.field5104 = var195;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field7675[--field7691];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class277.method1825(var196 == 1, (byte) 54);
                return;
            }
            if (arg0 == 6028) {
                class510.field7403.field5109 = field7675[--field7691] != 0;
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6029) {
                class510.field7403.field5106 = field7675[--field7691];
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6030) {
                class510.field7403.field5100 = field7675[--field7691] != 0;
                class510.field7403.method1190(class419.field6342, false);
                class67.method434(-64);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field7675[--field7691];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class86.method616(var197, -122);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field7675[--field7691];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class510.field7403.field5095 = var198;
                class510.field7403.method1190(class419.field6342, false);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field7675[--field7691];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class510.field7403.field5114 = var199;
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6034) {
                class510.field7403.field5125 = field7675[--field7691] == 1;
                class510.field7403.method1190(class419.field6342, false);
                class494.method2906(-5419);
                class40.field668 = false;
                return;
            }
            if (arg0 == 6035) {
                class510.field7403.field2801 = field7675[--field7691] == 1;
                class67.method434(-89);
                class160.method1113(0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7675[field7691++] = class510.field7403.field5108;
                return;
            }
            if (arg0 == 6102) {
                field7675[field7691++] = class510.field7403.method1186(class511.field7485, -72) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7675[field7691++] = class510.field7403.field5123 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7675[field7691++] = class510.field7403.field5118 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7675[field7691++] = class510.field7403.field5103 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7675[field7691++] = class510.field7403.field5106;
                return;
            }
            if (arg0 == 6108) {
                field7675[field7691++] = class510.field7403.field5122 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7675[field7691++] = class510.field7403.field5096 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7675[field7691++] = class510.field7403.field5112 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7675[field7691++] = class510.field7403.method2041(125, class511.field7485);
                return;
            }
            if (arg0 == 6112) {
                field7675[field7691++] = class510.field7403.method2045(4, class511.field7485) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7675[field7691++] = class510.field7403.field5111 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7675[field7691++] = class510.field7403.field5101 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7675[field7691++] = class510.field7403.field5093;
                return;
            }
            if (arg0 == 6117) {
                field7675[field7691++] = class510.field7403.field5094 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7675[field7691++] = class510.field7403.field5119;
                return;
            }
            if (arg0 == 6119) {
                field7675[field7691++] = class510.field7403.field5087;
                return;
            }
            if (arg0 == 6120) {
                field7675[field7691++] = class510.field7403.field5121;
                return;
            }
            if (arg0 == 6121) {
                field7675[field7691++] = class305.field4873.method807() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7675[field7691++] = class39.method281(0);
                return;
            }
            if (arg0 == 6124) {
                field7675[field7691++] = class510.field7403.field5124;
                return;
            }
            if (arg0 == 6125) {
                field7675[field7691++] = class510.field7403.field5104;
                return;
            }
            if (arg0 == 6126) {
                field7675[field7691++] = class305.field4873.method817() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7675[field7691++] = class510.field7403.field5115 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7675[field7691++] = class510.field7403.field5109 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7675[field7691++] = class510.field7403.field5106;
                return;
            }
            if (arg0 == 6130) {
                field7675[field7691++] = class510.field7403.field5100 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7675[field7691++] = class511.field7485;
                return;
            }
            if (arg0 == 6132) {
                field7675[field7691++] = class510.field7403.field5095;
                return;
            }
            if (arg0 == 6133) {
                field7675[field7691++] = class493.field7198 == 1 || class493.field7198 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7675[field7691++] = class455.method2731((byte) -126, class101.field1668);
                return;
            }
            if (arg0 == 6135) {
                field7675[field7691++] = class510.field7403.field5114;
                return;
            }
            if (arg0 == 6136) {
                field7675[field7691++] = class510.field7403.field5125 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field7675[field7691++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7691 -= 2;
                class504.field7351 = (short) field7675[field7691];
                if (class504.field7351 <= 0) {
                    class504.field7351 = 256;
                }
                class154.field2509 = (short) field7675[field7691 + 1];
                if (class154.field2509 <= 0) {
                    class154.field2509 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7691 -= 2;
                class23.field275 = (short) field7675[field7691];
                if (class23.field275 <= 0) {
                    class23.field275 = 256;
                }
                class466.field6924 = (short) field7675[field7691 + 1];
                if (class466.field6924 <= 0) {
                    class466.field6924 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7691 -= 4;
                class412.field6248 = (short) field7675[field7691];
                if (class412.field6248 <= 0) {
                    class412.field6248 = 1;
                }
                class311.field4924 = (short) field7675[field7691 + 1];
                if (class311.field4924 <= 0) {
                    class311.field4924 = 32767;
                } else if (class311.field4924 < class412.field6248) {
                    class311.field4924 = class412.field6248;
                }
                class497.field7300 = (short) field7675[field7691 + 2];
                if (class497.field7300 <= 0) {
                    class497.field7300 = 1;
                }
                class393.field6012 = (short) field7675[field7691 + 3];
                if (class393.field6012 <= 0) {
                    class393.field6012 = 32767;
                    return;
                }
                if (class393.field6012 < class497.field7300) {
                    class393.field6012 = class497.field7300;
                }
                return;
            }
            if (arg0 == 6203) {
                class154.method1081(0, 0, class446.field6673.field1081, 255, false, class446.field6673.field1009);
                field7675[field7691++] = class455.field6793;
                field7675[field7691++] = class432.field6467;
                return;
            }
            if (arg0 == 6204) {
                field7675[field7691++] = class23.field275;
                field7675[field7691++] = class466.field6924;
                return;
            }
            if (arg0 == 6205) {
                field7675[field7691++] = class504.field7351;
                field7675[field7691++] = class154.field2509;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7675[field7691++] = (int) (class19.method91((byte) 97) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7675[field7691++] = (int) (class19.method91((byte) 124) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7691 -= 3;
                int var201 = field7675[field7691];
                int var202 = field7675[field7691 + 1];
                int var203 = field7675[field7691 + 2];
                field7676.clear();
                field7676.set(11, 12);
                field7676.set(var203, var202, var201);
                int var204 = (int) (field7676.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field7675[field7691++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field7676.clear();
                field7676.setTime(new Date(class19.method91((byte) 84)));
                field7675[field7691++] = field7676.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field7675[--field7691];
                boolean var206 = true;
                if (var205 < 0) {
                    var206 = (var205 + 1) % 4 == 0;
                } else if (var205 < 1582) {
                    var206 = var205 % 4 == 0;
                } else if (var205 % 4 != 0) {
                    var206 = false;
                } else if (var205 % 100 != 0) {
                    var206 = true;
                } else if (var205 % 400 != 0) {
                    var206 = false;
                }
                field7675[field7691++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7675[field7691++] = class438.method2648(false) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7675[field7691++] = class199.method1321(-121) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class32.field515 == 6 && class350.field5480 == 0 && class266.field4460 == 0) {
                    if (class202.field3203) {
                        field7675[field7691++] = 0;
                        return;
                    }
                    if (class3.field31 > class19.method91((byte) 112) - 1000L) {
                        field7675[field7691++] = 1;
                        return;
                    }
                    class202.field3203 = true;
                    class265.method1775(-2, class528.field7773);
                    class261.field4357.method152(class193.field3014, (byte) -38);
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class239 var207 = class145.method1056((byte) 108);
                if (var207 != null) {
                    field7675[field7691++] = var207.field4128;
                    field7675[field7691++] = var207.field4982;
                    field7684[field7690++] = var207.field4127;
                    class2 var208 = var207.method1641(-12531);
                    field7675[field7691++] = var208.field15;
                    field7684[field7690++] = var208.field13;
                    field7675[field7691++] = var207.field4983;
                    field7675[field7691++] = var207.field4123;
                    field7684[field7690++] = var207.field4119;
                    return;
                }
                field7675[field7691++] = -1;
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                return;
            }
            if (arg0 == 6502) {
                class239 var209 = class403.method2499(-1);
                if (var209 != null) {
                    field7675[field7691++] = var209.field4128;
                    field7675[field7691++] = var209.field4982;
                    field7684[field7690++] = var209.field4127;
                    class2 var210 = var209.method1641(-12531);
                    field7675[field7691++] = var210.field15;
                    field7684[field7690++] = var210.field13;
                    field7675[field7691++] = var209.field4983;
                    field7675[field7691++] = var209.field4123;
                    field7684[field7690++] = var209.field4119;
                    return;
                }
                field7675[field7691++] = -1;
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field7675[--field7691];
                String var212 = field7684[--field7690];
                if (class32.field515 == 6 && class350.field5480 == 0 && class266.field4460 == 0) {
                    field7675[field7691++] = class463.method2761(var211, var212, false) ? 1 : 0;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class510.field7403.field5113 = field7675[--field7691];
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6505) {
                field7675[field7691++] = class510.field7403.field5113;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field7675[--field7691];
                class239 var214 = class313.method1987((byte) 116, var213);
                if (var214 != null) {
                    field7675[field7691++] = var214.field4982;
                    field7684[field7690++] = var214.field4127;
                    class2 var215 = var214.method1641(-12531);
                    field7675[field7691++] = var215.field15;
                    field7684[field7690++] = var215.field13;
                    field7675[field7691++] = var214.field4983;
                    field7675[field7691++] = var214.field4123;
                    field7684[field7690++] = var214.field4119;
                    return;
                }
                field7675[field7691++] = -1;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                field7675[field7691++] = 0;
                field7675[field7691++] = 0;
                field7684[field7690++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7691 -= 4;
                int var216 = field7675[field7691];
                boolean var217 = field7675[field7691 + 1] == 1;
                int var218 = field7675[field7691 + 2];
                boolean var219 = field7675[field7691 + 3] == 1;
                class155.method1083(var218, var216, (byte) -109, var217, var219);
                return;
            }
            if (arg0 == 6508) {
                class76.method544(true);
                return;
            }
            if (arg0 == 6509) {
                if (class32.field515 != 6) {
                    return;
                }
                class517.field7654 = field7675[--field7691] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class510.field7403.field5116 = field7675[--field7691] == 1;
                class510.field7403.method1190(class419.field6342, false);
                return;
            }
            if (arg0 == 6601) {
                field7675[field7691++] = class510.field7403.field5116 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class95.field1601 == class511.field7483) {
            if (arg0 == 6700) {
                int var220 = class259.field4346.method2521((byte) -58);
                if (class379.field5881 != -1) {
                    var220++;
                }
                field7675[field7691++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field7675[--field7691];
                if (class379.field5881 != -1) {
                    if (var221 == 0) {
                        field7675[field7691++] = class379.field5881;
                        return;
                    }
                    var221--;
                }
                class52 var222 = (class52) class259.field4346.method2518(59);
                while (var221-- > 0) {
                    var222 = (class52) class259.field4346.method2524(0);
                }
                field7675[field7691++] = var222.field841;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field7675[--field7691];
                if (class508.field7389[var223] == null) {
                    field7684[field7690++] = "";
                    return;
                }
                String var224 = class508.field7389[var223][0].field1147;
                if (var224 == null) {
                    field7684[field7690++] = "";
                    return;
                }
                field7684[field7690++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field7675[--field7691];
                if (class508.field7389[var225] == null) {
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = class508.field7389[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field7691 -= 2;
                int var226 = field7675[field7691];
                int var227 = field7675[field7691 + 1];
                if (class508.field7389[var226] == null) {
                    field7684[field7690++] = "";
                    return;
                }
                String var228 = class508.field7389[var226][var227].field1147;
                if (var228 == null) {
                    field7684[field7690++] = "";
                    return;
                }
                field7684[field7690++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field7691 -= 2;
                int var229 = field7675[field7691];
                int var230 = field7675[field7691 + 1];
                if (class508.field7389[var229] == null) {
                    field7675[field7691++] = 0;
                    return;
                }
                field7675[field7691++] = class508.field7389[var229][var230].field1002;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7691 -= 3;
                int var231 = field7675[field7691];
                int var232 = field7675[field7691 + 1];
                int var233 = field7675[field7691 + 2];
                class41.method305(var233, "", var231 << 16 | var232, -5, 1);
                return;
            }
            if (arg0 == 6708) {
                field7691 -= 3;
                int var234 = field7675[field7691];
                int var235 = field7675[field7691 + 1];
                int var236 = field7675[field7691 + 2];
                class41.method305(var236, "", var234 << 16 | var235, -5, 2);
                return;
            }
            if (arg0 == 6709) {
                field7691 -= 3;
                int var237 = field7675[field7691];
                int var238 = field7675[field7691 + 1];
                int var239 = field7675[field7691 + 2];
                class41.method305(var239, "", var237 << 16 | var238, -5, 3);
                return;
            }
            if (arg0 == 6710) {
                field7691 -= 3;
                int var240 = field7675[field7691];
                int var241 = field7675[field7691 + 1];
                int var242 = field7675[field7691 + 2];
                class41.method305(var242, "", var240 << 16 | var241, -5, 4);
                return;
            }
            if (arg0 == 6711) {
                field7691 -= 3;
                int var243 = field7675[field7691];
                int var244 = field7675[field7691 + 1];
                int var245 = field7675[field7691 + 2];
                class41.method305(var245, "", var243 << 16 | var244, -5, 5);
                return;
            }
            if (arg0 == 6712) {
                field7691 -= 3;
                int var246 = field7675[field7691];
                int var247 = field7675[field7691 + 1];
                int var248 = field7675[field7691 + 2];
                class41.method305(var248, "", var246 << 16 | var247, -5, 6);
                return;
            }
            if (arg0 == 6713) {
                field7691 -= 3;
                int var249 = field7675[field7691];
                int var250 = field7675[field7691 + 1];
                int var251 = field7675[field7691 + 2];
                class41.method305(var251, "", var249 << 16 | var250, -5, 7);
                return;
            }
            if (arg0 == 6714) {
                field7691 -= 3;
                int var252 = field7675[field7691];
                int var253 = field7675[field7691 + 1];
                int var254 = field7675[field7691 + 2];
                class41.method305(var254, "", var252 << 16 | var253, -5, 8);
                return;
            }
            if (arg0 == 6715) {
                field7691 -= 3;
                int var255 = field7675[field7691];
                int var256 = field7675[field7691 + 1];
                int var257 = field7675[field7691 + 2];
                class41.method305(var257, "", var255 << 16 | var256, -5, 9);
                return;
            }
            if (arg0 == 6716) {
                field7691 -= 3;
                int var258 = field7675[field7691];
                int var259 = field7675[field7691 + 1];
                int var260 = field7675[field7691 + 2];
                class41.method305(var260, "", var258 << 16 | var259, -5, 10);
                return;
            }
            if (arg0 == 6717) {
                field7691 -= 3;
                int var261 = field7675[field7691];
                int var262 = field7675[field7691 + 1];
                int var263 = field7675[field7691 + 2];
                class68 var264 = class453.method2708(var261 << 16 | var262, 86, var263);
                class467.method2772(false);
                class314 var265 = client.method475(var264);
                class121.method952(67, var265.method1988(-20539), var265.field4949, var264);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field7675[--field7691];
                class445 var267 = class94.field1585.method492(var266, (byte) -10);
                if (var267.field6629 == null) {
                    field7684[field7690++] = "";
                    return;
                }
                field7684[field7690++] = var267.field6629;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field7675[--field7691];
                class445 var269 = class94.field1585.method492(var268, (byte) -10);
                field7675[field7691++] = var269.field6653;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field7675[--field7691];
                class445 var271 = class94.field1585.method492(var270, (byte) -10);
                field7675[field7691++] = var271.field6611;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field7675[--field7691];
                class445 var273 = class94.field1585.method492(var272, (byte) -10);
                field7675[field7691++] = var273.field6613;
                return;
            }
            if (arg0 == 6804) {
                field7691 -= 2;
                int var274 = field7675[field7691];
                int var275 = field7675[field7691 + 1];
                class223 var276 = class213.field3383.method2258(true, var275);
                if (var276.method1537(-3685)) {
                    field7684[field7690++] = class94.field1585.method492(var274, (byte) -10).method2674(var275, 122, var276.field3848);
                    return;
                }
                field7675[field7691++] = class94.field1585.method492(var274, (byte) -10).method2679((byte) 126, var275, var276.field3853);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7675[field7691++] = class447.field6678 && !class14.field161 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7675[field7691++] = class135.field2293;
                return;
            }
            if (arg0 == 6902) {
                field7675[field7691++] = class446.field6665;
                return;
            }
            if (arg0 == 6903) {
                field7675[field7691++] = class309.field4913;
                return;
            }
            if (arg0 == 6904) {
                field7675[field7691++] = class16.field186;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class357.field5561 != null) {
                    if (class357.field5561.field2695 == null) {
                        var277 = class364.method2325(class357.field5561.field2696, true);
                    } else {
                        var277 = (String) class357.field5561.field2695;
                    }
                }
                field7684[field7690++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field7675[field7691++] = class59.field915;
                return;
            }
            if (arg0 == 6907) {
                field7675[field7691++] = class268.field4473;
                return;
            }
            if (arg0 == 6908) {
                field7675[field7691++] = class10.field111;
                return;
            }
            if (arg0 == 6909) {
                field7675[field7691++] = class264.field4406 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7675[field7691++] = class471.field6990;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V", line = 3824)
    private static final void method3079(int arg0) {
        class68 var1 = class22.method115(7521, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class68[] var3 = class251.field4291[var2];
        if (var3 == null) {
            class68[] var4 = class508.field7389[var2];
            int var5 = var4.length;
            var3 = class251.field4291[var2] = new class68[var5];
            class85.method611(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class85.method611(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(IZ)V", line = 3861)
    private static final void method3080(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7691 -= 3;
                int var2 = field7675[field7691];
                int var3 = field7675[field7691 + 1];
                int var4 = field7675[field7691 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class68 var5 = class22.method115(7521, var2);
                if (var5.field997 == null) {
                    var5.field997 = new class68[var4 + 1];
                }
                if (var5.field997.length <= var4) {
                    class68[] var6 = new class68[var4 + 1];
                    for (int var7 = 0; var7 < var5.field997.length; var7++) {
                        var6[var7] = var5.field997[var7];
                    }
                    var5.field997 = var6;
                }
                if (var4 > 0 && var5.field997[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class68 var8 = new class68();
                var8.field1086 = var3;
                var8.field1047 = var8.field1059 = var5.field1059;
                var8.field1152 = var4;
                var5.field997[var4] = var8;
                if (arg1) {
                    field7685 = var8;
                } else {
                    field7677 = var8;
                }
                class396.method2476(var5, 1);
                return;
            }
            if (arg0 == 101) {
                class68 var9 = arg1 ? field7685 : field7677;
                if (var9.field1152 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class68 var10 = class22.method115(7521, var9.field1059);
                var10.field997[var9.field1152] = null;
                class396.method2476(var10, 1);
                return;
            }
            if (arg0 == 102) {
                class68 var11 = class22.method115(7521, field7675[--field7691]);
                var11.field997 = null;
                class396.method2476(var11, 1);
                return;
            }
            if (arg0 == 200) {
                field7691 -= 2;
                int var12 = field7675[field7691];
                int var13 = field7675[field7691 + 1];
                class68 var14 = class453.method2708(var12, 90, var13);
                if (var14 != null && var13 != -1) {
                    field7675[field7691++] = 1;
                    if (arg1) {
                        field7685 = var14;
                        return;
                    }
                    field7677 = var14;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7675[--field7691];
                class68 var16 = class22.method115(7521, var15);
                if (var16 != null) {
                    field7675[field7691++] = 1;
                    if (arg1) {
                        field7685 = var16;
                        return;
                    }
                    field7677 = var16;
                    return;
                }
                field7675[field7691++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7675[--field7691];
                method3079(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7675[--field7691];
                method3075(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7691 -= 2;
                int var19 = field7675[field7691];
                int var20 = field7675[field7691 + 1];
                for (int var21 = 0; var21 < class111.field1966.length; var21++) {
                    if (class111.field1966[var21] == var19) {
                        class302.field4850.field2650.method2101(var20, class106.field1901, var21, -95);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class61.field926.length; var22++) {
                    if (class61.field926[var22] == var19) {
                        class302.field4850.field2650.method2101(var20, class106.field1901, var22, -103);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7691 -= 2;
                int var23 = field7675[field7691];
                int var24 = field7675[field7691 + 1];
                class302.field4850.field2650.method2103(var24, var23, 0);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7675[--field7691] != 0;
                class302.field4850.field2650.method2102(var25, 24369);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class68 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class22.method115(7521, field7675[--field7691]);
            } else {
                var26 = arg1 ? field7685 : field7677;
            }
            if (arg0 == 1000) {
                field7691 -= 4;
                var26.field1015 = field7675[field7691];
                var26.field1050 = field7675[field7691 + 1];
                int var27 = field7675[field7691 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field7675[field7691 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field1154 = (byte) var27;
                var26.field1110 = (byte) var28;
                class396.method2476(var26, 1);
                class327.method2054(var26, (byte) 110);
                if (var26.field1152 == -1) {
                    class208.method1358(var26.field1059, -24110);
                }
                return;
            }
            if (arg0 == 1001) {
                field7691 -= 4;
                var26.field1156 = field7675[field7691];
                var26.field1132 = field7675[field7691 + 1];
                var26.field1043 = 0;
                var26.field1077 = 0;
                int var29 = field7675[field7691 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field7675[field7691 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field1060 = (byte) var29;
                var26.field1061 = (byte) var30;
                class396.method2476(var26, 1);
                class327.method2054(var26, (byte) -59);
                if (var26.field1086 == 0) {
                    class226.method1554(var26, -12295, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field7675[--field7691] == 1;
                if (var26.field1029 != var31) {
                    var26.field1029 = var31;
                    class396.method2476(var26, 1);
                }
                if (var26.field1152 == -1) {
                    class535.method3172(-18072, var26.field1059);
                }
                return;
            }
            if (arg0 == 1004) {
                field7691 -= 2;
                var26.field1068 = field7675[field7691];
                var26.field992 = field7675[field7691 + 1];
                class396.method2476(var26, 1);
                class327.method2054(var26, (byte) -34);
                if (var26.field1086 == 0) {
                    class226.method1554(var26, -12295, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field1034 = field7675[--field7691] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class68 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class22.method115(7521, field7675[--field7691]);
            } else {
                var32 = arg1 ? field7685 : field7677;
            }
            if (arg0 == 1100) {
                field7691 -= 2;
                var32.field1041 = field7675[field7691];
                if (var32.field1041 > var32.field1048 - var32.field1009) {
                    var32.field1041 = var32.field1048 - var32.field1009;
                }
                if (var32.field1041 < 0) {
                    var32.field1041 = 0;
                }
                var32.field1042 = field7675[field7691 + 1];
                if (var32.field1042 > var32.field1037 - var32.field1081) {
                    var32.field1042 = var32.field1037 - var32.field1081;
                }
                if (var32.field1042 < 0) {
                    var32.field1042 = 0;
                }
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class204.method1335((byte) -51, var32.field1059);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field1155 = field7675[--field7691];
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class15.method78(var32.field1059, 0);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field1006 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1103) {
                var32.field1049 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1104) {
                var32.field1131 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field7675[--field7691];
                if (var32.field1028 != var33) {
                    var32.field1028 = var33;
                    class396.method2476(var32, 1);
                }
                if (var32.field1152 == -1) {
                    class134.method1012(var32.field1059, 0);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field1018 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1107) {
                var32.field1088 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1108) {
                var32.field1099 = 1;
                var32.field1129 = field7675[--field7691];
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class431.method2626(35, var32.field1059);
                }
                return;
            }
            if (arg0 == 1109) {
                field7691 -= 6;
                var32.field1013 = field7675[field7691];
                var32.field1070 = field7675[field7691 + 1];
                var32.field1113 = field7675[field7691 + 2];
                var32.field1031 = field7675[field7691 + 3];
                var32.field1138 = field7675[field7691 + 4];
                var32.field1017 = field7675[field7691 + 5];
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class5.method24(61, var32.field1059);
                    class315.method1997(0, var32.field1059);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field7675[--field7691];
                if (var32.field1016 != var34) {
                    var32.field1016 = var34;
                    var32.field1084 = 0;
                    var32.field1025 = 1;
                    var32.field1046 = 0;
                    class396.method2476(var32, 1);
                }
                if (var32.field1152 == -1) {
                    class158.method1102(104, var32.field1059);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field1112 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field7684[--field7690];
                if (!var35.equals(var32.field1157)) {
                    var32.field1157 = var35;
                    class396.method2476(var32, 1);
                }
                if (var32.field1152 == -1) {
                    class271.method1805(var32.field1059, (byte) 114);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field1141 = field7675[--field7691];
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class223.method1539(var32.field1059, -54);
                }
                return;
            }
            if (arg0 == 1114) {
                field7691 -= 3;
                var32.field1024 = field7675[field7691];
                var32.field1125 = field7675[field7691 + 1];
                var32.field1133 = field7675[field7691 + 2];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1115) {
                var32.field1053 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1116) {
                var32.field1069 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1117) {
                var32.field1161 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1118) {
                var32.field1123 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1119) {
                var32.field1073 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1120) {
                field7691 -= 2;
                var32.field1048 = field7675[field7691];
                var32.field1037 = field7675[field7691 + 1];
                class396.method2476(var32, 1);
                if (var32.field1086 == 0) {
                    class226.method1554(var32, -12295, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field7691 -= 2;
                var32.field1056 = (short) field7675[field7691];
                var32.field1124 = (short) field7675[field7691 + 1];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1122) {
                var32.field1116 = field7675[--field7691] == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1123) {
                var32.field1017 = field7675[--field7691];
                class396.method2476(var32, 1);
                if (var32.field1152 == -1) {
                    class5.method24(90, var32.field1059);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field7675[--field7691];
                var32.field1055 = var36 == 1;
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1125) {
                field7691 -= 2;
                var32.field1146 = field7675[field7691];
                var32.field1158 = field7675[field7691 + 1];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1126) {
                var32.field1001 = field7675[--field7691];
                class396.method2476(var32, 1);
                return;
            }
            if (arg0 == 1127) {
                field7691 -= 2;
                int var37 = field7675[field7691];
                int var38 = field7675[field7691 + 1];
                class223 var39 = class213.field3383.method2258(true, var37);
                if (var39.field3853 != var38) {
                    var32.method447(var38, var37, (byte) -118);
                    return;
                }
                var32.method441(var37, (byte) -10);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field7675[--field7691];
                String var41 = field7684[--field7690];
                class223 var42 = class213.field3383.method2258(true, var40);
                if (!var42.field3848.equals(var41)) {
                    var32.method455(var40, var41, 0);
                    return;
                }
                var32.method441(var40, (byte) -58);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class68 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class22.method115(7521, field7675[--field7691]);
            } else {
                var43 = arg1 ? field7685 : field7677;
            }
            class396.method2476(var43, 1);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7691 -= 2;
                int var44 = field7675[field7691];
                int var45 = field7675[field7691 + 1];
                if (var43.field1152 == -1) {
                    class369.method2339(-80, var43.field1059);
                    class5.method24(-65, var43.field1059);
                    class315.method1997(0, var43.field1059);
                }
                if (var44 == -1) {
                    var43.field1099 = 1;
                    var43.field1129 = -1;
                    var43.field1062 = -1;
                    return;
                }
                var43.field1062 = var44;
                var43.field1007 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field1012 = true;
                } else {
                    var43.field1012 = false;
                }
                class104 var46 = class20.field218.method2221(var44, -1);
                var43.field1113 = var46.field1747;
                var43.field1031 = var46.field1775;
                var43.field1138 = var46.field1715;
                var43.field1013 = var46.field1739;
                var43.field1070 = var46.field1753;
                var43.field1017 = var46.field1765;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field1107 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field1107 = 1;
                } else {
                    var43.field1107 = 2;
                }
                if (var43.field1043 > 0) {
                    var43.field1017 = var43.field1017 * 32 / var43.field1043;
                    return;
                }
                if (var43.field1156 > 0) {
                    var43.field1017 = var43.field1017 * 32 / var43.field1156;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field1099 = 2;
                var43.field1129 = field7675[--field7691];
                if (var43.field1152 == -1) {
                    class431.method2626(100, var43.field1059);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field1099 = 3;
                var43.field1129 = -1;
                if (var43.field1152 == -1) {
                    class431.method2626(127, var43.field1059);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field1099 = 6;
                var43.field1129 = field7675[--field7691];
                if (var43.field1152 == -1) {
                    class431.method2626(61, var43.field1059);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field1099 = 5;
                var43.field1129 = field7675[--field7691];
                if (var43.field1152 == -1) {
                    class431.method2626(101, var43.field1059);
                }
                return;
            }
            if (arg0 == 1206) {
                field7691 -= 4;
                var43.field1145 = field7675[field7691];
                var43.field1078 = field7675[field7691 + 1];
                var43.field1080 = field7675[field7691 + 2];
                var43.field1095 = field7675[field7691 + 3];
                class396.method2476(var43, 1);
                return;
            }
            if (arg0 == 1207) {
                field7691 -= 2;
                var43.field1051 = field7675[field7691];
                var43.field1114 = field7675[field7691 + 1];
                class396.method2476(var43, 1);
                return;
            }
            if (arg0 == 1210) {
                field7691 -= 4;
                var43.field1129 = field7675[field7691];
                var43.field1044 = field7675[field7691 + 1];
                if (field7675[field7691 + 2] == 1) {
                    var43.field1099 = 9;
                } else {
                    var43.field1099 = 8;
                }
                if (field7675[field7691 + 3] == 1) {
                    var43.field1012 = true;
                } else {
                    var43.field1012 = false;
                }
                if (var43.field1152 == -1) {
                    class431.method2626(27, var43.field1059);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field1099 = 5;
                var43.field1129 = class265.field4432;
                var43.field1044 = 0;
                if (var43.field1152 == -1) {
                    class431.method2626(96, var43.field1059);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class68 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class22.method115(7521, field7675[--field7691]);
                } else {
                    var58 = arg1 ? field7685 : field7677;
                }
                String var59 = field7684[--field7690];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field7675[--field7691];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field7675[--field7691];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field7684[--field7690];
                    } else {
                        var62[var63] = Integer.valueOf(field7675[--field7691]);
                    }
                }
                int var64 = field7675[--field7691];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field1144 = var62;
                } else if (arg0 == 1401) {
                    var58.field1094 = var62;
                } else if (arg0 == 1402) {
                    var58.field1040 = var62;
                } else if (arg0 == 1403) {
                    var58.field1135 = var62;
                } else if (arg0 == 1404) {
                    var58.field1140 = var62;
                } else if (arg0 == 1405) {
                    var58.field1054 = var62;
                } else if (arg0 == 1406) {
                    var58.field1128 = var62;
                } else if (arg0 == 1407) {
                    var58.field1122 = var62;
                    var58.field1159 = var60;
                } else if (arg0 == 1408) {
                    var58.field1064 = var62;
                } else if (arg0 == 1409) {
                    var58.field1008 = var62;
                } else if (arg0 == 1410) {
                    var58.field1010 = var62;
                } else if (arg0 == 1411) {
                    var58.field995 = var62;
                } else if (arg0 == 1412) {
                    var58.field999 = var62;
                } else if (arg0 == 1414) {
                    var58.field1142 = var62;
                    var58.field1075 = var60;
                } else if (arg0 == 1415) {
                    var58.field1032 = var62;
                    var58.field1093 = var60;
                } else if (arg0 == 1416) {
                    var58.field1153 = var62;
                } else if (arg0 == 1417) {
                    var58.field1137 = var62;
                } else if (arg0 == 1418) {
                    var58.field1035 = var62;
                } else if (arg0 == 1419) {
                    var58.field1117 = var62;
                } else if (arg0 == 1420) {
                    var58.field1109 = var62;
                } else if (arg0 == 1421) {
                    var58.field1136 = var62;
                } else if (arg0 == 1422) {
                    var58.field1066 = var62;
                } else if (arg0 == 1423) {
                    var58.field1005 = var62;
                } else if (arg0 == 1424) {
                    var58.field1101 = var62;
                } else if (arg0 == 1425) {
                    var58.field1150 = var62;
                } else if (arg0 == 1426) {
                    var58.field1119 = var62;
                } else if (arg0 == 1427) {
                    var58.field1000 = var62;
                } else if (arg0 == 1428) {
                    var58.field1033 = var62;
                    var58.field1100 = var60;
                } else if (arg0 == 1429) {
                    var58.field1108 = var62;
                    var58.field1038 = var60;
                } else if (arg0 == 1430) {
                    var58.field1011 = var62;
                }
                var58.field1090 = true;
                return;
            }
            if (arg0 < 1600) {
                class68 var65 = arg1 ? field7685 : field7677;
                if (arg0 == 1500) {
                    field7675[field7691++] = var65.field1118;
                    return;
                }
                if (arg0 == 1501) {
                    field7675[field7691++] = var65.field1127;
                    return;
                }
                if (arg0 == 1502) {
                    field7675[field7691++] = var65.field1009;
                    return;
                }
                if (arg0 == 1503) {
                    field7675[field7691++] = var65.field1081;
                    return;
                }
                if (arg0 == 1504) {
                    field7675[field7691++] = var65.field1029 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7675[field7691++] = var65.field1047;
                    return;
                }
                if (arg0 == 1506) {
                    class68 var66 = class272.method1810(true, var65);
                    field7675[field7691++] = var66 == null ? -1 : var66.field1059;
                    return;
                }
            } else if (arg0 < 1700) {
                class68 var67 = arg1 ? field7685 : field7677;
                if (arg0 == 1600) {
                    field7675[field7691++] = var67.field1041;
                    return;
                }
                if (arg0 == 1601) {
                    field7675[field7691++] = var67.field1042;
                    return;
                }
                if (arg0 == 1602) {
                    field7684[field7690++] = var67.field1157;
                    return;
                }
                if (arg0 == 1603) {
                    field7675[field7691++] = var67.field1048;
                    return;
                }
                if (arg0 == 1604) {
                    field7675[field7691++] = var67.field1037;
                    return;
                }
                if (arg0 == 1605) {
                    field7675[field7691++] = var67.field1017;
                    return;
                }
                if (arg0 == 1606) {
                    field7675[field7691++] = var67.field1113;
                    return;
                }
                if (arg0 == 1607) {
                    field7675[field7691++] = var67.field1138;
                    return;
                }
                if (arg0 == 1608) {
                    field7675[field7691++] = var67.field1031;
                    return;
                }
                if (arg0 == 1609) {
                    field7675[field7691++] = var67.field1049;
                    return;
                }
                if (arg0 == 1610) {
                    field7675[field7691++] = var67.field1013;
                    return;
                }
                if (arg0 == 1611) {
                    field7675[field7691++] = var67.field1070;
                    return;
                }
                if (arg0 == 1612) {
                    field7675[field7691++] = var67.field1028;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field7675[--field7691];
                    class223 var69 = class213.field3383.method2258(true, var68);
                    if (var69.method1537(-3685)) {
                        field7684[field7690++] = var67.method453(var69.field3848, -433, var68);
                        return;
                    }
                    field7675[field7691++] = var67.method452(7952, var69.field3853, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class68 var70 = arg1 ? field7685 : field7677;
                if (arg0 == 1700) {
                    field7675[field7691++] = var70.field1062;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field1062 != -1) {
                        field7675[field7691++] = var70.field1007;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7675[field7691++] = var70.field1152;
                    return;
                }
            } else if (arg0 < 1900) {
                class68 var71 = arg1 ? field7685 : field7677;
                if (arg0 == 1800) {
                    field7675[field7691++] = client.method475(var71).method1988(-20539);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field7675[--field7691];
                    int var334 = var72 - 1;
                    if (var71.field1149 != null && var334 < var71.field1149.length && var71.field1149[var334] != null) {
                        field7684[field7690++] = var71.field1149[var334];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field1052 == null) {
                        field7684[field7690++] = "";
                        return;
                    }
                    field7684[field7690++] = var71.field1052;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class68 var332;
                if (arg0 >= 2000) {
                    var332 = class22.method115(7521, field7675[--field7691]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field7685 : field7677;
                }
                if (field7697 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field1000 == null) {
                        return;
                    }
                    class483 var333 = new class483();
                    var333.field7100 = var332;
                    var333.field7101 = var332.field1000;
                    var333.field7096 = field7697 + 1;
                    class503.field7344.method2541(0, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class68 var73 = class22.method115(7521, field7675[--field7691]);
                if (arg0 == 2500) {
                    field7675[field7691++] = var73.field1118;
                    return;
                }
                if (arg0 == 2501) {
                    field7675[field7691++] = var73.field1127;
                    return;
                }
                if (arg0 == 2502) {
                    field7675[field7691++] = var73.field1009;
                    return;
                }
                if (arg0 == 2503) {
                    field7675[field7691++] = var73.field1081;
                    return;
                }
                if (arg0 == 2504) {
                    field7675[field7691++] = var73.field1029 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7675[field7691++] = var73.field1047;
                    return;
                }
                if (arg0 == 1506) {
                    class68 var74 = class272.method1810(true, var73);
                    field7675[field7691++] = var74 == null ? -1 : var74.field1059;
                    return;
                }
            } else if (arg0 < 2700) {
                class68 var75 = class22.method115(7521, field7675[--field7691]);
                if (arg0 == 2600) {
                    field7675[field7691++] = var75.field1041;
                    return;
                }
                if (arg0 == 2601) {
                    field7675[field7691++] = var75.field1042;
                    return;
                }
                if (arg0 == 2602) {
                    field7684[field7690++] = var75.field1157;
                    return;
                }
                if (arg0 == 2603) {
                    field7675[field7691++] = var75.field1048;
                    return;
                }
                if (arg0 == 2604) {
                    field7675[field7691++] = var75.field1037;
                    return;
                }
                if (arg0 == 2605) {
                    field7675[field7691++] = var75.field1017;
                    return;
                }
                if (arg0 == 2606) {
                    field7675[field7691++] = var75.field1113;
                    return;
                }
                if (arg0 == 2607) {
                    field7675[field7691++] = var75.field1138;
                    return;
                }
                if (arg0 == 2608) {
                    field7675[field7691++] = var75.field1031;
                    return;
                }
                if (arg0 == 2609) {
                    field7675[field7691++] = var75.field1049;
                    return;
                }
                if (arg0 == 2610) {
                    field7675[field7691++] = var75.field1013;
                    return;
                }
                if (arg0 == 2611) {
                    field7675[field7691++] = var75.field1070;
                    return;
                }
                if (arg0 == 2612) {
                    field7675[field7691++] = var75.field1028;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class68 var76 = class22.method115(7521, field7675[--field7691]);
                    field7675[field7691++] = var76.field1062;
                    return;
                }
                if (arg0 == 2701) {
                    class68 var77 = class22.method115(7521, field7675[--field7691]);
                    if (var77.field1062 != -1) {
                        field7675[field7691++] = var77.field1007;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field7675[--field7691];
                    class52 var79 = (class52) class259.field4346.method2516((long) var78, -1);
                    if (var79 != null) {
                        field7675[field7691++] = 1;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class68 var80 = class22.method115(7521, field7675[--field7691]);
                    if (var80.field997 == null) {
                        field7675[field7691++] = 0;
                        return;
                    }
                    int var81 = var80.field997.length;
                    for (int var82 = 0; var82 < var80.field997.length; var82++) {
                        if (var80.field997[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field7675[field7691++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field7691 -= 2;
                    int var83 = field7675[field7691];
                    int var84 = field7675[field7691 + 1];
                    class52 var85 = (class52) class259.field4346.method2516((long) var83, -1);
                    if (var85 != null && var85.field841 == var84) {
                        field7675[field7691++] = 1;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class68 var86 = class22.method115(7521, field7675[--field7691]);
                if (arg0 == 2800) {
                    field7675[field7691++] = client.method475(var86).method1988(-20539);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field7675[--field7691];
                    int var335 = var87 - 1;
                    if (var86.field1149 != null && var335 < var86.field1149.length && var86.field1149[var335] != null) {
                        field7684[field7690++] = var86.field1149[var335];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field1052 == null) {
                        field7684[field7690++] = "";
                        return;
                    }
                    field7684[field7690++] = var86.field1052;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field7684[--field7690];
                    class467.method2774(var88, (byte) 81);
                    return;
                }
                if (arg0 == 3101) {
                    field7691 -= 2;
                    class9.method54((byte) -42, field7675[field7691], field7675[field7691 + 1], class302.field4850);
                    return;
                }
                if (arg0 == 3103) {
                    class101.method698(true, 85);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field7684[--field7690];
                    int var90 = 0;
                    if (class516.method3051(var89, 10)) {
                        var90 = class508.method2990(var89, 23403);
                    }
                    field7682++;
                    class265.method1775(-2, class434.field6477);
                    class261.field4357.method152(var90, (byte) -38);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field7684[--field7690];
                    field7689++;
                    class265.method1775(-2, class353.field5505);
                    class261.field4357.method163(var91.length() + 1, (byte) 49);
                    class261.field4357.method145(var91, (byte) 0);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field7684[--field7690];
                    field7670++;
                    class265.method1775(-2, class277.field4546);
                    class261.field4357.method163(var92.length() + 1, (byte) 49);
                    class261.field4357.method145(var92, (byte) 0);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field7675[--field7691];
                    String var94 = field7684[--field7690];
                    class387.method2428(var93, var94, (byte) -94);
                    return;
                }
                if (arg0 == 3108) {
                    field7691 -= 3;
                    int var95 = field7675[field7691];
                    int var96 = field7675[field7691 + 1];
                    int var97 = field7675[field7691 + 2];
                    class68 var98 = class22.method115(7521, var97);
                    class264.method1762(var98, true, var95, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field7691 -= 2;
                    int var99 = field7675[field7691];
                    int var100 = field7675[field7691 + 1];
                    class68 var101 = arg1 ? field7685 : field7677;
                    class264.method1762(var101, true, var99, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field7675[--field7691];
                    field7695++;
                    class265.method1775(-2, class441.field6578);
                    class261.field4357.method182(var102, 16);
                    return;
                }
                if (arg0 == 3111) {
                    field7691 -= 2;
                    int var103 = field7675[field7691];
                    int var104 = field7675[field7691 + 1];
                    class52 var105 = (class52) class259.field4346.method2516((long) var103, -1);
                    if (var105 != null) {
                        class507.method2985(var105, 32407, true, var105.field841 != var104);
                    }
                    class489.method2852((byte) 122, 3, var103, true, var104);
                    return;
                }
                if (arg0 == 3112) {
                    field7691--;
                    int var106 = field7675[field7691];
                    class52 var107 = (class52) class259.field4346.method2516((long) var106, -1);
                    if (var107 != null && var107.field843 == 3) {
                        class507.method2985(var107, 32407, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class301.method1932(field7684[--field7690], -97);
                    return;
                }
                if (arg0 == 3114) {
                    field7691 -= 2;
                    int var108 = field7675[field7691];
                    int var109 = field7675[field7691 + 1];
                    String var110 = field7684[--field7690];
                    class81.method588("", var109, (byte) 98, var110, var108, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field7691 -= 3;
                    class500.method2962(field7675[field7691], 255, 123, field7675[field7691 + 1], field7675[field7691 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class319.method2026((byte) -22, 255, field7675[--field7691], 50);
                    return;
                }
                if (arg0 == 3202) {
                    field7691 -= 2;
                    class260.method1744(255, (byte) 106, field7675[field7691 + 1], field7675[field7691]);
                    return;
                }
                if (arg0 == 3203) {
                    field7691 -= 4;
                    class500.method2962(field7675[field7691], field7675[field7691 + 3], 124, field7675[field7691 + 1], field7675[field7691 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field7691 -= 3;
                    class319.method2026((byte) -26, field7675[field7691 + 1], field7675[field7691], field7675[field7691 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field7691 -= 3;
                    class260.method1744(field7675[field7691 + 2], (byte) 114, field7675[field7691 + 1], field7675[field7691]);
                    return;
                }
                if (arg0 == 3206) {
                    field7691 -= 4;
                    class74.method522(field7675[field7691 + 1], true, field7675[field7691 + 3], field7675[field7691 + 2], field7675[field7691]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7675[field7691++] = class504.field7348;
                    return;
                }
                if (arg0 == 3301) {
                    field7691 -= 2;
                    int var111 = field7675[field7691];
                    int var112 = field7675[field7691 + 1];
                    field7675[field7691++] = class224.method1541(var112, var111, false, true);
                    return;
                }
                if (arg0 == 3302) {
                    field7691 -= 2;
                    int var113 = field7675[field7691];
                    int var114 = field7675[field7691 + 1];
                    field7675[field7691++] = class264.method1761(true, var113, var114, false);
                    return;
                }
                if (arg0 == 3303) {
                    field7691 -= 2;
                    int var115 = field7675[field7691];
                    int var116 = field7675[field7691 + 1];
                    field7675[field7691++] = class472.method2793(var116, (byte) 118, var115, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field7675[--field7691];
                    field7675[field7691++] = class243.field4173.method259(true, var117).field5462;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field7675[--field7691];
                    field7675[field7691++] = class300.field4818[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field7675[--field7691];
                    field7675[field7691++] = class110.field1950[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field7675[--field7691];
                    field7675[field7691++] = class57.field901[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class302.field4850.field4720;
                    int var122 = (class302.field4850.field4716 >> 7) + class16.field181;
                    int var123 = (class302.field4850.field4714 >> 7) + class455.field6794;
                    field7675[field7691++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field7675[--field7691];
                    field7675[field7691++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field7675[--field7691];
                    field7675[field7691++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field7675[--field7691];
                    field7675[field7691++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7675[field7691++] = class347.field5452 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field7691 -= 2;
                    int var127 = field7675[field7691];
                    int var128 = field7675[field7691 + 1];
                    field7675[field7691++] = class224.method1541(var128, var127, true, true);
                    return;
                }
                if (arg0 == 3314) {
                    field7691 -= 2;
                    int var129 = field7675[field7691];
                    int var130 = field7675[field7691 + 1];
                    field7675[field7691++] = class264.method1761(true, var129, var130, true);
                    return;
                }
                if (arg0 == 3315) {
                    field7691 -= 2;
                    int var131 = field7675[field7691];
                    int var132 = field7675[field7691 + 1];
                    field7675[field7691++] = class472.method2793(var132, (byte) 46, var131, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class407.field6189 >= 2) {
                        field7675[field7691++] = class407.field6189;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7675[field7691++] = class165.field2609;
                    return;
                }
                if (arg0 == 3318) {
                    field7675[field7691++] = class244.field4183.field7139;
                    return;
                }
                if (arg0 == 3321) {
                    field7675[field7691++] = class156.field2525;
                    return;
                }
                if (arg0 == 3322) {
                    field7675[field7691++] = class300.field4812;
                    return;
                }
                if (arg0 == 3323) {
                    if (class369.field5717 >= 5 && class369.field5717 <= 9) {
                        field7675[field7691++] = 1;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class369.field5717 >= 5 && class369.field5717 <= 9) {
                        field7675[field7691++] = class369.field5717;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7675[field7691++] = class348.field5467 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7675[field7691++] = class302.field4850.field2658;
                    return;
                }
                if (arg0 == 3327) {
                    field7675[field7691++] = class302.field4850.field2650.field5231 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7675[field7691++] = class303.field4857 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field7675[--field7691];
                    field7675[field7691++] = class330.method2072(26214, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field7691 -= 2;
                    int var134 = field7675[field7691];
                    int var135 = field7675[field7691 + 1];
                    field7675[field7691++] = class65.method426(-2, var135, false, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field7691 -= 2;
                    int var136 = field7675[field7691];
                    int var137 = field7675[field7691 + 1];
                    field7675[field7691++] = class65.method426(-2, var137, false, true, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field7675[field7691++] = class111.field1965;
                    return;
                }
                if (arg0 == 3335) {
                    field7675[field7691++] = class300.field4813;
                    return;
                }
                if (arg0 == 3336) {
                    field7691 -= 4;
                    int var138 = field7675[field7691];
                    int var139 = field7675[field7691 + 1];
                    int var140 = field7675[field7691 + 2];
                    int var141 = field7675[field7691 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field7675[field7691++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field7675[field7691++] = class57.field899;
                    return;
                }
                if (arg0 == 3338) {
                    field7675[field7691++] = class306.method1953(-121);
                    return;
                }
                if (arg0 == 3339) {
                    field7675[field7691++] = class216.field3763 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field7675[field7691++] = class131.field2248 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field7675[field7691++] = class164.field2597 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field7691 -= 2;
                    int var145 = field7675[field7691];
                    int var146 = field7675[field7691 + 1];
                    class525 var147 = class75.field1310.method1827(var145, -103);
                    field7684[field7690++] = var147.method3110((byte) 62, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field7691 -= 4;
                    int var148 = field7675[field7691];
                    int var149 = field7675[field7691 + 1];
                    int var150 = field7675[field7691 + 2];
                    int var151 = field7675[field7691 + 3];
                    class525 var152 = class75.field1310.method1827(var150, -61);
                    if (var152.field7730 == var148 && var152.field7720 == var149) {
                        if (var149 == 115) {
                            field7684[field7690++] = var152.method3110((byte) 119, var151);
                            return;
                        }
                        field7675[field7691++] = var152.method3104(var151, false);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field7691 -= 3;
                    int var153 = field7675[field7691];
                    int var154 = field7675[field7691 + 1];
                    int var155 = field7675[field7691 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class525 var156 = class75.field1310.method1827(var154, -60);
                    if (var156.field7720 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7675[field7691++] = var156.method3102((byte) -12, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field7675[--field7691];
                    String var158 = field7684[--field7690];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class525 var159 = class75.field1310.method1827(var157, -100);
                    if (var159.field7720 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7675[field7691++] = var159.method3108(var158, 102) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field7675[--field7691];
                    class525 var161 = class75.field1310.method1827(var160, -77);
                    field7675[field7691++] = var161.field7717.method2521((byte) 119);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class485.field7118 == 0) {
                        field7675[field7691++] = -2;
                        return;
                    }
                    if (class485.field7118 == 1) {
                        field7675[field7691++] = -1;
                        return;
                    }
                    field7675[field7691++] = class139.field2317;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field7675[--field7691];
                    if (class485.field7118 == 2 && var162 < class139.field2317) {
                        field7684[field7690++] = class485.field7122[var162];
                        if (class5.field48[var162] != null) {
                            field7684[field7690++] = class5.field48[var162];
                            return;
                        }
                        field7684[field7690++] = "";
                        return;
                    }
                    field7684[field7690++] = "";
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field7675[--field7691];
                    if (class485.field7118 == 2 && var163 < class139.field2317) {
                        field7675[field7691++] = class305.field4875[var163];
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field7675[--field7691];
                    if (class485.field7118 == 2 && var164 < class139.field2317) {
                        field7675[field7691++] = class358.field5570[var164];
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field7684[--field7690];
                    int var166 = field7675[--field7691];
                    class533.method3163(-114, var166, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field7684[--field7690];
                    class49.method358(-20448, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field7684[--field7690];
                    class2.method6(23, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field7684[--field7690];
                    class303.method1941(-84, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field7684[--field7690];
                    class471.method2788(var170, (byte) 114);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field7684[--field7690];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field7675[field7691++] = class241.method1659(var171, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field7675[--field7691];
                    if (class485.field7118 == 2 && var172 < class139.field2317) {
                        field7684[field7690++] = class346.field5446[var172];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class4.field41 != null) {
                        field7684[field7690++] = class516.method3057(75, class4.field41);
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class4.field41 != null) {
                        field7675[field7691++] = class12.field136;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field7675[--field7691];
                    if (class4.field41 != null && var173 < class12.field136) {
                        field7684[field7690++] = class236.field4084[var173].field6605;
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field7675[--field7691];
                    if (class4.field41 != null && var174 < class12.field136) {
                        field7675[field7691++] = class236.field4084[var174].field6601;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field7675[--field7691];
                    if (class4.field41 != null && var175 < class12.field136) {
                        field7675[field7691++] = class236.field4084[var175].field6603;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7675[field7691++] = class97.field1608;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field7684[--field7690];
                    class147.method1068(var176, 0);
                    return;
                }
                if (arg0 == 3618) {
                    field7675[field7691++] = class209.field3308;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field7684[--field7690];
                    class413.method2558(var177, 8);
                    return;
                }
                if (arg0 == 3620) {
                    class371.method2342(false);
                    return;
                }
                if (arg0 == 3621) {
                    if (class485.field7118 == 0) {
                        field7675[field7691++] = -1;
                        return;
                    }
                    field7675[field7691++] = class14.field160;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field7675[--field7691];
                    if (class485.field7118 != 0 && var178 < class14.field160) {
                        field7684[field7690++] = class322.field5057[var178];
                        if (class376.field5861[var178] != null) {
                            field7684[field7690++] = class376.field5861[var178];
                            return;
                        }
                        field7684[field7690++] = "";
                        return;
                    }
                    field7684[field7690++] = "";
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field7684[--field7690];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field7675[field7691++] = class204.method1336((byte) 43, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field7675[--field7691];
                    if (class236.field4084 != null && var180 < class12.field136 && class236.field4084[var180].field6600.equalsIgnoreCase(class302.field4850.field2652)) {
                        field7675[field7691++] = 1;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class21.field231 != null) {
                        field7684[field7690++] = class21.field231;
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field7675[--field7691];
                    if (class4.field41 != null && var181 < class12.field136) {
                        field7684[field7690++] = class236.field4084[var181].field6609;
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field7675[--field7691];
                    if (class485.field7118 == 2 && var182 >= 0 && var182 < class139.field2317) {
                        field7675[field7691++] = class34.field524[var182] ? 1 : 0;
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field7684[--field7690];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field7675[field7691++] = class343.method2199(var183, true);
                    return;
                }
                if (arg0 == 3629) {
                    field7675[field7691++] = class317.field4990;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field7684[--field7690];
                    class303.method1941(-98, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field7675[--field7691];
                    field7675[field7691++] = class212.field3375[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field7675[--field7691];
                    if (class4.field41 != null && var186 < class12.field136) {
                        field7684[field7690++] = class236.field4084[var186].field6600;
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field7675[--field7691];
                    if (class485.field7118 != 0 && var187 < class14.field160) {
                        field7684[field7690++] = class60.field918[var187];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var188].method47(true);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var189].field82;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var190].field83;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var191].field84;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var192].field86;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field7675[--field7691];
                    field7675[field7691++] = class299.field4807[var193].field79;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field7675[--field7691];
                    int var195 = class299.field4807[var194].method45((byte) 73);
                    field7675[field7691++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field7675[--field7691];
                    int var197 = class299.field4807[var196].method45((byte) -62);
                    field7675[field7691++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field7675[--field7691];
                    int var199 = class299.field4807[var198].method45((byte) 71);
                    field7675[field7691++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field7675[--field7691];
                    int var201 = class299.field4807[var200].method45((byte) -40);
                    field7675[field7691++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field7691 -= 2;
                    int var202 = field7675[field7691];
                    int var203 = field7675[field7691 + 1];
                    field7675[field7691++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field7691 -= 2;
                    int var204 = field7675[field7691];
                    int var205 = field7675[field7691 + 1];
                    field7675[field7691++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field7691 -= 2;
                    int var206 = field7675[field7691];
                    int var207 = field7675[field7691 + 1];
                    field7675[field7691++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field7691 -= 2;
                    int var208 = field7675[field7691];
                    int var209 = field7675[field7691 + 1];
                    field7675[field7691++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field7675[--field7691];
                    field7675[field7691++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field7675[--field7691];
                    field7675[field7691++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field7691 -= 5;
                    int var212 = field7675[field7691];
                    int var213 = field7675[field7691 + 1];
                    int var214 = field7675[field7691 + 2];
                    int var215 = field7675[field7691 + 3];
                    int var216 = field7675[field7691 + 4];
                    field7675[field7691++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field7691 -= 2;
                    long var217 = (long) field7675[field7691];
                    long var219 = (long) field7675[field7691 + 1];
                    field7675[field7691++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field7691 -= 2;
                    int var221 = field7675[field7691];
                    int var222 = field7675[field7691 + 1];
                    field7675[field7691++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field7691 -= 2;
                    int var223 = field7675[field7691];
                    int var224 = field7675[field7691 + 1];
                    field7675[field7691++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field7691 -= 2;
                    int var225 = field7675[field7691];
                    int var226 = field7675[field7691 + 1];
                    field7675[field7691++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field7691 -= 2;
                    int var227 = field7675[field7691];
                    int var228 = field7675[field7691 + 1];
                    field7675[field7691++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field7691 -= 2;
                    int var229 = field7675[field7691];
                    int var230 = field7675[field7691 + 1];
                    if (var229 == 0) {
                        field7675[field7691++] = 0;
                        return;
                    }
                    field7675[field7691++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field7691 -= 2;
                    int var231 = field7675[field7691];
                    int var232 = field7675[field7691 + 1];
                    if (var231 == 0) {
                        field7675[field7691++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field7675[field7691++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7675[field7691++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field7691 -= 2;
                    int var233 = field7675[field7691];
                    int var234 = field7675[field7691 + 1];
                    field7675[field7691++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field7691 -= 2;
                    int var235 = field7675[field7691];
                    int var236 = field7675[field7691 + 1];
                    field7675[field7691++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field7691 -= 2;
                    int var237 = field7675[field7691];
                    int var238 = field7675[field7691 + 1];
                    field7675[field7691++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field7691 -= 2;
                    int var239 = field7675[field7691];
                    int var240 = field7675[field7691 + 1];
                    field7675[field7691++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field7691 -= 3;
                    long var241 = (long) field7675[field7691];
                    long var243 = (long) field7675[field7691 + 1];
                    long var245 = (long) field7675[field7691 + 2];
                    field7675[field7691++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field7684[--field7690];
                    int var248 = field7675[--field7691];
                    field7684[field7690++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field7690 -= 2;
                    String var249 = field7684[field7690];
                    String var250 = field7684[field7690 + 1];
                    field7684[field7690++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field7684[--field7690];
                    int var252 = field7675[--field7691];
                    field7684[field7690++] = var251 + class387.method2429(true, var252, -1);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field7684[--field7690];
                    field7684[field7690++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7684[field7690++] = method3074(field7675[--field7691]);
                    return;
                }
                if (arg0 == 4105) {
                    field7690 -= 2;
                    String var254 = field7684[field7690];
                    String var255 = field7684[field7690 + 1];
                    if (class302.field4850.field2650 != null && class302.field4850.field2650.field5231) {
                        field7684[field7690++] = var255;
                        return;
                    }
                    field7684[field7690++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field7675[--field7691];
                    field7684[field7690++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field7690 -= 2;
                    field7675[field7691++] = class111.method799(456384544, field7684[field7690 + 1], class300.field4813, field7684[field7690]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field7684[--field7690];
                    field7691 -= 2;
                    int var258 = field7675[field7691];
                    int var259 = field7675[field7691 + 1];
                    class331 var260 = class216.method1495(0, class147.field2392, var259, (byte) -64);
                    field7675[field7691++] = var260.method2079(class359.field5589, 0, var258, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field7684[--field7690];
                    field7691 -= 2;
                    int var262 = field7675[field7691];
                    int var263 = field7675[field7691 + 1];
                    class331 var264 = class216.method1495(0, class147.field2392, var263, (byte) -93);
                    field7675[field7691++] = var264.method2077(var261, var262, class359.field5589, -122);
                    return;
                }
                if (arg0 == 4110) {
                    field7690 -= 2;
                    String var265 = field7684[field7690];
                    String var266 = field7684[field7690 + 1];
                    if (field7675[--field7691] == 1) {
                        field7684[field7690++] = var265;
                        return;
                    }
                    field7684[field7690++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field7684[--field7690];
                    field7684[field7690++] = class178.method1201((byte) 72, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field7684[--field7690];
                    int var269 = field7675[--field7691];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7684[field7690++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field7675[--field7691];
                    field7675[field7691++] = class337.method2129((byte) 102, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field7675[--field7691];
                    field7675[field7691++] = class88.method623((char) var271, 90) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field7675[--field7691];
                    field7675[field7691++] = class68.method446((char) var272, (byte) -121) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field7675[--field7691];
                    field7675[field7691++] = class353.method2265(57, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field7684[--field7690];
                    if (var274 != null) {
                        field7675[field7691++] = var274.length();
                        return;
                    }
                    field7675[field7691++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field7684[--field7690];
                    field7691 -= 2;
                    int var276 = field7675[field7691];
                    int var277 = field7675[field7691 + 1];
                    field7684[field7690++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field7684[--field7690];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field7684[field7690++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field7684[--field7690];
                    field7691 -= 2;
                    int var284 = field7675[field7691];
                    int var285 = field7675[field7691 + 1];
                    field7675[field7691++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field7690 -= 2;
                    String var286 = field7684[field7690];
                    String var287 = field7684[field7690 + 1];
                    int var288 = field7675[--field7691];
                    field7675[field7691++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field7675[--field7691];
                    field7675[field7691++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field7675[--field7691];
                    field7675[field7691++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field7675[--field7691] != 0;
                    int var292 = field7675[--field7691];
                    field7684[field7690++] = class398.method2486(0, var291, 8, class300.field4813, (long) var292);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field7684[--field7690];
                    int var294 = field7675[--field7691];
                    class331 var295 = class216.method1495(0, class147.field2392, var294, (byte) -35);
                    field7675[field7691++] = var295.method2078(-3789, var293, class359.field5589);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field7675[--field7691];
                    field7684[field7690++] = class20.field218.method2221(var296, -1).field1771;
                    return;
                }
                if (arg0 == 4201) {
                    field7691 -= 2;
                    int var297 = field7675[field7691];
                    int var298 = field7675[field7691 + 1];
                    class104 var299 = class20.field218.method2221(var297, -1);
                    if (var298 >= 1 && var298 <= 5 && var299.field1778[var298 - 1] != null) {
                        field7684[field7690++] = var299.field1778[var298 - 1];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field7691 -= 2;
                    int var300 = field7675[field7691];
                    int var301 = field7675[field7691 + 1];
                    class104 var302 = class20.field218.method2221(var300, -1);
                    if (var301 >= 1 && var301 <= 5 && var302.field1714[var301 - 1] != null) {
                        field7684[field7690++] = var302.field1714[var301 - 1];
                        return;
                    }
                    field7684[field7690++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field7675[--field7691];
                    field7675[field7691++] = class20.field218.method2221(var303, -1).field1734;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field7675[--field7691];
                    field7675[field7691++] = class20.field218.method2221(var304, -1).field1745 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field7675[--field7691];
                    class104 var306 = class20.field218.method2221(var305, -1);
                    if (var306.field1776 == -1 && var306.field1770 >= 0) {
                        field7675[field7691++] = var306.field1770;
                        return;
                    }
                    field7675[field7691++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field7675[--field7691];
                    class104 var308 = class20.field218.method2221(var307, -1);
                    if (var308.field1776 >= 0 && var308.field1770 >= 0) {
                        field7675[field7691++] = var308.field1770;
                        return;
                    }
                    field7675[field7691++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field7675[--field7691];
                    field7675[field7691++] = class20.field218.method2221(var309, -1).field1728 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field7691 -= 2;
                    int var310 = field7675[field7691];
                    int var311 = field7675[field7691 + 1];
                    class223 var312 = class213.field3383.method2258(true, var311);
                    if (var312.method1537(-3685)) {
                        field7684[field7690++] = class20.field218.method2221(var310, -1).method712(true, var312.field3848, var311);
                        return;
                    }
                    field7675[field7691++] = class20.field218.method2221(var310, -1).method711(var312.field3853, var311, (byte) 111);
                    return;
                }
                if (arg0 == 4209) {
                    field7691 -= 2;
                    int var313 = field7675[field7691];
                    int var314 = field7675[field7691 + 1] - 1;
                    class104 var315 = class20.field218.method2221(var313, -1);
                    if (var315.field1781 == var314) {
                        field7675[field7691++] = var315.field1700;
                        return;
                    }
                    if (var315.field1706 == var314) {
                        field7675[field7691++] = var315.field1762;
                        return;
                    }
                    field7675[field7691++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field7684[--field7690];
                    int var317 = field7675[--field7691];
                    class422.method2589(true, var317 == 1, var316);
                    field7675[field7691++] = class71.field1233;
                    return;
                }
                if (arg0 == 4211) {
                    if (class255.field4323 != null && class142.field2342 < class71.field1233) {
                        field7675[field7691++] = class255.field4323[class142.field2342++] & 0xFFFF;
                        return;
                    }
                    field7675[field7691++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class142.field2342 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field7691 -= 2;
                    int var318 = field7675[field7691];
                    int var319 = field7675[field7691 + 1];
                    class223 var320 = class213.field3383.method2258(true, var319);
                    if (var320.method1537(-3685)) {
                        field7684[field7690++] = class22.field239.method1085(var318, 537461692).method3006(false, var320.field3848, var319);
                        return;
                    }
                    field7675[field7691++] = class22.field239.method1085(var318, 537461692).method3004(var319, var320.field3853, -72);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field7691 -= 2;
                    int var321 = field7675[field7691];
                    int var322 = field7675[field7691 + 1];
                    class223 var323 = class213.field3383.method2258(true, var322);
                    if (var323.method1537(-3685)) {
                        field7684[field7690++] = class61.field928.method791(var321, true).method294(var322, 6978, var323.field3848);
                        return;
                    }
                    field7675[field7691++] = class61.field928.method791(var321, true).method293(0, var323.field3853, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field7691 -= 2;
                    int var324 = field7675[field7691];
                    int var325 = field7675[field7691 + 1];
                    class223 var326 = class213.field3383.method2258(true, var325);
                    if (var326.method1537(-3685)) {
                        field7684[field7690++] = class160.field2563.method1346(var324, 0).method2454(var326.field3848, var325, (byte) -85);
                        return;
                    }
                    field7675[field7691++] = class160.field2563.method1346(var324, 0).method2452(var326.field3853, var325, (byte) -34);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field7675[--field7691];
                class49 var328 = class224.field3870.method1934(121, var327);
                if (var328.field818 != null && var328.field818.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field806[0];
                    for (int var331 = 1; var331 < var328.field818.length; var331++) {
                        if (var328.field806[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field806[var331];
                        }
                    }
                    field7675[field7691++] = var328.field818[var329];
                    return;
                }
                field7675[field7691++] = var328.field793;
                return;
            }
        } else {
            class68 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class22.method115(7521, field7675[--field7691]);
            } else {
                var47 = arg1 ? field7685 : field7677;
            }
            if (arg0 == 1300) {
                int var48 = field7675[--field7691] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method445(0, var48, field7684[--field7690]);
                    return;
                } else {
                    field7690--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field7691 -= 2;
                int var49 = field7675[field7691];
                int var50 = field7675[field7691 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field1102 = null;
                    return;
                }
                var47.field1102 = class453.method2708(var49, 79, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field7675[--field7691];
                if (class320.field5017 != var51 && class333.field5237 != var51 && class462.field6873 != var51) {
                    return;
                }
                var47.field1085 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field1036 = field7675[--field7691];
                return;
            }
            if (arg0 == 1304) {
                var47.field1104 = field7675[--field7691];
                return;
            }
            if (arg0 == 1305) {
                var47.field1052 = field7684[--field7690];
                return;
            }
            if (arg0 == 1306) {
                var47.field1139 = field7684[--field7690];
                return;
            }
            if (arg0 == 1307) {
                var47.field1149 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field1087 = field7675[--field7691];
                var47.field1067 = field7675[--field7691];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field7675[--field7691];
                int var53 = field7675[--field7691];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method444(var52, -502, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field1082 = field7684[--field7690];
                return;
            }
            if (arg0 == 1311) {
                var47.field1079 = field7675[--field7691];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field7691 -= 3;
                    var54 = field7675[field7691] - 1;
                    var55 = field7675[field7691 + 1];
                    var56 = field7675[field7691 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7691 -= 2;
                    var54 = 10;
                    var55 = field7675[field7691];
                    var56 = field7675[field7691 + 1];
                }
                if (var47.field1071 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field1071 = new byte[11];
                    var47.field1121 = new byte[11];
                    var47.field1105 = new int[11];
                }
                var47.field1071[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field1057 = false;
                    for (int var57 = 0; var57 < var47.field1071.length; var57++) {
                        if (var47.field1071[var57] != 0) {
                            var47.field1057 = true;
                            break;
                        }
                    }
                } else {
                    var47.field1057 = true;
                }
                var47.field1121[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field1021 = field7675[--field7691];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 7465)
    private static final void method3081(String arg0, int arg1) {
        if (class407.field6189 == 0 && !(!class447.field6678 || class14.field161) || class303.field4857) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class203.field3206.method1954(0, -30366))) {
            var3 = 0;
            arg0 = arg0.substring(class203.field3206.method1954(0, -30366).length());
        } else if (var2.startsWith(class52.field844.method1954(0, -30366))) {
            var3 = 1;
            arg0 = arg0.substring(class52.field844.method1954(0, -30366).length());
        } else if (var2.startsWith(class250.field4259.method1954(0, -30366))) {
            var3 = 2;
            arg0 = arg0.substring(class250.field4259.method1954(0, -30366).length());
        } else if (var2.startsWith(class460.field6817.method1954(0, -30366))) {
            var3 = 3;
            arg0 = arg0.substring(class460.field6817.method1954(0, -30366).length());
        } else if (var2.startsWith(class127.field2191.method1954(0, -30366))) {
            var3 = 4;
            arg0 = arg0.substring(class127.field2191.method1954(0, -30366).length());
        } else if (var2.startsWith(class108.field1921.method1954(0, -30366))) {
            var3 = 5;
            arg0 = arg0.substring(class108.field1921.method1954(0, -30366).length());
        } else if (var2.startsWith(class437.field6523.method1954(0, -30366))) {
            var3 = 6;
            arg0 = arg0.substring(class437.field6523.method1954(0, -30366).length());
        } else if (var2.startsWith(class386.field5926.method1954(0, -30366))) {
            var3 = 7;
            arg0 = arg0.substring(class386.field5926.method1954(0, -30366).length());
        } else if (var2.startsWith(class394.field6023.method1954(0, -30366))) {
            var3 = 8;
            arg0 = arg0.substring(class394.field6023.method1954(0, -30366).length());
        } else if (var2.startsWith(class170.field2731.method1954(0, -30366))) {
            var3 = 9;
            arg0 = arg0.substring(class170.field2731.method1954(0, -30366).length());
        } else if (var2.startsWith(class9.field91.method1954(0, -30366))) {
            var3 = 10;
            arg0 = arg0.substring(class9.field91.method1954(0, -30366).length());
        } else if (var2.startsWith(class411.field6225.method1954(0, -30366))) {
            var3 = 11;
            arg0 = arg0.substring(class411.field6225.method1954(0, -30366).length());
        } else if (class300.field4813 != 0) {
            if (var2.startsWith(class203.field3206.method1954(class300.field4813, -30366))) {
                var3 = 0;
                arg0 = arg0.substring(class203.field3206.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class52.field844.method1954(class300.field4813, -30366))) {
                var3 = 1;
                arg0 = arg0.substring(class52.field844.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class250.field4259.method1954(class300.field4813, -30366))) {
                var3 = 2;
                arg0 = arg0.substring(class250.field4259.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class460.field6817.method1954(class300.field4813, -30366))) {
                var3 = 3;
                arg0 = arg0.substring(class460.field6817.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class127.field2191.method1954(class300.field4813, -30366))) {
                var3 = 4;
                arg0 = arg0.substring(class127.field2191.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class108.field1921.method1954(class300.field4813, -30366))) {
                var3 = 5;
                arg0 = arg0.substring(class108.field1921.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class437.field6523.method1954(class300.field4813, -30366))) {
                var3 = 6;
                arg0 = arg0.substring(class437.field6523.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class386.field5926.method1954(class300.field4813, -30366))) {
                var3 = 7;
                arg0 = arg0.substring(class386.field5926.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class394.field6023.method1954(class300.field4813, -30366))) {
                var3 = 8;
                arg0 = arg0.substring(class394.field6023.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class170.field2731.method1954(class300.field4813, -30366))) {
                var3 = 9;
                arg0 = arg0.substring(class170.field2731.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class9.field91.method1954(class300.field4813, -30366))) {
                var3 = 10;
                arg0 = arg0.substring(class9.field91.method1954(class300.field4813, -30366).length());
            } else if (var2.startsWith(class411.field6225.method1954(class300.field4813, -30366))) {
                var3 = 11;
                arg0 = arg0.substring(class411.field6225.method1954(class300.field4813, -30366).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class71.field1223.method1954(0, -30366))) {
            var5 = 1;
            arg0 = arg0.substring(class71.field1223.method1954(0, -30366).length());
        } else if (var4.startsWith(class455.field6791.method1954(0, -30366))) {
            var5 = 2;
            arg0 = arg0.substring(class455.field6791.method1954(0, -30366).length());
        } else if (var4.startsWith(class400.field6096.method1954(0, -30366))) {
            var5 = 3;
            arg0 = arg0.substring(class400.field6096.method1954(0, -30366).length());
        } else if (var4.startsWith(class115.field2039.method1954(0, -30366))) {
            var5 = 4;
            arg0 = arg0.substring(class115.field2039.method1954(0, -30366).length());
        } else if (var4.startsWith(class445.field6615.method1954(0, -30366))) {
            var5 = 5;
            arg0 = arg0.substring(class445.field6615.method1954(0, -30366).length());
        } else if (class300.field4813 != 0) {
            if (var4.startsWith(class71.field1223.method1954(class300.field4813, -30366))) {
                var5 = 1;
                arg0 = arg0.substring(class71.field1223.method1954(class300.field4813, -30366).length());
            } else if (var4.startsWith(class455.field6791.method1954(class300.field4813, -30366))) {
                var5 = 2;
                arg0 = arg0.substring(class455.field6791.method1954(class300.field4813, -30366).length());
            } else if (var4.startsWith(class400.field6096.method1954(class300.field4813, -30366))) {
                var5 = 3;
                arg0 = arg0.substring(class400.field6096.method1954(class300.field4813, -30366).length());
            } else if (var4.startsWith(class115.field2039.method1954(class300.field4813, -30366))) {
                var5 = 4;
                arg0 = arg0.substring(class115.field2039.method1954(class300.field4813, -30366).length());
            } else if (var4.startsWith(class445.field6615.method1954(class300.field4813, -30366))) {
                var5 = 5;
                arg0 = arg0.substring(class445.field6615.method1954(class300.field4813, -30366).length());
            }
        }
        field7692++;
        class265.method1775(-2, class261.field4361);
        class261.field4357.method163(0, (byte) 49);
        int var6 = class261.field4357.field301;
        if (arg1 == 5021) {
            class261.field4357.method163(1, (byte) 49);
        } else if (arg1 == 5022) {
            class261.field4357.method163(2, (byte) 49);
        } else {
            class261.field4357.method163(0, (byte) 49);
        }
        class261.field4357.method163(var3, (byte) 49);
        class261.field4357.method163(var5, (byte) 49);
        class286.method1861(arg0, (byte) 53, class261.field4357);
        class261.field4357.method140(class261.field4357.field301 - var6, true);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()V", line = 7739)
    public static void method3082() {
        field7687 = null;
        field7678 = null;
        field7686 = null;
        field7673 = null;
        field7675 = null;
        field7684 = null;
        field7671 = null;
        field7677 = null;
        field7685 = null;
        field7681 = null;
        field7676 = null;
        field7694 = null;
        field7696 = null;
        field7693 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lci;I)V", line = 7763)
    private static final void method3083(class483 arg0, int arg1) {
        Object[] var2 = arg0.field7101;
        int var3 = (Integer) var2[0];
        class405 var4 = class351.method2253(var3, 1);
        if (var4 == null) {
            return;
        }
        field7687 = new int[var4.field6145];
        int var5 = 0;
        field7678 = new String[var4.field6143];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7098;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7095;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7100 == null ? -1 : arg0.field7100.field1059;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7105;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7100 == null ? -1 : arg0.field7100.field1152;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7099 == null ? -1 : arg0.field7099.field1059;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7099 == null ? -1 : arg0.field7099.field1152;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7102;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7103;
                }
                field7687[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7097;
                }
                field7678[var6++] = var9;
            }
        }
        field7697 = arg0.field7096;
        method3072(var4, arg1);
    }
}
