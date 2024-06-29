import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class554 extends class388 {

    @OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!sba", name = "v", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!sba", name = "x", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!sba", name = "B", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!sba", name = "C", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!sba", name = "y", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8058;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "Ljava/lang/String;")
    public String field8052;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[C")
    public char[] field8051;

    @OriginalMember(owner = "client!sba", name = "A", descriptor = "[C")
    public char[] field8060;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "[I")
    public int[] field8053;

    @OriginalMember(owner = "client!sba", name = "w", descriptor = "[I")
    public int[] field8056;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lda;)V", line = 6)
    public static final void method3325(class400 arg0) {
        class716.field10110 = arg0;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(CI)I", line = 11)
    public final int method3326(char arg0, int arg1) {
        field8059++;
        if (this.field8056 == null) {
            return -1;
        } else if (arg1 == -4) {
            for (int var3 = 0; var3 < this.field8056.length; var3++) {
                if (this.field8060[var3] == arg0) {
                    return this.field8056[var3];
                }
            }
            return -1;
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(CB)I", line = 36)
    public final int method3327(char arg0, byte arg1) {
        field8054++;
        if (this.field8053 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8053.length; var3++) {
            if (this.field8051[var3] == arg0) {
                return this.field8053[var3];
            }
        }
        int var4 = -126 % ((arg1 + 14) / 34);
        return -1;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lsl;BI)V", line = 65)
    private final void method3328(class479 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field8052 = arg0.method2894(-13192);
        } else if (arg2 == 2) {
            int var7 = arg0.method2886(true);
            this.field8053 = new int[var7];
            this.field8051 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8053[var8] = arg0.method2882(-1);
                byte var10 = arg0.method2915(-124);
                this.field8051[var8] = var10 == 0 ? 0 : class520.method3162(-19480, var10);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method2886(true);
            this.field8060 = new char[var4];
            this.field8056 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8056[var5] = arg0.method2882(-1);
                byte var6 = arg0.method2915(-121);
                this.field8060[var5] = var6 == 0 ? 0 : class520.method3162(-19480, var6);
            }
        }
        field8062++;
        int var9 = -111 % ((-arg1 - 79) / 32);
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)V", line = 134)
    public final void method3329(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (this.field8056 != null) {
            for (int var2 = 0; var2 < this.field8056.length; var2++) {
                this.field8056[var2] = class430.method2658(this.field8056[var2], 32768);
            }
        }
        field8061++;
        if (this.field8053 != null) {
            for (int var3 = 0; var3 < this.field8053.length; var3++) {
                this.field8053[var3] = class430.method2658(this.field8053[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "(I)V", line = 164)
    public static void method3330(int arg0) {
        int var1 = -101 % ((-arg0 - 30) / 60);
        field8058 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lsl;B)V", line = 173)
    public final void method3331(class479 arg0, byte arg1) {
        if (arg1 < 5) {
            this.field8060 = null;
        }
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                field8055++;
                return;
            }
            this.method3328(arg0, (byte) -117, var3);
        }
    }

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)V", line = 194)
    public static final void method3332(int arg0) {
        class94.field1354 = false;
        field8057++;
        int var1 = -109 / ((arg0 + 77) / 37);
        class328.method2021(-8586);
    }
}
