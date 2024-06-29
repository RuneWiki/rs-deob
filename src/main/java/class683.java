import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class683 {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field9682 = new String[1000];

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    private static int field9676 = 0;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[I")
    private static int[] field9685 = new int[1000];

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    private static int field9693 = 0;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    private static int field9687 = 0;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[I")
    private static int[] field9700 = new int[5];

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[Lch;")
    private static class432[] field9686 = new class432[50];

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "[[I")
    private static int[][] field9689 = new int[5][5000];

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Ljava/util/Calendar;")
    private static Calendar field9688 = Calendar.getInstance();

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field9702 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[I")
    private static int[] field9701 = new int[3];

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Laj;")
    public static class287 field9703 = new class287(4);

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    private static int field9704 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Llk;")
    private static class545 field9679;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Llk;")
    private static class545 field9684;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Lwo;")
    private static class691 field9699;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "[I")
    private static int[] field9698;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[Ljava/lang/String;")
    private static String[] field9683;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lba;I)V")
    private static final void method3838(class356 arg0, int arg1) {
        field9687 = 0;
        field9693 = 0;
        int var2 = -1;
        int[] var3 = arg0.field5321;
        int[] var4 = arg0.field5322;
        byte var5 = -1;
        field9676 = 0;
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
                        method3839(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3843(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field9685[field9687++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field9685[field9687++] = class113.field2038.field2410[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class113.field2038.method1121(field9685[--field9687], var8, 82);
                } else if (var43 == 3) {
                    field9682[field9693++] = arg0.field5318[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field9687 -= 2;
                    if (field9685[field9687 + 1] != field9685[field9687]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field9687 -= 2;
                    if (field9685[field9687 + 1] == field9685[field9687]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field9687 -= 2;
                    if (field9685[field9687] < field9685[field9687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field9687 -= 2;
                    if (field9685[field9687] > field9685[field9687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field9676 == 0) {
                        return;
                    }
                    class432 var9 = field9686[--field9676];
                    arg0 = var9.field6245;
                    var3 = arg0.field5321;
                    var4 = arg0.field5322;
                    var2 = var9.field6243;
                    field9698 = var9.field6241;
                    field9683 = var9.field6240;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field9685[field9687++] = class113.field2038.method1115(var10, (byte) 14);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class113.field2038.method1118((byte) -128, var11, field9685[--field9687]);
                } else if (var43 == 31) {
                    field9687 -= 2;
                    if (field9685[field9687] <= field9685[field9687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field9687 -= 2;
                    if (field9685[field9687] >= field9685[field9687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field9685[field9687++] = field9698[var4[var2]];
                } else if (var43 == 34) {
                    field9698[var4[var2]] = field9685[--field9687];
                } else if (var43 == 35) {
                    field9682[field9693++] = field9683[var4[var2]];
                } else if (var43 == 36) {
                    field9683[var4[var2]] = field9682[--field9693];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field9693 -= var12;
                    String var13 = class638.method3637(var12, field9682, -29606, field9693);
                    field9682[field9693++] = var13;
                } else if (var43 == 38) {
                    field9687--;
                } else if (var43 == 39) {
                    field9693--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class356 var15 = class117.method1025(var14, -106);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field5327];
                    String[] var17 = new String[var15.field5324];
                    for (int var18 = 0; var18 < var15.field5320; var18++) {
                        var16[var18] = field9685[field9687 + var18 - var15.field5320];
                    }
                    for (int var19 = 0; var19 < var15.field5325; var19++) {
                        var17[var19] = field9682[field9693 + var19 - var15.field5325];
                    }
                    field9687 -= var15.field5320;
                    field9693 -= var15.field5325;
                    class432 var20 = new class432();
                    var20.field6245 = arg0;
                    var20.field6243 = var2;
                    var20.field6241 = field9698;
                    var20.field6240 = field9683;
                    if (field9676 >= field9686.length) {
                        throw new RuntimeException();
                    }
                    field9686[field9676++] = var20;
                    arg0 = var15;
                    var3 = var15.field5321;
                    var4 = var15.field5322;
                    var2 = -1;
                    field9698 = var16;
                    field9683 = var17;
                } else if (var43 == 42) {
                    field9685[field9687++] = class650.field9383[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class650.field9383[var21] = field9685[--field9687];
                    class278.method1838(var21, 9489);
                    class164.field2750 |= class302.field4501[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field9685[--field9687];
                    if (var24 >= 0 && var24 <= 5000) {
                        field9700[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field9689[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field9685[--field9687];
                    if (var28 < 0 || var28 >= field9700[var27]) {
                        throw new RuntimeException();
                    }
                    field9685[field9687++] = field9689[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field9687 -= 2;
                    int var30 = field9685[field9687];
                    if (var30 < 0 || var30 >= field9700[var29]) {
                        throw new RuntimeException();
                    }
                    field9689[var29][var30] = field9685[field9687 + 1];
                } else if (var43 == 47) {
                    String var31 = class25.field914[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field9682[field9693++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class25.field914[var32] = field9682[--field9693];
                    class441.method2658(var32, false);
                } else if (var43 == 51) {
                    class427 var33 = arg0.field5329[var4[var2]];
                    class149 var34 = (class149) var33.method2596((long) field9685[--field9687], 46);
                    if (var34 != null) {
                        var2 += var34.field2560;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field5323 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6132).append(" ");
                for (int var41 = field9676 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field9686[var41].field6245.field6132).append(" ");
                }
                var40.append("op: ").append(var5);
                class374.method2357(var40.toString(), 123, var42);
            } else {
                class108.method974(4, "Clientscript error in: " + arg0.field5323, 3867);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field5323).append("\n");
                for (int var38 = field9676 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field9686[var38].field6245.field5323).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class374.method2357(var37.toString(), 107, var42);
                class686.method3857(var37.toString(), 38);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
    private static final void method3839(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field9687 -= 3;
                int var2 = field9685[field9687];
                int var3 = field9685[field9687 + 1];
                int var4 = field9685[field9687 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class545 var5 = class415.method2533((byte) -55, var2);
                if (var5.field7641 == null) {
                    var5.field7641 = new class545[var4 + 1];
                }
                if (var5.field7641.length <= var4) {
                    class545[] var6 = new class545[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7641.length; var7++) {
                        var6[var7] = var5.field7641[var7];
                    }
                    var5.field7641 = var6;
                }
                if (var4 > 0 && var5.field7641[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class545 var8 = new class545();
                var8.field7649 = var3;
                var8.field7733 = var8.field7755 = var5.field7755;
                var8.field7697 = var4;
                var5.field7641[var4] = var8;
                if (arg1) {
                    field9679 = var8;
                } else {
                    field9684 = var8;
                }
                class531.method3088(var5, (byte) 104);
                return;
            }
            if (arg0 == 101) {
                class545 var9 = arg1 ? field9679 : field9684;
                if (var9.field7697 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class545 var10 = class415.method2533((byte) 82, var9.field7755);
                var10.field7641[var9.field7697] = null;
                class531.method3088(var10, (byte) 55);
                return;
            }
            if (arg0 == 102) {
                class545 var11 = class415.method2533((byte) 118, field9685[--field9687]);
                var11.field7641 = null;
                class531.method3088(var11, (byte) 19);
                return;
            }
            if (arg0 == 200) {
                field9687 -= 2;
                int var12 = field9685[field9687];
                int var13 = field9685[field9687 + 1];
                class545 var14 = class183.method1339(var12, (byte) 117, var13);
                if (var14 != null && var13 != -1) {
                    field9685[field9687++] = 1;
                    if (arg1) {
                        field9679 = var14;
                        return;
                    }
                    field9684 = var14;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9685[--field9687];
                class545 var16 = class415.method2533((byte) 73, var15);
                if (var16 != null) {
                    field9685[field9687++] = 1;
                    if (arg1) {
                        field9679 = var16;
                        return;
                    }
                    field9684 = var16;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9685[--field9687];
                method3840(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9685[--field9687];
                method3848(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9687 -= 2;
                int var19 = field9685[field9687];
                int var20 = field9685[field9687 + 1];
                for (int var21 = 0; var21 < class263.field3857.length; var21++) {
                    if (class263.field3857[var21] == var19) {
                        class532.field7456.field8621.method1278(var20, 80, class467.field6618, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class601.field8608.length; var22++) {
                    if (class601.field8608[var22] == var19) {
                        class532.field7456.field8621.method1278(var20, 96, class467.field6618, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9687 -= 2;
                int var23 = field9685[field9687];
                int var24 = field9685[field9687 + 1];
                class532.field7456.field8621.method1283((byte) -117, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9685[--field9687] != 0;
                class532.field7456.field8621.method1275(true, var25);
                return;
            }
            if (arg0 == 411) {
                field9687 -= 2;
                int var26 = field9685[field9687];
                int var27 = field9685[field9687 + 1];
                class532.field7456.field8621.method1280(14, class268.field3985, var26, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class545 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class415.method2533((byte) -114, field9685[--field9687]);
            } else {
                var28 = arg1 ? field9679 : field9684;
            }
            if (arg0 == 1000) {
                field9687 -= 4;
                var28.field7708 = field9685[field9687];
                var28.field7731 = field9685[field9687 + 1];
                int var29 = field9685[field9687 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9685[field9687 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field7725 = (byte) var29;
                var28.field7634 = (byte) var30;
                class531.method3088(var28, (byte) 28);
                class584.method3344(var28, -107);
                if (var28.field7697 == -1) {
                    class633.method3610(-119, var28.field7755);
                }
                return;
            }
            if (arg0 == 1001) {
                field9687 -= 4;
                var28.field7658 = field9685[field9687];
                var28.field7594 = field9685[field9687 + 1];
                var28.field7743 = 0;
                var28.field7625 = 0;
                int var31 = field9685[field9687 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9685[field9687 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field7671 = (byte) var31;
                var28.field7660 = (byte) var32;
                class531.method3088(var28, (byte) 125);
                class584.method3344(var28, 89);
                if (var28.field7649 == 0) {
                    class367.method2321(false, (byte) -41, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9685[--field9687] == 1;
                if (var28.field7690 != var33) {
                    var28.field7690 = var33;
                    class531.method3088(var28, (byte) 79);
                }
                if (var28.field7697 == -1) {
                    class15.method374(var28.field7755, 1);
                }
                return;
            }
            if (arg0 == 1004) {
                field9687 -= 2;
                var28.field7752 = field9685[field9687];
                var28.field7628 = field9685[field9687 + 1];
                class531.method3088(var28, (byte) 90);
                class584.method3344(var28, -79);
                if (var28.field7649 == 0) {
                    class367.method2321(false, (byte) -41, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field7601 = field9685[--field9687] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class545 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class415.method2533((byte) -118, field9685[--field9687]);
            } else {
                var34 = arg1 ? field9679 : field9684;
            }
            if (arg0 == 1100) {
                field9687 -= 2;
                var34.field7636 = field9685[field9687];
                if (var34.field7636 > var34.field7676 - var34.field7718) {
                    var34.field7636 = var34.field7676 - var34.field7718;
                }
                if (var34.field7636 < 0) {
                    var34.field7636 = 0;
                }
                var34.field7716 = field9685[field9687 + 1];
                if (var34.field7716 > var34.field7699 - var34.field7652) {
                    var34.field7716 = var34.field7699 - var34.field7652;
                }
                if (var34.field7716 < 0) {
                    var34.field7716 = 0;
                }
                class531.method3088(var34, (byte) 55);
                if (var34.field7697 == -1) {
                    class689.method3865(var34.field7755, (byte) -84);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field7608 = field9685[--field9687];
                class531.method3088(var34, (byte) 89);
                if (var34.field7697 == -1) {
                    class499.method2980(var34.field7755, (byte) -115);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field7614 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 20);
                return;
            }
            if (arg0 == 1103) {
                var34.field7683 = field9685[--field9687];
                class531.method3088(var34, (byte) 25);
                return;
            }
            if (arg0 == 1104) {
                var34.field7646 = field9685[--field9687];
                class531.method3088(var34, (byte) 34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9685[--field9687];
                if (var34.field7685 != var35) {
                    var34.field7685 = var35;
                    class531.method3088(var34, (byte) 32);
                }
                if (var34.field7697 == -1) {
                    class500.method2984(var34.field7755, -1);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field7734 = field9685[--field9687];
                class531.method3088(var34, (byte) 113);
                return;
            }
            if (arg0 == 1107) {
                var34.field7590 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 119);
                return;
            }
            if (arg0 == 1108) {
                var34.field7602 = 1;
                var34.field7742 = field9685[--field9687];
                class531.method3088(var34, (byte) 66);
                if (var34.field7697 == -1) {
                    class77.method816(var34.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1109) {
                field9687 -= 6;
                var34.field7595 = field9685[field9687];
                var34.field7754 = field9685[field9687 + 1];
                var34.field7737 = field9685[field9687 + 2];
                var34.field7635 = field9685[field9687 + 3];
                var34.field7756 = field9685[field9687 + 4];
                var34.field7688 = field9685[field9687 + 5];
                class531.method3088(var34, (byte) 99);
                if (var34.field7697 == -1) {
                    class328.method2108(var34.field7755, (byte) 15);
                    class676.method3805(-17, var34.field7755);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9685[--field9687];
                if (var34.field7698 != var36) {
                    var34.field7698 = var36;
                    var34.field7624 = 0;
                    var34.field7661 = 1;
                    var34.field7715 = 0;
                    class138 var37 = var34.field7698 == -1 ? null : class357.field5338.method2099(var34.field7698, true);
                    if (var37 != null) {
                        class130.method1098(var34.field7624, (byte) 88, var37);
                    }
                    class531.method3088(var34, (byte) 15);
                }
                if (var34.field7697 == -1) {
                    class301.method1985(0, var34.field7755);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field7630 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 16);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9682[--field9693];
                if (!var38.equals(var34.field7739)) {
                    var34.field7739 = var38;
                    class531.method3088(var34, (byte) 13);
                }
                if (var34.field7697 == -1) {
                    class76.method814(var34.field7755, 0);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field7669 = field9685[--field9687];
                class531.method3088(var34, (byte) 64);
                if (var34.field7697 == -1) {
                    class146.method1168((byte) -94, var34.field7755);
                }
                return;
            }
            if (arg0 == 1114) {
                field9687 -= 3;
                var34.field7617 = field9685[field9687];
                var34.field7668 = field9685[field9687 + 1];
                var34.field7600 = field9685[field9687 + 2];
                class531.method3088(var34, (byte) 23);
                return;
            }
            if (arg0 == 1115) {
                var34.field7633 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 68);
                return;
            }
            if (arg0 == 1116) {
                var34.field7696 = field9685[--field9687];
                class531.method3088(var34, (byte) 89);
                return;
            }
            if (arg0 == 1117) {
                var34.field7620 = field9685[--field9687];
                class531.method3088(var34, (byte) 127);
                return;
            }
            if (arg0 == 1118) {
                var34.field7667 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 119);
                return;
            }
            if (arg0 == 1119) {
                var34.field7719 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 116);
                return;
            }
            if (arg0 == 1120) {
                field9687 -= 2;
                var34.field7676 = field9685[field9687];
                var34.field7699 = field9685[field9687 + 1];
                class531.method3088(var34, (byte) 19);
                if (var34.field7649 == 0) {
                    class367.method2321(false, (byte) -41, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field7741 = field9685[--field9687] == 1;
                class531.method3088(var34, (byte) 60);
                return;
            }
            if (arg0 == 1123) {
                var34.field7688 = field9685[--field9687];
                class531.method3088(var34, (byte) 95);
                if (var34.field7697 == -1) {
                    class328.method2108(var34.field7755, (byte) 15);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9685[--field9687];
                var34.field7747 = var39 == 1;
                class531.method3088(var34, (byte) 112);
                return;
            }
            if (arg0 == 1125) {
                field9687 -= 2;
                var34.field7618 = field9685[field9687];
                var34.field7645 = field9685[field9687 + 1];
                class531.method3088(var34, (byte) 85);
                return;
            }
            if (arg0 == 1126) {
                var34.field7663 = field9685[--field9687];
                class531.method3088(var34, (byte) 16);
                return;
            }
            if (arg0 == 1127) {
                field9687 -= 2;
                int var40 = field9685[field9687];
                int var41 = field9685[field9687 + 1];
                class445 var42 = client.field4124.method980(42, var40);
                if (var42.field6413 != var41) {
                    var34.method3139(var41, true, var40);
                    return;
                }
                var34.method3140(9966, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9685[--field9687];
                String var44 = field9682[--field9693];
                class445 var45 = client.field4124.method980(119, var43);
                if (!var45.field6403.equals(var44)) {
                    var34.method3150(var43, var44, 16);
                    return;
                }
                var34.method3140(9966, var43);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class545 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class415.method2533((byte) 88, field9685[--field9687]);
            } else {
                var46 = arg1 ? field9679 : field9684;
            }
            class531.method3088(var46, (byte) 117);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9687 -= 2;
                int var47 = field9685[field9687];
                int var48 = field9685[field9687 + 1];
                if (var46.field7697 == -1) {
                    class246.method1665(31200, var46.field7755);
                    class328.method2108(var46.field7755, (byte) 15);
                    class676.method3805(-17, var46.field7755);
                }
                if (var47 == -1) {
                    var46.field7602 = 1;
                    var46.field7742 = -1;
                    var46.field7702 = -1;
                    return;
                }
                var46.field7702 = var47;
                var46.field7687 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field7619 = true;
                } else {
                    var46.field7619 = false;
                }
                class110 var49 = class268.field3985.method258(var47, (byte) -67);
                var46.field7737 = var49.field1995;
                var46.field7635 = var49.field1992;
                var46.field7756 = var49.field2001;
                var46.field7595 = var49.field1949;
                var46.field7754 = var49.field1983;
                var46.field7688 = var49.field1942;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field7638 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field7638 = 1;
                } else {
                    var46.field7638 = 2;
                }
                if (var46.field7743 > 0) {
                    var46.field7688 = var46.field7688 * 32 / var46.field7743;
                    return;
                }
                if (var46.field7658 > 0) {
                    var46.field7688 = var46.field7688 * 32 / var46.field7658;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field7602 = 2;
                var46.field7742 = field9685[--field9687];
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field7602 = 3;
                var46.field7742 = -1;
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field7602 = 6;
                var46.field7742 = field9685[--field9687];
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field7602 = 5;
                var46.field7742 = field9685[--field9687];
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1206) {
                field9687 -= 4;
                var46.field7758 = field9685[field9687];
                var46.field7744 = field9685[field9687 + 1];
                var46.field7689 = field9685[field9687 + 2];
                var46.field7692 = field9685[field9687 + 3];
                class531.method3088(var46, (byte) 100);
                return;
            }
            if (arg0 == 1207) {
                field9687 -= 2;
                var46.field7648 = field9685[field9687];
                var46.field7670 = field9685[field9687 + 1];
                class531.method3088(var46, (byte) 38);
                return;
            }
            if (arg0 == 1210) {
                field9687 -= 4;
                var46.field7742 = field9685[field9687];
                var46.field7677 = field9685[field9687 + 1];
                if (field9685[field9687 + 2] == 1) {
                    var46.field7602 = 9;
                } else {
                    var46.field7602 = 8;
                }
                if (field9685[field9687 + 3] == 1) {
                    var46.field7619 = true;
                } else {
                    var46.field7619 = false;
                }
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field7602 = 5;
                var46.field7742 = class422.field6096;
                var46.field7677 = 0;
                if (var46.field7697 == -1) {
                    class77.method816(var46.field7755, -11876);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class545 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class415.method2533((byte) -65, field9685[--field9687]);
            } else {
                var50 = arg1 ? field9679 : field9684;
            }
            if (arg0 == 1300) {
                int var51 = field9685[--field9687] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method3148(field9682[--field9693], var51, (byte) 96);
                    return;
                }
                field9693--;
                return;
            }
            if (arg0 == 1301) {
                field9687 -= 2;
                int var52 = field9685[field9687];
                int var53 = field9685[field9687 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field7757 = null;
                    return;
                }
                var50.field7757 = class183.method1339(var52, (byte) 77, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field9685[--field9687];
                if (class375.field5585 != var54 && class107.field1858 != var54 && class356.field5331 != var54) {
                    return;
                }
                var50.field7707 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field7612 = field9685[--field9687];
                return;
            }
            if (arg0 == 1304) {
                var50.field7598 = field9685[--field9687];
                return;
            }
            if (arg0 == 1305) {
                var50.field7613 = field9682[--field9693];
                return;
            }
            if (arg0 == 1306) {
                var50.field7711 = field9682[--field9693];
                return;
            }
            if (arg0 == 1307) {
                var50.field7606 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field7657 = field9685[--field9687];
                var50.field7738 = field9685[--field9687];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field9685[--field9687];
                int var56 = field9685[--field9687];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method3143(15479, var56 - 1, var55);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field7643 = field9682[--field9693];
                return;
            }
            if (arg0 == 1311) {
                var50.field7593 = field9685[--field9687];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field9687 -= 3;
                    var57 = field9685[field9687] - 1;
                    var58 = field9685[field9687 + 1];
                    var59 = field9685[field9687 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9687 -= 2;
                    var57 = 10;
                    var58 = field9685[field9687];
                    var59 = field9685[field9687 + 1];
                }
                if (var50.field7704 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field7704 = new byte[11];
                    var50.field7680 = new byte[11];
                    var50.field7740 = new int[11];
                }
                var50.field7704[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field7710 = false;
                    for (int var60 = 0; var60 < var50.field7704.length; var60++) {
                        if (var50.field7704[var60] != 0) {
                            var50.field7710 = true;
                            break;
                        }
                    }
                } else {
                    var50.field7710 = true;
                }
                var50.field7680[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field7693 = field9685[--field9687];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class545 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class415.method2533((byte) 106, field9685[--field9687]);
            } else {
                var61 = arg1 ? field9679 : field9684;
            }
            if (arg0 == 1499) {
                var61.method3141(false);
                return;
            }
            String var62 = field9682[--field9693];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field9685[--field9687];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field9685[--field9687];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field9682[--field9693];
                } else {
                    var65[var66] = Integer.valueOf(field9685[--field9687]);
                }
            }
            int var67 = field9685[--field9687];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field7714 = var65;
            } else if (arg0 == 1401) {
                var61.field7622 = var65;
            } else if (arg0 == 1402) {
                var61.field7640 = var65;
            } else if (arg0 == 1403) {
                var61.field7621 = var65;
            } else if (arg0 == 1404) {
                var61.field7701 = var65;
            } else if (arg0 == 1405) {
                var61.field7705 = var65;
            } else if (arg0 == 1406) {
                var61.field7605 = var65;
            } else if (arg0 == 1407) {
                var61.field7673 = var65;
                var61.field7717 = var63;
            } else if (arg0 == 1408) {
                var61.field7713 = var65;
            } else if (arg0 == 1409) {
                var61.field7736 = var65;
            } else if (arg0 == 1410) {
                var61.field7629 = var65;
            } else if (arg0 == 1411) {
                var61.field7720 = var65;
            } else if (arg0 == 1412) {
                var61.field7722 = var65;
            } else if (arg0 == 1414) {
                var61.field7616 = var65;
                var61.field7637 = var63;
            } else if (arg0 == 1415) {
                var61.field7694 = var65;
                var61.field7653 = var63;
            } else if (arg0 == 1416) {
                var61.field7672 = var65;
            } else if (arg0 == 1417) {
                var61.field7730 = var65;
            } else if (arg0 == 1418) {
                var61.field7700 = var65;
            } else if (arg0 == 1419) {
                var61.field7591 = var65;
            } else if (arg0 == 1420) {
                var61.field7746 = var65;
            } else if (arg0 == 1421) {
                var61.field7732 = var65;
            } else if (arg0 == 1422) {
                var61.field7597 = var65;
            } else if (arg0 == 1423) {
                var61.field7666 = var65;
            } else if (arg0 == 1424) {
                var61.field7686 = var65;
            } else if (arg0 == 1425) {
                var61.field7712 = var65;
            } else if (arg0 == 1426) {
                var61.field7678 = var65;
            } else if (arg0 == 1427) {
                var61.field7724 = var65;
            } else if (arg0 == 1428) {
                var61.field7748 = var65;
                var61.field7654 = var63;
            } else if (arg0 == 1429) {
                var61.field7603 = var65;
                var61.field7706 = var63;
            } else if (arg0 == 1430) {
                var61.field7695 = var65;
            }
            var61.field7607 = true;
            return;
        } else if (arg0 < 1600) {
            class545 var68 = arg1 ? field9679 : field9684;
            if (arg0 == 1500) {
                field9685[field9687++] = var68.field7751;
                return;
            }
            if (arg0 == 1501) {
                field9685[field9687++] = var68.field7592;
                return;
            }
            if (arg0 == 1502) {
                field9685[field9687++] = var68.field7718;
                return;
            }
            if (arg0 == 1503) {
                field9685[field9687++] = var68.field7652;
                return;
            }
            if (arg0 == 1504) {
                field9685[field9687++] = var68.field7690 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field9685[field9687++] = var68.field7733;
                return;
            }
            if (arg0 == 1506) {
                class545 var69 = class82.method837(-123, var68);
                field9685[field9687++] = var69 == null ? -1 : var69.field7755;
                return;
            }
        } else if (arg0 < 1700) {
            class545 var70 = arg1 ? field9679 : field9684;
            if (arg0 == 1600) {
                field9685[field9687++] = var70.field7636;
                return;
            }
            if (arg0 == 1601) {
                field9685[field9687++] = var70.field7716;
                return;
            }
            if (arg0 == 1602) {
                field9682[field9693++] = var70.field7739;
                return;
            }
            if (arg0 == 1603) {
                field9685[field9687++] = var70.field7676;
                return;
            }
            if (arg0 == 1604) {
                field9685[field9687++] = var70.field7699;
                return;
            }
            if (arg0 == 1605) {
                field9685[field9687++] = var70.field7688;
                return;
            }
            if (arg0 == 1606) {
                field9685[field9687++] = var70.field7737;
                return;
            }
            if (arg0 == 1607) {
                field9685[field9687++] = var70.field7756;
                return;
            }
            if (arg0 == 1608) {
                field9685[field9687++] = var70.field7635;
                return;
            }
            if (arg0 == 1609) {
                field9685[field9687++] = var70.field7683;
                return;
            }
            if (arg0 == 1610) {
                field9685[field9687++] = var70.field7595;
                return;
            }
            if (arg0 == 1611) {
                field9685[field9687++] = var70.field7754;
                return;
            }
            if (arg0 == 1612) {
                field9685[field9687++] = var70.field7685;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field9685[--field9687];
                class445 var72 = client.field4124.method980(-75, var71);
                if (var72.method2677(102)) {
                    field9682[field9693++] = var70.method3151(var71, var72.field6403, 119);
                    return;
                }
                field9685[field9687++] = var70.method3137(true, var72.field6413, var71);
                return;
            }
            if (arg0 == 1614) {
                field9685[field9687++] = var70.field7734;
                return;
            }
        } else if (arg0 < 1800) {
            class545 var73 = arg1 ? field9679 : field9684;
            if (arg0 == 1700) {
                field9685[field9687++] = var73.field7702;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field7702 != -1) {
                    field9685[field9687++] = var73.field7687;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field9685[field9687++] = var73.field7697;
                return;
            }
        } else if (arg0 < 1900) {
            class545 var74 = arg1 ? field9679 : field9684;
            if (arg0 == 1800) {
                field9685[field9687++] = client.method1825(var74).method3528((byte) 2);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field9685[--field9687];
                int var352 = var75 - 1;
                if (var74.field7606 != null && var352 < var74.field7606.length && var74.field7606[var352] != null) {
                    field9682[field9693++] = var74.field7606[var352];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field7613 == null) {
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = var74.field7613;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class545 var350;
            if (arg0 >= 2000) {
                var350 = class415.method2533((byte) 92, field9685[--field9687]);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field9679 : field9684;
            }
            if (field9704 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field7724 == null) {
                    return;
                }
                class476 var351 = new class476();
                var351.field6850 = var350;
                var351.field6842 = var350.field7724;
                var351.field6841 = field9704 + 1;
                class610.field8886.method1229(var351, (byte) 120);
                return;
            }
        } else if (arg0 < 2600) {
            class545 var76 = class415.method2533((byte) 78, field9685[--field9687]);
            if (arg0 == 2500) {
                field9685[field9687++] = var76.field7751;
                return;
            }
            if (arg0 == 2501) {
                field9685[field9687++] = var76.field7592;
                return;
            }
            if (arg0 == 2502) {
                field9685[field9687++] = var76.field7718;
                return;
            }
            if (arg0 == 2503) {
                field9685[field9687++] = var76.field7652;
                return;
            }
            if (arg0 == 2504) {
                field9685[field9687++] = var76.field7690 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field9685[field9687++] = var76.field7733;
                return;
            }
            if (arg0 == 1506) {
                class545 var77 = class82.method837(-114, var76);
                field9685[field9687++] = var77 == null ? -1 : var77.field7755;
                return;
            }
        } else if (arg0 < 2700) {
            class545 var78 = class415.method2533((byte) -116, field9685[--field9687]);
            if (arg0 == 2600) {
                field9685[field9687++] = var78.field7636;
                return;
            }
            if (arg0 == 2601) {
                field9685[field9687++] = var78.field7716;
                return;
            }
            if (arg0 == 2602) {
                field9682[field9693++] = var78.field7739;
                return;
            }
            if (arg0 == 2603) {
                field9685[field9687++] = var78.field7676;
                return;
            }
            if (arg0 == 2604) {
                field9685[field9687++] = var78.field7699;
                return;
            }
            if (arg0 == 2605) {
                field9685[field9687++] = var78.field7688;
                return;
            }
            if (arg0 == 2606) {
                field9685[field9687++] = var78.field7737;
                return;
            }
            if (arg0 == 2607) {
                field9685[field9687++] = var78.field7756;
                return;
            }
            if (arg0 == 2608) {
                field9685[field9687++] = var78.field7635;
                return;
            }
            if (arg0 == 2609) {
                field9685[field9687++] = var78.field7683;
                return;
            }
            if (arg0 == 2610) {
                field9685[field9687++] = var78.field7595;
                return;
            }
            if (arg0 == 2611) {
                field9685[field9687++] = var78.field7754;
                return;
            }
            if (arg0 == 2612) {
                field9685[field9687++] = var78.field7685;
                return;
            }
            if (arg0 == 2613) {
                field9685[field9687++] = var78.field7734;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class545 var79 = class415.method2533((byte) -83, field9685[--field9687]);
                field9685[field9687++] = var79.field7702;
                return;
            }
            if (arg0 == 2701) {
                class545 var80 = class415.method2533((byte) -79, field9685[--field9687]);
                if (var80.field7702 != -1) {
                    field9685[field9687++] = var80.field7687;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field9685[--field9687];
                class601 var82 = (class601) class78.field1572.method2596((long) var81, 65);
                if (var82 != null) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class545 var83 = class415.method2533((byte) -118, field9685[--field9687]);
                if (var83.field7641 == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                int var84 = var83.field7641.length;
                for (int var85 = 0; var85 < var83.field7641.length; var85++) {
                    if (var83.field7641[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field9685[field9687++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field9687 -= 2;
                int var86 = field9685[field9687];
                int var87 = field9685[field9687 + 1];
                class601 var88 = (class601) class78.field1572.method2596((long) var86, 101);
                if (var88 != null && var88.field8614 == var87) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class545 var89 = class415.method2533((byte) -66, field9685[--field9687]);
            if (arg0 == 2800) {
                field9685[field9687++] = client.method1825(var89).method3528((byte) 2);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field9685[--field9687];
                int var353 = var90 - 1;
                if (var89.field7606 != null && var353 < var89.field7606.length && var89.field7606[var353] != null) {
                    field9682[field9693++] = var89.field7606[var353];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field7613 == null) {
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = var89.field7613;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field9682[--field9693];
                class477.method2902(var91, (byte) -78);
                return;
            }
            if (arg0 == 3101) {
                field9687 -= 2;
                class624.method3557(field9685[field9687], class532.field7456, field9685[field9687 + 1], true);
                return;
            }
            if (arg0 == 3103) {
                class543.method3129(true, 8594);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field9682[--field9693];
                int var93 = 0;
                if (class323.method2083(var92, 24369)) {
                    var93 = class108.method975(var92, -10426);
                }
                field9696++;
                class275 var94 = class185.method1355(0, class232.field3480, class395.field5772);
                var94.field4103.method715(var93, 1949991176);
                class140.method1141(var94, 19321);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field9682[--field9693];
                field9697++;
                class275 var96 = class185.method1355(0, class117.field2068, class395.field5772);
                var96.field4103.method693((byte) 106, var95.length() + 1);
                var96.field4103.method750(114, var95);
                class140.method1141(var96, 19321);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field9682[--field9693];
                field9691++;
                class275 var98 = class185.method1355(0, class413.field5989, class395.field5772);
                var98.field4103.method693((byte) 106, var97.length() + 1);
                var98.field4103.method750(120, var97);
                class140.method1141(var98, 19321);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field9685[--field9687];
                String var100 = field9682[--field9693];
                class625.method3561(var99, (byte) 105, var100);
                return;
            }
            if (arg0 == 3108) {
                field9687 -= 3;
                int var101 = field9685[field9687];
                int var102 = field9685[field9687 + 1];
                int var103 = field9685[field9687 + 2];
                class545 var104 = class415.method2533((byte) 101, var103);
                class679.method3820((byte) 113, var102, var104, var101);
                return;
            }
            if (arg0 == 3109) {
                field9687 -= 2;
                int var105 = field9685[field9687];
                int var106 = field9685[field9687 + 1];
                class545 var107 = arg1 ? field9679 : field9684;
                class679.method3820((byte) 123, var106, var107, var105);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field9685[--field9687];
                field9692++;
                class275 var109 = class185.method1355(0, class470.field6652, class395.field5772);
                var109.field4103.method745(var108, 128);
                class140.method1141(var109, 19321);
                return;
            }
            if (arg0 == 3111) {
                field9687 -= 2;
                int var110 = field9685[field9687];
                int var111 = field9685[field9687 + 1];
                class601 var112 = (class601) class78.field1572.method2596((long) var110, 86);
                if (var112 != null) {
                    class101.method937((byte) -71, true, var112.field8614 != var111, var112);
                }
                class605.method3481(3, -1, var110, true, var111);
                return;
            }
            if (arg0 == 3112) {
                field9687--;
                int var113 = field9685[field9687];
                class601 var114 = (class601) class78.field1572.method2596((long) var113, 96);
                if (var114 != null && var114.field8611 == 3) {
                    class101.method937((byte) -71, true, true, var114);
                }
                return;
            }
            if (arg0 == 3113) {
                class308.method2015(field9682[--field9693], -25);
                return;
            }
            if (arg0 == 3114) {
                field9687 -= 2;
                int var115 = field9685[field9687];
                int var116 = field9685[field9687 + 1];
                String var117 = field9682[--field9693];
                class428.method2605("", "", "", var115, var116, 4096, var117);
                return;
            }
            if (arg0 == 3115) {
                field9687 -= 11;
                class320[] var118 = class653.method3723(false);
                class547[] var119 = class641.method3657((byte) -122);
                class54.method638(field9685[field9687 + 9], field9685[field9687 + 5], field9685[field9687 + 2], field9685[field9687 + 6], field9685[field9687 + 3], field9685[field9687 + 10], field9685[field9687 + 7], var118[field9685[field9687]], field9685[field9687 + 8], field9685[field9687 + 4], var119[field9685[field9687 + 1]], 3500);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field9687 -= 3;
                class56.method651(255, -7529, field9685[field9687 + 2], field9685[field9687 + 1], field9685[field9687]);
                return;
            }
            if (arg0 == 3201) {
                class108.method973(255, true, 50, field9685[--field9687]);
                return;
            }
            if (arg0 == 3202) {
                field9687 -= 2;
                class112.method1009((byte) -83, 255, field9685[field9687], field9685[field9687 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field9687 -= 4;
                class56.method651(field9685[field9687 + 3], -7529, field9685[field9687 + 2], field9685[field9687 + 1], field9685[field9687]);
                return;
            }
            if (arg0 == 3204) {
                field9687 -= 3;
                class108.method973(field9685[field9687 + 1], true, field9685[field9687 + 2], field9685[field9687]);
                return;
            }
            if (arg0 == 3205) {
                field9687 -= 3;
                class112.method1009((byte) 8, field9685[field9687 + 2], field9685[field9687], field9685[field9687 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field9687 -= 4;
                class500.method2982(field9685[field9687 + 3], 0, field9685[field9687 + 2], false, field9685[field9687 + 1], field9685[field9687]);
                return;
            }
            if (arg0 == 3207) {
                field9687 -= 4;
                class500.method2982(field9685[field9687 + 3], 0, field9685[field9687 + 2], true, field9685[field9687 + 1], field9685[field9687]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field9685[field9687++] = class336.field5031;
                return;
            }
            if (arg0 == 3301) {
                field9687 -= 2;
                int var120 = field9685[field9687];
                int var121 = field9685[field9687 + 1];
                field9685[field9687++] = class140.method1142(var121, (byte) 102, false, var120);
                return;
            }
            if (arg0 == 3302) {
                field9687 -= 2;
                int var122 = field9685[field9687];
                int var123 = field9685[field9687 + 1];
                field9685[field9687++] = class253.method1688(false, (byte) -109, var122, var123);
                return;
            }
            if (arg0 == 3303) {
                field9687 -= 2;
                int var124 = field9685[field9687];
                int var125 = field9685[field9687 + 1];
                field9685[field9687++] = class91.method881(var124, 120, var125, false);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field9685[--field9687];
                field9685[field9687++] = class96.field1715.method833(var126, (byte) -107).field3147;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field9685[--field9687];
                field9685[field9687++] = class57.field1327[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field9685[--field9687];
                field9685[field9687++] = class157.field2686[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field9685[--field9687];
                field9685[field9687++] = class519.field7342[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class532.field7456.field9814;
                int var131 = (class532.field7456.field9806 >> 9) + class33.field967;
                int var132 = (class532.field7456.field9815 >> 9) + class323.field4749;
                field9685[field9687++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field9685[--field9687];
                field9685[field9687++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field9685[--field9687];
                field9685[field9687++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field9685[--field9687];
                field9685[field9687++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field9685[field9687++] = class294.field4411 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field9687 -= 2;
                int var136 = field9685[field9687];
                int var137 = field9685[field9687 + 1];
                field9685[field9687++] = class140.method1142(var137, (byte) 17, true, var136);
                return;
            }
            if (arg0 == 3314) {
                field9687 -= 2;
                int var138 = field9685[field9687];
                int var139 = field9685[field9687 + 1];
                field9685[field9687++] = class253.method1688(true, (byte) -109, var138, var139);
                return;
            }
            if (arg0 == 3315) {
                field9687 -= 2;
                int var140 = field9685[field9687];
                int var141 = field9685[field9687 + 1];
                field9685[field9687++] = class91.method881(var140, -98, var141, true);
                return;
            }
            if (arg0 == 3316) {
                if (class249.field3737 >= 2) {
                    field9685[field9687++] = class249.field3737;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field9685[field9687++] = class482.field6915;
                return;
            }
            if (arg0 == 3318) {
                field9685[field9687++] = class394.field5757.field4419;
                return;
            }
            if (arg0 == 3321) {
                field9685[field9687++] = class418.field6034;
                return;
            }
            if (arg0 == 3322) {
                field9685[field9687++] = class469.field6631;
                return;
            }
            if (arg0 == 3323) {
                if (class460.field6564 >= 5 && class460.field6564 <= 9) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class460.field6564 >= 5 && class460.field6564 <= 9) {
                    field9685[field9687++] = class460.field6564;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field9685[field9687++] = class35.field1012 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field9685[field9687++] = class532.field7456.field8661;
                return;
            }
            if (arg0 == 3327) {
                field9685[field9687++] = class532.field7456.field8621.field2793 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field9685[field9687++] = class436.field6299 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field9685[--field9687];
                field9685[field9687++] = class300.method1978(false, var142, 0);
                return;
            }
            if (arg0 == 3331) {
                field9687 -= 2;
                int var143 = field9685[field9687];
                int var144 = field9685[field9687 + 1];
                field9685[field9687++] = class431.method2622(false, false, var143, -13867, var144);
                return;
            }
            if (arg0 == 3332) {
                field9687 -= 2;
                int var145 = field9685[field9687];
                int var146 = field9685[field9687 + 1];
                field9685[field9687++] = class431.method2622(false, true, var145, -13867, var146);
                return;
            }
            if (arg0 == 3333) {
                field9685[field9687++] = class163.field2735;
                return;
            }
            if (arg0 == 3335) {
                field9685[field9687++] = class140.field2466;
                return;
            }
            if (arg0 == 3336) {
                field9687 -= 4;
                int var147 = field9685[field9687];
                int var148 = field9685[field9687 + 1];
                int var149 = field9685[field9687 + 2];
                int var150 = field9685[field9687 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field9685[field9687++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field9685[field9687++] = class292.field4385;
                return;
            }
            if (arg0 == 3338) {
                field9685[field9687++] = class194.method1399((byte) -118);
                return;
            }
            if (arg0 == 3339) {
                field9685[field9687++] = class602.field8619 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field9685[field9687++] = class533.field7479 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field9685[field9687++] = class641.field9232 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field9685[field9687++] = class410.field5945.method1931(-23081);
                return;
            }
            if (arg0 == 3343) {
                field9685[field9687++] = class410.field5945.method1936(127);
                return;
            }
            if (arg0 == 3344) {
                field9682[field9693++] = class16.method384((byte) 96);
                return;
            }
            if (arg0 == 3345) {
                field9682[field9693++] = class693.method3882(false);
                return;
            }
            if (arg0 == 3346) {
                field9685[field9687++] = class315.method2039(false);
                return;
            }
            if (arg0 == 3347) {
                field9685[field9687++] = class679.field9638;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field9687 -= 2;
                int var154 = field9685[field9687];
                int var155 = field9685[field9687 + 1];
                class285 var156 = class404.field5837.method3103(var154, 0);
                field9682[field9693++] = var156.method1887((byte) 65, var155);
                return;
            }
            if (arg0 == 3408) {
                field9687 -= 4;
                int var157 = field9685[field9687];
                int var158 = field9685[field9687 + 1];
                int var159 = field9685[field9687 + 2];
                int var160 = field9685[field9687 + 3];
                class285 var161 = class404.field5837.method3103(var159, 0);
                if (var161.field4249 == var157 && var161.field4259 == var158) {
                    if (var158 == 115) {
                        field9682[field9693++] = var161.method1887((byte) 56, var160);
                        return;
                    }
                    field9685[field9687++] = var161.method1892(109, var160);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field9687 -= 3;
                int var162 = field9685[field9687];
                int var163 = field9685[field9687 + 1];
                int var164 = field9685[field9687 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class285 var165 = class404.field5837.method3103(var163, 0);
                if (var165.field4259 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field9685[field9687++] = var165.method1890(var164, (byte) -111) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field9685[--field9687];
                String var167 = field9682[--field9693];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class285 var168 = class404.field5837.method3103(var166, 0);
                if (var168.field4259 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field9685[field9687++] = var168.method1888(var167, (byte) 78) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field9685[--field9687];
                class285 var170 = class404.field5837.method3103(var169, 0);
                field9685[field9687++] = var170.field4245.method2603(-126);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class694.field9773 == 0) {
                    field9685[field9687++] = -2;
                    return;
                }
                if (class694.field9773 == 1) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = class164.field2749;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field9685[--field9687];
                if (class694.field9773 == 2 && var171 < class164.field2749) {
                    field9682[field9693++] = class343.field5109[var171];
                    if (class673.field9579[var171] != null) {
                        field9682[field9693++] = class673.field9579[var171];
                        return;
                    }
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = "";
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field9685[--field9687];
                if (class694.field9773 == 2 && var172 < class164.field2749) {
                    field9685[field9687++] = class706.field9939[var172];
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field9685[--field9687];
                if (class694.field9773 == 2 && var173 < class164.field2749) {
                    field9685[field9687++] = class305.field4519[var173];
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field9682[--field9693];
                int var175 = field9685[--field9687];
                class364.method2312(var174, (byte) 125, var175);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field9682[--field9693];
                class30.method498(var176, (byte) 102);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field9682[--field9693];
                class272.method1776(var177, 1);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field9682[--field9693];
                class542.method3126(false, 0, var178);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field9682[--field9693];
                class560.method3186(false, var179);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field9682[--field9693];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field9685[field9687++] = class660.method3755(var180, false) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field9685[--field9687];
                if (class694.field9773 == 2 && var181 < class164.field2749) {
                    field9682[field9693++] = class275.field4105[var181];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class335.field5017 != null) {
                    field9682[field9693++] = class157.method1218(class335.field5017, (byte) -69);
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class335.field5017 != null) {
                    field9685[field9687++] = class394.field5756;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field9685[--field9687];
                if (class335.field5017 != null && var182 < class394.field5756) {
                    field9682[field9693++] = class396.field5780[var182].field7096;
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field9685[--field9687];
                if (class335.field5017 != null && var183 < class394.field5756) {
                    field9685[field9687++] = class396.field5780[var183].field7097;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field9685[--field9687];
                if (class335.field5017 != null && var184 < class394.field5756) {
                    field9685[field9687++] = class396.field5780[var184].field7091;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field9685[field9687++] = class611.field8894;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field9682[--field9693];
                class635.method3620(var185, 1);
                return;
            }
            if (arg0 == 3618) {
                field9685[field9687++] = class248.field3730;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field9682[--field9693];
                class413.method2518(var186, 1);
                return;
            }
            if (arg0 == 3620) {
                class121.method1053((byte) -126);
                return;
            }
            if (arg0 == 3621) {
                if (class694.field9773 == 0) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = class296.field4436;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field9685[--field9687];
                if (class694.field9773 != 0 && var187 < class296.field4436) {
                    field9682[field9693++] = class518.field7306[var187];
                    if (class291.field4370[var187] != null) {
                        field9682[field9693++] = class291.field4370[var187];
                        return;
                    }
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = "";
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field9682[--field9693];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field9685[field9687++] = class350.method2268(var188, true) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field9685[--field9687];
                if (class396.field5780 != null && var189 < class394.field5756 && class396.field5780[var189].field7088.equalsIgnoreCase(class532.field7456.field8631)) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class150.field2577 != null) {
                    field9682[field9693++] = class150.field2577;
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field9685[--field9687];
                if (class335.field5017 != null && var190 < class394.field5756) {
                    field9682[field9693++] = class396.field5780[var190].field7100;
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field9685[--field9687];
                if (class694.field9773 == 2 && var191 >= 0 && var191 < class164.field2749) {
                    field9685[field9687++] = class44.field1098[var191] ? 1 : 0;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field9682[--field9693];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field9685[field9687++] = class535.method3096(var192, -17804);
                return;
            }
            if (arg0 == 3629) {
                field9685[field9687++] = class633.field9104;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field9682[--field9693];
                class542.method3126(true, 0, var193);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field9685[--field9687];
                field9685[field9687++] = class234.field3488[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field9685[--field9687];
                if (class335.field5017 != null && var195 < class394.field5756) {
                    field9682[field9693++] = class396.field5780[var195].field7088;
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field9685[--field9687];
                if (class694.field9773 != 0 && var196 < class296.field4436) {
                    field9682[field9693++] = class38.field1057[var196];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var197].method2967(-8032);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var198].field7086;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var199].field7081;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var200].field7080;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var201].field7087;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field9685[--field9687];
                field9685[field9687++] = class105.field1846[var202].field7077;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field9685[--field9687];
                int var204 = class105.field1846[var203].method2968(false);
                field9685[field9687++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field9685[--field9687];
                int var206 = class105.field1846[var205].method2968(false);
                field9685[field9687++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field9685[--field9687];
                int var208 = class105.field1846[var207].method2968(false);
                field9685[field9687++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field9685[--field9687];
                int var210 = class105.field1846[var209].method2968(false);
                field9685[field9687++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field9687 -= 2;
                int var211 = field9685[field9687];
                int var212 = field9685[field9687 + 1];
                field9685[field9687++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field9687 -= 2;
                int var213 = field9685[field9687];
                int var214 = field9685[field9687 + 1];
                field9685[field9687++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field9687 -= 2;
                int var215 = field9685[field9687];
                int var216 = field9685[field9687 + 1];
                field9685[field9687++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field9687 -= 2;
                int var217 = field9685[field9687];
                int var218 = field9685[field9687 + 1];
                field9685[field9687++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field9685[--field9687];
                field9685[field9687++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field9685[--field9687];
                field9685[field9687++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field9687 -= 5;
                int var221 = field9685[field9687];
                int var222 = field9685[field9687 + 1];
                int var223 = field9685[field9687 + 2];
                int var224 = field9685[field9687 + 3];
                int var225 = field9685[field9687 + 4];
                field9685[field9687++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field9687 -= 2;
                long var226 = (long) field9685[field9687];
                long var228 = (long) field9685[field9687 + 1];
                field9685[field9687++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field9687 -= 2;
                int var230 = field9685[field9687];
                int var231 = field9685[field9687 + 1];
                field9685[field9687++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field9687 -= 2;
                int var232 = field9685[field9687];
                int var233 = field9685[field9687 + 1];
                field9685[field9687++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field9687 -= 2;
                int var234 = field9685[field9687];
                int var235 = field9685[field9687 + 1];
                field9685[field9687++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field9687 -= 2;
                int var236 = field9685[field9687];
                int var237 = field9685[field9687 + 1];
                field9685[field9687++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field9687 -= 2;
                int var238 = field9685[field9687];
                int var239 = field9685[field9687 + 1];
                if (var238 == 0) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field9687 -= 2;
                int var240 = field9685[field9687];
                int var241 = field9685[field9687 + 1];
                if (var240 == 0) {
                    field9685[field9687++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field9685[field9687++] = Integer.MAX_VALUE;
                    return;
                }
                field9685[field9687++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field9687 -= 2;
                int var242 = field9685[field9687];
                int var243 = field9685[field9687 + 1];
                field9685[field9687++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field9687 -= 2;
                int var244 = field9685[field9687];
                int var245 = field9685[field9687 + 1];
                field9685[field9687++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field9687 -= 2;
                int var246 = field9685[field9687];
                int var247 = field9685[field9687 + 1];
                field9685[field9687++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field9687 -= 2;
                int var248 = field9685[field9687];
                int var249 = field9685[field9687 + 1];
                field9685[field9687++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field9687 -= 3;
                long var250 = (long) field9685[field9687];
                long var252 = (long) field9685[field9687 + 1];
                long var254 = (long) field9685[field9687 + 2];
                field9685[field9687++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field9682[--field9693];
                int var257 = field9685[--field9687];
                field9682[field9693++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field9693 -= 2;
                String var258 = field9682[field9693];
                String var259 = field9682[field9693 + 1];
                field9682[field9693++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field9682[--field9693];
                int var261 = field9685[--field9687];
                field9682[field9693++] = var260 + class62.method754(var261, -2, true);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field9682[--field9693];
                field9682[field9693++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field9682[field9693++] = method3849(field9685[--field9687]);
                return;
            }
            if (arg0 == 4105) {
                field9693 -= 2;
                String var263 = field9682[field9693];
                String var264 = field9682[field9693 + 1];
                if (class532.field7456.field8621 != null && class532.field7456.field8621.field2793) {
                    field9682[field9693++] = var264;
                    return;
                }
                field9682[field9693++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field9685[--field9687];
                field9682[field9693++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field9693 -= 2;
                field9685[field9687++] = class703.method3932(field9682[field9693 + 1], class140.field2466, field9682[field9693], 10565);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field9682[--field9693];
                field9687 -= 2;
                int var267 = field9685[field9687];
                int var268 = field9685[field9687 + 1];
                class11 var269 = class620.method3545(0, var268, class95.field1708, (byte) -96);
                field9685[field9687++] = var269.method294(var267, var266, class381.field5638, -91);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field9682[--field9693];
                field9687 -= 2;
                int var271 = field9685[field9687];
                int var272 = field9685[field9687 + 1];
                class11 var273 = class620.method3545(0, var272, class95.field1708, (byte) -108);
                field9685[field9687++] = var273.method285(var270, class381.field5638, 20034, var271);
                return;
            }
            if (arg0 == 4110) {
                field9693 -= 2;
                String var274 = field9682[field9693];
                String var275 = field9682[field9693 + 1];
                if (field9685[--field9687] == 1) {
                    field9682[field9693++] = var274;
                    return;
                }
                field9682[field9693++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field9682[--field9693];
                field9682[field9693++] = class11.method289(var276, (byte) -14);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field9682[--field9693];
                int var278 = field9685[--field9687];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field9682[field9693++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field9685[--field9687];
                field9685[field9687++] = class672.method3790(-27929, (char) var279) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field9685[--field9687];
                field9685[field9687++] = class90.method879((char) var280, (byte) 30) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field9685[--field9687];
                field9685[field9687++] = class539.method3114((char) var281, false) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field9685[--field9687];
                field9685[field9687++] = class228.method1557((char) var282, (byte) 110) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field9682[--field9693];
                if (var283 != null) {
                    field9685[field9687++] = var283.length();
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field9682[--field9693];
                field9687 -= 2;
                int var285 = field9685[field9687];
                int var286 = field9685[field9687 + 1];
                field9682[field9693++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field9682[--field9693];
                StringBuffer var288 = new StringBuffer(var287.length());
                boolean var289 = false;
                for (int var290 = 0; var290 < var287.length(); var290++) {
                    char var291 = var287.charAt(var290);
                    if (var291 == '<') {
                        var289 = true;
                    } else if (var291 == '>') {
                        var289 = false;
                    } else if (!var289) {
                        var288.append(var291);
                    }
                }
                field9682[field9693++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field9682[--field9693];
                field9687 -= 2;
                int var293 = field9685[field9687];
                int var294 = field9685[field9687 + 1];
                field9685[field9687++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field9693 -= 2;
                String var295 = field9682[field9693];
                String var296 = field9682[field9693 + 1];
                int var297 = field9685[--field9687];
                field9685[field9687++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field9685[--field9687];
                field9685[field9687++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field9685[--field9687];
                field9685[field9687++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field9685[--field9687] != 0;
                int var301 = field9685[--field9687];
                field9682[field9693++] = class434.method2636(var300, 0, (byte) -32, (long) var301, class140.field2466);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field9682[--field9693];
                int var303 = field9685[--field9687];
                class11 var304 = class620.method3545(0, var303, class95.field1708, (byte) -95);
                field9685[field9687++] = var304.method295(var302, (byte) -101, class381.field5638);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field9685[--field9687];
                field9682[field9693++] = class268.field3985.method258(var305, (byte) -67).field1954;
                return;
            }
            if (arg0 == 4201) {
                field9687 -= 2;
                int var306 = field9685[field9687];
                int var307 = field9685[field9687 + 1];
                class110 var308 = class268.field3985.method258(var306, (byte) -67);
                if (var307 >= 1 && var307 <= 5 && var308.field1959[var307 - 1] != null) {
                    field9682[field9693++] = var308.field1959[var307 - 1];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 4202) {
                field9687 -= 2;
                int var309 = field9685[field9687];
                int var310 = field9685[field9687 + 1];
                class110 var311 = class268.field3985.method258(var309, (byte) -67);
                if (var310 >= 1 && var310 <= 5 && var311.field1936[var310 - 1] != null) {
                    field9682[field9693++] = var311.field1936[var310 - 1];
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field9685[--field9687];
                field9685[field9687++] = class268.field3985.method258(var312, (byte) -67).field1985;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field9685[--field9687];
                field9685[field9687++] = class268.field3985.method258(var313, (byte) -67).field1934 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field9685[--field9687];
                class110 var315 = class268.field3985.method258(var314, (byte) -67);
                if (var315.field1988 == -1 && var315.field1951 >= 0) {
                    field9685[field9687++] = var315.field1951;
                    return;
                }
                field9685[field9687++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field9685[--field9687];
                class110 var317 = class268.field3985.method258(var316, (byte) -67);
                if (var317.field1988 >= 0 && var317.field1951 >= 0) {
                    field9685[field9687++] = var317.field1951;
                    return;
                }
                field9685[field9687++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field9685[--field9687];
                field9685[field9687++] = class268.field3985.method258(var318, (byte) -67).field1931 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field9687 -= 2;
                int var319 = field9685[field9687];
                int var320 = field9685[field9687 + 1];
                class445 var321 = client.field4124.method980(-107, var320);
                if (var321.method2677(113)) {
                    field9682[field9693++] = class268.field3985.method258(var319, (byte) -67).method991(var321.field6403, var320, -8123);
                    return;
                }
                field9685[field9687++] = class268.field3985.method258(var319, (byte) -67).method986(false, var321.field6413, var320);
                return;
            }
            if (arg0 == 4209) {
                field9687 -= 2;
                int var322 = field9685[field9687];
                int var323 = field9685[field9687 + 1] - 1;
                class110 var324 = class268.field3985.method258(var322, (byte) -67);
                if (var324.field1930 == var323) {
                    field9685[field9687++] = var324.field1972;
                    return;
                }
                if (var324.field1965 == var323) {
                    field9685[field9687++] = var324.field2000;
                    return;
                }
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field9682[--field9693];
                int var326 = field9685[--field9687];
                class604.method3457(var326 == 1, -8193, var325);
                field9685[field9687++] = class364.field5398;
                return;
            }
            if (arg0 == 4211) {
                if (class104.field1843 != null && class479.field6880 < class364.field5398) {
                    field9685[field9687++] = class104.field1843[class479.field6880++] & 0xFFFF;
                    return;
                }
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class479.field6880 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field9685[--field9687];
                field9685[field9687++] = class268.field3985.method258(var327, (byte) -67).field1937;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field9682[--field9693];
                field9687 -= 3;
                int var329 = field9685[field9687];
                int var330 = field9685[field9687 + 1];
                int var331 = field9685[field9687 + 2];
                class157.method1214(-1, var328, var331, var329 == 1, var330);
                field9685[field9687++] = class364.field5398;
                return;
            }
            if (arg0 == 4215) {
                field9693 -= 2;
                field9687 -= 2;
                String var332 = field9682[field9693];
                int var333 = field9685[field9687];
                int var334 = field9685[field9687 + 1];
                String var335 = field9682[field9693 + 1];
                class394.method2430(var335, (byte) 108, var333 == 1, var332, var334);
                field9685[field9687++] = class364.field5398;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field9687 -= 2;
                int var336 = field9685[field9687];
                int var337 = field9685[field9687 + 1];
                class445 var338 = client.field4124.method980(-94, var337);
                if (var338.method2677(110)) {
                    field9682[field9693++] = class317.field4681.method806(var336, 1).method2148(-136, var337, var338.field6403);
                    return;
                }
                field9685[field9687++] = class317.field4681.method806(var336, 1).method2155(var337, var338.field6413, 89);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field9687 -= 2;
                int var339 = field9685[field9687];
                int var340 = field9685[field9687 + 1];
                class445 var341 = client.field4124.method980(95, var340);
                if (var341.method2677(94)) {
                    field9682[field9693++] = class237.field3521.method3515(var339, 50).method658(var341.field6403, var340, 126);
                    return;
                }
                field9685[field9687++] = class237.field3521.method3515(var339, 50).method663(-62, var340, var341.field6413);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field9687 -= 2;
                int var342 = field9685[field9687];
                int var343 = field9685[field9687 + 1];
                class445 var344 = client.field4124.method980(-107, var343);
                if (var344.method2677(91)) {
                    field9682[field9693++] = class598.field8575.method3330((byte) -56, var342).method762(var343, var344.field6403, 1);
                    return;
                }
                field9685[field9687++] = class598.field8575.method3330((byte) -56, var342).method760(-63, var343, var344.field6413);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field9685[--field9687];
            class658 var346 = class373.field5557.method1155(var345, -123);
            if (var346.field9481 != null && var346.field9481.length > 0) {
                int var347 = 0;
                int var348 = var346.field9455[0];
                for (int var349 = 1; var349 < var346.field9481.length; var349++) {
                    if (var346.field9455[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field9455[var349];
                    }
                }
                field9685[field9687++] = var346.field9481[var347];
                return;
            }
            field9685[field9687++] = var346.field9482;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    private static final void method3840(int arg0) {
        class545 var1 = class415.method2533((byte) 78, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class545[] var3 = class91.field1668[var2];
        if (var3 == null) {
            class545[] var4 = class156.field2667[var2];
            int var5 = var4.length;
            var3 = class91.field1668[var2] = new class545[var5];
            class692.method3875(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class692.method3875(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3841(String arg0, int arg1) {
        if (class249.field3737 == 0 && !(!class301.field4474 || class231.field3466) || class436.field6299) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class265.field3922.method1733(255, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class265.field3922.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3923.method1733(255, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class265.field3923.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3924.method1733(255, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class265.field3924.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3925.method1733(255, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class265.field3925.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3926.method1733(255, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class265.field3926.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3927.method1733(255, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class265.field3927.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3928.method1733(255, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class265.field3928.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3929.method1733(255, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class265.field3929.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3930.method1733(255, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class265.field3930.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3931.method1733(255, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class265.field3931.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3932.method1733(255, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class265.field3932.method1733(255, 0).length());
        } else if (var2.startsWith(class265.field3933.method1733(255, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class265.field3933.method1733(255, 0).length());
        } else if (class140.field2466 != 0) {
            if (var2.startsWith(class265.field3922.method1733(255, class140.field2466))) {
                var3 = 0;
                arg0 = arg0.substring(class265.field3922.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3923.method1733(255, class140.field2466))) {
                var3 = 1;
                arg0 = arg0.substring(class265.field3923.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3924.method1733(255, class140.field2466))) {
                var3 = 2;
                arg0 = arg0.substring(class265.field3924.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3925.method1733(255, class140.field2466))) {
                var3 = 3;
                arg0 = arg0.substring(class265.field3925.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3926.method1733(255, class140.field2466))) {
                var3 = 4;
                arg0 = arg0.substring(class265.field3926.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3927.method1733(255, class140.field2466))) {
                var3 = 5;
                arg0 = arg0.substring(class265.field3927.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3928.method1733(255, class140.field2466))) {
                var3 = 6;
                arg0 = arg0.substring(class265.field3928.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3929.method1733(255, class140.field2466))) {
                var3 = 7;
                arg0 = arg0.substring(class265.field3929.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3930.method1733(255, class140.field2466))) {
                var3 = 8;
                arg0 = arg0.substring(class265.field3930.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3931.method1733(255, class140.field2466))) {
                var3 = 9;
                arg0 = arg0.substring(class265.field3931.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3932.method1733(255, class140.field2466))) {
                var3 = 10;
                arg0 = arg0.substring(class265.field3932.method1733(255, class140.field2466).length());
            } else if (var2.startsWith(class265.field3933.method1733(255, class140.field2466))) {
                var3 = 11;
                arg0 = arg0.substring(class265.field3933.method1733(255, class140.field2466).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class265.field3934.method1733(255, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class265.field3934.method1733(255, 0).length());
        } else if (var4.startsWith(class265.field3935.method1733(255, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class265.field3935.method1733(255, 0).length());
        } else if (var4.startsWith(class265.field3936.method1733(255, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class265.field3936.method1733(255, 0).length());
        } else if (var4.startsWith(class265.field3937.method1733(255, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class265.field3937.method1733(255, 0).length());
        } else if (var4.startsWith(class265.field3938.method1733(255, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class265.field3938.method1733(255, 0).length());
        } else if (class140.field2466 != 0) {
            if (var4.startsWith(class265.field3934.method1733(255, class140.field2466))) {
                var5 = 1;
                arg0 = arg0.substring(class265.field3934.method1733(255, class140.field2466).length());
            } else if (var4.startsWith(class265.field3935.method1733(255, class140.field2466))) {
                var5 = 2;
                arg0 = arg0.substring(class265.field3935.method1733(255, class140.field2466).length());
            } else if (var4.startsWith(class265.field3936.method1733(255, class140.field2466))) {
                var5 = 3;
                arg0 = arg0.substring(class265.field3936.method1733(255, class140.field2466).length());
            } else if (var4.startsWith(class265.field3937.method1733(255, class140.field2466))) {
                var5 = 4;
                arg0 = arg0.substring(class265.field3937.method1733(255, class140.field2466).length());
            } else if (var4.startsWith(class265.field3938.method1733(255, class140.field2466))) {
                var5 = 5;
                arg0 = arg0.substring(class265.field3938.method1733(255, class140.field2466).length());
            }
        }
        field9677++;
        class275 var6 = class185.method1355(0, class206.field3161, class395.field5772);
        var6.field4103.method693((byte) 106, 0);
        int var7 = var6.field4103.field1393;
        var6.field4103.method693((byte) 106, var3);
        var6.field4103.method693((byte) 106, var5);
        class657.method3737(var6.field4103, true, arg0);
        var6.field4103.method741(var6.field4103.field1393 - var7, 3539);
        class140.method1141(var6, 19321);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IZ)V")
    public static final void method3842(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(IZ)V")
    private static final void method3843(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9685[field9687++] = class646.field9300;
                return;
            }
            if (arg0 == 5001) {
                field9687 -= 3;
                class646.field9300 = field9685[field9687];
                class367.field5442 = class163.method1245(field9685[field9687 + 1], 0);
                if (class367.field5442 == null) {
                    class367.field5442 = class674.field9593;
                }
                class699.field9855 = field9685[field9687 + 2];
                field9695++;
                class275 var2 = class185.method1355(0, class656.field9433, class395.field5772);
                var2.field4103.method693((byte) 106, class646.field9300);
                var2.field4103.method693((byte) 106, class367.field5442.field6014);
                var2.field4103.method693((byte) 106, class699.field9855);
                class140.method1141(var2, 19321);
                return;
            }
            if (arg0 == 5002) {
                field9693 -= 2;
                String var3 = field9682[field9693];
                String var4 = field9682[field9693 + 1];
                field9687 -= 2;
                int var5 = field9685[field9687];
                int var6 = field9685[field9687 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9690++;
                class275 var7 = class185.method1355(0, class107.field1853, class395.field5772);
                var7.field4103.method693((byte) 106, class511.method3019(var3, -110) + class511.method3019(var4, -119) + 2);
                var7.field4103.method750(119, var3);
                var7.field4103.method693((byte) 106, var5 - 1);
                var7.field4103.method693((byte) 106, var6);
                var7.field4103.method750(122, var4);
                class140.method1141(var7, 19321);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9685[--field9687];
                class643 var9 = class312.method2031(var8, 90);
                String var10 = "";
                if (var9 != null && var9.field9237 != null) {
                    var10 = var9.field9237;
                }
                field9682[field9693++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9685[--field9687];
                class643 var12 = class312.method2031(var11, 90);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field9249;
                }
                field9685[field9687++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class367.field5442 == null) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = class367.field5442.field6014;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9685[--field9687];
                class275 var15 = class185.method1355(0, class230.field3463, class395.field5772);
                var15.field4103.method693((byte) 106, var14);
                class140.method1141(var15, 19321);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9682[--field9693];
                method3841(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9693 -= 2;
                String var17 = field9682[field9693];
                String var18 = field9682[field9693 + 1];
                if (class249.field3737 != 0 || (!class301.field4474 || class231.field3466) && !class436.field6299) {
                    field9694++;
                    class275 var19 = class185.method1355(0, class687.field9732, class395.field5772);
                    var19.field4103.method693((byte) 106, 0);
                    int var20 = var19.field4103.field1393;
                    var19.field4103.method750(116, var17);
                    class657.method3737(var19.field4103, true, var18);
                    var19.field4103.method741(var19.field4103.field1393 - var20, 3539);
                    class140.method1141(var19, 19321);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9685[--field9687];
                class643 var22 = class312.method2031(var21, 90);
                String var23 = "";
                if (var22 != null && var22.field9238 != null) {
                    var23 = var22.field9238;
                }
                field9682[field9693++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9685[--field9687];
                class643 var25 = class312.method2031(var24, 90);
                String var26 = "";
                if (var25 != null && var25.field9250 != null) {
                    var26 = var25.field9250;
                }
                field9682[field9693++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9685[--field9687];
                class643 var28 = class312.method2031(var27, 90);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field9243;
                }
                field9685[field9687++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class532.field7456 == null || class532.field7456.field8657 == null) {
                    var30 = class362.field5384;
                } else {
                    var30 = class532.field7456.method3437(true, true);
                }
                field9682[field9693++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9685[field9687++] = class699.field9855;
                return;
            }
            if (arg0 == 5017) {
                field9685[field9687++] = class528.method3084(true);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9685[--field9687];
                class643 var32 = class312.method2031(var31, 90);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field9248;
                }
                field9685[field9687++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9685[--field9687];
                class643 var35 = class312.method2031(var34, 90);
                String var36 = "";
                if (var35 != null && var35.field9241 != null) {
                    var36 = var35.field9241;
                }
                field9682[field9693++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class532.field7456 == null || class532.field7456.field8657 == null) {
                    var37 = class362.field5384;
                } else {
                    var37 = class532.field7456.method3441(false, -29971);
                }
                field9682[field9693++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9685[--field9687];
                class643 var39 = class312.method2031(var38, 90);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field9247;
                }
                field9685[field9687++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9685[--field9687];
                class643 var42 = class312.method2031(var41, 90);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field9244;
                }
                field9685[field9687++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9685[--field9687];
                class643 var45 = class312.method2031(var44, 90);
                String var46 = "";
                if (var45 != null && var45.field9236 != null) {
                    var46 = var45.field9236;
                }
                field9682[field9693++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9685[--field9687];
                field9682[field9693++] = class381.field5641.method2171(var47, false).field6451;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9685[--field9687];
                class448 var49 = class381.field5641.method2171(var48, false);
                if (var49.field6446 == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = var49.field6446.length;
                return;
            }
            if (arg0 == 5052) {
                field9687 -= 2;
                int var50 = field9685[field9687];
                int var51 = field9685[field9687 + 1];
                class448 var52 = class381.field5641.method2171(var50, false);
                int var53 = var52.field6446[var51];
                field9685[field9687++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9685[--field9687];
                class448 var55 = class381.field5641.method2171(var54, false);
                if (var55.field6450 == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = var55.field6450.length;
                return;
            }
            if (arg0 == 5054) {
                field9687 -= 2;
                int var56 = field9685[field9687];
                int var57 = field9685[field9687 + 1];
                field9685[field9687++] = class381.field5641.method2171(var56, false).field6450[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9685[--field9687];
                field9682[field9693++] = class379.field5606.method2369(var58, (byte) -62).method615(65535);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9685[--field9687];
                class49 var60 = class379.field5606.method2369(var59, (byte) -62);
                if (var60.field1161 == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = var60.field1161.length;
                return;
            }
            if (arg0 == 5057) {
                field9687 -= 2;
                int var61 = field9685[field9687];
                int var62 = field9685[field9687 + 1];
                field9685[field9687++] = class379.field5606.method2369(var61, (byte) -62).field1161[var62];
                return;
            }
            if (arg0 == 5058) {
                field9699 = new class691();
                field9699.field9753 = field9685[--field9687];
                field9699.field9755 = class379.field5606.method2369(field9699.field9753, (byte) -62);
                field9699.field9757 = new int[field9699.field9755.method607(true)];
                return;
            }
            if (arg0 == 5059) {
                field9678++;
                class275 var63 = class185.method1355(0, class565.field8252, class395.field5772);
                var63.field4103.method693((byte) 106, 0);
                int var64 = var63.field4103.field1393;
                var63.field4103.method693((byte) 106, 0);
                var63.field4103.method745(field9699.field9753, 128);
                field9699.field9755.method611(field9699.field9757, var63.field4103, (byte) 4);
                var63.field4103.method741(var63.field4103.field1393 - var64, 3539);
                class140.method1141(var63, 19321);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9682[--field9693];
                field9680++;
                class275 var66 = class185.method1355(0, class612.field8901, class395.field5772);
                var66.field4103.method693((byte) 106, 0);
                int var67 = var66.field4103.field1393;
                var66.field4103.method750(127, var65);
                var66.field4103.method745(field9699.field9753, 128);
                field9699.field9755.method611(field9699.field9757, var66.field4103, (byte) 4);
                var66.field4103.method741(var66.field4103.field1393 - var67, 3539);
                class140.method1141(var66, 19321);
                return;
            }
            if (arg0 == 5061) {
                field9678++;
                class275 var68 = class185.method1355(0, class565.field8252, class395.field5772);
                var68.field4103.method693((byte) 106, 0);
                int var69 = var68.field4103.field1393;
                var68.field4103.method693((byte) 106, 1);
                var68.field4103.method745(field9699.field9753, 128);
                field9699.field9755.method611(field9699.field9757, var68.field4103, (byte) 4);
                var68.field4103.method741(var68.field4103.field1393 - var69, 3539);
                class140.method1141(var68, 19321);
                return;
            }
            if (arg0 == 5062) {
                field9687 -= 2;
                int var70 = field9685[field9687];
                int var71 = field9685[field9687 + 1];
                field9685[field9687++] = class381.field5641.method2171(var70, false).field6442[var71];
                return;
            }
            if (arg0 == 5063) {
                field9687 -= 2;
                int var72 = field9685[field9687];
                int var73 = field9685[field9687 + 1];
                field9685[field9687++] = class381.field5641.method2171(var72, false).field6441[var73];
                return;
            }
            if (arg0 == 5064) {
                field9687 -= 2;
                int var74 = field9685[field9687];
                int var75 = field9685[field9687 + 1];
                if (var75 == -1) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = class381.field5641.method2171(var74, false).method2696((char) var75, -124);
                return;
            }
            if (arg0 == 5065) {
                field9687 -= 2;
                int var76 = field9685[field9687];
                int var77 = field9685[field9687 + 1];
                if (var77 == -1) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = class381.field5641.method2171(var76, false).method2693((byte) -109, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9685[--field9687];
                field9685[field9687++] = class379.field5606.method2369(var78, (byte) -62).method607(true);
                return;
            }
            if (arg0 == 5067) {
                field9687 -= 2;
                int var79 = field9685[field9687];
                int var80 = field9685[field9687 + 1];
                int var81 = class379.field5606.method2369(var79, (byte) -62).method612(var80, 125).field3764;
                field9685[field9687++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9687 -= 2;
                int var82 = field9685[field9687];
                int var83 = field9685[field9687 + 1];
                field9699.field9757[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9687 -= 2;
                int var84 = field9685[field9687];
                int var85 = field9685[field9687 + 1];
                field9699.field9757[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9687 -= 3;
                int var86 = field9685[field9687];
                int var87 = field9685[field9687 + 1];
                int var88 = field9685[field9687 + 2];
                class49 var89 = class379.field5606.method2369(var86, (byte) -62);
                if (var89.method612(var87, 127).field3764 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9685[field9687++] = var89.method610(var88, true, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9682[--field9693];
                boolean var91 = field9685[--field9687] == 1;
                class467.method2783(-31, var90, var91);
                field9685[field9687++] = class364.field5398;
                return;
            }
            if (arg0 == 5072) {
                if (class104.field1843 != null && class479.field6880 < class364.field5398) {
                    field9685[field9687++] = class104.field1843[class479.field6880++] & 0xFFFF;
                    return;
                }
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class479.field6880 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class486.field6965.method2194(86, (byte) 64)) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class486.field6965.method2194(82, (byte) 112)) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class486.field6965.method2194(81, (byte) -99)) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class95.method909((byte) 4, field9685[--field9687]);
                return;
            }
            if (arg0 == 5201) {
                field9685[field9687++] = class63.method757(-101);
                return;
            }
            if (arg0 == 5205) {
                class589.method3362(-1, field9685[--field9687], -1, (byte) -117, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field9685[--field9687];
                class557 var93 = class407.method2475(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = var93.field7887;
                return;
            }
            if (arg0 == 5207) {
                class557 var94 = class407.method2496(field9685[--field9687]);
                if (var94 != null && var94.field7881 != null) {
                    field9682[field9693++] = var94.field7881;
                    return;
                }
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9685[field9687++] = class426.field6142;
                field9685[field9687++] = class42.field1082;
                return;
            }
            if (arg0 == 5209) {
                field9685[field9687++] = class407.field5899 + class243.field3674;
                field9685[field9687++] = class407.field5902 + class254.field3763;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field9685[--field9687];
                class557 var96 = class407.method2496(var95);
                if (var96 == null) {
                    field9685[field9687++] = 0;
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = var96.field7875 >> 14 & 0x3FFF;
                field9685[field9687++] = var96.field7875 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field9685[--field9687];
                class557 var98 = class407.method2496(var97);
                if (var98 == null) {
                    field9685[field9687++] = 0;
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = var98.field7883 - var98.field7873;
                field9685[field9687++] = var98.field7880 - var98.field7884;
                return;
            }
            if (arg0 == 5212) {
                class473 var99 = class654.method3725(112);
                if (var99 == null) {
                    field9685[field9687++] = -1;
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = var99.field6709;
                int var100 = var99.field6704 << 28 | class407.field5899 + var99.field6712 << 14 | class407.field5902 + var99.field6706;
                field9685[field9687++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class473 var101 = class678.method3816(-111);
                if (var101 == null) {
                    field9685[field9687++] = -1;
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = var101.field6709;
                int var102 = var101.field6704 << 28 | class407.field5899 + var101.field6712 << 14 | class407.field5902 + var101.field6706;
                field9685[field9687++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field9685[--field9687];
                class557 var104 = class338.method2175((byte) -74);
                if (var104 != null) {
                    boolean var105 = var104.method3176(var103 >> 14 & 0x3FFF, -126, var103 & 0x3FFF, field9701, var103 >> 28 & 0x3);
                    if (var105) {
                        class261.method1712(field9701[2], field9701[1], (byte) -117);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9687 -= 2;
                int var106 = field9685[field9687];
                int var107 = field9685[field9687 + 1];
                class513 var108 = class407.method2479(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class557 var110 = (class557) var108.method3024(5572); var110 != null; var110 = (class557) var108.method3026(0)) {
                    if (var110.field7887 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field9685[--field9687];
                class557 var112 = class407.method2496(var111);
                if (var112 == null) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = var112.field7878;
                return;
            }
            if (arg0 == 5220) {
                field9685[field9687++] = class660.field9506 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field9685[--field9687];
                class261.method1712(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, (byte) -45);
                return;
            }
            if (arg0 == 5222) {
                class557 var114 = class338.method2175((byte) -74);
                if (var114 != null) {
                    boolean var115 = var114.method3173(field9701, class407.field5899 + class243.field3674, class407.field5902 + class254.field3763, 0);
                    if (var115) {
                        field9685[field9687++] = field9701[1];
                        field9685[field9687++] = field9701[2];
                        return;
                    }
                    field9685[field9687++] = -1;
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = -1;
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9687 -= 2;
                int var116 = field9685[field9687];
                int var117 = field9685[field9687 + 1];
                class589.method3362(var117 & 0x3FFF, var116, var117 >> 14 & 0x3FFF, (byte) -100, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field9685[--field9687];
                class557 var119 = class338.method2175((byte) -74);
                if (var119 != null) {
                    boolean var120 = var119.method3176(var118 >> 14 & 0x3FFF, -121, var118 & 0x3FFF, field9701, var118 >> 28 & 0x3);
                    if (var120) {
                        field9685[field9687++] = field9701[1];
                        field9685[field9687++] = field9701[2];
                        return;
                    }
                    field9685[field9687++] = -1;
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = -1;
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field9685[--field9687];
                class557 var122 = class338.method2175((byte) -74);
                if (var122 != null) {
                    boolean var123 = var122.method3173(field9701, var121 >> 14 & 0x3FFF, var121 & 0x3FFF, 0);
                    if (var123) {
                        field9685[field9687++] = field9701[1];
                        field9685[field9687++] = field9701[2];
                        return;
                    }
                    field9685[field9687++] = -1;
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = -1;
                field9685[field9687++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class440.method2656((byte) 123, field9685[--field9687]);
                return;
            }
            if (arg0 == 5227) {
                field9687 -= 2;
                int var124 = field9685[field9687];
                int var125 = field9685[field9687 + 1];
                class589.method3362(var125 & 0x3FFF, var124, var125 >> 14 & 0x3FFF, (byte) 50, true);
                return;
            }
            if (arg0 == 5228) {
                class368.field5461 = field9685[--field9687] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9685[field9687++] = class368.field5461 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field9685[--field9687];
                class184.method1347((byte) -33, var126);
                return;
            }
            if (arg0 == 5231) {
                field9687 -= 2;
                int var127 = field9685[field9687];
                boolean var128 = field9685[field9687 + 1] == 1;
                if (class480.field6895 != null) {
                    class425 var129 = class480.field6895.method2596((long) var127, 48);
                    if (var129 != null && !var128) {
                        var129.method2588(300);
                        return;
                    }
                    if (var129 == null && var128) {
                        class425 var130 = new class425();
                        class480.field6895.method2598(var130, (long) var127, (byte) 8);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field9685[--field9687];
                if (class480.field6895 != null) {
                    class425 var132 = class480.field6895.method2596((long) var131, 89);
                    field9685[field9687++] = var132 == null ? 0 : 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9687 -= 2;
                int var133 = field9685[field9687];
                boolean var134 = field9685[field9687 + 1] == 1;
                if (class364.field5409 != null) {
                    class425 var135 = class364.field5409.method2596((long) var133, 123);
                    if (var135 != null && !var134) {
                        var135.method2588(300);
                        return;
                    }
                    if (var135 == null && var134) {
                        class425 var136 = new class425();
                        class364.field5409.method2598(var136, (long) var133, (byte) 8);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field9685[--field9687];
                if (class364.field5409 != null) {
                    class425 var138 = class364.field5409.method2596((long) var137, 52);
                    field9685[field9687++] = var138 == null ? 0 : 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9685[field9687++] = class407.field5871 == null ? -1 : class407.field5871.field7887;
                return;
            }
            if (arg0 == 5236) {
                field9687 -= 2;
                int var139 = field9685[field9687];
                int var140 = field9685[field9687 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class184.method1349(var139, var142, var141, (byte) 94);
                if (var143 < 0) {
                    field9685[field9687++] = -1;
                    return;
                }
                field9685[field9687++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class696.method3895((byte) 24);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9687 -= 2;
                int var144 = field9685[field9687];
                int var145 = field9685[field9687 + 1];
                class485.method2931(var144, 3, var145, false, (byte) -70);
                field9685[field9687++] = class413.field5977 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class413.field5977 != null) {
                    class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -108);
                }
                return;
            }
            if (arg0 == 5302) {
                class202[] var146 = class341.method2190((byte) -91);
                field9685[field9687++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field9685[--field9687];
                class202[] var148 = class341.method2190((byte) -91);
                field9685[field9687++] = var148[var147].field3116;
                field9685[field9687++] = var148[var147].field3112;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class527.field7429.field2661;
                int var150 = class527.field7429.field2670;
                int var151 = -1;
                class202[] var152 = class341.method2190((byte) -108);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class202 var154 = var152[var153];
                    if (var154.field3116 == var149 && var154.field3112 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field9685[field9687++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field9685[field9687++] = class601.method3434(true);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field9685[--field9687];
                if (var155 >= 1 && var155 <= 2) {
                    class485.method2931(-1, var155, -1, false, (byte) -61);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9685[field9687++] = class527.field7429.field2653;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field9685[--field9687];
                if (var156 >= 1 && var156 <= 2) {
                    class527.field7429.field2653 = var156;
                    class527.field7429.method2809(class604.field8775, (byte) 96);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9693 -= 2;
                String var157 = field9682[field9693];
                String var158 = field9682[field9693 + 1];
                int var159 = field9685[--field9687];
                field9681++;
                class275 var160 = class185.method1355(0, class408.field5905, class395.field5772);
                var160.field4103.method693((byte) 106, class511.method3019(var157, -111) + class511.method3019(var158, -95) + 1);
                var160.field4103.method750(117, var157);
                var160.field4103.method750(118, var158);
                var160.field4103.method693((byte) 106, var159);
                class140.method1141(var160, 19321);
                return;
            }
            if (arg0 == 5401) {
                field9687 -= 2;
                class59.field1337[field9685[field9687]] = (short) class311.method2030(-93, field9685[field9687 + 1]);
                class268.field3985.method255(-118);
                class268.field3985.method257((byte) 67);
                class317.field4681.method810(-11874);
                class293.method1954(0);
                return;
            }
            if (arg0 == 5405) {
                field9687 -= 2;
                int var161 = field9685[field9687];
                int var162 = field9685[field9687 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class704.field9913[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9687 -= 7;
                int var163 = field9685[field9687];
                int var164 = field9685[field9687 + 1] << 1;
                int var165 = field9685[field9687 + 2];
                int var166 = field9685[field9687 + 3];
                int var167 = field9685[field9687 + 4];
                int var168 = field9685[field9687 + 5];
                int var169 = field9685[field9687 + 6];
                if (var163 >= 0 && var163 < 2 && class704.field9913[var163] != null && var164 >= 0 && var164 < class704.field9913[var163].length) {
                    class704.field9913[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class704.field9913[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class704.field9913[field9685[--field9687]].length >> 1;
                field9685[field9687++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class413.field5977 != null) {
                    class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -126);
                }
                if (class112.field2017 != null) {
                    class239.method1587((byte) 101);
                    System.exit(0);
                    return;
                }
                String var171 = class628.field9063 == null ? class145.method1161(2) : class628.field9063;
                class566.method3276(var171, class90.field1654 == 1, 11574, class604.field8775, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class432.field6237 != null) {
                    if (class432.field6237.field6499 == null) {
                        var172 = class223.method1532((byte) 33, class432.field6237.field6503);
                    } else {
                        var172 = (String) class432.field6237.field6499;
                    }
                }
                field9682[field9693++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field9685[field9687++] = class604.field8775.field795 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class413.field5977 != null) {
                    class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -81);
                }
                String var173 = field9682[--field9693];
                boolean var174 = field9685[--field9687] == 1;
                String var175 = class145.method1161(2) + var173;
                class566.method3276(var175, class90.field1654 == 1, 11574, class604.field8775, var174);
                return;
            }
            if (arg0 == 5422) {
                field9693 -= 2;
                String var176 = field9682[field9693];
                String var177 = field9682[field9693 + 1];
                int var178 = field9685[--field9687];
                if (var176.length() > 0) {
                    if (class4.field466 == null) {
                        class4.field466 = new String[class569.field8292[class78.field1573.field5796]];
                    }
                    class4.field466[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class174.field2877 == null) {
                        class174.field2877 = new String[class569.field8292[class78.field1573.field5796]];
                    }
                    class174.field2877[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9682[--field9693]);
                return;
            }
            if (arg0 == 5424) {
                field9687 -= 11;
                class159.field2708 = field9685[field9687];
                class291.field4377 = field9685[field9687 + 1];
                class528.field7443 = field9685[field9687 + 2];
                class357.field5337 = field9685[field9687 + 3];
                class433.field6251 = field9685[field9687 + 4];
                class222.field3349 = field9685[field9687 + 5];
                class247.field3716 = field9685[field9687 + 6];
                client.field4113 = field9685[field9687 + 7];
                class236.field3511 = field9685[field9687 + 8];
                class195.field3066 = field9685[field9687 + 9];
                class685.field9717 = field9685[field9687 + 10];
                class632.field9092.method2230((byte) 74, class433.field6251);
                class632.field9092.method2230((byte) 67, class222.field3349);
                class632.field9092.method2230((byte) -119, class247.field3716);
                class632.field9092.method2230((byte) 101, client.field4113);
                class632.field9092.method2230((byte) 70, class236.field3511);
                class81.field1590 = null;
                class139.field2462 = null;
                class536.field7509 = null;
                class361.field5364 = null;
                class223.field3358 = null;
                class430.field6212 = null;
                class703.field9887 = null;
                class607.field8840 = null;
                class163.field2740 = true;
                return;
            }
            if (arg0 == 5425) {
                class183.method1341((byte) -82);
                class163.field2740 = false;
                return;
            }
            if (arg0 == 5426) {
                field9687 -= 2;
                class617.field8961 = field9685[field9687];
                class419.field6041 = field9685[field9687 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9687 -= 2;
                class699.field9841 = field9685[field9687 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9687 -= 2;
                int var179 = field9685[field9687];
                int var180 = field9685[field9687 + 1];
                field9685[field9687++] = class392.method2427(var180, var179, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class97.method917(false, field9682[--field9693], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class31.method507(13009, "accountcreated", class416.field6017);
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class31.method507(13009, "accountcreatestarted", class416.field6017);
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class415.field6011 != null) {
                    Transferable var182 = class415.field6011.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var318) {
                        }
                    }
                }
                field9682[field9693++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9687 -= 4;
                int var183 = field9685[field9687];
                int var184 = field9685[field9687 + 1];
                int var185 = field9685[field9687 + 2];
                int var186 = field9685[field9687 + 3];
                class146.method1166(var184 << 2, (byte) -78, var185, var186, (var183 >> 14 & 0x3FFF) - class33.field967, false, (var183 & 0x3FFF) - class323.field4749);
                return;
            }
            if (arg0 == 5501) {
                field9687 -= 4;
                int var187 = field9685[field9687];
                int var188 = field9685[field9687 + 1];
                int var189 = field9685[field9687 + 2];
                int var190 = field9685[field9687 + 3];
                class11.method293(var189, (byte) -115, (var187 >> 14 & 0x3FFF) - class33.field967, var188 << 2, (var187 & 0x3FFF) - class323.field4749, var190);
                return;
            }
            if (arg0 == 5502) {
                field9687 -= 6;
                int var191 = field9685[field9687];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class379.field5609 = var191;
                int var192 = field9685[field9687 + 1];
                if (var192 + 1 >= class704.field9913[class379.field5609].length >> 1) {
                    throw new RuntimeException();
                }
                class643.field9246 = var192;
                class9.field546 = 0;
                class220.field3335 = field9685[field9687 + 2];
                class210.field3198 = field9685[field9687 + 3];
                int var193 = field9685[field9687 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class494.field7054 = var193;
                int var194 = field9685[field9687 + 5];
                if (var194 + 1 >= class704.field9913[class494.field7054].length >> 1) {
                    throw new RuntimeException();
                }
                class463.field6592 = var194;
                class423.field6123 = 3;
                class488.field6995 = -1;
                class266.field3950 = -1;
                return;
            }
            if (arg0 == 5503) {
                class335.method2163((byte) 113);
                return;
            }
            if (arg0 == 5504) {
                field9687 -= 2;
                class685.method3855(0, field9685[field9687 + 1], field9685[field9687], -101);
                return;
            }
            if (arg0 == 5505) {
                field9685[field9687++] = (int) class27.field926 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9685[field9687++] = (int) class591.field8509 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class596.method3397(-47);
                return;
            }
            if (arg0 == 5508) {
                class676.method3804(-99);
                return;
            }
            if (arg0 == 5509) {
                class505.method2999(58);
                return;
            }
            if (arg0 == 5510) {
                class87.method862(18848);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field9685[--field9687];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class33.field967;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class675.field9604) {
                    var198 = class675.field9604;
                }
                int var199 = var197 - class323.field4749;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class218.field3316) {
                    var199 = class218.field3316;
                }
                class112.field2019 = (var198 << 9) + 256;
                class260.field3823 = (var199 << 9) + 256;
                class423.field6123 = 4;
                class488.field6995 = -1;
                class266.field3950 = -1;
                return;
            }
            if (arg0 == 5512) {
                class157.method1219((byte) 99);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field9685[--field9687];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class33.field967;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class675.field9604) {
                        var203 = class675.field9604;
                    }
                    int var204 = var202 - class323.field4749;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class218.field3316) {
                        var204 = class218.field3316;
                    }
                    class266.field3950 = (var203 << 9) + 256;
                    class488.field6995 = (var204 << 9) + 256;
                    return;
                }
                class266.field3950 = -1;
                class488.field6995 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9693 -= 2;
                String var205 = field9682[field9693];
                String var206 = field9682[field9693 + 1];
                int var207 = field9685[--field9687];
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    class362.field5384 = var205;
                    class284.field4229 = var206;
                    class163.field2735 = var207;
                    class118.method1038(6, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class180.method1329(6409);
                return;
            }
            if (arg0 == 5602) {
                if (class183.field2942 == 0) {
                    class637.field9183 = -2;
                    class642.field9234 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field9687 -= 4;
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    class55.method647(field9685[field9687 + 1], (byte) -94, field9685[field9687 + 3], field9685[field9687], field9685[field9687 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field9693--;
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    class366.method2316(class312.method2032(true, field9682[field9693]), -52);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9693 -= 2;
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    class173.method1298(field9682[field9693 + 1], false, class312.method2032(true, field9682[field9693]), false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class605.field8811 == 0) {
                    class160.field2715 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9685[field9687++] = class642.field9234;
                return;
            }
            if (arg0 == 5608) {
                field9685[field9687++] = class531.field7452;
                return;
            }
            if (arg0 == 5609) {
                field9685[field9687++] = class160.field2715;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field9682[field9693++] = class400.field5811 == null || class400.field5811.length <= var208 ? "" : class157.method1218(class400.field5811[var208], (byte) -69);
                }
                class400.field5811 = null;
                return;
            }
            if (arg0 == 5611) {
                field9685[field9687++] = class405.field5850;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field9685[--field9687];
                if (class199.field3098 != 7) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    if (class165.field2755 != null) {
                        class165.field2755.method481(true);
                        class165.field2755 = null;
                    }
                    class163.field2735 = var209;
                    class118.method1038(9, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9685[field9687++] = class642.field9234;
                return;
            }
            if (arg0 == 5615) {
                field9693 -= 2;
                String var210 = field9682[field9693];
                String var211 = field9682[field9693 + 1];
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    if (class165.field2755 != null) {
                        class165.field2755.method481(true);
                        class165.field2755 = null;
                    }
                    class362.field5384 = var210;
                    class284.field4229 = var211;
                    class118.method1038(5, 1);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class85.method852(-126, false);
                return;
            }
            if (arg0 == 5617) {
                field9685[field9687++] = class637.field9183;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field9685[--field9687];
                class653.method3722(false, var212, true);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field9685[--field9687];
                class653.method3722(true, var213, true);
                return;
            }
            if (arg0 == 5620) {
                class598.method3402(-1);
                if (class118.field2098 != "" && class118.field2098 != "") {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9693 -= 2;
                if (class199.field3098 != 3) {
                    return;
                }
                if (class183.field2942 == 0 && class605.field8811 == 0) {
                    class173.method1298(field9682[field9693 + 1], true, class312.method2032(true, field9682[field9693]), false);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class456 var214 = class604.field8775.method402("3", false, (byte) 48);
                while (var214.field6502 == 0) {
                    class185.method1354(1L, 10);
                }
                if (var214.field6502 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class263 var215 = (class263) var214.field6499;
                if (var215.method1723(65280).exists()) {
                    class61 var216 = new class61(50);
                    try {
                        var215.method1724(var216.field1397, 0, 50, 0);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method1726((byte) -128);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class687.field9733 != null) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9685[field9687++] = (int) (class77.field1564 >> 32);
                field9685[field9687++] = (int) (class77.field1564 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field9685[--field9687];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class527.field7429.field2647 = var217;
                class310.method2026((byte) 106);
                class527.field7429.method2809(class604.field8775, (byte) -32);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6002) {
                class527.field7429.method2818((byte) 113, field9685[--field9687] == 1);
                class310.method2026((byte) 124);
                class265.method1735(100);
                class527.field7429.method2809(class604.field8775, (byte) 69);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6003) {
                class527.field7429.field2638 = field9685[--field9687] == 1;
                class265.method1735(117);
                class527.field7429.method2809(class604.field8775, (byte) -93);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6005) {
                class527.field7429.field2665 = field9685[--field9687] == 1;
                class310.method2026((byte) 125);
                class527.field7429.method2809(class604.field8775, (byte) 118);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6006) {
                class527.field7429.field2654 = field9685[--field9687] == 1;
                class623.field9017.method163(!class527.field7429.field2654);
                class527.field7429.method2809(class604.field8775, (byte) -19);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6007) {
                class527.field7429.field2624 = field9685[--field9687];
                class527.field7429.method2809(class604.field8775, (byte) 50);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6008) {
                class527.field7429.field2633 = field9685[--field9687] == 1;
                class527.field7429.method2809(class604.field8775, (byte) 93);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6009) {
                class527.field7429.field2625 = field9685[--field9687] == 1;
                class310.method2026((byte) 93);
                class527.field7429.method2809(class604.field8775, (byte) -108);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6010) {
                class527.field7429.field2628 = field9685[--field9687] == 1;
                class527.field7429.method2809(class604.field8775, (byte) -45);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field9685[--field9687];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class527.field7429.method1203(true, var218, class90.field1654);
                class310.method2026((byte) 57);
                class527.field7429.method2809(class604.field8775, (byte) -21);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6012) {
                class527.field7429.method1210(true, class90.field1654, field9685[--field9687] == 1);
                class309.method2016(4);
                class593.method3382(-1);
                class527.field7429.method2809(class604.field8775, (byte) 85);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6014) {
                class527.field7429.field2643 = field9685[--field9687] == 1;
                class310.method2026((byte) 67);
                class527.field7429.method2809(class604.field8775, (byte) -114);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6015) {
                class527.field7429.field2626 = field9685[--field9687] == 1;
                class310.method2026((byte) 125);
                class527.field7429.method2809(class604.field8775, (byte) -31);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field9685[--field9687];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class527.field7429.field2671 = var219;
                class294.method1959((byte) 123, class90.field1654);
                class527.field7429.method2809(class604.field8775, (byte) 66);
                return;
            }
            if (arg0 == 6017) {
                class527.field7429.field2660 = field9685[--field9687] == 1;
                class542.method3125(-112);
                class527.field7429.method2809(class604.field8775, (byte) 57);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field9685[--field9687];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class527.field7429.field2658 = var220;
                class527.field7429.method2809(class604.field8775, (byte) 82);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field9685[--field9687];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class527.field7429.field2659 != var221) {
                    if (class527.field7429.field2659 == 0 && class65.field1434 != -1) {
                        class444.method2671(class46.field1128, var221, false, 6408, class65.field1434, 0);
                        class552.field7822 = false;
                    } else if (var221 == 0) {
                        class419.method2542(-98);
                        class552.field7822 = false;
                    } else {
                        class36.method536(var221, 256);
                    }
                    class527.field7429.field2659 = var221;
                }
                class527.field7429.method2809(class604.field8775, (byte) 72);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field9685[--field9687];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class527.field7429.field2635 = var222;
                class527.field7429.method2809(class604.field8775, (byte) -127);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6021) {
                class527.field7429.field6660 = field9685[--field9687] == 1;
                class265.method1735(96);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field9685[--field9687];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class681.field9649 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class534.method3094(17517, var223);
                class527.field7429.method2809(class604.field8775, (byte) -122);
                class33.field966 = false;
                field9685[field9687++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field9685[--field9687];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class527.field7429.field2642 = var225;
                class527.field7429.method2809(class604.field8775, (byte) -67);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field9685[--field9687];
                if (var226 < 0 || var226 > class405.method2469((byte) 39, class681.field9649)) {
                    var226 = 0;
                }
                class527.field7429.field2673 = var226;
                class527.field7429.method2809(class604.field8775, (byte) 121);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field9685[--field9687];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class213.method1489(118, var227 == 1);
                return;
            }
            if (arg0 == 6028) {
                class527.field7429.field2644 = field9685[--field9687] != 0;
                class527.field7429.method2809(class604.field8775, (byte) -29);
                return;
            }
            if (arg0 == 6029) {
                class527.field7429.field2624 = field9685[--field9687];
                class527.field7429.method2809(class604.field8775, (byte) -48);
                return;
            }
            if (arg0 == 6030) {
                class527.field7429.field2662 = field9685[--field9687] != 0;
                class527.field7429.method2809(class604.field8775, (byte) -125);
                class310.method2026((byte) 61);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field9685[--field9687];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class294.method1959((byte) 113, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field9685[--field9687];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class527.field7429.field2621 = var229;
                class527.field7429.method2809(class604.field8775, (byte) 56);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field9685[--field9687];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class527.field7429.field2674 = var230;
                class527.field7429.method2809(class604.field8775, (byte) 59);
                return;
            }
            if (arg0 == 6034) {
                class527.field7429.field2656 = field9685[--field9687] == 1;
                class527.field7429.method2809(class604.field8775, (byte) -124);
                class309.method2016(4);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6035) {
                class527.field7429.field6661 = field9685[--field9687] == 1;
                class310.method2026((byte) 87);
                class265.method1735(114);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field9685[--field9687];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class527.field7429.method2816(var231, 0);
                class527.field7429.method2809(class604.field8775, (byte) -40);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field9685[--field9687];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class527.field7429.field2630 = var232;
                class527.field7429.method2809(class604.field8775, (byte) -59);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field9685[--field9687];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class527.field7429.field2622 != var233 && class65.field1434 == class628.field9057) {
                    if (class527.field7429.field2622 == 0) {
                        class444.method2671(class46.field1128, var233, false, 6408, class65.field1434, 0);
                        class552.field7822 = false;
                    } else if (var233 == 0) {
                        class419.method2542(-92);
                        class552.field7822 = false;
                    } else {
                        class36.method536(var233, 256);
                    }
                }
                class527.field7429.field2622 = var233;
                class527.field7429.method2809(class604.field8775, (byte) 123);
                class33.field966 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field9685[--field9687];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class527.field7429.field2627 != var234) {
                    class527.field7429.field2627 = var234;
                    class527.field7429.method2809(class604.field8775, (byte) 125);
                    class33.field966 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9685[field9687++] = class527.field7429.field2647;
                return;
            }
            if (arg0 == 6102) {
                field9685[field9687++] = class527.field7429.method2810(35, class90.field1654) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9685[field9687++] = class527.field7429.field2638 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9685[field9687++] = class527.field7429.field2665 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field9685[field9687++] = class527.field7429.field2654 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9685[field9687++] = class527.field7429.field2624;
                return;
            }
            if (arg0 == 6108) {
                field9685[field9687++] = class527.field7429.field2633 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field9685[field9687++] = class527.field7429.field2625 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9685[field9687++] = class527.field7429.field2628 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9685[field9687++] = class527.field7429.method1211(class90.field1654, (byte) 36);
                return;
            }
            if (arg0 == 6112) {
                field9685[field9687++] = class527.field7429.method1204((byte) 121, class90.field1654) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9685[field9687++] = class527.field7429.field2643 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9685[field9687++] = class527.field7429.field2626 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9685[field9687++] = class527.field7429.field2671;
                return;
            }
            if (arg0 == 6117) {
                field9685[field9687++] = class527.field7429.field2660 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9685[field9687++] = class527.field7429.field2658;
                return;
            }
            if (arg0 == 6119) {
                field9685[field9687++] = class527.field7429.field2659;
                return;
            }
            if (arg0 == 6120) {
                field9685[field9687++] = class527.field7429.field2635;
                return;
            }
            if (arg0 == 6121) {
                field9685[field9687++] = class623.field9017.method12() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field9685[field9687++] = class339.method2177(-24814);
                return;
            }
            if (arg0 == 6124) {
                field9685[field9687++] = class527.field7429.field2642;
                return;
            }
            if (arg0 == 6125) {
                field9685[field9687++] = class527.field7429.field2673;
                return;
            }
            if (arg0 == 6126) {
                field9685[field9687++] = class623.field9017.method173() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field9685[field9687++] = class527.field7429.field2652 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9685[field9687++] = class527.field7429.field2644 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9685[field9687++] = class527.field7429.field2624;
                return;
            }
            if (arg0 == 6130) {
                field9685[field9687++] = class527.field7429.field2662 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9685[field9687++] = class90.field1654;
                return;
            }
            if (arg0 == 6132) {
                field9685[field9687++] = class527.field7429.field2621;
                return;
            }
            if (arg0 == 6133) {
                field9685[field9687++] = class604.field8775.field795 && !class604.field8775.field771 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field9685[field9687++] = class405.method2469((byte) 39, class681.field9649);
                return;
            }
            if (arg0 == 6135) {
                field9685[field9687++] = class527.field7429.field2674;
                return;
            }
            if (arg0 == 6136) {
                field9685[field9687++] = class527.field7429.field2656 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field9685[field9687++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9685[field9687++] = class546.method3152(0, class90.field1654, 200);
                return;
            }
            if (arg0 == 6139) {
                field9685[field9687++] = class527.field7429.method2822((byte) 117, class90.field1654);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class273.method1783(class90.field1654, 0) && class681.field9649 < 96) {
                    var236 = 1;
                }
                field9685[field9687++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class681.field9649 < 96) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field9685[field9687++] = class527.field7429.field2630;
                return;
            }
            if (arg0 == 6143) {
                field9685[field9687++] = class527.field7429.field2622;
                return;
            }
            if (arg0 == 6144) {
                field9685[field9687++] = class462.field6584 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9685[field9687++] = class527.field7429.field2627;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9687 -= 2;
                class112.field2018 = (short) field9685[field9687];
                if (class112.field2018 <= 0) {
                    class112.field2018 = 256;
                }
                class470.field6670 = (short) field9685[field9687 + 1];
                if (class470.field6670 <= 0) {
                    class470.field6670 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9687 -= 2;
                class649.field9359 = (short) field9685[field9687];
                if (class649.field9359 <= 0) {
                    class649.field9359 = 256;
                }
                class447.field6434 = (short) field9685[field9687 + 1];
                if (class447.field6434 <= 0) {
                    class447.field6434 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9687 -= 4;
                class113.field2026 = (short) field9685[field9687];
                if (class113.field2026 <= 0) {
                    class113.field2026 = 1;
                }
                class496.field7075 = (short) field9685[field9687 + 1];
                if (class496.field7075 <= 0) {
                    class496.field7075 = 32767;
                } else if (class496.field7075 < class113.field2026) {
                    class496.field7075 = class113.field2026;
                }
                class420.field6050 = (short) field9685[field9687 + 2];
                if (class420.field6050 <= 0) {
                    class420.field6050 = 1;
                }
                class375.field5586 = (short) field9685[field9687 + 3];
                if (class375.field5586 <= 0) {
                    class375.field5586 = 32767;
                    return;
                }
                if (class375.field5586 < class420.field6050) {
                    class375.field5586 = class420.field6050;
                }
                return;
            }
            if (arg0 == 6203) {
                class251.method1683(class425.field6136.field7718, 0, 0, (byte) 66, class425.field6136.field7652, false);
                field9685[field9687++] = class673.field9576;
                field9685[field9687++] = class423.field6117;
                return;
            }
            if (arg0 == 6204) {
                field9685[field9687++] = class649.field9359;
                field9685[field9687++] = class447.field6434;
                return;
            }
            if (arg0 == 6205) {
                field9685[field9687++] = class112.field2018;
                field9685[field9687++] = class470.field6670;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9685[field9687++] = (int) (class525.method3074((byte) -101) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9685[field9687++] = (int) (class525.method3074((byte) -101) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9687 -= 3;
                int var237 = field9685[field9687];
                int var238 = field9685[field9687 + 1];
                int var239 = field9685[field9687 + 2];
                field9688.clear();
                field9688.set(11, 12);
                field9688.set(var239, var238, var237);
                int var240 = (int) (field9688.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field9685[field9687++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field9688.clear();
                field9688.setTime(new Date(class525.method3074((byte) -101)));
                field9685[field9687++] = field9688.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field9685[--field9687];
                boolean var242 = true;
                if (var241 < 0) {
                    var242 = (var241 + 1) % 4 == 0;
                } else if (var241 < 1582) {
                    var242 = var241 % 4 == 0;
                } else if (var241 % 4 != 0) {
                    var242 = false;
                } else if (var241 % 100 != 0) {
                    var242 = true;
                } else if (var241 % 400 != 0) {
                    var242 = false;
                }
                field9685[field9687++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9685[field9687++] = class156.method1208(false) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9685[field9687++] = class124.method1063(31) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class199.field3098 == 7 && class183.field2942 == 0 && class605.field8811 == 0) {
                    if (class582.field8428) {
                        field9685[field9687++] = 0;
                        return;
                    }
                    if (class308.field4554 > class525.method3074((byte) -101) - 1000L) {
                        field9685[field9687++] = 1;
                        return;
                    }
                    class582.field8428 = true;
                    class275 var243 = class185.method1355(0, class225.field3369, class395.field5772);
                    var243.field4103.method715(class559.field7904, 1949991176);
                    class140.method1141(var243, 19321);
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class135 var244 = class500.method2983((byte) -8);
                if (var244 != null) {
                    field9685[field9687++] = var244.field2395;
                    field9685[field9687++] = var244.field6007;
                    field9682[field9693++] = var244.field2396;
                    class96 var245 = var244.method1114(-22049);
                    field9685[field9687++] = var245.field1710;
                    field9682[field9693++] = var245.field1712;
                    field9685[field9687++] = var244.field5999;
                    field9685[field9687++] = var244.field2401;
                    field9682[field9693++] = var244.field2399;
                    return;
                }
                field9685[field9687++] = -1;
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 6502) {
                class135 var246 = class25.method478(true);
                if (var246 != null) {
                    field9685[field9687++] = var246.field2395;
                    field9685[field9687++] = var246.field6007;
                    field9682[field9693++] = var246.field2396;
                    class96 var247 = var246.method1114(-22049);
                    field9685[field9687++] = var247.field1710;
                    field9682[field9693++] = var247.field1712;
                    field9685[field9687++] = var246.field5999;
                    field9685[field9687++] = var246.field2401;
                    field9682[field9693++] = var246.field2399;
                    return;
                }
                field9685[field9687++] = -1;
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field9685[--field9687];
                String var249 = field9682[--field9693];
                if (class199.field3098 == 7 && class183.field2942 == 0 && class605.field8811 == 0) {
                    field9685[field9687++] = class22.method451(-81, var248, var249) ? 1 : 0;
                    return;
                }
                field9685[field9687++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class527.field7429.field2651 = field9685[--field9687];
                class527.field7429.method2809(class604.field8775, (byte) -60);
                return;
            }
            if (arg0 == 6505) {
                field9685[field9687++] = class527.field7429.field2651;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field9685[--field9687];
                class135 var251 = class265.method1734(2, var250);
                if (var251 != null) {
                    field9685[field9687++] = var251.field6007;
                    field9682[field9693++] = var251.field2396;
                    class96 var252 = var251.method1114(-22049);
                    field9685[field9687++] = var252.field1710;
                    field9682[field9693++] = var252.field1712;
                    field9685[field9687++] = var251.field5999;
                    field9685[field9687++] = var251.field2401;
                    field9682[field9693++] = var251.field2399;
                    return;
                }
                field9685[field9687++] = -1;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                field9685[field9687++] = 0;
                field9685[field9687++] = 0;
                field9682[field9693++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9687 -= 4;
                int var253 = field9685[field9687];
                boolean var254 = field9685[field9687 + 1] == 1;
                int var255 = field9685[field9687 + 2];
                boolean var256 = field9685[field9687 + 3] == 1;
                class199.method1423(var256, var255, 7714, var253, var254);
                return;
            }
            if (arg0 == 6508) {
                class113.method1014((byte) -35);
                return;
            }
            if (arg0 == 6509) {
                if (class199.field3098 != 7) {
                    return;
                }
                class400.field5813 = field9685[--field9687] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9685[field9687++] = class535.field7497;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class527.field7429.field2675 = field9685[--field9687] == 1;
                class527.field7429.method2809(class604.field8775, (byte) -52);
                return;
            }
            if (arg0 == 6601) {
                field9685[field9687++] = class527.field7429.field2675 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class539.field7531 == class424.field6130) {
            if (arg0 == 6700) {
                int var257 = class78.field1572.method2603(-123);
                if (class361.field5368 != -1) {
                    var257++;
                }
                field9685[field9687++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field9685[--field9687];
                if (class361.field5368 != -1) {
                    if (var258 == 0) {
                        field9685[field9687++] = class361.field5368;
                        return;
                    }
                    var258--;
                }
                class601 var259 = (class601) class78.field1572.method2597((byte) -127);
                while (var258-- > 0) {
                    var259 = (class601) class78.field1572.method2594((byte) -122);
                }
                field9685[field9687++] = var259.field8614;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field9685[--field9687];
                if (class156.field2667[var260] == null) {
                    field9682[field9693++] = "";
                    return;
                }
                String var261 = class156.field2667[var260][0].field7726;
                if (var261 == null) {
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field9685[--field9687];
                if (class156.field2667[var262] == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = class156.field2667[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field9687 -= 2;
                int var263 = field9685[field9687];
                int var264 = field9685[field9687 + 1];
                if (class156.field2667[var263] == null) {
                    field9682[field9693++] = "";
                    return;
                }
                String var265 = class156.field2667[var263][var264].field7726;
                if (var265 == null) {
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field9687 -= 2;
                int var266 = field9685[field9687];
                int var267 = field9685[field9687 + 1];
                if (class156.field2667[var266] == null) {
                    field9685[field9687++] = 0;
                    return;
                }
                field9685[field9687++] = class156.field2667[var266][var267].field7679;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field9687 -= 3;
                int var268 = field9685[field9687];
                int var269 = field9685[field9687 + 1];
                int var270 = field9685[field9687 + 2];
                class117.method1022("", true, var270, 1, var268 << 16 | var269);
                return;
            }
            if (arg0 == 6708) {
                field9687 -= 3;
                int var271 = field9685[field9687];
                int var272 = field9685[field9687 + 1];
                int var273 = field9685[field9687 + 2];
                class117.method1022("", true, var273, 2, var271 << 16 | var272);
                return;
            }
            if (arg0 == 6709) {
                field9687 -= 3;
                int var274 = field9685[field9687];
                int var275 = field9685[field9687 + 1];
                int var276 = field9685[field9687 + 2];
                class117.method1022("", true, var276, 3, var274 << 16 | var275);
                return;
            }
            if (arg0 == 6710) {
                field9687 -= 3;
                int var277 = field9685[field9687];
                int var278 = field9685[field9687 + 1];
                int var279 = field9685[field9687 + 2];
                class117.method1022("", true, var279, 4, var277 << 16 | var278);
                return;
            }
            if (arg0 == 6711) {
                field9687 -= 3;
                int var280 = field9685[field9687];
                int var281 = field9685[field9687 + 1];
                int var282 = field9685[field9687 + 2];
                class117.method1022("", true, var282, 5, var280 << 16 | var281);
                return;
            }
            if (arg0 == 6712) {
                field9687 -= 3;
                int var283 = field9685[field9687];
                int var284 = field9685[field9687 + 1];
                int var285 = field9685[field9687 + 2];
                class117.method1022("", true, var285, 6, var283 << 16 | var284);
                return;
            }
            if (arg0 == 6713) {
                field9687 -= 3;
                int var286 = field9685[field9687];
                int var287 = field9685[field9687 + 1];
                int var288 = field9685[field9687 + 2];
                class117.method1022("", true, var288, 7, var286 << 16 | var287);
                return;
            }
            if (arg0 == 6714) {
                field9687 -= 3;
                int var289 = field9685[field9687];
                int var290 = field9685[field9687 + 1];
                int var291 = field9685[field9687 + 2];
                class117.method1022("", true, var291, 8, var289 << 16 | var290);
                return;
            }
            if (arg0 == 6715) {
                field9687 -= 3;
                int var292 = field9685[field9687];
                int var293 = field9685[field9687 + 1];
                int var294 = field9685[field9687 + 2];
                class117.method1022("", true, var294, 9, var292 << 16 | var293);
                return;
            }
            if (arg0 == 6716) {
                field9687 -= 3;
                int var295 = field9685[field9687];
                int var296 = field9685[field9687 + 1];
                int var297 = field9685[field9687 + 2];
                class117.method1022("", true, var297, 10, var295 << 16 | var296);
                return;
            }
            if (arg0 == 6717) {
                field9687 -= 3;
                int var298 = field9685[field9687];
                int var299 = field9685[field9687 + 1];
                int var300 = field9685[field9687 + 2];
                class545 var301 = class183.method1339(var298 << 16 | var299, (byte) 50, var300);
                class612.method3511(true);
                class615 var302 = client.method1825(var301);
                class55.method640(var302.method3528((byte) 2), -70, var302.field8934, var301);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field9685[--field9687];
                class288 var304 = class342.field5099.method3355(var303, (byte) 75);
                if (var304.field4308 == null) {
                    field9682[field9693++] = "";
                    return;
                }
                field9682[field9693++] = var304.field4308;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field9685[--field9687];
                class288 var306 = class342.field5099.method3355(var305, (byte) 90);
                field9685[field9687++] = var306.field4306;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field9685[--field9687];
                class288 var308 = class342.field5099.method3355(var307, (byte) 68);
                field9685[field9687++] = var308.field4297;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field9685[--field9687];
                class288 var310 = class342.field5099.method3355(var309, (byte) -123);
                field9685[field9687++] = var310.field4320;
                return;
            }
            if (arg0 == 6804) {
                field9687 -= 2;
                int var311 = field9685[field9687];
                int var312 = field9685[field9687 + 1];
                class445 var313 = client.field4124.method980(51, var312);
                if (var313.method2677(77)) {
                    field9682[field9693++] = class342.field5099.method3355(var311, (byte) 68).method1914(var313.field6403, 2, var312);
                    return;
                }
                field9685[field9687++] = class342.field5099.method3355(var311, (byte) 19).method1917(-21891, var313.field6413, var312);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field9685[field9687++] = class301.field4474 && !class231.field3466 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field9685[field9687++] = class246.field3708;
                return;
            }
            if (arg0 == 6902) {
                field9685[field9687++] = class565.field8255;
                return;
            }
            if (arg0 == 6903) {
                field9685[field9687++] = class393.field5752;
                return;
            }
            if (arg0 == 6904) {
                field9685[field9687++] = class578.field8403;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class432.field6237 != null) {
                    if (class432.field6237.field6499 == null) {
                        var314 = class223.method1532((byte) 93, class432.field6237.field6503);
                    } else {
                        var314 = (String) class432.field6237.field6499;
                    }
                }
                field9682[field9693++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field9685[field9687++] = class147.field2550;
                return;
            }
            if (arg0 == 6907) {
                field9685[field9687++] = class444.field6387;
                return;
            }
            if (arg0 == 6908) {
                field9685[field9687++] = class550.field7803;
                return;
            }
            if (arg0 == 6909) {
                field9685[field9687++] = class389.field5681 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field9685[field9687++] = class156.field2672;
                return;
            }
            if (arg0 == 6911) {
                field9685[field9687++] = class370.field5490;
                return;
            }
            if (arg0 == 6912) {
                field9685[field9687++] = class600.field8601;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class527.field7429.method2817(-114);
                field9685[field9687++] = class527.field7429.field6669 = class90.field1654;
                field9685[field9687++] = var315;
                class310.method2026((byte) 69);
                class527.field7429.method2809(class604.field8775, (byte) -44);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7001) {
                class527.field7429.method2814(-13084);
                class310.method2026((byte) 105);
                class527.field7429.method2809(class604.field8775, (byte) -74);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7002) {
                class527.field7429.method2807(-119);
                class310.method2026((byte) 100);
                class527.field7429.method2809(class604.field8775, (byte) -29);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7003) {
                class527.field7429.method2805((byte) -127);
                class310.method2026((byte) 114);
                class527.field7429.method2809(class604.field8775, (byte) -119);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7004) {
                class527.field7429.method2808(102, true);
                class310.method2026((byte) 91);
                class527.field7429.method2809(class604.field8775, (byte) 63);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7005) {
                class527.field7429.field2649 = 0;
                class527.field7429.method2809(class604.field8775, (byte) -80);
                class33.field966 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class527.field7429.field6669 == 2) {
                    class527.field7429.field6672 = true;
                    return;
                }
                if (class527.field7429.field6669 == 1) {
                    class527.field7429.field6648 = true;
                    return;
                }
                if (class527.field7429.field6669 == 3) {
                    class527.field7429.field6664 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field9685[field9687++] = class527.field7429.field2649;
                return;
            }
            if (arg0 == 7008) {
                if (class90.field1654 == 0 && class681.field9649 < 96) {
                    field9685[field9687++] = 1;
                    return;
                }
                field9685[field9687++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lte;II)V")
    public static final void method3844(class571 arg0, int arg1, int arg2) {
        class356 var3 = class689.method3864((byte) 57, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field9698 = new int[var3.field5327];
        field9683 = new String[var3.field5324];
        if (class512.field7232 == var3.field5326 || class43.field1087 == var3.field5326 || class507.field7185 == var3.field5326) {
            int var4 = 0;
            int var5 = 0;
            if (class36.field1037 != null) {
                var4 = class36.field1037.field7751;
                var5 = class36.field1037.field7592;
            }
            field9698[0] = class410.field5945.method1931(-23081) - var4;
            field9698[1] = class410.field5945.method1936(127) - var5;
        }
        method3838(var3, 200000);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static final void method3845(int arg0) {
        if (arg0 == -1 || !class225.method1539(arg0, 4)) {
            return;
        }
        class545[] var1 = class156.field2667[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class545 var3 = var1[var2];
            if (var3.field7659 != null) {
                class476 var4 = new class476();
                var4.field6850 = var3;
                var4.field6842 = var3.field7659;
                method3851(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V")
    public static void method3846() {
        field9698 = null;
        field9683 = null;
        field9700 = null;
        field9689 = null;
        field9685 = null;
        field9682 = null;
        field9686 = null;
        field9684 = null;
        field9679 = null;
        field9699 = null;
        field9688 = null;
        field9702 = null;
        field9701 = null;
        field9703 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Luca;)V")
    public static final void method3847(class476 arg0) {
        method3851(arg0, 200000);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    private static final void method3848(int arg0) {
        class545 var1 = class415.method2533((byte) -90, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class545[] var3 = class91.field1668[var2];
        if (var3 == null) {
            class545[] var4 = class156.field2667[var2];
            int var5 = var4.length;
            var3 = class91.field1668[var2] = new class545[var5];
            class692.method3875(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class692.method3875(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method3849(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field9688.setTime(new Date(var1));
        int var3 = field9688.get(5);
        int var4 = field9688.get(2);
        int var5 = field9688.get(1);
        return var3 + "-" + field9702[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()V")
    public static final void method3850() {
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Luca;I)V")
    private static final void method3851(class476 arg0, int arg1) {
        Object[] var2 = arg0.field6842;
        int var3 = (Integer) var2[0];
        class356 var4 = class117.method1025(var3, -89);
        if (var4 == null) {
            return;
        }
        field9698 = new int[var4.field5327];
        int var5 = 0;
        field9683 = new String[var4.field5324];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6847;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6840;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6850 == null ? -1 : arg0.field6850.field7755;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6846;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6850 == null ? -1 : arg0.field6850.field7697;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6851 == null ? -1 : arg0.field6851.field7755;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6851 == null ? -1 : arg0.field6851.field7697;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6843;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6845;
                }
                field9698[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6844;
                }
                field9683[var6++] = var9;
            }
        }
        field9704 = arg0.field6841;
        method3838(var4, arg1);
    }
}
