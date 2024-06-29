import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class323 {

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public int field5447 = 1190717;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Z")
    public boolean field5438 = true;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public int field5449 = 8;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field5452 = 128;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Z")
    public boolean field5448 = true;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public int field5442 = -1;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
    public boolean field5451 = false;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field5457 = 16;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public int field5443 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field5436 = -1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "[F")
    public static float[] field5437 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static volatile int field5445 = 0;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Z")
    public static boolean field5456 = false;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[Lkb;")
    public static class35[] field5450;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILek;I)Lsm;", line = 6)
    public static final class159 method2171(int arg0, class185 arg1, int arg2) {
        field5440++;
        if (class50.method414(arg1, 81, arg2)) {
            if (arg0 <= 52) {
                method2171(39, (class185) null, -60);
            }
            return class16.method164(3362);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)I", line = 28)
    public static final int method2172(int arg0, int arg1, byte arg2) {
        field5444++;
        if (arg2 != -17) {
            return -10;
        }
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z", line = 56)
    public static final boolean method2173(int arg0, int arg1) {
        class222 var2 = class120.method848(arg1, (byte) 118);
        field5453++;
        if (var2 == null) {
            return false;
        } else if (class198.field3455 == 1 || class198.field3455 == 2 || class329.field5599 == 2) {
            byte[] var3 = var2.field3785.method1614((byte) 44);
            class152.field2631 = new String(var3, 0, var3.length);
            class3.field14 = var2.field3798;
            if (class329.field5599 != 0) {
                class6.field67 = class3.field14 + 40000;
                class84.field1614 = class3.field14 + 50000;
                class192.field3337 = class6.field67;
            }
            return true;
        } else {
            class229 var4 = class172.field2996;
            if (~class329.field5599 != arg0) {
                var4 = class142.method989(new class229[] { class208.field3607, class84.method607(arg0 + 80, var2.field3798 - -7000) }, arg0 - 114);
            }
            class229 var5 = class172.field2996;
            if (class174.field3033 != null) {
                var5 = class142.method989(new class229[] { class308.field5202, class174.field3033 }, -94);
            }
            class229 var6 = class142.method989(new class229[] { class306.field5173, var2.field3785, var4, class60.field1034, class84.method607(76, class128.field2290), class282.field4848, class84.method607(72, class23.field432), var5, class245.field4363, class74.field1404 ? class194.field3386 : class127.field2263, class260.field4517, class278.field4775 ? class194.field3386 : class127.field2263, class14.field215, class111.field1956 ? class194.field3386 : class127.field2263 }, -44);
            try {
                class15.field223.getAppletContext().showDocument(var6.method1630(10117), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILkh;I)V", line = 105)
    private final void method2174(int arg0, int arg1, class14 arg2, int arg3) {
        if (arg3 == 1) {
            this.field5443 = class10.method55(-42, arg2.method114(0));
        } else if (arg3 == 2) {
            this.field5442 = arg2.method93(false);
        } else if (arg3 == 3) {
            this.field5442 = arg2.method116(-1);
            if (this.field5442 == 65535) {
                this.field5442 = -1;
            }
        } else if (arg3 == 5) {
            this.field5438 = false;
        } else if (arg3 == 7) {
            this.field5436 = class10.method55(-75, arg2.method114(0));
        } else if (arg3 == 8) {
            class34.field653 = arg1;
        } else if (arg3 == 9) {
            this.field5452 = arg2.method116(-1);
        } else if (arg3 == 10) {
            this.field5448 = false;
        } else if (arg3 == 11) {
            this.field5449 = arg2.method93(false);
        } else if (arg3 == 12) {
            this.field5451 = true;
        } else if (arg3 == 13) {
            this.field5447 = arg2.method114(arg0 ^ 0x3);
        } else if (arg3 == 14) {
            this.field5457 = arg2.method93(false);
        }
        if (arg0 != 3) {
            field5445 = -28;
        }
        field5458++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Lld;", line = 176)
    public static final class122 method2175(int arg0, int arg1, int arg2) {
        if (arg2 != -25873) {
            field5456 = false;
        }
        class122 var3 = (class122) class329.field5586.method1890((long) arg1 | (long) arg0 << 32, -94);
        field5455++;
        if (var3 == null) {
            var3 = new class122(arg0, arg1);
            class329.field5586.method1885(var3.field4265, var3, (byte) -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 197)
    public static void method2176(byte arg0) {
        if (arg0 != -100) {
            field5456 = false;
        }
        field5437 = null;
        field5450 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I", line = 212)
    public static final int method2177(int arg0) {
        field5441++;
        if (class111.field1960 == 0) {
            return 0;
        } else {
            if (arg0 > -33) {
                field5450 = (class35[]) null;
            }
            return class15.field228[class111.field1960].method482();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lnf;Z)Z", line = 227)
    public static final boolean method2178(class67 arg0, boolean arg1) {
        field5439++;
        if (arg0.field1296 == 205) {
            class64.field1111 = 250;
            return true;
        } else if (arg1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 246)
    public static final void method2179(byte arg0) {
        if (arg0 != 109) {
            return;
        }
        field5446++;
        if (class64.field1111 <= 0) {
            class137.field2382 = class160.field2720;
            class160.field2720 = null;
            class186.method1295(40, (byte) 84);
        } else {
            class226.method1560((byte) -39);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lkh;II)V", line = 273)
    public final void method2180(class14 arg0, int arg1, int arg2) {
        field5454++;
        if (arg2 < 50) {
            method2175(27, 29, 10);
        }
        while (true) {
            int var4 = arg0.method93(false);
            if (var4 == 0) {
                return;
            }
            this.method2174(3, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwf;ILek;Lek;)V", line = 307)
    public static final void method2181(class58 arg0, int arg1, class185 arg2, class185 arg3) {
        field5459++;
        if (arg1 != 7) {
            return;
        }
        class257.field4480 = arg0;
        class14.field158 = arg3;
        class200.field3503 = arg2;
        if (class14.field158 != null) {
            class249.field4389 = class14.field158.method1268(1, (byte) 109);
        }
        if (class200.field3503 != null) {
            class111.field1957 = class200.field3503.method1268(1, (byte) 109);
        }
    }
}
