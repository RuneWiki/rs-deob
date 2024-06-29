import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class280 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4469 = "";

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4474 = "K";

    @OriginalMember(owner = "client!si", name = "j", descriptor = "[S")
    public static short[] field4475 = new short[500];

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lve;")
    public static class233 field4471;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lve;")
    public static class233 field4476;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4473;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[[[I")
    public static int[][][] field4466;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILkl;[B)V")
    public final void method1884(int arg0, class114 arg1, byte[] arg2) {
        field4468++;
        if (arg0 >= -58) {
            this.method1884(60, (class114) null, (byte[]) null);
        }
        if (arg1.field1629[arg1.field1673] != 31 || arg1.field1629[arg1.field1673 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4473 == null) {
            this.field4473 = new Inflater(true);
        }
        try {
            this.field4473.setInput(arg1.field1629, arg1.field1673 + 10, -arg1.field1673 + -8 + -10 + arg1.field1629.length);
            this.field4473.inflate(arg2);
        } catch (Exception var4) {
            this.field4473.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4473.reset();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1885(int arg0) {
        if (arg0 != 2047) {
            return;
        }
        field4474 = null;
        field4476 = null;
        field4466 = null;
        field4475 = null;
        field4471 = null;
        field4469 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method1886(int arg0, int arg1) {
        class182.field2599 = -1;
        if (arg0 != 1000000) {
            method1887((byte) -27);
        }
        class113.field1614 = arg1;
        class224.field3353 = false;
        class43.field619 = -1;
        class184.field2620 = 1;
        class70.field1098 = 0;
        field4472++;
        class154.field2255 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class280() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method1887(byte arg0) {
        field4467++;
        for (int var1 = -1; var1 < class193.field2770; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class110.field1589[var1];
            }
            class53 var3 = class194.field2777[var2];
            if (var3 != null) {
                class119.method819((byte) -36, var3, var3.method57(0));
            }
        }
        if (arg0 >= -110) {
            method1887((byte) 121);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(III)V")
    private class280(int arg0, int arg1, int arg2) {
    }
}
