import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class366 extends class583 {

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "Z")
    public boolean field5188 = true;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field5193 = 0;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Lgda;")
    public static class53 field5178 = new class53(45, -1);

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5195 = new Rectangle[100];

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "Lvs;")
    public class591 field5189;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5196;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "[I")
    private int[] field5177;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "[I")
    public int[] field5187;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field5180;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "[[I")
    private int[][] field5184;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILee;)V", line = 3)
    public final void method2329(int arg0, class675 arg1) {
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                field5182++;
                if (arg0 > -36) {
                    this.field5188 = false;
                    return;
                }
                return;
            }
            this.method2338(-75, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Las;", line = 25)
    public final class151 method2330(int arg0, int arg1) {
        if (arg0 != -1) {
            field5196 = null;
        }
        field5186++;
        return this.field5177 == null || arg1 < 0 || arg1 > this.field5177.length ? null : class439.method2655(this.field5177[arg1], (byte) -107);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Ljava/lang/String;", line = 44)
    public final String method2331(int arg0) {
        field5190++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5180 == null) {
            return "";
        }
        var2.append(this.field5180[0]);
        for (int var3 = 1; var3 < this.field5180.length; var3++) {
            var2.append("...");
            var2.append(this.field5180[var3]);
        }
        return arg0 == 16584 ? var2.toString() : null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)I", line = 73)
    public final int method2332(int arg0, int arg1, int arg2) {
        if (arg0 != -3) {
            method2333(-51, -97, -105, (byte) 105, false, 95, 56, -0.37955698F, -32);
        }
        field5179++;
        if (this.field5177 == null || arg1 < 0 || this.field5177.length < arg1) {
            return -1;
        } else if (this.field5184[arg1] == null || arg2 < 0 || this.field5184[arg1].length < arg2) {
            return -1;
        } else {
            return this.field5184[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIBZIIFI)[[I", line = 90)
    public static final int[][] method2333(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, float arg7, int arg8) {
        field5181++;
        int[][] var9 = new int[arg6][arg5];
        class407 var10 = new class407();
        int var11 = 90 % ((arg3 + 21) / 55);
        var10.field5757 = arg0;
        var10.field5765 = arg4;
        var10.field5759 = arg2;
        var10.field5763 = arg8;
        var10.field5773 = (int) (arg7 * 4096.0F);
        var10.method364(7);
        class193.method1196(-11775, arg5, arg6);
        for (int var12 = 0; var12 < arg6; var12++) {
            var10.method2522(false, var12, var9[var12]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lee;B[I)V", line = 122)
    public final void method2334(class675 arg0, byte arg1, int[] arg2) {
        field5183++;
        if (this.field5177 == null) {
            return;
        }
        for (int var4 = 0; this.field5177.length > var4 && arg2.length > var4; var4++) {
            int var5 = this.method2330(-1, var4).field2145;
            if (var5 > 0) {
                arg0.method3704((long) arg2[var4], false, var5);
            }
        }
        if (arg1 != -51) {
            this.field5177 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lee;B)Ljava/lang/String;", line = 149)
    public final String method2335(class675 arg0, byte arg1) {
        field5191++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5177 != null) {
            for (int var4 = 0; var4 < this.field5177.length; var4++) {
                var3.append(this.field5180[var4]);
                var3.append(this.field5189.method3343(false, arg0.method3715(5225, class439.method2655(this.field5177[var4], (byte) 124).field2141), this.method2330(-1, var4), this.field5184[var4]));
            }
        }
        var3.append(this.field5180[this.field5180.length - 1]);
        if (arg1 != 78) {
            method2340(false);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)I", line = 179)
    public final int method2336(int arg0) {
        field5194++;
        if (this.field5177 == null) {
            return 0;
        } else {
            int var2 = 52 / ((arg0 - 86) / 33);
            return this.field5177.length;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V", line = 195)
    public final void method2337(byte arg0) {
        field5175++;
        if (arg0 < -52 && this.field5187 != null) {
            for (int var2 = 0; var2 < this.field5187.length; var2++) {
                this.field5187[var2] = class325.method2116(this.field5187[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILee;I)V", line = 217)
    private final void method2338(int arg0, class675 arg1, int arg2) {
        if (arg0 > -2) {
            this.field5189 = null;
        }
        field5185++;
        if (arg2 == 1) {
            this.field5180 = class719.method4040(11027, '<', arg1.method3697(-1));
        } else if (arg2 == 2) {
            int var9 = arg1.method3750((byte) 35);
            this.field5187 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5187[var10] = arg1.method3757((byte) -65);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method3750((byte) 35);
            this.field5177 = new int[var4];
            this.field5184 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method3757((byte) -65);
                class151 var7 = class439.method2655(var6, (byte) -101);
                if (var7 != null) {
                    this.field5177[var5] = var6;
                    this.field5184[var5] = new int[var7.field2139];
                    for (int var8 = 0; var8 < var7.field2139; var8++) {
                        this.field5184[var5][var8] = arg1.method3757((byte) -65);
                    }
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field5188 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILwt;)I", line = 296)
    public static final int method2339(int arg0, class309 arg1) {
        field5192++;
        if (class309.field4301 == arg1) {
            return 5120;
        } else if (class309.field4303 == arg1) {
            return 5122;
        } else if (class309.field4304 == arg1) {
            return 5124;
        } else if (class309.field4305 == arg1) {
            return 5121;
        } else if (class309.field4306 == arg1) {
            return 5123;
        } else if (class309.field4307 == arg1) {
            return 5125;
        } else if (class309.field4308 == arg1) {
            return 5131;
        } else if (class309.field4309 == arg1) {
            return 5126;
        } else {
            if (arg0 <= 17) {
                field5196 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 338)
    public static void method2340(boolean arg0) {
        field5195 = null;
        if (!arg0) {
            method2333(-89, -33, -58, (byte) -88, true, -73, 33, 1.2520173F, -39);
        }
        field5178 = null;
        field5196 = null;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(IIBII)V", line = 359)
    public static final void method2341(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 51) {
            field5195 = null;
        }
        field5176++;
        if (arg0 <= arg4) {
            class643.method3557(arg0, class445.field6320[arg1], (byte) 108, arg3, arg4);
        } else {
            class643.method3557(arg4, class445.field6320[arg1], (byte) 59, arg3, arg0);
        }
    }
}
