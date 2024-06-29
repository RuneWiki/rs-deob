import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class191 extends class424 {

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field2725;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I", line = 3)
    public static final int method1263(int arg0) {
        field2727++;
        if (class311.field4557 == null) {
            if (!class2.field20 && class480.field6825 > 0) {
                if (class99.field1724 && class404.field6022.method2183(81, false) && class480.field6825 > 2) {
                    return ((class587) class432.field6356.field659.field1800.field1800).field8364;
                }
                return ((class587) class432.field6356.field659.field1800).field8364;
            }
            int var1 = class619.field8735.method1614((byte) -46);
            int var2 = class619.field8735.method1607((byte) -78);
            int var3 = class270.field3975;
            int var4 = class6.field49;
            int var5 = class526.field7324;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class480.field6825; var7++) {
                    if (class255.field3709) {
                        int var12 = var4 - (-(class480.field6825 - var7 - 1) * 16 - 33);
                        if (var12 - 13 < var2 && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class480.field6825 - var7 - 1) * 16 + var4 + 31;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class300 var9 = new class300(class432.field6356);
                    for (class587 var10 = (class587) var9.method1877(arg0 - 30744); var10 != null; var10 = (class587) var9.method1876(0)) {
                        if (var6 == (var8++)) {
                            return var10.field8364;
                        }
                    }
                }
            }
        }
        if (arg0 != 11131) {
            method1265(false, null, 3);
        }
        return -1;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(III)Z", line = 96)
    public static final boolean method1264(int arg0, int arg1, int arg2) {
        field2729++;
        int var3 = -91 / ((-arg1 - 40) / 34);
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 107)
    public static final byte[] method1265(boolean arg0, Object arg1, int arg2) {
        field2726++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class645.method3717((byte) 105, var3) : var3;
        } else if (arg2 != 64) {
            return null;
        } else if (arg1 instanceof class641) {
            class641 var4 = (class641) arg1;
            return var4.method1951(arg2 ^ 0x840);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V", line = 141)
    public class191(int arg0) {
        this.field2725 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V", line = 150)
    public final void method1266(boolean arg0) {
        if (arg0) {
            method1268(null, (byte) -6);
        }
        this.field2725.method3234();
        field2728++;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IBI)Z", line = 162)
    public static final boolean method1267(int arg0, byte arg1, int arg2) {
        if (arg1 > -66) {
            return false;
        } else {
            field2731++;
            return (arg0 & 0x800) != 0 | method1264(arg0, -115, arg2) || class586.method3358(55, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lhn;B)V", line = 173)
    public static final void method1268(class85 arg0, byte arg1) {
        field2730++;
        int var2 = arg0.field1527 - class310.field4553;
        int var3 = arg0.field1480 * 128 + (arg0.method781((byte) 82) * 64);
        int var4 = arg0.field1536 * 128 + (arg0.method781((byte) 54) * 64);
        arg0.field1575 = 0;
        arg0.field5108 += (var3 - arg0.field5108) / var2;
        arg0.field5109 += (var4 - arg0.field5109) / var2;
        if (arg0.field1475 == 0) {
            arg0.method782(8192, -36);
        }
        if (arg0.field1475 == 1) {
            arg0.method782(12288, -36);
        }
        if (arg0.field1475 == 2) {
            arg0.method782(0, -36);
        }
        if (arg1 == -49 && arg0.field1475 == 3) {
            arg0.method782(4096, -36);
        }
    }
}
