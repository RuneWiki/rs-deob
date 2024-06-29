import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class230 extends class232 {

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private int field3963 = -1;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3959 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "I")
    public static int field3973 = 0;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "I")
    public static int field3970 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "Lhi;")
    public static class82 field3971 = class95.method664((byte) -104, "Jeter");

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "Lqc;")
    public static class329 field3972 = new class329(64);

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field3975 = -1;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "[I")
    public int[] field3958;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V", line = 4)
    public final void method1328(int arg0) {
        super.method1328(-69);
        field3960++;
        this.field3958 = null;
        int var2 = -30 % ((70 - arg0) / 45);
    }

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)I", line = 15)
    public final int method1633(int arg0) {
        if (arg0 != 5829) {
            this.method81(43, (byte) -83, (class153) null);
        }
        field3965++;
        return this.field3963;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 32)
    public class230() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)Z", line = 39)
    public final boolean method1634(byte arg0) {
        field3957++;
        if (this.field3958 != null) {
            return true;
        } else if (this.field3963 >= 0) {
            class303 var2 = class234.field4090 >= 0 ? class237.method1675(this.field3963, false, class136.field2344, class234.field4090) : class269.method1893(9, this.field3963, class136.field2344);
            var2.method2097();
            this.field3958 = var2.field5160;
            this.field3961 = var2.field1543;
            this.field3967 = var2.field1533;
            return true;
        } else {
            if (arg0 != 127) {
                this.method146(104, (byte) 53);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I", line = 68)
    public int[][] method146(int arg0, byte arg1) {
        int[][] var3 = this.field3996.method136(arg1 + 82, arg0);
        if (this.field3996.field278 && this.method1634((byte) 127)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class133.field2294 == this.field3967 ? arg0 : this.field3967 * arg0 / class133.field2294) * this.field3961;
            if (class54.field858 == this.field3961) {
                for (int var11 = 0; var11 < class54.field858; var11++) {
                    int var12 = this.field3958[var7++];
                    var6[var11] = class277.method1935(var12 << 4, 4080);
                    var5[var11] = class277.method1935(var12 >> 4, 4080);
                    var4[var11] = class277.method1935(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class54.field858; var8++) {
                    int var9 = this.field3961 * var8 / class54.field858;
                    int var10 = this.field3958[var7 + var9];
                    var6[var8] = class277.method1935(4080, var10 << 4);
                    var5[var8] = class277.method1935(65280, var10) >> 4;
                    var4[var8] = class277.method1935(var10 >> 12, 4080);
                }
            }
        }
        if (arg1 != -82) {
            method1635((class222) null, (class82) null, -101);
        }
        field3968++;
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lum;Lhi;I)Lim;", line = 141)
    public static final class250 method1635(class222 arg0, class82 arg1, int arg2) {
        field3964++;
        int var3 = arg0.method1594(arg1, -112);
        if (var3 == -1) {
            return new class250(0);
        }
        int[] var4 = arg0.method1585(false, var3);
        class250 var5 = new class250(var4.length);
        int var6 = -109 / ((5 - arg2) / 56);
        for (int var7 = 0; var7 < var5.field4312; var7++) {
            class153 var8 = new class153(arg0.method1577(var3, var4[var7], -29569));
            var5.field4308[var7] = var8.method1092((byte) 118);
            var5.field4305[var7] = var8.method1104(-1);
            var5.field4317[var7] = (short) var8.method1090(false);
            var5.field4304[var7] = (short) var8.method1090(false);
            var5.field4306[var7] = var8.method1097((byte) -80);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLbc;)V", line = 186)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 == -19) {
            field3962++;
            if (arg0 == 0) {
                this.field3963 = arg2.method1090(false);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V", line = 203)
    public static void method1636(int arg0) {
        field3972 = null;
        field3971 = null;
        field3959 = null;
        if (arg0 >= -70) {
            field3976 = -96;
        }
    }
}
