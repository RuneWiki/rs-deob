import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class125 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2019 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lik;")
    public class260 field2015;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method898(String arg0, byte arg1, boolean arg2) {
        field2020++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = arg2 ? 32768 : 0;
        int var6 = var5 + (arg2 ? class270.field4260 : class75.field1212);
        int var7 = 0;
        if (arg1 > -72) {
            method898((String) null, (byte) 15, false);
        }
        for (int var8 = var5; var8 < var6; var8++) {
            class108 var11 = class223.method1572((byte) 95, var8);
            if (var11.field1790 && var11.method792((byte) -70).toLowerCase().indexOf(var3) != -1) {
                if (var7 >= 50) {
                    class71.field1165 = -1;
                    class231.field3804 = null;
                    return;
                }
                if (var4.length <= var7) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var7; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var7++] = (short) var8;
            }
        }
        class71.field1165 = var7;
        String[] var9 = new String[class71.field1165];
        class197.field3150 = 0;
        class231.field3804 = var4;
        for (int var10 = 0; var10 < class71.field1165; var10++) {
            var9[var10] = class223.method1572((byte) 92, var4[var10]).method792((byte) -121);
        }
        class78.method546(class231.field3804, var9, (byte) 65);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIII)V")
    public static final void method899(boolean arg0, int arg1, int arg2, int arg3) {
        class259 var4 = class213.method1464((byte) -105, arg2, 11);
        field2016++;
        var4.method1766(0);
        var4.field4113 = arg3;
        var4.field4128 = arg1;
        if (!arg0) {
            method898((String) null, (byte) 61, true);
        }
    }
}
