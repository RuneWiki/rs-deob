import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class163 {

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Lwf;")
    private class117 field2571 = new class117(64);

    @OriginalMember(owner = "client!op", name = "t", descriptor = "Lwf;")
    public class117 field2584 = new class117(50);

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Lwf;")
    public class117 field2585 = new class117(5);

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
    public boolean field2576;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lbt;")
    public class39 field2577;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "Lkda;")
    private class328 field2568;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Lkda;")
    public class328 field2572;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "[Lkc;")
    public static class115[] field2573 = new class115[2048];

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "B")
    public static byte field2574;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lra;")
    public static class92 field2566;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public final void method1173(byte arg0) {
        class117 var2 = this.field2571;
        synchronized (this.field2571) {
            this.field2571.method837(126);
        }
        field2569++;
        class117 var3 = this.field2584;
        synchronized (this.field2584) {
            this.field2584.method837(127);
        }
        class117 var4 = this.field2585;
        synchronized (this.field2585) {
            this.field2585.method837(arg0 ^ 0x15);
            if (arg0 != 104) {
                this.field2571 = null;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1174(String arg0, int arg1) {
        field2580++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = -94 % ((39 - arg1) / 48);
        for (int var6 = 0; var6 < var2; var6++) {
            var3 = (var3 << 5) + ((long) arg0.charAt(var6)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V")
    public final void method1175(byte arg0, int arg1) {
        int var3 = -104 / ((arg0 + 25) / 63);
        field2570++;
        class117 var4 = this.field2571;
        synchronized (this.field2571) {
            this.field2571.method834(arg1, 0);
        }
        class117 var5 = this.field2584;
        synchronized (this.field2584) {
            this.field2584.method834(arg1, 0);
        }
        class117 var6 = this.field2585;
        synchronized (this.field2585) {
            this.field2585.method834(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
    public final void method1176(boolean arg0, int arg1) {
        field2582++;
        if (arg0 == this.field2576) {
            return;
        }
        this.field2576 = arg0;
        this.method1173((byte) 104);
        if (arg1 != 9719) {
            this.method1173((byte) 111);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZ)Lqda;")
    public final class87 method1177(int arg0, boolean arg1) {
        field2579++;
        class117 var3 = this.field2571;
        class87 var4;
        synchronized (this.field2571) {
            var4 = (class87) this.field2571.method842(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field2568;
        byte[] var6;
        synchronized (this.field2568) {
            var6 = this.field2568.method1966(class446.method2704(arg0, (byte) 118), class527.method3103(arg0, 768), true);
        }
        class87 var7 = new class87();
        var7.field1287 = this;
        var7.field1264 = arg0;
        if (var6 != null) {
            var7.method653(new class148(var6), 0);
        }
        var7.method658(74);
        class117 var8 = this.field2571;
        synchronized (this.field2571) {
            this.field2571.method835((byte) 127, (long) arg0, var7);
        }
        if (arg1) {
            this.field2577 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    public final void method1178(int arg0, int arg1) {
        field2575++;
        this.field2586 = arg0;
        class117 var3 = this.field2584;
        synchronized (this.field2584) {
            this.field2584.method837(125);
            if (arg1 != -1721201176) {
                this.method1173((byte) 61);
            }
        }
        class117 var4 = this.field2585;
        synchronized (this.field2585) {
            this.field2585.method837(127);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILtt;ZIII)V")
    public static final void method1179(int arg0, int arg1, class78 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2567++;
        if (class359.field4885 >= 50 || arg2 == null || arg2.field1054 == null || arg6 >= arg2.field1054.length || arg2.field1054[arg6] == null) {
            return;
        }
        int var7 = arg2.field1054[arg6][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEF) >> 5;
        if (arg2.field1054[arg6].length > 1) {
            int var10 = (int) ((double) arg2.field1054[arg6].length * Math.random());
            if (var10 > 0) {
                var8 = arg2.field1054[arg6][var10];
            }
        }
        if (arg0 != -1721201176) {
            field2574 = -12;
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg3) {
                class245.method1550(var8, 255, 0, var9, (byte) 84);
            }
        } else if (class56.field668.field6873 != 0) {
            int var12 = arg1 - 64 >> 7;
            int var13 = arg5 - 64 >> 7;
            class378.field5206[class359.field4885++] = new class300((byte) 1, var8, var9, 0, 255, (var12 << 16) + (arg4 << 24) + (var13 << 8) + var11);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public final void method1180(boolean arg0) {
        field2581++;
        class117 var2 = this.field2571;
        synchronized (this.field2571) {
            this.field2571.method846(0);
        }
        class117 var3 = this.field2584;
        synchronized (this.field2584) {
            this.field2584.method846(0);
        }
        class117 var4 = this.field2585;
        synchronized (this.field2585) {
            this.field2585.method846(0);
            if (!arg0) {
                method1182((byte) -58);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method1181(int arg0) {
        if (arg0 != 2048) {
            field2578 = 61;
        }
        field2566 = null;
        field2573 = null;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)[Lfp;")
    public static final class271[] method1182(byte arg0) {
        field2565++;
        return arg0 == -55 ? new class271[] { class501.field7106, class215.field3168, class386.field5312 } : null;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public final void method1183(int arg0) {
        field2583++;
        class117 var2 = this.field2584;
        synchronized (this.field2584) {
            if (arg0 != 19301) {
                return;
            }
            this.field2584.method837(127);
        }
        class117 var3 = this.field2585;
        synchronized (this.field2585) {
            this.field2585.method837(125);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lbt;IZLkda;Lkda;)V")
    public class163(class39 arg0, int arg1, boolean arg2, class328 arg3, class328 arg4) {
        this.field2576 = arg2;
        this.field2577 = arg0;
        this.field2568 = arg3;
        this.field2572 = arg4;
        if (this.field2568 != null) {
            int var6 = this.field2568.method1974(-8588) - 1;
            this.field2568.method1975(73, var6);
        }
    }
}
