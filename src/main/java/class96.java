import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class96 implements class108 {

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Lhe;")
    private class47 field2448 = new class47();

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    private int field2454 = 128;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "D")
    private double field2451 = 1.0D;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    private int field2453 = 0;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Ltd;")
    private class116 field2455;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    private int field2452;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[Lld;")
    private class70[] field2439;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lhb;")
    public static class44 field2429 = class102.method810("Classic", -28606);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lhb;")
    public static class44 field2434 = class102.method810("Absender:", -28606);

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lhb;")
    public static class44 field2433 = class102.method810(": ", -28606);

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
    public static int[] field2446 = new int[2048];

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lhb;")
    public static class44 field2442 = class102.method810("Fehler bei der Verbindung zum Server)3", -28606);

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lhb;")
    public static class44 field2438 = class102.method810("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", -28606);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lhb;")
    public static class44 field2431 = class102.method810("Spieler kann nicht gefunden werden: ", -28606);

    @OriginalMember(owner = "client!q", name = "s", descriptor = "[J")
    public static long[] field2447 = new long[100];

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lhb;")
    public static class44 field2450 = class102.method810(" @whi@(X", -28606);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lhe;")
    public static class47 field2437 = new class47();

    @OriginalMember(owner = "client!q", name = "B", descriptor = "[I")
    public static int[] field2456 = new int[500];

    @OriginalMember(owner = "client!q", name = "E", descriptor = "Lhb;")
    public static class44 field2459 = class102.method810(" )2> @cya@", -28606);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[[[B")
    public static byte[][][] field2435;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)V", line = 17)
    public final void method756(int arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        for (int var3 = 0; var3 < this.field2439.length; var3++) {
            class70 var4 = this.field2439[var3];
            if (var4 != null && var4.field1730 != 0 && var4.field1723) {
                var4.method601(arg0);
                var4.field1723 = false;
            }
        }
        field2432++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 43)
    public final void method757(int arg0) {
        for (int var2 = 0; var2 < this.field2439.length; var2++) {
            if (this.field2439[var2] != null) {
                this.field2439[var2].method598();
            }
        }
        if (arg0 == -19130) {
            this.field2448 = new class47();
            field2436++;
            this.field2453 = this.field2452;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)Z", line = 72)
    public final boolean method758(int arg0, int arg1) {
        field2458++;
        if (arg0 != -15657) {
            field2435 = null;
        }
        return this.field2454 == 64;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I", line = 83)
    public final int method759(int arg0, int arg1) {
        if (arg1 != -27989) {
            this.field2451 = 0.3032476568932238D;
        }
        field2441++;
        return this.field2439[arg0] == null ? 0 : this.field2439[arg0].field1732;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 103)
    public static final void method760(int arg0) {
        if (class57.field1506 != null) {
            class64 var1 = class57.field1506;
            synchronized (class57.field1506) {
                class57.field1506 = null;
            }
        }
        if (arg0 != -65) {
            field2442 = null;
        }
        field2430++;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(II)[I", line = 141)
    public final int[] method761(int arg0, int arg1) {
        if (arg1 != -24745) {
            return null;
        }
        class70 var3 = this.field2439[arg0];
        field2444++;
        if (var3 != null) {
            if (var3.field1725 != null) {
                this.field2448.method440(var3, (byte) 110);
                var3.field1723 = true;
                return var3.field1725;
            }
            boolean var4 = var3.method600(this.field2451, this.field2454, this.field2455);
            if (var4) {
                if (this.field2453 == 0) {
                    class70 var5 = (class70) this.field2448.method439((byte) 97);
                    var5.method598();
                } else {
                    this.field2453--;
                }
                this.field2448.method440(var3, (byte) 126);
                var3.field1723 = true;
                return var3.field1725;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BD)V", line = 192)
    public final void method762(byte arg0, double arg1) {
        field2445++;
        this.field2451 = arg1;
        if (arg0 != -33) {
            this.method762((byte) -122, -1.0334346067371674D);
        }
        this.method757(-19130);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Z", line = 205)
    public final boolean method763(int arg0, byte arg1) {
        int var3 = -19 / ((arg1 - 40) / 56);
        field2443++;
        return this.field2439[arg0].field1724;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 227)
    public static void method764(int arg0) {
        field2431 = null;
        field2433 = null;
        field2434 = null;
        field2456 = null;
        if (arg0 > -61) {
            method764(25);
        }
        field2450 = null;
        field2446 = null;
        field2438 = null;
        field2459 = null;
        field2435 = null;
        field2447 = null;
        field2442 = null;
        field2429 = null;
        field2437 = null;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 258)
    public static final void method765(int arg0) {
        try {
            Graphics var1 = class22.field483.getGraphics();
            class71.field1743.method143(550, var1, -10166, 4);
        } catch (Exception var3) {
            class22.field483.repaint();
        }
        int var2 = -78 % ((arg0 + 4) / 53);
        field2449++;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Ltd;Ltd;IDI)V", line = 315)
    public class96(class116 arg0, class116 arg1, int arg2, double arg3, int arg4) {
        this.field2451 = arg3;
        this.field2455 = arg1;
        this.field2452 = arg2;
        this.field2453 = this.field2452;
        this.field2454 = arg4;
        int[] var7 = arg0.method874(-413, 0);
        int var8 = var7.length;
        this.field2439 = new class70[arg0.method886(0, 0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class131 var10 = new class131(arg0.method892(0, var7[var9], false));
            this.field2439[var7[var9]] = new class70(var10);
        }
    }
}
