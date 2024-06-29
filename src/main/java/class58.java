import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class58 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Z")
    public boolean field788;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Lje;")
    public class422 field790;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lje;")
    public class422 field793;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Z")
    public boolean field791;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method510(int arg0) {
        field794++;
        if (class118.field1503.field10650.method1600(arg0 + 24062) != 2) {
            return;
        }
        byte var1 = (byte) (class471.field6571 - 4 & 0xFF);
        int var2 = class471.field6571 % class596.field8090;
        if (arg0 != -24062) {
            return;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class107.field1350; var18++) {
                class267.field3162[var3][var2][var18] = var1;
            }
        }
        if (class581.field7921 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class353.field4383[var4] = -1000000;
            class789.field10869[var4] = 1000000;
            class450.field6371[var4] = 0;
            class473.field6599[var4] = 1000000;
            class375.field4709[var4] = 0;
        }
        int var5 = class300.field3596.field823;
        int var6 = class300.field3596.field813;
        if (class7.field100 != 1 && class131.field1617 == -1) {
            int var7 = class483.method2867(class581.field7921, (byte) -78, class350.field4366, class599.field8107);
            if (var7 - class303.field3622 < 3200 && (class124.field1585[class581.field7921][class599.field8107 >> 9][class350.field4366 >> 9] & 0x4) != 0) {
                class103.method853(11806, false, class350.field4366 >> 9, class599.field8107 >> 9, class107.field1351, 1);
                return;
            }
            return;
        }
        if (class7.field100 != 1) {
            var5 = class131.field1617;
            var6 = class719.field10094;
        }
        if ((class124.field1585[class581.field7921][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class103.method853(arg0 ^ 0xFFFF8C1C, false, var6 >> 9, var5 >> 9, class107.field1351, 0);
        }
        if (class793.field10893 >= 2560) {
            return;
        }
        int var8 = class599.field8107 >> 9;
        int var9 = class350.field4366 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var11 > var9) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || -class596.field8090 >= var12 || var12 >= class596.field8090 || var13 <= (-class107.field1350) || var13 >= class107.field1350) {
            class705.method4008(null, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class632.field8626 + "," + class620.field8435, -128);
            return;
        }
        if (var12 > var13) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class124.field1585[class581.field7921][var8][var9] & 0x4) != 0) {
                    class103.method853(11806, false, var9, var8, class107.field1351, 1);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var11) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class124.field1585[class581.field7921][var8][var9] & 0x4) != 0) {
                        class103.method853(11806, false, var9, var8, class107.field1351, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var9 < var11) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class124.field1585[class581.field7921][var8][var9] & 0x4) != 0) {
                class103.method853(11806, false, var9, var8, class107.field1351, 1);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class124.field1585[class581.field7921][var8][var9] & 0x4) != 0) {
                    class103.method853(11806, false, var9, var8, class107.field1351, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Z")
    public final boolean method511(byte arg0) {
        field792++;
        int var2 = -103 % ((arg0 - 39) / 45);
        return this.field791 && !this.field788;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Z)V")
    public class58(boolean arg0) {
        this.field788 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public final void method512(int arg0) {
        if (this.field790 != null) {
            this.field790.method274((byte) -87);
        }
        field789++;
        this.field791 = false;
        if (arg0 != 4149) {
            this.method511((byte) -2);
        }
    }
}
