import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class263 extends class21 {

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field3612 = new String[100];

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public int field3616;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "J")
    public long field3610;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "Lij;")
    public static class316 field3618;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pp", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field3619;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)I", line = 7)
    public final int method124(int arg0) {
        field3615++;
        if (arg0 != -1) {
            this.field3616 = -104;
        }
        return this.field3617;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I", line = 18)
    public final int method126(boolean arg0) {
        field3609++;
        if (arg0) {
            this.field3611 = 61;
        }
        return this.field3616;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V", line = 29)
    public static void method1686(byte arg0) {
        field3618 = null;
        field3612 = null;
        if (arg0 != 116) {
            method1687((class58) null, -89, 95, 78, (byte) 1, 39, 85, 116, -74);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lea;IIIBIIII)V", line = 53)
    public static final void method1687(class58 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field3608++;
        class223 var9 = (class223) class243.method1587(arg8, arg7, arg5);
        if (var9 != null) {
            class447 var10 = class133.method996((byte) -19, var9.method711(true));
            int var11 = var9.method709(30030) & 0x3;
            int var12 = var9.method695(898);
            if (var10.field6317 == -1) {
                int var13 = arg6;
                if (var10.field6297 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method451((byte) -44, var13, arg3, 4, arg1);
                    } else if (var11 == 1) {
                        arg0.method459(4, arg1, var13, arg3, true);
                    } else if (var11 == 2) {
                        arg0.method451((byte) -44, var13, arg3 + 3, 4, arg1);
                    } else if (var11 == 3) {
                        arg0.method459(4, arg1 + 3, var13, arg3, true);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method461(1, var13, 1, -91, arg3, arg1);
                    } else if (var11 == 1) {
                        arg0.method461(1, var13, 1, -91, arg3 + 3, arg1);
                    } else if (var11 == 2) {
                        arg0.method461(1, var13, 1, -91, arg3 + 3, arg1 + 3);
                    } else if (var11 == 3) {
                        arg0.method461(1, var13, 1, -91, arg3, arg1 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method459(4, arg1, var13, arg3, true);
                    } else if (var11 == 1) {
                        arg0.method451((byte) -44, var13, arg3 + 3, 4, arg1);
                    } else if (var11 == 2) {
                        arg0.method459(4, arg1 + 3, var13, arg3, true);
                    } else if (var11 == 3) {
                        arg0.method451((byte) -44, var13, arg3, 4, arg1);
                    }
                }
            } else {
                class266.method1700(arg1, arg3, var10, (byte) 102, var11, arg0);
            }
        }
        class223 var14 = (class223) class95.method734(arg8, arg7, arg5, field3619 == null ? (field3619 = method1688("iq")) : field3619);
        if (var14 != null) {
            class447 var15 = class133.method996((byte) -19, var14.method711(true));
            int var16 = var14.method709(30030) & 0x3;
            int var17 = var14.method695(898);
            if (var15.field6317 != -1) {
                class266.method1700(arg1, arg3, var15, (byte) 102, var16, arg0);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field6297 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method454(var18, -99, arg1 + 3, arg1, arg3, arg3 + 3);
                } else {
                    arg0.method454(var18, -50, arg1, arg1 + 3, arg3, arg3 + 3);
                }
            }
        }
        if (arg4 >= -75) {
            field3612 = null;
        }
        class223 var19 = (class223) class111.method852(arg8, arg7, arg5);
        if (var19 == null) {
            return;
        }
        class447 var20 = class133.method996((byte) -19, var19.method711(true));
        int var21 = var19.method709(30030) & 0x3;
        if (var20.field6317 != -1) {
            class266.method1700(arg1, arg3, var20, (byte) 102, var21, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)J", line = 190)
    public final long method125(byte arg0) {
        field3613++;
        if (arg0 != 79) {
            this.method126(false);
        }
        return this.field3610;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)I", line = 202)
    public final int method121(byte arg0) {
        int var2 = 93 / ((-arg0 - 17) / 56);
        field3614++;
        return this.field3611;
    }
}
