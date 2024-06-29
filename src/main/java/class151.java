import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class151 extends class113 {

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "[Lva;")
    public static class189[] field3013 = new class189[2048];

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Lcd;")
    private static class23 field3016 = class54.method414("OFF", -1);

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field3019 = 0;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Lcd;")
    private static class23 field3021 = class54.method414("au", -1);

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Lcd;")
    public static class23 field3020 = class54.method414("Bitte benutzen Sie eine andere Welt)3", -1);

    @OriginalMember(owner = "client!qh", name = "T", descriptor = "Z")
    public static boolean field3026 = false;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "Lcd;")
    public static class23 field3025 = field3016;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lj;")
    public static class80 field3012;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILva;)V")
    public final void method935(int arg0, class189 arg1) {
        while (true) {
            int var3 = arg1.method1202(-88);
            if (var3 == 0) {
                if (arg0 != -21131) {
                    method938(null, (byte) -35);
                }
                field3027++;
                return;
            }
            this.method936(arg1, -2, var3);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lva;II)V")
    private final void method936(class189 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field3023 = arg0.method1197(-1);
            this.field3018 = arg0.method1202(arg1 ^ 0xFFFFFF85);
            this.field3010 = arg0.method1202(-32);
        }
        field3024++;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method937(byte arg0) {
        field3016 = null;
        if (arg0 > -70) {
            field3012 = null;
        }
        field3020 = null;
        field3025 = null;
        field3021 = null;
        field3013 = null;
        field3012 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lcd;B)I")
    public static final int method938(class23 arg0, byte arg1) {
        field3017++;
        if (class145.field2956 == 1) {
            return 7;
        } else if (arg0.method144(class120.field2501, 0)) {
            return 1;
        } else if (arg0.method144(class153.field3071, 0)) {
            return 1;
        } else if (arg0.method144(class193.field3817, 0)) {
            return 2;
        } else {
            int var2 = 113 % ((arg1 - 58) / 41);
            if (arg0.method144(class5.field93, 0)) {
                return 2;
            } else if (arg0.method144(field3021, 0)) {
                return 3;
            } else if (arg0.method144(class113.field2376, 0)) {
                return 4;
            } else if (arg0.method144(class133.field2748, 0)) {
                return 4;
            } else if (arg0.method144(class193.field3809, 0)) {
                return 5;
            } else if (arg0.method144(class81.field1768, 0)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
    public static final void method939(boolean arg0, int arg1) {
        field3014++;
        class175.method1097(true);
        class104.field2242++;
        if (class104.field2242 < 50 && !arg0) {
            return;
        }
        class104.field2242 = 0;
        if (!class189.field3721 && class109.field2310 != null) {
            class159.field3190.method631(120, -1);
            class14.field322++;
            try {
                class109.field2310.method495(class159.field3190.field3752, class159.field3190.field3753, (byte) 29, 0);
                class159.field3190.field3752 = 0;
            } catch (IOException var2) {
                class189.field3721 = true;
            }
        }
        if (arg1 < 21) {
            method937((byte) -91);
        }
    }
}
