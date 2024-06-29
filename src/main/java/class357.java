import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class357 {

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Z")
    public boolean field5203;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "B")
    public byte field5200;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "B")
    public byte field5196;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "S")
    public short field5199;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "S")
    public short field5202;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "S")
    public short field5194;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public int field5205;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Ljja;")
    public static class119 field5197;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public static void method2248(byte arg0) {
        if (arg0 < 63) {
            method2248((byte) 35);
        }
        field5197 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final void method2249(int arg0) {
        class772.field10654.method2369(-1);
        field5204++;
        if (arg0 != 0) {
            field5197 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIB)Z")
    public static final boolean method2250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5195++;
        int var7 = arg4 + arg5;
        int var8 = arg1 + arg3;
        int var9 = arg0 + arg2;
        if (arg6 != -56) {
            return false;
        } else if (!class693.method3898(var8, arg4, var8, var9, var9, var8, var7, 0, arg4, arg2)) {
            return false;
        } else if (class693.method3898(var8, arg4, var8, arg2, var9, var8, var7, 0, var7, arg2)) {
            if (class544.field7647 <= arg4) {
                if (!class693.method3898(arg1, var7, var8, arg2, var9, var8, var7, 0, var7, var9)) {
                    return false;
                }
                if (!class693.method3898(arg1, var7, arg1, arg2, arg2, var8, var7, 0, var7, var9)) {
                    return false;
                }
            } else if (!class693.method3898(arg1, arg4, var8, arg2, var9, var8, arg4, 0, arg4, var9)) {
                return false;
            } else if (!class693.method3898(arg1, arg4, arg1, arg2, arg2, var8, arg4, 0, arg4, var9)) {
                return false;
            }
            if (arg2 < class752.field10424) {
                if (!class693.method3898(arg1, arg4, var8, arg2, arg2, var8, var7, 0, arg4, arg2)) {
                    return false;
                }
                if (!class693.method3898(arg1, arg4, arg1, arg2, arg2, var8, var7, 0, var7, arg2)) {
                    return false;
                }
            } else if (!class693.method3898(arg1, arg4, var8, var9, var9, var8, var7, 0, arg4, var9)) {
                return false;
            } else if (!class693.method3898(arg1, arg4, arg1, var9, var9, var8, var7, 0, var7, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZB)V")
    public static final void method2251(boolean arg0, byte arg1) {
        field5201++;
        if (arg1 >= -89) {
            field5197 = null;
        }
        if (class230.field3350.length() == 0) {
            return;
        }
        class561.method3260("--> " + class230.field3350, 69);
        class237.method1628((byte) 75, false, class230.field3350, arg0);
        class109.field1317 = 0;
        class230.field3350 = "";
        class322.field4784 = 0;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field5203 = arg9;
        this.field5200 = (byte) arg7;
        this.field5196 = (byte) arg8;
        this.field5199 = (short) arg5;
        this.field5202 = (short) arg6;
        this.field5194 = (short) arg4;
        this.field5198 = arg0;
        this.field5205 = arg10;
    }
}
