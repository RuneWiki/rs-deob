import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public abstract class class599 extends class429 {

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public int field8747;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field8751;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public int field8755;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Leea;")
    public static class114 field8749 = new class114();

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "[F")
    public static float[] field8752;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "[Lap;")
    public static class411[] field8757;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V")
    public static final void method3480(int arg0, boolean arg1) {
        field8753++;
        class631.method3612(class518.field7542, class298.field4407, class581.field8366, arg1, -1);
        if (arg0 > -83) {
            method3482(118, -97L);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Llm;I)Z")
    public static final boolean method3481(class431 arg0, int arg1) {
        field8748++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field6425) {
            return false;
        } else if (arg0.method2689(true, class182.field2245)) {
            if (arg1 != 10) {
                field8752 = null;
            }
            if (class645.field9296.method524((byte) 104, (long) arg0.field6386) == null) {
                return class326.field4700.method524((byte) 88, (long) arg0.field6403) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3482(int arg0, long arg1) {
        class164.field2013.setTime(new Date(arg1));
        field8756++;
        int var3 = class164.field2013.get(7);
        int var4 = class164.field2013.get(5);
        int var5 = class164.field2013.get(2);
        int var6 = class164.field2013.get(1);
        int var7 = class164.field2013.get(11);
        if (arg0 != -12605) {
            field8749 = null;
        }
        int var8 = class164.field2013.get(12);
        int var9 = class164.field2013.get(13);
        return class481.field7067[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class302.field4455[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(IIII)V")
    public class599(int arg0, int arg1, int arg2, int arg3) {
        this.field8750 = arg3;
        this.field8747 = arg2;
        this.field8751 = arg0;
        this.field8755 = arg1;
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)V")
    public static void method3483(int arg0) {
        field8757 = null;
        if (arg0 != 10) {
            method3480(13, false);
        }
        field8749 = null;
        field8752 = null;
    }

    static {
        new class474("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field8752 = new float[4];
        field8754 = 10;
        field8757 = new class411[1024];
    }
}
