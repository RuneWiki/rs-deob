import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class203 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Z")
    public boolean field3458 = false;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    private int field3461 = 128;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    private int field3463 = 0;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    private int field3476 = 128;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public int field3464 = -1;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    private int field3478 = 0;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    private int field3482 = 0;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "[Lsb;")
    public static class98[] field3480 = new class98[100];

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    private int field3472;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Ltg;")
    public static class75 field3474;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "[I")
    public static int[] field3479;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[Lnj;")
    public static class82[] field3462;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[S")
    private short[] field3459;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[S")
    private short[] field3466;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[S")
    private short[] field3469;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[S")
    private short[] field3483;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1372(byte arg0) {
        field3480 = null;
        field3462 = null;
        field3474 = null;
        field3479 = null;
        if (arg0 != 22) {
            field3480 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method1373(int arg0) {
        class245.field4263.method1272(57);
        if (arg0 != 1) {
            method1372((byte) 47);
        }
        field3467++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Llj;I)V")
    public final void method1374(class216 arg0, int arg1) {
        int var3 = -117 / ((57 - arg1) / 39);
        field3470++;
        while (true) {
            int var4 = arg0.method1446(5350);
            if (var4 == 0) {
                return;
            }
            this.method1375(-5, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILlj;)V")
    private final void method1375(int arg0, int arg1, class216 arg2) {
        if (arg1 == 1) {
            this.field3472 = arg2.method1487(12);
        } else if (arg1 == 2) {
            this.field3464 = arg2.method1487(42);
        } else if (arg1 == 4) {
            this.field3461 = arg2.method1487(arg0 ^ 0xFFFFFF92);
        } else if (arg1 == 5) {
            this.field3476 = arg2.method1487(90);
        } else if (arg1 == 6) {
            this.field3478 = arg2.method1487(83);
        } else if (arg1 == 7) {
            this.field3482 = arg2.method1446(arg0 ^ 0xFFFFEB1D);
        } else if (arg1 == 8) {
            this.field3463 = arg2.method1446(5350);
        } else if (arg1 == 9) {
            this.field3458 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method1446(5350);
            this.field3469 = new short[var6];
            this.field3483 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3469[var7] = (short) arg2.method1487(arg0 + 94);
                this.field3483[var7] = (short) arg2.method1487(97);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method1446(arg0 + 5355);
            this.field3459 = new short[var4];
            this.field3466 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3466[var5] = (short) arg2.method1487(20);
                this.field3459[var5] = (short) arg2.method1487(124);
            }
        }
        if (arg0 != -5) {
            this.field3464 = 56;
        }
        field3460++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lna;")
    public final class17 method1376(int arg0, int arg1) {
        class17 var3 = (class17) class16.field315.method1564((long) this.field3475, 0);
        if (arg0 > -117) {
            field3474 = null;
        }
        field3468++;
        if (var3 == null) {
            class240 var4 = class240.method1648(class125.field2263, this.field3472, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3469 != null) {
                for (int var5 = 0; var5 < this.field3469.length; var5++) {
                    var4.method1636(this.field3469[var5], this.field3483[var5]);
                }
            }
            if (this.field3466 != null) {
                for (int var6 = 0; var6 < this.field3466.length; var6++) {
                    var4.method1663(this.field3466[var6], this.field3459[var6]);
                }
            }
            var3 = var4.method1649(this.field3482 + 64, this.field3463 + 850, -30, -50, -30);
            class16.field315.method1563((long) this.field3475, 21771, var3);
        }
        class17 var7;
        if (this.field3464 == -1 || arg1 == -1) {
            var7 = var3.method148(true, true);
        } else {
            var7 = class16.method144(1, this.field3464).method1041(var3, arg1, -110);
        }
        if (this.field3461 != 128 || this.field3476 != 128) {
            var7.method162(this.field3461, this.field3476, this.field3461);
        }
        if (this.field3478 != 0) {
            if (this.field3478 == 90) {
                var7.method157();
            }
            if (this.field3478 == 180) {
                var7.method151();
            }
            if (this.field3478 == 270) {
                var7.method167();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ)V")
    public static final void method1377(int arg0, long arg1) {
        field3477++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class99.field1751; var3++) {
            if (class74.field1270[var3] == arg1) {
                class37.field619++;
                class99.field1751--;
                for (int var4 = var3; var4 < class99.field1751; var4++) {
                    class49.field817[var4] = class49.field817[var4 + 1];
                    class158.field2875[var4] = class158.field2875[var4 + 1];
                    class150.field2769[var4] = class150.field2769[var4 + 1];
                    class74.field1270[var4] = class74.field1270[var4 + 1];
                    class107.field1923[var4] = class107.field1923[var4 + 1];
                    class265.field4635[var4] = class265.field4635[var4 + 1];
                }
                class237.field4093 = class186.field3214;
                class237.field4084.method490(111, -122);
                class237.field4084.method1484(arg1, (byte) 38);
                break;
            }
        }
        if (arg0 > -67) {
            field3462 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLnd;)V")
    public static final void method1378(byte arg0, class192 arg1) {
        field3481++;
        class60 var2 = (class60) class34.field594.method1511((byte) -126, arg1.field3323.method727((byte) 36));
        if (var2 == null) {
            class205.method1382(arg1.field4501[0], (class21) null, arg1, arg1.field4491[0], (class108) null, 0, true, class265.field4640);
        } else {
            var2.method435(128);
        }
        int var3 = 127 % ((arg0 - 1) / 56);
    }
}
