import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PTKBILNJ")
public class class46 {

    @OriginalMember(owner = "PTKBILNJ", name = "b", descriptor = "B")
    private byte field1218 = 96;

    @OriginalMember(owner = "PTKBILNJ", name = "c", descriptor = "Z")
    private boolean field1219 = true;

    @OriginalMember(owner = "PTKBILNJ", name = "e", descriptor = "I")
    private int field1221 = -47097;

    @OriginalMember(owner = "PTKBILNJ", name = "h", descriptor = "I")
    public int field1224 = -1;

    @OriginalMember(owner = "PTKBILNJ", name = "j", descriptor = "[I")
    public int[] field1226 = new int[6];

    @OriginalMember(owner = "PTKBILNJ", name = "k", descriptor = "[I")
    public int[] field1227 = new int[6];

    @OriginalMember(owner = "PTKBILNJ", name = "l", descriptor = "[I")
    public int[] field1228 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "PTKBILNJ", name = "m", descriptor = "Z")
    public boolean field1229 = false;

    @OriginalMember(owner = "PTKBILNJ", name = "a", descriptor = "Z")
    private static boolean field1217 = true;

    @OriginalMember(owner = "PTKBILNJ", name = "d", descriptor = "Z")
    private static boolean field1220 = true;

    @OriginalMember(owner = "PTKBILNJ", name = "f", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "PTKBILNJ", name = "i", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "PTKBILNJ", name = "g", descriptor = "[LPTKBILNJ;")
    public static class46[] field1223;

    @OriginalMember(owner = "PTKBILNJ", name = "a", descriptor = "(ILTXPLZUUI;)V")
    public static void method436(int arg0, class60 arg1) {
        if (arg0 < 3 || arg0 > 3) {
            field1220 = !field1220;
        }
        class43 var2 = new class43(arg1.method506("idk.dat", null), 0);
        field1222 = var2.method332();
        if (field1223 == null) {
            field1223 = new class46[field1222];
        }
        for (int var3 = 0; var3 < field1222; var3++) {
            if (field1223[var3] == null) {
                field1223[var3] = new class46();
            }
            field1223[var3].method437(var2, field1217);
        }
    }

    @OriginalMember(owner = "PTKBILNJ", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public void method437(class43 arg0, boolean arg1) {
        if (!arg1) {
            this.field1219 = !this.field1219;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method330();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1224 = arg0.method330();
                } else if (var3 == 2) {
                    int var4 = arg0.method330();
                    this.field1225 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1225[var5] = arg0.method332();
                    }
                } else if (var3 == 3) {
                    this.field1229 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1226[var3 - 40] = arg0.method332();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1227[var3 - 50] = arg0.method332();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1228[var3 - 60] = arg0.method332();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "PTKBILNJ", name = "a", descriptor = "(B)Z")
    public boolean method438(byte arg0) {
        if (this.field1225 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -91) {
            this.field1221 = -253;
        }
        for (int var3 = 0; var3 < this.field1225.length; var3++) {
            if (!class45.method411(this.field1225[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "PTKBILNJ", name = "a", descriptor = "(I)LPSGMMDJS;")
    public class45 method439(int arg0) {
        if (this.field1225 == null) {
            return null;
        }
        class45[] var2 = new class45[this.field1225.length];
        if (arg0 < 8 || arg0 > 8) {
            field1220 = !field1220;
        }
        for (int var3 = 0; var3 < this.field1225.length; var3++) {
            var2[var3] = class45.method410(this.field1225[var3]);
        }
        class45 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class45(8111, var2.length, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1226[var5] != 0; var5++) {
            var4.method424(this.field1226[var5], this.field1227[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "PTKBILNJ", name = "b", descriptor = "(I)Z")
    public boolean method440(int arg0) {
        boolean var2 = true;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1228[var3] != -1 && !class45.method411(this.field1228[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "PTKBILNJ", name = "b", descriptor = "(B)LPSGMMDJS;")
    public class45 method441(byte arg0) {
        class45[] var2 = new class45[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1228[var4] != -1) {
                var2[var3++] = class45.method410(this.field1228[var4]);
            }
        }
        class45 var5 = new class45(8111, var3, var2);
        if (this.field1218 != arg0) {
            throw new NullPointerException();
        }
        for (int var6 = 0; var6 < 6 && this.field1226[var6] != 0; var6++) {
            var5.method424(this.field1226[var6], this.field1227[var6]);
        }
        return var5;
    }
}
