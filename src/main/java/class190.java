import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class190 extends class143 {

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Z")
    public static boolean field2979 = false;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lcj;")
    public static class121 field2983;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Led;")
    public class190 field2976;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Led;")
    public class190 field2981;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lub;")
    public static class92 field2980;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
    public static int[] field2982;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public final void method1354(byte arg0) {
        if (arg0 != -45) {
            method1356((byte) -60);
        }
        field2977++;
        if (this.field2976 != null) {
            this.field2976.field2981 = this.field2981;
            this.field2981.field2976 = this.field2976;
            this.field2976 = null;
            this.field2981 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLub;)V")
    public static final void method1355(byte arg0, class92 arg1) {
        class257.field4095 = arg1;
        if (arg0 > -114) {
            field2979 = false;
        }
        field2978++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method1356(byte arg0) {
        field2980 = null;
        field2982 = null;
        int var1 = -115 % ((arg0 - 65) / 51);
        field2983 = null;
    }
}
