import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class227 {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public int field4096;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[S")
    public short[] field4097;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[I")
    public int[] field4106;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lhh;")
    public class163[] field4098;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[S")
    public short[] field4105;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[B")
    public byte[] field4101;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4093 = -1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4099 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4094 = 1;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method1583(byte arg0) {
        field4100++;
        if (class169.field3086 < 0) {
            class27.field419 = -1;
            class175.field3192 = -1;
            class169.field3086 = 0;
        }
        if (arg0 <= 40) {
            field4093 = 29;
        }
        if (class124.field2395 < class169.field3086) {
            class175.field3192 = -1;
            class27.field419 = -1;
            class169.field3086 = class124.field2395;
        }
        if (class201.field3611 < 0) {
            class201.field3611 = 0;
            class27.field419 = -1;
            class175.field3192 = -1;
        }
        if (class58.field952 < class201.field3611) {
            class175.field3192 = -1;
            class201.field3611 = class58.field952;
            class27.field419 = -1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)I")
    public final int method1584(int arg0, byte arg1) {
        field4102++;
        return arg1 >= -46 ? -61 : this.field4101[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI[II)V")
    public static final void method1585(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 != -66) {
            method1585(16, (byte) -38, 119, (int[]) null, 126);
        }
        field4103++;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        arg0--;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg3[var6] = arg2;
            int var7 = var6 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            arg0 = var12 + 1;
            arg3[arg0] = arg2;
        }
        while (arg0 < var13) {
            arg0++;
            arg3[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Z")
    public final boolean method1586(int arg0, int arg1) {
        if (arg1 != 3777) {
            this.method1586(-66, 35);
        }
        field4104++;
        return (this.field4101[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLpg;)Lek;")
    public static final class76 method1587(byte arg0, class81 arg1) {
        class76 var2 = new class76(arg1.method605(true), arg1.method605(true), arg1.method658(110), arg1.method658(120), arg1.method620((byte) -82), arg1.method622(true) == 1);
        if (arg0 >= -24) {
            return null;
        }
        field4095++;
        int var3 = arg1.method622(true);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1434.method1018((byte) 114, new class265(arg1.method658(-81), arg1.method658(122), arg1.method658(87), arg1.method658(73)));
        }
        var2.method558(false);
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
    public class227(int arg0) {
        this.field4096 = arg0;
        this.field4097 = new short[this.field4096];
        this.field4106 = new int[this.field4096];
        this.field4098 = new class163[this.field4096];
        this.field4105 = new short[this.field4096];
        this.field4101 = new byte[this.field4096];
    }
}
