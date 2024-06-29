import java.awt.event.ActionEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class78 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[[I")
    public static int[][] field1273 = new int[104][104];

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lve;")
    public static class255 field1276 = class87.method607(31, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lve;")
    public static class255 field1277 = class87.method607(67, "(U (X");

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1268;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class53 var5 = class303.method2112(-1155040160, arg1, arg3);
        field1275++;
        var5.method325((byte) 100);
        var5.field824 = arg4;
        var5.field825 = arg2;
        var5.field819 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BLpb;)V", line = 20)
    public final void method542(int arg0, byte[] arg1, class70 arg2) {
        field1271++;
        if (arg0 != 22911) {
            method541(73, -26, -101, 58, -101);
        }
        if (arg2.field1066[arg2.field1068] != 31 || arg2.field1066[arg2.field1068 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1268 == null) {
            this.field1268 = new Inflater(true);
        }
        try {
            this.field1268.setInput(arg2.field1066, arg2.field1068 + 10, arg2.field1066.length - (arg2.field1068 + 10) - 8);
            this.field1268.inflate(arg1);
        } catch (Exception var5) {
            this.field1268.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1268.reset();
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 91)
    public class78() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 97)
    public static void method543(boolean arg0) {
        if (!arg0) {
            method545((class255) null, true, 11);
        }
        field1273 = (int[][]) null;
        field1277 = null;
        field1276 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILfk;Ljava/lang/Object;)V", line = 117)
    public static final void method544(int arg0, class40 arg1, Object arg2) {
        field1270++;
        if (arg1.field617 == null) {
            return;
        }
        int var3 = -113 % ((arg0 + 8) / 34);
        for (int var4 = 0; var4 < 50 && arg1.field617.peekEvent() != null; var4++) {
            class137.method1027(1L, 0);
        }
        if (arg2 != null) {
            arg1.field617.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lve;ZI)V", line = 141)
    public static final void method545(class255 arg0, boolean arg1, int arg2) {
        field1272++;
        if (!arg1) {
            class53 var3 = class303.method2112(-1155040160, arg2, 2);
            var3.method325((byte) -87);
            var3.field822 = arg0;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(III)V", line = 154)
    private class78(int arg0, int arg1, int arg2) {
    }
}
