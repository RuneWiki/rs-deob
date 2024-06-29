import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class259 extends class18 {

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public int field4131 = 0;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public int field4133 = 12800;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public int field4143 = 12800;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public int field4148 = 0;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public int field4149 = -1;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public int field4142 = -1;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "Z")
    public boolean field4154 = true;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Ljava/lang/String;")
    public String field4139;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Ljava/lang/String;")
    public String field4144;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "Lam;")
    public class180 field4152;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field4137 = 99;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field4145 = 0;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4150 = "Starting 3d Library";

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field4153 = 2;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Lnh;")
    public static class55 field4141;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)Z")
    public final boolean method1754(int arg0, int arg1, byte arg2) {
        field4134++;
        for (class79 var4 = (class79) this.field4152.method1221(120); var4 != null; var4 = (class79) this.field4152.method1227(-10626)) {
            if (var4.method568(arg0, -1430, arg1)) {
                return true;
            }
        }
        if (arg2 != 117) {
            this.method1754(-125, -60, (byte) 25);
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Llc;")
    public static final class86 method1755(int arg0, int arg1, int arg2) {
        field4135++;
        class86 var3 = new class86();
        for (class259 var4 = (class259) class244.field3974.method287(-123); var4 != null; var4 = (class259) class244.field3974.method291((byte) -43)) {
            if (var4.field4154 && var4.method1754(arg0, arg1, (byte) 117)) {
                var3.method604(var4, -105);
            }
        }
        if (arg2 != 12800) {
            field4147 = -2;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public final void method1756(byte arg0) {
        this.field4143 = 12800;
        field4140++;
        int var2 = 100 / ((41 - arg0) / 63);
        this.field4133 = 12800;
        this.field4148 = 0;
        this.field4131 = 0;
        for (class79 var3 = (class79) this.field4152.method1221(118); var3 != null; var3 = (class79) this.field4152.method1227(-10626)) {
            if (var3.field1311 > this.field4148) {
                this.field4148 = var3.field1311;
            }
            if (var3.field1325 < this.field4143) {
                this.field4143 = var3.field1325;
            }
            if (var3.field1327 < this.field4133) {
                this.field4133 = var3.field1327;
            }
            if (var3.field1321 > this.field4131) {
                this.field4131 = var3.field1321;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)[I")
    public final int[] method1757(int arg0, int arg1, int arg2) {
        field4151++;
        for (class79 var4 = (class79) this.field4152.method1221(115); var4 != null; var4 = (class79) this.field4152.method1227(-10626)) {
            if (var4.method568(arg0, -1430, arg1)) {
                return var4.method564(1000, arg1, arg0);
            }
        }
        if (arg2 > -107) {
            this.method1754(62, -19, (byte) 116);
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBI)[I")
    public final int[] method1758(int arg0, int arg1, byte arg2, int arg3) {
        field4132++;
        int var5 = 85 / ((arg2 - 12) / 48);
        for (class79 var6 = (class79) this.field4152.method1221(118); var6 != null; var6 = (class79) this.field4152.method1227(-10626)) {
            if (var6.method569(-74, arg1, arg0, arg3)) {
                return var6.method564(1000, arg0, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static void method1759(int arg0) {
        field4141 = null;
        field4150 = null;
        int var1 = -3 / (arg0 / 49);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)[I")
    public final int[] method1760(int arg0, int arg1, int arg2) {
        field4146++;
        if (arg2 > -17) {
            return null;
        }
        for (class79 var4 = (class79) this.field4152.method1221(119); var4 != null; var4 = (class79) this.field4152.method1227(-10626)) {
            if (var4.method566(arg1, 0, arg0)) {
                return var4.method563(arg1, arg0, 3);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
    public static final void method1761(byte arg0) {
        while (class16.field244 >= 2048.0F) {
            class16.field244 -= 2048.0F;
        }
        if (class142.field2160 < 128.0F) {
            class142.field2160 = 128.0F;
        }
        field4155++;
        if (class142.field2160 > 383.0F) {
            class142.field2160 = 383.0F;
        }
        while (class16.field244 < 0.0F) {
            class16.field244 += 2048.0F;
        }
        if (arg0 != 112) {
            field4153 = -35;
        }
        int var1 = class25.field332 >> 7;
        int var2 = class140.field2144 >> 7;
        int var3 = 0;
        int var4 = class34.method269(class240.field3892, class25.field332, class140.field2144, 103);
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= (var2 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= (var1 + 4); var6++) {
                    int var7 = class240.field3892;
                    if (var7 < 3 && (class181.field2827[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class160.field2502[var7][var5][var6] & 0xFF) * 8 + var4 - class66.field1107[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class127.field2010) {
            class127.field2010 += (var9 - class127.field2010) / 24;
        } else if (var9 < class127.field2010) {
            class127.field2010 += (var9 - class127.field2010) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class259(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4154 = arg5;
        this.field4142 = arg4;
        this.field4139 = arg1;
        this.field4149 = arg6;
        this.field4136 = arg3;
        this.field4138 = arg0;
        this.field4144 = arg2;
        if (this.field4149 == 255) {
            this.field4149 = 0;
        }
        this.field4152 = new class180();
    }
}
