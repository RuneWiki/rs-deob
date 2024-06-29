import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class226 extends class626 {

    @OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
    public int field3222 = 0;

    @OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
    public int field3234 = -1;

    @OriginalMember(owner = "client!aia", name = "r", descriptor = "[Lou;")
    public static class602[] field3232 = new class602[128];

    @OriginalMember(owner = "client!aia", name = "i", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
    public int field3224;

    @OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!aia", name = "p", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!aia", name = "q", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!aia", name = "w", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!aia", name = "m", descriptor = "Lha;")
    public static class58 field3227;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        field3229++;
        if (arg0 == -16032) {
            class343.method2174((byte) -79, -1, 255);
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)V")
    public static void method1559(byte arg0) {
        field3227 = null;
        if (arg0 <= -13) {
            field3232 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(IILeq;I)Lfp;")
    public static final class323 method1560(int arg0, int arg1, class209 arg2, int arg3) {
        if (arg1 != 255) {
            field3227 = null;
        }
        field3226++;
        byte[] var4 = arg2.method1453(arg0, 111, arg3);
        return var4 == null ? null : new class323(var4);
    }
}
