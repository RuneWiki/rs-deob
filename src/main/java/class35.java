import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class35 {

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lqj;")
    public static class196 field422 = class80.method502(")2", -48);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
    public static boolean field417 = false;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ldf;")
    public static class231 field423 = new class231(16);

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
    public static int[] field425 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lqj;")
    public static class196 field426 = class80.method502("overlay2)3dat", -48);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lqj;")
    private static class196 field427 = class80.method502("Cancel", -48);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lqj;")
    public static class196 field428 = field427;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Lv;")
    public class21 field419;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
    public int[] field420;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method181(int arg0) {
        field426 = null;
        field428 = null;
        field427 = null;
        field425 = null;
        field423 = null;
        if (arg0 == 26716) {
            field422 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Z")
    public static final boolean method182(int arg0, byte arg1) {
        field421++;
        if (class165.field2727[arg0]) {
            return true;
        }
        if (arg1 > -35) {
            field428 = null;
        }
        if (!class51.field637.method840(arg0, -89)) {
            return false;
        }
        int var2 = class51.field637.method831(-12858, arg0);
        if (var2 == 0) {
            class165.field2727[arg0] = true;
            return true;
        }
        if (class91.field1335[arg0] == null) {
            class91.field1335[arg0] = new class178[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class91.field1335[arg0][var3] == null) {
                byte[] var4 = class51.field637.method842(arg0, (byte) -100, var3);
                if (var4 != null) {
                    class91.field1335[arg0][var3] = new class178();
                    class91.field1335[arg0][var3].field3117 = (arg0 << 16) + var3;
                    if (var4[0] == -1) {
                        class91.field1335[arg0][var3].method1162(false, new class56(var4));
                    } else {
                        class91.field1335[arg0][var3].method1164(new class56(var4), -120);
                    }
                }
            }
        }
        class165.field2727[arg0] = true;
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILbk;)V")
    public static final void method183(int arg0, class136 arg1) {
        if (arg0 != 1) {
            field424 = 19;
        }
        class132.field1870 = arg1;
        field429++;
    }
}
