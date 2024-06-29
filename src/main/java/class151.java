import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class151 {

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field2313 = -1;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2311 = -1;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Z")
    public static boolean field2316 = false;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field2317 = 0;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2315 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2319 = 5063219;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lii;")
    public class228 field2314;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lug;")
    public static class321 field2318;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Z")
    public static boolean field2321;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
    public int[] field2309;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2312;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 8)
    public static void method1058(byte arg0) {
        field2318 = null;
        field2315 = null;
        if (arg0 > -63) {
            field2311 = 51;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILgn;IZII)Ljava/awt/Frame;", line = 38)
    public static final Frame method1059(int arg0, class6 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2310++;
        if (!arg1.method35(93)) {
            return null;
        }
        if (arg4 == 0) {
            class103[] var6 = class89.method645(arg1, (byte) -122);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1583 == arg2 && var6[var8].field1571 == arg5 && (arg0 == 0 || var6[var8].field1573 == arg0) && (!var7 || var6[var8].field1582 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field1582;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (!arg3) {
            field2321 = false;
        }
        class217 var9 = arg1.method47((byte) 7, arg5, arg0, arg4, arg2);
        while (var9.field3488 == 0) {
            class20.method128(0, 10L);
        }
        Frame var10 = (Frame) var9.field3490;
        if (var10 == null) {
            return null;
        } else if (var9.field3488 == 2) {
            class66.method432(var10, arg1, (byte) 108);
            return null;
        } else {
            return var10;
        }
    }
}
