import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class238 extends class258 {

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "[I")
    public static int[] field4157 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "S")
    public static short field4163 = 320;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field4156 = 0;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "Ljf;")
    public static class229 field4161 = class212.method1457((byte) 81, "rot:");

    @OriginalMember(owner = "client!ne", name = "mb", descriptor = "Ljf;")
    public static class229 field4166 = class212.method1457((byte) 92, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ne", name = "nb", descriptor = "B")
    public byte field4167;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!ne", name = "pb", descriptor = "Lkh;")
    public class14 field4169;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[Ljf;")
    public static class229[] field4155;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)[B", line = 4)
    public final byte[] method339(byte arg0) {
        field4154++;
        if (this.field4499 || (this.field4169.field174.length - this.field4167) > this.field4169.field195) {
            throw new RuntimeException();
        }
        int var2 = 14 % ((arg0 + 68) / 48);
        return this.field4169.field174;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)I", line = 30)
    public final int method333(int arg0) {
        field4159++;
        if (this.field4169 == null) {
            return 0;
        } else {
            int var2 = 119 % ((arg0 + 24) / 51);
            return this.field4169.field195 * 100 / (this.field4169.field174.length - this.field4167);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILnf;B)I", line = 48)
    public static final int method1700(int arg0, class67 arg1, byte arg2) {
        field4158++;
        if (arg1.field1206 == null || arg0 >= arg1.field1206.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1206[arg0];
            int var4 = 0;
            int var5 = 0;
            if (arg2 != 115) {
                field4161 = (class229) null;
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class236.field4081[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class297.field5081[var3[var4++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 3) {
                    var8 = class193.field3347[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class67 var12 = class96.method662(var11, true);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class113.method799(var13, (byte) 50).field5299 || class323.field5456)) {
                        for (int var14 = 0; var14 < var12.field1227.length; var14++) {
                            if (var13 + 1 == var12.field1227[var14]) {
                                var8 += var12.field1153[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class286.field4908[var3[var4++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 6) {
                    var8 = class257.field4481[class297.field5081[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class286.field4908[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class301.field5124.field623;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class309.field5215[var15]) {
                            var8 += class297.field5081[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class67 var18 = class96.method662(var17, true);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class113.method799(var19, (byte) 50).field5299 || class323.field5456)) {
                        for (int var20 = 0; var20 < var18.field1227.length; var20++) {
                            if ((var19 + 1) == var18.field1227[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class200.field3496;
                }
                if (var7 == 12) {
                    var8 = class160.field2713;
                }
                if (var7 == 13) {
                    int var21 = class286.field4908[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class214.method1467(15, var23);
                }
                if (var7 == 18) {
                    var8 = (class301.field5124.field1983 >> 7) + class258.field4503;
                }
                if (var7 == 19) {
                    var8 = (class301.field5124.field2028 >> 7) + class213.field3649;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 261)
    public static void method1701(int arg0) {
        field4155 = null;
        field4157 = null;
        field4166 = null;
        field4161 = null;
        if (arg0 >= -78) {
            field4157 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 274)
    public static final void method1702(int arg0, int arg1) {
        field4165++;
        class324.field5460.method231((byte) 113, arg0);
        class284.field4866.method231((byte) 113, arg0);
        if (arg1 != 0) {
            method1701(-123);
        }
        class277.field4760.method231((byte) 113, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILek;)[Lkb;", line = 290)
    public static final class35[] method1703(int arg0, int arg1, int arg2, class185 arg3) {
        field4168++;
        if (class208.method1444(arg1, -28236, arg2, arg3)) {
            return arg0 == -1 ? class246.method1780(22804) : (class35[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILek;)V", line = 306)
    public static final void method1704(int arg0, class185 arg1) {
        field4164++;
        class195.field3392 = arg1.method1292(class243.field4306, (byte) 120);
        class56.field998 = arg1.method1292(class279.field4786, (byte) 40);
        class1.field4 = arg1.method1292(class132.field2329, (byte) 60);
        class284.field4883 = arg1.method1292(class270.field4633, (byte) 99);
        class202.field3535 = arg1.method1292(class25.field454, (byte) 65);
        class295.field5044 = arg1.method1292(class120.field2125, (byte) 117);
        class68.field1305 = arg1.method1292(class275.field4736, (byte) 67);
        class78.field1441 = arg1.method1292(class259.field4509, (byte) 60);
        class215.field3693 = arg1.method1292(class217.field3736, (byte) 100);
        class226.field3869 = arg1.method1292(class84.field1609, (byte) 121);
        class115.field2082 = arg1.method1292(class320.field5423, (byte) 45);
        class258.field4502 = arg1.method1292(class126.field2248, (byte) 106);
        if (arg0 != 0) {
            method1705(-38, 16, 54, (class67[]) null, false, 44);
        }
        class16.field267 = arg1.method1292(class327.field5496, (byte) 69);
        class246.field4371 = arg1.method1292(class319.field5394, (byte) 46);
        class90.field1643 = arg1.method1292(class23.field413, (byte) 88);
        class288.field4931 = arg1.method1292(class82.field1520, (byte) 86);
        class241.field4257 = arg1.method1292(class290.field4951, (byte) 75);
        class105.field1819 = arg1.method1292(class254.field4434, (byte) 85);
        class152.field2633 = arg1.method1292(class74.field1399, (byte) 119);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[Lnf;ZI)V", line = 344)
    public static final void method1705(int arg0, int arg1, int arg2, class67[] arg3, boolean arg4, int arg5) {
        for (int var6 = arg1; var6 < arg3.length; var6++) {
            class67 var7 = arg3[var6];
            if (var7 != null && var7.field1211 == arg2) {
                class206.method1439(arg4, arg5, var7, -1, arg0);
                class301.method2061(arg0, -114, arg5, var7);
                if (var7.field1167 > (var7.field1200 - var7.field1295)) {
                    var7.field1167 = var7.field1200 - var7.field1295;
                }
                if (var7.field1167 < 0) {
                    var7.field1167 = 0;
                }
                if (var7.field1297 > (var7.field1215 - var7.field1258)) {
                    var7.field1297 = var7.field1215 - var7.field1258;
                }
                if (var7.field1297 < 0) {
                    var7.field1297 = 0;
                }
                if (var7.field1267 == 0) {
                    class243.method1755(var7, arg4, -1);
                }
            }
        }
        field4162++;
    }
}
