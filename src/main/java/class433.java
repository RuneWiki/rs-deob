import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class433 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lqj;")
    public static class296 field6226;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2718(boolean arg0) {
        class41.field615.method1243(1000);
        if (arg0) {
            field6228++;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 18)
    public static void method2719(int arg0) {
        if (arg0 != 23964) {
            field6226 = null;
        }
        field6226 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 31)
    public static final int method2720(String arg0, int arg1) {
        field6230++;
        int var2 = arg0.length();
        if (arg1 != -29654) {
            method2721(-57, 44);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) - (var3 - class81.method576(false, arg0.charAt(var4)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Ltq;", line = 53)
    public static final class374 method2721(int arg0, int arg1) {
        field6225++;
        class374 var2 = (class374) class176.field2485.method1246((byte) -15, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class278.field3753.method1920(arg0, false, arg1);
        class374 var4 = new class374();
        if (var3 != null) {
            var4.method2443(arg1 ^ 0x21, new class371(var3), arg0);
        }
        class176.field2485.method1247((long) arg0, (byte) -104, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 76)
    public static final void method2722(int arg0) {
        class190 var1 = class62.field966;
        synchronized (class62.field966) {
            class62.field966.method1249(1);
        }
        field6227++;
        class190 var2 = class362.field5084;
        synchronized (class362.field5084) {
            class362.field5084.method1249(1);
            if (arg0 <= 110) {
                field6226 = null;
            }
        }
    }
}
