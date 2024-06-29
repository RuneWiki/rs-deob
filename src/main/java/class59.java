import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class59 {

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lrc;")
    public static class105 field1311 = class43.method374("backvmid3", 0);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1312 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Lrc;")
    public static class105 field1308 = class43.method374("", 0);

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lrc;")
    public static class105 field1307 = class43.method374(" @whi@(X", 0);

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lrc;")
    private static class105 field1317 = class43.method374("On", 0);

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lrc;")
    public static class105 field1321 = class43.method374("auf der Hautpseite)3", 0);

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lrc;")
    public static class105 field1323 = class43.method374("Regeln versto-8en hat)3", 0);

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lrc;")
    public static class105 field1324 = field1317;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lrc;")
    public static class105 field1327 = class43.method374("(U1", 0);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lfc;")
    public static class34 field1320;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lrc;ILrc;Lrc;)V", line = 3)
    public static final void method472(class105 arg0, int arg1, class105 arg2, class105 arg3) {
        field1315++;
        class37.field849 = arg2;
        class37.field863 = arg3;
        class37.field857 = arg0;
        if (arg1 != 0) {
            field1323 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)V", line = 17)
    public static final void method473(boolean arg0, int arg1) {
        class67.field1519++;
        field1318++;
        if (~class67.field1519 > arg1 && !arg0) {
            return;
        }
        class67.field1519 = 0;
        if (class7.field134 || class24.field576 == null) {
            return;
        }
        class36.field835++;
        class66.field1472.method781(185, (byte) -56);
        try {
            class24.field576.method1034(0, class66.field1472.field117, arg1 - 67, class66.field1472.field143);
            class66.field1472.field143 = 0;
        } catch (IOException var2) {
            class7.field134 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 47)
    public static void method474(byte arg0) {
        field1323 = null;
        field1320 = null;
        field1317 = null;
        field1324 = null;
        field1311 = null;
        field1307 = null;
        field1308 = null;
        if (arg0 > 118) {
            field1321 = null;
            field1327 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZZZZ)Lmd;", line = 66)
    public static final class76 method475(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        field1314++;
        class57 var5 = null;
        if (!arg3) {
            method476((byte) -124);
        }
        if (class67.field1526 != null) {
            var5 = new class57(arg0, class67.field1526, class120.field2894[arg0], 1000000);
        }
        return new class76(var5, class9.field161, arg0, arg1, arg4, arg2);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 87)
    public static final void method476(byte arg0) {
        for (int var1 = -1; var1 < class97.field2250; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class121.field2956[var1];
            }
            class15 var6 = class58.field1303[var5];
            if (var6 != null && var6.field1260 > 0) {
                var6.field1260--;
                if (var6.field1260 == 0) {
                    var6.field1264 = null;
                }
            }
        }
        field1325++;
        if (arg0 != 23) {
            return;
        }
        for (int var2 = 0; var2 < class133.field3229; var2++) {
            int var3 = class24.field578[var2];
            class115 var4 = class19.field466[var3];
            if (var4 != null && var4.field1260 > 0) {
                var4.field1260--;
                if (var4.field1260 == 0) {
                    var4.field1264 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 143)
    public static final void method477(Component arg0, byte arg1) {
        field1316++;
        arg0.addMouseListener(class87.field1974);
        if (arg1 > -14) {
            field1321 = null;
        }
        arg0.addMouseMotionListener(class87.field1974);
        arg0.addFocusListener(class87.field1974);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BILmd;)V", line = 170)
    public static final void method478(byte arg0, int arg1, class76 arg2) {
        field1326++;
        if (arg0 >= -64) {
            field1319 = 11;
        }
        if (class93.field2167 == null) {
            class89.method740(true, null, (byte) 0, 255, 0, false, 255);
            class57.field1204[arg1] = arg2;
        } else {
            class93.field2167.field143 = arg1 * 4 + 5;
            int var3 = class93.field2167.method104(-1699);
            arg2.method641(var3, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjd;B)V", line = 202)
    public static final void method479(int arg0, class58 arg1, byte arg2) {
        if (arg2 > -18) {
            field1308 = null;
        }
        class58.method463(arg1.field1229, arg0, arg1.field1274, (byte) 118);
        field1310++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lrc;", line = 218)
    public static final class105 method480(int arg0, int arg1) {
        if (arg0 != -25862) {
            method473(false, -124);
        }
        field1309++;
        class105 var2 = new class105();
        var2.field2417 = new byte[arg1];
        var2.field2383 = 0;
        return var2;
    }
}
