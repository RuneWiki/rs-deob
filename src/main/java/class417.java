import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class417 extends class39 {

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field5994 = new String[200];

    @OriginalMember(owner = "client!fw", name = "N", descriptor = "I")
    public static int field6001 = 0;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field5998 = -1;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "F")
    public static float field5995;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "[B")
    private byte[] field5999;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BILmh;I)Lln;", line = 8)
    public static final class94 method2478(byte arg0, int arg1, class145 arg2, int arg3) {
        field5996++;
        if (arg0 >= -36) {
            method2479((byte) -40);
        }
        int var4 = arg1 << 8 | arg2.field1875;
        class94 var5 = (class94) class14.field128.method227((long) var4 << 16, (byte) 57);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class301.field4409.method3469(class301.field4409.method3475(var4, -1), 113);
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg2.field1875;
            class94 var9 = (class94) class14.field128.method227((long) var8 << 16, (byte) 88);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class301.field4409.method3469(class301.field4409.method3475(var8, -1), 123);
            if (var10 == null) {
                int var12 = arg2.field1875 | 0xFFFF00;
                class94 var13 = (class94) class14.field128.method227((long) var12 << 16, (byte) 100);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class301.field4409.method3469(class301.field4409.method3475(var12, -1), 115);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class94 var15 = class228.method1492(-22, var14);
                    var15.field1167 = arg2;
                    class14.field128.method230((long) var12 << 16, var15, 50);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class94 var11 = class228.method1492(-22, var10);
                var11.field1167 = arg2;
                class14.field128.method230((long) var8 << 16, var11, 50);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class94 var7 = class228.method1492(-22, var6);
            var7.field1167 = arg2;
            class14.field128.method230((long) var4 << 16, var7, 50);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V", line = 79)
    public class417() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(B)V", line = 84)
    public static void method2479(byte arg0) {
        if (arg0 == 125) {
            field5994 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BII)V", line = 105)
    public final void method199(byte arg0, int arg1, int arg2) {
        field6002++;
        int var4 = arg1 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5999[var10001] = -1;
        int var5 = arg0 & 0xFF;
        this.field5999[var6] = (byte) (var5 * 3 >> 5);
        if (arg2 <= 26) {
            this.method2481(-88, 63, -58, 8);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lwca;ZII)V", line = 121)
    public static final void method2480(class311 arg0, boolean arg1, int arg2, int arg3) {
        field5997++;
        class174.field2370 = arg2;
        if (arg1) {
            method2479((byte) -60);
        }
        class556.field8252 = arg3;
        class76.field885 = arg0;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(IIII)[B", line = 135)
    public final byte[] method2481(int arg0, int arg1, int arg2, int arg3) {
        this.field5999 = new byte[arg2 * 2 * arg0 * arg3];
        if (arg1 != 0) {
            field5998 = -92;
        }
        field6000++;
        this.method2960(arg1 ^ 0xFFF, arg2, arg3, arg0);
        return this.field5999;
    }
}
