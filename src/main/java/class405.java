import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class405 extends class551 {

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lwca;")
    public static class311 field5813;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Ljava/lang/String;")
    public String field5810;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "[C")
    public char[] field5814;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "[C")
    public char[] field5818;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
    public int[] field5815;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "[I")
    public int[] field5820;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 7)
    public static void method2423(byte arg0) {
        int var1 = -66 % ((-arg0 - 31) / 63);
        field5813 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lps;IB)V", line = 17)
    private final void method2424(class428 arg0, int arg1, byte arg2) {
        field5819++;
        if (arg1 == 1) {
            this.field5810 = arg0.method2585(-25);
        } else if (arg1 == 2) {
            int var7 = arg0.method2561((byte) -85);
            this.field5818 = new char[var7];
            this.field5820 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5820[var8] = arg0.method2620(arg2 + 152);
                byte var9 = arg0.method2570((byte) 57);
                this.field5818[var8] = var9 == 0 ? 0 : class281.method1772(true, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2561((byte) -55);
            this.field5815 = new int[var4];
            this.field5814 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5815[var5] = arg0.method2620(class342.method2119(arg2, -113));
                byte var6 = arg0.method2570((byte) 57);
                this.field5814[var5] = var6 == 0 ? 0 : class281.method1772(true, var6);
            }
        }
        if (arg2 != -51) {
            this.field5810 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(CI)I", line = 85)
    public final int method2425(char arg0, int arg1) {
        field5821++;
        if (this.field5820 == null) {
            return -1;
        }
        if (arg1 != -1) {
            this.method2427((byte) 65, 'o');
        }
        for (int var3 = 0; var3 < this.field5820.length; var3++) {
            if (this.field5818[var3] == arg0) {
                return this.field5820[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lps;B)V", line = 109)
    public final void method2426(class428 arg0, byte arg1) {
        field5816++;
        if (arg1 > -79) {
            this.field5814 = null;
        }
        while (true) {
            int var3 = arg0.method2561((byte) -100);
            if (var3 == 0) {
                return;
            }
            this.method2424(arg0, var3, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BC)I", line = 131)
    public final int method2427(byte arg0, char arg1) {
        field5817++;
        if (this.field5815 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -9) {
            return 89;
        }
        while (var3 < this.field5815.length) {
            if (this.field5814[var3] == arg1) {
                return this.field5815[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([JB[I)V", line = 163)
    public static final void method2428(long[] arg0, byte arg1, int[] arg2) {
        field5812++;
        class613.method3572(arg0, false, 0, arg0.length - 1, arg2);
        if (arg1 < 58) {
            method2423((byte) -25);
        }
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V", line = 174)
    public final void method2429(int arg0) {
        if (arg0 > -58) {
            this.method2425((char) 65468, -27);
        }
        if (this.field5815 != null) {
            for (int var2 = 0; var2 < this.field5815.length; var2++) {
                this.field5815[var2] = class313.method1926(this.field5815[var2], 32768);
            }
        }
        field5811++;
        if (this.field5820 != null) {
            for (int var3 = 0; var3 < this.field5820.length; var3++) {
                this.field5820[var3] = class313.method1926(this.field5820[var3], 32768);
            }
        }
    }
}
