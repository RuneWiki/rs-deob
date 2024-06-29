import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class572 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lh;")
    private class571 field7885 = new class571(64);

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lh;")
    public class571 field7895 = new class571(64);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lan;")
    private class21 field7884;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lan;")
    public class21 field7892;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field7887 = new int[32];

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7886 = null;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lan;")
    public static class21 field7893;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lha;")
    public static class52 field7888;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method3254(int arg0) {
        if (arg0 == 19857) {
            field7888 = null;
            field7886 = null;
            field7887 = null;
            field7893 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public final void method3255(int arg0, int arg1, int arg2) {
        this.field7885 = new class571(arg0);
        if (arg2 != -1) {
            this.field7885 = null;
        }
        field7881++;
        this.field7895 = new class571(arg1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lvu;")
    public final class283 method3256(int arg0, byte arg1) {
        if (arg1 != 23) {
            return null;
        }
        field7882++;
        class571 var3 = this.field7885;
        class283 var4;
        synchronized (this.field7885) {
            var4 = (class283) this.field7885.method3252((long) arg0, (byte) 95);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field7884;
        byte[] var6;
        synchronized (this.field7884) {
            var6 = this.field7884.method240(34, arg0, (byte) -124);
        }
        class283 var7 = new class283();
        var7.field3902 = this;
        if (var6 != null) {
            var7.method1819(new class11(var6), (byte) -79);
        }
        class571 var8 = this.field7885;
        synchronized (this.field7885) {
            this.field7885.method3243(var7, (long) arg0, arg1 - 129);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public final void method3257(int arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field7894++;
        class571 var3 = this.field7885;
        synchronized (this.field7885) {
            this.field7885.method3253(arg0, -124);
        }
        class571 var4 = this.field7895;
        synchronized (this.field7895) {
            this.field7895.method3253(arg0, -125);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method3258(int arg0) {
        if (arg0 > -90) {
            return;
        }
        class571 var2 = this.field7885;
        synchronized (this.field7885) {
            this.field7885.method3246(false);
        }
        field7883++;
        class571 var3 = this.field7895;
        synchronized (this.field7895) {
            this.field7895.method3246(false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static final void method3259(int arg0) {
        field7890++;
        class571 var1 = class65.field1110;
        synchronized (class65.field1110) {
            class65.field1110.method3246(false);
            if (arg0 != -1) {
                field7893 = null;
            }
        }
        class571 var2 = class384.field5141;
        synchronized (class384.field5141) {
            class384.field5141.method3246(false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public final void method3260(int arg0) {
        class571 var2 = this.field7885;
        synchronized (this.field7885) {
            this.field7885.method3248(arg0 + arg0);
        }
        field7889++;
        class571 var3 = this.field7895;
        synchronized (this.field7895) {
            this.field7895.method3248(0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLbe;)I")
    public static final int method3261(boolean arg0, class33 arg1) {
        field7891++;
        if (arg1.field610 == 0) {
            return 0;
        } else if (arg0) {
            return -58;
        } else {
            if (arg1.field532 != -1) {
                class33 var2 = null;
                if (arg1.field532 < 32768) {
                    class576 var3 = (class576) class278.field3837.method1242(0, (long) arg1.field532);
                    if (var3 != null) {
                        var2 = var3.field7929;
                    }
                } else if (arg1.field532 >= 32768) {
                    var2 = class349.field4696[arg1.field532 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg1.field6037 - var2.field6037;
                    int var5 = arg1.field6029 - var2.field6029;
                    if (var4 != 0 || var5 != 0) {
                        arg1.method348((byte) 28, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            }
            if (arg1 instanceof class188) {
                class188 var6 = (class188) arg1;
                if (var6.field2652 != -1 && (var6.field617 == 0 || var6.field619 > 0)) {
                    var6.method348((byte) 28, var6.field2652);
                    var6.field2652 = -1;
                }
            } else if (arg1 instanceof class109) {
                class109 var7 = (class109) arg1;
                if (var7.field1685 != -1 && (var7.field617 == 0 || var7.field619 > 0)) {
                    int var8 = var7.field6037 - ((var7.field1685 - class519.field7304 - class519.field7304) * 64);
                    int var9 = var7.field6029 - ((var7.field1673 - class6.field80 - class6.field80) * 64);
                    if (var8 != 0 || var9 != 0) {
                        var7.method348((byte) 28, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                    }
                    var7.field1685 = -1;
                }
            }
            return arg1.method334(-119);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lhu;ILan;Lan;)V")
    public class572(class111 arg0, int arg1, class21 arg2, class21 arg3) {
        this.field7884 = arg2;
        this.field7892 = arg3;
        this.field7884.method231(34, -118);
    }
}
