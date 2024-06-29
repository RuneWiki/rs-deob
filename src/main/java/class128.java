import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class128 extends class178 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Lkd;")
    public class112 field2300;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "[[S")
    public static short[][] field2303 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "Loc;")
    private static class151 field2304 = class137.method873(2, " has logged out)3");

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Loc;")
    public static class151 field2298 = class137.method873(2, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!m", name = "R", descriptor = "[I")
    public static int[] field2305 = new int[50];

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Loc;")
    public static class151 field2308 = field2304;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "[I")
    public static int[] field2302;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static void method774(int arg0) {
        field2304 = null;
        field2305 = null;
        field2298 = null;
        field2302 = null;
        if (arg0 < -67) {
            field2308 = null;
            field2303 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZB)V")
    public static final void method775(boolean arg0, byte arg1) {
        field2307++;
        int var2 = 125 / ((84 - arg1) / 39);
        class16.method131(-11903);
        class203.field3612++;
        if (class203.field3612 < 50 && !arg0) {
            return;
        }
        class203.field3612 = 0;
        if (class217.field3786 || class142.field2588 == null) {
            return;
        }
        class48.field984.method650(-13721, 213);
        class229.field4086++;
        try {
            class142.field2588.method331(42, class48.field984.field4101, class48.field984.field4087, 0);
            class48.field984.field4101 = 0;
        } catch (IOException var3) {
            class217.field3786 = true;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lkd;)V")
    public class128(class112 arg0) {
        this.field2300 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(JB)V")
    public static final void method776(long arg0, byte arg1) {
        field2299++;
        if (arg0 == 0L) {
            return;
        }
        class48.field984.method650(-13721, 205);
        class48.field984.method1458((byte) 125, arg0);
        class152.field2753++;
        if (arg1 != 53) {
            method777(-73, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
    public static final boolean method777(int arg0, byte arg1) {
        field2301++;
        if (arg1 != 47) {
            field2308 = null;
        }
        return (arg0 & -arg0) == arg0;
    }
}
