import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class418 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field6179 = 0;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[[Ljava/lang/String;")
    public static String[][] field6177 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[Leda;")
    public static class116[] field6180;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BZLjava/lang/String;)I")
    public static final int method2538(int arg0, byte[] arg1, boolean arg2, String arg3) {
        field6181++;
        int var4 = arg0;
        int var5 = arg3.length();
        if (arg2) {
            method2541(42, 47);
        }
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class12.method80(-1, arg3.charAt(var6));
            int var8 = var6 + 1 < var5 ? class12.method80(-1, arg3.charAt(var6 + 1)) : -1;
            int var9 = (var6 + 2) >= var5 ? -1 : class12.method80(-1, arg3.charAt(var6 + 2));
            int var10 = var5 > (var6 + 3) ? class12.method80(-1, arg3.charAt(var6 + 3)) : -1;
            arg1[arg0++] = (byte) class151.method1076(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class151.method1076(class425.method2563(var8 << 4, 240), var9 >>> 2);
            if (var10 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class151.method1076(class425.method2563(var9, 3) << 6, var10);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    public static final int method2539(int arg0, int arg1) {
        return class697.field9813 == null ? 0 : class697.field9813[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method2540(int arg0) {
        field6180 = null;
        field6177 = null;
        if (arg0 != -17368) {
            field6180 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)I")
    public static final int method2541(int arg0, int arg1) {
        field6178++;
        if (arg0 != 23341) {
            field6177 = null;
        }
        return arg1 >>> 8;
    }
}
