import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class525 {

    @OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
    public int field7285;

    @OriginalMember(owner = "client!fha", name = "p", descriptor = "S")
    public short field7299;

    @OriginalMember(owner = "client!fha", name = "o", descriptor = "I")
    public int field7298;

    @OriginalMember(owner = "client!fha", name = "e", descriptor = "S")
    public short field7288;

    @OriginalMember(owner = "client!fha", name = "m", descriptor = "B")
    public byte field7296;

    @OriginalMember(owner = "client!fha", name = "g", descriptor = "B")
    public byte field7290;

    @OriginalMember(owner = "client!fha", name = "f", descriptor = "S")
    public short field7289;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "Z")
    public boolean field7284;

    @OriginalMember(owner = "client!fha", name = "k", descriptor = "[[I")
    public static int[][] field7294 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!fha", name = "l", descriptor = "I")
    public static int field7295 = 0;

    @OriginalMember(owner = "client!fha", name = "i", descriptor = "Z")
    public static boolean field7292 = false;

    @OriginalMember(owner = "client!fha", name = "c", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!fha", name = "d", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!fha", name = "j", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!fha", name = "n", descriptor = "Lcu;")
    public static class203 field7297;

    @OriginalMember(owner = "client!fha", name = "h", descriptor = "Laaa;")
    public static class26 field7291;

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(B)V", line = 3)
    public static void method3119(byte arg0) {
        field7297 = null;
        int var1 = 54 / ((-arg0 - 15) / 57);
        field7291 = null;
        field7294 = null;
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lmfa;II)Z", line = 18)
    public static final boolean method3120(class409 arg0, int arg1, int arg2) {
        field7293++;
        int var3 = arg0.method2560(-67, 2);
        if (arg2 == var3) {
            if (arg0.method2560(-42, 1) != 0) {
                method3120(arg0, arg1, arg2);
            }
            int var4 = arg0.method2560(arg2 ^ 0xFFFFFF81, 6);
            int var5 = arg0.method2560(-127, 6);
            boolean var6 = arg0.method2560(-49, 1) == 1;
            if (var6) {
                class248.field3651[class385.field5530++] = arg1;
            }
            if (class251.field3675[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class721 var7 = class20.field198[arg1];
            class96 var8 = class251.field3675[arg1] = new class96();
            var8.field7148 = arg1;
            if (class318.field4426[arg1] != null) {
                var8.method657(arg2 + 38, class318.field4426[arg1]);
            }
            var8.method3073(true, true, var7.field10033);
            var8.field7122 = var7.field10032;
            int var9 = var7.field10027;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class113.field1509;
            int var14 = (var12 << 6) + var5 - class587.field7995;
            var8.field1351 = var7.field10034;
            var8.field7195[0] = class346.field4924[arg1];
            var8.field4408 = var8.field4419 = (byte) var10;
            if (class479.method2918(var14, true, var13)) {
                var8.field4419++;
            }
            var8.method650(var13, var14, arg2 - 121);
            var8.field1354 = false;
            class20.field198[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method2560(arg2 ^ 0xFFFFFFC9, 2);
            int var16 = class20.field198[arg1].field10027;
            class20.field198[arg1].field10027 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method2560(-58, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class20.field198[arg1].field10027;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var22--;
                var23--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class20.field198[arg1].field10027 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method2560(-30, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF48) >> 8;
            int var27 = var24 & 0xFF;
            int var28 = class20.field198[arg1].field10027;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class20.field198[arg1].field10027 = (var29 << 28) + (var30 << 14) + var31;
            return false;
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V", line = 182)
    public static final void method3121(File arg0, int arg1, String arg2) {
        class380.field5454.put(arg2, arg0);
        field7287++;
        if (arg1 != 1) {
            method3122(124, 73, 98);
        }
    }

    @OriginalMember(owner = "client!fha", name = "a", descriptor = "(III)Z", line = 221)
    public static final boolean method3122(int arg0, int arg1, int arg2) {
        field7286++;
        if (arg0 != 6) {
            field7294 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 232)
    public class525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field7285 = arg10;
        this.field7299 = (short) arg4;
        this.field7298 = arg0;
        this.field7288 = (short) arg6;
        this.field7296 = (byte) arg7;
        this.field7290 = (byte) arg8;
        this.field7289 = (short) arg5;
        this.field7284 = arg9;
    }
}
