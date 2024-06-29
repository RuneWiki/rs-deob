import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class465 extends class189 {

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field6583;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field6579;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "F")
    public float field6582;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    private int field6590;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    private int field6585;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6586 = new BigInteger("9924ed145bc42433df0b8ad40ec0a15afe564ee0c0380bcbe439c92ffc3a3d353b047d603242009da1040df2520fd9323a04f1a2acd745e0e0857d8dc86ad911", 16);

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[[S")
    public static short[][] field6591;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(FI)V")
    public abstract void method1044(float arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
    public final int method2772(boolean arg0) {
        field6587++;
        return arg0 ? 60 : this.field6592;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)I")
    public final int method2773(boolean arg0) {
        field6581++;
        if (!arg0) {
            this.field6585 = -2;
        }
        return this.field6583;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
    public final int method2774(int arg0) {
        int var2 = 27 % ((arg0 - 66) / 32);
        field6580++;
        return this.field6579;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method2775(int arg0) {
        field6586 = null;
        field6591 = null;
        if (arg0 >= -101) {
            method2775(-124);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2776(int arg0, byte arg1, int arg2) {
        if (arg1 != -94) {
            method2775(-7);
        }
        field6593++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)I")
    public final int method2777(int arg0) {
        field6588++;
        return arg0 == -1 ? this.field6590 : 43;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
    public final int method2778(byte arg0) {
        field6578++;
        int var2 = -91 / ((36 - arg0) / 51);
        return this.field6585;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()V")
    public static final void method2779() {
        class427.method2602(1, class634.field8744);
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)F")
    public final float method2780(int arg0) {
        field6584++;
        if (arg0 != -18277) {
            this.field6582 = 0.13262449F;
        }
        return this.field6582;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)V")
    public abstract void method1046(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(IIIIIF)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6583 = arg2;
        this.field6579 = arg1;
        this.field6582 = arg5;
        this.field6590 = arg3;
        this.field6585 = arg4;
        this.field6592 = arg0;
    }
}
