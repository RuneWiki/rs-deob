import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class242 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[B")
    public byte[] field4110;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[S")
    public short[] field4122;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "[Lke;")
    public class256[] field4124;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[I")
    public int[] field4117;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "[S")
    public short[] field4119;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "[I")
    public static int[] field4107 = new int[2];

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
    public static boolean field4111 = false;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[Lfm;")
    public static class315[] field4120 = new class315[4];

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lla;")
    public static class188 field4123;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field4118;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1616(boolean arg0, int arg1) {
        class215.field3834.method2075(arg1, 1);
        if (!arg0) {
            class36.field642.method2075(arg1, 1);
            field4112++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 21)
    public static void method1617(int arg0) {
        field4120 = null;
        if (arg0 != 0) {
            field4123 = (class188) null;
        }
        field4107 = null;
        field4123 = null;
        field4118 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Z", line = 35)
    public final boolean method1618(int arg0, byte arg1) {
        field4125++;
        if (arg1 > -119) {
            field4107 = (int[]) null;
        }
        return (this.field4110[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z", line = 46)
    public final boolean method1619(int arg0, int arg1) {
        field4121++;
        if (arg0 == -1) {
            return (this.field4110[arg1] & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)Z", line = 58)
    public final boolean method1620(int arg0, byte arg1) {
        if (arg1 >= -41) {
            this.field4110 = (byte[]) null;
        }
        field4109++;
        return (this.field4110[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILng;)V", line = 69)
    public static final void method1621(int arg0, class138 arg1) {
        class6.field91 = class31.method221(class164.field2920, 0, arg1, -1);
        class264.field4533 = new class232[class6.field91.length];
        class116.field2035 = new class232[class6.field91.length];
        field4114++;
        class6.field96 = new class232[class6.field91.length];
        for (int var2 = 0; var2 < class6.field91.length; var2++) {
            class6.field91[var2].method1569();
            class264.field4533[var2] = class6.field91[var2].method1570();
            class6.field91[var2].method1569();
            class116.field2035[var2] = class6.field91[var2].method1570();
            class6.field91[var2].method1569();
            class6.field96[var2] = class6.field91[var2].method1570();
            class6.field91[var2].method1569();
        }
        class57.field1037 = class71.method540(arg1, 0, class67.field1240, (byte) 23);
        class15.field207 = class152.method1141(-31199, class205.field3725, arg1, 0);
        class94.field1686 = class152.method1141(-31199, class144.field2519, arg1, 0);
        class118.field2097 = class152.method1141(-31199, class230.field3944, arg1, 0);
        class192.field3511 = class152.method1141(-31199, class118.field2073, arg1, 0);
        class39.field713 = class152.method1141(-31199, class99.field1773, arg1, 0);
        class320.field5486 = class152.method1141(-31199, class211.field3801, arg1, 0);
        class50.field911 = class281.method1969(arg1, 0, class254.field4345, -11);
        class5.field75 = class114.method783(arg1, 2301979, 0, class122.field2137);
        class13.field179 = class114.method783(arg1, 2301979, 0, class254.field4359);
        class264.field4535 = class260.method1827(arg1, (byte) -114, 0, class172.field3053);
        class102.field1846 = class260.method1827(arg1, (byte) 35, 0, class269.field4596);
        class159.field2838.method2052(class102.field1846, (int[]) null);
        class280.field4875.method2052(class102.field1846, (int[]) null);
        class17.field215.method2052(class102.field1846, (int[]) null);
        if (class253.field4323) {
            class123.field2160 = class31.method221(class301.field5187, 0, arg1, -1);
            for (int var3 = 0; var3 < class123.field2160.length; var3++) {
                class123.field2160[var3].method1575();
            }
        }
        class227 var4 = class68.method525(class295.field5120, -111, 0, arg1);
        var4.method1547();
        if (class253.field4323) {
            class95.field1696 = new class87(var4);
        } else {
            class95.field1696 = var4;
        }
        class227[] var5 = class71.method540(arg1, 0, class196.field3593, (byte) 23);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method1547();
        }
        if (arg0 >= -3) {
            field4123 = (class188) null;
        }
        if (class253.field4323) {
            class236.field4030 = new class135[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class236.field4030[var7] = new class87(var5[var7]);
            }
        } else {
            class236.field4030 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class57.field1037.length; var12++) {
            class57.field1037[var12].method1556(var9 + var10, var10 + var11, var8 + var10);
        }
        class6.field91[0].method1577(var9 + var10, var10 + var11, var8 + var10);
        if (class253.field4323) {
            class141.field2475 = new class135[class57.field1037.length];
            for (int var13 = 0; var13 < class57.field1037.length; var13++) {
                class141.field2475[var13] = new class87(class57.field1037[var13]);
            }
        } else {
            class141.field2475 = class57.field1037;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)I", line = 189)
    public final int method1622(byte arg0, int arg1) {
        if (arg0 != -112) {
            this.field4110 = (byte[]) null;
        }
        field4108++;
        return this.field4110[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lla;B)Lke;", line = 201)
    public static final class256 method1623(class188 arg0, byte arg1) {
        int var2 = 86 % ((arg1 - 8) / 35);
        field4115++;
        if (class257.method1813(false, client.method828(arg0)) == 0) {
            return null;
        } else if (arg0.field3412 == null || arg0.field3412.method1768(false).method1799(127) == 0) {
            return class37.field654 ? class285.field4954 : null;
        } else {
            return arg0.field3412;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Ldj;", line = 224)
    public static final class139 method1624(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class139 var4 = var3.field4632;
            var3.field4632 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 255)
    public static final void method1625(int arg0) {
        if (arg0 == 0) {
            field4116++;
            class14.field183.method2076(arg0 ^ 0x6A);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V", line = 279)
    public class242(int arg0) {
        this.field4113 = arg0;
        this.field4110 = new byte[this.field4113];
        this.field4122 = new short[this.field4113];
        this.field4124 = new class256[this.field4113];
        this.field4117 = new int[this.field4113];
        this.field4119 = new short[this.field4113];
    }
}
