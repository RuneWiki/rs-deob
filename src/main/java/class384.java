import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class384 implements class252 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Lqi;")
    private class406 field5396 = new class406(128);

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    public int[] field5408 = new int[class385.field5412.field4719];

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private int[] field5406 = new int[class385.field5412.field4719];

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field5400 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5401 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Leh;")
    public static class246 field5403 = new class246(110, 0);

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5410 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lkv;")
    public static class180 field5404;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method2226(int arg0) {
        if (arg0 != -1887687385) {
            return;
        }
        for (int var2 = 0; var2 < class385.field5412.field4719; var2++) {
            class248 var3 = class385.field5412.method1951(var2, -458);
            if (var3 != null && var3.field3715 == 0) {
                this.field5406[var2] = 0;
                this.field5408[var2] = 0;
            }
        }
        field5405++;
        this.field5396 = new class406(128);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public final int method1638(int arg0, int arg1) {
        field5399++;
        class327 var3 = class181.field2596.method2792(arg0 - 12303, arg1);
        if (arg0 != 12367) {
            this.field5406 = null;
        }
        int var4 = var3.field4763;
        int var5 = var3.field4767;
        int var6 = var3.field4771;
        int var7 = class469.field6555[var6 - var5];
        return this.field5408[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method2227(int arg0) {
        if (arg0 >= -97) {
            method2231(-67, -110, 65);
        }
        field5403 = null;
        field5401 = null;
        field5410 = null;
        field5404 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public final void method2228(byte arg0, int arg1, int arg2) {
        field5395++;
        class327 var4 = class181.field2596.method2792(64, arg1);
        int var5 = var4.field4763;
        int var6 = var4.field4767;
        int var7 = -120 % ((23 - arg0) / 53);
        int var8 = var4.field4771;
        int var9 = class469.field6555[var8 - var6];
        if (arg2 < 0 || arg2 > var9) {
            arg2 = 0;
        }
        int var10 = var9 << var6;
        this.method2232(var5, this.field5406[var5] & ~var10 | var10 & arg2 << var6, 107);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)V")
    public final void method2229(int arg0, boolean arg1, int arg2) {
        field5402++;
        class327 var4 = class181.field2596.method2792(64, arg0);
        int var5 = var4.field4763;
        int var6 = var4.field4767;
        if (!arg1) {
            this.field5408 = null;
        }
        int var7 = var4.field4771;
        int var8 = class469.field6555[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2233((byte) 109, var5, this.field5408[var5] & ~var9 | var9 & arg2 << var6);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
    public final int method1637(byte arg0, int arg1) {
        if (arg0 <= 101) {
            return -118;
        } else {
            field5407++;
            return this.field5408[arg1];
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)I")
    public final int method2230(boolean arg0, byte arg1) {
        field5409++;
        long var3 = class465.method2699((byte) 14);
        if (arg1 > -85) {
            this.field5396 = null;
        }
        for (class131 var5 = arg0 ? (class131) this.field5396.method2414((byte) -127) : (class131) this.field5396.method2410((byte) 115); var5 != null; var5 = (class131) this.field5396.method2410((byte) 127)) {
            if ((var5.field1723 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1723 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7060;
                    this.field5408[var6] = this.field5406[var6];
                    var5.method2891(11);
                    return var6;
                }
                var5.method2891(-127);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
    public static final int method2231(int arg0, int arg1, int arg2) {
        field5397++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 < 45) {
            return 85;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V")
    public final void method2232(int arg0, int arg1, int arg2) {
        int var4 = 46 % ((arg2 - 35) / 58);
        field5398++;
        this.field5406[arg0] = arg1;
        class131 var5 = (class131) this.field5396.method2405((long) arg0, -52);
        if (var5 == null) {
            class131 var6 = new class131(4611686018427387905L);
            this.field5396.method2413((long) arg0, var6, -1);
        } else if (var5.field1723 != 4611686018427387905L) {
            var5.field1723 = class465.method2699((byte) 14) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BII)V")
    public final void method2233(byte arg0, int arg1, int arg2) {
        this.field5408[arg1] = arg2;
        field5394++;
        class131 var4 = (class131) this.field5396.method2405((long) arg1, -100);
        int var5 = -11 % ((arg0 - 38) / 54);
        if (var4 == null) {
            class131 var6 = new class131(class465.method2699((byte) 14) + 500L);
            this.field5396.method2413((long) arg1, var6, -1);
        } else {
            var4.field1723 = class465.method2699((byte) 14) + 500L;
        }
    }
}
