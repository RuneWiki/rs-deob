import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class276 extends class183 {

    @OriginalMember(owner = "client!il", name = "p", descriptor = "J")
    public long field4136;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[S")
    public static short[] field4137 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4135 = new String[1000];

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Z")
    public static volatile boolean field4134 = true;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Lqc;")
    public static class99 field4141 = new class99(64);

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V", line = 11)
    public static void method1895(byte arg0) {
        field4135 = null;
        field4137 = null;
        field4141 = null;
        if (arg0 != -43) {
            field4141 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 24)
    public class276() {
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(J)V", line = 26)
    public class276(long arg0) {
        this.field4136 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)V", line = 40)
    public static final void method1896(byte arg0) {
        field4138++;
        class47.field580.method652((byte) -120);
        for (int var1 = 0; var1 < 32; var1++) {
            class254.field3642[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class134.field1855[var2] = 0L;
        }
        int var3 = 55 / ((-arg0 - 42) / 47);
        class315.field4746 = 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)[Lpn;", line = 68)
    public static final class170[] method1897(boolean arg0) {
        field4142++;
        class170[] var1 = new class170[class342.field5121];
        if (arg0) {
            field4137 = (short[]) null;
        }
        for (int var2 = 0; var2 < class342.field5121; var2++) {
            int var3 = class323.field4903[var2] * class288.field4281[var2];
            byte[] var4 = class209.field3012[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class235.field3331[class47.method303(var4[var6], 255)];
            }
            if (class67.field908) {
                var1[var2] = new class328(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var5);
            } else {
                var1[var2] = new class178(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], var5);
            }
        }
        class236.method1624(27);
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(B)V", line = 111)
    public static final void method1898(byte arg0) {
        class327.field4938.method724(0);
        if (arg0 != 73) {
            method1897(true);
        }
        field4133++;
        class289.field4294.method724(0);
    }
}
