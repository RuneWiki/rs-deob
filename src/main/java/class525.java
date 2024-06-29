import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class525 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "S")
    public static short field7130 = 320;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lct;")
    public static class414 field7129;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method2858(int arg0) {
        field7129 = null;
        if (arg0 < 91) {
            field7129 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
    public static final int method2859(int arg0) {
        field7125++;
        if (arg0 != 0) {
            method2860((byte) 122, 53);
        }
        return class12.field221;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
    public static final boolean method2860(byte arg0, int arg1) {
        field7126++;
        if (class236.field2954[arg1]) {
            return true;
        } else if (class351.field4485.method3350(false, arg1)) {
            int var2 = class351.field4485.method3349(arg1, true);
            if (var2 == 0) {
                class236.field2954[arg1] = true;
                return true;
            }
            if (class103.field1390[arg1] == null) {
                class103.field1390[arg1] = new class507[var2];
            }
            if (arg0 <= 79) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class103.field1390[arg1][var3] == null) {
                    byte[] var4 = class351.field4485.method3365(var3, 59, arg1);
                    if (var4 != null) {
                        class507 var5 = class103.field1390[arg1][var3] = new class507();
                        var5.field6764 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2729(new class630(var4), 27157);
                    }
                }
            }
            class236.field2954[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static final void method2861(int arg0) {
        field7127++;
        class596.field8384 = 0;
        if (arg0 != 1048576) {
            field7130 = -57;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class476.field6042[var1] = null;
            class492.field6494[var1] = 1;
            class359.field4571[var1] = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public static final int method2862(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        field7128++;
        if (arg2 < ~var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
