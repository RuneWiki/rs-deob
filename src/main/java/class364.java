import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class364 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field4750 = new String[1000];

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    private static int field4760 = 0;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private static int field4756 = 0;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "[I")
    private static int[] field4759 = new int[1000];

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    private static int field4758 = 0;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[Lho;")
    private static class136[] field4761 = new class136[50];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
    private static int[] field4746 = new int[5];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[[I")
    private static int[][] field4757 = new int[5][5000];

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4764 = Calendar.getInstance();

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
    private static int[] field4771 = new int[3];

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field4772 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lpca;")
    public static class653 field4773 = new class653(4);

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    private static int field4774 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lep;")
    private static class382 field4749;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lep;")
    private static class382 field4763;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lbo;")
    private static class665 field4766;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[I")
    private static int[] field4767;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field4752;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqc;I)V", line = 4)
    private static final void method1997(class676 arg0, int arg1) {
        Object[] var2 = arg0.field9580;
        int var3 = (Integer) var2[0];
        class654 var4 = class470.method2664(var3, 0);
        if (var4 == null) {
            return;
        }
        field4767 = new int[var4.field9345];
        int var5 = 0;
        field4752 = new String[var4.field9350];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field9579;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field9586;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field9585 == null ? -1 : arg0.field9585.field5055;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field9577;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field9585 == null ? -1 : arg0.field9585.field5073;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field9578 == null ? -1 : arg0.field9578.field5055;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field9578 == null ? -1 : arg0.field9578.field5073;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field9573;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field9583;
                }
                field4767[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field9574;
                }
                field4752[var6++] = var9;
            }
        }
        field4774 = arg0.field9576;
        method1999(var4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lqc;)V", line = 82)
    public static final void method1998(class676 arg0) {
        method1997(arg0, 200000);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnk;I)V", line = 86)
    private static final void method1999(class654 arg0, int arg1) {
        field4760 = 0;
        field4756 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9351;
        int[] var4 = arg0.field9352;
        byte var5 = -1;
        field4758 = 0;
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
                        method2005(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2009(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4759[field4760++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4759[field4760++] = class491.field7127.field3020[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class491.field7127.method1377(field4759[--field4760], var8, (byte) 98);
                } else if (var43 == 3) {
                    field4750[field4756++] = arg0.field9343[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4760 -= 2;
                    if (field4759[field4760 + 1] != field4759[field4760]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4760 -= 2;
                    if (field4759[field4760 + 1] == field4759[field4760]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4760 -= 2;
                    if (field4759[field4760] < field4759[field4760 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4760 -= 2;
                    if (field4759[field4760] > field4759[field4760 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4758 == 0) {
                        return;
                    }
                    class136 var9 = field4761[--field4758];
                    arg0 = var9.field1548;
                    var3 = arg0.field9351;
                    var4 = arg0.field9352;
                    var2 = var9.field1549;
                    field4767 = var9.field1550;
                    field4752 = var9.field1552;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4759[field4760++] = class491.field7127.method1372(var10, (byte) -34);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class491.field7127.method1378((byte) -104, field4759[--field4760], var11);
                } else if (var43 == 31) {
                    field4760 -= 2;
                    if (field4759[field4760] <= field4759[field4760 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4760 -= 2;
                    if (field4759[field4760] >= field4759[field4760 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4759[field4760++] = field4767[var4[var2]];
                } else if (var43 == 34) {
                    field4767[var4[var2]] = field4759[--field4760];
                } else if (var43 == 35) {
                    field4750[field4756++] = field4752[var4[var2]];
                } else if (var43 == 36) {
                    field4752[var4[var2]] = field4750[--field4756];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4756 -= var12;
                    String var13 = class279.method1592(field4756, field4750, var12, (byte) 55);
                    field4750[field4756++] = var13;
                } else if (var43 == 38) {
                    field4760--;
                } else if (var43 == 39) {
                    field4756--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class654 var15 = class470.method2664(var14, 0);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9345];
                    String[] var17 = new String[var15.field9350];
                    for (int var18 = 0; var18 < var15.field9353; var18++) {
                        var16[var18] = field4759[field4760 + var18 - var15.field9353];
                    }
                    for (int var19 = 0; var19 < var15.field9349; var19++) {
                        var17[var19] = field4750[field4756 + var19 - var15.field9349];
                    }
                    field4760 -= var15.field9353;
                    field4756 -= var15.field9349;
                    class136 var20 = new class136();
                    var20.field1548 = arg0;
                    var20.field1549 = var2;
                    var20.field1550 = field4767;
                    var20.field1552 = field4752;
                    if (field4758 >= field4761.length) {
                        throw new RuntimeException();
                    }
                    field4761[field4758++] = var20;
                    arg0 = var15;
                    var3 = var15.field9351;
                    var4 = var15.field9352;
                    var2 = -1;
                    field4767 = var16;
                    field4752 = var17;
                } else if (var43 == 42) {
                    field4759[field4760++] = class585.field8313[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class585.field8313[var21] = field4759[--field4760];
                    class496.method2856(var21, -94);
                    class135.field1526 |= class462.field6424[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4759[--field4760];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4746[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4757[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4759[--field4760];
                    if (var28 < 0 || var28 >= field4746[var27]) {
                        throw new RuntimeException();
                    }
                    field4759[field4760++] = field4757[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4760 -= 2;
                    int var30 = field4759[field4760];
                    if (var30 < 0 || var30 >= field4746[var29]) {
                        throw new RuntimeException();
                    }
                    field4757[var29][var30] = field4759[field4760 + 1];
                } else if (var43 == 47) {
                    String var31 = class53.field550[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4750[field4756++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class53.field550[var32] = field4750[--field4756];
                    class52.method264(var32, true);
                } else if (var43 == 51) {
                    class572 var33 = arg0.field9347[var4[var2]];
                    class337 var34 = (class337) var33.method3234((byte) -49, (long) field4759[--field4760]);
                    if (var34 != null) {
                        var2 += var34.field4415;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field9342 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3405).append(" ");
                for (int var41 = field4758 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4761[var41].field1548.field3405).append(" ");
                }
                var40.append("op: ").append(var5);
                class150.method824(15, var42, var40.toString());
            } else {
                class638.method3593(true, 4, "Clientscript error in: " + arg0.field9342);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9342).append("\n");
                for (int var38 = field4758 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4761[var38].field1548.field9342).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class150.method824(15, var42, var37.toString());
                class446.method2473(var37.toString(), (byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 514)
    public static void method2000() {
        field4767 = null;
        field4752 = null;
        field4746 = null;
        field4757 = null;
        field4759 = null;
        field4750 = null;
        field4761 = null;
        field4763 = null;
        field4749 = null;
        field4766 = null;
        field4764 = null;
        field4772 = null;
        field4771 = null;
        field4773 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 531)
    private static final void method2001(int arg0) {
        class382 var1 = class505.method2903(arg0, 65535);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class382[] var3 = class461.field6408[var2];
        if (var3 == null) {
            class382[] var4 = class271.field3434[var2];
            int var5 = var4.length;
            var3 = class461.field6408[var2] = new class382[var5];
            class652.method3677(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class652.method3677(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 569)
    private static final void method2002(String arg0, int arg1) {
        if (class295.field3874 == 0 && !(!class89.field946 || class539.field7752) || class198.field2403) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class221.field2766.method1296(0, (byte) -94))) {
            var3 = 0;
            arg0 = arg0.substring(class221.field2766.method1296(0, (byte) -82).length());
        } else if (var2.startsWith(class221.field2767.method1296(0, (byte) 85))) {
            var3 = 1;
            arg0 = arg0.substring(class221.field2767.method1296(0, (byte) 123).length());
        } else if (var2.startsWith(class221.field2768.method1296(0, (byte) -83))) {
            var3 = 2;
            arg0 = arg0.substring(class221.field2768.method1296(0, (byte) -117).length());
        } else if (var2.startsWith(class221.field2769.method1296(0, (byte) 77))) {
            var3 = 3;
            arg0 = arg0.substring(class221.field2769.method1296(0, (byte) -113).length());
        } else if (var2.startsWith(class221.field2770.method1296(0, (byte) -127))) {
            var3 = 4;
            arg0 = arg0.substring(class221.field2770.method1296(0, (byte) -121).length());
        } else if (var2.startsWith(class221.field2771.method1296(0, (byte) 88))) {
            var3 = 5;
            arg0 = arg0.substring(class221.field2771.method1296(0, (byte) -120).length());
        } else if (var2.startsWith(class221.field2772.method1296(0, (byte) 88))) {
            var3 = 6;
            arg0 = arg0.substring(class221.field2772.method1296(0, (byte) 105).length());
        } else if (var2.startsWith(class221.field2773.method1296(0, (byte) 62))) {
            var3 = 7;
            arg0 = arg0.substring(class221.field2773.method1296(0, (byte) 107).length());
        } else if (var2.startsWith(class221.field2774.method1296(0, (byte) -126))) {
            var3 = 8;
            arg0 = arg0.substring(class221.field2774.method1296(0, (byte) -85).length());
        } else if (var2.startsWith(class221.field2775.method1296(0, (byte) -80))) {
            var3 = 9;
            arg0 = arg0.substring(class221.field2775.method1296(0, (byte) -104).length());
        } else if (var2.startsWith(class221.field2776.method1296(0, (byte) -124))) {
            var3 = 10;
            arg0 = arg0.substring(class221.field2776.method1296(0, (byte) 107).length());
        } else if (var2.startsWith(class221.field2777.method1296(0, (byte) 115))) {
            var3 = 11;
            arg0 = arg0.substring(class221.field2777.method1296(0, (byte) -89).length());
        } else if (class226.field2899 != 0) {
            if (var2.startsWith(class221.field2766.method1296(class226.field2899, (byte) -77))) {
                var3 = 0;
                arg0 = arg0.substring(class221.field2766.method1296(class226.field2899, (byte) -82).length());
            } else if (var2.startsWith(class221.field2767.method1296(class226.field2899, (byte) -74))) {
                var3 = 1;
                arg0 = arg0.substring(class221.field2767.method1296(class226.field2899, (byte) -92).length());
            } else if (var2.startsWith(class221.field2768.method1296(class226.field2899, (byte) 86))) {
                var3 = 2;
                arg0 = arg0.substring(class221.field2768.method1296(class226.field2899, (byte) 111).length());
            } else if (var2.startsWith(class221.field2769.method1296(class226.field2899, (byte) 71))) {
                var3 = 3;
                arg0 = arg0.substring(class221.field2769.method1296(class226.field2899, (byte) 50).length());
            } else if (var2.startsWith(class221.field2770.method1296(class226.field2899, (byte) 63))) {
                var3 = 4;
                arg0 = arg0.substring(class221.field2770.method1296(class226.field2899, (byte) -82).length());
            } else if (var2.startsWith(class221.field2771.method1296(class226.field2899, (byte) -76))) {
                var3 = 5;
                arg0 = arg0.substring(class221.field2771.method1296(class226.field2899, (byte) 108).length());
            } else if (var2.startsWith(class221.field2772.method1296(class226.field2899, (byte) -86))) {
                var3 = 6;
                arg0 = arg0.substring(class221.field2772.method1296(class226.field2899, (byte) 121).length());
            } else if (var2.startsWith(class221.field2773.method1296(class226.field2899, (byte) -118))) {
                var3 = 7;
                arg0 = arg0.substring(class221.field2773.method1296(class226.field2899, (byte) -91).length());
            } else if (var2.startsWith(class221.field2774.method1296(class226.field2899, (byte) 85))) {
                var3 = 8;
                arg0 = arg0.substring(class221.field2774.method1296(class226.field2899, (byte) -82).length());
            } else if (var2.startsWith(class221.field2775.method1296(class226.field2899, (byte) 102))) {
                var3 = 9;
                arg0 = arg0.substring(class221.field2775.method1296(class226.field2899, (byte) 96).length());
            } else if (var2.startsWith(class221.field2776.method1296(class226.field2899, (byte) 73))) {
                var3 = 10;
                arg0 = arg0.substring(class221.field2776.method1296(class226.field2899, (byte) 89).length());
            } else if (var2.startsWith(class221.field2777.method1296(class226.field2899, (byte) 56))) {
                var3 = 11;
                arg0 = arg0.substring(class221.field2777.method1296(class226.field2899, (byte) 61).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class221.field2778.method1296(0, (byte) 59))) {
            var5 = 1;
            arg0 = arg0.substring(class221.field2778.method1296(0, (byte) 79).length());
        } else if (var4.startsWith(class221.field2779.method1296(0, (byte) 68))) {
            var5 = 2;
            arg0 = arg0.substring(class221.field2779.method1296(0, (byte) 53).length());
        } else if (var4.startsWith(class221.field2780.method1296(0, (byte) -95))) {
            var5 = 3;
            arg0 = arg0.substring(class221.field2780.method1296(0, (byte) -106).length());
        } else if (var4.startsWith(class221.field2781.method1296(0, (byte) -112))) {
            var5 = 4;
            arg0 = arg0.substring(class221.field2781.method1296(0, (byte) -83).length());
        } else if (var4.startsWith(class221.field2782.method1296(0, (byte) 55))) {
            var5 = 5;
            arg0 = arg0.substring(class221.field2782.method1296(0, (byte) -104).length());
        } else if (class226.field2899 != 0) {
            if (var4.startsWith(class221.field2778.method1296(class226.field2899, (byte) 55))) {
                var5 = 1;
                arg0 = arg0.substring(class221.field2778.method1296(class226.field2899, (byte) -75).length());
            } else if (var4.startsWith(class221.field2779.method1296(class226.field2899, (byte) -72))) {
                var5 = 2;
                arg0 = arg0.substring(class221.field2779.method1296(class226.field2899, (byte) -107).length());
            } else if (var4.startsWith(class221.field2780.method1296(class226.field2899, (byte) -80))) {
                var5 = 3;
                arg0 = arg0.substring(class221.field2780.method1296(class226.field2899, (byte) 68).length());
            } else if (var4.startsWith(class221.field2781.method1296(class226.field2899, (byte) 90))) {
                var5 = 4;
                arg0 = arg0.substring(class221.field2781.method1296(class226.field2899, (byte) -105).length());
            } else if (var4.startsWith(class221.field2782.method1296(class226.field2899, (byte) 97))) {
                var5 = 5;
                arg0 = arg0.substring(class221.field2782.method1296(class226.field2899, (byte) -118).length());
            }
        }
        field4747++;
        class480.method2802(class36.field405, 16751);
        class334.field4314.method2525(0, -81849);
        int var6 = class334.field4314.field6215;
        class334.field4314.method2525(var3, -81849);
        class334.field4314.method2525(var5, -81849);
        class562.method3166(1024, class334.field4314, arg0);
        class334.field4314.method2551(class334.field4314.field6215 - var6, -104);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 843)
    public static final void method2003(int arg0) {
        if (arg0 == -1 || !class315.method1784(arg0, 4269)) {
            return;
        }
        class382[] var1 = class271.field3434[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class382 var3 = var1[var2];
            if (var3.field5047 != null) {
                class676 var4 = new class676();
                var4.field9585 = var3;
                var4.field9580 = var3.field5047;
                method1997(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Ljava/lang/String;", line = 878)
    private static final String method2004(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4764.setTime(new Date(var1));
        int var3 = field4764.get(5);
        int var4 = field4764.get(2);
        int var5 = field4764.get(1);
        return var3 + "-" + field4772[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V", line = 889)
    private static final void method2005(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4760 -= 3;
                int var2 = field4759[field4760];
                int var3 = field4759[field4760 + 1];
                int var4 = field4759[field4760 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class382 var5 = class505.method2903(var2, 65535);
                if (var5.field4989 == null) {
                    var5.field4989 = new class382[var4 + 1];
                }
                if (var5.field4989.length <= var4) {
                    class382[] var6 = new class382[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4989.length; var7++) {
                        var6[var7] = var5.field4989[var7];
                    }
                    var5.field4989 = var6;
                }
                if (var4 > 0 && var5.field4989[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class382 var8 = new class382();
                var8.field5112 = var3;
                var8.field5108 = var8.field5055 = var5.field5055;
                var8.field5073 = var4;
                var5.field4989[var4] = var8;
                if (arg1) {
                    field4749 = var8;
                } else {
                    field4763 = var8;
                }
                class567.method3207((byte) -69, var5);
                return;
            }
            if (arg0 == 101) {
                class382 var9 = arg1 ? field4749 : field4763;
                if (var9.field5073 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class382 var10 = class505.method2903(var9.field5055, 65535);
                var10.field4989[var9.field5073] = null;
                class567.method3207((byte) -69, var10);
                return;
            }
            if (arg0 == 102) {
                class382 var11 = class505.method2903(field4759[--field4760], 65535);
                var11.field4989 = null;
                class567.method3207((byte) -69, var11);
                return;
            }
            if (arg0 == 200) {
                field4760 -= 2;
                int var12 = field4759[field4760];
                int var13 = field4759[field4760 + 1];
                class382 var14 = class657.method3708(var13, (byte) -46, var12);
                if (var14 != null && var13 != -1) {
                    field4759[field4760++] = 1;
                    if (arg1) {
                        field4749 = var14;
                        return;
                    }
                    field4763 = var14;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4759[--field4760];
                class382 var16 = class505.method2903(var15, 65535);
                if (var16 != null) {
                    field4759[field4760++] = 1;
                    if (arg1) {
                        field4749 = var16;
                        return;
                    }
                    field4763 = var16;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4759[--field4760];
                method2007(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4759[--field4760];
                method2001(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4760 -= 2;
                int var19 = field4759[field4760];
                int var20 = field4759[field4760 + 1];
                for (int var21 = 0; var21 < class674.field9567.length; var21++) {
                    if (class674.field9567[var21] == var19) {
                        class377.field4914.field6309.method1302((byte) 4, var21, class209.field2546, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class249.field3197.length; var22++) {
                    if (class249.field3197[var22] == var19) {
                        class377.field4914.field6309.method1302((byte) 4, var22, class209.field2546, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4760 -= 2;
                int var23 = field4759[field4760];
                int var24 = field4759[field4760 + 1];
                class377.field4914.field6309.method1310(105, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4759[--field4760] != 0;
                class377.field4914.field6309.method1304((byte) 94, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class382 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class505.method2903(field4759[--field4760], 65535);
            } else {
                var26 = arg1 ? field4749 : field4763;
            }
            if (arg0 == 1000) {
                field4760 -= 4;
                var26.field5101 = field4759[field4760];
                var26.field5030 = field4759[field4760 + 1];
                int var27 = field4759[field4760 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4759[field4760 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5022 = (byte) var27;
                var26.field5120 = (byte) var28;
                class567.method3207((byte) -69, var26);
                class500.method2879(0, var26);
                if (var26.field5073 == -1) {
                    class591.method3316(var26.field5055, (byte) -62);
                }
                return;
            }
            if (arg0 == 1001) {
                field4760 -= 4;
                var26.field5102 = field4759[field4760];
                var26.field5124 = field4759[field4760 + 1];
                var26.field5085 = 0;
                var26.field5069 = 0;
                int var29 = field4759[field4760 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4759[field4760 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field4970 = (byte) var29;
                var26.field4971 = (byte) var30;
                class567.method3207((byte) -69, var26);
                class500.method2879(0, var26);
                if (var26.field5112 == 0) {
                    class57.method387(90, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4759[--field4760] == 1;
                if (var26.field5087 != var31) {
                    var26.field5087 = var31;
                    class567.method3207((byte) -69, var26);
                }
                if (var26.field5073 == -1) {
                    class618.method3468((byte) 23, var26.field5055);
                }
                return;
            }
            if (arg0 == 1004) {
                field4760 -= 2;
                var26.field5062 = field4759[field4760];
                var26.field5080 = field4759[field4760 + 1];
                class567.method3207((byte) -69, var26);
                class500.method2879(0, var26);
                if (var26.field5112 == 0) {
                    class57.method387(125, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5019 = field4759[--field4760] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class382 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class505.method2903(field4759[--field4760], 65535);
            } else {
                var32 = arg1 ? field4749 : field4763;
            }
            if (arg0 == 1100) {
                field4760 -= 2;
                var32.field5008 = field4759[field4760];
                if (var32.field5008 > var32.field5064 - var32.field5035) {
                    var32.field5008 = var32.field5064 - var32.field5035;
                }
                if (var32.field5008 < 0) {
                    var32.field5008 = 0;
                }
                var32.field5051 = field4759[field4760 + 1];
                if (var32.field5051 > var32.field4976 - var32.field4958) {
                    var32.field5051 = var32.field4976 - var32.field4958;
                }
                if (var32.field5051 < 0) {
                    var32.field5051 = 0;
                }
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class576.method3256(var32.field5055, (byte) -96);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5109 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class602.method3366(var32.field5055, -126);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5076 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field4998 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field5057 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4759[--field4760];
                if (var32.field5013 != var33) {
                    var32.field5013 = var33;
                    class567.method3207((byte) -69, var32);
                }
                if (var32.field5073 == -1) {
                    class127.method730(var32.field5055, 85);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5025 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field5111 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field5038 = 1;
                var32.field5072 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class410.method2223(-128, var32.field5055);
                }
                return;
            }
            if (arg0 == 1109) {
                field4760 -= 6;
                var32.field5095 = field4759[field4760];
                var32.field4997 = field4759[field4760 + 1];
                var32.field5004 = field4759[field4760 + 2];
                var32.field5043 = field4759[field4760 + 3];
                var32.field5099 = field4759[field4760 + 4];
                var32.field5066 = field4759[field4760 + 5];
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class477.method2787(-1, var32.field5055);
                    class198.method1206(10, var32.field5055);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4759[--field4760];
                if (var32.field5048 != var34) {
                    var32.field5048 = var34;
                    var32.field5027 = 0;
                    var32.field5061 = 1;
                    var32.field4956 = 0;
                    class567.method3207((byte) -69, var32);
                }
                if (var32.field5073 == -1) {
                    class311.method1762(var32.field5055, (byte) -73);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field4959 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4750[--field4756];
                if (!var35.equals(var32.field5068)) {
                    var32.field5068 = var35;
                    class567.method3207((byte) -69, var32);
                }
                if (var32.field5073 == -1) {
                    class450.method2503(-57, var32.field5055);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5037 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class263.method1494((byte) 124, var32.field5055);
                }
                return;
            }
            if (arg0 == 1114) {
                field4760 -= 3;
                var32.field5046 = field4759[field4760];
                var32.field5017 = field4759[field4760 + 1];
                var32.field5010 = field4759[field4760 + 2];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field5034 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field4981 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field5049 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field4968 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field4999 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1120) {
                field4760 -= 2;
                var32.field5064 = field4759[field4760];
                var32.field4976 = field4759[field4760 + 1];
                class567.method3207((byte) -69, var32);
                if (var32.field5112 == 0) {
                    class57.method387(127, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field4760 -= 2;
                var32.field5067 = (short) field4759[field4760];
                var32.field5094 = (short) field4759[field4760 + 1];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field4960 = field4759[--field4760] == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field5066 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                if (var32.field5073 == -1) {
                    class477.method2787(-1, var32.field5055);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4759[--field4760];
                var32.field5081 = var36 == 1;
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1125) {
                field4760 -= 2;
                var32.field5003 = field4759[field4760];
                var32.field5083 = field4759[field4760 + 1];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field5070 = field4759[--field4760];
                class567.method3207((byte) -69, var32);
                return;
            }
            if (arg0 == 1127) {
                field4760 -= 2;
                int var37 = field4759[field4760];
                int var38 = field4759[field4760 + 1];
                class450 var39 = class80.field854.method687(false, var37);
                if (var39.field6198 != var38) {
                    var32.method2096(var37, 12258, var38);
                    return;
                }
                var32.method2105(var37, -120);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field4759[--field4760];
                String var41 = field4750[--field4756];
                class450 var42 = class80.field854.method687(false, var40);
                if (!var42.field6197.equals(var41)) {
                    var32.method2097(var40, true, var41);
                    return;
                }
                var32.method2105(var40, -89);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class382 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class505.method2903(field4759[--field4760], 65535);
            } else {
                var43 = arg1 ? field4749 : field4763;
            }
            class567.method3207((byte) -69, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4760 -= 2;
                int var44 = field4759[field4760];
                int var45 = field4759[field4760 + 1];
                if (var43.field5073 == -1) {
                    class368.method2016(var43.field5055, (byte) 29);
                    class477.method2787(-1, var43.field5055);
                    class198.method1206(10, var43.field5055);
                }
                if (var44 == -1) {
                    var43.field5038 = 1;
                    var43.field5072 = -1;
                    var43.field5110 = -1;
                    return;
                }
                var43.field5110 = var44;
                var43.field4963 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field4965 = true;
                } else {
                    var43.field4965 = false;
                }
                class537 var46 = class472.field6588.method1903(var44, (byte) 75);
                var43.field5004 = var46.field7717;
                var43.field5043 = var46.field7728;
                var43.field5099 = var46.field7700;
                var43.field5095 = var46.field7714;
                var43.field4997 = var46.field7691;
                var43.field5066 = var46.field7722;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field4967 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field4967 = 1;
                } else {
                    var43.field4967 = 2;
                }
                if (var43.field5085 > 0) {
                    var43.field5066 = var43.field5066 * 32 / var43.field5085;
                    return;
                }
                if (var43.field5102 > 0) {
                    var43.field5066 = var43.field5066 * 32 / var43.field5102;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5038 = 2;
                var43.field5072 = field4759[--field4760];
                if (var43.field5073 == -1) {
                    class410.method2223(-125, var43.field5055);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5038 = 3;
                var43.field5072 = -1;
                if (var43.field5073 == -1) {
                    class410.method2223(-125, var43.field5055);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5038 = 6;
                var43.field5072 = field4759[--field4760];
                if (var43.field5073 == -1) {
                    class410.method2223(-125, var43.field5055);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5038 = 5;
                var43.field5072 = field4759[--field4760];
                if (var43.field5073 == -1) {
                    class410.method2223(-128, var43.field5055);
                }
                return;
            }
            if (arg0 == 1206) {
                field4760 -= 4;
                var43.field5116 = field4759[field4760];
                var43.field4977 = field4759[field4760 + 1];
                var43.field5063 = field4759[field4760 + 2];
                var43.field4975 = field4759[field4760 + 3];
                class567.method3207((byte) -69, var43);
                return;
            }
            if (arg0 == 1207) {
                field4760 -= 2;
                var43.field5059 = field4759[field4760];
                var43.field5125 = field4759[field4760 + 1];
                class567.method3207((byte) -69, var43);
                return;
            }
            if (arg0 == 1210) {
                field4760 -= 4;
                var43.field5072 = field4759[field4760];
                var43.field5028 = field4759[field4760 + 1];
                if (field4759[field4760 + 2] == 1) {
                    var43.field5038 = 9;
                } else {
                    var43.field5038 = 8;
                }
                if (field4759[field4760 + 3] == 1) {
                    var43.field4965 = true;
                } else {
                    var43.field4965 = false;
                }
                if (var43.field5073 == -1) {
                    class410.method2223(-127, var43.field5055);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5038 = 5;
                var43.field5072 = class90.field1038;
                var43.field5028 = 0;
                if (var43.field5073 == -1) {
                    class410.method2223(-127, var43.field5055);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class382 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class505.method2903(field4759[--field4760], 65535);
            } else {
                var47 = arg1 ? field4749 : field4763;
            }
            if (arg0 == 1300) {
                int var48 = field4759[--field4760] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2104(field4750[--field4756], 0, var48);
                    return;
                }
                field4756--;
                return;
            }
            if (arg0 == 1301) {
                field4760 -= 2;
                int var49 = field4759[field4760];
                int var50 = field4759[field4760 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5026 = null;
                    return;
                }
                var47.field5026 = class657.method3708(var50, (byte) -50, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field4759[--field4760];
                if (class627.field8905 != var51 && class41.field435 != var51 && class1.field6 != var51) {
                    return;
                }
                var47.field5105 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5039 = field4759[--field4760];
                return;
            }
            if (arg0 == 1304) {
                var47.field5122 = field4759[--field4760];
                return;
            }
            if (arg0 == 1305) {
                var47.field5007 = field4750[--field4756];
                return;
            }
            if (arg0 == 1306) {
                var47.field5040 = field4750[--field4756];
                return;
            }
            if (arg0 == 1307) {
                var47.field5054 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field4995 = field4759[--field4760];
                var47.field5006 = field4759[--field4760];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field4759[--field4760];
                int var53 = field4759[--field4760];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2099(var52, var53 - 1, 0);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5117 = field4750[--field4756];
                return;
            }
            if (arg0 == 1311) {
                var47.field4974 = field4759[--field4760];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field4760 -= 3;
                    var54 = field4759[field4760] - 1;
                    var55 = field4759[field4760 + 1];
                    var56 = field4759[field4760 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4760 -= 2;
                    var54 = 10;
                    var55 = field4759[field4760];
                    var56 = field4759[field4760 + 1];
                }
                if (var47.field5075 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5075 = new byte[11];
                    var47.field5082 = new byte[11];
                    var47.field5119 = new int[11];
                }
                var47.field5075[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field4990 = false;
                    for (int var57 = 0; var57 < var47.field5075.length; var57++) {
                        if (var47.field5075[var57] != 0) {
                            var47.field4990 = true;
                            break;
                        }
                    }
                } else {
                    var47.field4990 = true;
                }
                var47.field5082[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5050 = field4759[--field4760];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class382 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class505.method2903(field4759[--field4760], 65535);
            } else {
                var58 = arg1 ? field4749 : field4763;
            }
            if (arg0 == 1499) {
                var58.method2100(73);
                return;
            }
            String var59 = field4750[--field4756];
            int[] var60 = null;
            if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                int var61 = field4759[--field4760];
                if (var61 > 0) {
                    var60 = new int[var61];
                    while (var61-- > 0) {
                        var60[var61] = field4759[--field4760];
                    }
                }
                var59 = var59.substring(0, var59.length() - 1);
            }
            Object[] var62 = new Object[var59.length() + 1];
            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                if (var59.charAt(var63 - 1) == 's') {
                    var62[var63] = field4750[--field4756];
                } else {
                    var62[var63] = Integer.valueOf(field4759[--field4760]);
                }
            }
            int var64 = field4759[--field4760];
            if (var64 == -1) {
                var62 = null;
            } else {
                var62[0] = Integer.valueOf(var64);
            }
            if (arg0 == 1400) {
                var58.field5014 = var62;
            } else if (arg0 == 1401) {
                var58.field4957 = var62;
            } else if (arg0 == 1402) {
                var58.field5079 = var62;
            } else if (arg0 == 1403) {
                var58.field5032 = var62;
            } else if (arg0 == 1404) {
                var58.field4980 = var62;
            } else if (arg0 == 1405) {
                var58.field5093 = var62;
            } else if (arg0 == 1406) {
                var58.field5053 = var62;
            } else if (arg0 == 1407) {
                var58.field5092 = var62;
                var58.field5113 = var60;
            } else if (arg0 == 1408) {
                var58.field5012 = var62;
            } else if (arg0 == 1409) {
                var58.field4966 = var62;
            } else if (arg0 == 1410) {
                var58.field4993 = var62;
            } else if (arg0 == 1411) {
                var58.field4972 = var62;
            } else if (arg0 == 1412) {
                var58.field5000 = var62;
            } else if (arg0 == 1414) {
                var58.field5104 = var62;
                var58.field5036 = var60;
            } else if (arg0 == 1415) {
                var58.field4988 = var62;
                var58.field5103 = var60;
            } else if (arg0 == 1416) {
                var58.field5090 = var62;
            } else if (arg0 == 1417) {
                var58.field5123 = var62;
            } else if (arg0 == 1418) {
                var58.field5001 = var62;
            } else if (arg0 == 1419) {
                var58.field4961 = var62;
            } else if (arg0 == 1420) {
                var58.field4973 = var62;
            } else if (arg0 == 1421) {
                var58.field5021 = var62;
            } else if (arg0 == 1422) {
                var58.field5100 = var62;
            } else if (arg0 == 1423) {
                var58.field5077 = var62;
            } else if (arg0 == 1424) {
                var58.field5118 = var62;
            } else if (arg0 == 1425) {
                var58.field5052 = var62;
            } else if (arg0 == 1426) {
                var58.field4991 = var62;
            } else if (arg0 == 1427) {
                var58.field5097 = var62;
            } else if (arg0 == 1428) {
                var58.field5078 = var62;
                var58.field4986 = var60;
            } else if (arg0 == 1429) {
                var58.field5106 = var62;
                var58.field5015 = var60;
            } else if (arg0 == 1430) {
                var58.field5114 = var62;
            }
            var58.field5029 = true;
            return;
        } else if (arg0 < 1600) {
            class382 var65 = arg1 ? field4749 : field4763;
            if (arg0 == 1500) {
                field4759[field4760++] = var65.field4996;
                return;
            }
            if (arg0 == 1501) {
                field4759[field4760++] = var65.field4987;
                return;
            }
            if (arg0 == 1502) {
                field4759[field4760++] = var65.field5035;
                return;
            }
            if (arg0 == 1503) {
                field4759[field4760++] = var65.field4958;
                return;
            }
            if (arg0 == 1504) {
                field4759[field4760++] = var65.field5087 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field4759[field4760++] = var65.field5108;
                return;
            }
            if (arg0 == 1506) {
                class382 var66 = class508.method2917(var65, (byte) -28);
                field4759[field4760++] = var66 == null ? -1 : var66.field5055;
                return;
            }
        } else if (arg0 < 1700) {
            class382 var67 = arg1 ? field4749 : field4763;
            if (arg0 == 1600) {
                field4759[field4760++] = var67.field5008;
                return;
            }
            if (arg0 == 1601) {
                field4759[field4760++] = var67.field5051;
                return;
            }
            if (arg0 == 1602) {
                field4750[field4756++] = var67.field5068;
                return;
            }
            if (arg0 == 1603) {
                field4759[field4760++] = var67.field5064;
                return;
            }
            if (arg0 == 1604) {
                field4759[field4760++] = var67.field4976;
                return;
            }
            if (arg0 == 1605) {
                field4759[field4760++] = var67.field5066;
                return;
            }
            if (arg0 == 1606) {
                field4759[field4760++] = var67.field5004;
                return;
            }
            if (arg0 == 1607) {
                field4759[field4760++] = var67.field5099;
                return;
            }
            if (arg0 == 1608) {
                field4759[field4760++] = var67.field5043;
                return;
            }
            if (arg0 == 1609) {
                field4759[field4760++] = var67.field4998;
                return;
            }
            if (arg0 == 1610) {
                field4759[field4760++] = var67.field5095;
                return;
            }
            if (arg0 == 1611) {
                field4759[field4760++] = var67.field4997;
                return;
            }
            if (arg0 == 1612) {
                field4759[field4760++] = var67.field5013;
                return;
            }
            if (arg0 == 1613) {
                int var68 = field4759[--field4760];
                class450 var69 = class80.field854.method687(false, var68);
                if (var69.method2500(true)) {
                    field4750[field4756++] = var67.method2088(var69.field6197, var68, false);
                    return;
                }
                field4759[field4760++] = var67.method2101(-111, var68, var69.field6198);
                return;
            }
            if (arg0 == 1614) {
                field4759[field4760++] = var67.field5025;
                return;
            }
        } else if (arg0 < 1800) {
            class382 var70 = arg1 ? field4749 : field4763;
            if (arg0 == 1700) {
                field4759[field4760++] = var70.field5110;
                return;
            }
            if (arg0 == 1701) {
                if (var70.field5110 != -1) {
                    field4759[field4760++] = var70.field4963;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field4759[field4760++] = var70.field5073;
                return;
            }
        } else if (arg0 < 1900) {
            class382 var71 = arg1 ? field4749 : field4763;
            if (arg0 == 1800) {
                field4759[field4760++] = client.method1530(var71).method1495((byte) 115);
                return;
            }
            if (arg0 == 1801) {
                int var72 = field4759[--field4760];
                int var342 = var72 - 1;
                if (var71.field5054 != null && var342 < var71.field5054.length && var71.field5054[var342] != null) {
                    field4750[field4756++] = var71.field5054[var342];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var71.field5007 == null) {
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = var71.field5007;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class382 var340;
            if (arg0 >= 2000) {
                var340 = class505.method2903(field4759[--field4760], 65535);
                arg0 -= 1000;
            } else {
                var340 = arg1 ? field4749 : field4763;
            }
            if (field4774 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var340.field5097 == null) {
                    return;
                }
                class676 var341 = new class676();
                var341.field9585 = var340;
                var341.field9580 = var340.field5097;
                var341.field9576 = field4774 + 1;
                class522.field7480.method3164(var341, 256);
                return;
            }
        } else if (arg0 < 2600) {
            class382 var73 = class505.method2903(field4759[--field4760], 65535);
            if (arg0 == 2500) {
                field4759[field4760++] = var73.field4996;
                return;
            }
            if (arg0 == 2501) {
                field4759[field4760++] = var73.field4987;
                return;
            }
            if (arg0 == 2502) {
                field4759[field4760++] = var73.field5035;
                return;
            }
            if (arg0 == 2503) {
                field4759[field4760++] = var73.field4958;
                return;
            }
            if (arg0 == 2504) {
                field4759[field4760++] = var73.field5087 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field4759[field4760++] = var73.field5108;
                return;
            }
            if (arg0 == 1506) {
                class382 var74 = class508.method2917(var73, (byte) -28);
                field4759[field4760++] = var74 == null ? -1 : var74.field5055;
                return;
            }
        } else if (arg0 < 2700) {
            class382 var75 = class505.method2903(field4759[--field4760], 65535);
            if (arg0 == 2600) {
                field4759[field4760++] = var75.field5008;
                return;
            }
            if (arg0 == 2601) {
                field4759[field4760++] = var75.field5051;
                return;
            }
            if (arg0 == 2602) {
                field4750[field4756++] = var75.field5068;
                return;
            }
            if (arg0 == 2603) {
                field4759[field4760++] = var75.field5064;
                return;
            }
            if (arg0 == 2604) {
                field4759[field4760++] = var75.field4976;
                return;
            }
            if (arg0 == 2605) {
                field4759[field4760++] = var75.field5066;
                return;
            }
            if (arg0 == 2606) {
                field4759[field4760++] = var75.field5004;
                return;
            }
            if (arg0 == 2607) {
                field4759[field4760++] = var75.field5099;
                return;
            }
            if (arg0 == 2608) {
                field4759[field4760++] = var75.field5043;
                return;
            }
            if (arg0 == 2609) {
                field4759[field4760++] = var75.field4998;
                return;
            }
            if (arg0 == 2610) {
                field4759[field4760++] = var75.field5095;
                return;
            }
            if (arg0 == 2611) {
                field4759[field4760++] = var75.field4997;
                return;
            }
            if (arg0 == 2612) {
                field4759[field4760++] = var75.field5013;
                return;
            }
            if (arg0 == 2613) {
                field4759[field4760++] = var75.field5025;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class382 var76 = class505.method2903(field4759[--field4760], 65535);
                field4759[field4760++] = var76.field5110;
                return;
            }
            if (arg0 == 2701) {
                class382 var77 = class505.method2903(field4759[--field4760], 65535);
                if (var77.field5110 != -1) {
                    field4759[field4760++] = var77.field4963;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var78 = field4759[--field4760];
                class454 var79 = (class454) class234.field2982.method3234((byte) -76, (long) var78);
                if (var79 != null) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class382 var80 = class505.method2903(field4759[--field4760], 65535);
                if (var80.field4989 == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                int var81 = var80.field4989.length;
                for (int var82 = 0; var82 < var80.field4989.length; var82++) {
                    if (var80.field4989[var82] == null) {
                        var81 = var82;
                        break;
                    }
                }
                field4759[field4760++] = var81;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field4760 -= 2;
                int var83 = field4759[field4760];
                int var84 = field4759[field4760 + 1];
                class454 var85 = (class454) class234.field2982.method3234((byte) -50, (long) var83);
                if (var85 != null && var85.field6291 == var84) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class382 var86 = class505.method2903(field4759[--field4760], 65535);
            if (arg0 == 2800) {
                field4759[field4760++] = client.method1530(var86).method1495((byte) 122);
                return;
            }
            if (arg0 == 2801) {
                int var87 = field4759[--field4760];
                int var343 = var87 - 1;
                if (var86.field5054 != null && var343 < var86.field5054.length && var86.field5054[var343] != null) {
                    field4750[field4756++] = var86.field5054[var343];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var86.field5007 == null) {
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = var86.field5007;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var88 = field4750[--field4756];
                class416.method2253(var88, 65535);
                return;
            }
            if (arg0 == 3101) {
                field4760 -= 2;
                class529.method3016(field4759[field4760], class377.field4914, field4759[field4760 + 1], (byte) -19);
                return;
            }
            if (arg0 == 3103) {
                class584.method3287(true, 0);
                return;
            }
            if (arg0 == 3104) {
                String var89 = field4750[--field4756];
                int var90 = 0;
                if (class630.method3530(97, var89)) {
                    var90 = class399.method2185(var89, (byte) -34);
                }
                field4753++;
                class480.method2802(class613.field8651, 16751);
                class334.field4314.method2554(var90, 255);
                return;
            }
            if (arg0 == 3105) {
                String var91 = field4750[--field4756];
                field4762++;
                class480.method2802(class253.field3242, 16751);
                class334.field4314.method2525(var91.length() + 1, -81849);
                class334.field4314.method2573(var91, 16746);
                return;
            }
            if (arg0 == 3106) {
                String var92 = field4750[--field4756];
                field4765++;
                class480.method2802(class449.field6178, 16751);
                class334.field4314.method2525(var92.length() + 1, -81849);
                class334.field4314.method2573(var92, 16746);
                return;
            }
            if (arg0 == 3107) {
                int var93 = field4759[--field4760];
                String var94 = field4750[--field4756];
                class513.method2937(var94, -5, var93);
                return;
            }
            if (arg0 == 3108) {
                field4760 -= 3;
                int var95 = field4759[field4760];
                int var96 = field4759[field4760 + 1];
                int var97 = field4759[field4760 + 2];
                class382 var98 = class505.method2903(var97, 65535);
                class625.method3496(-28759, var95, var96, var98);
                return;
            }
            if (arg0 == 3109) {
                field4760 -= 2;
                int var99 = field4759[field4760];
                int var100 = field4759[field4760 + 1];
                class382 var101 = arg1 ? field4749 : field4763;
                class625.method3496(-28759, var99, var100, var101);
                return;
            }
            if (arg0 == 3110) {
                int var102 = field4759[--field4760];
                field4769++;
                class480.method2802(class279.field3528, 16751);
                class334.field4314.method2537(18244, var102);
                return;
            }
            if (arg0 == 3111) {
                field4760 -= 2;
                int var103 = field4759[field4760];
                int var104 = field4759[field4760 + 1];
                class454 var105 = (class454) class234.field2982.method3234((byte) -49, (long) var103);
                if (var105 != null) {
                    class39.method204(var105.field6291 != var104, -28799, true, var105);
                }
                class122.method716(-128, 3, true, var104, var103);
                return;
            }
            if (arg0 == 3112) {
                field4760--;
                int var106 = field4759[field4760];
                class454 var107 = (class454) class234.field2982.method3234((byte) -36, (long) var106);
                if (var107 != null && var107.field6297 == 3) {
                    class39.method204(true, -28799, true, var107);
                }
                return;
            }
            if (arg0 == 3113) {
                class133.method745(18023, field4750[--field4756]);
                return;
            }
            if (arg0 == 3114) {
                field4760 -= 2;
                int var108 = field4759[field4760];
                int var109 = field4759[field4760 + 1];
                String var110 = field4750[--field4756];
                class321.method1809("", var108, (byte) 125, "", "", var109, var110);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field4760 -= 3;
                class373.method2047(field4759[field4760 + 1], field4759[field4760], (byte) -12, 255, field4759[field4760 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class572.method3231(255, (byte) 30, 50, field4759[--field4760]);
                return;
            }
            if (arg0 == 3202) {
                field4760 -= 2;
                class136.method762(field4759[field4760], 0, 255, field4759[field4760 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field4760 -= 4;
                class373.method2047(field4759[field4760 + 1], field4759[field4760], (byte) -12, field4759[field4760 + 3], field4759[field4760 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field4760 -= 3;
                class572.method3231(field4759[field4760 + 1], (byte) 30, field4759[field4760 + 2], field4759[field4760]);
                return;
            }
            if (arg0 == 3205) {
                field4760 -= 3;
                class136.method762(field4759[field4760], 0, field4759[field4760 + 2], field4759[field4760 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field4760 -= 4;
                class58.method392(field4759[field4760 + 1], field4759[field4760 + 2], field4759[field4760 + 3], false, field4759[field4760], 0);
                return;
            }
            if (arg0 == 3207) {
                field4760 -= 4;
                class58.method392(field4759[field4760 + 1], field4759[field4760 + 2], field4759[field4760 + 3], true, field4759[field4760], 0);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field4759[field4760++] = class469.field6549;
                return;
            }
            if (arg0 == 3301) {
                field4760 -= 2;
                int var111 = field4759[field4760];
                int var112 = field4759[field4760 + 1];
                field4759[field4760++] = class574.method3249(var111, 11583, var112, false);
                return;
            }
            if (arg0 == 3302) {
                field4760 -= 2;
                int var113 = field4759[field4760];
                int var114 = field4759[field4760 + 1];
                field4759[field4760++] = class684.method3811(-29126, false, var113, var114);
                return;
            }
            if (arg0 == 3303) {
                field4760 -= 2;
                int var115 = field4759[field4760];
                int var116 = field4759[field4760 + 1];
                field4759[field4760++] = class491.method2836(var115, var116, false, 0);
                return;
            }
            if (arg0 == 3304) {
                int var117 = field4759[--field4760];
                field4759[field4760++] = class369.field4791.method3321(var117, -108).field1719;
                return;
            }
            if (arg0 == 3305) {
                int var118 = field4759[--field4760];
                field4759[field4760++] = class80.field851[var118];
                return;
            }
            if (arg0 == 3306) {
                int var119 = field4759[--field4760];
                field4759[field4760++] = class370.field4801[var119];
                return;
            }
            if (arg0 == 3307) {
                int var120 = field4759[--field4760];
                field4759[field4760++] = class238.field3006[var120];
                return;
            }
            if (arg0 == 3308) {
                byte var121 = class377.field4914.field4638;
                int var122 = (class377.field4914.field4641 >> 9) + class682.field9685;
                int var123 = (class377.field4914.field4647 >> 9) + class146.field1642;
                field4759[field4760++] = (var121 << 28) + (var122 << 14) + var123;
                return;
            }
            if (arg0 == 3309) {
                int var124 = field4759[--field4760];
                field4759[field4760++] = var124 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var125 = field4759[--field4760];
                field4759[field4760++] = var125 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var126 = field4759[--field4760];
                field4759[field4760++] = var126 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field4759[field4760++] = class108.field1253 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field4760 -= 2;
                int var127 = field4759[field4760];
                int var128 = field4759[field4760 + 1];
                field4759[field4760++] = class574.method3249(var127, 11583, var128, true);
                return;
            }
            if (arg0 == 3314) {
                field4760 -= 2;
                int var129 = field4759[field4760];
                int var130 = field4759[field4760 + 1];
                field4759[field4760++] = class684.method3811(-29126, true, var129, var130);
                return;
            }
            if (arg0 == 3315) {
                field4760 -= 2;
                int var131 = field4759[field4760];
                int var132 = field4759[field4760 + 1];
                field4759[field4760++] = class491.method2836(var131, var132, true, 0);
                return;
            }
            if (arg0 == 3316) {
                if (class295.field3874 >= 2) {
                    field4759[field4760++] = class295.field3874;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field4759[field4760++] = class588.field8361;
                return;
            }
            if (arg0 == 3318) {
                field4759[field4760++] = class277.field3494.field3986;
                return;
            }
            if (arg0 == 3321) {
                field4759[field4760++] = class416.field5526;
                return;
            }
            if (arg0 == 3322) {
                field4759[field4760++] = class382.field4969;
                return;
            }
            if (arg0 == 3323) {
                if (class646.field9148 >= 5 && class646.field9148 <= 9) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class646.field9148 >= 5 && class646.field9148 <= 9) {
                    field4759[field4760++] = class646.field9148;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field4759[field4760++] = class571.field8101 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field4759[field4760++] = class377.field4914.field6322;
                return;
            }
            if (arg0 == 3327) {
                field4759[field4760++] = class377.field4914.field6309.field2828 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field4759[field4760++] = class198.field2403 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var133 = field4759[--field4760];
                field4759[field4760++] = class145.method792(false, var133, 5);
                return;
            }
            if (arg0 == 3331) {
                field4760 -= 2;
                int var134 = field4759[field4760];
                int var135 = field4759[field4760 + 1];
                field4759[field4760++] = class243.method1404(false, var135, (byte) 103, var134, false);
                return;
            }
            if (arg0 == 3332) {
                field4760 -= 2;
                int var136 = field4759[field4760];
                int var137 = field4759[field4760 + 1];
                field4759[field4760++] = class243.method1404(true, var137, (byte) -109, var136, false);
                return;
            }
            if (arg0 == 3333) {
                field4759[field4760++] = class347.field4526;
                return;
            }
            if (arg0 == 3335) {
                field4759[field4760++] = class226.field2899;
                return;
            }
            if (arg0 == 3336) {
                field4760 -= 4;
                int var138 = field4759[field4760];
                int var139 = field4759[field4760 + 1];
                int var140 = field4759[field4760 + 2];
                int var141 = field4759[field4760 + 3];
                int var142 = (var139 << 14) + var138;
                int var143 = (var140 << 28) + var142;
                int var144 = var141 + var143;
                field4759[field4760++] = var144;
                return;
            }
            if (arg0 == 3337) {
                field4759[field4760++] = class559.field7965;
                return;
            }
            if (arg0 == 3338) {
                field4759[field4760++] = class453.method2579(100);
                return;
            }
            if (arg0 == 3339) {
                field4759[field4760++] = class8.field69 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field4759[field4760++] = class412.field5476 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field4759[field4760++] = class467.field6478 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field4759[field4760++] = class407.field5419.method162(-26561);
                return;
            }
            if (arg0 == 3343) {
                field4759[field4760++] = class407.field5419.method161(31285);
                return;
            }
            if (arg0 == 3344) {
                field4750[field4756++] = class109.method682((byte) 54);
                return;
            }
            if (arg0 == 3345) {
                field4750[field4756++] = class512.method2933(-123);
                return;
            }
            if (arg0 == 3346) {
                field4759[field4760++] = class52.method261(-110);
                return;
            }
            if (arg0 == 3347) {
                field4759[field4760++] = class566.field8019;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field4760 -= 2;
                int var145 = field4759[field4760];
                int var146 = field4759[field4760 + 1];
                class678 var147 = class281.field3563.method1112(var145, 97);
                field4750[field4756++] = var147.method3783(var146, 4634);
                return;
            }
            if (arg0 == 3408) {
                field4760 -= 4;
                int var148 = field4759[field4760];
                int var149 = field4759[field4760 + 1];
                int var150 = field4759[field4760 + 2];
                int var151 = field4759[field4760 + 3];
                class678 var152 = class281.field3563.method1112(var150, 112);
                if (var152.field9609 == var148 && var152.field9604 == var149) {
                    if (var149 == 115) {
                        field4750[field4756++] = var152.method3783(var151, 4634);
                        return;
                    }
                    field4759[field4760++] = var152.method3786(var151, (byte) -101);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field4760 -= 3;
                int var153 = field4759[field4760];
                int var154 = field4759[field4760 + 1];
                int var155 = field4759[field4760 + 2];
                if (var154 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class678 var156 = class281.field3563.method1112(var154, 110);
                if (var156.field9604 != var153) {
                    throw new RuntimeException("C3409-1");
                }
                field4759[field4760++] = var156.method3792(5, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var157 = field4759[--field4760];
                String var158 = field4750[--field4756];
                if (var157 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class678 var159 = class281.field3563.method1112(var157, 124);
                if (var159.field9604 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field4759[field4760++] = var159.method3787(var158, (byte) -125) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var160 = field4759[--field4760];
                class678 var161 = class281.field3563.method1112(var160, 122);
                field4759[field4760++] = var161.field9606.method3230(false);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class491.field7115 == 0) {
                    field4759[field4760++] = -2;
                    return;
                }
                if (class491.field7115 == 1) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = class210.field2549;
                return;
            }
            if (arg0 == 3601) {
                int var162 = field4759[--field4760];
                if (class491.field7115 == 2 && var162 < class210.field2549) {
                    field4750[field4756++] = class314.field4077[var162];
                    if (class485.field7061[var162] != null) {
                        field4750[field4756++] = class485.field7061[var162];
                        return;
                    }
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = "";
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var163 = field4759[--field4760];
                if (class491.field7115 == 2 && var163 < class210.field2549) {
                    field4759[field4760++] = class270.field3396[var163];
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var164 = field4759[--field4760];
                if (class491.field7115 == 2 && var164 < class210.field2549) {
                    field4759[field4760++] = class417.field5534[var164];
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var165 = field4750[--field4756];
                int var166 = field4759[--field4760];
                class473.method2753(var165, 2, var166);
                return;
            }
            if (arg0 == 3605) {
                String var167 = field4750[--field4756];
                class217.method1287(var167, -126);
                return;
            }
            if (arg0 == 3606) {
                String var168 = field4750[--field4756];
                class375.method2064((byte) -86, var168);
                return;
            }
            if (arg0 == 3607) {
                String var169 = field4750[--field4756];
                class499.method2866(0, false, var169);
                return;
            }
            if (arg0 == 3608) {
                String var170 = field4750[--field4756];
                class333.method1877(var170, (byte) 124);
                return;
            }
            if (arg0 == 3609) {
                String var171 = field4750[--field4756];
                if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                    var171 = var171.substring(7);
                }
                field4759[field4760++] = class608.method3393(var171, (byte) 18) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var172 = field4759[--field4760];
                if (class491.field7115 == 2 && var172 < class210.field2549) {
                    field4750[field4756++] = class118.field1353[var172];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class387.field5170 != null) {
                    field4750[field4756++] = class95.method592(class387.field5170, 64);
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class387.field5170 != null) {
                    field4759[field4760++] = class525.field7506;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var173 = field4759[--field4760];
                if (class387.field5170 != null && var173 < class525.field7506) {
                    field4750[field4756++] = class37.field414[var173].field7749;
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var174 = field4759[--field4760];
                if (class387.field5170 != null && var174 < class525.field7506) {
                    field4759[field4760++] = class37.field414[var174].field7746;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var175 = field4759[--field4760];
                if (class387.field5170 != null && var175 < class525.field7506) {
                    field4759[field4760++] = class37.field414[var175].field7748;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field4759[field4760++] = class164.field1969;
                return;
            }
            if (arg0 == 3617) {
                String var176 = field4750[--field4756];
                class140.method780((byte) -68, var176);
                return;
            }
            if (arg0 == 3618) {
                field4759[field4760++] = class470.field6564;
                return;
            }
            if (arg0 == 3619) {
                String var177 = field4750[--field4756];
                class519.method2959((byte) -66, var177);
                return;
            }
            if (arg0 == 3620) {
                class407.method2211(0);
                return;
            }
            if (arg0 == 3621) {
                if (class491.field7115 == 0) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = class601.field8535;
                return;
            }
            if (arg0 == 3622) {
                int var178 = field4759[--field4760];
                if (class491.field7115 != 0 && var178 < class601.field8535) {
                    field4750[field4756++] = class278.field3521[var178];
                    if (class305.field3983[var178] != null) {
                        field4750[field4756++] = class305.field3983[var178];
                        return;
                    }
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = "";
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var179 = field4750[--field4756];
                if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                    var179 = var179.substring(7);
                }
                field4759[field4760++] = class396.method2159(true, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var180 = field4759[--field4760];
                if (class37.field414 != null && var180 < class525.field7506 && class37.field414[var180].field7750.equalsIgnoreCase(class377.field4914.field6324)) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class651.field9313 != null) {
                    field4750[field4756++] = class651.field9313;
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var181 = field4759[--field4760];
                if (class387.field5170 != null && var181 < class525.field7506) {
                    field4750[field4756++] = class37.field414[var181].field7743;
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var182 = field4759[--field4760];
                if (class491.field7115 == 2 && var182 >= 0 && var182 < class210.field2549) {
                    field4759[field4760++] = class520.field7452[var182] ? 1 : 0;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var183 = field4750[--field4756];
                if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                    var183 = var183.substring(7);
                }
                field4759[field4760++] = class676.method3780((byte) 108, var183);
                return;
            }
            if (arg0 == 3629) {
                field4759[field4760++] = class92.field1046;
                return;
            }
            if (arg0 == 3630) {
                String var184 = field4750[--field4756];
                class499.method2866(0, true, var184);
                return;
            }
            if (arg0 == 3631) {
                int var185 = field4759[--field4760];
                field4759[field4760++] = class54.field558[var185] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var186 = field4759[--field4760];
                if (class387.field5170 != null && var186 < class525.field7506) {
                    field4750[field4756++] = class37.field414[var186].field7750;
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var187 = field4759[--field4760];
                if (class491.field7115 != 0 && var187 < class601.field8535) {
                    field4750[field4756++] = class13.field113[var187];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var188 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var188].method855(23934);
                return;
            }
            if (arg0 == 3904) {
                int var189 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var189].field1764;
                return;
            }
            if (arg0 == 3905) {
                int var190 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var190].field1767;
                return;
            }
            if (arg0 == 3906) {
                int var191 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var191].field1763;
                return;
            }
            if (arg0 == 3907) {
                int var192 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var192].field1762;
                return;
            }
            if (arg0 == 3908) {
                int var193 = field4759[--field4760];
                field4759[field4760++] = class358.field4693[var193].field1761;
                return;
            }
            if (arg0 == 3910) {
                int var194 = field4759[--field4760];
                int var195 = class358.field4693[var194].method859((byte) -4);
                field4759[field4760++] = var195 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var196 = field4759[--field4760];
                int var197 = class358.field4693[var196].method859((byte) -4);
                field4759[field4760++] = var197 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var198 = field4759[--field4760];
                int var199 = class358.field4693[var198].method859((byte) -4);
                field4759[field4760++] = var199 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var200 = field4759[--field4760];
                int var201 = class358.field4693[var200].method859((byte) -4);
                field4759[field4760++] = var201 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field4760 -= 2;
                int var202 = field4759[field4760];
                int var203 = field4759[field4760 + 1];
                field4759[field4760++] = var202 + var203;
                return;
            }
            if (arg0 == 4001) {
                field4760 -= 2;
                int var204 = field4759[field4760];
                int var205 = field4759[field4760 + 1];
                field4759[field4760++] = var204 - var205;
                return;
            }
            if (arg0 == 4002) {
                field4760 -= 2;
                int var206 = field4759[field4760];
                int var207 = field4759[field4760 + 1];
                field4759[field4760++] = var206 * var207;
                return;
            }
            if (arg0 == 4003) {
                field4760 -= 2;
                int var208 = field4759[field4760];
                int var209 = field4759[field4760 + 1];
                field4759[field4760++] = var208 / var209;
                return;
            }
            if (arg0 == 4004) {
                int var210 = field4759[--field4760];
                field4759[field4760++] = (int) (Math.random() * (double) var210);
                return;
            }
            if (arg0 == 4005) {
                int var211 = field4759[--field4760];
                field4759[field4760++] = (int) (Math.random() * (double) (var211 + 1));
                return;
            }
            if (arg0 == 4006) {
                field4760 -= 5;
                int var212 = field4759[field4760];
                int var213 = field4759[field4760 + 1];
                int var214 = field4759[field4760 + 2];
                int var215 = field4759[field4760 + 3];
                int var216 = field4759[field4760 + 4];
                field4759[field4760++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                return;
            }
            if (arg0 == 4007) {
                field4760 -= 2;
                long var217 = (long) field4759[field4760];
                long var219 = (long) field4759[field4760 + 1];
                field4759[field4760++] = (int) (var217 * var219 / 100L + var217);
                return;
            }
            if (arg0 == 4008) {
                field4760 -= 2;
                int var221 = field4759[field4760];
                int var222 = field4759[field4760 + 1];
                field4759[field4760++] = var221 | 0x1 << var222;
                return;
            }
            if (arg0 == 4009) {
                field4760 -= 2;
                int var223 = field4759[field4760];
                int var224 = field4759[field4760 + 1];
                field4759[field4760++] = var223 & -(0x1 << var224) - 1;
                return;
            }
            if (arg0 == 4010) {
                field4760 -= 2;
                int var225 = field4759[field4760];
                int var226 = field4759[field4760 + 1];
                field4759[field4760++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field4760 -= 2;
                int var227 = field4759[field4760];
                int var228 = field4759[field4760 + 1];
                field4759[field4760++] = var227 % var228;
                return;
            }
            if (arg0 == 4012) {
                field4760 -= 2;
                int var229 = field4759[field4760];
                int var230 = field4759[field4760 + 1];
                if (var229 == 0) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = (int) Math.pow((double) var229, (double) var230);
                return;
            }
            if (arg0 == 4013) {
                field4760 -= 2;
                int var231 = field4759[field4760];
                int var232 = field4759[field4760 + 1];
                if (var231 == 0) {
                    field4759[field4760++] = 0;
                    return;
                }
                if (var232 == 0) {
                    field4759[field4760++] = Integer.MAX_VALUE;
                    return;
                }
                field4759[field4760++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                return;
            }
            if (arg0 == 4014) {
                field4760 -= 2;
                int var233 = field4759[field4760];
                int var234 = field4759[field4760 + 1];
                field4759[field4760++] = var233 & var234;
                return;
            }
            if (arg0 == 4015) {
                field4760 -= 2;
                int var235 = field4759[field4760];
                int var236 = field4759[field4760 + 1];
                field4759[field4760++] = var235 | var236;
                return;
            }
            if (arg0 == 4016) {
                field4760 -= 2;
                int var237 = field4759[field4760];
                int var238 = field4759[field4760 + 1];
                field4759[field4760++] = var237 < var238 ? var237 : var238;
                return;
            }
            if (arg0 == 4017) {
                field4760 -= 2;
                int var239 = field4759[field4760];
                int var240 = field4759[field4760 + 1];
                field4759[field4760++] = var239 > var240 ? var239 : var240;
                return;
            }
            if (arg0 == 4018) {
                field4760 -= 3;
                long var241 = (long) field4759[field4760];
                long var243 = (long) field4759[field4760 + 1];
                long var245 = (long) field4759[field4760 + 2];
                field4759[field4760++] = (int) (var241 * var245 / var243);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var247 = field4750[--field4756];
                int var248 = field4759[--field4760];
                field4750[field4756++] = var247 + var248;
                return;
            }
            if (arg0 == 4101) {
                field4756 -= 2;
                String var249 = field4750[field4756];
                String var250 = field4750[field4756 + 1];
                field4750[field4756++] = var249 + var250;
                return;
            }
            if (arg0 == 4102) {
                String var251 = field4750[--field4756];
                int var252 = field4759[--field4760];
                field4750[field4756++] = var251 + class478.method2798(true, -63, var252);
                return;
            }
            if (arg0 == 4103) {
                String var253 = field4750[--field4756];
                field4750[field4756++] = var253.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field4750[field4756++] = method2004(field4759[--field4760]);
                return;
            }
            if (arg0 == 4105) {
                field4756 -= 2;
                String var254 = field4750[field4756];
                String var255 = field4750[field4756 + 1];
                if (class377.field4914.field6309 != null && class377.field4914.field6309.field2828) {
                    field4750[field4756++] = var255;
                    return;
                }
                field4750[field4756++] = var254;
                return;
            }
            if (arg0 == 4106) {
                int var256 = field4759[--field4760];
                field4750[field4756++] = Integer.toString(var256);
                return;
            }
            if (arg0 == 4107) {
                field4756 -= 2;
                field4759[field4760++] = class644.method3613(field4750[field4756], 0, field4750[field4756 + 1], class226.field2899);
                return;
            }
            if (arg0 == 4108) {
                String var257 = field4750[--field4756];
                field4760 -= 2;
                int var258 = field4759[field4760];
                int var259 = field4759[field4760 + 1];
                class645 var260 = class415.method2244(2048, class57.field593, var259, 0);
                field4759[field4760++] = var260.method3618(class387.field5169, var258, 3, var257);
                return;
            }
            if (arg0 == 4109) {
                String var261 = field4750[--field4756];
                field4760 -= 2;
                int var262 = field4759[field4760];
                int var263 = field4759[field4760 + 1];
                class645 var264 = class415.method2244(2048, class57.field593, var263, 0);
                field4759[field4760++] = var264.method3617(0, var261, var262, class387.field5169);
                return;
            }
            if (arg0 == 4110) {
                field4756 -= 2;
                String var265 = field4750[field4756];
                String var266 = field4750[field4756 + 1];
                if (field4759[--field4760] == 1) {
                    field4750[field4756++] = var265;
                    return;
                }
                field4750[field4756++] = var266;
                return;
            }
            if (arg0 == 4111) {
                String var267 = field4750[--field4756];
                field4750[field4756++] = class470.method2663(true, var267);
                return;
            }
            if (arg0 == 4112) {
                String var268 = field4750[--field4756];
                int var269 = field4759[--field4760];
                if (var269 == -1) {
                    throw new RuntimeException("null char");
                }
                field4750[field4756++] = var268 + (char) var269;
                return;
            }
            if (arg0 == 4113) {
                int var270 = field4759[--field4760];
                field4759[field4760++] = class344.method1916((char) var270, false) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var271 = field4759[--field4760];
                field4759[field4760++] = class671.method3762((char) var271, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var272 = field4759[--field4760];
                field4759[field4760++] = class254.method1454((char) var272, (byte) 111) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var273 = field4759[--field4760];
                field4759[field4760++] = class334.method1879(98, (char) var273) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var274 = field4750[--field4756];
                if (var274 != null) {
                    field4759[field4760++] = var274.length();
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var275 = field4750[--field4756];
                field4760 -= 2;
                int var276 = field4759[field4760];
                int var277 = field4759[field4760 + 1];
                field4750[field4756++] = var275.substring(var276, var277);
                return;
            }
            if (arg0 == 4119) {
                String var278 = field4750[--field4756];
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
                field4750[field4756++] = var279.toString();
                return;
            }
            if (arg0 == 4120) {
                String var283 = field4750[--field4756];
                field4760 -= 2;
                int var284 = field4759[field4760];
                int var285 = field4759[field4760 + 1];
                field4759[field4760++] = var283.indexOf(var284, var285);
                return;
            }
            if (arg0 == 4121) {
                field4756 -= 2;
                String var286 = field4750[field4756];
                String var287 = field4750[field4756 + 1];
                int var288 = field4759[--field4760];
                field4759[field4760++] = var286.indexOf(var287, var288);
                return;
            }
            if (arg0 == 4122) {
                int var289 = field4759[--field4760];
                field4759[field4760++] = Character.toLowerCase((char) var289);
                return;
            }
            if (arg0 == 4123) {
                int var290 = field4759[--field4760];
                field4759[field4760++] = Character.toUpperCase((char) var290);
                return;
            }
            if (arg0 == 4124) {
                boolean var291 = field4759[--field4760] != 0;
                int var292 = field4759[--field4760];
                field4750[field4756++] = class679.method3795((long) var292, class226.field2899, (byte) -43, 0, var291);
                return;
            }
            if (arg0 == 4125) {
                String var293 = field4750[--field4756];
                int var294 = field4759[--field4760];
                class645 var295 = class415.method2244(2048, class57.field593, var294, 0);
                field4759[field4760++] = var295.method3624(120, var293, class387.field5169);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var296 = field4759[--field4760];
                field4750[field4756++] = class472.field6588.method1903(var296, (byte) 25).field7677;
                return;
            }
            if (arg0 == 4201) {
                field4760 -= 2;
                int var297 = field4759[field4760];
                int var298 = field4759[field4760 + 1];
                class537 var299 = class472.field6588.method1903(var297, (byte) 98);
                if (var298 >= 1 && var298 <= 5 && var299.field7673[var298 - 1] != null) {
                    field4750[field4756++] = var299.field7673[var298 - 1];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 4202) {
                field4760 -= 2;
                int var300 = field4759[field4760];
                int var301 = field4759[field4760 + 1];
                class537 var302 = class472.field6588.method1903(var300, (byte) -111);
                if (var301 >= 1 && var301 <= 5 && var302.field7670[var301 - 1] != null) {
                    field4750[field4756++] = var302.field7670[var301 - 1];
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var303 = field4759[--field4760];
                field4759[field4760++] = class472.field6588.method1903(var303, (byte) -111).field7724;
                return;
            }
            if (arg0 == 4204) {
                int var304 = field4759[--field4760];
                field4759[field4760++] = class472.field6588.method1903(var304, (byte) -120).field7741 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var305 = field4759[--field4760];
                class537 var306 = class472.field6588.method1903(var305, (byte) 13);
                if (var306.field7703 == -1 && var306.field7707 >= 0) {
                    field4759[field4760++] = var306.field7707;
                    return;
                }
                field4759[field4760++] = var305;
                return;
            }
            if (arg0 == 4206) {
                int var307 = field4759[--field4760];
                class537 var308 = class472.field6588.method1903(var307, (byte) -122);
                if (var308.field7703 >= 0 && var308.field7707 >= 0) {
                    field4759[field4760++] = var308.field7707;
                    return;
                }
                field4759[field4760++] = var307;
                return;
            }
            if (arg0 == 4207) {
                int var309 = field4759[--field4760];
                field4759[field4760++] = class472.field6588.method1903(var309, (byte) 101).field7737 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field4760 -= 2;
                int var310 = field4759[field4760];
                int var311 = field4759[field4760 + 1];
                class450 var312 = class80.field854.method687(false, var311);
                if (var312.method2500(true)) {
                    field4750[field4756++] = class472.field6588.method1903(var310, (byte) 27).method3052(true, var312.field6197, var311);
                    return;
                }
                field4759[field4760++] = class472.field6588.method1903(var310, (byte) 20).method3061(var312.field6198, var311, 850);
                return;
            }
            if (arg0 == 4209) {
                field4760 -= 2;
                int var313 = field4759[field4760];
                int var314 = field4759[field4760 + 1] - 1;
                class537 var315 = class472.field6588.method1903(var313, (byte) 105);
                if (var315.field7732 == var314) {
                    field4759[field4760++] = var315.field7706;
                    return;
                }
                if (var315.field7733 == var314) {
                    field4759[field4760++] = var315.field7668;
                    return;
                }
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var316 = field4750[--field4756];
                int var317 = field4759[--field4760];
                class388.method2125(var317 == 1, 65536, var316);
                field4759[field4760++] = class67.field726;
                return;
            }
            if (arg0 == 4211) {
                if (class382.field5121 != null && class255.field3262 < class67.field726) {
                    field4759[field4760++] = class382.field5121[class255.field3262++] & 0xFFFF;
                    return;
                }
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class255.field3262 = 0;
                return;
            }
            if (arg0 == 4214) {
                String var318 = field4750[--field4756];
                field4760 -= 3;
                int var319 = field4759[field4760];
                int var320 = field4759[field4760 + 1];
                int var321 = field4759[field4760 + 2];
                class650.method3670(-98, var321, var320, var319 == 1, var318);
                field4759[field4760++] = class67.field726;
                return;
            }
            if (arg0 == 4215) {
                field4756 -= 2;
                field4760 -= 2;
                String var322 = field4750[field4756];
                int var323 = field4759[field4760];
                int var324 = field4759[field4760 + 1];
                String var325 = field4750[field4756 + 1];
                class522.method2978(var324, var322, var325, 0, var323 == 1);
                field4759[field4760++] = class67.field726;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field4760 -= 2;
                int var326 = field4759[field4760];
                int var327 = field4759[field4760 + 1];
                class450 var328 = class80.field854.method687(false, var327);
                if (var328.method2500(true)) {
                    field4750[field4756++] = class608.field8585.method3273(-1119, var326).method106(var327, var328.field6197, 101);
                    return;
                }
                field4759[field4760++] = class608.field8585.method3273(-1119, var326).method102((byte) -99, var327, var328.field6198);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field4760 -= 2;
                int var329 = field4759[field4760];
                int var330 = field4759[field4760 + 1];
                class450 var331 = class80.field854.method687(false, var330);
                if (var331.method2500(true)) {
                    field4750[field4756++] = class195.field2339.method3729(var329, (byte) 109).method1886(126, var331.field6197, var330);
                    return;
                }
                field4759[field4760++] = class195.field2339.method3729(var329, (byte) 109).method1885(var330, var331.field6198, -127);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field4760 -= 2;
                int var332 = field4759[field4760];
                int var333 = field4759[field4760 + 1];
                class450 var334 = class80.field854.method687(false, var333);
                if (var334.method2500(true)) {
                    field4750[field4756++] = class368.field4788.method97(var332, 80).method2874(var333, (byte) 40, var334.field6197);
                    return;
                }
                field4759[field4760++] = class368.field4788.method97(var332, 103).method2870(14055, var334.field6198, var333);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var335 = field4759[--field4760];
            class468 var336 = class422.field5623.method3324(var335, -28590);
            if (var336.field6526 != null && var336.field6526.length > 0) {
                int var337 = 0;
                int var338 = var336.field6492[0];
                for (int var339 = 1; var339 < var336.field6526.length; var339++) {
                    if (var336.field6492[var339] > var338) {
                        var337 = var339;
                        var338 = var336.field6492[var339];
                    }
                }
                field4759[field4760++] = var336.field6526[var337];
                return;
            }
            field4759[field4760++] = var336.field6508;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V", line = 4584)
    public static final void method2006() {
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 4607)
    private static final void method2007(int arg0) {
        class382 var1 = class505.method2903(arg0, 65535);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class382[] var3 = class461.field6408[var2];
        if (var3 == null) {
            class382[] var4 = class271.field3434[var2];
            int var5 = var4.length;
            var3 = class461.field6408[var2] = new class382[var5];
            class652.method3677(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class652.method3677(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lbca;II)V", line = 4646)
    public static final void method2008(class604 arg0, int arg1, int arg2) {
        class654 var3 = class397.method2176(arg2, arg0, (byte) 112, arg1);
        if (var3 == null) {
            return;
        }
        field4767 = new int[var3.field9345];
        field4752 = new String[var3.field9350];
        if (class408.field5433 == var3.field9346 || class684.field9693 == var3.field9346 || class272.field3442 == var3.field9346) {
            int var4 = 0;
            int var5 = 0;
            if (class9.field92 != null) {
                var4 = class9.field92.field4996;
                var5 = class9.field92.field4987;
            }
            field4767[0] = class407.field5419.method162(-26561) - var4;
            field4767[1] = class407.field5419.method161(31285) - var5;
        }
        method1999(var3, 200000);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V", line = 4671)
    private static final void method2009(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4759[field4760++] = class521.field7469;
                return;
            }
            if (arg0 == 5001) {
                field4760 -= 3;
                class521.field7469 = field4759[field4760];
                class397.field5314 = class581.method3268(field4759[field4760 + 1], (byte) 121);
                if (class397.field5314 == null) {
                    class397.field5314 = class627.field8899;
                }
                class408.field5436 = field4759[field4760 + 2];
                field4751++;
                class480.method2802(class200.field2446, 16751);
                class334.field4314.method2525(class521.field7469, -81849);
                class334.field4314.method2525(class397.field5314.field1343, -81849);
                class334.field4314.method2525(class408.field5436, -81849);
                return;
            }
            if (arg0 == 5002) {
                field4756 -= 2;
                String var2 = field4750[field4756];
                String var3 = field4750[field4756 + 1];
                field4760 -= 2;
                int var4 = field4759[field4760];
                int var5 = field4759[field4760 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4748++;
                class480.method2802(class90.field1037, 16751);
                class334.field4314.method2525(class265.method1504(var2, (byte) 88) + class265.method1504(var3, (byte) 88) + 2, -81849);
                class334.field4314.method2573(var2, 16746);
                class334.field4314.method2525(var4 - 1, -81849);
                class334.field4314.method2525(var5, -81849);
                class334.field4314.method2573(var3, 16746);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4759[--field4760];
                class165 var7 = class200.method1222(var6, -1);
                String var8 = "";
                if (var7 != null && var7.field1978 != null) {
                    var8 = var7.field1978;
                }
                field4750[field4756++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field4759[--field4760];
                class165 var10 = class200.method1222(var9, -1);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field1983;
                }
                field4759[field4760++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class397.field5314 == null) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = class397.field5314.field1343;
                return;
            }
            if (arg0 == 5006) {
                int var12 = field4759[--field4760];
                class480.method2802(class66.field704, 16751);
                class334.field4314.method2525(var12, -81849);
                return;
            }
            if (arg0 == 5008) {
                String var13 = field4750[--field4756];
                method2002(var13, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4756 -= 2;
                String var14 = field4750[field4756];
                String var15 = field4750[field4756 + 1];
                if (class295.field3874 != 0 || (!class89.field946 || class539.field7752) && !class198.field2403) {
                    field4754++;
                    class480.method2802(class592.field8421, 16751);
                    class334.field4314.method2525(0, -81849);
                    int var16 = class334.field4314.field6215;
                    class334.field4314.method2573(var14, 16746);
                    class562.method3166(1024, class334.field4314, var15);
                    class334.field4314.method2551(class334.field4314.field6215 - var16, 41);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var17 = field4759[--field4760];
                class165 var18 = class200.method1222(var17, -1);
                String var19 = "";
                if (var18 != null && var18.field1977 != null) {
                    var19 = var18.field1977;
                }
                field4750[field4756++] = var19;
                return;
            }
            if (arg0 == 5011) {
                int var20 = field4759[--field4760];
                class165 var21 = class200.method1222(var20, -1);
                String var22 = "";
                if (var21 != null && var21.field1974 != null) {
                    var22 = var21.field1974;
                }
                field4750[field4756++] = var22;
                return;
            }
            if (arg0 == 5012) {
                int var23 = field4759[--field4760];
                class165 var24 = class200.method1222(var23, -1);
                int var25 = -1;
                if (var24 != null) {
                    var25 = var24.field1984;
                }
                field4759[field4760++] = var25;
                return;
            }
            if (arg0 == 5015) {
                String var26;
                if (class377.field4914 == null || class377.field4914.field6341 == null) {
                    var26 = class380.field4932;
                } else {
                    var26 = class377.field4914.method2582(true, 0);
                }
                field4750[field4756++] = var26;
                return;
            }
            if (arg0 == 5016) {
                field4759[field4760++] = class408.field5436;
                return;
            }
            if (arg0 == 5017) {
                field4759[field4760++] = class565.method3198((byte) -94);
                return;
            }
            if (arg0 == 5018) {
                int var27 = field4759[--field4760];
                class165 var28 = class200.method1222(var27, -1);
                int var29 = 0;
                if (var28 != null) {
                    var29 = var28.field1981;
                }
                field4759[field4760++] = var29;
                return;
            }
            if (arg0 == 5019) {
                int var30 = field4759[--field4760];
                class165 var31 = class200.method1222(var30, -1);
                String var32 = "";
                if (var31 != null && var31.field1979 != null) {
                    var32 = var31.field1979;
                }
                field4750[field4756++] = var32;
                return;
            }
            if (arg0 == 5020) {
                String var33;
                if (class377.field4914 == null || class377.field4914.field6341 == null) {
                    var33 = class380.field4932;
                } else {
                    var33 = class377.field4914.method2585((byte) -95, false);
                }
                field4750[field4756++] = var33;
                return;
            }
            if (arg0 == 5023) {
                int var34 = field4759[--field4760];
                class165 var35 = class200.method1222(var34, -1);
                int var36 = -1;
                if (var35 != null) {
                    var36 = var35.field1975;
                }
                field4759[field4760++] = var36;
                return;
            }
            if (arg0 == 5024) {
                int var37 = field4759[--field4760];
                class165 var38 = class200.method1222(var37, -1);
                int var39 = -1;
                if (var38 != null) {
                    var39 = var38.field1980;
                }
                field4759[field4760++] = var39;
                return;
            }
            if (arg0 == 5025) {
                int var40 = field4759[--field4760];
                class165 var41 = class200.method1222(var40, -1);
                String var42 = "";
                if (var41 != null && var41.field1976 != null) {
                    var42 = var41.field1976;
                }
                field4750[field4756++] = var42;
                return;
            }
            if (arg0 == 5050) {
                int var43 = field4759[--field4760];
                field4750[field4756++] = class447.field6140.method1506(var43, (byte) 117).field7877;
                return;
            }
            if (arg0 == 5051) {
                int var44 = field4759[--field4760];
                class553 var45 = class447.field6140.method1506(var44, (byte) 117);
                if (var45.field7878 == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = var45.field7878.length;
                return;
            }
            if (arg0 == 5052) {
                field4760 -= 2;
                int var46 = field4759[field4760];
                int var47 = field4759[field4760 + 1];
                class553 var48 = class447.field6140.method1506(var46, (byte) 117);
                int var49 = var48.field7878[var47];
                field4759[field4760++] = var49;
                return;
            }
            if (arg0 == 5053) {
                int var50 = field4759[--field4760];
                class553 var51 = class447.field6140.method1506(var50, (byte) 117);
                if (var51.field7880 == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = var51.field7880.length;
                return;
            }
            if (arg0 == 5054) {
                field4760 -= 2;
                int var52 = field4759[field4760];
                int var53 = field4759[field4760 + 1];
                field4759[field4760++] = class447.field6140.method1506(var52, (byte) 117).field7880[var53];
                return;
            }
            if (arg0 == 5055) {
                int var54 = field4759[--field4760];
                field4750[field4756++] = class58.field599.method1516(0, var54).method2785(-125);
                return;
            }
            if (arg0 == 5056) {
                int var55 = field4759[--field4760];
                class477 var56 = class58.field599.method1516(0, var55);
                if (var56.field6956 == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = var56.field6956.length;
                return;
            }
            if (arg0 == 5057) {
                field4760 -= 2;
                int var57 = field4759[field4760];
                int var58 = field4759[field4760 + 1];
                field4759[field4760++] = class58.field599.method1516(0, var57).field6956[var58];
                return;
            }
            if (arg0 == 5058) {
                field4766 = new class665();
                field4766.field9456 = field4759[--field4760];
                field4766.field9455 = class58.field599.method1516(0, field4766.field9456);
                field4766.field9457 = new int[field4766.field9455.method2783((byte) 117)];
                return;
            }
            if (arg0 == 5059) {
                field4768++;
                class480.method2802(class282.field3581, 16751);
                class334.field4314.method2525(0, -81849);
                int var59 = class334.field4314.field6215;
                class334.field4314.method2525(0, -81849);
                class334.field4314.method2537(18244, field4766.field9456);
                field4766.field9455.method2791(class334.field4314, field4766.field9457, 31544);
                class334.field4314.method2551(class334.field4314.field6215 - var59, -114);
                return;
            }
            if (arg0 == 5060) {
                String var60 = field4750[--field4756];
                field4770++;
                class480.method2802(class320.field4148, 16751);
                class334.field4314.method2525(0, -81849);
                int var61 = class334.field4314.field6215;
                class334.field4314.method2573(var60, 16746);
                class334.field4314.method2537(18244, field4766.field9456);
                field4766.field9455.method2791(class334.field4314, field4766.field9457, 31544);
                class334.field4314.method2551(class334.field4314.field6215 - var61, -118);
                return;
            }
            if (arg0 == 5061) {
                field4768++;
                class480.method2802(class282.field3581, 16751);
                class334.field4314.method2525(0, -81849);
                int var62 = class334.field4314.field6215;
                class334.field4314.method2525(1, -81849);
                class334.field4314.method2537(18244, field4766.field9456);
                field4766.field9455.method2791(class334.field4314, field4766.field9457, 31544);
                class334.field4314.method2551(class334.field4314.field6215 - var62, -117);
                return;
            }
            if (arg0 == 5062) {
                field4760 -= 2;
                int var63 = field4759[field4760];
                int var64 = field4759[field4760 + 1];
                field4759[field4760++] = class447.field6140.method1506(var63, (byte) 117).field7881[var64];
                return;
            }
            if (arg0 == 5063) {
                field4760 -= 2;
                int var65 = field4759[field4760];
                int var66 = field4759[field4760 + 1];
                field4759[field4760++] = class447.field6140.method1506(var65, (byte) 117).field7883[var66];
                return;
            }
            if (arg0 == 5064) {
                field4760 -= 2;
                int var67 = field4759[field4760];
                int var68 = field4759[field4760 + 1];
                if (var68 == -1) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = class447.field6140.method1506(var67, (byte) 117).method3117((char) var68, -120);
                return;
            }
            if (arg0 == 5065) {
                field4760 -= 2;
                int var69 = field4759[field4760];
                int var70 = field4759[field4760 + 1];
                if (var70 == -1) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = class447.field6140.method1506(var69, (byte) 117).method3114((char) var70, 3842);
                return;
            }
            if (arg0 == 5066) {
                int var71 = field4759[--field4760];
                field4759[field4760++] = class58.field599.method1516(0, var71).method2783((byte) 95);
                return;
            }
            if (arg0 == 5067) {
                field4760 -= 2;
                int var72 = field4759[field4760];
                int var73 = field4759[field4760 + 1];
                int var74 = class58.field599.method1516(0, var72).method2784(var73, -1).field1254;
                field4759[field4760++] = var74;
                return;
            }
            if (arg0 == 5068) {
                field4760 -= 2;
                int var75 = field4759[field4760];
                int var76 = field4759[field4760 + 1];
                field4766.field9457[var75] = var76;
                return;
            }
            if (arg0 == 5069) {
                field4760 -= 2;
                int var77 = field4759[field4760];
                int var78 = field4759[field4760 + 1];
                field4766.field9457[var77] = var78;
                return;
            }
            if (arg0 == 5070) {
                field4760 -= 3;
                int var79 = field4759[field4760];
                int var80 = field4759[field4760 + 1];
                int var81 = field4759[field4760 + 2];
                class477 var82 = class58.field599.method1516(0, var79);
                if (var82.method2784(var80, -1).field1254 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4759[field4760++] = var82.method2786(var81, 0, var80);
                return;
            }
            if (arg0 == 5071) {
                String var83 = field4750[--field4756];
                boolean var84 = field4759[--field4760] == 1;
                class383.method2107(var83, var84, 0);
                field4759[field4760++] = class67.field726;
                return;
            }
            if (arg0 == 5072) {
                if (class382.field5121 != null && class255.field3262 < class67.field726) {
                    field4759[field4760++] = class382.field5121[class255.field3262++] & 0xFFFF;
                    return;
                }
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class255.field3262 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class653.field9339.method1805((byte) -75, 86)) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class653.field9339.method1805((byte) -112, 82)) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class653.field9339.method1805((byte) -80, 81)) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class503.method2894(field4759[--field4760], (byte) -96);
                return;
            }
            if (arg0 == 5201) {
                field4759[field4760++] = class445.method2461((byte) 121);
                return;
            }
            if (arg0 == 5205) {
                class501.method2885(-1, -22933, field4759[--field4760], -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var85 = field4759[--field4760];
                class672 var86 = class637.method3582(var85 >> 14 & 0x3FFF, var85 & 0x3FFF);
                if (var86 == null) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = var86.field9544;
                return;
            }
            if (arg0 == 5207) {
                class672 var87 = class637.method3572(field4759[--field4760]);
                if (var87 != null && var87.field9551 != null) {
                    field4750[field4756++] = var87.field9551;
                    return;
                }
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4759[field4760++] = class107.field1244;
                field4759[field4760++] = class156.field1748;
                return;
            }
            if (arg0 == 5209) {
                field4759[field4760++] = class637.field9039 + class306.field3998;
                field4759[field4760++] = class637.field9043 + class122.field1375;
                return;
            }
            if (arg0 == 5210) {
                int var88 = field4759[--field4760];
                class672 var89 = class637.method3572(var88);
                if (var89 == null) {
                    field4759[field4760++] = 0;
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = var89.field9540 >> 14 & 0x3FFF;
                field4759[field4760++] = var89.field9540 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var90 = field4759[--field4760];
                class672 var91 = class637.method3572(var90);
                if (var91 == null) {
                    field4759[field4760++] = 0;
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = var91.field9547 - var91.field9549;
                field4759[field4760++] = var91.field9552 - var91.field9545;
                return;
            }
            if (arg0 == 5212) {
                class276 var92 = class276.method1565(-1);
                if (var92 == null) {
                    field4759[field4760++] = -1;
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = var92.field3483;
                int var93 = var92.field3481 << 28 | class637.field9039 + var92.field3479 << 14 | class637.field9043 + var92.field3484;
                field4759[field4760++] = var93;
                return;
            }
            if (arg0 == 5213) {
                class276 var94 = class475.method2772(8);
                if (var94 == null) {
                    field4759[field4760++] = -1;
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = var94.field3483;
                int var95 = var94.field3481 << 28 | class637.field9039 + var94.field3479 << 14 | class637.field9043 + var94.field3484;
                field4759[field4760++] = var95;
                return;
            }
            if (arg0 == 5214) {
                int var96 = field4759[--field4760];
                class672 var97 = class308.method1757((byte) 90);
                if (var97 != null) {
                    boolean var98 = var97.method3765(var96 & 0x3FFF, field4771, var96 >> 14 & 0x3FFF, -1, var96 >> 28 & 0x3);
                    if (var98) {
                        class470.method2670(101, field4771[2], field4771[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4760 -= 2;
                int var99 = field4759[field4760];
                int var100 = field4759[field4760 + 1];
                class474 var101 = class637.method3571(var99 >> 14 & 0x3FFF, var99 & 0x3FFF);
                boolean var102 = false;
                for (class672 var103 = (class672) var101.method2769(0); var103 != null; var103 = (class672) var101.method2763(-23638)) {
                    if (var103.field9544 == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (var102) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var104 = field4759[--field4760];
                class672 var105 = class637.method3572(var104);
                if (var105 == null) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = var105.field9557;
                return;
            }
            if (arg0 == 5220) {
                field4759[field4760++] = class376.field4887 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var106 = field4759[--field4760];
                class470.method2670(84, var106 & 0x3FFF, var106 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class672 var107 = class308.method1757((byte) 90);
                if (var107 != null) {
                    boolean var108 = var107.method3771(field4771, (byte) -59, class637.field9043 + class122.field1375, class637.field9039 + class306.field3998);
                    if (var108) {
                        field4759[field4760++] = field4771[1];
                        field4759[field4760++] = field4771[2];
                        return;
                    }
                    field4759[field4760++] = -1;
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = -1;
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4760 -= 2;
                int var109 = field4759[field4760];
                int var110 = field4759[field4760 + 1];
                class501.method2885(var110 >> 14 & 0x3FFF, -22933, var109, var110 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var111 = field4759[--field4760];
                class672 var112 = class308.method1757((byte) 90);
                if (var112 != null) {
                    boolean var113 = var112.method3765(var111 & 0x3FFF, field4771, var111 >> 14 & 0x3FFF, -1, var111 >> 28 & 0x3);
                    if (var113) {
                        field4759[field4760++] = field4771[1];
                        field4759[field4760++] = field4771[2];
                        return;
                    }
                    field4759[field4760++] = -1;
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = -1;
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var114 = field4759[--field4760];
                class672 var115 = class308.method1757((byte) 90);
                if (var115 != null) {
                    boolean var116 = var115.method3771(field4771, (byte) -59, var114 & 0x3FFF, var114 >> 14 & 0x3FFF);
                    if (var116) {
                        field4759[field4760++] = field4771[1];
                        field4759[field4760++] = field4771[2];
                        return;
                    }
                    field4759[field4760++] = -1;
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = -1;
                field4759[field4760++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class193.method1110(126, field4759[--field4760]);
                return;
            }
            if (arg0 == 5227) {
                field4760 -= 2;
                int var117 = field4759[field4760];
                int var118 = field4759[field4760 + 1];
                class501.method2885(var118 >> 14 & 0x3FFF, -22933, var117, var118 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class555.field7909 = field4759[--field4760] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4759[field4760++] = class555.field7909 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var119 = field4759[--field4760];
                class512.method2931(-4495, var119);
                return;
            }
            if (arg0 == 5231) {
                field4760 -= 2;
                int var120 = field4759[field4760];
                boolean var121 = field4759[field4760 + 1] == 1;
                if (class109.field1265 != null) {
                    class270 var122 = class109.field1265.method3234((byte) -110, (long) var120);
                    if (var122 != null && !var121) {
                        var122.method1519((byte) 121);
                        return;
                    }
                    if (var122 == null && var121) {
                        class270 var123 = new class270();
                        class109.field1265.method3235((long) var120, -1, var123);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var124 = field4759[--field4760];
                if (class109.field1265 != null) {
                    class270 var125 = class109.field1265.method3234((byte) -105, (long) var124);
                    field4759[field4760++] = var125 == null ? 0 : 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4760 -= 2;
                int var126 = field4759[field4760];
                boolean var127 = field4759[field4760 + 1] == 1;
                if (class170.field2033 != null) {
                    class270 var128 = class170.field2033.method3234((byte) -39, (long) var126);
                    if (var128 != null && !var127) {
                        var128.method1519((byte) 121);
                        return;
                    }
                    if (var128 == null && var127) {
                        class270 var129 = new class270();
                        class170.field2033.method3235((long) var126, -1, var129);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var130 = field4759[--field4760];
                if (class170.field2033 != null) {
                    class270 var131 = class170.field2033.method3234((byte) -91, (long) var130);
                    field4759[field4760++] = var131 == null ? 0 : 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4759[field4760++] = class637.field9015 == null ? -1 : class637.field9015.field9544;
                return;
            }
            if (arg0 == 5236) {
                field4760 -= 2;
                int var132 = field4759[field4760];
                int var133 = field4759[field4760 + 1];
                int var134 = var133 >> 14 & 0x3FFF;
                int var135 = var133 & 0x3FFF;
                int var136 = class499.method2868(var132, (byte) -119, var134, var135);
                if (var136 < 0) {
                    field4759[field4760++] = -1;
                    return;
                }
                field4759[field4760++] = var136;
                return;
            }
            if (arg0 == 5237) {
                class417.method2254(false);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4760 -= 2;
                int var137 = field4759[field4760];
                int var138 = field4759[field4760 + 1];
                class472.method2676(3, var137, 0, false, var138);
                field4759[field4760++] = class680.field9649 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class680.field9649 != null) {
                    class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class438[] var139 = class270.method1521(-114);
                field4759[field4760++] = var139.length;
                return;
            }
            if (arg0 == 5303) {
                int var140 = field4759[--field4760];
                class438[] var141 = class270.method1521(-120);
                field4759[field4760++] = var141[var140].field6090;
                field4759[field4760++] = var141[var140].field6092;
                return;
            }
            if (arg0 == 5305) {
                int var142 = class601.field8530.field2850;
                int var143 = class601.field8530.field2865;
                int var144 = -1;
                class438[] var145 = class270.method1521(-120);
                for (int var146 = 0; var146 < var145.length; var146++) {
                    class438 var147 = var145[var146];
                    if (var147.field6090 == var142 && var147.field6092 == var143) {
                        var144 = var146;
                        break;
                    }
                }
                field4759[field4760++] = var144;
                return;
            }
            if (arg0 == 5306) {
                field4759[field4760++] = class480.method2800(32032);
                return;
            }
            if (arg0 == 5307) {
                int var148 = field4759[--field4760];
                if (var148 >= 1 && var148 <= 2) {
                    class472.method2676(var148, -1, 0, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4759[field4760++] = class601.field8530.field2869;
                return;
            }
            if (arg0 == 5309) {
                int var149 = field4759[--field4760];
                if (var149 >= 1 && var149 <= 2) {
                    class601.field8530.field2869 = var149;
                    class601.field8530.method1841(121, class623.field8837);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4756 -= 2;
                String var150 = field4750[field4756];
                String var151 = field4750[field4756 + 1];
                int var152 = field4759[--field4760];
                field4755++;
                class480.method2802(class583.field8296, 16751);
                class334.field4314.method2525(class265.method1504(var150, (byte) 88) + class265.method1504(var151, (byte) 88) + 1, -81849);
                class334.field4314.method2573(var150, 16746);
                class334.field4314.method2573(var151, 16746);
                class334.field4314.method2525(var152, -81849);
                return;
            }
            if (arg0 == 5401) {
                field4760 -= 2;
                class233.field2959[field4759[field4760]] = (short) class147.method803(true, field4759[field4760 + 1]);
                class472.field6588.method1907((byte) -111);
                class472.field6588.method1911(85);
                class608.field8585.method3271(102);
                class14.method66(12287);
                return;
            }
            if (arg0 == 5405) {
                field4760 -= 2;
                int var153 = field4759[field4760];
                int var154 = field4759[field4760 + 1];
                if (var153 >= 0 && var153 < 2) {
                    class633.field8973[var153] = new int[var154 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4760 -= 7;
                int var155 = field4759[field4760];
                int var156 = field4759[field4760 + 1] << 1;
                int var157 = field4759[field4760 + 2];
                int var158 = field4759[field4760 + 3];
                int var159 = field4759[field4760 + 4];
                int var160 = field4759[field4760 + 5];
                int var161 = field4759[field4760 + 6];
                if (var155 >= 0 && var155 < 2 && class633.field8973[var155] != null && var156 >= 0 && var156 < class633.field8973[var155].length) {
                    class633.field8973[var155][var156] = new int[] { (var157 >> 14 & 0x3FFF) << 9, var158 << 2, (var157 & 0x3FFF) << 9, var161 };
                    class633.field8973[var155][var156 + 1] = new int[] { (var159 >> 14 & 0x3FFF) << 9, var160 << 2, (var159 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var162 = class633.field8973[field4759[--field4760]].length >> 1;
                field4759[field4760++] = var162;
                return;
            }
            if (arg0 == 5411) {
                if (class680.field9649 != null) {
                    class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
                }
                if (class77.field796 != null) {
                    class321.method1813(913);
                    System.exit(0);
                    return;
                }
                String var163 = class629.field8937 == null ? class349.method1935(16262) : class629.field8937;
                class566.method3202(class623.field8837, false, 48, var163, class150.field1711 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var164 = "";
                if (class468.field6483 != null) {
                    if (class468.field6483.field2434 == null) {
                        var164 = class112.method696((byte) -82, class468.field6483.field2436);
                    } else {
                        var164 = (String) class468.field6483.field2434;
                    }
                }
                field4750[field4756++] = var164;
                return;
            }
            if (arg0 == 5420) {
                field4759[field4760++] = class623.field8837.field7924 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class680.field9649 != null) {
                    class472.method2676(class601.field8530.field2869, -1, 0, false, -1);
                }
                String var165 = field4750[--field4756];
                boolean var166 = field4759[--field4760] == 1;
                String var167 = class349.method1935(16262) + var165;
                class566.method3202(class623.field8837, var166, 48, var167, class150.field1711 == 1);
                return;
            }
            if (arg0 == 5422) {
                field4756 -= 2;
                String var168 = field4750[field4756];
                String var169 = field4750[field4756 + 1];
                int var170 = field4759[--field4760];
                if (var168.length() > 0) {
                    if (class329.field4267 == null) {
                        class329.field4267 = new String[class594.field8433[class220.field2668.field2518]];
                    }
                    class329.field4267[var170] = var168;
                }
                if (var169.length() > 0) {
                    if (class93.field1051 == null) {
                        class93.field1051 = new String[class594.field8433[class220.field2668.field2518]];
                    }
                    class93.field1051[var170] = var169;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4750[--field4756]);
                return;
            }
            if (arg0 == 5424) {
                field4760 -= 11;
                class580.field8251 = field4759[field4760];
                class635.field8986 = field4759[field4760 + 1];
                class427.field5672 = field4759[field4760 + 2];
                class279.field3529 = field4759[field4760 + 3];
                class622.field8829 = field4759[field4760 + 4];
                class419.field5568 = field4759[field4760 + 5];
                class474.field6908 = field4759[field4760 + 6];
                class608.field8602 = field4759[field4760 + 7];
                class485.field7067 = field4759[field4760 + 8];
                class454.field6294 = field4759[field4760 + 9];
                class249.field3201 = field4759[field4760 + 10];
                class633.field8972.method1711(class622.field8829, 1);
                class633.field8972.method1711(class419.field5568, 1);
                class633.field8972.method1711(class474.field6908, 1);
                class633.field8972.method1711(class608.field8602, 1);
                class633.field8972.method1711(class485.field7067, 1);
                class35.field398 = null;
                class141.field1609 = null;
                class284.field3601 = null;
                class489.field7097 = null;
                class513.field7337 = null;
                class426.field5656 = null;
                class275.field3478 = null;
                class282.field3594 = null;
                class604.field8551 = true;
                return;
            }
            if (arg0 == 5425) {
                class566.method3200(-10);
                class604.field8551 = false;
                return;
            }
            if (arg0 == 5426) {
                field4760 -= 2;
                class191.field2305 = field4759[field4760];
                class421.field5604 = field4759[field4760 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4760 -= 2;
                class293.field3848 = field4759[field4760 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4760 -= 2;
                int var171 = field4759[field4760];
                int var172 = field4759[field4760 + 1];
                field4759[field4760++] = class38.method201(var171, 99, var172) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class332.method1866(false, false, (byte) 123, field4750[--field4756]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class432.method2311(4975, "accountcreated", class485.field7068);
                    return;
                } catch (Throwable var300) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class432.method2311(4975, "accountcreatestarted", class485.field7068);
                    return;
                } catch (Throwable var301) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4760 -= 4;
                int var173 = field4759[field4760];
                int var174 = field4759[field4760 + 1];
                int var175 = field4759[field4760 + 2];
                int var176 = field4759[field4760 + 3];
                class377.method2072((var173 & 0x3FFF) - class146.field1642, var175, (var173 >> 14 & 0x3FFF) - class682.field9685, -3589, var176, var174 << 2, false);
                return;
            }
            if (arg0 == 5501) {
                field4760 -= 4;
                int var177 = field4759[field4760];
                int var178 = field4759[field4760 + 1];
                int var179 = field4759[field4760 + 2];
                int var180 = field4759[field4760 + 3];
                class177.method1038(var180, (var177 & 0x3FFF) - class146.field1642, var178 << 2, var179, -118, (var177 >> 14 & 0x3FFF) - class682.field9685);
                return;
            }
            if (arg0 == 5502) {
                field4760 -= 6;
                int var181 = field4759[field4760];
                if (var181 >= 2) {
                    throw new RuntimeException();
                }
                class689.field9735 = var181;
                int var182 = field4759[field4760 + 1];
                if (var182 + 1 >= class633.field8973[class689.field9735].length >> 1) {
                    throw new RuntimeException();
                }
                class4.field29 = var182;
                class380.field4935 = 0;
                class621.field8797 = field4759[field4760 + 2];
                class370.field4804 = field4759[field4760 + 3];
                int var183 = field4759[field4760 + 4];
                if (var183 >= 2) {
                    throw new RuntimeException();
                }
                class424.field5643 = var183;
                int var184 = field4759[field4760 + 5];
                if (var184 + 1 >= class633.field8973[class424.field5643].length >> 1) {
                    throw new RuntimeException();
                }
                class484.field7058 = var184;
                class5.field41 = 3;
                return;
            }
            if (arg0 == 5503) {
                class438.method2419(-102);
                return;
            }
            if (arg0 == 5504) {
                field4760 -= 2;
                class585.method3290(field4759[field4760], -4097, 0, field4759[field4760 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field4759[field4760++] = (int) class89.field958 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4759[field4760++] = (int) class90.field1041 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class211.method1268(-107);
                return;
            }
            if (arg0 == 5508) {
                class437.method2413(127);
                return;
            }
            if (arg0 == 5509) {
                class153.method838(true);
                return;
            }
            if (arg0 == 5510) {
                class555.method3128((byte) -120);
                return;
            }
            if (arg0 == 5511) {
                int var185 = field4759[--field4760];
                int var186 = var185 >> 14 & 0x3FFF;
                int var187 = var185 & 0x3FFF;
                int var188 = var186 - class682.field9685;
                if (var188 < 0) {
                    var188 = 0;
                } else if (var188 >= class399.field5338) {
                    var188 = class399.field5338;
                }
                int var189 = var187 - class146.field1642;
                if (var189 < 0) {
                    var189 = 0;
                } else if (var189 >= class349.field4567) {
                    var189 = class349.field4567;
                }
                class638.field9053 = (var188 << 9) + 256;
                class437.field6085 = (var189 << 9) + 256;
                class5.field41 = 4;
                return;
            }
            if (arg0 == 5512) {
                class321.method1807(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4756 -= 2;
                String var190 = field4750[field4756];
                String var191 = field4750[field4756 + 1];
                int var192 = field4759[--field4760];
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    class380.field4932 = var190;
                    class673.field9560 = var191;
                    class347.field4526 = var192;
                    class508.method2921(6, (byte) -110);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class636.method3563(-25522);
                return;
            }
            if (arg0 == 5602) {
                if (class274.field3474 == 0) {
                    class323.field4204 = -2;
                    class98.field1083 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4760 -= 4;
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    class36.method197(field4759[field4760 + 3], field4759[field4760], field4759[field4760 + 1], -24671, field4759[field4760 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4756--;
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    class382.method2092(false, class650.method3669(-16514, field4750[field4756]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4756 -= 2;
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    class656.method3703(false, 73, field4750[field4756 + 1], class650.method3669(-16514, field4750[field4756]));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class267.field3364 == 0) {
                    class377.field4898 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4759[field4760++] = class98.field1083;
                return;
            }
            if (arg0 == 5608) {
                field4759[field4760++] = class436.field6078;
                return;
            }
            if (arg0 == 5609) {
                field4759[field4760++] = class377.field4898;
                return;
            }
            if (arg0 == 5610) {
                for (int var193 = 0; var193 < 5; var193++) {
                    field4750[field4756++] = class552.field7872.length > var193 ? class95.method592(class552.field7872[var193], 64) : "";
                }
                class552.field7872 = null;
                return;
            }
            if (arg0 == 5611) {
                field4759[field4760++] = class405.field5405;
                return;
            }
            if (arg0 == 5612) {
                int var194 = field4759[--field4760];
                if (class351.field4601 != 7) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    if (class170.field2043 != null) {
                        class170.field2043.method1642(-1);
                        class170.field2043 = null;
                    }
                    class347.field4526 = var194;
                    class508.method2921(9, (byte) -124);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4759[field4760++] = class98.field1083;
                return;
            }
            if (arg0 == 5615) {
                field4756 -= 2;
                String var195 = field4750[field4756];
                String var196 = field4750[field4756 + 1];
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    if (class170.field2043 != null) {
                        class170.field2043.method1642(-1);
                        class170.field2043 = null;
                    }
                    class380.field4932 = var195;
                    class673.field9560 = var196;
                    class508.method2921(5, (byte) -105);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class184.method1069(false, false);
                return;
            }
            if (arg0 == 5617) {
                field4759[field4760++] = class323.field4204;
                return;
            }
            if (arg0 == 5618) {
                int var197 = field4759[--field4760];
                class210.method1264(var197, (byte) -128, false);
                return;
            }
            if (arg0 == 5619) {
                int var198 = field4759[--field4760];
                class210.method1264(var198, (byte) -113, true);
                return;
            }
            if (arg0 == 5620) {
                class396.method2164((byte) -124);
                if (class375.field4865 != "" && class375.field4865 != "") {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4756 -= 2;
                if (class351.field4601 != 3) {
                    return;
                }
                if (class274.field3474 == 0 && class267.field3364 == 0) {
                    class656.method3703(true, 73, field4750[field4756 + 1], class650.method3669(-16514, field4750[field4756]));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class199 var199 = class623.field8837.method3140("3", false, -65);
                while (var199.field2437 == 0) {
                    class370.method2025(-1, 1L);
                }
                if (var199.field2437 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class647 var200 = (class647) var199.field2434;
                if (var200.method3636((byte) 41).exists()) {
                    class452 var201 = new class452(50);
                    try {
                        var200.method3635(50, 1, var201.field6209, 0);
                    } catch (IOException var303) {
                    }
                }
                try {
                    var200.method3633(0);
                    return;
                } catch (Exception var302) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class343.field4443 != null) {
                    field4759[field4760++] = 1;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field4759[field4760++] = (int) (class222.field2795 >> 32);
                field4759[field4760++] = (int) (class222.field2795 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var202 = field4759[--field4760];
                if (var202 < 1) {
                    var202 = 1;
                }
                if (var202 > 4) {
                    var202 = 4;
                }
                class601.field8530.field2868 = var202;
                class675.method3778((byte) 126);
                class601.field8530.method1841(121, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6002) {
                class601.field8530.method1842(32, field4759[--field4760] == 1);
                class675.method3778((byte) 126);
                class325.method1846(-1);
                class601.field8530.method1841(125, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6003) {
                class601.field8530.field2872 = field4759[--field4760] == 1;
                class325.method1846(-1);
                class601.field8530.method1841(127, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6005) {
                class601.field8530.field2839 = field4759[--field4760] == 1;
                class675.method3778((byte) 126);
                class601.field8530.method1841(122, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6006) {
                class601.field8530.field2879 = field4759[--field4760] == 1;
                class453.field6284.method293(!class601.field8530.field2879);
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6007) {
                class601.field8530.field2842 = field4759[--field4760];
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6008) {
                class601.field8530.field2861 = field4759[--field4760] == 1;
                class601.field8530.method1841(124, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6009) {
                class601.field8530.field2845 = field4759[--field4760] == 1;
                class675.method3778((byte) 126);
                class601.field8530.method1841(123, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6010) {
                class601.field8530.field2882 = field4759[--field4760] == 1;
                class601.field8530.method1841(121, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6011) {
                int var203 = field4759[--field4760];
                if (var203 < 0 || var203 > 2) {
                    var203 = 0;
                }
                class601.field8530.method1318(class150.field1711, var203, 127);
                class675.method3778((byte) 126);
                class601.field8530.method1841(123, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6012) {
                class601.field8530.method1319(class150.field1711, field4759[--field4760] == 1, (byte) 66);
                class593.method3325((byte) -118);
                class89.method558(0);
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6014) {
                class601.field8530.field2859 = field4759[--field4760] == 1;
                class675.method3778((byte) 125);
                class601.field8530.method1841(121, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6015) {
                class601.field8530.field2853 = field4759[--field4760] == 1;
                class675.method3778((byte) 127);
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6016) {
                int var204 = field4759[--field4760];
                if (var204 < 0 || var204 > 2) {
                    var204 = 0;
                }
                class601.field8530.field2858 = var204;
                class466.method2646(8000, class150.field1711);
                class601.field8530.method1841(121, class623.field8837);
                return;
            }
            if (arg0 == 6017) {
                class601.field8530.field2840 = field4759[--field4760] == 1;
                class115.method704(113);
                class601.field8530.method1841(120, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6018) {
                int var205 = field4759[--field4760];
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 127) {
                    var205 = 127;
                }
                class601.field8530.field2841 = var205;
                class601.field8530.method1841(121, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6019) {
                int var206 = field4759[--field4760];
                if (var206 < 0) {
                    var206 = 0;
                }
                if (var206 > 255) {
                    var206 = 255;
                }
                if (class601.field8530.field2866 != var206) {
                    if (class601.field8530.field2866 == 0 && class80.field832 != -1) {
                        class613.method3424(121, class403.field5364, false, 0, var206, class80.field832);
                        class548.field7834 = false;
                    } else if (var206 == 0) {
                        class24.method120((byte) 105);
                        class548.field7834 = false;
                    } else {
                        class325.method1848(var206, -82);
                    }
                    class601.field8530.field2866 = var206;
                }
                class601.field8530.method1841(121, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6020) {
                int var207 = field4759[--field4760];
                if (var207 < 0) {
                    var207 = 0;
                }
                if (var207 > 127) {
                    var207 = 127;
                }
                class601.field8530.field2877 = var207;
                class601.field8530.method1841(120, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6021) {
                class601.field8530.field4217 = field4759[--field4760] == 1;
                class325.method1846(-1);
                return;
            }
            if (arg0 == 6023) {
                int var208 = field4759[--field4760];
                boolean var209 = false;
                if (var208 < 0) {
                    var208 = 0;
                }
                if (var208 > 2) {
                    var208 = 2;
                }
                if (class145.field1630 < 96) {
                    var208 = 0;
                    var209 = true;
                }
                class178.method1049((byte) 34, var208);
                class601.field8530.method1841(127, class623.field8837);
                class272.field3441 = false;
                field4759[field4760++] = var209 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var210 = field4759[--field4760];
                if (var210 < 0 || var210 > 2) {
                    var210 = 0;
                }
                class601.field8530.field2851 = var210;
                class601.field8530.method1841(123, class623.field8837);
                return;
            }
            if (arg0 == 6025) {
                int var211 = field4759[--field4760];
                if (var211 < 0 || var211 > class601.method3360(class145.field1630, (byte) 3)) {
                    var211 = 0;
                }
                class601.field8530.field2854 = var211;
                class601.field8530.method1841(125, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6027) {
                int var212 = field4759[--field4760];
                if (var212 < 0 || var212 > 1) {
                    var212 = 0;
                }
                class445.method2464(var212 == 1, (byte) -27);
                return;
            }
            if (arg0 == 6028) {
                class601.field8530.field2844 = field4759[--field4760] != 0;
                class601.field8530.method1841(123, class623.field8837);
                return;
            }
            if (arg0 == 6029) {
                class601.field8530.field2842 = field4759[--field4760];
                class601.field8530.method1841(123, class623.field8837);
                return;
            }
            if (arg0 == 6030) {
                class601.field8530.field2860 = field4759[--field4760] != 0;
                class601.field8530.method1841(127, class623.field8837);
                class675.method3778((byte) 127);
                return;
            }
            if (arg0 == 6031) {
                int var213 = field4759[--field4760];
                if (var213 < 0 || var213 > 5) {
                    var213 = 2;
                }
                class466.method2646(8000, var213);
                return;
            }
            if (arg0 == 6032) {
                int var214 = field4759[--field4760];
                if (var214 < 0 || var214 > 5) {
                    var214 = 2;
                }
                class601.field8530.field2884 = var214;
                class601.field8530.method1841(126, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6033) {
                int var215 = field4759[--field4760];
                if (var215 < 0 || var215 > 4) {
                    var215 = 2;
                }
                class601.field8530.field2857 = var215;
                class601.field8530.method1841(121, class623.field8837);
                return;
            }
            if (arg0 == 6034) {
                class601.field8530.field2876 = field4759[--field4760] == 1;
                class601.field8530.method1841(123, class623.field8837);
                class593.method3325((byte) -100);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6035) {
                class601.field8530.field4230 = field4759[--field4760] == 1;
                class675.method3778((byte) 127);
                class325.method1846(-1);
                return;
            }
            if (arg0 == 6036) {
                int var216 = field4759[--field4760];
                if (var216 < 0 || var216 > 2) {
                    var216 = 0;
                }
                class601.field8530.method1832(false, var216);
                class601.field8530.method1841(126, class623.field8837);
                return;
            }
            if (arg0 == 6037) {
                int var217 = field4759[--field4760];
                if (var217 < 0) {
                    var217 = 0;
                }
                if (var217 > 127) {
                    var217 = 127;
                }
                class601.field8530.field2875 = var217;
                class601.field8530.method1841(124, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6038) {
                int var218 = field4759[--field4760];
                if (var218 < 0) {
                    var218 = 0;
                }
                if (var218 > 255) {
                    var218 = 255;
                }
                if (class601.field8530.field2873 != var218 && class80.field832 == class21.field195) {
                    if (class601.field8530.field2873 == 0) {
                        class613.method3424(18, class403.field5364, false, 0, var218, class80.field832);
                        class548.field7834 = false;
                    } else if (var218 == 0) {
                        class24.method120((byte) -90);
                        class548.field7834 = false;
                    } else {
                        class325.method1848(var218, -97);
                    }
                }
                class601.field8530.field2873 = var218;
                class601.field8530.method1841(123, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 6039) {
                int var219 = field4759[--field4760];
                if (var219 > 255 || var219 < 0) {
                    var219 = 0;
                }
                if (class601.field8530.field2856 != var219) {
                    class601.field8530.field2856 = var219;
                    class601.field8530.method1841(126, class623.field8837);
                    class272.field3441 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4759[field4760++] = class601.field8530.field2868;
                return;
            }
            if (arg0 == 6102) {
                field4759[field4760++] = class601.field8530.method1826(class150.field1711, (byte) -119) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4759[field4760++] = class601.field8530.field2872 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4759[field4760++] = class601.field8530.field2839 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4759[field4760++] = class601.field8530.field2879 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4759[field4760++] = class601.field8530.field2842;
                return;
            }
            if (arg0 == 6108) {
                field4759[field4760++] = class601.field8530.field2861 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4759[field4760++] = class601.field8530.field2845 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4759[field4760++] = class601.field8530.field2882 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4759[field4760++] = class601.field8530.method1317((byte) -83, class150.field1711);
                return;
            }
            if (arg0 == 6112) {
                field4759[field4760++] = class601.field8530.method1320(21, class150.field1711) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4759[field4760++] = class601.field8530.field2859 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4759[field4760++] = class601.field8530.field2853 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4759[field4760++] = class601.field8530.field2858;
                return;
            }
            if (arg0 == 6117) {
                field4759[field4760++] = class601.field8530.field2840 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4759[field4760++] = class601.field8530.field2841;
                return;
            }
            if (arg0 == 6119) {
                field4759[field4760++] = class601.field8530.field2866;
                return;
            }
            if (arg0 == 6120) {
                field4759[field4760++] = class601.field8530.field2877;
                return;
            }
            if (arg0 == 6121) {
                field4759[field4760++] = class453.field6284.method336() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4759[field4760++] = class376.method2066((byte) 1);
                return;
            }
            if (arg0 == 6124) {
                field4759[field4760++] = class601.field8530.field2851;
                return;
            }
            if (arg0 == 6125) {
                field4759[field4760++] = class601.field8530.field2854;
                return;
            }
            if (arg0 == 6126) {
                field4759[field4760++] = class453.field6284.method275() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4759[field4760++] = class601.field8530.field2849 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4759[field4760++] = class601.field8530.field2844 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4759[field4760++] = class601.field8530.field2842;
                return;
            }
            if (arg0 == 6130) {
                field4759[field4760++] = class601.field8530.field2860 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4759[field4760++] = class150.field1711;
                return;
            }
            if (arg0 == 6132) {
                field4759[field4760++] = class601.field8530.field2884;
                return;
            }
            if (arg0 == 6133) {
                field4759[field4760++] = class623.field8837.field7924 && !class623.field8837.field7935 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4759[field4760++] = class601.method3360(class145.field1630, (byte) 3);
                return;
            }
            if (arg0 == 6135) {
                field4759[field4760++] = class601.field8530.field2857;
                return;
            }
            if (arg0 == 6136) {
                field4759[field4760++] = class601.field8530.field2876 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var220 = true;
                try {
                    var220 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var304) {
                }
                field4759[field4760++] = var220 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field4759[field4760++] = class362.method1990((byte) 50, class150.field1711, 200);
                return;
            }
            if (arg0 == 6139) {
                field4759[field4760++] = class601.field8530.method1844(class150.field1711, true);
                return;
            }
            if (arg0 == 6140) {
                byte var221 = 0;
                if (class421.method2281(65, class150.field1711) && class145.field1630 < 96) {
                    var221 = 1;
                }
                field4759[field4760++] = var221;
                return;
            }
            if (arg0 == 6141) {
                if (class145.field1630 < 96) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field4759[field4760++] = class601.field8530.field2875;
                return;
            }
            if (arg0 == 6143) {
                field4759[field4760++] = class601.field8530.field2873;
                return;
            }
            if (arg0 == 6144) {
                field4759[field4760++] = class264.field3343 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field4759[field4760++] = class601.field8530.field2856;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4760 -= 2;
                class508.field7313 = (short) field4759[field4760];
                if (class508.field7313 <= 0) {
                    class508.field7313 = 256;
                }
                class7.field59 = (short) field4759[field4760 + 1];
                if (class7.field59 <= 0) {
                    class7.field59 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4760 -= 2;
                class559.field7964 = (short) field4759[field4760];
                if (class559.field7964 <= 0) {
                    class559.field7964 = 256;
                }
                class184.field2242 = (short) field4759[field4760 + 1];
                if (class184.field2242 <= 0) {
                    class184.field2242 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4760 -= 4;
                class300.field3930 = (short) field4759[field4760];
                if (class300.field3930 <= 0) {
                    class300.field3930 = 1;
                }
                class46.field508 = (short) field4759[field4760 + 1];
                if (class46.field508 <= 0) {
                    class46.field508 = 32767;
                } else if (class46.field508 < class300.field3930) {
                    class46.field508 = class300.field3930;
                }
                class548.field7836 = (short) field4759[field4760 + 2];
                if (class548.field7836 <= 0) {
                    class548.field7836 = 1;
                }
                class662.field9413 = (short) field4759[field4760 + 3];
                if (class662.field9413 <= 0) {
                    class662.field9413 = 32767;
                    return;
                }
                if (class662.field9413 < class548.field7836) {
                    class662.field9413 = class548.field7836;
                }
                return;
            }
            if (arg0 == 6203) {
                class400.method2188(class113.field1320.field4958, false, 0, class113.field1320.field5035, (byte) -127, 0);
                field4759[field4760++] = class549.field7839;
                field4759[field4760++] = class435.field5887;
                return;
            }
            if (arg0 == 6204) {
                field4759[field4760++] = class559.field7964;
                field4759[field4760++] = class184.field2242;
                return;
            }
            if (arg0 == 6205) {
                field4759[field4760++] = class508.field7313;
                field4759[field4760++] = class7.field59;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4759[field4760++] = (int) (class641.method3604(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4759[field4760++] = (int) (class641.method3604(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4760 -= 3;
                int var222 = field4759[field4760];
                int var223 = field4759[field4760 + 1];
                int var224 = field4759[field4760 + 2];
                field4764.clear();
                field4764.set(11, 12);
                field4764.set(var224, var223, var222);
                int var225 = (int) (field4764.getTime().getTime() / 86400000L) - 11745;
                if (var224 < 1970) {
                    var225--;
                }
                field4759[field4760++] = var225;
                return;
            }
            if (arg0 == 6303) {
                field4764.clear();
                field4764.setTime(new Date(class641.method3604(false)));
                field4759[field4760++] = field4764.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var226 = field4759[--field4760];
                boolean var227 = true;
                if (var226 < 0) {
                    var227 = (var226 + 1) % 4 == 0;
                } else if (var226 < 1582) {
                    var227 = var226 % 4 == 0;
                } else if (var226 % 4 != 0) {
                    var227 = false;
                } else if (var226 % 100 != 0) {
                    var227 = true;
                } else if (var226 % 400 != 0) {
                    var227 = false;
                }
                field4759[field4760++] = var227 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4759[field4760++] = class548.method3099((byte) -125) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4759[field4760++] = class591.method3319((byte) 114) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class351.field4601 == 7 && class274.field3474 == 0 && class267.field3364 == 0) {
                    if (class415.field5504) {
                        field4759[field4760++] = 0;
                        return;
                    }
                    if (class690.field9742 > class641.method3604(false) - 1000L) {
                        field4759[field4760++] = 1;
                        return;
                    }
                    class415.field5504 = true;
                    class480.method2802(class194.field2326, 16751);
                    class334.field4314.method2554(class657.field9372, 255);
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class620 var228 = class647.method3638(-30828);
                if (var228 != null) {
                    field4759[field4760++] = var228.field8720;
                    field4759[field4760++] = var228.field7626;
                    field4750[field4756++] = var228.field8718;
                    class623 var229 = var228.method3480((byte) 102);
                    field4759[field4760++] = var229.field8834;
                    field4750[field4756++] = var229.field8833;
                    field4759[field4760++] = var228.field7627;
                    field4759[field4760++] = var228.field8719;
                    field4750[field4756++] = var228.field8717;
                    return;
                }
                field4759[field4760++] = -1;
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 6502) {
                class620 var230 = class607.method3384(true);
                if (var230 != null) {
                    field4759[field4760++] = var230.field8720;
                    field4759[field4760++] = var230.field7626;
                    field4750[field4756++] = var230.field8718;
                    class623 var231 = var230.method3480((byte) 89);
                    field4759[field4760++] = var231.field8834;
                    field4750[field4756++] = var231.field8833;
                    field4759[field4760++] = var230.field7627;
                    field4759[field4760++] = var230.field8719;
                    field4750[field4756++] = var230.field8717;
                    return;
                }
                field4759[field4760++] = -1;
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var232 = field4759[--field4760];
                String var233 = field4750[--field4756];
                if (class351.field4601 == 7 && class274.field3474 == 0 && class267.field3364 == 0) {
                    field4759[field4760++] = class485.method2815(var233, -32012, var232) ? 1 : 0;
                    return;
                }
                field4759[field4760++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class601.field8530.field2871 = field4759[--field4760];
                class601.field8530.method1841(124, class623.field8837);
                return;
            }
            if (arg0 == 6505) {
                field4759[field4760++] = class601.field8530.field2871;
                return;
            }
            if (arg0 == 6506) {
                int var234 = field4759[--field4760];
                class620 var235 = class383.method2108((byte) 96, var234);
                if (var235 != null) {
                    field4759[field4760++] = var235.field7626;
                    field4750[field4756++] = var235.field8718;
                    class623 var236 = var235.method3480((byte) 94);
                    field4759[field4760++] = var236.field8834;
                    field4750[field4756++] = var236.field8833;
                    field4759[field4760++] = var235.field7627;
                    field4759[field4760++] = var235.field8719;
                    field4750[field4756++] = var235.field8717;
                    return;
                }
                field4759[field4760++] = -1;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                field4759[field4760++] = 0;
                field4759[field4760++] = 0;
                field4750[field4756++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4760 -= 4;
                int var237 = field4759[field4760];
                boolean var238 = field4759[field4760 + 1] == 1;
                int var239 = field4759[field4760 + 2];
                boolean var240 = field4759[field4760 + 3] == 1;
                class138.method773((byte) 122, var240, var238, var237, var239);
                return;
            }
            if (arg0 == 6508) {
                class223.method1312((byte) -35);
                return;
            }
            if (arg0 == 6509) {
                if (class351.field4601 != 7) {
                    return;
                }
                class496.field7165 = field4759[--field4760] == 1;
                return;
            }
            if (arg0 == 6510) {
                field4759[field4760++] = class250.field3228;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class601.field8530.field2880 = field4759[--field4760] == 1;
                class601.field8530.method1841(121, class623.field8837);
                return;
            }
            if (arg0 == 6601) {
                field4759[field4760++] = class601.field8530.field2880 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class537.field7715 == class414.field5487) {
            if (arg0 == 6700) {
                int var241 = class234.field2982.method3230(false);
                if (class397.field5320 != -1) {
                    var241++;
                }
                field4759[field4760++] = var241;
                return;
            }
            if (arg0 == 6701) {
                int var242 = field4759[--field4760];
                if (class397.field5320 != -1) {
                    if (var242 == 0) {
                        field4759[field4760++] = class397.field5320;
                        return;
                    }
                    var242--;
                }
                class454 var243 = (class454) class234.field2982.method3232(-1);
                while (var242-- > 0) {
                    var243 = (class454) class234.field2982.method3236(-27646);
                }
                field4759[field4760++] = var243.field6291;
                return;
            }
            if (arg0 == 6702) {
                int var244 = field4759[--field4760];
                if (class271.field3434[var244] == null) {
                    field4750[field4756++] = "";
                    return;
                }
                String var245 = class271.field3434[var244][0].field4978;
                if (var245 == null) {
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = var245.substring(0, var245.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var246 = field4759[--field4760];
                if (class271.field3434[var246] == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = class271.field3434[var246].length;
                return;
            }
            if (arg0 == 6704) {
                field4760 -= 2;
                int var247 = field4759[field4760];
                int var248 = field4759[field4760 + 1];
                if (class271.field3434[var247] == null) {
                    field4750[field4756++] = "";
                    return;
                }
                String var249 = class271.field3434[var247][var248].field4978;
                if (var249 == null) {
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = var249;
                return;
            }
            if (arg0 == 6705) {
                field4760 -= 2;
                int var250 = field4759[field4760];
                int var251 = field4759[field4760 + 1];
                if (class271.field3434[var250] == null) {
                    field4759[field4760++] = 0;
                    return;
                }
                field4759[field4760++] = class271.field3434[var250][var251].field5071;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4760 -= 3;
                int var252 = field4759[field4760];
                int var253 = field4759[field4760 + 1];
                int var254 = field4759[field4760 + 2];
                class343.method1906(var252 << 16 | var253, 1, "", 1, var254);
                return;
            }
            if (arg0 == 6708) {
                field4760 -= 3;
                int var255 = field4759[field4760];
                int var256 = field4759[field4760 + 1];
                int var257 = field4759[field4760 + 2];
                class343.method1906(var255 << 16 | var256, 2, "", 1, var257);
                return;
            }
            if (arg0 == 6709) {
                field4760 -= 3;
                int var258 = field4759[field4760];
                int var259 = field4759[field4760 + 1];
                int var260 = field4759[field4760 + 2];
                class343.method1906(var258 << 16 | var259, 3, "", 1, var260);
                return;
            }
            if (arg0 == 6710) {
                field4760 -= 3;
                int var261 = field4759[field4760];
                int var262 = field4759[field4760 + 1];
                int var263 = field4759[field4760 + 2];
                class343.method1906(var261 << 16 | var262, 4, "", 1, var263);
                return;
            }
            if (arg0 == 6711) {
                field4760 -= 3;
                int var264 = field4759[field4760];
                int var265 = field4759[field4760 + 1];
                int var266 = field4759[field4760 + 2];
                class343.method1906(var264 << 16 | var265, 5, "", 1, var266);
                return;
            }
            if (arg0 == 6712) {
                field4760 -= 3;
                int var267 = field4759[field4760];
                int var268 = field4759[field4760 + 1];
                int var269 = field4759[field4760 + 2];
                class343.method1906(var267 << 16 | var268, 6, "", 1, var269);
                return;
            }
            if (arg0 == 6713) {
                field4760 -= 3;
                int var270 = field4759[field4760];
                int var271 = field4759[field4760 + 1];
                int var272 = field4759[field4760 + 2];
                class343.method1906(var270 << 16 | var271, 7, "", 1, var272);
                return;
            }
            if (arg0 == 6714) {
                field4760 -= 3;
                int var273 = field4759[field4760];
                int var274 = field4759[field4760 + 1];
                int var275 = field4759[field4760 + 2];
                class343.method1906(var273 << 16 | var274, 8, "", 1, var275);
                return;
            }
            if (arg0 == 6715) {
                field4760 -= 3;
                int var276 = field4759[field4760];
                int var277 = field4759[field4760 + 1];
                int var278 = field4759[field4760 + 2];
                class343.method1906(var276 << 16 | var277, 9, "", 1, var278);
                return;
            }
            if (arg0 == 6716) {
                field4760 -= 3;
                int var279 = field4759[field4760];
                int var280 = field4759[field4760 + 1];
                int var281 = field4759[field4760 + 2];
                class343.method1906(var279 << 16 | var280, 10, "", 1, var281);
                return;
            }
            if (arg0 == 6717) {
                field4760 -= 3;
                int var282 = field4759[field4760];
                int var283 = field4759[field4760 + 1];
                int var284 = field4759[field4760 + 2];
                class382 var285 = class657.method3708(var284, (byte) -68, var282 << 16 | var283);
                class420.method2278(5580);
                class264 var286 = client.method1530(var285);
                class396.method2168(var286.field3336, var286.method1495((byte) 117), (byte) 91, var285);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var287 = field4759[--field4760];
                class89 var288 = class147.field1644.method1972(var287, (byte) -18);
                if (var288.field943 == null) {
                    field4750[field4756++] = "";
                    return;
                }
                field4750[field4756++] = var288.field943;
                return;
            }
            if (arg0 == 6801) {
                int var289 = field4759[--field4760];
                class89 var290 = class147.field1644.method1972(var289, (byte) -18);
                field4759[field4760++] = var290.field970;
                return;
            }
            if (arg0 == 6802) {
                int var291 = field4759[--field4760];
                class89 var292 = class147.field1644.method1972(var291, (byte) -18);
                field4759[field4760++] = var292.field949;
                return;
            }
            if (arg0 == 6803) {
                int var293 = field4759[--field4760];
                class89 var294 = class147.field1644.method1972(var293, (byte) -18);
                field4759[field4760++] = var294.field967;
                return;
            }
            if (arg0 == 6804) {
                field4760 -= 2;
                int var295 = field4759[field4760];
                int var296 = field4759[field4760 + 1];
                class450 var297 = class80.field854.method687(false, var296);
                if (var297.method2500(true)) {
                    field4750[field4756++] = class147.field1644.method1972(var295, (byte) -18).method550(var296, var297.field6197, 57);
                    return;
                }
                field4759[field4760++] = class147.field1644.method1972(var295, (byte) -18).method559(-128, var297.field6198, var296);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field4759[field4760++] = class89.field946 && !class539.field7752 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field4759[field4760++] = class664.field9446;
                return;
            }
            if (arg0 == 6902) {
                field4759[field4760++] = class300.field3929;
                return;
            }
            if (arg0 == 6903) {
                field4759[field4760++] = class19.field172;
                return;
            }
            if (arg0 == 6904) {
                field4759[field4760++] = class30.field355;
                return;
            }
            if (arg0 == 6905) {
                String var298 = "";
                if (class468.field6483 != null) {
                    if (class468.field6483.field2434 == null) {
                        var298 = class112.method696((byte) -73, class468.field6483.field2436);
                    } else {
                        var298 = (String) class468.field6483.field2434;
                    }
                }
                field4750[field4756++] = var298;
                return;
            }
            if (arg0 == 6906) {
                field4759[field4760++] = class470.field6561;
                return;
            }
            if (arg0 == 6907) {
                field4759[field4760++] = class406.field5413;
                return;
            }
            if (arg0 == 6908) {
                field4759[field4760++] = class286.field3661;
                return;
            }
            if (arg0 == 6909) {
                field4759[field4760++] = class398.field5321 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field4759[field4760++] = class41.field433;
                return;
            }
            if (arg0 == 6911) {
                field4759[field4760++] = class314.field4068;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var299 = class601.field8530.method1827(82);
                field4759[field4760++] = class601.field8530.field4228 = class150.field1711;
                field4759[field4760++] = var299;
                class675.method3778((byte) 127);
                class601.field8530.method1841(127, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7001) {
                class601.field8530.method1829(3);
                class675.method3778((byte) 126);
                class601.field8530.method1841(124, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7002) {
                class601.field8530.method1840(false);
                class675.method3778((byte) 127);
                class601.field8530.method1841(120, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7003) {
                class601.field8530.method1828((byte) 70);
                class675.method3778((byte) 125);
                class601.field8530.method1841(120, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7004) {
                class601.field8530.method1833(0);
                class675.method3778((byte) 126);
                class601.field8530.method1841(122, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7005) {
                class601.field8530.field2843 = 0;
                class601.field8530.method1841(124, class623.field8837);
                class272.field3441 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class601.field8530.field4228 == 2) {
                    class601.field8530.field4231 = true;
                    return;
                }
                if (class601.field8530.field4228 == 1) {
                    class601.field8530.field4213 = true;
                    return;
                }
                if (class601.field8530.field4228 == 3) {
                    class601.field8530.field4232 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field4759[field4760++] = class601.field8530.field2843;
                return;
            }
            if (arg0 == 7008) {
                if (class150.field1711 == 0 && class145.field1630 < 96) {
                    field4759[field4760++] = 2;
                    return;
                }
                field4759[field4760++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(IZ)V")
    public static final void method2010(int arg0, boolean arg1) {
    }
}
