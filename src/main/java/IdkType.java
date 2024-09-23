import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class IdkType {

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public int field944 = -1;

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field946 = new int[6];

    @OriginalMember(owner = "gc", name = "h", descriptor = "[I")
    public int[] field947 = new int[6];

    @OriginalMember(owner = "gc", name = "i", descriptor = "[I")
    public int[] field948 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "gc", name = "j", descriptor = "Z")
    public boolean field949 = false;

    @OriginalMember(owner = "gc", name = "b", descriptor = "I")
    private static int field941;

    @OriginalMember(owner = "gc", name = "c", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private static boolean field940;

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    public int[] field945;

    @OriginalMember(owner = "gc", name = "d", descriptor = "[Lgc;")
    public static IdkType[] field943;

    @OriginalMember(owner = "gc", name = "a", descriptor = "(ILub;)V")
    public static void method318(int arg0, Jagfile arg1) {
        if (arg0 != -5880) {
            field941 = -440;
        }
        Packet var2 = new Packet((byte) 64, arg1.method257(null, "idk.dat", -31149));
        field942 = var2.method218();
        if (field943 == null) {
            field943 = new IdkType[field942];
        }
        for (int var3 = 0; var3 < field942; var3++) {
            if (field943[var3] == null) {
                field943[var3] = new IdkType();
            }
            field943[var3].method319(var2, true);
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(Lkb;Z)V")
    public void method319(Packet arg0, boolean arg1) {
        if (!arg1) {
            field940 = !field940;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method216();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field944 = arg0.method216();
                } else if (var3 == 2) {
                    int var4 = arg0.method216();
                    this.field945 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field945[var5] = arg0.method218();
                    }
                } else if (var3 == 3) {
                    this.field949 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field946[var3 - 40] = arg0.method218();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field947[var3 - 50] = arg0.method218();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field948[var3 - 60] = arg0.method218();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "()Leb;")
    public Model method320() {
        if (this.field945 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field945.length];
        for (int var2 = 0; var2 < this.field945.length; var2++) {
            var1[var2] = new Model(this.field945[var2], (byte) 1);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(-406, var1, var1.length);
        }
        for (int var4 = 0; var4 < 6 && this.field946[var4] != 0; var4++) {
            var3.method134(this.field946[var4], this.field947[var4]);
        }
        return var3;
    }

    @OriginalMember(owner = "gc", name = "a", descriptor = "(I)Leb;")
    public Model method321(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field948[var4] != -1) {
                var2[var3++] = new Model(this.field948[var4], (byte) 1);
            }
        }
        Model var5 = new Model(-406, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field946[var6] != 0; var6++) {
            var5.method134(this.field946[var6], this.field947[var6]);
        }
        return var5;
    }
}
