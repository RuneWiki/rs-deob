import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class46 {

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public int field3374 = -1;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public int field3387 = -1;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "Z")
    public boolean field3392 = true;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public int field3385 = 0;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "I")
    public static int field3370 = 0;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3371 = 0;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "Lsc;")
    public static class128 field3375 = class129.method1017(false, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "Lsc;")
    public static class128 field3382 = class129.method1017(false, "<img=0>");

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field3386 = 0;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "[B")
    public static byte[] field3390 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "Lsc;")
    public static class128 field3378 = class129.method1017(false, "b12_full");

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "Lsc;")
    public static class128 field3391 = class129.method1017(false, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "Lae;")
    public static class6 field3377;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    private final void method1175(int arg0, int arg1) {
        field3373++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        int var11 = 121 / ((arg0 - 73) / 50);
        double var12 = var5;
        double var14 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        if (var5 < var3) {
            var12 = var3;
        }
        if (var12 < var7) {
            var12 = var7;
        }
        double var16 = (var9 + var12) / 2.0D;
        double var18 = 0.0D;
        if (var9 != var12) {
            if (var5 == var12) {
                var14 = (var3 - var7) / (var12 - var9);
            } else if (var3 == var12) {
                var14 = (var7 - var5) / (-var9 + var12) + 2.0D;
            } else if (var7 == var12) {
                var14 = (var5 - var3) / (var12 - var9) + 4.0D;
            }
            if (var16 < 0.5D) {
                var18 = (var12 - var9) / (var9 + var12);
            }
            if (var16 >= 0.5D) {
                var18 = (var12 - var9) / (2.0D - var12 - var9);
            }
        }
        this.field3388 = (int) (var16 * 256.0D);
        this.field3379 = (int) (var18 * 256.0D);
        double var20 = var14 / 6.0D;
        if (this.field3379 < 0) {
            this.field3379 = 0;
        } else if (this.field3379 > 255) {
            this.field3379 = 255;
        }
        this.field3381 = (int) (var20 * 256.0D);
        if (this.field3388 < 0) {
            this.field3388 = 0;
        } else if (this.field3388 > 255) {
            this.field3388 = 255;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBLmc;)V")
    public final void method1176(int arg0, byte arg1, class86 arg2) {
        field3372++;
        while (true) {
            int var4 = arg2.method646(-15447);
            if (var4 == 0) {
                if (arg1 <= 86) {
                    method1180((byte) -2);
                    return;
                } else {
                    return;
                }
            }
            this.method1178((byte) -2, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([BB)V")
    public static final void method1177(byte[] arg0, byte arg1) {
        class86 var2 = new class86(arg0);
        field3380++;
        var2.field1924 = arg0.length - 2;
        class43.field809 = var2.method632((byte) -80);
        class19.field361 = new int[class43.field809];
        class122.field2777 = new int[class43.field809];
        class36.field698 = new int[class43.field809];
        class150.field3443 = new int[class43.field809];
        class37.field721 = new byte[class43.field809][];
        var2.field1924 = arg0.length - class43.field809 * 8 - 7;
        class121.field2747 = var2.method632((byte) -80);
        class62.field1336 = var2.method632((byte) -80);
        int var3 = (var2.method646(-15447) & 0xFF) + 1;
        for (int var4 = 0; var4 < class43.field809; var4++) {
            class122.field2777[var4] = var2.method632((byte) -80);
        }
        for (int var5 = 0; var5 < class43.field809; var5++) {
            class36.field698[var5] = var2.method632((byte) -80);
        }
        if (arg1 != 26) {
            method1177(null, (byte) -121);
        }
        for (int var6 = 0; var6 < class43.field809; var6++) {
            class150.field3443[var6] = var2.method632((byte) -80);
        }
        for (int var7 = 0; var7 < class43.field809; var7++) {
            class19.field361[var7] = var2.method632((byte) -80);
        }
        var2.field1924 = arg0.length + 3 - var3 * 3 - class43.field809 * 8 - 7;
        class21.field412 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class21.field412[var8] = var2.method671(57);
            if (class21.field412[var8] == 0) {
                class21.field412[var8] = 1;
            }
        }
        var2.field1924 = 0;
        for (int var9 = 0; var9 < class43.field809; var9++) {
            int var10 = class150.field3443[var9];
            int var11 = class19.field361[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class37.field721[var9] = var13;
            int var14 = var2.method646(-15447);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method667(-1);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method667(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLmc;II)V")
    private final void method1178(byte arg0, class86 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3385 = arg1.method671(73);
        } else if (arg3 == 2) {
            this.field3374 = arg1.method646(-15447);
        } else if (arg3 == 5) {
            this.field3392 = false;
        } else if (arg3 == 7) {
            this.field3387 = arg1.method671(-19);
        }
        field3394++;
        if (arg0 != -2) {
            this.method1176(-81, (byte) 113, null);
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
    public static final int method1179(int arg0) {
        int var1 = -72 / ((-arg0 - 23) / 59);
        field3369++;
        return class68.field1524++;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        if (arg0 <= 82) {
            return;
        }
        field3382 = null;
        field3375 = null;
        field3390 = null;
        field3378 = null;
        field3377 = null;
        field3391 = null;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public final void method1181(byte arg0) {
        if (this.field3387 != -1) {
            this.method1175(125, this.field3387);
            this.field3395 = this.field3381;
            this.field3376 = this.field3388;
            this.field3393 = this.field3379;
        }
        if (arg0 < 2) {
            this.field3376 = 13;
        }
        field3383++;
        this.method1175(124, this.field3385);
    }
}
