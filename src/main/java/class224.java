import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class224 extends class184 {

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[B")
    public byte[] field3958;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
    public static int[] field3955 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lsf;")
    public static class108 field3959 = class140.method973(255, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 17)
    public static void method1521(int arg0) {
        field3955 = null;
        field3959 = null;
        if (arg0 != -14267) {
            method1524((byte) 41, (class249) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V", line = 41)
    public static final void method1522(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            field3955 = (int[]) null;
        }
        field3957++;
        if (class15.field194 == 0 || arg2 == 0 || class315.field5419 >= 50 || arg0 == -1) {
            return;
        }
        class21.field322[class315.field5419] = arg0;
        class266.field4681[class315.field5419] = arg2;
        class54.field796[class315.field5419] = arg1;
        class154.field2768[class315.field5419] = null;
        class62.field1004[class315.field5419] = 0;
        class315.field5419++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V", line = 67)
    public static final void method1523(boolean arg0, boolean arg1) {
        field3956++;
        if (arg0 == class83.field1299) {
            return;
        }
        if (!arg1) {
            method1522(-117, 97, 63, 38);
        }
        class83.field1299 = arg0;
        class99.method682(0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLrm;)V", line = 83)
    public static final void method1524(byte arg0, class249 arg1) {
        byte[] var2 = new byte[24];
        field3954++;
        if (arg0 <= 27) {
            field3959 = (class108) null;
        }
        if (class290.field5078 != null) {
            try {
                class290.field5078.method655(0, 0L);
                class290.field5078.method653(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1732(3, var2, 0, 24);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V", line = 130)
    public class224(byte[] arg0) {
        this.field3958 = arg0;
    }
}
