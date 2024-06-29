import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class240 extends class201 {

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "[[[I")
    public static int[][][] field4132 = new int[2][][];

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "Z")
    public static boolean field4136 = true;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Ljd;")
    public static class85 field4143 = class221.method1499("Weiter", (byte) 127);

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Ljd;")
    public static class85 field4138 = class221.method1499(" loggt sich ein)3", (byte) -118);

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "Z")
    public static volatile boolean field4139 = true;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "Ljd;")
    public static class85 field4145 = class221.method1499("Lade Sprites )2 ", (byte) -57);

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "Ljd;")
    public static class85 field4148 = class221.method1499("<br>(X100(U(Y", (byte) -90);

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "Ljd;")
    public class85 field4134;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4149++;
        int var7 = class144.method945(arg2, class34.field522, (byte) -116, class1.field6);
        int var8 = class144.method945(arg4, class34.field522, (byte) -116, class1.field6);
        int var9 = class144.method945(arg1, class217.field3802, (byte) -116, class83.field1513);
        int var10 = class144.method945(arg0, class217.field3802, (byte) -116, class83.field1513);
        int var11 = class144.method945(arg2 + arg5, class34.field522, (byte) -116, class1.field6);
        int var12 = class144.method945(arg4 - arg5, class34.field522, (byte) -116, class1.field6);
        for (int var13 = var7; var13 < var11; var13++) {
            class183.method1260(arg3, var9, 94, class146.field2488[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class183.method1260(arg3, var9, 111, class146.field2488[var14], var10);
        }
        int var15 = class144.method945(arg1 + arg5, class217.field3802, (byte) -116, class83.field1513);
        int var16 = class144.method945(arg0 - arg5, class217.field3802, (byte) -116, class83.field1513);
        if (arg6 >= -91) {
            field4137 = -77;
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class146.field2488[var17];
            class183.method1260(arg3, var9, -110, var18, var15);
            class183.method1260(arg3, var16, 84, var18, var10);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4135++;
        int var9 = arg2 - arg0;
        int var10 = arg4 - arg1;
        int var11 = (arg7 - arg3 << 16) / var10;
        int var12 = (arg6 - arg5 << 16) / var9;
        if (arg8 != -116) {
            field4132 = null;
        }
        class131.method877(0, (byte) 54, arg0, arg1, var12, arg3, var11, arg4, arg5, arg2, 0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILik;)V")
    private final void method1632(int arg0, int arg1, class247 arg2) {
        if (arg0 == 1) {
            this.field4140 = arg2.method1711((byte) -67);
        } else if (arg0 == 2) {
            this.field4147 = arg2.method1712(6357);
        } else if (arg0 == 5) {
            this.field4134 = arg2.method1692(116);
        }
        if (arg1 <= -108) {
            field4144++;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIBII)V")
    public static final void method1633(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4131++;
        int var6 = class144.method945(arg4, class34.field522, (byte) -116, class1.field6);
        int var7 = class144.method945(arg1, class34.field522, (byte) -116, class1.field6);
        int var8 = class144.method945(arg5, class217.field3802, (byte) -116, class83.field1513);
        int var9 = class144.method945(arg0, class217.field3802, (byte) -116, class83.field1513);
        for (int var10 = var6; var10 <= var7; var10++) {
            class183.method1260(arg2, var8, -118, class146.field2488[var10], var9);
        }
        if (arg3 != 99) {
            field4137 = 43;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjb;B)V")
    public static final void method1634(int arg0, int arg1, class255 arg2, byte arg3) {
        field4141++;
        if (arg3 > -127) {
            field4138 = null;
        }
        if (class177.field3035 != null || class52.field902 || arg2 == null || class56.method380(arg2, 121) == null) {
            return;
        }
        class177.field3035 = arg2;
        class153.field2645 = class56.method380(arg2, -127);
        class244.field4177 = arg1;
        class251.field4330 = false;
        class16.field233 = arg0;
        class30.field454 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
    public static void method1635(int arg0) {
        field4145 = null;
        field4143 = null;
        if (arg0 != -3) {
            method1631(30, -86, 80, -50, 27, -22, -53, -115, -82);
        }
        field4148 = null;
        field4132 = null;
        field4138 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method1636(byte arg0) {
        class261.field4613 = null;
        int var1 = 40 % ((49 - arg0) / 60);
        class180.field3094 = null;
        field4142++;
        class57.field999 = null;
        class65.field1196 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILik;)V")
    public final void method1637(int arg0, class247 arg1) {
        field4146++;
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                if (arg0 == 1589471216) {
                    return;
                } else {
                    field4143 = null;
                    return;
                }
            }
            this.method1632(var3, -119, arg1);
        }
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)Z")
    public final boolean method1638(int arg0) {
        field4133++;
        int var2 = -25 / ((arg0 + 35) / 49);
        return this.field4140 == 115;
    }
}
