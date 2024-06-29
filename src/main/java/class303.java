import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class303 extends class331 {

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "Z")
    public boolean field4265 = true;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "Ltq;")
    public static class376 field4262;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "[I")
    private int[] field4268;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "[I")
    public int[] field4273;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field4259;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "[[I")
    private int[][] field4258;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ldg;I)Ljava/lang/String;", line = 6)
    public final String method1993(class236 arg0, int arg1) {
        field4263++;
        if (arg1 < 102) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4268 != null) {
            for (int var4 = 0; var4 < this.field4268.length; var4++) {
                var3.append(this.field4259[var4]);
                var3.append(class137.method848(this.field4268[var4], (byte) -123, this.field4258[var4], arg0.method1572((byte) 85, class294.field4104[this.field4268[var4]])));
            }
        }
        var3.append(this.field4259[this.field4259.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBLdg;)V", line = 35)
    private final void method1994(int arg0, byte arg1, class236 arg2) {
        if (arg0 == 1) {
            this.field4259 = class409.method2618(1, arg2.method1562(false), '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method1574(arg1 ^ 0xFFFFFFE3);
            this.field4273 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4273[var9] = arg2.method1617((byte) 48);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1574(-103);
            this.field4268 = new int[var4];
            this.field4258 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1617((byte) 48);
                this.field4268[var5] = var6;
                this.field4258[var5] = new int[class334.field4727[var6]];
                for (int var7 = 0; var7 < class334.field4727[var6]; var7++) {
                    this.field4258[var5][var7] = arg2.method1617((byte) 48);
                }
            }
        } else if (arg0 == 4) {
            this.field4265 = false;
        }
        field4272++;
        if (arg1 != 68) {
            this.method1996(false);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILdg;[I)V", line = 107)
    public final void method1995(int arg0, class236 arg1, int[] arg2) {
        field4260++;
        if (this.field4268 == null) {
            return;
        }
        if (arg0 != 12192) {
            this.field4268 = null;
        }
        for (int var4 = 0; var4 < this.field4268.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class312.field4404[this.method1999(var4, (byte) -77)];
            if (var5 > 0) {
                arg1.method1608(arg0 ^ 0xFFFFD07D, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)I", line = 136)
    public final int method1996(boolean arg0) {
        field4271++;
        if (this.field4268 == null) {
            return 0;
        } else {
            if (!arg0) {
                this.field4268 = null;
            }
            return this.field4268.length;
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(B)V", line = 150)
    public static void method1997(byte arg0) {
        if (arg0 < -58) {
            field4262 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ltq;I)V", line = 160)
    public static final void method1998(class376 arg0, int arg1) {
        class1.field1 = arg0;
        if (arg1 > -108) {
            method2003((class12) null);
        }
        field4267++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)I", line = 171)
    public final int method1999(int arg0, byte arg1) {
        field4264++;
        int var3 = -57 / ((arg1 + 29) / 45);
        return this.field4268 == null || arg0 < 0 || this.field4268.length < arg0 ? -1 : this.field4268[arg0];
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V", line = 187)
    public final void method2000(int arg0) {
        if (arg0 != -1) {
            return;
        }
        if (this.field4273 != null) {
            for (int var2 = 0; var2 < this.field4273.length; var2++) {
                this.field4273[var2] = class429.method2704(this.field4273[var2], 32768);
            }
        }
        field4274++;
    }

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Ljava/lang/String;", line = 209)
    public final String method2001(int arg0) {
        field4275++;
        StringBuffer var2 = new StringBuffer(arg0);
        if (this.field4259 == null) {
            return "";
        }
        var2.append(this.field4259[0]);
        for (int var3 = 1; var3 < this.field4259.length; var3++) {
            var2.append("...");
            var2.append(this.field4259[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ldg;B)V", line = 233)
    public final void method2002(class236 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1574(-35);
            if (var3 == 0) {
                field4261++;
                int var4 = 45 % ((arg1 + 28) / 53);
                return;
            }
            this.method1994(var3, (byte) 68, arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lqk;)V", line = 253)
    public static final void method2003(class12 arg0) {
        if (class75.field886 >= 255) {
            return;
        }
        class266.field3800[class75.field886] = arg0;
        class229.field3244[class75.field886] = false;
        class75.field886++;
        int var1 = arg0.field167;
        if (arg0.field161) {
            var1 = 0;
        }
        int var2 = arg0.field167;
        if (arg0.field155) {
            var2 = class167.field2334 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field5687 + 64 - arg0.field5679 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field5687 + arg0.field5679 - 64 >> 7;
            if (var6 >= class299.field4190) {
                var6 = class299.field4190 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field163[var4++];
                int var9 = (var8 >>> 8) + (arg0.field5682 + 64 - arg0.field5679 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class415.field5953) {
                    var10 = class415.field5953 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class229.field3232[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class229.field3232[var3][var11][var7] = var12 | class75.field886;
                    } else if ((var12 & 0xFF00) == 0) {
                        class229.field3232[var3][var11][var7] = var12 | class75.field886 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class229.field3232[var3][var11][var7] = var12 | class75.field886 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class229.field3232[var3][var11][var7] = var12 | class75.field886 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZI)I", line = 344)
    public final int method2004(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -18;
        }
        field4266++;
        if (this.field4268 == null || arg0 < 0 || arg0 > this.field4268.length) {
            return -1;
        } else if (this.field4258[arg0] == null || arg2 < 0 || this.field4258[arg0].length < arg2) {
            return -1;
        } else {
            return this.field4258[arg0][arg2];
        }
    }
}
