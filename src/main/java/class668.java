import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class668 {

    @OriginalMember(owner = "client!l", name = "h", descriptor = "J")
    public long field8687;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lck;")
    private class733 field8683;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lwu;")
    public static class582 field8686 = new class582("", 16);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8685;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[Lpu;")
    public static class772[] field8688;

    @OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field8680++;
        this.field8683.method3966(this.field8687, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZIZI)V", line = 15)
    public static final void method3619(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 <= 51) {
            field8685 = null;
        }
        field8682++;
        class80.method504(arg0, arg2, 0, class21.field199.length - 1, arg1, arg3, false);
        class500.field6432 = null;
        class292.field3719 = 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIILuaa;)V", line = 28)
    public static final void method3620(boolean arg0, int arg1, int arg2, class391 arg3) {
        if (class47.field549) {
            class558 var4 = class4.field55 == -1 ? null : class761.field10377.method4101(class4.field55, 11);
            if (client.method2637(arg3).method2127((byte) -57) && (class610.field7710 & 0x20) != 0 && (var4 == null || arg3.method2258(class4.field55, var4.field7096, -23907) != var4.field7096)) {
                class56.field728++;
                class259.method1655(class726.field9525, false, arg3.field5128, class559.field7106, 6070, false, 0L, arg3.field5151, 9, (long) (arg3.field5151 | arg3.field5039 << 0), arg3.field5039, class130.field1732 + " -> " + arg3.field5008, true);
            }
        }
        field8681++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class417.method2410((byte) 105, arg3, var5);
            if (var9 != null) {
                class400.field5284++;
                class259.method1655(var9, false, arg3.field5128, class81.method511(var5, (byte) 114, arg3), 6070, false, (long) (var5 + 1), arg3.field5151, 1012, (long) (arg3.field5039 << 0 | arg3.field5151), arg3.field5039, arg3.field5008, true);
            }
        }
        String var6 = class581.method3113(1482, arg3);
        if (var6 != null) {
            class259.method1655(var6, false, arg3.field5128, arg3.field5036, 6070, false, 0L, arg3.field5151, 45, (long) (arg3.field5039 << 0 | arg3.field5151), arg3.field5039, arg3.field5008, true);
            class655.field8448++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class417.method2410((byte) 105, arg3, var7);
            if (var8 != null) {
                class259.method1655(var8, false, arg3.field5128, class81.method511(var7, (byte) 114, arg3), 6070, false, (long) (var7 + 1), arg3.field5151, 52, (long) (arg3.field5151 | arg3.field5039 << 0), arg3.field5039, arg3.field5008, true);
                class400.field5284++;
            }
        }
        if (arg0) {
            field8685 = null;
        }
        if (!client.method2637(arg3).method2133((byte) 97)) {
            return;
        }
        if (arg3.field5134 == null) {
            class259.method1655(class659.field8554.method3589(class496.field6338, -22395), false, arg3.field5128, -1, 6070, false, 0L, arg3.field5151, 18, (long) (arg3.field5039 << 0 | arg3.field5151), arg3.field5039, "", true);
        } else {
            class259.method1655(arg3.field5134, false, arg3.field5128, -1, 6070, false, 0L, arg3.field5151, 18, (long) (arg3.field5151 | arg3.field5039 << 0), arg3.field5039, "", true);
        }
        class87.field1206++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 111)
    public static void method3621(boolean arg0) {
        field8686 = null;
        field8688 = null;
        if (arg0) {
            field8685 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBJIILwm;IZ)V", line = 124)
    public static final void method3622(int arg0, byte arg1, long arg2, int arg3, int arg4, class30 arg5, int arg6, boolean arg7) {
        class540.field6799 = arg3;
        field8684++;
        class405.field5380 = arg4;
        class416.field5500 = arg5;
        class407.field5418 = arg2;
        class693.field8903 = 1;
        class745.field10115 = arg0;
        class691.field8879 = arg7;
        class168.field2234 = null;
        class483.field6236 = arg6;
        int var9 = 70 % ((-arg1 - 40) / 49);
        class685.field8831 = 10000;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lck;JI)V", line = 144)
    public class668(class733 arg0, long arg1, int arg2) {
        this.field8687 = arg1;
        this.field8683 = arg0;
    }
}
