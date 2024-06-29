import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class66 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public static int[] field980 = new int[13];

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ltm;")
    public static class112 field981 = new class112("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 13)
    public static void method466(int arg0) {
        if (arg0 < 57) {
            field980 = null;
        }
        field980 = null;
        field981 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[B", line = 28)
    public static final synchronized byte[] method467(int arg0, int arg1) {
        field983++;
        if (arg0 == 100 && class241.field3390 > 0) {
            byte[] var2 = class240.field3387[--class241.field3390];
            class240.field3387[class241.field3390] = null;
            return var2;
        } else if (arg0 == 5000 && class166.field2447 > 0) {
            byte[] var3 = class7.field121[--class166.field2447];
            class7.field121[class166.field2447] = null;
            return var3;
        } else if (arg0 == 30000 && class285.field3900 > 0) {
            byte[] var4 = class78.field1180[--class285.field3900];
            class78.field1180[class285.field3900] = null;
            return var4;
        } else {
            if (arg1 > -114) {
                field981 = null;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 73)
    public static final void method468(int arg0) {
        field984++;
        class172.field2550.method1552((byte) 117);
        if (arg0 <= 115) {
            field982 = 71;
        }
        for (class106 var1 = (class106) class250.field3514.method1544(-86); var1 != null; var1 = (class106) class250.field3514.method1546((byte) -42)) {
            if (var1.field1517 < 1000) {
                var1.method1182(28818);
                class172.field2550.method1553((byte) -80, var1);
            }
        }
        class172.field2550.method1550(34, class250.field3514);
        if (class77.field1169 > 0) {
            return;
        }
        int var2 = -1;
        if (class8.field169 != null) {
            var2 = class8.field169.method976(90);
        }
        if (!class351.field4800) {
            if (var2 == 0 && (class337.field4618 == 1 && class161.field2310 > 2 || class126.method763((byte) 125))) {
                var2 = 2;
            }
            if (var2 == 2 && class161.field2310 > 0 && class8.field169 != null) {
                if (class146.field2070 == null) {
                    class30.method240(class8.field169.method972(false), -16991, class8.field169.method980(90));
                } else {
                    class20.field350 = 2;
                }
            }
            if (var2 == 0 && class161.field2310 > 0) {
                class482.method2830((byte) -120);
            }
            if (class146.field2070 != null) {
                return;
            }
            class132.field1859 = null;
            class20.field350 = 0;
            return;
        }
        if (var2 == -1) {
            int var3 = class56.field902.method1301(13820);
            int var4 = class56.field902.method1305(255);
            if (class393.field5531 - 10 > var3 || class393.field5531 + class23.field405 + 10 < var3 || class214.field3036 - 10 > var4 || class214.field3036 + class183.field2661 + 10 < var4) {
                class351.field4800 = false;
                class189.method1222(class183.field2661, class393.field5531, -10584, class214.field3036, class23.field405);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var5 = class393.field5531;
        int var6 = class214.field3036;
        int var7 = class23.field405;
        int var8 = class8.field169.method980(39);
        int var9 = class8.field169.method972(false);
        int var10 = -1;
        for (int var11 = 0; var11 < class161.field2310; var11++) {
            if (class490.field6921) {
                int var16 = (class161.field2310 - var11 - 1) * 16 + var6 + 33;
                if (var5 < var8 && var5 + var7 > var8 && (var16 - 13) < var9 && (var16 + 4) > var9) {
                    var10 = var11;
                }
            } else {
                int var15 = (class161.field2310 - var11 - 1) * 16 + var6 + 31;
                if (var8 > var5 && var8 < (var5 + var7) && var15 - 13 < var9 && (var15 + 3) > var9) {
                    var10 = var11;
                }
            }
        }
        if (var10 != -1) {
            int var12 = 0;
            class443 var13 = new class443(class250.field3514);
            for (class106 var14 = (class106) var13.method2581(true); var14 != null; var14 = (class106) var13.method2579(-113)) {
                if (var10 == var12) {
                    class24.method210(var14, (byte) 67);
                }
                var12++;
            }
        }
        class351.field4800 = false;
        class189.method1222(class183.field2661, class393.field5531, -10584, class214.field3036, class23.field405);
        return;
    }
}
