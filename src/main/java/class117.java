import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class class117 extends class80 {

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lks;")
    public static class301 field1577 = new class301(0, 0);

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "Ljm;")
    public static class485 field1580 = new class485(22, 7);

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "I")
    public static int field1581 = 0;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "[F")
    public static float[] field1582;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Loa;")
    public static class490 field1579;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "Lmr;")
    public static class95 field1578;

    static {
        new class83("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1582 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I", line = 6)
    public static final int method742(int arg0) {
        field1574++;
        if (arg0 != 75) {
            return -37;
        } else if ((double) class481.field7041 == 3.0D) {
            return 37;
        } else if ((double) class481.field7041 == 4.0D) {
            return 50;
        } else if ((double) class481.field7041 == 6.0D) {
            return 75;
        } else if ((double) class481.field7041 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V", line = 36)
    public class117(int arg0) {
        this.field1576 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V", line = 44)
    public static void method743(boolean arg0) {
        field1580 = null;
        if (arg0) {
            field1579 = null;
            field1577 = null;
            field1578 = null;
            field1582 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "(I)V", line = 64)
    public static final void method744(int arg0) {
        if (arg0 != 26077) {
            method742(-38);
        }
        for (int var1 = 0; var1 < class44.field614; var1++) {
            int var2 = class59.field795[var1];
            class405 var3 = class179.field2534[var2];
            int var4 = class387.field5435.method2099(255);
            if ((var4 & 0x40) != 0) {
                var4 += class387.field5435.method2099(255) << 8;
            }
            if ((var4 & 0x800) != 0) {
                var3.field315 = class387.field5435.method2059(8620);
                var3.field355 = class387.field5435.method2059(8620);
                var3.field302 = class387.field5435.method2097((byte) 124);
                var3.field334 = (byte) class387.field5435.method2099(255);
                var3.field322 = class393.field5484 + class387.field5435.method2064(114);
                var3.field281 = class393.field5484 + class387.field5435.method2062((byte) 14);
            }
            if ((var4 & 0x20) != 0) {
                var3.field289 = class387.field5435.method2057(65280);
                if (var3.field289 == 65535) {
                    var3.field289 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field5619 = class387.field5435.method2093(false);
                var3.field5618 = class387.field5435.method2093(false);
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class387.field5435.method2093(false);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class387.field5435.method2102(-4);
                int var7 = class387.field5435.method2087(arg0 ^ 0xFFFF9A5F);
                var3.method164(var7, var5, var6, false, 1670113199);
            }
            if ((var4 & 0x100) != 0) {
                var3.field346 = class387.field5435.method2081((byte) 121);
                var3.field351 = class387.field5435.method2081((byte) -115);
                var3.field294 = class387.field5435.method2059(8620);
                var3.field352 = class387.field5435.method2097((byte) 112);
                var3.field287 = class387.field5435.method2057(65280) + class393.field5484;
                var3.field304 = class387.field5435.method2093(false) + class393.field5484;
                var3.field293 = class387.field5435.method2098(arg0 ^ 0x65A9);
                var3.field294 += var3.field372[0];
                var3.field352 += var3.field362[0];
                var3.field346 += var3.field372[0];
                var3.field363 = 0;
                var3.field351 += var3.field362[0];
                var3.field368 = 1;
            }
            if ((var4 & 0x1000) != 0) {
                int var8 = class387.field5435.method2064(124);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class387.field5435.method2095(8999);
                int var10 = class387.field5435.method2098(87);
                var3.method164(var10, var8, var9, true, 1670113199);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field5623.method1862(true)) {
                    class247.method1458(74, var3);
                }
                var3.method2343(class398.field5549.method2819(class387.field5435.method2064(115), -93), -124);
                var3.method171(var3.field5623.field4637, arg0 ^ 0x65DD);
                var3.field333 = var3.field5623.field4622 << 3;
                if (var3.field5623.method1862(true)) {
                    class405.method2344(0, 65535, var3.field464, null, var3.field372[0], var3.field362[0], var3, null);
                }
            }
            if ((var4 & 0x10) != 0) {
                int var11 = class387.field5435.method2065(false);
                int var12 = class387.field5435.method2099(255);
                var3.method163(class393.field5484, var11, var12, false);
            }
            if ((var4 & 0x2000) != 0) {
                int var13 = class387.field5435.method2087(-124);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class387.field5435.method2064(108);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class387.field5435.method2055(true);
                    var16[var17] = class387.field5435.method2093(false);
                }
                class108.method694(var14, false, var16, var3, var15);
            }
            if ((var4 & 0x2) != 0) {
                int var19 = class387.field5435.method2064(arg0 ^ 0x65AA);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class387.field5435.method2055(true);
                class138.method903(var19, var20, arg0 - 26080, var3);
            }
            if ((var4 & 0x80) != 0) {
                int var21 = class387.field5435.method2065(false);
                int var22 = class387.field5435.method2087(arg0 ^ 0xFFFF9A5B);
                var3.method163(class393.field5484, var21, var22, false);
                var3.field348 = class393.field5484 + 300;
                var3.field323 = class387.field5435.method2087(-122);
            }
            if ((var4 & 0x400) != 0) {
                int var23 = class387.field5435.method2057(arg0 + 39203);
                var3.field339 = class387.field5435.method2098(114);
                var3.field282 = class387.field5435.method2099(255);
                var3.field331 = var23 & 0x7FFF;
                var3.field269 = (var23 & 0x8000) != 0;
                var3.field296 = class393.field5484 - (-var3.field339 - var3.field331);
            }
            if ((var4 & 0x4) != 0) {
                var3.field327 = class387.field5435.method2106(-1);
                var3.field319 = 100;
            }
        }
        field1575++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method212(boolean arg0);

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "(I)Z")
    public abstract boolean method213(int arg0);
}
