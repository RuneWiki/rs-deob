import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class180 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    public static int[] field2830 = new int[500];

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "[I")
    public static int[] field2834 = new int[14];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lvl;")
    public static class73 field2828;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
    public static boolean field2832;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[[Z")
    public static boolean[][] field2827;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        field2833++;
        int var1 = class44.field527.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class44.field527[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class144.field2147; var4++) {
                    if (class250.field4072[var2] == class16.field221[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class16.field221[class144.field2147] = class250.field4072[var2];
                    var3 = class144.field2147++;
                }
                class170 var6 = new class170(class44.field527[var2]);
                while (var6.field2676 < class44.field527[var2].length && var5 < 511 && class80.field1211 < 1023) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1186((byte) -98);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class250.field4072[var2] >> 8) * 64 + var10 - class113.field1653;
                    int var13 = (class250.field4072[var2] & 0xFF) * 64 + var9 - class5.field77;
                    class134 var14 = class118.method780(var6.method1186((byte) -103), -29837);
                    if (class191.field3045[var7] == null && (var14.field1885 & 0x1) > 0 && class250.field4051 == var11 && var12 >= 0 && var14.field1925 + var12 < 104 && var13 >= 0 && (var13 + var14.field1925) < 104) {
                        class191.field3045[var7] = new class86();
                        class86 var15 = class191.field3045[var7];
                        class187.field2939[class80.field1211++] = var7;
                        var15.field3931 = class311.field4996;
                        var15.method586(true, var14);
                        var15.method1729(var15.field1321.field1925, (byte) 54);
                        var15.field3924 = var15.field3913 = class195.field3091[var15.field1321.field1945];
                        var15.field3898 = var15.field1321.field1889;
                        var15.field3983 = var15.field1321.field1923;
                        if (var15.field3983 == 0) {
                            var15.field3913 = 0;
                        }
                        var15.method1732(var12, true, var15.method8((byte) -113), arg0 ^ 0xFFFFFFFA, var13);
                    }
                }
            }
        }
        if (arg0 != 14) {
            field2828 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I")
    public static final int method1277(byte arg0, int arg1, int arg2) {
        field2831++;
        if (arg0 > -124) {
            return -117;
        } else {
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg2 - var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lnd;B)V")
    public static final void method1278(class301 arg0, byte arg1) {
        field2829++;
        class27.field318 = arg0;
        int var2 = 47 / ((arg1 - 61) / 59);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1279(int arg0) {
        field2828 = null;
        field2830 = null;
        field2834 = null;
        if (arg0 != -512) {
            field2834 = null;
        }
        field2827 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)V")
    public static final void method1280(boolean arg0, int arg1) {
        if (arg1 != 15622) {
            return;
        }
        field2835++;
        byte[][] var2 = class199.field3148;
        int var3 = class129.field1840.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class250.field4072[var4] >> 8) * 64 - class113.field1653;
                int var7 = (class250.field4072[var4] & 0xFF) * 64 - class5.field77;
                class31.method163(-11565);
                class184.method1303(var5, var7, class312.field4997, var6, arg0, 4096);
            }
        }
    }
}
