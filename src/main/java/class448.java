import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class448 extends class678 {

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6445;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Ljava/lang/String;")
    public String field6451;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "[C")
    public char[] field6441;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[C")
    public char[] field6442;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[I")
    public int[] field6446;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "[I")
    public int[] field6450;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLqh;)V")
    public final void method2691(byte arg0, class61 arg1) {
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                int var4 = 84 / ((9 - arg0) / 43);
                field6448++;
                return;
            }
            this.method2692(var3, arg1, 114);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILqh;I)V")
    private final void method2692(int arg0, class61 arg1, int arg2) {
        int var4 = 75 % ((arg2 - 38) / 33);
        field6443++;
        if (arg0 == 1) {
            this.field6451 = arg1.method747(14598);
        } else if (arg0 == 2) {
            int var5 = arg1.method732(-559537960);
            this.field6442 = new char[var5];
            this.field6446 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field6446[var6] = arg1.method723((byte) -25);
                byte var7 = arg1.method710((byte) 43);
                this.field6442[var6] = var7 == 0 ? 0 : class370.method2344(-7588, var7);
            }
        } else if (arg0 == 3) {
            int var8 = arg1.method732(-559537960);
            this.field6441 = new char[var8];
            this.field6450 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6450[var9] = arg1.method723((byte) -25);
                byte var10 = arg1.method710((byte) 43);
                this.field6441[var9] = var10 == 0 ? 0 : class370.method2344(-7588, var10);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BC)I")
    public final int method2693(byte arg0, char arg1) {
        field6452++;
        if (this.field6450 == null) {
            return -1;
        }
        if (arg0 > -90) {
            method2694(45);
        }
        for (int var3 = 0; var3 < this.field6450.length; var3++) {
            if (this.field6441[var3] == arg1) {
                return this.field6450[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2694(int arg0) {
        if (arg0 > -73) {
            method2694(-44);
        }
        field6445 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public final void method2695(byte arg0) {
        int var2 = 64 % ((-arg0 - 35) / 41);
        field6447++;
        if (this.field6450 != null) {
            for (int var3 = 0; var3 < this.field6450.length; var3++) {
                this.field6450[var3] = class2.method189(this.field6450[var3], 32768);
            }
        }
        if (this.field6446 != null) {
            for (int var4 = 0; var4 < this.field6446.length; var4++) {
                this.field6446[var4] = class2.method189(this.field6446[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(CI)I")
    public final int method2696(char arg0, int arg1) {
        field6444++;
        if (this.field6446 == null) {
            return -1;
        } else if (arg1 > -37) {
            return -39;
        } else {
            for (int var3 = 0; var3 < this.field6446.length; var3++) {
                if (this.field6442[var3] == arg0) {
                    return this.field6446[var3];
                }
            }
            return -1;
        }
    }
}
