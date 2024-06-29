import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IIATCLSX")
public class class21 {

    @OriginalMember(owner = "client!IIATCLSX", name = "b", descriptor = "I")
    private int field801 = 827;

    @OriginalMember(owner = "client!IIATCLSX", name = "c", descriptor = "B")
    private byte field802 = 38;

    @OriginalMember(owner = "client!IIATCLSX", name = "d", descriptor = "Z")
    private boolean field803 = false;

    @OriginalMember(owner = "client!IIATCLSX", name = "g", descriptor = "I")
    public int field806 = -1;

    @OriginalMember(owner = "client!IIATCLSX", name = "i", descriptor = "[I")
    public int[] field808 = new int[6];

    @OriginalMember(owner = "client!IIATCLSX", name = "j", descriptor = "[I")
    public int[] field809 = new int[6];

    @OriginalMember(owner = "client!IIATCLSX", name = "k", descriptor = "[I")
    public int[] field810 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!IIATCLSX", name = "l", descriptor = "Z")
    public boolean field811 = false;

    @OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!IIATCLSX", name = "e", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!IIATCLSX", name = "h", descriptor = "[I")
    public int[] field807;

    @OriginalMember(owner = "client!IIATCLSX", name = "f", descriptor = "[LIIATCLSX;")
    public static class21[] field805;

    @OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(BLESUFCMYV;)V")
    public static void method230(byte arg0, class11 arg1) {
        class53 var2 = new class53(arg1.method205("idk.dat", null), (byte) -17);
        field804 = var2.method457();
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field805 == null) {
            field805 = new class21[field804];
        }
        for (int var4 = 0; var4 < field804; var4++) {
            if (field805[var4] == null) {
                field805[var4] = new class21();
            }
            field805[var4].method231(5, var2);
        }
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(ILRGCGKKUR;)V")
    public void method231(int arg0, class53 arg1) {
        if (arg0 != 5) {
            this.field800 = 54;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method455();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field806 = arg1.method455();
                } else if (var3 == 2) {
                    int var4 = arg1.method455();
                    this.field807 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field807[var5] = arg1.method457();
                    }
                } else if (var3 == 3) {
                    this.field811 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field808[var3 - 40] = arg1.method457();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field809[var3 - 50] = arg1.method457();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field810[var3 - 60] = arg1.method457();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(I)Z")
    public boolean method232(int arg0) {
        if (this.field807 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 <= 0) {
            this.field801 = -265;
        }
        for (int var3 = 0; var3 < this.field807.length; var3++) {
            if (!class37.method292(this.field807[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "b", descriptor = "(I)LNGYJLUVS;")
    public class37 method233(int arg0) {
        if (this.field807 == null) {
            return null;
        }
        class37[] var2 = new class37[this.field807.length];
        for (int var3 = 0; var3 < this.field807.length; var3++) {
            var2[var3] = class37.method291(this.field807[var3]);
        }
        class37 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class37(183, var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field808[var5] != 0; var5++) {
            var4.method305(this.field808[var5], this.field809[var5]);
        }
        if (arg0 >= 0) {
            this.field803 = !this.field803;
        }
        return var4;
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "c", descriptor = "(I)Z")
    public boolean method234(int arg0) {
        boolean var2 = true;
        if (arg0 < 2 || arg0 > 2) {
            this.field800 = 126;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field810[var3] != -1 && !class37.method292(this.field810[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "a", descriptor = "(B)LNGYJLUVS;")
    public class37 method235(byte arg0) {
        class37[] var2 = new class37[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field810[var4] != -1) {
                var2[var3++] = class37.method291(this.field810[var4]);
            }
        }
        class37 var5 = new class37(183, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field808[var6] != 0; var6++) {
            var5.method305(this.field808[var6], this.field809[var6]);
        }
        if (this.field802 != arg0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!IIATCLSX", name = "<init>", descriptor = "()V")
    public class21() {
        if (class57.field1577) {
        }
    }
}
