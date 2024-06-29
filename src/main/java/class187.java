import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class187 extends RuntimeException {

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3331;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljava/lang/String;")
    public String field3321;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Loc;")
    private static class151 field3324 = class137.method873(2, "Username: ");

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Loc;")
    public static class151 field3327 = field3324;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Loc;")
    public static class151 field3329 = class137.method873(2, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Loc;")
    private static class151 field3328 = class137.method873(2, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "Loc;")
    public static class151 field3326 = field3328;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
    public static final void method1158(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1397; var4++) {
            class124 var5 = var3.field1405[var4];
            if ((var5.field2230 >> 29 & 0x3L) == 2L && var5.field2224 == arg1 && var5.field2214 == arg2) {
                class106.method639(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method1159(byte arg0) {
        if (arg0 < 60) {
            return;
        }
        field3326 = null;
        field3324 = null;
        field3329 = null;
        field3328 = null;
        field3327 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(JIB[I)Loc;")
    public static final class151 method1160(long arg0, int arg1, byte arg2, int[] arg3) {
        field3322++;
        if (arg1 == 0) {
            class55 var5 = class33.method241(arg3[0], (byte) -117);
            return var5.method376((byte) 126, (int) arg0);
        } else if (arg1 == 1) {
            class12 var6 = class43.method311((int) arg0, arg2 ^ 0xFFFFFFBD);
            return var6.field241;
        } else if (arg1 == 5) {
            return class155.method1016(0, arg0).method994(-96);
        } else if (arg1 == 6) {
            return class33.method241(arg3[0], (byte) 17).method376((byte) 126, (int) arg0);
        } else if (arg2 == -67) {
            return class155.method1018(arg0, (byte) -51);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1161(Component arg0, int arg1) {
        field3330++;
        arg0.addMouseListener(class16.field362);
        arg0.addMouseMotionListener(class16.field362);
        arg0.addFocusListener(class16.field362);
        if (arg1 != -9877) {
            method1158(109, 52, 90);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class187(Throwable arg0, String arg1) {
        this.field3331 = arg0;
        this.field3321 = arg1;
    }
}
