import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class307 {

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lrp;")
    private class288 field4652 = new class288(128);

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "Lrp;")
    public class288 field4658 = new class288(64);

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Llt;")
    public class458 field4653;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Llt;")
    private class458 field4656;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[I")
    public static int[] field4646 = new int[5];

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)Lgf;")
    public final class173 method1840(byte arg0, int arg1) {
        field4651++;
        class288 var3 = this.field4652;
        class173 var4;
        synchronized (this.field4652) {
            var4 = (class173) this.field4652.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4656.method2715(arg1, 36, false);
        class173 var6 = new class173();
        if (arg0 <= 24) {
            return null;
        }
        var6.field2703 = arg1;
        var6.field2690 = this;
        if (var5 != null) {
            var6.method1085(new class40(var5), Integer.MIN_VALUE);
        }
        var6.method1088(1);
        class288 var7 = this.field4652;
        synchronized (this.field4652) {
            this.field4652.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public final void method1841(int arg0) {
        class288 var2 = this.field4652;
        synchronized (this.field4652) {
            this.field4652.method1761(-111);
        }
        field4648++;
        int var3 = 74 / ((59 - arg0) / 50);
        class288 var4 = this.field4658;
        synchronized (this.field4658) {
            this.field4658.method1761(-118);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Lab;")
    public static final class455 method1842(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4059;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public final void method1843(byte arg0) {
        field4657++;
        if (arg0 > -113) {
            this.method1848(-95, -26, 58);
        }
        class288 var2 = this.field4652;
        synchronized (this.field4652) {
            this.field4652.method1749((byte) 123);
        }
        class288 var3 = this.field4658;
        synchronized (this.field4658) {
            this.field4658.method1749((byte) -12);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
    public final void method1844(int arg0, int arg1) {
        field4654++;
        class288 var3 = this.field4652;
        synchronized (this.field4652) {
            this.field4652.method1760(arg1, 30398);
        }
        if (arg0 < 122) {
            this.method1841(124);
        }
        class288 var4 = this.field4658;
        synchronized (this.field4658) {
            this.field4658.method1760(arg1, 30398);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        field4650++;
        class329.field4937.method1995(((float) class463.field7116.field2968 * 0.1F + 0.7F) * class162.field2533);
        if (arg0 == 4765) {
            class329.field4937.method1941(class238.field3593, class329.field4933, class86.field1499, (float) (class446.field6866 << 0), (float) (class245.field3728 << 0), (float) (class2.field14 << 0));
            class329.field4937.method1914(class207.field3250);
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public static final void method1846(int arg0) {
        field4649++;
        if (arg0 != -20491) {
            method1845(93);
        }
        for (class76 var1 = (class76) class170.field2648.method8((byte) -98); var1 != null; var1 = (class76) class170.field2648.method17((byte) 74)) {
            if (var1.field1360 == -1) {
                var1.field1363 = 0;
                if (var1.field1367 >= 0 && var1.field1359 >= 0 && class150.field2422 > var1.field1367 && var1.field1359 < class21.field272) {
                    client.method1188(var1, (byte) 121);
                }
            } else {
                var1.method1121(false);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIII)V")
    public static final void method1847(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4655++;
        int var5 = 0;
        int var6 = arg0;
        if (arg1 >= -127) {
            field4646 = null;
        }
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class167.method1056(class320.field4818, (byte) -126, class355.field5296, arg0 + arg3);
        int var10 = class167.method1056(class320.field4818, (byte) -123, class355.field5296, arg3 - arg0);
        class78.method566(class69.field1212[arg2], var9, arg4, -7, var10);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg2 - var6;
                int var12 = arg2 + var6;
                if (class248.field3808 <= var12 && class478.field7310 >= var11) {
                    int var13 = class167.method1056(class320.field4818, (byte) -127, class355.field5296, arg3 + var5);
                    int var14 = class167.method1056(class320.field4818, (byte) -128, class355.field5296, arg3 - var5);
                    if (var12 <= class478.field7310) {
                        class78.method566(class69.field1212[var12], var13, arg4, -7, var14);
                    }
                    if (var11 >= class248.field3808) {
                        class78.method566(class69.field1212[var11], var13, arg4, -7, var14);
                    }
                }
            }
            var5++;
            int var15 = arg2 - var5;
            int var16 = arg2 + var5;
            if (var16 >= class248.field3808 && var15 <= class478.field7310) {
                int var17 = class167.method1056(class320.field4818, (byte) -124, class355.field5296, arg3 + var6);
                int var18 = class167.method1056(class320.field4818, (byte) -125, class355.field5296, arg3 - var6);
                if (class478.field7310 >= var16) {
                    class78.method566(class69.field1212[var16], var17, arg4, -7, var18);
                }
                if (class248.field3808 <= var15) {
                    class78.method566(class69.field1212[var15], var17, arg4, -7, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(III)V")
    public final void method1848(int arg0, int arg1, int arg2) {
        this.field4652 = new class288(arg2);
        field4647++;
        if (arg1 > -26) {
            this.field4653 = null;
        }
        this.field4658 = new class288(arg0);
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
    public static void method1849(int arg0) {
        if (arg0 != -359993312) {
            method1846(11);
        }
        field4646 = null;
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lcm;ILlt;Llt;)V")
    public class307(class491 arg0, int arg1, class458 arg2, class458 arg3) {
        this.field4653 = arg3;
        this.field4656 = arg2;
        this.field4656.method2726((byte) 113, 36);
    }
}
