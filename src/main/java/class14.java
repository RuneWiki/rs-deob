import java.awt.event.ActionEvent;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 {

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "Ls;")
    public static class34 field127 = class9.method35("Water Source", 220);

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Lq;")
    public static class32 field129;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field131;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[I")
    public static int[] field128;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Loa;[BB)V", line = 15)
    public final void method59(class29 arg0, byte[] arg1, byte arg2) {
        if (arg0.field388[arg0.field392] != 31 || arg0.field388[arg0.field392 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field131 == null) {
            this.field131 = new Inflater(true);
        }
        try {
            this.field131.setInput(arg0.field388, arg0.field392 + 10, arg0.field388.length + -10 + -arg0.field392 - 8);
            this.field131.inflate(arg1);
        } catch (Exception var5) {
            this.field131.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field131.reset();
        if (arg2 <= 30) {
            method61(43, null, null);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "()V", line = 43)
    public class14() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(JB)V", line = 58)
    public static final void method60(long arg0, byte arg1) {
        if (arg1 >= -100) {
            method62(null, -100, -120, false);
        }
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ILjava/lang/Object;Lq;)V", line = 76)
    public static final void method61(int arg0, Object arg1, class32 arg2) {
        if (arg2.field456 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 <= 7) {
            field129 = null;
        }
        while (var3 < 50 && arg2.field456.peekEvent() != null) {
            class26.method164(1L, (byte) 2);
            var3++;
        }
        if (arg1 != null) {
            arg2.field456.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([Ls;IIZ)V", line = 100)
    public static final void method62(class34[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        if (arg1 == 1) {
            arg0[0].method237((byte) -93);
        } else {
            class25.method136(arg2, arg1, arg0, (byte) -107).method237((byte) -117);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 114)
    public static void method63(int arg0) {
        field128 = null;
        field127 = null;
        if (arg0 != 1) {
            method61(-55, null, null);
        }
        field129 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "(III)V", line = 139)
    private class14(int arg0, int arg1, int arg2) {
    }
}
