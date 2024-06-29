import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class187 {

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "Lju;")
    public static class102 field2739 = new class102(47, 2);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1252(int arg0) {
        class93.field1329 = -1;
        class701.field9767 = -1;
        field2738++;
        if (arg0 >= -53) {
            method1253(-75);
        }
        class729.field10226 = -1;
        class486.field6561 = 0;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 21)
    public static void method1253(int arg0) {
        field2739 = null;
        if (arg0 != 1) {
            method1253(43);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/Object;Lmr;Z)V", line = 36)
    public static final void method1254(Object arg0, class613 arg1, boolean arg2) {
        field2741++;
        if (arg1.field8711 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field8711.peekEvent() != null; var3++) {
            class740.method4124(1L, 120);
        }
        try {
            if (arg0 != null) {
                arg1.field8711.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
            if (arg2) {
                method1253(-14);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIB[B)[B", line = 64)
    public static final byte[] method1255(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 >= -35) {
            field2739 = null;
        }
        field2740++;
        byte[] var4 = new byte[arg0];
        class34.method245(arg3, arg1, var4, 0, arg0);
        return var4;
    }
}
