import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class48 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ljm;")
    public static class162 field612 = new class162();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Ltn;")
    public static class109 field618 = new class109(512);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lvf;")
    public static class154 field616;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lha;")
    public class48 field608;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lti;")
    public class5 field617;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lp;IIILof;Lrd;II)V")
    public static final void method392(class447 arg0, int arg1, int arg2, int arg3, class423 arg4, class419 arg5, int arg6, int arg7) {
        field610++;
        class328 var8 = new class328();
        if (arg1 != -6024) {
            return;
        }
        var8.field4467 = arg3 * 128;
        var8.field4466 = arg6 * 128;
        var8.field4447 = arg7;
        if (arg0 != null) {
            var8.field4454 = arg0;
            int var9 = arg0.field6330;
            int var10 = arg0.field6322;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg0.field6322;
                var10 = arg0.field6330;
            }
            var8.field4464 = arg0.field6311;
            var8.field4470 = arg0.field6333 * 128;
            var8.field4471 = arg0.field6313;
            var8.field4459 = (arg3 + var10) * 128;
            var8.field4449 = arg0.field6318;
            var8.field4463 = arg0.field6300;
            var8.field4458 = arg0.field6281;
            var8.field4451 = (arg6 + var9) * 128;
            if (arg0.field6307 != null) {
                var8.field4455 = true;
                var8.method2000(false);
            }
            if (var8.field4463 != null) {
                var8.field4465 = (int) ((double) (var8.field4449 - var8.field4471) * Math.random()) + var8.field4471;
            }
            class159.field2268.method1162(122, var8);
        } else if (arg5 != null) {
            var8.field4469 = arg5;
            class233 var11 = arg5.field5807;
            if (var11.field3327 != null) {
                var8.field4455 = true;
                var11 = var11.method1524((byte) 110);
            }
            if (var11 != null) {
                var8.field4451 = (arg6 + var11.field3278) * 128;
                var8.field4459 = (var11.field3278 + arg3) * 128;
                var8.field4458 = class403.method2492(arg5, false);
                var8.field4470 = var11.field3266 * 128;
                var8.field4464 = var11.field3333;
            }
            class39.field520.method1162(127, var8);
        } else if (arg4 != null) {
            var8.field4457 = arg4;
            var8.field4451 = (arg4.method1285(-81) + arg6) * 128;
            var8.field4459 = (arg3 + arg4.method1285(-89)) * 128;
            var8.field4458 = class47.method389(arg4, false);
            var8.field4464 = arg4.field5889;
            var8.field4470 = arg4.field5852 * 128;
            class156.field2220.method835(4, var8, (long) arg4.field2622);
            return;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method393(byte arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 78) {
            method393((byte) 58, (String) null, (String) null, (String) null);
        }
        field614++;
        for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, arg1.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg2.length() + var4);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method394(int arg0) {
        if (arg0 != 8185) {
            method398(26, 117, 84, 125, (class312) null);
        }
        field609++;
        class254.field3518.method2522((byte) 50);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field618 = null;
        field616 = null;
        if (arg0 != -52) {
            method394(23);
        }
        field612 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public static final void method396(int arg0, int arg1, int arg2) {
        field615++;
        class26 var3 = class217.method1445(true, arg2, 5);
        var3.method158(28194);
        int var4 = 47 / ((arg1 - 11) / 36);
        var3.field341 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public final void method397(byte arg0) {
        field611++;
        if (class277.field3783 >= 500) {
            return;
        }
        this.field613 = 0;
        if (arg0 == 1) {
            this.field617 = null;
            this.field608 = class304.field4144;
            class304.field4144 = this;
            class277.field3783++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILso;)V")
    public static final void method398(int arg0, int arg1, int arg2, int arg3, class312 arg4) {
        arg4.field4235 = (arg1 << 7) + 64;
        arg4.field4238 = arg3;
        arg4.field4231 = (arg2 << 7) + 64;
        class63 var5 = class341.field4617[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class48 var7 = var5.field853; var7 != null; var7 = var7.field608) {
                if (var7.field617.field50) {
                    int var8 = var7.field617.method23(-117);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field4238 += var6;
                arg4.field4232 = true;
            }
        }
        if (class341.field4617[arg0][arg1][arg2] == null) {
            class72.method567(arg0, arg1, arg2);
        }
        class341.field4617[arg0][arg1][arg2].field856 = arg4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method399(byte arg0, Throwable arg1, String arg2) {
        field607++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class64.method512((byte) 73, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class140.method1024(63, var3);
            String var4 = method393((byte) 78, "%3a", ":", var3);
            String var5 = method393((byte) 78, "%40", "@", var4);
            String var6 = method393((byte) 78, "%26", "&", var5);
            String var7 = method393((byte) 78, "%23", "#", var6);
            if (class117.field1779.field1086 != null) {
                class285 var8 = class117.field1779.method587(4, new URL(class117.field1779.field1086.getCodeBase(), "clienterror.ws?c=" + class383.field5271 + "&u=" + class393.field5449 + "&v1=" + class76.field1074 + "&v2=" + class76.field1090 + "&e=" + var7));
                while (var8.field3875 == 0) {
                    class328.method1999(0, 1L);
                }
                if (var8.field3875 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3871;
                    var9.read();
                    var9.close();
                }
                if (arg0 != 86) {
                    field616 = null;
                }
            }
        } catch (Exception var10) {
        }
    }
}
