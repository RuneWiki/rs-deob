import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class438 extends class258 {

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    private int field6240;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    private int field6245;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    private int field6257;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    private int field6248;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Lkn;")
    public static class442 field6250 = new class442();

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    private int field6239;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
    private int field6251;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
    private int field6254;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    private int field6258;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "Ltj;")
    public static class108 field6255;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/lang/String;")
    public static String field6261;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "[B")
    private byte[] field6259;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V", line = 8)
    public final void method1604(int arg0, int arg1, int arg2) {
        if (arg2 != 16898) {
            return;
        }
        field6249++;
        if (arg1 == 0) {
            this.field6254 = this.field6245 - (arg0 < 0 ? -arg0 : arg0);
            this.field6239 = 4096;
            this.field6254 = this.field6254 * this.field6254 >> 12;
            this.field6258 = this.field6254;
            return;
        }
        this.field6239 = this.field6254 * this.field6240 >> 12;
        if (this.field6239 < 0) {
            this.field6239 = 0;
        } else if (this.field6239 > 4096) {
            this.field6239 = 4096;
        }
        this.field6254 = this.field6245 - (arg0 >= 0 ? arg0 : -arg0);
        this.field6254 = this.field6254 * this.field6254 >> 12;
        this.field6254 = this.field6254 * this.field6239 >> 12;
        this.field6258 += this.field6254 * this.field6248 >> 12;
        this.field6248 = this.field6257 * this.field6248 >> 12;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZ)Lvp;", line = 43)
    public static final class101 method2729(boolean arg0, int arg1, boolean arg2) {
        field6243++;
        if (!arg2) {
            field6261 = null;
        }
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
        return (class101) class64.field885.method1373(var3, 121);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 57)
    public final void method1599(boolean arg0) {
        this.field6258 >>= 0x4;
        field6252++;
        this.field6248 = this.field6257;
        if (this.field6258 < 0) {
            this.field6258 = 0;
        } else if (this.field6258 > 255) {
            this.field6258 = 255;
        }
        this.method1156(this.field6251++, (byte) this.field6258);
        if (!arg0) {
            this.field6245 = -70;
        }
        this.field6258 = 0;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 80)
    public class438(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6240 = (int) (arg7 * 4096.0F);
        this.field6245 = (int) (arg6 * 4096.0F);
        this.field6248 = this.field6257 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BII)V", line = 91)
    public static final void method2730(byte arg0, int arg1, int arg2) {
        field6253++;
        int var3 = class70.field934.method1309((byte) 125, class190.field2725.method2284((byte) 95, class309.field4497));
        class382 var4 = (class382) class228.field3392.method2752(-78);
        if (arg0 != 15) {
            method2730((byte) 72, 38, 72);
        }
        while (var4 != null) {
            int var8 = class447.method2790(var4, (byte) 114);
            if (var3 < var8) {
                var3 = var8;
            }
            var4 = (class382) class228.field3392.method2754(arg0 - 16);
        }
        var3 += 8;
        int var5 = class381.field5412 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (class24.field307 < var6 + var3) {
            var6 = class24.field307 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if ((var5 + arg1) > class316.field4643) {
            var7 = class316.field4643 - var5;
        }
        class129.field1832 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class359.field5185 = true;
        class352.field5116 = var7;
        class291.field4227 = (class19.field253 ? 26 : 22) + class381.field5412 * 16;
        class264.field3882 = var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 145)
    public final void method1603(byte arg0) {
        if (arg0 > -69) {
            this.field6251 = 54;
        }
        this.field6251 = 0;
        this.field6258 = 0;
        field6244++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)V", line = 157)
    public static final void method2731(int arg0, int arg1) {
        if (arg1 > 78) {
            field6256++;
            class276 var2 = class264.method1816((byte) -104, arg0, 9);
            var2.method1870((byte) 126);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)Lbr;", line = 170)
    public static final class223 method2732(int arg0, int arg1) {
        field6242++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class186.field2657[var2] == null || class186.field2657[var2][var3] == null) {
            boolean var4 = class103.method609(var2, 1);
            if (!var4) {
                return null;
            }
        }
        return arg1 == 0 ? class186.field2657[var2][var3] : null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 197)
    public static void method2733(int arg0) {
        field6255 = null;
        if (arg0 < 26) {
            field6250 = null;
        }
        field6261 = null;
        field6250 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V", line = 210)
    public void method1156(int arg0, byte arg1) {
        field6247++;
        this.field6259[arg0] = arg1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZZ)I", line = 220)
    public static final int method2734(int arg0, int arg1, boolean arg2, boolean arg3) {
        field6246++;
        class101 var4 = method2729(arg3, arg1, true);
        if (var4 == null) {
            return -1;
        } else if (arg2) {
            return 3;
        } else if (arg0 >= 0 && arg0 < var4.field1277.length) {
            return var4.field1277[arg0];
        } else {
            return -1;
        }
    }
}
