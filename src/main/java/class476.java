import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class476 {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lfa;")
    private class156 field7009 = new class156(256);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lga;")
    private class277 field7004;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lfd;")
    private class365 field7007;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "[Lwq;")
    public static class114[] field7011;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[Llq;")
    public static class385[] field7014;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field7013;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field7015;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2880(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class331("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field7011 = new class114[50];
        field7014 = new class385[30];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2873(boolean arg0) {
        field7011 = null;
        field7014 = null;
        if (!arg0) {
            method2877(6, -98, -124, -108, null, -45, 29, -114, 0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 15)
    public final void method2874(byte arg0) {
        field7012++;
        int var2 = 110 / ((35 - arg0) / 58);
        this.field7009.method1116(5, -50);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I", line = 25)
    public static final int method2875(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            field7013 = -123;
        }
        field7005++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V", line = 45)
    public static final void method2876(boolean arg0) {
        if (arg0) {
            class422.field6240 = class336.field4678;
            class131.field1899 = class52.field578;
        } else {
            class422.field6240 = class418.field6169;
            class131.field1899 = class283.field4115;
        }
        class308.field4395 = class422.field6240.length;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIILya;IIII)V", line = 60)
    public static final void method2877(int arg0, int arg1, int arg2, int arg3, class38 arg4, int arg5, int arg6, int arg7, int arg8) {
        field7008++;
        class529 var9 = (class529) class344.method2079(arg0, arg5, arg2);
        if (var9 != null) {
            class222 var10 = class384.field5645.method786(var9.method28(true), 0);
            int var11 = var9.method22((byte) -70) & 0x3;
            int var12 = var9.method27(-36);
            if (var10.field3182 == -1) {
                int var13 = arg1;
                if (var10.field3200 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method294(0, arg3, 4, arg6, var13);
                    } else if (var11 == 1) {
                        arg4.method316(4, arg7 - 17931, arg3, arg6, var13);
                    } else if (var11 == 2) {
                        arg4.method294(0, arg3, 4, arg6 + 3, var13);
                    } else if (var11 == 3) {
                        arg4.method316(4, -125, arg3 + 3, arg6, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method367(arg6, 1, arg3, (byte) 58, var13, 1);
                    } else if (var11 == 1) {
                        arg4.method367(arg6 + 3, 1, arg3, (byte) 58, var13, 1);
                    } else if (var11 == 2) {
                        arg4.method367(arg6 + 3, 1, arg3 + 3, (byte) 58, var13, 1);
                    } else if (var11 == 3) {
                        arg4.method367(arg6, 1, arg3 + 3, (byte) 58, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method316(4, arg7 - 17931, arg3, arg6, var13);
                    } else if (var11 == 1) {
                        arg4.method294(0, arg3, 4, arg6 + 3, var13);
                    } else if (var11 == 2) {
                        arg4.method316(4, -127, arg3 + 3, arg6, var13);
                    } else if (var11 == 3) {
                        arg4.method294(0, arg3, 4, arg6, var13);
                    }
                }
            } else {
                class169.method1187(arg4, var11, arg7 ^ 0x45E3, var10, arg3, arg6);
            }
        }
        class529 var14 = (class529) class262.method1683(arg0, arg5, arg2, field7015 == null ? (field7015 = method2880("f")) : field7015);
        if (var14 != null) {
            class222 var15 = class384.field5645.method786(var14.method28(true), 0);
            int var16 = var14.method22((byte) -70) & 0x3;
            int var17 = var14.method27(-46);
            if (var15.field3182 != -1) {
                class169.method1187(arg4, var16, 116, var15, arg3, arg6);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3200 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method371(arg3 + 3, var18, arg6, arg3, arg6 + 3, 4);
                } else {
                    arg4.method371(arg3, var18, arg6, arg3 + 3, arg6 + 3, 4);
                }
            }
        }
        class529 var19 = (class529) class282.method1802(arg0, arg5, arg2);
        if (var19 != null) {
            class222 var20 = class384.field5645.method786(var19.method28(true), arg7 ^ 0x458D);
            int var21 = var19.method22((byte) -70) & 0x3;
            if (var20.field3182 != -1) {
                class169.method1187(arg4, var21, 120, var20, arg3, arg6);
            }
        }
        if (arg7 != 17805) {
            method2877(-52, -91, 95, 17, null, -122, -81, 60, 20);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Laf;", line = 198)
    public final class299 method2878(int arg0, int arg1) {
        field7006++;
        if (arg1 >= -127) {
            return null;
        }
        Object var3 = this.field7009.method1115((long) arg0, (byte) 58);
        if (var3 != null) {
            return (class299) var3;
        } else if (this.field7004.method1776(arg0, 19378)) {
            class104 var4 = this.field7004.method1780(-31305, arg0);
            int var5 = var4.field1435 ? 64 : this.field7007.field5292;
            class299 var7;
            if (var4.field1437 && this.field7007.method378()) {
                float[] var6 = this.field7004.method1778(0.7F, arg0, var5, false, var5, 15752);
                var7 = new class299(this.field7007, 3553, 34842, var5, var5, var4.field1449 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field1440 && class284.method1809(var4.field1443, -6)) {
                    var8 = this.field7004.method1777(false, 5754, arg0, 0.7F, var5, var5);
                    var9 = 6407;
                } else {
                    var8 = this.field7004.method1779(false, arg0, false, 0.7F, var5, var5);
                    var9 = 6408;
                }
                var7 = new class299(this.field7007, 3553, var9, var5, var5, var4.field1449 != 0, var8, false);
            }
            var7.method1882(10497, var4.field1452, var4.field1453);
            this.field7009.method1107(1, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 255)
    public final void method2879(int arg0) {
        this.field7009.method1105(false);
        field7010++;
        if (arg0 != 4) {
            this.field7007 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lfd;Lga;)V", line = 277)
    public class476(class365 arg0, class277 arg1) {
        this.field7004 = arg1;
        this.field7007 = arg0;
    }
}
