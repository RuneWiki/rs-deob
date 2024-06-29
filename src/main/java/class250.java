import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class250 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[[[I")
    public static int[][][] field4151 = new int[2][][];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lqi;")
    public static class131 field4152;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Llc;")
    public static class86 field4157;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lae;")
    public static class174[] field4153;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1784(int arg0) {
        field4151 = null;
        field4153 = null;
        field4157 = null;
        int var1 = -114 / ((arg0 - 79) / 47);
        field4152 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILv;)Lee;")
    public static final class288 method1785(int arg0, class152 arg1) {
        if (arg0 != -1) {
            method1786(0);
        }
        field4149++;
        return new class288(arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1090(12107), arg1.method1128((byte) -122), arg1.method1111(arg0 + 256));
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static final void method1786(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class156.field2574[var1] = false;
        }
        class121.field1765 = -1;
        class176.field2853 = 1;
        class241.field3839 = 0;
        class187.field3007 = 0;
        field4150++;
        class168.field2705 = -1;
        if (arg0 >= -99) {
            field4154 = -28;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)J")
    public static final long method1787(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        return var3 == null || var3.field4518 == null ? 0L : var3.field4518.field2600;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1788(int arg0, byte arg1, int arg2, String[] arg3) {
        field4155++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg0;
            int var6 = 0;
            if (arg1 >= -81) {
                field4151 = null;
            }
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
