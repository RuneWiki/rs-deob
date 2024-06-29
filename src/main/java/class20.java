import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "a", descriptor = "Z")
    public static volatile boolean field288 = true;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "[I")
    public static int[] field291 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!an", name = "f", descriptor = "Llh;")
    public static class364 field293 = new class364(8);

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field292;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "[I")
    public static int[] field294;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Lti;[BI)V")
    public final void method171(class303 arg0, byte[] arg1, int arg2) {
        field295++;
        if (arg0.field4326[arg0.field4333] != 31 || arg0.field4326[arg0.field4333 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field292 == null) {
            this.field292 = new Inflater(true);
        }
        try {
            this.field292.setInput(arg0.field4326, arg0.field4333 + 10, -18 - (arg0.field4333 - arg0.field4326.length));
            this.field292.inflate(arg1);
        } catch (Exception var4) {
            this.field292.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field292.reset();
        if (arg2 != 311) {
            this.field292 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Z")
    public static final boolean method172(int arg0, int arg1, int arg2) {
        if (arg2 <= 66) {
            method172(-124, -30, -101);
        }
        field290++;
        return (arg1 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class20() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method173(byte arg0) {
        if (arg0 != 73) {
            field291 = null;
        }
        field291 = null;
        field294 = null;
        field293 = null;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(III)V")
    private class20(int arg0, int arg1, int arg2) {
    }
}
