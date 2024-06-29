import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class79 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Ljd;")
    public static class86 field1544 = class122.method868("(Z", true);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
    public static boolean field1549 = false;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Ljd;")
    public static class86 field1552 = class122.method868(")1o", true);

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Ljd;")
    public static class86 field1551 = class122.method868(" loggt sich ein)3", true);

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Ljd;")
    public static class86 field1545 = class15.method108(false, 160);

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
    public static boolean field1555 = true;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Ljd;")
    public static class86 field1557 = class122.method868(" loggt sich aus)3", true);

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ljd;")
    public static class86 field1558 = class122.method868("Cabbage", true);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lbj;")
    public static class151 field1553;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field1547;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[[Z")
    public static boolean[][] field1548;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILqk;Lof;)V")
    public static final void method555(int arg0, int arg1, class200 arg2, class254 arg3) {
        field1556++;
        class176 var4 = new class176();
        var4.field3198 = arg2.method1408((byte) -23);
        var4.field3190 = arg2.method1386(-4603);
        var4.field3196 = new int[var4.field3198];
        var4.field3192 = new byte[var4.field3198][][];
        var4.field3201 = new class26[var4.field3198];
        var4.field3194 = new int[var4.field3198];
        var4.field3197 = new class26[var4.field3198];
        var4.field3191 = new int[var4.field3198];
        for (int var5 = arg0; var5 < var4.field3198; var5++) {
            try {
                int var6 = arg2.method1408((byte) -66);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method1376((byte) 24).method619((byte) 65));
                    int var18 = 0;
                    String var19 = new String(arg2.method1376((byte) 24).method619((byte) 65));
                    if (var6 == 1) {
                        var18 = arg2.method1386(-4603);
                    }
                    var4.field3196[var5] = var6;
                    var4.field3194[var5] = var18;
                    var4.field3197[var5] = arg3.method1720((byte) 16, var19, class34.method248(var17, 1));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method1376((byte) 24).method619((byte) 65));
                    String var8 = new String(arg2.method1376((byte) 24).method619((byte) 65));
                    int var9 = arg2.method1408((byte) -128);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method1376((byte) 24).method619((byte) 65));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1386(-4603);
                            var12[var13] = new byte[var14];
                            arg2.method1425(0, var14, var12[var13], -4);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field3196[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class34.method248(var10[var16], 1);
                    }
                    var4.field3201[var5] = arg3.method1714(false, var15, class34.method248(var7, 1), var8);
                    var4.field3192[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3191[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3191[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3191[var5] = -3;
            } catch (Exception var23) {
                var4.field3191[var5] = -4;
            } catch (Throwable var24) {
                var4.field3191[var5] = -5;
            }
        }
        class226.field4103.method1731(arg0 - 47, var4);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        field1547 = null;
        field1557 = null;
        field1553 = null;
        field1544 = null;
        field1548 = null;
        field1558 = null;
        field1551 = null;
        if (arg0 != -4) {
            method555(24, -24, (class200) null, (class254) null);
        }
        field1545 = null;
        field1552 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)V")
    public static final void method557(byte arg0, boolean arg1) {
        field1543++;
        if (arg0 > -112) {
            method556(-124);
        }
        byte[][] var2 = class164.field3086;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class7.method51(21966);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class181.field3257[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFB) >> 3;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class168.field3103.length; var14++) {
                                if (class168.field3103[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class88.method646(var9, class122.field2388, var4, var5 * 8, var2[var14], var6 * 8, (var12 & 0x7) * 8, (var11 & 0x7) * 8, var10, arg1, 0);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class268.method1846(var5 * 8, 8, var4, 7, 8, var6 * 8);
                    }
                }
            }
        }
    }
}
