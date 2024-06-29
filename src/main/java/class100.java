import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 extends class17 {

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    private int field1760 = 204;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    private int field1767 = 1;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    private int field1764 = 1;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Lsf;")
    public static class108 field1761 = class140.method973(255, "Null");

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "Lsf;")
    public static class108 field1768 = class140.method973(255, "Attaquer");

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "J")
    public static long field1771 = 0L;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "(I)I", line = 14)
    public static final int method695(int arg0) {
        field1763++;
        if (arg0 <= 27) {
            method697(23, (byte) 12);
        }
        return ((class42.field561 == 0 ? 0 : 1) << 22) + ((class203.field3671 == 0 ? 0 : 1) << 21) + ((class15.field194 == 0 ? 0 : 1) << 20) + ((class26.field397 ? 1 : 0) << 13) + ((class180.field3280 ? 1 : 0) << 10) + ((class312.field5394 ? 1 : 0) << 9) + ((class283.field4962 ? 1 : 0) << 8) + ((class180.field3277 ? 1 : 0) << 6) + ((class137.field2427 ? 1 : 0) << 5) + ((class163.field2916 ? 1 : 0) << 4) + ((class183.field3367 ? 1 : 0) << 3) + (class269.field4716 & 0x7) + ((class287.field5018 ? 1 : 0) << 7) + ((class247.field4280 & 0x3) << 11) + ((class60.field962 ? 1 : 0) << 15) + (class165.method1145() << 23) - (-((class221.field3937 ? 1 : 0) << 16) + -((class131.field2242 ? 1 : 0) << 19));
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 25)
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BIB)I", line = 42)
    public static final int method696(int arg0, byte[] arg1, int arg2, byte arg3) {
        field1769++;
        int var4 = -1;
        if (arg3 < 95) {
            field1771 = -20L;
        }
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class218.field3877[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V", line = 88)
    public static final void method697(int arg0, byte arg1) {
        class120 var2 = class248.method1704(9, 59, arg0);
        field1770++;
        int var3 = -103 % ((arg1 - 56) / 54);
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(II)[I", line = 106)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 >= -95) {
            method695(75);
        }
        field1762++;
        int[] var3 = this.field217.method1698(114, arg1);
        if (this.field217.field4295) {
            for (int var4 = 0; var4 < class116.field2008; var4++) {
                int var5 = class36.field504[arg1];
                int var6 = this.field1764 * var5 >> 12;
                int var7 = var5 % (4096 / this.field1764) * this.field1764;
                int var8 = class61.field979[var4];
                int var9 = this.field1767 * var8 >> 12;
                int var10 = var8 % (4096 / this.field1767) * this.field1767;
                if (this.field1760 > var7) {
                    for (var9 -= var6; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var10 < this.field1760) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1760 > var10) {
                    int var11;
                    for (var11 = var9 - var6; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLrm;I)V", line = 200)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1767 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field1764 = arg1.method1731(true);
        } else if (arg2 == 2) {
            this.field1760 = arg1.method1712(-1);
        }
        field1766++;
        if (arg0 != -114) {
            this.method120(-35, 55);
        }
    }

    @OriginalMember(owner = "client!p", name = "i", descriptor = "(I)V", line = 232)
    public static void method698(int arg0) {
        field1761 = null;
        if (arg0 != 0) {
            method697(62, (byte) 12);
        }
        field1768 = null;
    }
}
