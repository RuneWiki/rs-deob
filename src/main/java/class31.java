import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class31 {

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "[Llm;")
    private class49[] field290;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Lsha;")
    public static class115 field296 = null;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "Laf;")
    public static class39 field299 = new class39(128, 4);

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field300 = new CRC32();

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "Liga;")
    public static class91 field301 = new class91(11, 4);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "J")
    private long field295;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "Llm;")
    private class49 field293;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
    public static final void method259(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field289++;
        if (class111.field1332 == null) {
            return;
        }
        if (class55.field651) {
            class568.method3344(0);
        }
        class539.field7444.method3979(2048);
        class296.method1944();
        class604.method3489((byte) 56);
        class523.method3120(true);
        client.method792(true);
        class686.method3907(99);
        if (class516.field7081 != null) {
            class516.field7081.method2307((byte) 23);
        }
        class102.method720((byte) -64);
        class106.method750(true);
        class379.method2368(-127);
        class577.method3381((byte) 127);
        class25.method108(false, (byte) -112);
        for (int var1 = 0; var1 < 2048; var1++) {
            class723 var5 = class413.field5787[var1];
            if (var5 != null) {
                for (int var6 = 0; var6 < var5.field9212.length; var6++) {
                    var5.field9212[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class744.field10275; var2++) {
            class359 var3 = class669.field9376[var2].field9573;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field9212.length; var4++) {
                    var3.field9212[var4] = null;
                }
            }
        }
        class49.field592 = null;
        class732.field10111 = null;
        class111.field1332.method2821((byte) 113);
        class111.field1332 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Llm;BJ)V")
    public final void method260(class49 arg0, byte arg1, long arg2) {
        if (arg0.field586 != null) {
            arg0.method416(arg1 ^ 0x2696);
        }
        field292++;
        class49 var5 = this.field290[(int) (arg2 & (long) (this.field294 - 1))];
        arg0.field591 = var5;
        arg0.field586 = var5.field586;
        arg0.field586.field591 = arg0;
        arg0.field581 = arg2;
        if (arg1 != 29) {
            field300 = null;
        }
        arg0.field591.field586 = arg0;
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
    public class31(int arg0) {
        this.field290 = new class49[arg0];
        this.field294 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class49 var3 = this.field290[var2] = new class49();
            var3.field591 = var3;
            var3.field586 = var3;
        }
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)Llm;")
    public final class49 method261(int arg0) {
        field297++;
        if (this.field293 == null) {
            return null;
        }
        class49 var2 = this.field290[(int) (this.field295 & (long) (this.field294 + arg0))];
        while (this.field293 != var2) {
            if (this.field293.field581 == this.field295) {
                class49 var3 = this.field293;
                this.field293 = this.field293.field591;
                return var3;
            }
            this.field293 = this.field293.field591;
        }
        this.field293 = null;
        return null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V")
    public static void method262(boolean arg0) {
        field296 = null;
        if (!arg0) {
            field301 = null;
        }
        field300 = null;
        field299 = null;
        field301 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(JI)Llm;")
    public final class49 method263(long arg0, int arg1) {
        this.field295 = arg0;
        field298++;
        class49 var4 = this.field290[(int) (arg0 & (long) (this.field294 + arg1))];
        for (this.field293 = var4.field591; this.field293 != var4; this.field293 = this.field293.field591) {
            if (this.field293.field581 == arg0) {
                class49 var5 = this.field293;
                this.field293 = this.field293.field591;
                return var5;
            }
        }
        this.field293 = null;
        return null;
    }
}
