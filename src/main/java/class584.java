import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class584 {

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Lfo;")
    public class473 field8309;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[S")
    public static short[] field8301 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Lmfa;")
    public static class562 field8303 = new class562();

    @OriginalMember(owner = "client!or", name = "b", descriptor = "F")
    public static float field8300;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILld;B)V")
    public abstract void method185(int arg0, class155 arg1, byte arg2);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public void method179(byte arg0) {
        field8299++;
        if (arg0 <= 26) {
            this.method175(58, 13, 67);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public void method181(int arg0) {
        if (arg0 < 59) {
            field8300 = 0.58917993F;
        }
        field8305++;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(B)V")
    public void method182(byte arg0) {
        int var2 = -104 % ((arg0 - 66) / 54);
        field8306++;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public void method184(int arg0) {
        field8308++;
        if (arg0 >= -19) {
            this.method181(3);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public void method176(int arg0) {
        if (arg0 != 20197) {
            this.method174(-105);
        }
        field8304++;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
    public void method173(int arg0) {
        field8307++;
        if (arg0 != -1) {
            field8300 = -0.30349526F;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V")
    public abstract void method177(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
    public static void method3286(int arg0) {
        field8301 = null;
        if (arg0 > 120) {
            field8303 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
    public abstract void method174(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public static final void method3287(boolean arg0, int arg1) {
        field8302++;
        class480.method2802(class264.field3337, 16751);
        if (arg1 != 0) {
            field8303 = null;
        }
        class164.field1965++;
        for (class454 var2 = (class454) class234.field2982.method3232(-1); var2 != null; var2 = (class454) class234.field2982.method3236(-27646)) {
            if (!var2.method1520(-63)) {
                var2 = (class454) class234.field2982.method3232(-1);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6297 == 0) {
                class39.method204(true, arg1 ^ 0xFFFF8F81, arg0, var2);
            }
        }
        if (class418.field5557 != null) {
            class567.method3207((byte) -69, class418.field5557);
            class418.field5557 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
    public abstract void method175(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(B)Z")
    public abstract boolean method178(byte arg0);

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lfo;)V")
    public class584(class473 arg0) {
        this.field8309 = arg0;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(ZI)V")
    public abstract void method180(boolean arg0, int arg1);
}
