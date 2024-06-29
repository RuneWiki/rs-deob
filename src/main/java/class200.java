import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class200 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3198 = "Take";

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3201 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3206 = "Attack";

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lgi;")
    public static class164 field3200;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field3207;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lhd;I)V")
    public static final void method1374(class12 arg0, int arg1) {
        class273 var2 = (class273) class33.field546.method371(-116, class162.method1114((byte) -115, arg0.field222));
        if (arg1 != -21717) {
            return;
        }
        field3202++;
        if (var2 == null) {
            class29.method231(-19232, (class104) null, arg0.field965[0], arg0, arg0.field956[0], class214.field3389, (class172) null, 0);
        } else {
            var2.method1808(-30174);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
    public static final int method1375(int arg0, int arg1) {
        if (arg0 != 0) {
            field3208 = -12;
        }
        field3197++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lih;")
    public static final class219 method1376(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1780;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Lng;")
    public static final class80 method1377(int arg0, int arg1) {
        class80 var2 = (class80) class146.field2347.method1879(8887, (long) arg0);
        field3209++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field3362.method1156(1, arg0, (byte) -16);
        class80 var4 = new class80();
        var4.field1298 = arg0;
        if (arg1 <= 53) {
            method1374((class12) null, -80);
        }
        if (var3 != null) {
            var4.method577(new class274(var3), (byte) 116);
        }
        var4.method576(-91);
        if (var4.field1282 == 2 && class296.field4830.method371(-99, (long) arg0) == null) {
            class296.field4830.method368((long) arg0, new class71(class58.field832), -125);
            class210.field3349[class58.field832++] = var4;
        }
        class146.field2347.method1883((long) arg0, 64, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1378(byte arg0) {
        if (arg0 >= 120) {
            field3206 = null;
            field3207 = null;
            field3198 = null;
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
    public static final void method1379(int arg0, boolean arg1) {
        class262.field4289 = null;
        class262.field4287 = null;
        class92.field1462 = 0;
        class262.field4288 = null;
        field3203++;
        class262.field4282 = null;
        if (arg0 != -842114134) {
            field3200 = null;
        }
        class262.field4286 = null;
        if (arg1 && class262.field4273 != null) {
            class233.field3644 = class262.field4273.field2735;
        } else {
            class233.field3644 = -1;
        }
        class262.field4283 = null;
        class262.field4292 = null;
        class132.field2117 = null;
        class262.field4284 = null;
        class102.field1621 = null;
        class262.field4273 = null;
        class262.field4272.method392(0);
        class246.field3874 = null;
        class193.field3148 = null;
        class262.field4268 = null;
        class16.field305 = -1;
        class208.field3314 = -1;
        class60.field875 = null;
        class134.field2180 = null;
        class102.field1625 = null;
        class259.field4247 = null;
        class117.field1805 = null;
        class184.field3052 = null;
        class193.field3143 = null;
        class140.method966((byte) 3);
        class229.field3593 = null;
        class60.field867 = null;
        class226.field3546 = null;
        class297.method2038(64, 128, arg0 ^ 0xCDCE5BAB);
        class122.method838(64, 0);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class200() {
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ldj;)V")
    public class200(class200 arg0) {
        this.field3196 = arg0.field3196;
        this.field3199 = arg0.field3199;
        this.field3204 = arg0.field3204;
        this.field3205 = arg0.field3205;
    }
}
