import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "Lcv;")
    private class26 field1854 = new class529();

    @OriginalMember(owner = "client!ofa", name = "r", descriptor = "Lcv;")
    private class26 field1868 = null;

    @OriginalMember(owner = "client!ofa", name = "s", descriptor = "Llc;")
    public static class736 field1869 = class187.method1172(false);

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ofa", name = "i", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ofa", name = "j", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ofa", name = "k", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ofa", name = "l", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ofa", name = "n", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ofa", name = "p", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ofa", name = "q", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "I")
    private int field1872;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "J")
    private long field1871;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "J")
    private long field1874;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "Ldja;")
    public static class44 field1875;

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "Lcaa;")
    private class602 field1873;

    @OriginalMember(owner = "client!ofa", name = "t", descriptor = "Ljava/lang/String;")
    private String field1870;

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "Z")
    private boolean field1858;

    @OriginalMember(owner = "client!ofa", name = "o", descriptor = "Z")
    private volatile boolean field1865;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZLcaa;JLjava/lang/String;)V")
    public final synchronized void method958(int arg0, boolean arg1, class602 arg2, long arg3, String arg4) {
        field1859++;
        this.field1872 = arg0;
        if (arg1) {
            this.field1873 = null;
        }
        this.field1870 = arg4;
        this.field1873 = arg2;
        this.field1871 = arg3;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method959(int arg0) {
        if (arg0 != 1) {
            field1869 = null;
        }
        field1855++;
        return this.field1870;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Z")
    public final synchronized boolean method960(byte arg0) {
        if (arg0 == -82) {
            field1861++;
            return this.field1854.method110((byte) 121, this.field1874);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
    public static void method961(int arg0) {
        field1869 = null;
        if (arg0 < -26) {
            field1875 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V")
    public final void method962(boolean arg0) {
        field1853++;
        this.field1865 = true;
        if (arg0) {
            method961(108);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLcv;)V")
    public final synchronized void method963(byte arg0, class26 arg1) {
        if (arg0 < 87) {
            this.field1865 = true;
        }
        this.field1868 = this.field1854;
        field1862++;
        this.field1854 = arg1;
        this.field1874 = class683.method3903((byte) 4);
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(Z)I")
    public final int method964(boolean arg0) {
        field1860++;
        if (this.field1873 == null) {
            return 0;
        }
        int var2 = this.field1873.method3480(13807);
        if (this.field1873.field8414 && this.field1873.field8423 > this.field1872) {
            return this.field1872 + 1;
        } else if (var2 < 0 || (class386.field5508.length - 1) <= var2) {
            return 100;
        } else if (arg0) {
            return -61;
        } else if (this.field1873.field8416 == this.field1872) {
            return this.field1873.field8423;
        } else {
            return this.field1873.field8416;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V")
    public final synchronized void method965(int arg0) {
        this.field1858 = true;
        if (arg0 != 12160) {
            this.method965(48);
        }
        field1863++;
    }

    @OriginalMember(owner = "client!ofa", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1865) {
            long var1 = class683.method3903((byte) 4);
            synchronized (this) {
                try {
                    this.field1867++;
                    if (this.field1854 instanceof class529) {
                        this.field1854.method114(this.field1858, 30453);
                    } else {
                        long var4 = class683.method3903((byte) 4);
                        if (class111.field1332 == null || this.field1868 == null || this.field1868.method111(-90) == 0 || this.field1874 < var4 - ((long) this.field1868.method111(-76))) {
                            if (this.field1868 != null) {
                                this.field1858 = true;
                                this.field1868.method109(-127);
                                this.field1868 = null;
                            }
                            if (this.field1858) {
                                class670.method3826(true);
                                if (class111.field1332 != null) {
                                    class111.field1332.method230(0);
                                }
                            }
                            this.field1854.method114(this.field1858 || class111.field1332 != null && class111.field1332.method175(), 30453);
                        } else {
                            int var6 = (int) ((var4 - this.field1874) * 255L / (long) this.field1868.method111(-99));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class670.method3826(true);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class111.field1332.method230(0);
                            class318 var10 = class111.field1332.method183(class742.field10226, class249.field3700, true);
                            class111.field1332.method2825(-24127, var10);
                            this.field1868.method114(true, 30453);
                            class111.field1332.method227();
                            var10.method746(0, 0, 0, var8, 1);
                            class111.field1332.method2825(-24127, var10);
                            class111.field1332.method230(0);
                            this.field1854.method114(true, 30453);
                            class111.field1332.method227();
                            var10.method746(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class111.field1332 != null && !(this.field1854 instanceof class529)) {
                                class111.field1332.method2817(false);
                            }
                        } catch (class357 var18) {
                            class502.method2937(var18, (byte) -108, var18.getMessage() + " (Recovered) " + class274.field3958.method773((byte) -125));
                            class532.method3154(0, true, 1);
                        }
                    }
                    Container var12;
                    if (class43.field453 != null) {
                        var12 = class43.field453;
                    } else if (class511.field7007 == null) {
                        var12 = class785.field10774;
                    } else {
                        var12 = class511.field7007;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class43.field453 == var12) {
                        class43.field453.getInsets();
                    }
                    this.field1858 = false;
                    if (class111.field1332 != null && !(this.field1854 instanceof class529) && this.field1873.method3480(13807) < class602.field8441.method3480(13807)) {
                        class189.method1181(-1);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class683.method3903((byte) 4);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class730.method4066((byte) -45, (long) var15);
            }
        }
        field1864++;
    }

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "(I)I")
    public final int method966(int arg0) {
        if (arg0 <= 29) {
            field1875 = null;
        }
        field1856++;
        return this.field1867;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)Lcaa;")
    public final class602 method967(byte arg0) {
        int var2 = 127 % ((-arg0 - 74) / 32);
        field1857++;
        return this.field1873;
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(Z)J")
    public final long method968(boolean arg0) {
        if (arg0) {
            this.field1854 = null;
        }
        field1851++;
        return this.field1871;
    }

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "(I)I")
    public final int method969(int arg0) {
        if (arg0 != 0) {
            this.method962(false);
        }
        field1852++;
        return this.field1872;
    }
}
