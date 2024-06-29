import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lkg;")
    public static class179 field57 = new class179(50, 8);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lap;")
    public static class335 field58 = new class335("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[Ll;")
    public static class16[] field61;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
    public final int method33(byte arg0) {
        if (arg0 != -48) {
            this.method38(-62, -17);
        }
        field52++;
        return this.field53 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method34(byte arg0) {
        field58 = null;
        field57 = null;
        field61 = null;
        if (arg0 != -22) {
            field61 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZII)Z")
    public final boolean method35(int arg0, boolean arg1, int arg2, int arg3) {
        field62++;
        int var5 = this.field54;
        if (this.field53 == arg0 && this.field54 == 0) {
            return false;
        }
        if (arg1) {
            this.field53 = -21;
        }
        boolean var6;
        if (this.field54 == 0) {
            if (this.field53 < arg0 && (this.field53 + arg3) >= arg0 || this.field53 > arg0 && this.field53 - arg3 <= arg0) {
                this.field53 = arg0;
                return false;
            }
            var6 = true;
        } else if (this.field54 > 0 && arg0 > this.field53) {
            int var7 = this.field54 * this.field54 / (arg3 * 2);
            int var8 = this.field53 + var7;
            if (arg0 > var8 && var8 >= this.field53) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field54 < 0 && arg0 < this.field53) {
            int var9 = this.field54 * this.field54 / (arg3 * 2);
            int var10 = this.field53 - var9;
            if (arg0 < var10 && this.field53 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field53 < arg0) {
                this.field54 += arg3;
                if (arg2 != 0 && this.field54 > arg2) {
                    this.field54 = arg2;
                }
            } else {
                this.field54 -= arg3;
                if (arg2 != 0 && -arg2 > this.field54) {
                    this.field54 = -arg2;
                }
            }
            if (this.field54 != var5) {
                int var11 = this.field54 * this.field54 / (arg3 * 2);
                if (arg0 > this.field53) {
                    if (arg0 < this.field53 + var11) {
                        this.field54 = var5;
                    }
                } else if (this.field53 > arg0 && (this.field53 - var11) < arg0) {
                    this.field54 = var5;
                }
            }
        } else if (this.field54 <= 0) {
            this.field54 += arg3;
            if (this.field54 > 0) {
                this.field54 = 0;
            }
        } else {
            this.field54 -= arg3;
            if (this.field54 < 0) {
                this.field54 = 0;
            }
        }
        this.field53 += this.field54 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static final void method36(byte arg0) {
        field56++;
        if (class277.field3510 == -1 || arg0 > -3) {
            return;
        }
        int var1 = class204.field2664.method1333(7);
        int var2 = class204.field2664.method1337(69);
        class494 var3 = (class494) class53.field706.method153(0);
        if (var3 != null) {
            var1 = var3.method2151(-95);
            var2 = var3.method2155((byte) -92);
        }
        class303.method1787(var1, class277.field3510, (byte) 124, 0, 0, 0, 0, class390.field5236, class174.field2262, var2);
        if (class78.field1021 != null) {
            class240.method1450(var2, var1, -61);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
    public final void method37(byte arg0) {
        if (arg0 != -19) {
            field58 = null;
        }
        field55++;
        this.field53 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    public final void method38(int arg0, int arg1) {
        this.field53 = arg1;
        this.field54 = 0;
        if (arg0 != 14002) {
            this.method37((byte) 27);
        }
        field60++;
    }

    static {
        new class335("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
