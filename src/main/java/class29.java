import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IDSYSMIG")
public class class29 {

    @OriginalMember(owner = "IDSYSMIG", name = "a", descriptor = "I")
    private int field1049 = -4942;

    @OriginalMember(owner = "IDSYSMIG", name = "e", descriptor = "I")
    public int field1053 = -1;

    @OriginalMember(owner = "IDSYSMIG", name = "g", descriptor = "[I")
    public int[] field1055 = new int[6];

    @OriginalMember(owner = "IDSYSMIG", name = "h", descriptor = "[I")
    public int[] field1056 = new int[6];

    @OriginalMember(owner = "IDSYSMIG", name = "i", descriptor = "[I")
    public int[] field1057 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "IDSYSMIG", name = "j", descriptor = "Z")
    public boolean field1058 = false;

    @OriginalMember(owner = "IDSYSMIG", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "IDSYSMIG", name = "b", descriptor = "Z")
    private static boolean field1050;

    @OriginalMember(owner = "IDSYSMIG", name = "f", descriptor = "[I")
    public int[] field1054;

    @OriginalMember(owner = "IDSYSMIG", name = "d", descriptor = "[LIDSYSMIG;")
    public static class29[] field1052;

    @OriginalMember(owner = "IDSYSMIG", name = "a", descriptor = "(ZLEAXVDNXA;)V")
    public static void method382(boolean arg0, class12 arg1) {
        if (!arg0) {
            field1050 = !field1050;
        }
        class5 var2 = new class5(2, arg1.method255("idk.dat", null));
        field1051 = var2.method46();
        if (field1052 == null) {
            field1052 = new class29[field1051];
        }
        for (int var3 = 0; var3 < field1051; var3++) {
            if (field1052[var3] == null) {
                field1052[var3] = new class29();
            }
            field1052[var3].method383((byte) -18, var2);
        }
    }

    @OriginalMember(owner = "IDSYSMIG", name = "a", descriptor = "(BLCKBTFRZM;)V")
    public void method383(byte arg0, class5 arg1) {
        if (arg0 != -18) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method44();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1053 = arg1.method44();
                } else if (var4 == 2) {
                    int var5 = arg1.method44();
                    this.field1054 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1054[var6] = arg1.method46();
                    }
                } else if (var4 == 3) {
                    this.field1058 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1055[var4 - 40] = arg1.method46();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1056[var4 - 50] = arg1.method46();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1057[var4 - 60] = arg1.method46();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "IDSYSMIG", name = "a", descriptor = "(I)Z")
    public boolean method384(int arg0) {
        if (this.field1054 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1054.length; var3++) {
            if (!class21.method342(this.field1054[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "IDSYSMIG", name = "b", descriptor = "(I)LGFYXEFQY;")
    public class21 method385(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field1054 == null) {
            return null;
        } else {
            class21[] var2 = new class21[this.field1054.length];
            for (int var3 = 0; var3 < this.field1054.length; var3++) {
                var2[var3] = class21.method341((byte) 7, this.field1054[var3]);
            }
            class21 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class21(var2, 3729, var2.length);
            }
            for (int var5 = 0; var5 < 6 && this.field1055[var5] != 0; var5++) {
                var4.method355(this.field1055[var5], this.field1056[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "IDSYSMIG", name = "a", descriptor = "(B)Z")
    public boolean method386(byte arg0) {
        boolean var2 = true;
        if (arg0 != -45) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1057[var4] != -1 && !class21.method342(this.field1057[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "IDSYSMIG", name = "b", descriptor = "(B)LGFYXEFQY;")
    public class21 method387(byte arg0) {
        if (arg0 != -87) {
            this.field1049 = 444;
        }
        class21[] var2 = new class21[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1057[var4] != -1) {
                var2[var3++] = class21.method341((byte) 7, this.field1057[var4]);
            }
        }
        class21 var5 = new class21(var2, 3729, var3);
        for (int var6 = 0; var6 < 6 && this.field1055[var6] != 0; var6++) {
            var5.method355(this.field1055[var6], this.field1056[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "IDSYSMIG", name = "<init>", descriptor = "()V")
    public class29() {
        if (class45.field1265) {
        }
    }
}
