import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class148 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lh;")
    public static class434 field2109;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "Lgd;")
    public static class206 field2112;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lr;")
    public static class110 field2110;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field2113;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method884(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class206("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field2111 = 0;
        field2109 = new class434(42, 3);
        field2112 = new class206("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 6)
    public static void method875(int arg0) {
        field2112 = null;
        field2109 = null;
        if (arg0 != 0) {
            field2110 = null;
        }
        field2110 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lml;IILbt;)V", line = 22)
    public static final void method878(class241 arg0, int arg1, int arg2, class32 arg3) {
        field2105++;
        class79 var4 = new class79();
        var4.field1059 = arg3.method201((byte) -126);
        var4.field1066 = arg3.method222(1024);
        var4.field1062 = new int[var4.field1059];
        var4.field1065 = new int[var4.field1059];
        var4.field1061 = new class474[var4.field1059];
        var4.field1068 = new byte[var4.field1059][][];
        var4.field1064 = new int[var4.field1059];
        var4.field1063 = new class474[var4.field1059];
        if (arg2 != -20360) {
            field2110 = null;
        }
        for (int var5 = 0; var5 < var4.field1059; var5++) {
            try {
                int var6 = arg3.method201((byte) -109);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method195(arg2 + 20283);
                    String var8 = arg3.method195(-12);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method222(1024);
                    }
                    var4.field1065[var5] = var6;
                    var4.field1064[var5] = var9;
                    var4.field1061[var5] = arg0.method1344(class233.method1302(var7, -28916), var8, (byte) -102);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method195(122);
                    String var11 = arg3.method195(117);
                    int var12 = arg3.method201((byte) -118);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method195(-63);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method222(1024);
                            var15[var16] = new byte[var17];
                            arg3.method185(var15[var16], 0, var17, true);
                        }
                    }
                    var4.field1065[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class233.method1302(var13[var19], -28916);
                    }
                    var4.field1063[var5] = arg0.method1330(class233.method1302(var10, -28916), 0, var11, var18);
                    var4.field1068[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1062[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1062[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1062[var5] = -3;
            } catch (Exception var23) {
                var4.field1062[var5] = -4;
            } catch (Throwable var24) {
                var4.field1062[var5] = -5;
            }
        }
        class210.field2836.method641(var4, (byte) -93);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z", line = 138)
    public static final boolean method879(int arg0, int arg1, int arg2, int arg3) {
        field2107++;
        class381 var4 = (class381) class413.method2478(arg2, arg0, arg3);
        int var5 = 12 / ((70 - arg1) / 36);
        boolean var6 = true;
        if (var4 != null) {
            var6 &= class276.method1550(38, var4);
        }
        class381 var7 = (class381) class4.method29(arg2, arg0, arg3, field2113 == null ? (field2113 = method884("id")) : field2113);
        if (var7 != null) {
            var6 &= class276.method1550(38, var7);
        }
        class381 var8 = (class381) class146.method870(arg2, arg0, arg3);
        if (var8 != null) {
            var6 &= class276.method1550(38, var8);
        }
        return var6;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z", line = 164)
    public static final boolean method880(byte arg0) {
        if (arg0 != -16) {
            field2111 = 124;
        }
        field2103++;
        try {
            return class459.method2698(arg0 ^ 0xFFFFA248);
        } catch (IOException var4) {
            class412.method2474((byte) 114);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class374.field5163 == null ? -1 : class374.field5163.method2560((byte) -66)) + "," + (class466.field6453 == null ? -1 : class466.field6453.method2560((byte) -66)) + "," + (class395.field5473 == null ? -1 : class395.field5473.method2560((byte) -66)) + " - " + class136.field1983 + "," + (class162.field2260 + class233.field3103.field1193[0]) + "," + (class266.field3511 + class233.field3103.field1197[0]) + " - ";
            for (int var3 = 0; var3 < class136.field1983 && var3 < 50; var3++) {
                var2 = var2 + class314.field4171.field472[var3] + ",";
            }
            class228.method1278(var5, var2, -30116);
            class476.method2779(arg0 ^ 0xFFFFFFF0);
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIII)I", line = 215)
    public static final int method883(int arg0, int arg1, int arg2, int arg3) {
        field2102++;
        int var4 = arg2 & 0x3;
        if (~var4 == arg0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public abstract void method876(int arg0);

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public abstract void method877(int arg0);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)Lrk;")
    public abstract class25 method881(boolean arg0);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z")
    public abstract boolean method882(byte arg0, int arg1);
}
