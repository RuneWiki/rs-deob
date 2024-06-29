import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class129 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Z")
    public boolean field1776 = false;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field1777 = -1;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    private int[] field1786 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1775 = "Connected to update server";

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public static int[] field1772 = new int[2048];

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
    public static int[] field1790 = new int[99];

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[I")
    private int[] field1780;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[S")
    private short[] field1778;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[S")
    private short[] field1782;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "[S")
    private short[] field1784;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[S")
    private short[] field1789;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method862(int arg0) {
        field1785++;
        if (this.field1780 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 <= 49) {
            return false;
        }
        for (int var3 = 0; var3 < this.field1780.length; var3++) {
            if (!class225.field3193.method1185(0, -2, this.field1780[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lpn;", line = 36)
    public final class207 method863(byte arg0) {
        int var2 = 0;
        class207[] var3 = new class207[5];
        field1787++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1786[var4] != -1) {
                var3[var2++] = class207.method1414(class225.field3193, this.field1786[var4], 0);
            }
        }
        if (arg0 < 53) {
            return (class207) null;
        }
        class207 var5 = new class207(var3, var2);
        if (this.field1778 != null) {
            for (int var6 = 0; var6 < this.field1778.length; var6++) {
                var5.method1409(this.field1778[var6], this.field1784[var6]);
            }
        }
        if (this.field1789 != null) {
            for (int var7 = 0; var7 < this.field1789.length; var7++) {
                var5.method1416(this.field1789[var7], this.field1782[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)Lpn;", line = 88)
    public final class207 method864(byte arg0) {
        field1781++;
        if (this.field1780 == null) {
            return null;
        }
        class207[] var2 = new class207[this.field1780.length];
        for (int var3 = 0; var3 < this.field1780.length; var3++) {
            var2[var3] = class207.method1414(class225.field3193, this.field1780[var3], 0);
        }
        if (arg0 >= -51) {
            return (class207) null;
        }
        class207 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class207(var2, var2.length);
        }
        if (this.field1778 != null) {
            for (int var5 = 0; var5 < this.field1778.length; var5++) {
                var4.method1409(this.field1778[var5], this.field1784[var5]);
            }
        }
        if (this.field1789 != null) {
            for (int var6 = 0; var6 < this.field1789.length; var6++) {
                var4.method1416(this.field1789[var6], this.field1782[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lp;Z)V", line = 146)
    public final void method865(class107 arg0, boolean arg1) {
        field1773++;
        if (arg1) {
            this.method866(106, (class107) null, false);
        }
        while (true) {
            int var3 = arg0.method661(-1);
            if (var3 == 0) {
                return;
            }
            this.method866(var3, arg0, arg1);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1790[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILp;Z)V", line = 181)
    private final void method866(int arg0, class107 arg1, boolean arg2) {
        if (arg2) {
            method870(80);
        }
        field1788++;
        if (arg0 == 1) {
            this.field1777 = arg1.method661(-1);
        } else if (arg0 == 2) {
            int var4 = arg1.method661(-1);
            this.field1780 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1780[var5] = arg1.method624(14612);
            }
        } else if (arg0 == 3) {
            this.field1776 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method661(-1);
            this.field1784 = new short[var8];
            this.field1778 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1778[var9] = (short) arg1.method624(14612);
                this.field1784[var9] = (short) arg1.method624(14612);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method661(-1);
            this.field1782 = new short[var6];
            this.field1789 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1789[var7] = (short) arg1.method624(14612);
                this.field1782[var7] = (short) arg1.method624(14612);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1786[arg0 - 60] = arg1.method624(14612);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V", line = 268)
    public static final void method867(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class263 var7 = class176.method1211(1, arg1, arg5);
        if (var7 != null && var7.field4093 != null) {
            class176 var8 = new class176();
            var8.field2551 = var7.field4093;
            var8.field2552 = var7;
            class283.method2027(200000, var8);
        }
        class72.field909 = true;
        class229.field3343 = arg6;
        class275.field4288 = arg4;
        field1779++;
        class161.field2219 = arg0;
        class225.field3194 = arg1;
        class112.field1595 = arg5;
        class37.field442 = arg3;
        class239.method1712(0, var7);
        if (arg2 > -4) {
            method870(-115);
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z", line = 299)
    public final boolean method868(byte arg0) {
        field1774++;
        int var2 = 98 % ((37 - arg0) / 33);
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1786[var4] != -1 && !class225.field3193.method1185(0, -2, this.field1786[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 323)
    public static final void method869(boolean arg0) {
        field1783++;
        Container var1;
        if (class243.field3659 != null) {
            var1 = class243.field3659;
        } else if (class329.field5029 == null) {
            var1 = class9.field131.field4179;
        } else {
            var1 = class329.field5029;
        }
        class73.field943 = var1.getSize().width;
        class138.field1938 = var1.getSize().height;
        if (class329.field5029 == var1) {
            Insets var2 = class329.field5029.getInsets();
            class73.field943 -= var2.right + var2.left;
            class138.field1938 -= var2.top + var2.bottom;
        }
        if (client.method1954(!arg0) >= 2) {
            class188.field2712 = class73.field943;
            class314.field4847 = class138.field1938;
            class148.field2056 = 0;
            class81.field1043 = 0;
        } else {
            class314.field4847 = 503;
            class81.field1043 = 0;
            class188.field2712 = 765;
            class148.field2056 = (class73.field943 - 765) / 2;
        }
        if (class250.field3787) {
            class250.method1795(class188.field2712, class314.field4847);
        }
        if (arg0) {
            return;
        }
        class260.field3941.setSize(class188.field2712, class314.field4847);
        if (class329.field5029 == var1) {
            Insets var3 = class329.field5029.getInsets();
            class260.field3941.setLocation(class148.field2056 + var3.left, class81.field1043 + var3.top);
        } else {
            class260.field3941.setLocation(class148.field2056, class81.field1043);
        }
        if (class146.field2031 != -1) {
            class112.method774(-27290, true);
        }
        class45.method269((byte) 13);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 392)
    public static void method870(int arg0) {
        field1790 = null;
        if (arg0 < 118) {
            field1775 = (String) null;
        }
        field1772 = null;
        field1775 = null;
    }
}
