import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class145 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public int field1995 = 0;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lqc;")
    public static class99 field2001 = new class99(64);

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field2002 = 0;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "[I")
    public static int[] field2005 = new int[5];

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2006 = "skill: ";

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "Lkm;")
    public static class133 field2004;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lkn;")
    public static class178 field2003;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 9)
    public static void method1041(byte arg0) {
        if (arg0 != -74) {
            return;
        }
        field2005 = null;
        field2004 = null;
        field2006 = null;
        field2001 = null;
        field2003 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I", line = 26)
    public static final int method1042(int arg0, int arg1) {
        int var2 = -75 % ((arg1 - 73) / 36);
        field1993++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILcg;I)V", line = 36)
    private final void method1043(int arg0, class316 arg1, int arg2) {
        field1999++;
        if (arg2 == 5) {
            this.field1995 = arg1.method2220((byte) 91);
        }
        int var4 = -86 % ((arg0 + 30) / 38);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lin;B)Z", line = 55)
    public static final boolean method1044(class344 arg0, byte arg1) {
        field1992++;
        if (arg0.field5306 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != -49) {
            return true;
        }
        while (arg0.field5306.length > var2) {
            int var3 = class30.method175(100, var2, arg0);
            int var4 = arg0.field5211[var2];
            if (arg0.field5306[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field5306[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field5306[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V", line = 113)
    public static final void method1045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= (arg2 + arg5); var6++) {
            for (int var7 = arg3; var7 <= (arg3 + arg1); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class242.field3458[arg0][var7][var6] = 127;
                }
            }
        }
        int var8 = arg5;
        if (arg4 > -91) {
            field2002 = -41;
        }
        while (var8 < arg2 + arg5) {
            for (int var9 = arg3; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class333.field5020[arg0][var9][var8] = arg0 <= 0 ? 0 : class333.field5020[arg0 - 1][var9][var8];
                }
            }
            var8++;
        }
        field1996++;
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg5 + 1; var10 < (arg5 + arg2); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class333.field5020[arg0][arg3][var10] = class333.field5020[arg0][arg3 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg1 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class333.field5020[arg0][var11][arg5] = class333.field5020[arg0][var11][arg5 - 1];
                }
            }
        }
        if (arg3 < 0 || arg5 < 0 || arg3 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && class333.field5020[arg0][arg3 - 1][arg5] != 0) {
                class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3 - 1][arg5];
            } else if (arg5 > 0 && class333.field5020[arg0][arg3][arg5 - 1] != 0) {
                class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3][arg5 - 1];
            } else if (arg3 > 0 && arg5 > 0 && class333.field5020[arg0][arg3 - 1][arg5 - 1] != 0) {
                class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3 - 1][arg5 - 1];
            }
        } else if (arg3 > 0 && class333.field5020[arg0 - 1][arg3 - 1][arg5] != class333.field5020[arg0][arg3 - 1][arg5]) {
            class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3 - 1][arg5];
        } else if (arg5 > 0 && class333.field5020[arg0 - 1][arg3][arg5 - 1] != class333.field5020[arg0][arg3][arg5 - 1]) {
            class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3][arg5 - 1];
        } else if (arg3 > 0 && arg5 > 0 && class333.field5020[arg0 - 1][arg3 - 1][arg5 - 1] != class333.field5020[arg0][arg3 - 1][arg5 - 1]) {
            class333.field5020[arg0][arg3][arg5] = class333.field5020[arg0][arg3 - 1][arg5 - 1];
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLcg;)V", line = 230)
    public final void method1046(boolean arg0, class316 arg1) {
        if (arg0) {
            this.method1046(true, (class316) null);
        }
        while (true) {
            int var3 = arg1.method2219(16448);
            if (var3 == 0) {
                field1998++;
                return;
            }
            this.method1043(18, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 254)
    public static final void method1047(int arg0) {
        class259.field3812 = 0;
        class252.field3614 = 0;
        class211.method1478((byte) -67);
        field1994++;
        class110.method802(-108);
        class342.method2358(-15463);
        class101.method736((byte) -8);
        for (int var1 = 0; var1 < class259.field3812; var1++) {
            int var2 = class290.field4323[var1];
            if (class329.field4966 != class169.field2306[var2].field3697) {
                if (class169.field2306[var2].field3414 > 0) {
                    class157.method1137(true, class169.field2306[var2]);
                }
                class169.field2306[var2] = null;
            }
        }
        if (class199.field2833 != class157.field2165.field4777) {
            throw new RuntimeException("gpp1 pos:" + class157.field2165.field4777 + " psize:" + class199.field2833);
        } else if (arg0 <= -85) {
            for (int var3 = 0; var3 < class292.field4352; var3++) {
                if (class169.field2306[class4.field35[var3]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class292.field4352);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLwa;Ljava/awt/Frame;)V", line = 314)
    public static final void method1048(byte arg0, class80 arg1, Frame arg2) {
        while (true) {
            class285 var3 = arg1.method616(arg2, 9);
            while (var3.field4241 == 0) {
                class186.method1304(arg0 + 42, 10L);
            }
            if (var3.field4241 == 1) {
                field1997++;
                arg2.setVisible(false);
                if (arg0 != -32) {
                    return;
                }
                arg2.dispose();
                return;
            }
            class186.method1304(10, 100L);
        }
    }
}
