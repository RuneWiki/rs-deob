import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class144 extends class287 {

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2277 = 127;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 8)
    public static final void method1068(int arg0) {
        class92.field1228.method1174(arg0 - 159);
        class202.field3228 = 1;
        class3.field31 = null;
        if (arg0 != 255) {
            method1070((class137) null, 60, (Frame) null);
        }
        field2282++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/lang/String;B)V", line = 22)
    public static final void method1069(boolean arg0, String arg1, byte arg2) {
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        field2284++;
        int var5 = 0;
        int var6 = 0;
        if (arg2 <= 7) {
            field2277 = 14;
        }
        while (class269.field4188 > var6) {
            class316 var7 = class149.method1092((byte) -104, var6);
            if ((!arg0 || var7.field4978) && var7.field4996 == -1 && var7.field4947 == -1 && var7.field4935 == 0 && var7.field4988.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class277.field4273 = null;
                    class325.field5099 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
            var6++;
        }
        class220.field3481 = 0;
        class277.field4273 = var4;
        class325.field5099 = var5;
        String[] var10 = new String[class325.field5099];
        for (int var11 = 0; var11 < class325.field5099; var11++) {
            var10[var11] = class149.method1092((byte) -104, var4[var11]).field4988;
        }
        class82.method599(var10, false, class277.field4273);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvc;ILjava/awt/Frame;)V", line = 93)
    public static final void method1070(class137 arg0, int arg1, Frame arg2) {
        field2275++;
        while (true) {
            class114 var3 = arg0.method1012((byte) -34, arg2);
            while (var3.field1595 == 0) {
                class272.method1918((byte) 22, 10L);
            }
            if (var3.field1595 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                if (arg1 != -29642) {
                    field2277 = -82;
                }
                return;
            }
            class272.method1918((byte) 22, 100L);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z", line = 120)
    public static final boolean method1071(int arg0, int arg1) {
        field2278++;
        if (arg0 > -38) {
            return false;
        } else {
            return arg1 == 4 || arg1 == 8;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V", line = 137)
    public static final void method1072(boolean arg0, int arg1) {
        field2283++;
        byte[][] var2;
        if (class109.field1458 && arg0) {
            var2 = class181.field2933;
        } else {
            var2 = class206.field3269;
        }
        if (arg1 != -1) {
            field2277 = 42;
        }
        int var3 = class293.field4540.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class232.field3616[var4] >> 8) * 64 - class326.field5108;
                int var7 = (class232.field3616[var4] & 0xFF) * 64 - class198.field3168;
                class50.method373((byte) 113);
                class83.method604(arg1 - 86, class134.field1970, arg0, var5, var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V", line = 177)
    public static final void method1073(byte arg0, boolean arg1) {
        field2279++;
        byte[][] var2;
        byte var3;
        if (class109.field1458 && arg1) {
            var2 = class181.field2933;
            var3 = 1;
        } else {
            var2 = class206.field3269;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class50.method373((byte) 99);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class339.field5298[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3AEFEB0) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0x3FFC) >> 3;
                            int var11 = (var7 & 0xFFF72C) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class232.field3616.length; var13++) {
                                if (class232.field3616[var13] == var12 && var2[var13] != null) {
                                    class336.method2334(var8, var2[var13], var4, class134.field1970, arg1, 3, (var11 & 0x7) * 8, var6 * 8, (var10 & 0x7) * 8, var9, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 92) {
            field2276 = -40;
        }
    }
}
