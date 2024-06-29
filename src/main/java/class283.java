import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class283 extends class147 {

    @OriginalMember(owner = "client!j", name = "u", descriptor = "[Lj;")
    public class283[] field4720;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
    public boolean field4715;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lna;")
    public static class26 field4725 = class69.method505("::shiftclick", (byte) -125);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field4721 = 0;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "Lna;")
    public static class26 field4738 = class69.method505("::replacecanvas", (byte) -121);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field4736 = 0;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field4737 = 0;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "[I")
    public static int[] field4740 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public int field4732;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lrk;")
    public static class175 field4723;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lnd;")
    public class314 field4719;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lpf;")
    public class85 field4733;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)[I", line = 5)
    public final int[] method1990(int arg0, int arg1, int arg2) {
        if (arg2 != 32755) {
            field4736 = 121;
        }
        field4731++;
        return this.field4720[arg0].field4715 ? this.field4720[arg0].method8(arg1, (byte) -118) : this.field4720[arg0].method3(-1, arg1)[0];
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 26)
    public static final void method1991(int arg0) {
        if (arg0 >= 91) {
            field4728++;
            class301.field5187 = new class32();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I", line = 38)
    public int[] method8(int arg0, byte arg1) {
        int var3 = -71 / ((30 - arg1) / 36);
        field4718++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)I", line = 49)
    public int method1860(byte arg0) {
        if (arg0 != 19) {
            this.method1990(-80, 116, -73);
        }
        field4724++;
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 63)
    public static void method1992(int arg0) {
        if (arg0 != 2) {
            method1991(18);
        }
        field4740 = null;
        field4738 = null;
        field4725 = null;
        field4723 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILwa;Z)V", line = 79)
    public void method1(int arg0, class82 arg1, boolean arg2) {
        field4739++;
        if (!arg2) {
            this.field4720 = (class283[]) null;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 93)
    public void method130(int arg0) {
        if (arg0 != 16251) {
            field4721 = 12;
        }
        field4727++;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)I", line = 109)
    public int method802(int arg0) {
        field4716++;
        if (arg0 != 4) {
            method1996((byte) -98, true, (class26) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V", line = 129)
    public final void method1993(int arg0, int arg1, int arg2) {
        if (arg2 != 250) {
            this.field4733 = (class85) null;
        }
        int var4 = this.field4732 == 255 ? arg0 : this.field4732;
        field4726++;
        if (this.field4715) {
            this.field4733 = new class85(var4, arg0, arg1);
        } else {
            this.field4719 = new class314(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V", line = 155)
    public void method805(byte arg0) {
        field4735++;
        if (arg0 != -45) {
            field4736 = 16;
        }
        if (this.field4715) {
            this.field4733.method661(1127165736);
            this.field4733 = null;
        } else {
            this.field4719.method2178((byte) -22);
            this.field4719 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)[[I", line = 182)
    public final int[][] method1994(int arg0, int arg1, byte arg2) {
        if (arg2 > -45) {
            return (int[][]) ((int[][]) null);
        }
        field4729++;
        if (this.field4720[arg1].field4715) {
            int[] var4 = this.field4720[arg1].method8(arg0, (byte) -105);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4720[arg1].method3(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BI)Ldd;", line = 214)
    public static final class248 method1995(byte[] arg0, int arg1) {
        field4730++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 25208) {
            field4721 = 5;
        }
        class248 var2 = new class248(arg0, class58.field936, class82.field1281, class141.field2149, class98.field1596, class205.field3203);
        class160.method1088((byte) 126);
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BZLna;)V", line = 245)
    public static final void method1996(byte arg0, boolean arg1, class26 arg2) {
        field4722++;
        if (arg0 > -11) {
            return;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class136.field2083.method1197(arg2, 250);
        int var7 = class136.field2083.method1201(arg2, 250) * 13;
        if (class255.field4184) {
            class326.method2278(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 0);
            class326.method2271(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class34.method286(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 0);
            class34.method274(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
        }
        class136.field2083.method1195(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class222.method1486(var4 - var3, var3 - -var3 + var6, (byte) -40, var5 - var3, var3 + var7 + var3);
        if (!arg1) {
            class299.method2109(var4, (byte) -97, var5, var7, var6);
        } else if (class255.field4184) {
            class255.method1766();
        } else {
            try {
                Graphics var8 = class250.field4085.getGraphics();
                class134.field2040.method1030(0, 0, var8, 0);
            } catch (Exception var10) {
                class250.field4085.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V", line = 315)
    public class283(int arg0, boolean arg1) {
        this.field4720 = new class283[arg0];
        this.field4715 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 333)
    public static final void method1997(int arg0) {
        class313.field5351 = null;
        class142.field2182 = null;
        field4734++;
        class121.field1888 = null;
        if (arg0 != -7878) {
            method1996((byte) 102, false, (class26) null);
        }
        class317.field5431 = null;
        class301.field5192 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)[[I", line = 350)
    public int[][] method3(int arg0, int arg1) {
        field4717++;
        if (arg0 == -1) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }
}
