import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class678 extends class546 implements class158 {

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field9470;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[I")
    public static int[] field9478 = new int[16];

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Lef;")
    public static class490 field9471;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lda;")
    public static class61 field9469;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
    public static boolean field9476;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(B)V", line = 4)
    public static void method3823(byte arg0) {
        field9469 = null;
        if (arg0 != 81) {
            field9478 = null;
        }
        field9471 = null;
        field9478 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J", line = 16)
    public final long method1105(byte arg0) {
        if (arg0 >= -85) {
            method3824((byte) 91, -0.5459408F, -0.69842064F, 82, -0.30865085F);
        }
        ++field9474;
        return 0L;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I", line = 29)
    public final int method1104(int arg0) {
        int var2 = -1 / ((69 - arg0) / 57);
        ++field9477;
        return this.field9470;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V", line = 40)
    public final void method1107(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field9473;
        if (arg2 != 21189) {
            field9469 = null;
        }
        this.method3148(arg1, arg3, 35044);
        this.field9470 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V", line = 55)
    public final void method2165(int arg0) {
        ++field9475;
        if (arg0 != 34963) {
            this.method1105((byte) -104);
        }
        super.field7616.method2834(this, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BFFIF)F", line = 69)
    public static final float method3824(byte arg0, float arg1, float arg2, int arg3, float arg4) {
        int var5 = 25 / ((arg0 - -36) / 49);
        ++field9479;
        float[] var6 = class35.field552[arg3];
        return var6[2] * arg1 + var6[1] * arg2 + var6[0] * arg4;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lbi;I[BIZ)V", line = 82)
    public class678(class483 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9470 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 94)
    public static final void method3825(int arg0, boolean arg1, String arg2) {
        ++field9468;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[arg0];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class609.field8450.field572 : class609.field8450.field569);
        for (int var8 = var6; var7 > var8; ++var8) {
            class187 var11 = class609.field8450.method227(11041, var8);
            if (var11.field2562 && var11.method1253((byte) -78).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class677.field9467 = -1;
                    class9.field129 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; ~var13 > ~var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class677.field9467 = var5;
        class425.field5710 = 0;
        class9.field129 = var4;
        String[] var9 = new String[class677.field9467];
        for (int var10 = 0; ~var10 > ~class677.field9467; ++var10) {
            var9[var10] = class609.field8450.method227(11041, var4[var10]).method1253((byte) -102);
        }
        class424.method2427(var9, class9.field129, 0);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I", line = 166)
    public final int method1106(byte arg0) {
        if (arg0 != -79) {
            return 66;
        } else {
            ++field9472;
            return super.field7606;
        }
    }
}
