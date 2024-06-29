import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class117 extends class671 {

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!eea", name = "s", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "I")
    private int field1779;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
    private int field1780;

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "[I")
    public static int[] field1789 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!eea", name = "A", descriptor = "[I")
    public static int[] field1784 = new int[2];

    @OriginalMember(owner = "client!eea", name = "t", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!eea", name = "u", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
    private int field1781;

    @OriginalMember(owner = "client!eea", name = "z", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!eea", name = "B", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!eea", name = "H", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!eea", name = "I", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "[B")
    private byte[] field1782;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)V")
    public final void method902(boolean arg0) {
        this.field1780 = this.field1779;
        this.field1781 >>= 0x4;
        field1792++;
        if (this.field1781 < 0) {
            this.field1781 = 0;
        } else if (this.field1781 > 255) {
            this.field1781 = 255;
        }
        this.method903((byte) this.field1781, arg0, this.field1778++);
        this.field1781 = 0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(BZI)V")
    public void method903(byte arg0, boolean arg1, int arg2) {
        field1786++;
        if (!arg1) {
            method908((byte) 62);
        }
        this.field1782[arg2] = arg0;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
    public final void method904(int arg0) {
        field1777++;
        this.field1778 = 0;
        this.field1781 = 0;
        int var2 = 27 % ((-arg0 - 56) / 52);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class117(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1787 = (int) (arg7 * 4096.0F);
        this.field1776 = (int) (arg6 * 4096.0F);
        this.field1780 = this.field1779 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(IIII)Z")
    public static final boolean method905(int arg0, int arg1, int arg2, int arg3) {
        field1783++;
        class564.field7945.method239(arg0, arg3, arg1, class243.field3781);
        int var4 = class243.field3781[arg2];
        if (var4 < 50) {
            return false;
        } else {
            class243.field3781[0] = class243.field3781[0] * class411.field5997 / var4 + class585.field8201;
            class243.field3781[1] = class243.field3781[1] * class387.field5544 / var4 + class486.field6918;
            class243.field3781[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "(I)V")
    public static final void method906(int arg0) {
        field1791++;
        class203 var1 = null;
        if (arg0 != 2) {
            method908((byte) 57);
        }
        try {
            class494 var2 = class368.field5267.method14(true, "2", 115);
            while (var2.field7024 == 0) {
                class561.method3202(1L, (byte) -80);
            }
            if (var2.field7024 == 1) {
                var1 = (class203) var2.field7019;
                byte[] var3 = new byte[(int) var1.method1351(-79)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1350(var3.length - var4, var4, (byte) -118, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class676.method3760(1, new class695(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1344((byte) 127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIB)V")
    public final void method907(int arg0, int arg1, byte arg2) {
        if (arg0 == 0) {
            this.field1788 = this.field1776 - (arg1 < 0 ? -arg1 : arg1);
            this.field1788 = this.field1788 * this.field1788 >> 12;
            this.field1790 = 4096;
            this.field1781 = this.field1788;
        } else {
            this.field1790 = this.field1788 * this.field1787 >> 12;
            if (this.field1790 < 0) {
                this.field1790 = 0;
            } else if (this.field1790 > 4096) {
                this.field1790 = 4096;
            }
            this.field1788 = this.field1776 - (arg1 >= 0 ? arg1 : -arg1);
            this.field1788 = this.field1788 * this.field1788 >> 12;
            this.field1788 = this.field1790 * this.field1788 >> 12;
            this.field1781 += this.field1788 * this.field1780 >> 12;
            this.field1780 = this.field1780 * this.field1779 >> 12;
        }
        if (arg2 == 44) {
            field1785++;
        }
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field1784 = null;
        if (arg0 != -115) {
            method906(-71);
        }
        field1789 = null;
    }
}
