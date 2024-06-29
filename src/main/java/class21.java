import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class21 extends class71 {

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    private int field583 = 0;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field588 = 4096;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "[I")
    public static int[] field582 = new int[14];

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
    public static int[] field586 = new int[5];

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lud;")
    public static class279 field591 = class130.method1024("underlay", 255);

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field590 = 7759444;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "F")
    public static float field587;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 8)
    public static void method197(int arg0) {
        field582 = null;
        field591 = null;
        if (arg0 != 0) {
            method198((byte) 80, (class149) null, 34);
        }
        field586 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLvh;)V", line = 23)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field583 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field588 = arg2.method468(28214);
        }
        field581++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLok;I)[Lg;", line = 57)
    public static final class158[] method198(byte arg0, class149 arg1, int arg2) {
        if (arg0 < 34) {
            method198((byte) -21, (class149) null, 2);
        }
        field579++;
        return class125.method993(arg1, 123, arg2) ? class185.method1430((byte) -39) : null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 70)
    public class21() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[I", line = 82)
    public final int[] method199(int arg0, byte arg1) {
        field585++;
        if (arg1 > -69) {
            method198((byte) 114, (class149) null, 77);
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field583 <= var6 && this.field588 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(III)V", line = 125)
    public static final void method200(int arg0, int arg1, int arg2) {
        field580++;
        class104 var3 = class293.method2085(6, arg0, false);
        var3.method879(0);
        var3.field1966 = arg2;
        if (arg1 > -114) {
            field586 = (int[]) null;
        }
    }
}
