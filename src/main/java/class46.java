import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PQTOFCBD")
public class class46 {

    @OriginalMember(owner = "client!PQTOFCBD", name = "b", descriptor = "Z")
    private boolean field1324 = false;

    @OriginalMember(owner = "client!PQTOFCBD", name = "e", descriptor = "I")
    public int field1327 = -1;

    @OriginalMember(owner = "client!PQTOFCBD", name = "g", descriptor = "[I")
    public int[] field1329 = new int[6];

    @OriginalMember(owner = "client!PQTOFCBD", name = "h", descriptor = "[I")
    public int[] field1330 = new int[6];

    @OriginalMember(owner = "client!PQTOFCBD", name = "i", descriptor = "[I")
    public int[] field1331 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!PQTOFCBD", name = "j", descriptor = "Z")
    public boolean field1332 = false;

    @OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client!PQTOFCBD", name = "c", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!PQTOFCBD", name = "f", descriptor = "[I")
    public int[] field1328;

    @OriginalMember(owner = "client!PQTOFCBD", name = "d", descriptor = "[LPQTOFCBD;")
    public static class46[] field1326;

    @OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method444(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("idk.dat", null), -670);
        field1325 = var2.method388();
        if (field1326 == null) {
            field1326 = new class46[field1325];
        }
        for (int var3 = 0; var3 < field1325; var3++) {
            if (field1326[var3] == null) {
                field1326[var3] = new class46();
            }
            field1326[var3].method445(var2, 0);
        }
        if (arg1 != 24570) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public void method445(class37 arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method386();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1327 = arg0.method386();
                } else if (var3 == 2) {
                    int var4 = arg0.method386();
                    this.field1328 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1328[var5] = arg0.method388();
                    }
                } else if (var3 == 3) {
                    this.field1332 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1329[var3 - 40] = arg0.method388();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1330[var3 - 50] = arg0.method388();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1331[var3 - 60] = arg0.method388();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(I)Z")
    public boolean method446(int arg0) {
        if (arg0 != 0) {
            this.field1323 = -198;
        }
        if (this.field1328 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1328.length; var3++) {
            if (!class26.method282(this.field1328[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "b", descriptor = "(I)LIRLTEWJP;")
    public class26 method447(int arg0) {
        if (arg0 != 0) {
            this.field1324 = !this.field1324;
        }
        if (this.field1328 == null) {
            return null;
        }
        class26[] var2 = new class26[this.field1328.length];
        for (int var3 = 0; var3 < this.field1328.length; var3++) {
            var2[var3] = class26.method281(this.field1328[var3]);
        }
        class26 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class26(var2.length, 473, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1329[var5] != 0; var5++) {
            var4.method295(this.field1329[var5], this.field1330[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "c", descriptor = "(I)Z")
    public boolean method448(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1331[var4] != -1 && !class26.method282(this.field1331[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "d", descriptor = "(I)LIRLTEWJP;")
    public class26 method449(int arg0) {
        class26[] var2 = new class26[5];
        int var3 = 0;
        int var4 = 41 / arg0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1331[var5] != -1) {
                var2[var3++] = class26.method281(this.field1331[var5]);
            }
        }
        class26 var6 = new class26(var3, 473, var2);
        for (int var7 = 0; var7 < 6 && this.field1329[var7] != 0; var7++) {
            var6.method295(this.field1329[var7], this.field1330[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "client!PQTOFCBD", name = "<init>", descriptor = "()V")
    public class46() {
        if (class3.field51) {
        }
    }
}
