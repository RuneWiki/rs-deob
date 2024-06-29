import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class185 extends class443 {

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Luaa;")
    public static class395 field2680 = new class395(4);

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "[B")
    public static byte[] field2688 = new byte[2048];

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field2692 = -1;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Ljava/lang/String;")
    public String field2691;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "[C")
    public char[] field2685;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "[C")
    public char[] field2689;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "[I")
    public int[] field2679;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "[I")
    public int[] field2682;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 3)
    public final void method1239(int arg0) {
        if (this.field2682 != null) {
            for (int var2 = 0; var2 < this.field2682.length; var2++) {
                this.field2682[var2] = class188.method1258(this.field2682[var2], 32768);
            }
        }
        field2677++;
        if (arg0 != 17064) {
            this.method1242('\u0006', -73);
        }
        if (this.field2679 != null) {
            for (int var3 = 0; var3 < this.field2679.length; var3++) {
                this.field2679[var3] = class188.method1258(this.field2679[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V", line = 36)
    public static final void method1240(int arg0, boolean arg1) {
        if (arg0 != 32768) {
            method1245(53, true);
        }
        class539.method3033(class442.field6464, 0, arg1, class609.field8659, class68.field1285);
        field2683++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lco;Z)V", line = 50)
    public final void method1241(class268 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1738(255);
            if (var3 == 0) {
                field2684++;
                if (arg1) {
                    this.method1242('r', -106);
                    return;
                }
                return;
            }
            this.method1244(115, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(CI)I", line = 74)
    public final int method1242(char arg0, int arg1) {
        field2681++;
        if (this.field2679 == null) {
            return -1;
        }
        if (arg1 <= 7) {
            field2680 = null;
        }
        for (int var3 = 0; var3 < this.field2679.length; var3++) {
            if (this.field2689[var3] == arg0) {
                return this.field2679[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 99)
    public static final void method1243(byte arg0) {
        field2690++;
        class404.field6022.method2177(0);
        class619.field8735.method1615((byte) -41);
        class454.field6574.method3434(-44);
        class474.field6795.setBackground(Color.black);
        class109.field1825 = -1;
        class404.field6022 = class209.method1336(false, class474.field6795);
        if (arg0 != -122) {
            method1245(27, true);
        }
        class619.field8735 = class222.method1486(class474.field6795, 9728, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILco;)V", line = 116)
    private final void method1244(int arg0, int arg1, class268 arg2) {
        if (arg1 == 1) {
            this.field2691 = arg2.method1752(false);
        } else if (arg1 == 2) {
            int var7 = arg2.method1738(255);
            this.field2689 = new char[var7];
            this.field2679 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2679[var8] = arg2.method1745(32132);
                byte var9 = arg2.method1714(-31536);
                this.field2689[var8] = var9 == 0 ? 0 : class149.method1074(var9, -9345);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1738(255);
            this.field2685 = new char[var4];
            this.field2682 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2682[var5] = arg2.method1745(32132);
                byte var6 = arg2.method1714(-31536);
                this.field2685[var5] = var6 == 0 ? 0 : class149.method1074(var6, -9345);
            }
        }
        if (arg0 <= 89) {
            field2680 = null;
        }
        field2687++;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IZ)V", line = 183)
    public static final void method1245(int arg0, boolean arg1) {
        int var2 = 52 / ((-arg0 - 59) / 60);
        if (arg1) {
            if (class609.field8659 != -1) {
                class409.method2481(class609.field8659, true);
            }
            for (class553 var3 = (class553) class639.field9274.method734(0); var3 != null; var3 = (class553) class639.field9274.method736(-1)) {
                if (!var3.method912(false)) {
                    var3 = (class553) class639.field9274.method734(0);
                    if (var3 == null) {
                        break;
                    }
                }
                class61.method489(-27920, true, false, var3);
            }
            class609.field8659 = -1;
            class639.field9274 = new class78(8);
            class17.method201((byte) 75);
            class609.field8659 = class79.field1430;
            method1240(32768, false);
            class530.method2980(-6891);
            class30.method276(class609.field8659);
        }
        field2686++;
        class633.field9208 = true;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V", line = 226)
    public static void method1246(byte arg0) {
        if (arg0 != 115) {
            field2680 = null;
        }
        field2680 = null;
        field2688 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(CB)I", line = 240)
    public final int method1247(char arg0, byte arg1) {
        field2678++;
        if (this.field2682 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2682.length; var3++) {
            if (this.field2685[var3] == arg0) {
                return this.field2682[var3];
            }
        }
        if (arg1 <= 59) {
            this.field2689 = null;
        }
        return -1;
    }
}
