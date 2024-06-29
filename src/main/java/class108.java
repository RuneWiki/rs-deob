import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class108 extends class30 {

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field2011 = -1;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field2013 = -2;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2014 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Lia;")
    public static class257 field2022 = class28.method234(-69, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field2021 = -1;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "[I")
    public static int[] field2023 = new int[50];

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "J")
    public static long field2012;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lvb;")
    public class226 field2009;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Ls;")
    public class229 field2018;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[B")
    public byte[] field2016;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static void method796(int arg0) {
        field2014 = null;
        if (arg0 <= -9) {
            field2022 = null;
            field2023 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static final void method797(int arg0) {
        field2019++;
        if (arg0 != 23224) {
            return;
        }
        int var1 = class62.field1283.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class62.field1283[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class197.field3320; var4++) {
                    if (class197.field3328[var2] == class158.field2780[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class158.field2780[class197.field3320] = class197.field3328[var2];
                    var3 = class197.field3320++;
                }
                class152 var5 = new class152(class62.field1283[var2]);
                int var6 = 0;
                while (class62.field1283[var2].length > var5.field2677 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1063(-17162);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class197.field3328[var2] >> 8) * 64 + var10 - class244.field4232;
                    int var13 = (class197.field3328[var2] & 0xFF) * 64 - (class231.field3878 - var11);
                    class198 var14 = class92.method682(true, var5.method1063(-17162));
                    if (class92.field1758[var7] == null && (var14.field3352 & 0x1) > 0 && class54.field1158 == var9 && var12 >= 0 && var14.field3390 + var12 < 104 && var13 >= 0 && (var14.field3390 + var13) < 104) {
                        class92.field1758[var7] = new class197();
                        class197 var15 = class92.field1758[var7];
                        class199.field3412[class140.field2487++] = var7;
                        var15.field3322 = var14;
                        var15.field4124 = var15.field3322.field3384;
                        var15.field4146 = var15.field3322.field3400;
                        var15.field4183 = var15.field3322.field3389;
                        var15.field4149 = var15.field3322.field3368;
                        var15.field4176 = var15.field3322.field3360;
                        var15.field4128 = var15.field3322.field3390;
                        if (var15.field4146 == 0) {
                            var15.field4118 = 0;
                        }
                        var15.field4180 = class7.field153;
                        var15.field4165 = var15.field3322.field3343;
                        var15.field4178 = var15.field3322.field3351;
                        var15.field4145 = var15.field3322.field3373;
                        var15.method1586(var13, true, var12, (byte) 52);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)Ltg;")
    public static final class189 method798(int arg0) {
        field2017++;
        try {
            if (arg0 != 0) {
                field2011 = -127;
            }
            return (class189) Class.forName("kg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIB)V")
    public static final void method799(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = class34.method290(class255.field4371, arg3, class40.field834, -256);
        field2015++;
        int var7 = class34.method290(class255.field4371, arg2, class40.field834, -256);
        int var8 = class34.method290(class145.field2540, arg1, class123.field2211, -256);
        int var9 = class34.method290(class145.field2540, arg0, class123.field2211, -256);
        for (int var10 = var6; var10 <= var7; var10++) {
            class94.method692(class185.field3220[var10], (byte) -124, var8, arg4, var9);
        }
        int var11 = -88 % ((-arg5 - 27) / 39);
    }
}
