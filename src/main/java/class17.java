import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FAQFGVMF")
public class class17 {

    @OriginalMember(owner = "FAQFGVMF", name = "b", descriptor = "I")
    private int field839 = 6;

    @OriginalMember(owner = "FAQFGVMF", name = "c", descriptor = "B")
    private byte field840 = 6;

    @OriginalMember(owner = "FAQFGVMF", name = "d", descriptor = "Z")
    private boolean field841 = true;

    @OriginalMember(owner = "FAQFGVMF", name = "e", descriptor = "Z")
    private boolean field842 = false;

    @OriginalMember(owner = "FAQFGVMF", name = "h", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "FAQFGVMF", name = "j", descriptor = "[I")
    public int[] field847 = new int[6];

    @OriginalMember(owner = "FAQFGVMF", name = "k", descriptor = "[I")
    public int[] field848 = new int[6];

    @OriginalMember(owner = "FAQFGVMF", name = "l", descriptor = "[I")
    public int[] field849 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "FAQFGVMF", name = "m", descriptor = "Z")
    public boolean field850 = false;

    @OriginalMember(owner = "FAQFGVMF", name = "a", descriptor = "I")
    private static int field838 = -302;

    @OriginalMember(owner = "FAQFGVMF", name = "f", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "FAQFGVMF", name = "i", descriptor = "[I")
    public int[] field846;

    @OriginalMember(owner = "FAQFGVMF", name = "g", descriptor = "[LFAQFGVMF;")
    public static class17[] field844;

    @OriginalMember(owner = "FAQFGVMF", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method215(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("idk.dat", null), field838);
        if (arg1 != 0) {
            return;
        }
        field843 = var2.method549();
        if (field844 == null) {
            field844 = new class17[field843];
        }
        for (int var3 = 0; var3 < field843; var3++) {
            if (field844[var3] == null) {
                field844[var3] = new class17();
            }
            field844[var3].method216(var2, (byte) 5);
        }
    }

    @OriginalMember(owner = "FAQFGVMF", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public void method216(class69 arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var3 = false;
        } else {
            this.field842 = !this.field842;
        }
        while (true) {
            while (true) {
                int var4 = arg0.method547();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field845 = arg0.method547();
                } else if (var4 == 2) {
                    int var5 = arg0.method547();
                    this.field846 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field846[var6] = arg0.method549();
                    }
                } else if (var4 == 3) {
                    this.field850 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field847[var4 - 40] = arg0.method549();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field848[var4 - 50] = arg0.method549();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field849[var4 - 60] = arg0.method549();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "FAQFGVMF", name = "a", descriptor = "(B)Z")
    public boolean method217(byte arg0) {
        if (this.field840 == arg0) {
            boolean var2 = false;
        } else {
            this.field839 = 136;
        }
        if (this.field846 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field846.length; var4++) {
            if (!class4.method12(this.field846[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "FAQFGVMF", name = "a", descriptor = "(I)LCCYECDYX;")
    public class4 method218(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field846 == null) {
            return null;
        } else {
            class4[] var2 = new class4[this.field846.length];
            for (int var3 = 0; var3 < this.field846.length; var3++) {
                var2[var3] = class4.method11(this.field846[var3], -142);
            }
            class4 var4;
            if (var2.length == 1) {
                var4 = var2[0];
            } else {
                var4 = new class4(var2, 990, var2.length);
            }
            for (int var5 = 0; var5 < 6 && this.field847[var5] != 0; var5++) {
                var4.method25(this.field847[var5], this.field848[var5]);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "FAQFGVMF", name = "b", descriptor = "(I)Z")
    public boolean method219(int arg0) {
        boolean var2 = true;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field849[var3] != -1 && !class4.method12(this.field849[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "FAQFGVMF", name = "b", descriptor = "(B)LCCYECDYX;")
    public class4 method220(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field841 = !this.field841;
        }
        class4[] var3 = new class4[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field849[var5] != -1) {
                var3[var4++] = class4.method11(this.field849[var5], -142);
            }
        }
        class4 var6 = new class4(var3, 990, var4);
        for (int var7 = 0; var7 < 6 && this.field847[var7] != 0; var7++) {
            var6.method25(this.field847[var7], this.field848[var7]);
        }
        return var6;
    }
}
