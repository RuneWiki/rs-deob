import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class772 {

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "Ljda;")
    private class239 field10632 = new class239(64);

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "Ljda;")
    public class239 field10638 = new class239(2);

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "Laj;")
    private class333 field10631;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "Laj;")
    public class333 field10635;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field10629;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field10630;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public static int field10633;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field10634;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    public static int field10637;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public static int field10639;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oha", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field10640;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
    public final void method4273(int arg0, int arg1) {
        field10639++;
        class239 var3 = this.field10632;
        synchronized (this.field10632) {
            this.field10632.method1546(arg1, (byte) -8);
        }
        class239 var4 = this.field10638;
        synchronized (this.field10638) {
            this.field10638.method1546(arg1, (byte) -8);
            int var5 = -18 % ((9 - arg0) / 62);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIII)Z")
    public static final boolean method4274(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 64) {
            method4274(-57, 15, -47, -124);
        }
        field10637++;
        class392 var4 = (class392) class94.method752(arg3, arg2, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class790.method4360(var4, arg0 ^ 0xFFFFFFD8);
        }
        class392 var6 = (class392) class771.method4264(arg3, arg2, arg1, field10640 == null ? (field10640 = method4280("he")) : field10640);
        if (var6 != null) {
            var5 &= class790.method4360(var6, -102);
        }
        class392 var7 = (class392) class119.method988(arg3, arg2, arg1);
        if (var7 != null) {
            var5 &= class790.method4360(var7, -84);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
    public final void method4275(int arg0) {
        field10630++;
        class239 var2 = this.field10632;
        synchronized (this.field10632) {
            this.field10632.method1552(arg0 ^ 0xFFFFFF85);
        }
        if (arg0 != 0) {
            this.method4275(-8);
        }
        class239 var3 = this.field10638;
        synchronized (this.field10638) {
            this.field10638.method1552(-127);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public static final void method4276(byte arg0) {
        class66.field937.method512(class40.field638, class389.field5669, class306.field4437);
        if (arg0 >= 58) {
            field10634++;
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)Lqm;")
    public final class155 method4277(int arg0, int arg1) {
        field10629++;
        class239 var3 = this.field10632;
        class155 var4;
        synchronized (this.field10632) {
            var4 = (class155) this.field10632.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field10631;
        byte[] var6;
        synchronized (this.field10631) {
            var6 = this.field10631.method2095(arg1, 33, 1);
        }
        class155 var7 = new class155();
        var7.field2112 = this;
        if (var6 != null) {
            var7.method1134(new class376(var6), -1);
        }
        class239 var8 = this.field10632;
        synchronized (this.field10632) {
            this.field10632.method1544(true, var7, (long) arg1);
        }
        int var9 = 89 % ((arg0 - 52) / 43);
        return var7;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V")
    private final void method4278(byte arg0) {
        field10636++;
        class239 var2 = this.field10632;
        synchronized (this.field10632) {
            this.field10632.method1555((byte) -3);
        }
        class239 var3 = this.field10638;
        synchronized (this.field10638) {
            if (arg0 <= 12) {
                this.field10638 = null;
            }
            this.field10638.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "(B)V")
    public static final void method4279(byte arg0) {
        class298.field4317.method1291(16);
        field10633++;
        class473.field6534.method2309(-117);
        class381.field5566.method1164(-106);
        class350.field5132.method3731((byte) 85);
        class364.field5309.method3345(-51);
        class770.field10602.method2468(1);
        class6.field65.method1031((byte) 49);
        class784.field10798.method3969(false);
        class642.field8904.method3242((byte) 42);
        class488.field6763.method2180(64);
        class89.field1234.method3740((byte) 77);
        class719.field10024.method2122(true);
        class159.field2194.method393(true);
        class495.field6846.method2236((byte) -114);
        class564.field7557.method3258((byte) -85);
        class206.field2703.method3906((byte) -6);
        class457.field6339.method782(3138);
        class563.field7548.method2282((byte) -126);
        class723.field10061.method4100(29083);
        int var1 = 33 % ((arg0 + 34) / 58);
        class93.field1329.method4278((byte) 104);
        class273.field4057.method2564(5);
        class493.field6825.method4281(-110);
        class462.method2740((byte) -121);
        class665.method3686(false);
        class404.method2519(0);
        class418.method2577(49);
        if (class731.field10141 != class197.field2634) {
            for (int var2 = 0; var2 < class581.field7768.length; var2++) {
                class581.field7768[var2] = null;
            }
            class700.field9823 = 0;
        }
        class93.method748(10);
        class273.method1779((byte) 114);
        class672.method3744(-20162);
        class164.method1187(true);
        class625.method3439(1);
        class173.field2322.method1555((byte) -3);
        class379.field5542.method529();
        class494.method2864(true);
        class291.method1843(109);
        class74.field1100.method2119(false);
        class651.field9035.method2119(false);
        class637.field8871.method2119(false);
        class415.field5964.method2119(false);
        class11.field175.method2119(false);
        class587.field7828.method2119(false);
        class177.field2367.method2119(false);
        class237.field3203.method2119(false);
        class643.field8927.method2119(false);
        class176.field2352.method2119(false);
        class586.field7805.method2119(false);
        class183.field2444.method2119(false);
        class383.field5606.method2119(false);
        class781.field10716.method2119(false);
        class396.field5819.method2119(false);
        class344.field5072.method2119(false);
        class281.field4150.method2119(false);
        class473.field6529.method2119(false);
        class108.field1492.method2119(false);
        class262.field3891.method2119(false);
        class33.field530.method2119(false);
        class598.field8141.method2119(false);
        class554.field7478.method2119(false);
        class466.field6466.method2119(false);
        class461.field6394.method2119(false);
        class583.field7790.method2119(false);
        class16.field241.method2119(false);
        class219.field2911.method2119(false);
        class162.field2210.method2119(false);
        class138.field2009.method2119(false);
        class437.field6160.method2119(false);
        class482.field6667.method2119(false);
        class134.field1966.method2119(false);
        class527.field7224.method1555((byte) -3);
        class87.field1226.method1555((byte) -3);
        class167.field2247.method1555((byte) -3);
        class549.field7422.method1555((byte) -3);
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V")
    public class772(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field10631 = arg2;
        this.field10635 = arg3;
        this.field10631.method2090(33, false);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4280(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
