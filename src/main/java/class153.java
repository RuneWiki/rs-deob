import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class153 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Le;")
    public static class312 field2160 = new class312();

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "J")
    public static long field2161;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public static final void method1032(int arg0, int arg1) {
        class27.field432.method1254(arg1, 120);
        if (arg0 > -67) {
            method1033(-51);
        }
        field2162++;
        class299.field4141.method1254(arg1, -60);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Z")
    public static final boolean method1033(int arg0) {
        field2157++;
        if (arg0 != 0) {
            field2163 = 37;
        }
        if (class318.field4370) {
            try {
                class274.method1687(class204.field2772.field4888, arg0 ^ 0xFFFFE96E, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public static void method1034(int arg0) {
        if (arg0 == -29781) {
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
    public static final String method1035(boolean arg0, int[] arg1) {
        field2158++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class429.field6158;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class417 var5 = class426.method2685(-4871, arg1[var4]);
            if (var5.field6034 != -1) {
                class130 var6 = (class130) class2.field21.method1246((byte) -44, (long) var5.field6034);
                if (var6 == null) {
                    class18 var7 = class18.method119(class353.field4943, var5.field6034, 0);
                    if (var7 != null) {
                        var6 = class408.field5920.method1807(var7, true);
                        class2.field21.method1247((long) var5.field6034, (byte) -103, var6);
                    }
                }
                if (var6 != null) {
                    class28.field444[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        if (arg0) {
            return null;
        } else {
            return var2.toString();
        }
    }
}
