import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class265 extends class120 {

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "Z")
    public static boolean field4193 = false;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lok;")
    private static class41 field4194 = class137.method956("Please wait )2 attempting to reestablish)3", 45);

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "Lok;")
    public static class41 field4196 = class137.method956("Ladevorgang )2 bitte warten Sie)3", 45);

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "I")
    public static int field4208 = 0;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "[Z")
    public static boolean[] field4206 = new boolean[8];

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Lok;")
    public static class41 field4192 = field4194;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "Lok;")
    public static class41 field4191 = class137.method956("<br>(X100(U(Y", 45);

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Z")
    public static boolean field4201;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4198++;
        class285.field4642.field1640 = 0;
        class285.field4642.method797(64, -22096);
        class285.field4642.method797(arg4, -22096);
        class285.field4642.method797(arg3, -22096);
        int var5 = 94 % ((arg2 + 37) / 53);
        class285.field4642.method778(arg0, (byte) -4);
        class285.field4642.method778(arg1, (byte) -4);
        class32.field479 = 1;
        class130.field1947 = 0;
        class167.field2656 = 0;
        class32.field471 = -3;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 23)
    public static final void method1874(int arg0) {
        field4202++;
        int var1 = -102 / ((arg0 - 57) / 46);
        int var2 = class48.method346(0);
        if (var2 == 0) {
            class252.field4015 = (byte[][][]) null;
            class62.method432(0, (byte) -34);
        } else if (var2 == 1) {
            class140.method981((byte) 0, 0);
            class62.method432(512, (byte) -34);
            class98.method699(124);
        } else {
            class140.method981((byte) (class112.field1646 - 4 & 0xFF), 0);
            class62.method432(2, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 52)
    public class265() {
        this(0);
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Laf;", line = 60)
    public static final class72 method1875(int arg0) {
        field4197++;
        int var1 = -95 / ((arg0 - 77) / 38);
        int var2 = class69.field1040[0] * class173.field2812[0];
        byte[] var3 = class223.field3562[0];
        class72 var7;
        if (class116.field1684[0]) {
            byte[] var4 = class185.field3027[0];
            int[] var5 = new int[var2];
            for (int var6 = 0; var6 < var2; var6++) {
                var5[var6] = class255.method1813(class312.field5263[class217.method1563(var3[var6], 255)], class217.method1563(var4[var6] << 24, -16777216));
            }
            var7 = new class261(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], var5);
        } else {
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class312.field5263[class217.method1563(var3[var9], 255)];
            }
            var7 = new class72(class204.field3299, class205.field3318, class95.field1412[0], class314.field5288[0], class69.field1040[0], class173.field2812[0], var8);
        }
        class286.method2005((byte) -9);
        return var7;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V", line = 107)
    private final void method1876(int arg0, int arg1) {
        field4195++;
        this.field4207 = (arg0 & 0xFF00) >> 4;
        this.field4210 = arg0 >> 12 & 0xFF0;
        this.field4203 = (arg0 & 0xFF) << 4;
        if (arg1 != 6134) {
            this.method30((class112) null, 97, -71);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IZ)[[I", line = 128)
    public final int[][] method168(int arg0, boolean arg1) {
        field4205++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[] var4 = var3[2];
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class307.field5160; var7++) {
                var5[var7] = this.field4210;
                var6[var7] = this.field4207;
                var4[var7] = this.field4203;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V", line = 163)
    public static void method1877(byte arg0) {
        field4192 = null;
        field4194 = null;
        field4206 = null;
        field4196 = null;
        if (arg0 != -3) {
            method1874(-124);
        }
        field4191 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Llb;II)V", line = 185)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.method1876(arg0.method757(11997), 6134);
        }
        field4209++;
        if (arg1 != -1) {
            this.field4203 = -117;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V", line = 218)
    private class265(int arg0) {
        super(0, false);
        this.method1876(arg0, 6134);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)Z", line = 234)
    public static final boolean method1878(int arg0, int arg1) {
        if (arg1 < 42) {
            method1878(-86, 4);
        }
        field4200++;
        return ((arg0 & 0x228B8746) >> 29) != 0;
    }
}
