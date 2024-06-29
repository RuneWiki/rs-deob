import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class238 extends class405 {

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "Luv;")
    public static class2 field3329 = new class2(21, 2);

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3333 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[Lwg;")
    public static class41[] field3334 = new class41[14];

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "[I")
    public static int[] field3335 = new int[3];

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lcr;")
    public static class367 field3331;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Ljava/lang/String;")
    public String field3325;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[C")
    public char[] field3318;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "[C")
    public char[] field3328;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
    public int[] field3320;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "[I")
    public int[] field3322;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method1460(byte arg0, int arg1) {
        class75.field1068 = arg1;
        field3323++;
        class382 var2 = class426.field6355;
        synchronized (class426.field6355) {
            if (arg0 != -45) {
                method1466((byte) -16);
            }
            class426.field6355.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILgk;I)V", line = 22)
    private final void method1461(int arg0, class468 arg1, int arg2) {
        field3321++;
        if (arg0 != 0) {
            this.method1465((byte) -104, '\u0000');
        }
        if (arg2 == 1) {
            this.field3325 = arg1.method2770(arg0 ^ 0xFFFFB015);
        } else if (arg2 == 2) {
            int var4 = arg1.method2765(90);
            this.field3328 = new char[var4];
            this.field3322 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3322[var5] = arg1.method2727((byte) 43);
                byte var6 = arg1.method2714((byte) -87);
                this.field3328[var5] = var6 == 0 ? 0 : class245.method1490(var6, -1);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method2765(78);
            this.field3320 = new int[var7];
            this.field3318 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3320[var8] = arg1.method2727((byte) 43);
                byte var9 = arg1.method2714((byte) -116);
                this.field3318[var8] = var9 == 0 ? 0 : class245.method1490(var9, -1);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 94)
    public static void method1462(int arg0) {
        field3331 = null;
        field3333 = null;
        if (arg0 != 0) {
            field3332 = -98;
        }
        field3329 = null;
        field3335 = null;
        field3334 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IC)I", line = 110)
    public final int method1463(int arg0, char arg1) {
        field3319++;
        if (this.field3320 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field3320.length; var3++) {
            if (this.field3318[var3] == arg1) {
                return this.field3320[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V", line = 130)
    public final void method1464(int arg0) {
        field3324++;
        if (this.field3320 != null) {
            for (int var2 = 0; var2 < this.field3320.length; var2++) {
                this.field3320[var2] = class390.method2340(this.field3320[var2], 32768);
            }
        }
        if (this.field3322 != null) {
            for (int var3 = 0; var3 < this.field3322.length; var3++) {
                this.field3322[var3] = class390.method2340(this.field3322[var3], 32768);
            }
        }
        if (arg0 != 0) {
            this.field3322 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BC)I", line = 159)
    public final int method1465(byte arg0, char arg1) {
        field3327++;
        if (this.field3322 == null) {
            return -1;
        }
        if (arg0 > -93) {
            this.method1464(22);
        }
        for (int var3 = 0; var3 < this.field3322.length; var3++) {
            if (this.field3328[var3] == arg1) {
                return this.field3322[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 182)
    public static final void method1466(byte arg0) {
        int var1 = -48 % ((84 - arg0) / 41);
        field3326++;
        for (int var2 = 0; var2 < class187.field2744; var2++) {
            class425 var3 = class158.field2387[var2];
            if (var3.field6340 == 2) {
                if (var3.field6338 == null) {
                    var3.field6339 = Integer.MIN_VALUE;
                } else {
                    class176.field2598.method2372(var3.field6338);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILgk;)V", line = 211)
    public final void method1467(int arg0, class468 arg1) {
        field3330++;
        while (true) {
            int var3 = arg1.method2765(114);
            if (var3 == 0) {
                if (arg0 == 14) {
                    return;
                } else {
                    this.field3320 = null;
                    return;
                }
            }
            this.method1461(0, arg1, var3);
        }
    }
}
