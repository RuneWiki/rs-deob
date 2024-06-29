import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class235 extends class153 {

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Lpj;")
    public static class237 field4069 = class33.method353("Eingabeprozedur geladen)3", 88);

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[I")
    public static int[] field4082 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "[S")
    public static short[] field4090 = new short[500];

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "Lpj;")
    public static class237 field4078 = class33.method353("Stufe:", 61);

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4071 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "Lvb;")
    public static class59 field4093;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "[I")
    public int[] field4072;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[I")
    private int[] field4091;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "[Lpj;")
    private class237[] field4076;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[[I")
    private int[][] field4073;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method1560(byte arg0) {
        if (arg0 <= 67) {
            method1563(37, (class239) null);
        }
        field4078 = null;
        field4093 = null;
        field4071 = null;
        field4069 = null;
        field4090 = null;
        field4082 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method1561(int arg0, int arg1) {
        if (arg1 > -113) {
            this.method1567(73, -102, -98);
        }
        field4079++;
        return this.field4091 == null || arg0 < 0 || arg0 > this.field4091.length ? -1 : this.field4091[arg0];
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public static final void method1562(int arg0) {
        field4084++;
        class216.field3755.method934((byte) 62);
        if (arg0 != -31424) {
            field4071 = null;
        }
        class203.field3482.method934((byte) 62);
        class232.field4020.method934((byte) 62);
        class32.field670.method934((byte) 62);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILfa;)V")
    public static final void method1563(int arg0, class239 arg1) {
        class78.field1467 = arg1;
        if (arg0 == 24871) {
            field4092++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)I")
    public final int method1564(int arg0) {
        field4075++;
        if (this.field4091 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                method1563(-72, (class239) null);
            }
            return this.field4091.length;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLie;)Lpj;")
    public final class237 method1565(byte arg0, class32 arg1) {
        if (arg0 != -105) {
            method1560((byte) 112);
        }
        field4081++;
        class237 var3 = class240.method1666(80, true);
        if (this.field4091 != null) {
            for (int var4 = 0; var4 < this.field4091.length; var4++) {
                var3.method1612((byte) -112, this.field4076[var4]);
                var3.method1612((byte) -102, class148.method1005(arg1.method335(class141.field2513[this.field4091[var4]], false), this.field4073[var4], 127, this.field4091[var4]));
            }
        }
        var3.method1612((byte) -107, this.field4076[this.field4076.length - 1]);
        return var3.method1596(20325);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)Lpj;")
    public final class237 method1566(byte arg0) {
        field4094++;
        class237 var2 = class240.method1666(80, true);
        if (this.field4076 == null) {
            return class65.field1293;
        }
        var2.method1612((byte) -128, this.field4076[0]);
        if (arg0 >= -100) {
            return null;
        }
        for (int var3 = 1; var3 < this.field4076.length; var3++) {
            var2.method1612((byte) -105, class97.field1734);
            var2.method1612((byte) -128, this.field4076[var3]);
        }
        return var2.method1596(20325);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public final int method1567(int arg0, int arg1, int arg2) {
        field4083++;
        int var4 = -109 / ((-arg0 - 68) / 41);
        if (this.field4091 == null || arg2 < 0 || arg2 > this.field4091.length) {
            return -1;
        } else if (this.field4073[arg2] == null || arg1 < 0 || this.field4073[arg2].length < arg1) {
            return -1;
        } else {
            return this.field4073[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
    public static final void method1568(int arg0) {
        field4088++;
        if (arg0 > -113) {
            field4071 = null;
        }
        if (class260.field4465 == 2) {
            if (class243.field4270 == class169.field2968 && class3.field39 == class126.field2201) {
                class260.field4465 = 0;
                class19.method195(class271.field4664 - 1, 31040);
            }
        } else if (class227.field3891 == class169.field2968 && class58.field1196 == class126.field2201) {
            class260.field4465 = 0;
            class19.method195(class271.field4664 - 1, 31040);
        } else {
            class260.field4465 = 2;
            class3.field39 = class58.field1196;
            class243.field4270 = class227.field3891;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IILie;)V")
    public final void method1569(int[] arg0, int arg1, class32 arg2) {
        if (arg1 <= 86) {
            return;
        }
        field4085++;
        if (this.field4091 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4091.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class254.field4359[this.method1561(var4, -124)];
            if (var5 > 0) {
                arg2.method332((long) arg0[var4], var5, 7);
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILie;)V")
    private final void method1570(byte arg0, int arg1, class32 arg2) {
        field4086++;
        if (arg1 == 1) {
            this.field4076 = arg2.method324(1).method1594(60, 127);
        } else if (arg1 == 2) {
            int var8 = arg2.method316((byte) 109);
            this.field4072 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4072[var9] = arg2.method339(-16777216);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method316((byte) 105);
            this.field4073 = new int[var4][];
            this.field4091 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method339(-16777216);
                this.field4091[var5] = var6;
                this.field4073[var5] = new int[class243.field4266[var6]];
                for (int var7 = 0; var7 < class243.field4266[var6]; var7++) {
                    this.field4073[var5][var7] = arg2.method339(-16777216);
                }
            }
        }
        int var10 = 97 % ((2 - arg0) / 54);
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public static final void method1571(int arg0) {
        if (arg0 != 50) {
            field4071 = null;
        }
        field4080++;
        class55.field1131.method934((byte) 62);
        class238.field4168.method934((byte) 62);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lie;I)V")
    public final void method1572(class32 arg0, int arg1) {
        int var3 = 93 % ((-arg1 - 21) / 40);
        field4070++;
        while (true) {
            int var4 = arg0.method316((byte) 121);
            if (var4 == 0) {
                return;
            }
            this.method1570((byte) 71, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public final void method1573(byte arg0) {
        int var2 = 27 / ((70 - arg0) / 49);
        if (this.field4072 != null) {
            for (int var3 = 0; var3 < this.field4072.length; var3++) {
                this.field4072[var3] = class34.method362(this.field4072[var3], 32768);
            }
        }
        field4074++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIII[[[Lvk;)Z")
    public static final boolean method1574(boolean arg0, int arg1, int arg2, int arg3, int arg4, class35[][][] arg5) {
        field4068++;
        byte var6 = arg0 ? 1 : (byte) (class152.field2698 & 0xFF);
        if (class186.field3257[class274.field4798][arg2][arg4] == var6) {
            return false;
        } else if ((class73.field1410[class274.field4798][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            if (arg3 != 4095) {
                return false;
            }
            class36.field793[var8] = arg2;
            int var31 = var8 + 1;
            class94.field1673[var8] = arg4;
            class186.field3257[class274.field4798][arg2][arg4] = var6;
            while (var7 != var31) {
                int var9 = (class36.field793[var7] & 0xFF803C) >> 16;
                int var10 = class36.field793[var7] & 0xFFFF;
                int var11 = class36.field793[var7] >> 24 & 0xFF;
                int var12 = class94.field1673[var7] & 0xFFFF;
                int var13 = (class94.field1673[var7] & 0xFFAA17) >> 16;
                boolean var14 = false;
                boolean var15 = false;
                if ((class73.field1410[class274.field4798][var10][var12] & 0x4) == 0) {
                    var14 = true;
                }
                var7 = var7 + 1 & 0xFFF;
                label229: for (int var16 = class274.field4798 + 1; var16 <= 3; var16++) {
                    if ((class73.field1410[var16][var10][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var10][var12] != null) {
                            if (arg5[var16][var10][var12].field763 != null) {
                                int var19 = class96.method714(var9, arg3 - 4209);
                                if (arg5[var16][var10][var12].field763.field1996 == var19 || arg5[var16][var10][var12].field763.field2004 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class96.method714(var11, arg3 ^ 0xFFFFF05F);
                                    if (arg5[var16][var10][var12].field763.field1996 == var20 || arg5[var16][var10][var12].field763.field2004 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class96.method714(var13, arg3 ^ 0xFFFFF061);
                                    if (arg5[var16][var10][var12].field763.field1996 == var21 || arg5[var16][var10][var12].field763.field2004 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var10][var12].field755 != null) {
                                for (int var22 = 0; var22 < arg5[var16][var10][var12].field759; var22++) {
                                    int var23 = (int) (arg5[var16][var10][var12].field755[var22].field3314 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg5[var16][var10][var12].field755[var22].field3314 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var9 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class35 var26 = arg5[var16][var10][var12];
                        if (var26 != null && var26.field759 > 0) {
                            for (int var27 = 0; var27 < var26.field759; var27++) {
                                class191 var28 = var26.field755[var27];
                                if (var28.field3327 != var28.field3316 || var28.field3320 != var28.field3315) {
                                    for (int var29 = var28.field3316; var29 <= var28.field3327; var29++) {
                                        for (int var30 = var28.field3315; var30 <= var28.field3320; var30++) {
                                            class186.field3257[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class186.field3257[var16][var10][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    if (class99.field1773[class274.field4798 + 1][var10][var12] > class185.field3243[arg1]) {
                        class185.field3243[arg1] = class99.field1773[class274.field4798 + 1][var10][var12];
                    }
                    int var17 = var10 << 7;
                    if (class61.field1223[arg1] > var17) {
                        class61.field1223[arg1] = var17;
                    } else if (var17 > class37.field837[arg1]) {
                        class37.field837[arg1] = var17;
                    }
                    int var18 = var12 << 7;
                    if (var18 < class174.field3056[arg1]) {
                        class174.field3056[arg1] = var18;
                    } else if (class33.field720[arg1] < var18) {
                        class33.field720[arg1] = var18;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class186.field3257[class274.field4798][var10 - 1][var12] != var6) {
                        class36.field793[var31] = class34.method362(class34.method362(var10 - 1, 1179648), -754974720);
                        class94.field1673[var31] = class34.method362(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class186.field3257[class274.field4798][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var10 - 1 >= 0 && class186.field3257[class274.field4798][var10 - 1][var12] != var6 && (class73.field1410[class274.field4798][var10][var12] & 0x4) == 0 && (class73.field1410[class274.field4798][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class36.field793[var31] = class34.method362(class34.method362(var10 - 1, 1179648), 1375731712);
                            class94.field1673[var31] = class34.method362(1245184, var12);
                            class186.field3257[class274.field4798][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class186.field3257[class274.field4798][var10][var12] != var6) {
                            class36.field793[var31] = class34.method362(318767104, class34.method362(5373952, var10));
                            class94.field1673[var31] = class34.method362(var12, 5439488);
                            class186.field3257[class274.field4798][var10][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < 104 && class186.field3257[class274.field4798][var10 + 1][var12] != var6 && (class73.field1410[class274.field4798][var10][var12] & 0x4) == 0 && (class73.field1410[class274.field4798][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class36.field793[var31] = class34.method362(-1845493760, class34.method362(var10 + 1, 5373952));
                            class94.field1673[var31] = class34.method362(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class186.field3257[class274.field4798][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class186.field3257[class274.field4798][var10 + 1][var12] != var6) {
                        class36.field793[var31] = class34.method362(class34.method362(var10 + 1, 9568256), 1392508928);
                        class94.field1673[var31] = class34.method362(9633792, var12);
                        class186.field3257[class274.field4798][var10 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class186.field3257[class274.field4798][var10 - 1][var12] != var6 && (class73.field1410[class274.field4798][var10][var12] & 0x4) == 0 && (class73.field1410[class274.field4798][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class36.field793[var31] = class34.method362(class34.method362(13762560, var10 - 1), 301989888);
                            class94.field1673[var31] = class34.method362(var12, 13828096);
                            class186.field3257[class274.field4798][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class186.field3257[class274.field4798][var10][var12] != var6) {
                            class36.field793[var31] = class34.method362(class34.method362(var10, 13762560), -1828716544);
                            class94.field1673[var31] = class34.method362(var12, 13828096);
                            class186.field3257[class274.field4798][var10][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class186.field3257[class274.field4798][var10 + 1][var12] != var6 && (class73.field1410[class274.field4798][var10][var12] & 0x4) == 0 && (class73.field1410[class274.field4798][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class36.field793[var31] = class34.method362(-771751936, class34.method362(9568256, var10 + 1));
                            class94.field1673[var31] = class34.method362(9633792, var12);
                            class186.field3257[class274.field4798][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class185.field3243[arg1] != -1000000) {
                class185.field3243[arg1] += 10;
                class61.field1223[arg1] -= 50;
                class37.field837[arg1] += 50;
                class33.field720[arg1] += 50;
                class174.field3056[arg1] -= 50;
            }
            return true;
        }
    }
}
