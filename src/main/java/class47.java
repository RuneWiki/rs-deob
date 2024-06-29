import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class47 extends class308 {

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[B")
    public byte[] field684;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Ljava/lang/String;")
    public static String field685 = "Loading textures - ";

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field688 = new String[100];

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lke;")
    public static class284 field686;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field687;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V", line = 5)
    public static void method354(byte arg0) {
        field687 = null;
        field685 = null;
        field688 = null;
        int var1 = -45 % ((arg0 - 59) / 63);
        field686 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)J", line = 19)
    public static final long method355(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null || var3.field732 == null ? 0L : var3.field732.field4069;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V", line = 46)
    public class47(byte[] arg0) {
        this.field684 = arg0;
    }
}
