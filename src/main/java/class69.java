import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class69 extends class209 {

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "J")
    public static long field1085 = 0L;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Z")
    public static boolean field1097 = false;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1094 = "wishes to trade with you.";

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Lhe;")
    public static class20 field1087;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Ljava/lang/String;")
    public String field1099;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Z")
    public static boolean field1090;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "[Lel;")
    public static class213[] field1096;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)J")
    public final long method551(byte arg0) {
        ++field1092;
        return arg0 > -101 ? -29L : Long.MAX_VALUE & super.field3237;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1096 = null;
        if (arg0 != 0) {
            method555(-28, -42, 61, 23, -47, -25, 94, 97);
        }
        field1087 = null;
        field1094 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I")
    public final int method553(boolean arg0) {
        ++field1093;
        return arg0 ? 47 : (int) super.field2009;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public final void method554(int arg0) {
        if (arg0 == 2009563296) {
            super.field3237 = super.field3237 & Long.MIN_VALUE | 500L + class242.method1650(83);
            ++field1095;
            class182.field2854.method621(this, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 + arg6;
        ++field1100;
        int var9 = -arg4 + arg1;
        int var10 = arg0 - -arg4;
        for (int var11 = arg6; var8 > var11; ++var11) {
            class173.method1240((byte) -84, arg2, class55.field872[var11], arg5, arg0);
        }
        int var12 = -arg4 + arg2;
        for (int var13 = arg1; var9 < var13; --var13) {
            class173.method1240((byte) -65, arg2, class55.field872[var13], arg5, arg0);
        }
        for (int var14 = var8; ~var14 >= ~var9; ++var14) {
            int[] var16 = class55.field872[var14];
            class173.method1240((byte) -103, var10, var16, arg5, arg0);
            class173.method1240((byte) -121, var12, var16, arg7, var10);
            class173.method1240((byte) -112, arg2, var16, arg5, var12);
        }
        int var15 = 11 % ((-46 - arg3) / 54);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
    public final void method556(byte arg0) {
        if (arg0 < -94) {
            super.field3237 |= Long.MIN_VALUE;
            if (~this.method551((byte) -114) == -1L) {
                class2.field46.method621(this, (byte) -57);
            }
            ++field1098;
        }
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)I")
    public final int method557(int arg0) {
        ++field1089;
        if (arg0 != 255) {
            method558(true);
        }
        return (int) (255L & super.field2009 >>> 32);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static final void method558(boolean arg0) {
        ++field1084;
        if (arg0) {
            field1097 = false;
        }
        class150.field2219.method1169(true);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II)V")
    public class69(int arg0, int arg1) {
        super.field2009 = (long) arg1 | (long) arg0 << 32;
    }
}
