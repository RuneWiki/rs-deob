import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class39 extends class297 {

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "[B")
    public byte[] field603;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field598 = 0;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field597 = -1;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V", line = 17)
    public static final void method280(int arg0, boolean arg1) {
        field600++;
        if (class248.field4101 == null || arg0 > class248.field4101.length) {
            class248.field4101 = new int[arg0];
        }
        if (arg1) {
            method281(74, -88);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Lbe;", line = 37)
    public static final class18 method281(int arg0, int arg1) {
        class18 var2 = (class18) class198.field3159.method964(-257, (long) arg1);
        field599++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 62) {
            method282(97, 52);
        }
        byte[] var3 = class181.field2767.method1342(19, 11, arg1);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method150(-1, new class221(var3));
        }
        class198.field3159.method966(var4, (long) arg1, (byte) 73);
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lnk;", line = 66)
    public static final class290 method282(int arg0, int arg1) {
        field601++;
        class290 var2 = (class290) class251.field4153.method964(-257, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1424.method1342(-111, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class290 var4 = new class290();
        class221 var5 = new class221(var3);
        var5.field3610 = var5.field3617.length - 2;
        int var6 = var5.method1524((byte) 83);
        int var7 = var5.field3617.length - var6 - 12 - 2;
        var5.field3610 = var7;
        int var8 = var5.method1517((byte) -123);
        var4.field4926 = var5.method1524((byte) 58);
        var4.field4923 = var5.method1524((byte) 108);
        var4.field4928 = var5.method1524((byte) 72);
        var4.field4935 = var5.method1524((byte) 48);
        int var9 = var5.method1509(true);
        if (var9 > 0) {
            var4.field4929 = new class209[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1524((byte) 93);
                class209 var12 = new class209(class275.method1871(var11, 1110164296));
                var4.field4929[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1517((byte) -126);
                    int var14 = var5.method1517((byte) -116);
                    var12.method1376((long) var13, arg0 + 100, new class276(var14));
                }
            }
        }
        var5.field3610 = 0;
        var4.field4924 = var5.method1504((byte) -5);
        var4.field4930 = new int[var8];
        var4.field4927 = new class5[var8];
        var4.field4936 = new int[var8];
        int var15 = 0;
        while (var5.field3610 < var7) {
            int var16 = var5.method1524((byte) 74);
            if (var16 == 3) {
                var4.field4927[var15] = var5.method1501((byte) -56);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4936[var15] = var5.method1509(true);
            } else {
                var4.field4936[var15] = var5.method1517((byte) -124);
            }
            var4.field4930[var15++] = var16;
        }
        class251.field4153.method966(var4, (long) arg1, (byte) 73);
        if (arg0 != -101) {
            method282(-72, -57);
        }
        return var4;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V", line = 154)
    public class39(byte[] arg0) {
        this.field603 = arg0;
    }
}
