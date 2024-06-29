import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class147 extends class69 {

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lha;")
    public static class46 field2650 = class271.method1828("Abbrechen", -46);

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Ldl;")
    public static class43 field2651 = new class43(5000);

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field2657 = 0;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1090(int arg0) {
        field2651 = null;
        field2650 = null;
        if (arg0 != -4) {
            field2650 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        field2649++;
        if (arg0 != 0) {
            method1090(-78);
        }
        class152.field2698.method84(-32377);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lrc;Lwe;BI)V")
    public static final void method1092(class9 arg0, class75 arg1, byte arg2, int arg3) {
        field2654++;
        class57 var4 = new class57();
        var4.field959 = arg1.method558(1);
        var4.field960 = arg1.method562((byte) -71);
        var4.field952 = new int[var4.field959];
        var4.field949 = new class165[var4.field959];
        var4.field954 = new int[var4.field959];
        var4.field953 = new class165[var4.field959];
        var4.field963 = new byte[var4.field959][][];
        var4.field961 = new int[var4.field959];
        for (int var5 = 0; var5 < var4.field959; var5++) {
            try {
                int var6 = arg1.method558(1);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method577(0).method311(0));
                    int var8 = 0;
                    String var9 = new String(arg1.method577(0).method311(0));
                    if (var6 == 1) {
                        var8 = arg1.method562((byte) -71);
                    }
                    var4.field954[var5] = var6;
                    var4.field952[var5] = var8;
                    var4.field949[var5] = arg0.method43(var9, (byte) 8, class156.method1149(var7, true));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method577(0).method311(0));
                    String var11 = new String(arg1.method577(0).method311(0));
                    int var12 = arg1.method558(1);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method577(0).method311(0));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method562((byte) -71);
                            var15[var16] = new byte[var17];
                            arg1.method553(-1, var17, var15[var16], 0);
                        }
                    }
                    var4.field954[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class156.method1149(var13[var19], true);
                    }
                    var4.field953[var5] = arg0.method37(class156.method1149(var10, true), var18, var11, false);
                    var4.field963[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field961[var5] = -1;
            } catch (SecurityException var21) {
                var4.field961[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field961[var5] = -3;
            } catch (Exception var23) {
                var4.field961[var5] = -4;
            } catch (Throwable var24) {
                var4.field961[var5] = -5;
            }
        }
        class131.field2395.method265(var4, -501);
        if (arg2 <= 48) {
            method1090(28);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
    public static final void method1093(byte arg0) {
        field2656++;
        class193.field3462.method83(25216);
        if (arg0 != -80) {
            method1092((class9) null, (class75) null, (byte) 25, 108);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
    public class147(int arg0, int arg1) {
        this.field2653 = arg0;
        this.field2646 = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method1094(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2652++;
        if (arg2 != -16365) {
            field2648 = -14;
        }
        int var5 = arg1;
        int var6 = 0;
        class24.method170((byte) 33, arg4 - arg1, class6.field100[arg0], arg1 + arg4, arg3);
        int var7 = -1;
        int var8 = -arg1;
        while (var6 < var5) {
            var6++;
            var7 += 2;
            var8 += var7;
            if (var8 >= 0) {
                var5--;
                var8 -= var5 << 1;
                int[] var9 = class6.field100[arg0 + var5];
                int var10 = arg4 + var6;
                int[] var11 = class6.field100[arg0 - var5];
                int var12 = arg4 - var6;
                class24.method170((byte) 33, var12, var9, var10, arg3);
                class24.method170((byte) 33, var12, var11, var10, arg3);
            }
            int var13 = arg4 + var5;
            int var14 = arg4 - var5;
            int[] var15 = class6.field100[arg0 + var6];
            int[] var16 = class6.field100[arg0 - var6];
            class24.method170((byte) 33, var14, var15, var13, arg3);
            class24.method170((byte) 33, var14, var16, var13, arg3);
        }
    }
}
