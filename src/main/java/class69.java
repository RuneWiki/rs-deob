import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class69 extends class90 {

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "Lqd;")
    public static class37 field1073 = new class37(30);

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field1086 = 0;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1087 = new String[500];

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjc;Z)V")
    public static final void method466(byte arg0, class261 arg1, boolean arg2) {
        int var3 = arg1.field3940;
        field1083++;
        int var4 = (int) arg1.field3851;
        arg1.method1706(-107);
        if (arg0 > -61) {
            field1073 = null;
        }
        if (arg2) {
            class71.method486(var3, (byte) 97);
        }
        class147.method983((byte) -112, var3);
        class267 var5 = class282.method1897(var4, 107);
        if (var5 != null) {
            class217.method1396(false, var5);
        }
        int var6 = class283.field4508;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class224.method1460(81, class280.field4475[var7])) {
                class171.method1130(64, var7);
            }
        }
        if (class283.field4508 == 1) {
            class151.field2185 = false;
            class237.method1556(class200.field2896, class178.field2544, class218.field3225, -22059, class52.field763);
        } else {
            class237.method1556(class200.field2896, class178.field2544, class218.field3225, -22059, class52.field763);
            int var8 = class179.field2556.method1278(class253.field3848);
            for (int var9 = 0; var9 < class283.field4508; var9++) {
                int var10 = class179.field2556.method1278(class274.method1849((byte) 98, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class52.field763 = var8 + 8;
            class218.field3225 = (class56.field854 ? 26 : 22) + class283.field4508 * 15;
        }
        if (class193.field2774 != -1) {
            class168.method1114(false, class193.field2774, 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBII)V")
    public final void method467(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1078++;
        int var6 = this.field1079 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        if (arg2 != 32) {
            this.field1074 = 77;
        }
        int var8 = this.field1082 << 3;
        int var9 = (arg3 << 4) + (var8 & 0xF);
        this.method476(var6, var8, var7, var9, arg4, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V")
    public abstract void method468(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V")
    public abstract void method469(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)V")
    public abstract void method470(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII)V")
    public abstract void method471(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1087 = null;
        int var1 = -114 / ((arg0 + 43) / 32);
        field1073 = null;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(II)V")
    public abstract void method473(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method474(boolean arg0, String arg1, boolean arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class258.field3914.method1264(arg1, 250);
        field1077++;
        int var6 = var3 + 6;
        int var7 = class258.field3914.method1268(arg1, 250) * 13;
        class144.method955(var4 - var3, -var3 + var6, var3 + var3 + var5, var3 + var3 + var7, 0);
        class144.method951(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        if (!arg2) {
            method474(true, (String) null, true);
        }
        class258.field3914.method1267(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class237.method1556(var4 - var3, -var3 + var6, var3 + var3 + var7, -22059, var5 - -var3 + var3);
        if (!arg0) {
            class275.method1853(var5, (byte) 123, var6, var7, var4);
            return;
        }
        try {
            Graphics var8 = class80.field1247.getGraphics();
            class251.field3828.method201((byte) -112, var8, 0, 0);
        } catch (Exception var9) {
            class80.field1247.repaint();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)Lel;")
    public static final class102 method475(int arg0, byte arg1) {
        class102 var2 = (class102) class181.field2596.method263((byte) 109, (long) arg0);
        field1081++;
        int var3 = 55 / ((-arg1 - 4) / 34);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class109.field1575.method1538(3, arg0, (byte) 109);
        class102 var5 = new class102();
        if (var4 != null) {
            var5.method681((byte) -93, new class114(var4));
        }
        class181.field2596.method255((long) arg0, var5, (byte) -127);
        return var5;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V")
    public abstract void method476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIII)V")
    public abstract void method477(int arg0, int arg1, int arg2, int arg3);
}
