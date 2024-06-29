import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lka;")
    public static class201 field78;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field76;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BLaj;I)V", line = 15)
    public final void method66(byte[] arg0, class1 arg1, int arg2) {
        field79++;
        if (arg2 != 116) {
            method69(100, false);
        }
        if (arg1.field34[arg1.field48] != 31 || arg1.field34[arg1.field48 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field76 == null) {
            this.field76 = new Inflater(true);
        }
        try {
            this.field76.setInput(arg1.field34, arg1.field48 + 10, arg1.field34.length - (arg1.field48 - -8 + 10));
            this.field76.inflate(arg0);
        } catch (Exception var5) {
            this.field76.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field76.reset();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V", line = 42)
    public static final void method67(int arg0, byte arg1) {
        field74++;
        if (!class309.method2186(26080, arg0)) {
            return;
        }
        class266[] var2 = class110.field1789[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class266 var4 = var2[var3];
            if (var4 != null) {
                var4.field4077 = 0;
                var4.field3966 = 1;
                var4.field4041 = 0;
            }
        }
        if (arg1 != -112) {
            field77 = 52;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 78)
    public static void method68(byte arg0) {
        if (arg0 != -61) {
            field78 = (class201) null;
        }
        field78 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 91)
    public static final String method69(int arg0, boolean arg1) {
        if (arg1) {
            method69(-50, false);
        }
        field75++;
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFC537) >> 16) + "." + ((arg0 & 0xFFC7) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V", line = 101)
    private class2(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 114)
    public class2() {
        this(-1, 1000000, 1000000);
    }
}
