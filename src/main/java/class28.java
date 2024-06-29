import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 {

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lmc;")
    public static class75 field597 = class30.method234(true, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lmc;")
    public static class75 field599 = class30.method234(true, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lmc;")
    private static class75 field593 = class30.method234(true, "Classic");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static volatile int field592 = -1;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lmc;")
    public static class75 field602 = class30.method234(true, "@red@");

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Z")
    public static boolean field601 = false;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lmc;")
    private static class75 field590 = class30.method234(true, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lmc;")
    public static class75 field596 = field593;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lmc;")
    public static class75 field603 = field590;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    public static int[] field594;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 26)
    public static void method179(byte arg0) {
        field590 = null;
        field594 = null;
        if (arg0 != -4) {
            method180(null, -55, -120, -24);
        }
        field593 = null;
        field599 = null;
        field597 = null;
        field596 = null;
        field602 = null;
        field603 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)Z", line = 44)
    public static final boolean method180(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -324) {
            method181((byte) -94, null, false);
        }
        field598++;
        class61 var4 = new class61(arg0);
        boolean var5 = true;
        int var6 = -1;
        label56: while (true) {
            int var7 = var4.method498(arg1 ^ 0x1C3);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var4.method498(-129);
                    if (var11 == 0) {
                        continue label56;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 >> 6 & 0x3F;
                    int var13 = var4.method494(20471) >> 2;
                    int var14 = var9 & 0x3F;
                    int var15 = arg3 + var12;
                    int var16 = arg2 + var14;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class59 var17 = class50.method387(-26274, var6);
                        if (var13 != 22 || !class92.field2270 || var17.field1521 != 0 || var17.field1526) {
                            var8 = true;
                            if (!var17.method479((byte) -113)) {
                                var5 = false;
                                class97.field2443++;
                            }
                        }
                    }
                }
                int var10 = var4.method498(-129);
                if (var10 == 0) {
                    break;
                }
                var4.method494(20471);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLpa;Z)V", line = 191)
    public static final void method181(byte arg0, class91 arg1, boolean arg2) {
        if (class117.field2909 != null) {
            try {
                class117.field2909.method756(77);
            } catch (Exception var8) {
            }
            class117.field2909 = null;
        }
        class117.field2909 = arg1;
        class130.method1016(-57, arg2);
        class34.field788 = 0;
        class109.field2764 = null;
        class7.field112 = null;
        field604++;
        class104.field2630.field1556 = 0;
        if (arg0 > -39) {
            field595 = 111;
        }
        while (true) {
            class101 var3 = (class101) class32.field714.method618((byte) -65);
            if (var3 == null) {
                while (true) {
                    class101 var4 = (class101) class26.field515.method618((byte) -59);
                    if (var4 == null) {
                        if (class41.field993 != 0) {
                            try {
                                class61 var5 = new class61(4);
                                var5.method493((byte) 88, 4);
                                var5.method493((byte) 88, class41.field993);
                                var5.method530(0, 118);
                                class117.field2909.method761(4, 0, var5.field1577, 0);
                            } catch (IOException var7) {
                                try {
                                    class117.field2909.method756(-2);
                                } catch (Exception var6) {
                                }
                                class70.field1791++;
                                class117.field2909 = null;
                            }
                        }
                        class12.field227 = 0;
                        class58.field1459 = System.currentTimeMillis();
                        return;
                    }
                    client.field361.method31(27557, var4);
                    class122.field3005.method613(-1, var4.field1765, var4);
                    class79.field1994--;
                    class16.field322++;
                }
            }
            class100.field2581.method613(-1, var3.field1765, var3);
            class44.field1047--;
            class13.field256++;
        }
    }
}
