import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class25 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljg;")
    private class177 field321 = new class177();

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lfd;")
    private class130 field318;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
    public static int[] field332 = new int[5];

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public static int[] field325;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    public static int[] field326;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lh;")
    public static class294[] field320;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method143(int arg0) {
        if (arg0 == -10494) {
            field326 = null;
            field325 = null;
            field332 = null;
            field320 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field328++;
        for (class306 var2 = (class306) this.field321.method1187((byte) 127); var2 != null; var2 = (class306) this.field321.method1186(true)) {
            if (var2.method168((byte) 125)) {
                var2.method900(120);
                var2.method1075(arg0 + 7596);
                this.field319++;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method145(int arg0) {
        field322++;
        this.field321.method1192((byte) 0);
        if (arg0 < -65) {
            this.field318.method874((byte) -125);
            this.field319 = this.field329;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Lel;")
    public static final class218 method146(int arg0) {
        int var1 = 76 / ((-arg0 - 58) / 62);
        field327++;
        return class13.field171;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
    public final void method147(int arg0, byte arg1) {
        if (arg1 > -115) {
            field325 = null;
        }
        field334++;
        if (class173.field2677 == null) {
            return;
        }
        for (class306 var3 = (class306) this.field321.method1187((byte) 127); var3 != null; var3 = (class306) this.field321.method1186(true)) {
            if (var3.method168((byte) -112)) {
                if (var3.method170((byte) -81) == null) {
                    var3.method900(43);
                    var3.method1075(7596);
                    this.field319++;
                }
            } else if ((++var3.field2552) > ((long) arg0)) {
                class306 var4 = class173.field2677.method441(1, var3);
                this.field318.method857(false, var4, var3.field2102);
                class256.method1789(false, var3, var4);
                var3.method900(126);
                var3.method1075(7596);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V")
    public final void method148(int arg0, long arg1) {
        if (arg0 != 1) {
            method151(true);
        }
        field324++;
        class306 var4 = (class306) this.field318.method872((byte) -97, arg1);
        if (var4 != null) {
            var4.method900(120);
            var4.method1075(7596);
            this.field319++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method149(byte arg0, long arg1) {
        if (arg0 >= -39) {
            this.field329 = 119;
        }
        field330++;
        class306 var4 = (class306) this.field318.method872((byte) -89, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method170((byte) -81);
        if (var5 == null) {
            var4.method900(33);
            var4.method1075(7596);
            this.field319++;
            return null;
        }
        if (var4.method168((byte) 107)) {
            class29 var6 = new class29(var5);
            this.field318.method857(false, var6, var4.field2102);
            this.field321.method1190(8217, var6);
            var6.field2552 = 0L;
            var4.method900(78);
            var4.method1075(7596);
        } else {
            this.field321.method1190(8217, var4);
            var4.field2552 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
    public class25(int arg0) {
        this.field329 = arg0;
        this.field319 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field318 = new class130(var2);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
    public final int method150(int arg0) {
        field333++;
        int var2 = arg0;
        for (class306 var3 = (class306) this.field321.method1187((byte) 127); var3 != null; var3 = (class306) this.field321.method1186(true)) {
            if (!var3.method168((byte) 82)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method151(boolean arg0) {
        field335++;
        if (arg0) {
            class249.field3960.method145(-68);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;JZ)V")
    public final void method152(Object arg0, long arg1, boolean arg2) {
        this.method148(1, arg1);
        if (this.field319 == 0) {
            class306 var5 = (class306) this.field321.method1185(-8241);
            var5.method900(64);
            var5.method1075(7596);
        } else {
            this.field319--;
        }
        class29 var6 = new class29(arg0);
        field323++;
        this.field318.method857(false, var6, arg1);
        if (arg2) {
            this.field321.method1190(8217, var6);
            var6.field2552 = 0L;
        }
    }
}
