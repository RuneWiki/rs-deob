import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class245 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Ltd;")
    public class193 field4250 = new class193();

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4253 = 0;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field4256 = 0;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public static int[] field4251 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "F")
    public static float field4258;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Ltd;")
    private class193 field4260;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    public static int[] field4254;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[[[I")
    public static int[][][] field4255;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ltd;B)V", line = 13)
    public final void method1753(class193 arg0, byte arg1) {
        field4246++;
        if (arg1 != -34) {
            this.method1754(103);
        }
        if (arg0.field3268 != null) {
            arg0.method1339(0);
        }
        arg0.field3274 = this.field4250;
        arg0.field3268 = this.field4250.field3268;
        arg0.field3268.field3274 = arg0;
        arg0.field3274.field3268 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Ltd;", line = 44)
    public final class193 method1754(int arg0) {
        field4249++;
        if (arg0 != 0) {
            return (class193) null;
        }
        class193 var2 = this.field4260;
        if (this.field4250 == var2) {
            this.field4260 = null;
            return null;
        } else {
            this.field4260 = var2.field3274;
            return var2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Ltd;", line = 66)
    public final class193 method1755(byte arg0) {
        field4259++;
        class193 var2 = this.field4250.field3274;
        if (arg0 != -96) {
            this.field4260 = (class193) null;
        }
        if (this.field4250 == var2) {
            this.field4260 = null;
            return null;
        } else {
            this.field4260 = var2.field3274;
            return var2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhi;B)Z", line = 95)
    public static final boolean method1756(class82 arg0, byte arg1) {
        field4247++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 105 / ((-arg1 - 37) / 54);
        for (int var3 = 0; var3 < class90.field1632; var3++) {
            if (arg0.method543(class222.field3882[var3], (byte) 84)) {
                return true;
            }
        }
        if (arg0.method543(class168.field2932.field1409, (byte) -53)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I", line = 124)
    public final int method1757(boolean arg0) {
        field4252++;
        class193 var2 = this.field4250.field3274;
        int var3 = 0;
        while (this.field4250 != var2) {
            var2 = var2.field3274;
            var3++;
        }
        if (arg0) {
            this.field4260 = (class193) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 189)
    public class245() {
        this.field4250.field3268 = this.field4250;
        this.field4250.field3274 = this.field4250;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V", line = 170)
    public static void method1758(byte arg0) {
        if (arg0 >= 81) {
            field4254 = null;
            field4255 = (int[][][]) null;
            field4251 = null;
        }
    }
}
