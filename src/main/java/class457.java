import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class457 {

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field6592 = 1401;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "F")
    public static float field6595 = 0.0F;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "[I")
    public static int[] field6606 = new int[25];

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public static int field6604 = -1;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "Lrf;")
    public static class157 field6609 = new class157();

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "B")
    public byte field6599;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "B")
    public byte field6600;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "B")
    public byte field6601;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "B")
    public byte field6603;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "B")
    public byte field6605;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "B")
    public byte field6607;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "B")
    public byte field6611;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public int field6591;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "S")
    public short field6597;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Z")
    public boolean field6586;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "Z")
    public boolean field6587;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Z")
    public boolean field6588;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Z")
    public boolean field6590;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Z")
    public boolean field6594;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "Z")
    public boolean field6598;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "Z")
    public boolean field6602;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "Z")
    public boolean field6610;

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "Z")
    public boolean field6612;

    @OriginalMember(owner = "client!raa", name = "C", descriptor = "Z")
    public boolean field6613;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2673(int arg0, int arg1, int arg2) {
        if (arg0 <= 103) {
            method2676(false, -26);
        }
        field6596++;
        class489 var3 = class704.method3942(arg1, 16, 0);
        var3.method2797(-1);
        var3.field6952 = arg2;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZIBILmq;)V", line = 24)
    public static final void method2674(boolean arg0, int arg1, byte arg2, int arg3, class71 arg4) {
        field6585++;
        int var5 = arg4.field7430[0];
        int var6 = arg4.field7429[0];
        if (var5 < 0 || var5 >= class72.field1144 || var6 < 0 || class668.field9444 <= var6 || arg1 < 0 || class72.field1144 <= arg1 || arg3 < 0 || arg3 >= class668.field9444) {
            return;
        }
        if (arg0) {
            field6604 = 69;
        }
        int var7 = class14.method98(0, -4, 0, var6, class642.field9198, class574.field8346, var5, 0, 0, arg4.method422((byte) -119), class629.field9104[arg4.field7905], true, arg3, arg1, (byte) 51);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg4.method420(class642.field9198[var8], class574.field8346[var8], 102, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 74)
    public static void method2675(int arg0) {
        if (arg0 <= -95) {
            field6609 = null;
            field6606 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)Lks;", line = 113)
    public static final class421 method2676(boolean arg0, int arg1) {
        if (!arg0) {
            field6592 = 108;
        }
        field6608++;
        if (arg1 == 0) {
            if ((double) class55.field844 == 3.0D) {
                return class480.field6872;
            }
            if ((double) class55.field844 == 4.0D) {
                return class162.field2284;
            }
            if ((double) class55.field844 == 6.0D) {
                return class267.field3489;
            }
            if ((double) class55.field844 >= 8.0D) {
                return class109.field1624;
            }
        } else if (arg1 == 1) {
            if ((double) class55.field844 == 3.0D) {
                return class267.field3489;
            }
            if ((double) class55.field844 == 4.0D) {
                return class109.field1624;
            }
            if ((double) class55.field844 == 6.0D) {
                return class678.field9596;
            }
            if ((double) class55.field844 >= 8.0D) {
                return class322.field4691;
            }
        } else if (arg1 == 2) {
            if ((double) class55.field844 == 3.0D) {
                return class678.field9596;
            }
            if ((double) class55.field844 == 4.0D) {
                return class322.field4691;
            }
            if ((double) class55.field844 == 6.0D) {
                return class79.field1287;
            }
            if ((double) class55.field844 >= 8.0D) {
                return class556.field8165;
            }
        }
        return null;
    }
}
