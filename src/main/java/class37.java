import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MHWTJCHJ")
public class class37 {

    @OriginalMember(owner = "client!MHWTJCHJ", name = "b", descriptor = "B")
    private byte field989 = -108;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "g", descriptor = "I")
    public int field994 = -1;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "i", descriptor = "[I")
    public int[] field996 = new int[6];

    @OriginalMember(owner = "client!MHWTJCHJ", name = "j", descriptor = "[I")
    public int[] field997 = new int[6];

    @OriginalMember(owner = "client!MHWTJCHJ", name = "k", descriptor = "I")
    public int field998 = 128;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "l", descriptor = "I")
    public int field999 = 128;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "p", descriptor = "LBMKJVFXV;")
    public static class6 field1003 = new class6(688, 30);

    @OriginalMember(owner = "client!MHWTJCHJ", name = "m", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "n", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "o", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "c", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "e", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "f", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "h", descriptor = "LJZQVOFSF;")
    public class29 field995;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "Z")
    private static boolean field988;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "d", descriptor = "[LMHWTJCHJ;")
    public static class37[] field991;

    @OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "(LSMIVAFST;I)V")
    public static void method365(class52 arg0, int arg1) {
        class7 var2 = new class7(arg0.method512("spotanim.dat", null), (byte) 3);
        field990 = var2.method49();
        if (arg1 != -29636) {
            field988 = !field988;
        }
        if (field991 == null) {
            field991 = new class37[field990];
        }
        for (int var3 = 0; var3 < field990; var3++) {
            if (field991[var3] == null) {
                field991[var3] = new class37();
            }
            field991[var3].field992 = var3;
            field991[var3].method366(7, var2);
        }
    }

    @OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "(ILBSNPYLEV;)V")
    public void method366(int arg0, class7 arg1) {
        if (arg0 < 7 || arg0 > 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method47();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field993 = arg1.method49();
                } else if (var4 == 2) {
                    this.field994 = arg1.method49();
                    if (class29.field887 != null) {
                        this.field995 = class29.field887[this.field994];
                    }
                } else if (var4 == 4) {
                    this.field998 = arg1.method49();
                } else if (var4 == 5) {
                    this.field999 = arg1.method49();
                } else if (var4 == 6) {
                    this.field1000 = arg1.method49();
                } else if (var4 == 7) {
                    this.field1001 = arg1.method47();
                } else if (var4 == 8) {
                    this.field1002 = arg1.method47();
                } else if (var4 >= 40 && var4 < 50) {
                    this.field996[var4 - 40] = arg1.method49();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field997[var4 - 50] = arg1.method49();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "()LRMLAXPMV;")
    public class47 method367() {
        class47 var1 = (class47) field1003.method32((long) this.field992);
        if (var1 != null) {
            return var1;
        }
        class47 var2 = class47.method466(this.field993);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field996[0] != 0) {
                var2.method480(this.field996[var3], this.field997[var3]);
            }
        }
        field1003.method33((long) this.field992, var2, this.field989);
        return var2;
    }
}
