import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class343 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "[I")
    private static int[] field5282 = new int[1000];

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    private static int field5290 = 0;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lam;")
    private static class454[] field5285 = new class454[50];

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "[I")
    private static int[] field5295 = new int[5];

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field5301 = new String[1000];

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "[[I")
    private static int[][] field5291 = new int[5][5000];

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    private static int field5303 = 0;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    private static int field5289 = 0;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5280 = Calendar.getInstance();

    @OriginalMember(owner = "client!kp", name = "z", descriptor = "[I")
    private static int[] field5305 = new int[3];

    @OriginalMember(owner = "client!kp", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field5306 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kp", name = "C", descriptor = "Lwi;")
    public static class330 field5307 = new class330(4);

    @OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
    private static int field5308 = 0;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "Lmm;")
    private static class186 field5292;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Lga;")
    private static class282 field5288;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "Lga;")
    private static class282 field5302;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "[I")
    private static int[] field5297;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "[Ljava/lang/String;")
    private static String[] field5298;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    private static final void method2214(int arg0) {
        class282 var1 = class21.method194(-118, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class282[] var3 = class41.field614[var2];
        if (var3 == null) {
            class282[] var4 = class263.field3690[var2];
            int var5 = var4.length;
            var3 = class41.field614[var2] = new class282[var5];
            class192.method1297(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class192.method1297(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
    public static final void method2215(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
    public static final void method2216() {
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lew;I)V")
    private static final void method2217(class346 arg0, int arg1) {
        field5289 = 0;
        field5290 = 0;
        int var2 = -1;
        int[] var3 = arg0.field5343;
        int[] var4 = arg0.field5341;
        byte var5 = -1;
        field5303 = 0;
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
                        method2224(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2226(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field5282[field5289++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field5282[field5289++] = class288.field4208.field1208[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class288.field4208.method568(var8, 128, field5282[--field5289]);
                } else if (var43 == 3) {
                    field5301[field5290++] = arg0.field5344[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field5289 -= 2;
                    if (field5282[field5289 + 1] != field5282[field5289]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field5289 -= 2;
                    if (field5282[field5289 + 1] == field5282[field5289]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field5289 -= 2;
                    if (field5282[field5289] < field5282[field5289 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field5289 -= 2;
                    if (field5282[field5289] > field5282[field5289 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5303 == 0) {
                        return;
                    }
                    class454 var9 = field5285[--field5303];
                    arg0 = var9.field6832;
                    var3 = arg0.field5343;
                    var4 = arg0.field5341;
                    var2 = var9.field6833;
                    field5297 = var9.field6836;
                    field5298 = var9.field6835;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field5282[field5289++] = class288.field4208.method571(var10, -7128);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class288.field4208.method567(field5282[--field5289], var11, 0);
                } else if (var43 == 31) {
                    field5289 -= 2;
                    if (field5282[field5289] <= field5282[field5289 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field5289 -= 2;
                    if (field5282[field5289] >= field5282[field5289 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field5282[field5289++] = field5297[var4[var2]];
                } else if (var43 == 34) {
                    field5297[var4[var2]] = field5282[--field5289];
                } else if (var43 == 35) {
                    field5301[field5290++] = field5298[var4[var2]];
                } else if (var43 == 36) {
                    field5298[var4[var2]] = field5301[--field5290];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field5290 -= var12;
                    String var13 = class384.method2406((byte) -1, field5301, field5290, var12);
                    field5301[field5290++] = var13;
                } else if (var43 == 38) {
                    field5289--;
                } else if (var43 == 39) {
                    field5290--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class346 var15 = class458.method2777(4069, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field5331];
                    String[] var17 = new String[var15.field5332];
                    for (int var18 = 0; var18 < var15.field5338; var18++) {
                        var16[var18] = field5282[field5289 + var18 - var15.field5338];
                    }
                    for (int var19 = 0; var19 < var15.field5333; var19++) {
                        var17[var19] = field5301[field5290 + var19 - var15.field5333];
                    }
                    field5289 -= var15.field5338;
                    field5290 -= var15.field5333;
                    class454 var20 = new class454();
                    var20.field6832 = arg0;
                    var20.field6833 = var2;
                    var20.field6836 = field5297;
                    var20.field6835 = field5298;
                    if (field5303 >= field5285.length) {
                        throw new RuntimeException();
                    }
                    field5285[field5303++] = var20;
                    arg0 = var15;
                    var3 = var15.field5343;
                    var4 = var15.field5341;
                    var2 = -1;
                    field5297 = var16;
                    field5298 = var17;
                } else if (var43 == 42) {
                    field5282[field5289++] = class331.field5170[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class331.field5170[var21] = field5282[--field5289];
                    class102.method668(var21, (byte) -89);
                    class298.field4388 |= class534.field7852[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field5282[--field5289];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5295[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5291[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field5282[--field5289];
                    if (var28 < 0 || var28 >= field5295[var27]) {
                        throw new RuntimeException();
                    }
                    field5282[field5289++] = field5291[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field5289 -= 2;
                    int var30 = field5282[field5289];
                    if (var30 < 0 || var30 >= field5295[var29]) {
                        throw new RuntimeException();
                    }
                    field5291[var29][var30] = field5282[field5289 + 1];
                } else if (var43 == 47) {
                    String var31 = class429.field6543[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5301[field5290++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class429.field6543[var32] = field5301[--field5290];
                    class276.method1781(24, var32);
                } else if (var43 == 51) {
                    class272 var33 = arg0.field5335[var4[var2]];
                    class160 var34 = (class160) var33.method1747((long) field5282[--field5289], false);
                    if (var34 != null) {
                        var2 += var34.field2088;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field5334 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field35).append(" ");
                for (int var41 = field5303 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field5285[var41].field6832.field35).append(" ");
                }
                var40.append("op: ").append(var5);
                class395.method2457(var40.toString(), var42, 1);
            } else {
                class62.method444(95, "Clientscript error in: " + arg0.field5334);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field5334).append("\n");
                for (int var38 = field5303 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field5285[var38].field6832.field5334).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class395.method2457(var37.toString(), var42, 1);
                class230.method1548(var37.toString(), 119);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    private static final void method2218(int arg0) {
        class282 var1 = class21.method194(-117, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class282[] var3 = class41.field614[var2];
        if (var3 == null) {
            class282[] var4 = class263.field3690[var2];
            int var5 = var4.length;
            var3 = class41.field614[var2] = new class282[var5];
            class192.method1297(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class192.method1297(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    public static final void method2219(int arg0) {
        if (arg0 == -1 || !class86.method587(-112, arg0)) {
            return;
        }
        class282[] var1 = class263.field3690[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class282 var3 = var1[var2];
            if (var3.field4004 != null) {
                class143 var4 = new class143();
                var4.field1903 = var3;
                var4.field1912 = var3.field4004;
                method2223(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lip;II)V")
    public static final void method2220(class508 arg0, int arg1, int arg2) {
        class346 var3 = class230.method1552(-2023956720, arg0, arg1, arg2);
        if (var3 == null) {
            return;
        }
        field5297 = new int[var3.field5331];
        field5298 = new String[var3.field5332];
        if (class340.field5268 == var3.field5337 || class452.field6817 == var3.field5337 || class511.field7500 == var3.field5337) {
            int var4 = 0;
            int var5 = 0;
            if (class120.field1643 != null) {
                var4 = class120.field1643.field4032;
                var5 = class120.field1643.field4010;
            }
            field5297[0] = class502.field7404.method2323((byte) -89) - var4;
            field5297[1] = class502.field7404.method2325(-91) - var5;
        }
        method2217(var3, 200000);
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2221(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5280.setTime(new Date(var1));
        int var3 = field5280.get(5);
        int var4 = field5280.get(2);
        int var5 = field5280.get(1);
        return var3 + "-" + field5306[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2222(String arg0, int arg1) {
        if (class257.field3562 == 0 && !(!class230.field3300 || class60.field865) || class195.field2613) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class174.field2336.method2705((byte) 69, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class174.field2336.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class110.field1547.method2705((byte) 69, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class110.field1547.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class137.field1828.method2705((byte) 69, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class137.field1828.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class90.field1312.method2705((byte) 69, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class90.field1312.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class203.field2717.method2705((byte) 69, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class203.field2717.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class284.field4168.method2705((byte) 69, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class284.field4168.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class143.field1907.method2705((byte) 69, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class143.field1907.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class186.field2503.method2705((byte) 69, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class186.field2503.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class259.field3657.method2705((byte) 69, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class259.field3657.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class513.field7542.method2705((byte) 69, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class513.field7542.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class431.field6564.method2705((byte) 69, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class431.field6564.method2705((byte) 69, 0).length());
        } else if (var2.startsWith(class383.field5826.method2705((byte) 69, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class383.field5826.method2705((byte) 69, 0).length());
        } else if (class257.field3556 != 0) {
            if (var2.startsWith(class174.field2336.method2705((byte) 69, class257.field3556))) {
                var3 = 0;
                arg0 = arg0.substring(class174.field2336.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class110.field1547.method2705((byte) 69, class257.field3556))) {
                var3 = 1;
                arg0 = arg0.substring(class110.field1547.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class137.field1828.method2705((byte) 69, class257.field3556))) {
                var3 = 2;
                arg0 = arg0.substring(class137.field1828.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class90.field1312.method2705((byte) 69, class257.field3556))) {
                var3 = 3;
                arg0 = arg0.substring(class90.field1312.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class203.field2717.method2705((byte) 69, class257.field3556))) {
                var3 = 4;
                arg0 = arg0.substring(class203.field2717.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class284.field4168.method2705((byte) 69, class257.field3556))) {
                var3 = 5;
                arg0 = arg0.substring(class284.field4168.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class143.field1907.method2705((byte) 69, class257.field3556))) {
                var3 = 6;
                arg0 = arg0.substring(class143.field1907.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class186.field2503.method2705((byte) 69, class257.field3556))) {
                var3 = 7;
                arg0 = arg0.substring(class186.field2503.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class259.field3657.method2705((byte) 69, class257.field3556))) {
                var3 = 8;
                arg0 = arg0.substring(class259.field3657.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class513.field7542.method2705((byte) 69, class257.field3556))) {
                var3 = 9;
                arg0 = arg0.substring(class513.field7542.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class431.field6564.method2705((byte) 69, class257.field3556))) {
                var3 = 10;
                arg0 = arg0.substring(class431.field6564.method2705((byte) 69, class257.field3556).length());
            } else if (var2.startsWith(class383.field5826.method2705((byte) 69, class257.field3556))) {
                var3 = 11;
                arg0 = arg0.substring(class383.field5826.method2705((byte) 69, class257.field3556).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class133.field1788.method2705((byte) 69, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class133.field1788.method2705((byte) 69, 0).length());
        } else if (var4.startsWith(class387.field5912.method2705((byte) 69, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class387.field5912.method2705((byte) 69, 0).length());
        } else if (var4.startsWith(class354.field5475.method2705((byte) 69, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class354.field5475.method2705((byte) 69, 0).length());
        } else if (var4.startsWith(class394.field6026.method2705((byte) 69, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class394.field6026.method2705((byte) 69, 0).length());
        } else if (var4.startsWith(class214.field3030.method2705((byte) 69, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class214.field3030.method2705((byte) 69, 0).length());
        } else if (class257.field3556 != 0) {
            if (var4.startsWith(class133.field1788.method2705((byte) 69, class257.field3556))) {
                var5 = 1;
                arg0 = arg0.substring(class133.field1788.method2705((byte) 69, class257.field3556).length());
            } else if (var4.startsWith(class387.field5912.method2705((byte) 69, class257.field3556))) {
                var5 = 2;
                arg0 = arg0.substring(class387.field5912.method2705((byte) 69, class257.field3556).length());
            } else if (var4.startsWith(class354.field5475.method2705((byte) 69, class257.field3556))) {
                var5 = 3;
                arg0 = arg0.substring(class354.field5475.method2705((byte) 69, class257.field3556).length());
            } else if (var4.startsWith(class394.field6026.method2705((byte) 69, class257.field3556))) {
                var5 = 4;
                arg0 = arg0.substring(class394.field6026.method2705((byte) 69, class257.field3556).length());
            } else if (var4.startsWith(class214.field3030.method2705((byte) 69, class257.field3556))) {
                var5 = 5;
                arg0 = arg0.substring(class214.field3030.method2705((byte) 69, class257.field3556).length());
            }
        }
        field5281++;
        class424.method2582(class496.field7317, -1);
        class538.field7879.method1072((byte) 102, 0);
        int var6 = class538.field7879.field2185;
        if (arg1 == 5021) {
            class538.field7879.method1072((byte) 102, 1);
        } else if (arg1 == 5022) {
            class538.field7879.method1072((byte) 102, 2);
        } else {
            class538.field7879.method1072((byte) 102, 0);
        }
        class538.field7879.method1072((byte) 102, var3);
        class538.field7879.method1072((byte) 102, var5);
        class146.method967(arg0, class538.field7879, 35);
        class538.field7879.method1082(-32769, class538.field7879.field2185 - var6);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Leq;I)V")
    private static final void method2223(class143 arg0, int arg1) {
        Object[] var2 = arg0.field1912;
        int var3 = (Integer) var2[0];
        class346 var4 = class458.method2777(4069, var3);
        if (var4 == null) {
            return;
        }
        field5297 = new int[var4.field5331];
        int var5 = 0;
        field5298 = new String[var4.field5332];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1905;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1902;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1903 == null ? -1 : arg0.field1903.field4029;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1901;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1903 == null ? -1 : arg0.field1903.field4031;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1911 == null ? -1 : arg0.field1911.field4029;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1911 == null ? -1 : arg0.field1911.field4031;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1909;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1900;
                }
                field5297[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1906;
                }
                field5298[var6++] = var9;
            }
        }
        field5308 = arg0.field1910;
        method2217(var4, arg1);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IZ)V")
    private static final void method2224(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field5289 -= 3;
                int var2 = field5282[field5289];
                int var3 = field5282[field5289 + 1];
                int var4 = field5282[field5289 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class282 var5 = class21.method194(-118, var2);
                if (var5.field4108 == null) {
                    var5.field4108 = new class282[var4 + 1];
                }
                if (var5.field4108.length <= var4) {
                    class282[] var6 = new class282[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4108.length; var7++) {
                        var6[var7] = var5.field4108[var7];
                    }
                    var5.field4108 = var6;
                }
                if (var4 > 0 && var5.field4108[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class282 var8 = new class282();
                var8.field4103 = var3;
                var8.field4122 = var8.field4029 = var5.field4029;
                var8.field4031 = var4;
                var5.field4108[var4] = var8;
                if (arg1) {
                    field5288 = var8;
                } else {
                    field5302 = var8;
                }
                class206.method1385(2, var5);
                return;
            }
            if (arg0 == 101) {
                class282 var9 = arg1 ? field5288 : field5302;
                if (var9.field4031 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class282 var10 = class21.method194(-117, var9.field4029);
                var10.field4108[var9.field4031] = null;
                class206.method1385(2, var10);
                return;
            }
            if (arg0 == 102) {
                class282 var11 = class21.method194(-111, field5282[--field5289]);
                var11.field4108 = null;
                class206.method1385(2, var11);
                return;
            }
            if (arg0 == 200) {
                field5289 -= 2;
                int var12 = field5282[field5289];
                int var13 = field5282[field5289 + 1];
                class282 var14 = class178.method1197(var13, var12, 34);
                if (var14 != null && var13 != -1) {
                    field5282[field5289++] = 1;
                    if (arg1) {
                        field5288 = var14;
                        return;
                    }
                    field5302 = var14;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5282[--field5289];
                class282 var16 = class21.method194(-124, var15);
                if (var16 != null) {
                    field5282[field5289++] = 1;
                    if (arg1) {
                        field5288 = var16;
                        return;
                    }
                    field5302 = var16;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5282[--field5289];
                method2214(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5282[--field5289];
                method2218(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5289 -= 2;
                int var19 = field5282[field5289];
                int var20 = field5282[field5289 + 1];
                for (int var21 = 0; var21 < class172.field2323.length; var21++) {
                    if (class172.field2323[var21] == var19) {
                        class56.field800.field1401.method2493(true, class183.field2487, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class215.field3041.length; var22++) {
                    if (class215.field3041[var22] == var19) {
                        class56.field800.field1401.method2493(true, class183.field2487, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5289 -= 2;
                int var23 = field5282[field5289];
                int var24 = field5282[field5289 + 1];
                class56.field800.field1401.method2504(var24, var23, -85);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5282[--field5289] != 0;
                class56.field800.field1401.method2492(2, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class282 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class21.method194(-113, field5282[--field5289]);
            } else {
                var26 = arg1 ? field5288 : field5302;
            }
            if (arg0 == 1000) {
                field5289 -= 4;
                var26.field4130 = field5282[field5289];
                var26.field4155 = field5282[field5289 + 1];
                int var27 = field5282[field5289 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field5282[field5289 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field3993 = (byte) var27;
                var26.field4127 = (byte) var28;
                class206.method1385(2, var26);
                class525.method3113(-114, var26);
                if (var26.field4031 == -1) {
                    class491.method2930((byte) 117, var26.field4029);
                }
                return;
            }
            if (arg0 == 1001) {
                field5289 -= 4;
                var26.field4143 = field5282[field5289];
                var26.field4075 = field5282[field5289 + 1];
                var26.field4105 = 0;
                var26.field4154 = 0;
                int var29 = field5282[field5289 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field5282[field5289 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field4121 = (byte) var29;
                var26.field4006 = (byte) var30;
                class206.method1385(2, var26);
                class525.method3113(-107, var26);
                if (var26.field4103 == 0) {
                    class131.method893(var26, false, 1413331184);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field5282[--field5289] == 1;
                if (var26.field4020 != var31) {
                    var26.field4020 = var31;
                    class206.method1385(2, var26);
                }
                if (var26.field4031 == -1) {
                    class540.method3188(var26.field4029, 20758);
                }
                return;
            }
            if (arg0 == 1004) {
                field5289 -= 2;
                var26.field4101 = field5282[field5289];
                var26.field3988 = field5282[field5289 + 1];
                class206.method1385(2, var26);
                class525.method3113(64, var26);
                if (var26.field4103 == 0) {
                    class131.method893(var26, false, 1413331184);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field4013 = field5282[--field5289] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class282 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class21.method194(-117, field5282[--field5289]);
            } else {
                var32 = arg1 ? field5288 : field5302;
            }
            if (arg0 == 1100) {
                field5289 -= 2;
                var32.field4091 = field5282[field5289];
                if (var32.field4091 > var32.field4086 - var32.field3991) {
                    var32.field4091 = var32.field4086 - var32.field3991;
                }
                if (var32.field4091 < 0) {
                    var32.field4091 = 0;
                }
                var32.field4129 = field5282[field5289 + 1];
                if (var32.field4129 > var32.field4096 - var32.field4043) {
                    var32.field4129 = var32.field4096 - var32.field4043;
                }
                if (var32.field4129 < 0) {
                    var32.field4129 = 0;
                }
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class44.method351(var32.field4029, (byte) -83);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field4146 = field5282[--field5289];
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class503.method3016(29338, var32.field4029);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field4035 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field4125 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field4141 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field5282[--field5289];
                if (var32.field4104 != var33) {
                    var32.field4104 = var33;
                    class206.method1385(2, var32);
                }
                if (var32.field4031 == -1) {
                    class224.method1505(var32.field4029, (byte) -118);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field4053 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field4120 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field4069 = 1;
                var32.field4080 = field5282[--field5289];
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class229.method1541(var32.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1109) {
                field5289 -= 6;
                var32.field4110 = field5282[field5289];
                var32.field4066 = field5282[field5289 + 1];
                var32.field4068 = field5282[field5289 + 2];
                var32.field4003 = field5282[field5289 + 3];
                var32.field3992 = field5282[field5289 + 4];
                var32.field4090 = field5282[field5289 + 5];
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class492.method2936(8, var32.field4029);
                    class22.method203(var32.field4029, (byte) -98);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field5282[--field5289];
                if (var32.field4061 != var34) {
                    var32.field4061 = var34;
                    var32.field4015 = 0;
                    var32.field4050 = 1;
                    var32.field4135 = 0;
                    class206.method1385(2, var32);
                }
                if (var32.field4031 == -1) {
                    class507.method3036(124, var32.field4029);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field3995 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field5301[--field5290];
                if (!var35.equals(var32.field4073)) {
                    var32.field4073 = var35;
                    class206.method1385(2, var32);
                }
                if (var32.field4031 == -1) {
                    class101.method665(var32.field4029, 5739);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field4113 = field5282[--field5289];
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class296.method1890(0, var32.field4029);
                }
                return;
            }
            if (arg0 == 1114) {
                field5289 -= 3;
                var32.field4063 = field5282[field5289];
                var32.field4033 = field5282[field5289 + 1];
                var32.field4040 = field5282[field5289 + 2];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field4022 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field4021 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field4060 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field4065 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field4133 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1120) {
                field5289 -= 2;
                var32.field4086 = field5282[field5289];
                var32.field4096 = field5282[field5289 + 1];
                class206.method1385(2, var32);
                if (var32.field4103 == 0) {
                    class131.method893(var32, false, 1413331184);
                }
                return;
            }
            if (arg0 == 1121) {
                field5289 -= 2;
                var32.field4144 = (short) field5282[field5289];
                var32.field4131 = (short) field5282[field5289 + 1];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field4071 = field5282[--field5289] == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field4090 = field5282[--field5289];
                class206.method1385(2, var32);
                if (var32.field4031 == -1) {
                    class492.method2936(8, var32.field4029);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field5282[--field5289];
                var32.field4005 = var36 == 1;
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1125) {
                field5289 -= 2;
                var32.field4092 = field5282[field5289];
                var32.field4077 = field5282[field5289 + 1];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field4134 = field5282[--field5289];
                class206.method1385(2, var32);
                return;
            }
            if (arg0 == 1127) {
                field5289 -= 2;
                int var37 = field5282[field5289];
                int var38 = field5282[field5289 + 1];
                class205 var39 = class83.field1218.method3118(var37, -13676);
                if (var39.field2727 != var38) {
                    var32.method1806(var37, var38, (byte) -95);
                    return;
                }
                var32.method1814(0, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field5282[--field5289];
                String var41 = field5301[--field5290];
                class205 var42 = class83.field1218.method3118(var40, -13676);
                if (!var42.field2729.equals(var41)) {
                    var32.method1810(-62, var41, var40);
                    return;
                }
                var32.method1814(0, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class282 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class21.method194(-109, field5282[--field5289]);
            } else {
                var43 = arg1 ? field5288 : field5302;
            }
            class206.method1385(2, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5289 -= 2;
                int var44 = field5282[field5289];
                int var45 = field5282[field5289 + 1];
                if (var43.field4031 == -1) {
                    class375.method2361(-101, var43.field4029);
                    class492.method2936(8, var43.field4029);
                    class22.method203(var43.field4029, (byte) -81);
                }
                if (var44 == -1) {
                    var43.field4069 = 1;
                    var43.field4080 = -1;
                    var43.field4012 = -1;
                    return;
                }
                var43.field4012 = var44;
                var43.field4042 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field4034 = true;
                } else {
                    var43.field4034 = false;
                }
                class74 var46 = class103.field1489.method1603((byte) -99, var44);
                var43.field4068 = var46.field1079;
                var43.field4003 = var46.field1061;
                var43.field3992 = var46.field1052;
                var43.field4110 = var46.field1042;
                var43.field4066 = var46.field1064;
                var43.field4090 = var46.field1056;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field4102 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field4102 = 1;
                } else {
                    var43.field4102 = 2;
                }
                if (var43.field4105 > 0) {
                    var43.field4090 = var43.field4090 * 32 / var43.field4105;
                    return;
                }
                if (var43.field4143 > 0) {
                    var43.field4090 = var43.field4090 * 32 / var43.field4143;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field4069 = 2;
                var43.field4080 = field5282[--field5289];
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field4069 = 3;
                var43.field4080 = -1;
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field4069 = 6;
                var43.field4080 = field5282[--field5289];
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field4069 = 5;
                var43.field4080 = field5282[--field5289];
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1206) {
                field5289 -= 4;
                var43.field4117 = field5282[field5289];
                var43.field4084 = field5282[field5289 + 1];
                var43.field4039 = field5282[field5289 + 2];
                var43.field4059 = field5282[field5289 + 3];
                class206.method1385(2, var43);
                return;
            }
            if (arg0 == 1207) {
                field5289 -= 2;
                var43.field4009 = field5282[field5289];
                var43.field4081 = field5282[field5289 + 1];
                class206.method1385(2, var43);
                return;
            }
            if (arg0 == 1210) {
                field5289 -= 4;
                var43.field4080 = field5282[field5289];
                var43.field4140 = field5282[field5289 + 1];
                if (field5282[field5289 + 2] == 1) {
                    var43.field4069 = 9;
                } else {
                    var43.field4069 = 8;
                }
                if (field5282[field5289 + 3] == 1) {
                    var43.field4034 = true;
                } else {
                    var43.field4034 = false;
                }
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field4069 = 5;
                var43.field4080 = class350.field5400;
                var43.field4140 = 0;
                if (var43.field4031 == -1) {
                    class229.method1541(var43.field4029, 30916);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class282 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class21.method194(-105, field5282[--field5289]);
                } else {
                    var58 = arg1 ? field5288 : field5302;
                }
                String var59 = field5301[--field5290];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field5282[--field5289];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field5282[--field5289];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field5301[--field5290];
                    } else {
                        var62[var63] = Integer.valueOf(field5282[--field5289]);
                    }
                }
                int var64 = field5282[--field5289];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field4111 = var62;
                } else if (arg0 == 1401) {
                    var58.field4076 = var62;
                } else if (arg0 == 1402) {
                    var58.field4030 = var62;
                } else if (arg0 == 1403) {
                    var58.field4107 = var62;
                } else if (arg0 == 1404) {
                    var58.field4145 = var62;
                } else if (arg0 == 1405) {
                    var58.field4128 = var62;
                } else if (arg0 == 1406) {
                    var58.field3997 = var62;
                } else if (arg0 == 1407) {
                    var58.field4147 = var62;
                    var58.field4094 = var60;
                } else if (arg0 == 1408) {
                    var58.field4087 = var62;
                } else if (arg0 == 1409) {
                    var58.field4007 = var62;
                } else if (arg0 == 1410) {
                    var58.field4132 = var62;
                } else if (arg0 == 1411) {
                    var58.field4055 = var62;
                } else if (arg0 == 1412) {
                    var58.field3998 = var62;
                } else if (arg0 == 1414) {
                    var58.field3999 = var62;
                    var58.field4008 = var60;
                } else if (arg0 == 1415) {
                    var58.field4064 = var62;
                    var58.field4036 = var60;
                } else if (arg0 == 1416) {
                    var58.field3996 = var62;
                } else if (arg0 == 1417) {
                    var58.field4099 = var62;
                } else if (arg0 == 1418) {
                    var58.field4056 = var62;
                } else if (arg0 == 1419) {
                    var58.field4083 = var62;
                } else if (arg0 == 1420) {
                    var58.field4082 = var62;
                } else if (arg0 == 1421) {
                    var58.field4089 = var62;
                } else if (arg0 == 1422) {
                    var58.field4027 = var62;
                } else if (arg0 == 1423) {
                    var58.field4044 = var62;
                } else if (arg0 == 1424) {
                    var58.field4098 = var62;
                } else if (arg0 == 1425) {
                    var58.field4048 = var62;
                } else if (arg0 == 1426) {
                    var58.field4057 = var62;
                } else if (arg0 == 1427) {
                    var58.field4011 = var62;
                } else if (arg0 == 1428) {
                    var58.field4019 = var62;
                    var58.field4049 = var60;
                } else if (arg0 == 1429) {
                    var58.field4037 = var62;
                    var58.field4106 = var60;
                } else if (arg0 == 1430) {
                    var58.field4119 = var62;
                }
                var58.field4152 = true;
                return;
            }
            if (arg0 < 1600) {
                class282 var65 = arg1 ? field5288 : field5302;
                if (arg0 == 1500) {
                    field5282[field5289++] = var65.field4032;
                    return;
                }
                if (arg0 == 1501) {
                    field5282[field5289++] = var65.field4010;
                    return;
                }
                if (arg0 == 1502) {
                    field5282[field5289++] = var65.field3991;
                    return;
                }
                if (arg0 == 1503) {
                    field5282[field5289++] = var65.field4043;
                    return;
                }
                if (arg0 == 1504) {
                    field5282[field5289++] = var65.field4020 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field5282[field5289++] = var65.field4122;
                    return;
                }
                if (arg0 == 1506) {
                    class282 var66 = class357.method2291(var65, -1);
                    field5282[field5289++] = var66 == null ? -1 : var66.field4029;
                    return;
                }
            } else if (arg0 < 1700) {
                class282 var67 = arg1 ? field5288 : field5302;
                if (arg0 == 1600) {
                    field5282[field5289++] = var67.field4091;
                    return;
                }
                if (arg0 == 1601) {
                    field5282[field5289++] = var67.field4129;
                    return;
                }
                if (arg0 == 1602) {
                    field5301[field5290++] = var67.field4073;
                    return;
                }
                if (arg0 == 1603) {
                    field5282[field5289++] = var67.field4086;
                    return;
                }
                if (arg0 == 1604) {
                    field5282[field5289++] = var67.field4096;
                    return;
                }
                if (arg0 == 1605) {
                    field5282[field5289++] = var67.field4090;
                    return;
                }
                if (arg0 == 1606) {
                    field5282[field5289++] = var67.field4068;
                    return;
                }
                if (arg0 == 1607) {
                    field5282[field5289++] = var67.field3992;
                    return;
                }
                if (arg0 == 1608) {
                    field5282[field5289++] = var67.field4003;
                    return;
                }
                if (arg0 == 1609) {
                    field5282[field5289++] = var67.field4125;
                    return;
                }
                if (arg0 == 1610) {
                    field5282[field5289++] = var67.field4110;
                    return;
                }
                if (arg0 == 1611) {
                    field5282[field5289++] = var67.field4066;
                    return;
                }
                if (arg0 == 1612) {
                    field5282[field5289++] = var67.field4104;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field5282[--field5289];
                    class205 var69 = class83.field1218.method3118(var68, -13676);
                    if (var69.method1383(22243)) {
                        field5301[field5290++] = var67.method1808(var69.field2729, 87, var68);
                        return;
                    }
                    field5282[field5289++] = var67.method1803(var69.field2727, (byte) -33, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class282 var70 = arg1 ? field5288 : field5302;
                if (arg0 == 1700) {
                    field5282[field5289++] = var70.field4012;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field4012 != -1) {
                        field5282[field5289++] = var70.field4042;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field5282[field5289++] = var70.field4031;
                    return;
                }
            } else if (arg0 < 1900) {
                class282 var71 = arg1 ? field5288 : field5302;
                if (arg0 == 1800) {
                    field5282[field5289++] = client.method1348(var71).method2699(1661101682);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field5282[--field5289];
                    int var334 = var72 - 1;
                    if (var71.field4136 != null && var334 < var71.field4136.length && var71.field4136[var334] != null) {
                        field5301[field5290++] = var71.field4136[var334];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field4116 == null) {
                        field5301[field5290++] = "";
                        return;
                    }
                    field5301[field5290++] = var71.field4116;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class282 var332;
                if (arg0 >= 2000) {
                    var332 = class21.method194(-121, field5282[--field5289]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field5288 : field5302;
                }
                if (field5308 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field4011 == null) {
                        return;
                    }
                    class143 var333 = new class143();
                    var333.field1903 = var332;
                    var333.field1912 = var332.field4011;
                    var333.field1910 = field5308 + 1;
                    class518.field7619.method453((byte) 104, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class282 var73 = class21.method194(-111, field5282[--field5289]);
                if (arg0 == 2500) {
                    field5282[field5289++] = var73.field4032;
                    return;
                }
                if (arg0 == 2501) {
                    field5282[field5289++] = var73.field4010;
                    return;
                }
                if (arg0 == 2502) {
                    field5282[field5289++] = var73.field3991;
                    return;
                }
                if (arg0 == 2503) {
                    field5282[field5289++] = var73.field4043;
                    return;
                }
                if (arg0 == 2504) {
                    field5282[field5289++] = var73.field4020 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field5282[field5289++] = var73.field4122;
                    return;
                }
                if (arg0 == 1506) {
                    class282 var74 = class357.method2291(var73, -1);
                    field5282[field5289++] = var74 == null ? -1 : var74.field4029;
                    return;
                }
            } else if (arg0 < 2700) {
                class282 var75 = class21.method194(-109, field5282[--field5289]);
                if (arg0 == 2600) {
                    field5282[field5289++] = var75.field4091;
                    return;
                }
                if (arg0 == 2601) {
                    field5282[field5289++] = var75.field4129;
                    return;
                }
                if (arg0 == 2602) {
                    field5301[field5290++] = var75.field4073;
                    return;
                }
                if (arg0 == 2603) {
                    field5282[field5289++] = var75.field4086;
                    return;
                }
                if (arg0 == 2604) {
                    field5282[field5289++] = var75.field4096;
                    return;
                }
                if (arg0 == 2605) {
                    field5282[field5289++] = var75.field4090;
                    return;
                }
                if (arg0 == 2606) {
                    field5282[field5289++] = var75.field4068;
                    return;
                }
                if (arg0 == 2607) {
                    field5282[field5289++] = var75.field3992;
                    return;
                }
                if (arg0 == 2608) {
                    field5282[field5289++] = var75.field4003;
                    return;
                }
                if (arg0 == 2609) {
                    field5282[field5289++] = var75.field4125;
                    return;
                }
                if (arg0 == 2610) {
                    field5282[field5289++] = var75.field4110;
                    return;
                }
                if (arg0 == 2611) {
                    field5282[field5289++] = var75.field4066;
                    return;
                }
                if (arg0 == 2612) {
                    field5282[field5289++] = var75.field4104;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class282 var76 = class21.method194(-107, field5282[--field5289]);
                    field5282[field5289++] = var76.field4012;
                    return;
                }
                if (arg0 == 2701) {
                    class282 var77 = class21.method194(-108, field5282[--field5289]);
                    if (var77.field4012 != -1) {
                        field5282[field5289++] = var77.field4042;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field5282[--field5289];
                    class436 var79 = (class436) class312.field4570.method1747((long) var78, false);
                    if (var79 != null) {
                        field5282[field5289++] = 1;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class282 var80 = class21.method194(-105, field5282[--field5289]);
                    if (var80.field4108 == null) {
                        field5282[field5289++] = 0;
                        return;
                    }
                    int var81 = var80.field4108.length;
                    for (int var82 = 0; var82 < var80.field4108.length; var82++) {
                        if (var80.field4108[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field5282[field5289++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field5289 -= 2;
                    int var83 = field5282[field5289];
                    int var84 = field5282[field5289 + 1];
                    class436 var85 = (class436) class312.field4570.method1747((long) var83, false);
                    if (var85 != null && var85.field6598 == var84) {
                        field5282[field5289++] = 1;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class282 var86 = class21.method194(-116, field5282[--field5289]);
                if (arg0 == 2800) {
                    field5282[field5289++] = client.method1348(var86).method2699(1661101682);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field5282[--field5289];
                    int var335 = var87 - 1;
                    if (var86.field4136 != null && var335 < var86.field4136.length && var86.field4136[var335] != null) {
                        field5301[field5290++] = var86.field4136[var335];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field4116 == null) {
                        field5301[field5290++] = "";
                        return;
                    }
                    field5301[field5290++] = var86.field4116;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field5301[--field5290];
                    class62.method444(94, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field5289 -= 2;
                    class328.method2117(field5282[field5289], class56.field800, field5282[field5289 + 1], false);
                    return;
                }
                if (arg0 == 3103) {
                    class393.method2449((byte) -76, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field5301[--field5290];
                    int var90 = 0;
                    if (class32.method273(var89, -69)) {
                        var90 = class370.method2349(10, var89);
                    }
                    field5304++;
                    class424.method2582(class374.field5692, -1);
                    class538.field7879.method1073(326170192, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field5301[--field5290];
                    field5300++;
                    class424.method2582(class214.field3027, -1);
                    class538.field7879.method1072((byte) 102, var91.length() + 1);
                    class538.field7879.method1071(-25643, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field5301[--field5290];
                    field5287++;
                    class424.method2582(class383.field5824, -1);
                    class538.field7879.method1072((byte) 102, var92.length() + 1);
                    class538.field7879.method1071(-25643, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field5282[--field5289];
                    String var94 = field5301[--field5290];
                    class36.method312(var94, var93, (byte) -127);
                    return;
                }
                if (arg0 == 3108) {
                    field5289 -= 3;
                    int var95 = field5282[field5289];
                    int var96 = field5282[field5289 + 1];
                    int var97 = field5282[field5289 + 2];
                    class282 var98 = class21.method194(-111, var97);
                    class391.method2443(var98, 0, var95, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field5289 -= 2;
                    int var99 = field5282[field5289];
                    int var100 = field5282[field5289 + 1];
                    class282 var101 = arg1 ? field5288 : field5302;
                    class391.method2443(var101, 0, var99, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field5282[--field5289];
                    field5299++;
                    class424.method2582(class146.field1937, -1);
                    class538.field7879.method1114(var102, 99);
                    return;
                }
                if (arg0 == 3111) {
                    field5289 -= 2;
                    int var103 = field5282[field5289];
                    int var104 = field5282[field5289 + 1];
                    class436 var105 = (class436) class312.field4570.method1747((long) var103, false);
                    if (var105 != null) {
                        class486.method2910(var105, true, var105.field6598 != var104, 0);
                    }
                    class310.method1948(3, var104, true, -28122, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field5289--;
                    int var106 = field5282[field5289];
                    class436 var107 = (class436) class312.field4570.method1747((long) var106, false);
                    if (var107 != null && var107.field6603 == 3) {
                        class486.method2910(var107, true, true, 0);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class306.method1923(2092, field5301[--field5290]);
                    return;
                }
                if (arg0 == 3114) {
                    field5289 -= 2;
                    int var108 = field5282[field5289];
                    int var109 = field5282[field5289 + 1];
                    String var110 = field5301[--field5290];
                    class71.method494(var109, "", var108, (byte) 114, "", var110);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field5289 -= 3;
                    class244.method1597(255, field5282[field5289 + 2], -1, field5282[field5289 + 1], field5282[field5289]);
                    return;
                }
                if (arg0 == 3201) {
                    class354.method2271(255, 50, field5282[--field5289], false);
                    return;
                }
                if (arg0 == 3202) {
                    field5289 -= 2;
                    class186.method1253(field5282[field5289 + 1], 255, field5282[field5289], (byte) -2);
                    return;
                }
                if (arg0 == 3203) {
                    field5289 -= 4;
                    class244.method1597(field5282[field5289 + 3], field5282[field5289 + 2], -1, field5282[field5289 + 1], field5282[field5289]);
                    return;
                }
                if (arg0 == 3204) {
                    field5289 -= 3;
                    class354.method2271(field5282[field5289 + 1], field5282[field5289 + 2], field5282[field5289], false);
                    return;
                }
                if (arg0 == 3205) {
                    field5289 -= 3;
                    class186.method1253(field5282[field5289 + 1], field5282[field5289 + 2], field5282[field5289], (byte) -2);
                    return;
                }
                if (arg0 == 3206) {
                    field5289 -= 4;
                    class132.method902(field5282[field5289], field5282[field5289 + 2], field5282[field5289 + 3], (byte) -21, field5282[field5289 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field5282[field5289++] = class393.field6017;
                    return;
                }
                if (arg0 == 3301) {
                    field5289 -= 2;
                    int var111 = field5282[field5289];
                    int var112 = field5282[field5289 + 1];
                    field5282[field5289++] = class155.method1001(var112, (byte) 56, false, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field5289 -= 2;
                    int var113 = field5282[field5289];
                    int var114 = field5282[field5289 + 1];
                    field5282[field5289++] = class191.method1277(var113, var114, false, -1);
                    return;
                }
                if (arg0 == 3303) {
                    field5289 -= 2;
                    int var115 = field5282[field5289];
                    int var116 = field5282[field5289 + 1];
                    field5282[field5289++] = class473.method2824(var116, var115, (byte) 84, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field5282[--field5289];
                    field5282[field5289++] = class313.field4574.method1474(-94, var117).field5181;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field5282[--field5289];
                    field5282[field5289++] = class166.field2251[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field5282[--field5289];
                    field5282[field5289++] = class213.field3023[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field5282[--field5289];
                    field5282[field5289++] = class451.field6774[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class56.field800.field1866;
                    int var122 = (class56.field800.field1867 >> 7) + class331.field5162;
                    int var123 = (class56.field800.field1862 >> 7) + class328.field5099;
                    field5282[field5289++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field5282[--field5289];
                    field5282[field5289++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field5282[--field5289];
                    field5282[field5289++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field5282[--field5289];
                    field5282[field5289++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field5282[field5289++] = class414.field6307 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field5289 -= 2;
                    int var127 = field5282[field5289];
                    int var128 = field5282[field5289 + 1];
                    field5282[field5289++] = class155.method1001(var128, (byte) 56, true, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field5289 -= 2;
                    int var129 = field5282[field5289];
                    int var130 = field5282[field5289 + 1];
                    field5282[field5289++] = class191.method1277(var129, var130, true, -1);
                    return;
                }
                if (arg0 == 3315) {
                    field5289 -= 2;
                    int var131 = field5282[field5289];
                    int var132 = field5282[field5289 + 1];
                    field5282[field5289++] = class473.method2824(var132, var131, (byte) 118, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class257.field3562 >= 2) {
                        field5282[field5289++] = class257.field3562;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field5282[field5289++] = class485.field7175;
                    return;
                }
                if (arg0 == 3318) {
                    field5282[field5289++] = class139.field1851.field2602;
                    return;
                }
                if (arg0 == 3321) {
                    field5282[field5289++] = class214.field3035;
                    return;
                }
                if (arg0 == 3322) {
                    field5282[field5289++] = class400.field6091;
                    return;
                }
                if (arg0 == 3323) {
                    if (class89.field1297 >= 5 && class89.field1297 <= 9) {
                        field5282[field5289++] = 1;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class89.field1297 >= 5 && class89.field1297 <= 9) {
                        field5282[field5289++] = class89.field1297;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field5282[field5289++] = class335.field5203 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field5282[field5289++] = class56.field800.field1391;
                    return;
                }
                if (arg0 == 3327) {
                    field5282[field5289++] = class56.field800.field1401.field6144 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field5282[field5289++] = class195.field2613 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field5282[--field5289];
                    field5282[field5289++] = class354.method2277(var133, false, 0);
                    return;
                }
                if (arg0 == 3331) {
                    field5289 -= 2;
                    int var134 = field5282[field5289];
                    int var135 = field5282[field5289 + 1];
                    field5282[field5289++] = class273.method1756((byte) 73, false, var135, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field5289 -= 2;
                    int var136 = field5282[field5289];
                    int var137 = field5282[field5289 + 1];
                    field5282[field5289++] = class273.method1756((byte) 109, false, var137, true, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field5282[field5289++] = class67.field955;
                    return;
                }
                if (arg0 == 3335) {
                    field5282[field5289++] = class257.field3556;
                    return;
                }
                if (arg0 == 3336) {
                    field5289 -= 4;
                    int var138 = field5282[field5289];
                    int var139 = field5282[field5289 + 1];
                    int var140 = field5282[field5289 + 2];
                    int var141 = field5282[field5289 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field5282[field5289++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field5282[field5289++] = class331.field5167;
                    return;
                }
                if (arg0 == 3338) {
                    field5282[field5289++] = class211.method1456((byte) -26);
                    return;
                }
                if (arg0 == 3339) {
                    field5282[field5289++] = class492.field7257 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field5282[field5289++] = class519.field7632 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field5282[field5289++] = class89.field1287 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field5289 -= 2;
                    int var145 = field5282[field5289];
                    int var146 = field5282[field5289 + 1];
                    class380 var147 = class496.field7314.method932((byte) 127, var145);
                    field5301[field5290++] = var147.method2389(true, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field5289 -= 4;
                    int var148 = field5282[field5289];
                    int var149 = field5282[field5289 + 1];
                    int var150 = field5282[field5289 + 2];
                    int var151 = field5282[field5289 + 3];
                    class380 var152 = class496.field7314.method932((byte) 126, var150);
                    if (var152.field5775 == var148 && var152.field5780 == var149) {
                        if (var149 == 115) {
                            field5301[field5290++] = var152.method2389(true, var151);
                            return;
                        }
                        field5282[field5289++] = var152.method2387(true, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field5289 -= 3;
                    int var153 = field5282[field5289];
                    int var154 = field5282[field5289 + 1];
                    int var155 = field5282[field5289 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class380 var156 = class496.field7314.method932((byte) 126, var154);
                    if (var156.field5780 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field5282[field5289++] = var156.method2378(var155, -18233) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field5282[--field5289];
                    String var158 = field5301[--field5290];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class380 var159 = class496.field7314.method932((byte) 126, var157);
                    if (var159.field5780 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field5282[field5289++] = var159.method2379(var158, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field5282[--field5289];
                    class380 var161 = class496.field7314.method932((byte) 127, var160);
                    field5282[field5289++] = var161.field5782.method1749(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class283.field4158 == 0) {
                        field5282[field5289++] = -2;
                        return;
                    }
                    if (class283.field4158 == 1) {
                        field5282[field5289++] = -1;
                        return;
                    }
                    field5282[field5289++] = class454.field6834;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field5282[--field5289];
                    if (class283.field4158 == 2 && var162 < class454.field6834) {
                        field5301[field5290++] = class466.field6946[var162];
                        if (class64.field918[var162] != null) {
                            field5301[field5290++] = class64.field918[var162];
                            return;
                        }
                        field5301[field5290++] = "";
                        return;
                    }
                    field5301[field5290++] = "";
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field5282[--field5289];
                    if (class283.field4158 == 2 && var163 < class454.field6834) {
                        field5282[field5289++] = class241.field3394[var163];
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field5282[--field5289];
                    if (class283.field4158 == 2 && var164 < class454.field6834) {
                        field5282[field5289++] = class388.field5933[var164];
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field5301[--field5290];
                    int var166 = field5282[--field5289];
                    class257.method1655(var166, var165, 2);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field5301[--field5290];
                    class189.method1258(17, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field5301[--field5290];
                    class236.method1564(186329900, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field5301[--field5290];
                    class424.method2587((byte) 114, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field5301[--field5290];
                    class476.method2839(var170, true);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field5301[--field5290];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field5282[field5289++] = class411.method2533((byte) 93, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field5282[--field5289];
                    if (class283.field4158 == 2 && var172 < class454.field6834) {
                        field5301[field5290++] = class11.field191[var172];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class177.field2371 != null) {
                        field5301[field5290++] = class245.method1604(3, class177.field2371);
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class177.field2371 != null) {
                        field5282[field5289++] = class400.field6094;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field5282[--field5289];
                    if (class177.field2371 != null && var173 < class400.field6094) {
                        field5301[field5290++] = class5.field41[var173].field7063;
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field5282[--field5289];
                    if (class177.field2371 != null && var174 < class400.field6094) {
                        field5282[field5289++] = class5.field41[var174].field7065;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field5282[--field5289];
                    if (class177.field2371 != null && var175 < class400.field6094) {
                        field5282[field5289++] = class5.field41[var175].field7064;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field5282[field5289++] = class394.field6019;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field5301[--field5290];
                    class154.method997((byte) -19, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field5282[field5289++] = class211.field2979;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field5301[--field5290];
                    class273.method1753(true, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class453.method2762((byte) -72);
                    return;
                }
                if (arg0 == 3621) {
                    if (class283.field4158 == 0) {
                        field5282[field5289++] = -1;
                        return;
                    }
                    field5282[field5289++] = class243.field3404;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field5282[--field5289];
                    if (class283.field4158 != 0 && var178 < class243.field3404) {
                        field5301[field5290++] = class436.field6599[var178];
                        if (class317.field4608[var178] != null) {
                            field5301[field5290++] = class317.field4608[var178];
                            return;
                        }
                        field5301[field5290++] = "";
                        return;
                    }
                    field5301[field5290++] = "";
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field5301[--field5290];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field5282[field5289++] = class240.method1578((byte) -101, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field5282[--field5289];
                    if (class5.field41 != null && var180 < class400.field6094 && class5.field41[var180].field7071.equalsIgnoreCase(class56.field800.field1393)) {
                        field5282[field5289++] = 1;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class88.field1266 != null) {
                        field5301[field5290++] = class88.field1266;
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field5282[--field5289];
                    if (class177.field2371 != null && var181 < class400.field6094) {
                        field5301[field5290++] = class5.field41[var181].field7070;
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field5282[--field5289];
                    if (class283.field4158 == 2 && var182 >= 0 && var182 < class454.field6834) {
                        field5282[field5289++] = class271.field3766[var182] ? 1 : 0;
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field5301[--field5290];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field5282[field5289++] = class366.method2335(-1, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field5282[field5289++] = class56.field804;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field5301[--field5290];
                    class424.method2587((byte) -110, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field5282[--field5289];
                    field5282[field5289++] = class295.field4305[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field5282[--field5289];
                    if (class177.field2371 != null && var186 < class400.field6094) {
                        field5301[field5290++] = class5.field41[var186].field7071;
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field5282[--field5289];
                    if (class283.field4158 != 0 && var187 < class243.field3404) {
                        field5301[field5290++] = class165.field2242[var187];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var188].method1459(0);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var189].field3000;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var190].field2996;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var191].field2995;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var192].field3002;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field5282[--field5289];
                    field5282[field5289++] = class446.field6691[var193].field2998;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field5282[--field5289];
                    int var195 = class446.field6691[var194].method1461(-5847);
                    field5282[field5289++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field5282[--field5289];
                    int var197 = class446.field6691[var196].method1461(-5847);
                    field5282[field5289++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field5282[--field5289];
                    int var199 = class446.field6691[var198].method1461(-5847);
                    field5282[field5289++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field5282[--field5289];
                    int var201 = class446.field6691[var200].method1461(-5847);
                    field5282[field5289++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field5289 -= 2;
                    int var202 = field5282[field5289];
                    int var203 = field5282[field5289 + 1];
                    field5282[field5289++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field5289 -= 2;
                    int var204 = field5282[field5289];
                    int var205 = field5282[field5289 + 1];
                    field5282[field5289++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field5289 -= 2;
                    int var206 = field5282[field5289];
                    int var207 = field5282[field5289 + 1];
                    field5282[field5289++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field5289 -= 2;
                    int var208 = field5282[field5289];
                    int var209 = field5282[field5289 + 1];
                    field5282[field5289++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field5282[--field5289];
                    field5282[field5289++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field5282[--field5289];
                    field5282[field5289++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field5289 -= 5;
                    int var212 = field5282[field5289];
                    int var213 = field5282[field5289 + 1];
                    int var214 = field5282[field5289 + 2];
                    int var215 = field5282[field5289 + 3];
                    int var216 = field5282[field5289 + 4];
                    field5282[field5289++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field5289 -= 2;
                    long var217 = (long) field5282[field5289];
                    long var219 = (long) field5282[field5289 + 1];
                    field5282[field5289++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field5289 -= 2;
                    int var221 = field5282[field5289];
                    int var222 = field5282[field5289 + 1];
                    field5282[field5289++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field5289 -= 2;
                    int var223 = field5282[field5289];
                    int var224 = field5282[field5289 + 1];
                    field5282[field5289++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field5289 -= 2;
                    int var225 = field5282[field5289];
                    int var226 = field5282[field5289 + 1];
                    field5282[field5289++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field5289 -= 2;
                    int var227 = field5282[field5289];
                    int var228 = field5282[field5289 + 1];
                    field5282[field5289++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field5289 -= 2;
                    int var229 = field5282[field5289];
                    int var230 = field5282[field5289 + 1];
                    if (var229 == 0) {
                        field5282[field5289++] = 0;
                        return;
                    }
                    field5282[field5289++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field5289 -= 2;
                    int var231 = field5282[field5289];
                    int var232 = field5282[field5289 + 1];
                    if (var231 == 0) {
                        field5282[field5289++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field5282[field5289++] = Integer.MAX_VALUE;
                        return;
                    }
                    field5282[field5289++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field5289 -= 2;
                    int var233 = field5282[field5289];
                    int var234 = field5282[field5289 + 1];
                    field5282[field5289++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field5289 -= 2;
                    int var235 = field5282[field5289];
                    int var236 = field5282[field5289 + 1];
                    field5282[field5289++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field5289 -= 2;
                    int var237 = field5282[field5289];
                    int var238 = field5282[field5289 + 1];
                    field5282[field5289++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field5289 -= 2;
                    int var239 = field5282[field5289];
                    int var240 = field5282[field5289 + 1];
                    field5282[field5289++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field5289 -= 3;
                    long var241 = (long) field5282[field5289];
                    long var243 = (long) field5282[field5289 + 1];
                    long var245 = (long) field5282[field5289 + 2];
                    field5282[field5289++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field5301[--field5290];
                    int var248 = field5282[--field5289];
                    field5301[field5290++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field5290 -= 2;
                    String var249 = field5301[field5290];
                    String var250 = field5301[field5290 + 1];
                    field5301[field5290++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field5301[--field5290];
                    int var252 = field5282[--field5289];
                    field5301[field5290++] = var251 + class322.method2003(true, var252, 26);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field5301[--field5290];
                    field5301[field5290++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5301[field5290++] = method2221(field5282[--field5289]);
                    return;
                }
                if (arg0 == 4105) {
                    field5290 -= 2;
                    String var254 = field5301[field5290];
                    String var255 = field5301[field5290 + 1];
                    if (class56.field800.field1401 != null && class56.field800.field1401.field6144) {
                        field5301[field5290++] = var255;
                        return;
                    }
                    field5301[field5290++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field5282[--field5289];
                    field5301[field5290++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field5290 -= 2;
                    field5282[field5289++] = class409.method2525(0, field5301[field5290], field5301[field5290 + 1], class257.field3556);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field5301[--field5290];
                    field5289 -= 2;
                    int var258 = field5282[field5289];
                    int var259 = field5282[field5289 + 1];
                    class82 var260 = class7.method92(class381.field5811, 0, -15471, var259);
                    field5282[field5289++] = var260.method563(var258, class434.field6586, var257, true);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field5301[--field5290];
                    field5289 -= 2;
                    int var262 = field5282[field5289];
                    int var263 = field5282[field5289 + 1];
                    class82 var264 = class7.method92(class381.field5811, 0, -15471, var263);
                    field5282[field5289++] = var264.method562(class434.field6586, 102, var261, var262);
                    return;
                }
                if (arg0 == 4110) {
                    field5290 -= 2;
                    String var265 = field5301[field5290];
                    String var266 = field5301[field5290 + 1];
                    if (field5282[--field5289] == 1) {
                        field5301[field5290++] = var265;
                        return;
                    }
                    field5301[field5290++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field5301[--field5290];
                    field5301[field5290++] = class319.method1993(var267, 13499);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field5301[--field5290];
                    int var269 = field5282[--field5289];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5301[field5290++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field5282[--field5289];
                    field5282[field5289++] = class156.method1005((char) var270, (byte) -90) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field5282[--field5289];
                    field5282[field5289++] = class447.method2719((byte) -11, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field5282[--field5289];
                    field5282[field5289++] = class199.method1325((char) var272, 122) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field5282[--field5289];
                    field5282[field5289++] = class378.method2371((char) var273, (byte) -61) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field5301[--field5290];
                    if (var274 != null) {
                        field5282[field5289++] = var274.length();
                        return;
                    }
                    field5282[field5289++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field5301[--field5290];
                    field5289 -= 2;
                    int var276 = field5282[field5289];
                    int var277 = field5282[field5289 + 1];
                    field5301[field5290++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field5301[--field5290];
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
                    field5301[field5290++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field5301[--field5290];
                    field5289 -= 2;
                    int var284 = field5282[field5289];
                    int var285 = field5282[field5289 + 1];
                    field5282[field5289++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field5290 -= 2;
                    String var286 = field5301[field5290];
                    String var287 = field5301[field5290 + 1];
                    int var288 = field5282[--field5289];
                    field5282[field5289++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field5282[--field5289];
                    field5282[field5289++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field5282[--field5289];
                    field5282[field5289++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field5282[--field5289] != 0;
                    int var292 = field5282[--field5289];
                    field5301[field5290++] = class116.method717(0, (long) var292, class257.field3556, var291, -72);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field5301[--field5290];
                    int var294 = field5282[--field5289];
                    class82 var295 = class7.method92(class381.field5811, 0, -15471, var294);
                    field5282[field5289++] = var295.method560(class434.field6586, var293, -1);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field5282[--field5289];
                    field5301[field5290++] = class103.field1489.method1603((byte) -99, var296).field1077;
                    return;
                }
                if (arg0 == 4201) {
                    field5289 -= 2;
                    int var297 = field5282[field5289];
                    int var298 = field5282[field5289 + 1];
                    class74 var299 = class103.field1489.method1603((byte) -99, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field1053[var298 - 1] != null) {
                        field5301[field5290++] = var299.field1053[var298 - 1];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field5289 -= 2;
                    int var300 = field5282[field5289];
                    int var301 = field5282[field5289 + 1];
                    class74 var302 = class103.field1489.method1603((byte) -99, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field1081[var301 - 1] != null) {
                        field5301[field5290++] = var302.field1081[var301 - 1];
                        return;
                    }
                    field5301[field5290++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field5282[--field5289];
                    field5282[field5289++] = class103.field1489.method1603((byte) -99, var303).field1057;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field5282[--field5289];
                    field5282[field5289++] = class103.field1489.method1603((byte) -99, var304).field1032 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field5282[--field5289];
                    class74 var306 = class103.field1489.method1603((byte) -99, var305);
                    if (var306.field1091 == -1 && var306.field1050 >= 0) {
                        field5282[field5289++] = var306.field1050;
                        return;
                    }
                    field5282[field5289++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field5282[--field5289];
                    class74 var308 = class103.field1489.method1603((byte) -99, var307);
                    if (var308.field1091 >= 0 && var308.field1050 >= 0) {
                        field5282[field5289++] = var308.field1050;
                        return;
                    }
                    field5282[field5289++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field5282[--field5289];
                    field5282[field5289++] = class103.field1489.method1603((byte) -99, var309).field1060 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field5289 -= 2;
                    int var310 = field5282[field5289];
                    int var311 = field5282[field5289 + 1];
                    class205 var312 = class83.field1218.method3118(var311, -13676);
                    if (var312.method1383(22243)) {
                        field5301[field5290++] = class103.field1489.method1603((byte) -99, var310).method519(var311, false, var312.field2729);
                        return;
                    }
                    field5282[field5289++] = class103.field1489.method1603((byte) -99, var310).method526(var311, 0, var312.field2727);
                    return;
                }
                if (arg0 == 4209) {
                    field5289 -= 2;
                    int var313 = field5282[field5289];
                    int var314 = field5282[field5289 + 1] - 1;
                    class74 var315 = class103.field1489.method1603((byte) -99, var313);
                    if (var315.field1076 == var314) {
                        field5282[field5289++] = var315.field1034;
                        return;
                    }
                    if (var315.field1049 == var314) {
                        field5282[field5289++] = var315.field1072;
                        return;
                    }
                    field5282[field5289++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field5301[--field5290];
                    int var317 = field5282[--field5289];
                    class200.method1357(-23922, var316, var317 == 1);
                    field5282[field5289++] = class92.field1365;
                    return;
                }
                if (arg0 == 4211) {
                    if (class66.field943 != null && class48.field693 < class92.field1365) {
                        field5282[field5289++] = class66.field943[class48.field693++] & 0xFFFF;
                        return;
                    }
                    field5282[field5289++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class48.field693 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field5289 -= 2;
                    int var318 = field5282[field5289];
                    int var319 = field5282[field5289 + 1];
                    class205 var320 = class83.field1218.method3118(var319, -13676);
                    if (var320.method1383(22243)) {
                        field5301[field5290++] = class137.field1834.method1626((byte) -15, var318).method1662(var320.field2729, var319, (byte) 126);
                        return;
                    }
                    field5282[field5289++] = class137.field1834.method1626((byte) -15, var318).method1658(135, var320.field2727, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field5289 -= 2;
                    int var321 = field5282[field5289];
                    int var322 = field5282[field5289 + 1];
                    class205 var323 = class83.field1218.method3118(var322, -13676);
                    if (var323.method1383(22243)) {
                        field5301[field5290++] = class432.field6575.method1872(var321, false).method1434(-128, var323.field2729, var322);
                        return;
                    }
                    field5282[field5289++] = class432.field6575.method1872(var321, false).method1440(40, var322, var323.field2727);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field5289 -= 2;
                    int var324 = field5282[field5289];
                    int var325 = field5282[field5289 + 1];
                    class205 var326 = class83.field1218.method3118(var325, -13676);
                    if (var326.method1383(22243)) {
                        field5301[field5290++] = class319.field4623.method865((byte) 51, var324).method3076(var326.field2729, 18390, var325);
                        return;
                    }
                    field5282[field5289++] = class319.field4623.method865((byte) 51, var324).method3072(var326.field2727, var325, (byte) -121);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field5282[--field5289];
                class485 var328 = class509.field7483.method1556(var327, false);
                if (var328.field7180 != null && var328.field7180.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field7165[0];
                    for (int var331 = 1; var331 < var328.field7180.length; var331++) {
                        if (var328.field7165[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field7165[var331];
                        }
                    }
                    field5282[field5289++] = var328.field7180[var329];
                    return;
                }
                field5282[field5289++] = var328.field7163;
                return;
            }
        } else {
            class282 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class21.method194(-124, field5282[--field5289]);
            } else {
                var47 = arg1 ? field5288 : field5302;
            }
            if (arg0 == 1300) {
                int var48 = field5282[--field5289] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1805(var48, field5301[--field5290], false);
                    return;
                } else {
                    field5290--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field5289 -= 2;
                int var49 = field5282[field5289];
                int var50 = field5282[field5289 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field4016 = null;
                    return;
                }
                var47.field4016 = class178.method1197(var50, var49, 101);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field5282[--field5289];
                if (class283.field4163 != var51 && class454.field6837 != var51 && class348.field5377 != var51) {
                    return;
                }
                var47.field3994 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field4001 = field5282[--field5289];
                return;
            }
            if (arg0 == 1304) {
                var47.field4085 = field5282[--field5289];
                return;
            }
            if (arg0 == 1305) {
                var47.field4116 = field5301[--field5290];
                return;
            }
            if (arg0 == 1306) {
                var47.field4114 = field5301[--field5290];
                return;
            }
            if (arg0 == 1307) {
                var47.field4136 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field4002 = field5282[--field5289];
                var47.field4045 = field5282[--field5289];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field5282[--field5289];
                int var53 = field5282[--field5289];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1817((byte) 19, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field4025 = field5301[--field5290];
                return;
            }
            if (arg0 == 1311) {
                var47.field4137 = field5282[--field5289];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field5289 -= 3;
                    var54 = field5282[field5289] - 1;
                    var55 = field5282[field5289 + 1];
                    var56 = field5282[field5289 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5289 -= 2;
                    var54 = 10;
                    var55 = field5282[field5289];
                    var56 = field5282[field5289 + 1];
                }
                if (var47.field4124 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field4124 = new byte[11];
                    var47.field4070 = new byte[11];
                    var47.field4000 = new int[11];
                }
                var47.field4124[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field4097 = false;
                    for (int var57 = 0; var57 < var47.field4124.length; var57++) {
                        if (var47.field4124[var57] != 0) {
                            var47.field4097 = true;
                            break;
                        }
                    }
                } else {
                    var47.field4097 = true;
                }
                var47.field4070[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field4088 = field5282[--field5289];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()V")
    public static void method2225() {
        field5297 = null;
        field5298 = null;
        field5295 = null;
        field5291 = null;
        field5282 = null;
        field5301 = null;
        field5285 = null;
        field5302 = null;
        field5288 = null;
        field5292 = null;
        field5280 = null;
        field5306 = null;
        field5305 = null;
        field5307 = null;
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(IZ)V")
    private static final void method2226(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5282[field5289++] = class137.field1831;
                return;
            }
            if (arg0 == 5001) {
                field5289 -= 3;
                class137.field1831 = field5282[field5289];
                class395.field6048 = class307.method1925(field5282[field5289 + 1], (byte) -120);
                if (class395.field6048 == null) {
                    class395.field6048 = class198.field2636;
                }
                class526.field7717 = field5282[field5289 + 2];
                field5293++;
                class424.method2582(class398.field6064, -1);
                class538.field7879.method1072((byte) 102, class137.field1831);
                class538.field7879.method1072((byte) 102, class395.field6048.field3081);
                class538.field7879.method1072((byte) 102, class526.field7717);
                return;
            }
            if (arg0 == 5002) {
                field5290 -= 2;
                String var2 = field5301[field5290];
                String var3 = field5301[field5290 + 1];
                field5289 -= 2;
                int var4 = field5282[field5289];
                int var5 = field5282[field5289 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field5283++;
                class424.method2582(class390.field5949, -1);
                class538.field7879.method1072((byte) 102, class436.method2652(var2, (byte) -111) + class436.method2652(var3, (byte) -114) + 2);
                class538.field7879.method1071(-25643, var2);
                class538.field7879.method1072((byte) 102, var4 - 1);
                class538.field7879.method1072((byte) 102, var5);
                class538.field7879.method1071(-25643, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field5282[--field5289];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class208.field2884[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field5301[field5290++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field5282[--field5289];
                int var9 = -1;
                if (var8 < 100 && class208.field2884[var8] != null) {
                    var9 = class33.field503[var8];
                }
                field5282[field5289++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class395.field6048 == null) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = class395.field6048.field3081;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field5301[--field5290];
                method2222(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5290 -= 2;
                String var11 = field5301[field5290];
                String var12 = field5301[field5290 + 1];
                if (class257.field3562 != 0 || (!class230.field3300 || class60.field865) && !class195.field2613) {
                    field5294++;
                    class424.method2582(class26.field378, -1);
                    class538.field7879.method1072((byte) 102, 0);
                    int var13 = class538.field7879.field2185;
                    class538.field7879.method1071(-25643, var11);
                    class146.method967(var12, class538.field7879, 35);
                    class538.field7879.method1082(-32769, class538.field7879.field2185 - var13);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field5282[--field5289];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class313.field4577[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field5301[field5290++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field5282[--field5289];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class149.field1963[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field5301[field5290++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field5282[--field5289];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class230.field3290[var18];
                }
                field5282[field5289++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class56.field800 == null || class56.field800.field1402 == null) {
                    var20 = class452.field6813;
                } else {
                    var20 = class56.field800.method640(255, true);
                }
                field5301[field5290++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field5282[field5289++] = class526.field7717;
                return;
            }
            if (arg0 == 5017) {
                field5282[field5289++] = class490.field7241;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field5282[--field5289];
                int var22 = 0;
                if (var21 < 100 && class208.field2884[var21] != null) {
                    var22 = class221.field3080[var21];
                }
                field5282[field5289++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field5282[--field5289];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class514.field7555[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field5301[field5290++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class56.field800 == null || class56.field800.field1402 == null) {
                    var25 = class452.field6813;
                } else {
                    var25 = class56.field800.method645((byte) 90, false);
                }
                field5301[field5290++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field5282[--field5289];
                field5301[field5290++] = class82.field1190.method2938(var26, false).field6900;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field5282[--field5289];
                class461 var28 = class82.field1190.method2938(var27, false);
                if (var28.field6891 == null) {
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = var28.field6891.length;
                return;
            }
            if (arg0 == 5052) {
                field5289 -= 2;
                int var29 = field5282[field5289];
                int var30 = field5282[field5289 + 1];
                class461 var31 = class82.field1190.method2938(var29, false);
                int var32 = var31.field6891[var30];
                field5282[field5289++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field5282[--field5289];
                class461 var34 = class82.field1190.method2938(var33, false);
                if (var34.field6892 == null) {
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = var34.field6892.length;
                return;
            }
            if (arg0 == 5054) {
                field5289 -= 2;
                int var35 = field5282[field5289];
                int var36 = field5282[field5289 + 1];
                field5282[field5289++] = class82.field1190.method2938(var35, false).field6892[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field5282[--field5289];
                field5301[field5290++] = class321.field4650.method993(-101, var37).method1230(-108);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field5282[--field5289];
                class182 var39 = class321.field4650.method993(-60, var38);
                if (var39.field2456 == null) {
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = var39.field2456.length;
                return;
            }
            if (arg0 == 5057) {
                field5289 -= 2;
                int var40 = field5282[field5289];
                int var41 = field5282[field5289 + 1];
                field5282[field5289++] = class321.field4650.method993(-114, var40).field2456[var41];
                return;
            }
            if (arg0 == 5058) {
                field5292 = new class186();
                field5292.field2504 = field5282[--field5289];
                field5292.field2507 = class321.field4650.method993(-29, field5292.field2504);
                field5292.field2505 = new int[field5292.field2507.method1238(0)];
                return;
            }
            if (arg0 == 5059) {
                field5286++;
                class424.method2582(class180.field2427, -1);
                class538.field7879.method1072((byte) 102, 0);
                int var42 = class538.field7879.field2185;
                class538.field7879.method1072((byte) 102, 0);
                class538.field7879.method1114(field5292.field2504, 95);
                field5292.field2507.method1233((byte) 84, field5292.field2505, class538.field7879);
                class538.field7879.method1082(-32769, class538.field7879.field2185 - var42);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field5301[--field5290];
                field5284++;
                class424.method2582(class273.field3806, -1);
                class538.field7879.method1072((byte) 102, 0);
                int var44 = class538.field7879.field2185;
                class538.field7879.method1071(-25643, var43);
                class538.field7879.method1114(field5292.field2504, 112);
                field5292.field2507.method1233((byte) 115, field5292.field2505, class538.field7879);
                class538.field7879.method1082(-32769, class538.field7879.field2185 - var44);
                return;
            }
            if (arg0 == 5061) {
                field5286++;
                class424.method2582(class180.field2427, -1);
                class538.field7879.method1072((byte) 102, 0);
                int var45 = class538.field7879.field2185;
                class538.field7879.method1072((byte) 102, 1);
                class538.field7879.method1114(field5292.field2504, 88);
                field5292.field2507.method1233((byte) 27, field5292.field2505, class538.field7879);
                class538.field7879.method1082(-32769, class538.field7879.field2185 - var45);
                return;
            }
            if (arg0 == 5062) {
                field5289 -= 2;
                int var46 = field5282[field5289];
                int var47 = field5282[field5289 + 1];
                field5282[field5289++] = class82.field1190.method2938(var46, false).field6897[var47];
                return;
            }
            if (arg0 == 5063) {
                field5289 -= 2;
                int var48 = field5282[field5289];
                int var49 = field5282[field5289 + 1];
                field5282[field5289++] = class82.field1190.method2938(var48, false).field6903[var49];
                return;
            }
            if (arg0 == 5064) {
                field5289 -= 2;
                int var50 = field5282[field5289];
                int var51 = field5282[field5289 + 1];
                if (var51 == -1) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = class82.field1190.method2938(var50, false).method2789((char) var51, true);
                return;
            }
            if (arg0 == 5065) {
                field5289 -= 2;
                int var52 = field5282[field5289];
                int var53 = field5282[field5289 + 1];
                if (var53 == -1) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = class82.field1190.method2938(var52, false).method2792((char) var53, (byte) 109);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field5282[--field5289];
                field5282[field5289++] = class321.field4650.method993(-109, var54).method1238(0);
                return;
            }
            if (arg0 == 5067) {
                field5289 -= 2;
                int var55 = field5282[field5289];
                int var56 = field5282[field5289 + 1];
                int var57 = class321.field4650.method993(-37, var55).method1235(var56, -124).field1235;
                field5282[field5289++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field5289 -= 2;
                int var58 = field5282[field5289];
                int var59 = field5282[field5289 + 1];
                field5292.field2505[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field5289 -= 2;
                int var60 = field5282[field5289];
                int var61 = field5282[field5289 + 1];
                field5292.field2505[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field5289 -= 3;
                int var62 = field5282[field5289];
                int var63 = field5282[field5289 + 1];
                int var64 = field5282[field5289 + 2];
                class182 var65 = class321.field4650.method993(-91, var62);
                if (var65.method1235(var63, -118).field1235 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5282[field5289++] = var65.method1234(65536, var64, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field5301[--field5290];
                boolean var67 = field5282[--field5289] == 1;
                class47.method367(-15557, var67, var66);
                field5282[field5289++] = class92.field1365;
                return;
            }
            if (arg0 == 5072) {
                if (class66.field943 != null && class48.field693 < class92.field1365) {
                    field5282[field5289++] = class66.field943[class48.field693++] & 0xFFFF;
                    return;
                }
                field5282[field5289++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class48.field693 = 0;
                return;
            }
            if (arg0 == 5074) {
                field5286++;
                class424.method2582(class180.field2427, -1);
                class538.field7879.method1072((byte) 102, 0);
                int var68 = class538.field7879.field2185;
                class538.field7879.method1072((byte) 102, 2);
                class538.field7879.method1114(field5292.field2504, 88);
                field5292.field2507.method1233((byte) 120, field5292.field2505, class538.field7879);
                class538.field7879.method1082(-32769, class538.field7879.field2185 - var68);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class35.field515.method1970(true, 86)) {
                    field5282[field5289++] = 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class35.field515.method1970(true, 82)) {
                    field5282[field5289++] = 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class35.field515.method1970(true, 81)) {
                    field5282[field5289++] = 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class172.method1170(65, field5282[--field5289]);
                return;
            }
            if (arg0 == 5201) {
                field5282[field5289++] = class146.method968((byte) 112);
                return;
            }
            if (arg0 == 5205) {
                class281.method1800(-1, false, -11252, field5282[--field5289], -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field5282[--field5289];
                class441 var70 = class12.method122(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = var70.field6643;
                return;
            }
            if (arg0 == 5207) {
                class441 var71 = class12.method131(field5282[--field5289]);
                if (var71 != null && var71.field6642 != null) {
                    field5301[field5290++] = var71.field6642;
                    return;
                }
                field5301[field5290++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5282[field5289++] = class352.field5442;
                field5282[field5289++] = class114.field1588;
                return;
            }
            if (arg0 == 5209) {
                field5282[field5289++] = class267.field3712 + class12.field247;
                field5282[field5289++] = class253.field3514 + class12.field245;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field5282[--field5289];
                class441 var73 = class12.method131(var72);
                if (var73 == null) {
                    field5282[field5289++] = 0;
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = var73.field6647 >> 14 & 0x3FFF;
                field5282[field5289++] = var73.field6647 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field5282[--field5289];
                class441 var75 = class12.method131(var74);
                if (var75 == null) {
                    field5282[field5289++] = 0;
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = var75.field6641 - var75.field6650;
                field5282[field5289++] = var75.field6654 - var75.field6646;
                return;
            }
            if (arg0 == 5212) {
                class484 var76 = class322.method2004(119);
                if (var76 == null) {
                    field5282[field5289++] = -1;
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = var76.field7129;
                int var77 = var76.field7128 << 28 | class12.field247 + var76.field7125 << 14 | class12.field245 + var76.field7130;
                field5282[field5289++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class484 var78 = class498.method2969(true);
                if (var78 == null) {
                    field5282[field5289++] = -1;
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = var78.field7129;
                int var79 = var78.field7128 << 28 | class12.field247 + var78.field7125 << 14 | class12.field245 + var78.field7130;
                field5282[field5289++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field5282[--field5289];
                class441 var81 = class28.method258((byte) 112);
                if (var81 != null) {
                    boolean var82 = var81.method2666(field5305, var80 >> 28 & 0x3, var80 & 0x3FFF, (byte) 42, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class419.method2559(field5305[2], field5305[1], 27347);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5289 -= 2;
                int var83 = field5282[field5289];
                int var84 = field5282[field5289 + 1];
                class428 var85 = class12.method128(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class441 var87 = (class441) var85.method2611((byte) 124); var87 != null; var87 = (class441) var85.method2615(-13153)) {
                    if (var87.field6643 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field5282[field5289++] = 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field5282[--field5289];
                class441 var89 = class12.method131(var88);
                if (var89 == null) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = var89.field6653;
                return;
            }
            if (arg0 == 5220) {
                field5282[field5289++] = class357.field5502 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field5282[--field5289];
                class419.method2559(var90 & 0x3FFF, var90 >> 14 & 0x3FFF, 27347);
                return;
            }
            if (arg0 == 5222) {
                class441 var91 = class28.method258((byte) 127);
                if (var91 != null) {
                    boolean var92 = var91.method2673(-50, class253.field3514 + class12.field245, field5305, class267.field3712 + class12.field247);
                    if (var92) {
                        field5282[field5289++] = field5305[1];
                        field5282[field5289++] = field5305[2];
                        return;
                    }
                    field5282[field5289++] = -1;
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = -1;
                field5282[field5289++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5289 -= 2;
                int var93 = field5282[field5289];
                int var94 = field5282[field5289 + 1];
                class281.method1800(var94 >> 14 & 0x3FFF, false, -11252, var93, var94 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field5282[--field5289];
                class441 var96 = class28.method258((byte) 116);
                if (var96 != null) {
                    boolean var97 = var96.method2666(field5305, var95 >> 28 & 0x3, var95 & 0x3FFF, (byte) 42, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field5282[field5289++] = field5305[1];
                        field5282[field5289++] = field5305[2];
                        return;
                    }
                    field5282[field5289++] = -1;
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = -1;
                field5282[field5289++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field5282[--field5289];
                class441 var99 = class28.method258((byte) 114);
                if (var99 != null) {
                    boolean var100 = var99.method2673(68, var98 & 0x3FFF, field5305, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field5282[field5289++] = field5305[1];
                        field5282[field5289++] = field5305[2];
                        return;
                    }
                    field5282[field5289++] = -1;
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = -1;
                field5282[field5289++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class175.method1177((byte) 117, field5282[--field5289]);
                return;
            }
            if (arg0 == 5227) {
                field5289 -= 2;
                int var101 = field5282[field5289];
                int var102 = field5282[field5289 + 1];
                class281.method1800(var102 >> 14 & 0x3FFF, true, -11252, var101, var102 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class88.field1272 = field5282[--field5289] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5282[field5289++] = class88.field1272 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field5282[--field5289];
                class515.method3075(var103, (byte) 98);
                return;
            }
            if (arg0 == 5231) {
                field5289 -= 2;
                int var104 = field5282[field5289];
                boolean var105 = field5282[field5289 + 1] == 1;
                if (class296.field4379 != null) {
                    class5 var106 = class296.field4379.method1747((long) var104, false);
                    if (var106 != null && !var105) {
                        var106.method25(-13489);
                        return;
                    }
                    if (var106 == null && var105) {
                        class5 var107 = new class5();
                        class296.field4379.method1751((long) var104, -97, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field5282[--field5289];
                if (class296.field4379 != null) {
                    class5 var109 = class296.field4379.method1747((long) var108, false);
                    field5282[field5289++] = var109 == null ? 0 : 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5289 -= 2;
                int var110 = field5282[field5289];
                boolean var111 = field5282[field5289 + 1] == 1;
                if (class535.field7863 != null) {
                    class5 var112 = class535.field7863.method1747((long) var110, false);
                    if (var112 != null && !var111) {
                        var112.method25(-13489);
                        return;
                    }
                    if (var112 == null && var111) {
                        class5 var113 = new class5();
                        class535.field7863.method1751((long) var110, -128, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field5282[--field5289];
                if (class535.field7863 != null) {
                    class5 var115 = class535.field7863.method1747((long) var114, false);
                    field5282[field5289++] = var115 == null ? 0 : 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5282[field5289++] = class12.field209 == null ? -1 : class12.field209.field6643;
                return;
            }
            if (arg0 == 5236) {
                field5289 -= 2;
                int var116 = field5282[field5289];
                int var117 = field5282[field5289 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class195.method1316((byte) -100, var118, var119, var116);
                if (var120 < 0) {
                    field5282[field5289++] = -1;
                    return;
                }
                field5282[field5289++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class140.method936(true);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5289 -= 2;
                int var121 = field5282[field5289];
                int var122 = field5282[field5289 + 1];
                class310.method1945(var121, 3, var122, 0, false);
                field5282[field5289++] = class461.field6896 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class461.field6896 != null) {
                    class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class62[] var123 = class81.method551(31237);
                field5282[field5289++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field5282[--field5289];
                class62[] var125 = class81.method551(31237);
                field5282[field5289++] = var125[var124].field886;
                field5282[field5289++] = var125[var124].field887;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class203.field2716.field1158;
                int var127 = class203.field2716.field1154;
                int var128 = -1;
                class62[] var129 = class81.method551(31237);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class62 var131 = var129[var130];
                    if (var131.field886 == var126 && var131.field887 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field5282[field5289++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field5282[field5289++] = class325.method2014((byte) 55);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field5282[--field5289];
                if (var132 >= 1 && var132 <= 2) {
                    class310.method1945(-1, var132, -1, 0, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5282[field5289++] = class203.field2716.field1161;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field5282[--field5289];
                if (var133 >= 1 && var133 <= 2) {
                    class203.field2716.field1161 = var133;
                    class203.field2716.method20(class312.field4572, 1);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5290 -= 2;
                String var134 = field5301[field5290];
                String var135 = field5301[field5290 + 1];
                int var136 = field5282[--field5289];
                field5296++;
                class424.method2582(class176.field2355, -1);
                class538.field7879.method1072((byte) 102, class436.method2652(var134, (byte) -90) + class436.method2652(var135, (byte) -100) + 1);
                class538.field7879.method1071(-25643, var134);
                class538.field7879.method1071(-25643, var135);
                class538.field7879.method1072((byte) 102, var136);
                return;
            }
            if (arg0 == 5401) {
                field5289 -= 2;
                class88.field1275[field5282[field5289]] = (short) class61.method439(32022, field5282[field5289 + 1]);
                class103.field1489.method1593(-31);
                class103.field1489.method1601((byte) 95);
                class137.field1834.method1623(109);
                class141.method950(0);
                return;
            }
            if (arg0 == 5405) {
                field5289 -= 2;
                int var137 = field5282[field5289];
                int var138 = field5282[field5289 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class200.field2687[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5289 -= 7;
                int var139 = field5282[field5289];
                int var140 = field5282[field5289 + 1] << 1;
                int var141 = field5282[field5289 + 2];
                int var142 = field5282[field5289 + 3];
                int var143 = field5282[field5289 + 4];
                int var144 = field5282[field5289 + 5];
                int var145 = field5282[field5289 + 6];
                if (var139 >= 0 && var139 < 2 && class200.field2687[var139] != null && var140 >= 0 && var140 < class200.field2687[var139].length) {
                    class200.field2687[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class200.field2687[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class200.field2687[field5282[--field5289]].length >> 1;
                field5282[field5289++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class461.field6896 != null) {
                    class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
                }
                if (class286.field4195 != null) {
                    class141.method943(0);
                    System.exit(0);
                    return;
                }
                String var147 = class448.field6747 == null ? class272.method1750(0) : class448.field6747;
                class107.method684(class378.field5771 == 1, (byte) 92, class312.field4572, var147, false);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class160.field2087 != null) {
                    if (class160.field2087.field3324 == null) {
                        var148 = class91.method611(93, class160.field2087.field3320);
                    } else {
                        var148 = (String) class160.field2087.field3324;
                    }
                }
                field5301[field5290++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field5282[field5289++] = class500.field7379 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class461.field6896 != null) {
                    class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
                }
                String var149 = field5301[--field5290];
                boolean var150 = field5282[--field5289] == 1;
                String var151 = class272.method1750(0) + var149;
                class107.method684(class378.field5771 == 1, (byte) 59, class312.field4572, var151, var150);
                return;
            }
            if (arg0 == 5422) {
                field5290 -= 2;
                String var152 = field5301[field5290];
                String var153 = field5301[field5290 + 1];
                int var154 = field5282[--field5289];
                if (var152.length() > 0) {
                    if (class154.field2014 == null) {
                        class154.field2014 = new String[class102.field1478[class67.field957.field930]];
                    }
                    class154.field2014[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class270.field3758 == null) {
                        class270.field3758 = new String[class102.field1478[class67.field957.field930]];
                    }
                    class270.field3758[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5301[--field5290]);
                return;
            }
            if (arg0 == 5424) {
                field5289 -= 11;
                class519.field7625 = field5282[field5289];
                class322.field4658 = field5282[field5289 + 1];
                class466.field6942 = field5282[field5289 + 2];
                class378.field5772 = field5282[field5289 + 3];
                class348.field5379 = field5282[field5289 + 4];
                class392.field5999 = field5282[field5289 + 5];
                class354.field5483 = field5282[field5289 + 6];
                class155.field2023 = field5282[field5289 + 7];
                class433.field6581 = field5282[field5289 + 8];
                class121.field1652 = field5282[field5289 + 9];
                class323.field4679 = field5282[field5289 + 10];
                class266.field3709.method1288(class348.field5379, 18555);
                class266.field3709.method1288(class392.field5999, 18555);
                class266.field3709.method1288(class354.field5483, 18555);
                class266.field3709.method1288(class155.field2023, 18555);
                class266.field3709.method1288(class433.field6581, 18555);
                class398.field6074 = null;
                class407.field6168 = null;
                class355.field5488 = null;
                class315.field4591 = null;
                class373.field5674 = null;
                class181.field2446 = null;
                class153.field2004 = null;
                class200.field2697 = null;
                class232.field3307 = true;
                return;
            }
            if (arg0 == 5425) {
                class330.method2126(0);
                class232.field3307 = false;
                return;
            }
            if (arg0 == 5426) {
                field5289 -= 2;
                class271.field3768 = field5282[field5289];
                class239.field3364 = field5282[field5289 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5289 -= 2;
                class393.field6007 = field5282[field5289 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5289 -= 2;
                int var155 = field5282[field5289];
                int var156 = field5282[field5289 + 1];
                field5282[field5289++] = class353.method2266(var156, var155, -1007) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class360.method2299(false, field5301[--field5290], false, (byte) 117);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class305.method1920(class312.field4572.field7381, "accountcreated", 21694);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5289 -= 4;
                int var157 = field5282[field5289];
                int var158 = field5282[field5289 + 1];
                int var159 = field5282[field5289 + 2];
                int var160 = field5282[field5289 + 3];
                class269.method1730(var159, (var157 >> 14 & 0x3FFF) - class331.field5162, false, var158, var160, (var157 & 0x3FFF) - class328.field5099, true);
                return;
            }
            if (arg0 == 5501) {
                field5289 -= 4;
                int var161 = field5282[field5289];
                int var162 = field5282[field5289 + 1];
                int var163 = field5282[field5289 + 2];
                int var164 = field5282[field5289 + 3];
                class340.method2199((var161 >> 14 & 0x3FFF) - class331.field5162, var162, -33, var164, (var161 & 0x3FFF) - class328.field5099, var163);
                return;
            }
            if (arg0 == 5502) {
                field5289 -= 6;
                int var165 = field5282[field5289];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class256.field3535 = var165;
                int var166 = field5282[field5289 + 1];
                if (var166 + 1 >= class200.field2687[class256.field3535].length >> 1) {
                    throw new RuntimeException();
                }
                class127.field1725 = var166;
                class421.field6413 = 0;
                class509.field7481 = field5282[field5289 + 2];
                class264.field3701 = field5282[field5289 + 3];
                int var167 = field5282[field5289 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class538.field7892 = var167;
                int var168 = field5282[field5289 + 5];
                if (var168 + 1 >= class200.field2687[class538.field7892].length >> 1) {
                    throw new RuntimeException();
                }
                class398.field6072 = var168;
                class340.field5269 = 3;
                return;
            }
            if (arg0 == 5503) {
                class278.method1787((byte) 60);
                return;
            }
            if (arg0 == 5504) {
                field5289 -= 2;
                class475.method2830(field5282[field5289 + 1], field5282[field5289], 0, 35);
                return;
            }
            if (arg0 == 5505) {
                field5282[field5289++] = (int) class536.field7870 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5282[field5289++] = (int) class53.field744 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class118.method729(2);
                return;
            }
            if (arg0 == 5508) {
                class245.method1605((byte) 96);
                return;
            }
            if (arg0 == 5509) {
                class357.method2288((byte) 121);
                return;
            }
            if (arg0 == 5510) {
                class273.method1757((byte) 116);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field5282[--field5289];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class331.field5162;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class398.field6071) {
                    var172 = class398.field6071;
                }
                int var173 = var171 - class328.field5099;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class528.field7734) {
                    var173 = class528.field7734;
                }
                class62.field883 = (var172 << 7) + 64;
                class21.field320 = (var173 << 7) + 64;
                class340.field5269 = 4;
                return;
            }
            if (arg0 == 5512) {
                class416.method2551(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5290 -= 2;
                String var174 = field5301[field5290];
                String var175 = field5301[field5290 + 1];
                int var176 = field5282[--field5289];
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    class452.field6813 = var174;
                    class530.field7794 = var175;
                    class67.field955 = var176;
                    class134.method908(5, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class72.method500(4780);
                return;
            }
            if (arg0 == 5602) {
                if (class380.field5793 == 0) {
                    class460.field6889 = -2;
                    class250.field3478 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field5289 -= 4;
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    class323.method2008(field5282[field5289 + 3], field5282[field5289 + 1], field5282[field5289 + 2], 0, field5282[field5289]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field5290--;
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    class173.method1172(class133.method904(field5301[field5290], 37), -57);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5290 -= 2;
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    class103.method673(field5301[field5290 + 1], -8105, false, class133.method904(field5301[field5290], 37));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class351.field5430 == 0) {
                    class342.field5272 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5282[field5289++] = class250.field3478;
                return;
            }
            if (arg0 == 5608) {
                field5282[field5289++] = class532.field7830;
                return;
            }
            if (arg0 == 5609) {
                field5282[field5289++] = class342.field5272;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field5301[field5290++] = class301.field4420.length > var177 ? class245.method1604(3, class301.field4420[var177]) : "";
                }
                class301.field4420 = null;
                return;
            }
            if (arg0 == 5611) {
                field5282[field5289++] = class489.field7230;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field5282[--field5289];
                if (class435.field6596 != 6) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    if (class374.field5695 != null) {
                        class374.field5695.method1934((byte) -61);
                        class374.field5695 = null;
                    }
                    class67.field955 = var178;
                    class134.method908(8, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field5282[field5289++] = class250.field3478;
                return;
            }
            if (arg0 == 5615) {
                field5290 -= 2;
                String var179 = field5301[field5290];
                String var180 = field5301[field5290 + 1];
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    if (class374.field5695 != null) {
                        class374.field5695.method1934((byte) -29);
                        class374.field5695 = null;
                    }
                    class452.field6813 = var179;
                    class530.field7794 = var180;
                    class134.method908(4, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class420.method2566(-5, false);
                return;
            }
            if (arg0 == 5617) {
                field5282[field5289++] = class460.field6889;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field5282[--field5289];
                class359.method2295(false, (byte) -62, var181);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field5282[--field5289];
                class359.method2295(true, (byte) -62, var182);
                return;
            }
            if (arg0 == 5620) {
                class170.method1156(false);
                if (class33.field512 != "" && class33.field512 != "") {
                    field5282[field5289++] = 1;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field5290 -= 2;
                if (class435.field6596 != 2) {
                    return;
                }
                if (class380.field5793 == 0 && class351.field5430 == 0) {
                    class103.method673(field5301[field5290 + 1], -8105, true, class133.method904(field5301[field5290], 37));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class234 var183 = class312.field4572.method2975(false, 8, "3");
                while (var183.field3322 == 0) {
                    class388.method2433(1L, -120);
                }
                if (var183.field3322 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class368 var184 = (class368) var183.field3324;
                if (var184.method2339((byte) 112).exists()) {
                    class164 var185 = new class164(50);
                    try {
                        var184.method2341(50, 0, var185.field2219, 126);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method2344((byte) -93);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field5282[--field5289];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class203.field2716.field1166 = var186;
                class22.method205(-90);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6002) {
                class203.field2716.method19(field5282[--field5289] == 1, 23809);
                class22.method205(-126);
                class177.method1186((byte) 83);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6003) {
                class203.field2716.field1168 = field5282[--field5289] == 1;
                class177.method1186((byte) 95);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6005) {
                class203.field2716.field1155 = field5282[--field5289] == 1;
                class22.method205(-65);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6006) {
                class203.field2716.field1164 = field5282[--field5289] == 1;
                class400.field6090.method801(!class203.field2716.field1164);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6007) {
                class203.field2716.field1163 = field5282[--field5289];
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6008) {
                class203.field2716.field1182 = field5282[--field5289] == 1;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6009) {
                class203.field2716.field1159 = field5282[--field5289] == 1;
                class22.method205(-96);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6010) {
                class203.field2716.field1153 = field5282[--field5289] == 1;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field5282[--field5289];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class203.field2716.method547(class378.field5771, var187, 92);
                class22.method205(-46);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6012) {
                class203.field2716.method553(16395, class378.field5771, field5282[--field5289] == 1);
                class201.method1360(false);
                class173.method1171((byte) -32);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6014) {
                class203.field2716.field1165 = field5282[--field5289] == 1;
                class22.method205(-118);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6015) {
                class203.field2716.field1174 = field5282[--field5289] == 1;
                class22.method205(-24);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field5282[--field5289];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class203.field2716.field1150 = var188;
                class170.method1152(95, class378.field5771);
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6017) {
                class203.field2716.field1148 = field5282[--field5289] == 1;
                class427.method2607((byte) 121);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field5282[--field5289];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class203.field2716.field1173 = var189;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field5282[--field5289];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class203.field2716.field1157 != var190) {
                    if (class203.field2716.field1157 == 0 && class513.field7536 != -1) {
                        class448.method2736(0, class513.field7536, 0, false, class162.field2111, var190);
                        class539.field7905 = false;
                    } else if (var190 == 0) {
                        class534.method3161((byte) -34);
                        class539.field7905 = false;
                    } else {
                        class27.method248(-31840, var190);
                    }
                    class203.field2716.field1157 = var190;
                }
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field5282[--field5289];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class203.field2716.field1183 = var191;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6021) {
                class203.field2716.field32 = field5282[--field5289] == 1;
                class177.method1186((byte) 99);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field5282[--field5289];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class230.field3289 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class189.method1260((byte) 90, var192);
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                field5282[field5289++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field5282[--field5289];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class203.field2716.field1171 = var194;
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field5282[--field5289];
                if (var195 < 0 || var195 > class321.method2001(-10744, class230.field3289)) {
                    var195 = 0;
                }
                class203.field2716.field1175 = var195;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field5282[--field5289];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class45.method352(122, var196 == 1);
                return;
            }
            if (arg0 == 6028) {
                class203.field2716.field1152 = field5282[--field5289] != 0;
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6029) {
                class203.field2716.field1163 = field5282[--field5289];
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6030) {
                class203.field2716.field1151 = field5282[--field5289] != 0;
                class203.field2716.method20(class312.field4572, 1);
                class22.method205(-104);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field5282[--field5289];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class170.method1152(109, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field5282[--field5289];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class203.field2716.field1177 = var198;
                class203.field2716.method20(class312.field4572, 1);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field5282[--field5289];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class203.field2716.field1170 = var199;
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6034) {
                class203.field2716.field1181 = field5282[--field5289] == 1;
                class203.field2716.method20(class312.field4572, 1);
                class201.method1360(false);
                class502.field7416 = false;
                return;
            }
            if (arg0 == 6035) {
                class203.field2716.field20 = field5282[--field5289] == 1;
                class22.method205(-73);
                class177.method1186((byte) 84);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5282[field5289++] = class203.field2716.field1166;
                return;
            }
            if (arg0 == 6102) {
                field5282[field5289++] = class203.field2716.method18(class378.field5771, 123) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5282[field5289++] = class203.field2716.field1168 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5282[field5289++] = class203.field2716.field1155 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field5282[field5289++] = class203.field2716.field1164 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5282[field5289++] = class203.field2716.field1163;
                return;
            }
            if (arg0 == 6108) {
                field5282[field5289++] = class203.field2716.field1182 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field5282[field5289++] = class203.field2716.field1159 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5282[field5289++] = class203.field2716.field1153 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5282[field5289++] = class203.field2716.method552(-4, class378.field5771);
                return;
            }
            if (arg0 == 6112) {
                field5282[field5289++] = class203.field2716.method549((byte) -122, class378.field5771) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5282[field5289++] = class203.field2716.field1165 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5282[field5289++] = class203.field2716.field1174 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5282[field5289++] = class203.field2716.field1150;
                return;
            }
            if (arg0 == 6117) {
                field5282[field5289++] = class203.field2716.field1148 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5282[field5289++] = class203.field2716.field1173;
                return;
            }
            if (arg0 == 6119) {
                field5282[field5289++] = class203.field2716.field1157;
                return;
            }
            if (arg0 == 6120) {
                field5282[field5289++] = class203.field2716.field1183;
                return;
            }
            if (arg0 == 6121) {
                field5282[field5289++] = class400.field6090.method846() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field5282[field5289++] = class294.method1880(-9087);
                return;
            }
            if (arg0 == 6124) {
                field5282[field5289++] = class203.field2716.field1171;
                return;
            }
            if (arg0 == 6125) {
                field5282[field5289++] = class203.field2716.field1175;
                return;
            }
            if (arg0 == 6126) {
                field5282[field5289++] = class400.field6090.method827() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field5282[field5289++] = class203.field2716.field1149 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5282[field5289++] = class203.field2716.field1152 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5282[field5289++] = class203.field2716.field1163;
                return;
            }
            if (arg0 == 6130) {
                field5282[field5289++] = class203.field2716.field1151 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5282[field5289++] = class378.field5771;
                return;
            }
            if (arg0 == 6132) {
                field5282[field5289++] = class203.field2716.field1177;
                return;
            }
            if (arg0 == 6133) {
                field5282[field5289++] = class500.field7379 == 1 || class500.field7379 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field5282[field5289++] = class321.method2001(-10744, class230.field3289);
                return;
            }
            if (arg0 == 6135) {
                field5282[field5289++] = class203.field2716.field1170;
                return;
            }
            if (arg0 == 6136) {
                field5282[field5289++] = class203.field2716.field1181 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field5282[field5289++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5289 -= 2;
                class408.field6193 = (short) field5282[field5289];
                if (class408.field6193 <= 0) {
                    class408.field6193 = 256;
                }
                class187.field2515 = (short) field5282[field5289 + 1];
                if (class187.field2515 <= 0) {
                    class187.field2515 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5289 -= 2;
                class84.field1231 = (short) field5282[field5289];
                if (class84.field1231 <= 0) {
                    class84.field1231 = 256;
                }
                class542.field7920 = (short) field5282[field5289 + 1];
                if (class542.field7920 <= 0) {
                    class542.field7920 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5289 -= 4;
                class99.field1455 = (short) field5282[field5289];
                if (class99.field1455 <= 0) {
                    class99.field1455 = 1;
                }
                class283.field4165 = (short) field5282[field5289 + 1];
                if (class283.field4165 <= 0) {
                    class283.field4165 = 32767;
                } else if (class283.field4165 < class99.field1455) {
                    class283.field4165 = class99.field1455;
                }
                class244.field3424 = (short) field5282[field5289 + 2];
                if (class244.field3424 <= 0) {
                    class244.field3424 = 1;
                }
                class78.field1122 = (short) field5282[field5289 + 3];
                if (class78.field1122 <= 0) {
                    class78.field1122 = 32767;
                    return;
                }
                if (class78.field1122 < class244.field3424) {
                    class78.field1122 = class244.field3424;
                }
                return;
            }
            if (arg0 == 6203) {
                class466.method2803(class80.field1139.field3991, 25, 0, 0, class80.field1139.field4043, false);
                field5282[field5289++] = class359.field5513;
                field5282[field5289++] = class178.field2381;
                return;
            }
            if (arg0 == 6204) {
                field5282[field5289++] = class84.field1231;
                field5282[field5289++] = class542.field7920;
                return;
            }
            if (arg0 == 6205) {
                field5282[field5289++] = class408.field6193;
                field5282[field5289++] = class187.field2515;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5282[field5289++] = (int) (class58.method427((byte) -19) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5282[field5289++] = (int) (class58.method427((byte) -19) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5289 -= 3;
                int var201 = field5282[field5289];
                int var202 = field5282[field5289 + 1];
                int var203 = field5282[field5289 + 2];
                field5280.clear();
                field5280.set(11, 12);
                field5280.set(var203, var202, var201);
                int var204 = (int) (field5280.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field5282[field5289++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field5280.clear();
                field5280.setTime(new Date(class58.method427((byte) -19)));
                field5282[field5289++] = field5280.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field5282[--field5289];
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
                field5282[field5289++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5282[field5289++] = class420.method2565((byte) -5) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5282[field5289++] = class199.method1328(62) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class435.field6596 == 6 && class380.field5793 == 0 && class351.field5430 == 0) {
                    if (class70.field981) {
                        field5282[field5289++] = 0;
                        return;
                    }
                    if (class351.field5432 > class58.method427((byte) -19) - 1000L) {
                        field5282[field5289++] = 1;
                        return;
                    }
                    class70.field981 = true;
                    class424.method2582(class441.field6656, -1);
                    class538.field7879.method1073(326170192, class389.field5943);
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class412 var207 = class507.method3044(100);
                if (var207 != null) {
                    field5282[field5289++] = var207.field6264;
                    field5282[field5289++] = var207.field6156;
                    field5301[field5290++] = var207.field6260;
                    class35 var208 = var207.method2541(4);
                    field5282[field5289++] = var208.field518;
                    field5301[field5290++] = var208.field520;
                    field5282[field5289++] = var207.field6155;
                    field5282[field5289++] = var207.field6261;
                    field5301[field5290++] = var207.field6257;
                    return;
                }
                field5282[field5289++] = -1;
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                return;
            }
            if (arg0 == 6502) {
                class412 var209 = class296.method1893((byte) -124);
                if (var209 != null) {
                    field5282[field5289++] = var209.field6264;
                    field5282[field5289++] = var209.field6156;
                    field5301[field5290++] = var209.field6260;
                    class35 var210 = var209.method2541(4);
                    field5282[field5289++] = var210.field518;
                    field5301[field5290++] = var210.field520;
                    field5282[field5289++] = var209.field6155;
                    field5282[field5289++] = var209.field6261;
                    field5301[field5290++] = var209.field6257;
                    return;
                }
                field5282[field5289++] = -1;
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field5282[--field5289];
                String var212 = field5301[--field5290];
                if (class435.field6596 == 6 && class380.field5793 == 0 && class351.field5430 == 0) {
                    field5282[field5289++] = class289.method1852(var212, 32, var211) ? 1 : 0;
                    return;
                }
                field5282[field5289++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class203.field2716.field1162 = field5282[--field5289];
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6505) {
                field5282[field5289++] = class203.field2716.field1162;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field5282[--field5289];
                class412 var214 = class516.method3081(var213, -1);
                if (var214 != null) {
                    field5282[field5289++] = var214.field6156;
                    field5301[field5290++] = var214.field6260;
                    class35 var215 = var214.method2541(4);
                    field5282[field5289++] = var215.field518;
                    field5301[field5290++] = var215.field520;
                    field5282[field5289++] = var214.field6155;
                    field5282[field5289++] = var214.field6261;
                    field5301[field5290++] = var214.field6257;
                    return;
                }
                field5282[field5289++] = -1;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                field5282[field5289++] = 0;
                field5282[field5289++] = 0;
                field5301[field5290++] = "";
                return;
            }
            if (arg0 == 6507) {
                field5289 -= 4;
                int var216 = field5282[field5289];
                boolean var217 = field5282[field5289 + 1] == 1;
                int var218 = field5282[field5289 + 2];
                boolean var219 = field5282[field5289 + 3] == 1;
                class527.method3120(var219, var217, var216, var218, 27397);
                return;
            }
            if (arg0 == 6508) {
                class459.method2783(-4185);
                return;
            }
            if (arg0 == 6509) {
                if (class435.field6596 != 6) {
                    return;
                }
                class84.field1227 = field5282[--field5289] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class203.field2716.field1180 = field5282[--field5289] == 1;
                class203.field2716.method20(class312.field4572, 1);
                return;
            }
            if (arg0 == 6601) {
                field5282[field5289++] = class203.field2716.field1180 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class154.field2011 == class112.field1566) {
            if (arg0 == 6700) {
                int var220 = class312.field4570.method1749(0);
                if (class337.field5232 != -1) {
                    var220++;
                }
                field5282[field5289++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field5282[--field5289];
                if (class337.field5232 != -1) {
                    if (var221 == 0) {
                        field5282[field5289++] = class337.field5232;
                        return;
                    }
                    var221--;
                }
                class436 var222 = (class436) class312.field4570.method1743(false);
                while (var221-- > 0) {
                    var222 = (class436) class312.field4570.method1742(112);
                }
                field5282[field5289++] = var222.field6598;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field5282[--field5289];
                if (class263.field3690[var223] == null) {
                    field5301[field5290++] = "";
                    return;
                }
                String var224 = class263.field3690[var223][0].field4100;
                if (var224 == null) {
                    field5301[field5290++] = "";
                    return;
                }
                field5301[field5290++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field5282[--field5289];
                if (class263.field3690[var225] == null) {
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = class263.field3690[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field5289 -= 2;
                int var226 = field5282[field5289];
                int var227 = field5282[field5289 + 1];
                if (class263.field3690[var226] == null) {
                    field5301[field5290++] = "";
                    return;
                }
                String var228 = class263.field3690[var226][var227].field4100;
                if (var228 == null) {
                    field5301[field5290++] = "";
                    return;
                }
                field5301[field5290++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field5289 -= 2;
                int var229 = field5282[field5289];
                int var230 = field5282[field5289 + 1];
                if (class263.field3690[var229] == null) {
                    field5282[field5289++] = 0;
                    return;
                }
                field5282[field5289++] = class263.field3690[var229][var230].field3989;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field5289 -= 3;
                int var231 = field5282[field5289];
                int var232 = field5282[field5289 + 1];
                int var233 = field5282[field5289 + 2];
                class257.method1654(var231 << 16 | var232, "", (byte) 103, 1, var233);
                return;
            }
            if (arg0 == 6708) {
                field5289 -= 3;
                int var234 = field5282[field5289];
                int var235 = field5282[field5289 + 1];
                int var236 = field5282[field5289 + 2];
                class257.method1654(var234 << 16 | var235, "", (byte) 123, 2, var236);
                return;
            }
            if (arg0 == 6709) {
                field5289 -= 3;
                int var237 = field5282[field5289];
                int var238 = field5282[field5289 + 1];
                int var239 = field5282[field5289 + 2];
                class257.method1654(var237 << 16 | var238, "", (byte) 124, 3, var239);
                return;
            }
            if (arg0 == 6710) {
                field5289 -= 3;
                int var240 = field5282[field5289];
                int var241 = field5282[field5289 + 1];
                int var242 = field5282[field5289 + 2];
                class257.method1654(var240 << 16 | var241, "", (byte) 122, 4, var242);
                return;
            }
            if (arg0 == 6711) {
                field5289 -= 3;
                int var243 = field5282[field5289];
                int var244 = field5282[field5289 + 1];
                int var245 = field5282[field5289 + 2];
                class257.method1654(var243 << 16 | var244, "", (byte) 108, 5, var245);
                return;
            }
            if (arg0 == 6712) {
                field5289 -= 3;
                int var246 = field5282[field5289];
                int var247 = field5282[field5289 + 1];
                int var248 = field5282[field5289 + 2];
                class257.method1654(var246 << 16 | var247, "", (byte) 113, 6, var248);
                return;
            }
            if (arg0 == 6713) {
                field5289 -= 3;
                int var249 = field5282[field5289];
                int var250 = field5282[field5289 + 1];
                int var251 = field5282[field5289 + 2];
                class257.method1654(var249 << 16 | var250, "", (byte) 104, 7, var251);
                return;
            }
            if (arg0 == 6714) {
                field5289 -= 3;
                int var252 = field5282[field5289];
                int var253 = field5282[field5289 + 1];
                int var254 = field5282[field5289 + 2];
                class257.method1654(var252 << 16 | var253, "", (byte) 125, 8, var254);
                return;
            }
            if (arg0 == 6715) {
                field5289 -= 3;
                int var255 = field5282[field5289];
                int var256 = field5282[field5289 + 1];
                int var257 = field5282[field5289 + 2];
                class257.method1654(var255 << 16 | var256, "", (byte) 108, 9, var257);
                return;
            }
            if (arg0 == 6716) {
                field5289 -= 3;
                int var258 = field5282[field5289];
                int var259 = field5282[field5289 + 1];
                int var260 = field5282[field5289 + 2];
                class257.method1654(var258 << 16 | var259, "", (byte) 122, 10, var260);
                return;
            }
            if (arg0 == 6717) {
                field5289 -= 3;
                int var261 = field5282[field5289];
                int var262 = field5282[field5289 + 1];
                int var263 = field5282[field5289 + 2];
                class282 var264 = class178.method1197(var263, var261 << 16 | var262, 41);
                class306.method1922(-1);
                class445 var265 = client.method1348(var264);
                class136.method917(-109, var265.method2699(1661101682), var264, var265.field6681);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field5282[--field5289];
                class38 var267 = class509.field7484.method1851(36, var266);
                if (var267.field550 == null) {
                    field5301[field5290++] = "";
                    return;
                }
                field5301[field5290++] = var267.field550;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field5282[--field5289];
                class38 var269 = class509.field7484.method1851(36, var268);
                field5282[field5289++] = var269.field536;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field5282[--field5289];
                class38 var271 = class509.field7484.method1851(36, var270);
                field5282[field5289++] = var271.field547;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field5282[--field5289];
                class38 var273 = class509.field7484.method1851(36, var272);
                field5282[field5289++] = var273.field571;
                return;
            }
            if (arg0 == 6804) {
                field5289 -= 2;
                int var274 = field5282[field5289];
                int var275 = field5282[field5289 + 1];
                class205 var276 = class83.field1218.method3118(var275, -13676);
                if (var276.method1383(22243)) {
                    field5301[field5290++] = class509.field7484.method1851(36, var274).method318(0, var276.field2729, var275);
                    return;
                }
                field5282[field5289++] = class509.field7484.method1851(36, var274).method322(80, var275, var276.field2727);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field5282[field5289++] = class230.field3300 && !class60.field865 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field5282[field5289++] = class141.field1891;
                return;
            }
            if (arg0 == 6902) {
                field5282[field5289++] = class145.field1934;
                return;
            }
            if (arg0 == 6903) {
                field5282[field5289++] = class183.field2481;
                return;
            }
            if (arg0 == 6904) {
                field5282[field5289++] = class13.field260;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class160.field2087 != null) {
                    if (class160.field2087.field3324 == null) {
                        var277 = class91.method611(86, class160.field2087.field3320);
                    } else {
                        var277 = (String) class160.field2087.field3324;
                    }
                }
                field5301[field5290++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field5282[field5289++] = class91.field1323;
                return;
            }
            if (arg0 == 6907) {
                field5282[field5289++] = class513.field7543;
                return;
            }
            if (arg0 == 6908) {
                field5282[field5289++] = class451.field6777;
                return;
            }
            if (arg0 == 6909) {
                field5282[field5289++] = class390.field5955 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field5282[field5289++] = class84.field1230;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Leq;)V")
    public static final void method2227(class143 arg0) {
        method2223(arg0, 200000);
    }
}
