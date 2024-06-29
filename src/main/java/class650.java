import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class650 {

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Lsk;")
    private class578 field9377 = new class578();

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljava/lang/String;")
    public String field9376;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    private volatile int field9384;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lsaa;")
    public static class300 field9374;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Lst;")
    private class402 field9386;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
    public static int[] field9383;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLgfa;)V")
    public final void method3709(byte arg0, class697 arg1) {
        field9387++;
        arg1.field9810 = true;
        class578 var3 = this.field9377;
        synchronized (this.field9377) {
            this.field9377.method3322(arg1, -25);
            if (arg0 != 11) {
                method3712(true, 80, -127);
            }
            this.field9384++;
        }
        if (this.field9386 != null) {
            class402 var4 = this.field9386;
            synchronized (this.field9386) {
                this.field9386.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lst;I)V")
    public final void method3710(class402 arg0, int arg1) {
        field9378++;
        int var3 = 92 / ((70 - arg1) / 47);
        this.field9386 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lgi;Z)V")
    public final void method3711(class632 arg0, boolean arg1) {
        if (!arg1) {
            this.method3716(68);
        }
        class578 var3 = this.field9377;
        synchronized (this.field9377) {
            this.field9377.method3322(arg0, -78);
            this.field9384++;
        }
        field9380++;
        if (this.field9386 != null) {
            class402 var4 = this.field9386;
            synchronized (this.field9386) {
                this.field9386.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZII)V")
    public static final void method3712(boolean arg0, int arg1, int arg2) {
        field9379++;
        if (class407.field5874 < class407.field5876) {
            class407.field5874 = (float) ((double) class407.field5874 / 30.0D + (double) class407.field5874);
            if (class407.field5874 > class407.field5876) {
                class407.field5874 = class407.field5876;
            }
            class628.method3597((byte) -104);
            class407.field5881 = (int) class407.field5874 >> 1;
            class407.field5878 = class698.method3900((byte) 14, class407.field5881);
        } else if (class407.field5874 > class407.field5876) {
            class407.field5874 = (float) ((double) class407.field5874 - (double) class407.field5874 / 30.0D);
            if (class407.field5874 < class407.field5876) {
                class407.field5874 = class407.field5876;
            }
            class628.method3597((byte) -102);
            class407.field5881 = (int) class407.field5874 >> 1;
            class407.field5878 = class698.method3900((byte) 14, class407.field5881);
        }
        if (class453.field6461 != -1 && class459.field6560 != -1) {
            int var3 = class453.field6461 - class243.field3674;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class459.field6560 - class254.field3763;
            class243.field3674 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class254.field3763 += var4;
            if (var3 == 0 && var4 == 0) {
                class459.field6560 = -1;
                class453.field6461 = -1;
            }
            class628.method3597((byte) -109);
        }
        if (arg0) {
            field9374 = null;
        }
        if (class414.field6008 <= 0) {
            class87.field1627 = -1;
            class362.field5373 = -1;
        } else {
            class42.field1080--;
            if (class42.field1080 == 0) {
                class42.field1080 = 100;
                class414.field6008--;
            }
        }
        if (!class30.field951 || class38.field1052 == null) {
            return;
        }
        for (class152 var5 = (class152) class38.field1052.method1224(-2); var5 != null; var5 = (class152) class38.field1052.method1232(-2)) {
            class288 var6 = class407.field5864.method3355(var5.field2585.field6709, (byte) -10);
            if (var5.method1192(-1, arg1, arg2)) {
                if (var6.field4317 != null) {
                    if (var6.field4317[4] != null) {
                        class631.method3604(1002, 0, -1, (long) var5.field2585.field6709, var6.field4317[4], var6.field4320, (byte) -29, true, var6.field4313, -1, false);
                    }
                    if (var6.field4317[3] != null) {
                        class631.method3604(1009, 0, -1, (long) var5.field2585.field6709, var6.field4317[3], var6.field4320, (byte) -51, true, var6.field4313, -1, false);
                    }
                    if (var6.field4317[2] != null) {
                        class631.method3604(1003, 0, -1, (long) var5.field2585.field6709, var6.field4317[2], var6.field4320, (byte) -42, true, var6.field4313, -1, false);
                    }
                    if (var6.field4317[1] != null) {
                        class631.method3604(1008, 0, -1, (long) var5.field2585.field6709, var6.field4317[1], var6.field4320, (byte) -65, true, var6.field4313, -1, false);
                    }
                    if (var6.field4317[0] != null) {
                        class631.method3604(1004, 0, -1, (long) var5.field2585.field6709, var6.field4317[0], var6.field4320, (byte) -52, true, var6.field4313, -1, false);
                    }
                }
                if (!var5.field2585.field6707) {
                    var5.field2585.field6707 = true;
                    class683.method3844(class512.field7232, var5.field2585.field6709, var6.field4320);
                }
                if (var5.field2585.field6707) {
                    class683.method3844(class43.field1087, var5.field2585.field6709, var6.field4320);
                }
            } else if (var5.field2585.field6707) {
                var5.field2585.field6707 = false;
                class683.method3844(class507.field7185, var5.field2585.field6709, var6.field4320);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Z")
    public final boolean method3713(int arg0) {
        field9375++;
        int var2 = -61 % ((-arg0 - 61) / 61);
        return this.field9384 == 0;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public static void method3714(int arg0) {
        if (arg0 >= -90) {
            field9374 = null;
        }
        field9383 = null;
        field9374 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lgfa;I)V")
    public final void method3715(class697 arg0, int arg1) {
        field9382++;
        arg0.field9810 = false;
        class578 var3 = this.field9377;
        synchronized (this.field9377) {
            this.field9377.method3322(arg0, -28);
            this.field9384++;
        }
        if (arg1 >= -117) {
            this.field9386 = null;
        }
        if (this.field9386 != null) {
            class402 var4 = this.field9386;
            synchronized (this.field9386) {
                this.field9386.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class650(String arg0) {
        this.field9376 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)Lru;")
    public final class177 method3716(int arg0) {
        field9381++;
        if (arg0 != -25560) {
            this.method3709((byte) 54, null);
        }
        Object var2 = null;
        class578 var3 = this.field9377;
        synchronized (this.field9377) {
            class177 var4 = this.field9377.method3317(-121);
            var4.method1318(8);
            this.field9384--;
            return var4;
        }
    }
}
