import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class389 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
    public boolean field5564 = false;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[I")
    private int[] field5567 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public int field5556 = -1;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field5562 = 2;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lph;")
    public static class114 field5560 = new class114(256);

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lam;")
    public static class286 field5571;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[I")
    private int[] field5573;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[S")
    private short[] field5555;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[S")
    private short[] field5559;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[S")
    private short[] field5561;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "[S")
    private short[] field5565;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
    public final boolean method2412(int arg0) {
        field5563++;
        boolean var2 = true;
        class286 var3 = class71.field787;
        synchronized (class71.field787) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field5567[var4] != -1 && !class71.field787.method1675(0, this.field5567[var4], arg0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method2413(int arg0) {
        if (arg0 != 17363) {
            field5560 = null;
        }
        field5571 = null;
        field5560 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ltq;BI)V")
    private final void method2414(class250 arg0, byte arg1, int arg2) {
        if (arg1 != 57) {
            return;
        }
        field5570++;
        if (arg2 == 1) {
            this.field5556 = arg0.method1350(31351);
        } else if (arg2 == 2) {
            int var4 = arg0.method1350(arg1 + 31294);
            this.field5573 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5573[var5] = arg0.method1374(-2);
            }
        } else if (arg2 == 3) {
            this.field5564 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1350(31351);
            this.field5555 = new short[var6];
            this.field5565 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5555[var7] = (short) arg0.method1374(class379.method2318(arg1, -57));
                this.field5565[var7] = (short) arg0.method1374(-2);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method1350(31351);
            this.field5561 = new short[var8];
            this.field5559 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5561[var9] = (short) arg0.method1374(-2);
                this.field5559[var9] = (short) arg0.method1374(-2);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field5567[arg2 - 60] = arg0.method1374(class379.method2318(arg1, -57));
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static final void method2415(int arg0) {
        if (arg0 != 21132) {
            field5562 = -29;
        }
        class281.field3857.method295(20579, 127);
        class249.field3360++;
        field5572++;
        class281.field3857.method1386(arg0 ^ 0xF2B7EA5C, 0);
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Lpe;")
    public final class390 method2416(int arg0) {
        field5566++;
        if (this.field5573 == null) {
            return null;
        }
        if (arg0 != -1) {
            field5574 = -63;
        }
        class390[] var2 = new class390[this.field5573.length];
        class286 var3 = class71.field787;
        synchronized (class71.field787) {
            int var4 = 0;
            while (true) {
                if (this.field5573.length <= var4) {
                    break;
                }
                var2[var4] = class208.method1122(class71.field787, 0, -115, this.field5573[var4]);
                var4++;
            }
        }
        class390 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class390(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field5555 != null) {
            for (int var6 = 0; var6 < this.field5555.length; var6++) {
                var5.method2432(false, this.field5555[var6], this.field5565[var6]);
            }
        }
        if (this.field5561 != null) {
            for (int var7 = 0; var7 < this.field5561.length; var7++) {
                var5.method2427(this.field5561[var7], this.field5559[var7], -1);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ltq;B)V")
    public final void method2417(class250 arg0, byte arg1) {
        if (arg1 != -61) {
            this.field5573 = null;
        }
        while (true) {
            int var3 = arg0.method1350(31351);
            if (var3 == 0) {
                field5558++;
                return;
            }
            this.method2414(arg0, (byte) 57, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)Lpe;")
    public final class390 method2418(int arg0) {
        field5575++;
        class390[] var2 = new class390[5];
        int var3 = arg0;
        class286 var4 = class71.field787;
        synchronized (class71.field787) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field5567[var5] != -1) {
                    var2[var3++] = class208.method1122(class71.field787, 0, -97, this.field5567[var5]);
                }
            }
        }
        class390 var6 = new class390(var2, var3);
        if (this.field5555 != null) {
            for (int var7 = 0; var7 < this.field5555.length; var7++) {
                var6.method2432(false, this.field5555[var7], this.field5565[var7]);
            }
        }
        if (this.field5561 != null) {
            for (int var8 = 0; var8 < this.field5561.length; var8++) {
                var6.method2427(this.field5561[var8], this.field5559[var8], arg0 - 1);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Z")
    public final boolean method2419(boolean arg0) {
        field5568++;
        if (this.field5573 == null) {
            return true;
        }
        boolean var2 = arg0;
        class286 var3 = class71.field787;
        synchronized (class71.field787) {
            for (int var4 = 0; var4 < this.field5573.length; var4++) {
                if (!class71.field787.method1675(0, this.field5573[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method2420(int arg0) {
        if (arg0 >= -18) {
            method2413(-52);
        }
        class203.field2721 = new class154();
        field5569++;
    }
}
