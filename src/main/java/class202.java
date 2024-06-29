import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class202 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2762 = "Loaded client variable data";

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "Lqj;")
    public static class296 field2761;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
    public static final boolean method1332(int arg0, int arg1) {
        class445.field6418 = arg0 + arg1 & 0xFFFF;
        class142.field2057 = true;
        field2759++;
        return true;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static final void method1333(byte arg0) {
        if (arg0 != 15) {
            method1332(120, 70);
        }
        field2760++;
        if (class164.field2310) {
            class164.field2310 = false;
            class91.field1379 = null;
            class264.field3600 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method1334(boolean arg0) {
        field2761 = null;
        if (arg0) {
            field2762 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1335(String arg0, int arg1) {
        field2758++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg1 != -24073) {
            method1335((String) null, 16);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class399.method2581(var6, 127);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }
}
