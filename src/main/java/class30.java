import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LNSFKVMU")
public class class30 {

    @OriginalMember(owner = "LNSFKVMU", name = "a", descriptor = "I")
    private int field874 = -261;

    @OriginalMember(owner = "LNSFKVMU", name = "b", descriptor = "Z")
    private boolean field875 = false;

    @OriginalMember(owner = "LNSFKVMU", name = "c", descriptor = "I")
    private int field876 = -548;

    @OriginalMember(owner = "LNSFKVMU", name = "d", descriptor = "I")
    private int field877 = 9;

    @OriginalMember(owner = "LNSFKVMU", name = "e", descriptor = "I")
    private int field878 = 1;

    @OriginalMember(owner = "LNSFKVMU", name = "i", descriptor = "I")
    public int field882 = -1;

    @OriginalMember(owner = "LNSFKVMU", name = "k", descriptor = "[I")
    public int[] field884 = new int[6];

    @OriginalMember(owner = "LNSFKVMU", name = "l", descriptor = "[I")
    public int[] field885 = new int[6];

    @OriginalMember(owner = "LNSFKVMU", name = "m", descriptor = "[I")
    public int[] field886 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "LNSFKVMU", name = "n", descriptor = "Z")
    public boolean field887 = false;

    @OriginalMember(owner = "LNSFKVMU", name = "f", descriptor = "I")
    private static int field879;

    @OriginalMember(owner = "LNSFKVMU", name = "g", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "LNSFKVMU", name = "j", descriptor = "[I")
    public int[] field883;

    @OriginalMember(owner = "LNSFKVMU", name = "h", descriptor = "[LLNSFKVMU;")
    public static class30[] field881;

    @OriginalMember(owner = "LNSFKVMU", name = "a", descriptor = "(LCXFTMSCH;B)V")
    public static void method274(class8 arg0, byte arg1) {
        if (arg1 != 51) {
            field879 = 72;
        }
        class33 var2 = new class33(true, arg0.method176("idk.dat", null));
        field880 = var2.method327();
        if (field881 == null) {
            field881 = new class30[field880];
        }
        for (int var3 = 0; var3 < field880; var3++) {
            if (field881[var3] == null) {
                field881[var3] = new class30();
            }
            field881[var3].method275(var2, -261);
        }
    }

    @OriginalMember(owner = "LNSFKVMU", name = "a", descriptor = "(LMQZHAILV;I)V")
    public void method275(class33 arg0, int arg1) {
        if (arg1 >= 0) {
            this.field877 = -242;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method325();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field882 = arg0.method325();
                } else if (var3 == 2) {
                    int var4 = arg0.method325();
                    this.field883 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field883[var5] = arg0.method327();
                    }
                } else if (var3 == 3) {
                    this.field887 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field884[var3 - 40] = arg0.method327();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field885[var3 - 50] = arg0.method327();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field886[var3 - 60] = arg0.method327();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "LNSFKVMU", name = "a", descriptor = "(B)Z")
    public boolean method276(byte arg0) {
        if (this.field883 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field883.length; var3++) {
            if (!class70.method552(this.field883[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "LNSFKVMU", name = "a", descriptor = "(I)LYYHPBDED;")
    public class70 method277(int arg0) {
        if (this.field883 == null) {
            return null;
        }
        class70[] var2 = new class70[this.field883.length];
        if (arg0 <= 0) {
            this.field875 = !this.field875;
        }
        for (int var3 = 0; var3 < this.field883.length; var3++) {
            var2[var3] = class70.method551(this.field876, this.field883[var3]);
        }
        class70 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class70(var2, 0, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field884[var5] != 0; var5++) {
            var4.method565(this.field884[var5], this.field885[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "LNSFKVMU", name = "b", descriptor = "(I)Z")
    public boolean method278(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field886[var3] != -1 && !class70.method552(this.field886[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "LNSFKVMU", name = "c", descriptor = "(I)LYYHPBDED;")
    public class70 method279(int arg0) {
        if (this.field878 != arg0) {
            this.field874 = 130;
        }
        class70[] var2 = new class70[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field886[var4] != -1) {
                var2[var3++] = class70.method551(this.field876, this.field886[var4]);
            }
        }
        class70 var5 = new class70(var2, 0, var3);
        for (int var6 = 0; var6 < 6 && this.field884[var6] != 0; var6++) {
            var5.method565(this.field884[var6], this.field885[var6]);
        }
        return var5;
    }
}
