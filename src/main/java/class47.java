import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class47 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field751 = 128;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field758 = -1;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Z")
    public boolean field747 = true;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field756 = 16;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public int field755 = -1;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Z")
    public boolean field750 = true;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field752 = 127;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public int field745 = -1;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field763 = 8;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field759 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public int field748 = 1190717;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Z")
    public boolean field764 = false;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Llt;")
    public static class475 field762;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lso;")
    public static class327 field768;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lbr;")
    public class268 field757;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Loa;")
    public static class489 field761;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lri;")
    public static class73 field765;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field769;

    // $FF: synthetic method
    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method298(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class475("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field762 = new class475("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field767 = 1400;
        field768 = new class327(1, 16);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIZZ)V", line = 3)
    public static final void method292(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class192.field2815 = arg0;
        class352.field5398 = 0x1 << class192.field2815;
        class143.field2134 = class352.field5398 >> 1;
        class85.field1314 = (int) Math.sqrt((double) (class143.field2134 * class143.field2134 + class143.field2134 * class143.field2134));
        class248.field3636 = class352.field5398 >> 2;
        class329.field4685 = class352.field5398;
        class361.field5554 = arg2;
        class484.field7096 = arg3;
        class367.field5607 = arg4;
        class417.field6246 = new class518[arg1][class361.field5554][class484.field7096];
        class307.field4415 = new class35[arg1];
        if (arg5) {
            class200.field2889 = new int[class361.field5554][class484.field7096];
            class180.field2647 = new byte[class361.field5554][class484.field7096];
            class339.field4778 = new byte[class361.field5554][class484.field7096];
            class508.field7423 = new class518[1][class361.field5554][class484.field7096];
            class31.field335 = new class35[1];
        } else {
            class200.field2889 = null;
            class180.field2647 = null;
            class339.field4778 = null;
            class508.field7423 = null;
            class31.field335 = null;
        }
        if (arg6) {
            class9.field123 = new long[arg1][arg2][arg3];
            class517.field7540 = new class419[65535];
            class14.field181 = new boolean[65535];
            class44.field711 = 0;
        } else {
            class9.field123 = null;
            class517.field7540 = null;
            class14.field181 = null;
            class44.field711 = 0;
        }
        class158.method1008(false);
        class210.field3063 = new class430[1000];
        class56.field870 = 0;
        class184.field2746 = new class430[1000];
        class310.field4460 = 0;
        class4.field58 = new int[arg1][class361.field5554 + 1][class484.field7096 + 1];
        class377.field5758 = new class117[5000];
        class526.field7784 = 0;
        class329.field4682 = new boolean[class367.field5607 + class367.field5607 + 1][class367.field5607 + class367.field5607 + 1];
        class467.field6892 = new boolean[class367.field5607 + class367.field5607 + 2][class367.field5607 + class367.field5607 + 2];
        class42.field640 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 66)
    public final void method293(boolean arg0) {
        if (!arg0) {
            field767 = 2;
        }
        field749++;
        this.field763 = this.field760 | this.field763 << 8;
        if (this.field758 == -1) {
            this.field758 = this.field755;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lqa;IIIIZIII)V", line = 90)
    public static final void method294(class162 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field746++;
        class351 var9 = (class351) class426.method2557(arg6, arg3, arg4);
        if (var9 != null) {
            class519 var10 = class252.field3743.method2686(var9.method20(-30685), (byte) 101);
            int var11 = var9.method17(-102) & 0x3;
            int var12 = var9.method5((byte) -65);
            if (var10.field7611 == -1) {
                int var13 = arg2;
                if (var10.field7573 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1027(4, 3323, arg7, arg1, var13);
                    } else if (var11 == 1) {
                        arg0.method1124(1, arg7, arg1, 4, var13);
                    } else if (var11 == 2) {
                        arg0.method1027(4, 3323, arg7, arg1 + 3, var13);
                    } else if (var11 == 3) {
                        arg0.method1124(1, arg7 + 3, arg1, 4, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method1087(arg7, arg1, 118, 1, var13, 1);
                    } else if (var11 == 1) {
                        arg0.method1087(arg7, arg1 + 3, 123, 1, var13, 1);
                    } else if (var11 == 2) {
                        arg0.method1087(arg7 + 3, arg1 + 3, 124, 1, var13, 1);
                    } else if (var11 == 3) {
                        arg0.method1087(arg7 + 3, arg1, 122, 1, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1124(1, arg7, arg1, 4, var13);
                    } else if (var11 == 1) {
                        arg0.method1027(4, 3323, arg7, arg1 + 3, var13);
                    } else if (var11 == 2) {
                        arg0.method1124(1, arg7 + 3, arg1, 4, var13);
                    } else if (var11 == 3) {
                        arg0.method1027(4, 3323, arg7, arg1, var13);
                    }
                }
            } else {
                class422.method2541(arg1, var10, arg7, 4, var11, arg0);
            }
        }
        class351 var14 = (class351) class342.method2093(arg6, arg3, arg4, field769 == null ? (field769 = method298("mq")) : field769);
        if (var14 != null) {
            class519 var15 = class252.field3743.method2686(var14.method20(-30685), (byte) 102);
            int var16 = var14.method17(20) & 0x3;
            int var17 = var14.method5((byte) -65);
            if (var15.field7611 != -1) {
                class422.method2541(arg1, var15, arg7, 4, var16, arg0);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field7573 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method1029(arg1 + 3, arg7 + 3, (byte) 65, arg1, arg7, var18);
                } else {
                    arg0.method1029(arg1 + 3, arg7, (byte) 65, arg1, arg7 + 3, var18);
                }
            }
        }
        class351 var19 = (class351) class196.method1340(arg6, arg3, arg4);
        if (arg5) {
            field761 = null;
        }
        if (var19 == null) {
            return;
        }
        class519 var20 = class252.field3743.method2686(var19.method20(-30685), (byte) 91);
        int var21 = var19.method17(-112) & 0x3;
        if (var20.field7611 != -1) {
            class422.method2541(arg1, var20, arg7, 4, var21, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ldh;B)V", line = 235)
    public final void method295(class209 arg0, byte arg1) {
        if (arg1 != 89) {
            this.method295(null, (byte) -84);
        }
        field753++;
        while (true) {
            int var3 = arg0.method1428(32122);
            if (var3 == 0) {
                return;
            }
            this.method296(var3, (byte) 47, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLdh;)V", line = 269)
    private final void method296(int arg0, byte arg1, class209 arg2) {
        if (arg1 <= 31) {
            this.field757 = null;
        }
        field754++;
        if (arg0 == 1) {
            this.field759 = class162.method1072(-15029, arg2.method1458((byte) -10));
        } else if (arg0 == 2) {
            this.field755 = arg2.method1428(32122);
        } else if (arg0 == 3) {
            this.field755 = arg2.method1450((byte) 58);
            if (this.field755 == 65535) {
                this.field755 = -1;
            }
        } else if (arg0 == 5) {
            this.field750 = false;
        } else if (arg0 == 7) {
            this.field745 = class162.method1072(-15029, arg2.method1458((byte) -10));
        } else if (arg0 == 8) {
            this.field757.field3920 = this.field760;
        } else if (arg0 == 9) {
            this.field751 = arg2.method1450((byte) 33) << 0;
        } else if (arg0 == 10) {
            this.field747 = false;
        } else if (arg0 == 11) {
            this.field763 = arg2.method1428(32122);
        } else if (arg0 == 12) {
            this.field764 = true;
        } else if (arg0 == 13) {
            this.field748 = arg2.method1458((byte) -10);
        } else if (arg0 == 14) {
            this.field756 = arg2.method1428(32122);
        } else if (arg0 == 15) {
            this.field758 = arg2.method1450((byte) 119);
            if (this.field758 == 65535) {
                this.field758 = -1;
                return;
            }
        } else if (arg0 == 16) {
            this.field752 = arg2.method1428(32122);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 356)
    public static void method297(int arg0) {
        if (arg0 == 0) {
            field762 = null;
            field768 = null;
            field765 = null;
            field761 = null;
        }
    }
}
