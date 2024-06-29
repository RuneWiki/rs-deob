import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Loa;")
    private static class98 field356 = class38.method349(255, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Loa;")
    public static class98 field362 = field356;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Loa;")
    private static class98 field370 = class38.method349(255, "Loaded sprites");

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Loa;")
    public static class98 field359 = field370;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Ln;")
    public static class90 field360 = new class90(500);

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "Loa;")
    public static class98 field373 = class38.method349(255, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Loa;")
    public static class98 field372 = class38.method349(255, "Handel akzeptieren");

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILtb;)[Loc;")
    public static final class100[] method160(int arg0, int arg1, int arg2, class130 arg3) {
        if (arg1 < 11) {
            field346 = -55;
        }
        field343++;
        return class106.method893((byte) -119, arg0, arg3, arg2) ? class77.method629(104) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lqb;")
    public static final class112 method161(byte arg0, int arg1) {
        field366++;
        class112 var2 = (class112) class81.field1836.method730((byte) 35, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class123.field2748.method1058(arg1, -128, 0);
        if (var3 == null) {
            return null;
        }
        class112 var4 = new class112();
        class8 var5 = new class8(var3);
        var5.field182 = var5.field132.length - 12;
        int var6 = 0;
        int var7 = var5.method70(false);
        var4.field2508 = var5.method68(-2);
        var4.field2510 = var5.method68(-2);
        var4.field2497 = var5.method68(-2);
        var4.field2499 = var5.method68(-2);
        var4.field2502 = new int[var7];
        var5.field182 = 0;
        var4.field2496 = new int[var7];
        var4.field2498 = new class98[var7];
        if (arg0 < 51) {
            method160(-112, 82, -71, null);
        }
        while (var5.field132.length - 12 > var5.field182) {
            int var8 = var5.method68(-2);
            if (var8 == 3) {
                var4.field2498[var6] = var5.method93(56);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field2496[var6] = var5.method62((byte) 81);
            } else {
                var4.field2496[var6] = var5.method70(false);
            }
            var4.field2502[var6++] = var8;
        }
        class81.field1836.method732(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ltb;IIB)[Lid;")
    public static final class60[] method162(class130 arg0, int arg1, int arg2, byte arg3) {
        field338++;
        if (arg3 != 70) {
            method165(-94);
        }
        return class106.method893((byte) -104, arg2, arg0, arg1) ? class35.method338(118) : null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static final void method163(boolean arg0) {
        field345++;
        if (class141.field3447 != 0 && class141.field3447 != 3) {
            return;
        }
        if (class42.field976 == 1) {
            int var1 = class150.field3717 - 550 - 25;
            int var2 = class86.field1980 - 5 - 4;
            if (var1 >= 0 && var2 >= 0 && var1 < 146 && var2 < 151) {
                var2 -= 75;
                var1 -= 73;
                int var3 = class25.field611 + class21.field462 & 0x7FF;
                int var4 = class66.field1419[var3];
                int var5 = (class76.field1662 + 256) * var4 >> 8;
                int var6 = class66.field1417[var3];
                int var7 = (class76.field1662 + 256) * var6 >> 8;
                int var8 = var1 * var7 + var2 * var5 >> 11;
                int var9 = var2 * var7 - var1 * var5 >> 11;
                int var10 = class73.field1536.field3657 + var8 >> 7;
                int var11 = class73.field1536.field3667 - var9 >> 7;
                boolean var12 = class30.method300(1, 0, class73.field1536.field3603[0], 0, 0, true, var11, -118, var10, 0, class73.field1536.field3648[0], 0);
                if (var12) {
                    class132.field3116.method95(var1, true);
                    class132.field3116.method95(var2, true);
                    class132.field3116.method81((byte) -119, class25.field611);
                    class132.field3116.method95(57, true);
                    class132.field3116.method95(class21.field462, true);
                    class132.field3116.method95(class76.field1662, true);
                    class132.field3116.method95(89, true);
                    class132.field3116.method81((byte) -125, class73.field1536.field3657);
                    class132.field3116.method81((byte) 86, class73.field1536.field3667);
                    class132.field3116.method95(class37.field924, true);
                    class132.field3116.method95(63, true);
                }
            }
        }
        if (arg0) {
            method163(false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method164(int arg0) {
        field368++;
        if (arg0 != -22) {
            method162(null, -9, 43, (byte) -12);
        }
        if (class141.field3436 != null) {
            class16 var1 = class141.field3436;
            synchronized (class141.field3436) {
                class141.field3436 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method165(int arg0) {
        class127.field2844 = 0;
        class10.field211 = 0;
        class120.field2702 = -1;
        class145.field3507 = -1;
        class44.field1009 = 0;
        class80.field1780 = 0;
        class132.field3116.field182 = 0;
        class88.field2028 = 0;
        class56.field1248 = -1;
        class145.field3529 = false;
        class141.field3447 = 0;
        class36.field890.field182 = 0;
        field354++;
        class51.field1120 = -1;
        for (int var1 = 0; var1 < class33.field832.length; var1++) {
            if (class33.field832[var1] != null) {
                class33.field832[var1].field3668 = -1;
            }
        }
        if (arg0 != 256) {
            return;
        }
        for (int var2 = 0; var2 < class38.field935.length; var2++) {
            if (class38.field935[var2] != null) {
                class38.field935[var2].field3668 = -1;
            }
        }
        class140.method1125((byte) -120);
        class96.method768((byte) 98, 30);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILtb;I)Z")
    public static final boolean method166(int arg0, class130 arg1, int arg2) {
        field367++;
        byte[] var3 = arg1.method1066(118, arg0);
        if (var3 == null) {
            return false;
        }
        if (arg2 != 100) {
            field362 = null;
        }
        class4.method21((byte) 123, var3);
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method167(byte arg0) {
        field360 = null;
        field373 = null;
        field356 = null;
        if (arg0 != -78) {
            method163(true);
        }
        field359 = null;
        field372 = null;
        field370 = null;
        field362 = null;
    }
}
