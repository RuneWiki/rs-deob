import java.applet.Applet;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends class578 {

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "Llh;")
    public static class487 field323 = new class487(36, 8);

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!qaa", name = "F", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "Lfaa;")
    private class139 field326;

    @OriginalMember(owner = "client!qaa", name = "H", descriptor = "Ljava/applet/Applet;")
    public static Applet field332;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method248(String arg0, int arg1) {
        field325++;
        int var2 = arg0.length();
        if (arg1 > -73) {
            return 31L;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
    public static void method249(int arg0) {
        if (arg0 == -1) {
            field332 = null;
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLac;)V")
    public final void method250(byte arg0, class501 arg1) {
        field328++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                if (arg0 == -51) {
                    return;
                } else {
                    method251(null, (byte) 89);
                    return;
                }
            }
            this.method252(var3, arg1, 89);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method251(String arg0, byte arg1) {
        field327++;
        if (class61.field687 == null) {
            class639.method3566(115);
        }
        class444.field6143.setTime(new Date(class577.method3295((byte) 15)));
        int var2 = class444.field6143.get(11);
        int var3 = class444.field6143.get(12);
        int var4 = class444.field6143.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class48.method383(arg0, 1, '\n');
        if (arg1 >= -38) {
            field323 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class487.field6692; var8 > 0; var8--) {
                class61.field687[var8] = class61.field687[var8 - 1];
            }
            class61.field687[0] = var5 + ": " + var6[var7];
            if (class297.field4067 != null) {
                try {
                    class297.field4067.write(class75.method582(class61.field687[0] + "\n", 8217));
                } catch (IOException var9) {
                }
            }
            if ((class61.field687.length - 1) > class487.field6692) {
                if (class286.field3942 > 0) {
                    class286.field3942++;
                }
                class487.field6692++;
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILac;I)V")
    private final void method252(int arg0, class501 arg1, int arg2) {
        field324++;
        if (arg0 == 249) {
            int var4 = arg1.method2874((byte) -75);
            if (this.field326 == null) {
                int var5 = class206.method1334(-1, var4);
                this.field326 = new class139(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2874((byte) -75) == 1;
                int var8 = arg1.method2819((byte) 72);
                class401 var9;
                if (var7) {
                    var9 = new class256(arg1.method2851((byte) -74));
                } else {
                    var9 = new class72(arg1.method2840(false));
                }
                this.field326.method968((long) var8, var9, -1);
            }
        }
        int var10 = -79 % ((-arg2 - 75) / 43);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
    public final String method253(byte arg0, String arg1, int arg2) {
        field330++;
        if (this.field326 == null) {
            return arg1;
        }
        class256 var4 = (class256) this.field326.method970((byte) 89, (long) arg2);
        if (arg0 <= 6) {
            this.field326 = null;
        }
        return var4 == null ? arg1 : var4.field3496;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)I")
    public final int method254(int arg0, int arg1, int arg2) {
        field329++;
        if (arg0 != 10) {
            field332 = null;
        }
        if (this.field326 == null) {
            return arg2;
        } else {
            class72 var4 = (class72) this.field326.method970((byte) 89, (long) arg1);
            return var4 == null ? arg2 : var4.field956;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lin;I)V")
    public static final void method255(class78 arg0, int arg1) {
        if (class98.field1374 == arg0.field1108) {
            class130.field1872[arg0.field1071] = true;
        }
        if (arg1 != -20229) {
            method251(null, (byte) -28);
        }
        field331++;
    }
}
