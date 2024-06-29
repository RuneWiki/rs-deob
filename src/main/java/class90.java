import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class90 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Lob;")
    public class277 field1359;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1361 = -1;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljd;")
    public static class133 field1362 = null;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public static int[] field1363;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1363 = null;
        if (arg0 != -1) {
            method607(63);
        }
        field1362 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method608(int arg0, int arg1) {
        field1365++;
        if (arg1 == 37) {
            class207.field3244 = 3.0F;
        } else if (arg1 == 50) {
            class207.field3244 = 4.0F;
        } else if (arg1 == 75) {
            class207.field3244 = 6.0F;
        } else if (arg1 == 100) {
            class207.field3244 = 8.0F;
        } else if (arg1 == 200) {
            class207.field3244 = 16.0F;
        }
        if (arg0 < 72) {
            method609((byte) -82);
        }
        class72.field1069 = -1;
        class72.field1069 = -1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lni;")
    public static final class23 method609(byte arg0) {
        field1364++;
        if (arg0 >= -100) {
            return null;
        }
        try {
            return (class23) Class.forName("ih").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIII)V")
    public class90(int arg0, int arg1, int arg2, int arg3) {
        class277 var5 = class248.method1765(arg0, 25571);
        this.field1356 = arg1;
        this.field1357 = arg2;
        this.field1358 = arg3;
        if (var5.field4501 == -1) {
            this.field1359 = var5;
        } else {
            this.field1359 = class248.method1765(var5.field4501, 25571);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lob;III)V")
    public class90(class277 arg0, int arg1, int arg2, int arg3) {
        this.field1359 = arg0;
        this.field1356 = arg1;
        this.field1357 = arg2;
        this.field1358 = arg3;
    }
}
