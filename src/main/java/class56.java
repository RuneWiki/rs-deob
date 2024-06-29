import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class56 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lfd;")
    public static class194 field562 = null;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lve;")
    public class307 field569;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Ljn;")
    public class396 field567;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method288(int arg0, String arg1) {
        field570++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0 != -7023) {
            return null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class53.method254(var6, 402);
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

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)V", line = 61)
    public static final void method289(int arg0, byte arg1, int arg2) {
        field564++;
        if (arg1 != 66) {
            method292(-82, 13, 112);
        }
        class40 var3 = class162.method872(arg0, (byte) 92, 5);
        var3.method190(0);
        var3.field418 = arg2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 78)
    public static final void method290(byte arg0) {
        field565++;
        if (class281.field3855 != null) {
            class281.field3855.method2151((byte) -20);
        }
        if (class414.field5973 != null) {
            class414.field5973.method2151((byte) -20);
        }
        class77.method433(class84.field942, arg0 + 3023, 2, 22050);
        class281.field3855 = class227.method1231(class159.field2055, 0, -1249444089, class38.field391, 22050);
        if (arg0 != 10) {
            method288(123, (String) null);
        }
        class281.field3855.method2148(class112.field1408, -28252);
        class414.field5973 = class227.method1231(class159.field2055, 1, -1249444089, class38.field391, 2048);
        class414.field5973.method2148(class374.field5265, -28252);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 106)
    public static void method291(int arg0) {
        field562 = null;
        if (arg0 != 2048) {
            method293(-59, 4, 117);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 121)
    public static final void method292(int arg0, int arg1, int arg2) {
        field568++;
        class58 var3 = new class58(16);
        for (class268 var4 = (class268) class419.field6102.method315((byte) -110); var4 != null; var4 = (class268) class419.field6102.method310(-92)) {
            var4.method1967(-1);
            int var5 = (int) (var4.field4510 >> 28);
            int var6 = (int) (var4.field4510 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field4510 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && var7 < class315.field4214 && var6 < class340.field4549) {
                var3.method314((long) (var5 << 28 | var6 << 14 | var7), var4, 7079);
            }
        }
        if (arg0 >= 93) {
            class419.field6102 = var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)I", line = 154)
    public static final int method293(int arg0, int arg1, int arg2) {
        field561++;
        int var3 = arg0 >> 31 & arg1 + arg2;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }
}
