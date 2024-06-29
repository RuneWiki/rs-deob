import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class535 {

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Llh;")
    public class447 field7502 = null;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "Llh;")
    public class447 field7509 = null;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "[Lrr;")
    public class303[] field7510 = null;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "[Lrr;")
    public class303[] field7512 = null;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "Llh;")
    public class447 field7505 = null;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "Z")
    public boolean field7507;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field7508 = 0;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field7503 = 0;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field7506 = class131.method739(1600, 4);

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "Lvj;")
    public static class373 field7513 = new class373(93, 11);

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
    public static void method3052(int arg0) {
        field7513 = null;
        if (arg0 != 128) {
            method3052(-86);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ln;BLjava/awt/Canvas;I)Lqa;")
    public static final class206 method3053(class17 arg0, byte arg1, Canvas arg2, int arg3) {
        if (arg1 > -94) {
            method3053(null, (byte) -108, null, -44);
        }
        field7504++;
        return new class537(arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lmh;)V")
    public class535(class537 arg0) {
        this.field7507 = arg0.field7770;
        class552.method3229((byte) -115, arg0);
        if (this.field7507) {
            byte[] var6 = class258.method1451(false, class476.field6693, 15);
            this.field7502 = new class447(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class258.method1451(false, class646.field9398, 15);
            this.field7509 = new class447(arg0, 6410, 128, 128, 16, var7, 6410);
            class583 var8 = arg0.field7735;
            if (var8.method3392(25059)) {
                byte[] var9 = class258.method1451(false, class458.field6306, 15);
                this.field7505 = new class447(arg0, 6408, 128, 128, 16);
                class447 var10 = new class447(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3393(0, 2.0F, var10, this.field7505)) {
                    this.field7505.method1349(9987);
                } else {
                    this.field7505.method1352(-99);
                    this.field7505 = null;
                }
                var10.method1352(-100);
            }
        } else {
            this.field7512 = new class303[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class167.method928(class476.field6693, 32768, var2 * 32768, -104);
                this.field7512[var2] = new class303(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field7510 = new class303[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class167.method928(class646.field9398, 32768, var3 * 16384 * 2, -104);
                this.field7510[var3] = new class303(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
