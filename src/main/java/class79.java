import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class79 extends class197 {

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field1353 = 1;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    private int field1356 = 1;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field1351 = 204;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lqe;")
    public static class35 field1355;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IZ)V", line = 8)
    public static final void method567(int arg0, boolean arg1) {
        byte var2;
        byte[][] var3;
        if (class257.field4390 && arg1) {
            var2 = 1;
            var3 = class58.field925;
        } else {
            var2 = 4;
            var3 = class146.field2482;
        }
        field1354++;
        if (arg0 != 8) {
            return;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class172.method1164(126);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class148.field2511[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3843E4E) >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFE8FB) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class231.field3990.length; var13++) {
                                if (class231.field3990[var13] == var12 && var3[var13] != null) {
                                    class202.method1341(arg1, (var10 & 0x7) * 8, var4, var5 * 8, class243.field4216, var9, var6 * 8, var3[var13], (var11 & 0x7) * 8, var8, 7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JZ)V", line = 99)
    public static final void method568(long arg0, boolean arg1) {
        field1357++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class138.field2355; var3++) {
            if (class209.field3607[var3] == arg0) {
                class85.field1443++;
                class138.field2355--;
                for (int var4 = var3; var4 < class138.field2355; var4++) {
                    class209.field3607[var4] = class209.field3607[var4 + 1];
                    class279.field4779[var4] = class279.field4779[var4 + 1];
                }
                class69.field1188 = class182.field3259;
                class159.field2710.method885(43, -79);
                class159.field2710.method1603(arg0, -1649350304);
                break;
            }
        }
        if (!arg1) {
            field1355 = (class35) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 245)
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I", line = 145)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            return (int[]) null;
        }
        field1358++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            for (int var4 = 0; var4 < class190.field3362; var4++) {
                int var5 = class166.field2822[var4];
                int var6 = class268.field4670[arg1];
                int var7 = this.field1353 * var5 >> 12;
                int var8 = this.field1356 * var6 >> 12;
                int var9 = var6 % (4096 / this.field1356) * this.field1356;
                int var10 = var5 % (4096 / this.field1353) * this.field1353;
                if (var9 < this.field1351) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field1351) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1351 > var10) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(B)V", line = 229)
    public static void method569(byte arg0) {
        int var1 = 125 / ((arg0 + 45) / 63);
        field1355 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILva;I)V", line = 259)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            this.field1353 = -55;
        }
        if (arg2 == 0) {
            this.field1353 = arg1.method1589(arg0 - 7867);
        } else if (arg2 == 1) {
            this.field1356 = arg1.method1589(85);
        } else if (arg2 == 2) {
            this.field1351 = arg1.method1615(arg0 ^ 0xFFFFE095);
        }
        field1359++;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I", line = 302)
    public static final int method570(int arg0) {
        field1352++;
        return class191.field3378 == arg0 ? 0 : class258.field4469[class191.field3378].method423();
    }
}
