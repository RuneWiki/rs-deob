import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class282 extends class287 implements class218 {

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "Lgo;")
    public class287 field4259;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "Lo;")
    public static class332 field4267 = new class332("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "Lct;")
    public static class285 field4274;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!pt", name = "Q", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "Lbe;")
    public static class140 field4270;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(B)I")
    public final int method286(byte arg0) {
        field4256++;
        int var2 = 60 / ((63 - arg0) / 63);
        return 0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBLsk;II)V")
    public static final void method1811(int arg0, byte arg1, class309 arg2, int arg3, int arg4) {
        field4266++;
        class322 var5 = arg2.method1917(arg1 - 19);
        int var6 = arg2.field4634 - arg2.field4611.field6571 & 0x3FFF;
        if (arg4 == -1) {
            if (var6 != 0 || arg2.field4617 > 25) {
                if (arg3 < 0 && var5.field4830 != -1) {
                    arg2.field4620 = var5.field4830;
                } else if (arg3 <= 0 || var5.field4841 == -1) {
                    arg2.field4620 = var5.field4829;
                } else {
                    arg2.field4620 = var5.field4841;
                }
                arg2.field4663 = false;
            } else if (!arg2.field4663 || !var5.method1988(arg2.field4620, false)) {
                arg2.field4620 = var5.method1986((byte) -24);
                arg2.field4663 = arg2.field4620 != -1;
            }
        } else if (arg2.field4635 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class341.field5109[arg0] - arg2.field4611.field6571 & 0x3FFF;
            arg2.field4663 = false;
            if (arg4 == 2 && var5.field4806 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4832 != -1) {
                    arg2.field4620 = var5.field4832;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4812 != -1) {
                    arg2.field4620 = var5.field4812;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4817 == -1) {
                    arg2.field4620 = var5.field4806;
                } else {
                    arg2.field4620 = var5.field4817;
                }
            } else if (arg4 == 0 && var5.field4834 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4800 != -1) {
                    arg2.field4620 = var5.field4800;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4825 != -1) {
                    arg2.field4620 = var5.field4825;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4816 == -1) {
                    arg2.field4620 = var5.field4834;
                } else {
                    arg2.field4620 = var5.field4816;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4844 != -1) {
                arg2.field4620 = var5.field4844;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4811 != -1) {
                arg2.field4620 = var5.field4811;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4839 == -1) {
                arg2.field4620 = var5.field4829;
            } else {
                arg2.field4620 = var5.field4839;
            }
        } else if (var6 == 0 && arg2.field4617 <= 25) {
            arg2.field4663 = false;
            if (arg4 == 2 && var5.field4806 != -1) {
                arg2.field4620 = var5.field4806;
            } else if (arg4 == 0 && var5.field4834 != -1) {
                arg2.field4620 = var5.field4834;
            } else {
                arg2.field4620 = var5.field4829;
            }
        } else {
            if (arg4 == 2 && var5.field4806 != -1) {
                if (arg3 < 0 && var5.field4824 != -1) {
                    arg2.field4620 = var5.field4824;
                } else if (arg3 <= 0 || var5.field4813 == -1) {
                    arg2.field4620 = var5.field4806;
                } else {
                    arg2.field4620 = var5.field4813;
                }
            } else if (arg4 == 0 && var5.field4834 != -1) {
                if (arg3 < 0 && var5.field4805 != -1) {
                    arg2.field4620 = var5.field4805;
                } else if (arg3 <= 0 || var5.field4823 == -1) {
                    arg2.field4620 = var5.field4834;
                } else {
                    arg2.field4620 = var5.field4823;
                }
            } else if (arg3 < 0 && var5.field4810 != -1) {
                arg2.field4620 = var5.field4810;
            } else if (arg3 <= 0 || var5.field4815 == -1) {
                arg2.field4620 = var5.field4829;
            } else {
                arg2.field4620 = var5.field4815;
            }
            arg2.field4663 = false;
        }
        if (arg1 != 19) {
            method1812(35);
        }
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(Z)I")
    public final int method257(boolean arg0) {
        field4265++;
        return arg0 ? -117 : 0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Z")
    public final boolean method254(boolean arg0) {
        field4257++;
        return !arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILtq;)V")
    public final void method260(int arg0, class63 arg1) {
        if (arg0 != 0) {
            this.method259((class63) null, 124, 47, -58);
        }
        field4269++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ltq;I)V")
    public final void method258(class63 arg0, int arg1) {
        if (arg1 != -22360) {
            field4260 = -88;
        }
        field4263++;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(Ltq;I)Lcj;")
    public final class123 method252(class63 arg0, int arg1) {
        field4261++;
        if (arg1 != 2) {
            this.method252((class63) null, 106);
        }
        return null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)I")
    public final int method250(byte arg0) {
        field4264++;
        int var2 = 115 % ((-arg0 - 49) / 60);
        return 0;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(IIIIILgo;)V")
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, class287 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class485.method2839(arg0, arg1, true));
        this.field4259 = arg5;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLtq;)V")
    public final void method256(byte arg0, class63 arg1) {
        if (arg0 != 82) {
            method1813((long[]) null, (byte) 115, (Object[]) null);
        }
        field4273++;
    }

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "(I)V")
    public static void method1812(int arg0) {
        field4267 = null;
        field4270 = null;
        int var1 = -107 / ((18 - arg0) / 52);
        field4274 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ltq;III)Z")
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        int var5 = -1 % ((-arg2 - 59) / 58);
        field4262++;
        return false;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V")
    public final void method247(boolean arg0) {
        field4258++;
        if (arg0) {
            this.method256((byte) -28, (class63) null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
    public static final void method1813(long[] arg0, byte arg1, Object[] arg2) {
        if (arg1 < -49) {
            field4271++;
            class358.method2205(1, arg2, arg0.length - 1, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)I")
    public final int method244(byte arg0) {
        if (arg0 >= -8) {
            method1812(-92);
        }
        field4268++;
        return 0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILtq;)Lns;")
    public final class57 method255(byte arg0, int arg1, class63 arg2) {
        if (arg0 <= 108) {
            field4267 = null;
        }
        field4272++;
        return null;
    }

    static {
        new class332("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field4274 = new class285(43, 3);
    }
}
