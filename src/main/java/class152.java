import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class152 {

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    private int field2662 = -1;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field2660 = 0;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lmb;")
    private class160 field2664 = new class160();

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
    public boolean field2670 = false;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    private int field2665;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[[[I")
    private int[][][] field2659;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lhk;")
    private class125[] field2657;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
    public static boolean field2658 = true;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "Lcf;")
    public static class93 field2663 = class147.method1066(" )2> <col=ffffff>", -48);

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lnh;")
    public static class54 field2668 = new class54(64);

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "Lcf;")
    public static class93 field2672 = class147.method1066(")2", -48);

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[I")
    public static int[] field2674 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "Z")
    public static boolean field2678 = false;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Lcf;")
    private static class93 field2675 = class147.method1066("Allocating memory", -48);

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Lcf;")
    public static class93 field2679 = class147.method1066("Schlie-8en", -48);

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lcf;")
    public static class93 field2671 = field2675;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "[Ldh;")
    public static class120[] field2677;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[[I")
    public final int[][] method1089(int arg0, int arg1) {
        field2669++;
        if (arg1 <= 26) {
            field2663 = null;
        }
        if (this.field2666 == this.field2665) {
            this.field2670 = this.field2657[arg0] == null;
            this.field2657[arg0] = class110.field1870;
            return this.field2659[arg0];
        } else if (this.field2665 == 1) {
            this.field2670 = this.field2662 != arg0;
            this.field2662 = arg0;
            return this.field2659[0];
        } else {
            class125 var3 = this.field2657[arg0];
            if (var3 == null) {
                this.field2670 = true;
                if (this.field2660 >= this.field2665) {
                    class125 var4 = (class125) this.field2664.method1161(-1059);
                    var3 = new class125(arg0, var4.field2217);
                    this.field2657[var4.field2222] = null;
                    var4.method1544((byte) -56);
                } else {
                    var3 = new class125(arg0, this.field2660);
                    this.field2660++;
                }
                this.field2657[arg0] = var3;
            } else {
                this.field2670 = false;
            }
            this.field2664.method1160(var3, false);
            return this.field2659[var3.field2217];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1090(byte arg0) {
        field2661++;
        if (this.field2666 != this.field2665) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 95) {
            method1092((byte) -5);
        }
        for (int var2 = 0; var2 < this.field2665; var2++) {
            this.field2657[var2] = class110.field1870;
        }
        return this.field2659;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILhg;)Z")
    public static final boolean method1091(int arg0, class177 arg1) {
        field2667++;
        if (arg1.method1280(class78.field1447, (byte) -57)) {
            return true;
        } else {
            int var2 = -18 / ((arg0 - 47) / 61);
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2671 = null;
        int var1 = 73 % ((arg0 + 63) / 47);
        field2679 = null;
        field2672 = null;
        field2674 = null;
        field2668 = null;
        field2663 = null;
        field2677 = null;
        field2675 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public final void method1093(int arg0) {
        field2656++;
        for (int var2 = 0; var2 < this.field2665; var2++) {
            this.field2659[var2][0] = null;
            this.field2659[var2][1] = null;
            this.field2659[var2][2] = null;
            this.field2659[var2] = null;
        }
        this.field2657 = null;
        this.field2659 = null;
        int var3 = 110 % ((-arg0 - 22) / 43);
        this.field2664.method1153((byte) -6);
        this.field2664 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I")
    public static final int method1094(int arg0, int arg1) {
        field2654++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg0 != -2085166256) {
            method1092((byte) 39);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(III)V")
    public class152(int arg0, int arg1, int arg2) {
        this.field2665 = arg0;
        this.field2659 = new int[this.field2665][3][arg2];
        this.field2666 = arg1;
        this.field2657 = new class125[this.field2666];
    }
}
