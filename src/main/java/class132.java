import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class132 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lqf;")
    public static class117 field3128 = class72.method514(100, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lqf;")
    private static class117 field3134 = class72.method514(112, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lqf;")
    public static class117 field3136 = class72.method514(98, "http:)4)4");

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "Lqf;")
    private static class117 field3133 = class72.method514(108, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lqf;")
    public static class117 field3132 = field3134;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lqf;")
    public static class117 field3129 = field3133;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lqf;")
    public static class117 field3130 = class72.method514(106, "(U1");

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
    public byte[] field3121;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "[B")
    public byte[] field3139;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    public static int[] field3126;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1023(int arg0, int arg1) {
        field3138++;
        if (arg0 == -1 || !class25.field495[arg0]) {
            return;
        }
        class77.field1709.method438(arg0, (byte) -94);
        if (class141.field3426[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class141.field3426[arg0].length; var3++) {
            if (class141.field3426[arg0][var3] != null) {
                if (class141.field3426[arg0][var3].field2142 == 2) {
                    var2 = false;
                } else {
                    class141.field3426[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class141.field3426[arg0] = null;
        }
        if (arg1 != 536866401) {
            method1025((byte) 27);
        }
        class25.field495[arg0] = false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static final void method1024(byte arg0) {
        for (int var1 = 0; var1 < class25.field483; var1++) {
            int var2 = class150.field3724[var1];
            class58 var3 = class72.field1533[var2];
            if (var3 != null) {
                class124.method988(var3.field1172.field3199, (byte) 47, var3);
            }
        }
        if (arg0 != -88) {
            field3129 = null;
        }
        field3120++;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1025(byte arg0) {
        field3136 = null;
        field3133 = null;
        field3130 = null;
        if (arg0 != -69) {
            method1024((byte) 55);
        }
        field3132 = null;
        field3126 = null;
        field3129 = null;
        field3134 = null;
        field3128 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILda;)V")
    public static final void method1026(int arg0, class23 arg1) {
        int var2 = -1;
        int var3 = 0;
        field3131++;
        if (arg1.field434 == 0) {
            var3 = class19.field311.method846(arg1.field445, arg1.field450, arg1.field439);
        }
        int var4 = 0;
        int var5 = 0;
        if (arg1.field434 == 1) {
            var3 = class19.field311.method856(arg1.field445, arg1.field450, arg1.field439);
        }
        if (arg1.field434 == 2) {
            var3 = class19.field311.method875(arg1.field445, arg1.field450, arg1.field439);
        }
        if (arg1.field434 == 3) {
            var3 = class19.field311.method839(arg1.field445, arg1.field450, arg1.field439);
        }
        if (~var3 != arg0) {
            var2 = var3 >> 14 & 0x7FFF;
            int var6 = class19.field311.method848(arg1.field445, arg1.field450, arg1.field439, var3);
            var5 = var6 >> 6 & 0x3;
            var4 = var6 & 0x1F;
        }
        arg1.field454 = var5;
        arg1.field446 = var4;
        arg1.field451 = var2;
    }
}
