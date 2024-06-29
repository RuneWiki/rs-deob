import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class62 extends class471 {

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field883 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lvr;")
    public static class306 field886 = new class306();

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "Lf;")
    public static class191 field888;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Ltj;")
    public static class460 field885;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(FI)V", line = 3)
    public final void method423(float arg0, int arg1) {
        ++field880;
        super.field6885 = arg0;
        if (arg1 > -112) {
            field883 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILbp;BI)V", line = 21)
    public static final void method424(int arg0, int arg1, class322 arg2, byte arg3, int arg4) {
        ++field884;
        int var5 = arg2.field5339[0];
        int var6 = arg2.field5344[0];
        if (~var5 <= -1 && class96.field1403 > var5 && var6 >= 0 && ~class485.field7122 < ~var6) {
            if (arg4 >= 0 && class96.field1403 > arg4 && ~arg0 <= -1 && ~arg0 > ~class485.field7122) {
                int var7 = class421.method2536(0, class444.field6605[arg2.field2210], arg4, class111.field1557, 0, var6, -4, arg1, 0, class168.field2446, arg2.method2091(-15245), arg0, var5, -1, true);
                if (~var7 <= -2) {
                    if (var7 <= 3) {
                        for (int var8 = 0; var7 + -1 > var8; ++var8) {
                            arg2.method2086(class168.field2446[var8], class111.field1557[var8], arg3, arg1 + -1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V", line = 57)
    public static final void method425(byte arg0) {
        class157 var1 = class295.field4360;
        synchronized (class295.field4360) {
            class295.field4360.method1022((byte) -34);
        }
        int var2 = -61 % ((arg0 - 29) / 43);
        ++field879;
        class157 var3 = class166.field2417;
        synchronized (class166.field2417) {
            class166.field2417.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "(I)V", line = 72)
    public static void method426(int arg0) {
        field885 = null;
        field888 = null;
        field883 = null;
        if (arg0 < 59) {
            method427(true, -103, -10);
        }
        field886 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)V", line = 85)
    public static final void method427(boolean arg0, int arg1, int arg2) {
        ++field881;
        ++class323.field4984;
        class179.method1287(arg0, class198.field2798);
        class75.field1006.method600(arg1, -12891);
        class75.field1006.method615(28010, arg2);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V", line = 106)
    public final void method428(int arg0, int arg1, int arg2, int arg3) {
        super.field6882 = arg0;
        ++field882;
        super.field6890 = arg2;
        if (arg3 != -20104) {
            this.method428(-15, 92, 2, 120);
        }
        super.field6889 = arg1;
    }
}
