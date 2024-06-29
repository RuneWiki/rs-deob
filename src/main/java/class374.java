import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class374 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lvd;")
    public class258 field5646;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field5647 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 8)
    public static final void method2218(String arg0, boolean arg1, byte arg2) {
        field5645++;
        if (arg0 == null) {
            return;
        }
        if (class411.field6211 >= 100) {
            class264.method1653((byte) 114, class474.field6982.method2103(class30.field430, (byte) 34));
            return;
        }
        String var3 = class491.method2932((byte) 46, arg0);
        if (var3 == null) {
            return;
        }
        if (arg2 <= 91) {
            method2219(-6);
        }
        for (int var4 = 0; var4 < class411.field6211; var4++) {
            String var8 = class491.method2932((byte) 98, class60.field827[var4]);
            if (var8 != null && var8.equals(var3)) {
                class264.method1653((byte) 127, arg0 + class2.field7.method2103(class30.field430, (byte) 34));
                return;
            }
            if (class505.field7431[var4] != null) {
                String var9 = class491.method2932((byte) 62, class505.field7431[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class264.method1653((byte) 118, arg0 + class2.field7.method2103(class30.field430, (byte) 34));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class222.field3162; var5++) {
            String var6 = class491.method2932((byte) 111, class134.field1996[var5]);
            if (var6 != null && var6.equals(var3)) {
                class264.method1653((byte) 113, class422.field6306.method2103(class30.field430, (byte) 34) + arg0 + class30.field427.method2103(class30.field430, (byte) 34));
                return;
            }
            if (class227.field3207[var5] != null) {
                String var7 = class491.method2932((byte) 86, class227.field3207[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class264.method1653((byte) 116, class422.field6306.method2103(class30.field430, (byte) 34) + arg0 + class30.field427.method2103(class30.field430, (byte) 34));
                    return;
                }
            }
        }
        if (class491.method2932((byte) 21, class410.field6198.field7063).equals(var3)) {
            class264.method1653((byte) 125, class312.field4847.method2103(class30.field430, (byte) 34));
            return;
        }
        class389.field5856++;
        class97.method758(class233.field3274, false);
        class43.field559.method2754(class521.method3084(arg0, 78) + 1, 5574);
        class43.field559.method2731(arg0, (byte) -89);
        class43.field559.method2754(arg1 ? 1 : 0, 5574);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lvd;)V", line = 105)
    public class374(class258 arg0) {
        this.field5646 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 118)
    public static void method2219(int arg0) {
        if (arg0 != 3) {
            method2218(null, true, (byte) 13);
        }
        field5647 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public abstract void method19(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLew;I)V")
    public abstract void method18(boolean arg0, class271 arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZ)V")
    public abstract void method25(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public abstract void method24(int arg0);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public abstract void method20(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public abstract boolean method21(byte arg0);
}
