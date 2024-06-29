import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class355 {

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field5024 = 0;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "J")
    public static long field5023 = 0L;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field5028 = 0;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public static int field5030 = 0;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "D")
    public static double field5025;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BC)Z", line = 4)
    public static final boolean method2143(byte arg0, char arg1) {
        if (arg0 != -105) {
            field5022 = 80;
        }
        field5027++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 15)
    public static final String method2144(byte arg0, long arg1) {
        field5029++;
        class24.field269.setTime(new Date(arg1));
        int var3 = class24.field269.get(7);
        int var4 = class24.field269.get(5);
        int var5 = class24.field269.get(2);
        int var6 = class24.field269.get(1);
        int var7 = class24.field269.get(11);
        int var8 = class24.field269.get(12);
        if (arg0 > -35) {
            field5025 = -0.717224222875203D;
        }
        int var9 = class24.field269.get(13);
        return class374.field5258[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class523.field7322[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V", line = 57)
    public static final void method2145(int arg0) {
        field5026++;
        if (arg0 != 0) {
            method2144((byte) 74, 104L);
        }
        if (class40.field464 != null) {
            class138.field2289 = new class464();
            class138.field2289.method2702(class40.field464.field4908.method3281(class423.field5892, ~arg0), (byte) -53, class40.field464.field4903, class477.field6521, class40.field464);
            class254.field3642 = new Thread(class138.field2289, "");
            class254.field3642.start();
        }
    }
}
