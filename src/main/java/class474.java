import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class474 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field7006;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2902(int arg0, int arg1) {
        if (arg1 == -20139) {
            field7008++;
            return this.field7006[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class474(String arg0, String arg1, String arg2, String arg3) {
        this.field7006 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILqd;IIIILtt;Leca;)V")
    public static final void method2903(int arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, class78 arg6, class655 arg7) {
        field7011++;
        if (arg2 >= -88) {
            field7009 = -33;
        }
        class588 var8 = new class588();
        var8.field8462 = arg3 << 9;
        var8.field8456 = arg0;
        var8.field8452 = arg4 << 9;
        if (arg1 != null) {
            var8.field8445 = arg1;
            int var9 = arg1.field5860;
            int var10 = arg1.field5858;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg1.field5858;
                var10 = arg1.field5860;
            }
            var8.field8459 = arg1.field5881;
            var8.field8437 = arg1.field5842;
            var8.field8461 = arg1.field5821;
            var8.field8436 = arg1.field5803;
            var8.field8454 = arg1.field5877 << 9;
            var8.field8439 = arg1.field5849;
            var8.field8463 = arg4 + var10 << 9;
            var8.field8435 = arg1.field5846;
            var8.field8449 = arg1.field5822;
            var8.field8444 = arg3 + var9 << 9;
            if (arg1.field5793 != null) {
                var8.field8460 = true;
                var8.method3437(-94);
            }
            if (var8.field8435 != null) {
                var8.field8453 = var8.field8439 + ((int) ((double) (var8.field8459 - var8.field8439) * Math.random()));
            }
            class278.field3884.method706(var8, true);
        } else if (arg6 != null) {
            var8.field8440 = arg6;
            class566 var11 = arg6.field864;
            if (var11.field8121 != null) {
                var8.field8460 = true;
                var11 = var11.method3287(113, class23.field243);
            }
            if (var11 != null) {
                var8.field8463 = arg4 + var11.field8096 << 9;
                var8.field8444 = arg3 + var11.field8096 << 9;
                var8.field8436 = class46.method245(arg6, 55);
                var8.field8437 = var11.field8063;
                var8.field8461 = var11.field8087;
                var8.field8454 = var11.field8124 << 9;
            }
            class407.field6140.method706(var8, true);
        } else if (arg7 != null) {
            var8.field8442 = arg7;
            var8.field8444 = arg7.method1153(true) + arg3 << 9;
            var8.field8463 = arg4 + arg7.method1153(true) << 9;
            var8.field8436 = class78.method511((byte) 3, arg7);
            var8.field8437 = arg7.field9441;
            var8.field8454 = arg7.field9482 << 9;
            var8.field8461 = arg7.field9438;
            class281.field3922.method520((byte) -88, var8, (long) arg7.field2495);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method2904(byte arg0) {
        if (arg0 != 54) {
            field7009 = -116;
        }
        field7007++;
        if (class524.field7615) {
            return;
        }
        class421.field6304 = true;
        class524.field7615 = true;
        if (class595.field8694.field6547) {
            class388.field5967 = ((int) class388.field5967 - 65 & 0xFFFFFF80);
        } else {
            class65.field719 += (-class65.field719 - 24.0F) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7010++;
        throw new IllegalStateException();
    }

    static {
        new class474("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
