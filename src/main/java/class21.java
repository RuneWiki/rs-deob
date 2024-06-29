import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 extends class107 {

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field386 = 0;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    private int field387 = 4096;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field388 = -1;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lub;")
    public static class88 field394 = new class88();

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lpj;")
    public static class237 field399 = class33.method353("", 72);

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field396 = -1;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "Lpj;")
    public static class237 field400 = class33.method353("Schlie-8en", 82);

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lfa;")
    public static class239 field398;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "[[[B")
    public static byte[][][] field391;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method204(Throwable arg0, int arg1) throws IOException {
        ++field395;
        String var3;
        if (arg0 instanceof class50) {
            class50 var2 = (class50) arg0;
            var3 = var2.field1074 + " | ";
            arg0 = var2.field1072;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        int var8 = -123 / ((arg1 - -62) / 59);
        String var9 = var7.readLine();
        while (true) {
            while (true) {
                String var10 = var7.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && ~var12 <= -1) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (~var14 <= -1) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(1 + var16.lastIndexOf(32));
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            return null;
        } else {
            int[] var3 = super.field1921.method1388(arg1, (byte) -26);
            if (super.field1921.field3539) {
                int[] var4 = this.method797(0, arg1, (byte) 114);
                for (int var5 = 0; var5 < class106.field1862; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field386 <= var6 && var6 <= this.field387 ? 4096 : 0;
                }
            }
            ++field390;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method205(int arg0, int arg1) {
        ++field392;
        class34.field735.method939(arg1, 1);
        class232.field4023.method939(arg1, arg0 ^ 40);
        class127.field2215.method939(arg1, 1);
        if (arg0 != 41) {
            field394 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 != -32513) {
            this.field386 = -111;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field387 = arg0.method339(-16777216);
            }
        } else {
            this.field386 = arg0.method339(-16777216);
        }
        ++field393;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field394 = null;
        field398 = null;
        field400 = null;
        field399 = null;
        field391 = null;
        if (arg0 != -41) {
            field400 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 < -10) {
            ++field389;
            int var9 = arg7 - arg0;
            int var10 = -arg8 + arg4;
            int var11 = (arg6 - arg5 << 16) / var10;
            int var12 = (arg1 - arg2 << 16) / var9;
            class92.method695(arg8, arg2, arg7, 0, arg4, var11, arg0, -126, var12, arg5, 0);
        }
    }
}
