import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class67 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "B")
    public byte field1024;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "S")
    public short field1029;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "B")
    public byte field1023;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lui;")
    public class383 field1022;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lbi;")
    public static class104 field1027 = new class104(32, 2);

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
    public static boolean field1026;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method483(int arg0) {
        field1027 = null;
        if (arg0 != -1257604058) {
            method483(-80);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public static final void method484(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class407 var5 = (class407) class541.field7904.method2123(-35); var5 != null; var5 = (class407) class541.field7904.method2126((byte) 61)) {
            class441.method2798(var5, (byte) 124, arg1, arg0, arg3, arg2);
        }
        field1028++;
        for (class407 var6 = (class407) class354.field5492.method2123(-85); var6 != null; var6 = (class407) class354.field5492.method2126((byte) 61)) {
            byte var12 = 1;
            class289 var13 = var6.field6149.method418((byte) -41);
            if (var6.field6149.field822) {
                var12 = 0;
            } else if (var6.field6149.field837 == var13.field4526 || var6.field6149.field837 == var13.field4543 || var6.field6149.field837 == var13.field4540 || var6.field6149.field837 == var13.field4559) {
                var12 = 2;
            } else if (var6.field6149.field837 == var13.field4519 || var6.field6149.field837 == var13.field4531 || var6.field6149.field837 == var13.field4568 || var6.field6149.field837 == var13.field4575) {
                var12 = 3;
            }
            if (var6.field6145 != var12) {
                int var14 = class316.method2109(var6.field6149, (byte) 116);
                if (var6.field6162 != var14) {
                    if (var6.field6148 != null) {
                        class411.field6231.method482(var6.field6148);
                        var6.field6148 = null;
                    }
                    var6.field6162 = var14;
                }
                var6.field6145 = var12;
            }
            var6.field6155 = var6.field6149.field6417;
            var6.field6163 = var6.field6149.field6417 + (var6.field6149.method415(-4) << 6);
            var6.field6160 = var6.field6149.field6410;
            var6.field6147 = var6.field6149.field6410 + (var6.field6149.method415(-4) << 6);
            class441.method2798(var6, (byte) -62, arg1, arg0, arg3, arg2);
        }
        int var7 = -45 % ((-arg4 - 56) / 41);
        for (class407 var8 = (class407) class249.field4049.method1119(false); var8 != null; var8 = (class407) class249.field4049.method1121((byte) -128)) {
            byte var9 = 1;
            class289 var10 = var8.field6165.method418((byte) -41);
            if (var8.field6165.field822) {
                var9 = 0;
            } else if (var8.field6165.field837 == var10.field4526 || var8.field6165.field837 == var10.field4543 || var8.field6165.field837 == var10.field4540 || var8.field6165.field837 == var10.field4559) {
                var9 = 2;
            } else if (var8.field6165.field837 == var10.field4519 || var8.field6165.field837 == var10.field4531 || var8.field6165.field837 == var10.field4568 || var8.field6165.field837 == var10.field4575) {
                var9 = 3;
            }
            if (var8.field6145 != var9) {
                int var11 = class41.method250(var8.field6165, -6);
                if (var8.field6162 != var11) {
                    if (var8.field6148 != null) {
                        class411.field6231.method482(var8.field6148);
                        var8.field6148 = null;
                    }
                    var8.field6162 = var11;
                }
                var8.field6145 = var9;
            }
            var8.field6155 = var8.field6165.field6417;
            var8.field6163 = var8.field6165.field6417 + (var8.field6165.method415(-4) << 6);
            var8.field6160 = var8.field6165.field6410;
            var8.field6147 = var8.field6165.field6410 + (var8.field6165.method415(-4) << 6);
            class441.method2798(var8, (byte) 111, arg1, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lui;III)V")
    public class67(class383 arg0, int arg1, int arg2, int arg3) {
        this.field1024 = (byte) arg2;
        this.field1029 = (short) arg1;
        this.field1023 = (byte) arg3;
        this.field1022 = arg0;
    }
}
