import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class68 extends class418 {

    @OriginalMember(owner = "client!co", name = "m", descriptor = "[B")
    public byte[] field989;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "[I")
    public static int[] field987 = new int[100];

    @OriginalMember(owner = "client!co", name = "o", descriptor = "Ljava/lang/String;")
    public static String field991 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lir;")
    public static class185 field992;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field987 = null;
        if (arg0 > -42) {
            method574((byte) -65);
        }
        field991 = null;
        field992 = null;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public static final void method575(int arg0) {
        field993++;
        if (arg0 == -1) {
            class51 var1 = class257.field3768;
            synchronized (class257.field3768) {
                class257.field3768.method366(111);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
    public static final void method576(byte arg0, int arg1) {
        if (class217.field3024 == 0) {
            class78.field1095.method147(-20849, arg1);
        } else {
            class444.field6414 = arg1;
        }
        field988++;
        if (arg0 != 72) {
            method575(81);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lso;IB)V")
    public static final void method577(class238 arg0, int arg1, byte arg2) {
        if (class366.field5400) {
            class366.field5400 = false;
            arg1 = 0;
        }
        int var3 = 3 % ((arg2 + 29) / 50);
        field990++;
        if (class28.field480 != null && class28.field480.method1547(arg0, (byte) -58)) {
            return;
        }
        class28.field480 = arg0;
        class119.field1547 = class98.method768((byte) -111);
        class69.field1003 = arg1;
        class11.field193 = arg1;
        if (class11.field193 != 0) {
            class186.field2539 = class290.field4342;
            class123.field1593 = class384.field5617;
            class175.field2372 = class132.field1725;
            class390.field5700 = class128.field1666;
            class31.field509 = class301.field4540;
            class188.field2565 = class409.field5952;
            class161.field2096 = class108.field1416;
            class264.field3869 = class333.field4902;
            class243.field3405 = class422.field6134;
            class217.field3033 = class126.field1645;
            return;
        }
        class308.method2040(false);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "([B)V")
    public class68(byte[] arg0) {
        this.field989 = arg0;
    }
}
