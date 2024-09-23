import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BYTDRQNR")
public class class5 {

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "I")
    private int field48 = 496;

    @OriginalMember(owner = "BYTDRQNR", name = "b", descriptor = "Z")
    private boolean field49 = false;

    @OriginalMember(owner = "BYTDRQNR", name = "f", descriptor = "I")
    public int field53 = -1;

    @OriginalMember(owner = "BYTDRQNR", name = "h", descriptor = "[I")
    public int[] field55 = new int[6];

    @OriginalMember(owner = "BYTDRQNR", name = "i", descriptor = "[I")
    public int[] field56 = new int[6];

    @OriginalMember(owner = "BYTDRQNR", name = "j", descriptor = "[I")
    public int[] field57 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "BYTDRQNR", name = "k", descriptor = "Z")
    public boolean field58 = false;

    @OriginalMember(owner = "BYTDRQNR", name = "c", descriptor = "I")
    private int field50;

    @OriginalMember(owner = "BYTDRQNR", name = "d", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "BYTDRQNR", name = "g", descriptor = "[I")
    public int[] field54;

    @OriginalMember(owner = "BYTDRQNR", name = "e", descriptor = "[LBYTDRQNR;")
    public static class5[] field52;

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "(ZLXMRRKSSB;)V")
    public static void method21(boolean arg0, class60 arg1) {
        class62 var2 = new class62(arg1.method465("idk.dat", null), 49938);
        field51 = var2.method480();
        if (field52 == null) {
            field52 = new class5[field51];
        }
        for (int var3 = 0; var3 < field51; var3++) {
            if (field52[var3] == null) {
                field52[var3] = new class5();
            }
            field52[var3].method22(var2, 168);
        }
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "(LXQPFGONL;I)V")
    public void method22(class62 arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method478();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field53 = arg0.method478();
                } else if (var4 == 2) {
                    int var5 = arg0.method478();
                    this.field54 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field54[var6] = arg0.method480();
                    }
                } else if (var4 == 3) {
                    this.field58 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field55[var4 - 40] = arg0.method480();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field56[var4 - 50] = arg0.method480();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field57[var4 - 60] = arg0.method480();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "(Z)Z")
    public boolean method23(boolean arg0) {
        if (this.field54 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0) {
            this.field50 = -145;
        }
        for (int var3 = 0; var3 < this.field54.length; var3++) {
            if (!class27.method239(this.field54[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "(I)LITSMSHJO;")
    public class27 method24(int arg0) {
        if (this.field54 == null) {
            return null;
        }
        class27[] var2 = new class27[this.field54.length];
        if (arg0 != 0) {
            this.field48 = -127;
        }
        for (int var3 = 0; var3 < this.field54.length; var3++) {
            var2[var3] = class27.method238((byte) -10, this.field54[var3]);
        }
        class27 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class27(var2, true, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field55[var5] != 0; var5++) {
            var4.method252(this.field55[var5], this.field56[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "BYTDRQNR", name = "b", descriptor = "(I)Z")
    public boolean method25(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field57[var3] != -1 && !class27.method239(this.field57[var3])) {
                var2 = false;
            }
        }
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "BYTDRQNR", name = "a", descriptor = "(B)LITSMSHJO;")
    public class27 method26(byte arg0) {
        class27[] var2 = new class27[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field57[var4] != -1) {
                var2[var3++] = class27.method238((byte) -10, this.field57[var4]);
            }
        }
        class27 var5 = new class27(var2, true, var3);
        if (arg0 != 30) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < 6 && this.field55[var7] != 0; var7++) {
            var5.method252(this.field55[var7], this.field56[var7]);
        }
        return var5;
    }

    @OriginalMember(owner = "BYTDRQNR", name = "<init>", descriptor = "()V")
    public class5() {
        if (class15.field717) {
        }
    }
}
