import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class37 {

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "I")
    public static int field475 = 0;

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Lna;")
    public static class26 field478 = class30.method205((byte) 115, "Overview");

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "Lna;")
    public static class26 field476 = class30.method205((byte) 127, "Sword Shop");

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "Lna;")
    public static class26 field472 = class30.method205((byte) 115, "Helmet Shop");

    @OriginalMember(owner = "mapview!ta", name = "k", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "Lna;")
    public static class26 field473 = class30.method205((byte) 91, "");

    @OriginalMember(owner = "mapview!ta", name = "m", descriptor = "I")
    public static int field484 = 1;

    @OriginalMember(owner = "mapview!ta", name = "l", descriptor = "B")
    public byte field483;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "J")
    private static long field477;

    @OriginalMember(owner = "mapview!ta", name = "i", descriptor = "[B")
    public static byte[] field480;

    @OriginalMember(owner = "mapview!ta", name = "j", descriptor = "[B")
    public byte[] field481;

    @OriginalMember(owner = "mapview!ta", name = "h", descriptor = "[I")
    public static int[] field479;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Z)V", line = 23)
    public final void method234(boolean arg0) {
        boolean var2 = arg0;
        if (this.field481 == null) {
            return;
        }
        this.field483 = this.field481[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field481[var3] != this.field483) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field481 = null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I[BII)I", line = 61)
    public static final int method235(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 1482781864) {
            return 83;
        }
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class7.field164[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)V", line = 93)
    public static void method236(byte arg0) {
        field476 = null;
        field473 = null;
        field472 = null;
        field480 = null;
        if (arg0 >= -87) {
            field478 = null;
        }
        field479 = null;
        field478 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 110)
    public static final void method237(String arg0, int arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class27.method194(arg2, (byte) -38);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class32.field418.field511 == null) {
                return;
            }
            if (arg1 < 13) {
                return;
            }
            class28 var8 = class32.field418.method253(new URL(class32.field418.field511.getCodeBase(), "clienterror.ws?c=" + class25.field345 + "&u=" + field477 + "&v1=" + class40.field503 + "&v2=" + class40.field509 + "&e=" + var7), 707);
            while (var8.field381 == 0) {
                class33.method218(1L, 10);
            }
            if (var8.field381 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field379;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Lna;ILna;Lb;)[Lma;", line = 174)
    public static final class24[] method238(class26 arg0, int arg1, class26 arg2, class3 arg3) {
        if (arg1 != -32747) {
            field474 = -59;
        }
        int var4 = arg3.method32(-1, arg0);
        int var5 = arg3.method31(var4, arg2, (byte) -61);
        return mapview.method14(arg3, var5, arg1 ^ 0xFFFF8592, var4);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)Z", line = 208)
    public static final boolean method239(int arg0) {
        class5 var1 = class15.field204;
        synchronized (class15.field204) {
            if (class29.field387 == class18.field237) {
                return false;
            }
            class1.field100 = class25.field346[class29.field387];
            class32.field422 = class26.field361[class29.field387];
            if (arg0 != 95) {
                field479 = null;
            }
            class29.field387 = class29.field387 + 1 & 0x7F;
            return true;
        }
    }
}
