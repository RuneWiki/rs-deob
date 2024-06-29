import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class13 extends class113 {

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lra;")
    private class102 field320;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static volatile int field324 = 0;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Lgd;")
    private static class40 field327 = class14.method90(false, "Continue");

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lgd;")
    private static class40 field319 = class14.method90(false, " is already on your friend list");

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Lgd;")
    public static class40 field323 = field319;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Lgd;")
    public static class40 field336 = field327;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[Lgd;")
    public static class40[] field337 = new class40[5];

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[I")
    public static int[] field338 = new int[500];

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Lgd;")
    public static class40 field339 = class14.method90(false, "Wordpack geladen)3");

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "Lba;")
    public static class7 field341 = new class7(200);

    @OriginalMember(owner = "client!ca", name = "W", descriptor = "Lgd;")
    private static class40 field344 = class14.method90(false, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ca", name = "V", descriptor = "[I")
    public static int[] field343 = new int[5];

    @OriginalMember(owner = "client!ca", name = "X", descriptor = "Lgd;")
    public static class40 field345 = field344;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
    public static int field342 = 10;

    @OriginalMember(owner = "client!ca", name = "Y", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "client!ca", name = "Z", descriptor = "Lgd;")
    public static class40 field347 = class14.method90(false, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "Lu;")
    private class123 field322;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Lqa;")
    public static class96 field332;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Z")
    private boolean field318;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Z")
    private boolean field333;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "[B")
    private byte[] field331;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V", line = 5)
    public static void method73(int arg0) {
        field343 = null;
        field332 = null;
        field345 = null;
        field344 = null;
        field336 = null;
        if (arg0 != -23329) {
            return;
        }
        field347 = null;
        field337 = null;
        field341 = null;
        field338 = null;
        field339 = null;
        field319 = null;
        field327 = null;
        field323 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 32)
    public final void method74(byte arg0) {
        field329++;
        if (this.field322 == null || this.field322.field2885 == 0) {
            return;
        }
        if (arg0 < 48) {
            this.method74((byte) -6);
        }
        if (this.field322.field2885 == 1) {
            class116 var2 = (class116) this.field322.field2887;
            try {
                var2.method892(0, this.field331, this.field331.length, 1);
                var2.method897(1);
                try {
                    class39.method238(7596, this.field320.field2435, "midibox.loop=" + (this.field318 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method896(1).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field330 + ";");
                    this.field333 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method897(1);
                } catch (Exception var3) {
                }
            }
        }
        this.field322 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 74)
    public final void method75(int arg0, int arg1, int arg2) {
        field328++;
        if (arg1 != -25) {
            this.method77(6, null, true, 91);
        }
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class126.method1005(arg0, -126) - arg2;
        if (this.field322 != null) {
            this.field330 = var4;
        } else if (this.field333) {
            try {
                class39.method238(7596, this.field320.field2435, "midibox.volume=" + var4 + ";");
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(BI)V", line = 104)
    public final void method76(byte arg0, int arg1) {
        field326++;
        if (arg0 != -86) {
            method78(false, 17L);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BZI)V", line = 114)
    public final void method77(int arg0, byte[] arg1, boolean arg2, int arg3) {
        this.field322 = this.field320.method715(-22826);
        field334++;
        if (this.field322 == null) {
            return;
        }
        if (arg0 == 0) {
            arg0 = 1;
        }
        this.field330 = class126.method1005(arg0, -128);
        this.field318 = arg2;
        this.field331 = arg1;
        if (arg3 != -28) {
            field338 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZJ)V", line = 145)
    public static final void method78(boolean arg0, long arg1) {
        if (arg0) {
            field343 = null;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field340++;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 163)
    public final void method79(byte arg0) {
        int var2 = -40 / ((-arg0 - 75) / 51);
        field321++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 173)
    public final void method80(byte arg0) {
        if (this.field333) {
            try {
                class39.method238(7596, this.field320.field2435, "midibox.src=\"c:/silence.mid\";");
            } catch (Throwable var3) {
            }
            this.field333 = false;
        }
        this.field322 = null;
        field325++;
        int var2 = -95 % ((33 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;Lra;B)V", line = 194)
    public static final void method81(Component arg0, class102 arg1, byte arg2) {
        if (arg2 != 72) {
            field336 = null;
        }
        field335++;
        try {
            class36 var3 = (class36) Class.forName("ma").getDeclaredConstructor().newInstance();
            var3.method228(arg1, 2048);
            class7.field179 = var3;
        } catch (Throwable var6) {
            try {
                class7.field179 = new class111(arg1, arg0);
            } catch (Throwable var5) {
                if (class102.field2428.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class7.field179 = new class20();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class7.field179 = new class12(8000);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lra;)V", line = 235)
    public class13(class102 arg0) {
        this.field320 = arg0;
    }
}
