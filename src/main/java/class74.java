import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class74 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Ljt;")
    public class106 field1035 = new class106(20);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Ljt;")
    private class106 field1040 = new class106(64);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lvd;")
    public class39 field1036;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lvd;")
    private class39 field1038;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[S")
    public static short[] field1028 = new short[256];

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lvd;")
    public static class39 field1033;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lul;")
    public static class574 field1032;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1031;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method623(int arg0) {
        if (arg0 != 21530) {
            method623(117);
        }
        field1031 = null;
        field1033 = null;
        field1028 = null;
        field1032 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
    public static final void method624(int arg0, int arg1, int arg2) {
        field1030++;
        if (class502.field7152 == null) {
            return;
        }
        int var3 = class73.field1021;
        int var4 = class627.field8770;
        class347.method2191(arg2 ^ arg2, arg0, arg1);
        if (class22.field234 == 0) {
            class753.field10520 = null;
            class753.field10520 = class502.field7152.method517(class502.field7152.method473(class519.field7421, class589.field8349), class502.field7152.method454(class519.field7421, class589.field8349));
        } else if (class22.field234 == 1 && (class302.field4293 == null || class73.field1021 != var3 || class627.field8770 != var4)) {
            class302.field4293 = new class198[class73.field1021 * class627.field8770];
            for (int var5 = 0; var5 < class302.field4293.length; var5++) {
                class302.field4293[var5] = class502.field7152.method517(class502.field7152.method473(class634.field8902, class437.field6477), class502.field7152.method454(class634.field8902, class437.field6477));
            }
            class271.field3871 = 1;
            class564.field8028 = new int[class73.field1021 * class627.field8770];
        }
        class226.field3323 = true;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lib;")
    public final class154 method625(int arg0, int arg1) {
        field1039++;
        class106 var3 = this.field1040;
        class154 var4;
        synchronized (this.field1040) {
            var4 = (class154) this.field1040.method803(107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field1038;
        byte[] var6;
        synchronized (this.field1038) {
            var6 = this.field1038.method211(true, arg0, arg1);
        }
        class154 var7 = new class154();
        var7.field2502 = this;
        if (var6 != null) {
            var7.method1149(new class645(var6), -32);
        }
        class106 var8 = this.field1040;
        synchronized (this.field1040) {
            this.field1040.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)V")
    public final void method626(int arg0, int arg1) {
        if (arg0 < 55) {
            field1027 = -108;
        }
        class106 var3 = this.field1040;
        synchronized (this.field1040) {
            this.field1040.method807(arg1, -1);
        }
        field1041++;
        class106 var4 = this.field1035;
        synchronized (this.field1035) {
            this.field1035.method807(arg1, -1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public final void method627(byte arg0) {
        field1029++;
        class106 var2 = this.field1040;
        synchronized (this.field1040) {
            this.field1040.method809(true);
        }
        if (arg0 > -22) {
            method624(-60, -74, -46);
        }
        class106 var3 = this.field1035;
        synchronized (this.field1035) {
            this.field1035.method809(true);
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        field1037++;
        class106 var2 = this.field1040;
        synchronized (this.field1040) {
            this.field1040.method800(99);
        }
        class106 var3 = this.field1035;
        synchronized (this.field1035) {
            this.field1035.method800(87);
        }
        if (arg0 >= -127) {
            this.method625(-48, -60);
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lqg;ILvd;Lvd;)V")
    public class74(class464 arg0, int arg1, class39 arg2, class39 arg3) {
        this.field1036 = arg3;
        this.field1038 = arg2;
        this.field1038.method229(46, 0);
    }
}
