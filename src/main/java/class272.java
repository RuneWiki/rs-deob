import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class272 extends class183 {

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    private int field4657 = 0;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    private int field4660 = 4096;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "Z")
    public static volatile boolean field4656 = true;

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "[I")
    public static int[] field4659;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)[I", line = 7)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            method1913(75, (Object) null, false);
        }
        field4662++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0, arg1 ^ 0xFFFFFF82);
            for (int var5 = 0; var5 < class22.field393; var5++) {
                int var6 = var4[var5];
                if (this.field4657 > var6) {
                    var3[var5] = this.field4657;
                } else if (var6 > this.field4660) {
                    var3[var5] = this.field4660;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(B)V", line = 49)
    public static void method1912(byte arg0) {
        if (arg0 != 90) {
            field4656 = true;
        }
        field4659 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/Object;Z)[B", line = 60)
    public static final byte[] method1913(int arg0, Object arg1, boolean arg2) {
        field4661++;
        if (arg1 == null) {
            return null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg2 ? class156.method1046(var4, -118) : var4;
        } else {
            if (arg0 < 43) {
                field4656 = true;
            }
            if (!arg1 instanceof class315) {
                throw new IllegalArgumentException();
            }
            class315 var3 = (class315) arg1;
            return var3.method632((byte) 101);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[[I", line = 103)
    public final int[][] method12(int arg0, int arg1) {
        field4663++;
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        int var4 = 82 / ((18 - arg0) / 61);
        if (this.field3160.field2689) {
            int[][] var5 = this.method1250(arg1, 0, (byte) 84);
            int[] var6 = var3[0];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            int[] var9 = var3[1];
            int[] var10 = var5[2];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class22.field393; var12++) {
                int var13 = var7[var12];
                int var14 = var8[var12];
                int var15 = var10[var12];
                if (var13 < this.field4657) {
                    var6[var12] = this.field4657;
                } else if (var13 <= this.field4660) {
                    var6[var12] = var13;
                } else {
                    var6[var12] = this.field4660;
                }
                if (var14 < this.field4657) {
                    var9[var12] = this.field4657;
                } else if (var14 > this.field4660) {
                    var9[var12] = this.field4660;
                } else {
                    var9[var12] = var14;
                }
                if (var15 < this.field4657) {
                    var11[var12] = this.field4657;
                } else if (var15 > this.field4660) {
                    var11[var12] = this.field4660;
                } else {
                    var11[var12] = var15;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILkh;I)V", line = 181)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field4655++;
        if (arg0 >= -43) {
            field4659 = (int[]) null;
        }
        if (arg2 == 0) {
            this.field4657 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field4660 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field3166 = arg1.method93(false) == 1;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 233)
    public class272() {
        super(1, false);
    }
}
