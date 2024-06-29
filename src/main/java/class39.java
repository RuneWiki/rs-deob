import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class39 extends class498 {

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[B")
    public byte[] field421;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Lja;")
    public static class186 field423;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Loi;")
    public static class53 field420;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 4)
    public static void method213(int arg0) {
        field420 = null;
        if (arg0 == 0) {
            field423 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V", line = 17)
    public class39(byte[] arg0) {
        this.field421 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lgh;)V", line = 30)
    public static final void method214(class391 arg0) {
        if (class446.field6233 >= 65535) {
            return;
        }
        class95 var1 = arg0.field5504;
        class74.field899[class446.field6233] = arg0;
        class147.field1955[class446.field6233] = false;
        class446.field6233++;
        int var2 = arg0.field5494;
        if (arg0.field5496) {
            var2 = 0;
        }
        int var3 = arg0.field5494;
        if (arg0.field5500) {
            var3 = class409.field5785 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method673(10518) + class534.field7832 - var1.method675((byte) 94) >> class493.field6970;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method673(10518) + var1.method675((byte) 95) - class534.field7832 >> class493.field6970;
            if (var7 >= class272.field4032) {
                var7 = class272.field4032 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field5505[var5++];
                int var10 = (var1.method672((byte) -41) + class534.field7832 - var1.method675((byte) 16) >> class493.field6970) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class6.field109) {
                    var11 = class6.field109 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class400.field5635[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class400.field5635[var4][var12][var8] = var13 | (long) class446.field6233;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class400.field5635[var4][var12][var8] = var13 | (long) class446.field6233 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class400.field5635[var4][var12][var8] = var13 | (long) class446.field6233 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class400.field5635[var4][var12][var8] = var13 | (long) class446.field6233 << 48;
                    }
                }
            }
        }
    }
}
