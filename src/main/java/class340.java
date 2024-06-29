import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class340 {

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
    public boolean field4265 = false;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Ljk;")
    private class449 field4261 = new class449(64);

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "Ljk;")
    public class449 field4277 = new class449(500);

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Ljk;")
    public class449 field4278 = new class449(30);

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Ljk;")
    public class449 field4279 = new class449(50);

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lqn;")
    public class47 field4263;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "Lqn;")
    private class47 field4276;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Z")
    public boolean field4266;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4270 = 0;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Lap;")
    public static class335 field4271 = new class335(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "Ldq;")
    public static class493 field4275 = new class493(5, 15);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "Lqn;")
    public static class47 field4267;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    public final void method1953(int arg0, int arg1) {
        class449 var3 = this.field4261;
        synchronized (this.field4261) {
            this.field4261.method2648(false, arg1);
        }
        field4260++;
        class449 var4 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.method2648(false, arg1);
        }
        class449 var5 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method2648(false, arg1);
        }
        class449 var6 = this.field4279;
        synchronized (this.field4279) {
            this.field4279.method2648(false, arg1);
            if (arg0 != -7467) {
                this.field4265 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public static void method1954(int arg0) {
        if (arg0 != 15) {
            method1954(-117);
        }
        field4267 = null;
        field4275 = null;
        field4271 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
    public final void method1955(int arg0, byte arg1) {
        field4269++;
        int var3 = -92 % ((-arg1 - 34) / 40);
        this.field4280 = arg0;
        class449 var4 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.method2642(0);
        }
        class449 var5 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method2642(0);
        }
        class449 var6 = this.field4279;
        synchronized (this.field4279) {
            this.field4279.method2642(0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
    public final void method1956(boolean arg0, int arg1) {
        field4272++;
        if (arg1 != -29111) {
            this.method1957((byte) -103, true);
        }
        if (this.field4265 != arg0) {
            this.field4265 = arg0;
            this.method1961(0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(BZ)V")
    public final void method1957(byte arg0, boolean arg1) {
        field4273++;
        if (arg1 != this.field4266) {
            this.field4266 = arg1;
            int var3 = -118 % ((arg0 - 34) / 32);
            this.method1961(0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lho;")
    public final class102 method1958(int arg0, int arg1) {
        field4268++;
        class449 var3 = this.field4261;
        class102 var4;
        synchronized (this.field4261) {
            var4 = (class102) this.field4261.method2647(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field4276;
        byte[] var6;
        synchronized (this.field4276) {
            var6 = this.field4276.method481(class374.method2121(arg0 ^ 0x42D207FD, arg1), class199.method1255(arg1, 313), -113);
        }
        class102 var7 = new class102();
        if (arg0 != -10091) {
            return null;
        }
        var7.field1280 = this;
        var7.field1316 = arg1;
        if (var6 != null) {
            var7.method772(new class463(var6), 0);
        }
        var7.method765(10);
        if (var7.field1244) {
            var7.field1246 = 0;
            var7.field1229 = false;
        }
        if (!this.field4266 && var7.field1251) {
            var7.field1271 = null;
            var7.field1278 = null;
        }
        class449 var8 = this.field4261;
        synchronized (this.field4261) {
            this.field4261.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public final void method1959(byte arg0) {
        class449 var2 = this.field4261;
        synchronized (this.field4261) {
            this.field4261.method2640(127);
        }
        field4264++;
        class449 var3 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.method2640(125);
        }
        class449 var4 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method2640(112);
        }
        if (arg0 >= 48) {
            class449 var5 = this.field4279;
            synchronized (this.field4279) {
                this.field4279.method2640(79);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(II)V")
    public final void method1960(int arg0, int arg1) {
        if (arg0 == -8870) {
            field4262++;
            this.field4261 = new class449(arg1);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public final void method1961(int arg0) {
        class449 var2 = this.field4261;
        synchronized (this.field4261) {
            this.field4261.method2642(arg0);
        }
        field4274++;
        class449 var3 = this.field4277;
        synchronized (this.field4277) {
            this.field4277.method2642(arg0);
        }
        class449 var4 = this.field4278;
        synchronized (this.field4278) {
            this.field4278.method2642(0);
        }
        class449 var5 = this.field4279;
        synchronized (this.field4279) {
            this.field4279.method2642(0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lae;IZLqn;Lqn;)V")
    public class340(class165 arg0, int arg1, boolean arg2, class47 arg3, class47 arg4) {
        this.field4263 = arg4;
        this.field4276 = arg3;
        this.field4266 = arg2;
        if (this.field4276 != null) {
            int var6 = this.field4276.method472((byte) -82) - 1;
            this.field4276.method469(30322, var6);
        }
    }
}
