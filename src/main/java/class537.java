import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class537 {

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lun;")
    public static class604[] field7375 = new class604[16];

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Lcb;")
    public static class318 field7376 = new class318(13, 10);

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "F")
    public static float field7372;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3032(byte arg0) {
        field7374++;
        if (class476.field6436 == 7) {
            class511.method2893(1000000, false);
            return;
        }
        if (arg0 < 63) {
            field7376 = null;
        }
        class461.field6283 = class80.field1014;
        class80.field1014 = null;
        class676.method3739(-22149, 13);
    }

    @OriginalMember(owner = "client!kca", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field7373++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 35)
    public static final void method3033(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        field7378++;
        class497 var9 = class286.field3868[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class286.field3868[var10] = class286.field3868[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class497(arg2, arg7, arg8, arg6, arg5, arg1, arg0, arg3);
        } else {
            var9.method2802(arg5, (byte) 2, arg7, arg2, arg6, arg1, arg3, arg0, arg8);
        }
        if (arg4 >= -24) {
            field7376 = null;
        }
        class265.field3631 = class141.field1800;
        class286.field3868[0] = var9;
        class205.field2685++;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 68)
    public static void method3034(int arg0) {
        field7375 = null;
        field7376 = null;
        if (arg0 > -53) {
            field7376 = null;
        }
    }
}
