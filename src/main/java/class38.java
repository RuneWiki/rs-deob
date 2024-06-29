import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class38 {

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Z")
    public boolean field755 = false;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
    private int[] field756 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public int field759 = -1;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field747 = 127;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Lia;")
    public static class257 field763 = class28.method234(102, ":duelfriend:");

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lia;")
    private static class257 field752 = class28.method234(119, " from your friend list first)3");

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "S")
    public static short field758 = 320;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
    public static int[] field762 = new int[100];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lia;")
    public static class257 field744 = field752;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "[I")
    private int[] field748;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[S")
    private short[] field745;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[S")
    private short[] field749;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "[S")
    private short[] field750;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[S")
    private short[] field761;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method305(int arg0) {
        field763 = null;
        field752 = null;
        if (arg0 != 13822) {
            field758 = -11;
        }
        field762 = null;
        field744 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
    public final boolean method306(int arg0) {
        int var2 = 19 % ((34 - arg0) / 53);
        field753++;
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field756[var4] != -1 && !class82.field1594.method1223(6, 0, this.field756[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lmj;")
    public static final class206 method307(int arg0, int arg1) {
        field746++;
        class206 var2 = (class206) class17.field370.method615(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class72.field1406.method1197(arg1 & 0x7FFF, 1, arg0 - 32770);
        } else {
            var3 = class43.field856.method1197(arg1, 1, -2);
        }
        class206 var4 = new class206();
        if (var3 != null) {
            var4.method1391((byte) 17, new class152(var3));
        }
        if (arg0 <= arg1) {
            var4.method1393(arg0 ^ 0xFFFF7FFD);
        }
        class17.field370.method619((byte) -92, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lk;B)V")
    public final void method308(class152 arg0, byte arg1) {
        field760++;
        if (arg1 > -29) {
            field752 = null;
        }
        while (true) {
            int var3 = arg0.method1051((byte) 102);
            if (var3 == 0) {
                return;
            }
            this.method309(var3, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILk;I)V")
    private final void method309(int arg0, class152 arg1, int arg2) {
        if (arg0 == 1) {
            this.field759 = arg1.method1051((byte) -84);
        } else if (arg0 == 2) {
            int var8 = arg1.method1051((byte) 115);
            this.field748 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field748[var9] = arg1.method1063(-17162);
            }
        } else if (arg0 == 3) {
            this.field755 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1051((byte) 104);
            this.field761 = new short[var6];
            this.field745 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field745[var7] = (short) arg1.method1063(-17162);
                this.field761[var7] = (short) arg1.method1063(-17162);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1051((byte) 83);
            this.field749 = new short[var4];
            this.field750 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field750[var5] = (short) arg1.method1063(-17162);
                this.field749[var5] = (short) arg1.method1063(arg2 - 17162);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field756[arg0 - 60] = arg1.method1063(-17162);
        }
        field754++;
        if (arg2 != 0) {
            this.method309(54, (class152) null, -51);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lvd;")
    public final class67 method310(int arg0) {
        class67[] var2 = new class67[5];
        field764++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field756[var4] != -1) {
                var2[var3++] = class67.method495(class82.field1594, this.field756[var4], 0);
            }
        }
        class67 var5 = new class67(var2, var3);
        if (arg0 < 66) {
            return null;
        }
        if (this.field745 != null) {
            for (int var6 = 0; var6 < this.field745.length; var6++) {
                var5.method489(this.field745[var6], this.field761[var6]);
            }
        }
        if (this.field750 != null) {
            for (int var7 = 0; var7 < this.field750.length; var7++) {
                var5.method487(this.field750[var7], this.field749[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Lvd;")
    public final class67 method312(int arg0) {
        field757++;
        if (this.field748 == null) {
            return null;
        }
        class67[] var2 = new class67[this.field748.length];
        for (int var3 = 0; var3 < this.field748.length; var3++) {
            var2[var3] = class67.method495(class82.field1594, this.field748[var3], 0);
        }
        if (arg0 != -73) {
            method307(-75, 35);
        }
        class67 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class67(var2, var2.length);
        }
        if (this.field745 != null) {
            for (int var5 = 0; var5 < this.field745.length; var5++) {
                var4.method489(this.field745[var5], this.field761[var5]);
            }
        }
        if (this.field750 != null) {
            for (int var6 = 0; var6 < this.field750.length; var6++) {
                var4.method487(this.field750[var6], this.field749[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Z")
    public final boolean method313(int arg0) {
        field751++;
        if (this.field748 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 5) {
            return false;
        }
        for (int var3 = 0; var3 < this.field748.length; var3++) {
            if (!class82.field1594.method1223(6, 0, this.field748[var3])) {
                var2 = false;
            }
        }
        return var2;
    }
}
