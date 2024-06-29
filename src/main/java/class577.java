import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class577 {

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Z")
    public static boolean field8449 = false;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "F")
    public static float field8451 = 1.0F;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lvh;")
    public static class125 field8446 = new class125(0, -1);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field8455 = -1;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public int field8447;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field8453;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public static void method3341(byte arg0) {
        if (arg0 != 81) {
            method3341((byte) -25);
        }
        field8446 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)Z")
    public static final boolean method3342(byte arg0, int arg1, int arg2) {
        if (arg0 >= -58) {
            method3343(113);
        }
        field8454++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method3343(int arg0) {
        field8448++;
        int var1 = class556.field8139.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class556.field8139[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class283.field3965; var4++) {
                    if (class66.field957[var4] == class221.field3306[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class66.field957[class283.field3965] = class221.field3306[var2];
                    var3 = class283.field3965++;
                }
                class465 var5 = new class465(class556.field8139[var2]);
                int var6 = 0;
                while (var5.field6710 < class556.field8139[var2].length && var6 < 511 && class310.field4304 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2755((byte) -99);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FB6) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class221.field3306[var2] >> 8) * 64 + var10 - class143.field2474;
                    int var13 = (class221.field3306[var2] & 0xFF) * 64 + var11 - class63.field917;
                    class528 var14 = class564.field8259.method3743(var5.method2755((byte) -70), true);
                    class6 var15 = (class6) class314.field4359.method2818(-22803, (long) var7);
                    if (var15 == null && (var14.field7791 & 0x1) > 0 && class132.field2149 == var9 && var12 >= 0 && var14.field7726 + var12 < class430.field6136 && var13 >= 0 && var14.field7726 + var13 < class580.field8504) {
                        class88 var16 = new class88();
                        var16.field2427 = var7;
                        class6 var17 = new class6(var16);
                        class314.field4359.method2816(var17, (long) var7, false);
                        class82.field1259[class392.field5702++] = var17;
                        class253.field3667[class310.field4304++] = var7;
                        var16.field2431 = class148.field2508;
                        var16.method661(true, var14);
                        var16.method1103(730377038, var16.field1309.field7726);
                        var16.field2426 = var16.field1309.field7771 << 3;
                        var16.method1109(true, (var16.field1309.field7790 + 4 & 0x98400007) << 11, (byte) 117);
                        var16.method659(6, var16.method1108(101), true, var13, var9, var12);
                    }
                }
            }
        }
    }
}
