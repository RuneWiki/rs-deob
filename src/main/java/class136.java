import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class136 extends class107 {

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "[B")
    public byte[] field3323;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field3319 = 0;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "Lrc;")
    public static class105 field3330 = class43.method374("(Z", 0);

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "Lrc;")
    public static class105 field3331 = class43.method374("oberen Rand der Webseite ausw-=hlen)3", 0);

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lrc;")
    private static class105 field3325 = class43.method374("Please contact customer support)3", 0);

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lrc;")
    public static class105 field3326 = class43.method374("Zu viele Anmelde)2Versuche von Ihrer Adresse", 0);

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "Lrc;")
    public static class105 field3332 = class43.method374("Mem:", 0);

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "Lrc;")
    public static class105 field3333 = class43.method374("backtop1", 0);

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lrc;")
    public static class105 field3320 = class43.method374("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "Lrc;")
    public static class105 field3334 = class43.method374("Aus", 0);

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lrc;")
    public static class105 field3328 = field3325;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "[I")
    public static int[] field3324;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V", line = 14)
    public static final void method1067(byte arg0, int arg1) {
        field3329++;
        class120 var2 = (class120) class17.field349.method624((byte) 116, (long) arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2888.length; var3++) {
            var2.field2888[var3] = -1;
            var2.field2885[var3] = 0;
        }
        if (arg0 != -8) {
            method1068(-45, -113, -43);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 51)
    public static final void method1068(int arg0, int arg1, int arg2) {
        field3321++;
        class113 var3 = class134.method1056(arg2, -69);
        int var4 = var3.field2657;
        int var5 = var3.field2661;
        int var6 = var3.field2660;
        if (arg0 > -72) {
            field3333 = null;
        }
        int var7 = class102.field2315[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class16.field337[var4] = class14.method156(class100.method807(class16.field337[var4], ~var8), class100.method807(arg1 << var5, var8));
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)V", line = 89)
    public static final void method1069(byte arg0, int arg1) {
        field3335++;
        if (class78.field1761 == arg1) {
            return;
        }
        if (class78.field1761 == 0) {
            class127.method1024(-2);
        }
        if (arg1 == 20 || arg1 == 40) {
            class50.field1062 = 0;
            class58.field1294 = 0;
            class100.field2284 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class45.field1010 != null) {
            class45.field1010.method1037(arg0 ^ 0x2D);
            class45.field1010 = null;
        }
        if (class78.field1761 == 25 || class78.field1761 == 40) {
            class36.method335(114);
            class69.method583();
        }
        if (class78.field1761 == 25) {
            class84.field1883 = 1;
            class112.field2642 = 1;
            class89.field2055 = 0;
            field3319 = 0;
            class71.field1559 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class84.method703((byte) 53);
            class134.method1062(false);
            if (class42.field944 == null) {
                class42.field944 = class86.method712(-67, 503, 765, class41.field935);
            }
        }
        if (arg0 != 45) {
            field3333 = null;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class42.field944 = null;
            class84.method703((byte) 53);
            class51.method400(arg0 ^ 0x6D, class111.field2591, class41.field935, class90.field2073);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class42.field944 = null;
            class134.method1062(false);
            class121.method973(83, class111.field2591, class41.field935);
        }
        class78.field1761 = arg1;
        class67.field1506 = true;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V", line = 168)
    public class136(byte[] arg0) {
        this.field3323 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V", line = 185)
    public static void method1070(byte arg0) {
        field3332 = null;
        field3326 = null;
        if (arg0 != 49) {
            return;
        }
        field3325 = null;
        field3328 = null;
        field3333 = null;
        field3324 = null;
        field3320 = null;
        field3330 = null;
        field3334 = null;
        field3331 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V", line = 218)
    public static final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3327++;
        if (class29.method273(arg3, 103)) {
            if (arg0 != 0) {
                field3328 = null;
            }
            class12.method143(-1, arg1, 0, 0, class14.field282[arg3], arg6, arg4, arg2, 512, arg5);
        }
    }
}
