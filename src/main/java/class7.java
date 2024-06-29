import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class class7 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Lph;")
    public static class229 field91 = class266.method1858("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field94 = 5063219;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lph;")
    public static class229 field92 = class266.method1858("tbrefresh", 0);

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lsi;")
    public static class66 field95;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 18)
    public static final void method45(int arg0) {
        class184.field2985.method1415(-18218);
        if (arg0 != 0) {
            method49((byte) 96);
        }
        field90++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lhb;B)Ldh;", line = 29)
    public static final class166 method46(class164 arg0, byte arg1) {
        field93++;
        class166 var2 = new class166();
        var2.field2703 = arg0.method1161(true);
        if (arg1 != 48) {
            method46((class164) null, (byte) -128);
        }
        var2.field2714 = class224.method1560((byte) -61, var2.field2703);
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILwe;Lhb;I)V", line = 51)
    public static final void method48(int arg0, class92 arg1, class164 arg2, int arg3) {
        class22 var4 = new class22();
        field96++;
        var4.field286 = arg2.method1178(8);
        var4.field280 = arg2.method1191(31776);
        var4.field285 = new class247[var4.field286];
        var4.field284 = new int[var4.field286];
        var4.field281 = new class247[var4.field286];
        var4.field290 = new int[var4.field286];
        var4.field291 = new byte[var4.field286][][];
        var4.field293 = new int[var4.field286];
        for (int var5 = 0; var5 < var4.field286; var5++) {
            try {
                int var6 = arg2.method1178(8);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method1190(arg0 - 27035).method1599(-122));
                    String var18 = new String(arg2.method1190(0).method1599(-127));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1191(31776);
                    }
                    var4.field293[var5] = var6;
                    var4.field284[var5] = var19;
                    var4.field285[var5] = arg1.method695(var18, class70.method545(116, var17), class101.method775(arg0, 27088));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method1190(0).method1599(-128));
                    String var8 = new String(arg2.method1190(arg0 ^ 0x699B).method1599(-117));
                    int var9 = arg2.method1178(arg0 - 27027);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method1190(0).method1599(-120));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1191(arg0 + 4741);
                            var12[var13] = new byte[var14];
                            arg2.method1192(var14, var12[var13], 0, 0);
                        }
                    }
                    var4.field293[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class70.method545(arg0 - 26967, var10[var16]);
                    }
                    var4.field281[var5] = arg1.method686(var8, class70.method545(59, var7), 0, var15);
                    var4.field291[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field290[var5] = -1;
            } catch (SecurityException var26) {
                var4.field290[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field290[var5] = -3;
            } catch (Exception var28) {
                var4.field290[var5] = -4;
            } catch (Throwable var29) {
                var4.field290[var5] = -5;
            }
        }
        if (arg0 != 27035) {
            method45(-119);
        }
        class157.field2555.method1582(var4, arg0 - 27031);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 168)
    public static void method49(byte arg0) {
        field95 = null;
        field91 = null;
        if (arg0 < 64) {
            field91 = (class229) null;
        }
        field92 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)I")
    public abstract int method43(byte arg0, int arg1);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(BI)[B")
    public abstract byte[] method44(byte arg0, int arg1);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
    public abstract void method47(int arg0, byte arg1);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)Loa;")
    public abstract class107 method50(int arg0);
}
