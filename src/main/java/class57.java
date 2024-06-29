import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class57 extends class263 {

    @OriginalMember(owner = "client!il", name = "ab", descriptor = "Lta;")
    public static class197 field849 = new class197(64);

    @OriginalMember(owner = "client!il", name = "cb", descriptor = "F")
    public static float field851;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!il", name = "W", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!il", name = "X", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!il", name = "bb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!il", name = "db", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!il", name = "fb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!il", name = "gb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!il", name = "hb", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!il", name = "ib", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!il", name = "eb", descriptor = "Llb;")
    public static class211 field853;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "[I")
    public static int[] field843;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIIII)I", line = 5)
    public static final int method512(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -14993) {
            method517(true);
        }
        field845++;
        int var5 = arg0 & 0xF;
        int var6 = var5 >= 8 ? arg2 : arg1;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg4) : arg2;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILlb;I)Z", line = 33)
    public static final boolean method513(int arg0, class211 arg1, int arg2) {
        field848++;
        byte[] var3 = arg1.method1505(-110, arg0);
        if (var3 == null) {
            return false;
        }
        class7.method58((byte) 29, var3);
        if (arg2 != 11332) {
            method512(-6, -115, 57, 101, -62);
        }
        return true;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V", line = 53)
    public static final void method514(boolean arg0) {
        field854++;
        class174 var1 = new class174();
        int var2 = 0;
        if (arg0) {
            field849 = (class197) null;
        }
        while (var2 < 13) {
            for (int var3 = 0; var3 < 13; var3++) {
                class170.field2537[var2][var3] = var1;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V", line = 85)
    public static final void method515(int arg0) {
        if (arg0 != 13128) {
            method515(-35);
        }
        field850++;
        class249.field3738 = null;
        class19.method136();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 100)
    public static final String method516(Throwable arg0, byte arg1) throws IOException {
        field847++;
        String var3;
        if (arg0 instanceof class49) {
            class49 var2 = (class49) arg0;
            arg0 = var2.field760;
            var3 = var2.field758 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 != 77) {
            field855 = 14;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(Z)V", line = 172)
    public static void method517(boolean arg0) {
        field853 = null;
        field849 = null;
        if (arg0) {
            field843 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)[[I", line = 184)
    public final int[][] method99(int arg0, int arg1) {
        if (arg1 != -23387) {
            method512(-12, 15, 11, 25, -100);
        }
        field846++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203 && this.method1817(-106)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field3934 * this.field3934;
            for (int var8 = 0; var8 < class287.field4415; var8++) {
                int var9 = this.field3933[var8 % this.field3938 + var7];
                var6[var8] = class142.method1078(4080, var9 << 4);
                var5[var8] = class142.method1078(65280, var9) >> 4;
                var4[var8] = class142.method1078(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(II)I", line = 232)
    public static final int method518(int arg0, int arg1) {
        int var2 = 113 % ((arg0) / 61);
        field856++;
        return arg1 == 16711935 ? -1 : class86.method709(-100, arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)V", line = 248)
    public static final void method519(int arg0, long arg1) {
        field852++;
        if (arg1 == 0L) {
            return;
        }
        if (class291.field4577 >= 100) {
            class38.method352(false, 0, class291.field4573, "");
            return;
        }
        String var3 = class188.method1358(95, arg1);
        for (int var4 = 0; var4 < class291.field4577; var4++) {
            if (class302.field4742[var4] == arg1) {
                class38.method352(false, 0, var3 + class327.field5073, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class314.field4873; var5++) {
            if (class37.field549[var5] == arg1) {
                class38.method352(false, 0, class54.field813 + var3 + class299.field4693, "");
                return;
            }
        }
        if (var3.equals(class235.field3602.field1895)) {
            class38.method352(false, 0, class218.field3435, "");
            return;
        }
        class302.field4742[class291.field4577] = arg1;
        class190.field3041[class291.field4577++] = class176.method1272((byte) -74, arg1);
        class271.field4090 = class319.field4980;
        class302.field4732++;
        class159.field2372.method59(119, (byte) 73);
        if (arg0 != 18604) {
            field851 = -0.68152267F;
        }
        class159.field2372.method261(1523335144, arg1);
    }
}
