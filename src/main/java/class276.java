import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class276 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3663 = 0;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Leba;")
    public static class550 field3669 = new class550(105, 14);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "[B")
    public static byte[] field3664;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        field3669 = null;
        if (arg0 == 37) {
            field3664 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static final void method1656(int arg0) {
        if (class546.field7467 != null) {
            class546.field7467.method3088((byte) 103);
        }
        field3668++;
        if (class62.field781 != null) {
            class62.field781.method3088((byte) 111);
        }
        if (arg0 != -896460184) {
            field3663 = 2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3665++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    public static final void method1657(int arg0) {
        field3666++;
        if (class461.field6057 >= 0) {
            long var1 = class529.method2982((byte) -69);
            class461.field6057 = (int) ((long) class461.field6057 - (var1 - class302.field3998));
            if (class461.field6057 <= 0) {
                class640.field8827 = class548.field7499.field474;
                class668.field9496 = class548.field7499.field473;
                class279.field3681 = class548.field7499.field477;
                class494.field6810 = class548.field7499.field484;
                class287.field3792 = class548.field7499.field472;
                class461.field6057 = -1;
                class428.field5761 = class548.field7499.field476;
                class115.field1469 = class548.field7499.field470;
                class458.field6017 = class548.field7499.field483;
                class216.field2836 = class548.field7499.field475;
                class115.field1480 = class548.field7499.field479;
            } else {
                int var3 = (class461.field6057 << 8) / class601.field8393;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class115.field1480 = ((class1.field6 & 0xFF00FF) * var3 + (class548.field7499.field479 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class1.field6 & 0xFF00) * var3 + (class548.field7499.field479 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class640.field8827 = (class548.field7499.field474 - class363.field4794) * var6 + class363.field4794;
                class287.field3792 = (class548.field7499.field472 - class364.field4811) * var6 + class364.field4811;
                class279.field3681 = class665.field9459 * var3 + (class548.field7499.field477 * var4) >> 8;
                class115.field1469 = ((class391.field5234 & 0xFF00FF) * var3 + ((class548.field7499.field470 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class391.field5234 & 0xFF00) * var3 + (class548.field7499.field470 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class458.field6017 = (class548.field7499.field483 - class527.field7300) * var6 + class527.field7300;
                class428.field5761 = (class548.field7499.field476 - class76.field898) * var6 + class76.field898;
                class668.field9496 = (class548.field7499.field473 - class534.field7342) * var6 + class534.field7342;
                class216.field2836 = (class548.field7499.field475 - class680.field9654) * var6 + class680.field9654;
                if (class54.field704 != class548.field7499.field484) {
                    class494.field6810 = class610.field8468.method1154(class54.field704, class548.field7499.field484, var6, class494.field6810);
                }
            }
            class302.field3998 = var1;
        }
        if (arg0 != 1553501896) {
            field3664 = null;
        }
    }
}
