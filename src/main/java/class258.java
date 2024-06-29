import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class258 extends class36 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lig;")
    public static class206 field3676 = new class206(11, 7);

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Ljava/lang/String;")
    public String field3674;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[C")
    public char[] field3672;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[C")
    public char[] field3679;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    public int[] field3668;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[I")
    public int[] field3675;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILrt;)V")
    private final void method1717(int arg0, int arg1, class194 arg2) {
        field3670++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field3674 = arg2.method1218(false);
        } else if (arg0 == 2) {
            int var7 = arg2.method1177(arg1 ^ 0xFF);
            this.field3668 = new int[var7];
            this.field3679 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3668[var8] = arg2.method1220(116);
                byte var9 = arg2.method1213((byte) 49);
                this.field3679[var8] = var9 == 0 ? 0 : class247.method1635(16, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1177(255);
            this.field3672 = new char[var4];
            this.field3675 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3675[var5] = arg2.method1220(-56);
                byte var6 = arg2.method1213((byte) 121);
                this.field3672[var5] = var6 == 0 ? 0 : class247.method1635(16, var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1718(int arg0) {
        field3676 = null;
        if (arg0 <= 74) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lrt;I)V")
    public final void method1719(class194 arg0, int arg1) {
        field3673++;
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.field3672 = null;
                    return;
                }
            }
            this.method1717(var3, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
    public final void method1720(int arg0) {
        if (this.field3675 != null) {
            for (int var2 = 0; var2 < this.field3675.length; var2++) {
                this.field3675[var2] = class283.method1834(this.field3675[var2], 32768);
            }
        }
        field3682++;
        if (arg0 <= 31) {
            this.field3674 = null;
        }
        if (this.field3668 != null) {
            for (int var3 = 0; var3 < this.field3668.length; var3++) {
                this.field3668[var3] = class283.method1834(this.field3668[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IC)I")
    public final int method1721(int arg0, char arg1) {
        field3669++;
        if (this.field3668 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3668.length; var3++) {
            if (this.field3679[var3] == arg1) {
                return this.field3668[var3];
            }
        }
        if (arg0 != -1) {
            field3681 = 54;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1722(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3677++;
        if (!arg4 && class568.field8159 == arg1 && class400.field6066 == arg0 && class394.field6023 == class226.field3179 || class595.field8694.method2426(class81.field908, -5)) {
            return;
        }
        class568.field8159 = arg1;
        class394.field6023 = class226.field3179;
        class400.field6066 = arg0;
        if (class595.field8694.method2426(class81.field908, -5)) {
            class394.field6023 = 0;
        }
        class353.method2235(arg2, 1);
        class120.method745(true, -106, class445.field6665, class151.field1857.method2902(class35.field396, -20139));
        if (arg3 <= 42) {
            field3681 = 119;
        }
        int var5 = class287.field3980;
        class287.field3980 = (class568.field8159 - (class90.field1032 >> 4)) * 8;
        int var6 = class250.field3549;
        class250.field3549 = (class400.field6066 - (class30.field349 >> 4)) * 8;
        class360.field5103 = class182.method1053(class568.field8159 * 8, class400.field6066 * 8);
        class561.field8015 = null;
        int var7 = class287.field3980 - var5;
        int var8 = class250.field3549 - var6;
        if (arg2 == 10) {
            for (int var17 = 0; var17 < class458.field6840; var17++) {
                class411 var30 = class599.field8757[var17];
                if (var30 != null) {
                    class78 var31 = var30.field6254;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field2515[var32] -= var7;
                        var31.field2524[var32] -= var8;
                    }
                    var31.field1768 -= var8 * 512;
                    var31.field1764 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class387.field5958 = 0;
            int var10 = class90.field1032 * 512 - 512;
            int var11 = class30.field349 * 512 - 512;
            for (int var12 = 0; var12 < class458.field6840; var12++) {
                class411 var13 = class599.field8757[var12];
                if (var13 != null) {
                    class78 var14 = var13.field6254;
                    var14.field1764 -= var7 * 512;
                    var14.field1768 -= var8 * 512;
                    if (var14.field1764 >= 0 && var14.field1764 <= var10 && var14.field1768 >= 0 && var11 >= var14.field1768) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field2515[var16] -= var7;
                            var14.field2524[var16] -= var8;
                            if (var14.field2515[var16] < 0 || class90.field1032 <= var14.field2515[var16] || var14.field2524[var16] < 0 || var14.field2524[var16] >= class30.field349) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class362.field5141[class387.field5958++] = var14.field2495;
                        } else {
                            var14.method509(null, -4);
                            var9 = true;
                            var13.method2108(true);
                        }
                    } else {
                        var14.method509(null, -4);
                        var9 = true;
                        var13.method2108(true);
                    }
                }
            }
            if (var9) {
                class458.field6840 = class42.field456.method521((byte) -77);
                class42.field456.method519(7710, class599.field8757);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class655 var28 = class142.field1749[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2515[var29] -= var7;
                    var28.field2524[var29] -= var8;
                }
                var28.field1764 -= var7 * 512;
                var28.field1768 -= var8 * 512;
            }
        }
        class360[] var19 = class13.field117;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class360 var27 = var19[var20];
            if (var27 != null) {
                var27.field5096 -= var8 * 512;
                var27.field5101 -= var7 * 512;
            }
        }
        for (class55 var21 = (class55) class117.field1451.method719(false); var21 != null; var21 = (class55) class117.field1451.method716(14)) {
            var21.field625 -= var8;
            var21.field623 -= var7;
            if (class251.field3570 != 4 && (var21.field623 < 0 || var21.field625 < 0 || var21.field623 >= class90.field1032 || class30.field349 <= var21.field625)) {
                var21.method2108(true);
            }
        }
        if (class251.field3570 != 4) {
            for (class446 var22 = (class446) class294.field4247.method523(28); var22 != null; var22 = (class446) class294.field4247.method530(12714)) {
                int var23 = (int) (var22.field4676 & 0x3FFFL);
                int var24 = var23 - class287.field3980;
                int var25 = (int) (var22.field4676 >> 14 & 0x3FFFL);
                int var26 = var25 - class250.field3549;
                if (var24 < 0 || var26 < 0 || class90.field1032 <= var24 || class30.field349 <= var26) {
                    var22.method2108(true);
                }
            }
        }
        if (class82.field925 != 0) {
            class50.field531 -= var8;
            class82.field925 -= var7;
        }
        class615.method3550(50);
        if (arg2 != 10) {
            class207.field2781 -= var8 * 512;
            class337.field4821 -= var7 * 512;
            class67.field743 -= var7;
            class100.field1195 -= var8;
            class112.field1382 -= var7;
            class438.field6516 -= var8;
            if (Math.abs(var7) > class90.field1032 || Math.abs(var8) > class30.field349) {
                class329.method2148((byte) 120);
            }
        } else if (class236.field3384 == 4) {
            class325.field4695 -= var7 * 512;
            class620.field8987 -= var8 * 512;
            class326.field4703 -= var7 * 512;
            class151.field1860 -= var8 * 512;
        } else {
            class236.field3384 = 1;
        }
        class386.method2478((byte) 55);
        class635.method3622((byte) -49);
        class518.field7540.method718(-126);
        class276.field3851.method718(-117);
        class101.field1200.method3295((byte) -108);
        class121.method751(0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)I")
    public final int method1723(char arg0, int arg1) {
        field3671++;
        if (this.field3675 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field3675.length; var3++) {
            if (this.field3672[var3] == arg0) {
                return this.field3675[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZIZII)I")
    public static final int method1724(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3678++;
        class594 var5 = class581.method3372(arg2, arg3, -106);
        if (var5 == null) {
            return 0;
        } else if (arg1 >= -92) {
            return 29;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field8680.length; var7++) {
                if (var5.field8680[var7] >= 0 && class622.field8999.field26 > var5.field8680[var7]) {
                    class190 var8 = class622.field8999.method25(var5.field8680[var7], -84);
                    int var9 = var8.method1143(class565.field8053.method3495(3, arg4).field6089, 668, arg4);
                    if (arg0) {
                        var6 += var5.field8676[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    static {
        new class474("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class474(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
    }
}
