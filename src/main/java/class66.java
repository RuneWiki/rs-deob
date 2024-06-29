import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class66 extends class352 implements class541 {

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "Lof;")
    public static class446 field940 = new class446("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[S")
    public static short[] field943;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I", line = 4)
    public final int method468(byte arg0) {
        if (arg0 != -41) {
            field940 = null;
        }
        ++field944;
        return this.field936;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 15)
    public final void method469(int arg0) {
        int var2 = -94 % ((39 - arg0) / 63);
        super.field5439.method2062(this, 1);
        ++field945;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method470(boolean arg0) {
        ++field937;
        class433.method2641(-69);
        class101.field1470 = null;
        class496.field7321 = null;
        class230.field3296 = null;
        class515.field7568 = null;
        class456.field6845 = null;
        if (arg0) {
            method472(-69);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 45)
    public final int method471(int arg0) {
        if (arg0 != 26493) {
            this.method469(113);
        }
        ++field939;
        return super.field5441;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lnq;ILjaggl/memory/NativeBuffer;IZ)V", line = 56)
    public class66(class325 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field936 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 64)
    public static final void method472(int arg0) {
        ++field938;
        int var1 = (int) ((double) class398.field6071 * 34.46D);
        int var2 = var1 << 0;
        if (class400.field6090.method848()) {
            var2 += 128;
        }
        class400.field6090.method761(arg0, var2);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lnq;I[BIZ)V", line = 79)
    public class66(class325 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field936 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)V", line = 87)
    public static final void method473(int arg0) {
        ++field946;
        int var1 = class263.field3688.length;
        int var2 = -40 / ((arg0 - -17) / 54);
        for (int var3 = 0; ~var1 < ~var3; ++var3) {
            if (class263.field3688[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; class131.field1764 > var5; ++var5) {
                    if (class510.field7490[var3] == class200.field2698[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (~var4 == 0) {
                    class200.field2698[class131.field1764] = class510.field7490[var3];
                    var4 = class131.field1764++;
                }
                class164 var6 = new class164(class263.field3688[var3]);
                int var7 = 0;
                while (~var6.field2185 > ~class263.field3688[var3].length && var7 < 511 && ~class333.field5187 > -1024) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method1074(-635989152);
                    int var10 = var9 >> 14;
                    int var11 = (8139 & var9) >> 7;
                    int var12 = 63 & var9;
                    int var13 = (class510.field7490[var3] >> 8) * 64 + -class331.field5162 + var11;
                    int var14 = (255 & class510.field7490[var3]) * 64 + -class328.field5099 + var12;
                    class258 var15 = class137.field1834.method1626((byte) -15, var6.method1074(-635989152));
                    class24 var16 = (class24) class406.field6158.method1747((long) var8, false);
                    if (var16 == null && ~(1 & var15.field3583) < -1 && class253.field3515 == var10 && var13 >= 0 && var13 - -var15.field3586 < class398.field6071 && var14 >= 0 && ~class528.field7734 < ~(var15.field3586 + var14)) {
                        class17 var17 = new class17();
                        var17.field3882 = var8;
                        class24 var18 = new class24(var17);
                        class406.field6158.method1751((long) var8, -93, var18);
                        class480.field7090[class515.field7566++] = var18;
                        class224.field3114[class333.field5187++] = var8;
                        var17.field3859 = class393.field6017;
                        var17.method167(8046, var15);
                        var17.method1771(var17.field274.field3586, 0);
                        var17.field3878 = var17.field274.field3568 << 3;
                        var17.method1768((-1384120313 & var17.field274.field3610 - -4) << 11, true, 6946);
                        var17.method168((byte) 85, var17.method637((byte) 116), var13, var14, var10, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)J", line = 187)
    public final long method474(int arg0) {
        ++field942;
        return arg0 <= 9 ? -8L : 0L;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[B)V", line = 200)
    public final void method475(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field941;
        this.method2263(arg3, arg2, 35044);
        if (arg1 == -29444) {
            this.field936 = arg0;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 213)
    public static void method476(byte arg0) {
        field940 = null;
        if (arg0 > 82) {
            field943 = null;
        }
    }
}
