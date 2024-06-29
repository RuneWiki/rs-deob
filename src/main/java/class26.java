import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class26 {

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public int field329 = -1;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
    public static long field319 = 0L;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lhu;")
    public static class76 field324 = new class76(5);

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[C")
    public static char[] field337 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field335 = -1;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[I")
    public static int[] field343 = new int[32];

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Lad;")
    private class268 field338;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
    private String field318;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Ljava/lang/String;")
    private String field331;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    private int[] field321;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[I")
    private int[] field323;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
    private int[] field326;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "[I")
    private int[] field327;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[I")
    private int[] field330;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[I")
    private int[] field333;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
    private int[] field336;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
    private int[] field339;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field332;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field334;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "[[I")
    private int[][] field341;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "[[I")
    private int[][] field342;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[[I")
    private int[][] field344;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I", line = 3)
    public static final int method149(int arg0, byte arg1) {
        field340++;
        int var2 = -96 / ((-arg1 - 6) / 38);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLbt;I)V", line = 16)
    private final void method150(byte arg0, class32 arg1, int arg2) {
        if (arg2 == 1) {
            this.field331 = arg1.method242(76);
        } else if (arg2 == 2) {
            this.field318 = arg1.method242(97);
        } else if (arg2 == 3) {
            int var22 = arg1.method201((byte) -126);
            this.field341 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field341[var23][0] = arg1.method215((byte) 101);
                this.field341[var23][1] = arg1.method222(1024);
                this.field341[var23][2] = arg1.method222(1024);
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method201((byte) -120);
            this.field344 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field344[var5][0] = arg1.method215((byte) 94);
                this.field344[var5][1] = arg1.method222(1024);
                this.field344[var5][2] = arg1.method222(1024);
            }
        } else if (arg2 == 5) {
            arg1.method215((byte) 126);
        } else if (arg2 == 6) {
            arg1.method201((byte) -108);
        } else if (arg2 == 7) {
            arg1.method201((byte) -106);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method201((byte) -127);
            } else if (arg2 == 10) {
                int var20 = arg1.method201((byte) -117);
                this.field321 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field321[var21] = arg1.method222(1024);
                }
            } else if (arg2 == 12) {
                arg1.method222(1024);
            } else if (arg2 == 13) {
                int var6 = arg1.method201((byte) -110);
                this.field339 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field339[var7] = arg1.method215((byte) 116);
                }
            } else if (arg2 == 14) {
                int var18 = arg1.method201((byte) -122);
                this.field342 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field342[var19][0] = arg1.method201((byte) -112);
                    this.field342[var19][1] = arg1.method201((byte) -122);
                }
            } else if (arg2 == 15) {
                arg1.method215((byte) 111);
            } else if (arg2 == 17) {
                this.field329 = arg1.method215((byte) 106);
            } else if (arg2 == 18) {
                int var8 = arg1.method201((byte) -127);
                this.field323 = new int[var8];
                this.field330 = new int[var8];
                this.field336 = new int[var8];
                this.field334 = new String[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field336[var9] = arg1.method222(1024);
                    this.field330[var9] = arg1.method222(1024);
                    this.field323[var9] = arg1.method222(1024);
                    this.field334[var9] = arg1.method195(-8);
                }
            } else if (arg2 == 19) {
                int var10 = arg1.method201((byte) -121);
                this.field333 = new int[var10];
                this.field332 = new String[var10];
                this.field327 = new int[var10];
                this.field326 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field327[var11] = arg1.method222(1024);
                    this.field326[var11] = arg1.method222(1024);
                    this.field333[var11] = arg1.method222(1024);
                    this.field332[var11] = arg1.method195(103);
                }
            } else if (arg2 == 249) {
                int var12 = arg1.method201((byte) -125);
                if (this.field338 == null) {
                    int var13 = class100.method616(var12, true);
                    this.field338 = new class268(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method201((byte) -128) == 1;
                    int var16 = arg1.method219(-127);
                    class445 var17;
                    if (var15) {
                        var17 = new class221(arg1.method195(116));
                    } else {
                        var17 = new class37(arg1.method222(1024));
                    }
                    this.field338.method1525((byte) 19, var17, (long) var16);
                }
            }
        }
        int var24 = 97 % ((arg0 - 29) / 35);
        field320++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIIIIIII)V", line = 248)
    public static final void method151(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field328++;
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class89.field1310 + ((class33.field509 - class89.field1310) * var8 / 100);
        int var10 = arg1 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class364.field4994[var11] * -var10 >> 15;
            var15 = class364.field4992[var11] * var10 >> 15;
        }
        if (!arg0) {
            method149(-33, (byte) 125);
        }
        if (var12 != 0) {
            var13 = class364.field4994[var12] * var15 >> 15;
            var15 = class364.field4992[var12] * var15 >> 15;
        }
        class348.field4796 = arg6;
        class195.field2638 = arg4 - var14;
        class155.field2171 = arg7;
        class412.field5637 = arg5 - var15;
        class197.field2680 = arg2 - var13;
        class176.field2398 = 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 307)
    public final void method152(byte arg0) {
        if (arg0 <= 81) {
            this.method154((byte) -16, (class32) null);
        }
        if (this.field318 == null) {
            this.field318 = this.field331;
        }
        field325++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 321)
    public static void method153(boolean arg0) {
        field337 = null;
        field324 = null;
        field343 = null;
        if (!arg0) {
            field337 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLbt;)V", line = 348)
    public final void method154(byte arg0, class32 arg1) {
        int var3 = 20 % ((27 - arg0) / 49);
        while (true) {
            int var4 = arg1.method201((byte) -116);
            if (var4 == 0) {
                field322++;
                return;
            }
            this.method150((byte) 100, arg1, var4);
        }
    }
}
