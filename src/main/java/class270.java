import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class270 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lkn;")
    private class442 field3939 = new class442();

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3946 = new Thread(this);

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[[I")
    public static int[][] field3953;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Luq;")
    public static class91 field3949;

    static {
        new class349("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field3954 = 2;
        field3952 = 0;
        field3953 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I", line = 6)
    public static final int method1842(byte arg0) {
        field3948++;
        if (arg0 != -63) {
            method1844(20, (String) null, (byte[]) null, (byte) -22, 57, 51);
        }
        return class96.field1230;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lge;B)V", line = 18)
    private final void method1843(class425 arg0, byte arg1) {
        if (arg1 != -107) {
            this.method1850(-39);
        }
        class442 var3 = this.field3939;
        synchronized (this.field3939) {
            this.field3939.method2756(arg1 + 38, arg0);
            this.field3939.notify();
        }
        field3951++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;[BBII)I", line = 34)
    public static final int method1844(int arg0, String arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        field3955++;
        int var6 = arg0 - arg4;
        if (arg3 != 15) {
            field3954 = -60;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg4 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg5 + var7] = -97;
            } else {
                arg2[arg5 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ltj;Z)V", line = 174)
    public static final void method1845(class108 arg0, boolean arg1) {
        field3940++;
        class110.field1417 = arg0.method662(5899, "p11_full");
        class392.field5514 = arg0.method662(5899, "p12_full");
        class331.field4781 = arg0.method662(5899, "b12_full");
        class294.field4259 = arg0.method662(5899, "hitmarks");
        class262.field3872 = arg0.method662(5899, "hitbar_default");
        class103.field1331 = arg0.method662(5899, "timerbar_default");
        class297.field4326 = arg0.method662(5899, "headicons_pk");
        class340.field4922 = arg0.method662(5899, "headicons_prayer");
        class62.field829 = arg0.method662(5899, "hint_headicons");
        class379.field5394 = arg0.method662(5899, "hint_mapmarkers");
        if (arg1) {
            return;
        }
        class291.field4228 = arg0.method662(5899, "mapflag");
        class449.field6405 = arg0.method662(5899, "cross");
        class255.field3772 = arg0.method662(5899, "mapdots");
        class444.field6345 = arg0.method662(5899, "scrollbar");
        class432.field6185 = arg0.method662(5899, "name_icons");
        class119.field1613 = arg0.method662(5899, "floorshadows");
        class140.field2140 = arg0.method662(5899, "compass");
        class106.field1353 = arg0.method662(5899, "hint_mapedge");
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIII)V", line = 203)
    public static final void method1846(boolean arg0, int arg1, int arg2, int arg3) {
        field3941++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class320.field4681 = arg1;
        class46.field615 = arg0;
        if (arg2 <= -43) {
            class246.field3671 = arg3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)V", line = 220)
    public static final void method1847(int arg0, boolean arg1) {
        if (arg1) {
            class349.field5079.method91(4, arg0);
            field3943++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)Lpp;", line = 234)
    public final class222 method1848(String arg0, byte arg1) {
        if (arg1 != 35) {
            method1851((byte) 77);
        }
        field3937++;
        if (this.field3946 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            class222 var3 = new class222(arg0);
            this.method1843(var3, (byte) -107);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 263)
    public static void method1849(boolean arg0) {
        if (!arg0) {
            field3953 = null;
            field3949 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 274)
    public final void method1850(int arg0) {
        field3942++;
        if (this.field3946 == null) {
            return;
        }
        this.method1843(new class425(), (byte) -107);
        try {
            this.field3946.join();
            if (arg0 != 160) {
                this.method1848((String) null, (byte) 120);
            }
        } catch (InterruptedException var2) {
        }
        this.field3946 = null;
    }

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V", line = 294)
    public final void run() {
        field3947++;
        while (true) {
            class442 var1 = this.field3939;
            class222 var3;
            synchronized (this.field3939) {
                class425 var2;
                for (var2 = this.field3939.method2748(-120); var2 == null; var2 = this.field3939.method2748(-103)) {
                    try {
                        this.field3939.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class222)) {
                    return;
                }
                var3 = (class222) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field3184).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field3182 = var5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 366)
    public class270() {
        this.field3946.setDaemon(true);
        this.field3946.start();
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 341)
    public static final void method1851(byte arg0) {
        if (arg0 != -50) {
            method1844(24, (String) null, (byte[]) null, (byte) -43, 114, 62);
        }
        field3950++;
        class204.method1430();
        for (int var1 = 0; var1 < 4; var1++) {
            class85.field1090[var1].method277(true);
        }
        class276.method1879((byte) 126);
        class166.method1198(-22156);
        System.gc();
    }
}
