import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class79 extends class32 {

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lij;")
    public class50 field1453;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1452 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Z")
    public static boolean field1451;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILda;I)Z")
    public static final boolean method581(byte arg0, int arg1, class22 arg2, int arg3) {
        if (arg0 != -118) {
            return true;
        }
        field1454++;
        byte[] var4 = arg2.method190((byte) -58, arg3, arg1);
        if (var4 == null) {
            return false;
        } else {
            class189.method1277(1, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIZII)V")
    public static final void method582(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1456++;
        int var8 = arg1 + 1;
        class155.method1090(class177.field2963[arg1], arg0, arg2, 160, arg4);
        if (arg3) {
            method582(126, 56, 72, true, 42, -25);
        }
        int var9 = arg5 - 1;
        class155.method1090(class177.field2963[arg5], arg0, arg2, 160, arg4);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class177.field2963[var6];
            var7[arg0] = var7[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1452 = null;
        if (arg0 != 0) {
            method582(44, -111, -91, false, -53, 40);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lij;")
    public static final class50 method584(int arg0, int arg1) {
        if (arg1 == -12022) {
            field1455++;
            return class36.field691[arg0].method396(1) <= 0 ? class250.field4334[arg0] : class80.method589(new class50[] { class250.field4334[arg0], class240.field4126, class36.field691[arg0] }, arg1 + 40765);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class79() {
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lij;)V")
    public class79(class50 arg0) {
        this.field1453 = arg0;
    }
}
