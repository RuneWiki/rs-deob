import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class42 extends class7 {

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Lob;")
    private static class141 field818 = class175.method1195(40, "Cancel");

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lob;")
    public static class141 field819 = field818;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Z")
    public static boolean field824 = false;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "[Lcd;")
    public static class25[] field827;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lpe;B)V")
    public static final void method271(class154 arg0, byte arg1) {
        ++field828;
        class31.field628 = arg0;
        if (arg1 == 0) {
            class31.field628.method1058(4, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method272(int arg0, Component arg1) {
        ++field826;
        if (arg0 != -751) {
            method272(90, (Component) null);
        }
        arg1.removeKeyListener(class150.field2889);
        arg1.removeFocusListener(class150.field2889);
        class165.field3204 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)Lge;")
    public static final class65 method273(int arg0, int arg1) {
        ++field823;
        class65 var2 = (class65) class142.field2750.method1383((long) arg0, (byte) 104);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class50.field984.method1065((byte) 85, arg0, 3);
            class65 var4 = new class65();
            if (arg1 != 0) {
                field819 = null;
            }
            if (var3 != null) {
                var4.method438(new class146(var3), (byte) -110);
            }
            class142.field2750.method1378(var4, (byte) -100, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Log;I)Lji;")
    public static final class98 method274(class146 arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field820;
            return new class98(arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method1012(-124), arg0.method991(255));
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class68.field1323 <= -arg4 + arg1 && ~(arg1 + arg4) >= ~class136.field2590 && class35.field698 <= arg3 - arg4 && ~(arg3 + arg4) >= ~class130.field2470) {
            class1.method7(arg1, arg2, 104, arg3, arg4);
        } else {
            class176.method1203(arg2, arg1, (byte) -26, arg3, arg4);
        }
        ++field825;
        if (arg0 >= -53) {
            method274((class146) null, -19);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field821;
        if (arg0 < 13) {
            return null;
        } else {
            int[] var3 = super.field100.method842(arg1, 12);
            if (super.field100.field2534) {
                class149.method1040(var3, 0, class117.field2272, class177.field3503[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static void method276(boolean arg0) {
        field827 = null;
        field819 = null;
        field818 = null;
        if (!arg0) {
            field824 = true;
        }
    }
}
