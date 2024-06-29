import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class570 {

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public int field8157 = -1;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field8158 = -1;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field8156 = -1;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field8160 = -1;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
    public int[] field8161;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lr;ZII)Lvl;")
    public static final class13 method3364(class167 arg0, boolean arg1, int arg2, int arg3) {
        field8159++;
        if (~arg2 == arg3) {
            return null;
        }
        if (class345.field5562 != null) {
            for (int var4 = 0; var4 < class345.field5562.length; var4++) {
                if (class345.field5562[var4] == arg2) {
                    return class106.field1728[var4];
                }
            }
        }
        class13 var5 = (class13) class453.field6805.method560(false, (long) arg2);
        if (var5 != null) {
            if (arg1 && var5.field196 == null) {
                class632 var6 = class597.method3482(arg3 ^ 0x20, arg2, class499.field7328);
                if (var6 == null) {
                    return null;
                }
                var5.field196 = var6;
            }
            return var5;
        }
        class284[] var7 = class284.method2028(class290.field4593, arg2);
        if (var7 == null) {
            return null;
        }
        class632 var8 = class597.method3482(32, arg2, class499.field7328);
        if (var8 == null) {
            return null;
        }
        class13 var9;
        if (arg1) {
            var9 = new class13(arg0.method347(var8, var7, true), var8);
        } else {
            var9 = new class13(arg0.method347(var8, var7, true));
        }
        class453.field6805.method559(var9, (long) arg2, arg3);
        return var9;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lie;II)V")
    private final void method3365(class6 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field8157 = arg0.method67(12021);
        } else if (arg1 == 2) {
            this.field8161 = new int[arg0.method70(-9059)];
            for (int var4 = 0; var4 < this.field8161.length; var4++) {
                this.field8161[var4] = arg0.method67(class357.method2397(arg2, 27524));
            }
        } else if (arg1 == 3) {
            this.field8158 = arg0.method70(-9059);
        }
        field8162++;
        if (arg2 != 17777) {
            this.method3365(null, -107, 5);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lie;Z)V")
    public final void method3366(class6 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                field8163++;
                if (arg1) {
                    this.field8161 = null;
                    return;
                }
                return;
            }
            this.method3365(arg0, var3, 17777);
        }
    }
}
