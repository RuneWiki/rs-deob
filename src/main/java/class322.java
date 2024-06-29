import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class322 {

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
    public static int[] field5496 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lok;")
    public static class146 field5502 = class235.method1724(-12908, "Titelbild geladen)3");

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[I")
    public static int[] field5503 = new int[50];

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Z")
    public static boolean field5501 = true;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2234(int arg0) {
        field5500++;
        for (int var1 = 0; var1 < 5; var1++) {
            class150.field2549[var1] = false;
        }
        class238.field3974 = arg0;
        class180.field3030 = 0;
        class217.field3579 = -1;
        class302.field5172 = 1;
        class122.field2004 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lbf;IIIZ)V", line = 35)
    public void method945(class322 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5495++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lbf;", line = 43)
    public class322 method950(int arg0, int arg1, int arg2) {
        field5493++;
        return this;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 58)
    public static void method2235(int arg0) {
        field5496 = null;
        field5503 = null;
        if (arg0 == 0) {
            field5502 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z", line = 79)
    public static final boolean method2236(int arg0) {
        field5498++;
        if (arg0 == -7750) {
            return class271.field4640 ? true : class70.field1147;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lwe;I)Lok;", line = 95)
    public static final class146 method2237(class47 arg0, int arg1) {
        if (arg1 != 32767) {
            method2238(-20, -29, (class15) null, -5);
        }
        field5504++;
        return class238.method1740(arg0, false, 32767);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()Z", line = 106)
    public boolean method947() {
        field5494++;
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILoh;I)[Lan;", line = 138)
    public static final class315[] method2238(int arg0, int arg1, class15 arg2, int arg3) {
        field5499++;
        if (class230.method1688(arg0, arg3, 1221, arg2)) {
            int var4 = -6 % ((-arg1 - 14) / 58);
            return class134.method991(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILmk;)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public abstract void method316(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
    public abstract int method325();
}
