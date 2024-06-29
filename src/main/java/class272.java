import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class272 extends class4 {

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "Ljava/lang/String;")
    public String field3946;

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "Lvu;")
    public class680 field3951;

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ida", name = "x", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ida", name = "y", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "Lda;")
    public static class402 field3950;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lsba;I)Z")
    public final boolean method1828(class558 arg0, int arg1) {
        field3949++;
        arg0.method21(arg1 ^ 0x7A);
        boolean var3 = true;
        if (arg1 != 0) {
            return false;
        }
        for (class558 var4 = (class558) this.field3951.method3828(99); var4 != null; var4 = (class558) this.field3951.method3829(arg1 ^ 0xFFFF8DEE)) {
            if (class312.method2045(var4.field7754, arg0.field7754, (byte) -110)) {
                class609.method3460(arg0, var4, false);
                this.field3953++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
        }
        this.field3951.method3827(arg1 ^ 0xFFFFFF92, arg0);
        this.field3953++;
        return var3;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)I")
    public final int method1829(byte arg0) {
        field3952++;
        if (arg0 == 6) {
            return this.field3951.field9462.field33 == this.field3951.field9462 ? -1 : ((class558) this.field3951.field9462.field33).field7754;
        } else {
            return -8;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IB)V")
    public static final void method1830(int arg0, byte arg1) {
        if (arg1 <= 121) {
            method1833((byte) -122);
        }
        if (class332.field4707.field4794.method3266(0) == 0) {
            arg0 = -1;
        }
        field3948++;
        if (class10.field88 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class561 var2 = class481.field6713.method2284(true, arg0);
            class52 var3 = var2.method3297(-45);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class159.field2227.method867(new Point(var2.field7798, var2.field7805), var3.method383(), var3.method379(), var3.method376(), class570.field7875, 17);
                class10.field88 = arg0;
            }
        }
        if (arg0 == -1 && class10.field88 != -1) {
            class159.field2227.method867(new Point(), -1, null, -1, class570.field7875, 17);
            class10.field88 = -1;
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(ILdc;)Lcv;")
    public static final class545 method1831(int arg0, class63 arg1) {
        field3954++;
        class557 var2 = client.method2746(0)[arg1.method505((byte) -119)];
        class125 var3 = class146.method947(-112)[arg1.method505((byte) -119)];
        int var4 = arg1.method496(-26);
        int var5 = arg1.method496(-77);
        int var6 = arg1.method482(-772591672);
        int var7 = -44 % ((arg0 + 61) / 40);
        int var8 = arg1.method482(-772591672);
        int var9 = arg1.method496(-88);
        int var10 = arg1.method457(-14532);
        int var11 = arg1.method457(-14532);
        return new class545(var2, var3, var4, var5, var6, var8, var9, var10, var11);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lsba;B)Z")
    public final boolean method1832(class558 arg0, byte arg1) {
        field3947++;
        int var3 = this.method1829((byte) 6);
        arg0.method21(97);
        if (arg1 >= -116) {
            this.field3951 = null;
        }
        this.field3953--;
        if (this.field3953 != 0) {
            return this.method1829((byte) 6) != var3;
        }
        this.method549(6410);
        this.method21(115);
        class569.field7865--;
        class522.field7265.method3899(57, this, arg0.field7758);
        return false;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)V")
    public static void method1833(byte arg0) {
        field3950 = null;
        if (arg0 > -33) {
            field3950 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class272(String arg0) {
        this.field3946 = arg0;
        this.field3951 = new class680();
    }
}
