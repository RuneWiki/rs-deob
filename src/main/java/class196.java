import java.awt.Component;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class196 extends class220 {

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "Lmh;")
    private class128 field3453 = class71.field1319;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3433 = -1;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "Lmh;")
    private static class128 field3442 = class22.method156(127, "Attack");

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Lmh;")
    public static class128 field3437 = field3442;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "Lmh;")
    private static class128 field3456 = class22.method156(124, "Allocated memory");

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Lmh;")
    public static class128 field3439 = field3456;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
    public int field3450;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Loe;")
    public class120 field3432;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "Loe;")
    private class120 field3443;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 11)
    public static final void method1360(int arg0) {
        if (arg0 < -45) {
            class56.field1071.method1834(17);
            field3459++;
            class156.field2676.method1834(17);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method1361(int arg0, int arg1) {
        if (arg0 != 6) {
            method1373(-36, 85, 103);
        }
        field3438++;
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IJ)Lmh;", line = 35)
    public static final class128 method1362(int arg0, long arg1) {
        class145.field2489.setTime(new Date(arg1));
        if (arg0 <= 65) {
            method1362(-121, 26L);
        }
        int var3 = class145.field2489.get(7);
        field3447++;
        int var4 = class145.field2489.get(5);
        int var5 = class145.field2489.get(2);
        int var6 = class145.field2489.get(1);
        int var7 = class145.field2489.get(11);
        int var8 = class145.field2489.get(12);
        int var9 = class145.field2489.get(13);
        return class28.method177((byte) -98, new class128[] { class115.field1949[var3 - 1], class228.field3965, class257.method1811(var4 / 10, (byte) 37), class257.method1811(var4 % 10, (byte) 54), class42.field860, class292.field4998[var5], class42.field860, class257.method1811(var6, (byte) 119), class159.field2721, class257.method1811(var7 / 10, (byte) -122), class257.method1811(var7 % 10, (byte) 6), class175.field3098, class257.method1811(var8 / 10, (byte) -119), class257.method1811(var8 % 10, (byte) -117), class175.field3098, class257.method1811(var9 / 10, (byte) -128), class257.method1811(var9 % 10, (byte) -127), class310.field5263 });
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 64)
    private final void method1363(int arg0) {
        this.field3443 = new class120(this.field3432.method735(0));
        for (class57 var2 = (class57) this.field3432.method729(-94); var2 != null; var2 = (class57) this.field3432.method732(1)) {
            class181 var3 = new class181(var2.field1096, (int) var2.field4915);
            this.field3443.method730(var3, var2.field1096.method827((byte) 123), (byte) -118);
        }
        field3451++;
        if (arg0 > -42) {
            method1372(77);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)I", line = 88)
    public final int method1364(int arg0, int arg1) {
        if (arg1 != 31343) {
            return -85;
        }
        field3457++;
        if (this.field3432 == null) {
            return this.field3434;
        } else {
            class155 var3 = (class155) this.field3432.method728(false, (long) arg0);
            return var3 == null ? this.field3434 : var3.field2672;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 112)
    public static final void method1365(Component arg0, byte arg1) {
        field3454++;
        arg0.removeMouseListener(class94.field1591);
        arg0.removeMouseMotionListener(class94.field1591);
        if (arg1 <= -89) {
            arg0.removeFocusListener(class94.field1591);
            class146.field2499 = 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lmh;BI)V", line = 130)
    public static final void method1366(class128 arg0, byte arg1, int arg2) {
        field3441++;
        class229 var3 = class241.method1638(3, 122, arg2);
        if (arg1 == 99) {
            var3.method1574(arg1 ^ 0xC1C);
            var3.field3991 = arg0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIILjm;IJ)Z", line = 149)
    public static final boolean method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class226 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class287.method1980(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lbg;II)V", line = 162)
    private final void method1368(class194 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3455 = arg0.method1325(7627);
        } else if (arg2 == 2) {
            this.field3450 = arg0.method1325(7627);
        } else if (arg2 == 3) {
            this.field3453 = arg0.method1319(1);
        } else if (arg2 == 4) {
            this.field3434 = arg0.method1350(false);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1308(-43);
            this.field3432 = new class120(class58.method383((byte) -93, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1350(false);
                class287 var7;
                if (arg2 == 5) {
                    var7 = new class57(arg0.method1319(1));
                } else {
                    var7 = new class155(arg0.method1350(false));
                }
                this.field3432.method730(var7, (long) var6, (byte) 116);
            }
        }
        field3440++;
        int var8 = -115 % ((arg1 + 62) / 42);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILmh;)Z", line = 214)
    public final boolean method1369(int arg0, class128 arg1) {
        field3458++;
        if (this.field3432 == null) {
            return false;
        } else if (arg0 == 24927) {
            if (this.field3443 == null) {
                this.method1363(arg0 - 24980);
            }
            for (class181 var3 = (class181) this.field3443.method728(false, arg1.method827((byte) 126)); var3 != null; var3 = (class181) this.field3443.method734(3069)) {
                if (var3.field3176.method855(arg1, 255)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Z", line = 245)
    public final boolean method1370(byte arg0, int arg1) {
        field3445++;
        if (this.field3432 == null) {
            return false;
        }
        if (this.field3443 == null) {
            this.method1375(false);
        }
        if (arg0 <= 48) {
            method1360(-103);
        }
        class155 var3 = (class155) this.field3443.method728(false, (long) arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Lmh;", line = 268)
    public final class128 method1371(int arg0, byte arg1) {
        field3436++;
        if (this.field3432 == null) {
            return this.field3453;
        }
        if (arg1 <= 31) {
            this.method1364(-124, -60);
        }
        class57 var3 = (class57) this.field3432.method728(false, (long) arg0);
        return var3 == null ? this.field3453 : var3.field1096;
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 297)
    public static void method1372(int arg0) {
        field3437 = null;
        field3442 = null;
        if (arg0 < 19) {
            method1361(105, 33);
        }
        field3439 = null;
        field3456 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Z", line = 319)
    public static final boolean method1373(int arg0, int arg1, int arg2) {
        field3449++;
        if (arg0 == -1) {
            return (arg2 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lbg;B)V", line = 344)
    public final void method1374(class194 arg0, byte arg1) {
        int var3 = -75 % ((-arg1 - 29) / 38);
        while (true) {
            int var4 = arg0.method1325(7627);
            if (var4 == 0) {
                field3448++;
                return;
            }
            this.method1368(arg0, -123, var4);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Z)V", line = 378)
    private final void method1375(boolean arg0) {
        this.field3443 = new class120(this.field3432.method735(0));
        field3452++;
        class155 var2 = (class155) this.field3432.method729(-78);
        if (arg0) {
            method1367(-96, -1, 30, 105, -52, 95, (class226) null, 40, -19L);
        }
        while (var2 != null) {
            class155 var3 = new class155((int) var2.field4915);
            this.field3443.method730(var3, (long) var2.field2672, (byte) 116);
            var2 = (class155) this.field3432.method732(1);
        }
    }
}
