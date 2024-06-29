import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class50 extends class31 {

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public int field1272 = 1000;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "Lid;")
    public static class60 field1277 = class11.method72("Bitte warten Sie)3)3)3", (byte) 103);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Ljd;")
    public static class66 field1278 = new class66();

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field1282 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field1285 = 0;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "Lid;")
    private static class60 field1283 = class11.method72(" from your ignore list first", (byte) 94);

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lid;")
    public static class60 field1287 = field1283;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "Lid;")
    public static class60 field1290 = class11.method72("au", (byte) 118);

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "Lid;")
    private static class60 field1288 = class11.method72("Your account is already logged in)3", (byte) 123);

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lid;")
    public static class60 field1286 = field1288;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "Lpa;")
    public static class105 field1280;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Ltf;")
    public static class138 field1276;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "Le;")
    public static class29 field1274;

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "Ljf;")
    public static class68 field1289;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Lka;")
    public class70 method1(int arg0) {
        field1281++;
        int var2 = 105 / ((-arg0 - 1) / 43);
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public void method379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1271++;
        class70 var10 = this.method1(-87);
        if (var10 != null) {
            this.field1272 = var10.field1272;
            var10.method379(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method380(boolean arg0) {
        field1274 = null;
        field1290 = null;
        field1288 = null;
        field1289 = null;
        field1283 = null;
        field1278 = null;
        field1286 = null;
        field1276 = null;
        field1277 = null;
        field1287 = null;
        field1280 = null;
        if (!arg0) {
            method380(false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIB)I")
    public static final int method381(int arg0, int arg1, int arg2, byte arg3) {
        field1273++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        } else if (arg3 == 10) {
            int var6 = arg1 & 0x7F;
            int var7 = arg2 & 0x7F;
            int var8 = arg0;
            if (arg0 < 3 && (class124.field2869[1][var4][var5] & 0x2) == 2) {
                var8 = arg0 + 1;
            }
            int var9 = (128 - var7) * class113.field2711[var8][var4][var5 - -1] + class113.field2711[var8][var4 + 1][var5 + 1] * var7 >> 7;
            int var10 = (128 - var7) * class113.field2711[var8][var4][var5] + class113.field2711[var8][var4 + 1][var5] * var7 >> 7;
            return (128 - var6) * var10 + var6 * var9 >> 7;
        } else {
            return -79;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public static final void method382(int arg0) {
        field1275++;
        class62.field1556.method920((byte) 14);
        if (arg0 != 0) {
            method381(-57, 1, 74, (byte) -41);
        }
        class7.field102.method920((byte) 14);
    }
}
