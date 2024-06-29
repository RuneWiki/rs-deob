import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class81 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lrd;")
    public static class173 field1587 = class133.method843("leuchten2:", 36);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "J")
    public static volatile long field1592 = 0L;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "[Lsa;")
    public static class180[] field1593;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lrd;")
    public static final class173 method502(int arg0, byte arg1) {
        int var2 = -98 % ((-arg1 - 21) / 49);
        field1588++;
        class173 var3 = new class173();
        var3.field3415 = new byte[arg0];
        var3.field3379 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method503(int arg0) {
        if (arg0 != -17448) {
            return;
        }
        field1589++;
        Object var1 = class62.field1221;
        synchronized (class62.field1221) {
            if (class168.field3243 != 0) {
                class168.field3243 = 1;
                try {
                    class62.field1221.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method504(int arg0) {
        int var1 = 85 / ((arg0 + 74) / 33);
        field1587 = null;
        field1593 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILrd;I)V")
    public static final void method505(int arg0, class173 arg1, int arg2) {
        class165.field3175.method1023(arg0, -21822);
        class165.field3175.method750(arg2, false);
        class165.field3175.method733((byte) -29, arg1.method1132(arg0 - 33));
        class57.field1123++;
        field1591++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method506(int arg0, byte[] arg1, int arg2, int arg3) {
        field1590++;
        boolean var4 = true;
        if (arg2 != -23) {
            method504(-1);
        }
        class121 var5 = new class121(arg1);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method737(1086075528);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var14;
                class4 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method734(-1);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method751((byte) -117);
                                    }
                                    int var10 = var5.method734(arg2 ^ 0x16);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = arg3 + var12;
                                    var14 = var5.method751((byte) 114) >> 2;
                                    var15 = var11 + arg0;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class182.method1237(true, var6);
                } while (var14 == 22 && class107.field2003 && var16.field80 == 0 && var16.field45 != 1 && !var16.field93);
                if (!var16.method36(true)) {
                    var4 = false;
                    class217.field4197++;
                }
                var9 = true;
            }
        }
    }
}
