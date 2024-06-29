import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class401 extends class227 {

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
    public static boolean field5809 = false;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[S")
    public static short[] field5815 = new short[256];

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field5813 = 0;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "Lwq;")
    public static class115 field5817;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "Lbu;")
    public static class17 field5807;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method2476(String arg0, boolean arg1) {
        ++field5812;
        if (arg1) {
            field5807 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || ~var8 == -63) {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 - -var3);
        for (int var6 = 0; ~var6 > ~var2; ++var6) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 != '>') {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2477(int arg0, byte arg1, int arg2) {
        if (arg1 >= -4) {
            field5807 = null;
        }
        ++field5811;
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)Z")
    public static final boolean method2478(int arg0, int arg1, int arg2) {
        ++field5814;
        if (arg0 != 0) {
            method2478(-32, -33, 125);
        }
        return (arg1 & 1408) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)V")
    public static void method2479(int arg0) {
        field5807 = null;
        if (arg0 == -12298) {
            field5817 = null;
            field5815 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field5808;
        if (arg0 != 15811) {
            method2479(-54);
        }
        int[] var3 = super.field3068.method1970(arg1, (byte) 109);
        if (super.field3068.field4480) {
            int var4 = class190.field2457[arg1];
            for (int var5 = 0; ~var5 > ~class446.field6486; ++var5) {
                var3[var5] = this.method2481(class4.field37[var5], var4, class335.method1958(arg0, -15745)) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[BII)I")
    public static final int method2480(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 14191) {
            field5813 = -75;
        }
        ++field5816;
        int var4 = -1;
        for (int var5 = arg2; ~arg3 < ~var5; ++var5) {
            var4 = var4 >>> 8 ^ class166.field2151[255 & (arg1[var5] ^ var4)];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(III)I")
    private final int method2481(int arg0, int arg1, int arg2) {
        ++field5810;
        int var4 = arg0 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        if (arg2 >= -58) {
            field5807 = null;
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class401() {
        super(0, true);
    }

    static {
        new class305(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field5818 = 0;
        field5817 = new class115(3, 7);
    }
}
