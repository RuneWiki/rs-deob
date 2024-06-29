import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class54 extends class101 {

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "[Lqb;")
    public class152[] field966;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Ltg;")
    public static class184 field965 = class135.method812("Angreifen", 3);

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Ltg;")
    public static class184 field963 = class135.method812("_", 3);

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Ltg;")
    public static class184 field964 = class135.method812("gr-Un:", 3);

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "[S")
    public static short[] field960 = new short[500];

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Ltg;")
    public static class184 field968 = class135.method812(": ", 3);

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILpf;ILka;)V")
    public static final void method290(int arg0, class147 arg1, int arg2, class97 arg3) {
        class79 var4 = new class79();
        var4.field1427 = arg3.method588((byte) -113);
        var4.field1422 = arg3.method599(arg2 - 20274);
        var4.field1426 = new int[var4.field1427];
        if (arg2 != 4271) {
            field963 = null;
        }
        var4.field1420 = new int[var4.field1427];
        var4.field1424 = new class96[var4.field1427];
        field961++;
        var4.field1439 = new byte[var4.field1427][][];
        var4.field1421 = new class96[var4.field1427];
        var4.field1428 = new int[var4.field1427];
        for (int var5 = 0; var5 < var4.field1427; var5++) {
            try {
                int var6 = arg3.method588((byte) -30);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg3.method596(-1).method1167(-92));
                    String var8 = new String(arg3.method596(-1).method1167(-54));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method599(-16003);
                    }
                    var4.field1428[var5] = var6;
                    var4.field1420[var5] = var9;
                    var4.field1421[var5] = arg1.method904(class59.method328(var7, arg2 + 1044304), 9, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg3.method596(-1).method1167(-57));
                    String var11 = new String(arg3.method596(-1).method1167(66));
                    int var12 = arg3.method588((byte) -60);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg3.method596(-1).method1167(-94));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method599(-16003);
                            var15[var16] = new byte[var17];
                            arg3.method571(0, arg2 ^ 0x1050, var17, var15[var16]);
                        }
                    }
                    var4.field1428[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class59.method328(var13[var19], 1048575);
                    }
                    var4.field1424[var5] = arg1.method898(var18, class59.method328(var10, 1048575), (byte) -127, var11);
                    var4.field1439[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1426[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1426[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1426[var5] = -3;
            } catch (Exception var23) {
                var4.field1426[var5] = -4;
            } catch (Throwable var24) {
                var4.field1426[var5] = -5;
            }
        }
        class179.field3414.method402(arg2 ^ 0xFFEF50, var4);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    public static void method291(byte arg0) {
        field968 = null;
        field963 = null;
        field960 = null;
        field965 = null;
        field964 = null;
        if (arg0 != -67) {
            method293(null, 100);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)Z")
    public final boolean method292(int arg0, byte arg1) {
        field962++;
        return arg1 == -6 ? this.field966[arg0].field2735 : true;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lvb;Lvb;IZ)V")
    public class54(class197 arg0, class197 arg1, int arg2, boolean arg3) {
        class69 var5 = new class69();
        int var6 = arg0.method1272(arg2, 19661);
        this.field966 = new class152[var6];
        int[] var7 = arg0.method1252(arg2, 126);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1249((byte) -89, var7[var8], arg2);
            class103 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class103 var12 = (class103) var5.method404(false); var12 != null; var12 = (class103) var5.method414(-127)) {
                if (var12.field1885 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1269(0, 0, var11);
                } else {
                    var13 = arg1.method1269(var11, 0, 0);
                }
                var10 = new class103(var11, var13);
                var5.method402(16777215, var10);
            }
            this.field966[var7[var8]] = new class152(var9, var10);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lad;I)V")
    public static final void method293(class5 arg0, int arg1) {
        int var2 = -96 / ((arg1 + 56) / 41);
        field967++;
        class155.method940(71, 200000, arg0);
    }
}
