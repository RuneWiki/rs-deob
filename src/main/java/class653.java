import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class653 extends class454 {

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public int field8656 = -1;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public int field8653;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Ljava/lang/String;")
    public String field8651;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Ljava/lang/String;")
    public String field8652;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZZ)V")
    public static final void method3554(int arg0, boolean arg1, boolean arg2) {
        ++field8654;
        class287 var3 = class271.method1629(arg1, arg0, (byte) -60);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field4061.length; ++var4) {
                var3.field4061[var4] = -1;
                var3.field4063[var4] = 0;
            }
            if (!arg2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Ldga;")
    public final class208 method3555(int arg0) {
        if (arg0 != 3) {
            this.field8651 = null;
        }
        ++field8655;
        return class379.field5280[super.field6198];
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)V")
    public static final void method3556(int arg0) {
        int var1 = 46 / ((-59 - arg0) / 45);
        for (class433 var2 = (class433) class446.field6126.method21(2); var2 != null; var2 = (class433) class446.field6126.method9(-128)) {
            if (class127.method1007(var2.field5963, (byte) 99)) {
                class547.method3060(0, var2);
            }
        }
        ++field8650;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
    public static final void method3557(int arg0, int arg1) {
        class701 var2 = class660.field8718[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class701 var4 = class660.field8718[var3][arg0][arg1] = class660.field8718[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class10 var5 = var4.field9742; var5 != null; var5 = var5.field174) {
                    class675 var6 = var5.field170;
                    if (var6.field9367 == arg0 && var6.field9354 == arg1) {
                        --var6.field3508;
                    }
                }
                if (var4.field9738 != null) {
                    --var4.field9738.field3508;
                }
                if (var4.field9729 != null) {
                    --var4.field9729.field3508;
                }
                if (var4.field9739 != null) {
                    --var4.field9739.field3508;
                }
                if (var4.field9737 != null) {
                    --var4.field9737.field3508;
                }
                if (var4.field9735 != null) {
                    --var4.field9735.field3508;
                }
            }
        }
        if (class660.field8718[0][arg0][arg1] == null) {
            class660.field8718[0][arg0][arg1] = new class701(0);
            class660.field8718[0][arg0][arg1].field9730 = 1;
        }
        class660.field8718[0][arg0][arg1].field9744 = var2;
        class660.field8718[3][arg0][arg1] = null;
    }
}
