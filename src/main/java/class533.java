import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class533 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lvg;")
    private class49 field7757 = new class49(64);

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Lvg;")
    public class49 field7769 = new class49(50);

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Lvg;")
    public class49 field7770 = new class49(5);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lei;")
    public class162 field7755;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Lri;")
    private class97 field7765;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
    public boolean field7762;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "Lri;")
    public class97 field7758;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7756 = 0;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7761 = new CRC32();

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public int field7771;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public final void method3221(byte arg0) {
        field7766++;
        class49 var2 = this.field7757;
        synchronized (this.field7757) {
            this.field7757.method569(0);
        }
        class49 var3 = this.field7769;
        synchronized (this.field7769) {
            if (arg0 > -110) {
                return;
            }
            this.field7769.method569(0);
        }
        class49 var4 = this.field7770;
        synchronized (this.field7770) {
            this.field7770.method569(0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
    public final void method3222(int arg0, byte arg1) {
        if (arg1 != 37) {
            return;
        }
        this.field7771 = arg0;
        field7760++;
        class49 var3 = this.field7769;
        synchronized (this.field7769) {
            this.field7769.method569(0);
        }
        class49 var4 = this.field7770;
        synchronized (this.field7770) {
            this.field7770.method569(0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(IB)V")
    public final void method3223(int arg0, byte arg1) {
        field7768++;
        class49 var3 = this.field7757;
        synchronized (this.field7757) {
            this.field7757.method573((byte) 127, arg0);
        }
        class49 var4 = this.field7769;
        synchronized (this.field7769) {
            this.field7769.method573((byte) 127, arg0);
        }
        int var5 = 114 % ((arg1 - 76) / 46);
        class49 var6 = this.field7770;
        synchronized (this.field7770) {
            this.field7770.method573((byte) 118, arg0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Lms;")
    public final class705 method3224(int arg0, int arg1) {
        field7759++;
        class49 var3 = this.field7757;
        class705 var4;
        synchronized (this.field7757) {
            var4 = (class705) this.field7757.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field7765;
        byte[] var6;
        synchronized (this.field7765) {
            var6 = this.field7765.method926(class193.method1535(arg0, (byte) -70), -128, class80.method767(arg0, 127));
        }
        class705 var7 = new class705();
        var7.field9980 = this;
        var7.field9952 = arg0;
        if (var6 != null) {
            var7.method3983(-41, new class6(var6));
        }
        var7.method3976(0);
        class49 var8 = this.field7757;
        synchronized (this.field7757) {
            this.field7757.method559(var7, (long) arg0, 0);
            if (arg1 != 50) {
                this.method3221((byte) -69);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method3225(byte arg0) {
        field7761 = null;
        if (arg0 < 6) {
            method3225((byte) 20);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)V")
    public final void method3226(byte arg0, boolean arg1) {
        field7767++;
        if (this.field7762 == arg1) {
            return;
        }
        this.field7762 = arg1;
        this.method3221((byte) -126);
        if (arg0 <= 107) {
            this.method3223(118, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
    public final void method3227(byte arg0) {
        field7763++;
        class49 var2 = this.field7757;
        synchronized (this.field7757) {
            if (arg0 != -124) {
                this.field7755 = null;
            }
            this.field7757.method563(0);
        }
        class49 var3 = this.field7769;
        synchronized (this.field7769) {
            this.field7769.method563(0);
        }
        class49 var4 = this.field7770;
        synchronized (this.field7770) {
            this.field7770.method563(0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)V")
    public final void method3228(byte arg0) {
        if (arg0 < 33) {
            return;
        }
        class49 var2 = this.field7769;
        synchronized (this.field7769) {
            this.field7769.method569(0);
        }
        field7764++;
        class49 var3 = this.field7770;
        synchronized (this.field7770) {
            this.field7770.method569(0);
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lei;IZLri;Lri;)V")
    public class533(class162 arg0, int arg1, boolean arg2, class97 arg3, class97 arg4) {
        this.field7755 = arg0;
        this.field7765 = arg3;
        this.field7762 = arg2;
        this.field7758 = arg4;
        if (this.field7765 != null) {
            int var6 = this.field7765.method917(true) - 1;
            this.field7765.method949(var6, 0);
        }
    }
}
