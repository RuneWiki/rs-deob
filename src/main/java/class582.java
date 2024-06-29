import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class582 {

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "J")
    public long field8247;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Loaa;")
    private class556 field8244;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Z")
    public static boolean field8241 = false;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8246 = new BigInteger("966dbab55b4619ec3d0fb92b458b41a108b95aced76555ff797f78ad67b4315887d4a5eb32f277f45d7c1b6bc3421fc6174bc02cf2d1fd5a301fae111299c1fcfd5cb6cfde7948ede96d1f07782fd13335826570e2a5b2d2d7eabb93fcf87943dfa49cb808504405f0446f77573746ebbccc4bf37fdab0039da7af63de7a3a1af2dd7e97ffa51b4deccc11f882aa47b5434c0b7c30cafa1244de9bc2b7c8cf39afb8cbd4127f0ade986e11cfd0b7e0eb9dc125776c2f0a47d717b41e3ccb8622b34f50e32bfa786c6f7ecfe64eaa9d6c16bef7aa632cda38ff7fba12ce3d52e52470eea1af9d156403701d05bb1b562458edd8f83045e924848abe2f31dd13ddea65b0931414cd4e33fa4f15254a0e98ec63dd3de448fd597591ef58a3b82462011478e3ba4756ac09af8f8dd53a4c85e764b4f7322ecf6d4cbfad12a78741bddf17caf445b60e8a05458eb4dbf4f66a9a55b846c3a2424ca9e600d72cc44de37d8972b58b90e845508083d3d87284a2cd01f0228f8083c7893dc95e0b27c819209fb45061c2538eac266d0c5e62777bac2301e02167fad2c9b3992c966fc8bfdfc538b142632f83b5df846fe8ca5291c7732876c39959c85ade83f8414bd02fd20ad417de9fecaa9aa8019eefdb19af062ec162536da9855c7ea742b3ce54b50e2bb1618dd62f2f59e3736ccee2dcd72dc6f88b69d55a866954616297a20bf5", 16);

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Lhw;")
    public static class300 field8243;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field8249;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZZII)I", line = 3)
    public static final int method3424(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field8248++;
        class717 var5 = class159.method1020(arg1, false, arg0);
        if (var5 == null) {
            return 0;
        } else if (arg3 == -8651) {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field9937.length; var7++) {
                if (var5.field9937[var7] >= 0 && class35.field367.field7024 > var5.field9937[var7]) {
                    class581 var8 = class35.field367.method3051((byte) -20, var5.field9937[var7]);
                    int var9 = var8.method3412(class734.field10126.method709((byte) 98, arg4).field10602, arg4, arg3 + 9651);
                    if (arg2) {
                        var6 += var5.field9935[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        field8245++;
        this.field8244.method3271(2, this.field8247);
        super.finalize();
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lae;IZI)Lhw;", line = 66)
    public static final class300 method3425(class283 arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            method3425(null, -45, false, 58);
        }
        field8242++;
        byte[] var4 = arg0.method1849(arg1, (byte) -104, arg3);
        return var4 == null ? null : new class300(var4);
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Loaa;J[Lsu;)V", line = 83)
    public class582(class556 arg0, long arg1, class544[] arg2) {
        this.field8247 = arg1;
        this.field8244 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 94)
    public static void method3426(int arg0) {
        field8246 = null;
        field8243 = null;
        if (arg0 != 16) {
            field8243 = null;
        }
        field8249 = null;
    }
}
