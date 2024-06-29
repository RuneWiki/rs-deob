import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class476 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Ljt;")
    private class106 field6912 = new class106(64);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lvd;")
    private class39 field6907;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public int field6913;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
    public static int[] field6910 = new int[120];

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public static int[] field6915;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field6916;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field6910[var1] = var0 / 4;
        }
        field6915 = new int[14];
        field6917 = 1337;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2867(int arg0) {
        field6908++;
        class256.method1678(class63.field916.field10173.method307(arg0 ^ 0x542B) == 1, arg0 ^ 0xFFFFEF99, 2, 22050);
        class176.field2719 = class727.method4101(0, class179.field2759, 22050, arg0 + 19629, class106.field1476);
        class35.method180(class280.method1783(null, 52), -67, true);
        class578.field8220 = class727.method4101(1, class179.field2759, 2048, arg0 + 19629, class106.field1476);
        class171.field2666 = new class668();
        if (arg0 == 4212) {
            class578.field8220.method1975((byte) 37, class171.field2666);
            class229.field3370 = new class589(22050, client.field4279);
            class718.method4079((byte) -86);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)Lai;", line = 31)
    public final class601 method2868(int arg0, byte arg1) {
        field6914++;
        class106 var3 = this.field6912;
        class601 var4;
        synchronized (this.field6912) {
            var4 = (class601) this.field6912.method803(111, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field6907;
        byte[] var6;
        synchronized (this.field6907) {
            if (arg1 != -108) {
                method2869(-99);
            }
            var6 = this.field6907.method211(true, 19, arg0);
        }
        class601 var7 = new class601();
        if (var6 != null) {
            var7.method3493(new class645(var6), 0);
        }
        class106 var8 = this.field6912;
        synchronized (this.field6912) {
            this.field6912.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 63)
    public static void method2869(int arg0) {
        field6910 = null;
        if (arg0 < 12) {
            method2867(54);
        }
        field6915 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)I", line = 80)
    public static final int method2870(byte arg0) {
        int var1 = -58 % ((-arg0 - 37) / 57);
        field6909++;
        return class22.field234 == 1 ? class519.field7421 : class443.field6590;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 152)
    public class476(class464 arg0, int arg1, class39 arg2) {
        this.field6907 = arg2;
        this.field6913 = this.field6907.method229(19, 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B[[BLjda;)V", line = 120)
    public static final void method2871(byte arg0, byte[][] arg1, class227 arg2) {
        field6911++;
        if (arg0 >= -123) {
            method2870((byte) -66);
        }
        int var3 = class46.field666.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class434.field6462[var4] >> 8) * 64 - class361.field5224;
                int var7 = (class434.field6462[var4] & 0xFF) * 64 - class582.field8288;
                class290.method1858((byte) 122);
                arg2.method1529(class326.field4655, var5, var6, class736.field10316, var7, (byte) 117);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V", line = 168)
    public static final void method2872(byte arg0, int arg1) {
        class633.field8862 = arg1;
        class190.field2880 = -1;
        class270.field3860 = -1;
        field6916++;
        if (arg0 == -40) {
            class547.method3199(true);
        }
    }
}
