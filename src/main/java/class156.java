import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class156 extends class292 {

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Z")
    public volatile boolean field2386 = true;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2385 = null;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Z")
    public boolean field2383;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Z")
    public boolean field2384;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "[[I")
    public static int[][] field2379;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)[B")
    public abstract byte[] method517(int arg0);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
    public static void method1046(byte arg0) {
        if (arg0 == 105) {
            field2385 = null;
            field2379 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Luf;II)Lqd;")
    public static final class3 method1047(class176 arg0, int arg1, int arg2) {
        field2390++;
        if (class223.method1489(arg2, arg0, (byte) 102)) {
            if (arg1 >= -32) {
                field2385 = null;
            }
            return class242.method1638(1104494287);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Luf;I)V")
    public static final void method1048(class176 arg0, int arg1) {
        class148.field2281 = arg0;
        field2382++;
        if (arg1 != 31) {
            field2385 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2387++;
        int var7 = class68.method533(class271.field4289, class113.field1779, arg4, (byte) 72);
        int var8 = -52 % ((arg1 - 80) / 41);
        int var9 = class68.method533(class271.field4289, class113.field1779, arg5, (byte) 123);
        int var10 = class68.method533(class75.field1265, class261.field4025, arg3, (byte) 122);
        int var11 = class68.method533(class75.field1265, class261.field4025, arg6, (byte) 57);
        int var12 = class68.method533(class271.field4289, class113.field1779, arg2 + arg4, (byte) 36);
        int var13 = class68.method533(class271.field4289, class113.field1779, arg5 - arg2, (byte) 67);
        for (int var14 = var7; var14 < var12; var14++) {
            class263.method1788(var10, -18732, arg0, field2379[var14], var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class263.method1788(var10, -18732, arg0, field2379[var15], var11);
        }
        int var16 = class68.method533(class75.field1265, class261.field4025, arg2 + arg3, (byte) 77);
        int var17 = class68.method533(class75.field1265, class261.field4025, arg6 - arg2, (byte) 103);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = field2379[var18];
            class263.method1788(var10, -18732, arg0, var19, var16);
            class263.method1788(var17, -18732, arg0, var19, var11);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILkh;)V")
    public static final void method1050(int arg0, class46 arg1) {
        field2389++;
        long var2 = 0L;
        if (arg1.field725 == 0) {
            var2 = class280.method1875(arg1.field733, arg1.field729, arg1.field728);
        }
        if (arg1.field725 == 1) {
            var2 = class158.method1069(arg1.field733, arg1.field729, arg1.field728);
        }
        int var4 = -1;
        if (arg1.field725 == 2) {
            var2 = class120.method859(arg1.field733, arg1.field729, arg1.field728);
        }
        if (arg1.field725 == 3) {
            var2 = class209.method1404(arg1.field733, arg1.field729, arg1.field728);
        }
        int var5 = 0;
        int var6 = 0;
        if (arg0 > -116) {
            field2385 = null;
        }
        if (var2 != 0L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field723 = var6;
        arg1.field731 = var4;
        arg1.field727 = var5;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)I")
    public abstract int method515(boolean arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V")
    public static final void method1051(byte arg0, int arg1) {
        field2388++;
        class221.field3457.method1778(arg1, -80);
        if (arg0 > -90) {
            method1047((class176) null, -31, 59);
        }
    }
}
