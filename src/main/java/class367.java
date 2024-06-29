import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class367 {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field5003 = 0;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field5012 = 0;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "Ld;")
    public static class210 field5011;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lwo;")
    public static class285 field5004;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lwo;")
    public static class285 field5007;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5002;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 7)
    public static void method2316(int arg0) {
        if (arg0 < 119) {
            method2317((byte) -25, (class285) null, (class285) null);
        }
        field5004 = null;
        field5011 = null;
        field5007 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLwo;Lwo;)V", line = 27)
    public static final void method2317(byte arg0, class285 arg1, class285 arg2) {
        field5007 = arg2;
        field5001++;
        if (arg0 > 73) {
            class373.field5058 = arg1;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 45)
    public static final void method2318(int arg0) {
        class365 var1 = class219.field2706;
        synchronized (class219.field2706) {
            class219.field2706.method2290(13831);
        }
        field5005++;
        if (arg0 != 10) {
            return;
        }
        class365 var2 = class106.field1272;
        synchronized (class106.field1272) {
            class106.field1272.method2290(13831);
        }
        class365 var3 = class363.field4932;
        synchronized (class363.field4932) {
            class363.field4932.method2290(13831);
        }
        class365 var4 = class395.field5376;
        synchronized (class395.field5376) {
            class395.field5376.method2290(13831);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lbg;[BI)V", line = 67)
    public final void method2319(class242 arg0, byte[] arg1, int arg2) {
        field5006++;
        if (arg0.field3188[arg0.field3211] != 31 || arg0.field3188[arg0.field3211 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5002 == null) {
            this.field5002 = new Inflater(true);
        }
        try {
            this.field5002.setInput(arg0.field3188, arg0.field3211 + 10, arg0.field3188.length - 8 - 10 - arg0.field3211);
            this.field5002.inflate(arg1);
            int var4 = -57 / ((-arg2 - 18) / 42);
        } catch (Exception var5) {
            this.field5002.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5002.reset();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILwo;ZIII)V", line = 99)
    public static final void method2320(int arg0, int arg1, class285 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class369.field5026 = arg2;
        class372.field5048 = arg4;
        class272.field3509 = arg0;
        class137.field1554 = arg3;
        class97.field1144 = arg6;
        class264.field3385 = arg1;
        field5009++;
        class139.field1590 = arg5;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 122)
    public class367() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V", line = 128)
    public static final void method2321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class295.field3937 = arg4;
        field5008++;
        class53.field624 = arg2;
        class118.field1356 = arg0;
        class427.field5844 = arg3;
        if (arg1 != -25485) {
            field5004 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(III)V", line = 142)
    private class367(int arg0, int arg1, int arg2) {
    }
}
