import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class80 extends class132 {

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Lcf;")
    public static class28 field1533 = new class28();

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lvd;")
    private static class222 field1540 = class212.method1357("Try again in 60 secs)3)3)3", 10731);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lvd;")
    public static class222 field1543 = field1540;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lvd;")
    public static class222 field1541 = class212.method1357("Verbindung konnte nicht hergestellt werden)3", 10731);

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field1545 = 1;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field1546 = -1;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "B")
    public byte field1536;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lvd;")
    public class222 field1529;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lvd;")
    public class222 field1534;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Lab;")
    public static class3 field1542;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "[[[I")
    public static int[][][] field1544;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BB)V")
    public static final void method525(byte[] arg0, byte arg1) {
        field1538++;
        class109 var2 = new class109(arg0);
        var2.field2053 = arg0.length - 2;
        class84.field1612 = var2.method675(2);
        class185.field3429 = new int[class84.field1612];
        class174.field3279 = new int[class84.field1612];
        class218.field4050 = new int[class84.field1612];
        class83.field1584 = new int[class84.field1612];
        class157.field3020 = new byte[class84.field1612][];
        var2.field2053 = arg0.length - class84.field1612 * 8 - 7;
        class102.field1892 = var2.method675(2);
        class223.field4182 = var2.method675(2);
        int var3 = (var2.method662((byte) -115) & 0xFF) + 1;
        for (int var4 = 0; var4 < class84.field1612; var4++) {
            class174.field3279[var4] = var2.method675(2);
        }
        for (int var5 = 0; var5 < class84.field1612; var5++) {
            class218.field4050[var5] = var2.method675(2);
        }
        for (int var6 = 0; var6 < class84.field1612; var6++) {
            class185.field3429[var6] = var2.method675(2);
        }
        for (int var7 = 0; var7 < class84.field1612; var7++) {
            class83.field1584[var7] = var2.method675(2);
        }
        var2.field2053 = arg0.length + 3 - var3 * 3 - class84.field1612 * 8 - 7;
        class235.field4398 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class235.field4398[var8] = var2.method701(869322848);
            if (class235.field4398[var8] == 0) {
                class235.field4398[var8] = 1;
            }
        }
        var2.field2053 = 0;
        if (arg1 >= -3) {
            field1540 = null;
        }
        for (int var9 = 0; var9 < class84.field1612; var9++) {
            int var10 = class185.field3429[var9];
            int var11 = class83.field1584[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class157.field3020[var9] = var13;
            int var14 = var2.method662((byte) -85);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method661(255);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method661(255);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Z")
    public static final boolean method526(byte arg0, int arg1) {
        if (arg0 >= -81) {
            return false;
        } else {
            field1530++;
            return (arg1 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lba;I)V")
    public static final void method527(class13 arg0, int arg1) {
        if (arg1 != 31702) {
            method526((byte) 85, -70);
        }
        field1531++;
        if (class34.field739 == arg0.field268) {
            class93.field1746[arg0.field248] = true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1542 = null;
        field1540 = null;
        field1544 = null;
        field1541 = null;
        field1533 = null;
        field1543 = null;
        int var1 = 111 / ((-arg0 - 25) / 38);
    }
}
