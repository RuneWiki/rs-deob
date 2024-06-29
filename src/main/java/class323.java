import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class323 extends class111 {

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    private int field4872 = -32768;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    private int field4865 = 0;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
    private boolean field4878 = false;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    private int field4876 = -1;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "Z")
    public boolean field4877 = false;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    private int field4880 = 0;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public int field4864;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public int field4868;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Ltc;")
    private class248 field4860;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "S")
    public static short field4867 = 1;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "F")
    public static float field4858;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "Lko;")
    private class155 field4866;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V", line = 9)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4873++;
        if (!this.field4878) {
            class151 var6 = this.method2240((byte) -35);
            if (var6 == null) {
                return;
            }
            this.method2242(1, var6);
        }
        if (this.field4866 != null) {
            this.field4866.method1109(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 39)
    public final void method2239(int arg0, int arg1) {
        if (arg1 != -12523) {
            this.method2239(-63, -112);
        }
        field4874++;
        if (this.field4877) {
            return;
        }
        this.field4880 += arg0;
        while (this.field4880 > this.field4860.field3694[this.field4865]) {
            this.field4880 -= this.field4860.field3694[this.field4865];
            this.field4865++;
            if (this.field4865 >= this.field4860.field3667.length) {
                this.field4877 = true;
                break;
            }
        }
        if (!this.field4877) {
            class361.method2512(arg1 - 16998, this.field4870, false, this.field4865, this.field4860, this.field4868);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Lhc;", line = 73)
    private final class151 method2240(byte arg0) {
        field4859++;
        class107 var2 = class81.method669(32, this.field4871);
        class151 var3;
        if (this.field4877) {
            var3 = var2.method819(-1, arg0 + 19887, 0, -1);
        } else {
            var3 = var2.method819(this.field4876, 19852, this.field4880, this.field4865);
        }
        if (arg0 == -35) {
            return var3 == null ? null : var3;
        } else {
            return (class151) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z", line = 95)
    public static final boolean method2241(int arg0, int arg1) {
        class316 var2 = class206.method1506(arg1, -64);
        field4856++;
        if (var2 == null) {
            return false;
        } else if (class61.field890 == arg0 || class61.field890 == 2 || class14.field214 == 2) {
            class112.field1624 = var2.field4690;
            class15.field227 = var2.field4686;
            if (class14.field214 != 0) {
                class240.field3574 = class15.field227 + 50000;
                class75.field1096 = class15.field227 + 40000;
                class62.field913 = class75.field1096;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class294.field4432 != null) {
                var4 = "/p=" + class294.field4432;
            }
            if (class14.field214 != 0) {
                var3 = ":" + (var2.field4686 + 7000);
            }
            String var5 = "http://" + var2.field4690 + var3 + "/l=" + class54.field789 + "/a=" + class177.field2543 + var4 + "/j" + (class158.field2272 ? "1" : "0") + ",o" + (class8.field147 ? "1" : "0") + ",a2,m" + (class356.field5459 ? "1" : "0");
            try {
                class300.field4493.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIII)V", line = 253)
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4864 = arg1;
        this.field4868 = arg3;
        this.field4870 = arg2;
        this.field4857 = arg5 + arg6;
        this.field4863 = arg4;
        this.field4871 = arg0;
        int var8 = class81.method669(32, this.field4871).field1540;
        if (var8 == -1) {
            this.field4877 = true;
        } else {
            this.field4877 = false;
            this.field4860 = class119.method893(var8, (byte) -41);
        }
        if (this.field4857 == arg6) {
            class361.method2512(-29521, this.field4870, false, this.field4865, this.field4860, this.field4868);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()I", line = 151)
    public final int method371() {
        field4879++;
        return this.field4872;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 160)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        field4862++;
        class151 var13 = this.method2240((byte) -35);
        if (var13 != null) {
            this.method2242(1, var13);
            var13.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4866);
            this.field4872 = var13.method371();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILhc;)V", line = 187)
    private final void method2242(int arg0, class151 arg1) {
        field4869++;
        if (class141.field2031) {
            class218 var4 = (class218) arg1;
            if ((this.field4866 == null || this.field4866.field2220) && (var4.field3216 != null || var4.field3241 != null)) {
                this.field4866 = new class155(class304.field4560, 1, 1);
            }
            if (this.field4866 != null) {
                this.field4866.method1118(var4.field3216, var4.field3241, false, var4.field3244, var4.field3246, var4.field3214);
            }
        } else {
            class317 var3 = (class317) arg1;
            if ((this.field4866 == null || this.field4866.field2220) && (var3.field4703 != null || var3.field4712 != null)) {
                this.field4866 = new class155(class304.field4560, 1, 1);
            }
            if (this.field4866 != null) {
                this.field4866.method1118(var3.field4703, var3.field4712, false, var3.field4725, var3.field4718, var3.field4709);
            }
        }
        this.field4878 = true;
        if (arg0 != 1) {
            this.field4880 = 14;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 240)
    public static final void method2243(int arg0) {
        field4875++;
        class315.field4680.method458((byte) -66);
        if (arg0 != -20012) {
            field4858 = 0.53046685F;
        }
    }
}
