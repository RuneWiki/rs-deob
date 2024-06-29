import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class227 {

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lkh;")
    private class13 field3700 = new class13(64);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lkh;")
    public class13 field3706 = new class13(2);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lul;")
    public class406 field3695;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lul;")
    private class406 field3694;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3697 = new String[5];

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3701 = -1;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public final void method1608(byte arg0) {
        field3702++;
        class13 var2 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method93((byte) 109);
            int var3 = -36 % ((-arg0 - 94) / 32);
        }
        class13 var4 = this.field3706;
        synchronized (this.field3706) {
            this.field3706.method93((byte) 97);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1609(int arg0) {
        if (arg0 == -1) {
            field3697 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    public static final int method1610(int arg0, int arg1) {
        field3699++;
        return arg1 == 255 ? arg0 & 0xFF : 62;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Lgg;")
    public final class119 method1611(int arg0, int arg1) {
        field3696++;
        class13 var3 = this.field3700;
        class119 var4;
        synchronized (this.field3700) {
            var4 = (class119) this.field3700.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field3694;
        byte[] var6;
        synchronized (this.field3694) {
            var6 = this.field3694.method2536(arg0, 0, arg1);
        }
        class119 var7 = new class119();
        var7.field1797 = this;
        if (var6 != null) {
            var7.method894(new class217(var6), -118);
        }
        class13 var8 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public final void method1612(byte arg0) {
        if (arg0 != 25) {
            this.field3700 = null;
        }
        field3705++;
        class13 var2 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method88(arg0 + 91);
        }
        class13 var3 = this.field3706;
        synchronized (this.field3706) {
            this.field3706.method88(117);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method1613(int arg0) {
        field3704++;
        if (class310.field4662 == class261.field4007) {
            return;
        }
        try {
            if (arg0 < 122) {
                field3697 = null;
            }
            class513.method3040("tbrefresh", class150.field2246, 1360);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    public final void method1614(int arg0, int arg1) {
        field3693++;
        class13 var3 = this.field3700;
        synchronized (this.field3700) {
            this.field3700.method91(51, arg0);
        }
        class13 var4 = this.field3706;
        synchronized (this.field3706) {
            if (arg1 == 33) {
                this.field3706.method91(125, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)V")
    public static final void method1615(int arg0, int arg1) {
        class458.field6663 = arg1;
        class324.field4851 = 100;
        field3703++;
        class71.field1026 = arg0;
        class197.field3283 = 3;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lee;ILul;Lul;)V")
    public class227(class480 arg0, int arg1, class406 arg2, class406 arg3) {
        this.field3695 = arg3;
        this.field3694 = arg2;
        this.field3694.method2551(33, -26070);
    }
}
