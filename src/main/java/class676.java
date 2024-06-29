import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class676 {

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Ljava/lang/String;")
    private String field9556 = "null";

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "C")
    public char field9552;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "C")
    public char field9557;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9544;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    private int field9545;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Ljw;")
    private class520 field9543;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Ljw;")
    public class520 field9550;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    private final void method3773(byte arg0) {
        field9544++;
        this.field9543 = new class520(this.field9550.method2917((byte) -75));
        for (class319 var2 = (class319) this.field9550.method2915(101); var2 != null; var2 = (class319) this.field9550.method2912((byte) 100)) {
            class540 var4 = new class540(var2.field4371, (int) var2.field6724);
            this.field9543.method2911(class189.method1236(var2.field4371, -120), var4, (byte) -28);
        }
        int var3 = -97 % ((arg0 + 21) / 49);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method3774(String arg0, int arg1, String arg2) {
        class126.field2096 = -1;
        if (arg1 == -2) {
            field9560++;
            class173.field2675 = 1;
            class512.method2848(arg2, (byte) -115, false, arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z")
    public final boolean method3775(int arg0, int arg1) {
        field9555++;
        if (this.field9550 == null) {
            return false;
        } else if (arg0 < 81) {
            return false;
        } else {
            if (this.field9543 == null) {
                this.method3784(true);
            }
            class704 var3 = (class704) this.field9543.method2918((long) arg1, (byte) -3);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V")
    public static final void method3776(byte arg0) {
        field9554++;
        if (arg0 < -49) {
            class48.field690.method3739(0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Leh;II)V")
    private final void method3777(class335 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field9557 = class697.method3859(arg0.method2040(-96), false);
        } else if (arg2 == 2) {
            this.field9552 = class697.method3859(arg0.method2040(arg1 - 17045), false);
        } else if (arg2 == 3) {
            this.field9556 = arg0.method2029((byte) -61);
        } else if (arg2 == 4) {
            this.field9545 = arg0.method2045(arg1 ^ 0xFFFFBDB1);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method2001((byte) -83);
            this.field9550 = new class520(class587.method3231(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2045(-98);
                class504 var7;
                if (arg2 == 5) {
                    var7 = new class319(arg0.method2029((byte) -71));
                } else {
                    var7 = new class704(arg0.method2045(-98));
                }
                this.field9550.method2911((long) var6, var7, (byte) -28);
            }
        }
        field9558++;
        if (arg1 != 16943) {
            this.method3781(-108, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3778(boolean arg0, int arg1) {
        if (arg0) {
            field9551++;
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILeh;)V")
    public final void method3779(int arg0, class335 arg1) {
        while (true) {
            int var3 = arg1.method2034(arg0 + 255);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.field9556 = null;
                }
                field9548++;
                return;
            }
            this.method3777(arg1, arg0 + 16943, var3);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method3780(byte arg0, String arg1) {
        field9559++;
        if (this.field9550 == null) {
            return false;
        }
        if (this.field9543 == null) {
            this.method3773((byte) 94);
        }
        if (arg0 != -65) {
            return true;
        }
        for (class540 var3 = (class540) this.field9543.method2918(class189.method1236(arg1, arg0 - 57), (byte) -126); var3 != null; var3 = (class540) this.field9543.method2919((byte) 42)) {
            if (var3.field7118.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method3781(int arg0, byte arg1) {
        field9547++;
        if (arg1 >= -88) {
            method3778(true, 26);
        }
        if (this.field9550 == null) {
            return this.field9556;
        } else {
            class319 var3 = (class319) this.field9550.method2918((long) arg0, (byte) 8);
            return var3 == null ? this.field9556 : var3.field4371;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(IB)I")
    public final int method3782(int arg0, byte arg1) {
        field9546++;
        if (this.field9550 == null) {
            return this.field9545;
        } else if (arg1 == -50) {
            class704 var3 = (class704) this.field9550.method2918((long) arg0, (byte) -126);
            return var3 == null ? this.field9545 : var3.field9905;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
    public static final void method3783(byte arg0) {
        if (arg0 > -43) {
            return;
        }
        class666 var1 = class322.field4481;
        synchronized (class322.field4481) {
            class322.field4481.method3748(6);
        }
        field9549++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    private final void method3784(boolean arg0) {
        field9553++;
        this.field9543 = new class520(this.field9550.method2917((byte) -92));
        class704 var2 = (class704) this.field9550.method2915(91);
        if (!arg0) {
            this.field9543 = null;
        }
        while (var2 != null) {
            class704 var3 = new class704((int) var2.field6724);
            this.field9543.method2911((long) var2.field9905, var3, (byte) -28);
            var2 = (class704) this.field9550.method2912((byte) 94);
        }
    }
}
