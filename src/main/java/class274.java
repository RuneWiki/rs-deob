import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class274 extends class351 {

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field4251 = 128;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "Z")
    public static boolean field4252 = true;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "[I")
    public static int[] field4253 = new int[4096];

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field4254 = -1;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 4)
    public static final void method2016(int arg0) {
        if (arg0 == 21560) {
            field4249++;
            class62.method623(25821, false);
            System.gc();
            class175.method1370(25, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 17)
    public static final String method2017(String[] arg0, int arg1, int arg2, int arg3) {
        field4255++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg0[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg3;
            int var6 = 0;
            int var7 = arg2;
            if (arg1 != 7933) {
                field4251 = -86;
            }
            while (var7 < var5) {
                String var8 = arg0[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
                var7++;
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg2; var10 < var5; var10++) {
                String var11 = arg0[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 101)
    public static void method2018(int arg0) {
        if (arg0 == -1) {
            field4253 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 119)
    public static final void method2019(int arg0) {
        field4250++;
        class294.field4576.method655(-1);
        class211.field3246.method655(-1);
        if (arg0 >= -58) {
            method2017((String[]) null, -83, 102, -46);
        }
    }
}
