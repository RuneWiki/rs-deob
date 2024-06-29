import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class60 extends class198 {

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    private int field917 = 585;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field912 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field920 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Lec;")
    public static class25 field923 = new class25(32);

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Lek;")
    public static class173 field921;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Lh;")
    public static class294 field922;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static void method372(byte arg0) {
        field922 = null;
        if (arg0 == -60) {
            field920 = null;
            field921 = null;
            field912 = null;
            field923 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method373(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        int var4 = 0;
        short[] var5 = new short[16];
        ++field916;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class4.field43 : class4.field42) + var6;
        for (int var8 = var6; ~var8 > ~var7; ++var8) {
            class174 var11 = class79.method532(-32769, var8);
            if (var11.field2721 && var11.method1176(false).toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 50) {
                    class230.field3684 = null;
                    class231.field3704 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var12 = new short[var5.length * 2];
                    for (int var13 = 0; ~var13 > ~var4; ++var13) {
                        var12[var13] = var5[var13];
                    }
                    var5 = var12;
                }
                var5[var4++] = (short) var8;
            }
        }
        if (arg0 != 50) {
            field925 = 38;
        }
        class29.field365 = 0;
        class230.field3684 = var5;
        class231.field3704 = var4;
        String[] var9 = new String[class231.field3704];
        for (int var10 = 0; ~var10 > ~class231.field3704; ++var10) {
            var9[var10] = class79.method532(-32769, var5[var10]).method1176(false);
        }
        class76.method496((byte) -96, class230.field3684, var9);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field917 = arg1.method1419(121);
        }
        int var5 = -48 % ((60 - arg0) / 61);
        ++field915;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public static final void method374(int arg0, int arg1, int arg2) {
        ++field913;
        class36 var3 = class161.method1067(arg0, arg2, (byte) 81);
        var3.method219(arg0 + -25);
        var3.field465 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
    public static final void method375(byte arg0) {
        ++field926;
        if (class199.field3155 != null) {
            class199.field3155.method1158(-3);
        }
        int var1 = -89 % ((62 - arg0) / 53);
        if (field921 != null) {
            field921.method1158(19);
        }
        class11.method57(2, 22050, -27833, class175.field2740);
        class199.field3155 = class84.method561(class113.field1701, 22050, 0, class259.field4254, -24998);
        class199.field3155.method1163(126, class126.field1948);
        field921 = class84.method561(class113.field1701, 2048, 1, class259.field4254, -24998);
        field921.method1163(126, class71.field1024);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field918;
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            int var4 = class42.field591[arg1];
            for (int var5 = 0; class42.field590 > var5; ++var5) {
                int var6 = class152.field2367[var5];
                if (~var6 < ~this.field917 && -this.field917 + 4096 > var6 && ~var4 < ~(-this.field917 + 2048) && var4 < this.field917 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field917 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~(2048 - this.field917) > ~var6 && ~(this.field917 + 2048) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field917;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field917);
                } else if (var4 >= this.field917 && 4096 - this.field917 >= var4) {
                    if (~this.field917 >= ~var6 && -this.field917 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field917 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field917;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field917 + 2048);
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lfa;Z)V")
    public static final void method376(class273 arg0, boolean arg1) {
        class10.field135 = arg0;
        if (arg1) {
            ++field914;
        }
    }
}
