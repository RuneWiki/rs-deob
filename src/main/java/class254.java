import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class254 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "F")
    public float field4009 = 1.0F;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "F")
    public float field4013 = 0.25F;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "F")
    public float field4023 = 1.0F;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "F")
    public float field4028;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "F")
    public float field4020;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field4017;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "F")
    public float field4024;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public int field4025;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lgb;")
    public class88 field4021;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4016 = -1;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
    public static int[] field4015 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[Luj;")
    public static class169[] field4011;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field4027;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILvl;)V", line = 4)
    public final void method1843(int arg0, class6 arg1) {
        this.field4023 = (float) (arg1.method58(-288140008) * 8) / 255.0F;
        this.field4013 = (float) (arg1.method58(-288140008) * 8) / 255.0F;
        this.field4009 = (float) (arg0 * arg1.method58(arg0 ^ 0xEED35510)) / 255.0F;
        field4026++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lvl;Z)V", line = 18)
    public static final void method1844(class6 arg0, boolean arg1) {
        field4029++;
        if (arg1) {
            method1844((class6) null, true);
        }
        while (true) {
            while (arg0.field115.length > arg0.field111) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method58(-288140008) == 1) {
                    var2 = true;
                    var3 = arg0.method58(-288140008);
                    var4 = arg0.method58(-288140008);
                }
                int var5 = arg0.method58(-288140008);
                int var6 = arg0.method58(-288140008);
                int var7 = var5 * 64 - class60.field885;
                int var8 = class4.field42 + class340.field5301 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class251.field3959 > var7 + 63 && class340.field5301 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method83((byte) -93);
                                if (var13 != 0) {
                                    if (class174.field2860[var9][var10] == null) {
                                        class174.field2860[var9][var10] = new byte[4096];
                                    }
                                    class174.field2860[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method83((byte) -95);
                                    if (class68.field962[var9][var10] == null) {
                                        class68.field962[var9][var10] = new byte[4096];
                                    }
                                    class68.field962[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method83((byte) -126);
                        if (var16 != 0) {
                            arg0.field111++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 133)
    public static void method1845(int arg0) {
        field4027 = null;
        if (arg0 == 4460) {
            field4015 = null;
            field4011 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 249)
    public class254() {
        this.field4028 = 0.69921875F;
        this.field4014 = class115.field1597;
        this.field4012 = class115.field1601;
        this.field4020 = 1.1523438F;
        this.field4017 = -60;
        this.field4024 = 1.2F;
        this.field4022 = 0;
        this.field4007 = -50;
        this.field4025 = -50;
        if (class1.field6 != null) {
            this.field4021 = class88.method631(class1.field6[0], class1.field6[1], class1.field6[2], class1.field6[3], class1.field6[4], class1.field6[5]);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lvl;)V", line = 268)
    public class254(class6 arg0) {
        int var2 = arg0.method58(-288140008);
        if ((var2 & 0x1) == 0) {
            this.field4014 = class115.field1597;
        } else {
            this.field4014 = arg0.method73((byte) 19);
        }
        if ((var2 & 0x2) == 0) {
            this.field4020 = 1.1523438F;
        } else {
            this.field4020 = (float) arg0.method39((byte) 62) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field4028 = 0.69921875F;
        } else {
            this.field4028 = (float) arg0.method39((byte) 46) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field4024 = 1.2F;
        } else {
            this.field4024 = (float) arg0.method39((byte) 44) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4025 = -50;
            this.field4007 = -50;
            this.field4017 = -60;
        } else {
            this.field4025 = arg0.method78((byte) -61);
            this.field4017 = arg0.method78((byte) -64);
            this.field4007 = arg0.method78((byte) -98);
        }
        if ((var2 & 0x20) == 0) {
            this.field4012 = class115.field1601;
        } else {
            this.field4012 = arg0.method73((byte) 19);
        }
        if ((var2 & 0x40) == 0) {
            this.field4022 = 0;
        } else {
            this.field4022 = arg0.method39((byte) 98);
        }
        if ((var2 & 0x80) != 0) {
            this.field4021 = class88.method631(arg0.method39((byte) 30), arg0.method39((byte) 121), arg0.method39((byte) 54), arg0.method39((byte) 34), arg0.method39((byte) 78), arg0.method39((byte) 67));
        } else if (class1.field6 != null) {
            this.field4021 = class88.method631(class1.field6[0], class1.field6[1], class1.field6[2], class1.field6[3], class1.field6[4], class1.field6[5]);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(CI)Z", line = 160)
    public static final boolean method1846(char arg0, int arg1) {
        if (arg1 != -18338) {
            return true;
        }
        field4008++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 188)
    public static final void method1847(byte arg0) {
        if (arg0 <= 123) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class78.field1046 - 1); var2++) {
                if (class282.field4365[var2] < 1000 && class282.field4365[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class342.field5324[var2];
                    class342.field5324[var2] = class342.field5324[var2 + 1];
                    class342.field5324[var2 + 1] = var3;
                    String var4 = class32.field472[var2];
                    class32.field472[var2] = class32.field472[var2 + 1];
                    class32.field472[var2 + 1] = var4;
                    int var5 = class58.field839[var2];
                    class58.field839[var2] = class58.field839[var2 + 1];
                    class58.field839[var2 + 1] = var5;
                    int var6 = class248.field3904[var2];
                    class248.field3904[var2] = class248.field3904[var2 + 1];
                    class248.field3904[var2 + 1] = var6;
                    int var7 = class135.field1974[var2];
                    class135.field1974[var2] = class135.field1974[var2 + 1];
                    class135.field1974[var2 + 1] = var7;
                    short var8 = class282.field4365[var2];
                    class282.field4365[var2] = class282.field4365[var2 + 1];
                    class282.field4365[var2 + 1] = var8;
                    long var9 = class234.field3660[var2];
                    class234.field3660[var2] = class234.field3660[var2 + 1];
                    class234.field3660[var2 + 1] = var9;
                }
            }
        }
        field4018++;
    }
}
