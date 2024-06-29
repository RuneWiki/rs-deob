import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class336 extends class334 {

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Llm;")
    public static class31 field5247 = new class31(10, 3);

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "Lss;")
    public static class213 field5251 = new class213("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field5256;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qm", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field5257;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Ljava/lang/String;")
    public String field5244;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "[C")
    public char[] field5243;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "[C")
    public char[] field5249;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "[I")
    public int[] field5245;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "[I")
    public int[] field5255;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static void method2230(byte arg0) {
        field5247 = null;
        field5251 = null;
        int var1 = 88 % ((arg0 + 4) / 43);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLhw;I)V")
    private final void method2231(boolean arg0, class208 arg1, int arg2) {
        field5256++;
        if (arg0) {
            this.field5245 = null;
        }
        if (arg2 == 1) {
            this.field5244 = arg1.method1448(65535);
        } else if (arg2 == 2) {
            int var7 = arg1.method1445(-105);
            this.field5255 = new int[var7];
            this.field5243 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5255[var8] = arg1.method1455(-3387);
                byte var9 = arg1.method1427(false);
                this.field5243[var8] = var9 == 0 ? 0 : class167.method1058(var9, 255);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1445(-102);
            this.field5245 = new int[var4];
            this.field5249 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5245[var5] = arg1.method1455(-3387);
                byte var6 = arg1.method1427(false);
                this.field5249[var5] = var6 == 0 ? 0 : class167.method1058(var6, 255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)I")
    public final int method2232(int arg0, char arg1) {
        field5246++;
        if (this.field5245 == null) {
            return -1;
        }
        if (arg0 > -83) {
            this.method2233(-103, (char) 65443);
        }
        for (int var3 = 0; var3 < this.field5245.length; var3++) {
            if (this.field5249[var3] == arg1) {
                return this.field5245[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IC)I")
    public final int method2233(int arg0, char arg1) {
        field5252++;
        if (this.field5255 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 <= 114) {
            this.method2234(null, 125);
        }
        while (var3 < this.field5255.length) {
            if (this.field5243[var3] == arg1) {
                return this.field5255[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lhw;I)V")
    public final void method2234(class208 arg0, int arg1) {
        field5250++;
        if (arg1 != -1666) {
            return;
        }
        while (true) {
            int var3 = arg0.method1445(arg1 ^ 0xFFFFF93F);
            if (var3 == 0) {
                return;
            }
            this.method2231(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static final void method2235(int arg0) {
        class45 var1 = (class45) class49.field626.method2123(118);
        if (arg0 != 211) {
            method2230((byte) 95);
        }
        while (var1 != null) {
            if (class217.field3699 == null) {
                var1.method3149(arg0 - 152);
            } else if (var1.field576 <= class88.field1278) {
                int var14 = class361.field5586[var1.field590];
                if (var14 == 0) {
                    class477 var15 = class409.method2611(var1.field592, var1.field594, var1.field579);
                    if (var15 instanceof class516) {
                        class438.method2779(var1.field592, var1.field594, var1.field579);
                        class516 var16 = (class516) var15;
                        if (var16.field7662 != null) {
                            class113.method730(var1.field592, var1.field594, var1.field579, var16.field7662, null);
                        }
                    }
                } else if (var14 == 1) {
                    class304 var21 = class75.method544(var1.field592, var1.field594, var1.field579);
                    if (var21 instanceof class19) {
                        class53.method371(var1.field592, var1.field594, var1.field579);
                        class19 var22 = (class19) var21;
                        if (var22.field214 != null) {
                            class188.method1175(var1.field592, var1.field594, var1.field579, var22.field214, null);
                        }
                    }
                } else if (var14 == 2) {
                    class423 var19 = class49.method352(var1.field592, var1.field594, var1.field579, field5257 == null ? (field5257 = method2237("jq")) : field5257);
                    if (var19 instanceof class232) {
                        class536.method3179(var1.field592, var1.field594, var1.field579, field5257 == null ? (field5257 = method2237("jq")) : field5257);
                        class232 var20 = (class232) var19;
                        if (var20.field3830 != null) {
                            class186.method1160(var20.field3830, false);
                        }
                    }
                } else if (var14 == 3) {
                    class12 var17 = class76.method548(var1.field592, var1.field594, var1.field579);
                    if (var17 instanceof class406) {
                        class152.method929(var1.field592, var1.field594, var1.field579);
                        class406 var18 = (class406) var17;
                        if (var18.field6130 != null) {
                            class214.method1585(var1.field592, var1.field594, var1.field579, var18.field6130);
                        }
                    }
                }
                var1.method3149(93);
            } else if (class88.field1278 == var1.field578) {
                int var2 = class361.field5586[var1.field590];
                if (var2 == 0) {
                    class477 var3 = class409.method2611(var1.field592, var1.field594, var1.field579);
                    if (var3 instanceof class516) {
                        var1.method3149(110);
                    } else if (class77.method556(var1.field592, var1.field594, var1.field579) == null) {
                        class516 var4 = new class516(var1.field590, var1.field581, var1.field582, var1.field589, var1.field585, var3);
                        class113.method730(var1.field592, var1.field594, var1.field579, var4, null);
                    } else {
                        var1.method3149(55);
                    }
                } else if (var2 == 1) {
                    class304 var12 = class75.method544(var1.field592, var1.field594, var1.field579);
                    if (var12 instanceof class19) {
                        var1.method3149(78);
                    } else if (class316.method2112(var1.field592, var1.field594, var1.field579) == null) {
                        class19 var13 = new class19(var1.field590, var1.field581, var1.field582, var1.field589, var1.field585, var12);
                        class188.method1175(var1.field592, var1.field594, var1.field579, var13, null);
                    } else {
                        var1.method3149(arg0 - 86);
                    }
                } else if (var2 == 2) {
                    class423 var7 = class49.method352(var1.field592, var1.field594, var1.field579, field5257 == null ? (field5257 = method2237("jq")) : field5257);
                    if (var7 instanceof class232) {
                        var1.method3149(81);
                    } else {
                        class536.method3179(var1.field592, var1.field594, var1.field579, field5257 == null ? (field5257 = method2237("jq")) : field5257);
                        class156 var8 = class454.field7029.method3002(-1, var1.field587);
                        int var9;
                        int var10;
                        if (var1.field581 == 1 || var1.field581 == 3) {
                            var9 = var8.field2123;
                            var10 = var8.field2139;
                        } else {
                            var9 = var8.field2139;
                            var10 = var8.field2123;
                        }
                        class232 var11 = new class232(var1.field590, var1.field581, var1.field592, var1.field582, var1.field589, var1.field585, var1.field594, var1.field594 + var9 - 1, var1.field579, var1.field579 + var10 - 1, var7);
                        class186.method1160(var11, false);
                    }
                } else if (var2 == 3) {
                    class12 var5 = class76.method548(var1.field592, var1.field594, var1.field579);
                    if (var5 instanceof class406) {
                        var1.method3149(124);
                    } else {
                        class406 var6 = new class406(var1.field582, var1.field589, var1.field585, var5);
                        class214.method1585(var1.field592, var1.field594, var1.field579, var6);
                    }
                }
            }
            var1 = (class45) class49.field626.method2126((byte) 61);
        }
        field5253++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
    public final void method2236(boolean arg0) {
        field5248++;
        if (!arg0) {
            return;
        }
        if (this.field5245 != null) {
            for (int var2 = 0; var2 < this.field5245.length; var2++) {
                this.field5245[var2] = class410.method2621(this.field5245[var2], 32768);
            }
        }
        if (this.field5255 != null) {
            for (int var3 = 0; var3 < this.field5255.length; var3++) {
                this.field5255[var3] = class410.method2621(this.field5255[var3], 32768);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2237(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
