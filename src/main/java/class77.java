import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class77 extends class338 {

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public volatile int field867 = -1;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "Ljava/lang/String;")
    public volatile String field873;

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Z")
    public static boolean field871 = false;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Ljava/lang/String;")
    public static String field874 = null;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "Lph;")
    public static class114 field869 = new class114(500);

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field876 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field877 = -14475237;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "Ldj;")
    public static class304 field875;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)V")
    public static void method431(int arg0) {
        field874 = null;
        if (arg0 == 500) {
            field875 = null;
            field876 = null;
            field869 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[[[Le;)V")
    public static final void method432(int arg0, class96[][][] arg1) {
        int var2 = 102 / ((26 - arg0) / 36);
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class96[][] var4 = arg1[var3];
            for (int var5 = 0; var5 < var4.length; var5++) {
                for (int var6 = 0; var6 < var4[var5].length; var6++) {
                    class96 var7 = var4[var5][var6];
                    if (var7 != null) {
                        if (var7.field1135 instanceof class285) {
                            ((class285) var7.field1135).method350((byte) 124);
                        }
                        if (var7.field1126 instanceof class285) {
                            ((class285) var7.field1126).method350((byte) 121);
                        }
                        if (var7.field1140 instanceof class285) {
                            ((class285) var7.field1140).method350((byte) 118);
                        }
                        if (var7.field1128 instanceof class285) {
                            ((class285) var7.field1128).method350((byte) 125);
                        }
                        if (var7.field1136 instanceof class285) {
                            ((class285) var7.field1136).method350((byte) 117);
                        }
                        for (class122 var8 = var7.field1130; var8 != null; var8 = var8.field1511) {
                            class17 var9 = var8.field1505;
                            if (var9 instanceof class285) {
                                ((class285) var9).method350((byte) 127);
                            }
                        }
                    }
                }
            }
        }
        field872++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIII)V")
    public static final void method433(boolean arg0, int arg1, int arg2, int arg3) {
        field868++;
        if (arg1 != 3033) {
            method433(false, 7, 31, -87);
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class67.field689 = arg0;
        class305.field4140 = arg2;
        class432.field6338 = arg3;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class77(String arg0) {
        this.field873 = arg0;
    }
}
