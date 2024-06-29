import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class75 extends class288 {

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    private int field1022 = -1;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1019 = "Loaded defaults";

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Leg;")
    public static class272 field1024 = new class272(64);

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "[B")
    public static byte[] field1030 = new byte[32896];

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1035;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "[I")
    public int[] field1020;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Z")
    public final boolean method567(int arg0) {
        ++field1028;
        if (this.field1020 != null) {
            return true;
        } else if (~this.field1022 <= arg0) {
            class43 var2 = ~class99.field1516 > -1 ? class161.method1107(this.field1022, 1, class267.field4329) : class260.method1704(arg0 + -103, class99.field1516, class267.field4329, this.field1022);
            var2.method331();
            this.field1021 = var2.field4372;
            this.field1020 = var2.field510;
            this.field1018 = var2.field4383;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
    public final int method568(int arg0) {
        ++field1017;
        if (arg0 != 255) {
            method572(-128, 97, 123, 121, 10, 1, 69);
        }
        return this.field1022;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method569(byte arg0, String arg1) {
        ++field1029;
        if (arg1 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 != -44) {
                method569((byte) -30, (String) null);
            }
            while (~class264.field4224 < ~var2) {
                if (arg1.equalsIgnoreCase(class28.field338[var2])) {
                    return true;
                }
                ++var2;
            }
            return arg1.equalsIgnoreCase(class197.field3179.field3735);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I")
    public int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method567(-72);
        }
        int[][] var3 = super.field4598.method812(arg1, arg0 + 65534);
        ++field1026;
        if (super.field4598.field1954 && this.method567(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class205.field3296 == ~this.field1021 ? arg1 : this.field1021 * arg1 / class205.field3296) * this.field1018;
            if (~class186.field2986 == ~this.field1018) {
                for (int var8 = 0; class186.field2986 > var8; ++var8) {
                    int var9 = this.field1020[var7++];
                    var6[var8] = class204.method1369(var9 << 4, 4080);
                    var5[var8] = class204.method1369(4080, var9 >> 4);
                    var4[var8] = class204.method1369(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class186.field2986 < ~var10; ++var10) {
                    int var11 = this.field1018 * var10 / class186.field2986;
                    int var12 = this.field1020[var7 + var11];
                    var6[var10] = class204.method1369(var12 << 4, 4080);
                    var5[var10] = class204.method1369(4080, var12 >> 4);
                    var4[var10] = class204.method1369(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIZIILil;)V")
    public static final void method570(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class49 arg6) {
        if (arg3) {
            method575(-58);
        }
        class238.method1572(arg0, arg6.field613, arg5, arg2, arg6.field614, arg4, arg1, (byte) 59);
        ++field1023;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final void method571(int arg0) {
        super.method571(50);
        if (arg0 <= 2) {
            this.field1020 = null;
        }
        this.field1020 = null;
        ++field1025;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
    public static final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -19146) {
            field1019 = null;
        }
        ++field1034;
        if (~arg0 <= ~class58.field817 && class121.field2042 >= arg5 && class156.field2507 <= arg4 && client.field3617 >= arg6) {
            if (arg1 == 1) {
                class142.method964(arg0, arg6, 91, arg2, arg4, arg5);
            } else {
                class258.method1691(arg5, arg1, arg4, arg3 + 19136, arg6, arg0, arg2);
            }
        } else if (arg1 == 1) {
            class121.method851(arg6, arg0, arg4, arg5, arg2, true);
        } else {
            class62.method480(arg6, arg1, arg0, arg5, arg2, -66, arg4);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 == -19) {
            ++field1032;
            if (~arg2 == -1) {
                this.field1022 = arg0.method1777(-107);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IC)Z")
    public static final boolean method573(int arg0, char arg1) {
        ++field1033;
        if (arg0 != 255) {
            return false;
        } else {
            return arg1 >= 'A' && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method574(Component arg0, int arg1) {
        ++field1031;
        Method var2 = class255.field4086;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = 10 / ((arg1 - -31) / 53);
        arg0.addKeyListener(class170.field2750);
        arg0.addFocusListener(class170.field2750);
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1030 = null;
        field1035 = null;
        field1019 = null;
        if (arg0 != -1) {
            method573(43, 'I');
        }
        field1024 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field1030[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1035 = "M";
    }
}
