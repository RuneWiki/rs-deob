import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class149 extends class513 {

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field2479 = 1401;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Lcja;")
    private class46 field2486;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lfca;II)V")
    private final void method1187(class93 arg0, int arg1, int arg2) {
        field2482++;
        if (arg2 != 0) {
            this.method1187(null, -43, 35);
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method793((byte) 81);
        if (this.field2486 == null) {
            int var5 = class241.method1609((byte) -78, var4);
            this.field2486 = new class46(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method793((byte) 24) == 1;
            int var8 = arg0.method767((byte) -117);
            class154 var9;
            if (var7) {
                var9 = new class682(arg0.method752(0));
            } else {
                var9 = new class345(arg0.method773(3));
            }
            this.field2486.method341((long) var8, var9, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLfca;)V")
    public final void method1188(byte arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 31);
            if (var3 == 0) {
                field2483++;
                if (arg0 < 111) {
                    this.method1189(104, -115, 112);
                    return;
                }
                return;
            }
            this.method1187(arg1, var3, 0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)I")
    public final int method1189(int arg0, int arg1, int arg2) {
        field2484++;
        if (arg0 != -10415) {
            this.method1189(90, 58, 10);
        }
        if (this.field2486 == null) {
            return arg2;
        } else {
            class345 var4 = (class345) this.field2486.method337((long) arg1, 1);
            return var4 == null ? arg2 : var4.field4640;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1190(int arg0, int arg1, String arg2) {
        field2481++;
        if (this.field2486 == null) {
            return arg2;
        } else if (arg1 == 0) {
            class682 var4 = (class682) this.field2486.method337((long) arg0, 1);
            return var4 == null ? arg2 : var4.field9498;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method1191(int arg0) throws IOException {
        field2485++;
        if (class193.field2948 != null && class741.field10226 > 0) {
            class503.field6869.field1442 = 0;
            while (true) {
                class537 var1 = (class537) class561.field7952.method3589((byte) -127);
                if (var1 == null || class503.field6869.field1413.length - class503.field6869.field1442 < var1.field7301) {
                    class193.field2948.method919(0, 8, class503.field6869.field1413, class503.field6869.field1442);
                    class722.field9901 += class503.field6869.field1442;
                    class243.field3467 = 0;
                    break;
                }
                class503.field6869.method743(0, var1.field7301, var1.field7295.field1413, true);
                class741.field10226 -= var1.field7301;
                var1.method1207(81);
                var1.field7295.method750(15);
                var1.method3038(-8401);
            }
        }
        int var2 = 107 / ((arg0 - 4) / 36);
    }
}
