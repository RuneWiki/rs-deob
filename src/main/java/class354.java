import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class354 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Ljda;")
    private class239 field5190 = new class239(128);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljda;")
    public class239 field5201 = new class239(64);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Laj;")
    private class333 field5191;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Laj;")
    public class333 field5198;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field5196 = -1;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lrs;", line = 9)
    public final class680 method2232(int arg0, int arg1) {
        field5200++;
        class239 var3 = this.field5190;
        class680 var4;
        synchronized (this.field5190) {
            var4 = (class680) this.field5190.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field5191;
        byte[] var7;
        synchronized (this.field5191) {
            int var6 = 125 % ((arg1 - 26) / 56);
            var7 = this.field5191.method2095(arg0, 36, 1);
        }
        class680 var8 = new class680();
        var8.field9508 = this;
        var8.field9505 = arg0;
        if (var7 != null) {
            var8.method3760(0, new class376(var7));
        }
        var8.method3757(-124);
        class239 var9 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1544(true, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 45)
    public static final void method2233(String arg0, int arg1) {
        field5193++;
        if (arg0 == null) {
            return;
        }
        if (arg1 != -1) {
            field5196 = -26;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class194.method1339(arg1 + 18124, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class671.field9452; var3++) {
            String var4 = class42.field653[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class194.method1339(18123, var4);
            if (var5 != null && var5.equals(var2)) {
                class671.field9452--;
                for (int var6 = var3; var6 < class671.field9452; var6++) {
                    class42.field653[var6] = class42.field653[var6 + 1];
                    class246.field3374[var6] = class246.field3374[var6 + 1];
                    class65.field924[var6] = class65.field924[var6 + 1];
                    class176.field2353[var6] = class176.field2353[var6 + 1];
                    class688.field9679[var6] = class688.field9679[var6 + 1];
                    class281.field4144[var6] = class281.field4144[var6 + 1];
                }
                class639.field8881++;
                class180.field2390 = class194.field2598;
                class267 var7 = class545.method3099((byte) 69, class269.field3966, class192.field2572);
                var7.field3938.method2380(arg1 + 65281, class469.method2769(arg0, (byte) 124));
                var7.field3938.method2349(115, arg0);
                class617.method3392(var7, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V", line = 112)
    public final void method2234(int arg0, int arg1, int arg2) {
        this.field5190 = new class239(arg0);
        field5197++;
        this.field5201 = new class239(arg2);
        if (arg1 != 1) {
            this.field5191 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V", line = 129)
    public final void method2235(byte arg0, int arg1) {
        field5194++;
        class239 var3 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1546(arg1, (byte) -8);
            if (arg0 < 70) {
                this.method2232(59, -38);
            }
        }
        class239 var4 = this.field5201;
        synchronized (this.field5201) {
            this.field5201.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 146)
    public final void method2236(byte arg0) {
        class239 var2 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1555((byte) -3);
            if (arg0 > -102) {
                this.method2236((byte) -103);
            }
        }
        field5199++;
        class239 var3 = this.field5201;
        synchronized (this.field5201) {
            this.field5201.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V", line = 166)
    public final void method2237(byte arg0) {
        field5195++;
        class239 var2 = this.field5190;
        synchronized (this.field5190) {
            this.field5190.method1552(47);
        }
        class239 var3 = this.field5201;
        synchronized (this.field5201) {
            if (arg0 <= 63) {
                this.method2235((byte) -86, -110);
            }
            this.field5201.method1552(-126);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILoba;)V", line = 182)
    public static final void method2238(int arg0, class275 arg1) {
        field5192++;
        if (arg1 == null) {
            return;
        }
        class280.field4138.method2545(-127, arg1);
        class746.field10297++;
        Object var2 = null;
        class81 var5;
        if (arg1.field4073 || "".equals(arg1.field4084)) {
            var5 = new class81(arg1.field4084);
            class491.field6811++;
        } else {
            long var3 = arg1.field4087;
            for (var5 = (class81) class643.field8925.method3953(var3, 14); var5 != null && !var5.field1150.equals(arg1.field4084); var5 = (class81) class643.field8925.method3958(-15797)) {
            }
            if (var5 == null) {
                var5 = (class81) class498.field6877.method1541(-10, var3);
                if (var5 != null && !var5.field1150.equals(arg1.field4084)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class81(arg1.field4084);
                }
                class643.field8925.method3962(var3, var5, arg0 ^ 0xFFFFFF84);
                class491.field6811++;
            }
        }
        if (arg0 == 1 && var5.method685(-103, arg1)) {
            class92.method736(var5, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lgia;ILaj;Laj;)V", line = 246)
    public class354(class285 arg0, int arg1, class333 arg2, class333 arg3) {
        this.field5191 = arg2;
        this.field5198 = arg3;
        this.field5191.method2090(36, false);
    }
}
