import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class415 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Luf;")
    public static class310 field6082 = new class310(34, 12);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field6084 = 1339;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field6085 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field6086 = new int[500];

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lqo;IBI)Lcl;", line = 3)
    public static final class173 method2482(class19 arg0, int arg1, byte arg2, int arg3) {
        field6083++;
        int var4 = arg0.field194 | arg1 << 8;
        class173 var5 = (class173) class411.field6022.method1321((long) var4 << 16, 77);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class348.field4773.method1388(class348.field4773.method1416(var4, 57), (byte) -109);
        if (var6 == null) {
            int var8 = arg0.field194 | arg3 + 65536 << 8;
            int var9 = -56 / ((arg2 + 50) / 40);
            class173 var10 = (class173) class411.field6022.method1321((long) var8 << 16, 68);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class348.field4773.method1388(class348.field4773.method1416(var8, 64), (byte) -19);
            if (var11 == null) {
                int var13 = arg0.field194 | 0xFFFF00;
                class173 var14 = (class173) class411.field6022.method1321((long) var13 << 16, 123);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class348.field4773.method1388(class348.field4773.method1416(var13, 48), (byte) -101);
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class173 var16 = class201.method1235(118, var15);
                    var16.field2476 = arg0;
                    class411.field6022.method1324((long) var13 << 16, -30, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class173 var12 = class201.method1235(120, var11);
                var12.field2476 = arg0;
                class411.field6022.method1324((long) var8 << 16, -115, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class173 var7 = class201.method1235(114, var6);
            var7.field2476 = arg0;
            class411.field6022.method1324((long) var4 << 16, -83, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 75)
    public static final void method2483() {
        class116.method739(1, class401.field5574);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 88)
    public static void method2484(int arg0) {
        if (arg0 != 461570128) {
            field6086 = null;
        }
        field6082 = null;
        field6086 = null;
    }

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method325(int arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method342(class415 arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method336(int arg0);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method327(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method335(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()Lia;")
    public abstract class415 method346();

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method340(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method332(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method343(int arg0);
}
