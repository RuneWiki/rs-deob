import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class241 implements Runnable {

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[Lng;")
    public volatile class78[] field3921 = new class78[2];

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Z")
    public volatile boolean field3923 = false;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Z")
    public volatile boolean field3919 = false;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3911 = 0;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "J")
    public static long field3920 = 0L;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3914 = Calendar.getInstance();

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Loh;")
    public static class281 field3922 = new class281(260);

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
    public static int[] field3924 = new int[14];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lna;")
    public class32 field3918;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lti;")
    public static class5 field3916;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1649(int arg0) {
        field3914 = null;
        field3916 = null;
        field3924 = null;
        int var1 = -58 / ((48 - arg0) / 59);
        field3922 = null;
    }

    @OriginalMember(owner = "client!bg", name = "run", descriptor = "()V")
    public final void run() {
        this.field3919 = true;
        try {
            while (!this.field3923) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class78 var2 = this.field3921[var1];
                    if (var2 != null) {
                        var2.method555((byte) -43);
                    }
                }
                class150.method1011((byte) 41, 10L);
                class2.method9(-88, (Object) null, this.field3918);
            }
        } catch (Exception var9) {
            class168.method1130((String) null, var9, 121);
        } finally {
            Object var6 = null;
            this.field3919 = false;
        }
        field3913++;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1650(int arg0) {
        field3915++;
        class75.field1251.method1888(-4);
        if (arg0 != 7957) {
            method1650(-103);
        }
    }
}
