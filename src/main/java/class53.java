import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class53 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lub;")
    public static class227 field927 = class257.method1749("m", 17263);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lub;")
    public static class227 field929 = class257.method1749("headicons_prayer", 17263);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lrb;")
    public static class254 field931 = new class254(64);

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lub;")
    public static class227 field932 = class257.method1749("hint_headicons", 17263);

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lub;")
    public static class227 field934 = class257.method1749("hitmarks", 17263);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIIIZI[B[Ldj;)V")
    public static final void method307(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, class134[] arg7) {
        byte var8;
        if (arg4) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field930++;
        if (arg0 != -53) {
            method308(83);
        }
        if (!arg4) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg3 + var10 > 0 && (arg3 + var10) < 103 && (arg2 + var11) > 0 && arg2 + var11 < 103) {
                            arg7[var9].field2338[arg3 + var10][arg2 + var11] = class76.method446(arg7[var9].field2338[arg3 + var10][arg2 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class226 var12 = new class226(arg6);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class254.method1726((byte) 114, arg4, arg1, arg5, arg3 + var14, 0, var13, arg2 + var15, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method308(int arg0) {
        field932 = null;
        field931 = null;
        field934 = null;
        if (arg0 != 25724) {
            method307((byte) -7, 60, -53, 117, false, -28, (byte[]) null, (class134[]) null);
        }
        field929 = null;
        field927 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method309(Component arg0, int arg1) {
        field928++;
        arg0.removeKeyListener(class134.field2341);
        arg0.removeFocusListener(class134.field2341);
        class251.field4352 = -1;
        if (arg1 >= -70) {
            method307((byte) -114, -43, -4, 72, false, -17, (byte[]) null, (class134[]) null);
        }
    }
}
