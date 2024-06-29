import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class247 extends OutputStream {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lol;")
    public static class97 field3599 = new class97(0, 0);

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "F")
    public static float field3601 = 0.0F;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3602 = 99;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lcc;")
    public static class327 field3603 = new class327(64);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lte;")
    public static class261[] field3604 = new class261[14];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I", line = 7)
    public static final int method1732(byte arg0, int arg1) {
        if (class265.field3848 != null) {
            class265.field3848.method526(-19055);
            class265.field3848 = null;
        }
        if (arg0 != 9) {
            return -10;
        }
        field3597++;
        class74.field979++;
        if (class74.field979 > 4) {
            class280.field3982 = 0;
            class74.field979 = 0;
            return arg1;
        }
        class280.field3982 = 0;
        if (class329.field4822 == class253.field3695) {
            class253.field3695 = class183.field2496;
        } else {
            class253.field3695 = class329.field4822;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V", line = 52)
    public static final void method1733(byte arg0, int arg1) {
        int var2 = 90 % ((-arg0 - 62) / 59);
        class217.field3062.method2264((byte) -89, arg1);
        field3598++;
    }

    @OriginalMember(owner = "client!ok", name = "write", descriptor = "(I)V", line = 62)
    public final void write(int arg0) throws IOException {
        field3600++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 70)
    public static void method1734(int arg0) {
        field3603 = null;
        field3604 = null;
        field3599 = null;
        if (arg0 > -50) {
            field3602 = 121;
        }
    }
}
