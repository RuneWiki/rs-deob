import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class260 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public int field4448 = -1;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
    public boolean field4444 = false;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[I")
    private int[] field4450 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lhn;")
    public static class317 field4458 = new class317(64);

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Lhi;")
    public static class82 field4464 = class95.method664((byte) -117, "m");

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[B")
    public static byte[] field4452;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
    private int[] field4440;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[S")
    private short[] field4438;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "[S")
    private short[] field4447;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "[S")
    private short[] field4460;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "[S")
    private short[] field4461;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[[B")
    public static byte[][] field4453;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[[Luk;")
    public static class108[][] field4439;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 19)
    public static final int method1849(int arg0, KeyEvent arg1) {
        field4449++;
        int var2 = arg1.getKeyChar();
        if (arg0 <= 49) {
            field4464 = (class82) null;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 39)
    public static void method1850(int arg0) {
        field4453 = (byte[][]) null;
        field4464 = null;
        field4452 = null;
        if (arg0 != -1) {
            method1849(127, (KeyEvent) null);
        }
        field4439 = (class108[][]) null;
        field4458 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z", line = 54)
    public final boolean method1851(int arg0) {
        field4457++;
        if (this.field4440 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4440.length; var3++) {
            if (!class50.field810.method1587(this.field4440[var3], 0, (byte) 97)) {
                var2 = false;
            }
        }
        if (arg0 <= 49) {
            this.method1852((byte) -79);
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lwl;", line = 87)
    public final class174 method1852(byte arg0) {
        class174[] var2 = new class174[5];
        if (arg0 >= -110) {
            method1858((class82) null, (byte) 2);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4450[var4] != -1) {
                var2[var3++] = class174.method1243(class50.field810, this.field4450[var4], 0);
            }
        }
        field4445++;
        class174 var5 = new class174(var2, var3);
        if (this.field4438 != null) {
            for (int var6 = 0; var6 < this.field4438.length; var6++) {
                var5.method1229(this.field4438[var6], this.field4447[var6]);
            }
        }
        if (this.field4460 != null) {
            for (int var7 = 0; var7 < this.field4460.length; var7++) {
                var5.method1238(this.field4460[var7], this.field4461[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z", line = 144)
    public final boolean method1853(boolean arg0) {
        field4442++;
        boolean var2 = true;
        if (arg0) {
            this.field4461 = (short[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4450[var3] != -1 && !class50.field810.method1587(this.field4450[var3], 0, (byte) 57)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 172)
    public static final void method1854(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4454++;
        class29.field399 = arg0;
        class207.field3623 = arg3;
        class200.field3443 = arg1;
        if (arg4 != 9874) {
            method1857((class81) null, -39, 64, false);
        }
        class60.field931 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIB)V", line = 187)
    public static final void method1855(int arg0, int arg1, int arg2, byte arg3) {
        field4463++;
        if (arg3 <= 103) {
            method1856(32L, (byte) -74);
        }
        class227 var4 = class215.method1531(-1, 11, arg1);
        var4.method1616(64);
        var4.field3929 = arg0;
        var4.field3923 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V", line = 215)
    public static final void method1856(long arg0, byte arg1) {
        int var3 = -65 % ((46 - arg1) / 52);
        field4446++;
        if (arg0 != 0L) {
            class61.field957.method1504(103, -1);
            class177.field3044++;
            class61.field957.method1057((byte) 43, arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lsa;IIZ)V", line = 236)
    public static final void method1857(class81 arg0, int arg1, int arg2, boolean arg3) {
        field4459++;
        if (!arg3) {
            method1849(101, (KeyEvent) null);
        }
        if (arg0.field1709 == arg1 && arg1 != -1) {
            class35 var4 = class284.method1973(arg1, false);
            int var5 = var4.field566;
            if (var5 == 1) {
                arg0.field1708 = 0;
                arg0.field1655 = 0;
                arg0.field1671 = arg2;
                arg0.field1659 = 0;
                class205.method1474(var4, class168.field2932 == arg0, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -75);
            }
            if (var5 == 2) {
                arg0.field1655 = 0;
            }
        } else if (arg1 == -1 || arg0.field1709 == -1 || class284.method1973(arg1, !arg3).field543 >= class284.method1973(arg0.field1709, false).field543) {
            arg0.field1708 = 0;
            arg0.field1722 = arg0.field1674;
            arg0.field1655 = 0;
            arg0.field1659 = 0;
            arg0.field1671 = arg2;
            arg0.field1709 = arg1;
            if (arg0.field1709 != -1) {
                class205.method1474(class284.method1973(arg0.field1709, false), class168.field2932 == arg0, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -71);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lhi;B)V", line = 284)
    public static final void method1858(class82 arg0, byte arg1) {
        int var2 = class275.method1919(arg0, false);
        field4451++;
        if (var2 != -1) {
            class90.method642(class297.field5057.field4304[var2], -116, class297.field5057.field4317[var2]);
            if (arg1 != -86) {
                method1855(104, -92, 124, (byte) -38);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)Lwl;", line = 299)
    public final class174 method1859(int arg0) {
        field4455++;
        if (this.field4440 == null) {
            return null;
        }
        class174[] var2 = new class174[this.field4440.length];
        if (arg0 >= -75) {
            return (class174) null;
        }
        for (int var3 = 0; var3 < this.field4440.length; var3++) {
            var2[var3] = class174.method1243(class50.field810, this.field4440[var3], 0);
        }
        class174 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class174(var2, var2.length);
        }
        if (this.field4438 != null) {
            for (int var5 = 0; var5 < this.field4438.length; var5++) {
                var4.method1229(this.field4438[var5], this.field4447[var5]);
            }
        }
        if (this.field4460 != null) {
            for (int var6 = 0; var6 < this.field4460.length; var6++) {
                var4.method1238(this.field4460[var6], this.field4461[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILbc;Z)V", line = 358)
    private final void method1860(int arg0, class153 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field4456++;
        if (arg0 == 1) {
            this.field4448 = arg1.method1082(-128);
        } else if (arg0 == 2) {
            int var4 = arg1.method1082(-85);
            this.field4440 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4440[var5] = arg1.method1090(false);
            }
        } else if (arg0 == 3) {
            this.field4444 = true;
        } else if (arg0 == 40) {
            int var8 = arg1.method1082(-103);
            this.field4447 = new short[var8];
            this.field4438 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4438[var9] = (short) arg1.method1090(false);
                this.field4447[var9] = (short) arg1.method1090(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method1082(-76);
            this.field4460 = new short[var6];
            this.field4461 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4460[var7] = (short) arg1.method1090(false);
                this.field4461[var7] = (short) arg1.method1090(false);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4450[arg0 - 60] = arg1.method1090(false);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 437)
    public static final void method1861(int arg0, int arg1) {
        class68.field1056.method2177(arg0, -121);
        class232.field3993.method2177(arg0, -127);
        field4443++;
        if (arg1 > -28) {
            field4464 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILbc;)V", line = 450)
    public final void method1862(int arg0, class153 arg1) {
        field4441++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method1082(-106);
            if (var3 == 0) {
                return;
            }
            this.method1860(var3, arg1, true);
        }
    }
}
