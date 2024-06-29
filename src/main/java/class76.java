import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class76 extends class152 {

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "Z")
    public boolean field1423 = true;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public int field1433 = -1;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public int field1435 = 0;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public int field1430 = 0;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public int field1420 = 12800;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
    public int field1444 = 12800;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "Lhh;")
    public class163 field1438;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "Lhh;")
    public class163 field1441;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Lmi;")
    public class128 field1434;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field1429 = 99;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Lqc;")
    public static class258 field1427 = new class258(32);

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field1443 = 0;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ek", name = "db", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "J")
    public static long field1424;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)Z")
    public final boolean method555(int arg0, int arg1, int arg2) {
        field1421++;
        if (arg2 != 0) {
            method559((class163) null, (class163) null, -20, 61);
        }
        if (this.field1420 > arg0 || arg0 > this.field1430 || arg1 < this.field1444 || this.field1435 < arg1) {
            return false;
        }
        for (class265 var4 = (class265) this.field1434.method1017(50); var4 != null; var4 = (class265) this.field1434.method1016((byte) -31)) {
            if (var4.method1785(arg1, arg0, false)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BZLpc;)V")
    public static final void method556(byte arg0, boolean arg1, class166 arg2) {
        field1432++;
        if (arg1) {
            class211.field3824 = 3;
            class243.method1679(-1, false);
            class22.field353 = 0;
            class126.field2438 = false;
            class73.field1368 = false;
            class77.field1453 = 255;
            client.field2006 = false;
            class84.field1593 = false;
            class208.field3781 = false;
            class9.field154 = false;
            class244.field4306 = false;
            class103.field1975 = 0;
            class2.field46 = 127;
            class48.field804 = false;
            class119.field2247 = false;
            class215.field3928 = 127;
            class116.field2205 = 0;
            class4.field91 = 0;
            class88.field1633 = false;
            class210.field3801 = false;
            class177.method1311(arg2, (byte) 55);
        } else {
            class211.field3824 = 3;
            class230 var3 = null;
            class243.method1679(-1, true);
            class88.field1633 = true;
            class2.field46 = 127;
            client.field2006 = true;
            class116.field2205 = 0;
            class48.field804 = true;
            class208.field3781 = true;
            class126.field2438 = true;
            class244.field4306 = true;
            class103.field1975 = 0;
            class73.field1368 = true;
            class22.field353 = 2;
            class84.field1593 = true;
            class77.field1453 = 255;
            class210.field3801 = true;
            class215.field3928 = 127;
            class9.field154 = true;
            class4.field91 = 0;
            class119.field2247 = true;
            try {
                class198 var4 = arg2.method1249(0, "runescape");
                while (var4.field3566 == 0) {
                    class107.method866(0, 1L);
                }
                if (var4.field3566 == 1) {
                    int var5 = 0;
                    var3 = (class230) var4.field3563;
                    byte[] var6 = new byte[(int) var3.method1602(80)];
                    while (var6.length > var5) {
                        int var7 = var3.method1598(var6, 1, var5, var6.length - var5);
                        if (var7 == -1) {
                            throw new IOException("EOF");
                        }
                        var5 += var7;
                    }
                    class35.method246(-93, new class81(var6));
                }
            } catch (Exception var9) {
            }
            try {
                if (var3 != null) {
                    var3.method1603(0);
                }
            } catch (Exception var8) {
            }
        }
        if (arg0 <= 74) {
            field1428 = -48;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)V")
    public static final void method557(byte arg0, int arg1) {
        if (arg0 != 19) {
            method556((byte) 123, false, (class166) null);
        }
        for (class129 var2 = (class129) class192.field3514.method1747((byte) 91); var2 != null; var2 = (class129) class192.field3514.method1745(-32496)) {
            if (((long) arg1) == (var2.field2641 >> 48 & 0xFFFFL)) {
                var2.method1063(arg0 + 104);
            }
        }
        field1426++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public final void method558(boolean arg0) {
        field1442++;
        this.field1435 = 0;
        this.field1420 = 12800;
        this.field1430 = 0;
        this.field1444 = 12800;
        for (class265 var2 = (class265) this.field1434.method1017(47); var2 != null; var2 = (class265) this.field1434.method1016((byte) -31)) {
            if (var2.field4603 < this.field1420) {
                this.field1420 = var2.field4603;
            }
            if (this.field1435 < var2.field4616) {
                this.field1435 = var2.field4616;
            }
            if (var2.field4598 > this.field1430) {
                this.field1430 = var2.field4598;
            }
            if (var2.field4612 < this.field1444) {
                this.field1444 = var2.field4612;
            }
        }
        if (arg0) {
            this.method555(-32, -123, -51);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lhh;Lhh;II)V")
    public static final void method559(class163 arg0, class163 arg1, int arg2, int arg3) {
        class202.field3676 = 0;
        if (arg3 != 3) {
            return;
        }
        class170.field3119 = arg0;
        class170.field3115 = arg1;
        field1437++;
        class140.field2683 = arg2;
        class248.field4379 = false;
        if (class170.field3115.method1208(class170.field3120, (byte) 66) || class170.field3119.method1208(class170.field3120, (byte) -122)) {
            class225.field4072 = 0;
            class128.field2492 = 3;
        } else {
            class225.field4072 = 1;
            field1443 = 0;
            class256.field4476 = 0;
            class128.field2492 = -3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static void method560(byte arg0) {
        field1427 = null;
        if (arg0 > -25) {
            method556((byte) 94, false, (class166) null);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIII)I")
    public static final int method561(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -90) {
            field1443 = -70;
        }
        field1436++;
        if ((class123.field2344[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class123.field2344[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
    public static final void method562(byte arg0) {
        if (class217.field3942[98]) {
            class40.field665 += (12 - class40.field665) / 2;
        } else if (class217.field3942[99]) {
            class40.field665 += (-class40.field665 - 12) / 2;
        } else {
            class40.field665 /= 2;
        }
        class132.field2560 += class40.field665 / 2;
        if (class217.field3942[96]) {
            class145.field2770 += (-class145.field2770 - 24) / 2;
        } else if (class217.field3942[97]) {
            class145.field2770 += (24 - class145.field2770) / 2;
        } else {
            class145.field2770 /= 2;
        }
        if (arg0 != 102) {
            return;
        }
        class93.field1750 += class145.field2770 / 2;
        field1440++;
        int var1 = class183.field3363 + class235.field4203.field3633;
        int var2 = class10.field167 + class235.field4203.field3615;
        if ((class24.field389 - var1) < -500 || (class24.field389 - var1) > 500 || (class29.field448 - var2) < -500 || class29.field448 - var2 > 500) {
            class24.field389 = var1;
            class29.field448 = var2;
        }
        if (class29.field448 != var2) {
            class29.field448 += (var2 - class29.field448) / 16;
        }
        if (class24.field389 != var1) {
            class24.field389 += (var1 - class24.field389) / 16;
        }
        class259.method1755((byte) 126);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lhh;Lhh;IIIZ)V")
    public class76(class163 arg0, class163 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1438 = arg0;
        this.field1441 = arg1;
        this.field1431 = arg3;
        this.field1425 = arg2;
        this.field1433 = arg4;
        this.field1423 = arg5;
        this.field1434 = new class128();
    }
}
