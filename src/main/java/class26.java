import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class26 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lcd;")
    public static class64 field422 = class44.method335((byte) 71, " <col=ffff00>");

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field426 = 0;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Z")
    public static boolean field425 = false;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "F")
    public static float field424;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lqm;")
    public static class222 field427;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Lcd;")
    public static class64[] field430;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 5)
    public static void method235(int arg0) {
        field427 = null;
        field430 = null;
        if (arg0 < -6) {
            field422 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLja;)Z", line = 29)
    public static final boolean method236(byte arg0, class60 arg1) {
        field423++;
        if (arg1.field1013 == 205) {
            class269.field4654 = 250;
            return true;
        } else {
            if (arg0 != 45) {
                method236((byte) -119, (class60) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lqm;Z)V", line = 49)
    public static final void method237(class222 arg0, boolean arg1) {
        field429++;
        if (arg1) {
            method238(124, (byte) -12);
        }
        class253.field4418 = arg0;
        class85.field1574 = class253.field4418.method1600(4, (byte) -49);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)I", line = 70)
    public static final int method238(int arg0, byte arg1) {
        field420++;
        if (arg1 > -52) {
            method237((class222) null, true);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIIIIFB)[[I", line = 88)
    public static final int[][] method239(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, float arg7, byte arg8) {
        int[][] var9 = new int[arg1][arg0];
        class131 var10 = new class131();
        var10.field2321 = arg2;
        var10.field2326 = arg6;
        var10.field2325 = (int) (arg7 * 4096.0F);
        field431++;
        var10.field2345 = arg5;
        var10.field2346 = arg3;
        var10.method288(17772);
        class54.method408(arg0, 102, arg1);
        if (arg8 != -72) {
            field427 = (class222) null;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method944(var11, var9[var11], (byte) 102);
        }
        return var9;
    }
}
