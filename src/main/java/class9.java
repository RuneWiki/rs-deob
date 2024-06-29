import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DOOZRHTX")
public class class9 {

    @OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "client!DOOZRHTX", name = "b", descriptor = "I")
    private int field631 = 12272;

    @OriginalMember(owner = "client!DOOZRHTX", name = "c", descriptor = "I")
    private int field632 = -34;

    @OriginalMember(owner = "client!DOOZRHTX", name = "g", descriptor = "I")
    public int field636 = -1;

    @OriginalMember(owner = "client!DOOZRHTX", name = "i", descriptor = "[I")
    public int[] field638 = new int[6];

    @OriginalMember(owner = "client!DOOZRHTX", name = "j", descriptor = "[I")
    public int[] field639 = new int[6];

    @OriginalMember(owner = "client!DOOZRHTX", name = "k", descriptor = "[I")
    public int[] field640 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!DOOZRHTX", name = "l", descriptor = "Z")
    public boolean field641 = false;

    @OriginalMember(owner = "client!DOOZRHTX", name = "d", descriptor = "Z")
    private static boolean field633 = true;

    @OriginalMember(owner = "client!DOOZRHTX", name = "e", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!DOOZRHTX", name = "h", descriptor = "[I")
    public int[] field637;

    @OriginalMember(owner = "client!DOOZRHTX", name = "f", descriptor = "[LDOOZRHTX;")
    public static class9[] field635;

    @OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method189(byte arg0, class50 arg1) {
        if (arg0 != -109) {
            field633 = !field633;
        }
        class53 var2 = new class53(arg1.method442("idk.dat", null), -631);
        field634 = var2.method470();
        if (field635 == null) {
            field635 = new class9[field634];
        }
        for (int var3 = 0; var3 < field634; var3++) {
            if (field635[var3] == null) {
                field635[var3] = new class9();
            }
            field635[var3].method190(3, var2);
        }
    }

    @OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(ILTQYMAXSO;)V")
    public void method190(int arg0, class53 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field630 = !this.field630;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method468();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field636 = arg1.method468();
                } else if (var3 == 2) {
                    int var4 = arg1.method468();
                    this.field637 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field637[var5] = arg1.method470();
                    }
                } else if (var3 == 3) {
                    this.field641 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field638[var3 - 40] = arg1.method470();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field639[var3 - 50] = arg1.method470();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field640[var3 - 60] = arg1.method470();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(I)Z")
    public boolean method191(int arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field637 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field637.length; var4++) {
            if (!class25.method247(this.field637[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!DOOZRHTX", name = "a", descriptor = "(Z)LKDWDYCIL;")
    public class25 method192(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field637 == null) {
            return null;
        }
        class25[] var3 = new class25[this.field637.length];
        for (int var4 = 0; var4 < this.field637.length; var4++) {
            var3[var4] = class25.method246(this.field637[var4]);
        }
        class25 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class25(var3, var3.length, this.field631);
        }
        for (int var6 = 0; var6 < 6 && this.field638[var6] != 0; var6++) {
            var5.method260(this.field638[var6], this.field639[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!DOOZRHTX", name = "b", descriptor = "(I)Z")
    public boolean method193(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field640[var3] != -1 && !class25.method247(this.field640[var3])) {
                var2 = false;
            }
        }
        if (arg0 != 0) {
            this.field632 = 373;
        }
        return var2;
    }

    @OriginalMember(owner = "client!DOOZRHTX", name = "c", descriptor = "(I)LKDWDYCIL;")
    public class25 method194(int arg0) {
        class25[] var2 = new class25[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field640[var4] != -1) {
                var2[var3++] = class25.method246(this.field640[var4]);
            }
        }
        class25 var5 = new class25(var2, var3, this.field631);
        for (int var6 = 0; var6 < 6 && this.field638[var6] != 0; var6++) {
            var5.method260(this.field638[var6], this.field639[var6]);
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var5;
    }
}
