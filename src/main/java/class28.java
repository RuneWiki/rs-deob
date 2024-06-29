import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class5 {

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Z")
    public boolean field491 = false;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "[I")
    private int[] field504 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
    public int field512 = -1;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Led;")
    private static class43 field501 = class191.method1219("yellow:", false);

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[I")
    public static int[] field499 = new int[5];

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Led;")
    public static class43 field494 = field501;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Led;")
    private static class43 field506 = class191.method1219("Select", false);

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "Led;")
    public static class43 field500 = class191.method1219("0(U", false);

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Z")
    public static volatile boolean field496 = true;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Led;")
    public static class43 field509 = field506;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Led;")
    public static class43 field498 = field501;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Led;")
    public static class43 field493 = class191.method1219("Verbindung mit Update)2Server)3)3)3", false);

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "[S")
    private short[] field502;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "[S")
    private short[] field507;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "[S")
    private short[] field508;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "[S")
    private short[] field514;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z")
    public final boolean method132(byte arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field504[var3] != -1 && !class200.field3934.method350(this.field504[var3], 0, false)) {
                var2 = false;
            }
        }
        field492++;
        if (arg0 > -37) {
            return false;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public static void method133(byte arg0) {
        field501 = null;
        field498 = null;
        field509 = null;
        field499 = null;
        field493 = null;
        int var1 = 95 % ((arg0 - 90) / 33);
        field500 = null;
        field494 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Lsf;")
    public final class169 method134(byte arg0) {
        if (arg0 != 122) {
            return null;
        }
        field497++;
        int var2 = 0;
        class169[] var3 = new class169[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field504[var4] != -1) {
                var3[var2++] = class169.method1076(class200.field3934, this.field504[var4], 0);
            }
        }
        class169 var5 = new class169(var3, var2);
        if (this.field502 != null) {
            for (int var6 = 0; var6 < this.field502.length; var6++) {
                var5.method1059(this.field502[var6], this.field508[var6]);
            }
        }
        if (this.field514 != null) {
            for (int var7 = 0; var7 < this.field514.length; var7++) {
                var5.method1069(this.field514[var7], this.field507[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLjg;)V")
    public final void method135(boolean arg0, class89 arg1) {
        if (!arg0) {
            return;
        }
        field503++;
        while (true) {
            int var3 = arg1.method538((byte) 109);
            if (var3 == 0) {
                return;
            }
            this.method137(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z")
    public final boolean method136(int arg0) {
        field495++;
        if (arg0 != 5497) {
            this.method132((byte) 68);
        }
        if (this.field511 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field511.length; var3++) {
            if (!class200.field3934.method350(this.field511[var3], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljg;IZ)V")
    private final void method137(class89 arg0, int arg1, boolean arg2) {
        field505++;
        if (arg2) {
            method133((byte) -34);
        }
        if (arg1 == 1) {
            this.field512 = arg0.method538((byte) -55);
        } else if (arg1 == 2) {
            int var4 = arg0.method538((byte) -114);
            this.field511 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field511[var5] = arg0.method555(-1113627096);
            }
        } else if (arg1 == 3) {
            this.field491 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method538((byte) -109);
            this.field508 = new short[var6];
            this.field502 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field502[var7] = (short) arg0.method555(-1113627096);
                this.field508[var7] = (short) arg0.method555(-1113627096);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method538((byte) -113);
            this.field507 = new short[var8];
            this.field514 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field514[var9] = (short) arg0.method555(-1113627096);
                this.field507[var9] = (short) arg0.method555(-1113627096);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field504[arg1 - 60] = arg0.method555(-1113627096);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)Lsf;")
    public final class169 method138(int arg0) {
        field513++;
        if (this.field511 == null) {
            return null;
        }
        class169[] var2 = new class169[this.field511.length];
        for (int var3 = 0; var3 < this.field511.length; var3++) {
            var2[var3] = class169.method1076(class200.field3934, this.field511[var3], 0);
        }
        int var4 = -69 % ((20 - arg0) / 53);
        class169 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class169(var2, var2.length);
        }
        if (this.field502 != null) {
            for (int var6 = 0; var6 < this.field502.length; var6++) {
                var5.method1059(this.field502[var6], this.field508[var6]);
            }
        }
        if (this.field514 != null) {
            for (int var7 = 0; var7 < this.field514.length; var7++) {
                var5.method1069(this.field514[var7], this.field507[var7]);
            }
        }
        return var5;
    }
}
