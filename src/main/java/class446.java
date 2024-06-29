import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class446 extends class132 {

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
    public boolean field6343 = true;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Lgr;")
    public class367 field6330;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "[I")
    public int[] field6336;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "[I")
    private int[] field6340;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field6333;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[[I")
    private int[][] field6339;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLdaa;)Ljava/lang/String;")
    public final String method2631(boolean arg0, class11 arg1) {
        field6337++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field6340 != null) {
            for (int var4 = 0; var4 < this.field6340.length; var4++) {
                var3.append(this.field6333[var4]);
                var3.append(this.field6330.method2205(this.method2633(true, var4), this.field6339[var4], (byte) -33, arg1.method83(class171.method1088(this.field6340[var4], 30824).field3158, (byte) 108)));
            }
        }
        var3.append(this.field6333[this.field6333.length - 1]);
        if (!arg0) {
            this.field6330 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2632(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field6331++;
            return class342.method2077(arg1, 96, arg0) & class590.method3460(arg0, arg1, -17342);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)Loca;")
    public final class221 method2633(boolean arg0, int arg1) {
        if (!arg0) {
            this.field6336 = null;
        }
        field6327++;
        return this.field6340 == null || arg1 < 0 || arg1 > this.field6340.length ? null : class171.method1088(this.field6340[arg1], 30824);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLdaa;[I)V")
    public final void method2634(byte arg0, class11 arg1, int[] arg2) {
        field6332++;
        if (this.field6340 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field6340.length && var4 < arg2.length; var4++) {
            int var5 = this.method2633(true, var4).field3160;
            if (var5 > 0) {
                arg1.method86(var5, (long) arg2[var4], true);
            }
        }
        if (arg0 >= -80) {
            this.field6340 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILdaa;)V")
    private final void method2635(int arg0, int arg1, class11 arg2) {
        if (arg0 == 1) {
            this.field6333 = class294.method1884(1, arg2.method100((byte) 69), '<');
        } else if (arg0 == 2) {
            int var4 = arg2.method110((byte) 116);
            this.field6336 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6336[var5] = arg2.method93((byte) 119);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method110((byte) 55);
            this.field6340 = new int[var6];
            this.field6339 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method93((byte) 116);
                class221 var9 = class171.method1088(var8, 30824);
                if (var9 != null) {
                    this.field6340[var7] = var8;
                    this.field6339[var7] = new int[var9.field3159];
                    for (int var10 = 0; var10 < var9.field3159; var10++) {
                        this.field6339[var7][var10] = arg2.method93((byte) 117);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field6343 = false;
        }
        if (arg1 >= 59) {
            field6335++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)I")
    public final int method2636(boolean arg0, int arg1, int arg2) {
        field6329++;
        if (this.field6340 == null || arg2 < 0 || this.field6340.length < arg2) {
            return -1;
        } else if (this.field6339[arg2] == null || arg1 < 0 || arg1 > this.field6339[arg2].length) {
            return -1;
        } else {
            if (arg0) {
                this.field6339 = null;
            }
            return this.field6339[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public final void method2637(boolean arg0) {
        if (this.field6336 != null) {
            for (int var2 = 0; var2 < this.field6336.length; var2++) {
                this.field6336[var2] = class73.method578(this.field6336[var2], 32768);
            }
        }
        if (!arg0) {
            this.method2637(true);
        }
        field6341++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method2638(int arg0) {
        field6328++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field6333 == null) {
            return "";
        }
        var2.append(this.field6333[0]);
        if (arg0 != 17611) {
            this.field6343 = false;
        }
        for (int var3 = 1; var3 < this.field6333.length; var3++) {
            var2.append("...");
            var2.append(this.field6333[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)I")
    public final int method2639(int arg0) {
        field6334++;
        if (arg0 != 0) {
            this.method2633(true, 28);
        }
        return this.field6340 == null ? 0 : this.field6340.length;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method2640(int arg0, String arg1) throws ClassNotFoundException {
        field6338++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0 >= -38) {
            return null;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLdaa;)V")
    public final void method2641(byte arg0, class11 arg1) {
        field6342++;
        while (true) {
            int var3 = arg1.method110((byte) 79);
            if (var3 == 0) {
                int var4 = -112 % ((68 - arg0) / 34);
                return;
            }
            this.method2635(var3, 110, arg1);
        }
    }
}
