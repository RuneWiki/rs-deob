import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NTHXISGN")
public class class44 {

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "I")
    private int field1256 = 8;

    @OriginalMember(owner = "client!NTHXISGN", name = "d", descriptor = "I")
    public int field1259 = -1;

    @OriginalMember(owner = "client!NTHXISGN", name = "f", descriptor = "[I")
    public int[] field1261 = new int[6];

    @OriginalMember(owner = "client!NTHXISGN", name = "g", descriptor = "[I")
    public int[] field1262 = new int[6];

    @OriginalMember(owner = "client!NTHXISGN", name = "h", descriptor = "[I")
    public int[] field1263 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!NTHXISGN", name = "i", descriptor = "Z")
    public boolean field1264 = false;

    @OriginalMember(owner = "client!NTHXISGN", name = "b", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!NTHXISGN", name = "e", descriptor = "[I")
    public int[] field1260;

    @OriginalMember(owner = "client!NTHXISGN", name = "c", descriptor = "[LNTHXISGN;")
    public static class44[] field1258;

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method423(byte arg0, class32 arg1) {
        class59 var2 = new class59(859, arg1.method372("idk.dat", null));
        if (arg0 != -3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1257 = var2.method531();
        if (field1258 == null) {
            field1258 = new class44[field1257];
        }
        for (int var4 = 0; var4 < field1257; var4++) {
            if (field1258[var4] == null) {
                field1258[var4] = new class44();
            }
            field1258[var4].method424(var2, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public void method424(class59 arg0, byte arg1) {
        if (arg1 != 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method529();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1259 = arg0.method529();
                } else if (var4 == 2) {
                    int var5 = arg0.method529();
                    this.field1260 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1260[var6] = arg0.method531();
                    }
                } else if (var4 == 3) {
                    this.field1264 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1261[var4 - 40] = arg0.method531();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1262[var4 - 50] = arg0.method531();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1263[var4 - 60] = arg0.method531();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(B)Z")
    public boolean method425(byte arg0) {
        if (arg0 != -32) {
            this.field1256 = -333;
        }
        if (this.field1260 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1260.length; var3++) {
            if (!class45.method434(this.field1260[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(I)LOGORHYVW;")
    public class45 method426(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field1260 == null) {
            return null;
        } else {
            class45[] var2 = new class45[this.field1260.length];
            for (int var3 = 0; var3 < this.field1260.length; var3++) {
                var2[var3] = class45.method433(this.field1260[var3]);
            }
            class45 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class45(var2.length, (byte) -112, var2);
            }
            for (int var5 = 0; var5 < 6 && this.field1261[var5] != 0; var5++) {
                var4.method447(this.field1261[var5], this.field1262[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "b", descriptor = "(B)Z")
    public boolean method427(byte arg0) {
        if (arg0 != -94) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1263[var4] != -1 && !class45.method434(this.field1263[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(Z)LOGORHYVW;")
    public class45 method428(boolean arg0) {
        class45[] var2 = new class45[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1263[var4] != -1) {
                var2[var3++] = class45.method433(this.field1263[var4]);
            }
        }
        if (arg0) {
            this.field1256 = 96;
        }
        class45 var5 = new class45(var3, (byte) -112, var2);
        for (int var6 = 0; var6 < 6 && this.field1261[var6] != 0; var6++) {
            var5.method447(this.field1261[var6], this.field1262[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!NTHXISGN", name = "<init>", descriptor = "()V")
    public class44() {
        if (class67.field1688) {
        }
    }
}
