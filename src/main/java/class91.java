import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class91 extends class285 {

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public int field1549 = 0;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public int field1550 = 0;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    public int field1554 = 12800;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public int field1556 = 12800;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public int field1567 = -1;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "Z")
    public boolean field1571 = true;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "Lve;")
    public class255 field1568;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lve;")
    public class255 field1564;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "Lfg;")
    public class203 field1552;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Lve;")
    public static class255 field1561 = class87.method607(100, "Benutzen");

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "Lve;")
    public static class255 field1559 = class87.method607(88, "<col=00ffff>");

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Lve;")
    public static class255 field1562 = class87.method607(120, "Hierhin gehen");

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "Lve;")
    public static class255 field1553 = class87.method607(73, "Schlie-8en");

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lve;")
    public static class255 field1563 = class87.method607(43, "mapscene");

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field1569 = 0;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lve;Lve;IIIZ)V", line = 256)
    public class91(class255 arg0, class255 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1568 = arg0;
        this.field1565 = arg2;
        this.field1571 = arg5;
        this.field1564 = arg1;
        this.field1567 = arg4;
        this.field1570 = arg3;
        this.field1552 = new class203();
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V", line = 24)
    public static final void method682(byte arg0) {
        if (arg0 <= 12) {
            method685(-87, (byte) -42, -23);
        }
        class242.field4080.method670(-128);
        field1560++;
        class258.field4389 = null;
        class73.field1203 = 1;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 42)
    public final void method683(int arg0) {
        this.field1554 = 12800;
        this.field1550 = 0;
        this.field1549 = 0;
        this.field1556 = 12800;
        for (class157 var2 = (class157) this.field1552.method1471((byte) -62); var2 != null; var2 = (class157) this.field1552.method1475((byte) 83)) {
            if (var2.field2667 > this.field1550) {
                this.field1550 = var2.field2667;
            }
            if (this.field1556 > var2.field2661) {
                this.field1556 = var2.field2661;
            }
            if (var2.field2663 < this.field1554) {
                this.field1554 = var2.field2663;
            }
            if (this.field1549 < var2.field2666) {
                this.field1549 = var2.field2666;
            }
        }
        if (arg0 != -15097) {
            field1559 = (class255) null;
        }
        field1551++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Z", line = 85)
    public final boolean method684(int arg0, int arg1, int arg2) {
        field1557++;
        if (arg0 != 2) {
            field1563 = (class255) null;
        }
        if (this.field1554 > arg1 || arg1 > this.field1549 || this.field1556 > arg2 || this.field1550 < arg2) {
            return false;
        }
        for (class157 var4 = (class157) this.field1552.method1471((byte) 90); var4 != null; var4 = (class157) this.field1552.method1475((byte) 83)) {
            if (var4.method1152(arg2, arg1, (byte) 63)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)Ltl;", line = 117)
    public static final class197 method685(int arg0, byte arg1, int arg2) {
        if (arg1 >= -33) {
            field1569 = -98;
        }
        field1566++;
        class197 var3 = class58.method353(arg0, (byte) 114);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3359 == null || arg2 >= var3.field3359.length) {
            return null;
        } else {
            return var3.field3359[arg2];
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIILfk;IB)Ljava/awt/Frame;", line = 144)
    public static final Frame method686(int arg0, int arg1, int arg2, class40 arg3, int arg4, byte arg5) {
        field1558++;
        if (!arg3.method247(58)) {
            return null;
        }
        if (arg2 == 0) {
            class248[] var6 = class22.method121(arg3, -24588);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4161 == arg0 && var6[var8].field4150 == arg4 && (arg1 == 0 || var6[var8].field4157 == arg1) && (!var7 || arg2 < var6[var8].field4160)) {
                    arg2 = var6[var8].field4160;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class169 var9 = arg3.method246(arg0, arg1, (byte) -125, arg4, arg2);
        while (var9.field2833 == 0) {
            class137.method1027(10L, 0);
        }
        Frame var10 = (Frame) var9.field2832;
        if (var10 == null) {
            return null;
        } else if (var9.field2833 == 2) {
            class3.method22(arg3, var10, -75);
            return null;
        } else if (arg5 == -68) {
            return var10;
        } else {
            return (Frame) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 236)
    public static void method687(boolean arg0) {
        field1559 = null;
        if (!arg0) {
            method685(-62, (byte) -62, -78);
        }
        field1563 = null;
        field1562 = null;
        field1553 = null;
        field1561 = null;
    }
}
