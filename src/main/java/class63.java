import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lsa;")
    public class123 field1336 = new class123();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Loa;")
    public static class98 field1338 = class38.method349(255, "invback");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1344 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "[Lid;")
    public static class60[] field1351 = new class60[1000];

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Loa;")
    private static class98 field1345 = class38.method349(255, "Trade)4compete");

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Loa;")
    public static class98 field1359 = class38.method349(255, "null");

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Loa;")
    public static class98 field1356 = field1345;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lsa;")
    private class123 field1355;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILsa;)V")
    public final void method508(int arg0, class123 arg1) {
        if (arg1.field2736 != null) {
            arg1.method975(-23);
        }
        arg1.field2738 = this.field1336;
        if (arg0 < 15) {
            field1344 = 58;
        }
        arg1.field2736 = this.field1336.field2736;
        arg1.field2736.field2738 = arg1;
        field1360++;
        arg1.field2738.field2736 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLsa;Lsa;)V")
    public final void method509(boolean arg0, class123 arg1, class123 arg2) {
        if (arg1.field2736 != null) {
            arg1.method975(118);
        }
        field1348++;
        arg1.field2736 = arg2.field2736;
        if (arg0) {
            method518(87, -23, -128);
        }
        arg1.field2738 = arg2;
        arg1.field2736.field2738 = arg1;
        arg1.field2738.field2736 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILfa;)V")
    public static final void method510(int arg0, class37 arg1) {
        field1347++;
        int var2 = arg0;
        if (arg1.field926 == 0) {
            var2 = class138.field3373.method244(arg1.field902, arg1.field903, arg1.field919);
        }
        int var3 = -1;
        if (arg1.field926 == 1) {
            var2 = class138.field3373.method219(arg1.field902, arg1.field903, arg1.field919);
        }
        if (arg1.field926 == 2) {
            var2 = class138.field3373.method254(arg1.field902, arg1.field903, arg1.field919);
        }
        if (arg1.field926 == 3) {
            var2 = class138.field3373.method227(arg1.field902, arg1.field903, arg1.field919);
        }
        int var4 = 0;
        int var5 = 0;
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class138.field3373.method237(arg1.field902, arg1.field903, arg1.field919, var2);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg1.field928 = var3;
        arg1.field911 = var4;
        arg1.field925 = var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method511(int arg0) {
        if (arg0 != 2047) {
            field1344 = -121;
        }
        field1359 = null;
        field1356 = null;
        field1338 = null;
        field1345 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Lsa;")
    public final class123 method512(int arg0) {
        field1340++;
        class123 var2 = this.field1336.field2738;
        int var3 = 114 % ((-arg0 - 9) / 61);
        if (this.field1336 == var2) {
            this.field1355 = null;
            return null;
        } else {
            this.field1355 = var2.field2738;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Lsa;")
    public final class123 method513(int arg0) {
        field1343++;
        class123 var2 = this.field1355;
        if (this.field1336 == var2) {
            this.field1355 = null;
            return null;
        } else if (arg0 >= -61) {
            return null;
        } else {
            this.field1355 = var2.field2738;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lsa;I)V")
    public final void method514(class123 arg0, int arg1) {
        field1350++;
        if (arg0.field2736 != null) {
            arg0.method975(arg1 + 62);
        }
        if (arg1 != 0) {
            this.method522((byte) 94);
        }
        arg0.field2736 = this.field1336;
        arg0.field2738 = this.field1336.field2738;
        arg0.field2736.field2738 = arg0;
        arg0.field2738.field2736 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lsa;")
    public final class123 method515(byte arg0) {
        field1341++;
        class123 var2 = this.field1336.field2736;
        if (arg0 != 125) {
            field1346 = -51;
        }
        if (this.field1336 == var2) {
            return null;
        } else {
            var2.method975(-23);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Lsa;")
    public final class123 method516(boolean arg0) {
        if (arg0) {
            return null;
        }
        class123 var2 = this.field1355;
        field1337++;
        if (this.field1336 == var2) {
            this.field1355 = null;
            return null;
        } else {
            this.field1355 = var2.field2736;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
    public static final void method517(boolean arg0) {
        if (!arg0) {
            method517(false);
        }
        field1354++;
        for (int var1 = -1; var1 < class131.field3082; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class65.field1394[var1];
            }
            class55 var6 = class33.field832[var5];
            if (var6 != null && var6.field3613 > 0) {
                var6.field3613--;
                if (var6.field3613 == 0) {
                    var6.field3606 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class130.field3024; var2++) {
            int var3 = class90.field2073[var2];
            class150 var4 = class38.field935[var3];
            if (var4 != null && var4.field3613 > 0) {
                var4.field3613--;
                if (var4.field3613 == 0) {
                    var4.field3606 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Z")
    public static final boolean method518(int arg0, int arg1, int arg2) {
        field1339++;
        int var3 = 8 / ((50 - arg0) / 42);
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)V")
    public final void method519(boolean arg0) {
        field1358++;
        if (!arg0) {
            this.method516(false);
        }
        while (true) {
            class123 var2 = this.field1336.field2738;
            if (this.field1336 == var2) {
                return;
            }
            var2.method975(-119);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lsa;")
    public final class123 method520(byte arg0) {
        field1353++;
        class123 var2 = this.field1336.field2736;
        if (arg0 != -11) {
            field1345 = null;
        }
        if (this.field1336 == var2) {
            this.field1355 = null;
            return null;
        } else {
            this.field1355 = var2.field2736;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class63() {
        this.field1336.field2738 = this.field1336;
        this.field1336.field2736 = this.field1336;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
    public static final int method521(int arg0, int arg1) {
        field1357++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != 9860) {
            field1359 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Lsa;")
    public final class123 method522(byte arg0) {
        if (arg0 != -93) {
            field1345 = null;
        }
        field1342++;
        class123 var2 = this.field1336.field2738;
        if (this.field1336 == var2) {
            return null;
        } else {
            var2.method975(-113);
            return var2;
        }
    }
}
