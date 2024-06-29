import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class452 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public int field6466;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
    public int field6470;

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
    public int field6472;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public int field6473;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)I", line = 5)
    public static final int method2766(int arg0) {
        field6468++;
        if (class751.field10469 == 0) {
            class710.field9981.method3973(new class693("jaclib"), 0);
            if (class710.field9981.method3974(false).method2020(28170) != 100) {
                return 1;
            }
            if (!((class693) class710.field9981.method3974(false)).method3913(-121)) {
                class660.field9437.method1561((byte) -113);
            }
            class751.field10469 = 1;
        }
        if (class751.field10469 == 1) {
            class144.field1960 = class710.method3972(true);
            class710.field9977.method3973(new class720(class310.field4183), 0);
            class710.field9986.method3973(new class693("jaggl"), 0);
            class710.field9987.method3973(new class693("jagdx"), 0);
            class710.field9988.method3973(new class693("jagmisc"), 0);
            class710.field9989.method3973(new class693("sw3d"), 0);
            class710.field9990.method3973(new class693("hw3d"), 0);
            class710.field9991.method3973(new class693("jagtheora"), 0);
            class710.field9992.method3973(new class720(class481.field6877), 0);
            class710.field9993.method3973(new class720(class617.field8790), 0);
            class710.field9994.method3973(new class720(class284.field3966), 0);
            class710.field9995.method3973(new class720(class564.field8184), 0);
            class710.field9996.method3973(new class720(class751.field10463), 0);
            class710.field9997.method3973(new class720(class499.field7173), 0);
            class710.field9998.method3973(new class720(class634.field8938), 0);
            class710.field9999.method3973(new class720(class377.field5456), 0);
            class710.field10000.method3973(new class720(class717.field10116), 0);
            class710.field10001.method3973(new class720(class150.field2195), 0);
            class710.field10002.method3973(new class720(class133.field1843), 0);
            class710.field10003.method3973(new class720(class487.field7026), 0);
            class710.field10004.method3973(new class720(class460.field6535), 0);
            class710.field10005.method3973(new class720(class284.field3965), 0);
            class710.field10006.method3973(new class328(class497.field7147, "huffman"), 0);
            class710.field10007.method3973(new class720(class225.field3351), 0);
            class710.field10008.method3973(new class720(class151.field2210), 0);
            class710.field10009.method3973(new class720(class726.field10209), 0);
            class710.field10010.method3973(new class615(class585.field8351, "details"), 0);
            for (int var1 = 0; var1 < class144.field1960.length; var1++) {
                if (class144.field1960[var1].method3974(false) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class710[] var3 = class144.field1960;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class710 var5 = var3[var4];
                int var6 = var5.method3969(0);
                int var7 = var5.method3974(false).method2020(28170);
                var2 += var6 * var7 / 100;
            }
            class751.field10469 = 2;
            class218.field3257 = var2;
        }
        if (class144.field1960 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class710[] var11 = class144.field1960;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class710 var16 = var11[var12];
            int var17 = var16.method3969(0);
            int var18 = var16.method3974(false).method2020(28170);
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
            var8 += var17;
        }
        if (arg0 <= 75) {
            return 108;
        }
        if (var10) {
            if (!((class693) class710.field9988.method3974(false)).method3913(78)) {
                class660.field9437.method1569((byte) 119);
            }
            if (!((class693) class710.field9991.method3974(false)).method3913(120)) {
                class228.field3406 = class660.field9437.method1566(12000);
            }
            class144.field1960 = null;
        }
        int var13 = var8 - class218.field3257;
        int var14 = var9 - class218.field3257;
        int var15 = var13 <= 0 ? 100 : var14 * 100 / var13;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Z", line = 158)
    public static final boolean method2767(int arg0) {
        field6463++;
        if (arg0 != 28493) {
            return true;
        }
        if (class525.field7640) {
            try {
                class665.method3803(class486.field6999, "showVideoAd", (byte) 73);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lega;B)Z", line = 190)
    public final boolean method2768(class452 arg0, byte arg1) {
        field6467++;
        if (this.field6458 == arg0.field6458 && this.field6465 == arg0.field6465 && this.field6466 == arg0.field6466) {
            return true;
        } else {
            if (arg1 > -8) {
                method2769(null, false, -117);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 205)
    public static final Object method2769(byte[] arg0, boolean arg1, int arg2) {
        field6471++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class47.field776) {
            try {
                class234 var3 = (class234) Class.forName("cp").getDeclaredConstructor().newInstance();
                var3.method1632(-72, arg0);
                return var3;
            } catch (Throwable var5) {
                class47.field776 = true;
            }
        }
        int var4 = 87 % ((arg2 - 84) / 38);
        return arg1 ? class67.method591(arg0, false) : arg0;
    }
}
