import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class390 {

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    public static boolean field5614 = false;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lcr;")
    public static class189 field5615 = new class189(8);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5618 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[[[B")
    public static byte[][][] field5619;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2507(boolean arg0) {
        field5619 = null;
        if (arg0) {
            field5618 = -61;
        }
        field5615 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2508(int arg0) {
        class11.field172.method371(4);
        field5613++;
        for (int var1 = 0; var1 < 32; var1++) {
            class279.field4057[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class163.field2187[var2] = 0L;
        }
        class397.field5904 = 0;
        if (arg0 != -1) {
            method2509(-79, -23);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lep;", line = 49)
    public static final class145 method2509(int arg0, int arg1) {
        field5612++;
        class145 var2 = (class145) class84.field1204.method2674((long) arg1, 22300);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class21.field280.method2261(0, arg1, 54);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class145 var4 = class185.method1124(arg0, var3);
            class84.field1204.method2673((long) arg1, var4, arg0 ^ 0x2CC9);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[B)Z", line = 70)
    public static final boolean method2510(int arg0, int arg1, int arg2, byte[] arg3) {
        field5611++;
        boolean var4 = true;
        class228 var5 = new class228(arg3);
        if (arg1 != 1836) {
            method2507(true);
        }
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1323(32767);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class104 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1327((byte) -64);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1348(-99);
                                    }
                                    int var10 = var5.method1327((byte) -64);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFD1) >> 6;
                                    var13 = var5.method1348(-112) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = arg2 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= (class192.field2574 - 1));
                    } while ((class364.field5262 - 1) <= var15);
                    var16 = class329.method2190((byte) 63, var6);
                } while (var13 == 22 && !class42.field584 && var16.field1455 == 0 && var16.field1483 != 1 && !var16.field1473);
                var9 = true;
                if (!var16.method707(arg1 + 63699)) {
                    var4 = false;
                    class267.field3851++;
                }
            }
        }
    }
}
