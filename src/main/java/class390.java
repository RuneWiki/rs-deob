import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class390 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lvg;")
    private class49 field6046 = new class49(256);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lri;")
    private class97 field6043;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lhga;")
    public static class158 field6044 = new class158(99, 3);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lwo;")
    public static class691 field6049;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 4)
    public static void method2531(byte arg0) {
        field6044 = null;
        field6049 = null;
        if (arg0 <= 17) {
            field6049 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Ljv;", line = 15)
    public final class71 method2532(int arg0, byte arg1) {
        field6041++;
        class49 var3 = this.field6046;
        class71 var4;
        synchronized (this.field6046) {
            var4 = (class71) this.field6046.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field6043;
        byte[] var6;
        synchronized (this.field6043) {
            var6 = this.field6043.method926(26, -125, arg0);
        }
        class71 var7 = new class71();
        if (var6 != null) {
            var7.method729(new class6(var6), (byte) -82);
        }
        class49 var8 = this.field6046;
        synchronized (this.field6046) {
            this.field6046.method559(var7, (long) arg0, 0);
        }
        int var9 = 102 % ((arg1 + 67) / 47);
        return var7;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLk;Ljava/lang/Object;)V", line = 47)
    public static final void method2533(byte arg0, class525 arg1, Object arg2) {
        field6048++;
        if (arg1.field7668 == null) {
            return;
        }
        if (arg0 < 59) {
            field6049 = null;
        }
        for (int var3 = 0; var3 < 50 && arg1.field7668.peekEvent() != null; var3++) {
            class549.method3313(1L, 126);
        }
        try {
            if (arg2 != null) {
                arg1.field7668.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 75)
    public final void method2534(byte arg0, int arg1) {
        class49 var3 = this.field6046;
        synchronized (this.field6046) {
            this.field6046.method573((byte) 125, arg1);
            if (arg0 != 48) {
                method2533((byte) 102, null, null);
            }
        }
        field6042++;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lei;ILri;)V", line = 114)
    public class390(class162 arg0, int arg1, class97 arg2) {
        this.field6043 = arg2;
        this.field6043.method949(26, 0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 102)
    public final void method2535(int arg0) {
        if (arg0 != 1001) {
            this.field6043 = null;
        }
        class49 var2 = this.field6046;
        synchronized (this.field6046) {
            this.field6046.method563(0);
        }
        field6045++;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V", line = 129)
    public final void method2536(int arg0) {
        class49 var2 = this.field6046;
        synchronized (this.field6046) {
            this.field6046.method569(0);
            if (arg0 >= -62) {
                this.method2534((byte) 39, -28);
            }
        }
        field6047++;
    }
}
