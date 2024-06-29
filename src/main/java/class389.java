import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class389 extends class189 {

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Z")
    public boolean field5836 = true;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "Lbj;")
    public static class162 field5848 = new class162(64, -1);

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field5851 = -1;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "Lud;")
    public class27 field5849;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[I")
    public int[] field5835;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
    private int[] field5839;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field5834;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "[[I")
    private int[][] field5840;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
    public final int method2393(int arg0, int arg1, int arg2) {
        field5837++;
        if (arg1 >= -91) {
            this.method2395(null, null, -105);
        }
        if (this.field5839 == null || arg2 < 0 || arg2 > this.field5839.length) {
            return -1;
        } else if (this.field5840[arg2] == null || arg0 < 0 || arg0 > this.field5840[arg2].length) {
            return -1;
        } else {
            return this.field5840[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILnn;)V")
    private final void method2394(byte arg0, int arg1, class289 arg2) {
        if (arg1 == 1) {
            this.field5834 = class266.method1697(arg0 + 124, '<', arg2.method1834(-17823));
        } else if (arg1 == 2) {
            int var9 = arg2.method1858(-3256);
            this.field5835 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5835[var10] = arg2.method1841((byte) 90);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1858(-3256);
            this.field5840 = new int[var4][];
            this.field5839 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1841((byte) 32);
                class278 var7 = class335.method2108((byte) -82, var6);
                if (var7 != null) {
                    this.field5839[var5] = var6;
                    this.field5840[var5] = new int[var7.field4191];
                    for (int var8 = 0; var8 < var7.field4191; var8++) {
                        this.field5840[var5][var8] = arg2.method1841((byte) 60);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field5836 = false;
        }
        field5838++;
        if (arg0 != -124) {
            method2400((byte) -35, null);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lnn;[II)V")
    public final void method2395(class289 arg0, int[] arg1, int arg2) {
        field5841++;
        if (this.field5839 == null) {
            return;
        }
        if (arg2 != -5) {
            method2403(-104, (byte) -111);
        }
        for (int var4 = 0; var4 < this.field5839.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method2398(-13037, var4).field4189;
            if (var5 > 0) {
                arg0.method1847(var5, (byte) 31, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method2396(int arg0) {
        field5843++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5834 == null) {
            return "";
        }
        var2.append(this.field5834[0]);
        if (arg0 != -1) {
            this.method2404(71);
        }
        for (int var3 = 1; var3 < this.field5834.length; var3++) {
            var2.append("...");
            var2.append(this.field5834[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(B)V")
    public final void method2397(byte arg0) {
        if (this.field5835 != null) {
            for (int var2 = 0; var2 < this.field5835.length; var2++) {
                this.field5835[var2] = class418.method2558(this.field5835[var2], 32768);
            }
        }
        if (arg0 != 102) {
            this.field5836 = false;
        }
        field5845++;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Lje;")
    public final class278 method2398(int arg0, int arg1) {
        field5833++;
        if (arg0 != -13037) {
            this.field5834 = null;
        }
        return this.field5839 == null || arg1 < 0 || this.field5839.length < arg1 ? null : class335.method2108((byte) -89, this.field5839[arg1]);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public static void method2399(int arg0) {
        field5848 = null;
        if (arg0 < 102) {
            field5848 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2400(byte arg0, String arg1) {
        field5846++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class502.method3025(-13, arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 78) {
            field5851 = 95;
        }
        while (var3 < class513.field7453) {
            String var4 = class330.field5008[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class502.method3025(-13, var4);
            if (var5 != null && var5.equals(var2)) {
                class513.field7453--;
                for (int var6 = var3; var6 < class513.field7453; var6++) {
                    class330.field5008[var6] = class330.field5008[var6 + 1];
                    class59.field1232[var6] = class59.field1232[var6 + 1];
                    class207.field3317[var6] = class207.field3317[var6 + 1];
                    class296.field4497[var6] = class296.field4497[var6 + 1];
                    class498.field7315[var6] = class498.field7315[var6 + 1];
                    class114.field2064[var6] = class114.field2064[var6 + 1];
                }
                class225.field3514++;
                class398.field6037 = class112.field2032;
                class459.method2765(class498.field7312, (byte) 87);
                class335.field5062.method1814(class362.method2220(arg1, (byte) -80), true);
                class335.field5062.method1821(arg1, 100);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLnn;)Ljava/lang/String;")
    public final String method2401(boolean arg0, class289 arg1) {
        field5847++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5839 != null) {
            for (int var4 = 0; var4 < this.field5839.length; var4++) {
                var3.append(this.field5834[var4]);
                var3.append(this.field5849.method194(arg1.method1866(class335.method2108((byte) -76, this.field5839[var4]).field4195, -1131561360), 32768, this.method2398(-13037, var4), this.field5840[var4]));
            }
        }
        var3.append(this.field5834[this.field5834.length - 1]);
        if (!arg0) {
            field5851 = 78;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILnn;)V")
    public final void method2402(int arg0, class289 arg1) {
        while (true) {
            int var3 = arg1.method1858(arg0 + 9669);
            if (var3 == 0) {
                field5844++;
                if (arg0 != -12925) {
                    this.method2401(false, null);
                    return;
                }
                return;
            }
            this.method2394((byte) -124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)V")
    public static final void method2403(int arg0, byte arg1) {
        class399 var2 = class182.field2940;
        synchronized (class182.field2940) {
            class182.field2940.method2471((byte) 98, arg0);
        }
        field5842++;
        int var3 = -116 / ((arg1 + 64) / 42);
        class399 var4 = class522.field7581;
        synchronized (class522.field7581) {
            class522.field7581.method2471((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I")
    public final int method2404(int arg0) {
        field5850++;
        if (arg0 != -25109) {
            method2403(-55, (byte) -40);
        }
        return this.field5839 == null ? 0 : this.field5839.length;
    }
}
