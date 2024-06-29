import java.awt.Color;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class338 implements class126 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lgu;")
    private class412 field5026 = new class412(128);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[I")
    private int[] field5030 = new int[class314.field4740.field5690];

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "[I")
    public int[] field5029 = new int[class314.field4740.field5690];

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field5022 = 0;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5036 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Lhn;")
    public static class509 field5038 = new class509(68, 6);

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lgu;")
    public static class412 field5039;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Z")
    public static boolean field5042;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "B")
    public static byte field5041;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lul;")
    public static class406 field5040;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field5043;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2137(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class234("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field5039 = new class412(16);
        field5042 = false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZI)V", line = 4)
    public final void method2127(int arg0, boolean arg1, int arg2) {
        field5037++;
        class529 var4 = class125.field1856.method1441(1, arg2);
        int var5 = var4.field7729;
        int var6 = var4.field7731;
        if (arg1) {
            return;
        }
        int var7 = var4.field7727;
        int var8 = class339.field5052[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2128((byte) -105, this.field5030[var5] & ~var9 | var9 & arg0 << var6, var5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V", line = 32)
    public final void method2128(byte arg0, int arg1, int arg2) {
        if (arg0 != -105) {
            this.field5030 = null;
        }
        this.field5030[arg2] = arg1;
        field5027++;
        class259 var4 = (class259) this.field5026.method2585((byte) 114, (long) arg2);
        if (var4 == null) {
            class259 var5 = new class259(4611686018427387905L);
            this.field5026.method2591((long) arg2, var5, (byte) 75);
        } else if (var4.field3973 != 4611686018427387905L) {
            var4.field3973 = class493.method2937(-77) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 62)
    public static void method2129(int arg0) {
        field5039 = null;
        field5040 = null;
        field5038 = null;
        field5036 = null;
        if (arg0 >= -65) {
            field5042 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V", line = 75)
    public final void method2130(int arg0, int arg1, byte arg2) {
        field5021++;
        this.field5029[arg1] = arg0;
        if (arg2 != -55) {
            this.method2136((byte) 101, false);
        }
        class259 var4 = (class259) this.field5026.method2585((byte) 114, (long) arg1);
        if (var4 == null) {
            class259 var5 = new class259(class493.method2937(-114) + 500L);
            this.field5026.method2591((long) arg1, var5, (byte) -126);
        } else {
            var4.field3973 = class493.method2937(-97) + 500L;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 98)
    public static final void method2131(byte arg0) {
        int var1 = -76 % ((-arg0 - 4) / 39);
        field5034++;
        try {
            Method var2 = (field5043 == null ? (field5043 = method2137("java.lang.Runtime")) : field5043).getMethod("availableProcessors");
            if (var2 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Integer var4 = (Integer) var2.invoke(var3, (Object[]) null);
                    class277.field4221 = var4;
                } catch (Throwable var5) {
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I", line = 125)
    public final int method924(int arg0, int arg1) {
        field5035++;
        if (arg1 <= 4) {
            field5039 = null;
        }
        return this.field5029[arg0];
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V", line = 141)
    public final void method2132(int arg0) {
        field5028++;
        if (arg0 <= 78) {
            this.field5029 = null;
        }
        for (int var2 = 0; var2 < class314.field4740.field5690; var2++) {
            class94 var3 = class314.field4740.method2369((byte) 112, var2);
            if (var3 != null && var3.field1322 == 0) {
                this.field5030[var2] = 0;
                this.field5029[var2] = 0;
            }
        }
        this.field5026 = new class412(128);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 169)
    public final void method2133(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        field5031++;
        class529 var4 = class125.field1856.method1441(1, arg2);
        int var5 = var4.field7729;
        int var6 = var4.field7731;
        int var7 = var4.field7727;
        int var8 = class339.field5052[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2130(var9 & arg0 << var6 | this.field5029[var5] & ~var9, var5, (byte) -55);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLwq;B)V", line = 208)
    public static final void method2134(boolean arg0, class116 arg1, byte arg2) {
        int var3 = 10 % ((29 - arg2) / 63);
        field5025++;
        if (class382.field5752 >= 400) {
            return;
        }
        class37 var4 = arg1.field1763;
        if (var4.field499 != null) {
            var4 = var4.method256(125, class195.field3271);
            if (var4 == null) {
                return;
            }
        }
        if (!var4.field465) {
            return;
        }
        String var5 = var4.field455;
        if (var4.field508 != 0) {
            String var6 = class86.field1228 == class312.field4691 ? class32.field357.method1635(class224.field3673, (byte) 125) : class201.field3337.method1635(class224.field3673, (byte) -74);
            var5 = var5 + class46.method472(2988, class398.field5947.field2636, var4.field508) + " (" + var6 + var4.field508 + ")";
        }
        if (!class245.field3859) {
            if (!arg0) {
                String[] var7 = var4.field463;
                if (class200.field3329) {
                    var7 = class406.method2534(var7, false);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var4.field498 == 0 || !var7[var8].equalsIgnoreCase(class421.field6270.method1635(class224.field3673, (byte) 45)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 44;
                            }
                            int var10 = class273.field4187;
                            if (var8 == 1) {
                                var9 = 9;
                            }
                            if (var8 == 2) {
                                var9 = 19;
                            }
                            if (var8 == 3) {
                                var9 = 16;
                            }
                            if (var4.field443 == var8) {
                                var10 = var4.field467;
                            }
                            if (var8 == 4) {
                                var9 = 12;
                            }
                            if (var4.field468 == var8) {
                                var10 = var4.field442;
                            }
                            class436.field6443++;
                            class168.method1127(-1, "<col=ffff00>" + var5, 0, 0, true, var9, false, var7[var8], -94, var10, (long) arg1.field1881);
                        }
                    }
                }
                if (var4.field498 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class421.field6270.method1635(class224.field3673, (byte) -73))) {
                            short var12 = 0;
                            if (var4.field508 > class398.field5947.field2636) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 44;
                            }
                            if (var11 == 1) {
                                var13 = 9;
                            }
                            if (var11 == 2) {
                                var13 = 19;
                            }
                            if (var11 == 3) {
                                var13 = 16;
                            }
                            if (var11 == 4) {
                                var13 = 12;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class299.field4543++;
                            class168.method1127(-1, "<col=ffff00>" + var5, 0, 0, true, var13, false, var7[var11], -53, var4.field475, (long) arg1.field1881);
                        }
                    }
                }
            }
            class168.method1127(-1, "<col=ffff00>" + var5, 0, 0, true, 1006, arg0, class198.field3294.method1635(class224.field3673, (byte) -46), -106, class319.field4812, (long) arg1.field1881);
            class404.field5988++;
        } else if (!arg0) {
            class260 var14 = class108.field1514 == -1 ? null : class474.field6839.method3057(class108.field1514, (byte) 47);
            if ((class366.field5390 & 0x2) != 0) {
                if (var14 == null || var4.method255((byte) -64, var14.field3981, class108.field1514) != var14.field3981) {
                    class390.field5844++;
                    class168.method1127(-1, class190.field3206 + " -> <col=ffff00>" + var5, 0, 0, true, 25, false, class412.field6176, -58, class424.field6317, (long) arg1.field1881);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)I", line = 372)
    public final int method925(int arg0, boolean arg1) {
        field5024++;
        class529 var3 = class125.field1856.method1441(1, arg0);
        int var4 = var3.field7729;
        int var5 = var3.field7731;
        if (arg1) {
            field5042 = false;
        }
        int var6 = var3.field7727;
        int var7 = class339.field5052[var6 - var5];
        return this.field5029[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILya;IIIII)Lt;", line = 396)
    public static final class475 method2135(int arg0, class38 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5023++;
        int var7 = 90 / ((20 - arg2) / 49);
        long var8 = (long) arg3;
        class475 var10 = (class475) class508.field7444.method87(var8, -2062335807);
        short var11 = 2055;
        if (var10 == null) {
            class374 var12 = class356.method2233(arg3, (byte) -71, 0, class524.field7677);
            if (var12 == null) {
                return null;
            }
            if (var12.field5596 < 13) {
                var12.method2350((byte) -10, 0);
            }
            var10 = arg1.method330(var12, var11, class295.field4492, 64, 768);
            class508.field7444.method84(var8, var10, (byte) 27);
        }
        class475 var13 = var10.method449((byte) 2, var11, true);
        if (arg6 != 0) {
            var13.method438(arg6);
        }
        if (arg4 != 0) {
            var13.method441(arg4);
        }
        if (arg0 != 0) {
            var13.method420(arg0);
        }
        if (arg5 != 0) {
            var13.method450(0, arg5, 0);
        }
        return var13;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)I", line = 463)
    public final int method2136(byte arg0, boolean arg1) {
        field5032++;
        long var3 = class493.method2937(-100);
        for (class259 var5 = arg1 ? (class259) this.field5026.method2592(125) : (class259) this.field5026.method2589(-1); var5 != null; var5 = (class259) this.field5026.method2589(-1)) {
            if ((var5.field3973 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field3973 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6388;
                    this.field5029[var6] = this.field5030[var6];
                    var5.method2677(-22491);
                    return var6;
                }
                var5.method2677(-22491);
            }
        }
        if (arg0 > -121) {
            this.method2136((byte) -2, false);
        }
        return -1;
    }
}
