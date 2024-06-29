import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class147 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2371 = -1;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[B")
    public static byte[] field2372 = new byte[520];

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "J")
    public static long field2366 = 0L;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[C")
    public static char[] field2375 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B)Z", line = 5)
    public static final boolean method1045(int arg0, byte[] arg1) {
        field2374++;
        class313 var2 = new class313(arg1);
        int var3 = var2.method2224(-119);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = ~var2.method2224(-128) == arg0;
        if (var4) {
            class319.method2303(var2, (byte) -116);
        }
        class322.method2313((byte) -128, var2);
        return true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lfh;ILuo;I)V", line = 38)
    public static final void method1046(class313 arg0, int arg1, class274 arg2, int arg3) {
        field2368++;
        class267 var4 = new class267();
        var4.field4404 = arg0.method2224(-127);
        var4.field4397 = arg0.method2231((byte) -123);
        var4.field4396 = new class158[var4.field4404];
        var4.field4390 = new class158[var4.field4404];
        var4.field4395 = new int[var4.field4404];
        var4.field4391 = new int[var4.field4404];
        var4.field4399 = new byte[var4.field4404][][];
        var4.field4398 = new int[var4.field4404];
        for (int var5 = 0; var5 < var4.field4404; var5++) {
            try {
                int var6 = arg0.method2224(arg1 - 120);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method2198(-430);
                    String var8 = arg0.method2198(arg1 ^ 0x1AE);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method2231((byte) -127);
                    }
                    var4.field4395[var5] = var6;
                    var4.field4391[var5] = var9;
                    var4.field4390[var5] = arg2.method1939(108, var8, class86.method566(116, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method2198(-430);
                    String var11 = arg0.method2198(-430);
                    int var12 = arg0.method2224(arg1 ^ 0x7A);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method2198(arg1 - 426);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method2231((byte) -128);
                            var15[var16] = new byte[var17];
                            arg0.method2237(var15[var16], 2, 0, var17);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field4395[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class86.method566(-120, var13[var19]);
                    }
                    var4.field4396[var5] = arg2.method1944(8, var11, var18, class86.method566(-80, var10));
                    var4.field4399[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4398[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4398[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4398[var5] = -3;
            } catch (Exception var28) {
                var4.field4398[var5] = -4;
            } catch (Throwable var29) {
                var4.field4398[var5] = -5;
            }
        }
        if (arg1 != -4) {
            method1047(true, (String) null, (String) null, -111);
        }
        class69.field1067.method1077(16711935, var4);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V", line = 164)
    public static final void method1047(boolean arg0, String arg1, String arg2, int arg3) {
        if (arg0) {
            field2371 = -86;
        }
        class358.method2491((String) null, -1, arg2, arg1, -21381, arg3);
        field2367++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 178)
    public static void method1048(int arg0) {
        field2372 = null;
        if (arg0 != -3) {
            method1047(false, (String) null, (String) null, 120);
        }
        field2375 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V", line = 192)
    public static final void method1049(int arg0, int arg1, int arg2) {
        if (arg2 == 31747) {
            field2370++;
            class211 var3 = class17.method115(13, arg1, 4086);
            var3.method1433(true);
            var3.field3210 = arg0;
        }
    }
}
