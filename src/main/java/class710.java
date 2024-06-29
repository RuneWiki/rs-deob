import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class710 implements Runnable {

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "Lge;")
    private class708 field9860 = new class332();

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "Lge;")
    private class708 field9878 = null;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "I")
    private int field9873;

    @OriginalMember(owner = "client!ega", name = "w", descriptor = "I")
    private int field9875;

    @OriginalMember(owner = "client!ega", name = "x", descriptor = "J")
    private long field9876;

    @OriginalMember(owner = "client!ega", name = "y", descriptor = "J")
    private long field9877;

    @OriginalMember(owner = "client!ega", name = "A", descriptor = "Lkf;")
    private class252 field9879;

    @OriginalMember(owner = "client!ega", name = "v", descriptor = "Ljava/lang/String;")
    private String field9874;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "Z")
    private volatile boolean field9865;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "Z")
    private boolean field9869;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "[Lkba;")
    public static class105[] field9861;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZLjb;Ljb;)V")
    public static final void method3982(boolean arg0, class493 arg1, class493 arg2) {
        if (arg0) {
            return;
        }
        class132.field1943++;
        field9867++;
        class519 var3 = class357.method2293(class427.field5994, class62.field773, (byte) 64);
        var3.field7384.method3733(-49, arg1.field6956);
        var3.field7384.method3718((byte) 50, arg1.field6952);
        var3.field7384.method3718((byte) 69, arg2.field6944);
        var3.field7384.method3690(21, arg2.field6956);
        var3.field7384.method3718((byte) 111, arg1.field6944);
        var3.field7384.method3745(-119, arg2.field6952);
        class151.method1027(var3, -110);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method3983(int arg0, int arg1) {
        field9859++;
        if (arg1 != 1677133712) {
            field9861 = null;
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFE3C4) >> 16) + "." + ((arg0 & 0xFF2E) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method3984(byte arg0) {
        field9871++;
        if (arg0 != -45) {
            this.field9878 = null;
        }
        return this.field9874;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V")
    public static void method3985(byte arg0) {
        field9861 = null;
        if (arg0 >= -59) {
            method3983(31, -25);
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(B)Lkf;")
    public final class252 method3986(byte arg0) {
        field9854++;
        int var2 = 85 % ((arg0 - 8) / 49);
        return this.field9879;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lkf;Ljava/lang/String;JIB)V")
    public final synchronized void method3987(class252 arg0, String arg1, long arg2, int arg3, byte arg4) {
        this.field9875 = arg3;
        if (arg4 > 112) {
            field9870++;
            this.field9874 = arg1;
            this.field9879 = arg0;
            this.field9876 = arg2;
        }
    }

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "(B)V")
    public final synchronized void method3988(byte arg0) {
        if (arg0 == 1) {
            this.field9869 = true;
            field9866++;
        }
    }

    @OriginalMember(owner = "client!ega", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field9865) {
            long var1 = class479.method2864((byte) -72);
            synchronized (this) {
                try {
                    this.field9873++;
                    if (this.field9860 instanceof class332) {
                        this.field9860.method187(this.field9869, 13751);
                    } else {
                        long var4 = class479.method2864((byte) -114);
                        if (class268.field3831 == null || this.field9878 == null || this.field9878.method188((byte) 119) == 0 || this.field9877 < (var4 - ((long) this.field9878.method188((byte) 118)))) {
                            if (this.field9878 != null) {
                                this.field9869 = true;
                                this.field9878.method190(true);
                                this.field9878 = null;
                            }
                            if (this.field9869) {
                                class619.method3481((byte) 79);
                                if (class268.field3831 != null) {
                                    class268.field3831.method429(0);
                                }
                            }
                            this.field9860.method187(this.field9869 || class268.field3831 != null && class268.field3831.method471(), 13751);
                        } else {
                            int var6 = (int) ((var4 - this.field9877) * 255L / (long) this.field9878.method188((byte) 124));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            class619.method3481((byte) 112);
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class268.field3831.method429(0);
                            class88 var10 = class268.field3831.method380(class446.field6323, class172.field2348, true);
                            class268.field3831.method401((byte) 26, var10);
                            this.field9878.method187(true, 13751);
                            class268.field3831.method412();
                            var10.method672(0, 0, 0, var9, 1);
                            class268.field3831.method401((byte) 26, var10);
                            class268.field3831.method429(0);
                            this.field9860.method187(true, 13751);
                            class268.field3831.method412();
                            var10.method672(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class268.field3831 != null && !(this.field9860 instanceof class332)) {
                                class268.field3831.method452(0);
                            }
                        } catch (class76 var18) {
                            class248.method1583((byte) -116, var18.getMessage() + " (Recovered) " + class499.field7161.method1957(true), var18);
                            class759.method4212(true, 0, 0);
                        }
                    }
                    Container var12;
                    if (class387.field5484 != null) {
                        var12 = class387.field5484;
                    } else if (class213.field2800 == null) {
                        var12 = class125.field1524;
                    } else {
                        var12 = class213.field2800;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class387.field5484 == var12) {
                        class387.field5484.getInsets();
                    }
                    this.field9869 = false;
                    if (class268.field3831 != null && !(this.field9860 instanceof class332) && this.field9879.method1671((byte) -110) < class252.field3685.method1671((byte) -110)) {
                        class96.method705((byte) -123);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class479.method2864((byte) -90);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class756.method4205((long) var15, 0);
            }
        }
        field9872++;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(III)Z")
    public static final boolean method3989(int arg0, int arg1, int arg2) {
        field9862++;
        if (arg0 == 458752) {
            return (arg1 & 0x70000) != 0 | class18.method107(arg1, (byte) 126, arg2) || class661.method3623((byte) 87, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "(B)V")
    public final void method3990(byte arg0) {
        field9864++;
        this.field9865 = true;
        int var2 = 64 / ((arg0 + 39) / 42);
    }

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "(B)Z")
    public final synchronized boolean method3991(byte arg0) {
        field9868++;
        return arg0 > -11 ? false : this.field9860.method185(this.field9877, 14320);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)I")
    public final int method3992(boolean arg0) {
        if (arg0) {
            return 6;
        } else {
            field9853++;
            return this.field9873;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)I")
    public final int method3993(int arg0) {
        field9863++;
        if (arg0 != -1) {
            this.field9874 = null;
        }
        return this.field9875;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lge;B)V")
    public final synchronized void method3994(class708 arg0, byte arg1) {
        field9858++;
        this.field9878 = this.field9860;
        this.field9860 = arg0;
        if (arg1 != -30) {
            method3982(false, null, null);
        }
        this.field9877 = class479.method2864((byte) -80);
    }

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "(B)I")
    public final int method3995(byte arg0) {
        field9855++;
        if (this.field9879 == null) {
            return 0;
        }
        int var2 = -73 / ((-arg0 - 56) / 47);
        int var3 = this.field9879.method1671((byte) -110);
        if (this.field9879.field3660 && this.field9875 < this.field9879.field3664) {
            return this.field9875 + 1;
        } else if (var3 >= 0 && class723.field10083.length - 1 > var3) {
            return this.field9879.field3659 == this.field9875 ? this.field9879.field3664 : this.field9879.field3659;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)J")
    public final long method3996(int arg0) {
        if (arg0 <= 78) {
            return -128L;
        } else {
            field9857++;
            return this.field9876;
        }
    }
}
