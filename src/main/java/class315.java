import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class315 extends class659 {

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "Ljb;")
    public static class519 field4436 = new class519(34, 20);

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "B")
    public static byte field4452 = -6;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
    public int field4440;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "Lte;")
    public static class639 field4447;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "Ltq;")
    public class654 field4443;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "Ljava/lang/String;")
    public String field4450;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "[I")
    public int[] field4444;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "[I")
    public int[] field4446;

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "[J")
    public long[] field4448;

    @OriginalMember(owner = "client!nba", name = "H", descriptor = "[Ltca;")
    public class184[] field4451;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "[Ljava/lang/String;")
    public String[] field4439;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[I[Ljava/lang/String;IB)V")
    public static final void method2013(int arg0, int[] arg1, String[] arg2, int arg3, byte arg4) {
        field4438++;
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method2013(var6 - 1, arg1, arg2, arg3, (byte) -52);
            method2013(arg0, arg1, arg2, var6 + 1, (byte) -52);
        }
        if (arg4 != -52) {
            method2013(-86, null, null, 115, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILha;)V")
    public static final void method2014(int arg0, class66 arg1) {
        field4449++;
        if (class605.field8198.method684(-74) == 0) {
            return;
        }
        if (class125.field1721.field5141.method2541(43) == 0) {
            for (class245 var4 = (class245) class605.field8198.method679((byte) -86); var4 != null; var4 = (class245) class605.field8198.method681(-83)) {
                class16.field156.method2120(arg1, false, var4.field3204, var4.field3205, var4.field3208 ? class625.field8475.field10355 : null, class734.field9957, var4.field3201, 36, false, arg1, var4.field3207, var4.field3202);
                var4.method1102((byte) 61);
            }
            class166.method1137(false);
        } else {
            if (class158.field2124 == null) {
                Canvas var2 = new Canvas();
                var2.setSize(36, 32);
                class158.field2124 = class30.method169(class270.field3942, 0, (byte) -114, class655.field8851, 0, var2);
                class158.field2130 = class158.field2124.method502(class278.method1822(class410.field5827, 0, class728.field9886, 0), class162.method1122(class490.field6826, class728.field9886, 0), true);
            }
            for (class245 var3 = (class245) class605.field8198.method679((byte) -86); var3 != null; var3 = (class245) class605.field8198.method681(-63)) {
                class16.field156.method2120(class158.field2124, false, var3.field3204, var3.field3205, var3.field3208 ? class625.field8475.field10355 : null, class158.field2130, var3.field3201, 36, false, arg1, var3.field3207, var3.field3202);
                var3.method1102((byte) 95);
            }
        }
        int var5 = -125 % ((37 - arg0) / 58);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method2015(int arg0) {
        field4447 = null;
        if (arg0 <= 37) {
            method2014(-55, null);
        }
        field4436 = null;
    }
}
