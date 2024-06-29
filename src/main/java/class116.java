import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class116 extends class166 {

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "I")
    public static int field1897 = -1;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field1884;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lre;")
    public class228 field1885;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lre;")
    public class228 field1892;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lhc;")
    public static class235 field1896;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Ljava/lang/String;")
    public String field1893;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Z")
    public boolean field1891;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "[Ljava/lang/Object;")
    public Object[] field1895;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[[[I")
    public static int[][][] field1890;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "[[[Lwj;")
    public static class6[][][] field1899;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public static final void method819(int arg0, int arg1) {
        if (arg1 == 7855) {
            class171.field2678.method1897(true, arg0);
            class165.field2587.method1897(true, arg0);
            field1889++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1890 = null;
        if (arg0 != 2888) {
            method819(47, 10);
        }
        field1896 = null;
        field1899 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Lfl;")
    public static final class248 method821(int arg0, byte arg1) {
        field1886++;
        class248 var2 = (class248) class84.field1411.method728((long) arg0, (byte) -47);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -92) {
            method819(-16, 101);
        }
        byte[] var3 = class132.field2073.method1590(0, (byte) -25, arg0);
        if (var3 == null) {
            return null;
        }
        class248 var4 = new class248();
        class88 var5 = new class88(var3);
        var5.field1535 = var5.field1471.length - 2;
        int var6 = var5.method645(arg1 + 11688);
        int var7 = var5.field1471.length - (var6 + 12) - 2;
        var5.field1535 = var7;
        int var8 = var5.method641(arg1 + 91);
        var4.field4015 = var5.method645(arg1 + 11688);
        var4.field4021 = var5.method645(arg1 + 11688);
        var4.field4018 = var5.method645(arg1 + 11688);
        var4.field4013 = var5.method645(11596);
        int var9 = var5.method633(120);
        if (var9 > 0) {
            var4.field4009 = new class39[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method645(arg1 ^ 0xFFFFD2E8);
                class39 var12 = new class39(class89.method685(var11, arg1 ^ 0x5FE7CFD4));
                var4.field4009[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method641(-1);
                    int var14 = var5.method641(-1);
                    var12.method281(1, (long) var13, new class120(var14));
                }
            }
        }
        var5.field1535 = 0;
        var4.field4014 = var5.method658(arg1 + 202);
        var4.field4006 = new String[var8];
        var4.field4007 = new int[var8];
        int var15 = 0;
        var4.field4011 = new int[var8];
        while (var7 > var5.field1535) {
            int var16 = var5.method645(11596);
            if (var16 == 3) {
                var4.field4006[var15] = var5.method675((byte) 16).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4011[var15] = var5.method633(class87.method619(arg1, -111));
            } else {
                var4.field4011[var15] = var5.method641(class87.method619(arg1, 91));
            }
            var4.field4007[var15++] = var16;
        }
        class84.field1411.method737((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(II)I")
    public static final int method822(int arg0, int arg1) {
        field1898++;
        if (arg1 != -1) {
            field1890 = null;
        }
        return arg0 >>> 8;
    }
}
