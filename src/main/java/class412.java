import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class412 extends class719 {

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
    public static boolean field5736 = false;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "F")
    private float field5739;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "F")
    private float field5742;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    private int field5733;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    private int field5740;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field5748;

    // $FF: synthetic field
    @OriginalMember(owner = "client!op", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field5749;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Ljava/lang/String;")
    private String field5737;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "Ljava/lang/String;")
    private String field5738;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "Ljava/lang/String;")
    private String field5747;

    // $FF: synthetic method
    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2516(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)F", line = 5)
    public final float method2510(byte arg0) {
        if (arg0 != -30) {
            this.method2513(16);
        }
        ++field5744;
        return this.field5742;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Ljava/lang/String;", line = 16)
    public final String method2511(int arg0) {
        if (arg0 != 16) {
            this.field5742 = 1.5348514F;
        }
        ++field5741;
        return this.field5737;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 27)
    public class412(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 30)
    public final void method938(OggPacket arg0, byte arg1) {
        ++field5745;
        if (~super.field10155 >= -1 || "SUB".equals(this.field5738)) {
            if (arg1 == -63) {
                class26 var3 = new class26(arg0.getData());
                int var4 = var3.method194((byte) 119);
                if (super.field10155 <= 8) {
                    if ((128 | var4) == 0) {
                        throw new IllegalStateException();
                    }
                    if (super.field10155 == 0) {
                        var3.field330 += 23;
                        this.field5740 = var3.method198(arg1 + -16777153);
                        this.field5733 = var3.method198(arg1 + -16777153);
                        if (this.field5740 != 0 && ~this.field5733 != -1) {
                            class26 var5 = new class26(16);
                            var3.method149(var5.field279, 0, (byte) -86, 16);
                            this.field5737 = var5.method196((byte) -92);
                            var5.field330 = 0;
                            var3.method149(var5.field279, 0, (byte) -85, 16);
                            this.field5738 = var5.method196((byte) -92);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    if (~var4 == -1) {
                        long var6 = var3.method163((byte) 104);
                        long var8 = var3.method163((byte) 104);
                        long var10 = var3.method163((byte) 104);
                        if (var6 < 0L || var8 < 0L || ~var10 > -1L || var6 < var10) {
                            throw new IllegalStateException();
                        }
                        this.field5739 = (float) ((long) this.field5733 * var6) / (float) this.field5740;
                        this.field5742 = (float) ((var6 - -var8) * (long) this.field5733) / (float) this.field5740;
                        int var12 = var3.method198(arg1 ^ 16777153);
                        if (var12 < 0 || ~(var3.field279.length + -var3.field330) > ~var12) {
                            throw new IllegalStateException();
                        }
                        this.field5747 = class112.method752(var12, var3.field330, arg1 + 258111, var3.field279);
                    }
                    if ((128 | var4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Ljava/lang/String;", line = 107)
    public final String method2512(byte arg0) {
        int var2 = -93 / ((39 - arg0) / 63);
        ++field5746;
        return this.field5747;
    }

    @OriginalMember(owner = "client!op", name = "f", descriptor = "(I)F", line = 118)
    public final float method2513(int arg0) {
        ++field5735;
        int var2 = -123 / ((79 - arg0) / 36);
        return this.field5739;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 139)
    public final void method940(int arg0) {
        ++field5743;
        if (arg0 <= 32) {
            field5736 = false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIZ)Z", line = 150)
    public static final boolean method2514(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5748;
        if (arg3) {
            method2515(-126, -46, 94);
        }
        boolean var4 = true;
        class649 var5 = (class649) class204.method1367(arg2, arg1, arg0);
        if (var5 != null) {
            var4 &= class179.method1175(false, var5);
        }
        class649 var6 = (class649) class151.method970(arg2, arg1, arg0, field5749 != null ? field5749 : (field5749 = method2516("vea")));
        if (var6 != null) {
            var4 &= class179.method1175(false, var6);
        }
        class649 var7 = (class649) class340.method1963(arg2, arg1, arg0);
        if (var7 != null) {
            var4 &= class179.method1175(false, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)Z", line = 184)
    public static final boolean method2515(int arg0, int arg1, int arg2) {
        ++field5734;
        int var3 = 3 / ((1 - arg2) / 49);
        return class450.method2708(arg0, (byte) 40, arg1) & (class440.method2633(arg0, (byte) -124, arg1) | (arg0 & 8192) != 0 | class295.method1725(arg0, -13, arg1));
    }
}
