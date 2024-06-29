import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class33 implements class171 {

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Ljava/lang/String;")
    private String field493;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field488 = -1;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "[I")
    public static int[] field492 = new int[13];

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
    public static boolean field496 = false;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Z")
    private boolean field486;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
    public final int method126(int arg0) {
        field490++;
        if (arg0 != 23022) {
            return -58;
        }
        int var2 = class467.method2782(this.field493, (byte) -64);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field486 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
    public static void method235(boolean arg0) {
        if (arg0) {
            field496 = true;
        }
        field492 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class33(String arg0) {
        this.field493 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILwu;I)Lfl;")
    public static final class520 method236(boolean arg0, int arg1, class557 arg2, int arg3) {
        field495++;
        if (arg0) {
            return null;
        }
        class26 var4 = new class26(arg2.method3322(arg3, arg1, (byte) 84));
        class520 var5 = new class520(arg1, var4.method196((byte) -92), var4.method196((byte) -92), var4.method189(255), var4.method189(255), var4.method194((byte) 119) == 1, var4.method194((byte) 119), var4.method194((byte) 119));
        int var6 = var4.method194((byte) 119);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field7258.method3116(29066, new class688(var4.method194((byte) 119), var4.method193(2), var4.method193(2), var4.method193(2), var4.method193(2), var4.method193(2), var4.method193(2), var4.method193(2), var4.method193(2)));
        }
        var5.method3094(0);
        return var5;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)Z")
    public final boolean method237(int arg0) {
        field491++;
        int var2 = -45 / ((arg0 + 81) / 41);
        return this.field486;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I")
    public static final int method238(int arg0) {
        field489++;
        if (arg0 != -1) {
            method238(-9);
        }
        return class438.field6018;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lvm;")
    public final class75 method130(int arg0) {
        field487++;
        return arg0 == 29067 ? class75.field1034 : null;
    }
}
