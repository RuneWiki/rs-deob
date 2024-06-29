import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class415 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lfc;")
    private class174 field5851 = new class174(64);

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "Lfc;")
    public class174 field5860 = new class174(30);

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "Loi;")
    public class53 field5857;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Loi;")
    private class53 field5856;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "[I")
    public static int[] field5859 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public int field5862;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Lhm;")
    public static class150 field5855;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 3)
    public final void method2455(byte arg0) {
        if (arg0 != -64) {
            this.field5862 = -127;
        }
        field5853++;
        class174 var2 = this.field5851;
        synchronized (this.field5851) {
            this.field5851.method1096((byte) -72);
        }
        class174 var3 = this.field5860;
        synchronized (this.field5860) {
            this.field5860.method1096((byte) 121);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V", line = 25)
    public final void method2456(byte arg0, int arg1) {
        field5861++;
        this.field5862 = arg1;
        class174 var3 = this.field5860;
        synchronized (this.field5860) {
            this.field5860.method1096((byte) 123);
        }
        int var4 = -112 / ((arg0 - 3) / 61);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)Lip;", line = 44)
    public final class508 method2457(int arg0, byte arg1) {
        field5858++;
        class174 var3 = this.field5851;
        class508 var4;
        synchronized (this.field5851) {
            var4 = (class508) this.field5851.method1088((long) arg0, (byte) -121);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 87) {
            this.method2456((byte) -93, -125);
        }
        class53 var5 = this.field5856;
        byte[] var6;
        synchronized (this.field5856) {
            var6 = this.field5856.method426(class473.method2732((byte) 78, arg0), (byte) 9, class53.method436(arg0, (byte) 126));
        }
        class508 var7 = new class508();
        var7.field7530 = this;
        var7.field7511 = arg0;
        if (var6 != null) {
            var7.method3035(-59, new class403(var6));
        }
        class174 var8 = this.field5851;
        synchronized (this.field5851) {
            this.field5851.method1097(19627, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 77)
    public final void method2458(int arg0) {
        field5852++;
        class174 var2 = this.field5851;
        synchronized (this.field5851) {
            this.field5851.method1095(arg0 ^ arg0);
        }
        class174 var3 = this.field5860;
        synchronized (this.field5860) {
            this.field5860.method1095(0);
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V", line = 92)
    public static void method2459(byte arg0) {
        field5859 = null;
        if (arg0 < 34) {
            method2459((byte) 98);
        }
        field5855 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIII)V", line = 104)
    public static final void method2460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class69.field873 = arg4;
        class531.field7779 = arg1;
        if (arg0 != 8) {
            method2460(35, 44, -61, 93, 59, -92);
        }
        field5854++;
        class350.field5036 = arg2;
        class377.field5347 = arg3;
        class363.field5199 = arg5;
        if (class363.field5199 >= 100) {
            int var6 = class69.field873 * 128 + 64;
            int var7 = class531.field7779 * 128 + 64;
            int var8 = class488.method2817(var6, true, var7, class320.field4627) - class377.field5347;
            int var9 = var6 - class478.field6654;
            int var10 = var8 - class51.field619;
            int var11 = var7 - class515.field7596;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class41.field450 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class8.field122 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class194.field2743 = 0;
            if (class41.field450 < 1024) {
                class41.field450 = 1024;
            }
            if (class41.field450 > 3072) {
                class41.field450 = 3072;
            }
        }
        class504.field7461 = 2;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZ)V", line = 154)
    public final void method2461(int arg0, boolean arg1) {
        field5850++;
        class174 var3 = this.field5851;
        synchronized (this.field5851) {
            this.field5851.method1087(1, arg0);
        }
        class174 var4 = this.field5860;
        synchronized (this.field5860) {
            if (arg1) {
                this.field5860.method1087(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lle;ILoi;Loi;)V", line = 180)
    public class415(class205 arg0, int arg1, class53 arg2, class53 arg3) {
        this.field5857 = arg3;
        this.field5856 = arg2;
        int var5 = this.field5856.method434(26154) - 1;
        this.field5856.method435(var5, 0);
    }
}
