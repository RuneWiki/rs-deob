import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class407 extends class529 {

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public int field6145 = 0;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field6166 = 0;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public int field6143;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public int field6151;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public int field6154;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public int field6155;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public int field6159;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public int field6160;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public int field6162;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public int field6163;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public int field6164;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "Loq;")
    public class156 field6157;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "Lgh;")
    public class350 field6165;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Lwq;")
    public class378 field6149;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Lsv;")
    public class394 field6144;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "Lsv;")
    public class394 field6148;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "Lvt;")
    public static class522 field6152;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Z")
    public boolean field6156;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "[I")
    public int[] field6161;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method2606(int arg0) {
        field6152 = null;
        if (arg0 != 0) {
            field6166 = 124;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
    public static final void method2607(int arg0, int arg1) {
        class328 var2 = class473.field7252;
        synchronized (class473.field7252) {
            class473.field7252.method2202(arg1, arg0);
        }
        field6158++;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public final void method2608(int arg0) {
        field6150++;
        int var2 = this.field6162;
        if (this.field6157 != null) {
            class156 var3 = this.field6157.method962((byte) 110, class96.field1394);
            if (var3 == null) {
                this.field6146 = 0;
                this.field6164 = 0;
                this.field6162 = -1;
                this.field6143 = 0;
                this.field6161 = null;
                this.field6154 = 0;
            } else {
                this.field6164 = var3.field2140;
                this.field6162 = var3.field2107;
                this.field6154 = var3.field2144 << 7;
                this.field6146 = var3.field2097;
                this.field6161 = var3.field2146;
                this.field6143 = var3.field2070;
            }
        } else if (this.field6149 != null) {
            int var4 = class316.method2109(this.field6149, (byte) 113);
            if (var2 != var4) {
                this.field6162 = var4;
                class191 var5 = this.field6149.field5809;
                if (var5.field2798 != null) {
                    var5 = var5.method1190(-1, class96.field1394);
                }
                if (var5 == null) {
                    this.field6143 = this.field6154 = 0;
                } else {
                    this.field6143 = var5.field2789;
                    this.field6154 = var5.field2778 << 7;
                }
            }
        } else if (this.field6165 != null) {
            this.field6162 = class41.method250(this.field6165, -6);
            this.field6154 = this.field6165.field5439 << 7;
            this.field6143 = this.field6165.field5459;
        }
        if (arg0 != 0) {
            this.method2608(-92);
        }
        if (this.field6162 != var2 && this.field6148 != null) {
            class411.field6231.method482(this.field6148);
            this.field6148 = null;
        }
    }
}
