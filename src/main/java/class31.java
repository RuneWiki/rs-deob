import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class31 {

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lke;")
    public static class65 field811 = class1.method17("logo", -113);

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lie;")
    public static class53 field814 = new class53();

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[Lwc;")
    public static class129[] field817 = new class129[16384];

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lke;")
    public static class65 field820 = class1.method17("Empf-=nger:", -126);

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "J")
    public static long field816 = 0L;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lke;")
    private static class65 field819 = class1.method17("wave:", -115);

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field822 = 0;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lke;")
    public static class65 field824 = field819;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lke;")
    public static class65 field823 = class1.method17("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -115);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lae;")
    public class6 field804;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "[I")
    public static int[] field826;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "[Luc;")
    public static class119[] field825;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 6)
    public static void method246(int arg0) {
        field825 = null;
        field823 = null;
        field819 = null;
        field820 = null;
        if (arg0 > -99) {
            method249(90, 43);
        }
        field814 = null;
        field811 = null;
        field824 = null;
        field826 = null;
        field817 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILg;Lcc;)V", line = 25)
    public static final void method247(int arg0, int arg1, class39 arg2, class15 arg3) {
        class91 var4 = new class91();
        var4.field2409 = arg2.method334(108);
        var4.field2405 = arg2.method329(144752608);
        var4.field2402 = new class34[var4.field2409];
        var4.field2404 = new class34[var4.field2409];
        field821++;
        var4.field2410 = new int[var4.field2409];
        var4.field2399 = new int[var4.field2409];
        var4.field2407 = new int[var4.field2409];
        var4.field2398 = new byte[var4.field2409][][];
        for (int var5 = 0; var5 < var4.field2409; var5++) {
            try {
                int var6 = arg2.method334(115);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    int var7 = 0;
                    String var8 = new String(arg2.method303((byte) 80).method552(82));
                    String var9 = new String(arg2.method303((byte) -92).method552(45));
                    if (var6 == 1) {
                        var7 = arg2.method329(144752608);
                    }
                    var4.field2407[var5] = var6;
                    var4.field2399[var5] = var7;
                    var4.field2402[var5] = arg3.method92(var9, class20.method166(var8, (byte) -125), 116);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method303((byte) 111).method552(64));
                    String var11 = new String(arg2.method303((byte) -81).method552(62));
                    int var12 = arg2.method334(103);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method303((byte) 97).method552(66));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method329(144752608);
                            var15[var16] = new byte[var17];
                            arg2.method338(var15[var16], 0, var17, 29);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field2407[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class20.method166(var13[var19], (byte) 119);
                    }
                    var4.field2404[var5] = arg3.method100(var11, var18, (byte) -25, class20.method166(var10, (byte) 116));
                    var4.field2398[var5] = var15;
                }
            } catch (ClassNotFoundException var21) {
                var4.field2410[var5] = -1;
            } catch (SecurityException var22) {
                var4.field2410[var5] = -2;
            } catch (NullPointerException var23) {
                var4.field2410[var5] = -3;
            } catch (Exception var24) {
                var4.field2410[var5] = -4;
            } catch (Throwable var25) {
                var4.field2410[var5] = -5;
            }
        }
        field814.method425(var4, 16);
        int var20 = -50 / ((arg0 + 36) / 36);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 148)
    public static final void method248(int arg0, int arg1) {
        field803++;
        if (class93.field2464 == null) {
            return;
        }
        if (class12.field246 == 0) {
            if (class35.field890 >= 0) {
                class35.field890 = arg0;
                class93.field2464.method86(0, arg0, 0);
            }
        } else if (class58.field1593 != null) {
            class23.field572 = arg0;
        }
        if (arg1 != -1909) {
            method249(-96, -125);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z", line = 180)
    public static final boolean method249(int arg0, int arg1) {
        field815++;
        if (arg0 != 1553) {
            method249(44, 95);
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class23.field557[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 2;
    }
}
