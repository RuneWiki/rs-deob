import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class743 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Laq;")
    private class494 field10327 = new class494(128);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Laq;")
    public class494 field10332 = new class494(64);

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lgga;")
    public class513 field10320;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lgga;")
    private class513 field10322;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field10326 = -1;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 6)
    public static final void method4102(int arg0) {
        field10318++;
        class681.field9656.method685(123);
        class754.field10496.method3062(-126);
        class199.field2988.method890(true);
        class213.field3128.setBackground(Color.black);
        class538.field7471 = arg0;
        class681.field9656 = class39.method293(class213.field3128, true);
        class754.field10496 = class244.method1622(class213.field3128, true, true);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 21)
    public final void method4103(int arg0) {
        class494 var2 = this.field10327;
        synchronized (this.field10327) {
            this.field10327.method2893((byte) -84);
        }
        field10328++;
        class494 var3 = this.field10332;
        synchronized (this.field10332) {
            this.field10332.method2893((byte) -128);
            if (arg0 != -14467) {
                field10323 = 126;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 37)
    public static final int method4104(String arg0, int arg1) {
        field10330++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 >= 0) {
            return -81;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = arg0.charAt(var4) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lll;", line = 61)
    public final class548 method4105(int arg0, int arg1) {
        field10324++;
        class494 var3 = this.field10327;
        class548 var4;
        synchronized (this.field10327) {
            var4 = (class548) this.field10327.method2882((long) arg0, (byte) -85);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field10322;
        byte[] var6;
        synchronized (this.field10322) {
            var6 = this.field10322.method3019(36, arg0, 76);
        }
        class548 var7 = new class548();
        var7.field7587 = arg0;
        var7.field7614 = this;
        if (var6 != null) {
            var7.method3172(new class431(var6), 28542);
        }
        var7.method3166((byte) -116);
        class494 var8 = this.field10327;
        synchronized (this.field10327) {
            if (arg1 >= -64) {
                field10323 = 23;
            }
            this.field10327.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[II[ILlea;I)Lbga;", line = 94)
    public static final class410 method4106(byte arg0, int[] arg1, int arg2, int[] arg3, class573 arg4, int arg5) {
        field10325++;
        byte[] var6 = new byte[arg2 * arg5];
        for (int var7 = 0; var7 < arg2; var7++) {
            int var8 = arg5 * var7 + arg3[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg0 == -1) {
            return new class410(arg4, arg5, arg2, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V", line = 128)
    public final void method4107(boolean arg0, int arg1, int arg2) {
        field10331++;
        if (arg0) {
            this.method4105(-51, -16);
        }
        this.field10327 = new class494(arg2);
        this.field10332 = new class494(arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V", line = 140)
    public final void method4108(byte arg0, int arg1) {
        field10319++;
        class494 var3 = this.field10327;
        synchronized (this.field10327) {
            this.field10327.method2888(arg1, arg0 + 14);
        }
        class494 var4 = this.field10332;
        synchronized (this.field10332) {
            this.field10332.method2888(arg1, 117);
        }
        if (arg0 != 107) {
            this.method4105(-126, -120);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V", line = 160)
    public static final void method4109(int arg0) {
        field10317++;
        client var1 = class199.field2988;
        synchronized (class199.field2988) {
            if (arg0 == 2 && class259.field3676 == null) {
                Container var2;
                if (class410.field5617 != null) {
                    var2 = class410.field5617;
                } else if (class343.field4881 == null) {
                    var2 = class149.field2396;
                } else {
                    var2 = class343.field4881;
                }
                class688.field9724 = var2.getSize().width;
                class668.field9393 = var2.getSize().height;
                if (class410.field5617 == var2) {
                    Insets var3 = class410.field5617.getInsets();
                    class688.field9724 -= var3.right + var3.left;
                    class668.field9393 -= var3.top + var3.bottom;
                }
                if (class388.method2333((byte) 47) == 1) {
                    class424.field5897 = 0;
                    class728.field10160 = (class688.field9724 - class499.field6858) / 2;
                    class709.field9923 = class499.field6858;
                    class448.field6174 = class381.field5334;
                } else {
                    class661.method3705(119);
                }
                if (class94.field1340 != class145.field2353) {
                    boolean var10000;
                    if (class709.field9923 < 1024 && class448.field6174 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class213.field3128.setSize(class709.field9923, class448.field6174);
                if (class686.field9702 != null) {
                    if (class593.field8489) {
                        class617.method3547(class213.field3128, 107);
                    } else {
                        class686.field9702.method432(class213.field3128, class709.field9923, class448.field6174);
                    }
                }
                if (class410.field5617 == var2) {
                    Insets var4 = class410.field5617.getInsets();
                    class213.field3128.setLocation(var4.left + class728.field10160, class424.field5897 + var4.top);
                } else {
                    class213.field3128.setLocation(class728.field10160, class424.field5897);
                }
                if (class379.field5314 != -1) {
                    class106.method857(true, 0);
                }
                class39.method294((byte) 83);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V", line = 277)
    public class743(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field10320 = arg3;
        this.field10322 = arg2;
        this.field10322.method3007(-1, 36);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 255)
    public final void method4110(int arg0) {
        field10321++;
        class494 var2 = this.field10327;
        synchronized (this.field10327) {
            this.field10327.method2881((byte) -36);
        }
        if (arg0 != -9740) {
            method4106((byte) 31, null, -78, null, null, -28);
        }
        class494 var3 = this.field10332;
        synchronized (this.field10332) {
            this.field10332.method2881((byte) -43);
        }
    }
}
