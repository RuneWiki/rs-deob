import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class98 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Lwg;")
    private class198 field1409 = new class198();

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lil;")
    private class4 field1421;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1411 = "";

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Z")
    public static boolean field1408 = false;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lil;")
    public static class4 field1410 = new class4(16);

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
    public static int[] field1428 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Z")
    public static boolean field1426;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 9)
    public final void method642(Object arg0, long arg1, int arg2) {
        this.method650(0, arg1);
        if (this.field1417 == 0) {
            class343 var5 = (class343) this.field1409.method1352(false);
            var5.method1131(8);
            var5.method2148((byte) 127);
        } else {
            this.field1417--;
        }
        field1414++;
        class353 var6 = new class353(arg0);
        this.field1421.method37(false, var6, arg1);
        this.field1409.method1353(-1, var6);
        var6.field5011 = 0L;
        if (arg2 >= -77) {
            field1411 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 40)
    public static void method643(int arg0) {
        field1411 = null;
        field1428 = null;
        if (arg0 != 15) {
            method643(-127);
        }
        field1410 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 54)
    public final void method644(byte arg0) {
        this.field1409.method1354((byte) -128);
        this.field1421.method31(false);
        field1416++;
        this.field1417 = this.field1412;
        if (arg0 > -40) {
            this.method644((byte) 38);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V", line = 70)
    public final void method645(int arg0, byte arg1) {
        if (arg1 >= -30) {
            this.field1421 = (class4) null;
        }
        if (class12.field146 != null) {
            for (class343 var3 = (class343) this.field1409.method1350(0); var3 != null; var3 = (class343) this.field1409.method1351(-124)) {
                if (var3.method329(21764)) {
                    if (var3.method328(2718) == null) {
                        var3.method1131(8);
                        var3.method2148((byte) 127);
                        this.field1417++;
                    }
                } else if (++var3.field5011 > (long) arg0) {
                    class343 var4 = class12.field146.method1389(-100, var3);
                    this.field1421.method37(false, var4, var3.field2549);
                    class350.method2452(-2818, var4, var3);
                    var3.method1131(8);
                    var3.method2148((byte) 106);
                }
            }
        }
        field1415++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 120)
    public static final void method646(int arg0) {
        field1425++;
        if ((class88.field1264 > class88.field1259)) {
            class88.field1259 = (float) ((double) class88.field1259 / 30.0D + (double) class88.field1259);
            if (class88.field1259 > class88.field1264) {
                class88.field1259 = class88.field1264;
            }
            class300.method2110(true);
        } else if (class88.field1259 > class88.field1264) {
            class88.field1259 = (float) ((double) class88.field1259 - (double) class88.field1259 / 30.0D);
            if (class88.field1264 > class88.field1259) {
                class88.field1259 = class88.field1264;
            }
            class300.method2110(true);
        }
        if (class32.field488 != -1 && class179.field2785 != -1) {
            int var1 = class32.field488 - class236.field3735;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class179.field2785 - class125.field1873;
            class236.field3735 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class125.field1873 -= -var2;
            if (var1 == 0 && var2 == 0) {
                class32.field488 = -1;
                class179.field2785 = -1;
            }
            class300.method2110(true);
        }
        if (arg0 > -59) {
            method643(37);
        }
        if (class268.field4416 <= 0) {
            class2.field14 = -1;
            class325.field5326 = -1;
        } else {
            class6.field76--;
            if (class6.field76 == 0) {
                class6.field76 = 100;
                class268.field4416--;
            }
        }
        if (!class86.field1234 || class65.field957 == null) {
            return;
        }
        for (class34 var3 = (class34) class65.field957.method1081(-18); var3 != null; var3 = (class34) class65.field957.method1083((byte) 113)) {
            class312 var4 = class165.method1150(var3.field520.field2378, (byte) 101);
            if (class214.field3276 == 0 && var3.method289(class305.field4988, class130.field1982, -646)) {
                if (!var3.field520.field2376) {
                    var3.field520.field2376 = true;
                    class178.method1249(var4.field5095, 15, false, var3.field520.field2378);
                }
                if (var3.field520.field2376) {
                    class178.method1249(var4.field5095, 17, false, var3.field520.field2378);
                }
            } else if (var3.field520.field2376) {
                var3.field520.field2376 = false;
                class178.method1249(var4.field5095, 16, false, var3.field520.field2378);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I", line = 235)
    public final int method647(int arg0) {
        field1420++;
        int var2 = 11 % ((arg0 + 21) / 54);
        int var3 = 0;
        for (class343 var4 = (class343) this.field1409.method1350(0); var4 != null; var4 = (class343) this.field1409.method1351(-126)) {
            if (!var4.method329(21764)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V", line = 265)
    public static final void method648(int arg0) {
        class273.field4495 = -1;
        class223.field3439 = 0;
        if (arg0 < 112) {
            method646(10);
        }
        field1413++;
        class183.field2854 = 0;
        class203.field3112 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I", line = 286)
    public static final int method649(byte arg0, int arg1) {
        if (arg0 == -8) {
            field1423++;
            return arg1 & 0x7F;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)V", line = 302)
    public final void method650(int arg0, long arg1) {
        if (arg0 != 0) {
            return;
        }
        field1422++;
        class343 var4 = (class343) this.field1421.method29(arg1, 103);
        if (var4 != null) {
            var4.method1131(8);
            var4.method2148((byte) 126);
            this.field1417++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 320)
    public final void method651(int arg0) {
        field1418++;
        for (class343 var2 = (class343) this.field1409.method1350(arg0 ^ arg0); var2 != null; var2 = (class343) this.field1409.method1351(arg0 - 101)) {
            if (var2.method329(21764)) {
                var2.method1131(8);
                var2.method2148((byte) 126);
                this.field1417++;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 343)
    public final Object method652(long arg0, boolean arg1) {
        field1424++;
        class343 var4 = (class343) this.field1421.method29(arg0, 103);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method328(2718);
        if (arg1) {
            return (Object) null;
        } else if (var5 == null) {
            var4.method1131(8);
            var4.method2148((byte) 113);
            this.field1417++;
            return null;
        } else {
            if (var4.method329(21764)) {
                class353 var6 = new class353(var5);
                this.field1421.method37(false, var6, var4.field2549);
                this.field1409.method1353(-1, var6);
                var6.field5011 = 0L;
                var4.method1131(8);
                var4.method2148((byte) 117);
            } else {
                this.field1409.method1353(-1, var4);
                var4.field5011 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V", line = 388)
    public class98(int arg0) {
        this.field1417 = arg0;
        this.field1412 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1421 = new class4(var2);
    }
}
