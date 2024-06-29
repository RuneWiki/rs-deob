import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class22 {

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lcl;")
    private class98 field375 = new class98();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lac;")
    private class198 field387 = new class198();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Ldf;")
    private class146 field378;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[Lwk;")
    public static class47[] field371 = new class47[2048];

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field376 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lha;")
    public static class22 field366 = new class22(64);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lmb;")
    public static class96 field382 = class243.method1708("<col=00ffff>", (byte) 97);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Z")
    public static boolean field386 = true;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lmb;")
    private static class96 field384 = class243.method1708("Hidden", (byte) 112);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lmb;")
    public static class96 field383 = field384;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lff;")
    public static class3 field367;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Z")
    public static boolean field380;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Z")
    public static boolean field385;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[Lmj;")
    public static class246[] field388;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JLcl;B)V")
    public final void method155(long arg0, class98 arg1, byte arg2) {
        field374++;
        if (this.field377 == 0) {
            class98 var5 = this.field387.method1385((byte) -109);
            var5.method1743((byte) 124);
            var5.method740(-22949);
            if (this.field375 == var5) {
                class98 var6 = this.field387.method1385((byte) 92);
                var6.method1743((byte) 9);
                var6.method740(-22949);
            }
        } else {
            this.field377--;
        }
        this.field378.method1085(-1, arg1, arg0);
        this.field387.method1390(arg1, -123);
        if (arg2 <= 27) {
            this.method159((byte) 90);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method156(int arg0) {
        field369++;
        class92.method653((byte) 4, 5);
        class214.method1485((byte) 94, 5);
        class51.method389(false, 5);
        client.method819(14917, 5);
        class234.method1587((byte) 101, 5);
        class189.method1333(arg0 ^ 0x7, arg0);
        class214.method1486(5, false);
        class144.method1067(2010, 5);
        class61.method437(5, arg0 - 3069);
        class154.method1130(arg0 + 515, 5);
        class89.method631(118, 5);
        class60.method436((byte) -126, 50);
        class183.method1286(14043, 5);
        class147.method1090(true, 5);
        class265.field4633.method82((byte) -109, 5);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lh;")
    public final class249 method157(int arg0) {
        if (arg0 != 0) {
            method162((byte) 1);
        }
        field372++;
        return this.field378.method1074(false);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JB)Lcl;")
    public final class98 method158(long arg0, byte arg1) {
        if (arg1 > -33) {
            return null;
        }
        class98 var4 = (class98) this.field378.method1081(0, arg0);
        if (var4 != null) {
            this.field387.method1390(var4, -108);
        }
        field379++;
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lh;")
    public final class249 method159(byte arg0) {
        if (arg0 != 102) {
            method161(29);
        }
        field373++;
        return this.field378.method1087((byte) -103);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public final void method160(byte arg0) {
        this.field387.method1386(119);
        field368++;
        this.field378.method1088(-63);
        if (arg0 > 51) {
            this.field375 = new class98();
            this.field377 = this.field381;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public static final void method161(int arg0) {
        field370++;
        int var1 = class241.field4182.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class241.field4182[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class14.field220; var4++) {
                    if (class157.field2741[var2] == class15.field231[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class15.field231[class14.field220] = class157.field2741[var2];
                    var3 = class14.field220++;
                }
                class239 var5 = new class239(class241.field4182[var2]);
                int var6 = 0;
                while (var5.field4124 < class241.field4182[var2].length && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1663((byte) 87);
                    int var9 = (var8 & 0x1FAD) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = (class157.field2741[var2] >> 8) * 64 + var9 - class196.field3383;
                    int var12 = var8 & 0x3F;
                    int var13 = (class157.field2741[var2] & 0xFF) * 64 + var12 - class225.field3832;
                    class229 var14 = class260.method1799(var5.method1663((byte) -61), (byte) -18);
                    if (class86.field1450[var7] == null && (var14.field3876 & 0x1) > 0 && class277.field4822 == var10 && var11 >= 0 && var11 + var14.field3914 < 104 && var13 >= 0 && (var14.field3914 + var13) < 104) {
                        class86.field1450[var7] = new class197();
                        class197 var15 = class86.field1450[var7];
                        class222.field3797[class132.field2375++] = var7;
                        var15.field4510 = class236.field4053;
                        var15.field3436 = var14;
                        var15.method1791(var15.field3436.field3914, 128);
                        var15.field4505 = var15.field3436.field3895;
                        var15.field4508 = var15.field3436.field3929;
                        var15.field4569 = var15.field3436.field3890;
                        var15.field4540 = var15.field3436.field3937;
                        var15.field4515 = var15.field3436.field3889;
                        var15.field4539 = var15.field3436.field3919;
                        var15.field4517 = var15.field3436.field3880;
                        if (var15.field4539 == 0) {
                            var15.field4534 = 0;
                        }
                        var15.field4521 = var15.field3436.field3898;
                        var15.method1802(-10795, var13, true, var11, var15.method366((byte) 95));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
    public static void method162(byte arg0) {
        field383 = null;
        if (arg0 != -100) {
            return;
        }
        field382 = null;
        field384 = null;
        field366 = null;
        field371 = null;
        field388 = null;
        field367 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
    public class22(int arg0) {
        this.field377 = arg0;
        int var2 = 1;
        this.field381 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field378 = new class146(var2);
    }
}
