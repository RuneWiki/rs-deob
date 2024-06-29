import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field926 = -1;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lpe;")
    public static class109 field925 = class141.method1120("Fertigkeit)2", 0);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field927 = 0;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lpe;")
    private static class109 field932 = class141.method1120("Press (Wchange your password(W on front page)3", 0);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lpe;")
    public static class109 field931 = class141.method1120("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 0);

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lpe;")
    public static class109 field940 = class141.method1120("Registrierter Benutzer", 0);

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lpe;")
    public static class109 field938 = field932;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field942 = 3353893;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[Z")
    public static boolean[] field943 = new boolean[112];

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lpe;")
    public static class109 field944 = class141.method1120("::fpsoff", 0);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lre;")
    public static class123 field935;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lna;")
    public static class91 field937;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method398(int arg0) {
        class62 var1 = class63.field1288;
        synchronized (class63.field1288) {
            class19.field467 = class123.field2703;
            class82.field1754 = class124.field2754;
            class48.field992 = class156.field3600;
            class19.field484 = class139.field3045;
            class115.field2538 = class147.field3214;
            class120.field2671 = class138.field3013;
            class144.field3158 = class8.field199;
            class139.field3045 = arg0;
        }
        field930++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method399(Throwable arg0, byte arg1) throws IOException {
        field934++;
        String var2;
        if (arg0 instanceof class46) {
            class46 var3 = (class46) arg0;
            var2 = var3.field959 + " | ";
            arg0 = var3.field961;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        int var9 = -33 % ((37 - arg1) / 59);
        while (true) {
            while (true) {
                String var10 = var7.readLine();
                if (var10 == null) {
                    return var2 + "| " + var8;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbe;IIZIIII)V")
    public static final void method400(class13 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg5 < 104 && arg6 >= 0 && arg6 < 104) {
            class107.field2249[arg4][arg5][arg6] = 0;
            while (true) {
                int var8 = arg0.method142(27467);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class83.field1775[0][arg5][arg6] = -class145.method1140(2, arg5 + arg2 + 932731, arg6 + 556238 + arg7) * 8;
                    } else {
                        class83.field1775[arg4][arg5][arg6] = class83.field1775[arg4 - 1][arg5][arg6] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg0.method142(27467);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class83.field1775[0][arg5][arg6] = -var9 * 8;
                    } else {
                        class83.field1775[arg4][arg5][arg6] = class83.field1775[arg4 - 1][arg5][arg6] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class82.field1765[arg4][arg5][arg6] = arg0.method131(false);
                    class153.field3374[arg4][arg5][arg6] = (byte) ((var8 - 2) / 4);
                    class67.field1359[arg4][arg5][arg6] = (byte) class4.method34(var8 + arg1 - 2, 3);
                } else if (var8 <= 81) {
                    class107.field2249[arg4][arg5][arg6] = (byte) (var8 - 49);
                } else {
                    class135.field2939[arg4][arg5][arg6] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg0.method142(27467);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method142(27467);
                    break;
                }
                if (var10 <= 49) {
                    arg0.method142(27467);
                }
            }
        }
        field933++;
        if (!arg3) {
            field943 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public static final void method401(int arg0) {
        if (arg0 != 1) {
            method402((byte) -125);
        }
        Object var1 = class12.field270;
        synchronized (class12.field270) {
            if (class141.field3068 == 0) {
                class35.field755.method252(5, (byte) 34, new class83());
            }
            class141.field3068 = 600;
        }
        field936++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static final void method402(byte arg0) {
        field929++;
        if (!class139.field3031) {
            return;
        }
        class154 var1 = class102.method821(class139.field3032, true, class135.field2956);
        if (var1 != null && var1.field3488 != null) {
            class93 var2 = new class93();
            var2.field2001 = var1.field3488;
            var2.field2014 = var1;
            class123.method1003(var2, (byte) 111);
        }
        class139.field3031 = false;
        if (arg0 == 34) {
            class138.method1092(0, var1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lwa;")
    public static final class154 method403(int arg0, boolean arg1) {
        if (!arg1) {
            method398(-58);
        }
        field941++;
        int var2 = arg0 & 0xFFFF;
        int var3 = arg0 >> 16;
        if (class114.field2525[var3] == null || class114.field2525[var3][var2] == null) {
            boolean var4 = class113.method941(var3, (byte) -82);
            if (!var4) {
                return null;
            }
        }
        return class114.field2525[var3][var2];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbe;B)V")
    public static final void method404(class13 arg0, byte arg1) {
        if (arg1 != 125) {
            return;
        }
        field924++;
        if (class99.field2082 != null) {
            try {
                class99.field2082.method961(0L, -122);
                class99.field2082.method963(arg0.field309, arg1 + 15126, 24, arg0.field279);
            } catch (Exception var2) {
            }
        }
        arg0.field309 += 24;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lpe;B)Lpe;")
    public static final class109 method405(class109[] arg0, byte arg1) {
        field939++;
        if (arg1 != -74) {
            field935 = null;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class148.method1153(arg0, (byte) -100, 0, arg0.length);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
    public static final void method406(byte arg0, int arg1) {
        field928++;
        if (arg0 != 53) {
            return;
        }
        class145 var2 = (class145) class25.field613.method505((byte) -46, (long) arg1);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3188.length; var3++) {
                var2.field3188[var3] = -1;
                var2.field3174[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method407(int arg0) {
        if (arg0 != -15974) {
            field925 = null;
        }
        field937 = null;
        field938 = null;
        field931 = null;
        field932 = null;
        field940 = null;
        field944 = null;
        field925 = null;
        field935 = null;
        field943 = null;
    }
}
