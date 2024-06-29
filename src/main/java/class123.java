import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class123 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "F")
    public float field1678 = 1.0F;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "F")
    public float field1689 = 0.25F;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "F")
    public float field1695 = 1.0F;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lss;")
    public class506 field1684;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "F")
    public float field1693;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "F")
    public float field1681;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "F")
    public float field1687;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "S")
    public static short field1686 = 1;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "Lgr;")
    public static class530 field1690 = new class530(57, -1);

    @OriginalMember(owner = "client!al", name = "v", descriptor = "Z")
    public static volatile boolean field1699 = true;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Llc;")
    public static class435 field1697 = new class435(12, 2);

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILd;Ljava/awt/Canvas;ILla;)Lha;")
    public static final class543 method867(int arg0, class267 arg1, Canvas arg2, int arg3, class423 arg4) {
        if (arg3 > -82) {
            field1697 = null;
        }
        field1696++;
        if (!class367.method2307((byte) -94)) {
            throw new RuntimeException("");
        } else if (class151.method1095("jaggl", 3)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class643 var8 = new class643(var5, arg2, var6, arg1, arg4, arg0);
            var8.method373((byte) 111);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
    public static final boolean method868(int arg0) {
        if (arg0 != 0) {
            field1690 = null;
        }
        field1680++;
        try {
            class186 var1 = new class186();
            byte[] var2 = var1.method1319(class215.field3228, 115);
            class310.method1927(-1, var2);
            return true;
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILsl;)V")
    public final void method869(int arg0, class479 arg1) {
        this.field1695 = (float) (arg1.method2886(true) * 8) / 255.0F;
        field1694++;
        this.field1689 = (float) (arg1.method2886(true) * 8) / 255.0F;
        this.field1678 = (float) (arg1.method2886(true) * 8) / 255.0F;
        if (arg0 >= -68) {
            method867(55, null, null, -90, null);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static void method870(int arg0) {
        field1690 = null;
        if (arg0 > -72) {
            field1698 = 127;
        }
        field1697 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class123() {
        this.field1685 = -60;
        this.field1683 = class514.field7445;
        this.field1679 = class647.field9314;
        this.field1684 = class387.field5590;
        this.field1693 = 1.1523438F;
        this.field1682 = 0;
        this.field1688 = -50;
        this.field1681 = 1.2F;
        this.field1691 = -50;
        this.field1687 = 0.69921875F;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ILal;)Z")
    public final boolean method871(int arg0, class123 arg1) {
        if (arg0 == -14415) {
            field1692++;
            return this.field1683 == arg1.field1683 && this.field1693 == arg1.field1693 && this.field1687 == arg1.field1687 && this.field1681 == arg1.field1681 && this.field1689 == arg1.field1689 && this.field1695 == arg1.field1695 && this.field1678 == arg1.field1678 && this.field1679 == arg1.field1679 && this.field1682 == arg1.field1682 && this.field1684 == arg1.field1684;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lsl;)V")
    public class123(class479 arg0) {
        int var2 = arg0.method2886(true);
        if (class243.field3580.field7991.method3589(false) == 1 && class751.field10467.method270() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1683 = class514.field7445;
            } else {
                this.field1683 = arg0.method2868(-39);
            }
            if ((var2 & 0x2) == 0) {
                this.field1693 = 1.1523438F;
            } else {
                this.field1693 = (float) arg0.method2882(-1) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1687 = 0.69921875F;
            } else {
                this.field1687 = (float) arg0.method2882(-1) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1681 = 1.2F;
            } else {
                this.field1681 = (float) arg0.method2882(-1) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2868(-62);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2882(-1);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2882(-1);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2882(-1);
            }
            this.field1693 = 1.1523438F;
            this.field1683 = class514.field7445;
            this.field1687 = 0.69921875F;
            this.field1681 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1685 = -60;
            this.field1688 = -50;
            this.field1691 = -50;
        } else {
            this.field1688 = arg0.method2870(-11395);
            this.field1685 = arg0.method2870(-11395);
            this.field1691 = arg0.method2870(-11395);
        }
        if ((var2 & 0x20) == 0) {
            this.field1679 = class647.field9314;
        } else {
            this.field1679 = arg0.method2868(-34);
        }
        if ((var2 & 0x40) == 0) {
            this.field1682 = 0;
        } else {
            this.field1682 = arg0.method2882(-1);
        }
        if ((var2 & 0x80) == 0) {
            this.field1684 = class387.field5590;
        } else {
            int var3 = arg0.method2882(-1);
            int var4 = arg0.method2882(-1);
            int var5 = arg0.method2882(-1);
            int var6 = arg0.method2882(-1);
            int var7 = arg0.method2882(-1);
            int var8 = arg0.method2882(-1);
            this.field1684 = class225.method1564(4, var4, var5, var6, var8, var3, var7);
        }
    }
}
