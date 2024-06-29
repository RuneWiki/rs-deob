import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class115 extends Canvas {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field2063;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2064 = 0;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "[[Ldl;")
    public static class46[][] field2068;

    @OriginalMember(owner = "client!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2070++;
        this.field2063.update(arg0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLvh;ILvh;B)Lgk;")
    public static final class259 method804(boolean arg0, class108 arg1, int arg2, class108 arg3, byte arg4) {
        field2062++;
        boolean var5 = true;
        int[] var6 = arg3.method743(arg2, 5064);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method726(arg2, var6[var7], (byte) -57);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg1.method726(0, var9, (byte) -57);
                } else {
                    var10 = arg1.method726(var9, 0, (byte) -57);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        if (arg4 <= 0) {
            method804(false, (class108) null, 48, (class108) null, (byte) -3);
        }
        try {
            return new class259(arg3, arg1, arg2, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILdl;I)Ljava/lang/String;")
    public static final String method805(int arg0, class46 arg1, int arg2) {
        field2065++;
        if (!client.method1922(arg1).method1256(arg2, (byte) -68) && arg1.field771 == null) {
            return null;
        } else if (arg1.field725 == null || arg1.field725.length <= arg2 || arg1.field725[arg2] == null || arg1.field725[arg2].trim().length() == 0) {
            return class285.field4510 ? "Hidden-" + arg2 : null;
        } else {
            int var3 = -101 % ((-arg0 - 22) / 44);
            return arg1.field725[arg2];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method806(int arg0) {
        field2068 = null;
        if (arg0 <= 8) {
            method807((byte) 84, (String) null);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class115(Component arg0) {
        this.field2063 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2063.paint(arg0);
        field2066++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method807(byte arg0, String arg1) {
        field2061++;
        int var2 = class266.method1751(-1, arg1);
        if (var2 == -1) {
            return;
        }
        int[] var3 = class158.field2642.method265(class252.field4135.field3149[var2] & 0x3FFF, class252.field4135.field3149[var2] >> 14 & 0x3FFF, (class252.field4135.field3149[var2] & 0x3CEB89DF) >> 28, 5);
        class62.method390((byte) 16, var3[1], var3[2]);
        if (arg0 != 120) {
            method807((byte) 105, (String) null);
        }
    }
}
