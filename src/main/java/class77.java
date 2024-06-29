import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class77 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Z")
    public boolean field915 = false;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public int field925 = -1;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[I")
    private int[] field920 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public static int[] field924 = new int[50];

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Ltb;")
    public static class185 field923;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "Lbc;")
    public static class282 field932;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[S")
    private short[] field914;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[S")
    private short[] field916;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "[S")
    private short[] field919;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[S")
    private short[] field926;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Li;")
    public final class113 method467(int arg0) {
        class113[] var2 = new class113[5];
        int var3 = arg0;
        field921++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field920[var4] != -1) {
                var2[var3++] = class113.method719(class116.field1619, this.field920[var4], 0);
            }
        }
        class113 var5 = new class113(var2, var3);
        if (this.field914 != null) {
            for (int var6 = 0; var6 < this.field914.length; var6++) {
                var5.method713(this.field914[var6], this.field919[var6]);
            }
        }
        if (this.field926 != null) {
            for (int var7 = 0; var7 < this.field926.length; var7++) {
                var5.method724(this.field926[var7], this.field916[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIILca;JZ)V")
    public static final void method468(int arg0, int arg1, int arg2, int arg3, class131 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class50 var8 = new class50();
        var8.field568 = arg4;
        var8.field570 = arg1 * 128 + 64;
        var8.field574 = arg2 * 128 + 64;
        var8.field576 = arg3;
        var8.field575 = arg5;
        if (class6.field94[arg0][arg1][arg2] == null) {
            class6.field94[arg0][arg1][arg2] = new class133(arg0, arg1, arg2);
        }
        class6.field94[arg0][arg1][arg2].field1917 = var8;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)Z")
    public final boolean method469(byte arg0) {
        field917++;
        if (this.field918 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 >= -33) {
            return false;
        }
        while (this.field918.length > var3) {
            if (!class116.field1619.method1870((byte) -86, this.field918[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)Z")
    public final boolean method470(int arg0) {
        field931++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field920[var3] != -1 && !class116.field1619.method1870((byte) -86, this.field920[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public static void method471(int arg0) {
        field924 = null;
        field923 = null;
        if (arg0 != -1083) {
            method468(70, 92, -28, 2, (class131) null, -122L, false);
        }
        field932 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Li;")
    public final class113 method472(byte arg0) {
        field922++;
        if (this.field918 == null) {
            return null;
        }
        class113[] var2 = new class113[this.field918.length];
        if (arg0 <= 58) {
            return null;
        }
        for (int var3 = 0; var3 < this.field918.length; var3++) {
            var2[var3] = class113.method719(class116.field1619, this.field918[var3], 0);
        }
        class113 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class113(var2, var2.length);
        }
        if (this.field914 != null) {
            for (int var5 = 0; var5 < this.field914.length; var5++) {
                var4.method713(this.field914[var5], this.field919[var5]);
            }
        }
        if (this.field926 != null) {
            for (int var6 = 0; var6 < this.field926.length; var6++) {
                var4.method724(this.field926[var6], this.field916[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lqi;I)V")
    public final void method473(class216 arg0, int arg1) {
        if (arg1 < 2) {
            this.method474(93, (class216) null, 41);
        }
        while (true) {
            int var3 = arg0.method1407(112);
            if (var3 == 0) {
                field913++;
                return;
            }
            this.method474(var3, arg0, -6);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILqi;I)V")
    private final void method474(int arg0, class216 arg1, int arg2) {
        if (arg2 != -6) {
            return;
        }
        if (arg0 == 1) {
            this.field925 = arg1.method1407(111);
        } else if (arg0 == 2) {
            int var4 = arg1.method1407(123);
            this.field918 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field918[var5] = arg1.method1380(true);
            }
        } else if (arg0 == 3) {
            this.field915 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1407(arg2 ^ 0xFFFFFF88);
            this.field914 = new short[var6];
            this.field919 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field914[var7] = (short) arg1.method1380(true);
                this.field919[var7] = (short) arg1.method1380(true);
            }
        } else if (arg0 == 41) {
            int var8 = arg1.method1407(127);
            this.field926 = new short[var8];
            this.field916 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field926[var9] = (short) arg1.method1380(true);
                this.field916[var9] = (short) arg1.method1380(true);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field920[arg0 - 60] = arg1.method1380(true);
        }
        field929++;
    }
}
