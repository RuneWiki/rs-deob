import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class192 extends class4 {

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
    public boolean field2616 = true;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
    public static int[] field2600 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Los;")
    public class173 field2603;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
    private int[] field2607;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
    public int[] field2615;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field2612;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[[I")
    private int[][] field2617;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lrp;Ljava/lang/Object;I)V", line = 3)
    public static final void method1184(class135 arg0, Object arg1, int arg2) {
        field2613++;
        if (arg0.field1927 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 != 25475) {
            return;
        }
        while (var3 < 50 && arg0.field1927.peekEvent() != null) {
            class688.method3874(1L, arg2 - 32850);
            var3++;
        }
        try {
            if (arg1 != null) {
                arg0.field1927.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lht;Z)V", line = 33)
    public static final void method1185(class395 arg0, boolean arg1) {
        for (int var2 = arg0.field5680; var2 <= arg0.field5683; var2++) {
            for (int var3 = arg0.field5673; var3 <= arg0.field5679; var3++) {
                class262 var4 = class137.field1948[arg0.field4408][var2][var3];
                if (var4 != null) {
                    class638 var5 = var4.field3846;
                    class638 var6 = null;
                    while (var5 != null) {
                        if (var5.field8567 == arg0) {
                            if (var6 == null) {
                                var4.field3846 = var5.field8564;
                            } else {
                                var6.field8564 = var5.field8564;
                            }
                            var5.method3566(-1643);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field8564;
                    }
                }
            }
        }
        if (!arg1) {
            class537.method3176(arg0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 81)
    public static void method1186(byte arg0) {
        if (arg0 < 44) {
            method1188(-22, 42, 96, 3, 54, -64, 49, 74, -109, 95);
        }
        field2600 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Ldc;B)V", line = 94)
    public final void method1187(class63 arg0, byte arg1) {
        if (arg1 < 44) {
            method1195(25, -11, -57);
        }
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                field2604++;
                return;
            }
            this.method1198(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIII)V", line = 116)
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2605++;
        if (arg6 <= 82) {
            return;
        }
        if (arg1 == arg8 && arg2 == arg4 && arg5 == arg7 && arg0 == arg9) {
            class388.method2440(arg8, arg3, arg4, -112, arg5, arg9);
            return;
        }
        int var10 = arg8;
        int var11 = arg4;
        int var12 = arg8 * 3;
        int var13 = arg4 * 3;
        int var14 = arg1 * 3;
        int var15 = arg2 * 3;
        int var16 = arg7 * 3;
        int var17 = arg0 * 3;
        int var18 = arg5 + var14 - arg8 - var16;
        int var19 = arg9 + var15 - var17 - arg4;
        int var20 = var12 + var16 - var14 - var14;
        int var21 = var13 + var17 - (var15 - -var15);
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var31 + var27 >> 12) + arg8;
            int var34 = (var28 + var30 + var32 >> 12) + arg4;
            class388.method2440(var10, arg3, var11, -126, var33, var34);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/String;", line = 192)
    public final String method1189(int arg0) {
        int var2 = -119 / ((-arg0 - 29) / 33);
        field2602++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2612 == null) {
            return "";
        }
        var3.append(this.field2612[0]);
        for (int var4 = 1; var4 < this.field2612.length; var4++) {
            var3.append("...");
            var3.append(this.field2612[var4]);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IZLdc;)V", line = 219)
    public final void method1190(int[] arg0, boolean arg1, class63 arg2) {
        field2611++;
        if (this.field2607 == null) {
            return;
        }
        if (!arg1) {
            this.method1197(-49, 17, 120);
        }
        for (int var4 = 0; var4 < this.field2607.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method1194(var4, -113).field4482;
            if (var5 > 0) {
                arg2.method445(var5, (long) arg0[var4], 8);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I", line = 252)
    public final int method1191(int arg0) {
        field2614++;
        int var2 = -46 % ((-arg0 - 17) / 57);
        return this.field2607 == null ? 0 : this.field2607.length;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V", line = 273)
    public final void method1192(int arg0) {
        field2606++;
        if (this.field2615 != null) {
            for (int var2 = 0; var2 < this.field2615.length; var2++) {
                this.field2615[var2] = class678.method3817(this.field2615[var2], 32768);
            }
        }
        int var3 = -102 % ((-arg0 - 39) / 36);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z", line = 296)
    public static final boolean method1193(byte arg0, int arg1, int arg2) {
        if (arg0 == -2) {
            field2619++;
            return (arg1 & 0x70000) != 0 | class248.method1707(arg2, arg0 + 1, arg1) || class622.method3508(arg1, arg2, -124);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Ljn;", line = 310)
    public final class324 method1194(int arg0, int arg1) {
        field2608++;
        if (this.field2607 == null || arg0 < 0 || this.field2607.length < arg0) {
            return null;
        } else {
            int var3 = -48 % ((-arg1 - 60) / 35);
            return class643.method3591(this.field2607[arg0], -64);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 327)
    public static final void method1195(int arg0, int arg1, int arg2) {
        field2610++;
        if (class461.field6388 < class461.field6392) {
            class461.field6388 = (float) ((double) class461.field6388 / 30.0D + (double) class461.field6388);
            if (class461.field6388 > class461.field6392) {
                class461.field6388 = class461.field6392;
            }
            class558.method3284(-1);
            class461.field6390 = (int) class461.field6388 >> 1;
            class461.field6393 = class406.method2540(class461.field6390, 21781);
        } else if (class461.field6392 < class461.field6388) {
            class461.field6388 = (float) ((double) class461.field6388 - (double) class461.field6388 / 30.0D);
            if (class461.field6388 < class461.field6392) {
                class461.field6388 = class461.field6392;
            }
            class558.method3284(-1);
            class461.field6390 = (int) class461.field6388 >> 1;
            class461.field6393 = class406.method2540(class461.field6390, 21781);
        }
        if (class609.field8207 != -1 && class329.field4660 != -1) {
            int var3 = class609.field8207 - class513.field7087;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class329.field4660 - class718.field10001;
            class513.field7087 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (var3 == 0 && var4 == 0) {
                class329.field4660 = -1;
                class609.field8207 = -1;
            }
            class718.field10001 += var4;
            class558.method3284(-1);
        }
        int var5 = 74 / ((arg0 - 46) / 50);
        if (class224.field3017 > 0) {
            class659.field8770--;
            if (class659.field8770 == 0) {
                class659.field8770 = 100;
                class224.field3017--;
            }
        } else {
            class293.field4201 = -1;
            class505.field7031 = -1;
        }
        if (!class447.field6201 || class226.field3034 == null) {
            return;
        }
        for (class726 var6 = (class726) class226.field3034.method3618(118); var6 != null; var6 = (class726) class226.field3034.method3619(0)) {
            class21 var7 = class461.field6385.method11(82, var6.field10062.field9990);
            if (var6.method4051(arg2, arg1, (byte) 122)) {
                if (var7.field219 != null) {
                    if (var7.field219[4] != null) {
                        class300.method1979(true, -1, false, -1, var7.field241, (long) var6.field10062.field9990, (byte) 115, false, 0, (long) var6.field10062.field9990, var7.field235, 1011, var7.field219[4]);
                    }
                    if (var7.field219[3] != null) {
                        class300.method1979(true, -1, false, -1, var7.field241, (long) var6.field10062.field9990, (byte) 115, false, 0, (long) var6.field10062.field9990, var7.field235, 1004, var7.field219[3]);
                    }
                    if (var7.field219[2] != null) {
                        class300.method1979(true, -1, false, -1, var7.field241, (long) var6.field10062.field9990, (byte) 115, false, 0, (long) var6.field10062.field9990, var7.field235, 1008, var7.field219[2]);
                    }
                    if (var7.field219[1] != null) {
                        class300.method1979(true, -1, false, -1, var7.field241, (long) var6.field10062.field9990, (byte) 115, false, 0, (long) var6.field10062.field9990, var7.field235, 1010, var7.field219[1]);
                    }
                    if (var7.field219[0] != null) {
                        class300.method1979(true, -1, false, -1, var7.field241, (long) var6.field10062.field9990, (byte) 115, false, 0, (long) var6.field10062.field9990, var7.field235, 1012, var7.field219[0]);
                    }
                }
                if (!var6.field10062.field9991) {
                    var6.field10062.field9991 = true;
                    class546.method3226(class470.field6527, var6.field10062.field9990, var7.field235);
                }
                if (var6.field10062.field9991) {
                    class546.method3226(class13.field121, var6.field10062.field9990, var7.field235);
                }
            } else if (var6.field10062.field9991) {
                var6.field10062.field9991 = false;
                class546.method3226(class258.field3731, var6.field10062.field9990, var7.field235);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 468)
    public static final void method1196(String arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, String arg7, String arg8) {
        field2599++;
        class359 var9 = class147.field2053[arg3];
        for (int var10 = 99; var10 > 0; var10--) {
            class147.field2053[var10] = class147.field2053[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class359(arg1, arg2, arg6, arg0, arg7, arg8, arg4, arg5);
        } else {
            var9.method2291(arg8, (byte) -95, arg2, arg5, arg7, arg0, arg6, arg1, arg4);
        }
        class147.field2053[0] = var9;
        class468.field6501 = class320.field4449;
        class757.field10566++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)I", line = 492)
    public final int method1197(int arg0, int arg1, int arg2) {
        field2601++;
        if (this.field2607 == null || arg2 < 0 || arg2 > this.field2607.length) {
            return -1;
        } else if (this.field2617[arg2] == null || arg0 < 0 || this.field2617[arg2].length < arg0) {
            return -1;
        } else {
            int var4 = 7 % ((50 - arg1) / 54);
            return this.field2617[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILdc;Z)V", line = 510)
    private final void method1198(int arg0, class63 arg1, boolean arg2) {
        if (arg2) {
            this.field2607 = null;
        }
        if (arg0 == 1) {
            this.field2612 = class494.method2992('<', arg1.method479((byte) -6), 1);
        } else if (arg0 == 2) {
            int var9 = arg1.method505((byte) -119);
            this.field2615 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2615[var10] = arg1.method482(-772591672);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method505((byte) -119);
            this.field2607 = new int[var4];
            this.field2617 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method482(-772591672);
                class324 var7 = class643.method3591(var6, -97);
                if (var7 != null) {
                    this.field2607[var5] = var6;
                    this.field2617[var5] = new int[var7.field4487];
                    for (int var8 = 0; var8 < var7.field4487; var8++) {
                        this.field2617[var5][var8] = arg1.method482(-772591672);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field2616 = false;
        }
        field2618++;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(Ldc;B)Ljava/lang/String;", line = 585)
    public final String method1199(class63 arg0, byte arg1) {
        if (arg1 != -125) {
            return null;
        }
        field2609++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2607 != null) {
            for (int var4 = 0; var4 < this.field2607.length; var4++) {
                var3.append(this.field2612[var4]);
                var3.append(this.field2603.method1106(arg1 + 125, this.method1194(var4, arg1 ^ 0x9), this.field2617[var4], arg0.method460(class643.method3591(this.field2607[var4], -58).field4480, (byte) -101)));
            }
        }
        var3.append(this.field2612[this.field2612.length - 1]);
        return var3.toString();
    }
}
