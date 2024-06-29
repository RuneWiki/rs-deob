import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class533 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field7506 = class178.method1125((byte) 81);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljava/lang/String;")
    public String field7497;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field7499;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/lang/String;")
    public String field7512;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Ljava/lang/String;")
    public String field7505;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Ljava/lang/String;")
    public String field7504;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public int field7507;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Ljava/lang/String;")
    public String field7511;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[I")
    public static int[] field7498 = new int[200];

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field7509 = -1;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "[Liaa;")
    public static class494[] field7510 = new class494[14];

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Lgda;")
    public static class53 field7503 = new class53(60, 4);

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "F")
    public static float field7513;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method3100(int arg0) {
        if (arg0 == 60) {
            field7510 = null;
            field7503 = null;
            field7498 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Lhaa;")
    public static final class80 method3101(int arg0, int arg1) {
        field7501++;
        if (~arg1 == arg0) {
            if ((double) class678.field9281 == 3.0D) {
                return class707.field9816;
            }
            if ((double) class678.field9281 == 4.0D) {
                return class4.field42;
            }
            if ((double) class678.field9281 == 6.0D) {
                return class134.field1955;
            }
            if ((double) class678.field9281 >= 8.0D) {
                return class336.field4680;
            }
        } else if (arg1 == 1) {
            if ((double) class678.field9281 == 3.0D) {
                return class134.field1955;
            }
            if ((double) class678.field9281 == 4.0D) {
                return class336.field4680;
            }
            if ((double) class678.field9281 == 6.0D) {
                return class516.field7360;
            }
            if ((double) class678.field9281 >= 8.0D) {
                return class473.field6698;
            }
        } else if (arg1 == 2) {
            if ((double) class678.field9281 == 3.0D) {
                return class516.field7360;
            }
            if ((double) class678.field9281 == 4.0D) {
                return class473.field6698;
            }
            if ((double) class678.field9281 == 6.0D) {
                return class125.field1525;
            }
            if ((double) class678.field9281 >= 8.0D) {
                return class597.field8400;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class533(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field7497 = arg3;
        this.field7499 = arg0;
        this.field7512 = arg7;
        this.field7505 = arg2;
        this.field7502 = class740.field10285;
        this.field7504 = arg4;
        this.field7508 = arg1;
        this.field7507 = arg6;
        this.field7511 = arg5;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;)V")
    public final void method3102(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, byte arg7, String arg8) {
        field7500++;
        this.field7506 = class178.method1125((byte) 96);
        this.field7502 = class740.field10285;
        this.field7505 = arg4;
        int var10 = 111 / ((55 - arg7) / 48);
        this.field7499 = arg1;
        this.field7497 = arg8;
        this.field7511 = arg3;
        this.field7504 = arg2;
        this.field7508 = arg0;
        this.field7512 = arg6;
        this.field7507 = arg5;
    }
}
