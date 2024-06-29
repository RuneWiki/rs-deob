import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class586 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Ljda;")
    private class239 field7809 = new class239(64);

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Laj;")
    private class333 field7814;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
    public static int[] field7815 = new int[32];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Laj;")
    public static class333 field7805;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
    public static final void method3251() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class665.field9187.length; var1++) {
                if (class665.field9187[var1].method1402()) {
                    class303.field4365[var1] = class665.field9187[var1].method1399();
                } else {
                    synchronized (class665.field9187[var1]) {
                        class665.field9187[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class665.field9187[class665.field9187.length - 1].method1403();
                class386.method2448(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class665.field9187.length - 1; var4++) {
                        if (!class665.field9187[var4].method1402()) {
                            synchronized (class665.field9187[var4]) {
                                class665.field9187[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class665.field9187.length - 2; var6++) {
                            class665.field9187[var6].method1403();
                        }
                        class386.method2448(2);
                        while (!class665.field9187[0].method1402()) {
                            synchronized (class665.field9187[0]) {
                                class665.field9187[0].notify();
                            }
                            try {
                                class438.method2636(true, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class665.field9187[0].method1403();
                        return;
                    }
                    try {
                        class438.method2636(true, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class438.method2636(true, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method3252(byte arg0) {
        if (arg0 <= 76) {
            return;
        }
        if (class570.field7586 != null) {
            class172.method1220(class39.field623, (byte) -43);
        } else if (class450.field6276 == -1) {
            class723.method4029(class537.field7310, class83.field1175, class39.field623, 113);
        } else {
            class570.method3195((byte) -38, class39.field623);
        }
        field7813++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method3253(int arg0, int arg1) {
        field7808++;
        if (class768.method4253(-3, arg1)) {
            if (arg0 >= -82) {
                method3252((byte) -108);
            }
            class88.method719(-1, class111.field1528[arg1], false);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method3254(int arg0) {
        if (arg0 != -1) {
            field7805 = null;
        }
        field7805 = null;
        field7815 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
    public final void method3255(int arg0, byte arg1) {
        class239 var3 = this.field7809;
        synchronized (this.field7809) {
            this.field7809.method1546(arg0, (byte) -8);
        }
        field7812++;
        if (arg1 != 55) {
            method3254(103);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public final void method3256(byte arg0) {
        if (arg0 != 48) {
            field7815 = null;
        }
        field7806++;
        class239 var2 = this.field7809;
        synchronized (this.field7809) {
            this.field7809.method1552(84);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwea;[Luca;)V")
    public static final void method3257(class167 arg0, class540[] arg1) {
        if (class546.field7395) {
            int var2 = arg0.method43((byte) -108, arg1);
            class192.field2582.method486(var2, arg1);
        }
        if (class538.field7317 == class528.field7227) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class319) {
                var5 = ((class319) arg0).field4600;
                var6 = ((class319) arg0).field4590;
            } else {
                var5 = arg0.field2257 >> class26.field388;
                var6 = arg0.field2259 >> class26.field388;
            }
            class192.field2582.method557(class412.field5933[0].method1882(arg0.field2259, 0, arg0.field2257), class356.method2243(var5, var6), class132.method1050(var5, var6), class674.method3747(var5, var6));
        }
        class176 var7 = arg0.method22(-10, class192.field2582);
        if (var7 == null) {
            return;
        }
        if (arg0.field2255) {
            class431[] var8 = var7.field2345;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class431 var10 = var8[var9];
                if (var10.field6126) {
                    class716.method4001(var10.field6125 + var10.field6121, (byte) -102, var10.field6122 + var10.field6121, var10.field6124 - var10.field6121, var10.field6123 - var10.field6121);
                }
            }
        }
        if (var7.field2340) {
            var7.field2347 = arg0;
            if (class238.field3214) {
                class11 var11 = class201.field2670;
                synchronized (class201.field2670) {
                    class201.field2670.method88(var7, -15621);
                    return;
                }
            }
            class201.field2670.method88(var7, -15621);
            return;
        }
        class670.method3726(var7, (byte) 108);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public final void method3258(byte arg0) {
        class239 var2 = this.field7809;
        synchronized (this.field7809) {
            this.field7809.method1555((byte) -3);
        }
        int var3 = 86 % ((46 - arg0) / 54);
        field7804++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwea;ILvq;I)V")
    public static final void method3259(class167 arg0, int arg1, class489 arg2, int arg3) {
        field7810++;
        if (class393.field5800 >= 50 || arg2 == null || arg2.field6779 == null || arg2.field6779.length <= arg3 || arg2.field6779[arg3] == null) {
            return;
        }
        int var4 = arg2.field6779[arg3][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF0) >> 5;
        if (arg2.field6779[arg3].length > 1) {
            int var7 = (int) (Math.random() * (double) arg2.field6779[arg3].length);
            if (var7 > 0) {
                var5 = arg2.field6779[arg3][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg2.field6793 != null && arg2.field6771 != null) {
            var9 = (int) (Math.random() * (double) (arg2.field6771[arg3] - arg2.field6793[arg3])) + arg2.field6793[arg3];
        }
        int var10 = arg2.field6788 == null ? 255 : arg2.field6788[arg3];
        if (var8 == 0) {
            if (class551.field7456 == arg0) {
                if (!arg2.field6782) {
                    class87.method715(var10, var5, 0, var6, var9, 2760);
                    return;
                }
                class642.method3567(false, 0, var6, arg1 + 97, var5, var10, var9);
            }
        } else if (class712.field9959.field1280.method3352(118) != 0) {
            int var11 = arg0.field2257 - 256 >> 9;
            int var12 = arg0.field2259 - 256 >> 9;
            int var13 = class551.field7456 == arg0 ? 0 : (var11 << 16) + (var12 << 8) + (arg0.field2250 << 24) + var8;
            class729.field10120[class393.field5800++] = new class720((byte) (arg2.field6782 ? 2 : 1), var5, var6, arg1, var10, var13, var9, arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Lv;")
    public final class606 method3260(byte arg0, int arg1) {
        field7807++;
        class239 var3 = this.field7809;
        class606 var4;
        synchronized (this.field7809) {
            var4 = (class606) this.field7809.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -16 / ((-arg0 - 61) / 38);
        class333 var6 = this.field7814;
        byte[] var7;
        synchronized (this.field7814) {
            var7 = this.field7814.method2095(arg1, 35, 1);
        }
        class606 var8 = new class606();
        if (var7 != null) {
            var8.method3359(new class376(var7), false);
        }
        var8.method3360(-2);
        class239 var9 = this.field7809;
        synchronized (this.field7809) {
            this.field7809.method1544(true, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class586(class285 arg0, int arg1, class333 arg2) {
        this.field7814 = arg2;
        if (this.field7814 != null) {
            this.field7814.method2090(35, false);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
    public static final boolean method3261(boolean arg0) {
        field7811++;
        try {
            if (class99.field1374 == 2) {
                if (class545.field7392 == null) {
                    class545.field7392 = class25.method197(class549.field7445, class636.field8868, class685.field9629);
                    if (class545.field7392 == null) {
                        return false;
                    }
                }
                if (class326.field4753 == null) {
                    class326.field4753 = new class793(class433.field6139, class27.field406);
                }
                class751 var1 = class207.field2705;
                if (class633.field8849 != null) {
                    var1 = class633.field8849;
                }
                if (var1.method4175(class326.field4753, arg0, class545.field7392, 22050, class30.field431)) {
                    class207.field2705 = var1;
                    class207.field2705.method4185(127);
                    if (class752.field10420 <= 0) {
                        class99.field1374 = 0;
                        class207.field2705.method4153((byte) -126, class300.field4348);
                        for (int var2 = 0; var2 < class348.field5114.length; var2++) {
                            class207.field2705.method4173(class348.field5114[var2], var2, 0);
                            class348.field5114[var2] = 255;
                        }
                    } else {
                        class99.field1374 = 3;
                        class207.field2705.method4153((byte) -64, class300.field4348 >= class752.field10420 ? class752.field10420 : class300.field4348);
                        for (int var3 = 0; var3 < class348.field5114.length; var3++) {
                            class207.field2705.method4173(class348.field5114[var3], var3, 0);
                            class348.field5114[var3] = 255;
                        }
                    }
                    if (class633.field8849 == null) {
                        if (class193.field2586 <= 0L) {
                            class207.field2705.method4181(class482.field6670, class545.field7392, -2);
                        } else {
                            class207.field2705.method4177(class193.field2586, true, class482.field6670, class545.field7392, false);
                        }
                    }
                    if (class454.field6313 != null) {
                        class454.field6313.method1263(class207.field2705, (byte) 80);
                    }
                    class193.field2586 = 0L;
                    class545.field7392 = null;
                    class326.field4753 = null;
                    class633.field8849 = null;
                    class549.field7445 = null;
                    return true;
                }
            }
            if (!arg0) {
                method3254(84);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class207.field2705.method4180(10293);
            class326.field4753 = null;
            class545.field7392 = null;
            class99.field1374 = 0;
            class633.field8849 = null;
            class549.field7445 = null;
        }
        return false;
    }
}
