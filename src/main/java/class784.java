import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class784 {

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "Z")
    public boolean field10765 = false;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "Z")
    public static boolean field10767 = false;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lti;")
    public static class463 field10758 = new class463();

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Lfba;")
    public static class27 field10771 = new class27(9, 7);

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field10756;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field10757;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field10759;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public int field10762;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field10763;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field10764;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field10766;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field10770;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field10772;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "Lqja;")
    public static class326 field10773;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Leca;")
    public class790 field10768;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Lwia;")
    public static class791 field10769;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;")
    public static final String method4293(int arg0, boolean arg1, boolean arg2, int arg3, long arg4) {
        field10772++;
        char var6 = ',';
        char var7 = '.';
        if (!arg1) {
            method4297(120);
        }
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method4294(int arg0, Throwable arg1) throws IOException {
        if (arg0 != -20109) {
            field10769 = null;
        }
        field10757++;
        String var3;
        if (arg1 instanceof class142) {
            class142 var2 = (class142) arg1;
            var3 = var2.field2094 + " | ";
            arg1 = var2.field2095;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILso;)V")
    public final void method4295(int arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 103);
            if (var3 == 0) {
                field10756++;
                if (arg0 != 1047) {
                    this.method4296((byte) 81, -6, null);
                    return;
                }
                return;
            }
            this.method4296((byte) 94, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILso;)V")
    private final void method4296(byte arg0, int arg1, class494 arg2) {
        field10770++;
        if (arg1 == 1) {
            this.field10763 = arg2.method2998(true);
        } else if (arg1 == 2) {
            this.field10762 = arg2.method2960((byte) 94);
        } else if (arg1 == 3) {
            this.field10765 = true;
        } else if (arg1 == 4) {
            this.field10763 = -1;
        }
        if (arg0 < 28) {
            method4297(-122);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method4297(int arg0) {
        int var1 = 37 / ((arg0 - 10) / 40);
        field10773 = null;
        field10771 = null;
        field10769 = null;
        field10758 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZILha;)Ljd;")
    public final class241 method4298(byte arg0, boolean arg1, int arg2, class65 arg3) {
        field10764++;
        long var5 = (long) (arg3.field784 << 19 | (arg1 ? 262144 : 0) | this.field10763 | arg2 << 16);
        class241 var7 = (class241) this.field10768.field10842.method3742((byte) 67, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field10768.field10839.method4349((byte) -102, this.field10763)) {
            class1 var8 = class1.method5(this.field10768.field10839, this.field10763, 0);
            if (var8 != null) {
                var8.field9 = var8.field1 = var8.field8 = var8.field5 = 0;
                if (arg1) {
                    var8.method15();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method11();
                }
            }
            class241 var10 = arg3.method551(var8, true);
            if (var10 != null) {
                this.field10768.field10842.method3739(var5, (byte) 35, var10);
            }
            return arg0 == -64 ? var10 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static final void method4299(int arg0) {
        field10761++;
        class739.field10186 = 0;
        class442.field6032 = 0;
        class371.field5139 = 0;
        class774.field10640 = 0;
        if (arg0 != 46) {
            method4300(false, 12);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
    public static final void method4300(boolean arg0, int arg1) {
        class67.field823 = -1;
        field10766++;
        if (arg0) {
            field10767 = false;
        }
        if (arg1 == 37) {
            class117.field1802 = 3.0F;
        } else if (arg1 == 50) {
            class117.field1802 = 4.0F;
        } else if (arg1 == 75) {
            class117.field1802 = 6.0F;
        } else if (arg1 == 100) {
            class117.field1802 = 8.0F;
        } else if (arg1 == 200) {
            class117.field1802 = 16.0F;
        }
        class67.field823 = -1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
    public final boolean method4301(byte arg0) {
        field10759++;
        int var2 = 74 % ((arg0 + 66) / 59);
        return this.field10768.field10839.method4349((byte) -102, this.field10763);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjga;)V")
    public static final void method4302(int arg0, class746 arg1) {
        field10760++;
        if (arg0 != 32 || class626.field8777) {
            return;
        }
        arg1.method3387((byte) 108);
        class618.field8644--;
        if (!arg1.field10335) {
            long var2 = arg1.field10344;
            class753 var4;
            for (var4 = (class753) class561.field7973.method2242(var2, -1); var4 != null && !var4.field10408.equals(arg1.field10339); var4 = (class753) class561.field7973.method2250(true)) {
            }
            if (var4 != null && var4.method4194(arg1, (byte) 121)) {
                class466.method2785(var4, true);
                return;
            }
            return;
        }
        for (class753 var5 = (class753) class371.field5135.method636(256); var5 != null; var5 = (class753) class371.field5135.method637(false)) {
            if (var5.field10408.equals(arg1.field10339)) {
                boolean var6 = false;
                for (class746 var7 = (class746) var5.field10411.method636(256); var7 != null; var7 = (class746) var5.field10411.method637(false)) {
                    if (arg1 == var7) {
                        var6 = true;
                        if (var5.method4194(arg1, (byte) 123)) {
                            class466.method2785(var5, true);
                        }
                        break;
                    }
                }
                if (var6) {
                    return;
                }
            }
        }
    }
}
