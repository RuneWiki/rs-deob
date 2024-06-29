import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class175 extends class74 {

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lcc;")
    public static class209 field3185 = class95.method669(102, "OK");

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static volatile int field3189 = -1;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public static int[] field3187 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lcc;")
    public static class209 field3194 = class95.method669(95, "null");

    @OriginalMember(owner = "client!di", name = "p", descriptor = "Lcc;")
    public static class209 field3192 = class95.method669(96, "lila:");

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lsg;")
    public static class162 field3193 = new class162();

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lsj;")
    public static class49 field3184;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3188;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
    public static final void method1201(int arg0) {
        field3190++;
        class6.field98.method665(arg0 - 27207);
        if (arg0 != 27208) {
            method1201(-62);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)V")
    public static final void method1202(int arg0, int arg1, byte arg2) {
        field3186++;
        short var3 = 256;
        if (class142.field2616 > 0) {
            class116.method826((byte) 103, class142.field2616);
            class142.field2616 = 0;
        }
        int var4 = 0;
        int var5 = class4.field53 * arg0;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class73.field1391[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class43.field865[var4++];
                int var12 = class4.field60[var5++ + arg1];
                if (var11 == 0) {
                    class257.field4632.field4801[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    int var14 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class23.field426[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class257.field4632.field4801[var6++] = class27.method220(class27.method220(var12, 65280) * var14 + class27.method220(var15, 65280) * var13, 16711680) + class27.method220(var14 * class27.method220(var12, 16711935) + var13 * class27.method220(16711935, var15), -16711936) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class257.field4632.field4801[var6++] = class4.field60[var5++ + arg1];
            }
            var5 += class4.field53 - 128;
        }
        if (arg2 != 47) {
            field3184 = null;
        }
        class257.field4632.method228(arg1, arg0);
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field3185 = null;
        field3194 = null;
        field3192 = null;
        field3188 = null;
        field3193 = null;
        field3187 = null;
        field3184 = null;
        if (arg0 != 4) {
            field3189 = -98;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        class178.method1226(5, (byte) -125);
        class134.method939(5, 15941);
        class73.method523((byte) 105, 5);
        class69.method510(5, arg0 - 31612);
        field3191++;
        class193.method1323((byte) -48, 5);
        class129.method925((byte) 119, 5);
        class113.method805(29424, 5);
        class61.method459((byte) -116, 5);
        class82.method587(arg0 ^ arg0, 5);
        class78.method544(-19338, 5);
        class87.method626(arg0 - 31722, 5);
        class284.method1908(50, (byte) -106);
        class283.method1900(5, (byte) -114);
        class164.method1137((byte) 75, 5);
        class28.field516.method662(32768, 5);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Lsb;")
    public static final class224 method1205(int arg0) {
        field3183++;
        if (arg0 == 1) {
            class194 var1 = new class194(class241.field4360, class50.field996, class182.field3289[0], class271.field4815[0], class110.field2226[0], class185.field3332[0], class202.field3638[0], class117.field2341);
            class63.method468(arg0 ^ 0x75);
            return var1;
        } else {
            return null;
        }
    }
}
