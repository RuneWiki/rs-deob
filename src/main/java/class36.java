import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class36 extends class30 {

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
    public static int[] field724 = new int[128];

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Z")
    public static boolean field720 = false;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lia;")
    private static class257 field726 = class28.method234(-124, "Loaded input handler");

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Lia;")
    public static class257 field719 = class28.method234(-12, "scrollbar");

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lia;")
    public static class257 field721 = field726;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public static int[] field718 = new int[4096];

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "[I")
    public int[] field716;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
    public int[] field717;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "[I")
    public int[] field728;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[Lfa;")
    public class176[] field714;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "[Lfa;")
    public class176[] field722;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[[[B")
    public byte[][][] field715;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public static void method297(byte arg0) {
        if (arg0 < 44) {
            field720 = false;
        }
        field718 = null;
        field719 = null;
        field724 = null;
        field721 = null;
        field726 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lk;Lmi;II)V")
    public static final void method298(class152 arg0, class100 arg1, int arg2, int arg3) {
        field723++;
        class36 var4 = new class36();
        var4.field725 = arg0.method1051((byte) 120);
        var4.field727 = arg0.method1042(122);
        var4.field716 = new int[var4.field725];
        var4.field714 = new class176[var4.field725];
        var4.field715 = new byte[var4.field725][][];
        var4.field722 = new class176[var4.field725];
        var4.field717 = new int[var4.field725];
        var4.field728 = new int[var4.field725];
        for (int var5 = 0; var5 < var4.field725; var5++) {
            try {
                int var6 = arg0.method1051((byte) -108);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method1039(1995).method1667((byte) 32));
                    String var8 = new String(arg0.method1039(arg3 ^ 0xFFFFF836).method1667((byte) 32));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method1042(125);
                    }
                    var4.field717[var5] = var6;
                    var4.field716[var5] = var9;
                    var4.field714[var5] = arg1.method716(class55.method418((byte) 123, var7), (byte) -104, var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method1039(arg3 ^ 0xFFFFF836).method1667((byte) 32));
                    String var11 = new String(arg0.method1039(1995).method1667((byte) 32));
                    int var12 = arg0.method1051((byte) -95);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method1039(1995).method1667((byte) 32));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method1042(arg3 ^ 0xFFFFFF8F);
                            var15[var16] = new byte[var17];
                            arg0.method1050(var15[var16], 0, (byte) 103, var17);
                        }
                    }
                    var4.field717[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class55.method418((byte) 81, var13[var19]);
                    }
                    var4.field722[var5] = arg1.method709(var11, 95, var18, class55.method418((byte) 126, var10));
                    var4.field715[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field728[var5] = -1;
            } catch (SecurityException var21) {
                var4.field728[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field728[var5] = -3;
            } catch (Exception var23) {
                var4.field728[var5] = -4;
            } catch (Throwable var24) {
                var4.field728[var5] = -5;
            }
        }
        class93.field1765.method287(var4, 0);
        if (arg3 != -3) {
            field720 = true;
        }
    }
}
