import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class136 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "[I")
    public static int[] field1865 = new int[64];

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public static int[] field1863 = new int[2];

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1867 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIB)V")
    public static final void method854(int arg0, int arg1, int arg2, byte arg3) {
        field1859++;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class208.method1297(var4, -2);
        if (arg3 <= 90) {
            method857(44);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method855(int arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method856(byte arg0, int arg1, int arg2) {
        field1862++;
        int var3 = arg1 - arg2;
        if (arg0 >= -18) {
            return null;
        } else if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method857(int arg0) {
        field1865 = null;
        field1863 = null;
        field1867 = null;
        if (arg0 != -29261) {
            method856((byte) -96, 101, -101);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[B)V")
    public abstract void method858(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        class70.field1005.method943(arg0, true);
        class37.field562.method943(arg0, true);
        class32.field477.method943(arg0, true);
        field1860++;
        if (arg1 != 3) {
            method857(92);
        }
    }
}
