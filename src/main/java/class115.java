import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class115 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lma;")
    public static class5 field1712 = class12.method119("<)4col> x", (byte) 105);

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lma;")
    private static class5 field1717 = class12.method119("cyan:", (byte) 55);

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lma;")
    public static class5 field1720 = field1717;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lma;")
    public static class5 field1718 = field1717;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lsj;")
    public static class181 field1713;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[S")
    public static short[] field1714;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 11)
    public static final void method754(int arg0) {
        if (arg0 != -27148) {
            return;
        }
        for (int var1 = -1; var1 < class175.field2675; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class118.field1785[var1];
            }
            class91 var3 = class267.field4593[var2];
            if (var3 != null) {
                class248.method1734(var3.field226, 255, var3);
            }
        }
        field1715++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lhf;Lii;II)V", line = 46)
    public static final void method755(class154 arg0, class221 arg1, int arg2, int arg3) {
        class151 var4 = new class151();
        var4.field2195 = arg1.method1509(true);
        field1716++;
        var4.field2194 = arg1.method1517((byte) -108);
        var4.field2202 = new class32[var4.field2195];
        var4.field2197 = new int[var4.field2195];
        var4.field2196 = new int[var4.field2195];
        var4.field2186 = new int[var4.field2195];
        var4.field2188 = new byte[var4.field2195][][];
        var4.field2185 = new class32[var4.field2195];
        if (arg2 != 30200) {
            field1714 = (short[]) null;
        }
        for (int var5 = 0; var5 < var4.field2195; var5++) {
            try {
                int var6 = arg1.method1509(true);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg1.method1501((byte) -56).method67(127));
                    int var8 = 0;
                    String var9 = new String(arg1.method1501((byte) -56).method67(arg2 ^ 0x75A4));
                    if (var6 == 1) {
                        var8 = arg1.method1517((byte) -111);
                    }
                    var4.field2196[var5] = var6;
                    var4.field2197[var5] = var8;
                    var4.field2202[var5] = arg0.method974(class216.method1422((byte) 105, var7), var9, 101);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg1.method1501((byte) -56).method67(119));
                    String var11 = new String(arg1.method1501((byte) -56).method67(arg2 - 30080));
                    int var12 = arg1.method1509(true);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg1.method1501((byte) -56).method67(99));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method1517((byte) -114);
                            var15[var16] = new byte[var17];
                            arg1.method1537(var17, 0, var15[var16], 2);
                        }
                    }
                    var4.field2196[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class216.method1422((byte) 104, var13[var19]);
                    }
                    var4.field2185[var5] = arg0.method988(var18, class259.method1798(arg2, 30200), class216.method1422((byte) 115, var10), var11);
                    var4.field2188[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2186[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2186[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2186[var5] = -3;
            } catch (Exception var28) {
                var4.field2186[var5] = -4;
            } catch (Throwable var29) {
                var4.field2186[var5] = -5;
            }
        }
        class113.field1686.method1485(-8564, var4);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 164)
    public static void method756(int arg0) {
        field1720 = null;
        field1712 = null;
        if (arg0 == 0) {
            field1717 = null;
            field1713 = null;
            field1714 = null;
            field1718 = null;
        }
    }
}
