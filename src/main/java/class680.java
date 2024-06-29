import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class680 extends class443 {

    @OriginalMember(owner = "client!pea", name = "D", descriptor = "Ljava/lang/String;")
    public static String field9585 = null;

    @OriginalMember(owner = "client!pea", name = "M", descriptor = "[B")
    public static byte[] field9594 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!pea", name = "J", descriptor = "F")
    public static float field9591;

    @OriginalMember(owner = "client!pea", name = "E", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!pea", name = "F", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!pea", name = "G", descriptor = "I")
    public static int field9588;

    @OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!pea", name = "I", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!pea", name = "K", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "[B")
    private byte[] field9584;

    @OriginalMember(owner = "client!pea", name = "L", descriptor = "[Ljava/lang/String;")
    public static String[] field9593;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BIB)V")
    public final void method1146(byte arg0, int arg1, byte arg2) {
        int var4 = 122 % ((2 - arg2) / 62);
        field9588++;
        int var5 = arg1 * 2;
        byte var6 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var10001 = var5;
        int var7 = var5 + 1;
        this.field9584[var10001] = var6;
        this.field9584[var7] = var6;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(B)V")
    public static final void method3794(byte arg0) {
        if (class463.field6263 < 1024.0F) {
            class463.field6263 = 1024.0F;
        }
        field9592++;
        while (class42.field602 >= 16384.0F) {
            class42.field602 -= 16384.0F;
        }
        if (class463.field6263 > 3072.0F) {
            class463.field6263 = 3072.0F;
        }
        while (class42.field602 < 0.0F) {
            class42.field602 += 16384.0F;
        }
        int var1 = class193.field2827 >> 9;
        int var2 = class338.field4683 >> 9;
        if (arg0 != -55) {
            method3797(96);
        }
        int var3 = class315.method1878(class193.field2827, 2921, class29.field476, class338.field4683);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class34.field530 - 4) > var1 && var2 < class34.field531 - 4) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class29.field476;
                    if (var7 < 3 && class69.method541(arg0 + 55, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class505.field6732.field3475 != null && class505.field6732.field3475[var7] != null) {
                        var8 = (class505.field6732.field3475[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class218.field3099 != null && class218.field3099[var7] != null) {
                        int var9 = -class218.field3099[var7].method195(var5, var6) - (-var8 - var3);
                        if (var9 > var4) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class619.field8214) {
            class619.field8214 += (var10 - class619.field8214) / 24;
        } else if (var10 < class619.field8214) {
            class619.field8214 += (var10 - class619.field8214) / 80;
        }
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
    public static final void method3795(int arg0) {
        if (arg0 != -1697594487) {
            field9593 = null;
        }
        field9589++;
        class596.method3288();
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3796(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -26694) {
            this.method1146((byte) 39, -68, (byte) 24);
        }
        this.field9584 = new byte[arg0 * arg1 * 2 * arg3];
        field9590++;
        this.method3463(arg0, true, arg3, arg1);
        return this.field9584;
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)V")
    public static void method3797(int arg0) {
        if (arg0 != 4126) {
            field9585 = null;
        }
        field9594 = null;
        field9593 = null;
        field9585 = null;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILag;I)Lbo;")
    public static final class684 method3798(int arg0, class641 arg1, int arg2) {
        field9587++;
        if (arg2 != 3072) {
            field9594 = null;
        }
        class684 var3;
        if (class65.field991 == null) {
            var3 = new class684();
        } else {
            var3 = class65.field991;
            class65.field991 = class65.field991.field9618;
            var3.field9618 = null;
            class642.field8624--;
        }
        var3.field9619 = arg1;
        var3.field9621 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V")
    public class680() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)Z")
    public static final boolean method3799(int arg0, int arg1, int arg2) {
        if (arg2 != -1718) {
            field9585 = null;
        }
        field9586++;
        return (arg0 & 0x800) != 0;
    }
}
