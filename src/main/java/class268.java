import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class268 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "J")
    public long field4554 = 0L;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
    public static boolean field4544 = false;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[S")
    public static short[] field4545 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4547 = 2;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "S")
    public static short field4558 = 32767;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field4555;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljm;")
    public class123 field4552;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Ljm;")
    public class123 field4559;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lna;")
    public static class153 field4551;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BJII)Z", line = 28)
    public static final boolean method1842(byte arg0, long arg1, int arg2, int arg3) {
        field4560++;
        int var5 = -19 % ((-arg0 - 44) / 33);
        int var6 = ((int) arg1 & 0x3717BC) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        int var8 = ((int) arg1 & 0x7DBFD) >> 14;
        if (var8 == 10 || var8 == 11 || var8 == 22) {
            class216 var9 = class252.method1755(var7, (byte) -46);
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var10 = var9.field3669;
                var11 = var9.field3676;
            } else {
                var10 = var9.field3676;
                var11 = var9.field3669;
            }
            int var12 = var9.field3692;
            if (var6 != 0) {
                var12 = (var12 << var6 & 0xF) + (var12 >> 4 - var6);
            }
            class57.method377(true, 13581, 0, field4551.field3828[0], arg2, arg3, var12, 0, 2, field4551.field3846[0], var10, var11);
        } else {
            class57.method377(true, 13581, var8 + 1, field4551.field3828[0], arg2, arg3, 0, var6, 2, field4551.field3846[0], 0, 0);
        }
        class111.field1827 = class171.field2786;
        class218.field3761 = 0;
        class156.field2519 = 2;
        class102.field1687 = class207.field3520;
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 78)
    public static void method1843(int arg0) {
        if (arg0 != -11) {
            field4551 = (class153) null;
        }
        field4551 = null;
        field4545 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZLmh;)V", line = 93)
    public static final void method1844(int arg0, boolean arg1, class62 arg2) {
        class62 var3 = arg2.method430(11645);
        field4561++;
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class262.field4404; var6++) {
            class37 var7 = class189.method1320(0, var6);
            if ((!arg1 || var7.field533) && var7.field509 == -1 && var7.field556 == -1 && var7.field506 == 0 && var7.field541.method430(11645).method457(-27773, var3) != -1) {
                if (var5 >= 250) {
                    class143.field2275 = null;
                    class53.field768 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var8 = new short[var4.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var4[var9];
                    }
                    var4 = var8;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg0 < 69) {
            field4551 = (class153) null;
        }
        class159.field2561 = 0;
        class143.field2275 = var4;
        class53.field768 = var5;
        class62[] var10 = new class62[class53.field768];
        for (int var11 = 0; var11 < class53.field768; var11++) {
            var10[var11] = class189.method1320(0, var4[var11]).field541;
        }
        class259.method1802(var10, class143.field2275, -1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I", line = 173)
    public static final int method1845(int arg0, int arg1) {
        field4546++;
        return arg0 == 0 ? arg1 >>> 10 : 87;
    }
}
