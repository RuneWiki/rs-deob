import java.awt.Component;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class281 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4845;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[[[I")
    public static int[][][] field4851;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 6)
    public static final void method1993(byte arg0, Component arg1) {
        arg1.addMouseListener(class263.field4546);
        arg1.addMouseMotionListener(class263.field4546);
        arg1.addFocusListener(class263.field4546);
        if (arg0 > -50) {
            method1994(-65, (byte) -81, 88, (class267) null);
        }
        field4844++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBILcb;)Z", line = 19)
    public static final boolean method1994(int arg0, byte arg1, int arg2, class267 arg3) {
        field4847++;
        byte[] var4 = arg3.method1911(arg0, arg2, -43);
        if (var4 == null) {
            return false;
        } else {
            class115.method883(var4, 78);
            return arg1 == -7;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 58)
    public class281() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 69)
    public static void method1995(int arg0) {
        if (arg0 != 20451) {
            method1993((byte) 121, (Component) null);
        }
        field4851 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V", line = 81)
    private class281(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BILja;)V", line = 105)
    public final void method1996(byte[] arg0, int arg1, class60 arg2) {
        field4850++;
        if (arg2.field997[arg2.field1012] != 31 || arg2.field997[arg2.field1012 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4845 == null) {
            this.field4845 = new Inflater(true);
        }
        try {
            this.field4845.setInput(arg2.field997, arg2.field1012 + 10, -18 - arg2.field1012 + arg2.field997.length);
            this.field4845.inflate(arg0);
            if (arg1 != -4) {
                field4848 = -29;
            }
        } catch (Exception var5) {
            this.field4845.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4845.reset();
    }
}
