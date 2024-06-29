import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class132 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field2008 = 0;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
    public static boolean field2010 = false;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lck;")
    public static class119 field2009 = class298.method1987((byte) 68, "sl_back");

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field2012 = 0;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "J")
    public static long field2014 = 0L;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 4)
    public static void method871(byte arg0) {
        field2009 = null;
        if (arg0 != 116) {
            field2010 = false;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZB)V", line = 20)
    public static final void method872(boolean arg0, byte arg1) {
        field2013++;
        if (arg1 < 19) {
            return;
        }
        byte var2;
        byte[][] var3;
        if (arg0) {
            var2 = 1;
            var3 = class293.field4877;
        } else {
            var2 = 4;
            var3 = class204.field3240;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class91.method624(4096);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class103.field1567[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x312D804) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFF478) >> 14;
                            int var12 = (var8 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class150.field2382.length; var14++) {
                                if (class150.field2382[var14] == var13 && var3[var14] != null) {
                                    var7 = true;
                                    class94.method643(class217.field3510, (var12 & 0x7) * 8, (var11 & 0x7) * 8, var4, arg0, var3[var14], var9, var6 * 8, var10, -22180, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class144.method945(8, var5 * 8, var4, -1, 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)Ls;", line = 142)
    public static final class252 method873(int arg0, boolean arg1) {
        field2011++;
        class252 var2 = (class252) class176.field2809.method487(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1) {
            method873(-14, true);
        }
        byte[] var3 = class226.field3615.method261(-1, 16, arg0);
        class252 var4 = new class252();
        if (var3 != null) {
            var4.method1624(new class3(var3), -47);
        }
        class176.field2809.method488(var4, (byte) 123, (long) arg0);
        return var4;
    }
}
