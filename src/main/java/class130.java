import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 extends class287 {

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ljava/lang/String;")
    public String field1996;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[C")
    public char[] field1995;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "[C")
    public char[] field1999;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[I")
    public int[] field1989;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    public int[] field1997;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final void method932(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field1997 != null) {
            for (int var2 = 0; var2 < this.field1997.length; var2++) {
                this.field1997[var2] = class219.method1367(this.field1997[var2], 32768);
            }
        }
        field1994++;
        if (this.field1989 != null) {
            for (int var3 = 0; var3 < this.field1989.length; var3++) {
                this.field1989[var3] = class219.method1367(this.field1989[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BC)I")
    public final int method933(byte arg0, char arg1) {
        field2001++;
        if (this.field1989 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1989.length; var3++) {
            if (this.field1995[var3] == arg1) {
                return this.field1989[var3];
            }
        }
        if (arg0 != -25) {
            this.field1999 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)[B")
    public static final byte[] method934(byte[] arg0, byte arg1) {
        field1992++;
        int var2 = arg0.length;
        int var3 = 75 / ((arg1 - 31) / 50);
        byte[] var4 = new byte[var2];
        class57.method372(arg0, 0, var4, 0, var2);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IC)I")
    public final int method935(int arg0, char arg1) {
        field1993++;
        if (this.field1997 == null) {
            return -1;
        }
        for (int var3 = arg0; var3 < this.field1997.length; var3++) {
            if (this.field1999[var3] == arg1) {
                return this.field1997[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 30) {
            field2000++;
            class382 var4 = class119.field1860[arg2][arg0];
            class9.method65(arg1, var4 == null ? class366.field5257 : var4, 28571);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLsv;I)V")
    private final void method937(byte arg0, class319 arg1, int arg2) {
        field1991++;
        if (arg2 == 1) {
            this.field1996 = arg1.method1871(104);
        } else if (arg2 == 2) {
            int var4 = arg1.method1869(-95);
            this.field1989 = new int[var4];
            this.field1995 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1989[var5] = arg1.method1844(-117);
                byte var6 = arg1.method1894(-2018);
                this.field1995[var5] = var6 == 0 ? 0 : class294.method1703(var6, -833419040);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1869(-126);
            this.field1997 = new int[var7];
            this.field1999 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1997[var8] = arg1.method1844(-125);
                byte var9 = arg1.method1894(-2018);
                this.field1999[var8] = var9 == 0 ? 0 : class294.method1703(var9, -833419040);
            }
        }
        if (arg0 >= -35) {
            this.method932(false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILdk;B)Lkt;")
    public static final class61 method938(int arg0, int arg1, class421 arg2, byte arg3) {
        field1990++;
        byte[] var4 = arg2.method2512(arg0, (byte) -93, arg1);
        if (arg3 != 32) {
            method934(null, (byte) 27);
        }
        return var4 == null ? null : new class61(var4);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLsv;)V")
    public final void method939(byte arg0, class319 arg1) {
        field1998++;
        while (true) {
            int var3 = arg1.method1869(-89);
            if (var3 == 0) {
                if (arg0 > -88) {
                    this.method937((byte) -80, null, -4);
                    return;
                } else {
                    return;
                }
            }
            this.method937((byte) -45, arg1, var3);
        }
    }
}
