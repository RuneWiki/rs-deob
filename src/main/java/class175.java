import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class175 extends class305 {

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Ljava/lang/String;")
    public String field2808;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "[C")
    public char[] field2809;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "[C")
    public char[] field2817;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "[I")
    public int[] field2810;

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "[I")
    public int[] field2820;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLag;)V", line = 5)
    public final void method1100(byte arg0, class202 arg1) {
        field2816++;
        if (arg0 > -49) {
            return;
        }
        while (true) {
            int var3 = arg1.method1317((byte) -97);
            if (var3 == 0) {
                return;
            }
            this.method1102(arg1, (byte) -105, var3);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZC)I", line = 35)
    public final int method1101(boolean arg0, char arg1) {
        field2811++;
        if (this.field2810 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2810.length; var3++) {
            if (this.field2817[var3] == arg1) {
                return this.field2810[var3];
            }
        }
        if (arg0) {
            return 36;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lag;BI)V", line = 63)
    private final void method1102(class202 arg0, byte arg1, int arg2) {
        if (arg1 != -105) {
            this.field2809 = (char[]) null;
        }
        field2814++;
        if (arg2 == 1) {
            this.field2808 = arg0.method1307((byte) 102);
        } else if (arg2 == 2) {
            int var7 = arg0.method1317((byte) -92);
            this.field2820 = new int[var7];
            this.field2809 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2820[var8] = arg0.method1315(14289);
                byte var9 = arg0.method1333(arg1 ^ 0x17);
                this.field2809[var8] = var9 == 0 ? 0 : class228.method1515(0, var9);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1317((byte) -83);
            this.field2810 = new int[var4];
            this.field2817 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2810[var5] = arg0.method1315(14289);
                byte var6 = arg0.method1333(-128);
                this.field2817[var5] = var6 == 0 ? 0 : class228.method1515(0, var6);
            }
        } else if (arg2 == 4) {
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(Z)V", line = 134)
    public final void method1103(boolean arg0) {
        if (arg0) {
            this.method1100((byte) 2, (class202) null);
        }
        field2818++;
        if (this.field2810 != null) {
            for (int var2 = 0; var2 < this.field2810.length; var2++) {
                this.field2810[var2] = class212.method1434(this.field2810[var2], 32768);
            }
        }
        if (this.field2820 != null) {
            for (int var3 = 0; var3 < this.field2820.length; var3++) {
                this.field2820[var3] = class212.method1434(this.field2820[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(CB)I", line = 175)
    public final int method1104(char arg0, byte arg1) {
        field2812++;
        if (arg1 <= 119) {
            return 89;
        } else if (this.field2820 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field2820.length; var3++) {
                if (this.field2809[var3] == arg0) {
                    return this.field2820[var3];
                }
            }
            return -1;
        }
    }
}
