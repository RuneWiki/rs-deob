import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TMMXBYBU")
public class class54 {

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "Z")
    private boolean field1250 = false;

    @OriginalMember(owner = "client!TMMXBYBU", name = "d", descriptor = "I")
    public int field1253 = -1;

    @OriginalMember(owner = "client!TMMXBYBU", name = "f", descriptor = "[I")
    public int[] field1255 = new int[6];

    @OriginalMember(owner = "client!TMMXBYBU", name = "g", descriptor = "[I")
    public int[] field1256 = new int[6];

    @OriginalMember(owner = "client!TMMXBYBU", name = "h", descriptor = "[I")
    public int[] field1257 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!TMMXBYBU", name = "i", descriptor = "Z")
    public boolean field1258 = false;

    @OriginalMember(owner = "client!TMMXBYBU", name = "b", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!TMMXBYBU", name = "e", descriptor = "[I")
    public int[] field1254;

    @OriginalMember(owner = "client!TMMXBYBU", name = "c", descriptor = "[LTMMXBYBU;")
    public static class54[] field1252;

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(LRSPRYUFS;I)V")
    public static void method450(class49 arg0, int arg1) {
        if (arg1 >= 0) {
            return;
        }
        class36 var2 = new class36(-587, arg0.method427("idk.dat", null));
        field1251 = var2.method341();
        if (field1252 == null) {
            field1252 = new class54[field1251];
        }
        for (int var3 = 0; var3 < field1251; var3++) {
            if (field1252[var3] == null) {
                field1252[var3] = new class54();
            }
            field1252[var3].method451((byte) 6, var2);
        }
    }

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(BLNQUAUMDT;)V")
    public void method451(byte arg0, class36 arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method339();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1253 = arg1.method339();
                } else if (var4 == 2) {
                    int var5 = arg1.method339();
                    this.field1254 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1254[var6] = arg1.method341();
                    }
                } else if (var4 == 3) {
                    this.field1258 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1255[var4 - 40] = arg1.method341();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1256[var4 - 50] = arg1.method341();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1257[var4 - 60] = arg1.method341();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(B)Z")
    public boolean method452(byte arg0) {
        if (this.field1254 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -64) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1254.length; var3++) {
            if (!class22.method213(this.field1254[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(Z)LJUQSYEMB;")
    public class22 method453(boolean arg0) {
        if (this.field1254 == null) {
            return null;
        }
        class22[] var2 = new class22[this.field1254.length];
        for (int var3 = 0; var3 < this.field1254.length; var3++) {
            var2[var3] = class22.method212(this.field1254[var3]);
        }
        class22 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class22(var2.length, 6, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1255[var5] != 0; var5++) {
            var4.method226(this.field1255[var5], this.field1256[var5]);
        }
        if (arg0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!TMMXBYBU", name = "a", descriptor = "(I)Z")
    public boolean method454(int arg0) {
        if (arg0 <= 0) {
            this.field1250 = !this.field1250;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1257[var3] != -1 && !class22.method213(this.field1257[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!TMMXBYBU", name = "b", descriptor = "(B)LJUQSYEMB;")
    public class22 method455(byte arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        class22[] var3 = new class22[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1257[var5] != -1) {
                var3[var4++] = class22.method212(this.field1257[var5]);
            }
        }
        class22 var6 = new class22(var4, 6, var3);
        for (int var7 = 0; var7 < 6 && this.field1255[var7] != 0; var7++) {
            var6.method226(this.field1255[var7], this.field1256[var7]);
        }
        return var6;
    }
}
