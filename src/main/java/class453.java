import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class453 extends class307 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[I")
    public static int[] field6821 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "[I")
    public static int[] field6822 = new int[1];

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field6819;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "[[[Lsn;")
    public static class452[][][] field6825;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method2759(int arg0) {
        field6819 = null;
        if (arg0 != 0) {
            field6821 = null;
        }
        field6822 = null;
        field6821 = null;
        field6825 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILuq;)V")
    public static final void method2760(int arg0, int arg1, int arg2, int arg3, class113 arg4) {
        class452 var5 = class2.method8(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field1576 = (arg1 << class10.field179) + class251.field3501;
        arg4.field1572 = arg3;
        arg4.field1570 = (arg2 << class10.field179) + class251.field3501;
        for (class384 var7 = var5.field6814; var7 != null; var7 = var7.field5834) {
            if (var7.field5832.field1861) {
                int var8 = var7.field5832.method174((byte) -127);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field1572 += var6;
            arg4.field1578 = true;
        } else if (var5.field6801 != null) {
            arg4.field1572 -= var5.field6801.field6029;
        }
        var5.field6796 = arg4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public static final int method2761(int arg0, int arg1) {
        if (arg1 != 646699144) {
            method2760(-99, 63, -127, -107, null);
        }
        field6823++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static final void method2762(byte arg0) {
        class208.field2875++;
        field6824++;
        class424.method2582(class261.field3680, -1);
        if (arg0 < -64) {
            class538.field7879.method1072((byte) 102, 0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILga;)V")
    public static final void method2763(int arg0, int arg1, int arg2, class282 arg3) {
        class109.field1543 = arg0;
        field6820++;
        if (arg1 != 4) {
            method2760(-101, -60, 27, -33, null);
        }
        class96.field1416 = arg2;
        class199.field2656 = arg3;
    }

    static {
        new class446("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field6826 = 0;
    }
}
