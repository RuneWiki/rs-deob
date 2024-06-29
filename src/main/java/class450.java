import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class450 {

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "Lup;")
    public class278 field6171;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field6170;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6169 = -1;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 8)
    public static final void method2570(int arg0) {
        class568.field7464 = 0;
        field6172++;
        int var1 = class3.field63.method3782(128);
        int var2 = class3.field63.method3821((byte) 120);
        boolean var3 = class3.field63.method3783((byte) -45) == 1;
        int var4 = class3.field63.method3816(arg0 - 1830088133);
        class505.method2840(false);
        class118.method966(var2, true);
        int var5 = (class732.field10143 - class3.field63.field9419) / 16;
        class236.field3318 = new int[var5][4];
        int var6 = 0;
        if (arg0 != 1830088036) {
            field6169 = 22;
        }
        while (var6 < var5) {
            for (int var10 = 0; var10 < 4; var10++) {
                class236.field3318[var6][var10] = class3.field63.method3799(false);
            }
            var6++;
        }
        class466.field6415 = new int[var5];
        class229.field3261 = null;
        class543.field7180 = new byte[var5][];
        class547.field7235 = new byte[var5][];
        class687.field9583 = new byte[var5][];
        class76.field921 = new int[var5];
        class197.field2972 = new int[var5];
        class136.field2171 = new byte[var5][];
        class552.field7278 = new int[var5];
        class528.field7007 = new int[var5];
        class1.field1 = null;
        int var7 = 0;
        for (int var8 = (var1 - (class719.field10004 >> 4)) / 8; var8 <= ((class719.field10004 >> 4) + var1) / 8; var8++) {
            for (int var9 = (var4 - (class107.field1453 >> 4)) / 8; var9 <= (((class107.field1453 >> 4) + var4) / 8); var9++) {
                class197.field2972[var7] = (var8 << 8) + var9;
                class466.field6415[var7] = class265.field3699.method2223((byte) 92, "m" + var8 + "_" + var9);
                class552.field7278[var7] = class265.field3699.method2223((byte) 50, "l" + var8 + "_" + var9);
                class76.field921[var7] = class265.field3699.method2223((byte) 83, "um" + var8 + "_" + var9);
                class528.field7007[var7] = class265.field3699.method2223((byte) 51, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class616.method3375(var1, var3, 11, var4, arg0 - 1830088036);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V", line = 84)
    public final void method2571(int arg0, int arg1) {
        field6168++;
        if (arg1 != ~this.method75(0, arg0)) {
            this.method67(true, arg0);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lup;)V", line = 100)
    public class450(class278 arg0) {
        this.field6171 = arg0;
        this.field6170 = this.method68(false);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(ILup;)V", line = 112)
    public class450(int arg0, class278 arg1) {
        this.field6170 = arg0;
        this.field6171 = arg1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)I")
    public abstract int method75(int arg0, int arg1);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
    public abstract void method73(byte arg0);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)I")
    public abstract int method68(boolean arg0);

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)V")
    public abstract void method67(boolean arg0, int arg1);
}
