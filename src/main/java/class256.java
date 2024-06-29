import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class256 {

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Lad;")
    private class11 field3241 = new class11(64);

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Ldn;")
    private class201 field3242;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lad;")
    public static class11 field3238 = new class11(4);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Ldn;")
    public static class201 field3245;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1599(int arg0) {
        field3243++;
        if (class460.field6432 != null) {
            return;
        }
        if (arg0 != 1024) {
            field3238 = null;
        }
        Container var1;
        if (class516.field7590 == null) {
            var1 = class172.field2221.field6139;
        } else {
            var1 = class516.field7590;
        }
        class403.field5424 = var1.getSize().width;
        class18.field303 = var1.getSize().height;
        if (class516.field7590 == var1) {
            Insets var2 = class516.field7590.getInsets();
            class18.field303 -= var2.top + var2.bottom;
            class403.field5424 -= var2.right + var2.left;
        }
        if (class144.method1008((byte) 109) == 1) {
            class351.field4495 = (class403.field5424 - class366.field4716) / 2;
            class23.field419 = class366.field4716;
            class509.field7474 = 0;
            class92.field1281 = class312.field4024;
        } else if (class472.field6899 < 96 && class520.field7690 == 0) {
            int var3 = class403.field5424 > 1024 ? 1024 : class403.field5424;
            class351.field4495 = (class403.field5424 - var3) / 2;
            int var4 = class18.field303 <= 768 ? class18.field303 : 768;
            class23.field419 = var3;
            class509.field7474 = 0;
            class92.field1281 = var4;
        } else {
            class92.field1281 = class18.field303;
            class509.field7474 = 0;
            class23.field419 = class403.field5424;
            class351.field4495 = 0;
        }
        if (class246.field3151 != class222.field2867) {
            boolean var10000;
            if (class23.field419 < 1024 && class92.field1281 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class272.field3454.setSize(class23.field419, class92.field1281);
        if (class512.field7538 != null) {
            class512.field7538.method852(class272.field3454);
        }
        if (class516.field7590 == var1) {
            Insets var5 = class516.field7590.getInsets();
            class272.field3454.setLocation(class351.field4495 + var5.left, class509.field7474 + var5.top);
        } else {
            class272.field3454.setLocation(class351.field4495, class509.field7474);
        }
        if (class282.field3610 != -1) {
            class296.method1780(true, (byte) 31);
        }
        class11.method77(-111);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILhs;)[Lhk;", line = 102)
    public static final class268[] method1600(int arg0, class441 arg1) {
        field3232++;
        if (!arg1.method2631(-125)) {
            return new class268[0];
        }
        class277 var2 = arg1.method2618(0);
        while (var2.field3542 == 0) {
            class463.method2773(10L, -122);
        }
        if (var2.field3542 == 2) {
            return new class268[0];
        }
        int[] var3 = (int[]) var2.field3541;
        if (arg0 != 6863) {
            field3238 = null;
        }
        class268[] var4 = new class268[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class268 var6 = new class268();
            var4[var5] = var6;
            var6.field3395 = var3[var5 << 2];
            var6.field3393 = var3[(var5 << 2) + 1];
            var6.field3391 = var3[(var5 << 2) + 2];
            var6.field3394 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 148)
    public static final void method1601(int arg0) {
        class405.field5434 = arg0;
        for (int var1 = 0; var1 < class166.field2155; var1++) {
            for (int var2 = 0; var2 < class13.field230; var2++) {
                if (class470.field6877[arg0][var1][var2] == null) {
                    class470.field6877[arg0][var1][var2] = new class510(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BC)C", line = 171)
    public static final char method1602(byte arg0, char arg1) {
        field3236++;
        if (arg1 == 'Æ') {
            return 'E';
        }
        if (arg0 != -120) {
            field3245 = null;
        }
        if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILhs;I)I", line = 200)
    public static final int method1603(int arg0, class441 arg1, int arg2) {
        field3240++;
        return arg0 < 101 ? 88 : -1;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 215)
    public final void method1604(int arg0) {
        field3234++;
        class11 var2 = this.field3241;
        synchronized (this.field3241) {
            this.field3241.method90((byte) -27);
            int var3 = -123 / ((arg0 - 42) / 61);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 227)
    public final void method1605(int arg0) {
        if (arg0 != 101) {
            method1603(97, null, -44);
        }
        field3244++;
        class11 var2 = this.field3241;
        synchronized (this.field3241) {
            this.field3241.method84(arg0 ^ 0xFFFFFFF6);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 240)
    public static final void method1606(int arg0, int arg1, int arg2, int arg3) {
        field3239++;
        if (arg3 == 1011) {
            class490.method2933(class71.field878, arg0, arg2);
        } else if (arg3 == 1006) {
            class490.method2933(class516.field7575, arg0, arg2);
        } else if (arg3 == 1010) {
            class490.method2933(class452.field6319, arg0, arg2);
        } else if (arg3 == 1003) {
            class490.method2933(class181.field2371, arg0, arg2);
        } else if (arg3 == 1002) {
            class490.method2933(class502.field7379, arg0, arg2);
        }
        if (arg1 != 2) {
            method1600(36, null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 269)
    public static final void method1607(int arg0, int arg1) {
        if (arg1 != 11613) {
            method1603(-8, null, 64);
        }
        field3233++;
        class436 var2 = class459.method2712(10, arg0, -1759243680);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V", line = 289)
    public final void method1608(int arg0, int arg1) {
        if (arg0 != -30171) {
            field3238 = null;
        }
        field3237++;
        class11 var3 = this.field3241;
        synchronized (this.field3241) {
            this.field3241.method80(-69, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)Ltt;", line = 302)
    public final class245 method1609(int arg0, int arg1) {
        field3235++;
        if (arg0 != -7539) {
            return null;
        }
        class11 var3 = this.field3241;
        class245 var4;
        synchronized (this.field3241) {
            var4 = (class245) this.field3241.method78((long) arg1, (byte) -92);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3242.method1313((byte) -112, 31, arg1);
        class245 var6 = new class245();
        if (var5 != null) {
            var6.method1532(new class88(var5), (byte) -82);
        }
        class11 var7 = this.field3241;
        synchronized (this.field3241) {
            this.field3241.method88((long) arg1, 37, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 331)
    public static void method1610(byte arg0) {
        if (arg0 < 6) {
            method1600(96, null);
        }
        field3245 = null;
        field3238 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 345)
    public class256(class65 arg0, int arg1, class201 arg2) {
        this.field3242 = arg2;
        this.field3242.method1302(-122, 31);
    }
}
