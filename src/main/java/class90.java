import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class90 {

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lil;")
    public class161 field1470 = new class161();

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lp;")
    public static class280 field1457 = class18.method140((byte) -121, "Chargement des polices )2 ");

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lp;")
    public static class280 field1463 = class18.method140((byte) -125, "");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lp;")
    public static class280 field1466 = class18.method140((byte) -127, "0");

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lp;")
    public static class280 field1473 = null;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lqg;")
    public static class103 field1460;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lde;")
    public static class108 field1456;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lil;")
    private class161 field1476;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Ltg;")
    public static class180 field1468;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[I")
    public static int[] field1459;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[[B")
    public static byte[][] field1472;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method639(int arg0) {
        field1455++;
        while (true) {
            class161 var2 = this.field1470.field2828;
            if (this.field1470 == var2) {
                this.field1476 = null;
                if (arg0 < 1) {
                    method640(113);
                    return;
                } else {
                    return;
                }
            }
            var2.method1146(26159);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method640(int arg0) {
        class264.field4663 = 1;
        class148.field2574 = arg0;
        class113.field1888 = false;
        field1471++;
        class183.field3228 = 0;
        class8.field148 = -3;
        class80.field1316 = 0;
        class86.field1419 = -1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method641(byte arg0, int arg1) {
        field1465++;
        if (class162.field2858 == arg1) {
            return;
        }
        if (class162.field2858 == 0) {
            class23.method175(arg0 - 67);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg0 != 66) {
            field1457 = null;
        }
        if (arg1 == 40) {
            method640(arg0 - 66);
        }
        if (arg1 != 40 && class251.field4398 != null) {
            class251.field4398.method1532(65);
            class251.field4398 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class253.field4427 = 1;
            class157.field2739 = 0;
            class88.field1432 = 0;
            class123.field2160 = 0;
            class109.field1829 = 1;
            class100.method710(5147, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class93.method659((byte) -122);
        }
        if (arg1 == 5) {
            class136.method929(class220.field3778, (byte) 117);
        } else {
            class99.method696(1536);
        }
        boolean var3 = class162.field2858 == 5 || class162.field2858 == 10 || class162.field2858 == 28;
        if (var2 != var3) {
            if (var2) {
                class243.field4270 = class116.field2098;
                if (class188.field3307 == 0) {
                    class263.method1779(false, 2);
                } else {
                    class103.method727(false, 2, class116.field2098, 255, class184.field3246, 0, (byte) 98);
                }
                class168.field2941.method1732(false, (byte) 122);
            } else {
                class263.method1779(false, 2);
                class168.field2941.method1732(true, (byte) 120);
            }
        }
        class162.field2858 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Lil;")
    public final class161 method642(int arg0) {
        field1454++;
        if (arg0 != 2) {
            return null;
        }
        class161 var2 = this.field1470.field2828;
        if (this.field1470 == var2) {
            return null;
        } else {
            var2.method1146(26159);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Lil;")
    public final class161 method643(int arg0) {
        field1462++;
        if (arg0 != 11066) {
            field1459 = null;
        }
        class161 var2 = this.field1476;
        if (this.field1470 == var2) {
            this.field1476 = null;
            return null;
        } else {
            this.field1476 = var2.field2828;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1468 = null;
        field1463 = null;
        if (arg0 != 14359) {
            return;
        }
        field1457 = null;
        field1460 = null;
        field1466 = null;
        field1473 = null;
        field1456 = null;
        field1459 = null;
        field1472 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILil;)V")
    public final void method645(int arg0, class161 arg1) {
        if (arg1.field2819 != null) {
            arg1.method1146(26159);
        }
        arg1.field2828 = this.field1470.field2828;
        field1475++;
        arg1.field2819 = this.field1470;
        int var3 = 63 / ((-arg0 - 63) / 59);
        arg1.field2819.field2828 = arg1;
        arg1.field2828.field2819 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lil;")
    public final class161 method646(byte arg0) {
        field1469++;
        class161 var2 = this.field1470.field2819;
        if (arg0 != 22) {
            this.method649((class161) null, (byte) -18);
        }
        if (this.field1470 == var2) {
            this.field1476 = null;
            return null;
        } else {
            this.field1476 = var2.field2819;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lil;")
    public final class161 method647(boolean arg0) {
        field1461++;
        class161 var2 = this.field1476;
        if (arg0) {
            this.method639(-34);
        }
        if (this.field1470 == var2) {
            this.field1476 = null;
            return null;
        } else {
            this.field1476 = var2.field2819;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILtg;I)Z")
    public static final boolean method648(int arg0, int arg1, class180 arg2, int arg3) {
        if (arg3 != -41) {
            field1472 = null;
        }
        byte[] var4 = arg2.method1258(arg1, arg0, (byte) 108);
        field1458++;
        if (var4 == null) {
            return false;
        } else {
            class54.method394(var4, 10961);
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lil;B)V")
    public final void method649(class161 arg0, byte arg1) {
        if (arg0.field2819 != null) {
            arg0.method1146(26159);
        }
        field1467++;
        arg0.field2819 = this.field1470.field2819;
        if (arg1 < 75) {
            method650((byte) -127);
        }
        arg0.field2828 = this.field1470;
        arg0.field2819.field2828 = arg0;
        arg0.field2828.field2819 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
    public static final boolean method650(byte arg0) {
        field1464++;
        try {
            if (arg0 <= 16) {
                return true;
            }
            if (class253.field4441 == 2) {
                if (class67.field1117 == null) {
                    class67.field1117 = class202.method1382(class268.field4707, class115.field2092, class181.field3168);
                    if (class67.field1117 == null) {
                        return false;
                    }
                }
                if (class9.field201 == null) {
                    class9.field201 = new class29(class154.field2659, class181.field3169);
                }
                if (class232.field4055.method12(class130.field2275, (byte) -118, class9.field201, class67.field1117, 22050)) {
                    class232.field4055.method41((byte) 104);
                    class232.field4055.method31(-2080769, class222.field3849);
                    class232.field4055.method23((byte) 52, class102.field1654, class67.field1117);
                    class9.field201 = null;
                    class268.field4707 = null;
                    class67.field1117 = null;
                    class253.field4441 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class232.field4055.method42(126);
            class9.field201 = null;
            class268.field4707 = null;
            class253.field4441 = 0;
            class67.field1117 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Lil;")
    public final class161 method651(int arg0) {
        field1474++;
        class161 var2 = this.field1470.field2828;
        if (this.field1470 == var2) {
            this.field1476 = null;
            return null;
        }
        if (arg0 != 12916) {
            field1459 = null;
        }
        this.field1476 = var2.field2828;
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class90() {
        this.field1470.field2819 = this.field1470;
        this.field1470.field2828 = this.field1470;
    }
}
