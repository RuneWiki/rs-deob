import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OQTGDMNX")
public class class44 {

    @OriginalMember(owner = "OQTGDMNX", name = "b", descriptor = "Z")
    private boolean field1165 = false;

    @OriginalMember(owner = "OQTGDMNX", name = "c", descriptor = "B")
    private byte field1166 = 8;

    @OriginalMember(owner = "OQTGDMNX", name = "g", descriptor = "I")
    public int field1170 = -1;

    @OriginalMember(owner = "OQTGDMNX", name = "i", descriptor = "[I")
    public int[] field1172 = new int[6];

    @OriginalMember(owner = "OQTGDMNX", name = "j", descriptor = "[I")
    public int[] field1173 = new int[6];

    @OriginalMember(owner = "OQTGDMNX", name = "k", descriptor = "[I")
    public int[] field1174 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "OQTGDMNX", name = "l", descriptor = "Z")
    public boolean field1175 = false;

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "B")
    private static byte field1164 = -27;

    @OriginalMember(owner = "OQTGDMNX", name = "d", descriptor = "I")
    private static int field1167 = -27;

    @OriginalMember(owner = "OQTGDMNX", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "OQTGDMNX", name = "h", descriptor = "[I")
    public int[] field1171;

    @OriginalMember(owner = "OQTGDMNX", name = "f", descriptor = "[LOQTGDMNX;")
    public static class44[] field1169;

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method383(int arg0, class50 arg1) {
        class68 var2 = new class68((byte) 9, arg1.method402("idk.dat", null));
        if (arg0 != 0) {
            field1167 = 264;
        }
        field1168 = var2.method536();
        if (field1169 == null) {
            field1169 = new class44[field1168];
        }
        for (int var3 = 0; var3 < field1168; var3++) {
            if (field1169[var3] == null) {
                field1169[var3] = new class44();
            }
            field1169[var3].method384(field1164, var2);
        }
    }

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public void method384(byte arg0, class68 arg1) {
        if (field1164 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method534();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1170 = arg1.method534();
                } else if (var3 == 2) {
                    int var4 = arg1.method534();
                    this.field1171 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1171[var5] = arg1.method536();
                    }
                } else if (var3 == 3) {
                    this.field1175 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1172[var3 - 40] = arg1.method536();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1173[var3 - 50] = arg1.method536();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1174[var3 - 60] = arg1.method536();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "(B)Z")
    public boolean method385(byte arg0) {
        if (this.field1166 != arg0) {
            throw new NullPointerException();
        } else if (this.field1171 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1171.length; var3++) {
                if (!class19.method251(this.field1171[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "(I)LFUTAQMCE;")
    public class19 method386(int arg0) {
        if (this.field1171 == null) {
            return null;
        }
        class19[] var2 = new class19[this.field1171.length];
        int var3 = 44 / arg0;
        for (int var4 = 0; var4 < this.field1171.length; var4++) {
            var2[var4] = class19.method250(true, this.field1171[var4]);
        }
        class19 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class19(var2.length, 221, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field1172[var6] != 0; var6++) {
            var5.method264(this.field1172[var6], this.field1173[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "OQTGDMNX", name = "a", descriptor = "(Z)Z")
    public boolean method387(boolean arg0) {
        if (!arg0) {
            this.field1165 = !this.field1165;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1174[var3] != -1 && !class19.method251(this.field1174[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "OQTGDMNX", name = "b", descriptor = "(B)LFUTAQMCE;")
    public class19 method388(byte arg0) {
        class19[] var2 = new class19[5];
        if (arg0 != 87) {
            this.field1165 = !this.field1165;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1174[var4] != -1) {
                var2[var3++] = class19.method250(true, this.field1174[var4]);
            }
        }
        class19 var5 = new class19(var3, 221, var2);
        for (int var6 = 0; var6 < 6 && this.field1172[var6] != 0; var6++) {
            var5.method264(this.field1172[var6], this.field1173[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "OQTGDMNX", name = "<init>", descriptor = "()V")
    public class44() {
        if (class47.field1218) {
        }
    }
}
