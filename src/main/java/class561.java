import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class class561 implements class100 {

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lwia;")
    public class679 field7977;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lwu;")
    private class557 field7972;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "Lwu;")
    public class557 field7983;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    private int field7974;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "J")
    private long field7975;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "Lda;")
    private class400 field7982;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Z")
    public static boolean field7980;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIII)V")
    public abstract void method968(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lig;III)V")
    public static final void method3358(class674 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class485.field6556) {
            class38 var4 = class352.field4549[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field532 != null && var4.field532.method373((byte) -57)) {
                arg0.method365(0, (byte) 78, true, 0, class646.field9160, class96.field1402, var4.field532);
            }
        }
        if (arg3 < class485.field6556) {
            class38 var5 = class352.field4549[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field532 != null && var5.field532.method373((byte) -57)) {
                arg0.method365(0, (byte) 107, true, class96.field1402, class646.field9160, 0, var5.field532);
            }
        }
        if (arg2 < class485.field6556 && arg3 < class314.field4059) {
            class38 var6 = class352.field4549[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field532 != null && var6.field532.method373((byte) -57)) {
                arg0.method365(0, (byte) 114, true, class96.field1402, class646.field9160, class96.field1402, var6.field532);
            }
        }
        if (arg2 < class485.field6556 && arg3 > 0) {
            class38 var7 = class352.field4549[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field532 != null && var7.field532.method373((byte) -57)) {
                arg0.method365(0, (byte) 97, true, -class96.field1402, class646.field9160, class96.field1402, var7.field532);
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public void method682(byte arg0) {
        field7976++;
        if (arg0 < 29) {
            method3359(-107, 81, -108, -107);
        }
        class742 var2 = class216.method1415(this.field7972, (byte) 83, this.field7977.field9572);
        this.field7982 = class96.field1401.method2085(var2, class320.method1869(this.field7983, this.field7977.field9572), true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BZII)V")
    public abstract void method971(byte arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZZ)V")
    public final void method681(boolean arg0, boolean arg1) {
        field7981++;
        int var3 = this.field7977.field9569.method554(class95.field1381, (byte) 122, this.field7977.field9575) + this.field7977.field9562;
        int var4 = this.field7977.field9563.method2838(this.field7977.field9561, class631.field8989, arg0) + this.field7977.field9570;
        this.method971((byte) 20, arg1, var3, var4);
        this.method968(arg1, var4, -30264, var3);
        String var5 = class562.field7995.method1584((byte) 127);
        if ((class224.method1457((byte) -62) - this.field7975) > 10000L) {
            var5 = var5 + " (" + class562.field7995.method1577(118).method2807((byte) 84) + ")";
        }
        this.field7982.method2434(this.field7977.field9575 / 2 + var3, this.field7977.field9571, var5, arg0, -1, this.field7977.field9561 / 2 + this.field7977.field9568 + var4 + 4);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
    public boolean method680(int arg0) {
        field7979++;
        boolean var2 = true;
        if (arg0 != 29892) {
            this.method682((byte) 24);
        }
        if (!this.field7983.method3340(0, this.field7977.field9572)) {
            var2 = false;
        }
        if (!this.field7972.method3340(0, this.field7977.field9572)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIII)I")
    public static final int method3359(int arg0, int arg1, int arg2, int arg3) {
        field7978++;
        if (arg0 == arg3) {
            return arg3;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * arg1 + (arg3 & 0x7F) * var4 >> 7;
        if (arg2 == 13202) {
            int var6 = (arg0 & 0x380) * arg1 + (arg3 & 0x380) * var4 >> 7;
            int var7 = (arg0 & 0xFC00) * arg1 + (arg3 & 0xFC00) * var4 >> 7;
            return var6 & 0x380 | var7 & 0xFC00 | var5 & 0x7F;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lwu;Lwu;Lwia;)V")
    public class561(class557 arg0, class557 arg1, class679 arg2) {
        this.field7977 = arg2;
        this.field7972 = arg1;
        this.field7983 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)I")
    public final int method3360(boolean arg0) {
        field7984++;
        int var2 = class562.field7995.method1578(-117);
        if (arg0) {
            field7980 = false;
        }
        int var3 = var2 * 100;
        if (this.field7974 == var2 && var2 != 0) {
            int var4 = class562.field7995.method1581((byte) 89);
            if (var2 < var4) {
                long var5 = this.field7975 - class562.field7995.method1583(true);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class224.method1457((byte) -62) - this.field7975) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field7974 = var2;
            this.field7975 = class224.method1457((byte) -62);
        }
        return var3;
    }
}
