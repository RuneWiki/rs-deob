import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class226 implements Runnable {

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Lcc;")
    private class237 field3850 = new class237();

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Z")
    private boolean field3851 = false;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public int field3854 = 0;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3853;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Lcd;")
    public static class64 field3835 = class44.method335((byte) 71, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field3847 = -1;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Lcd;")
    private static class64 field3852 = class44.method335((byte) 71, "slide:");

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field3855 = 0;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Lcd;")
    public static class64 field3841 = field3852;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lcd;")
    public static class64 field3846 = field3852;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "Lqm;")
    public static class222 field3843;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILuj;)V", line = 4)
    private final void method1632(int arg0, class134 arg1) {
        field3842++;
        class237 var3 = this.field3850;
        synchronized (this.field3850) {
            if (arg0 == 5484) {
                this.field3850.method1694(arg1, 0);
                this.field3854++;
                this.field3850.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1633(int arg0) {
        field3848++;
        class149.field2616.method1198(false);
        class12.field231.method1198(false);
        if (arg0 <= -110) {
            class168.field2926.method1198(false);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 37)
    public final void method1634(int arg0) {
        this.field3851 = true;
        class237 var2 = this.field3850;
        synchronized (this.field3850) {
            this.field3850.notifyAll();
        }
        field3836++;
        try {
            this.field3853.join();
        } catch (InterruptedException var5) {
        }
        if (arg0 == 0) {
            this.field3853 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILih;I)Luj;", line = 59)
    public final class134 method1635(int arg0, class30 arg1, int arg2) {
        class134 var4 = new class134();
        var4.field2387 = arg1;
        var4.field2312 = (long) arg0;
        var4.field965 = false;
        var4.field2371 = 3;
        if (arg2 >= -79) {
            return (class134) null;
        } else {
            this.method1632(5484, var4);
            field3840++;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 76)
    public static void method1636(int arg0) {
        field3835 = null;
        field3852 = null;
        if (arg0 != -609217497) {
            field3855 = -100;
        }
        field3846 = null;
        field3841 = null;
        field3843 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZZ)V", line = 91)
    public static final void method1637(boolean arg0, boolean arg1) {
        if (!arg0) {
            field3847 = 69;
        }
        if ((class139.field2472.field1859 >> 7) == class40.field631 && (class139.field2472.field1865 >> 7) == class12.field233) {
            class40.field631 = 0;
        }
        int var2 = class163.field2862;
        field3844++;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class41 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class139.field2472;
            } else {
                var6 = class284.field4888[class194.field3307[var3]];
                var4 = (long) class194.field3307[var3] << 32;
            }
            if (var6 != null && var6.method318(4)) {
                var6.field657 = false;
                if ((class117.field2136 && class163.field2862 > 200 || class163.field2862 > 50) && !arg1 && var6.field1901 == var6.field1896) {
                    var6.field657 = true;
                }
                int var7 = var6.field1859 >> 7;
                int var8 = var6.field1865 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field664 == null || var6.field648 > class29.field482 || class29.field482 >= var6.field654) {
                        if (var6.method325(-12808) == 1 && (var6.field1859 & 0x7F) == 64 && (var6.field1865 & 0x7F) == 64) {
                            if (class273.field4678[var7][var8] == class26.field426) {
                                continue;
                            }
                            class273.field4678[var7][var8] = class26.field426;
                        }
                        var6.field1910 = class15.method169(var6.field1865, 13257, class20.field364, var6.field1859);
                        class11.method93(class20.field364, var6.field1859, var6.field1865, var6.field1910, (var6.method325(-12808) * 64 + 60) - 64, var6, var6.field1863, var4, var6.field1849);
                    } else {
                        var6.field657 = false;
                        var6.field1910 = class15.method169(var6.field1865, 13257, class20.field364, var6.field1859);
                        class117.method830(class20.field364, var6.field1859, var6.field1865, var6.field1910, var6, var6.field1863, var4, var6.field635, var6.field647, var6.field674, var6.field673);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILih;[BB)Luj;", line = 181)
    public final class134 method1638(int arg0, class30 arg1, byte[] arg2, byte arg3) {
        int var5 = 28 % ((62 - arg3) / 60);
        field3849++;
        class134 var6 = new class134();
        var6.field965 = false;
        var6.field2387 = arg1;
        var6.field2371 = 2;
        var6.field2312 = (long) arg0;
        var6.field2375 = arg2;
        this.method1632(5484, var6);
        return var6;
    }

    @OriginalMember(owner = "client!jm", name = "run", descriptor = "()V", line = 200)
    public final void run() {
        field3839++;
        while (!this.field3851) {
            class237 var1 = this.field3850;
            class134 var2;
            synchronized (this.field3850) {
                var2 = (class134) this.field3850.method1697(100);
                if (var2 == null) {
                    try {
                        this.field3850.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3854--;
            }
            try {
                if (var2.field2371 == 2) {
                    var2.field2387.method260(var2.field2375, (byte) 63, (int) var2.field2312, var2.field2375.length);
                } else if (var2.field2371 == 3) {
                    var2.field2375 = var2.field2387.method261(0, (int) var2.field2312);
                }
            } catch (Exception var6) {
                class309.method2146((byte) -113, (String) null, var6);
            }
            var2.field961 = false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(ILih;I)Luj;", line = 250)
    public final class134 method1639(int arg0, class30 arg1, int arg2) {
        field3838++;
        class134 var4 = new class134();
        var4.field2371 = 1;
        class237 var5 = this.field3850;
        synchronized (this.field3850) {
            class134 var6 = (class134) this.field3850.method1698((byte) -109);
            if (arg0 != -3) {
                return (class134) null;
            }
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field2312 && var6.field2387 == arg1 && var6.field2371 == 2) {
                    var4.field961 = false;
                    var4.field2375 = var6.field2375;
                    return var4;
                }
                var6 = (class134) this.field3850.method1693(123);
            }
        }
        var4.field2375 = arg1.method261(0, arg2);
        var4.field961 = false;
        var4.field965 = true;
        return var4;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 307)
    public class226() {
        class22 var1 = class228.field3876.method1958(5, this, 16711);
        while (var1.field375 == 0) {
            class267.method1871(10, 10L);
        }
        if (var1.field375 == 2) {
            throw new RuntimeException();
        }
        this.field3853 = (Thread) var1.field377;
    }
}
