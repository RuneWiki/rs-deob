import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    public static boolean field3180 = false;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lkb;")
    public static class71 field3182 = new class71();

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lsc;")
    public static class128 field3185 = class129.method1017(false, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lrc;")
    public static class121 field3183 = new class121();

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field3186 = 1;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lsc;")
    public static class128 field3187 = class129.method1017(false, "null");

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lae;")
    public static class6 field3184;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static final void method1092(boolean arg0) {
        class89.method696(class43.field814, 1);
        client.field433++;
        field3178++;
        if (class14.field278 && class6.field83) {
            int var1 = class64.field1380;
            int var2 = var1 - class144.field3355;
            int var3 = class18.field330;
            if (arg0) {
                field3184 = null;
            }
            if (var2 < class137.field3240) {
                var2 = class137.field3240;
            }
            int var4 = var3 - class25.field505;
            if (var4 < class46.field860) {
                var4 = class46.field860;
            }
            if (class43.field814.field1154 + var2 > class137.field3240 - -class37.field727.field1154) {
                var2 = class137.field3240 + class37.field727.field1154 - class43.field814.field1154;
            }
            if (class46.field860 + class37.field727.field1111 < class43.field814.field1111 + var4) {
                var4 = class46.field860 + class37.field727.field1111 - class43.field814.field1111;
            }
            int var5 = class43.field814.field1207;
            int var6 = var4 - class33.field622;
            int var7 = var2 - class113.field2546;
            int var8 = class37.field727.field1157 + var2 - class137.field3240;
            if (class43.field814.field1135 < client.field433 && (var5 < var7 || var7 < -var5 || var6 > var5 || -var5 > var6)) {
                class25.field504 = true;
            }
            int var9 = class37.field727.field1211 + var4 - class46.field860;
            if (class43.field814.field1114 != null && class25.field504) {
                class18 var10 = new class18();
                var10.field338 = var8;
                var10.field321 = class43.field814.field1114;
                var10.field326 = var9;
                var10.field314 = class43.field814;
                class46.method341(var10, -2601);
            }
            if (class147.field3400 == 0) {
                if (class25.field504) {
                    if (class43.field814.field1176 != null) {
                        class18 var11 = new class18();
                        var11.field324 = class29.field561;
                        var11.field338 = var8;
                        var11.field326 = var9;
                        var11.field321 = class43.field814.field1176;
                        var11.field314 = class43.field814;
                        class46.method341(var11, -2601);
                    }
                    if (class29.field561 != null && class153.method1213(0, class43.field814) != null) {
                        class152.field3502.method507(-96, 0);
                        class152.field3502.method652(class43.field814.field1117, 10114);
                        class152.field3502.method652(class29.field561.field1117, 10114);
                        class152.field3502.method656(class29.field561.field1162, (byte) 33);
                        class152.field3502.method673((byte) 54, class43.field814.field1162);
                        class64.field1374++;
                    }
                } else if ((class49.field912 == 1 || class134.method1089(class7.field103 - 1, false)) && class7.field103 > 2) {
                    class7.method32(108);
                } else if (class7.field103 > 0) {
                    class25.method221(class7.field103 - 1, arg0);
                }
                class43.field814 = null;
            }
        } else if (client.field433 > 1) {
            class43.field814 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
    public static final boolean method1093(int arg0, byte arg1) {
        field3181++;
        if (arg1 >= -104) {
            return false;
        } else {
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method1094(int arg0, int arg1, int arg2) {
        field3177++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 / 128;
        if (arg1 != 14077) {
            return 49;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method1095(boolean arg0) {
        if (arg0) {
            method1092(false);
        }
        field3185 = null;
        field3183 = null;
        field3184 = null;
        field3187 = null;
        field3182 = null;
    }
}
