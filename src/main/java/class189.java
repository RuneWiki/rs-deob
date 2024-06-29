import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public abstract class class189 extends class375 {

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "Z")
    public volatile boolean field2717 = true;

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
    public static int field2716 = -1;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "Z")
    public static boolean field2720 = false;

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "[I")
    public static int[] field2721 = new int[16384];

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "[I")
    public static int[] field2719 = new int[16384];

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "Lkea;")
    public static class213 field2723;

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "Z")
    public boolean field2718;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "Z")
    public boolean field2722;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2719[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field2721[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field2723 = new class213(64);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILqaa;)Z", line = 4)
    public static final boolean method1271(int arg0, int arg1, class26 arg2) {
        field2715++;
        int var3 = arg2.method309((byte) 57, 2);
        if (var3 == 0) {
            if (arg2.method309((byte) 57, 1) != 0) {
                method1271(arg0, arg1, arg2);
            }
            int var4 = arg2.method309((byte) 57, 6);
            int var5 = arg2.method309((byte) 57, 6);
            boolean var6 = arg2.method309((byte) 57, 1) == 1;
            if (var6) {
                class568.field7985[class580.field8173++] = arg0;
            }
            if (class141.field2087[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class94 var7 = class495.field7033[arg0];
            class491 var8 = class141.field2087[arg0] = new class491();
            var8.field6216 = arg0;
            if (class263.field3987[arg0] != null) {
                var8.method2850(class263.field3987[arg0], 0);
            }
            var8.method2554(var7.field1496, (byte) 85, true);
            var8.field6171 = var7.field1497;
            int var9 = var7.field1499;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class109.field1672;
            int var14 = (var12 << 6) + var5 - class203.field2874;
            var8.field6999 = var7.field1500;
            var8.field6265[0] = class208.field2924[arg0];
            var8.field3019 = var8.field3023 = (byte) var10;
            if (class261.method1718(var14, 1, var13)) {
                var8.field3023++;
            }
            var8.method2851(25661, var14, var13);
            var8.field6975 = false;
            class495.field7033[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg2.method309((byte) 57, 2);
            int var16 = class495.field7033[arg0].field1499;
            class495.field7033[arg0].field1499 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg2.method309((byte) 57, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class495.field7033[arg0].field1499;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
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
                var23++;
                var22++;
            }
            class495.field7033[arg0].field1499 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg2.method309((byte) 57, 18);
            int var25 = var24 >> 16;
            int var26 = (var24 & 0xFF6C) >> 8;
            int var27 = var24 & arg1;
            int var28 = class495.field7033[arg0].field1499;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            class495.field7033[arg0].field1499 = (var29 << 28) + var31 + (var30 << 14);
            return false;
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V", line = 172)
    public static void method1272(int arg0) {
        field2721 = null;
        field2719 = null;
        field2723 = null;
        if (arg0 >= -7) {
            field2719 = null;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)I", line = 196)
    public static int method1273(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)[B")
    public abstract byte[] method833(int arg0);

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "(I)I")
    public abstract int method831(int arg0);
}
