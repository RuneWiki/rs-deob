import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class530 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lpca;")
    private class714 field7457 = new class714(128);

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Lpca;")
    public class714 field7469 = new class714(64);

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lfp;")
    private class323 field7463;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lfp;")
    public class323 field7466;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lqfa;")
    public static class98 field7468 = new class98(67, 6);

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field7471 = 2;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "Lfp;")
    public static class323 field7473;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Llp;")
    public static class391 field7470;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3084(int arg0) {
        while (true) {
            if (class89.field1072.method3829(class398.field5617, -3) >= 15) {
                int var1 = class89.field1072.method3821(15, (byte) 108);
                if (var1 != 32767) {
                    boolean var2 = false;
                    class740 var3 = (class740) class373.field5230.method1180((byte) 26, (long) var1);
                    if (var3 == null) {
                        class468 var4 = new class468();
                        var4.field7958 = var1;
                        var3 = new class740(var4);
                        class373.field5230.method1179((long) var1, var3, (byte) -26);
                        class30.field399[class438.field6239++] = var3;
                        var2 = true;
                    }
                    class468 var5 = var3.field10289;
                    class100.field1196[class344.field4849++] = var1;
                    var5.field7961 = class199.field2625;
                    if (var5.field6632 != null && var5.field6632.method2274(112)) {
                        class365.method2323(-107, var5);
                    }
                    int var6 = class89.field1072.method3821(1, (byte) 108);
                    int var7 = class89.field1072.method3821(1, (byte) 108);
                    if (var7 == 1) {
                        class133.field1949[class504.field7232++] = var1;
                    }
                    var5.method2789(-1, class231.field3110.method2797(class89.field1072.method3821(14, (byte) 108), false));
                    int var8 = class89.field1072.method3821(3, (byte) 108) + 4 << 11 & 0x3E3C;
                    int var9 = class89.field1072.method3821(5, (byte) 108);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    int var10 = class89.field1072.method3821(2, (byte) 108);
                    int var11 = class89.field1072.method3821(5, (byte) 108);
                    if (var11 > 15) {
                        var11 -= 32;
                    }
                    var5.method3243(101, var5.field6632.field5051);
                    var5.field7959 = var5.field6632.field5035 << 3;
                    if (var2) {
                        var5.method3248(true, -122, var8);
                    }
                    var5.method2794(var6 == 1, var5.method1835((byte) 127), var10, class660.field9039.field8015[0] + var11, (byte) 75, class660.field9039.field8009[0] + var9);
                    if (var5.field6632.method2274(96)) {
                        class209.method1283(null, var5.field8015[0], 0, null, var5.field1266, var5.field8009[0], 64, var5);
                    }
                    continue;
                }
            }
            field7460++;
            if (arg0 < 37) {
                field7470 = null;
            }
            class89.field1072.method3827((byte) 109);
            return;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 84)
    public final void method3085(byte arg0) {
        class714 var2 = this.field7457;
        synchronized (this.field7457) {
            this.field7457.method4023((byte) 123);
        }
        if (arg0 != -86) {
            this.method3093((byte) -89, -87);
        }
        field7472++;
        class714 var3 = this.field7469;
        synchronized (this.field7469) {
            this.field7469.method4023((byte) -124);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBI)V", line = 100)
    public final void method3086(int arg0, byte arg1, int arg2) {
        this.field7457 = new class714(arg2);
        if (arg1 == -16) {
            field7467++;
            this.field7469 = new class714(arg0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 115)
    public static final int method3087(String arg0, int arg1) {
        field7464++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 25 % ((arg1 + 66) / 51);
        for (int var3 = 0; var3 < class215.field2828; var3++) {
            if (arg0.equalsIgnoreCase(class703.field9786[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lafa;", line = 141)
    public final class344 method3088(byte arg0, int arg1) {
        field7458++;
        class714 var3 = this.field7457;
        class344 var4;
        synchronized (this.field7457) {
            var4 = (class344) this.field7457.method4022((long) arg1, (byte) 78);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field7463;
        byte[] var6;
        synchronized (this.field7463) {
            var6 = this.field7463.method2100(arg1, (byte) 112, 36);
        }
        class344 var7 = new class344();
        if (arg0 >= -68) {
            return null;
        }
        var7.field4833 = arg1;
        var7.field4823 = this;
        if (var6 != null) {
            var7.method2226(new class675(var6), -1961);
        }
        var7.method2224((byte) -114);
        class714 var8 = this.field7457;
        synchronized (this.field7457) {
            this.field7457.method4018((byte) 124, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V", line = 174)
    public static void method3089(byte arg0) {
        field7470 = null;
        field7473 = null;
        field7468 = null;
        if (arg0 != -32) {
            field7471 = -1;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 189)
    public final void method3090(int arg0) {
        class714 var2 = this.field7457;
        synchronized (this.field7457) {
            this.field7457.method4024(0);
            if (arg0 >= -29) {
                this.method3090(-48);
            }
        }
        field7462++;
        class714 var3 = this.field7469;
        synchronized (this.field7469) {
            this.field7469.method4024(0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLjb;)Ljb;", line = 205)
    public static final class493 method3091(byte arg0, class493 arg1) {
        field7465++;
        class493 var2 = client.method1953(arg1);
        if (var2 == null) {
            var2 = arg1.field7043;
        }
        return arg0 <= 47 ? null : var2;
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 224)
    public static final void method3092(int arg0) {
        field7461++;
        class543.method3149(class643.field8813, 1);
        class76.field985++;
        if (class363.field5147 && class403.field5706) {
            int var1 = 0;
            int var2 = 0;
            if (class589.field8295) {
                var1 = class171.method1102(arg0 ^ 0x6CE4);
                var2 = class575.method3288((byte) -119);
            }
            int var3 = var1 + field7470.method1094(-83);
            int var4 = var2 + field7470.method1089((byte) -63);
            int var5 = var3 - class481.field6800;
            int var6 = var4 - class640.field8791;
            if (class733.field10223 > var5) {
                var5 = class733.field10223;
            }
            if (var6 < class424.field5967) {
                var6 = class424.field5967;
            }
            if (var5 + class643.field8813.field7095 > class733.field10223 + class76.field991.field7095) {
                var5 = class733.field10223 + class76.field991.field7095 - class643.field8813.field7095;
            }
            if ((class424.field5967 + class76.field991.field7031) < (var6 + class643.field8813.field7031)) {
                var6 = class424.field5967 + class76.field991.field7031 - class643.field8813.field7031;
            }
            int var7 = var5 + class76.field991.field7046 - class733.field10223;
            int var8 = var6 + class76.field991.field7073 - class424.field5967;
            if (arg0 == 31167) {
                if (field7470.method2458(-1)) {
                    if (class643.field8813.field7054 < class76.field985) {
                        int var9 = var5 - class317.field4408;
                        int var10 = var6 - class457.field6450;
                        if (class643.field8813.field7056 < var9 || var9 < -class643.field8813.field7056 || class643.field8813.field7056 < var10 || var10 < (-class643.field8813.field7056)) {
                            class390.field5517 = true;
                        }
                    }
                    if (class643.field8813.field6993 != null && class390.field5517) {
                        class357 var11 = new class357();
                        var11.field5073 = var7;
                        var11.field5084 = var8;
                        var11.field5082 = class643.field8813;
                        var11.field5076 = class643.field8813.field6993;
                        class241.method1543(var11);
                        return;
                    }
                } else {
                    if (class390.field5517) {
                        class37.method210(-1);
                        if (class643.field8813.field7044 != null) {
                            class357 var12 = new class357();
                            var12.field5076 = class643.field8813.field7044;
                            var12.field5073 = var7;
                            var12.field5084 = var8;
                            var12.field5082 = class643.field8813;
                            var12.field5074 = class10.field235;
                            class241.method1543(var12);
                        }
                        if (class10.field235 != null && client.method1953(class643.field8813) != null) {
                            class710.method3982(false, class643.field8813, class10.field235);
                        }
                    } else if ((class499.field7167 == 1 || class349.method2251(1002)) && class25.field341 > 2) {
                        class718.method4036(true, class481.field6800 + class317.field4408, class640.field8791 + class457.field6450);
                    } else if (class254.method1687((byte) 127)) {
                        class718.method4036(true, class481.field6800 + class317.field4408, class640.field8791 + class457.field6450);
                    }
                    class643.field8813 = null;
                }
            }
        } else if (class76.field985 > 1) {
            class643.field8813 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lsaa;ILfp;Lfp;)V", line = 370)
    public class530(class326 arg0, int arg1, class323 arg2, class323 arg3) {
        this.field7463 = arg2;
        this.field7466 = arg3;
        this.field7463.method2084(36, 0);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(BI)V", line = 387)
    public final void method3093(byte arg0, int arg1) {
        if (arg0 > -93) {
            return;
        }
        class714 var3 = this.field7457;
        synchronized (this.field7457) {
            this.field7457.method4016(arg1, (byte) -73);
        }
        field7459++;
        class714 var4 = this.field7469;
        synchronized (this.field7469) {
            this.field7469.method4016(arg1, (byte) -73);
        }
    }
}
