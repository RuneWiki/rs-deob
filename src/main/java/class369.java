import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class369 {

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    private int field5165 = -1;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    private int field5169 = 0;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lnt;")
    private class220 field5164 = new class220();

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Z")
    public boolean field5178 = false;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    private int field5171;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    private int field5162;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[[[I")
    private int[][][] field5161;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[Lbha;")
    private class571[] field5167;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5172 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    public static int[] field5176 = new int[6];

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lkca;")
    public static class82 field5177 = new class82(3);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method2309(byte arg0) {
        field5175++;
        if (this.field5171 != this.field5162) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5171; var2++) {
            this.field5167[var2] = class754.field10502;
        }
        if (arg0 < 114) {
            this.field5161 = null;
        }
        return this.field5161;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public static final void method2310() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class253.field3660.length; var1++) {
                if (class253.field3660[var1].method3929()) {
                    class535.field7551[var1] = class253.field3660[var1].method3925();
                } else {
                    synchronized (class253.field3660[var1]) {
                        class253.field3660[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class253.field3660[class253.field3660.length - 1].method3930();
                class360.method2243(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class253.field3660.length - 1; var4++) {
                        if (!class253.field3660[var4].method3929()) {
                            synchronized (class253.field3660[var4]) {
                                class253.field3660[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class253.field3660.length - 2; var6++) {
                            class253.field3660[var6].method3930();
                        }
                        class360.method2243(2);
                        while (!class253.field3660[0].method3929()) {
                            synchronized (class253.field3660[0]) {
                                class253.field3660[0].notify();
                            }
                            try {
                                class246.method1639(1L, (byte) -60);
                            } catch (Exception var9) {
                            }
                        }
                        class253.field3660[0].method3930();
                        return;
                    }
                    try {
                        class246.method1639(1L, (byte) -102);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class246.method1639(1L, (byte) -79);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5172 = null;
        field5177 = null;
        if (arg0 != -17025) {
            field5174 = 89;
        }
        field5176 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBII)Z")
    public static final boolean method2312(int arg0, byte arg1, int arg2, int arg3) {
        field5170++;
        class486.field6883.method155(arg2, arg3, arg0, class4.field67);
        if (arg1 != -12) {
            return true;
        }
        int var4 = class4.field67[2];
        if (var4 < 50) {
            return false;
        } else {
            class4.field67[1] = class4.field67[1] * class391.field5464 / var4 + class471.field6779;
            class4.field67[0] = class4.field67[0] * class93.field1629 / var4 + class556.field7797;
            class4.field67[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method2313(String arg0, int arg1, byte arg2) {
        int var3 = 13 / ((-arg2 - 65) / 34);
        class236.field3341++;
        field5163++;
        class135 var4 = class273.method1801(class459.field6629, class666.field9341, 2);
        var4.field2109.method263((byte) -71, class552.method3233((byte) 117, arg0) + 1);
        var4.field2109.method263((byte) 93, arg1);
        var4.field2109.method287((byte) 0, arg0);
        class539.method3178(var4, -18925);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method2314(byte arg0, int arg1) {
        if (arg0 != 41) {
            field5177 = null;
        }
        field5166++;
        if (this.field5171 == this.field5162) {
            this.field5178 = this.field5167[arg1] == null;
            this.field5167[arg1] = class754.field10502;
            return this.field5161[arg1];
        } else if (this.field5171 == 1) {
            this.field5178 = this.field5165 != arg1;
            this.field5165 = arg1;
            return this.field5161[0];
        } else {
            class571 var3 = this.field5167[arg1];
            if (var3 == null) {
                this.field5178 = true;
                if (this.field5169 >= this.field5171) {
                    class571 var4 = (class571) this.field5164.method1523((byte) 42);
                    var3 = new class571(arg1, var4.field8120);
                    this.field5167[var4.field8116] = null;
                    var4.method3617(arg0 - 40);
                } else {
                    var3 = new class571(arg1, this.field5169);
                    this.field5169++;
                }
                this.field5167[arg1] = var3;
            } else {
                this.field5178 = false;
            }
            this.field5164.method1524(43, var3);
            return this.field5161[var3.field8120];
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method2315(int arg0) {
        field5168++;
        int var2 = 0;
        if (arg0 > -13) {
            return;
        }
        while (this.field5171 > var2) {
            this.field5161[var2][0] = null;
            this.field5161[var2][1] = null;
            this.field5161[var2][2] = null;
            this.field5161[var2] = null;
            var2++;
        }
        this.field5161 = null;
        this.field5167 = null;
        this.field5164.method1530((byte) 103);
        this.field5164 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
    public class369(int arg0, int arg1, int arg2) {
        this.field5171 = arg0;
        this.field5162 = arg1;
        this.field5161 = new int[this.field5171][3][arg2];
        this.field5167 = new class571[this.field5162];
    }
}
