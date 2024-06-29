import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class540 extends class305 {

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
    private int field7900 = -1;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "[[I")
    public static int[][] field7901 = new int[6][];

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "Lpu;")
    public static class179 field7907 = new class179("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
    public static int field7909 = 0;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
    public static int field7898;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    private int field7899;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    private int field7905;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "Lo;")
    public static class363 field7910;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "[I")
    private int[] field7903;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method72(int arg0, byte arg1) {
        if (arg1 >= -59) {
            this.method2018((byte) -119, 49, 21);
        }
        ++field7898;
        int[][] var3 = super.field4674.method2206(-49, arg0);
        if (super.field4674.field5110) {
            int var4 = (class537.field7884 != this.field7899 ? this.field7899 * arg0 / class537.field7884 : arg0) * this.field7905;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class91.field1471 != this.field7905) {
                for (int var8 = 0; class91.field1471 > var8; ++var8) {
                    int var9 = this.field7905 * var8 / class91.field1471;
                    int var10 = this.field7903[var4 - -var9];
                    var7[var8] = class307.method2028(var10 << 4, 4080);
                    var6[var8] = class307.method2028(4080, var10 >> 4);
                    var5[var8] = class307.method2028(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; var11 < class91.field1471; ++var11) {
                    int var12 = this.field7903[var4++];
                    var7[var11] = class307.method2028(var12, 255) << 4;
                    var6[var11] = class307.method2028(var12, 65280) >> 4;
                    var5[var11] = class307.method2028(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 71)
    public static final int method3174(String arg0, int arg1) {
        ++field7897;
        if (arg0 == null) {
            return -1;
        } else {
            if (arg1 >= -127) {
                method3174((String) null, -108);
            }
            for (int var2 = 0; class6.field80 > var2; ++var2) {
                if (arg0.equalsIgnoreCase(class265.field4229[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 101)
    public class540() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)I", line = 108)
    public final int method2020(byte arg0) {
        ++field7904;
        if (arg0 <= 20) {
            this.field7903 = null;
        }
        return this.field7900;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V", line = 121)
    public final void method2019(byte arg0) {
        super.method2019((byte) 0);
        ++field7908;
        int var2 = -79 % ((-68 - arg0) / 32);
        this.field7903 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILfh;B)V", line = 133)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (~arg0 == -1) {
            this.field7900 = arg1.method1396(83);
        }
        ++field7906;
        if (arg2 <= 76) {
            this.field7899 = -103;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V", line = 150)
    public final void method2018(byte arg0, int arg1, int arg2) {
        super.method2018(arg0, arg1, arg2);
        ++field7902;
        if (this.field7900 >= 0 && class432.field6416 != null) {
            int var4 = !class432.field6416.method938(28923, this.field7900).field6170 ? 128 : 64;
            this.field7903 = class432.field6416.method939(var4, -8507, this.field7900, var4, false, 1.0F);
            this.field7905 = var4;
            this.field7899 = var4;
        }
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V", line = 177)
    public static void method3175(int arg0) {
        if (arg0 != 2) {
            method3174((String) null, -24);
        }
        field7907 = null;
        field7901 = null;
        field7910 = null;
    }
}
