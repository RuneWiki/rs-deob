import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class571 extends class69 {

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
    public int field8027 = 0;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "Laf;")
    public static class39 field8023 = new class39(20);

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    public int field8025;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
    public int field8030;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    public int field8031;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public int field8033;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public int field8036;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public int field8037;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public int field8039;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public int field8040;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    public int field8044;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
    public int field8046;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public int field8051;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
    public int field8052;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    public int field8053;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
    public int field8054;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "Lwu;")
    public class168 field8026;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "Lwu;")
    public class168 field8049;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "Lro;")
    public class286 field8038;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "Lfk;")
    public class348 field8028;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "Lfk;")
    public class348 field8043;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "Lkf;")
    public class359 field8034;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "Lqw;")
    public class622 field8047;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "Lqw;")
    public class622 field8050;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "Lpd;")
    public static class645 field8029;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "Lib;")
    public class723 field8035;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "Z")
    public boolean field8024;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
    public boolean field8032;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "Z")
    public boolean field8045;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "[I")
    public int[] field8042;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 40)
    public final void method3357(int arg0) {
        field8041++;
        int var2 = this.field8037;
        boolean var3 = this.field8024;
        if (arg0 != -1236336695) {
            this.field8045 = false;
        }
        if (this.field8038 != null) {
            class286 var4 = this.field8038.method1889(class173.field2192, false);
            if (var4 == null) {
                this.field8039 = 256;
                this.field8052 = 0;
                this.field8032 = false;
                this.field8051 = 0;
                this.field8044 = 0;
                this.field8046 = 0;
                this.field8024 = false;
                this.field8031 = 256;
                this.field8030 = 0;
                this.field8042 = null;
                this.field8037 = -1;
            } else {
                this.field8042 = var4.field4155;
                this.field8031 = var4.field4157;
                this.field8037 = var4.field4153;
                this.field8052 = var4.field4180;
                this.field8046 = var4.field4139;
                this.field8044 = var4.field4141 << 9;
                this.field8032 = var4.field4172;
                this.field8030 = var4.field4196;
                this.field8024 = var4.field4142;
                this.field8039 = var4.field4175;
            }
        } else if (this.field8034 != null) {
            int var5 = class342.method2169((byte) -115, this.field8034);
            if (var2 != var5) {
                this.field8037 = var5;
                class636 var6 = this.field8034.field5172;
                if (var6.field8872 != null) {
                    var6 = var6.method3650(class173.field2192, (byte) 55);
                }
                if (var6 == null) {
                    this.field8024 = this.field8034.field5172.field8946;
                    this.field8031 = 256;
                    this.field8030 = this.field8044 = this.field8051 = 0;
                    this.field8039 = 256;
                } else {
                    this.field8031 = var6.field8939;
                    this.field8024 = var6.field8946;
                    this.field8039 = var6.field8911;
                    this.field8051 = var6.field8893 << 9;
                    this.field8030 = var6.field8947;
                    this.field8044 = var6.field8882 << 9;
                }
            }
        } else if (this.field8035 != null) {
            this.field8037 = class107.method761((byte) 26, this.field8035);
            this.field8031 = 256;
            this.field8039 = 256;
            this.field8051 = 0;
            this.field8024 = this.field8035.field9981;
            this.field8044 = this.field8035.field9974 << 9;
            this.field8030 = this.field8035.field9970;
        }
        if (this.field8037 == var2 && this.field8024 == var3) {
            return;
        }
        if (this.field8026 == null) {
            return;
        }
        class44.field468.method2512(this.field8026);
        this.field8026 = null;
        this.field8047 = null;
        this.field8043 = null;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)Z", line = 152)
    public static final boolean method3358(int arg0, int arg1, int arg2) {
        if (arg0 == 256) {
            field8048++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V", line = 169)
    public static void method3359(byte arg0) {
        field8029 = null;
        if (arg0 < 72) {
            method3358(-97, 90, -101);
        }
        field8023 = null;
    }
}
