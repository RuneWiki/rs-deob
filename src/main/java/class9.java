import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class32 {

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    public static int[] field167 = new int[25];

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lvf;")
    public static class152 field166 = new class152();

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lv;")
    public static class146 field175 = class159.method1226((byte) -37, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lv;")
    public static class146 field173 = class159.method1226((byte) -37, "(Y<)4col>");

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[I")
    public static int[] field176;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI[Lv;)Lv;")
    public static final class146 method63(int arg0, boolean arg1, int arg2, class146[] arg3) {
        field171++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class95.field2286;
            }
            var4 += arg3[arg2 + var5].field3372;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg0; var8++) {
            class146 var10 = arg3[arg2 + var8];
            class11.method68(var10.field3365, 0, var6, var7, var10.field3372);
            var7 += var10.field3372;
        }
        class146 var9 = new class146();
        var9.field3372 = var4;
        var9.field3365 = var6;
        if (arg1) {
            method66(false);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method64(int arg0) {
        field166 = null;
        if (arg0 == 0) {
            field167 = null;
            field173 = null;
            field176 = null;
            field175 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZZ)Lv;")
    public static final class146 method65(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            method65(87, true, false);
        }
        field165++;
        return class71.method508(10, arg0, (byte) -113, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static final void method66(boolean arg0) {
        field168++;
        class127.field2929.method1050(!arg0);
        class3.field67.method1050(!arg0);
        if (arg0) {
            field175 = null;
        }
        class72.field1674.method1050(true);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class9() {
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field170 = arg0;
    }
}
