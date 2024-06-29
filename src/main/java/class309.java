import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class309 extends class425 {

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Ljava/lang/String;")
    public String field4493;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ltj;")
    public static class108 field4495;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Lml;")
    public static class219 field4494;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "[[[I")
    public static int[][][] field4490;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)I")
    public static final int method2073(int arg0, byte arg1) {
        field4491++;
        int var2 = arg0 & 0x3F;
        if (arg1 > -24) {
            method2073(36, (byte) -70);
        }
        int var3 = (arg0 & 0xC8) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static final void method2074(int arg0) {
        field4492++;
        try {
            if (class439.field6279 == 1) {
                int var1 = class213.field3014.method1459(arg0 ^ 0xFFFFC8D5);
                if (var1 > 0 && class213.field3014.method1452(1024)) {
                    int var2 = var1 - class444.field6343;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class213.field3014.method1440(var2, -126);
                    return;
                }
                class213.field3014.method1443(false);
                class213.field3014.method1468(-25686);
                class28.field357 = null;
                class324.field4713 = null;
                if (class20.field269 == null) {
                    class439.field6279 = 0;
                } else {
                    class439.field6279 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class213.field3014.method1443(false);
            class28.field357 = null;
            class20.field269 = null;
            class324.field4713 = null;
            class439.field6279 = 0;
        }
        if (arg0 != 2) {
            method2074(-10);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method2075(int arg0) {
        field4496++;
        String var1 = "www";
        if (arg0 != -21977) {
            method2076((byte) 0);
        }
        if (class214.field3022 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class324.field4720 != null) {
            var2 = "/p=" + class324.field4720;
        }
        return class317.field4656 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + field4497 + "/a=" + class363.field5213 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + field4497 + "/a=" + class363.field5213 + var2 + "/";
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class309() {
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
    public static void method2076(byte arg0) {
        field4494 = null;
        if (arg0 <= 103) {
            field4490 = null;
        }
        field4490 = null;
        field4495 = null;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class309(String arg0) {
        this.field4493 = arg0;
    }
}
