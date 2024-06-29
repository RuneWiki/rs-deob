import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class398 extends class147 implements class613 {

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "B")
    private byte field5891;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method992(byte arg0) {
        if (arg0 > -15) {
            this.field5891 = 1;
        }
        ++field5884;
        return super.method1050(super.field2141.field4432, 1);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z", line = 17)
    public final boolean method993(int arg0, int arg1, int arg2) {
        ++field5887;
        this.field5891 = (byte) arg2;
        super.method1(arg1 ^ -6740, arg0);
        if (arg1 != -6696) {
            this.field5891 = 113;
        }
        return true;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)I", line = 32)
    public final int method2441(byte arg0) {
        if (arg0 != 47) {
            return -38;
        } else {
            ++field5882;
            return this.field5891;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 44)
    public final boolean method994(int arg0, int arg1, int arg2, Source arg3) {
        this.field5891 = (byte) arg2;
        ++field5888;
        super.method1055(true, arg1, arg3);
        if (arg0 != 27774) {
            this.field5891 = 76;
        }
        return true;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I", line = 60)
    public final int method4(byte arg0) {
        ++field5886;
        if (arg0 != 1) {
            this.field5891 = -87;
        }
        return super.method4((byte) 1);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lhp;Z)V", line = 76)
    public class398(class296 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 79)
    public final Buffer method995(boolean arg0, int arg1) {
        if (arg1 != 1614) {
            return null;
        } else {
            ++field5883;
            return super.method1048(113, arg0, super.field2141.field4432);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 93)
    public final void method7(int arg0) {
        if (arg0 >= -98) {
            this.field5891 = 12;
        }
        ++field5890;
        super.method7(-117);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[Ljava/lang/Object;[JII)V", line = 104)
    public static final void method2442(int arg0, Object[] arg1, long[] arg2, int arg3, int arg4) {
        if (~arg0 < ~arg4) {
            int var5 = (arg4 - -arg0) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var9;
            int var10 = var7 != Long.MAX_VALUE ? 1 : 0;
            for (int var11 = arg4; ~var11 > ~arg0; ++var11) {
                if (var7 - -((long) (var11 & var10)) > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var9;
            method2442(var6 - 1, arg1, arg2, 1, arg4);
            method2442(arg0, arg1, arg2, 1, var6 - -1);
        }
        if (arg3 == 1) {
            ++field5885;
        }
    }
}
