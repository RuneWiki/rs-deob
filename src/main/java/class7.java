import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class7 extends class35 {

    @OriginalMember(owner = "client!gk", name = "Nb", descriptor = "[I")
    public static int[] field76 = new int[1000];

    @OriginalMember(owner = "client!gk", name = "Bb", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!gk", name = "Cb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!gk", name = "Eb", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!gk", name = "Fb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!gk", name = "Gb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!gk", name = "Ib", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!gk", name = "Jb", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!gk", name = "Kb", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!gk", name = "Lb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!gk", name = "Mb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!gk", name = "Ob", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!gk", name = "Pb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!gk", name = "Db", descriptor = "Lvd;")
    public static class134 field66;

    @OriginalMember(owner = "client!gk", name = "Hb", descriptor = "Lma;")
    private class287 field70;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[B)V", line = 7)
    public static final void method58(byte arg0, byte[] arg1) {
        field64++;
        if (arg0 <= 10) {
            method58((byte) -27, (byte[]) null);
        }
        class35 var2 = new class35(arg1);
        var2.field455 = arg1.length - 2;
        class173.field2566 = var2.method300(-1394191632);
        class271.field4096 = new int[class173.field2566];
        class16.field190 = new boolean[class173.field2566];
        class274.field4162 = new byte[class173.field2566][];
        class111.field1756 = new int[class173.field2566];
        class101.field1541 = new int[class173.field2566];
        class138.field2153 = new byte[class173.field2566][];
        class323.field5027 = new int[class173.field2566];
        var2.field455 = arg1.length - class173.field2566 * 8 - 7;
        class150.field2273 = var2.method300(-1394191632);
        class98.field1453 = var2.method300(-1394191632);
        int var3 = (var2.method273(65280) & 0xFF) + 1;
        for (int var4 = 0; var4 < class173.field2566; var4++) {
            class271.field4096[var4] = var2.method300(-1394191632);
        }
        for (int var5 = 0; var5 < class173.field2566; var5++) {
            class101.field1541[var5] = var2.method300(-1394191632);
        }
        for (int var6 = 0; var6 < class173.field2566; var6++) {
            class111.field1756[var6] = var2.method300(-1394191632);
        }
        for (int var7 = 0; var7 < class173.field2566; var7++) {
            class323.field5027[var7] = var2.method300(-1394191632);
        }
        var2.field455 = arg1.length - (var3 - 1) * 3 - (class173.field2566 * 8) - 7;
        class57.field843 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class57.field843[var8] = var2.method269(false);
            if (class57.field843[var8] == 0) {
                class57.field843[var8] = 1;
            }
        }
        var2.field455 = 0;
        for (int var9 = 0; var9 < class173.field2566; var9++) {
            int var10 = class323.field5027[var9];
            int var11 = class111.field1756[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class274.field4162[var9] = var13;
            boolean var15 = false;
            class138.field2153[var9] = var14;
            int var16 = var2.method273(65280);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method242((byte) -93);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method242((byte) -93);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label102: while (true) {
                    if (var11 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var11 <= var22) {
                                break label102;
                            }
                            for (int var23 = 0; var23 < var10; var23++) {
                                byte var24 = var14[var11 * var23 + var22] = var2.method242((byte) -93);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var13[var11 * var21 + var20] = var2.method242((byte) -93);
                    }
                    var20++;
                }
            }
            class16.field190[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(IB)V", line = 176)
    public final void method59(int arg0, byte arg1) {
        this.field437[this.field455++] = (byte) (arg0 + this.field70.method2026((byte) 124));
        if (arg1 == 73) {
            field68++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I[I)V", line = 191)
    public final void method60(int arg0, int[] arg1) {
        this.field70 = new class287(arg1);
        int var3 = -48 / ((-arg0 - 10) / 52);
        field77++;
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "(II)V", line = 204)
    public static final void method61(int arg0, int arg1) {
        class35.field503[1] = (float) (class142.method1078(arg0, 65329) >> 8) / 255.0F;
        class35.field503[0] = (float) class142.method1078(arg0 >> 16, 255) / 255.0F;
        if (arg1 > -12) {
            method68(27);
        }
        field67++;
        class35.field503[2] = (float) class142.method1078(arg0, 255) / 255.0F;
        class14.method109(true, 3);
        class14.method109(true, 4);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII[B)V", line = 221)
    public final void method62(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = -64 % ((-arg0 - 4) / 35);
        field71++;
        for (int var6 = 0; var6 < arg1; var6++) {
            arg3[var6 + arg2] = (byte) (this.field437[this.field455++] - this.field70.method2026((byte) 122));
        }
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "(II)I", line = 237)
    public final int method63(int arg0, int arg1) {
        if (arg0 < 111) {
            method68(93);
        }
        int var3 = this.field73 >> 3;
        field74++;
        int var4 = 0;
        int var5 = 8 - (this.field73 & 0x7);
        this.field73 += arg1;
        while (var5 < arg1) {
            var4 += (this.field437[var3++] & class281.field4334[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 == var5) {
            var6 = (class281.field4334[var5] & this.field437[var3]) + var4;
        } else {
            var6 = (this.field437[var3] >> var5 - arg1 & class281.field4334[arg1]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "(I)V", line = 268)
    public final void method64(int arg0) {
        this.field455 = (this.field73 + 7) / 8;
        field65++;
        if (arg0 > -126) {
            this.method64(-25);
        }
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(IZ)I", line = 280)
    public final int method65(int arg0, boolean arg1) {
        if (arg1) {
            field72++;
            return arg0 * 8 - this.field73;
        } else {
            return 107;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIFIIZIB)[I", line = 297)
    public static final int[] method66(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7) {
        int[] var8 = new int[arg1];
        field69++;
        class295 var9 = new class295();
        var9.field4630 = arg5;
        var9.field4632 = arg4;
        var9.field4643 = arg3;
        var9.field4644 = arg0;
        var9.field4645 = arg6;
        var9.field4636 = (int) (arg2 * 4096.0F);
        var9.method465(58);
        class153.method1126(1, arg1, -118);
        if (arg7 <= 33) {
            method68(-15);
        }
        var9.method2081(var8, 0, -30427);
        return var8;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)I", line = 321)
    public final int method67(boolean arg0) {
        field75++;
        return arg0 ? this.field437[this.field455++] - this.field70.method2026((byte) 121) & 0xFF : -125;
    }

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "(I)V", line = 335)
    public static void method68(int arg0) {
        field76 = null;
        field66 = null;
        if (arg0 >= -108) {
            method68(42);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V", line = 348)
    public class7(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "(B)V", line = 352)
    public final void method69(byte arg0) {
        this.field73 = this.field455 * 8;
        field78++;
        if (arg0 <= 13) {
            field66 = (class134) null;
        }
    }
}
