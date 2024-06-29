import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class169 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "[I")
    public int[] field2536 = new int[256];

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[B")
    public byte[] field2539 = new byte[256];

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[[B")
    public byte[][] field2532 = new byte[6][258];

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[B")
    public byte[] field2534 = new byte[4096];

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public int field2540 = 0;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "[[I")
    public int[][] field2548 = new int[6][258];

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "[[I")
    public int[][] field2537 = new int[6][258];

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[I")
    public int[] field2546 = new int[6];

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[Z")
    public boolean[] field2561 = new boolean[16];

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[[I")
    public int[][] field2554 = new int[6][258];

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[I")
    public int[] field2535 = new int[257];

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[B")
    public byte[] field2542 = new byte[18002];

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[B")
    public byte[] field2551 = new byte[18002];

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "[I")
    public int[] field2566 = new int[16];

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public int field2564 = 0;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "[Z")
    public boolean[] field2562 = new boolean[256];

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2560 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "B")
    public byte field2541;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[B")
    public byte[] field2558;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "[B")
    public byte[] field2559;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lcc;")
    public static final class222 method1217(int arg0, int arg1) {
        field2543++;
        int var2 = arg0 >> 16;
        if (arg1 != 12180) {
            method1221(-77, (class4) null, 58, (class31) null);
        }
        int var3 = arg0 & 0xFFFF;
        if (class8.field144[var2] == null || class8.field144[var2][var3] == null) {
            boolean var4 = class48.method401(121, var2);
            if (!var4) {
                return null;
            }
        }
        return class8.field144[var2][var3];
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
    public static final void method1218(int arg0, int arg1) {
        field2531++;
        class69 var2 = class255.method1723((byte) 32, arg1, arg0);
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Z")
    public static final boolean method1219(byte arg0, int arg1) {
        field2557++;
        class79.field1210 = arg1 + 1 & 0xFFFF;
        if (arg0 != 12) {
            method1219((byte) -54, 37);
        }
        class69.field1097 = true;
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1220(byte arg0) {
        if (arg0 > -3) {
            method1221(-30, (class4) null, 44, (class31) null);
        }
        field2560 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILvd;ILha;)V")
    public static final void method1221(int arg0, class4 arg1, int arg2, class31 arg3) {
        field2545++;
        if (arg2 != -330) {
            method1217(-102, -49);
        }
        class183 var4 = new class183();
        var4.field2889 = arg3.method265(arg2 + 240);
        var4.field2890 = arg3.method300((byte) -30);
        var4.field2897 = new int[var4.field2889];
        var4.field2898 = new class139[var4.field2889];
        var4.field2888 = new int[var4.field2889];
        var4.field2892 = new int[var4.field2889];
        var4.field2887 = new byte[var4.field2889][][];
        var4.field2891 = new class139[var4.field2889];
        for (int var5 = 0; var5 < var4.field2889; var5++) {
            try {
                int var6 = arg3.method265(arg2 + 242);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method262(11386);
                    int var8 = 0;
                    String var9 = arg3.method262(11386);
                    if (var6 == 1) {
                        var8 = arg3.method300((byte) -30);
                    }
                    var4.field2897[var5] = var6;
                    var4.field2892[var5] = var8;
                    var4.field2891[var5] = arg1.method34(class122.method919(var7, (byte) -75), false, var9);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method262(arg2 + 11716);
                    String var11 = arg3.method262(arg2 + 11716);
                    int var12 = arg3.method265(-114);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method262(11386);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method300((byte) -30);
                            var15[var16] = new byte[var17];
                            arg3.method284(0, var17, 121, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field2897[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class122.method919(var13[var19], (byte) -75);
                    }
                    var4.field2898[var5] = arg1.method33(class122.method919(var10, (byte) -75), var18, false, var11);
                    var4.field2887[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2888[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2888[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2888[var5] = -3;
            } catch (Exception var23) {
                var4.field2888[var5] = -4;
            } catch (Throwable var24) {
                var4.field2888[var5] = -5;
            }
        }
        class220.field3360.method12(var4, arg2 ^ 0xFFFFFEBA);
    }
}
