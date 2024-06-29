import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class56 {

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    private int field1209 = 0;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[Ldh;")
    private class30[] field1207;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lia;")
    private static class257 field1201 = class28.method234(-113, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[S")
    public static short[] field1191 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lia;")
    public static class257 field1187 = field1201;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lia;")
    private static class257 field1193 = class28.method234(-79, "yellow:");

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lia;")
    public static class257 field1198 = field1193;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lia;")
    public static class257 field1203 = field1193;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "J")
    private long field1186;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Lvb;")
    public static class226 field1204;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Ldh;")
    private class30 field1196;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Ldh;")
    private class30 field1208;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ldh;BJ)V")
    public final void method424(class30 arg0, byte arg1, long arg2) {
        if (arg0.field568 != null) {
            arg0.method254(arg1 + 41);
        }
        field1200++;
        if (arg1 != -40) {
            field1203 = null;
        }
        class30 var5 = this.field1207[(int) (arg2 & (long) (this.field1188 - 1))];
        arg0.field577 = var5;
        arg0.field573 = arg2;
        arg0.field568 = var5.field568;
        arg0.field568.field577 = arg0;
        arg0.field577.field568 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
    public static final void method425(byte[] arg0, int arg1) {
        field1197++;
        class152 var2 = new class152(arg0);
        var2.field2677 = arg0.length - 2;
        class135.field2421 = var2.method1063(-17162);
        class72.field1411 = new int[class135.field2421];
        class137.field2454 = new byte[class135.field2421][];
        if (arg1 < 68) {
            field1203 = null;
        }
        class193.field3287 = new int[class135.field2421];
        class55.field1184 = new byte[class135.field2421][];
        class154.field2701 = new int[class135.field2421];
        class57.field1212 = new int[class135.field2421];
        class69.field1375 = new boolean[class135.field2421];
        var2.field2677 = arg0.length - class135.field2421 * 8 - 7;
        class20.field427 = var2.method1063(-17162);
        class9.field184 = var2.method1063(-17162);
        int var3 = (var2.method1051((byte) -79) & 0xFF) + 1;
        for (int var4 = 0; var4 < class135.field2421; var4++) {
            class57.field1212[var4] = var2.method1063(-17162);
        }
        for (int var5 = 0; var5 < class135.field2421; var5++) {
            class154.field2701[var5] = var2.method1063(-17162);
        }
        for (int var6 = 0; var6 < class135.field2421; var6++) {
            class72.field1411[var6] = var2.method1063(-17162);
        }
        for (int var7 = 0; var7 < class135.field2421; var7++) {
            class193.field3287[var7] = var2.method1063(-17162);
        }
        var2.field2677 = arg0.length - ((var3 - 1) * 3 + class135.field2421 * 8 + 7);
        class3.field92 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class3.field92[var8] = var2.method1064((byte) -127);
            if (class3.field92[var8] == 0) {
                class3.field92[var8] = 1;
            }
        }
        var2.field2677 = 0;
        for (int var9 = 0; var9 < class135.field2421; var9++) {
            int var10 = class72.field1411[var9];
            int var11 = class193.field3287[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class137.field2454[var9] = var14;
            class55.field1184[var9] = var13;
            int var16 = var2.method1051((byte) 118);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method1060((byte) -58);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1060((byte) -58);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var13[var10 * var22 + var21] = var2.method1060((byte) -58);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var14[var10 * var24 + var20] = var2.method1060((byte) -58);
                    }
                    var20++;
                }
            }
            class69.field1375[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
    public static final void method426(int arg0, byte arg1) {
        field1195++;
        class17 var2 = class152.field2635;
        synchronized (class152.field2635) {
            class54.field1161 = arg0;
        }
        if (arg1 != -123) {
            field1203 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Ldh;")
    public final class30 method427(byte arg0) {
        this.field1209 = 0;
        if (arg0 != 58) {
            this.method428(true);
        }
        field1189++;
        return this.method428(false);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Ldh;")
    public final class30 method428(boolean arg0) {
        field1194++;
        if (this.field1209 > 0 && this.field1207[this.field1209 - 1] != this.field1208) {
            class30 var2 = this.field1208;
            this.field1208 = var2.field577;
            return var2;
        }
        while (this.field1188 > this.field1209) {
            class30 var3 = this.field1207[this.field1209++].field577;
            if (this.field1207[this.field1209 - 1] != var3) {
                this.field1208 = var3.field577;
                return var3;
            }
        }
        if (arg0) {
            method426(-93, (byte) -97);
        }
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method429(int arg0) {
        class71.field1391.method833(0);
        if (arg0 == 20123) {
            field1202++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Ldh;")
    public final class30 method430(int arg0) {
        field1190++;
        if (this.field1196 == null) {
            return null;
        }
        class30 var2 = this.field1207[(int) ((long) (this.field1188 - 1) & this.field1186)];
        if (arg0 < 38) {
            return null;
        }
        while (this.field1196 != var2) {
            if (this.field1196.field573 == this.field1186) {
                class30 var3 = this.field1196;
                this.field1196 = this.field1196.field577;
                return var3;
            }
            this.field1196 = this.field1196.field577;
        }
        this.field1196 = null;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 != 12747) {
            method435(-75, 14, -80, -44, -125);
        }
        for (int var2 = 0; var2 < this.field1188; var2++) {
            class30 var3 = this.field1207[var2];
            while (true) {
                class30 var4 = var3.field577;
                if (var3 == var4) {
                    break;
                }
                var4.method254(1);
            }
        }
        this.field1196 = null;
        this.field1208 = null;
        field1206++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method432(int arg0, int arg1) {
        if (arg1 == -1 && !class246.field4259) {
            class31.method266(123);
        } else if (arg1 != -1 && (class124.field2228 != arg1 || !class239.method1573((byte) -95)) && class26.field513 != 0 && !class246.field4259) {
            class12.method129(class259.field4502, -128, arg1, class26.field513, 2, false, 0);
        }
        field1192++;
        class124.field2228 = arg1;
        if (arg0 != 0) {
            field1198 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static void method433(int arg0) {
        field1203 = null;
        field1198 = null;
        field1191 = null;
        field1193 = null;
        field1201 = null;
        field1187 = null;
        if (arg0 != 0) {
            method435(79, 16, -32, 76, 124);
        }
        field1204 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BJ)Ldh;")
    public final class30 method434(byte arg0, long arg1) {
        this.field1186 = arg1;
        if (arg0 != -93) {
            return null;
        }
        class30 var4 = this.field1207[(int) ((long) (this.field1188 - 1) & arg1)];
        field1205++;
        for (this.field1196 = var4.field577; this.field1196 != var4; this.field1196 = this.field1196.field577) {
            if (this.field1196.field573 == arg1) {
                class30 var5 = this.field1196;
                this.field1196 = this.field1196.field577;
                return var5;
            }
        }
        this.field1196 = null;
        return null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1188 = arg0;
        this.field1207 = new class30[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class30 var3 = this.field1207[var2] = new class30();
            var3.field577 = var3;
            var3.field568 = var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method435(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= arg1) {
            class94.method692(class185.field3220[arg2], (byte) 40, arg1, arg3, arg4);
        } else {
            class94.method692(class185.field3220[arg2], (byte) 57, arg4, arg3, arg1);
        }
        field1199++;
        if (arg0 < 75) {
            method425((byte[]) null, 37);
        }
    }
}
