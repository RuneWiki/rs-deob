import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class516 {

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lvh;")
    private class328 field7050 = new class328(128);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lvh;")
    public class328 field7052 = new class328(64);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lpj;")
    public class132 field7042;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lpj;")
    private class132 field7045;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
    public static int[] field7047 = new int[32];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field7043;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLva;)V", line = 9)
    public static final void method2865(byte arg0, class457 arg1) {
        field7051++;
        boolean var2 = false;
        if (class239.field3440 == arg1.field6434 || arg1.field6398 == -1 || arg1.field6427 != 0) {
            var2 = true;
        } else {
            class131 var3 = class301.field4465.method2763(arg1.field6398, arg0 ^ 0xFFFF846B);
            if (var3.field1788 || var3.field1810[arg1.field6450] < arg1.field6413 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field6434 - arg1.field6470;
            int var5 = class239.field3440 - arg1.field6470;
            int var6 = arg1.field6422 * 512 + arg1.method1722((byte) -123) * 256;
            int var7 = arg1.field6411 * 512 + (arg1.method1722((byte) -121) * 256);
            int var8 = arg1.field6408 * 512 + (arg1.method1722((byte) -123) * 256);
            int var9 = arg1.field6452 * 512 + arg1.method1722((byte) -120) * 256;
            arg1.field514 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg1.field509 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field6479 = 0;
        if (arg1.field6465 == 0) {
            arg1.method2644(-98, 8192, false);
        }
        if (arg1.field6465 == 1) {
            arg1.method2644(-128, 12288, false);
        }
        if (arg1.field6465 == 2) {
            arg1.method2644(-127, 0, false);
        }
        if (arg1.field6465 == 3) {
            arg1.method2644(-104, 4096, false);
        }
        if (arg0 != -69) {
            method2869(-30, 116);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V", line = 67)
    public final void method2866(byte arg0, int arg1) {
        class328 var3 = this.field7050;
        synchronized (this.field7050) {
            if (arg0 != -9) {
                this.field7042 = null;
            }
            this.field7050.method1989(arg1, (byte) 92);
        }
        field7049++;
        class328 var4 = this.field7052;
        synchronized (this.field7052) {
            this.field7052.method1989(arg1, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V", line = 83)
    public final void method2867(int arg0, int arg1, int arg2) {
        if (arg0 != 75) {
            this.method2872((byte) 22, 53);
        }
        field7041++;
        this.field7050 = new class328(arg1);
        this.field7052 = new class328(arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 95)
    public static void method2868(byte arg0) {
        field7043 = null;
        int var1 = 118 / ((-arg0 - 47) / 57);
        field7047 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 109)
    public static final void method2869(int arg0, int arg1) {
        class675.field9543 = -1;
        if (arg0 == 37) {
            class148.field2194 = 3.0F;
        } else if (arg0 == 50) {
            class148.field2194 = 4.0F;
        } else if (arg0 == 75) {
            class148.field2194 = 6.0F;
        } else if (arg0 == 100) {
            class148.field2194 = 8.0F;
        } else if (arg0 == 200) {
            class148.field2194 = 16.0F;
        }
        if (arg1 != -16651) {
            field7043 = null;
        }
        field7040++;
        class675.field9543 = -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 144)
    public final void method2870(int arg0) {
        field7044++;
        class328 var2 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method1987(-31085);
            if (arg0 <= 104) {
                this.field7045 = null;
            }
        }
        class328 var3 = this.field7052;
        synchronized (this.field7052) {
            this.field7052.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 163)
    public final void method2871(int arg0) {
        class328 var2 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method1997(1);
        }
        field7046++;
        class328 var3 = this.field7052;
        synchronized (this.field7052) {
            this.field7052.method1997(1);
            if (arg0 != 37) {
                this.field7052 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)Lvu;", line = 180)
    public final class307 method2872(byte arg0, int arg1) {
        field7048++;
        class328 var3 = this.field7050;
        class307 var4;
        synchronized (this.field7050) {
            var4 = (class307) this.field7050.method1986((byte) -100, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 <= 116) {
            this.field7052 = null;
        }
        class132 var5 = this.field7045;
        byte[] var6;
        synchronized (this.field7045) {
            var6 = this.field7045.method940(36, arg1, 0);
        }
        class307 var7 = new class307();
        var7.field4505 = this;
        var7.field4535 = arg1;
        if (var6 != null) {
            var7.method1882(true, new class96(var6));
        }
        var7.method1880((byte) 127);
        class328 var8 = this.field7050;
        synchronized (this.field7050) {
            this.field7050.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ldd;ILpj;Lpj;)V", line = 219)
    public class516(class647 arg0, int arg1, class132 arg2, class132 arg3) {
        this.field7042 = arg3;
        this.field7045 = arg2;
        this.field7045.method936(36, -115);
    }
}
