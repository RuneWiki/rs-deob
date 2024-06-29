import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class315 extends class212 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[[S")
    public static short[][] field4362;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)V", line = 3)
    public static final void method2039(boolean arg0, String arg1, String arg2, int arg3, int arg4) {
        class250.method1702(true, arg2, arg4, arg3, arg0, arg1, true);
        ++field4360;
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I", line = 11)
    public final int method2040(int arg0) {
        ++field4358;
        if (arg0 != -32350) {
            this.method417(82, -89);
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 22)
    public static final void method2041(String arg0, byte arg1) {
        ++field4364;
        if (class184.field2785 && ~(24 & class479.field6669) != -1) {
            int var2 = -88 / ((arg1 - -33) / 37);
            boolean var3 = false;
            int var4 = class219.field3167;
            int[] var5 = class87.field1561;
            for (int var6 = 0; var4 > var6; ++var6) {
                class598 var7 = class49.field1040[var5[var6]];
                if (var7.field8189 != null && var7.field8189.equalsIgnoreCase(arg0) && (class58.field1147 == var7 && (16 & class479.field6669) != 0 || var7 != null && ~(class479.field6669 & 8) != -1)) {
                    ++class559.field7739;
                    class564 var8 = class227.method1594(class684.field9266, class72.field1320, -102);
                    var8.field7778.method1497(4325, class44.field980);
                    var8.field7778.method1501(var5[var6], (byte) 3);
                    var8.field7778.method1501(class173.field2690, (byte) 3);
                    var8.field7778.method1504(class406.field5949, -4086);
                    var8.field7778.method1522((byte) -64, 0);
                    class167.method1260(116, var8);
                    var3 = true;
                    class137.method1116(true, var7.field5746[0], var7.field5743[0], (byte) -99, var7.method2457((byte) 54), 0, var7.method2457((byte) 91), -2, 0);
                    break;
                }
            }
            if (!var3) {
                class356.method2237(class497.field6912.method2936(class607.field8336, 544) + arg0, false, 4);
            }
            if (class184.field2785) {
                class236.method1643(-2049);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V", line = 75)
    public final void method418(boolean arg0) {
        if (super.field3006 != 1 && ~super.field3006 != -1) {
            super.field3006 = this.method422(20014);
        }
        if (!arg0) {
            ++field4361;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ldh;)V", line = 90)
    public class315(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)Z", line = 96)
    public static final boolean method2042(int arg0, int arg1, byte arg2) {
        int var3 = 92 % ((arg2 - 48) / 32);
        ++field4363;
        return ~(65536 & arg0) != -1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 107)
    public static void method2043(byte arg0) {
        field4362 = null;
        if (arg0 != 119) {
            field4365 = -51;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)I", line = 117)
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field4365 = 94;
        }
        ++field4356;
        return 1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V", line = 129)
    public final void method419(int arg0, int arg1) {
        int var3 = -57 / ((82 - arg0) / 35);
        ++field4359;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(ILdh;)V", line = 140)
    public class315(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)I", line = 145)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field4365 = -72;
        }
        ++field4357;
        return 1;
    }
}
