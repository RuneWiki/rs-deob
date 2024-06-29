import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class352 {

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Lme;")
    private class668 field4522 = new class668(16);

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Lpe;")
    private class615 field4524;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field4518 = 0;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field4527 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "[I")
    public static int[] field4530 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "F")
    public static float field4526;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Lpe;")
    public static class615 field4521;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "[I")
    public static int[] field4520;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
    public final void method2017(byte arg0, int arg1) {
        field4531++;
        class668 var3 = this.field4522;
        synchronized (this.field4522) {
            this.field4522.method3659(-123, arg1);
            if (arg0 != -123) {
                field4530 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZI)Lvf;")
    private final class87 method2018(boolean arg0, int arg1) {
        field4519++;
        class668 var3 = this.field4522;
        class87 var4;
        synchronized (this.field4522) {
            var4 = (class87) this.field4522.method3655(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            method2019(-84);
        }
        class615 var5 = this.field4524;
        byte[] var6;
        synchronized (this.field4524) {
            var6 = this.field4524.method3346(-1, 29, arg1);
        }
        class87 var7 = new class87();
        if (var6 != null) {
            var7.method654(new class418(var6), -24);
        }
        class668 var8 = this.field4522;
        synchronized (this.field4522) {
            this.field4522.method3650((long) arg1, -119, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method2019(int arg0) {
        if (arg0 != 3468) {
            method2019(-2);
        }
        field4530 = null;
        field4521 = null;
        field4520 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBILqp;I)Lhg;")
    public final class473 method2020(int arg0, int arg1, byte arg2, int arg3, class440 arg4, int arg5) {
        field4525++;
        class251[] var7 = null;
        class87 var8 = this.method2018(true, arg3);
        int var9 = 46 % ((-arg2 - 17) / 62);
        if (var8.field1155 != null) {
            var7 = new class251[var8.field1155.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class589 var11 = arg4.method2492(var8.field1155[var10], 30);
                var7[var10] = new class251(var11.field7994, var11.field7992, var11.field7991, var11.field7990, var11.field8001, var11.field7995, var11.field7999, var11.field7998);
            }
        }
        return new class473(var8.field1159, var7, var8.field1161, arg5, arg0, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public final void method2021(byte arg0) {
        field4528++;
        class668 var2 = this.field4522;
        synchronized (this.field4522) {
            this.field4522.method3658(0);
            int var3 = -66 / ((-arg0 - 58) / 50);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public final void method2022(int arg0) {
        field4523++;
        class668 var2 = this.field4522;
        synchronized (this.field4522) {
            this.field4522.method3656((byte) 0);
            if (arg0 <= 126) {
                field4527 = 3;
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILlf;)V")
    public static final void method2023(int arg0, class507 arg1) {
        class416.field5353 = arg1;
        field4529++;
        int var2 = 120 % ((arg0 + 16) / 39);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class352(class635 arg0, int arg1, class615 arg2) {
        this.field4524 = arg2;
        this.field4524.method3341(29, -19046);
    }
}
