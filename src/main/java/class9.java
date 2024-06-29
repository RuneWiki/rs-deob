import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CFPLMOQH")
public class class9 {

    @OriginalMember(owner = "client!CFPLMOQH", name = "b", descriptor = "I")
    private int field110 = 980;

    @OriginalMember(owner = "client!CFPLMOQH", name = "c", descriptor = "Z")
    private boolean field111 = true;

    @OriginalMember(owner = "client!CFPLMOQH", name = "g", descriptor = "I")
    public int field115 = -1;

    @OriginalMember(owner = "client!CFPLMOQH", name = "i", descriptor = "[I")
    public int[] field117 = new int[6];

    @OriginalMember(owner = "client!CFPLMOQH", name = "j", descriptor = "[I")
    public int[] field118 = new int[6];

    @OriginalMember(owner = "client!CFPLMOQH", name = "k", descriptor = "[I")
    public int[] field119 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!CFPLMOQH", name = "l", descriptor = "Z")
    public boolean field120 = false;

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "I")
    private static int field109 = 536;

    @OriginalMember(owner = "client!CFPLMOQH", name = "d", descriptor = "I")
    private static int field112 = 3;

    @OriginalMember(owner = "client!CFPLMOQH", name = "e", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!CFPLMOQH", name = "h", descriptor = "[I")
    public int[] field116;

    @OriginalMember(owner = "client!CFPLMOQH", name = "f", descriptor = "[LCFPLMOQH;")
    public static class9[] field114;

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method29(int arg0, class59 arg1) {
        if (arg0 < field112 || arg0 > field112) {
            return;
        }
        class10 var2 = new class10(arg1.method545("idk.dat", null), field109);
        field113 = var2.method196();
        if (field114 == null) {
            field114 = new class9[field113];
        }
        for (int var3 = 0; var3 < field113; var3++) {
            if (field114[var3] == null) {
                field114[var3] = new class9();
            }
            field114[var3].method30(var2, -593);
        }
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public void method30(class10 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method194();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field115 = arg0.method194();
                } else if (var4 == 2) {
                    int var5 = arg0.method194();
                    this.field116 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field116[var6] = arg0.method196();
                    }
                } else if (var4 == 3) {
                    this.field120 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field117[var4 - 40] = arg0.method196();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field118[var4 - 50] = arg0.method196();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field119[var4 - 60] = arg0.method196();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(Z)Z")
    public boolean method31(boolean arg0) {
        if (this.field116 == null) {
            return true;
        }
        boolean var2 = true;
        if (!arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field116.length; var3++) {
            if (!class16.method261(this.field116[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "b", descriptor = "(Z)LGCSAWSJV;")
    public class16 method32(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field116 == null) {
            return null;
        } else {
            class16[] var2 = new class16[this.field116.length];
            for (int var3 = 0; var3 < this.field116.length; var3++) {
                var2[var3] = class16.method260(this.field116[var3]);
            }
            class16 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class16(var2, var2.length, this.field111);
            }
            for (int var5 = 0; var5 < 6 && this.field117[var5] != 0; var5++) {
                var4.method274(this.field117[var5], this.field118[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(B)Z")
    public boolean method33(byte arg0) {
        boolean var2 = true;
        if (arg0 != -60) {
            this.field111 = !this.field111;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field119[var3] != -1 && !class16.method261(this.field119[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(I)LGCSAWSJV;")
    public class16 method34(int arg0) {
        class16[] var2 = new class16[5];
        int var3 = 0;
        if (arg0 != 2) {
            this.field110 = -44;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field119[var4] != -1) {
                var2[var3++] = class16.method260(this.field119[var4]);
            }
        }
        class16 var5 = new class16(var2, var3, this.field111);
        for (int var6 = 0; var6 < 6 && this.field117[var6] != 0; var6++) {
            var5.method274(this.field117[var6], this.field118[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!CFPLMOQH", name = "<init>", descriptor = "()V")
    public class9() {
        if (class1.field4) {
        }
    }
}
