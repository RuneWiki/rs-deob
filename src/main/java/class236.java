import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class236 extends class41 {

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "J")
    public long field4105;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lsc;")
    public static class181 field4099 = class149.method967(255, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lsc;")
    private static class181 field4102 = class149.method967(255, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lsc;")
    private static class181 field4106 = class149.method967(255, "yellow:");

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field4100 = 10;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lsc;")
    public static class181 field4098 = field4106;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lsc;")
    public static class181 field4108 = class149.method967(255, "underlay");

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Lsc;")
    public static class181 field4096 = field4102;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lsc;")
    public static class181 field4103 = field4106;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "Lsc;")
    public static class181 field4109 = class149.method967(255, ")2");

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Lvb;")
    public static class247 field4095 = new class247();

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[I")
    public static int[] field4110 = new int[32];

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        field4099 = null;
        field4110 = null;
        field4103 = null;
        field4109 = null;
        field4095 = null;
        field4106 = null;
        field4108 = null;
        field4098 = null;
        int var1 = 61 / ((75 - arg0) / 39);
        field4102 = null;
        field4096 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static final void method1616(byte arg0) {
        if (class113.field1845 < 128) {
            class113.field1845 = 128;
        }
        if (class113.field1845 > 383) {
            class113.field1845 = 383;
        }
        class214.field3682 &= 0x7FF;
        field4104++;
        int var1 = class16.field297 >> 7;
        int var2 = class243.field4220 >> 7;
        int var3 = 0;
        int var4 = class232.method1606(class38.field581, (byte) -82, class243.field4220, class16.field297);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class38.field581;
                    if (var7 < 3 && (class70.field1129[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class31.field505[var7][var5][var6];
                    if (var3 < var8) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (arg0 != 57) {
            field4097 = -53;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class90.field1423 < var9) {
            class90.field1423 += (var9 - class90.field1423) / 24;
        } else if (class90.field1423 > var9) {
            class90.field1423 += (var9 - class90.field1423) / 80;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class236() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(J)V")
    public class236(long arg0) {
        this.field4105 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
    public static final void method1617(byte arg0) {
        for (int var1 = 0; var1 < class137.field2236; var1++) {
            int var2 = class30.field498[var1];
            class116 var3 = class39.field602[var2];
            int var4 = class76.field1223.method1516((byte) 82);
            if ((var4 & 0x80) != 0) {
                var4 += class76.field1223.method1516((byte) 82) << 8;
            }
            class215.method1426(var4, var3, var2, (byte) 23);
        }
        field4107++;
        if (arg0 > -21) {
            method1618(-88, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1618(int arg0, int[] arg1) {
        field4101++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        class252.method1717(arg1, 0, var2, 0, arg1.length);
        if (arg0 >= -21) {
            method1616((byte) 34);
        }
        return var2;
    }
}
