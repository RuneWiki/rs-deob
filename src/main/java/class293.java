import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class293 {

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Z")
    public boolean field4279 = false;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lwi;")
    private class330 field4273 = new class330(64);

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lwi;")
    public class330 field4281 = new class330(500);

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lwi;")
    public class330 field4282 = new class330(30);

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Lwi;")
    public class330 field4283 = new class330(50);

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
    public boolean field4275;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Luu;")
    private class191 field4274;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Luu;")
    public class191 field4272;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4276 = new String[100];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Luu;")
    public static class191 field4270;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
    public final void method1867(boolean arg0, int arg1) {
        if (arg1 != 50) {
            this.field4274 = null;
        }
        field4265++;
        if (arg0 != this.field4279) {
            this.field4279 = arg0;
            this.method1874(30);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZII)V")
    public static final void method1868(int arg0, boolean arg1, int arg2, int arg3) {
        field4268++;
        class486 var4 = class515.field7568[arg2][arg0];
        if (!arg1) {
            method1870(-114);
        }
        class280.method1795(arg3, var4 == null ? class232.field3306 : var4, (byte) 52);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
    public final void method1869(byte arg0, int arg1) {
        field4269++;
        if (arg0 < -123) {
            this.field4273 = new class330(arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method1870(int arg0) {
        field4276 = null;
        field4270 = null;
        if (arg0 >= -28) {
            field4270 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final void method1871(byte arg0) {
        field4277++;
        class330 var2 = this.field4273;
        synchronized (this.field4273) {
            this.field4273.method2135(0);
        }
        class330 var3 = this.field4281;
        synchronized (this.field4281) {
            this.field4281.method2135(0);
        }
        class330 var4 = this.field4282;
        synchronized (this.field4282) {
            int var5 = -2 / ((47 - arg0) / 59);
            this.field4282.method2135(0);
        }
        class330 var6 = this.field4283;
        synchronized (this.field4283) {
            this.field4283.method2135(0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)Lcd;")
    public final class209 method1872(int arg0, boolean arg1) {
        field4266++;
        class330 var3 = this.field4273;
        class209 var4;
        synchronized (this.field4273) {
            var4 = (class209) this.field4273.method2133((long) arg0, (byte) 34);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field4274;
        byte[] var6;
        synchronized (this.field4274) {
            var6 = this.field4274.method1281(class120.method732(arg1, arg0), class294.method1881(arg0, -103), 91);
        }
        class209 var7 = new class209();
        var7.field2936 = arg0;
        var7.field2961 = this;
        if (var6 != null) {
            var7.method1442((byte) 0, new class164(var6));
        }
        var7.method1441(-11);
        if (arg1) {
            method1868(109, true, -96, -63);
        }
        if (var7.field2905) {
            var7.field2963 = false;
            var7.field2910 = 0;
        }
        if (!this.field4275 && var7.field2922) {
            var7.field2895 = null;
            var7.field2931 = null;
        }
        class330 var8 = this.field4273;
        synchronized (this.field4273) {
            this.field4273.method2131(var7, (long) arg0, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(IZ)V")
    public final void method1873(int arg0, boolean arg1) {
        field4280++;
        if (this.field4275 != arg1 && arg0 > 111) {
            this.field4275 = arg1;
            this.method1874(30);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method1874(int arg0) {
        field4278++;
        if (arg0 != 30) {
            return;
        }
        class330 var2 = this.field4273;
        synchronized (this.field4273) {
            this.field4273.method2127((byte) -87);
        }
        class330 var3 = this.field4281;
        synchronized (this.field4281) {
            this.field4281.method2127((byte) -48);
        }
        class330 var4 = this.field4282;
        synchronized (this.field4282) {
            this.field4282.method2127((byte) 122);
        }
        class330 var5 = this.field4283;
        synchronized (this.field4283) {
            this.field4283.method2127((byte) 127);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public final void method1875(int arg0, int arg1) {
        field4284++;
        this.field4285 = arg1;
        class330 var3 = this.field4281;
        synchronized (this.field4281) {
            if (arg0 != 2) {
                return;
            }
            this.field4281.method2127((byte) 126);
        }
        class330 var4 = this.field4282;
        synchronized (this.field4282) {
            this.field4282.method2127((byte) 125);
        }
        class330 var5 = this.field4283;
        synchronized (this.field4283) {
            this.field4283.method2127((byte) 124);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(ZI)V")
    public final void method1876(boolean arg0, int arg1) {
        class330 var3 = this.field4273;
        synchronized (this.field4273) {
            this.field4273.method2140(-111, arg1);
        }
        field4267++;
        class330 var4 = this.field4281;
        synchronized (this.field4281) {
            this.field4281.method2140(-115, arg1);
        }
        class330 var5 = this.field4282;
        synchronized (this.field4282) {
            this.field4282.method2140(-115, arg1);
            if (arg0) {
                field4270 = null;
            }
        }
        class330 var6 = this.field4283;
        synchronized (this.field4283) {
            this.field4283.method2140(-117, arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method1877(int arg0) {
        int var1 = -72 / ((-arg0 - 49) / 56);
        class531.field7815 = class175.field2338.field1201 + class175.field2338.field1191 + 2;
        field4271++;
        class390.field5959 = class263.field3684.field1201 + class263.field3684.field1191 + 2;
        class470.field7013 = new String[500];
        for (int var2 = 0; var2 < class470.field7013.length; var2++) {
            class470.field7013[var2] = "";
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Liv;IZLuu;Luu;)V")
    public class293(class65 arg0, int arg1, boolean arg2, class191 arg3, class191 arg4) {
        this.field4275 = arg2;
        this.field4274 = arg3;
        this.field4272 = arg4;
        if (this.field4274 != null) {
            int var6 = this.field4274.method1294(-1) - 1;
            this.field4274.method1290(false, var6);
        }
    }
}
