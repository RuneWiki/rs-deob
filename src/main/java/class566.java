import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class566 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public int field7845;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Ljava/lang/String;")
    public String field7846;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILqe;I)Z")
    public static final boolean method3199(int arg0, class122 arg1, int arg2) {
        field7844++;
        int var3 = arg1.method752(0, arg2);
        if (var3 == 0) {
            if (arg1.method752(0, 1) != 0) {
                method3199(arg0, arg1, arg2);
            }
            int var4 = arg1.method752(0, 6);
            int var5 = arg1.method752(0, 6);
            boolean var6 = arg1.method752(arg2 - 2, 1) == 1;
            if (var6) {
                class276.field3745[class72.field937++] = arg0;
            }
            if (class292.field3912[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class124 var7 = class142.field1807[arg0];
            class519 var8 = class292.field3912[arg0] = new class519();
            var8.field463 = arg0;
            if (class186.field2281[arg0] != null) {
                var8.method2959(79, class186.field2281[arg0]);
            }
            var8.method240(var7.field1602, 0, true);
            var8.field430 = var7.field1600;
            int var9 = var7.field1599;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field7158 = var7.field1598;
            var8.field517[0] = class536.field7370[arg0];
            var8.field3925 = (byte) var10;
            var8.method2963((byte) -90, (var11 << 6) + var4 - class253.field3490, (var12 << 6) + -class186.field2280 - -var5);
            var8.field7185 = false;
            class142.field1807[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg1.method752(arg2 ^ 0x2, 2);
            int var14 = class142.field1807[arg0].field1599;
            class142.field1807[arg0].field1599 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg1.method752(0, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class142.field1807[arg0].field1599;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FD439) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var21++;
                var20--;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class142.field1807[arg0].field1599 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg1.method752(0, 18);
            int var23 = var22 >> 16;
            int var24 = var22 >> 8 & 0xFF;
            int var25 = var22 & 0xFF;
            int var26 = class142.field1807[arg0].field1599;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class142.field1807[arg0].field1599 = (var27 << 28) + var29 + (var28 << 14);
            return false;
        }
    }
}
