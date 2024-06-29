import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class502 {

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "Lpq;")
    private class131 field7417;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lqc;")
    private class532 field7414;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lhk;")
    private class67 field7410;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Lla;")
    public static class319 field7403 = new class319(68, -1);

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field7412 = 0;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Lla;")
    public static class319 field7415 = new class319(56, 4);

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Z")
    public static boolean field7416 = true;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lnj;")
    private class164 field7406;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Luu;")
    public static class191 field7407;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "Luu;")
    public static class191 field7409;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Leb;")
    public static class448 field7404;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[Lhn;")
    private class516[] field7400;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Lci;")
    public static final class318 method3006(byte arg0) {
        field7408++;
        int var1 = -35 / ((arg0 - 31) / 33);
        class318 var2 = (class318) class533.field7834.method3038(88);
        if (var2 == null) {
            return new class318();
        } else {
            class461.field6893--;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z")
    public final boolean method3007(int arg0) {
        field7401++;
        if (this.field7406 != null) {
            return true;
        }
        if (this.field7410 == null) {
            if (this.field7417.method887((byte) -78)) {
                return false;
            }
            this.field7410 = this.field7417.method891(true, 0, (byte) 0, 255, 255);
        }
        if (arg0 != 0) {
            return true;
        } else if (this.field7410.field2342) {
            return false;
        } else {
            this.field7406 = new class164(this.field7410.method480((byte) 118));
            this.field7400 = new class516[(this.field7406.field2219.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIIIIB)V")
    public static final void method3008(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field7402++;
        if (class461.field6896 != null && (arg3 != 3 || class203.field2716.field1158 != arg1 || class203.field2716.field1154 != arg2)) {
            class91.method612(0, class312.field4572, class461.field6896);
            class461.field6896 = null;
        }
        if (arg3 == 3 && class461.field6896 == null) {
            class461.field6896 = class346.method2240(0, arg1, class312.field4572, -1, arg2, 0);
            if (class461.field6896 != null) {
                class203.field2716.field1158 = arg1;
                class203.field2716.field1154 = arg2;
                class203.field2716.method20(class312.field4572, arg5 + 60);
            }
        }
        if (arg3 == 3 && class461.field6896 == null) {
            method3008(true, -1, -1, class203.field2716.field1161, arg4, (byte) -59);
            return;
        }
        Container var6;
        if (class461.field6896 != null) {
            class164.field2221 = arg1;
            class360.field5522 = arg2;
            var6 = class461.field6896;
        } else if (class286.field4195 == null) {
            var6 = class312.field4572.field7381;
            class164.field2221 = var6.getSize().width;
            class360.field5522 = var6.getSize().height;
        } else {
            Insets var7 = class286.field4195.getInsets();
            class164.field2221 = class286.field4195.getSize().width - var7.left - var7.right;
            class360.field5522 = class286.field4195.getSize().height - var7.bottom - var7.top;
            var6 = class286.field4195;
        }
        if (arg3 == 1) {
            class465.field6939 = (class164.field2221 - class162.field2117) / 2;
            class110.field1551 = 0;
            class107.field1525 = class533.field7843;
            class147.field1961 = class162.field2117;
        } else if (class230.field3289 < 96 && class378.field5771 == 0) {
            int var8 = class164.field2221 <= 1024 ? class164.field2221 : 1024;
            int var9 = class360.field5522 <= 768 ? class360.field5522 : 768;
            class147.field1961 = var8;
            class465.field6939 = (class164.field2221 - var8) / 2;
            class110.field1551 = 0;
            class107.field1525 = var9;
        } else {
            class147.field1961 = class164.field2221;
            class110.field1551 = 0;
            class465.field6939 = 0;
            class107.field1525 = class360.field5522;
        }
        if (class476.field7072 != class116.field1601) {
            boolean var10000;
            if (class147.field1961 < 1024 && class107.field1525 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class127.method871((byte) -121);
        } else {
            class85.field1245.setSize(class147.field1961, class107.field1525);
            class400.field6090.method791(class85.field1245);
            if (class286.field4195 == var6) {
                Insets var10 = class286.field4195.getInsets();
                class85.field1245.setLocation(class465.field6939 + var10.left, class110.field1551 + var10.top);
            } else {
                class85.field1245.setLocation(class465.field6939, class110.field1551);
            }
        }
        if (arg3 < 2) {
            class439.field6629 = false;
        } else {
            class439.field6629 = true;
        }
        if (class337.field5232 != -1) {
            class404.method2490(125, true);
        }
        if (class374.field5695 != null && class444.method2693(class435.field6596, false)) {
            class365.method2331(true);
        }
        if (arg5 != -59) {
            method3008(false, -74, 95, -47, -44, (byte) 115);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class430.field6553[var11] = true;
        }
        class264.field3703 = true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)Lco;")
    public static final class77 method3009(boolean arg0, int arg1) {
        if (arg0) {
            method3009(false, 35);
        }
        field7413++;
        class77[] var2 = class264.method1701(-84);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class77 var4 = var2[var3];
            if (var4.field1112 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public static void method3010(byte arg0) {
        field7403 = null;
        if (arg0 >= -55) {
            field7407 = null;
        }
        field7404 = null;
        field7407 = null;
        field7409 = null;
        field7415 = null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public final void method3011(byte arg0) {
        if (arg0 != 12) {
            field7415 = null;
        }
        field7399++;
        if (this.field7400 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field7400.length; var2++) {
            if (this.field7400[var2] != null) {
                this.field7400[var2].method3083(-1);
            }
        }
        for (int var3 = 0; var3 < this.field7400.length; var3++) {
            if (this.field7400[var3] != null) {
                this.field7400[var3].method3082(true);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILvc;ZLvc;B)Lhn;")
    private final class516 method3012(int arg0, class211 arg1, boolean arg2, class211 arg3, byte arg4) {
        field7405++;
        if (this.field7406 == null) {
            throw new RuntimeException();
        } else if (arg4 < 47) {
            return null;
        } else {
            this.field7406.field2185 = arg0 * 8 + 5;
            if (this.field7406.field2219.length <= this.field7406.field2185) {
                throw new RuntimeException();
            } else if (this.field7400[arg0] == null) {
                int var6 = this.field7406.method1099(120);
                int var7 = this.field7406.method1099(-107);
                class516 var8 = new class516(arg0, arg3, arg1, this.field7417, this.field7414, var6, var7, arg2);
                this.field7400[arg0] = var8;
                return var8;
            } else {
                return this.field7400[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lvc;ILvc;I)Lhn;")
    public final class516 method3013(class211 arg0, int arg1, class211 arg2, int arg3) {
        if (arg3 != 0) {
            method3010((byte) 114);
        }
        field7411++;
        return this.method3012(arg1, arg0, true, arg2, (byte) 109);
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lpq;Lqc;)V")
    public class502(class131 arg0, class532 arg1) {
        this.field7417 = arg0;
        this.field7414 = arg1;
        if (!this.field7417.method887((byte) -78)) {
            this.field7410 = this.field7417.method891(true, 0, (byte) 0, 255, 255);
        }
    }
}
