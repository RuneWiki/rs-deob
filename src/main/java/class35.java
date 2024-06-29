import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class143 {

    @OriginalMember(owner = "client!ef", name = "Hb", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!ef", name = "Cb", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "client!ef", name = "qb", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!ef", name = "Eb", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "client!ef", name = "Gb", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!ef", name = "ub", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!ef", name = "tb", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!ef", name = "Bb", descriptor = "Lma;")
    private class84 field819;

    @OriginalMember(owner = "client!ef", name = "Ab", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!ef", name = "Kb", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "Lu;")
    private static class135 field806 = class87.method676((byte) -46, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lu;")
    public static class135 field817 = class87.method676((byte) -88, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ef", name = "Fb", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!ef", name = "xb", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lu;")
    public static class135 field804 = field806;

    @OriginalMember(owner = "client!ef", name = "Ib", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!ef", name = "Jb", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!ef", name = "Db", descriptor = "Lu;")
    public static class135 field821 = field806;

    @OriginalMember(owner = "client!ef", name = "rb", descriptor = "Lu;")
    public static class135 field809 = class87.method676((byte) -65, "Duell akzeptieren");

    @OriginalMember(owner = "client!ef", name = "yb", descriptor = "Lu;")
    private static class135 field816 = class87.method676((byte) -51, "Please reload this page)3");

    @OriginalMember(owner = "client!ef", name = "sb", descriptor = "Lu;")
    public static class135 field810 = field816;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ef", name = "vb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ef", name = "wb", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method272(byte arg0) {
        int var1 = 48 % ((-arg0 - 37) / 52);
        field816 = null;
        field804 = null;
        field821 = null;
        field806 = null;
        field809 = null;
        field817 = null;
        field810 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)Lna;")
    public final class91 method273(byte arg0) {
        field807++;
        if (this.field819 != null) {
            int var2 = class126.field2998 - this.field828;
            if (var2 > 100 && this.field819.field1984 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field819.field2008[this.field818]) {
                            break label38;
                        }
                        var2 -= this.field819.field2008[this.field818];
                        this.field818++;
                    } while (this.field818 < this.field819.field2013.length);
                    this.field818 -= this.field819.field1984;
                } while (this.field818 >= 0 && this.field818 < this.field819.field2013.length);
                this.field819 = null;
            }
            this.field828 = class126.field2998 - var2;
        }
        class119 var3 = class2.method9(false, this.field824);
        if (var3.field2825 != null) {
            var3 = var3.method946(0);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = 57 % ((-arg0 - 59) / 51);
            return var3.method944(this.field820, this.field822, this.field825, this.field819, this.field812, (byte) 103, this.field808, this.field811, this.field818);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(BLjava/awt/Component;)V")
    public static final void method274(byte arg0, Component arg1) {
        int var2 = -40 / ((-arg0 - 70) / 37);
        field814++;
        Method var3 = class27.field651;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class46.field1103);
        arg1.addFocusListener(class46.field1103);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIIIIZLvb;)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class143 arg9) {
        this.field825 = arg3;
        this.field820 = arg4;
        this.field808 = arg1;
        this.field822 = arg6;
        this.field824 = arg0;
        this.field812 = arg2;
        this.field811 = arg5;
        if (arg7 != -1) {
            this.field819 = class17.method108(arg7, 0);
            this.field818 = 0;
            this.field828 = class126.field2998 - 1;
            if (this.field819.field2011 == 0 && arg9 != null && arg9 instanceof class35) {
                class35 var11 = (class35) arg9;
                if (this.field819 == var11.field819) {
                    this.field818 = var11.field818;
                    this.field828 = var11.field828;
                    return;
                }
            }
            if (arg8 && this.field819.field1984 != -1) {
                this.field818 = (int) (Math.random() * (double) this.field819.field2013.length);
                this.field828 -= (int) ((double) this.field819.field2008[this.field818] * Math.random());
                return;
            }
        }
    }
}
