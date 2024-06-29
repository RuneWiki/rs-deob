import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class233 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lph;")
    public static class229 field3848 = class266.method1858("titlebg", 0);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lri;")
    public static class301 field3851 = null;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[[B")
    public static byte[][] field3849;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 7)
    public static final void method1655(byte arg0, Component arg1) {
        field3853++;
        arg1.removeMouseListener(class326.field5571);
        arg1.removeMouseMotionListener(class326.field5571);
        if (arg0 <= 0) {
            arg1.removeFocusListener(class326.field5571);
            class170.field2804 = 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 68)
    public static void method1656(byte arg0) {
        field3848 = null;
        field3851 = null;
        field3849 = (byte[][]) null;
        if (arg0 != 115) {
            method1656((byte) 127);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)V", line = 112)
    public static final void method1657(int arg0, int arg1, byte arg2) {
        field3852++;
        int var3 = arg0--;
        int var4 = class1.field33[arg0];
        if (var3 > 25) {
            var3 = 25;
        }
        if (arg2 != 12) {
            field3851 = (class301) null;
        }
        int var5 = class311.field5215[arg0];
        if (arg1 == 0) {
            class121.field2033.method37(76, 249);
            class287.field4710++;
            class121.field2033.method1188(-121, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class121.field2033.method37(63, 98);
            class121.field2033.method1188(-80, var3 + var3 + 3 + 14);
            class8.field104++;
        }
        if (arg1 == 2) {
            class215.field3543++;
            class121.field2033.method37(115, 218);
            class121.field2033.method1188(-106, var3 - (-var3 - 3));
        }
        class121.field2033.method1180(46, class1.field9 + var4);
        class133.field2155 = class311.field5215[0];
        class68.field1086 = class1.field33[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class121.field2033.method1188(arg2 ^ 0xFFFFFF81, class1.field33[arg0] - var4);
            class121.field2033.method1157(class311.field5215[arg0] - var5, -33);
        }
        class121.field2033.method1200(class94.field1583[82] ? 1 : 0, (byte) -99);
        class121.field2033.method1160(var5 + class1.field1, -1247507120);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lhb;Z)V", line = 225)
    public static final void method1658(class164 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3850++;
        while (true) {
            while (arg0.field2668.length > arg0.field2670) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1178(8) == 1) {
                    var2 = true;
                    var3 = arg0.method1178(8);
                    var4 = arg0.method1178(8);
                }
                int var5 = arg0.method1178(8);
                int var6 = arg0.method1178(8);
                int var7 = var5 * 64 - class54.field786;
                int var8 = class266.field4487 + class214.field3537 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class50.field716 > (var7 + 63) && class214.field3537 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg0.method1163(864348104);
                                if (var13 != 0) {
                                    if (class186.field3029[var9][var10] == null) {
                                        class186.field3029[var9][var10] = new byte[4096];
                                    }
                                    class186.field3029[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1163(864348104);
                                    if (class243.field4012[var9][var10] == null) {
                                        class243.field4012[var9][var10] = new byte[4096];
                                    }
                                    class243.field4012[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1163(864348104);
                        if (var16 != 0) {
                            arg0.field2670++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V", line = 322)
    public static final void method1659(int arg0, byte arg1) {
        if (arg1 != 88) {
            field3848 = (class229) null;
        }
        class184.field2985.method1418((byte) -17, arg0);
        field3847++;
    }
}
