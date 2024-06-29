import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class552 {

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "[Lvba;")
    public static class40[] field7916 = new class40[16];

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "I")
    public static int field7920 = -1;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
    public static int field7915;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public int field7917;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    private int field7918;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public int field7921;

    @OriginalMember(owner = "client!jw", name = "d", descriptor = "Ljv;")
    public class79 field7914;

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lig;I)V")
    public final void method3234(class244 arg0, int arg1) {
        field7912++;
        if (arg1 >= -18) {
            return;
        }
        while (true) {
            int var3 = arg0.method1423(-12);
            if (var3 == 0) {
                return;
            }
            this.method3235((byte) -128, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLig;I)V")
    private final void method3235(byte arg0, class244 arg1, int arg2) {
        if (arg0 > -127) {
            method3239(55);
        }
        if (arg2 == 1) {
            this.field7918 = arg1.method1476(-104);
        } else if (arg2 == 2) {
            this.field7921 = arg1.method1423(-109);
            this.field7917 = arg1.method1423(-26);
        }
        field7915++;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)Lg;")
    public final synchronized class155 method3236(byte arg0) {
        if (arg0 != 61) {
            this.method3235((byte) 77, null, 53);
        }
        field7919++;
        class155 var2 = (class155) this.field7914.field832.method3538((long) this.field7918, arg0 - 61);
        if (var2 != null) {
            return var2;
        }
        class155 var3 = class155.method953(this.field7914.field822, this.field7918, 0);
        if (var3 != null) {
            this.field7914.field832.method3537(119, (long) this.field7918, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILjt;IZ)Lvga;")
    public static final class85 method3237(int arg0, class104 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return null;
        }
        field7911++;
        int var4 = arg1.field1084 | arg2 << 10;
        class85 var5 = (class85) class251.field3036.method1613((long) var4 << 16, 35);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class544.field7827.method2472(!arg3, class544.field7827.method2480(-127, var4));
        if (var6 == null) {
            int var9 = arg0 + 65536 << 10 | arg1.field1084;
            class85 var10 = (class85) class251.field3036.method1613((long) var9 << 16, 118);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class544.field7827.method2472(!arg3, class544.field7827.method2480(-122, var9));
            if (var11 == null) {
                int var14 = arg1.field1084 | 0x3FFFC00;
                class85 var15 = (class85) class251.field3036.method1613((long) var14 << 16, 20);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class544.field7827.method2472(false, class544.field7827.method2480(-126, var14));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class85 var17;
                    try {
                        var17 = class497.method2963(var16, 0);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field899 = arg1;
                    class251.field3036.method1611((long) var14 << 16, (byte) 66, var17);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class85 var12;
                try {
                    var12 = class497.method2963(var11, 0);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field899 = arg1;
                class251.field3036.method1611((long) var9 << 16, (byte) -122, var12);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class85 var7;
            try {
                var7 = class497.method2963(var6, 0);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field899 = arg1;
            class251.field3036.method1611((long) var4 << 16, (byte) 55, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)I")
    public static final int method3238(int arg0, int arg1, int arg2) {
        field7913++;
        if (arg0 != 15707) {
            field7920 = 68;
        }
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
    public static void method3239(int arg0) {
        if (arg0 == -16711936) {
            field7916 = null;
        }
    }
}
