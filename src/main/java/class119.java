import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class119 {

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    private int field2936 = 0;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[Lge;")
    private class47[] field2935;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    private int field2922;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Loc;")
    public static class99 field2917 = class48.method402((byte) -104, "redstone3");

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Loc;")
    public static class99 field2918 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2923 = -1;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Loc;")
    public static class99 field2924 = class48.method402((byte) -104, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[Ljc;")
    public static class64[] field2931 = new class64[1000];

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "Loc;")
    public static class99 field2927 = class48.method402((byte) -104, "k");

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Loc;")
    public static class99 field2926 = class48.method402((byte) -104, "title_mute");

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Loc;")
    public static class99 field2932 = class48.method402((byte) -104, "@yel@");

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Loc;")
    public static class99 field2937 = class48.method402((byte) -104, "Ihre Nachricht an: ");

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "J")
    private long field2934;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lpc;")
    public static class105 field2921;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lge;")
    private class47 field2925;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lge;")
    private class47 field2939;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[I")
    public static int[] field2929;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JB)Lge;")
    public final class47 method1001(long arg0, byte arg1) {
        field2938++;
        this.field2934 = arg0;
        int var4 = 38 % ((arg1 - 4) / 32);
        class47 var5 = this.field2935[(int) (arg0 & (long) (this.field2922 - 1))];
        for (this.field2925 = var5.field1146; this.field2925 != var5; this.field2925 = this.field2925.field1146) {
            if (this.field2925.field1138 == arg0) {
                class47 var6 = this.field2925;
                this.field2925 = this.field2925.field1146;
                return var6;
            }
        }
        this.field2925 = null;
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Lge;")
    public final class47 method1002(int arg0) {
        field2928++;
        this.field2936 = 0;
        if (arg0 >= -20) {
            method1003((byte) -8);
        }
        return this.method1005(2355);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1003(byte arg0) {
        field2929 = null;
        field2937 = null;
        field2932 = null;
        field2931 = null;
        field2927 = null;
        field2926 = null;
        field2924 = null;
        field2918 = null;
        field2917 = null;
        field2921 = null;
        if (arg0 != 35) {
            field2918 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Lge;")
    public final class47 method1004(int arg0) {
        field2933++;
        if (this.field2925 == null) {
            return null;
        }
        int var2 = 31 % ((arg0 + 23) / 54);
        class47 var3 = this.field2935[(int) (this.field2934 & (long) (this.field2922 - 1))];
        while (this.field2925 != var3) {
            if (this.field2925.field1138 == this.field2934) {
                class47 var4 = this.field2925;
                this.field2925 = this.field2925.field1146;
                return var4;
            }
            this.field2925 = this.field2925.field1146;
        }
        this.field2925 = null;
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lge;")
    public final class47 method1005(int arg0) {
        field2930++;
        if (arg0 != 2355) {
            return null;
        } else if (this.field2936 <= 0 || this.field2935[this.field2936 - 1] == this.field2939) {
            while (this.field2922 > this.field2936) {
                class47 var3 = this.field2935[this.field2936++].field1146;
                if (this.field2935[this.field2936 - 1] != var3) {
                    this.field2939 = var3.field1146;
                    return var3;
                }
            }
            return null;
        } else {
            class47 var2 = this.field2939;
            this.field2939 = var2.field1146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JLge;I)V")
    public final void method1006(long arg0, class47 arg1, int arg2) {
        field2919++;
        if (arg2 >= -107) {
            this.method1006(68L, null, 17);
        }
        if (arg1.field1145 != null) {
            arg1.method394((byte) -77);
        }
        class47 var5 = this.field2935[(int) (arg0 & (long) (this.field2922 - 1))];
        arg1.field1145 = var5.field1145;
        arg1.field1146 = var5;
        arg1.field1138 = arg0;
        arg1.field1145.field1146 = arg1;
        arg1.field1146.field1145 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        this.field2935 = new class47[arg0];
        this.field2922 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class47 var3 = this.field2935[var2] = new class47();
            var3.field1146 = var3;
            var3.field1145 = var3;
        }
    }
}
