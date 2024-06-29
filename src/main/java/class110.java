import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 {

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field2342 = 0;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field2339 = 0;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lpe;")
    private static class109 field2333 = class141.method1120("Ok", 0);

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lpe;")
    public static class109 field2334 = class141.method1120("Bitte entfernen Sie ", 0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lpe;")
    public static class109 field2328 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lpe;")
    private static class109 field2343 = class141.method1120("red:", 0);

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lpe;")
    public static class109 field2341 = field2343;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field2327 = -1;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lpe;")
    public static class109 field2345 = class141.method1120("headicons_hint", 0);

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Lpe;")
    private static class109 field2352 = class141.method1120("yellow:", 0);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lpe;")
    public static class109 field2335 = field2352;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lpe;")
    public static class109 field2331 = field2333;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Lpe;")
    public static class109 field2351 = field2343;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lpe;")
    public static class109 field2332 = field2352;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lma;")
    public class84 field2329;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lma;")
    public class84 field2336;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLbe;Ldf;)V")
    public static final void method910(int arg0, byte arg1, class13 arg2, class28 arg3) {
        field2337++;
        class147 var4 = new class147();
        var4.field3197 = arg2.method142(27467);
        var4.field3206 = arg2.method112(false);
        var4.field3205 = new class21[var4.field3197];
        var4.field3199 = new int[var4.field3197];
        var4.field3200 = new byte[var4.field3197][][];
        var4.field3196 = new class21[var4.field3197];
        var4.field3202 = new int[var4.field3197];
        var4.field3198 = new int[var4.field3197];
        for (int var5 = 0; var5 < var4.field3197; var5++) {
            try {
                int var6 = arg2.method142(27467);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method140(0).method874(101));
                    String var18 = new String(arg2.method140(0).method874(108));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method112(false);
                    }
                    var4.field3202[var5] = var6;
                    var4.field3198[var5] = var19;
                    var4.field3205[var5] = arg3.method247(class86.method719(var17, (byte) 4), -74, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method140(0).method874(119));
                    String var8 = new String(arg2.method140(0).method874(105));
                    int var9 = arg2.method142(27467);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method140(0).method874(102));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method112(false);
                            var12[var13] = new byte[var14];
                            arg2.method119(var12[var13], (byte) -95, var14, 0);
                        }
                    }
                    var4.field3202[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class86.method719(var10[var16], (byte) 45);
                    }
                    var4.field3196[var5] = arg3.method246(var8, class86.method719(var7, (byte) -123), var15, -105);
                    var4.field3200[var5] = var12;
                }
            } catch (ClassNotFoundException var21) {
                var4.field3199[var5] = -1;
            } catch (SecurityException var22) {
                var4.field3199[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field3199[var5] = -3;
            } catch (Exception var24) {
                var4.field3199[var5] = -4;
            } catch (Throwable var25) {
                var4.field3199[var5] = -5;
            }
        }
        int var20 = 18 / ((23 - arg1) / 55);
        class18.field448.method188(-2, var4);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILe;II)V")
    public static final void method911(int arg0, int arg1, int arg2, class29 arg3, int arg4, int arg5) {
        int var6 = -55 / ((arg0 + 51) / 63);
        field2340++;
        int var7 = arg4 * arg4 + arg5 * arg5;
        if (var7 <= 4225 || var7 >= 90000) {
            class124.method1011(arg2, arg1, arg5, arg4, false, arg3);
            return;
        }
        int var8 = class139.field3030 + class100.field2104 & 0x7FF;
        int var9 = class105.field2210[var8];
        int var10 = var9 * 256 / (class68.field1368 + 256);
        int var11 = class105.field2221[var8];
        int var12 = var11 * 256 / (class68.field1368 + 256);
        int var13 = arg4 * var10 - arg5 * var12 >> 16;
        int var14 = arg4 * var12 + arg5 * var10 >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) (Math.sin(var15) * 63.0D);
        int var18 = (int) (Math.cos(var15) * 57.0D);
        class6.field155.method263(arg1 + var17 + 94 + 4 - 10, arg2 + 83 - var18 + -20, 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method912(int arg0) {
        field2333 = null;
        int var1 = -73 / ((arg0 - 41) / 61);
        field2332 = null;
        field2341 = null;
        field2343 = null;
        field2334 = null;
        field2335 = null;
        field2352 = null;
        field2345 = null;
        field2351 = null;
        field2328 = null;
        field2331 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method913(byte arg0) {
        if (arg0 >= -9) {
            field2343 = null;
        }
        class35 var1 = (class35) class83.field1769.method195((byte) 105);
        field2350++;
        while (var1 != null) {
            if (class75.field1513 != var1.field751 || var1.field770) {
                var1.method101((byte) 120);
            } else if (class12.field264 >= var1.field757) {
                var1.method355(class139.field3042, (byte) 120);
                if (var1.field770) {
                    var1.method101((byte) 124);
                } else {
                    class147.field3201.method660(var1.field751, var1.field788, var1.field765, var1.field766, 60, var1, 0, -1, false);
                }
            }
            var1 = (class35) class83.field1769.method198((byte) -95);
        }
    }
}
