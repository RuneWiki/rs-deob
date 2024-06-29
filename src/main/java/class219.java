import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 extends class42 {

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public int field2946 = 0;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "Lsq;")
    public class117 field2954;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Lus;")
    public class1 field2956;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "Loa;")
    public static class489 field2961;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "Lql;")
    public class515 field2964;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Lil;")
    public class7 field2945;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "Lil;")
    public class7 field2959;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jo", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field2970;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Z")
    public boolean field2947;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Z")
    public static boolean field2963;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "[I")
    public int[] field2957;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1391(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class304("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field2965 = 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 14)
    public static final void method1387(int arg0) {
        for (class485 var1 = (class485) class228.field3082.method1672((byte) -128); var1 != null; var1 = (class485) class228.field3082.method1668(-1)) {
            if (class497.field6886 == null) {
                var1.method300(false);
            } else if (var1.field6755 <= class31.field516) {
                int var14 = class333.field4373[var1.field6739];
                if (var14 == 0) {
                    class56 var21 = class234.method1453(var1.field6746, var1.field6745, var1.field6741);
                    if (var21 instanceof class286) {
                        class33.method262(var1.field6746, var1.field6745, var1.field6741);
                        class286 var22 = (class286) var21;
                        if (var22.field3732 != null) {
                            class310.method1800(var1.field6746, var1.field6745, var1.field6741, var22.field3732, null);
                        }
                    }
                } else if (var14 == 1) {
                    class11 var15 = class463.method2642(var1.field6746, var1.field6745, var1.field6741);
                    if (var15 instanceof class291) {
                        class211.method1335(var1.field6746, var1.field6745, var1.field6741);
                        class291 var16 = (class291) var15;
                        if (var16.field3806 != null) {
                            class399.method2328(var1.field6746, var1.field6745, var1.field6741, var16.field3806, null);
                        }
                    }
                } else if (var14 == 2) {
                    class37 var17 = class504.method2874(var1.field6746, var1.field6745, var1.field6741, field2970 == null ? (field2970 = method1391("np")) : field2970);
                    if (var17 instanceof class124) {
                        class179.method1187(var1.field6746, var1.field6745, var1.field6741, field2970 == null ? (field2970 = method1391("np")) : field2970);
                        class124 var18 = (class124) var17;
                        if (var18.field1828 != null) {
                            class48.method357(var18.field1828, false);
                        }
                    }
                } else if (var14 == 3) {
                    class431 var19 = class466.method2648(var1.field6746, var1.field6745, var1.field6741);
                    if (var19 instanceof class358) {
                        class110.method764(var1.field6746, var1.field6745, var1.field6741);
                        class358 var20 = (class358) var19;
                        if (var20.field4835 != null) {
                            class427.method2461(var1.field6746, var1.field6745, var1.field6741, var20.field4835);
                        }
                    }
                }
                var1.method300(false);
            } else if (class31.field516 == var1.field6747) {
                int var2 = class333.field4373[var1.field6739];
                if (var2 == 0) {
                    class56 var3 = class234.method1453(var1.field6746, var1.field6745, var1.field6741);
                    if (var3 instanceof class286) {
                        var1.method300(false);
                    } else if (class335.method1917(var1.field6746, var1.field6745, var1.field6741) == null) {
                        class286 var4 = new class286(var1.field6739, var1.field6743, var1.field6742, var1.field6749, var1.field6748, var3);
                        class310.method1800(var1.field6746, var1.field6745, var1.field6741, var4, null);
                    } else {
                        var1.method300(false);
                    }
                } else if (var2 == 1) {
                    class11 var12 = class463.method2642(var1.field6746, var1.field6745, var1.field6741);
                    if (var12 instanceof class291) {
                        var1.method300(false);
                    } else if (class369.method2138(var1.field6746, var1.field6745, var1.field6741) == null) {
                        class291 var13 = new class291(var1.field6739, var1.field6743, var1.field6742, var1.field6749, var1.field6748, var12);
                        class399.method2328(var1.field6746, var1.field6745, var1.field6741, var13, null);
                    } else {
                        var1.method300(false);
                    }
                } else if (var2 == 2) {
                    class37 var5 = class504.method2874(var1.field6746, var1.field6745, var1.field6741, field2970 == null ? (field2970 = method1391("np")) : field2970);
                    if (var5 instanceof class124) {
                        var1.method300(false);
                    } else {
                        class179.method1187(var1.field6746, var1.field6745, var1.field6741, field2970 == null ? (field2970 = method1391("np")) : field2970);
                        class1 var6 = class402.field5388.method1994(arg0 ^ 0x29FC, var1.field6753);
                        int var7;
                        int var8;
                        if (var1.field6743 == 1 || var1.field6743 == 3) {
                            var7 = var6.field16;
                            var8 = var6.field82;
                        } else {
                            var7 = var6.field82;
                            var8 = var6.field16;
                        }
                        class124 var9 = new class124(var1.field6739, var1.field6743, var1.field6746, var1.field6742, var1.field6749, var1.field6748, var1.field6745, var1.field6745 + var7 - 1, var1.field6741, var1.field6741 + var8 - 1, var5);
                        class48.method357(var9, false);
                    }
                } else if (var2 == 3) {
                    class431 var10 = class466.method2648(var1.field6746, var1.field6745, var1.field6741);
                    if (var10 instanceof class358) {
                        var1.method300(false);
                    } else {
                        class358 var11 = new class358(var1.field6742, var1.field6749, var1.field6748, var10);
                        class427.method2461(var1.field6746, var1.field6745, var1.field6741, var11);
                    }
                }
            }
        }
        field2955++;
        if (arg0 != -27250) {
            field2961 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z", line = 233)
    public static final boolean method1388(int arg0) {
        if (arg0 >= -86) {
            return false;
        }
        field2948++;
        try {
            return class308.method1789((byte) -104);
        } catch (IOException var4) {
            class467.method2651((byte) -48);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class34.field551 == null ? -1 : class34.field551.method106(119)) + "," + (class167.field2425 == null ? -1 : class167.field2425.method106(81)) + "," + (class339.field4424 == null ? -1 : class339.field4424.method106(76)) + " - " + field2965 + "," + (class385.field5232.field6261[0] + class401.field5382) + "," + (class385.field5232.field6266[0] + class421.field5762) + " - ";
            for (int var3 = 0; field2965 > var3 && var3 < 50; var3++) {
                var2 = var2 + class481.field6632.field5152[var3] + ",";
            }
            class504.method2879(var5, var2, -19638);
            class476.method2735(255);
            return true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V", line = 268)
    public final void method1389(int arg0) {
        if (arg0 <= 38) {
            return;
        }
        field2969++;
        int var2 = this.field2968;
        if (this.field2956 != null) {
            class1 var3 = this.field2956.method17(class301.field3980, -56);
            if (var3 == null) {
                this.field2966 = 0;
                this.field2952 = 0;
                this.field2967 = 0;
                this.field2957 = null;
                this.field2968 = -1;
                this.field2962 = 0;
            } else {
                this.field2968 = var3.field48;
                this.field2957 = var3.field8;
                this.field2967 = var3.field13;
                this.field2952 = var3.field50;
                this.field2962 = var3.field3 << 7;
                this.field2966 = var3.field28;
            }
        } else if (this.field2954 != null) {
            int var4 = class302.method1760(-84, this.field2954);
            if (var2 != var4) {
                this.field2968 = var4;
                class506 var5 = this.field2954.field1661;
                if (var5.field6971 != null) {
                    var5 = var5.method2885(-78, class301.field3980);
                }
                if (var5 == null) {
                    this.field2967 = this.field2962 = 0;
                } else {
                    this.field2962 = var5.field6967 << 7;
                    this.field2967 = var5.field6977;
                }
            }
        } else if (this.field2964 != null) {
            this.field2968 = class378.method2182((byte) -59, this.field2964);
            this.field2962 = this.field2964.field7602 << 7;
            this.field2967 = this.field2964.field7599;
        }
        if (this.field2968 != var2 && this.field2959 != null) {
            class318.field4175.method3070(this.field2959);
            this.field2959 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)V", line = 352)
    public static void method1390(int arg0) {
        field2961 = null;
        if (arg0 != 3726) {
            field2963 = true;
        }
    }
}
