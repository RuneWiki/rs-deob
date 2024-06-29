import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class499 {

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "B")
    public byte field7360;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "B")
    public byte field7356;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "S")
    public short field7364;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "S")
    public short field7362;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Z")
    public boolean field7365;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "S")
    public short field7363;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7355 = 0;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lof;")
    public static class446 field7358 = new class446(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lof;")
    public static class446 field7366 = new class446("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
    public static final boolean method2971(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2971(-73, 0, -96);
        }
        field7353++;
        return (arg2 & 0x60000) != 0 | class221.method1491(arg0, arg2, (byte) 127) || class167.method1134(arg1 ^ 0x37, arg0, arg2) || class424.method2589((byte) -23, arg2, arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method2972(int arg0) {
        if (arg0 != -13669) {
            return;
        }
        field7361++;
        if (class400.field6090 == null) {
            return;
        }
        class36.field526.method3046(99);
        class425.method2598();
        class361.method2303((byte) -4);
        class330.method2126(0);
        class178.method1196(arg0 - 6273);
        class66.method470(false);
        if (class121.field1655 != null) {
            class121.field1655.method482((byte) 108);
        }
        class514.method3069(1510);
        class475.method2833(0);
        class5.method21(7537);
        class229.method1543(false, arg0 ^ 0xFFFFCADB);
        class211.method1453(15793);
        for (int var1 = 0; var1 < 2048; var1++) {
            class96 var5 = class241.field3398[var1];
            if (var5 != null) {
                var5.field3909 = null;
                for (int var6 = 0; var6 < var5.field3912.length; var6++) {
                    var5.field3912[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class515.field7566; var2++) {
            class17 var3 = class480.field7090[var2].field348;
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field3912.length; var4++) {
                    var3.field3912[var4] = null;
                }
            }
        }
        class24.field346 = null;
        class346.field5342 = null;
        class400.field6090.method1120((byte) -125);
        class400.field6090 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method2973(int arg0) {
        int var1 = 74 / ((39 - arg0) / 46);
        field7358 = null;
        field7366 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)Loa;")
    public final class499 method2974(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7354++;
        return arg0 == 6535 ? new class499(arg2, arg4, arg3, arg1, this.field7363, this.field7362, this.field7364, this.field7356, this.field7360, this.field7365) : null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7360 = (byte) arg8;
        this.field7357 = arg0;
        this.field7356 = (byte) arg7;
        this.field7364 = (short) arg6;
        this.field7362 = (short) arg5;
        this.field7365 = arg9;
        this.field7363 = (short) arg4;
    }
}
