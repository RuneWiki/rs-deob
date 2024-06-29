import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class71 {

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public int field1106 = -1;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Ltl;")
    public static class59 field1108 = class85.method639("m-Ochte mit Ihnen handeln)3", 9588);

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field1112 = 2;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Ltl;")
    public static class59 field1117 = class85.method639("Starte 3D)2Softwarebibliothek)3", 9588);

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Ltl;")
    public static class59 field1116 = class85.method639(")1", 9588);

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
    public static int[] field1114 = new int[1000];

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lme;")
    public static class295 field1102;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "Lme;")
    public static class295 field1119;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
    public static int[] field1104;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lqd;", line = 13)
    public static final class231 method573(int arg0) {
        class29.field379 = arg0;
        field1099++;
        return class173.method1275((byte) -114);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILma;III)V", line = 23)
    public static final void method574(int arg0, class263 arg1, int arg2, int arg3, int arg4) {
        if (class55.field815) {
            class240.method1689(arg0, arg2, arg0 + arg1.field4420, arg2 - -arg1.field4467);
        }
        field1098++;
        if (class143.field2362 >= 3) {
            if (class55.field815) {
                class260 var5 = arg1.method1816(0, false);
                if (var5 != null) {
                    var5.method337(arg0, arg2);
                }
            } else {
                class272.method1895(arg0, arg2, 0, arg1.field4418, arg1.field4447);
            }
        } else if (class55.field815) {
            ((class122) class235.field3908).method910(arg0, arg2, arg1.field4420, arg1.field4467, class235.field3908.field4342 / 2, class235.field3908.field4337 / 2, class213.field3489, 256, (class122) arg1.method1816(0, false));
        } else {
            ((class47) class235.field3908).method331(arg0, arg2, arg1.field4420, arg1.field4467, class235.field3908.field4342 / 2, class235.field3908.field4337 / 2, class213.field3489, 256, arg1.field4418, arg1.field4447);
        }
        class44.field719[arg3] = true;
        if (arg4 > -74) {
            field1102 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 66)
    public static void method575(int arg0) {
        field1117 = null;
        field1114 = null;
        field1104 = null;
        field1102 = null;
        field1119 = null;
        field1108 = null;
        field1116 = null;
        if (arg0 != 1) {
            method573(8);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I", line = 86)
    public static final int method576(int arg0, int arg1) {
        int var2 = -45 % ((arg1 - 23) / 32);
        field1110++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I", line = 95)
    public static final int method577(int arg0, int arg1) {
        field1115++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else if (arg1 == -26891) {
            return arg0;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ls;IILim;)V", line = 121)
    public static final void method578(class170 arg0, int arg1, int arg2, class175 arg3) {
        class99 var4 = new class99();
        var4.field1599 = arg0.method1221(98);
        field1113++;
        var4.field1586 = arg0.method1233((byte) -77);
        var4.field1584 = new int[var4.field1599];
        var4.field1592 = new int[var4.field1599];
        var4.field1587 = new int[var4.field1599];
        var4.field1593 = new class257[var4.field1599];
        var4.field1598 = new byte[var4.field1599][][];
        var4.field1588 = new class257[var4.field1599];
        for (int var5 = 0; var5 < var4.field1599; var5++) {
            try {
                int var6 = arg0.method1221(74);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method1250(false).method459(1647627301));
                    String var8 = new String(arg0.method1250(false).method459(1647627301));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1233((byte) -77);
                    }
                    var4.field1592[var5] = var6;
                    var4.field1584[var5] = var9;
                    var4.field1588[var5] = arg3.method1297(9, var8, class235.method1651((byte) -104, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method1250(false).method459(arg1 ^ 0x9DCB33DE));
                    String var11 = new String(arg0.method1250(false).method459(arg1 + 1647627306));
                    int var12 = arg0.method1221(arg1 + 83);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method1250(false).method459(1647627301));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1233((byte) -77);
                            var15[var16] = new byte[var17];
                            arg0.method1243(var17, 128, 0, var15[var16]);
                        }
                    }
                    var4.field1592[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class235.method1651((byte) -76, var13[var19]);
                    }
                    var4.field1593[var5] = arg3.method1287(class235.method1651((byte) -78, var10), var18, 0, var11);
                    var4.field1598[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field1587[var5] = -1;
            } catch (SecurityException var26) {
                var4.field1587[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field1587[var5] = -3;
            } catch (Exception var28) {
                var4.field1587[var5] = -4;
            } catch (Throwable var29) {
                var4.field1587[var5] = -5;
            }
        }
        class284.field4885.method532(120, var4);
        if (arg1 != -5) {
            field1116 = (class59) null;
        }
    }
}
