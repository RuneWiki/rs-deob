import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class300 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Z")
    public boolean field5161 = false;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    private int field5162 = 0;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    private int field5163 = 0;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field5168 = -1;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    private int field5166 = 128;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    private int field5154 = 128;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    private int field5169 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field5156 = 0;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Li;")
    public static class214 field5157 = new class214(5000);

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static volatile int field5175 = 0;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "Lna;")
    public static class26 field5177 = class69.method505("Jeter", (byte) -117);

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Lna;")
    public static class26 field5179 = class69.method505("Sprites geladen)3", (byte) -117);

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Lna;")
    private static class26 field5180 = class69.method505("slide:", (byte) -128);

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lna;")
    public static class26 field5178 = field5180;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lna;")
    public static class26 field5173 = field5180;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    private int field5167;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[S")
    private short[] field5158;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[S")
    private short[] field5159;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[S")
    private short[] field5160;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "[S")
    private short[] field5171;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwa;B)V", line = 16)
    public final void method2111(class82 arg0, byte arg1) {
        if (arg1 != -113) {
            method2115(88, -118, 75, -51, -96, -50, 45, 127);
        }
        while (true) {
            int var3 = arg0.method642((byte) -68);
            if (var3 == 0) {
                field5181++;
                return;
            }
            this.method2113(arg0, var3, 128);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 44)
    public static void method2112(int arg0) {
        field5180 = null;
        field5157 = null;
        if (arg0 != 6) {
            method2112(-57);
        }
        field5177 = null;
        field5173 = null;
        field5178 = null;
        field5179 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lwa;II)V", line = 60)
    private final void method2113(class82 arg0, int arg1, int arg2) {
        field5155++;
        if (arg1 == 1) {
            this.field5167 = arg0.method576(arg2 - 127);
        } else if (arg1 == 2) {
            this.field5168 = arg0.method576(1);
        } else if (arg1 == 4) {
            this.field5154 = arg0.method576(1);
        } else if (arg1 == 5) {
            this.field5166 = arg0.method576(1);
        } else if (arg1 == 6) {
            this.field5169 = arg0.method576(arg2 - 127);
        } else if (arg1 == 7) {
            this.field5163 = arg0.method642((byte) -47);
        } else if (arg1 == 8) {
            this.field5162 = arg0.method642((byte) -55);
        } else if (arg1 == 9) {
            this.field5161 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method642((byte) -47);
            this.field5158 = new short[var6];
            this.field5171 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5158[var7] = (short) arg0.method576(1);
                this.field5171[var7] = (short) arg0.method576(arg2 - 127);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method642((byte) -32);
            this.field5159 = new short[var4];
            this.field5160 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5159[var5] = (short) arg0.method576(1);
                this.field5160[var5] = (short) arg0.method576(arg2 - 127);
            }
        }
        if (arg2 != 128) {
            this.field5171 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBII)Lak;", line = 173)
    public final class311 method2114(int arg0, byte arg1, int arg2, int arg3) {
        field5164++;
        class311 var5 = (class311) class322.field5528.method1989((long) this.field5165, (byte) 121);
        if (arg1 != -30) {
            return (class311) null;
        }
        if (var5 == null) {
            class169 var6 = class169.method1166(class94.field1540, this.field5167, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field5158 != null) {
                for (int var7 = 0; var7 < this.field5158.length; var7++) {
                    var6.method1167(this.field5158[var7], this.field5171[var7]);
                }
            }
            if (this.field5159 != null) {
                for (int var8 = 0; var8 < this.field5159.length; var8++) {
                    var6.method1149(this.field5159[var8], this.field5160[var8]);
                }
            }
            var5 = var6.method1159(this.field5163 + 64, this.field5162 + 850, -30, -50, -30);
            class322.field5528.method1978((byte) -96, var5, (long) this.field5165);
        }
        class311 var9;
        if (this.field5168 == -1 || arg2 == -1) {
            var9 = var5.method1594(true, true, true);
        } else {
            var9 = client.method1731(this.field5168, (byte) -20).method1713(arg0, arg3, arg2, (byte) -52, var5);
        }
        if (this.field5154 != 128 || this.field5166 != 128) {
            var9.method1614(this.field5154, this.field5166, this.field5154);
        }
        if (this.field5169 != 0) {
            if (this.field5169 == 90) {
                var9.method1633();
            }
            if (this.field5169 == 180) {
                var9.method1616();
            }
            if (this.field5169 == 270) {
                var9.method1647();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)V", line = 248)
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5176++;
        if (class71.method509(arg5, 104) && arg2 == 2) {
            client.method1736(class86.field1416[arg5], -1, arg6, arg1, arg4, arg7, arg0, arg3);
        }
    }
}
