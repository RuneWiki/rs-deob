import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class177 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Z")
    public boolean field2331;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "S")
    public short field2329;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "S")
    public short field2340;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "S")
    public short field2333;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "B")
    public byte field2335;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field2337 = 0;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lag;")
    public static class710 field2332 = new class710();

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lmw;")
    public static class517 field2339 = new class517(22, 7);

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    public static boolean field2341;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1211(byte arg0) {
        field2338++;
        int var1 = 119 / ((arg0 - 12) / 62);
        if (class733.field9917 == 5) {
            class733.field9917 = 6;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 21)
    public static void method1212(int arg0) {
        field2339 = null;
        field2332 = null;
        if (arg0 <= 86) {
            method1212(93);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 56)
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2331 = arg10;
        this.field2330 = arg3;
        this.field2328 = arg11;
        this.field2329 = (short) arg6;
        this.field2336 = arg2;
        this.field2334 = arg1;
        this.field2327 = arg0;
        this.field2340 = (short) arg4;
        this.field2333 = (short) arg5;
        this.field2335 = (byte) arg8;
    }
}
