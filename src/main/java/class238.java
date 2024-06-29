import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class238 implements Runnable {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
    public boolean field4133 = true;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ljava/lang/Object;")
    public Object field4143 = new Object();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public int[] field4144 = new int[500];

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[I")
    public int[] field4146 = new int[500];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field4145 = 0;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lr;")
    public static class66 field4138 = class93.method641(43, " loggt sich ein)3");

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4135 = -1;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lr;")
    private static class66 field4141 = class93.method641(43, "Unable to find ");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lr;")
    public static class66 field4139 = class93.method641(43, "Versteckt");

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lr;")
    public static class66 field4136 = field4141;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lsg;")
    public static class247 field4132;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lcj;")
    public static class28 field4137;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILdh;)V")
    public static final void method1569(int arg0, class265 arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class77.field1517.length; var3++) {
            class77.field1517[var3] = 0;
        }
        field4142++;
        if (arg0 < 72) {
            field4137 = null;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class77.field1517[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class56.field964[var15] = (class77.field1517[var15 + 1] + class77.field1517[var15 - 128] + class77.field1517[var15 + 128] + class77.field1517[var15 + -1]) / 4;
                }
            }
            int[] var13 = class77.field1517;
            class77.field1517 = class56.field964;
            class56.field964 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field441; var7++) {
            for (int var8 = 0; var8 < arg1.field442; var8++) {
                if (arg1.field4631[var6++] != 0) {
                    int var9 = var8 + arg1.field440 + 16;
                    int var10 = arg1.field438 + var7 + 16;
                    int var11 = var9 + (var10 << 7);
                    class77.field1517[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "run", descriptor = "()V")
    public final void run() {
        field4134++;
        while (this.field4133) {
            Object var1 = this.field4143;
            synchronized (this.field4143) {
                if (this.field4145 < 500) {
                    this.field4144[this.field4145] = class170.field3021;
                    this.field4146[this.field4145] = class50.field896;
                    this.field4145++;
                }
            }
            class91.method636(-5, 50L);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1570(byte arg0) {
        field4132 = null;
        field4139 = null;
        field4138 = null;
        field4141 = null;
        if (arg0 == -127) {
            field4136 = null;
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBII)V")
    public static final void method1571(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 < 48) {
            return;
        }
        if (class165.field2972 <= arg2 && arg4 <= class215.field3706 && arg0 >= class241.field4186 && arg5 <= class222.field3788) {
            class178.method1191(arg0, true, arg5, arg4, arg2, arg1);
        } else {
            class255.method1708(arg0, arg5, arg4, arg2, -115, arg1);
        }
        field4131++;
    }
}
