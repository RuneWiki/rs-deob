import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class272 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    private int[] field4452 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field4460 = -1;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Z")
    public boolean field4456 = false;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
    public static boolean field4462 = true;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4469 = " from your ignore list first.";

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4470 = -1;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "F")
    public static float field4455;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    public static int[] field4457;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    private int[] field4466;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[S")
    private short[] field4451;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[S")
    private short[] field4461;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[S")
    private short[] field4468;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[S")
    private short[] field4471;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
    public final boolean method1865(boolean arg0) {
        field4459++;
        if (this.field4466 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field4466.length; var3++) {
            if (!class22.field295.method1898(this.field4466[var3], 0, true)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Lgl;")
    public final class228 method1866(boolean arg0) {
        field4472++;
        if (this.field4466 == null) {
            return null;
        }
        class228[] var2 = new class228[this.field4466.length];
        if (arg0) {
            this.method1871((class202) null, 45, 9);
        }
        for (int var3 = 0; var3 < this.field4466.length; var3++) {
            var2[var3] = class228.method1590(class22.field295, this.field4466[var3], 0);
        }
        class228 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class228(var2, var2.length);
        }
        if (this.field4468 != null) {
            for (int var5 = 0; var5 < this.field4468.length; var5++) {
                var4.method1611(this.field4468[var5], this.field4471[var5]);
            }
        }
        if (this.field4461 != null) {
            for (int var6 = 0; var6 < this.field4461.length; var6++) {
                var4.method1607(this.field4461[var6], this.field4451[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1867(int arg0) {
        int var1 = 52 % ((28 - arg0) / 44);
        field4469 = null;
        field4457 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1868(int arg0) {
        class148.method982();
        field4464++;
        for (int var1 = 0; var1 < 4; var1++) {
            class183.field2841[var1].method943(121);
        }
        int var2 = -72 / ((arg0 + 53) / 63);
        System.gc();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lgl;")
    public final class228 method1869(byte arg0) {
        class228[] var2 = new class228[5];
        field4450++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4452[var4] != -1) {
                var2[var3++] = class228.method1590(class22.field295, this.field4452[var4], 0);
            }
        }
        if (arg0 != -41) {
            this.field4460 = 112;
        }
        class228 var5 = new class228(var2, var3);
        if (this.field4468 != null) {
            for (int var6 = 0; var6 < this.field4468.length; var6++) {
                var5.method1611(this.field4468[var6], this.field4471[var6]);
            }
        }
        if (this.field4461 != null) {
            for (int var7 = 0; var7 < this.field4461.length; var7++) {
                var5.method1607(this.field4461[var7], this.field4451[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1870(int arg0, int arg1) {
        if (arg0 != 2272) {
            method1868(-79);
        }
        field4454++;
        class36 var2 = class161.method1067(1, arg1, (byte) 81);
        var2.method220(124);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lma;II)V")
    private final void method1871(class202 arg0, int arg1, int arg2) {
        field4458++;
        if (arg1 == 1) {
            this.field4460 = arg0.method1420((byte) 0);
        } else if (arg1 == 2) {
            int var4 = arg0.method1420((byte) 0);
            this.field4466 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4466[var5] = arg0.method1419(109);
            }
        } else if (arg1 == 3) {
            this.field4456 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1420((byte) 0);
            this.field4471 = new short[var6];
            this.field4468 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4468[var7] = (short) arg0.method1419(class93.method605(arg2, -80));
                this.field4471[var7] = (short) arg0.method1419(71);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method1420((byte) 0);
            this.field4461 = new short[var8];
            this.field4451 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4461[var9] = (short) arg0.method1419(arg2 + 72);
                this.field4451[var9] = (short) arg0.method1419(class93.method605(arg2, -72));
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field4452[arg1 - 60] = arg0.method1419(class93.method605(arg2, -70));
        }
        if (arg2 != -1) {
            this.method1872(-10, (class202) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILma;)V")
    public final void method1872(int arg0, class202 arg1) {
        field4467++;
        while (true) {
            int var3 = arg1.method1420((byte) 0);
            if (var3 == 0) {
                int var4 = -118 / ((arg0 + 76) / 47);
                return;
            }
            this.method1871(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
    public final boolean method1873(int arg0) {
        boolean var2 = true;
        if (arg0 != 10889) {
            method1870(-37, -122);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4452[var3] != -1 && !class22.field295.method1898(this.field4452[var3], 0, true)) {
                var2 = false;
            }
        }
        field4463++;
        return var2;
    }
}
