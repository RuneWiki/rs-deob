import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class92 extends class450 {

    @OriginalMember(owner = "client!aja", name = "l", descriptor = "Lqt;")
    public static class637 field1112 = new class637();

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "I")
    public static int field1116 = 0;

    @OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "F")
    public static float field1117;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!aja", name = "o", descriptor = "Lk;")
    public static class566 field1115;

    @OriginalMember(owner = "client!aja", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1120;

    @OriginalMember(owner = "client!aja", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field1119;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZIII)V", line = 7)
    public static final void method691(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1106;
        if (class735.field10160 != arg2 || ~class177.field2666 != ~arg1 || ~class304.field4330 != ~arg3) {
            class177.field2666 = arg1;
            class304.field4330 = arg3;
            class302.field4291 = arg0;
            class735.field10160 = arg2;
            double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
            double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
            double var8 = Math.cos(var6);
            double var10 = Math.sin(var6);
            double var12 = Math.cos(var4);
            double var14 = Math.sin(var4);
            class84.field1024 = var8;
            class589.field7688 = var12;
            class597.field7826 = var14;
            class604.field7935 = 0.0D;
            class513.field6810 = var8 * var12;
            class261.field3631 = var10;
            class241.field3386 = -var10 * var12;
            class127.field2098 = var10 * var14;
            class455.field6210 = -var8 * var14;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V", line = 63)
    public final void method73(byte arg0) {
        if (arg0 == 98) {
            ++field1114;
            if (super.field6170 < 0 || super.field6170 > 4) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(II)I", line = 76)
    public final int method75(int arg0, int arg1) {
        ++field1110;
        return arg0 != 0 ? 110 : 1;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ZI)V", line = 88)
    public final void method67(boolean arg0, int arg1) {
        if (arg0) {
            super.field6170 = arg1;
            ++field1108;
        }
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(Z)I", line = 100)
    public final int method692(boolean arg0) {
        ++field1111;
        if (!arg0) {
            method695((byte) -14, (class672) null, (class672) null);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "(Z)V", line = 112)
    public static void method693(boolean arg0) {
        field1120 = null;
        if (!arg0) {
            field1120 = null;
        }
        field1112 = null;
        field1115 = null;
        field1119 = null;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)V", line = 126)
    public static final void method694(int arg0) {
        ++field1107;
        if (~class15.field215 == -8) {
            class339.method2036(52, false);
        } else if (arg0 == 16384) {
            class459.field6276 = class209.field3089;
            class209.field3089 = null;
            class66.method566(13, -21035);
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)I", line = 146)
    public final int method68(boolean arg0) {
        if (arg0) {
            field1112 = null;
        }
        ++field1109;
        return 3;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLvfa;Lvfa;)V", line = 163)
    public static final void method695(byte arg0, class672 arg1, class672 arg2) {
        ++field1113;
        ++class541.field7170;
        class583 var3 = class381.method2246(1, class128.field2105, class431.field5942);
        var3.field7637.method3798(arg0 + 27807, arg1.field9200);
        if (arg0 == -112) {
            var3.field7637.method3780(arg1.field9318, 92);
            var3.field7637.method3798(27695, arg2.field9200);
            var3.field7637.method3781(true, arg1.field9277);
            var3.field7637.method3781(true, arg2.field9277);
            var3.field7637.method3781(true, arg2.field9318);
            class42.method309(var3, 0);
        }
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lup;)V", line = 188)
    public class92(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(ILup;)V", line = 196)
    public class92(int arg0, class278 arg1) {
        super(arg0, arg1);
    }
}
