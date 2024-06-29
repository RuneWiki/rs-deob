import java.io.IOException;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 {

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3313 = Calendar.getInstance();

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3321 = -1;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
    public static boolean field3317 = false;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lec;")
    public static class32 field3324 = class73.method594("welle2:", true);

    @OriginalMember(owner = "client!v", name = "k", descriptor = "Z")
    public static boolean field3320 = false;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3325 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "J")
    public long field3326;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lv;")
    public class146 field3318;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lv;")
    public class146 field3322;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lga;")
    public static class44 field3319;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public final void method1093(int arg0) {
        field3315++;
        if (this.field3318 == null) {
            return;
        }
        this.field3318.field3322 = this.field3322;
        this.field3322.field3318 = this.field3318;
        this.field3318 = null;
        this.field3322 = null;
        if (arg0 != 0) {
            this.field3326 = -78L;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lj;")
    public static final class62 method1094(int arg0, int arg1) {
        field3310++;
        class62 var2 = (class62) class82.field1915.method486(-28825, (long) arg0);
        if (arg1 <= 15) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class41.field963.method206(10, arg0, -125);
            class62 var4 = new class62();
            var4.field1400 = arg0;
            if (var3 != null) {
                var4.method476(new class66(var3), -17);
            }
            var4.method473((byte) 93);
            if (var4.field1389 != -1) {
                var4.method482(method1094(var4.field1412, 80), method1094(var4.field1389, 116), -114);
            }
            if (!class11.field193 && var4.field1393) {
                var4.field1411 = null;
                var4.field1426 = 0;
                var4.field1430 = class38.field904;
                var4.field1429 = null;
            }
            class82.field1915.method485((long) arg0, (byte) -122, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljd;B)V")
    public static final void method1095(class66 arg0, byte arg1) {
        field3311++;
        byte[] var2 = new byte[24];
        if (class133.field3049 != null) {
            try {
                class133.field3049.method1186((byte) -117, 0L);
                int var3 = 0;
                class133.field3049.method1184(var2, 0);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method544(0, arg1 - 25071, 24, var2);
        if (arg1 != -83) {
            method1094(-78, 99);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
    public final boolean method1096(int arg0) {
        if (arg0 != 0) {
            method1095(null, (byte) 86);
        }
        field3314++;
        return this.field3318 != null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field3324 = null;
        field3319 = null;
        int var1 = -27 % ((-arg0 - 57) / 36);
        field3313 = null;
    }
}
