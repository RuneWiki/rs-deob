import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class115 {

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    private int field1807 = -1;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    private int field1808 = 0;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "La;")
    private class281 field1814 = new class281();

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
    public boolean field1820 = false;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[Lwd;")
    private class118[] field1809;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "[[[I")
    private int[][][] field1816;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[J")
    public static long[] field1805 = new long[500];

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1813 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 6)
    public static final int method882(int arg0, int arg1, int arg2) {
        int var3 = arg0 + arg2 & arg1 >> 31;
        field1806++;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 16)
    public static void method883(byte arg0) {
        field1813 = null;
        field1805 = null;
        if (arg0 > -115) {
            field1805 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 31)
    public static final String method884(int arg0, byte arg1) {
        field1811++;
        if (arg1 != -4) {
            field1818 = 87;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 43)
    public final void method885(byte arg0) {
        field1812++;
        for (int var2 = 0; var2 < this.field1819; var2++) {
            this.field1816[var2][0] = null;
            this.field1816[var2][1] = null;
            this.field1816[var2][2] = null;
            this.field1816[var2] = (int[][]) null;
        }
        if (arg0 != -63) {
            method887((byte) 90, -24L);
        }
        this.field1816 = (int[][][]) null;
        this.field1809 = null;
        this.field1814.method1951(29532);
        this.field1814 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V", line = 211)
    public class115(int arg0, int arg1, int arg2) {
        this.field1815 = arg1;
        this.field1819 = arg0;
        this.field1809 = new class118[this.field1815];
        this.field1816 = new int[this.field1819][3][arg2];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[[I", line = 74)
    public final int[][] method886(int arg0, int arg1) {
        field1804++;
        if (arg1 != 3) {
            this.method885((byte) 19);
        }
        if (this.field1819 == this.field1815) {
            this.field1820 = this.field1809[arg0] == null;
            this.field1809[arg0] = class193.field3011;
            return this.field1816[arg0];
        } else if (this.field1819 == 1) {
            this.field1820 = this.field1807 != arg0;
            this.field1807 = arg0;
            return this.field1816[0];
        } else {
            class118 var3 = this.field1809[arg0];
            if (var3 == null) {
                this.field1820 = true;
                if (this.field1808 >= this.field1819) {
                    class118 var4 = (class118) this.field1814.method1945((byte) 71);
                    var3 = new class118(arg0, var4.field1839);
                    this.field1809[var4.field1845] = null;
                    var4.method39(10717);
                } else {
                    var3 = new class118(arg0, this.field1808);
                    this.field1808++;
                }
                this.field1809[arg0] = var3;
            } else {
                this.field1820 = false;
            }
            this.field1814.method1949(var3, (byte) 91);
            return this.field1816[var3.field1839];
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BJ)V", line = 146)
    public static final void method887(byte arg0, long arg1) {
        field1803++;
        class85.field1236.field3866 = 0;
        if (arg0 >= -88) {
            field1817 = -12;
        }
        class85.field1236.method1752(21, -112);
        class85.field1236.method1738((byte) 14, arg1);
        class324.field5004 = 0;
        class257.field3929 = 0;
        class338.field5251 = -3;
        class38.field564 = 1;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)[[[I", line = 166)
    public final int[][][] method888(byte arg0) {
        field1810++;
        if (arg0 >= -23) {
            this.field1819 = 36;
        }
        if (this.field1819 != this.field1815) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1819; var2++) {
            this.field1809[var2] = class193.field3011;
        }
        return this.field1816;
    }
}
