import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class372 extends class30 {

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Ljava/lang/String;")
    public static String field5623 = "Please remove ";

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "Lbn;")
    public static class256 field5628 = new class256(512);

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "[Lgl;")
    public static class356[] field5627;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method2375(int arg0, boolean arg1) {
        field5626++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class431.field6341;
            var3 = 1;
        } else {
            var2 = class376.field5693;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class409.method2566(true);
            for (int var5 = 0; var5 < class80.field1003 >> 3; var5++) {
                for (int var6 = 0; var6 < class380.field5751 >> 3; var6++) {
                    int var7 = class230.field3839[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFD3AA) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class52.field640.length; var13++) {
                                if (class52.field640[var13] == var12 && var2[var13] != null) {
                                    class255.method1761(var4, class162.field2547, var6 * 8, class284.field4547, var9, arg1, var5 * 8, true, (var11 & 0x7) * 8, (var10 & 0x7) * 8, var2[var13], var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -29832) {
            method2378(-81, -77, (class447) null);
        }
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V", line = 88)
    public static final void method2376(int arg0) {
        field5621++;
        if (class316.field4958 < 1024.0F) {
            class316.field4958 = 1024.0F;
        }
        if (class316.field4958 > 3072.0F) {
            class316.field4958 = 3072.0F;
        }
        while (class329.field5153 >= 16384.0F) {
            class329.field5153 -= 16384.0F;
        }
        while (class329.field5153 < 0.0F) {
            class329.field5153 += 16384.0F;
        }
        int var1 = class217.field3555 >> 7;
        int var2 = class163.field2551 >> 7;
        int var3 = class58.method386(class266.field4286, (byte) -128, class217.field3555, class163.field2551);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class266.field4286;
                    if (var7 < 3 && class406.method2545(var6, (byte) -117, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class42.field525 != null && class42.field525[var7] != null) {
                        var8 = (class42.field525[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class275.field4396[var7].method779(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        if (arg0 != 80) {
            method2377((byte) -30);
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class160.field2532) {
            class160.field2532 += (var10 - class160.field2532) / 24;
        } else if (class160.field2532 > var10) {
            class160.field2532 += (var10 - class160.field2532) / 80;
        }
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)V", line = 177)
    public static void method2377(byte arg0) {
        field5627 = null;
        if (arg0 < 1) {
            method2377((byte) -35);
        }
        field5628 = null;
        field5623 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILmo;)Lgh;", line = 194)
    public static final class325 method2378(int arg0, int arg1, class447 arg2) {
        field5629++;
        byte[] var3 = arg2.method2776(0, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 512) {
                field5628 = null;
            }
            return new class325(var3);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)[I", line = 216)
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 <= 49) {
            return null;
        } else {
            field5624++;
            return class79.field995;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 227)
    public class372() {
        super(0, true);
    }
}
