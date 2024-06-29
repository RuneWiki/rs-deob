import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class232 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
    public static boolean field2998 = false;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lpi;")
    public static class340 field3000 = new class340(13, 0);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3002;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BLbt;Z)V", line = 15)
    public final void method1473(byte[] arg0, class88 arg1, boolean arg2) {
        field3003++;
        if (arg1.field1223[arg1.field1176] != 31 || arg1.field1223[arg1.field1176 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3002 == null) {
            this.field3002 = new Inflater(true);
        }
        try {
            this.field3002.setInput(arg1.field1223, arg1.field1176 + 10, -arg1.field1176 + -18 + arg1.field1223.length);
            this.field3002.inflate(arg0);
            if (!arg2) {
                this.method1473(null, null, true);
            }
        } catch (Exception var4) {
            this.field3002.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3002.reset();
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 46)
    public class232() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBII)I", line = 49)
    public static final int method1474(int arg0, byte arg1, int arg2, int arg3) {
        field3001++;
        if (arg1 < 26) {
            method1474(45, (byte) 26, -4, 66);
        }
        if (class412.field5499 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class230.field2983;
        int var7 = arg3 - class230.field2971;
        for (class343 var8 = (class343) class230.field2953.method49(52); var8 != null; var8 = (class343) class230.field2953.method46((byte) 98)) {
            if (var8.field4371 == arg0) {
                int var9 = var8.field4367;
                int var10 = var8.field4368;
                int var11 = class230.field2971 + var10 | class230.field2983 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 98)
    public static void method1475(int arg0) {
        if (arg0 == -2) {
            field3000 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(III)V", line = 108)
    private class232(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 121)
    public static final void method1476(int arg0, int arg1) {
        field2999++;
        class436 var2 = class459.method2712(11, arg1, -1759243680);
        if (arg0 != 9880) {
            field2998 = false;
        }
        var2.method2567(16013);
    }
}
