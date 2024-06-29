import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class87 extends class673 {

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!qda", name = "u", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!qda", name = "v", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!qda", name = "w", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(B)V", line = 3)
    public static final void method692(byte arg0) {
        ++field1232;
        if (class604.field8712 != null) {
            int var1 = -49 / ((-46 - arg0) / 42);
            class91.field1282 = new class562();
            class91.field1282.method3286(class84.field1197, class604.field8712.field3157, (byte) -97, class604.field8712, class604.field8712.field3148.method2561(class370.field4980, 0));
            class611.field8756 = new Thread(class91.field1282, "");
            class611.field8756.start();
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIZ)V", line = 19)
    public final void method693(int arg0, int arg1, boolean arg2) {
        ++field1234;
        int var4 = this.field1223 * arg0 >> 12;
        int var5 = this.field1226 * arg1 >> 12;
        if (arg2) {
            int var6 = this.field1228 * arg0 >> 12;
            int var7 = this.field1231 * arg1 >> 12;
            int var8 = this.field1224 * arg0 >> 12;
            int var9 = this.field1225 * arg1 >> 12;
            int var10 = this.field1227 * arg0 >> 12;
            int var11 = this.field1233 * arg1 >> 12;
            class353.method1999(var6, var7, super.field9672, (byte) 84, var11, var8, var10, var9, var5, var4);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V", line = 46)
    public final void method694(int arg0, int arg1, int arg2) {
        ++field1229;
        if (arg2 != -3) {
            method692((byte) 37);
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 67)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1228 = arg2;
        this.field1226 = arg1;
        this.field1224 = arg4;
        this.field1233 = arg7;
        this.field1225 = arg5;
        this.field1227 = arg6;
        this.field1223 = arg0;
        this.field1231 = arg3;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIB)V", line = 85)
    public final void method695(int arg0, int arg1, byte arg2) {
        if (arg2 == 48) {
            ++field1235;
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(III)Z", line = 100)
    public static final boolean method696(int arg0, int arg1, int arg2) {
        if (arg2 != 1282244876) {
            return false;
        } else {
            ++field1230;
            return class314.method1837(true, arg0, arg1) & class166.method1050((byte) -29, arg1, arg0);
        }
    }
}
