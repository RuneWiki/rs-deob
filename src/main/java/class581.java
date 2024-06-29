import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class581 extends class107 {

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "Lvk;")
    public static class387 field8213 = new class387(1);

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public int field8199;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public int field8201;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public int field8202;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public int field8206;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public int field8207;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field8212;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lpha;")
    public class174 field8211;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fi", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field8217;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Ljava/lang/String;")
    public String field8215;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "[I")
    public int[] field8198;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "[I")
    public static int[] field8200;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "[I")
    public int[] field8214;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "[J")
    public long[] field8203;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "[Ljo;")
    public class353[] field8209;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field8205;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3407(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 6)
    public static final boolean method3402(String arg0, byte arg1) {
        if (arg1 != -18) {
            field8200 = null;
        }
        field8208++;
        return class110.method846((byte) 110, field8217 == null ? (field8217 = method3407("aea")) : field8217, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 19)
    public static void method3403(int arg0) {
        field8213 = null;
        if (arg0 < -80) {
            field8200 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BC)Z", line = 41)
    public static final boolean method3404(byte arg0, char arg1) {
        if (arg0 != -54) {
            method3405(null, 39);
        }
        field8210++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lmea;I)V", line = 54)
    public static final void method3405(class451 arg0, int arg1) {
        field8204++;
        if (arg1 != 150) {
            field8200 = null;
        }
        if (class173.field2688 != arg0.field6271) {
            return;
        }
        if (class210.field3250.field9768 == null) {
            arg0.field6239 = 0;
            arg0.field6188 = 0;
            return;
        }
        arg0.field6172 = 150;
        arg0.field6258 = (int) (Math.sin((double) class192.field2961 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field6239 = class250.field3689;
        arg0.field6248 = 5;
        arg0.field6188 = class248.method1638(class210.field3250.field9768, (byte) -72);
        arg0.field6228 = class210.field3250.field4597;
        arg0.field6167 = class210.field3250.field4659;
        arg0.field6339 = class210.field3250.field4634;
        arg0.field6324 = 0;
        class607 var2 = arg0.field6167 == -1 ? null : class563.field7993.method651(arg0.field6167, (byte) 125);
        if (var2 != null) {
            class662.method3776(var2, arg0.field6339, arg1 - 49);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 101)
    public static final void method3406(int arg0) {
        class787.field10812 = new class451[class428.field5819.method4332((byte) 127)][];
        if (arg0 > -52) {
            method3404((byte) -33, '\u0011');
        }
        field8216++;
        class254.field3741 = new class451[class428.field5819.method4332((byte) 127)][];
        class505.field7173 = new boolean[class428.field5819.method4332((byte) 124)];
    }
}
