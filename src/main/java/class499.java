import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class499 implements class264 {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field7324;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field7321;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lja;")
    public class254 field7323;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field7317;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lmea;")
    public class395 field7322;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field7319;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field7314;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field7316;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lws;")
    public static class328 field7320 = new class328(11, 7);

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Lj;")
    public static class502 field7326 = new class502("RC", 1);

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
    public static boolean field7327 = false;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field7330 = new String[100];

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "[Lpea;")
    public static class675[] field7331 = new class675[14];

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Lnr;")
    public static class53 field7329;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lri;")
    public static class97 field7328;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 8)
    public static final void method3045(int arg0) {
        if (arg0 != -10256) {
            field7327 = true;
        }
        field7315++;
        if (class204.field3327 != null) {
            class204.field3327.method2937((byte) -124);
        }
        if (class89.field1078 == null) {
            return;
        }
        while (true) {
            try {
                class89.field1078.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Leu;", line = 41)
    public class444 method1247(int arg0) {
        if (arg0 != 3848) {
            field7320 = null;
        }
        field7325++;
        return null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lja;Lmea;IIIIIII)V", line = 58)
    public class499(class254 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7324 = arg7;
        this.field7321 = arg8;
        this.field7323 = arg0;
        this.field7317 = arg4;
        this.field7322 = arg1;
        this.field7319 = arg6;
        this.field7318 = arg2;
        this.field7314 = arg3;
        this.field7316 = arg5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 75)
    public static void method3046(byte arg0) {
        field7320 = null;
        field7326 = null;
        field7328 = null;
        field7329 = null;
        field7330 = null;
        field7331 = null;
        int var1 = -126 % ((-arg0 - 43) / 45);
    }
}
