import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class427 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Ldc;")
    private class5 field6292 = new class5(64);

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lhe;")
    private class239 field6291;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Z")
    public static boolean field6293 = true;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6289 = 765;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field6288 = 0;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2544(byte arg0) {
        int var1 = -34 / ((arg0 - 24) / 47);
        field6290++;
        class383.field5696 = 0;
        class230.field3220.method2089(328);
        class174.field2387 = false;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I[Lts;B)V", line = 17)
    public static final void method2545(int arg0, class356[] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class356 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5170 == 0) {
                    if (var4.field5151 != null) {
                        method2545(arg0, var4.field5151, (byte) 105);
                    }
                    class311 var5 = (class311) class213.field3010.method2310((byte) 78, (long) var4.field5185);
                    if (var5 != null) {
                        class469.method2743(arg0, false, var5.field4525);
                    }
                }
                if (arg0 == 0 && var4.field5143 != null) {
                    class99 var6 = new class99();
                    var6.field1343 = var4;
                    var6.field1346 = var4.field5143;
                    class396.method2358(var6);
                }
                if (arg0 == 1 && var4.field5239 != null) {
                    if (var4.field5184 >= 0) {
                        class356 var7 = class4.method25(var4.field5185, false);
                        if (var7 == null || var7.field5151 == null || var7.field5151.length <= var4.field5184 || var7.field5151[var4.field5184] != var4) {
                            continue;
                        }
                    }
                    class99 var8 = new class99();
                    var8.field1346 = var4.field5239;
                    var8.field1343 = var4;
                    class396.method2358(var8);
                }
            }
        }
        if (arg2 > 47) {
            field6294++;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lvr;", line = 99)
    public final class85 method2546(int arg0, int arg1) {
        field6295++;
        class5 var3 = this.field6292;
        class85 var4;
        synchronized (this.field6292) {
            var4 = (class85) this.field6292.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6291.method1470(4, arg1, arg0);
        class85 var6 = new class85();
        if (var5 != null) {
            var6.method533(new class156(var5), (byte) -55);
        }
        class5 var7 = this.field6292;
        synchronized (this.field6292) {
            this.field6292.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 137)
    public class427(class298 arg0, int arg1, class239 arg2) {
        this.field6291 = arg2;
        this.field6291.method1473(4309, 5);
    }
}
