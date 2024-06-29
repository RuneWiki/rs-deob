import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class126 extends class78 {

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2005 = "red:";

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "[S")
    public static short[] field2001 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field2013 = 0;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V", line = 7)
    public static final void method947(boolean arg0) {
        if (arg0) {
            method948(26, -121, -32);
        }
        for (int var1 = 0; var1 < class75.field1160; var1++) {
            int var2 = class231.field3673[var1];
            class30 var3 = class82.field1228[var2];
            int var4 = class267.field4132.method741(51);
            if ((var4 & 0x40) != 0) {
                var4 += class267.field4132.method741(41) << 8;
            }
            class83.method596(var4, var3, (byte) -44, var2);
        }
        field2002++;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)I", line = 40)
    public static final int method948(int arg0, int arg1, int arg2) {
        field2008++;
        int var3 = class263.method1875(arg1 + 45365, 126, 4, arg2 + 91923) + (class263.method1875(arg1 + 10294, -66, 2, arg2 + 37821) - 128 >> 1) + (class263.method1875(arg1, 125, 1, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 > var4) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V", line = 68)
    public static final void method949(int arg0) {
        if (arg0 <= 96) {
            field2005 = (String) null;
        }
        field2012++;
        if (class114.field1862 != null) {
            class99 var1 = class114.field1862;
            synchronized (class114.field1862) {
                class114.field1862 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBIII)V", line = 85)
    public final void method950(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2014++;
        int var6 = this.field2003 << 3;
        int var7 = (arg0 << 4) + (var6 & 0xF);
        int var8 = this.field2004 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        if (arg1 != -42) {
            this.method51(67, 86);
        }
        this.method55(var6, var8, var7, var9, arg3, arg4);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V", line = 129)
    public static void method951(byte arg0) {
        field2005 = null;
        field2001 = null;
        if (arg0 <= 45) {
            field2001 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V")
    public abstract void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public abstract void method59(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)V")
    public abstract void method51(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIII)V")
    public abstract void method56(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)V")
    public abstract void method62(int arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V")
    public abstract void method58(int arg0, int arg1, int arg2);
}
