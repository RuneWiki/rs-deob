import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class120 {

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "[I")
    private int[] field1850 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field1841 = -1;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field1849 = -1;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field1834 = -1;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Ltm;")
    public static class334 field1838 = new class334(115, 6);

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lns;")
    public class128 field1842;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
    private int[] field1844;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[S")
    private short[] field1833;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[S")
    private short[] field1837;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "[S")
    private short[] field1846;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "[S")
    private short[] field1847;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method942(byte arg0) {
        field1840++;
        if (this.field1844 == null) {
            return true;
        }
        boolean var2 = true;
        class422 var3 = this.field1842.field1997;
        synchronized (this.field1842.field1997) {
            int var4 = 0;
            if (arg0 < 110) {
                this.method947(null, 106);
            }
            while (this.field1844.length > var4) {
                if (!this.field1842.field1997.method2640(this.field1844[var4], 0, 126)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 30)
    public static void method943(int arg0) {
        field1838 = null;
        if (arg0 >= -111) {
            field1838 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V", line = 41)
    public static final void method944(byte arg0) {
        field1848++;
        if (class196.field3382 != null) {
            return;
        }
        int var1 = class189.field3184;
        int var2 = class581.field8223;
        int var3 = class205.field3443 - class660.field9408 - var1;
        int var4 = class245.field3938 - var2 - class412.field6066;
        if (arg0 <= 52) {
            method943(88);
        }
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class530.field7619 != null) {
                var5 = class530.field7619;
            } else if (class351.field5138 == null) {
                var5 = class690.field9800;
            } else {
                var5 = class351.field5138;
            }
            int var6 = 0;
            int var7 = 0;
            if (class530.field7619 == var5) {
                Insets var8 = class530.field7619.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class245.field3938);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class205.field3443, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class205.field3443 + var6 - var3, var7, var3, class245.field3938);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class245.field3938 - var4, class205.field3443, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z", line = 114)
    public final boolean method945(int arg0) {
        field1843++;
        boolean var2 = true;
        if (arg0 < 23) {
            this.method945(104);
        }
        class422 var3 = this.field1842.field1997;
        synchronized (this.field1842.field1997) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field1850[var4] != -1 && !this.field1842.field1997.method2640(this.field1850[var4], 0, 113)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Lb;", line = 148)
    public final class352 method946(int arg0) {
        field1839++;
        class352[] var2 = new class352[5];
        int var3 = 0;
        class422 var4 = this.field1842.field1997;
        synchronized (this.field1842.field1997) {
            if (arg0 <= 47) {
                this.field1844 = null;
            }
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field1850[var5] != -1) {
                    var2[var3++] = class357.method2284(this.field1842.field1997, this.field1850[var5], 0, (byte) -127);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field5193 < 13) {
                var2[var6].method2235(125, 2);
            }
        }
        class352 var7 = new class352(var2, var3);
        if (this.field1833 != null) {
            for (int var8 = 0; var8 < this.field1833.length; var8++) {
                var7.method2231((byte) -57, this.field1833[var8], this.field1847[var8]);
            }
        }
        if (this.field1837 != null) {
            for (int var9 = 0; var9 < this.field1837.length; var9++) {
                var7.method2242(this.field1846[var9], this.field1837[var9], (byte) -90);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lofa;I)V", line = 222)
    public final void method947(class301 arg0, int arg1) {
        if (arg1 != -1) {
            field1835 = -128;
        }
        while (true) {
            int var3 = arg0.method1987(-10);
            if (var3 == 0) {
                field1836++;
                return;
            }
            this.method949(arg0, var3, 103);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)Lb;", line = 257)
    public final class352 method948(int arg0) {
        field1851++;
        if (this.field1844 == null) {
            return null;
        }
        class352[] var2 = new class352[this.field1844.length];
        class422 var3 = this.field1842.field1997;
        synchronized (this.field1842.field1997) {
            int var4 = 0;
            while (true) {
                if (this.field1844.length <= var4) {
                    break;
                }
                var2[var4] = class357.method2284(this.field1842.field1997, this.field1844[var4], 0, (byte) -126);
                var4++;
            }
        }
        if (arg0 != -6570) {
            method943(-50);
        }
        for (int var5 = 0; var5 < this.field1844.length; var5++) {
            if (var2[var5].field5193 < 13) {
                var2[var5].method2235(arg0 + 6685, 2);
            }
        }
        class352 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class352(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1833 != null) {
            for (int var7 = 0; var7 < this.field1833.length; var7++) {
                var6.method2231((byte) -57, this.field1833[var7], this.field1847[var7]);
            }
        }
        if (this.field1837 != null) {
            for (int var8 = 0; var8 < this.field1837.length; var8++) {
                var6.method2242(this.field1846[var8], this.field1837[var8], (byte) -91);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lofa;II)V", line = 340)
    private final void method949(class301 arg0, int arg1, int arg2) {
        field1845++;
        if (arg2 <= 47) {
            this.method945(92);
        }
        if (arg1 == 1) {
            arg0.method1987(-81);
        } else if (arg1 == 2) {
            int var4 = arg0.method1987(-76);
            this.field1844 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1844[var5] = arg0.method1989((byte) -90);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg0.method1987(-29);
                this.field1847 = new short[var6];
                this.field1833 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1833[var7] = (short) arg0.method1989((byte) -81);
                    this.field1847[var7] = (short) arg0.method1989((byte) -46);
                }
                return;
            }
            if (arg1 == 41) {
                int var8 = arg0.method1987(-81);
                this.field1837 = new short[var8];
                this.field1846 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1837[var9] = (short) arg0.method1989((byte) -121);
                    this.field1846[var9] = (short) arg0.method1989((byte) -64);
                }
                return;
            }
            if (arg1 >= 60 && arg1 < 70) {
                this.field1850[arg1 - 60] = arg0.method1989((byte) -40);
                return;
            }
        }
    }
}
