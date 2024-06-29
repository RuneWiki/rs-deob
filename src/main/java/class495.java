import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class495 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Laf;")
    private class39 field6804 = new class39(64);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Laf;")
    public class39 field6814 = new class39(64);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lae;")
    public class283 field6802;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lae;")
    private class283 field6805;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Llk;")
    public static class638 field6809 = new class638(32);

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lv;")
    public static class165 field6812 = new class165();

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lld;")
    public static class127 field6816 = new class127(0);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lsi;")
    public static class769 field6817 = new class769();

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lkda;")
    public static class490 field6813;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V", line = 4)
    public static final void method2913(long arg0, boolean arg1) {
        field6810++;
        int var3 = class568.field8011;
        int var4 = class177.field2234;
        if (class693.field9671 != var3) {
            int var5 = var3 - class693.field9671;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class693.field9671 += var6;
        }
        if (arg1) {
            method2915(-63);
        }
        class702.field9790 += (float) arg0 * class195.field2770 / 40.0F * 8.0F;
        class514.field7053 += (float) arg0 * class256.field3781 / 40.0F * 8.0F;
        if (class548.field7650 != var4) {
            int var7 = var4 - class548.field7650;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class548.field7650 += var8;
        }
        class731.method4068(-4);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lqba;", line = 84)
    public final class408 method2914(int arg0, int arg1) {
        field6806++;
        class39 var3 = this.field6804;
        class408 var4;
        synchronized (this.field6804) {
            var4 = (class408) this.field6804.method312(0, (long) arg0);
            int var5 = -11 / ((61 - arg1) / 52);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var6 = this.field6805;
        byte[] var7;
        synchronized (this.field6805) {
            var7 = this.field6805.method1849(arg0, (byte) 60, 34);
        }
        class408 var8 = new class408();
        var8.field5742 = this;
        if (var7 != null) {
            var8.method2497(new class511(var7), -7421);
        }
        class39 var9 = this.field6804;
        synchronized (this.field6804) {
            this.field6804.method305(var8, (long) arg0, 18320);
            return var8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 117)
    public static void method2915(int arg0) {
        field6816 = null;
        field6809 = null;
        if (arg0 > 95) {
            field6817 = null;
            field6813 = null;
            field6812 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V", line = 140)
    public final void method2916(int arg0, byte arg1) {
        if (arg1 < 25) {
            this.method2919((byte) -7);
        }
        class39 var3 = this.field6804;
        synchronized (this.field6804) {
            this.field6804.method308(-1, arg0);
        }
        field6808++;
        class39 var4 = this.field6814;
        synchronized (this.field6814) {
            this.field6814.method308(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)V", line = 159)
    public final void method2917(byte arg0, int arg1, int arg2) {
        this.field6804 = new class39(arg2);
        field6811++;
        if (arg0 <= 10) {
            this.field6802 = null;
        }
        this.field6814 = new class39(arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 171)
    public final void method2918(byte arg0) {
        field6803++;
        class39 var2 = this.field6804;
        synchronized (this.field6804) {
            if (arg0 != 123) {
                this.method2917((byte) 21, -44, 104);
            }
            this.field6804.method319(-75);
        }
        class39 var3 = this.field6814;
        synchronized (this.field6814) {
            this.field6814.method319(-111);
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V", line = 230)
    public class495(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field6802 = arg3;
        this.field6805 = arg2;
        this.field6805.method1867(34, (byte) 49);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 191)
    public final void method2919(byte arg0) {
        class39 var2 = this.field6804;
        synchronized (this.field6804) {
            this.field6804.method314(-2);
        }
        field6807++;
        class39 var3 = this.field6814;
        synchronized (this.field6814) {
            int var4 = -119 / ((3 - arg0) / 52);
            this.field6814.method314(-2);
        }
    }
}
