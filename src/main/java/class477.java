import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class477 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lep;")
    public class389 field5935 = null;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[Lco;")
    public class109[] field5940 = null;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[Lco;")
    public class109[] field5937 = null;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lep;")
    public class389 field5939 = null;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lep;")
    public class389 field5936 = null;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
    public boolean field5943;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lvf;")
    public static class141 field5938 = new class141(9, 0, 4, 1);

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Ldr;")
    public static class675 field5944 = new class675(84, -2);

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lcga;")
    public static class449 field5945 = new class449(0, 4);

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field5949 = 2;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field5946 = 50;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5948 = new String[field5946];

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "[I")
    public static int[] field5953 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
    public static int[] field5947 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[I")
    public static int[] field5951 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "[I")
    public static int[] field5954 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
    public static int[] field5952 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "[I")
    public static int[] field5955 = new int[field5946];

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2607(int arg0) {
        field5944 = null;
        field5953 = null;
        field5945 = null;
        field5947 = null;
        field5955 = null;
        field5954 = null;
        if (arg0 != -3) {
            method2607(28);
        }
        field5938 = null;
        field5951 = null;
        field5948 = null;
        field5952 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)V")
    public static final void method2608(int arg0, byte arg1, int arg2) {
        if (arg1 <= 29) {
            field5946 = 90;
        }
        field5941++;
        if (class618.field8385 == 1) {
            class391.method2228(class666.field9041, false, arg0, arg2);
        } else if (class618.field8385 == 2) {
            class252.method1519(arg2, arg0, (byte) -8);
        }
        class618.field8385 = 0;
        class666.field9041 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lpg;IIII)V")
    public static final void method2609(class687 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5942++;
        for (class112 var5 = (class112) class578.field7755.method1909(true); var5 != null; var5 = (class112) class578.field7755.method1916((byte) 80)) {
            if (var5.field1391 == arg1 && (arg3 << 9) == var5.field1398 && arg4 << 9 == var5.field1409 && var5.field1404.field9408 == arg0.field9408) {
                if (var5.field1396 != null) {
                    class314.field3941.method1489(var5.field1396);
                    var5.field1396 = null;
                }
                if (var5.field1386 != null) {
                    class314.field3941.method1489(var5.field1386);
                    var5.field1386 = null;
                }
                var5.method1566(-127);
                return;
            }
        }
        int var6 = 93 % ((-arg2 - 67) / 59);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljaa;)V")
    public class477(class576 arg0) {
        this.field5943 = arg0.field7730;
        class374.method2166((byte) -39, arg0);
        if (this.field5943) {
            byte[] var2 = class343.method1956(class522.field6605, false, 0);
            this.field5935 = new class389(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class343.method1956(class706.field9872, false, 0);
            this.field5936 = new class389(arg0, 6410, 128, 128, 16, var3, 6410);
            class353 var4 = arg0.field7593;
            if (var4.method2026(false)) {
                byte[] var5 = class343.method1956(class327.field4074, false, 0);
                this.field5939 = new class389(arg0, 6408, 128, 128, 16);
                class389 var6 = new class389(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2027(this.field5939, (byte) -61, var6, 2.0F)) {
                    this.field5939.method1103(false);
                } else {
                    this.field5939.method1097(true);
                    this.field5939 = null;
                }
                var6.method1097(true);
                return;
            }
        } else {
            this.field5937 = new class109[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class346.method1997(32768, var7 * 128 * 256, -21928, class522.field6605);
                this.field5937[var7] = new class109(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field5940 = new class109[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class346.method1997(32768, var8 * 128 * 128 * 2, -21928, class706.field9872);
                this.field5940[var8] = new class109(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }
}
