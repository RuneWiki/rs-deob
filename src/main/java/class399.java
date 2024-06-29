import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class399 extends class354 {

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Lvp;")
    public static class123 field5860;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field5864;

    static {
        new class180("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5865 = -1;
        field5860 = new class123(72, 7);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[[I", line = 3)
    public final int[][] method207(byte arg0, int arg1) {
        ++field5861;
        if (arg0 >= -40) {
            this.method253(85, (byte) -70);
        }
        int[][] var3 = super.field5351.method2819((byte) -62, arg1);
        if (super.field5351.field6959) {
            int[] var4 = this.method2293(2, arg1, (byte) 69);
            int[][] var5 = this.method2291(0, (byte) -108, arg1);
            int[][] var6 = this.method2291(1, (byte) -100, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class404.field5952 > var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 != -1) {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 82)
    public static void method2487(int arg0) {
        field5860 = null;
        if (arg0 != 3195) {
            method2488(-94, -8, (class303) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILti;I)V", line = 92)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field5859;
        if (arg0 != 15180) {
            field5860 = null;
        }
        if (~arg2 == -1) {
            super.field5354 = arg1.method1918((byte) -91) == 1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)[I", line = 106)
    public final int[] method253(int arg0, byte arg1) {
        ++field5863;
        if (arg1 != -95) {
            field5865 = -115;
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            int[] var5 = this.method2293(1, arg0, (byte) 69);
            int[] var6 = this.method2293(2, arg0, (byte) 69);
            for (int var7 = 0; class404.field5952 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILti;)Ljava/lang/String;", line = 163)
    public static final String method2488(int arg0, int arg1, class303 arg2) {
        ++field5858;
        try {
            int var3 = arg2.method1891(false);
            if (~arg1 > ~var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field4333 += class25.field444.method545(arg2.field4326, var4, 0, arg2.field4333, var3, -1);
            return class331.method2188(false, arg0, var4, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 191)
    public static final void method2489(boolean arg0, String arg1, int arg2) {
        String var3 = arg1.toLowerCase();
        ++field5864;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = !arg0 ? 0 : 32768;
        int var7 = (arg0 ? class121.field1892.field3810 : class121.field1892.field3805) + var6;
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class509 var11 = class121.field1892.method1689(var8, (byte) -55);
            if (var11.field7438 && ~var11.method3009(80).toLowerCase().indexOf(var3) != 0) {
                if (~var5 <= -51) {
                    class305.field4375 = null;
                    class95.field1554 = -1;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class95.field1554 = var5;
        class305.field4375 = var4;
        class76.field1254 = arg2;
        String[] var9 = new String[class95.field1554];
        for (int var10 = 0; ~class95.field1554 < ~var10; ++var10) {
            var9[var10] = class121.field1892.method1689(var4[var10], (byte) -97).method3009(80);
        }
        class113.method835((byte) -86, class305.field4375, var9);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 265)
    public class399() {
        super(3, false);
    }
}
