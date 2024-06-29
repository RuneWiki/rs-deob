import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class70 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Lmq;")
    public static class104 field1032 = new class104(10);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Ltm;")
    public static class112 field1036 = new class112("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lfn;")
    public static class52 field1037 = new class52(76, 6);

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lso;")
    public static class174 field1039;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Ldu;")
    public static class479 field1038;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 4)
    public static void method488(int arg0) {
        field1039 = null;
        int var1 = 26 % ((arg0 + 22) / 61);
        field1037 = null;
        field1032 = null;
        field1038 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 20)
    public final void method489(byte arg0) {
        this.field1030 &= 0x3FFF;
        field1034++;
        if (arg0 <= 80) {
            method492(-81);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIB)Z", line = 32)
    public final boolean method490(int arg0, int arg1, int arg2, byte arg3) {
        field1029++;
        int var5 = this.field1028;
        if (this.field1030 == arg0 && this.field1028 == 0) {
            return false;
        }
        boolean var8;
        if (this.field1028 == 0) {
            if (this.field1030 < arg0 && arg0 <= (this.field1030 + arg2) || this.field1030 > arg0 && arg0 >= this.field1030 - arg2) {
                this.field1030 = arg0;
                return false;
            }
            var8 = true;
        } else if (this.field1028 > 0 && this.field1030 < arg0) {
            int var6 = this.field1028 * this.field1028 / (arg2 * 2);
            int var7 = this.field1030 + var6;
            if (arg0 > var7 && var7 >= this.field1030) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field1028 < 0 && this.field1030 > arg0) {
            int var9 = this.field1028 * this.field1028 / (arg2 * 2);
            int var10 = this.field1030 - var9;
            if (arg0 < var10 && this.field1030 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field1030 < arg0) {
                this.field1028 += arg2;
                if (arg1 != 0 && arg1 < this.field1028) {
                    this.field1028 = arg1;
                }
            } else {
                this.field1028 -= arg2;
                if (arg1 != 0 && -arg1 > this.field1028) {
                    this.field1028 = -arg1;
                }
            }
            if (this.field1028 != var5) {
                int var11 = this.field1028 * this.field1028 / (arg2 * 2);
                if (arg0 <= this.field1030) {
                    if (this.field1030 > arg0 && (this.field1030 - var11) < arg0) {
                        this.field1028 = var5;
                    }
                } else if (arg0 < (this.field1030 + var11)) {
                    this.field1028 = var5;
                }
            }
        } else if (this.field1028 > 0) {
            this.field1028 -= arg2;
            if (this.field1028 < 0) {
                this.field1028 = 0;
            }
        } else {
            this.field1028 += arg2;
            if (this.field1028 > 0) {
                this.field1028 = 0;
            }
        }
        this.field1030 += this.field1028 + var5 >> 1;
        int var12 = -116 / ((36 - arg3) / 36);
        return var8;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 169)
    public final void method491(int arg0, int arg1) {
        if (arg0 == -12500) {
            this.field1030 = arg1;
            this.field1028 = 0;
            field1033++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 183)
    public static final void method492(int arg0) {
        class99.field1402 = 0;
        class132.field1863 = 0;
        class139.field1986 = 0;
        class130.field1833 = 0;
        if (arg0 != 6) {
            field1036 = null;
        }
        field1027++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)I", line = 194)
    public final int method493(byte arg0) {
        if (arg0 < 111) {
            this.method490(43, -97, -32, (byte) 31);
        }
        field1031++;
        return this.field1030 & 0x3FFF;
    }
}
