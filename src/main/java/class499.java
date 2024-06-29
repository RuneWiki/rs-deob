import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class499 {

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Lwf;")
    private class117 field7076 = new class117(64);

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "Lwf;")
    private class117 field7082 = new class117(100);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Lkda;")
    private class328 field7073;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7078 = null;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 5)
    public final void method2977(byte arg0) {
        if (arg0 != -7) {
            return;
        }
        class117 var2 = this.field7076;
        synchronized (this.field7076) {
            this.field7076.method846(0);
        }
        field7079++;
        class117 var3 = this.field7082;
        synchronized (this.field7082) {
            this.field7082.method846(arg0 + 7);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V", line = 27)
    public final void method2978(int arg0, int arg1) {
        class117 var3 = this.field7076;
        synchronized (this.field7076) {
            this.field7076.method834(arg0, arg1 ^ arg1);
        }
        field7074++;
        class117 var4 = this.field7082;
        synchronized (this.field7082) {
            this.field7082.method834(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)V", line = 41)
    public static final void method2979(int arg0, int arg1) {
        if (arg1 <= -38) {
            field7077++;
            class221 var2 = class65.method413(1, arg0, (byte) -120);
            var2.method1432(0);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V", line = 54)
    public static void method2980(int arg0) {
        if (arg0 == 100) {
            field7078 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V", line = 66)
    public final void method2981(boolean arg0) {
        field7081++;
        class117 var2 = this.field7076;
        synchronized (this.field7076) {
            this.field7076.method837(126);
        }
        if (arg0) {
            class117 var3 = this.field7082;
            synchronized (this.field7082) {
                this.field7082.method837(127);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;Lkda;)V", line = 153)
    public class499(class39 arg0, int arg1, class328 arg2, class328 arg3, class328 arg4) {
        this.field7073 = arg2;
        if (this.field7073 != null) {
            int var6 = this.field7073.method1974(-8588) - 1;
            this.field7073.method1975(120, var6);
        }
        class27.method184(arg4, false, arg3);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)Lgm;", line = 89)
    public final class106 method2982(int arg0, int arg1) {
        field7080++;
        int var3 = -14 / ((-arg1 - 70) / 36);
        class117 var4 = this.field7082;
        class106 var5;
        synchronized (this.field7082) {
            var5 = (class106) this.field7082.method842(0, (long) arg0);
            if (var5 == null) {
                var5 = new class106(arg0);
                this.field7082.method835((byte) 125, (long) arg0, var5);
            }
        }
        synchronized (var5) {
            return var5.method785((byte) 124) ? var5 : null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(II)Ltt;", line = 117)
    public final class78 method2983(int arg0, int arg1) {
        field7075++;
        class117 var3 = this.field7076;
        class78 var4;
        synchronized (this.field7076) {
            var4 = (class78) this.field7076.method842(0, (long) arg0);
            if (arg1 > -102) {
                this.field7076 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field7073;
        byte[] var6;
        synchronized (this.field7073) {
            var6 = this.field7073.method1966(class639.method3700(arg0, 5), class152.method1113(arg0, -1114009241), true);
        }
        class78 var7 = new class78();
        var7.field1050 = arg0;
        var7.field1044 = this;
        if (var6 != null) {
            var7.method604(new class148(var6), true);
        }
        var7.method601(-27601);
        class117 var8 = this.field7076;
        synchronized (this.field7076) {
            this.field7076.method835((byte) 124, (long) arg0, var7);
            return var7;
        }
    }
}
