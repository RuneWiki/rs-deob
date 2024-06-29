import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class136 extends class395 {

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    private int field2143;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    private int field2148;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "[B")
    private byte[] field2140;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public final void method915(byte arg0) {
        this.field2139 = this.field2143;
        if (arg0 != 96) {
            this.method915((byte) 17);
        }
        this.field2138 >>= 0x4;
        field2151++;
        if (this.field2138 < 0) {
            this.field2138 = 0;
        } else if (this.field2138 > 255) {
            this.field2138 = 255;
        }
        this.method916((byte) this.field2138, this.field2148++, (byte) 114);
        this.field2138 = 0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIB)V")
    public void method916(byte arg0, int arg1, byte arg2) {
        if (arg2 != 114) {
            this.field2150 = -27;
        }
        this.field2140[arg1] = arg0;
        field2149++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public final void method917(int arg0) {
        this.field2148 = 0;
        this.field2138 = 0;
        if (arg0 != -28503) {
            this.field2146 = 41;
        }
        field2141++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIII)I")
    public static final int method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2147++;
        if (class590.field8430 == null) {
            return 0;
        }
        if (arg1 < 3) {
            label98: {
                int var6 = arg5 >> 7;
                int var7 = arg4 >> 7;
                if (arg3 >= 0 && arg0 >= 0 && (class32.field513 - 1) >= arg3 && arg0 <= (class611.field8786 - 1)) {
                    if (var6 >= 1 && var7 >= 1 && (class32.field513 - 1) >= var6 && (class611.field8786 - 1) >= var7) {
                        boolean var8 = (class80.field1299[1][arg5 >> 7][arg4 >> 7] & 0x2) != 0;
                        if ((arg5 & 0x7F) == 0) {
                            boolean var9 = (class80.field1299[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                            boolean var10 = (class80.field1299[1][var6][arg4 >> 7] & 0x2) != 0;
                            if (var10 != var9) {
                                var8 = (class80.field1299[1][arg3][arg0] & 0x2) != 0;
                            }
                        }
                        if ((arg4 & 0x7F) == 0) {
                            boolean var11 = (class80.field1299[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                            boolean var12 = (class80.field1299[1][arg5 >> 7][var7] & 0x2) != 0;
                            if (var11 != var12) {
                                var8 = (class80.field1299[1][arg3][arg0] & 0x2) != 0;
                            }
                        }
                        if (var8) {
                            arg1++;
                        }
                        break label98;
                    }
                    return 0;
                }
                return 0;
            }
        }
        int var13 = -98 % ((18 - arg2) / 37);
        return class590.field8430[arg1].method1105(arg5, arg4);
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2144 = (int) (arg6 * 4096.0F);
        this.field2145 = (int) (arg7 * 4096.0F);
        this.field2139 = this.field2143 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BII)V")
    public final void method919(byte arg0, int arg1, int arg2) {
        field2142++;
        if (arg1 == 0) {
            this.field2150 = this.field2144 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2150 = this.field2150 * this.field2150 >> 12;
            this.field2146 = 4096;
            this.field2138 = this.field2150;
        } else {
            this.field2146 = this.field2150 * this.field2145 >> 12;
            this.field2150 = this.field2144 - (arg2 >= 0 ? arg2 : -arg2);
            if (this.field2146 < 0) {
                this.field2146 = 0;
            } else if (this.field2146 > 4096) {
                this.field2146 = 4096;
            }
            this.field2150 = this.field2150 * this.field2150 >> 12;
            this.field2150 = this.field2150 * this.field2146 >> 12;
            this.field2138 += this.field2150 * this.field2139 >> 12;
            this.field2139 = this.field2143 * this.field2139 >> 12;
        }
        if (arg0 != -104) {
            this.method917(-53);
        }
    }

    static {
        new class104("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
