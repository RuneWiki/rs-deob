import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class75 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lwm;")
    private class399 field1527 = new class399(128);

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Lph;")
    private class459 field1528;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
    public static int[] field1530 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1536 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)I")
    public static final int method674(int arg0, int arg1, int arg2) {
        field1534++;
        if (arg0 >= -94) {
            field1536 = -107;
        }
        return arg1 == 4 || arg1 == 5 ? class407.field6164[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method675(byte arg0) {
        field1524++;
        if (arg0 > 45) {
            client.field3213.method397(((float) class186.field2990.field2550 * 0.1F + 0.7F) * class175.field2855);
            client.field3213.method303(class439.field6519, class461.field6861, class390.field5856, (float) (class146.field2451 << 0), (float) (class463.field6870 << 0), (float) (class258.field3957 << 0));
            client.field3213.method350(class296.field4491);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public final void method676(byte arg0) {
        if (arg0 < 16) {
            method678(2, -105, (byte) -2, 30);
        }
        field1526++;
        class399 var2 = this.field1527;
        synchronized (this.field1527) {
            this.field1527.method2477(-124);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method677(int arg0) {
        field1530 = null;
        if (arg0 >= -88) {
            method675((byte) -19);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)Lms;")
    public static final class535 method678(int arg0, int arg1, byte arg2, int arg3) {
        field1523++;
        class234 var4 = class518.field7511[arg1][arg0][arg3];
        if (var4 == null) {
            return null;
        }
        if (arg2 >= -34) {
            field1536 = 63;
        }
        class535 var5 = null;
        int var6 = -1;
        for (class440 var7 = var4.field3607; var7 != null; var7 = var7.field6528) {
            class402 var8 = var7.field6530;
            if (var8 instanceof class535) {
                class535 var9 = (class535) var8;
                int var10 = (var9.method2241(-26) - 1) * 64 + 60;
                int var11 = var9.field6073 - var10 >> 7;
                int var12 = var9.field6078 - var10 >> 7;
                int var13 = var9.field6073 + var10 >> 7;
                int var14 = var9.field6078 + var10 >> 7;
                if (arg0 >= var11 && arg3 >= var12 && var13 >= arg0 && arg3 <= var14) {
                    int var15 = (var14 - (arg3 - 1)) * (var13 + 1 - arg0);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class75(class341 arg0, int arg1, class459 arg2) {
        this.field1528 = arg2;
        this.field1528.method2763(1, -3);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lqc;")
    public final class526 method679(int arg0, int arg1) {
        if (arg0 != 32020) {
            this.field1527 = null;
        }
        field1529++;
        class399 var3 = this.field1527;
        class526 var4;
        synchronized (this.field1527) {
            var4 = (class526) this.field1527.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field1528;
        byte[] var6;
        synchronized (this.field1528) {
            var6 = this.field1528.method2757(1, arg1, (byte) -123);
        }
        class526 var7 = new class526();
        if (var6 != null) {
            var7.method3110(new class289(var6), false);
        }
        class399 var8 = this.field1527;
        synchronized (this.field1527) {
            this.field1527.method2472(-110, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
    public final void method680(int arg0, byte arg1) {
        if (arg1 != -67) {
            return;
        }
        field1525++;
        class399 var3 = this.field1527;
        synchronized (this.field1527) {
            this.field1527.method2471((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public final void method681(int arg0) {
        class399 var2 = this.field1527;
        synchronized (this.field1527) {
            if (arg0 != 0) {
                return;
            }
            this.field1527.method2475((byte) 67);
        }
        field1533++;
    }
}
