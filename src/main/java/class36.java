import java.awt.Component;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class36 {

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "[I")
    public static int[] field449 = new int[256];

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Lh;")
    private static class15 field447 = class18.method153("Water Source", 1);

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Lh;")
    public static class15 field451 = class18.method153("world", 1);

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Lh;")
    private static class15 field444 = class18.method153("Hair Dressers", 1);

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Lea;")
    public static class10 field450 = null;

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Z")
    public static volatile boolean field453 = false;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "I")
    public static volatile int field445 = -1;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "B")
    public byte field446;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "Lba;")
    public static class4 field454;

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "Le;")
    public static class9 field455;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field448;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "[B")
    public byte[] field452;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "[B")
    public static byte[] field457;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(JI)V", line = 6)
    public static final void method236(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1 != 1) {
            field447 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 18)
    public static void method237(int arg0) {
        field447 = null;
        field454 = null;
        field448 = null;
        field457 = null;
        field455 = null;
        field449 = null;
        field451 = null;
        if (arg0 != 0) {
            field445 = -112;
        }
        field444 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 39)
    public static final void method238(int arg0, Component arg1) {
        arg1.addMouseListener(class19.field262);
        arg1.addMouseMotionListener(class19.field262);
        if (arg0 != -14450) {
            method239(-63, -119, null, 126);
        }
        arg1.addFocusListener(class19.field262);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II[BI)Lh;", line = 52)
    public static final class15 method239(int arg0, int arg1, byte[] arg2, int arg3) {
        class15 var4 = new class15();
        if (arg3 != -32765) {
            field453 = true;
        }
        var4.field229 = 0;
        var4.field219 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg2[var5] != 0) {
                var4.field219[var4.field229++] = arg2[var5];
            }
        }
        return var4;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field449[var0] = var1;
        }
        field456 = 0;
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)[Lh;", line = 100)
    public static final class15[] method240(int arg0) {
        if (arg0 != -15536) {
            field451 = null;
        }
        return new class15[] { class13.field188, class14.field211, class10.field133, class31.field396, class9.field128, class21.field289, class18.field252, class23.field316, class18.field255, class22.field310, class33.field431, class6.field100, class6.field96, class9.field116, class15.field226, class15.field231, class21.field293, class24.field323, class18.field254, class10.field131, class19.field273, class32.field405, class24.field320, class13.field194, class35.field437, class18.field260, class21.field300, class22.field305, class31.field400, class18.field257, class35.field441, class10.field132, class32.field409, class16.field242, class23.field314, class22.field306, class28.field358, class6.field101, class33.field421, field447, class14.field217, class9.field125, class31.field402, class19.field276, class20.field284, class24.field319, class13.field201, class22.field309, class13.field203, class24.field328, class22.field308, class13.field185, field444, class25.field332, mapview.field13, class19.field272, class24.field326, class9.field127, class24.field322, class5.field84, class11.field148, class13.field200, class20.field283, class20.field283, class20.field283, class20.field283, class20.field283, class15.field233, class35.field438, class20.field283, class20.field286 };
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)V", line = 156)
    public final void method241(byte arg0) {
        if (arg0 >= -6) {
            return;
        }
        boolean var2 = true;
        if (this.field452 == null) {
            return;
        }
        this.field446 = this.field452[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field452[var3] != this.field446) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field452 = null;
        }
    }
}
