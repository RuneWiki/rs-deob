import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class97 extends class228 implements class66 {

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Z")
    private boolean field1483 = false;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    private int field1504 = 50;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Lwf;")
    private class306 field1499;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Lwf;")
    private class306 field1501;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lkn;")
    private class52 field1502;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "Lkn;")
    private class52 field1485;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field1508 = 0;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ek", name = "eb", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ek", name = "fb", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ek", name = "hb", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ek", name = "ib", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "[[[B")
    public static byte[][][] field1512;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(IB)V", line = 9)
    public final void method664(int arg0, byte arg1) {
        field1500++;
        if (arg1 >= -19) {
            this.method465(-20, -121);
        }
        for (class102 var3 = (class102) this.field1502.method353(-1); var3 != null; var3 = (class102) this.field1502.method356(1)) {
            if (var3.field1587) {
                var3.method694(arg0);
                var3.field1587 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V", line = 35)
    public final void method474(int arg0, byte arg1, int arg2) {
        if (arg1 != -53) {
            this.method470((byte) 26, -50);
        }
        class174.method1179(this.method1563(arg2, (byte) -122).field1699 & 0xFF, this.method1563(arg2, (byte) -40).field1698 & 0xFF, (byte) 82);
        field1495++;
        boolean var4 = false;
        class102 var5 = this.method670(arg2, (byte) 86);
        if (var5 != null) {
            var4 = var5.method693(this, this.field1499, arg0);
        }
        if (!var4) {
            class131 var6 = this.method675(arg2, -8572);
            var6.method903((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 67)
    public static final String method665(int arg0, long arg1) {
        field1509++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 != 50) {
                field1512 = (byte[][][]) ((byte[][][]) null);
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class334.field5194[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)Z", line = 109)
    public final boolean method469(int arg0, int arg1) {
        int var3 = 81 / ((arg0 + 53) / 59);
        field1503++;
        return this.method1563(arg1, (byte) -24).field1706;
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)I", line = 118)
    public final int method476(int arg0, int arg1) {
        if (arg0 == 255) {
            field1517++;
            return this.method1563(arg1, (byte) -39).field1707 & 0xFF;
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 130)
    public final void method465(int arg0, int arg1) {
        this.method474(this.field1483 || this.method1563(arg0, (byte) -108).field1694 ? 64 : 128, (byte) -53, arg0);
        field1516++;
        if (arg1 != 37) {
            method666(-96);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 142)
    public static void method666(int arg0) {
        if (arg0 == 19692) {
            field1512 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "(II)V", line = 152)
    public final void method667(int arg0, int arg1) {
        field1518++;
        if (arg1 != -28881) {
            method668(93, 116, -39);
        }
        this.field1504 = arg0;
        this.field1502 = new class52(this.field1504);
        if (class333.field5166) {
            this.field1485 = new class52(this.field1504);
        } else {
            this.field1485 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)J", line = 170)
    public static final long method668(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field2655; var4++) {
            class272 var5 = var3.field2671[var4];
            if ((var5.field4183 >> 29 & 0x3L) == 2L && var5.field4169 == arg1 && var5.field4186 == arg2) {
                return var5.field4183;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(II)I", line = 191)
    public final int method477(int arg0, int arg1) {
        field1497++;
        if (arg0 != 7053) {
            this.field1501 = (class306) null;
        }
        return this.method1563(arg1, (byte) -79).field1704 & 0xFFFF;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIF)[I", line = 204)
    public final int[] method467(int arg0, int arg1, float arg2) {
        field1513++;
        class102 var4 = this.method670(arg0, (byte) 86);
        if (arg1 >= -1) {
            return (int[]) null;
        } else if (var4 == null) {
            return null;
        } else {
            var4.field1587 = true;
            return var4.method689(this, this.field1499, arg2, this.field1483 || this.method1563(arg0, (byte) -50).field1694);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)I", line = 220)
    public final int method472(boolean arg0, int arg1) {
        if (arg0) {
            method668(80, 101, -4);
        }
        field1484++;
        return this.method1563(arg1, (byte) -19).field1699 & 0xFF;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZIII)V", line = 236)
    public static final void method669(boolean arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg0) {
            method665(-101, 23L);
        }
        field1489++;
        System.out.println(var4);
        class113.method756(var4, (byte) 125);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(IB)Lfb;", line = 249)
    private final class102 method670(int arg0, byte arg1) {
        field1505++;
        class102 var3 = (class102) this.field1502.method355((long) arg0, 6487);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1501.method2103(arg1 - 86, arg0, 0);
        if (arg1 != 86) {
            this.method469(63, 42);
        }
        if (var4 == null) {
            return null;
        } else {
            class102 var5 = new class102(new class303(var4));
            this.field1502.method350((long) arg0, var5, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IZ)V", line = 275)
    public final void method671(int arg0, boolean arg1) {
        field1496++;
        this.field1483 = arg1;
        this.method672(-106);
        int var3 = 83 % ((arg0 - 49) / 49);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)Z", line = 286)
    public final boolean method471(int arg0, boolean arg1) {
        field1490++;
        if (arg1) {
            return false;
        } else {
            return this.field1483 || this.method1563(arg0, (byte) -95).field1694;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 300)
    public final void method672(int arg0) {
        field1515++;
        if (arg0 >= -103) {
            this.field1501 = (class306) null;
        }
        this.field1502.method351(0);
        if (this.field1485 != null) {
            this.field1485.method351(0);
        }
        class102.field1588 = null;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lwf;Lwf;Lwf;IZ)V", line = 318)
    public class97(class306 arg0, class306 arg1, class306 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1504 = arg3;
        this.field1483 = arg4;
        this.field1499 = arg2;
        this.field1501 = arg0;
        this.field1502 = new class52(this.field1504);
        if (class333.field5166) {
            this.field1485 = new class52(this.field1504);
        } else {
            this.field1485 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Z", line = 341)
    public final boolean method470(byte arg0, int arg1) {
        class102 var3 = this.method670(arg1, (byte) 86);
        field1511++;
        if (var3 == null) {
            return false;
        } else {
            if (arg0 > -59) {
                this.field1485 = (class52) null;
            }
            return var3.method692(this, this.field1499);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 360)
    public static final void method673(byte arg0, Component arg1) {
        arg1.removeKeyListener(class158.field2464);
        field1494++;
        arg1.removeFocusListener(class158.field2464);
        class18.field254 = -1;
        if (arg0 != -64) {
            field1488 = -33;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)I", line = 374)
    public final int method466(int arg0, int arg1) {
        if (arg0 == 255) {
            field1487++;
            return this.method1563(arg1, (byte) -117).field1698 & 0xFF;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "(II)Llk;", line = 392)
    public final class143 method674(int arg0, int arg1) {
        field1510++;
        if (arg0 != 0) {
            this.method466(30, 97);
        }
        class102 var3 = this.method670(arg1, (byte) 86);
        return var3 == null ? null : var3.field1580;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I", line = 406)
    public final int[] method475(int arg0, byte arg1) {
        field1486++;
        class102 var3 = this.method670(arg0, (byte) 86);
        if (arg1 != -87) {
            this.field1485 = (class52) null;
        }
        return var3 == null ? null : var3.method691(this, this.field1499, this.field1483 || this.method1563(arg0, (byte) -84).field1694);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIZF)Ln;", line = 427)
    public final class178 method473(int arg0, int arg1, int arg2, boolean arg3, float arg4) {
        class102 var6 = this.method670(arg0, (byte) 86);
        field1514++;
        if (arg2 != 63) {
            this.method667(-113, -35);
        }
        if (var6 != null && var6.method692(this, this.field1499)) {
            return arg3 ? var6.field1580.method998(arg1, (byte) 27, (double) arg4, false, this, this.field1499, arg1) : var6.field1580.method1001(arg1, false, (double) arg4, arg1, (byte) -41, this.field1499, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Z", line = 447)
    public final boolean method468(int arg0, int arg1) {
        field1506++;
        if (arg0 == 13496) {
            return !this.method1563(arg1, (byte) -57).field1700;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "(II)Lqf;", line = 458)
    private final class131 method675(int arg0, int arg1) {
        if (arg1 != -8572) {
            this.method670(34, (byte) 15);
        }
        field1482++;
        class131 var3 = (class131) this.field1485.method355((long) arg0, 6487);
        if (var3 == null) {
            class131 var4 = new class131(this.method1563(arg0, (byte) -25).field1704 & 0xFFFF);
            this.field1485.method350((long) arg0, var4, true);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(II)Z", line = 478)
    public final boolean method478(int arg0, int arg1) {
        field1507++;
        if (arg1 > -95) {
            this.method474(93, (byte) -39, -18);
        }
        return this.method1563(arg0, (byte) -81).field1708;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(ZI)I", line = 490)
    public final int method479(boolean arg0, int arg1) {
        if (!arg0) {
            this.method672(107);
        }
        field1492++;
        return this.method1563(arg1, (byte) -112).field1695 & 0xFF;
    }
}
