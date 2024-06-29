import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class282 extends class303 {

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4358 = 10;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field4356 = -1;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4359 = 0;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lja;")
    public static class64 field4355;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lja;")
    public static class64 field4357;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 12)
    public class282() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I", line = 25)
    public final int[] method67(int arg0, int arg1) {
        field4360++;
        if (arg0 != -3) {
            field4355 = (class64) null;
        }
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            class271.method1955(var3, 0, class70.field1108, class36.field591[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 49)
    public static final void method2006(int arg0) {
        field4353++;
        if (arg0 < 64) {
            method2007(-25, (class64) null);
        }
        int var1 = class95.field1558.method1035(class77.field1175);
        for (int var2 = 0; var2 < class65.field1062; var2++) {
            int var3 = class95.field1558.method1035(class215.method1559(false, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class65.field1062 * 15 + 21;
        int var5 = class275.field4270 - (var1 / 2);
        if ((var5 + var1) > class180.field2880) {
            var5 = class180.field2880 - var1;
        }
        int var6 = class138.field2198;
        if (class73.field1127 < (var4 + var6)) {
            var6 = class73.field1127 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class43.field761 == 1) {
            if (class275.field4270 == class147.field2370 && class22.field396 == class138.field2198) {
                class43.field761 = 0;
                class169.field2626 = class65.field1062 * 15 + (class77.field1176 ? 26 : 22);
                class243.field3754 = true;
                class217.field3485 = var1;
                class316.field4931 = var6;
                class76.field1168 = var5;
            }
        } else if (class275.field4270 == class223.field3569 && class267.field4136 == class138.field2198) {
            class217.field3485 = var1;
            class316.field4931 = var6;
            class76.field1168 = var5;
            class243.field3754 = true;
            class43.field761 = 0;
            class169.field2626 = class65.field1062 * 15 + (class77.field1176 ? 26 : 22);
        } else {
            class147.field2370 = class223.field3569;
            class43.field761 = 1;
            class22.field396 = class267.field4136;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILja;)I", line = 145)
    public static final int method2007(int arg0, class64 arg1) {
        field4352++;
        int var2 = arg0;
        if (arg1.method489(class202.field3178, arg0)) {
            var2 = arg0 + 1;
        }
        if (arg1.method489(class12.field234, arg0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 162)
    public static void method2008(int arg0) {
        field4357 = null;
        if (arg0 != -23023) {
            method2006(79);
        }
        field4355 = null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)I", line = 173)
    public static final int method2009(byte arg0, int arg1) {
        field4354++;
        int var2 = -24 / ((-arg0 - 31) / 48);
        return arg1 & 0x7F;
    }
}
